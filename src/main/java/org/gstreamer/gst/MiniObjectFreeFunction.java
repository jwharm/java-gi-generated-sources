package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual function prototype for methods to free resources used by
 * mini-objects.
 */
@FunctionalInterface
public interface MiniObjectFreeFunction {
        void onMiniObjectFreeFunction(@NotNull org.gstreamer.gst.MiniObject obj);
}
