package com.spawpaw.value.filter.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MappedBy {
    /**
     * 使用哪个值映射器
     */
    Class<? extends ValueFilter> mappedBy();
}
