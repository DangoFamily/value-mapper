package com.spawpaw.value.filter.provider;

import com.spawpaw.value.filter.core.ValueFilter;

/**
 * 提供value filter的实例
 */
public interface ValueFilterInstanceProvider {
    ValueFilter getInstanceByClazz(Class<? extends ValueFilter> clazz);
}
