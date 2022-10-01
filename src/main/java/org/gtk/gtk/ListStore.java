package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A list-like data structure that can be used with the {@link TreeView}.
 * <p>
 * The {@code GtkListStore} object is a list model for use with a {@code GtkTreeView}
 * widget.  It implements the {@code GtkTreeModel} interface, and consequentialy,
 * can use all of the methods available there.  It also implements the
 * {@code GtkTreeSortable} interface so it can be sorted by the view.
 * Finally, it also implements the tree
 * <a href="iface.TreeDragDest.html">drag](iface.TreeDragSource.html) and [drop</a>
 * interfaces.
 * <p>
 * The {@code GtkListStore} can accept most {@code GType}s as a column type, though
 * it can’t accept all custom types.  Internally, it will keep a copy of
 * data passed in (such as a string or a boxed pointer).  Columns that
 * accept {@code GObject}s are handled a little differently.  The
 * {@code GtkListStore} will keep a reference to the object instead of copying the
 * value.  As a result, if the object is modified, it is up to the
 * application writer to call {@link TreeModel#rowChanged} to emit the
 * {@code Gtk.TreeModel::row_changed} signal. This most commonly affects lists
 * with {@link org.gtk.gdk.Texture}s stored.
 * <p>
 * An example for creating a simple list store:
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * <h1>Performance Considerations</h1>
 * <p>
 * Internally, the {@code GtkListStore} was originally implemented with a linked list
 * with a tail pointer.  As a result, it was fast at data insertion and deletion,
 * and not fast at random data access.  The {@code GtkListStore} sets the
 * {@code GTK_TREE_MODEL_ITERS_PERSIST} flag, which means that {@code GtkTreeIter}s can be
 * cached while the row exists.  Thus, if access to a particular row is needed
 * often and your code is expected to run on older versions of GTK, it is worth
 * keeping the iter around.
 * <p>
 * <h1>Atomic Operations</h1>
 * <p>
 * It is important to note that only the methods
 * gtk_list_store_insert_with_values() and gtk_list_store_insert_with_valuesv()
 * are atomic, in the sense that the row is being appended to the store and the
 * values filled in in a single operation with regard to {@code GtkTreeModel} signaling.
 * In contrast, using e.g. gtk_list_store_append() and then gtk_list_store_set()
 * will first create a row, which triggers the {@code GtkTreeModel::row-inserted} signal
 * on {@code GtkListStore}. The row, however, is still empty, and any signal handler
 * connecting to {@code GtkTreeModel::row-inserted} on this particular store should be prepared
 * for the situation that the row might be empty. This is especially important
 * if you are wrapping the {@code GtkListStore} inside a {@code GtkTreeModel}Filter and are
 * using a {@code GtkTreeModel}FilterVisibleFunc. Using any of the non-atomic operations
 * to append rows to the {@code GtkListStore} will cause the
 * {@code GtkTreeModel}FilterVisibleFunc to be visited with an empty row first; the
 * function must be prepared for that.
 * <p>
 * <h1>GtkListStore as GtkBuildable</h1>
 * <p>
 * The GtkListStore implementation of the {@code Gtk.Buildable} interface allows
 * to specify the model columns with a {@code <columns>} element that may contain
 * multiple {@code <column>} elements, each specifying one model column. The “type”
 * attribute specifies the data type for the column.
 * <p>
 * Additionally, it is possible to specify content for the list store
 * in the UI definition, with the {@code <data>} element. It can contain multiple
 * {@code <row>} elements, each specifying to content for one row of the list model.
 * Inside a {@code <row>}, the {@code <col>} elements specify the content for individual cells.
 * <p>
 * Note that it is probably more common to define your models in the code,
 * and one might consider it a layering violation to specify the content of
 * a list store in a UI definition, data, not presentation, and common wisdom
 * is to separate the two, as far as possible.
 * <p>
 * An example of a UI Definition fragment for a list store:
 * <p>
 * <pre>{@code xml
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
 * }</pre>
 */
public class ListStore extends org.gtk.gobject.Object implements Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable {

    public ListStore(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ListStore */
    public static ListStore castFrom(org.gtk.gobject.Object gobject) {
        return new ListStore(gobject.refcounted());
    }
    
    private static Refcounted constructNewv(int nColumns, org.gtk.gobject.Type[] types) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_list_store_newv(nColumns, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(types)).handle()), true);
        return RESULT;
    }
    
    /**
     * Non-vararg creation function.  Used primarily by language bindings.
     */
    public static ListStore newv(int nColumns, org.gtk.gobject.Type[] types) {
        return new ListStore(constructNewv(nColumns, types));
    }
    
    /**
     * Appends a new row to {@code list_store}.  {@code iter} will be changed to point to this new
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
     * Creates a new row at {@code position}.  {@code iter} will be changed to point to this new
     * row.  If {@code position} is -1 or is larger than the number of rows on the list,
     * then the new row will be appended to the list. The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insert(TreeIter iter, int position) {
        gtk_h.gtk_list_store_insert(handle(), iter.handle(), position);
    }
    
    /**
     * Inserts a new row after {@code sibling}. If {@code sibling} is {@code null}, then the row will be
     * prepended to the beginning of the list. {@code iter} will be changed to point to
     * this new row. The row will be empty after this function is called. To fill
     * in values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void insertAfter(TreeIter iter, TreeIter sibling) {
        gtk_h.gtk_list_store_insert_after(handle(), iter.handle(), sibling.handle());
    }
    
    /**
     * Inserts a new row before {@code sibling}. If {@code sibling} is {@code null}, then the row will
     * be appended to the end of the list. {@code iter} will be changed to point to this
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
     * <p>
     * This function is mainly intended for language-bindings.
     */
    public void insertWithValuesv(TreeIter iter, int position, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        gtk_h.gtk_list_store_insert_with_valuesv(handle(), iter.handle(), position, Interop.allocateNativeArray(columns).handle(), Interop.allocateNativeArray(values).handle(), nValues);
    }
    
    /**
     * Checks if the given iter is a valid iter for this {@code GtkListStore}.
     * <p>
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     */
    public boolean iterIsValid(TreeIter iter) {
        var RESULT = gtk_h.gtk_list_store_iter_is_valid(handle(), iter.handle());
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} in {@code store} to the position after {@code position}. Note that this
     * function only works with unsorted stores. If {@code position} is {@code null}, {@code iter}
     * will be moved to the start of the list.
     */
    public void moveAfter(TreeIter iter, TreeIter position) {
        gtk_h.gtk_list_store_move_after(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Moves {@code iter} in {@code store} to the position before {@code position}. Note that this
     * function only works with unsorted stores. If {@code position} is {@code null}, {@code iter}
     * will be moved to the end of the list.
     */
    public void moveBefore(TreeIter iter, TreeIter position) {
        gtk_h.gtk_list_store_move_before(handle(), iter.handle(), position.handle());
    }
    
    /**
     * Prepends a new row to {@code list_store}. {@code iter} will be changed to point to this new
     * row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     */
    public void prepend(TreeIter iter) {
        gtk_h.gtk_list_store_prepend(handle(), iter.handle());
    }
    
    /**
     * Removes the given row from the list store.  After being removed,
     * {@code iter} is set to be the next valid row, or invalidated if it pointed
     * to the last row in {@code list_store}.
     */
    public boolean remove(TreeIter iter) {
        var RESULT = gtk_h.gtk_list_store_remove(handle(), iter.handle());
        return RESULT != 0;
    }
    
    /**
     * Reorders {@code store} to follow the order indicated by {@code new_order}. Note that
     * this function only works with unsorted stores.
     */
    public void reorder(int[] newOrder) {
        gtk_h.gtk_list_store_reorder(handle(), Interop.allocateNativeArray(newOrder).handle());
    }
    
    /**
     * This function is meant primarily for {@code GObject}s that inherit from {@code GtkListStore},
     * and should only be used when constructing a new {@code GtkListStore}.  It will not
     * function after a row has been added, or a method on the {@code GtkTreeModel}
     * interface is called.
     */
    public void setColumnTypes(int nColumns, org.gtk.gobject.Type[] types) {
        gtk_h.gtk_list_store_set_column_types(handle(), nColumns, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(types)).handle());
    }
    
    /**
     * See gtk_list_store_set(); this version takes a va_list for use by language
     * bindings.
     */
    public void setValist(TreeIter iter, VaList varArgs) {
        gtk_h.gtk_list_store_set_valist(handle(), iter.handle(), varArgs);
    }
    
    /**
     * Sets the data in the cell specified by {@code iter} and {@code column}.
     * The type of {@code value} must be convertible to the type of the
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
        gtk_h.gtk_list_store_set_valuesv(handle(), iter.handle(), Interop.allocateNativeArray(columns).handle(), Interop.allocateNativeArray(values).handle(), nValues);
    }
    
    /**
     * Swaps @a and @b in {@code store}. Note that this function only works with
     * unsorted stores.
     */
    public void swap(TreeIter a, TreeIter b) {
        gtk_h.gtk_list_store_swap(handle(), a.handle(), b.handle());
    }
    
}
