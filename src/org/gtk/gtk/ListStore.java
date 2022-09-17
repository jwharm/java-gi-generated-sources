package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A list-like data structure that can be used with the {@link org.gtk.gtk.TreeView}.
 * <p>
 * The <code>GtkListStore</code> object is a list model for use with a <code>GtkTreeView</code>
 * widget.  It implements the <code>GtkTreeModel</code> interface, and consequentialy,
 * can use all of the methods available there.  It also implements the<code>GtkTreeSortable</code> interface so it can be sorted by the view.
 * Finally, it also implements the tree
 * {@link [drag]}(iface.TreeDragSource.html) and {@link [drop]}(iface.TreeDragDest.html)
 * interfaces.
 * <p>
 * The <code>GtkListStore</code> can accept most <code>GType</code>s as a column type, though
 * it can&#8217;t accept all custom types.  Internally, it will keep a copy of
 * data passed in (such as a string or a boxed pointer).  Columns that
 * accept <code>GObject</code>s are handled a little differently.  The<code>GtkListStore</code> will keep a reference to the object instead of copying the
 * value.  As a result, if the object is modified, it is up to the
 * application writer to call {@link org.gtk.gtk.TreeModel#rowChanged} to emit the
 * {@link [signal@Gtk.TreeModel::row_changed] (ref=signal)} signal. This most commonly affects lists
 * with {@link org.gtk.gdk.Texture}s stored.
 * <p>
 * An example for creating a simple list store:
 * <p><pre>c
 * enum {
 *   COLUMN_STRING,
 *   COLUMN_INT,
 *   COLUMN_BOOLEAN,
 *   N_COLUMNS
 * };
 * <p>
 * {
 *   GtkListStore *list_store;
 *   GtkTreePath *path;
 *   GtkTreeIter iter;
 *   int i;
 * <p>
 *   list_store = gtk_list_store_new (N_COLUMNS,
 *                                    G_TYPE_STRING,
 *                                    G_TYPE_INT,
 *                                    G_TYPE_BOOLEAN);
 * <p>
 *   for (i = 0; i &#60; 10; i++)
 *     {
 *       char *some_data;
 * <p>
 *       some_data = get_some_data (i);
 * <p>
 *       // Add a new row to the model
 *       gtk_list_store_append (list_store, &#38;iter);
 *       gtk_list_store_set (list_store, &#38;iter,
 *                           COLUMN_STRING, some_data,
 *                           COLUMN_INT, i,
 *                           COLUMN_BOOLEAN,  FALSE,
 *                           -1);
 * <p>
 *       // As the store will keep a copy of the string internally,
 *       // we free some_data.
 *       g_free (some_data);
 *     }
 * <p>
 *   // Modify a particular row
 *   path = gtk_tree_path_new_from_string (&#34;4&#34;);
 *   gtk_tree_model_get_iter (GTK_TREE_MODEL (list_store),
 *                            &#38;iter,
 *                            path);
 *   gtk_tree_path_free (path);
 *   gtk_list_store_set (list_store, &#38;iter,
 *                       COLUMN_BOOLEAN, TRUE,
 *                       -1);
 * }
 * </pre>
 * <p>
 * <h1>erformance Considerations</h1>
 * <p>
 * Internally, the <code>GtkListStore</code> was originally implemented with a linked list
 * with a tail pointer.  As a result, it was fast at data insertion and deletion,
 * and not fast at random data access.  The <code>GtkListStore</code> sets the<code>GTK_TREE_MODEL_ITERS_PERSIST</code> flag, which means that <code>GtkTreeIter</code>s can be
 * cached while the row exists.  Thus, if access to a particular row is needed
 * often and your code is expected to run on older versions of GTK, it is worth
 * keeping the iter around.
 * <p>
 * <h1>tomic Operations</h1>
 * <p>
 * It is important to note that only the methods
 * gtk_list_store_insert_with_values() and gtk_list_store_insert_with_valuesv()
 * are atomic, in the sense that the row is being appended to the store and the
 * values filled in in a single operation with regard to <code>GtkTreeModel</code> signaling.
 * In contrast, using e.g. gtk_list_store_append() and then gtk_list_store_set()
 * will first create a row, which triggers the <code>GtkTreeModel::row-inserted</code> signal
 * on <code>GtkListStore</code>. The row, however, is still empty, and any signal handler
 * connecting to <code>GtkTreeModel::row-inserted</code> on this particular store should be prepared
 * for the situation that the row might be empty. This is especially important
 * if you are wrapping the <code>GtkListStore</code> inside a <code>GtkTreeModel</code>Filter and are
 * using a <code>GtkTreeModel</code>FilterVisibleFunc. Using any of the non-atomic operations
 * to append rows to the <code>GtkListStore</code> will cause the<code>GtkTreeModel</code>FilterVisibleFunc to be visited with an empty row first; the
 * function must be prepared for that.
 * <p>
 * <h1>tkListStore as GtkBuildable</h1>
 * <p>
 * The GtkListStore implementation of the {@link [iface@Gtk.Buildable] (ref=iface)} interface allows
 * to specify the model columns with a <code>&#60;columns&#62;</code> element that may contain
 * multiple <code>&#60;column&#62;</code> elements, each specifying one model column. The &#8220;type&#8221;
 * attribute specifies the data type for the column.
 * <p>
 * Additionally, it is possible to specify content for the list store
 * in the UI definition, with the <code>&#60;data&#62;</code> element. It can contain multiple<code>&#60;row&#62;</code> elements, each specifying to content for one row of the list model.
 * Inside a <code>&#60;row&#62;</code>, the <code>&#60;col&#62;</code> elements specify the content for individual cells.
 * <p>
 * Note that it is probably more common to define your models in the code,
 * and one might consider it a layering violation to specify the content of
 * a list store in a UI definition, data, not presentation, and common wisdom
 * is to separate the two, as far as possible.
 * <p>
 * An example of a UI Definition fragment for a list store:
 * <p><pre>xml
 * &#60;object class=&#34;GtkListStore&#34;&#62;
 *   &#60;columns&#62;
 *     &#60;column type=&#34;gchararray&#34;/&#62;
 *     &#60;column type=&#34;gchararray&#34;/&#62;
 *     &#60;column type=&#34;gint&#34;/&#62;
 *   &#60;/columns&#62;
 *   &#60;data&#62;
 *     &#60;row&#62;
 *       &#60;col id=&#34;0&#34;&#62;John&#60;/col&#62;
 *       &#60;col id=&#34;1&#34;&#62;Doe&#60;/col&#62;
 *       &#60;col id=&#34;2&#34;&#62;25&#60;/col&#62;
 *     &#60;/row&#62;
 *     &#60;row&#62;
 *       &#60;col id=&#34;0&#34;&#62;Johan&#60;/col&#62;
 *       &#60;col id=&#34;1&#34;&#62;Dahlin&#60;/col&#62;
 *       &#60;col id=&#34;2&#34;&#62;50&#60;/col&#62;
 *     &#60;/row&#62;
 *   &#60;/data&#62;
 * &#60;/object&#62;
 * </pre>
 */
public class ListStore extends org.gtk.gobject.Object implements Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable {

    public ListStore(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListStore */
    public static ListStore castFrom(org.gtk.gobject.Object gobject) {
        return new ListStore(gobject.getReference());
    }
    
    private static Reference constructNewv(int nColumns, org.gtk.gobject.Type[] types) {
        Reference RESULT = References.get(gtk_h.gtk_list_store_newv(nColumns, Interop.allocateNativeArray(types).handle()), true);
        return RESULT;
    }
    
    /**
     * Non-vararg creation function.  Used primarily by language bindings.
     */
    public static ListStore newv(int nColumns, org.gtk.gobject.Type[] types) {
        return new ListStore(constructNewv(nColumns, types));
    }
    
    /**
     * Appends a new row to @list_store.  @iter will be changed to point to this new
     * row.  The row will be empty after this function is called.  To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void append(TreeIter iter) {
        gtk_h.gtk_list_store_append(handle(), iter.handle());
    }
    
    /**
     * Removes all rows from the list store.
     */
    public void clear() {
        gtk_h.gtk_list_store_clear(handle());
    }
    
    /**
     * Creates a new row at @position.  @iter will be changed to point to this new
     * row.  If @position is -1 or is larger than the number of rows on the list,
     * then the new row will be appended to the list. The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insert(TreeIter iter, int position) {
        gtk_h.gtk_list_store_insert(handle(), iter.handle(), position);
    }
    
    /**
     * Inserts a new row after @sibling. If @sibling is <code>NULL,</code> then the row will be
     * prepended to the beginning of the list. @iter will be changed to point to
     * this new row. The row will be empty after this function is called. To fill
     * in values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insertAfter(TreeIter iter, TreeIter sibling) {
        gtk_h.gtk_list_store_insert_after(handle(), iter.handle(), sibling.handle());
    }
    
    /**
     * Inserts a new row before @sibling. If @sibling is <code>NULL,</code> then the row will
     * be appended to the end of the list. @iter will be changed to point to this
     * new row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insertBefore(TreeIter iter, TreeIter sibling) {
        gtk_h.gtk_list_store_insert_before(handle(), iter.handle(), sibling.handle());
    }
    
    /**
     * A variant of gtk_list_store_insert_with_values() which
     * takes the columns and values as two arrays, instead of
     * varargs.
     * 
     * This function is mainly intended for language-bindings.
     */
    public void insertWithValuesv(TreeIter iter, int position, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        gtk_h.gtk_list_store_insert_with_valuesv(handle(), iter.handle(), position, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, columns)).handle(), Interop.allocateNativeArray(values).handle(), nValues);
    }
    
    /**
     * Checks if the given iter is a valid iter for this <code>GtkListStore</code>.
     * 
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     */
    public boolean iterIsValid(TreeIter iter) {
        var RESULT = gtk_h.gtk_list_store_iter_is_valid(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter in @store to the position after @position. Note that this
     * function only works with unsorted stores. If @position is <code>NULL,</code> @iter
     * will be moved to the start of the list.
     */
    public void moveAfter(TreeIter iter, TreeIter position) {
        gtk_h.gtk_list_store_move_after(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Moves @iter in @store to the position before @position. Note that this
     * function only works with unsorted stores. If @position is <code>NULL,</code> @iter
     * will be moved to the end of the list.
     */
    public void moveBefore(TreeIter iter, TreeIter position) {
        gtk_h.gtk_list_store_move_before(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Prepends a new row to @list_store. @iter will be changed to point to this new
     * row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void prepend(TreeIter iter) {
        gtk_h.gtk_list_store_prepend(handle(), iter.handle());
    }
    
    /**
     * Removes the given row from the list store.  After being removed,
     * @iter is set to be the next valid row, or invalidated if it pointed
     * to the last row in @list_store.
     */
    public boolean remove(TreeIter iter) {
        var RESULT = gtk_h.gtk_list_store_remove(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Reorders @store to follow the order indicated by @new_order. Note that
     * this function only works with unsorted stores.
     */
    public void reorder(int[] newOrder) {
        gtk_h.gtk_list_store_reorder(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, newOrder)).handle());
    }
    
    /**
     * This function is meant primarily for <code>GObject</code>s that inherit from <code>GtkListStore</code>,
     * and should only be used when constructing a new <code>GtkListStore</code>.  It will not
     * function after a row has been added, or a method on the <code>GtkTreeModel</code>
     * interface is called.
     */
    public void setColumnTypes(int nColumns, org.gtk.gobject.Type[] types) {
        gtk_h.gtk_list_store_set_column_types(handle(), nColumns, Interop.allocateNativeArray(types).handle());
    }
    
    /**
     * See gtk_list_store_set(); this version takes a va_list for use by language
     * bindings.
     */
    public void setValist(TreeIter iter, VaList varArgs) {
        gtk_h.gtk_list_store_set_valist(handle(), iter.handle(), varArgs);
    }
    
    /**
     * Sets the data in the cell specified by @iter and @column.
     * The type of @value must be convertible to the type of the
     * column.
     */
    public void setValue(TreeIter iter, int column, org.gtk.gobject.Value value) {
        gtk_h.gtk_list_store_set_value(handle(), iter.handle(), column, value.handle());
    }
    
    /**
     * A variant of gtk_list_store_set_valist() which
     * takes the columns and values as two arrays, instead of
     * varargs. This function is mainly intended for
     * language-bindings and in case the number of columns to
     * change is not known until run-time.
     */
    public void setValuesv(TreeIter iter, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        gtk_h.gtk_list_store_set_valuesv(handle(), iter.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, columns)).handle(), Interop.allocateNativeArray(values).handle(), nValues);
    }
    
    /**
     * Swaps @a and @b in @store. Note that this function only works with
     * unsorted stores.
     */
    public void swap(TreeIter a, TreeIter b) {
        gtk_h.gtk_list_store_swap(handle(), a.handle(), b.handle());
    }
    
}
