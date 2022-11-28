package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface DataQueueFullCallback {
        void onDataQueueFullCallback(@NotNull org.gstreamer.base.DataQueue queue);
}
