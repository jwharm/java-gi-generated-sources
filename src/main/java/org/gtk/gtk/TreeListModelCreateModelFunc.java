package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype of the function called to create new child models when
 * gtk_tree_list_row_set_expanded() is called.
 * <p>
 * This function can return {@code null} to indicate that {@code item} is guaranteed to be
 * a leaf node and will never have children. If it does not have children but
 * may get children later, it should return an empty model that is filled once
 * children arrive.
 */
@FunctionalInterface
public interface TreeListModelCreateModelFunc {
        org.gtk.gio.ListModel onTreeListModelCreateModelFunc(@NotNull org.gtk.gobject.Object item);
}
