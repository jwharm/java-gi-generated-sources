package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkTreeListRow</code> is used by <code>GtkTreeListModel</code> to represent items.
 * <p>
 * It allows navigating the model as a tree and modify the state of rows.
 * <p><code>GtkTreeListRow</code> instances are created by a <code>GtkTreeListModel</code> only
 * when the {@link [property@Gtk.TreeListModel:passthrough] (ref=property)} property is not set.
 * <p>
 * There are various support objects that can make use of <code>GtkTreeListRow</code>
 * objects, such as the {@link org.gtk.gtk.TreeExpander} widget that allows displaying
 * an icon to expand or collapse a row or {@link org.gtk.gtk.TreeListRowSorter} that
 * makes it possible to sort trees properly.
 */
public class TreeListRow extends org.gtk.gobject.Object {

    public TreeListRow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeListRow */
    public static TreeListRow castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListRow(gobject.getReference());
    }
    
    /**
     * If @self is not expanded or @position is greater than the
     * number of children, <code>null</code> is returned.
     */
    public TreeListRow getChildRow(int position) {
        var RESULT = gtk_h.gtk_tree_list_row_get_child_row(handle(), position);
        return new TreeListRow(References.get(RESULT, true));
    }
    
    /**
     * If the row is expanded, gets the model holding the children of @self.
     * 
     * This model is the model created by the
     * {@link [callback@Gtk.TreeListModelCreateModelFunc] (ref=callback)}
     * and contains the original items, no matter what value
     * {@link [property@Gtk.TreeListModel:passthrough] (ref=property)} is set to.
     */
    public org.gtk.gio.ListModel getChildren() {
        var RESULT = gtk_h.gtk_tree_list_row_get_children(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
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
        var RESULT = gtk_h.gtk_tree_list_row_get_depth(handle());
        return RESULT;
    }
    
    /**
     * Gets if a row is currently expanded.
     */
    public boolean getExpanded() {
        var RESULT = gtk_h.gtk_tree_list_row_get_expanded(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the item corresponding to this row,
     * 
     * The value returned by this function never changes until the
     * row is destroyed.
     */
    public org.gtk.gobject.Object getItem() {
        var RESULT = gtk_h.gtk_tree_list_row_get_item(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, true));
    }
    
    /**
     * Gets the row representing the parent for @self.
     * 
     * That is the row that would need to be collapsed
     * to make this row disappear.
     * 
     * If @self is a row corresponding to the root model,
     * <code>null</code> is returned.
     * 
     * The value returned by this function never changes
     * until the row is destroyed.
     */
    public TreeListRow getParent() {
        var RESULT = gtk_h.gtk_tree_list_row_get_parent(handle());
        return new TreeListRow(References.get(RESULT, true));
    }
    
    /**
     * Returns the position in the <code>GtkTreeListModel</code> that @self occupies
     * at the moment.
     */
    public int getPosition() {
        var RESULT = gtk_h.gtk_tree_list_row_get_position(handle());
        return RESULT;
    }
    
    /**
     * Checks if a row can be expanded.
     * 
     * This does not mean that the row is actually expanded,
     * this can be checked with {@link org.gtk.gtk.TreeListRow<code>#getExpanded</code> .
     * 
     * If a row is expandable never changes until the row is destroyed.
     */
    public boolean isExpandable() {
        var RESULT = gtk_h.gtk_tree_list_row_is_expandable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Expands or collapses a row.
     * 
     * If a row is expanded, the model of calling the
     * {@link [callback@Gtk.TreeListModelCreateModelFunc] (ref=callback)} for the row&<code>#39</code> s
     * item will be inserted after this row. If a row is collapsed,
     * those items will be removed from the model.
     * 
     * If the row is not expandable, this function does nothing.
     */
    public void setExpanded(boolean expanded) {
        gtk_h.gtk_tree_list_row_set_expanded(handle(), expanded ? 1 : 0);
    }
    
}
