package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by gst_value_deserialize_with_pspec() to parse a non-binary form into the {@link org.gtk.gobject.Value}.
 * @version 1.20
 */
@FunctionalInterface
public interface ValueDeserializeWithPSpecFunc {
        boolean onValueDeserializeWithPSpecFunc(@NotNull org.gtk.gobject.Value dest, @NotNull java.lang.String s, @NotNull org.gtk.gobject.ParamSpec pspec);
}
