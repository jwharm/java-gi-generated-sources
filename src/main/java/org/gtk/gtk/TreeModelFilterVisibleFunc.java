package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function which decides whether the row indicated by {@code iter} is visible.
 */
@FunctionalInterface
public interface TreeModelFilterVisibleFunc {
        boolean onTreeModelFilterVisibleFunc(@NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreeIter iter);
}
