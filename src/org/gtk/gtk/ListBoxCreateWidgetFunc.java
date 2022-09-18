package org.gtk.gtk;

/**
 * Called for list boxes that are bound to a <code>GListModel</code> with
 * gtk_list_box_bind_model() for each item that gets added to the model.
 * 
 * If the widget returned is not a {@link org.gtk.gtk.ListBoxRow} widget, then the widget
 * will be inserted as the child of an intermediate {@link org.gtk.gtk.ListBoxRow}
 */
@FunctionalInterface
public interface ListBoxCreateWidgetFunc {
        Widget onListBoxCreateWidgetFunc(org.gtk.gobject.Object item);
}
