package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Copies the parameters from {@code src} into {@code dest}.  The subclass must compose copy
 * functions from the superclass.
 */
@FunctionalInterface
public interface GLAllocationParamsCopyFunc {
        void onGLAllocationParamsCopyFunc(@NotNull org.gstreamer.gl.GLAllocationParams src, @NotNull org.gstreamer.gl.GLAllocationParams dest);
}
