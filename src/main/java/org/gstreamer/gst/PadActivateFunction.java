package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function is called when the pad is activated during the element
 * READY to PAUSED state change. By default this function will call the
 * activate function that puts the pad in push mode but elements can
 * override this function to activate the pad in pull mode if they wish.
 */
@FunctionalInterface
public interface PadActivateFunction {
        boolean onPadActivateFunction(@NotNull org.gstreamer.gst.Pad pad, @NotNull org.gstreamer.gst.Object parent);
}
