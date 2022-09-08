package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A list-like data structure that can be used with the [class@Gtk.TreeView].
 * 
 * The `GtkListStore` object is a list model for use with a `GtkTreeView`
 * widget.  It implements the `GtkTreeModel` interface, and consequentialy,
 * can use all of the methods available there.  It also implements the
 * `GtkTreeSortable` interface so it can be sorted by the view.
 * Finally, it also implements the tree
 * [drag](iface.TreeDragSource.html) and [drop](iface.TreeDragDest.html)
 * interfaces.
 * 
 * The `GtkListStore` can accept most `GType`s as a column type, though
 * it can’t accept all custom types.  Internally, it will keep a copy of
 * data passed in (such as a string or a boxed pointer).  Columns that
 * accept `GObject`s are handled a little differently.  The
 * `GtkListStore` will keep a reference to the object instead of copying the
 * value.  As a result, if the object is modified, it is up to the
 * application writer to call [method@Gtk.TreeModel.row_changed] to emit the
 * [signal@Gtk.TreeModel::row_changed] signal. This most commonly affects lists
 * with [class@Gdk.Texture]s stored.
 * 
 * An example for creating a simple list store:
 * 
 * ```c
 * enum {
 *   COLUMN_STRING,
 *   COLUMN_INT,
 *   COLUMN_BOOLEAN,
 *   N_COLUMNS
 * };
 * 
 * {
 *   GtkListStore *list_store;
 *   GtkTreePath *path;
 *   GtkTreeIter iter;
 *   int i;
 * 
 *   list_store = gtk_list_store_new (N_COLUMNS,
 *                                    G_TYPE_STRING,
 *                                    G_TYPE_INT,
 *                                    G_TYPE_BOOLEAN);
 * 
 *   for (i = 0; i < 10; i++)
 *     {
 *       char *some_data;
 * 
 *       some_data = get_some_data (i);
 * 
 *       // Add a new row to the model
 *       gtk_list_store_append (list_store, &iter);
 *       gtk_list_store_set (list_store, &iter,
 *                           COLUMN_STRING, some_data,
 *                           COLUMN_INT, i,
 *                           COLUMN_BOOLEAN,  FALSE,
 *                           -1);
 * 
 *       // As the store will keep a copy of the string internally,
 *       // we free some_data.
 *       g_free (some_data);
 *     }
 * 
 *   // Modify a particular row
 *   path = gtk_tree_path_new_from_string ("4");
 *   gtk_tree_model_get_iter (GTK_TREE_MODEL (list_store),
 *                            &iter,
 *                            path);
 *   gtk_tree_path_free (path);
 *   gtk_list_store_set (list_store, &iter,
 *                       COLUMN_BOOLEAN, TRUE,
 *                       -1);
 * }
 * ```
 * 
 * # Performance Considerations
 * 
 * Internally, the `GtkListStore` was originally implemented with a linked list
 * with a tail pointer.  As a result, it was fast at data insertion and deletion,
 * and not fast at random data access.  The `GtkListStore` sets the
 * `GTK_TREE_MODEL_ITERS_PERSIST` flag, which means that `GtkTreeIter`s can be
 * cached while the row exists.  Thus, if access to a particular row is needed
 * often and your code is expected to run on older versions of GTK, it is worth
 * keeping the iter around.
 * 
 * # Atomic Operations
 * 
 * It is important to note that only the methods
 * gtk_list_store_insert_with_values() and gtk_list_store_insert_with_valuesv()
 * are atomic, in the sense that the row is being appended to the store and the
 * values filled in in a single operation with regard to `GtkTreeModel` signaling.
 * In contrast, using e.g. gtk_list_store_append() and then gtk_list_store_set()
 * will first create a row, which triggers the `GtkTreeModel::row-inserted` signal
 * on `GtkListStore`. The row, however, is still empty, and any signal handler
 * connecting to `GtkTreeModel::row-inserted` on this particular store should be prepared
 * for the situation that the row might be empty. This is especially important
 * if you are wrapping the `GtkListStore` inside a `GtkTreeModel`Filter and are
 * using a `GtkTreeModel`FilterVisibleFunc. Using any of the non-atomic operations
 * to append rows to the `GtkListStore` will cause the
 * `GtkTreeModel`FilterVisibleFunc to be visited with an empty row first; the
 * function must be prepared for that.
 * 
 * # GtkListStore as GtkBuildable
 * 
 * The GtkListStore implementation of the [iface@Gtk.Buildable] interface allows
 * to specify the model columns with a `<columns>` element that may contain
 * multiple `<column>` elements, each specifying one model column. The “type”
 * attribute specifies the data type for the column.
 * 
 * Additionally, it is possible to specify content for the list store
 * in the UI definition, with the `<data>` element. It can contain multiple
 * `<row>` elements, each specifying to content for one row of the list model.
 * Inside a `<row>`, the `<col>` elements specify the content for individual cells.
 * 
 * Note that it is probably more common to define your models in the code,
 * and one might consider it a layering violation to specify the content of
 * a list store in a UI definition, data, not presentation, and common wisdom
 * is to separate the two, as far as possible.
 * 
 * An example of a UI Definition fragment for a list store:
 * 
 * ```xml
 * <object class="GtkListStore">
 *   <columns>
 *     <column type="gchararray"/>
 *     <column type="gchararray"/>
 *     <column type="gint"/>
 *   </columns>
 *   <data>
 *     <row>
 *       <col id="0">John</col>
 *       <col id="1">Doe</col>
 *       <col id="2">25</col>
 *     </row>
 *     <row>
 *       <col id="0">Johan</col>
 *       <col id="1">Dahlin</col>
 *       <col id="2">50</col>
 *     </row>
 *   </data>
 * </object>
 * ```
 */
public class ListStore extends org.gtk.gobject.Object implements Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable {

    public ListStore(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListStore */
    public static ListStore castFrom(org.gtk.gobject.Object gobject) {
        return new ListStore(gobject.getReference());
    }
    
    /**
     * Non-vararg creation function.  Used primarily by language bindings.
     */
    public static ListStore newv(int nColumns, org.gtk.gobject.Type[] types) {
        return new ListStore(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_newv(nColumns, Interop.allocateNativeArray(types)), true));
    }
    
    /**
     * Appends a new row to @list_store.  @iter will be changed to point to this new
     * row.  The row will be empty after this function is called.  To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void append(TreeIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_append(HANDLE(), iter.HANDLE());
    }
    
    /**
     * Removes all rows from the list store.
     */
    public void clear() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_clear(HANDLE());
    }
    
    /**
     * Creates a new row at @position.  @iter will be changed to point to this new
     * row.  If @position is -1 or is larger than the number of rows on the list,
     * then the new row will be appended to the list. The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insert(TreeIter iter, int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_insert(HANDLE(), iter.HANDLE(), position);
    }
    
    /**
     * Inserts a new row after @sibling. If @sibling is %NULL, then the row will be
     * prepended to the beginning of the list. @iter will be changed to point to
     * this new row. The row will be empty after this function is called. To fill
     * in values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insertAfter(TreeIter iter, TreeIter sibling) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_insert_after(HANDLE(), iter.HANDLE(), sibling.HANDLE());
    }
    
    /**
     * Inserts a new row before @sibling. If @sibling is %NULL, then the row will
     * be appended to the end of the list. @iter will be changed to point to this
     * new row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insertBefore(TreeIter iter, TreeIter sibling) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_insert_before(HANDLE(), iter.HANDLE(), sibling.HANDLE());
    }
    
    /**
     * A variant of gtk_list_store_insert_with_values() which
     * takes the columns and values as two arrays, instead of
     * varargs.
     * 
     * This function is mainly intended for language-bindings.
     */
    public void insertWithValuesv(TreeIter iter, int position, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_insert_with_valuesv(HANDLE(), iter.HANDLE(), position, Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, columns), Interop.allocateNativeArray(values), nValues);
    }
    
    /**
     * Checks if the given iter is a valid iter for this `GtkListStore`.
     * 
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     */
    public boolean iterIsValid(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_iter_is_valid(HANDLE(), iter.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter in @store to the position after @position. Note that this
     * function only works with unsorted stores. If @position is %NULL, @iter
     * will be moved to the start of the list.
     */
    public void moveAfter(TreeIter iter, TreeIter position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_move_after(HANDLE(), iter.HANDLE(), position.HANDLE());
    }
    
    /**
     * Moves @iter in @store to the position before @position. Note that this
     * function only works with unsorted stores. If @position is %NULL, @iter
     * will be moved to the end of the list.
     */
    public void moveBefore(TreeIter iter, TreeIter position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_move_before(HANDLE(), iter.HANDLE(), position.HANDLE());
    }
    
    /**
     * Prepends a new row to @list_store. @iter will be changed to point to this new
     * row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void prepend(TreeIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_prepend(HANDLE(), iter.HANDLE());
    }
    
    /**
     * Removes the given row from the list store.  After being removed,
     * @iter is set to be the next valid row, or invalidated if it pointed
     * to the last row in @list_store.
     */
    public boolean remove(TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_remove(HANDLE(), iter.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Reorders @store to follow the order indicated by @new_order. Note that
     * this function only works with unsorted stores.
     */
    public void reorder(int[] newOrder) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_reorder(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, newOrder));
    }
    
    /**
     * This function is meant primarily for `GObject`s that inherit from `GtkListStore`,
     * and should only be used when constructing a new `GtkListStore`.  It will not
     * function after a row has been added, or a method on the `GtkTreeModel`
     * interface is called.
     */
    public void setColumnTypes(int nColumns, org.gtk.gobject.Type[] types) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_set_column_types(HANDLE(), nColumns, Interop.allocateNativeArray(types));
    }
    
    /**
     * See gtk_list_store_set(); this version takes a va_list for use by language
     * bindings.
     */
    public void setValist(TreeIter iter, VaList varArgs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_set_valist(HANDLE(), iter.HANDLE(), varArgs);
    }
    
    /**
     * Sets the data in the cell specified by @iter and @column.
     * The type of @value must be convertible to the type of the
     * column.
     */
    public void setValue(TreeIter iter, int column, org.gtk.gobject.Value value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_set_value(HANDLE(), iter.HANDLE(), column, value.HANDLE());
    }
    
    /**
     * A variant of gtk_list_store_set_valist() which
     * takes the columns and values as two arrays, instead of
     * varargs. This function is mainly intended for
     * language-bindings and in case the number of columns to
     * change is not known until run-time.
     */
    public void setValuesv(TreeIter iter, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_set_valuesv(HANDLE(), iter.HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, columns), Interop.allocateNativeArray(values), nValues);
    }
    
    /**
     * Swaps @a and @b in @store. Note that this function only works with
     * unsorted stores.
     */
    public void swap(TreeIter a, TreeIter b) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_store_swap(HANDLE(), a.HANDLE(), b.HANDLE());
    }
    
}
