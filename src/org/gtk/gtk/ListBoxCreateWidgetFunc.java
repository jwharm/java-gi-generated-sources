package org.gtk.gtk;

/**
 * Called for list boxes that are bound to a `GListModel` with
 * gtk_list_box_bind_model() for each item that gets added to the model.
 * 
 * If the widget returned is not a #GtkListBoxRow widget, then the widget
 * will be inserted as the child of an intermediate #GtkListBoxRow.
 */
@FunctionalInterface
public interface ListBoxCreateWidgetFunc {
        Widget onListBoxCreateWidgetFunc(org.gtk.gobject.Object item);
}
