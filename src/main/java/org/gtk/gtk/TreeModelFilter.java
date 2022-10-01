package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkTreeModel} which hides parts of an underlying tree model
 * <p>
 * A {@code GtkTreeModelFilter} is a tree model which wraps another tree model,
 * and can do the following things:
 * <p>
 * <ul>
 * <li>Filter specific rows, based on data from a “visible column”, a column
 *   storing booleans indicating whether the row should be filtered or not,
 *   or based on the return value of a “visible function”, which gets a
 *   model, iter and user_data and returns a boolean indicating whether the
 *   row should be filtered or not.
 * </ul>
 * <p>
 * <ul>
 * <li>Modify the “appearance” of the model, using a modify function.
 *   This is extremely powerful and allows for just changing some
 *   values and also for creating a completely different model based
 *   on the given child model.
 * </ul>
 * <p>
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
public class TreeModelFilter extends org.gtk.gobject.Object implements TreeDragSource, TreeModel {

    public TreeModelFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeModelFilter */
    public static TreeModelFilter castFrom(org.gtk.gobject.Object gobject) {
        return new TreeModelFilter(gobject.getReference());
    }
    
    /**
     * This function should almost never be called. It clears the {@code filter}
     * of any cached iterators that haven’t been reffed with
     * gtk_tree_model_ref_node(). This might be useful if the child model
     * being filtered is static (and doesn’t change often) and there has been
     * a lot of unreffed access to nodes. As a side effect of this function,
     * all unreffed iters will be invalid.
     */
    public void clearCache() {
        gtk_h.gtk_tree_model_filter_clear_cache(handle());
    }
    
    /**
     * Sets {@code filter_iter} to point to the row in {@code filter} that corresponds to the
     * row pointed at by {@code child_iter}.  If {@code filter_iter} was not set, {@code false} is
     * returned.
     */
    public boolean convertChildIterToIter(TreeIter filterIter, TreeIter childIter) {
        var RESULT = gtk_h.gtk_tree_model_filter_convert_child_iter_to_iter(handle(), filterIter.handle(), childIter.handle());
        return RESULT != 0;
    }
    
    /**
     * Converts {@code child_path} to a path relative to {@code filter}. That is, {@code child_path}
     * points to a path in the child model. The rerturned path will point to the
     * same row in the filtered model. If {@code child_path} isn’t a valid path on the
     * child model or points to a row which is not visible in {@code filter}, then {@code null}
     * is returned.
     */
    public TreePath convertChildPathToPath(TreePath childPath) {
        var RESULT = gtk_h.gtk_tree_model_filter_convert_child_path_to_path(handle(), childPath.handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Sets {@code child_iter} to point to the row pointed to by {@code filter_iter}.
     */
    public void convertIterToChildIter(TreeIter childIter, TreeIter filterIter) {
        gtk_h.gtk_tree_model_filter_convert_iter_to_child_iter(handle(), childIter.handle(), filterIter.handle());
    }
    
    /**
     * Converts {@code filter_path} to a path on the child model of {@code filter}. That is,
     * {@code filter_path} points to a location in {@code filter}. The returned path will
     * point to the same location in the model not being filtered. If {@code filter_path}
     * does not point to a location in the child model, {@code null} is returned.
     */
    public TreePath convertPathToChildPath(TreePath filterPath) {
        var RESULT = gtk_h.gtk_tree_model_filter_convert_path_to_child_path(handle(), filterPath.handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Returns a pointer to the child model of {@code filter}.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_tree_model_filter_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Emits ::row_changed for each row in the child model, which causes
     * the filter to re-evaluate whether a row is visible or not.
     */
    public void refilter() {
        gtk_h.gtk_tree_model_filter_refilter(handle());
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
     */
    public void setModifyFunc(int nColumns, org.gtk.gobject.Type[] types, TreeModelFilterModifyFunc func) {
        try {
            gtk_h.gtk_tree_model_filter_set_modify_func(handle(), nColumns, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(types)).handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeModelFilterModifyFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
     */
    public void setVisibleColumn(int column) {
        gtk_h.gtk_tree_model_filter_set_visible_column(handle(), column);
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
     * <p>
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
     */
    public void setVisibleFunc(TreeModelFilterVisibleFunc func) {
        try {
            gtk_h.gtk_tree_model_filter_set_visible_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeModelFilterVisibleFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
}
