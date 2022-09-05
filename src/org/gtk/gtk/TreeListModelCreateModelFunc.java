package org.gtk.gtk;

@FunctionalInterface
public interface TreeListModelCreateModelFunc {

    /**
     * Prototype of the function called to create new child models when
     * gtk_tree_list_row_set_expanded() is called.
     * 
     * This function can return %NULL to indicate that @item is guaranteed to be
     * a leaf node and will never have children. If it does not have children but
     * may get children later, it should return an empty model that is filled once
     * children arrive.
     */
    public org.gtk.gio.ListModel onTreeListModelCreateModelFunc(org.gtk.gobject.Object item, jdk.incubator.foreign.MemoryAddress userData);
}
