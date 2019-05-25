package com.spawpaw.value.filter.provider;

import com.spawpaw.value.filter.core.ValueFilter;

import java.util.HashMap;
import java.util.Map;

public class CachedValueFilterInstanceProvider implements ValueFilterInstanceProvider {
    private final Map<Class<? extends ValueFilter>, ValueFilter> valueFilterMap;

    public CachedValueFilterInstanceProvider() {
        valueFilterMap = new HashMap<>();
    }

    @Override
    public ValueFilter getInstanceByClazz(Class<? extends ValueFilter> clazz) {
        if (valueFilterMap.containsKey(clazz))
            return valueFilterMap.get(clazz);
        else {
            try {
                synchronized (valueFilterMap) {
                    if (!valueFilterMap.containsKey(clazz)){
                        ValueFilter valueFilter = clazz.newInstance();
                        valueFilterMap.put(clazz, valueFilter);
                    }
                }
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return valueFilterMap.get(clazz);
    }
}
