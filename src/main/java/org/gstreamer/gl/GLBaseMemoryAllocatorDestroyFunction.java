package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Destroy any resources allocated throughout the lifetime of {@code mem}
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorDestroyFunction {
        void onGLBaseMemoryAllocatorDestroyFunction(@NotNull org.gstreamer.gl.GLBaseMemory mem);
}
