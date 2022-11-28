package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback used by gst_pad_add_probe(). Gets called to notify about the current
 * blocking type.
 * <p>
 * The callback is allowed to modify the data pointer in {@code info}.
 */
@FunctionalInterface
public interface PadProbeCallback {
        org.gstreamer.gst.PadProbeReturn onPadProbeCallback(@NotNull org.gstreamer.gst.Pad pad, @NotNull org.gstreamer.gst.PadProbeInfo info);
}
