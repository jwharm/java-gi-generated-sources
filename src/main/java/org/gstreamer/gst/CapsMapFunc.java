package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_caps_map_in_place(). The function
 * may modify {@code features} and {@code structure}.
 */
@FunctionalInterface
public interface CapsMapFunc {
        boolean onCapsMapFunc(@NotNull org.gstreamer.gst.CapsFeatures features, @NotNull org.gstreamer.gst.Structure structure);
}
