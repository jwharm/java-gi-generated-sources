package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function called for each {@code meta} in {@code buffer} as a result of performing a
 * transformation on {@code transbuf}. Additional {@code type} specific transform data
 * is passed to the function as {@code data}.
 * <p>
 * Implementations should check the {@code type} of the transform and parse
 * additional type specific fields in {@code data} that should be used to update
 * the metadata on {@code transbuf}.
 */
@FunctionalInterface
public interface MetaTransformFunction {
        boolean onMetaTransformFunction(@NotNull org.gstreamer.gst.Buffer transbuf, @NotNull org.gstreamer.gst.Meta meta, @NotNull org.gstreamer.gst.Buffer buffer, @NotNull org.gtk.glib.Quark type);
}
