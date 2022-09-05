package org.gtk.gtk;

@FunctionalInterface
public interface TreeModelFilterVisibleFunc {

    /**
     * A function which decides whether the row indicated by @iter is visible.
     */
    public boolean onTreeModelFilterVisibleFunc(TreeModel model, TreeIter iter, jdk.incubator.foreign.MemoryAddress data);
}
