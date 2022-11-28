package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function will be called when creating a copy of {@code it} and should
 * create a copy of all custom iterator fields or increase their
 * reference counts.
 */
@FunctionalInterface
public interface IteratorCopyFunction {
        void onIteratorCopyFunction(@NotNull org.gstreamer.gst.Iterator it, @NotNull org.gstreamer.gst.Iterator copy);
}
