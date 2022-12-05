package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Free any dynamically allocated data.  The subclass must call the superclass'
 * free.
 */
@FunctionalInterface
public interface GLAllocationParamsFreeFunc {
        void onGLAllocationParamsFreeFunc(@Nullable java.lang.foreign.MemoryAddress params);
}
