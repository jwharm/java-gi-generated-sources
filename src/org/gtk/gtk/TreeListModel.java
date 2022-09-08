package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkTreeListModel` is a list model that can create child models on demand.
 */
public class TreeListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public TreeListModel(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeListModel */
    public static TreeListModel castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListModel(gobject.getReference());
    }
    
    /**
     * Gets whether the model is set to automatically expand new rows
     * that get added.
     * 
     * This can be either rows added by changes to the underlying
     * models or via [method@Gtk.TreeListRow.set_expanded].
     */
    public boolean getAutoexpand() {
        var RESULT = gtk_h.gtk_tree_list_model_get_autoexpand(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the row item corresponding to the child at index @position for
     * @self's root model.
     * 
     * If @position is greater than the number of children in the root model,
     * %NULL is returned.
     * 
     * Do not confuse this function with [method@Gtk.TreeListModel.get_row].
     */
    public TreeListRow getChildRow(int position) {
        var RESULT = gtk_h.gtk_tree_list_model_get_child_row(handle(), position);
        return new TreeListRow(References.get(RESULT, true));
    }
    
    /**
     * Gets the root model that @self was created with.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_tree_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the model is passing through original row items.
     * 
     * If this function returns %FALSE, the `GListModel` functions for @self
     * return custom `GtkTreeListRow` objects. You need to call
     * [method@Gtk.TreeListRow.get_item] on these objects to get the original
     * item.
     * 
     * If %TRUE, the values of the child models are passed through in their
     * original state. You then need to call [method@Gtk.TreeListModel.get_row]
     * to get the custom `GtkTreeListRow`s.
     */
    public boolean getPassthrough() {
        var RESULT = gtk_h.gtk_tree_list_model_get_passthrough(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the row object for the given row.
     * 
     * If @position is greater than the number of items in @self,
     * %NULL is returned.
     * 
     * The row object can be used to expand and collapse rows as
     * well as to inspect its position in the tree. See its
     * documentation for details.
     * 
     * This row object is persistent and will refer to the current
     * item as long as the row is present in @self, independent of
     * other rows being added or removed.
     * 
     * If @self is set to not be passthrough, this function is
     * equivalent to calling g_list_model_get_item().
     * 
     * Do not confuse this function with [method@Gtk.TreeListModel.get_child_row].
     */
    public TreeListRow getRow(int position) {
        var RESULT = gtk_h.gtk_tree_list_model_get_row(handle(), position);
        return new TreeListRow(References.get(RESULT, true));
    }
    
    /**
     * Sets whether the model should autoexpand.
     * 
     * If set to %TRUE, the model will recursively expand all rows that
     * get added to the model. This can be either rows added by changes
     * to the underlying models or via [method@Gtk.TreeListRow.set_expanded].
     */
    public void setAutoexpand(boolean autoexpand) {
        gtk_h.gtk_tree_list_model_set_autoexpand(handle(), autoexpand ? 1 : 0);
    }
    
}
