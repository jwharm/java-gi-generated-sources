package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will repeatedly be called in the thread created by
 * a {@link Task}.
 */
@FunctionalInterface
public interface TaskFunction {
        void onTaskFunction();
}
