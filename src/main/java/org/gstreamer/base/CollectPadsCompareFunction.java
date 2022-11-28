package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function for comparing two timestamps of buffers or newsegments collected on one pad.
 */
@FunctionalInterface
public interface CollectPadsCompareFunction {
        int onCollectPadsCompareFunction(@NotNull org.gstreamer.base.CollectPads pads, @NotNull org.gstreamer.base.CollectData data1, @NotNull org.gstreamer.gst.ClockTime timestamp1, @NotNull org.gstreamer.base.CollectData data2, @NotNull org.gstreamer.gst.ClockTime timestamp2);
}
