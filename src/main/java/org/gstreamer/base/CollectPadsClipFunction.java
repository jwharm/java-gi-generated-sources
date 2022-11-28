package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called when {@code inbuffer} is received on the pad managed
 * by {@code data} in the collectpad object {@code pads}.
 * <p>
 * The function should use the segment of {@code data} and the negotiated media type on
 * the pad to perform clipping of {@code inbuffer}.
 * <p>
 * This function takes ownership of {@code inbuffer} and should output a buffer in
 * {@code outbuffer} or return {@code null} in {@code outbuffer} if the buffer should be dropped.
 */
@FunctionalInterface
public interface CollectPadsClipFunction {
        org.gstreamer.gst.FlowReturn onCollectPadsClipFunction(@NotNull org.gstreamer.base.CollectPads pads, @NotNull org.gstreamer.base.CollectData data, @NotNull org.gstreamer.gst.Buffer inbuffer, @NotNull Out<PointerProxy<org.gstreamer.gst.Buffer>> outbuffer);
}
