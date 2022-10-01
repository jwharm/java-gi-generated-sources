package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkTreeListModel} is a list model that can create child models on demand.
 */
public class TreeListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public TreeListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeListModel */
    public static TreeListModel castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListModel(gobject.refcounted());
    }
    
    private static Refcounted constructNew(org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, TreeListModelCreateModelFunc createFunc) {
        try {
            Refcounted RESULT = Refcounted.get(gtk_h.gtk_tree_list_model_new(root.refcounted().unowned().handle(), passthrough ? 1 : 0, autoexpand ? 1 : 0, 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeListModelCreateModelFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(createFunc.hashCode(), createFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new empty {@code GtkTreeListModel} displaying {@code root}
     * with all rows collapsed.
     */
    public TreeListModel(org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, TreeListModelCreateModelFunc createFunc) {
        super(constructNew(root, passthrough, autoexpand, createFunc));
    }
    
    /**
     * Gets whether the model is set to automatically expand new rows
     * that get added.
     * <p>
     * This can be either rows added by changes to the underlying
     * models or via {@link TreeListRow#setExpanded}.
     */
    public boolean getAutoexpand() {
        var RESULT = gtk_h.gtk_tree_list_model_get_autoexpand(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the row item corresponding to the child at index {@code position} for
     * {@code self}'s root model.
     * <p>
     * If {@code position} is greater than the number of children in the root model,
     * {@code null} is returned.
     * <p>
     * Do not confuse this function with {@link TreeListModel#getRow}.
     */
    public TreeListRow getChildRow(int position) {
        var RESULT = gtk_h.gtk_tree_list_model_get_child_row(handle(), position);
        return new TreeListRow(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the root model that {@code self} was created with.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_tree_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the model is passing through original row items.
     * <p>
     * If this function returns {@code false}, the {@code GListModel} functions for {@code self}
     * return custom {@code GtkTreeListRow} objects. You need to call
     * {@link TreeListRow#getItem} on these objects to get the original
     * item.
     * <p>
     * If {@code true}, the values of the child models are passed through in their
     * original state. You then need to call {@link TreeListModel#getRow}
     * to get the custom {@code GtkTreeListRow}s.
     */
    public boolean getPassthrough() {
        var RESULT = gtk_h.gtk_tree_list_model_get_passthrough(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the row object for the given row.
     * <p>
     * If {@code position} is greater than the number of items in {@code self},
     * {@code null} is returned.
     * <p>
     * The row object can be used to expand and collapse rows as
     * well as to inspect its position in the tree. See its
     * documentation for details.
     * <p>
     * This row object is persistent and will refer to the current
     * item as long as the row is present in {@code self}, independent of
     * other rows being added or removed.
     * <p>
     * If {@code self} is set to not be passthrough, this function is
     * equivalent to calling g_list_model_get_item().
     * <p>
     * Do not confuse this function with {@link TreeListModel#getChildRow}.
     */
    public TreeListRow getRow(int position) {
        var RESULT = gtk_h.gtk_tree_list_model_get_row(handle(), position);
        return new TreeListRow(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets whether the model should autoexpand.
     * <p>
     * If set to {@code true}, the model will recursively expand all rows that
     * get added to the model. This can be either rows added by changes
     * to the underlying models or via {@link TreeListRow#setExpanded}.
     */
    public void setAutoexpand(boolean autoexpand) {
        gtk_h.gtk_tree_list_model_set_autoexpand(handle(), autoexpand ? 1 : 0);
    }
    
}
