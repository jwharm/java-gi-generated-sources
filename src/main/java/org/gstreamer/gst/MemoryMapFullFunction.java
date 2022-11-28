package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Get the memory of {@code mem} that can be accessed according to the mode specified
 * in {@code info}'s flags. The function should return a pointer that contains at least
 * {@code maxsize} bytes.
 */
@FunctionalInterface
public interface MemoryMapFullFunction {
        java.lang.foreign.MemoryAddress onMemoryMapFullFunction(@NotNull org.gstreamer.gst.Memory mem, @NotNull org.gstreamer.gst.MapInfo info, long maxsize);
}
