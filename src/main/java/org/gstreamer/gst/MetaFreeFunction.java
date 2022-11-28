package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called when {@code meta} is freed in {@code buffer}.
 */
@FunctionalInterface
public interface MetaFreeFunction {
        void onMetaFreeFunction(@NotNull org.gstreamer.gst.Meta meta, @NotNull org.gstreamer.gst.Buffer buffer);
}
