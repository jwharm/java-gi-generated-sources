package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback used by gst_pad_sticky_events_foreach().
 * <p>
 * When this function returns {@code true}, the next event will be
 * returned. When {@code false} is returned, gst_pad_sticky_events_foreach() will return.
 * <p>
 * When {@code event} is set to {@code null}, the item will be removed from the list of sticky events.
 * {@code event} can be replaced by assigning a new reference to it.
 * This function is responsible for unreffing the old event when
 * removing or modifying.
 */
@FunctionalInterface
public interface PadStickyEventsForeachFunction {
        boolean onPadStickyEventsForeachFunction(@NotNull org.gstreamer.gst.Pad pad, @Nullable PointerProxy<org.gstreamer.gst.Event> event);
}
