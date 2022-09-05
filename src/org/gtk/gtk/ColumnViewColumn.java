package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkColumnViewColumn` represents the columns being added to `GtkColumnView`.
 * 
 * The main ingredient for a `GtkColumnViewColumn` is the `GtkListItemFactory`
 * that tells the columnview how to create cells for this column from items in
 * the model.
 * 
 * Columns have a title, and can optionally have a header menu set
 * with [method@Gtk.ColumnViewColumn.set_header_menu].
 * 
 * A sorter can be associated with a column using
 * [method@Gtk.ColumnViewColumn.set_sorter], to let users influence sorting
 * by clicking on the column header.
 */
public class ColumnViewColumn extends org.gtk.gobject.Object {

    public ColumnViewColumn(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ColumnViewColumn */
    public static ColumnViewColumn castFrom(org.gtk.gobject.Object gobject) {
        return new ColumnViewColumn(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkColumnViewColumn` that uses the given @factory for
     * mapping items to widgets.
     * 
     * You most likely want to call [method@Gtk.ColumnView.append_column] next.
     * 
     * The function takes ownership of the argument, so you can write code like:
     * 
     * ```c
     * column = gtk_column_view_column_new (_("Name"),
     *   gtk_builder_list_item_factory_new_from_resource ("/name.ui"));
     * ```
     */
    public ColumnViewColumn(java.lang.String title, ListItemFactory factory) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_new(Interop.getAllocator().allocateUtf8String(title), factory.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the column view that's currently displaying this column.
     * 
     * If @self has not been added to a column view yet, %NULL is returned.
     */
    public ColumnView getColumnView() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_column_view(HANDLE());
        return new ColumnView(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether this column should expand.
     */
    public boolean getExpand() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_expand(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the factory that's currently used to populate list items for
     * this column.
     */
    public ListItemFactory getFactory() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_factory(HANDLE());
        return new ListItemFactory(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the fixed width of the column.
     */
    public int getFixedWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_fixed_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the menu model that is used to create the context menu
     * for the column header.
     */
    public org.gtk.gio.MenuModel getHeaderMenu() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_header_menu(HANDLE());
        return new org.gtk.gio.MenuModel(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether this column is resizable.
     */
    public boolean getResizable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_resizable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the sorter that is associated with the column.
     */
    public Sorter getSorter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_sorter(HANDLE());
        return new Sorter(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the title set with gtk_column_view_column_set_title().
     */
    public java.lang.String getTitle() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_title(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether this column is visible.
     */
    public boolean getVisible() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_get_visible(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the column to take available extra space.
     * 
     * The extra space is shared equally amongst all columns that
     * have the expand set to %TRUE.
     */
    public void setExpand(boolean expand) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_expand(HANDLE(), expand ? 1 : 0);
    }
    
    /**
     * Sets the `GtkListItemFactory` to use for populating list items for this
     * column.
     */
    public void setFactory(ListItemFactory factory) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_factory(HANDLE(), factory.HANDLE());
    }
    
    /**
     * If @fixed_width is not -1, sets the fixed width of @column;
     * otherwise unsets it.
     * 
     * Setting a fixed width overrides the automatically calculated
     * width. Interactive resizing also sets the “fixed-width” property.
     */
    public void setFixedWidth(int fixedWidth) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_fixed_width(HANDLE(), fixedWidth);
    }
    
    /**
     * Sets the menu model that is used to create the context menu
     * for the column header.
     */
    public void setHeaderMenu(org.gtk.gio.MenuModel menu) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_header_menu(HANDLE(), menu.HANDLE());
    }
    
    /**
     * Sets whether this column should be resizable by dragging.
     */
    public void setResizable(boolean resizable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_resizable(HANDLE(), resizable ? 1 : 0);
    }
    
    /**
     * Associates a sorter with the column.
     * 
     * If @sorter is %NULL, the column will not let users change
     * the sorting by clicking on its header.
     * 
     * This sorter can be made active by clicking on the column
     * header, or by calling [method@Gtk.ColumnView.sort_by_column].
     * 
     * See [method@Gtk.ColumnView.get_sorter] for the necessary steps
     * for setting up customizable sorting for [class@Gtk.ColumnView].
     */
    public void setSorter(Sorter sorter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_sorter(HANDLE(), sorter.HANDLE());
    }
    
    /**
     * Sets the title of this column.
     * 
     * The title is displayed in the header of a `GtkColumnView`
     * for this column and is therefore user-facing text that should
     * be translated.
     */
    public void setTitle(java.lang.String title) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_title(HANDLE(), Interop.getAllocator().allocateUtf8String(title));
    }
    
    /**
     * Sets whether this column should be visible in views.
     */
    public void setVisible(boolean visible) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_column_view_column_set_visible(HANDLE(), visible ? 1 : 0);
    }
    
}
