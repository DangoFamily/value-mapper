package com.spawpaw.value.filter.util;

import com.spawpaw.value.filter.provider.ValueFilterInstanceProvider;

import java.lang.annotation.Annotation;
import java.util.List;

public class ValueFilterUtil {
    private ValueFilterInstanceProvider instanceProvider;

    public ValueFilterUtil(ValueFilterInstanceProvider instanceProvider) {
        this.instanceProvider = instanceProvider;
    }

    public void process(Object instance, Class<?>... groups) {

    }

    public void process(Object instance, List<? extends Annotation> annotations, Class<?>... groups) {

    }

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
