package org.gtk.gobject;

/**
 * A callback function which is called when the reference count of a class
 * drops to zero.
 * <p>
 * It may use g_type_class_ref() to prevent the class from being freed. You
 * should not call g_type_class_unref() from a {@link TypeClassCacheFunc} function
 * to prevent infinite recursion, use g_type_class_unref_uncached() instead.
 * <p>
 * The functions have to check the class id passed in to figure
 * whether they actually want to cache the class of this type, since all
 * classes are routed through the same {@link TypeClassCacheFunc} chain.
 */
@FunctionalInterface
public interface TypeClassCacheFunc {
        boolean onTypeClassCacheFunc(TypeClass gClass);
}
