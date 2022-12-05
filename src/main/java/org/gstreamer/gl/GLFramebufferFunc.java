package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * callback definition for operating through a {@link GLFramebuffer} object
 */
@FunctionalInterface
public interface GLFramebufferFunc {
        boolean onGLFramebufferFunc(@Nullable java.lang.foreign.MemoryAddress stuff);
}
