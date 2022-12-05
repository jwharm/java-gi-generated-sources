package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Note: not called with a GL context current
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorAllocFunction {
        org.gstreamer.gl.GLBaseMemory onGLBaseMemoryAllocatorAllocFunction(@NotNull org.gstreamer.gl.GLBaseMemoryAllocator allocator, @NotNull org.gstreamer.gl.GLAllocationParams params);
}
