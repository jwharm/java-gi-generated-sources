package org.gtk.gobject;

/**
 * This function is provided by the user and should free the boxed
 * structure passed.
 */
@FunctionalInterface
public interface BoxedFreeFunc {
        void onBoxedFreeFunc(jdk.incubator.foreign.MemoryAddress boxed);
}
