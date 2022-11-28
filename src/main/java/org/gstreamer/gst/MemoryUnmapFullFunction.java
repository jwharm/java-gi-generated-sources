package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Release the pointer previously retrieved with gst_memory_map() with {@code info}.
 */
@FunctionalInterface
public interface MemoryUnmapFullFunction {
        void onMemoryUnmapFullFunction(@NotNull org.gstreamer.gst.Memory mem, @NotNull org.gstreamer.gst.MapInfo info);
}
