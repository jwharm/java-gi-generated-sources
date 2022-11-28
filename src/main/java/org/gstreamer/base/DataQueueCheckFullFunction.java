package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the function used to inform the queue that it should be
 * considered as full.
 */
@FunctionalInterface
public interface DataQueueCheckFullFunction {
        boolean onDataQueueCheckFullFunction(@NotNull org.gstreamer.base.DataQueue queue, int visible, int bytes, long time);
}
