package com.spawpaw.value.filter.impl;

import com.spawpaw.value.filter.core.ValueFilter;

public abstract class SingletonValueFilter<T> implements ValueFilter<T> {
    protected volatile ValueFilter valueFilter;

}
