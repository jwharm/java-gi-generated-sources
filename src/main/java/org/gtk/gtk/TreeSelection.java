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
public class TreeSelection extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeSelection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TreeSelection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeSelection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeSelection> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeSelection(input, ownership);
    
    /**
     * Returns the number of rows that have been selected in {@code tree}.
     * @return The number of rows selected.
     */
    public int countSelectedRows() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_count_selected_rows.invokeExact(
                    handle());
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
    public org.gtk.gtk.SelectionMode getMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_get_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SelectionMode.of(RESULT);
    }
    
    /**
     * Returns the current selection function.
     * @return The function.
     */
    public org.gtk.gtk.TreeSelectionFunc getSelectFunction() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_selection_get_select_function.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return null /* Unsupported parameter type */;
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
    public boolean getSelected(@Nullable Out<org.gtk.gtk.TreeModel> model, @Nullable org.gtk.gtk.TreeIter iter) {
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_get_selected.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : (Addressable) modelPOINTER.address()),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (model != null) model.set((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(modelPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gtk.TreeModel.fromAddress).marshal(modelPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public org.gtk.glib.List getSelectedRows(@Nullable Out<org.gtk.gtk.TreeModel> model) {
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_selection_get_selected_rows.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : (Addressable) modelPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (model != null) model.set((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(modelPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gtk.TreeModel.fromAddress).marshal(modelPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the tree view associated with {@code selection}.
     * @return A {@code GtkTreeView}
     */
    public org.gtk.gtk.TreeView getTreeView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_selection_get_tree_view.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeView.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the user data for the selection function.
     * @return The user data.
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_selection_get_user_data.invokeExact(
                    handle());
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
    public boolean iterIsSelected(org.gtk.gtk.TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_iter_is_selected.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if the row pointed to by {@code path} is currently selected.  If {@code path}
     * does not point to a valid location, {@code false} is returned
     * @param path A {@code GtkTreePath} to check selection on.
     * @return {@code true} if {@code path} is selected.
     */
    public boolean pathIsSelected(org.gtk.gtk.TreePath path) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_selection_path_is_selected.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Selects all the nodes. {@code selection} must be set to {@link SelectionMode#MULTIPLE}
     * mode.
     */
    public void selectAll() {
        try {
            DowncallHandles.gtk_tree_selection_select_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects the specified iterator.
     * @param iter The {@code GtkTreeIter} to be selected.
     */
    public void selectIter(org.gtk.gtk.TreeIter iter) {
        try {
            DowncallHandles.gtk_tree_selection_select_iter.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Select the row at {@code path}.
     * @param path The {@code GtkTreePath} to be selected.
     */
    public void selectPath(org.gtk.gtk.TreePath path) {
        try {
            DowncallHandles.gtk_tree_selection_select_path.invokeExact(
                    handle(),
                    path.handle());
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
    public void selectRange(org.gtk.gtk.TreePath startPath, org.gtk.gtk.TreePath endPath) {
        try {
            DowncallHandles.gtk_tree_selection_select_range.invokeExact(
                    handle(),
                    startPath.handle(),
                    endPath.handle());
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
    public void selectedForeach(org.gtk.gtk.TreeSelectionForeachFunc func) {
        try {
            DowncallHandles.gtk_tree_selection_selected_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
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
    public void setMode(org.gtk.gtk.SelectionMode type) {
        try {
            DowncallHandles.gtk_tree_selection_set_mode.invokeExact(
                    handle(),
                    type.getValue());
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
     * @param destroy The destroy function for user data.  May be {@code null}
     */
    public void setSelectFunction(@Nullable org.gtk.gtk.TreeSelectionFunc func, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_tree_selection_set_select_function.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects all the nodes.
     */
    public void unselectAll() {
        try {
            DowncallHandles.gtk_tree_selection_unselect_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects the specified iterator.
     * @param iter The {@code GtkTreeIter} to be unselected.
     */
    public void unselectIter(org.gtk.gtk.TreeIter iter) {
        try {
            DowncallHandles.gtk_tree_selection_unselect_iter.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects the row at {@code path}.
     * @param path The {@code GtkTreePath} to be unselected.
     */
    public void unselectPath(org.gtk.gtk.TreePath path) {
        try {
            DowncallHandles.gtk_tree_selection_unselect_path.invokeExact(
                    handle(),
                    path.handle());
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
    public void unselectRange(org.gtk.gtk.TreePath startPath, org.gtk.gtk.TreePath endPath) {
        try {
            DowncallHandles.gtk_tree_selection_unselect_range.invokeExact(
                    handle(),
                    startPath.handle(),
                    endPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_selection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeSelection) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Changed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever the selection has (possibly) changed. Please note that
     * this signal is mostly a hint.  It may only be emitted once when a range
     * of rows are selected, and it may occasionally be emitted when nothing
     * has happened.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeSelection.Changed> onChanged(TreeSelection.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TreeSelection.Builder} object constructs a {@link TreeSelection} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeSelection.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TreeSelection} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeSelection}.
         * @return A new instance of {@code TreeSelection} with the properties 
         *         that were set in the Builder object.
         */
        public TreeSelection build() {
            return (TreeSelection) org.gtk.gobject.GObject.newWithProperties(
                TreeSelection.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Selection mode.
         * See gtk_tree_selection_set_mode() for more information on this property.
         * @param mode The value for the {@code mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMode(org.gtk.gtk.SelectionMode mode) {
            names.add("mode");
            values.add(org.gtk.gobject.Value.create(mode));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_selection_count_selected_rows = Interop.downcallHandle(
            "gtk_tree_selection_count_selected_rows",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_get_mode = Interop.downcallHandle(
            "gtk_tree_selection_get_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_get_select_function = Interop.downcallHandle(
            "gtk_tree_selection_get_select_function",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_get_selected = Interop.downcallHandle(
            "gtk_tree_selection_get_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_get_selected_rows = Interop.downcallHandle(
            "gtk_tree_selection_get_selected_rows",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_get_tree_view = Interop.downcallHandle(
            "gtk_tree_selection_get_tree_view",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_get_user_data = Interop.downcallHandle(
            "gtk_tree_selection_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_iter_is_selected = Interop.downcallHandle(
            "gtk_tree_selection_iter_is_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_path_is_selected = Interop.downcallHandle(
            "gtk_tree_selection_path_is_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_select_all = Interop.downcallHandle(
            "gtk_tree_selection_select_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_select_iter = Interop.downcallHandle(
            "gtk_tree_selection_select_iter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_select_path = Interop.downcallHandle(
            "gtk_tree_selection_select_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_select_range = Interop.downcallHandle(
            "gtk_tree_selection_select_range",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_selected_foreach = Interop.downcallHandle(
            "gtk_tree_selection_selected_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_set_mode = Interop.downcallHandle(
            "gtk_tree_selection_set_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_set_select_function = Interop.downcallHandle(
            "gtk_tree_selection_set_select_function",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_all = Interop.downcallHandle(
            "gtk_tree_selection_unselect_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_iter = Interop.downcallHandle(
            "gtk_tree_selection_unselect_iter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_path = Interop.downcallHandle(
            "gtk_tree_selection_unselect_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_unselect_range = Interop.downcallHandle(
            "gtk_tree_selection_unselect_range",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_selection_get_type = Interop.downcallHandle(
            "gtk_tree_selection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
