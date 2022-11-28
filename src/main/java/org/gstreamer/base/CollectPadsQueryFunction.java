package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called while processing a query. It takes
 * ownership of the query and is responsible for chaining up (to
 * events downstream (with gst_pad_event_default()).
 */
@FunctionalInterface
public interface CollectPadsQueryFunction {
        boolean onCollectPadsQueryFunction(@NotNull org.gstreamer.base.CollectPads pads, @NotNull org.gstreamer.base.CollectData pad, @NotNull org.gstreamer.gst.Query query);
}
