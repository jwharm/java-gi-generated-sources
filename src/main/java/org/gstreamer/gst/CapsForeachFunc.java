package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_caps_foreach(). The function may
 * not modify {@code features} or {@code structure}.
 * @version 1.6
 */
@FunctionalInterface
public interface CapsForeachFunc {
        boolean onCapsForeachFunc(@NotNull org.gstreamer.gst.CapsFeatures features, @NotNull org.gstreamer.gst.Structure structure);
}
