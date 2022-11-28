package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called by typefinding.
 */
@FunctionalInterface
public interface TypeFindFunction {
        void onTypeFindFunction(@NotNull org.gstreamer.gst.TypeFind find);
}
