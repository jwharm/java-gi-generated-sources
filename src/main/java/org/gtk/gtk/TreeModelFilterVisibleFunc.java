package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * A function which decides whether the row indicated by {@code iter} is visible.
 */
@FunctionalInterface
public interface TreeModelFilterVisibleFunc {
        boolean onTreeModelFilterVisibleFunc(TreeModel model, TreeIter iter);
}
