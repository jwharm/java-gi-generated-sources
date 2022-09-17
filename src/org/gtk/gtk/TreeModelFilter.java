package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GtkTreeModel</code> which hides parts of an underlying tree model
 * <p>
 * A <code>GtkTreeModelFilter</code> is a tree model which wraps another tree model,
 * and can do the following things:
 * <p>
 * <li>Filter specific rows, based on data from a &#8220;visible column&#8221;, a column
 *   storing booleans indicating whether the row should be filtered or not,
 *   or based on the return value of a &#8220;visible function&#8221;, which gets a
 *   model, iter and user_data and returns a boolean indicating whether the
 *   row should be filtered or not.
 * <p>
 * <li>Modify the &#8220;appearance&#8221; of the model, using a modify function.
 *   This is extremely powerful and allows for just changing some
 *   values and also for creating a completely different model based
 *   on the given child model.
 * <p>
 * <li>Set a different root node, also known as a &#8220;virtual root&#8221;. You can pass
 *   in a <code>GtkTreePath</code> indicating the root node for the filter at construction
 *   time.
 * <p>
 * The basic API is similar to <code>GtkTreeModelSort</code>. For an example on its usage,
 * see the section on <code>GtkTreeModelSort</code>.
 * <p>
 * When using <code>GtkTreeModelFilter</code>, it is important to realize that<code>GtkTreeModelFilter</code> maintains an internal cache of all nodes which are
 * visible in its clients. The cache is likely to be a subtree of the tree
 * exposed by the child model. <code>GtkTreeModelFilter</code> will not cache the entire
 * child model when unnecessary to not compromise the caching mechanism
 * that is exposed by the reference counting scheme. If the child model
 * implements reference counting, unnecessary signals may not be emitted
 * because of reference counting rule 3, see the <code>GtkTreeModel</code>
 * documentation. (Note that e.g. <code>GtkTreeStore</code> does not implement
 * reference counting and will always emit all signals, even when
 * the receiving node is not visible).
 * <p>
 * Because of this, limitations for possible visible functions do apply.
 * In general, visible functions should only use data or properties from
 * the node for which the visibility state must be determined, its siblings
 * or its parents. Usually, having a dependency on the state of any child
 * node is not possible, unless references are taken on these explicitly.
 * When no such reference exists, no signals may be received for these child
 * nodes (see reference counting rule number 3 in the <code>GtkTreeModel</code> section).
 * <p>
 * Determining the visibility state of a given node based on the state
 * of its child nodes is a frequently occurring use case. Therefore,<code>GtkTreeModelFilter</code> explicitly supports this. For example, when a node
 * does not have any children, you might not want the node to be visible.
 * As soon as the first row is added to the node&#8217;s child level (or the
 * last row removed), the node&#8217;s visibility should be updated.
 * <p>
 * This introduces a dependency from the node on its child nodes. In order
 * to accommodate this, <code>GtkTreeModelFilter</code> must make sure the necessary
 * signals are received from the child model. This is achieved by building,
 * for all nodes which are exposed as visible nodes to <code>GtkTreeModelFilter</code>&#39;s
 * clients, the child level (if any) and take a reference on the first node
 * in this level. Furthermore, for every row-inserted, row-changed or
 * row-deleted signal (also these which were not handled because the node
 * was not cached), <code>GtkTreeModelFilter</code> will check if the visibility state
 * of any parent node has changed.
 * <p>
 * Beware, however, that this explicit support is limited to these two
 * cases. For example, if you want a node to be visible only if two nodes
 * in a child&#8217;s child level (2 levels deeper) are visible, you are on your
 * own. In this case, either rely on <code>GtkTreeStore</code> to emit all signals
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
     * This function should almost never be called. It clears the @filter
     * of any cached iterators that haven&#8217;t been reffed with
     * gtk_tree_model_ref_node(). This might be useful if the child model
     * being filtered is static (and doesn&#8217;t change often) and there has been
     * a lot of unreffed access to nodes. As a side effect of this function,
     * all unreffed iters will be invalid.
     */
    public void clearCache() {
        gtk_h.gtk_tree_model_filter_clear_cache(handle());
    }
    
    /**
     * Sets @filter_iter to point to the row in @filter that corresponds to the
     * row pointed at by @child_iter.  If @filter_iter was not set, <code>false</code> is
     * returned.
     */
    public boolean convertChildIterToIter(TreeIter filterIter, TreeIter childIter) {
        var RESULT = gtk_h.gtk_tree_model_filter_convert_child_iter_to_iter(handle(), filterIter.handle(), childIter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Converts @child_path to a path relative to @filter. That is, @child_path
     * points to a path in the child model. The rerturned path will point to the
     * same row in the filtered model. If @child_path isn&#8217;t a valid path on the
     * child model or points to a row which is not visible in @filter, then <code>NULL
     * is</code> returned.
     */
    public TreePath convertChildPathToPath(TreePath childPath) {
        var RESULT = gtk_h.gtk_tree_model_filter_convert_child_path_to_path(handle(), childPath.handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Sets @child_iter to point to the row pointed to by @filter_iter.
     */
    public void convertIterToChildIter(TreeIter childIter, TreeIter filterIter) {
        gtk_h.gtk_tree_model_filter_convert_iter_to_child_iter(handle(), childIter.handle(), filterIter.handle());
    }
    
    /**
     * Converts @filter_path to a path on the child model of @filter. That is,
     * @filter_path points to a location in @filter. The returned path will
     * point to the same location in the model not being filtered. If @filter_path
     * does not point to a location in the child model, <code>null</code> is returned.
     */
    public TreePath convertPathToChildPath(TreePath filterPath) {
        var RESULT = gtk_h.gtk_tree_model_filter_convert_path_to_child_path(handle(), filterPath.handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Returns a pointer to the child model of @filter.
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
     * With the @n_columns and @types parameters, you give an array of column
     * types for this model (which will be exposed to the parent model/view).
     * The @func, @data and @destroy parameters are for specifying the modify
     * function. The modify function will get called for each
     * data access, the goal of the modify function is to return the data which
     * should be displayed at the location specified using the parameters of the
     * modify function.
     * 
     * Note that gtk_tree_model_filter_set_modify_func()
     * can only be called once for a given filter model.
     */
    public void setModifyFunc(int nColumns, org.gtk.gobject.Type[] types, TreeModelFilterModifyFunc func) {
        try {
            gtk_h.gtk_tree_model_filter_set_modify_func(handle(), nColumns, Interop.allocateNativeArray(types).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeModelFilterModifyFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets @column of the child_model to be the column where @filter should
     * look for visibility information. @columns should be a column of type
     * <code>G_TYPE_BOOLEAN,</code> where <code>true</code> means that a row is visible, and <code>FALSE
     * if</code> not.
     * 
     * Note that gtk_tree_model_filter_set_visible_func() or
     * gtk_tree_model_filter_set_visible_column() can only be called
     * once for a given filter model.
     */
    public void setVisibleColumn(int column) {
        gtk_h.gtk_tree_model_filter_set_visible_column(handle(), column);
    }
    
    /**
     * Sets the visible function used when filtering the @filter to be @func.
     * The function should return <code>true</code> if the given row should be visible and
     * <code>false</code> otherwise.
     * 
     * If the condition calculated by the function changes over time (e.g.
     * because it depends on some global parameters), you must call
     * gtk_tree_model_filter_refilter() to keep the visibility information
     * of the model up-to-date.
     * 
     * Note that @func is called whenever a row is inserted, when it may still
     * be empty. The visible function should therefore take special care of empty
     * rows, like in the example below.
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * static gboolean
     * visible_func (GtkTreeModel *model,
     *               GtkTreeIter  *iter,
     *               gpointer      data)
     * {
     *   // Visible if row is non-empty and first column is &#8220;HI&#8221;
     *   char *str;
     *   gboolean visible = FALSE;
     * 
     *   gtk_tree_model_get (model, iter, 0, &#38;str, -1);
     *   if (str &#38;&#38; strcmp (str, &#34;HI&#34;) == 0)
     *     visible = TRUE;
     *   g_free (str);
     * 
     *   return visible;
     * }
     * ]}|
     * 
     * Note that gtk_tree_model_filter_set_visible_func() or
     * gtk_tree_model_filter_set_visible_column() can only be called
     * once for a given filter model.
     */
    public void setVisibleFunc(TreeModelFilterVisibleFunc func) {
        try {
            gtk_h.gtk_tree_model_filter_set_visible_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeModelFilterVisibleFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
