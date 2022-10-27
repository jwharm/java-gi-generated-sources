package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A tree-like data structure that can be used with the GtkTreeView
 * <p>
 * The {@code GtkTreeStore} object is a list model for use with a {@code GtkTreeView}
 * widget.  It implements the {@code GtkTreeModel} interface, and consequently,
 * can use all of the methods available there.  It also implements the
 * {@code GtkTreeSortable} interface so it can be sorted by the view.  Finally,
 * it also implements the tree
 * [drag and drop][gtk3-GtkTreeView-drag-and-drop]
 * interfaces.
 * <p>
 * <strong>GtkTreeStore as GtkBuildable</strong><br/>
 * The GtkTreeStore implementation of the {@code GtkBuildable} interface allows
 * to specify the model columns with a &lt;columns&gt; element that may contain
 * multiple &lt;column&gt; elements, each specifying one model column. The “type”
 * attribute specifies the data type for the column.
 * <p>
 * An example of a UI Definition fragment for a tree store:
 * <pre>{@code 
 * <object class="GtkTreeStore">
 *   <columns>
 *     <column type="gchararray"/>
 *     <column type="gchararray"/>
 *     <column type="gint"/>
 *   </columns>
 * </object>
 * }</pre>
 */
public class TreeStore extends org.gtk.gobject.Object implements org.gtk.gtk.Buildable, org.gtk.gtk.TreeDragDest, org.gtk.gtk.TreeDragSource, org.gtk.gtk.TreeModel, org.gtk.gtk.TreeSortable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent"),
        org.gtk.gtk.TreeStorePrivate.getMemoryLayout().withName("priv")
    ).withName("GtkTreeStore");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TreeStore(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeStore */
    public static TreeStore castFrom(org.gtk.gobject.Object gobject) {
        return new TreeStore(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int nColumns) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new tree store as with {@code n_columns} columns each of the types passed
     * in.  Note that only types derived from standard GObject fundamental types
     * are supported.
     * <p>
     * As an example,
     * <pre>{@code 
     * gtk_tree_store_new (3, G_TYPE_INT, G_TYPE_STRING, GDK_TYPE_TEXTURE);
     * }</pre>
     * <p>
     * will create a new {@code GtkTreeStore} with three columns, of type
     * {@code int}, {@code gchararray}, and {@code GdkTexture} respectively.
     * @param nColumns number of columns in the tree store
     */
    public TreeStore(int nColumns) {
        this(Refcounted.get(null)); // avoid compiler error
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static Refcounted constructNewv(int nColumns, org.gtk.glib.Type[] types) {
        java.util.Objects.requireNonNull(types, "Parameter 'types' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_tree_store_newv.invokeExact(nColumns, Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Non vararg creation function.  Used primarily by language bindings.
     * @param nColumns number of columns in the tree store
     * @param types an array of {@code GType} types for the columns, from first to last
     * @return a new {@code GtkTreeStore}
     */
    public static TreeStore newv(int nColumns, org.gtk.glib.Type[] types) {
        return new TreeStore(constructNewv(nColumns, types));
    }
    
    /**
     * Appends a new row to {@code tree_store}.  If {@code parent} is non-{@code null}, then it will append the
     * new row after the last child of {@code parent}, otherwise it will append a row to
     * the top level.  {@code iter} will be changed to point to this new row.  The row will
     * be empty after this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the appended row
     * @param parent A valid {@code GtkTreeIter}
     */
    public void append(@NotNull Out<org.gtk.gtk.TreeIter> iter, @Nullable org.gtk.gtk.TreeIter parent) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_tree_store_append.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new org.gtk.gtk.TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Removes all rows from {@code tree_store}
     */
    public void clear() {
        try {
            DowncallHandles.gtk_tree_store_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new row at {@code position}.  If parent is non-{@code null}, then the row will be
     * made a child of {@code parent}.  Otherwise, the row will be created at the toplevel.
     * If {@code position} is -1 or is larger than the number of rows at that level, then
     * the new row will be inserted to the end of the list.  {@code iter} will be changed
     * to point to this new row.  The row will be empty after this function is
     * called.  To fill in values, you need to call gtk_tree_store_set() or
     * gtk_tree_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param parent A valid {@code GtkTreeIter}
     * @param position position to insert the new row, or -1 for last
     */
    public void insert(@NotNull Out<org.gtk.gtk.TreeIter> iter, @Nullable org.gtk.gtk.TreeIter parent, int position) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_tree_store_insert.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new org.gtk.gtk.TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Inserts a new row after {@code sibling}.  If {@code sibling} is {@code null}, then the row will be
     * prepended to {@code parent} ’s children.  If {@code parent} and {@code sibling} are {@code null}, then
     * the row will be prepended to the toplevel.  If both {@code sibling} and {@code parent} are
     * set, then {@code parent} must be the parent of {@code sibling}.  When {@code sibling} is set,
     * {@code parent} is optional.
     * <p>
     * {@code iter} will be changed to point to this new row.  The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param parent A valid {@code GtkTreeIter}
     * @param sibling A valid {@code GtkTreeIter}
     */
    public void insertAfter(@NotNull Out<org.gtk.gtk.TreeIter> iter, @Nullable org.gtk.gtk.TreeIter parent, @Nullable org.gtk.gtk.TreeIter sibling) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(sibling, MemoryAddress.NULL);
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_tree_store_insert_after.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new org.gtk.gtk.TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Inserts a new row before {@code sibling}.  If {@code sibling} is {@code null}, then the row will
     * be appended to {@code parent} ’s children.  If {@code parent} and {@code sibling} are {@code null}, then
     * the row will be appended to the toplevel.  If both {@code sibling} and {@code parent} are
     * set, then {@code parent} must be the parent of {@code sibling}.  When {@code sibling} is set,
     * {@code parent} is optional.
     * <p>
     * {@code iter} will be changed to point to this new row.  The row will be empty after
     * this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the new row
     * @param parent A valid {@code GtkTreeIter}
     * @param sibling A valid {@code GtkTreeIter}
     */
    public void insertBefore(@NotNull Out<org.gtk.gtk.TreeIter> iter, @Nullable org.gtk.gtk.TreeIter parent, @Nullable org.gtk.gtk.TreeIter sibling) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(sibling, MemoryAddress.NULL);
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_tree_store_insert_before.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new org.gtk.gtk.TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Creates a new row at {@code position}. {@code iter} will be changed to point to this
     * new row. If {@code position} is -1, or larger than the number of rows on the list, then
     * the new row will be appended to the list. The row will be filled with
     * the values given to this function.
     * <p>
     * Calling
     * {@code gtk_tree_store_insert_with_values (tree_store, iter, position, ...)}
     * has the same effect as calling
     * <pre>{@code <!-- language="C" -->
     * gtk_tree_store_insert (tree_store, iter, position);
     * gtk_tree_store_set (tree_store, iter, ...);
     * }</pre>
     * with the different that the former will only emit a row_inserted signal,
     * while the latter will emit row_inserted, row_changed and if the tree store
     * is sorted, rows_reordered.  Since emitting the rows_reordered signal
     * repeatedly can affect the performance of the program,
     * gtk_tree_store_insert_with_values() should generally be preferred when
     * inserting rows in a sorted tree store.
     * @param iter An unset {@code GtkTreeIter} to set the new row
     * @param parent A valid {@code GtkTreeIter}
     * @param position position to insert the new row, or -1 to append after existing rows
     */
    public void insertWithValues(@NotNull Out<org.gtk.gtk.TreeIter> iter, @Nullable org.gtk.gtk.TreeIter parent, int position) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * A variant of gtk_tree_store_insert_with_values() which takes
     * the columns and values as two arrays, instead of varargs.  This
     * function is mainly intended for language bindings.
     * @param iter An unset {@code GtkTreeIter} to set the new row
     * @param parent A valid {@code GtkTreeIter}
     * @param position position to insert the new row, or -1 for last
     * @param columns an array of column numbers
     * @param values an array of GValues
     * @param nValues the length of the {@code columns} and {@code values} arrays
     */
    public void insertWithValuesv(@NotNull Out<org.gtk.gtk.TreeIter> iter, @Nullable org.gtk.gtk.TreeIter parent, int position, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(columns, "Parameter 'columns' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_tree_store_insert_with_valuesv.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle(), position, Interop.allocateNativeArray(columns, false), Interop.allocateNativeArray(values, false), nValues);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new org.gtk.gtk.TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Returns {@code true} if {@code iter} is an ancestor of {@code descendant}.  That is, {@code iter} is the
     * parent (or grandparent or great-grandparent) of {@code descendant}.
     * @param iter A valid {@code GtkTreeIter}
     * @param descendant A valid {@code GtkTreeIter}
     * @return {@code true}, if {@code iter} is an ancestor of {@code descendant}
     */
    public boolean isAncestor(@NotNull org.gtk.gtk.TreeIter iter, @NotNull org.gtk.gtk.TreeIter descendant) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(descendant, "Parameter 'descendant' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_store_is_ancestor.invokeExact(handle(), iter.handle(), descendant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the depth of {@code iter}.  This will be 0 for anything on the root level, 1
     * for anything down a level, etc.
     * @param iter A valid {@code GtkTreeIter}
     * @return The depth of {@code iter}
     */
    public int iterDepth(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_store_iter_depth.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if the given iter is a valid iter for this {@code GtkTreeStore}.
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
            RESULT = (int) DowncallHandles.gtk_tree_store_iter_is_valid.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} in {@code tree_store} to the position after {@code position}. {@code iter} and
     * {@code position} should be in the same level. Note that this function only
     * works with unsorted stores. If {@code position} is {@code null}, {@code iter} will be moved
     * to the start of the level.
     * @param iter A {@code GtkTreeIter}.
     * @param position A {@code GtkTreeIter}.
     */
    public void moveAfter(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter position) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(position, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tree_store_move_after.invokeExact(handle(), iter.handle(), position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code iter} in {@code tree_store} to the position before {@code position}. {@code iter} and
     * {@code position} should be in the same level. Note that this function only
     * works with unsorted stores. If {@code position} is {@code null}, {@code iter} will be
     * moved to the end of the level.
     * @param iter A {@code GtkTreeIter}
     * @param position A {@code GtkTreeIter}
     */
    public void moveBefore(@NotNull org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter position) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(position, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tree_store_move_before.invokeExact(handle(), iter.handle(), position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends a new row to {@code tree_store}.  If {@code parent} is non-{@code null}, then it will prepend
     * the new row before the first child of {@code parent}, otherwise it will prepend a row
     * to the top level.  {@code iter} will be changed to point to this new row.  The row
     * will be empty after this function is called.  To fill in values, you need to
     * call gtk_tree_store_set() or gtk_tree_store_set_value().
     * @param iter An unset {@code GtkTreeIter} to set to the prepended row
     * @param parent A valid {@code GtkTreeIter}
     */
    public void prepend(@NotNull Out<org.gtk.gtk.TreeIter> iter, @Nullable org.gtk.gtk.TreeIter parent) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_tree_store_prepend.invokeExact(handle(), (Addressable) iterPOINTER.address(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new org.gtk.gtk.TreeIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Removes {@code iter} from {@code tree_store}.  After being removed, {@code iter} is set to the
     * next valid row at that level, or invalidated if it previously pointed to the
     * last one.
     * @param iter A valid {@code GtkTreeIter}
     * @return {@code true} if {@code iter} is still valid, {@code false} if not.
     */
    public boolean remove(@NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_store_remove.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reorders the children of {@code parent} in {@code tree_store} to follow the order
     * indicated by {@code new_order}. Note that this function only works with
     * unsorted stores.
     * @param parent A {@code GtkTreeIter}
     * @param newOrder an array of integers mapping the new position of each child
     *   to its old position before the re-ordering,
     *   i.e. {@code new_order}{@code [newpos] = oldpos}.
     */
    public void reorder(@Nullable org.gtk.gtk.TreeIter parent, int[] newOrder) {
        java.util.Objects.requireNonNullElse(parent, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(newOrder, "Parameter 'newOrder' must not be null");
        try {
            DowncallHandles.gtk_tree_store_reorder.invokeExact(handle(), parent.handle(), Interop.allocateNativeArray(newOrder, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value of one or more cells in the row referenced by {@code iter}.
     * The variable argument list should contain integer column numbers,
     * each column number followed by the value to be set.
     * The list is terminated by a -1. For example, to set column 0 with type
     * {@code G_TYPE_STRING} to “Foo”, you would write
     * {@code gtk_tree_store_set (store, iter, 0, "Foo", -1)}.
     * <p>
     * The value will be referenced by the store if it is a {@code G_TYPE_OBJECT}, and it
     * will be copied if it is a {@code G_TYPE_STRING} or {@code G_TYPE_BOXED}.
     * @param iter A valid {@code GtkTreeIter} for the row being modified
     */
    public void set(@NotNull org.gtk.gtk.TreeIter iter) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * This function is meant primarily for {@code GObjects} that inherit from
     * {@code GtkTreeStore}, and should only be used when constructing a new
     * {@code GtkTreeStore}.  It will not function after a row has been added,
     * or a method on the {@code GtkTreeModel} interface is called.
     * @param nColumns Number of columns for the tree store
     * @param types An array of {@code GType} types, one for each column
     */
    public void setColumnTypes(int nColumns, org.gtk.glib.Type[] types) {
        java.util.Objects.requireNonNull(types, "Parameter 'types' must not be null");
        try {
            DowncallHandles.gtk_tree_store_set_column_types.invokeExact(handle(), nColumns, Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See gtk_tree_store_set(); this version takes a va_list for
     * use by language bindings.
     * @param iter A valid {@code GtkTreeIter} for the row being modified
     * @param varArgs va_list of column/value pairs
     */
    public void setValist(@NotNull org.gtk.gtk.TreeIter iter, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gtk_tree_store_set_valist.invokeExact(handle(), iter.handle(), varArgs);
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
            DowncallHandles.gtk_tree_store_set_value.invokeExact(handle(), iter.handle(), column, value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A variant of gtk_tree_store_set_valist() which takes
     * the columns and values as two arrays, instead of varargs.  This
     * function is mainly intended for language bindings or in case
     * the number of columns to change is not known until run-time.
     * @param iter A valid {@code GtkTreeIter} for the row being modified
     * @param columns an array of column numbers
     * @param values an array of GValues
     * @param nValues the length of the {@code columns} and {@code values} arrays
     */
    public void setValuesv(@NotNull org.gtk.gtk.TreeIter iter, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(columns, "Parameter 'columns' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.gtk_tree_store_set_valuesv.invokeExact(handle(), iter.handle(), Interop.allocateNativeArray(columns, false), Interop.allocateNativeArray(values, false), nValues);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Swaps {@code a} and {@code b} in the same level of {@code tree_store}. Note that this function
     * only works with unsorted stores.
     * @param a A {@code GtkTreeIter}.
     * @param b Another {@code GtkTreeIter}.
     */
    public void swap(@NotNull org.gtk.gtk.TreeIter a, @NotNull org.gtk.gtk.TreeIter b) {
        java.util.Objects.requireNonNull(a, "Parameter 'a' must not be null");
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        try {
            DowncallHandles.gtk_tree_store_swap.invokeExact(handle(), a.handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_store_new = Interop.downcallHandle(
            "gtk_tree_store_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_newv = Interop.downcallHandle(
            "gtk_tree_store_newv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_append = Interop.downcallHandle(
            "gtk_tree_store_append",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_clear = Interop.downcallHandle(
            "gtk_tree_store_clear",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_insert = Interop.downcallHandle(
            "gtk_tree_store_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_tree_store_insert_after = Interop.downcallHandle(
            "gtk_tree_store_insert_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_insert_before = Interop.downcallHandle(
            "gtk_tree_store_insert_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_insert_with_values = Interop.downcallHandle(
            "gtk_tree_store_insert_with_values",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_insert_with_valuesv = Interop.downcallHandle(
            "gtk_tree_store_insert_with_valuesv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_tree_store_is_ancestor = Interop.downcallHandle(
            "gtk_tree_store_is_ancestor",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_iter_depth = Interop.downcallHandle(
            "gtk_tree_store_iter_depth",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_iter_is_valid = Interop.downcallHandle(
            "gtk_tree_store_iter_is_valid",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_move_after = Interop.downcallHandle(
            "gtk_tree_store_move_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_move_before = Interop.downcallHandle(
            "gtk_tree_store_move_before",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_prepend = Interop.downcallHandle(
            "gtk_tree_store_prepend",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_remove = Interop.downcallHandle(
            "gtk_tree_store_remove",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_reorder = Interop.downcallHandle(
            "gtk_tree_store_reorder",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_set = Interop.downcallHandle(
            "gtk_tree_store_set",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_set_column_types = Interop.downcallHandle(
            "gtk_tree_store_set_column_types",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_set_valist = Interop.downcallHandle(
            "gtk_tree_store_set_valist",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_set_value = Interop.downcallHandle(
            "gtk_tree_store_set_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_store_set_valuesv = Interop.downcallHandle(
            "gtk_tree_store_set_valuesv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_tree_store_swap = Interop.downcallHandle(
            "gtk_tree_store_swap",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
