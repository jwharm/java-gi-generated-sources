package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkColumnViewColumn} represents the columns being added to {@code GtkColumnView}.
 * <p>
 * The main ingredient for a {@code GtkColumnViewColumn} is the {@code GtkListItemFactory}
 * that tells the columnview how to create cells for this column from items in
 * the model.
 * <p>
 * Columns have a title, and can optionally have a header menu set
 * with {@link ColumnViewColumn#setHeaderMenu}.
 * <p>
 * A sorter can be associated with a column using
 * {@link ColumnViewColumn#setSorter}, to let users influence sorting
 * by clicking on the column header.
 */
public class ColumnViewColumn extends org.gtk.gobject.Object {

    public ColumnViewColumn(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColumnViewColumn */
    public static ColumnViewColumn castFrom(org.gtk.gobject.Object gobject) {
        return new ColumnViewColumn(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title, ListItemFactory factory) {
        Reference RESULT = References.get(gtk_h.gtk_column_view_column_new(Interop.allocateNativeString(title).handle(), factory.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkColumnViewColumn} that uses the given {@code factory} for
     * mapping items to widgets.
     * <p>
     * You most likely want to call {@link ColumnView#appendColumn} next.
     * <p>
     * The function takes ownership of the argument, so you can write code like:
     * <p>
     * <pre>{@code c
     * column = gtk_column_view_column_new (_("Name"),
     *   gtk_builder_list_item_factory_new_from_resource ("/name.ui"));
     * }</pre>
     */
    public ColumnViewColumn(java.lang.String title, ListItemFactory factory) {
        super(constructNew(title, factory));
    }
    
    /**
     * Gets the column view that's currently displaying this column.
     * <p>
     * If {@code self} has not been added to a column view yet, {@code null} is returned.
     */
    public ColumnView getColumnView() {
        var RESULT = gtk_h.gtk_column_view_column_get_column_view(handle());
        return new ColumnView(References.get(RESULT, false));
    }
    
    /**
     * Returns whether this column should expand.
     */
    public boolean getExpand() {
        var RESULT = gtk_h.gtk_column_view_column_get_expand(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the factory that's currently used to populate list items for
     * this column.
     */
    public ListItemFactory getFactory() {
        var RESULT = gtk_h.gtk_column_view_column_get_factory(handle());
        return new ListItemFactory(References.get(RESULT, false));
    }
    
    /**
     * Gets the fixed width of the column.
     */
    public int getFixedWidth() {
        var RESULT = gtk_h.gtk_column_view_column_get_fixed_width(handle());
        return RESULT;
    }
    
    /**
     * Gets the menu model that is used to create the context menu
     * for the column header.
     */
    public org.gtk.gio.MenuModel getHeaderMenu() {
        var RESULT = gtk_h.gtk_column_view_column_get_header_menu(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Returns whether this column is resizable.
     */
    public boolean getResizable() {
        var RESULT = gtk_h.gtk_column_view_column_get_resizable(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the sorter that is associated with the column.
     */
    public Sorter getSorter() {
        var RESULT = gtk_h.gtk_column_view_column_get_sorter(handle());
        return new Sorter(References.get(RESULT, false));
    }
    
    /**
     * Returns the title set with gtk_column_view_column_set_title().
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_column_view_column_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether this column is visible.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_column_view_column_get_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the column to take available extra space.
     * <p>
     * The extra space is shared equally amongst all columns that
     * have the expand set to {@code true}.
     */
    public void setExpand(boolean expand) {
        gtk_h.gtk_column_view_column_set_expand(handle(), expand ? 1 : 0);
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items for this
     * column.
     */
    public void setFactory(ListItemFactory factory) {
        gtk_h.gtk_column_view_column_set_factory(handle(), factory.handle());
    }
    
    /**
     * If {@code fixed_width} is not -1, sets the fixed width of {@code column};
     * otherwise unsets it.
     * <p>
     * Setting a fixed width overrides the automatically calculated
     * width. Interactive resizing also sets the “fixed-width” property.
     */
    public void setFixedWidth(int fixedWidth) {
        gtk_h.gtk_column_view_column_set_fixed_width(handle(), fixedWidth);
    }
    
    /**
     * Sets the menu model that is used to create the context menu
     * for the column header.
     */
    public void setHeaderMenu(org.gtk.gio.MenuModel menu) {
        gtk_h.gtk_column_view_column_set_header_menu(handle(), menu.handle());
    }
    
    /**
     * Sets whether this column should be resizable by dragging.
     */
    public void setResizable(boolean resizable) {
        gtk_h.gtk_column_view_column_set_resizable(handle(), resizable ? 1 : 0);
    }
    
    /**
     * Associates a sorter with the column.
     * <p>
     * If {@code sorter} is {@code null}, the column will not let users change
     * the sorting by clicking on its header.
     * <p>
     * This sorter can be made active by clicking on the column
     * header, or by calling {@link ColumnView#sortByColumn}.
     * <p>
     * See {@link ColumnView#getSorter} for the necessary steps
     * for setting up customizable sorting for {@link ColumnView}.
     */
    public void setSorter(Sorter sorter) {
        gtk_h.gtk_column_view_column_set_sorter(handle(), sorter.handle());
    }
    
    /**
     * Sets the title of this column.
     * <p>
     * The title is displayed in the header of a {@code GtkColumnView}
     * for this column and is therefore user-facing text that should
     * be translated.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.gtk_column_view_column_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets whether this column should be visible in views.
     */
    public void setVisible(boolean visible) {
        gtk_h.gtk_column_view_column_set_visible(handle(), visible ? 1 : 0);
    }
    
}
