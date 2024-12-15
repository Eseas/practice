package org.example.di.di;

import org.example.di.annotation.Inject;
import org.reflections.util.ReflectionUtilsPredicates;

import java.lang.reflect.Constructor;
import java.util.Set;

import static org.reflections.ReflectionUtils.getAllConstructors;

public class BeanFactoryUtils {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static Constructor<?> getInjectedConstructor(Class<?> clazz) {
        Set<Constructor> injectedConstructors = getAllConstructors(clazz, ReflectionUtilsPredicates.withAnnotation(org.example.di.annotation.Inject.class));
        if (injectedConstructors.isEmpty()) {
            return null;
        }
        return injectedConstructors.iterator().next();
    }
}