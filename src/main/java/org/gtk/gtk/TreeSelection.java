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

    public TreeSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeSelection */
    public static TreeSelection castFrom(org.gtk.gobject.Object gobject) {
        return new TreeSelection(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_tree_selection_count_selected_rows = Interop.downcallHandle(
        "gtk_tree_selection_count_selected_rows",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of rows that have been selected in {@code tree}.
     */
    public int countSelectedRows() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_selection_count_selected_rows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_selection_get_mode = Interop.downcallHandle(
        "gtk_tree_selection_get_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selection mode for {@code selection}. See
     * gtk_tree_selection_set_mode().
     */
    public @NotNull SelectionMode getMode() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_selection_get_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SelectionMode(RESULT);
    }
    
    private static final MethodHandle gtk_tree_selection_get_selected = Interop.downcallHandle(
        "gtk_tree_selection_get_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code iter} to the currently selected node if {@code selection} is set to
     * {@link SelectionMode#SINGLE} or {@link SelectionMode#BROWSE}.  {@code iter} may be NULL if you
     * just want to test if {@code selection} has any selected nodes.  {@code model} is filled
     * with the current model as a convenience.  This function will not work if you
     * use {@code selection} is {@link SelectionMode#MULTIPLE}.
     */
    public boolean getSelected(@NotNull Out<TreeModel> model, @NotNull Out<TreeIter> iter) {
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_selection_get_selected.invokeExact(handle(), (Addressable) modelPOINTER.address(), (Addressable) iterPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.set(new TreeModel.TreeModelImpl(Refcounted.get(modelPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        iter.set(new TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_selection_get_selected_rows = Interop.downcallHandle(
        "gtk_tree_selection_get_selected_rows",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull org.gtk.glib.List getSelectedRows(@NotNull Out<TreeModel> model) {
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_selection_get_selected_rows.invokeExact(handle(), (Addressable) modelPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.set(new TreeModel.TreeModelImpl(Refcounted.get(modelPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_tree_selection_get_tree_view = Interop.downcallHandle(
        "gtk_tree_selection_get_tree_view",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the tree view associated with {@code selection}.
     */
    public @NotNull TreeView getTreeView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_selection_get_tree_view.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeView(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_tree_selection_get_user_data = Interop.downcallHandle(
        "gtk_tree_selection_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the user data for the selection function.
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_selection_get_user_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_selection_iter_is_selected = Interop.downcallHandle(
        "gtk_tree_selection_iter_is_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the row at {@code iter} is currently selected.
     */
    public boolean iterIsSelected(@NotNull TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_selection_iter_is_selected.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_selection_path_is_selected = Interop.downcallHandle(
        "gtk_tree_selection_path_is_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the row pointed to by {@code path} is currently selected.  If {@code path}
     * does not point to a valid location, {@code false} is returned
     */
    public boolean pathIsSelected(@NotNull TreePath path) {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_selection_path_is_selected.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_selection_select_all = Interop.downcallHandle(
        "gtk_tree_selection_select_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Selects all the nodes. {@code selection} must be set to {@link SelectionMode#MULTIPLE}
     * mode.
     */
    public @NotNull void selectAll() {
        try {
            gtk_tree_selection_select_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_select_iter = Interop.downcallHandle(
        "gtk_tree_selection_select_iter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects the specified iterator.
     */
    public @NotNull void selectIter(@NotNull TreeIter iter) {
        try {
            gtk_tree_selection_select_iter.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_select_path = Interop.downcallHandle(
        "gtk_tree_selection_select_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Select the row at {@code path}.
     */
    public @NotNull void selectPath(@NotNull TreePath path) {
        try {
            gtk_tree_selection_select_path.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_select_range = Interop.downcallHandle(
        "gtk_tree_selection_select_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects a range of nodes, determined by {@code start_path} and {@code end_path} inclusive.
     * {@code selection} must be set to {@link SelectionMode#MULTIPLE} mode.
     */
    public @NotNull void selectRange(@NotNull TreePath startPath, @NotNull TreePath endPath) {
        try {
            gtk_tree_selection_select_range.invokeExact(handle(), startPath.handle(), endPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_selected_foreach = Interop.downcallHandle(
        "gtk_tree_selection_selected_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each selected node. Note that you cannot modify
     * the tree or selection from within this function. As a result,
     * gtk_tree_selection_get_selected_rows() might be more useful.
     */
    public @NotNull void selectedForeach(@NotNull TreeSelectionForeachFunc func) {
        try {
            gtk_tree_selection_selected_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeSelectionForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_set_mode = Interop.downcallHandle(
        "gtk_tree_selection_set_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the selection mode of the {@code selection}.  If the previous type was
     * {@link SelectionMode#MULTIPLE}, then the anchor is kept selected, if it was
     * previously selected.
     */
    public @NotNull void setMode(@NotNull SelectionMode type) {
        try {
            gtk_tree_selection_set_mode.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_set_select_function = Interop.downcallHandle(
        "gtk_tree_selection_set_select_function",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the selection function.
     * <p>
     * If set, this function is called before any node is selected or unselected,
     * giving some control over which nodes are selected. The select function
     * should return {@code true} if the state of the node may be toggled, and {@code false}
     * if the state of the node should be left unchanged.
     */
    public @NotNull void setSelectFunction(@Nullable TreeSelectionFunc func) {
        try {
            gtk_tree_selection_set_select_function.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeSelectionFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_unselect_all = Interop.downcallHandle(
        "gtk_tree_selection_unselect_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects all the nodes.
     */
    public @NotNull void unselectAll() {
        try {
            gtk_tree_selection_unselect_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_unselect_iter = Interop.downcallHandle(
        "gtk_tree_selection_unselect_iter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects the specified iterator.
     */
    public @NotNull void unselectIter(@NotNull TreeIter iter) {
        try {
            gtk_tree_selection_unselect_iter.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_unselect_path = Interop.downcallHandle(
        "gtk_tree_selection_unselect_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects the row at {@code path}.
     */
    public @NotNull void unselectPath(@NotNull TreePath path) {
        try {
            gtk_tree_selection_unselect_path.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_selection_unselect_range = Interop.downcallHandle(
        "gtk_tree_selection_unselect_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects a range of nodes, determined by {@code start_path} and {@code end_path}
     * inclusive.
     */
    public @NotNull void unselectRange(@NotNull TreePath startPath, @NotNull TreePath endPath) {
        try {
            gtk_tree_selection_unselect_range.invokeExact(handle(), startPath.handle(), endPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeSelection.Callbacks.class, "signalTreeSelectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalTreeSelectionChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeSelection.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeSelection(Refcounted.get(source)));
        }
        
    }
}
