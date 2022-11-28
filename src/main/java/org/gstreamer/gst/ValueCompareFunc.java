package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used together with gst_value_compare() to compare {@link org.gtk.gobject.Value} items.
 */
@FunctionalInterface
public interface ValueCompareFunc {
        int onValueCompareFunc(@NotNull org.gtk.gobject.Value value1, @NotNull org.gtk.gobject.Value value2);
}
