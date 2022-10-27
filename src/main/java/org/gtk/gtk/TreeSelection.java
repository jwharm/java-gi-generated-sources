package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public TreeSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeSelection */
    public static TreeSelection castFrom(org.gtk.gobject.Object gobject) {
        return new TreeSelection(gobject.refcounted());
    }
    
    /**
     * Returns the number of rows that have been selected in {@code tree}.
     * @return The number of rows selected.
     */
    public int countSelectedRows() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_count_selected_rows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the selection mode for {@code selection}. See
     * gtk_tree_selection_set_mode().
     * @return the current selection mode
     */
    public @NotNull org.gtk.gtk.SelectionMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_get_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionMode(RESULT);
    }
    
    /**
     * Returns the current selection function.
     * @return The function.
     */
    public @NotNull org.gtk.gtk.TreeSelectionFunc getSelectFunction() {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets {@code iter} to the currently selected node if {@code selection} is set to
     * {@link SelectionMode#SINGLE} or {@link SelectionMode#BROWSE}.  {@code iter} may be NULL if you
     * just want to test if {@code selection} has any selected nodes.  {@code model} is filled
     * with the current model as a convenience.  This function will not work if you
     * use {@code selection} is {@link SelectionMode#MULTIPLE}.
     * @param model A pointer to set to the {@code GtkTreeModel}
     * @param iter The {@code GtkTreeIter}
     * @return TRUE, if there is a selected node.
     */
    public boolean getSelected(@NotNull Out<org.gtk.gtk.TreeModel> model, @NotNull Out<org.gtk.gtk.TreeIter> iter) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_get_selected.invokeExact(handle(), (Addressable) modelPOINTER.address(), (Addressable) iterPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.set(new org.gtk.gtk.TreeModel.TreeModelImpl(Refcounted.get(modelPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        iter.set(new org.gtk.gtk.TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
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
     * @param model A pointer to set to the {@code GtkTreeModel}
     * @return A {@code GList} containing a {@code GtkTreePath} for each selected row.
     */
    public @NotNull org.gtk.glib.List getSelectedRows(@NotNull Out<org.gtk.gtk.TreeModel> model) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_selection_get_selected_rows.invokeExact(handle(), (Addressable) modelPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.set(new org.gtk.gtk.TreeModel.TreeModelImpl(Refcounted.get(modelPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns the tree view associated with {@code selection}.
     * @return A {@code GtkTreeView}
     */
    public @NotNull org.gtk.gtk.TreeView getTreeView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_selection_get_tree_view.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeView(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the user data for the selection function.
     * @return The user data.
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_selection_get_user_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the row at {@code iter} is currently selected.
     * @param iter A valid {@code GtkTreeIter}
     * @return {@code true}, if {@code iter} is selected
     */
    public boolean iterIsSelected(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_iter_is_selected.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the row pointed to by {@code path} is currently selected.  If {@code path}
     * does not point to a valid location, {@code false} is returned
     * @param path A {@code GtkTreePath} to check selection on.
     * @return {@code true} if {@code path} is selected.
     */
    public boolean pathIsSelected(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_path_is_selected.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Selects all the nodes. {@code selection} must be set to {@link SelectionMode#MULTIPLE}
     * mode.
     */
    public void selectAll() {
        try {
            DowncallHandles.gtk_tree_selection_select_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects the specified iterator.
     * @param iter The {@code GtkTreeIter} to be selected.
     */
    public void selectIter(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_select_iter.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Select the row at {@code path}.
     * @param path The {@code GtkTreePath} to be selected.
     */
    public void selectPath(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_select_path.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects a range of nodes, determined by {@code start_path} and {@code end_path} inclusive.
     * {@code selection} must be set to {@link SelectionMode#MULTIPLE} mode.
     * @param startPath The initial node of the range.
     * @param endPath The final node of the range.
     */
    public void selectRange(@NotNull org.gtk.gtk.TreePath startPath, @NotNull org.gtk.gtk.TreePath endPath) {
        java.util.Objects.requireNonNull(startPath, "Parameter 'startPath' must not be null");
        java.util.Objects.requireNonNull(endPath, "Parameter 'endPath' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_select_range.invokeExact(handle(), startPath.handle(), endPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function for each selected node. Note that you cannot modify
     * the tree or selection from within this function. As a result,
     * gtk_tree_selection_get_selected_rows() might be more useful.
     * @param func The function to call for each selected node.
     */
    public void selectedForeach(@NotNull org.gtk.gtk.TreeSelectionForeachFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_selected_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTreeSelectionForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the selection mode of the {@code selection}.  If the previous type was
     * {@link SelectionMode#MULTIPLE}, then the anchor is kept selected, if it was
     * previously selected.
     * @param type The selection mode
     */
    public void setMode(@NotNull org.gtk.gtk.SelectionMode type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_set_mode.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the selection function.
     * <p>
     * If set, this function is called before any node is selected or unselected,
     * giving some control over which nodes are selected. The select function
     * should return {@code true} if the state of the node may be toggled, and {@code false}
     * if the state of the node should be left unchanged.
     * @param func The selection function. May be {@code null}
     */
    public void setSelectFunction(@Nullable org.gtk.gtk.TreeSelectionFunc func) {
        java.util.Objects.requireNonNullElse(func, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tree_selection_set_select_function.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTreeSelectionFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (func == null ? MemoryAddress.NULL : Interop.registerCallback(func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects all the nodes.
     */
    public void unselectAll() {
        try {
            DowncallHandles.gtk_tree_selection_unselect_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects the specified iterator.
     * @param iter The {@code GtkTreeIter} to be unselected.
     */
    public void unselectIter(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_unselect_iter.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects the row at {@code path}.
     * @param path The {@code GtkTreePath} to be unselected.
     */
    public void unselectPath(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_unselect_path.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects a range of nodes, determined by {@code start_path} and {@code end_path}
     * inclusive.
     * @param startPath The initial node of the range.
     * @param endPath The initial node of the range.
     */
    public void unselectRange(@NotNull org.gtk.gtk.TreePath startPath, @NotNull org.gtk.gtk.TreePath endPath) {
        java.util.Objects.requireNonNull(startPath, "Parameter 'startPath' must not be null");
        java.util.Objects.requireNonNull(endPath, "Parameter 'endPath' must not be null");
        try {
            DowncallHandles.gtk_tree_selection_unselect_range.invokeExact(handle(), startPath.handle(), endPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(TreeSelection source);
    }
    
    /**
     * Emitted whenever the selection has (possibly) changed. Please note that
     * this signal is mostly a hint.  It may only be emitted once when a range
     * of rows are selected, and it may occasionally be emitted when nothing
     * has happened.
     */
    public Signal<TreeSelection.Changed> onChanged(TreeSelection.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeSelection.Callbacks.class, "signalTreeSelectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TreeSelection.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_selection_count_selected_rows = Interop.downcallHandle(
            "gtk_tree_selection_count_selected_rows",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_get_mode = Interop.downcallHandle(
            "gtk_tree_selection_get_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_get_select_function = Interop.downcallHandle(
            "gtk_tree_selection_get_select_function",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_get_selected = Interop.downcallHandle(
            "gtk_tree_selection_get_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_get_selected_rows = Interop.downcallHandle(
            "gtk_tree_selection_get_selected_rows",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_get_tree_view = Interop.downcallHandle(
            "gtk_tree_selection_get_tree_view",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_get_user_data = Interop.downcallHandle(
            "gtk_tree_selection_get_user_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_iter_is_selected = Interop.downcallHandle(
            "gtk_tree_selection_iter_is_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_path_is_selected = Interop.downcallHandle(
            "gtk_tree_selection_path_is_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_select_all = Interop.downcallHandle(
            "gtk_tree_selection_select_all",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_select_iter = Interop.downcallHandle(
            "gtk_tree_selection_select_iter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_select_path = Interop.downcallHandle(
            "gtk_tree_selection_select_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_select_range = Interop.downcallHandle(
            "gtk_tree_selection_select_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_selected_foreach = Interop.downcallHandle(
            "gtk_tree_selection_selected_foreach",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_set_mode = Interop.downcallHandle(
            "gtk_tree_selection_set_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_tree_selection_set_select_function = Interop.downcallHandle(
            "gtk_tree_selection_set_select_function",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_all = Interop.downcallHandle(
            "gtk_tree_selection_unselect_all",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_iter = Interop.downcallHandle(
            "gtk_tree_selection_unselect_iter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_path = Interop.downcallHandle(
            "gtk_tree_selection_unselect_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_range = Interop.downcallHandle(
            "gtk_tree_selection_unselect_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalTreeSelectionChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeSelection.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TreeSelection(Refcounted.get(source)));
        }
    }
}
