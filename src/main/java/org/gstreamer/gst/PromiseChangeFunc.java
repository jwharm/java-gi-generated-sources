package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

@FunctionalInterface
public interface PromiseChangeFunc {
        void onPromiseChangeFunc(@NotNull org.gstreamer.gst.Promise promise);
}
