package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that will be called in gst_structure_foreach(). The function may
 * not modify {@code value}.
 */
@FunctionalInterface
public interface StructureForeachFunc {
        boolean onStructureForeachFunc(@NotNull org.gtk.glib.Quark fieldId, @NotNull org.gtk.gobject.Value value);
}
