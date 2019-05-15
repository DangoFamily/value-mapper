package com.spawpaw.value.filter.core;

import java.lang.annotation.Annotation;

public class AnnotationUtil {
    /**
     * 递归寻找类上的注解
     *
     * @param clazz
     * @param annotationClass
     * @param <T>
     * @return
     */
    public static <T extends Annotation> T findAnnotation(Class<?> clazz, Class<T> annotationClass) {
        return null;
    }
}
