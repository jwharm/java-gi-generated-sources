package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Also see gst_memory_map();
 * @version 1.8
 */
@FunctionalInterface
public interface GLBaseMemoryAllocatorMapFunction {
        java.lang.foreign.MemoryAddress onGLBaseMemoryAllocatorMapFunction(@NotNull org.gstreamer.gl.GLBaseMemory mem, @NotNull org.gstreamer.gst.MapInfo info, long maxsize);
}
