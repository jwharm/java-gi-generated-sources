package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by gst_value_serialize() to obtain a non-binary form of the {@link org.gtk.gobject.Value}.
 * <p>
 * Free-function: g_free
 */
@FunctionalInterface
public interface ValueSerializeFunc {
        java.lang.String onValueSerializeFunc(@NotNull org.gtk.gobject.Value value1);
}
