package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A forward function is called for all internally linked pads, see
 * gst_pad_forward().
 */
@FunctionalInterface
public interface PadForwardFunction {
        boolean onPadForwardFunction(@NotNull org.gstreamer.gst.Pad pad);
}
