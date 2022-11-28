package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature to handle a unlinking the pad prom its peer.
 * <p>
 * The pad's lock is already held when the unlink function is called, so most
 * pad functions cannot be called from within the callback.
 */
@FunctionalInterface
public interface PadUnlinkFunction {
        void onPadUnlinkFunction(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent);
}
