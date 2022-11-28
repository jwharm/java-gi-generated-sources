package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Check if {@code mem1} and {@code mem2} occupy contiguous memory and return the offset of
 * {@code mem1} in the parent buffer in {@code offset}.
 */
@FunctionalInterface
public interface MemoryIsSpanFunction {
        boolean onMemoryIsSpanFunction(@NotNull org.gstreamer.gst.Memory mem1, @NotNull org.gstreamer.gst.Memory mem2, PointerLong offset);
}
