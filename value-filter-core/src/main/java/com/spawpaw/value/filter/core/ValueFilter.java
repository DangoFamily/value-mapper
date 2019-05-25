package com.spawpaw.value.filter.core;

import java.lang.annotation.Annotation;
import java.util.List;

/**
 * 值映射器。
 *
 * @param <T>
 */
public interface ValueFilter<T> {
    /**
     * 必须的注解
     *
     * @return 注解数组
     */
    default Class<?>[] requiredAnnotations() {
        return new Class[]{};
    }

    /**
     * 额外支持的注解，字段上没有这些注解也没事
     *
     * @return 注解数组
     */
    default Class<?>[] externaldAnnotations() {
        return new Class[]{};
    }

    /**
     * 关注：
     * - 过滤的值是哪种类型
     * - 过滤的值上有哪些注解, 值所在的类上有哪些注解
     * - 要进行过滤的值
     */
    T map(T value, List<? extends Annotation> annotations);

}
