package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A list-like data structure that can be used with the {@link TreeView}.
 * <p>
 * The {@code GtkListStore} object is a list model for use with a {@code GtkTreeView}
 * widget.  It implements the {@code GtkTreeModel} interface, and consequentialy,
 * can use all of the methods available there.  It also implements the
 * {@code GtkTreeSortable} interface so it can be sorted by the view.
 * Finally, it also implements the tree
 * <a href="iface.TreeDragSource.html">drag</a> and <a href="iface.TreeDragDest.html">drop</a>
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
 * <strong>Performance Considerations</strong><br/>
 * Internally, the {@code GtkListStore} was originally implemented with a linked list
 * with a tail pointer.  As a result, it was fast at data insertion and deletion,
 * and not fast at random data access.  The {@code GtkListStore} sets the
 * {@code GTK_TREE_MODEL_ITERS_PERSIST} flag, which means that {@code GtkTreeIter}s can be
 * cached while the row exists.  Thus, if access to a particular row is needed
 * often and your code is expected to run on older versions of GTK, it is worth
 * keeping the iter around.
 * <p>
 * <strong>Atomic Operations</strong><br/>
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
 * <strong>GtkListStore as GtkBuildable</strong><br/>
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
public class ListStore extends org.gtk.gobject.Object implements org.gtk.gtk.Buildable, org.gtk.gtk.TreeDragDest, org.gtk.gtk.TreeDragSource, org.gtk.gtk.TreeModel, org.gtk.gtk.TreeSortable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkListStore";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.Object parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ListStore proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ListStore(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ListStore if its GType is a (or inherits from) "GtkListStore".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ListStore} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkListStore", a ClassCastException will be thrown.
     */
    public static ListStore castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkListStore"))) {
            return new ListStore(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkListStore");
        }
    }
    
    private static Addressable constructNew(int nColumns, java.lang.Object... varargs) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_store_new.invokeExact(
                    nColumns,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new list store as with {@code n_columns} columns each of the types passed
     * in.  Note that only types derived from standard GObject fundamental types
     * are supported.
     * <p>
     * As an example, {@code gtk_list_store_new (3, G_TYPE_INT, G_TYPE_STRING,
     * GDK_TYPE_TEXTURE);} will create a new {@code GtkListStore} with three columns, of type
     * int, string and {@code GdkTexture}, respectively.
     * @param nColumns number of columns in the list store
     * @param varargs all {@code GType} types for the columns, from first to last
     */
    public ListStore(int nColumns, java.lang.Object... varargs) {
        super(constructNew(nColumns, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewv(int nColumns, @NotNull org.gtk.glib.Type[] types) {
        java.util.Objects.requireNonNull(types, "Parameter 'types' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_store_newv.invokeExact(
                    nColumns,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Non-vararg creation function.  Used primarily by language bindings.
     * @param nColumns number of columns in the list store
     * @param types an array of {@code GType} types for the columns, from first to last
     * @return a new {@code GtkListStore}
     */
    public static ListStore newv(int nColumns, @NotNull org.gtk.glib.Type[] types) {
        return new ListStore(constructNewv(nColumns, types), Ownership.FULL);
    }
    
    /**
     * Appends a new row to {@code list_store}.  {@code iter} will be changed to point to this new
     * row.  The row will be empty after this function is called.  To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the appended row
     */
    public void append(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_append.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all rows from the list store.
     */
    public void clear() {
        try {
            DowncallHandles.gtk_list_store_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new row at {@code position}.  {@code iter} will be changed to point to this new
     * row.  If {@code position} is -1 or is larger than the number of rows on the list,
     * then the new row will be appended to the list. The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param position position to insert the new row, or -1 for last
     */
    public void insert(@NotNull org.gtk.gtk.TreeIter iter, int position) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_insert.invokeExact(
                    handle(),
                    iter.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a new row after {@code sibling}. If {@code sibling} is {@code null}, then the row will be
     * prepended to the beginning of the list. {@code iter} will be changed to point to
     * this new row. The row will be empty after this function is called. To fill
     * in values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param sibling A valid {@code GtkTreeIter}
     */
    public void insertAfter(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter sibling) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_insert_after.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a new row before {@code sibling}. If {@code sibling} is {@code null}, then the row will
     * be appended to the end of the list. {@code iter} will be changed to point to this
     * new row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param sibling A valid {@code GtkTreeIter}
     */
    public void insertBefore(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter sibling) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_insert_before.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new row at {@code position}. {@code iter} will be changed to point to this new
     * row. If {@code position} is -1, or larger than the number of rows in the list, then
     * the new row will be appended to the list. The row will be filled with the
     * values given to this function.
     * <p>
     * Calling
     * {@code gtk_list_store_insert_with_values (list_store, iter, position...)}
     * has the same effect as calling:
     * <pre>{@code <!-- language="C" -->
     * static void
     * insert_value (GtkListStore *list_store,
     *               GtkTreeIter  *iter,
     *               int           position)
     * {
     *   gtk_list_store_insert (list_store, iter, position);
     *   gtk_list_store_set (list_store,
     *                       iter
     *                       // ...
     *                       );
     * }
     * }</pre>
     * <p>
     * with the difference that the former will only emit {@code GtkTreeModel}::row-inserted
     * once, while the latter will emit {@code GtkTreeModel}::row-inserted,
     * {@code GtkTreeModel}::row-changed and, if the list store is sorted,
     * {@code GtkTreeModel}::rows-reordered for every inserted value.
     * <p>
     * Since emitting the {@code GtkTreeModel::rows-reordered} signal repeatedly can
     * affect the performance of the program, gtk_list_store_insert_with_values()
     * should generally be preferred when inserting rows in a sorted list store.
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param position position to insert the new row, or -1 to append after existing
     *    rows
     * @param varargs pairs of column number and value, terminated with -1
     */
    public void insertWithValues(@NotNull org.gtk.gtk.TreeIter iter, int position, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_insert_with_values.invokeExact(
                    handle(),
                    iter.handle(),
                    position,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A variant of gtk_list_store_insert_with_values() which
     * takes the columns and values as two arrays, instead of
     * varargs.
     * <p>
     * This function is mainly intended for language-bindings.
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param position position to insert the new row, or -1 for last
     * @param columns an array of column numbers
     * @param values an array of GValues
     * @param nValues the length of the {@code columns} and {@code values} arrays
     */
    public void insertWithValuesv(@NotNull org.gtk.gtk.TreeIter iter, int position, @NotNull int[] columns, @NotNull org.gtk.gobject.Value[] values, int nValues) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(columns, "Parameter 'columns' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.gtk_list_store_insert_with_valuesv.invokeExact(
                    handle(),
                    iter.handle(),
                    position,
                    Interop.allocateNativeArray(columns, false),
                    Interop.allocateNativeArray(values, false),
                    nValues);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if the given iter is a valid iter for this {@code GtkListStore}.
     * <p>
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     * @param iter the iterator to check
     * @return {@code true} if the iter is valid, {@code false} if the iter is invalid.
     */
    public boolean iterIsValid(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_store_iter_is_valid.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} in {@code store} to the position after {@code position}. Note that this
     * function only works with unsorted stores. If {@code position} is {@code null}, {@code iter}
     * will be moved to the start of the list.
     * @param iter A {@code GtkTreeIter}
     * @param position A {@code GtkTreeIter}
     */
    public void moveAfter(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter position) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_move_after.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (position == null ? MemoryAddress.NULL : position.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code iter} in {@code store} to the position before {@code position}. Note that this
     * function only works with unsorted stores. If {@code position} is {@code null}, {@code iter}
     * will be moved to the end of the list.
     * @param iter A {@code GtkTreeIter}
     * @param position A {@code GtkTreeIter}
     */
    public void moveBefore(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter position) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_move_before.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (position == null ? MemoryAddress.NULL : position.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends a new row to {@code list_store}. {@code iter} will be changed to point to this new
     * row. The row will be empty after this function is called. To fill in
     * values, you need to call gtk_list_store_set() or gtk_list_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the prepend row
     */
    public void prepend(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_prepend.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the given row from the list store.  After being removed,
     * {@code iter} is set to be the next valid row, or invalidated if it pointed
     * to the last row in {@code list_store}.
     * @param iter A valid {@code GtkTreeIter}
     * @return {@code true} if {@code iter} is valid, {@code false} if not.
     */
    public boolean remove(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_store_remove.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reorders {@code store} to follow the order indicated by {@code new_order}. Note that
     * this function only works with unsorted stores.
     * @param newOrder an array of integers mapping the new
     *   position of each child to its old position before the re-ordering,
     *   i.e. {@code new_order}{@code [newpos] = oldpos}. It must have
     *   exactly as many items as the list store’s length.
     */
    public void reorder(@NotNull int[] newOrder) {
        java.util.Objects.requireNonNull(newOrder, "Parameter 'newOrder' must not be null");
        try {
            DowncallHandles.gtk_list_store_reorder.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(newOrder, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of one or more cells in the row referenced by {@code iter}.
     * The variable argument list should contain integer column numbers,
     * each column number followed by the value to be set.
     * The list is terminated by a -1. For example, to set column 0 with type
     * {@code G_TYPE_STRING} to “Foo”, you would write {@code gtk_list_store_set (store, iter,
     * 0, "Foo", -1)}.
     * <p>
     * The value will be referenced by the store if it is a {@code G_TYPE_OBJECT}, and it
     * will be copied if it is a {@code G_TYPE_STRING} or {@code G_TYPE_BOXED}.
     * @param iter row iterator
     * @param varargs pairs of column number and value, terminated with -1
     */
    public void set(@NotNull org.gtk.gtk.TreeIter iter, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_list_store_set.invokeExact(
                    handle(),
                    iter.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is meant primarily for {@code GObject}s that inherit from {@code GtkListStore},
     * and should only be used when constructing a new {@code GtkListStore}.  It will not
     * function after a row has been added, or a method on the {@code GtkTreeModel}
     * interface is called.
     * @param nColumns Number of columns for the list store
     * @param types An array length n of {@code GType}s
     */
    public void setColumnTypes(int nColumns, @NotNull org.gtk.glib.Type[] types) {
        java.util.Objects.requireNonNull(types, "Parameter 'types' must not be null");
        try {
            DowncallHandles.gtk_list_store_set_column_types.invokeExact(
                    handle(),
                    nColumns,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See gtk_list_store_set(); this version takes a va_list for use by language
     * bindings.
     * @param iter A valid {@code GtkTreeIter} for the row being modified
     * @param varArgs va_list of column/value pairs
     */
    public void setValist(@NotNull org.gtk.gtk.TreeIter iter, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gtk_list_store_set_valist.invokeExact(
                    handle(),
                    iter.handle(),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the data in the cell specified by {@code iter} and {@code column}.
     * The type of {@code value} must be convertible to the type of the
     * column.
     * @param iter A valid {@code GtkTreeIter} for the row being modified
     * @param column column number to modify
     * @param value new value for the cell
     */
    public void setValue(@NotNull org.gtk.gtk.TreeIter iter, int column, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_list_store_set_value.invokeExact(
                    handle(),
                    iter.handle(),
                    column,
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A variant of gtk_list_store_set_valist() which
     * takes the columns and values as two arrays, instead of
     * varargs. This function is mainly intended for
     * language-bindings and in case the number of columns to
     * change is not known until run-time.
     * @param iter A valid {@code GtkTreeIter} for the row being modified
     * @param columns an array of column numbers
     * @param values an array of GValues
     * @param nValues the length of the {@code columns} and {@code values} arrays
     */
    public void setValuesv(@NotNull org.gtk.gtk.TreeIter iter, @NotNull int[] columns, @NotNull org.gtk.gobject.Value[] values, int nValues) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(columns, "Parameter 'columns' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.gtk_list_store_set_valuesv.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeArray(columns, false),
                    Interop.allocateNativeArray(values, false),
                    nValues);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Swaps {@code a} and {@code b} in {@code store}. Note that this function only works with
     * unsorted stores.
     * @param a A {@code GtkTreeIter}
     * @param b Another {@code GtkTreeIter}
     */
    public void swap(@NotNull org.gtk.gtk.TreeIter a, @NotNull org.gtk.gtk.TreeIter b) {
        java.util.Objects.requireNonNull(a, "Parameter 'a' must not be null");
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        try {
            DowncallHandles.gtk_list_store_swap.invokeExact(
                    handle(),
                    a.handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_list_store_new = Interop.downcallHandle(
            "gtk_list_store_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            true
        );
        
        private static final MethodHandle gtk_list_store_newv = Interop.downcallHandle(
            "gtk_list_store_newv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_append = Interop.downcallHandle(
            "gtk_list_store_append",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_clear = Interop.downcallHandle(
            "gtk_list_store_clear",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_insert = Interop.downcallHandle(
            "gtk_list_store_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_list_store_insert_after = Interop.downcallHandle(
            "gtk_list_store_insert_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_insert_before = Interop.downcallHandle(
            "gtk_list_store_insert_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_insert_with_values = Interop.downcallHandle(
            "gtk_list_store_insert_with_values",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            true
        );
        
        private static final MethodHandle gtk_list_store_insert_with_valuesv = Interop.downcallHandle(
            "gtk_list_store_insert_with_valuesv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_list_store_iter_is_valid = Interop.downcallHandle(
            "gtk_list_store_iter_is_valid",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_move_after = Interop.downcallHandle(
            "gtk_list_store_move_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_move_before = Interop.downcallHandle(
            "gtk_list_store_move_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_prepend = Interop.downcallHandle(
            "gtk_list_store_prepend",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_remove = Interop.downcallHandle(
            "gtk_list_store_remove",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_reorder = Interop.downcallHandle(
            "gtk_list_store_reorder",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_set = Interop.downcallHandle(
            "gtk_list_store_set",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_list_store_set_column_types = Interop.downcallHandle(
            "gtk_list_store_set_column_types",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_set_valist = Interop.downcallHandle(
            "gtk_list_store_set_valist",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_set_value = Interop.downcallHandle(
            "gtk_list_store_set_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_store_set_valuesv = Interop.downcallHandle(
            "gtk_list_store_set_valuesv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_list_store_swap = Interop.downcallHandle(
            "gtk_list_store_swap",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
