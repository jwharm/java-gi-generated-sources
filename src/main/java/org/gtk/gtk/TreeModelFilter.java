package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkTreeModel} which hides parts of an underlying tree model
 * <p>
 * A {@code GtkTreeModelFilter} is a tree model which wraps another tree model,
 * and can do the following things:
 * <ul>
 * <li>Filter specific rows, based on data from a “visible column”, a column
 *   storing booleans indicating whether the row should be filtered or not,
 *   or based on the return value of a “visible function”, which gets a
 *   model, iter and user_data and returns a boolean indicating whether the
 *   row should be filtered or not.
 * </ul>
 * <ul>
 * <li>Modify the “appearance” of the model, using a modify function.
 *   This is extremely powerful and allows for just changing some
 *   values and also for creating a completely different model based
 *   on the given child model.
 * </ul>
 * <ul>
 * <li>Set a different root node, also known as a “virtual root”. You can pass
 *   in a {@code GtkTreePath} indicating the root node for the filter at construction
 *   time.
 * </ul>
 * <p>
 * The basic API is similar to {@code GtkTreeModelSort}. For an example on its usage,
 * see the section on {@code GtkTreeModelSort}.
 * <p>
 * When using {@code GtkTreeModelFilter}, it is important to realize that
 * {@code GtkTreeModelFilter} maintains an internal cache of all nodes which are
 * visible in its clients. The cache is likely to be a subtree of the tree
 * exposed by the child model. {@code GtkTreeModelFilter} will not cache the entire
 * child model when unnecessary to not compromise the caching mechanism
 * that is exposed by the reference counting scheme. If the child model
 * implements reference counting, unnecessary signals may not be emitted
 * because of reference counting rule 3, see the {@code GtkTreeModel}
 * documentation. (Note that e.g. {@code GtkTreeStore} does not implement
 * reference counting and will always emit all signals, even when
 * the receiving node is not visible).
 * <p>
 * Because of this, limitations for possible visible functions do apply.
 * In general, visible functions should only use data or properties from
 * the node for which the visibility state must be determined, its siblings
 * or its parents. Usually, having a dependency on the state of any child
 * node is not possible, unless references are taken on these explicitly.
 * When no such reference exists, no signals may be received for these child
 * nodes (see reference counting rule number 3 in the {@code GtkTreeModel} section).
 * <p>
 * Determining the visibility state of a given node based on the state
 * of its child nodes is a frequently occurring use case. Therefore,
 * {@code GtkTreeModelFilter} explicitly supports this. For example, when a node
 * does not have any children, you might not want the node to be visible.
 * As soon as the first row is added to the node’s child level (or the
 * last row removed), the node’s visibility should be updated.
 * <p>
 * This introduces a dependency from the node on its child nodes. In order
 * to accommodate this, {@code GtkTreeModelFilter} must make sure the necessary
 * signals are received from the child model. This is achieved by building,
 * for all nodes which are exposed as visible nodes to {@code GtkTreeModelFilter}'s
 * clients, the child level (if any) and take a reference on the first node
 * in this level. Furthermore, for every row-inserted, row-changed or
 * row-deleted signal (also these which were not handled because the node
 * was not cached), {@code GtkTreeModelFilter} will check if the visibility state
 * of any parent node has changed.
 * <p>
 * Beware, however, that this explicit support is limited to these two
 * cases. For example, if you want a node to be visible only if two nodes
 * in a child’s child level (2 levels deeper) are visible, you are on your
 * own. In this case, either rely on {@code GtkTreeStore} to emit all signals
 * because it does not implement reference counting, or for models that
 * do implement reference counting, obtain references on these child levels
 * yourself.
 */
public class TreeModelFilter extends org.gtk.gobject.GObject implements org.gtk.gtk.TreeDragSource, org.gtk.gtk.TreeModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeModelFilter";
    
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
     * Create a TreeModelFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeModelFilter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeModelFilter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeModelFilter(input);
    
    /**
     * This function should almost never be called. It clears the {@code filter}
     * of any cached iterators that haven’t been reffed with
     * gtk_tree_model_ref_node(). This might be useful if the child model
     * being filtered is static (and doesn’t change often) and there has been
     * a lot of unreffed access to nodes. As a side effect of this function,
     * all unreffed iters will be invalid.
     */
    public void clearCache() {
        try {
            DowncallHandles.gtk_tree_model_filter_clear_cache.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code filter_iter} to point to the row in {@code filter} that corresponds to the
     * row pointed at by {@code child_iter}.  If {@code filter_iter} was not set, {@code false} is
     * returned.
     * @param filterIter An uninitialized {@code GtkTreeIter}
     * @param childIter A valid {@code GtkTreeIter} pointing to a row on the child model.
     * @return {@code true}, if {@code filter_iter} was set, i.e. if {@code child_iter} is a
     * valid iterator pointing to a visible row in child model.
     */
    public boolean convertChildIterToIter(org.gtk.gtk.TreeIter filterIter, org.gtk.gtk.TreeIter childIter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_model_filter_convert_child_iter_to_iter.invokeExact(
                    handle(),
                    filterIter.handle(),
                    childIter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts {@code child_path} to a path relative to {@code filter}. That is, {@code child_path}
     * points to a path in the child model. The rerturned path will point to the
     * same row in the filtered model. If {@code child_path} isn’t a valid path on the
     * child model or points to a row which is not visible in {@code filter}, then {@code null}
     * is returned.
     * @param childPath A {@code GtkTreePath} to convert.
     * @return A newly allocated {@code GtkTreePath}
     */
    public @Nullable org.gtk.gtk.TreePath convertChildPathToPath(org.gtk.gtk.TreePath childPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_filter_convert_child_path_to_path.invokeExact(
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
     * Sets {@code child_iter} to point to the row pointed to by {@code filter_iter}.
     * @param childIter An uninitialized {@code GtkTreeIter}
     * @param filterIter A valid {@code GtkTreeIter} pointing to a row on {@code filter}.
     */
    public void convertIterToChildIter(org.gtk.gtk.TreeIter childIter, org.gtk.gtk.TreeIter filterIter) {
        try {
            DowncallHandles.gtk_tree_model_filter_convert_iter_to_child_iter.invokeExact(
                    handle(),
                    childIter.handle(),
                    filterIter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts {@code filter_path} to a path on the child model of {@code filter}. That is,
     * {@code filter_path} points to a location in {@code filter}. The returned path will
     * point to the same location in the model not being filtered. If {@code filter_path}
     * does not point to a location in the child model, {@code null} is returned.
     * @param filterPath A {@code GtkTreePath} to convert.
     * @return A newly allocated {@code GtkTreePath}
     */
    public @Nullable org.gtk.gtk.TreePath convertPathToChildPath(org.gtk.gtk.TreePath filterPath) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_filter_convert_path_to_child_path.invokeExact(
                    handle(),
                    filterPath.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gtk.TreePath.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns a pointer to the child model of {@code filter}.
     * @return A pointer to a {@code GtkTreeModel}
     */
    public org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_model_filter_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeModel) Interop.register(RESULT, org.gtk.gtk.TreeModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Emits ::row_changed for each row in the child model, which causes
     * the filter to re-evaluate whether a row is visible or not.
     */
    public void refilter() {
        try {
            DowncallHandles.gtk_tree_model_filter_refilter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * With the {@code n_columns} and {@code types} parameters, you give an array of column
     * types for this model (which will be exposed to the parent model/view).
     * The {@code func}, {@code data} and {@code destroy} parameters are for specifying the modify
     * function. The modify function will get called for each
     * data access, the goal of the modify function is to return the data which
     * should be displayed at the location specified using the parameters of the
     * modify function.
     * <p>
     * Note that gtk_tree_model_filter_set_modify_func()
     * can only be called once for a given filter model.
     * @param nColumns The number of columns in the filter model.
     * @param types The {@code GType}s of the columns.
     * @param func A {@code GtkTreeModelFilterModifyFunc}
     * @param destroy Destroy notifier of {@code data}
     */
    public void setModifyFunc(int nColumns, org.gtk.glib.Type[] types, org.gtk.gtk.TreeModelFilterModifyFunc func, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_tree_model_filter_set_modify_func.invokeExact(
                        handle(),
                        nColumns,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false, SCOPE),
                        (Addressable) func.toCallback(),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets {@code column} of the child_model to be the column where {@code filter} should
     * look for visibility information. {@code columns} should be a column of type
     * {@code G_TYPE_BOOLEAN}, where {@code true} means that a row is visible, and {@code false}
     * if not.
     * <p>
     * Note that gtk_tree_model_filter_set_visible_func() or
     * gtk_tree_model_filter_set_visible_column() can only be called
     * once for a given filter model.
     * @param column A {@code int} which is the column containing the visible information
     */
    public void setVisibleColumn(int column) {
        try {
            DowncallHandles.gtk_tree_model_filter_set_visible_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the visible function used when filtering the {@code filter} to be {@code func}.
     * The function should return {@code true} if the given row should be visible and
     * {@code false} otherwise.
     * <p>
     * If the condition calculated by the function changes over time (e.g.
     * because it depends on some global parameters), you must call
     * gtk_tree_model_filter_refilter() to keep the visibility information
     * of the model up-to-date.
     * <p>
     * Note that {@code func} is called whenever a row is inserted, when it may still
     * be empty. The visible function should therefore take special care of empty
     * rows, like in the example below.
     * <pre>{@code <!-- language="C" -->
     * static gboolean
     * visible_func (GtkTreeModel *model,
     *               GtkTreeIter  *iter,
     *               gpointer      data)
     * {
     *   // Visible if row is non-empty and first column is “HI”
     *   char *str;
     *   gboolean visible = FALSE;
     * 
     *   gtk_tree_model_get (model, iter, 0, &str, -1);
     *   if (str && strcmp (str, "HI") == 0)
     *     visible = TRUE;
     *   g_free (str);
     * 
     *   return visible;
     * }
     * }</pre>
     * <p>
     * Note that gtk_tree_model_filter_set_visible_func() or
     * gtk_tree_model_filter_set_visible_column() can only be called
     * once for a given filter model.
     * @param func A {@code GtkTreeModelFilterVisibleFunc}, the visible function
     * @param destroy Destroy notifier of {@code data}
     */
    public void setVisibleFunc(org.gtk.gtk.TreeModelFilterVisibleFunc func, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_tree_model_filter_set_visible_func.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
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
            RESULT = (long) DowncallHandles.gtk_tree_model_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TreeModelFilter.Builder} object constructs a {@link TreeModelFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeModelFilter.Builder#build()}. 
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
         * Finish building the {@link TreeModelFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeModelFilter}.
         * @return A new instance of {@code TreeModelFilter} with the properties 
         *         that were set in the Builder object.
         */
        public TreeModelFilter build() {
            return (TreeModelFilter) org.gtk.gobject.GObject.newWithProperties(
                TreeModelFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setChildModel(org.gtk.gtk.TreeModel childModel) {
            names.add("child-model");
            values.add(org.gtk.gobject.Value.create(childModel));
            return this;
        }
        
        public Builder setVirtualRoot(org.gtk.gtk.TreePath virtualRoot) {
            names.add("virtual-root");
            values.add(org.gtk.gobject.Value.create(virtualRoot));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_model_filter_clear_cache = Interop.downcallHandle(
                "gtk_tree_model_filter_clear_cache",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_convert_child_iter_to_iter = Interop.downcallHandle(
                "gtk_tree_model_filter_convert_child_iter_to_iter",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_convert_child_path_to_path = Interop.downcallHandle(
                "gtk_tree_model_filter_convert_child_path_to_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_convert_iter_to_child_iter = Interop.downcallHandle(
                "gtk_tree_model_filter_convert_iter_to_child_iter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_convert_path_to_child_path = Interop.downcallHandle(
                "gtk_tree_model_filter_convert_path_to_child_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_get_model = Interop.downcallHandle(
                "gtk_tree_model_filter_get_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_refilter = Interop.downcallHandle(
                "gtk_tree_model_filter_refilter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_set_modify_func = Interop.downcallHandle(
                "gtk_tree_model_filter_set_modify_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_set_visible_column = Interop.downcallHandle(
                "gtk_tree_model_filter_set_visible_column",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_set_visible_func = Interop.downcallHandle(
                "gtk_tree_model_filter_set_visible_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_model_filter_get_type = Interop.downcallHandle(
                "gtk_tree_model_filter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_tree_model_filter_get_type != null;
    }
}
