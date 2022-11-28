package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called when {@code meta} is initialized in {@code buffer}.
 */
@FunctionalInterface
public interface MetaInitFunction {
        boolean onMetaInitFunction(@NotNull org.gstreamer.gst.Meta meta, @Nullable java.lang.foreign.MemoryAddress params, @NotNull org.gstreamer.gst.Buffer buffer);
}
