package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Task function, see gst_task_pool_push().
 */
@FunctionalInterface
public interface TaskPoolFunction {
        void onTaskPoolFunction(@Nullable java.lang.foreign.MemoryAddress userData);
}
