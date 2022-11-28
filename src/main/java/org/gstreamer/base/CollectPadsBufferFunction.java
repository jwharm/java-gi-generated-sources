package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when a (considered oldest) buffer can be muxed.
 * If all pads have reached EOS, this function is called with {@code null} {@code buffer}
 * and {@code null} {@code data}.
 */
@FunctionalInterface
public interface CollectPadsBufferFunction {
        org.gstreamer.gst.FlowReturn onCollectPadsBufferFunction(@NotNull org.gstreamer.base.CollectPads pads, @NotNull org.gstreamer.base.CollectData data, @NotNull org.gstreamer.gst.Buffer buffer);
}
