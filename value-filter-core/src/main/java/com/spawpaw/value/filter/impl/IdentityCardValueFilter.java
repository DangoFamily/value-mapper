package com.spawpaw.value.filter.impl;

import com.spawpaw.value.filter.core.ValueFilter;

import java.lang.annotation.Annotation;
import java.util.List;

public class IdentityCardValueFilter implements ValueFilter<String> {
    public boolean canMap(Class<String> stringClass) {
        return false;
    }

    public String map(String value, List<? extends Annotation> annotations) {
        return null;
    }
}
