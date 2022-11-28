package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called while processing an event. It takes
 * ownership of the event and is responsible for chaining up (to
 * gst_collect_pads_event_default()) or dropping events (such typical cases
 * being handled by the default handler).
 */
@FunctionalInterface
public interface CollectPadsEventFunction {
        boolean onCollectPadsEventFunction(@NotNull org.gstreamer.base.CollectPads pads, @NotNull org.gstreamer.base.CollectData pad, @NotNull org.gstreamer.gst.Event event);
}
