package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a function to run in the GL thread with {@code context} and {@code data}
 */
@FunctionalInterface
public interface GLContextThreadFunc {
        void onGLContextThreadFunc(@NotNull org.gstreamer.gl.GLContext context);
}
