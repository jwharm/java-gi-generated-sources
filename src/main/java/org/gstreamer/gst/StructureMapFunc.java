package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_structure_map_in_place(). The function
 * may modify {@code value}.
 */
@FunctionalInterface
public interface StructureMapFunc {
        boolean onStructureMapFunc(@NotNull org.gtk.glib.Quark fieldId, @NotNull org.gtk.gobject.Value value);
}
