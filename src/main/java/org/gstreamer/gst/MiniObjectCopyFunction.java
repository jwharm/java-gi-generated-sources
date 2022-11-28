package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function prototype for methods to create copies of instances.
 */
@FunctionalInterface
public interface MiniObjectCopyFunction {
        org.gstreamer.gst.MiniObject onMiniObjectCopyFunction(@NotNull org.gstreamer.gst.MiniObject obj);
}
