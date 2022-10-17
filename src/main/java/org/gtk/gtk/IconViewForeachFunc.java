package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_icon_view_selected_foreach() to map all
 * selected rows.
 * <p>
 * It will be called on every selected row in the view.
 */
@FunctionalInterface
public interface IconViewForeachFunc {
        void onIconViewForeachFunc(@NotNull IconView iconView, @NotNull TreePath path);
}
