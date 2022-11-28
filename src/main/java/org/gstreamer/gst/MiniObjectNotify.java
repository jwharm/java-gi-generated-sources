package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link MiniObjectNotify} function can be added to a mini object as a
 * callback that gets triggered when gst_mini_object_unref() drops the
 * last ref and {@code obj} is about to be freed.
 */
@FunctionalInterface
public interface MiniObjectNotify {
        void onMiniObjectNotify(@NotNull org.gstreamer.gst.MiniObject obj);
}
