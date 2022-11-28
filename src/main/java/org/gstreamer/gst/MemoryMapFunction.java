package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Get the memory of {@code mem} that can be accessed according to the mode specified
 * in {@code flags}. The function should return a pointer that contains at least
 * {@code maxsize} bytes.
 */
@FunctionalInterface
public interface MemoryMapFunction {
        java.lang.foreign.MemoryAddress onMemoryMapFunction(@NotNull org.gstreamer.gst.Memory mem, long maxsize, @NotNull org.gstreamer.gst.MapFlags flags);
}
