package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * This function is provided by the user and should free the boxed
 * structure passed.
 */
@FunctionalInterface
public interface BoxedFreeFunc {
        void onBoxedFreeFunc(java.lang.foreign.MemoryAddress boxed);
}
