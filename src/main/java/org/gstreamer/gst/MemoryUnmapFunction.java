package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Release the pointer previously retrieved with gst_memory_map().
 */
@FunctionalInterface
public interface MemoryUnmapFunction {
        void onMemoryUnmapFunction(@NotNull org.gstreamer.gst.Memory mem);
}
