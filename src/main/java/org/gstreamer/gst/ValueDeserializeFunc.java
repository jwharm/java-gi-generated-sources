package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by gst_value_deserialize() to parse a non-binary form into the {@link org.gtk.gobject.Value}.
 */
@FunctionalInterface
public interface ValueDeserializeFunc {
        boolean onValueDeserializeFunc(@NotNull org.gtk.gobject.Value dest, @NotNull java.lang.String s);
}
