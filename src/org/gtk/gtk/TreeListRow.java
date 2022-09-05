package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkTreeListRow` is used by `GtkTreeListModel` to represent items.
 * 
 * It allows navigating the model as a tree and modify the state of rows.
 * 
 * `GtkTreeListRow` instances are created by a `GtkTreeListModel` only
 * when the [property@Gtk.TreeListModel:passthrough] property is not set.
 * 
 * There are various support objects that can make use of `GtkTreeListRow`
 * objects, such as the [class@Gtk.TreeExpander] widget that allows displaying
 * an icon to expand or collapse a row or [class@Gtk.TreeListRowSorter] that
 * makes it possible to sort trees properly.
 */
public class TreeListRow extends org.gtk.gobject.Object {

    public TreeListRow(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to TreeListRow */
    public static TreeListRow castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListRow(gobject.getProxy());
    }
    
    /**
     * If @self is not expanded or @position is greater than the
     * number of children, %NULL is returned.
     */
    public TreeListRow getChildRow(int position) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_get_child_row(HANDLE(), position);
        return new TreeListRow(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * If the row is expanded, gets the model holding the children of @self.
     * 
     * This model is the model created by the
     * [callback@Gtk.TreeListModelCreateModelFunc]
     * and contains the original items, no matter what value
     * [property@Gtk.TreeListModel:passthrough] is set to.
     */
    public org.gtk.gio.ListModel getChildren() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_get_children(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the depth of this row.
     * 
     * Rows that correspond to items in the root model have a depth
     * of zero, rows corresponding to items of models of direct children
     * of the root model have a depth of 1 and so on.
     * 
     * The depth of a row never changes until the row is destroyed.
     */
    public int getDepth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_get_depth(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets if a row is currently expanded.
     */
    public boolean getExpanded() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_get_expanded(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the item corresponding to this row,
     * 
     * The value returned by this function never changes until the
     * row is destroyed.
     */
    public org.gtk.gobject.Object getItem() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_get_item(HANDLE());
        return new org.gtk.gobject.Object(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the row representing the parent for @self.
     * 
     * That is the row that would need to be collapsed
     * to make this row disappear.
     * 
     * If @self is a row corresponding to the root model,
     * %NULL is returned.
     * 
     * The value returned by this function never changes
     * until the row is destroyed.
     */
    public TreeListRow getParent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_get_parent(HANDLE());
        return new TreeListRow(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns the position in the `GtkTreeListModel` that @self occupies
     * at the moment.
     */
    public int getPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_get_position(HANDLE());
        return RESULT;
    }
    
    /**
     * Checks if a row can be expanded.
     * 
     * This does not mean that the row is actually expanded,
     * this can be checked with [method@Gtk.TreeListRow.get_expanded].
     * 
     * If a row is expandable never changes until the row is destroyed.
     */
    public boolean isExpandable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_is_expandable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Expands or collapses a row.
     * 
     * If a row is expanded, the model of calling the
     * [callback@Gtk.TreeListModelCreateModelFunc] for the row's
     * item will be inserted after this row. If a row is collapsed,
     * those items will be removed from the model.
     * 
     * If the row is not expandable, this function does nothing.
     */
    public void setExpanded(boolean expanded) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_tree_list_row_set_expanded(HANDLE(), expanded ? 1 : 0);
    }
    
}
