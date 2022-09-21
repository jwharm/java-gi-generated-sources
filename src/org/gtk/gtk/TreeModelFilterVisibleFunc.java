package org.gtk.gtk;

/**
 * A function which decides whether the row indicated by {@code iter} is visible.
 */
@FunctionalInterface
public interface TreeModelFilterVisibleFunc {
        boolean onTreeModelFilterVisibleFunc(TreeModel model, TreeIter iter);
}
