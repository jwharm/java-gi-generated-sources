package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The selection object for GtkTreeView
 * <p>
 * The {@code GtkTreeSelection} object is a helper object to manage the selection
 * for a {@code GtkTreeView} widget.  The {@code GtkTreeSelection} object is
 * automatically created when a new {@code GtkTreeView} widget is created, and
 * cannot exist independently of this widget.  The primary reason the
 * {@code GtkTreeSelection} objects exists is for cleanliness of code and API.
 * That is, there is no conceptual reason all these functions could not be
 * methods on the {@code GtkTreeView} widget instead of a separate function.
 * <p>
 * The {@code GtkTreeSelection} object is gotten from a {@code GtkTreeView} by calling
 * gtk_tree_view_get_selection().  It can be manipulated to check the
 * selection status of the tree, as well as select and deselect individual
 * rows.  Selection is done completely view side.  As a result, multiple
 * views of the same model can have completely different selections.
 * Additionally, you cannot change the selection of a row on the model that
 * is not currently displayed by the view without expanding its parents
 * first.
 * <p>
 * One of the important things to remember when monitoring the selection of
 * a view is that the {@code GtkTreeSelection}::changed signal is mostly a hint.
 * That is, it may only emit one signal when a range of rows is selected.
 * Additionally, it may on occasion emit a {@code GtkTreeSelection}::changed signal
 * when nothing has happened (mostly as a result of programmers calling
 * select_row on an already selected row).
 */
public class TreeSelection extends org.gtk.gobject.Object {

    public TreeSelection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeSelection */
    public static TreeSelection castFrom(org.gtk.gobject.Object gobject) {
        return new TreeSelection(gobject.getReference());
    }
    
    /**
     * Returns the number of rows that have been selected in {@code tree}.
     */
    public int countSelectedRows() {
        var RESULT = gtk_h.gtk_tree_selection_count_selected_rows(handle());
        return RESULT;
    }
    
    /**
     * Gets the selection mode for {@code selection}. See
     * gtk_tree_selection_set_mode().
     */
    public SelectionMode getMode() {
        var RESULT = gtk_h.gtk_tree_selection_get_mode(handle());
        return new SelectionMode(RESULT);
    }
    
    /**
     * Sets {@code iter} to the currently selected node if {@code selection} is set to
     * {@link SelectionMode#SINGLE} or {@link SelectionMode#BROWSE}.  {@code iter} may be NULL if you
     * just want to test if {@code selection} has any selected nodes.  {@code model} is filled
     * with the current model as a convenience.  This function will not work if you
     * use {@code selection} is {@link SelectionMode#MULTIPLE}.
     */
    public boolean getSelected(TreeModel[] model, TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_selection_get_selected(handle(), Interop.allocateNativeArray(model).handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a list of path of all selected rows. Additionally, if you are
     * planning on modifying the model after calling this function, you may
     * want to convert the returned list into a list of {@code GtkTreeRowReference}s.
     * To do this, you can use gtk_tree_row_reference_new().
     * <p>
     * To free the return value, use:
     * <pre>{@code <!-- language="C" -->
     * g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
     * }</pre>
     */
    public org.gtk.glib.List getSelectedRows(TreeModel[] model) {
        var RESULT = gtk_h.gtk_tree_selection_get_selected_rows(handle(), Interop.allocateNativeArray(model).handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Returns the tree view associated with {@code selection}.
     */
    public TreeView getTreeView() {
        var RESULT = gtk_h.gtk_tree_selection_get_tree_view(handle());
        return new TreeView(References.get(RESULT, false));
    }
    
    /**
     * Returns the user data for the selection function.
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.gtk_tree_selection_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the row at {@code iter} is currently selected.
     */
    public boolean iterIsSelected(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_selection_iter_is_selected(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns {@code true} if the row pointed to by {@code path} is currently selected.  If {@code path}
     * does not point to a valid location, {@code false} is returned
     */
    public boolean pathIsSelected(TreePath path) {
        var RESULT = gtk_h.gtk_tree_selection_path_is_selected(handle(), path.handle());
        return (RESULT != 0);
    }
    
    /**
     * Selects all the nodes. {@code selection} must be set to {@link SelectionMode#MULTIPLE}
     * mode.
     */
    public void selectAll() {
        gtk_h.gtk_tree_selection_select_all(handle());
    }
    
    /**
     * Selects the specified iterator.
     */
    public void selectIter(TreeIter iter) {
        gtk_h.gtk_tree_selection_select_iter(handle(), iter.handle());
    }
    
    /**
     * Select the row at {@code path}.
     */
    public void selectPath(TreePath path) {
        gtk_h.gtk_tree_selection_select_path(handle(), path.handle());
    }
    
    /**
     * Selects a range of nodes, determined by {@code start_path} and {@code end_path} inclusive.
     * {@code selection} must be set to {@link SelectionMode#MULTIPLE} mode.
     */
    public void selectRange(TreePath startPath, TreePath endPath) {
        gtk_h.gtk_tree_selection_select_range(handle(), startPath.handle(), endPath.handle());
    }
    
    /**
     * Calls a function for each selected node. Note that you cannot modify
     * the tree or selection from within this function. As a result,
     * gtk_tree_selection_get_selected_rows() might be more useful.
     */
    public void selectedForeach(TreeSelectionForeachFunc func) {
        try {
            gtk_h.gtk_tree_selection_selected_foreach(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeSelectionForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the selection mode of the {@code selection}.  If the previous type was
     * {@link SelectionMode#MULTIPLE}, then the anchor is kept selected, if it was
     * previously selected.
     */
    public void setMode(SelectionMode type) {
        gtk_h.gtk_tree_selection_set_mode(handle(), type.getValue());
    }
    
    /**
     * Sets the selection function.
     * <p>
     * If set, this function is called before any node is selected or unselected,
     * giving some control over which nodes are selected. The select function
     * should return {@code true} if the state of the node may be toggled, and {@code false}
     * if the state of the node should be left unchanged.
     */
    public void setSelectFunction(TreeSelectionFunc func) {
        try {
            gtk_h.gtk_tree_selection_set_select_function(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeSelectionFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unselects all the nodes.
     */
    public void unselectAll() {
        gtk_h.gtk_tree_selection_unselect_all(handle());
    }
    
    /**
     * Unselects the specified iterator.
     */
    public void unselectIter(TreeIter iter) {
        gtk_h.gtk_tree_selection_unselect_iter(handle(), iter.handle());
    }
    
    /**
     * Unselects the row at {@code path}.
     */
    public void unselectPath(TreePath path) {
        gtk_h.gtk_tree_selection_unselect_path(handle(), path.handle());
    }
    
    /**
     * Unselects a range of nodes, determined by {@code start_path} and {@code end_path}
     * inclusive.
     */
    public void unselectRange(TreePath startPath, TreePath endPath) {
        gtk_h.gtk_tree_selection_unselect_range(handle(), startPath.handle(), endPath.handle());
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(TreeSelection source);
    }
    
    /**
     * Emitted whenever the selection has (possibly) changed. Please note that
     * this signal is mostly a hint.  It may only be emitted once when a range
     * of rows are selected, and it may occasionally be emitted when nothing
     * has happened.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeSelection.class, "__signalTreeSelectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalTreeSelectionChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSelection.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeSelection(References.get(source)));
    }
    
}
