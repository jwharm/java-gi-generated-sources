package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function type for determining whether the row pointed to by {@code iter} should
 * be rendered as a separator. A common way to implement this is to have a
 * boolean column in the model, whose values the {@code GtkTreeViewRowSeparatorFunc}
 * returns.
 */
@FunctionalInterface
public interface TreeViewRowSeparatorFunc {
        boolean onTreeViewRowSeparatorFunc(@NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreeIter iter);
}
