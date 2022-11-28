package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Copy {@code size} bytes from {@code mem} starting at {@code offset} and return them wrapped in a
 * new GstMemory object.
 * If {@code size} is set to -1, all bytes starting at {@code offset} are copied.
 */
@FunctionalInterface
public interface MemoryCopyFunction {
        org.gstreamer.gst.Memory onMemoryCopyFunction(@NotNull org.gstreamer.gst.Memory mem, long offset, long size);
}
