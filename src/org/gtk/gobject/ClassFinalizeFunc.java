package org.gtk.gobject;

@FunctionalInterface
public interface ClassFinalizeFunc {

    /**
     * A callback function used by the type system to finalize a class.
     * 
     * This function is rarely needed, as dynamically allocated class resources
     * should be handled by GBaseInitFunc() and GBaseFinalizeFunc().
     * 
     * Also, specification of a GClassFinalizeFunc() in the #GTypeInfo
     * structure of a static type is invalid, because classes of static types
     * will never be finalized (they are artificially kept alive when their
     * reference count drops to zero).
     */
    public void onClassFinalizeFunc(TypeClass gClass, jdk.incubator.foreign.MemoryAddress classData);
}
