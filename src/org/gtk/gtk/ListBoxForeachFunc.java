package org.gtk.gtk;

/**
 * A function used by gtk_list_box_selected_foreach().
 * 
 * It will be called on every selected child of the @box.
 */
@FunctionalInterface
public interface ListBoxForeachFunc {
        void onListBoxForeachFunc(ListBox box, ListBoxRow row);
}
