package org.gtk.gobject;

@FunctionalInterface
public interface TypeClassCacheFunc {

    /**
     * A callback function which is called when the reference count of a class
     * drops to zero.
     * 
     * It may use g_type_class_ref() to prevent the class from being freed. You
     * should not call g_type_class_unref() from a #GTypeClassCacheFunc function
     * to prevent infinite recursion, use g_type_class_unref_uncached() instead.
     * 
     * The functions have to check the class id passed in to figure
     * whether they actually want to cache the class of this type, since all
     * classes are routed through the same #GTypeClassCacheFunc chain.
     */
    public boolean onTypeClassCacheFunc(jdk.incubator.foreign.MemoryAddress cacheData, TypeClass gClass);
}
