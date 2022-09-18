package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkTreeListModel</code> is a list model that can create child models on demand.
 */
public class TreeListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public TreeListModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeListModel */
    public static TreeListModel castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListModel(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, TreeListModelCreateModelFunc createFunc) {
        try {
            Reference RESULT = References.get(gtk_h.gtk_tree_list_model_new(root.getReference().unowned().handle(), passthrough ? 1 : 0, autoexpand ? 1 : 0, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeListModelCreateModelFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(createFunc.hashCode(), createFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new empty <code>GtkTreeListModel</code> displaying @root
     * with all rows collapsed.
     */
    public TreeListModel(org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, TreeListModelCreateModelFunc createFunc) {
        super(constructNew(root, passthrough, autoexpand, createFunc));
    }
    
    /**
     * Gets whether the model is set to automatically expand new rows
     * that get added.
     * 
     * This can be either rows added by changes to the underlying
     * models or via {@link org.gtk.gtk.TreeListRow<code>#setExpanded</code> .
     */
    public boolean getAutoexpand() {
        var RESULT = gtk_h.gtk_tree_list_model_get_autoexpand(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the row item corresponding to the child at index @position for
     * @self&<code>#39</code> s root model.
     * 
     * If @position is greater than the number of children in the root model,
     * <code>null</code> is returned.
     * 
     * Do not confuse this function with {@link org.gtk.gtk.TreeListModel<code>#getRow</code> .
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
     * <p>
     * If this function returns <code>false</code>  the <code>GListModel</code> functions for @self
     * return custom <code>GtkTreeListRow</code> objects. You need to call
     * {@link org.gtk.gtk.TreeListRow<code>#getItem</code>  on these objects to get the original
     * item.
     * <p>
     * If <code>true</code>  the values of the child models are passed through in their
     * original state. You then need to call {@link org.gtk.gtk.TreeListModel<code>#getRow</code> 
     * to get the custom <code>GtkTreeListRow</code>s.
     */
    public boolean getPassthrough() {
        var RESULT = gtk_h.gtk_tree_list_model_get_passthrough(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the row object for the given row.
     * 
     * If @position is greater than the number of items in @self,
     * <code>null</code> is returned.
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
     * Do not confuse this function with {@link org.gtk.gtk.TreeListModel<code>#getChildRow</code> .
     */
    public TreeListRow getRow(int position) {
        var RESULT = gtk_h.gtk_tree_list_model_get_row(handle(), position);
        return new TreeListRow(References.get(RESULT, true));
    }
    
    /**
     * Sets whether the model should autoexpand.
     * 
     * If set to <code>true</code>  the model will recursively expand all rows that
     * get added to the model. This can be either rows added by changes
     * to the underlying models or via {@link org.gtk.gtk.TreeListRow<code>#setExpanded</code> .
     */
    public void setAutoexpand(boolean autoexpand) {
        gtk_h.gtk_tree_list_model_set_autoexpand(handle(), autoexpand ? 1 : 0);
    }
    
}
