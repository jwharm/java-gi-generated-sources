package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_structure_filter_and_map_in_place().
 * The function may modify {@code value}, and the value will be removed from
 * the structure if {@code false} is returned.
 */
@FunctionalInterface
public interface StructureFilterMapFunc {
        boolean onStructureFilterMapFunc(@NotNull org.gtk.glib.Quark fieldId, @NotNull org.gtk.gobject.Value value);
}
