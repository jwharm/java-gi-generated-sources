package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * As this virtual method is called with an OpenGL context current, use this
 * function to allocate and OpenGL resources needed for your application
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorCreateFunction {
        boolean onGLBaseMemoryAllocatorCreateFunction(@NotNull org.gstreamer.gl.GLBaseMemory mem);
}
