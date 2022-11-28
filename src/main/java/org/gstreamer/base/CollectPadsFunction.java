package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when all pads have received data.
 */
@FunctionalInterface
public interface CollectPadsFunction {
        org.gstreamer.gst.FlowReturn onCollectPadsFunction(@NotNull org.gstreamer.base.CollectPads pads);
}
