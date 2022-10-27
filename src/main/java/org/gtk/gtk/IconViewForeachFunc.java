package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_icon_view_selected_foreach() to map all
 * selected rows.
 * <p>
 * It will be called on every selected row in the view.
 */
@FunctionalInterface
public interface IconViewForeachFunc {
        void onIconViewForeachFunc(@NotNull org.gtk.gtk.IconView iconView, @NotNull org.gtk.gtk.TreePath path);
}
