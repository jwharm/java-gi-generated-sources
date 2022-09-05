package org.gtk.gtk;

@FunctionalInterface
public interface ListBoxForeachFunc {

    /**
     * A function used by gtk_list_box_selected_foreach().
     * 
     * It will be called on every selected child of the @box.
     */
    public void onListBoxForeachFunc(ListBox box, ListBoxRow row, jdk.incubator.foreign.MemoryAddress userData);
}
