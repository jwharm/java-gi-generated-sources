package org.gtk.gtk;

@FunctionalInterface
public interface TreeModelFilterModifyFunc {

    /**
     * A function which calculates display values from raw values in the model.
     * It must fill @value with the display value for the column @column in the
     * row indicated by @iter.
     * 
     * Since this function is called for each data access, it’s not a
     * particularly efficient operation.
     */
    public void onTreeModelFilterModifyFunc(TreeModel model, TreeIter iter, org.gtk.gobject.Value value, int column, jdk.incubator.foreign.MemoryAddress data);
}
