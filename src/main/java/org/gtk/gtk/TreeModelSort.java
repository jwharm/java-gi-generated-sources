package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GtkTreeModel which makes an underlying tree model sortable
 * <p>
 * The {@code GtkTreeModelSort} is a model which implements the {@code GtkTreeSortable}
 * interface.  It does not hold any data itself, but rather is created with
 * a child model and proxies its data.  It has identical column types to
 * this child model, and the changes in the child are propagated.  The
 * primary purpose of this model is to provide a way to sort a different
 * model without modifying it. Note that the sort function used by
 * {@code GtkTreeModelSort} is not guaranteed to be stable.
 * <p>
 * The use of this is best demonstrated through an example.  In the
 * following sample code we create two {@code GtkTreeView} widgets each with a
 * view of the same data.  As the model is wrapped here by a
 * {@code GtkTreeModelSort}, the two {@code GtkTreeView}s can each sort their
 * view of the data without affecting the other.  By contrast, if we
 * simply put the same model in each widget, then sorting the first would
 * sort the second.
 * <p>
 * <strong>Using a `GtkTreeModelSort`</strong><br/>
 * <pre>{@code <!-- language="C" -->
 * {
 *   GtkTreeView *tree_view1;
 *   GtkTreeView *tree_view2;
 *   GtkTreeModel *sort_model1;
 *   GtkTreeModel *sort_model2;
 *   GtkTreeModel *child_model;
 * 
 *   // get the child model
 *   child_model = get_my_model ();
 * 
 *   // Create the first tree
 *   sort_model1 = gtk_tree_model_sort_new_with_model (child_model);
 *   tree_view1 = gtk_tree_view_new_with_model (sort_model1);
 * 
 *   // Create the second tree
 *   sort_model2 = gtk_tree_model_sort_new_with_model (child_model);
 *   tree_view2 = gtk_tree_view_new_with_model (sort_model2);
 * 
 *   // Now we can sort the two models independently
 *   gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model1),
 *                                         COLUMN_1, GTK_SORT_ASCENDING);
 *   gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model2),
 *                                         COLUMN_1, GTK_SORT_DESCENDING);
 * }
 * }</pre>
 * <p>
 * To demonstrate how to access the underlying child model from the sort
 * model, the next example will be a callback for the {@code GtkTreeSelection}
 * {@code GtkTreeSelection::changed} signal.  In this callback, we get a string
 * from COLUMN_1 of the model.  We then modify the string, find the same
 * selected row on the child model, and change the row there.
 * <p>
 * <strong>Accessing the child model of in a selection changed callback</strong><br/>
 * <pre>{@code <!-- language="C" -->
 * void
 * selection_changed (GtkTreeSelection *selection, gpointer data)
 * {
 *   GtkTreeModel *sort_model = NULL;
 *   GtkTreeModel *child_model;
 *   GtkTreeIter sort_iter;
 *   GtkTreeIter child_iter;
 *   char *some_data = NULL;
 *   char *modified_data;
 * 
 *   // Get the current selected row and the model.
 *   if (! gtk_tree_selection_get_selected (selection,
 *                                          &sort_model,
 *                                          &sort_iter))
 *     return;
 * 
 *   // Look up the current value on the selected row and get
 *   // a new value to change it to.
 *   gtk_tree_model_get (GTK_TREE_MODEL (sort_model), &sort_iter,
 *                       COLUMN_1, &some_data,
 *                       -1);
 * 
 *   modified_data = change_the_data (some_data);
 *   g_free (some_data);
 * 
 *   // Get an iterator on the child model, instead of the sort model.
 *   gtk_tree_model_sort_convert_iter_to_child_iter (GTK_TREE_MODEL_SORT (sort_model),
 *                                                   &child_iter,
 *                                                   &sort_iter);
 * 
 *   // Get the child model and change the value of the row. In this
 *   // example, the child model is a GtkListStore. It could be any other
 *   // type of model, though.
 *   child_model = gtk_tree_model_sort_get_model (GTK_TREE_MODEL_SORT (sort_model));
 *   gtk_list_store_set (GTK_LIST_STORE (child_model), &child_iter,
 *                       COLUMN_1, &modified_data,
 *                       -1);
 *   g_free (modified_data);
 * }
 * }</pre>
 */
public class TreeModelSort extends org.gtk.gobject.GObject implements org.gtk.gtk.TreeDragSource, org.gtk.gtk.TreeModel, org.gtk.gtk.TreeSortable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeModelSort";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TreeModelSort proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeModelSort(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeModelSort> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeModelSort(input);
    
    private static MemoryAddress constructNewWithModel(org.gtk.gtk.TreeModel childModel) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_sort_new_with_model.invokeExact(childModel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkTreeModelSort}, with {@code child_model} as the child model.
     * @param childModel A {@code GtkTreeModel}
     * @return A new {@code GtkTreeModelSort}.
     */
    public static TreeModelSort newWithModel(org.gtk.gtk.TreeModel childModel) {
        var RESULT = constructNewWithModel(childModel);
        var OBJECT = (org.gtk.gtk.TreeModelSort) Interop.register(RESULT, org.gtk.gtk.TreeModelSort.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * This function should almost never be called.  It clears the {@code tree_model_sort}
     * of any cached iterators that haven’t been reffed with
     * gtk_tree_model_ref_node().  This might be useful if the child model being
     * sorted is static (and doesn’t change often) and there has been a lot of
     * unreffed access to nodes.  As a side effect of this function, all unreffed
     * iters will be invalid.
     */
    public void clearCache() {
        try {
            DowncallHandles.gtk_tree_model_sort_clear_cache.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code sort_iter} to point to the row in {@code tree_model_sort} that corresponds to
     * the row pointed at by {@code child_iter}.  If {@code sort_iter} was not set, {@code false}
     * is returned.  Note: a boolean is only returned since 2.14.
     * @param sortIter An uninitialized {@code GtkTreeIter}
     * @param childIter A valid {@code GtkTreeIter} pointing to a row on the child model
     * @return {@code true}, if {@code sort_iter} was set, i.e. if {@code sort_iter} is a
     * valid iterator pointer to a visible row in the child model.
     */
    public boolean convertChildIterToIter(org.gtk.gtk.TreeIter sortIter, org.gtk.gtk.TreeIter childIter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_sort_convert_child_iter_to_iter.invokeExact(
                    handle(),
                    sortIter.handle(),
                    childIter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts {@code child_path} to a path relative to {@code tree_model_sort}.  That is,
     * {@code child_path} points to a path in the child model.  The returned path will
     * point to the same row in the sorted model.  If {@code child_path} isn’t a valid
     * path on the child model, then {@code null} is returned.
     * @param childPath A {@code GtkTreePath} to convert
     * @return A newly allocated {@code GtkTreePath}
     */
    public @Nullable org.gtk.gtk.TreePath convertChildPathToPath(org.gtk.gtk.TreePath childPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_sort_convert_child_path_to_path.invokeExact(
                    handle(),
                    childPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Sets {@code child_iter} to point to the row pointed to by {@code sorted_iter}.
     * @param childIter An uninitialized {@code GtkTreeIter}
     * @param sortedIter A valid {@code GtkTreeIter} pointing to a row on {@code tree_model_sort}.
     */
    public void convertIterToChildIter(org.gtk.gtk.TreeIter childIter, org.gtk.gtk.TreeIter sortedIter) {
        try {
            DowncallHandles.gtk_tree_model_sort_convert_iter_to_child_iter.invokeExact(
                    handle(),
                    childIter.handle(),
                    sortedIter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts {@code sorted_path} to a path on the child model of {@code tree_model_sort}.
     * That is, {@code sorted_path} points to a location in {@code tree_model_sort}.  The
     * returned path will point to the same location in the model not being
     * sorted.  If {@code sorted_path} does not point to a location in the child model,
     * {@code null} is returned.
     * @param sortedPath A {@code GtkTreePath} to convert
     * @return A newly allocated {@code GtkTreePath}
     */
    public @Nullable org.gtk.gtk.TreePath convertPathToChildPath(org.gtk.gtk.TreePath sortedPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_sort_convert_path_to_child_path.invokeExact(
                    handle(),
                    sortedPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the model the {@code GtkTreeModelSort} is sorting.
     * @return the "child model" being sorted
     */
    public org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_sort_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeModel) Interop.register(RESULT, org.gtk.gtk.TreeModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * &gt; This function is slow. Only use it for debugging and/or testing
     * <blockquote>
     *  purposes.
     * </blockquote><p>
     * Checks if the given iter is a valid iter for this {@code GtkTreeModelSort}.
     * @param iter A {@code GtkTreeIter}
     * @return {@code true} if the iter is valid, {@code false} if the iter is invalid.
     */
    public boolean iterIsValid(org.gtk.gtk.TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_sort_iter_is_valid.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This resets the default sort function to be in the “unsorted” state.  That
     * is, it is in the same order as the child model. It will re-sort the model
     * to be in the same order as the child model only if the {@code GtkTreeModelSort}
     * is in “unsorted” state.
     */
    public void resetDefaultSortFunc() {
        try {
            DowncallHandles.gtk_tree_model_sort_reset_default_sort_func.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gtk_tree_model_sort_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TreeModelSort.Builder} object constructs a {@link TreeModelSort} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeModelSort.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TreeModelSort} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeModelSort}.
         * @return A new instance of {@code TreeModelSort} with the properties 
         *         that were set in the Builder object.
         */
        public TreeModelSort build() {
            return (TreeModelSort) org.gtk.gobject.GObject.newWithProperties(
                TreeModelSort.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setModel(org.gtk.gtk.TreeModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_model_sort_new_with_model = Interop.downcallHandle(
                "gtk_tree_model_sort_new_with_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_clear_cache = Interop.downcallHandle(
                "gtk_tree_model_sort_clear_cache",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_convert_child_iter_to_iter = Interop.downcallHandle(
                "gtk_tree_model_sort_convert_child_iter_to_iter",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_convert_child_path_to_path = Interop.downcallHandle(
                "gtk_tree_model_sort_convert_child_path_to_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_convert_iter_to_child_iter = Interop.downcallHandle(
                "gtk_tree_model_sort_convert_iter_to_child_iter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_convert_path_to_child_path = Interop.downcallHandle(
                "gtk_tree_model_sort_convert_path_to_child_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_get_model = Interop.downcallHandle(
                "gtk_tree_model_sort_get_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_iter_is_valid = Interop.downcallHandle(
                "gtk_tree_model_sort_iter_is_valid",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_reset_default_sort_func = Interop.downcallHandle(
                "gtk_tree_model_sort_reset_default_sort_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_sort_get_type = Interop.downcallHandle(
                "gtk_tree_model_sort_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_tree_model_sort_get_type != null;
    }
}
