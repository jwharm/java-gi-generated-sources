package org.gtk.gobject;

@FunctionalInterface
public interface BoxedFreeFunc {

    /**
     * This function is provided by the user and should free the boxed
     * structure passed.
     */
    public void onBoxedFreeFunc(jdk.incubator.foreign.MemoryAddress boxed);
}
