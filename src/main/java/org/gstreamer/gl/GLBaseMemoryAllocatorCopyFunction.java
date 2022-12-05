package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Also see gst_memory_copy();
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorCopyFunction {
        org.gstreamer.gl.GLBaseMemory onGLBaseMemoryAllocatorCopyFunction(@NotNull org.gstreamer.gl.GLBaseMemory mem, long offset, long size);
}
