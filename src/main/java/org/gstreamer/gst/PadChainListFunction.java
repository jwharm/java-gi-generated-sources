package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called on sinkpads when chaining buffer lists.
 * The function typically processes the data contained in the buffer list and
 * either consumes the data or passes it on to the internally linked pad(s).
 * <p>
 * The implementer of this function receives a refcount to {@code list} and
 * should gst_buffer_list_unref() when the list is no longer needed.
 * <p>
 * When a chainlist function detects an error in the data stream, it must
 * post an error on the bus and return an appropriate {@link FlowReturn} value.
 */
@FunctionalInterface
public interface PadChainListFunction {
        org.gstreamer.gst.FlowReturn onPadChainListFunction(@NotNull org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.Object parent, @NotNull org.gstreamer.gst.BufferList list);
}
