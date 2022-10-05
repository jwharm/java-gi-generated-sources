package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>GtkTreeStore as GtkBuildable</h1>
 * <p>
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
public class TreeStore extends org.gtk.gobject.Object implements Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable {

    public TreeStore(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeStore */
    public static TreeStore castFrom(org.gtk.gobject.Object gobject) {
        return new TreeStore(gobject.refcounted());
    }
    
    static final MethodHandle gtk_tree_store_newv = Interop.downcallHandle(
        "gtk_tree_store_newv",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewv(int nColumns, org.gtk.gobject.Type[] types) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_store_newv.invokeExact(nColumns, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(types)).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Non vararg creation function.  Used primarily by language bindings.
     */
    public static TreeStore newv(int nColumns, org.gtk.gobject.Type[] types) {
        return new TreeStore(constructNewv(nColumns, types));
    }
    
    static final MethodHandle gtk_tree_store_append = Interop.downcallHandle(
        "gtk_tree_store_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a new row to {@code tree_store}.  If {@code parent} is non-{@code null}, then it will append the
     * new row after the last child of {@code parent}, otherwise it will append a row to
     * the top level.  {@code iter} will be changed to point to this new row.  The row will
     * be empty after this function is called.  To fill in values, you need to call
     * gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void append(TreeIter iter, TreeIter parent) {
        try {
            gtk_tree_store_append.invokeExact(handle(), iter.handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_clear = Interop.downcallHandle(
        "gtk_tree_store_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all rows from {@code tree_store}
     */
    public void clear() {
        try {
            gtk_tree_store_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_insert = Interop.downcallHandle(
        "gtk_tree_store_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new row at {@code position}.  If parent is non-{@code null}, then the row will be
     * made a child of {@code parent}.  Otherwise, the row will be created at the toplevel.
     * If {@code position} is -1 or is larger than the number of rows at that level, then
     * the new row will be inserted to the end of the list.  {@code iter} will be changed
     * to point to this new row.  The row will be empty after this function is
     * called.  To fill in values, you need to call gtk_tree_store_set() or
     * gtk_tree_store_set_value().
     */
    public void insert(TreeIter iter, TreeIter parent, int position) {
        try {
            gtk_tree_store_insert.invokeExact(handle(), iter.handle(), parent.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_insert_after = Interop.downcallHandle(
        "gtk_tree_store_insert_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void insertAfter(TreeIter iter, TreeIter parent, TreeIter sibling) {
        try {
            gtk_tree_store_insert_after.invokeExact(handle(), iter.handle(), parent.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_insert_before = Interop.downcallHandle(
        "gtk_tree_store_insert_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void insertBefore(TreeIter iter, TreeIter parent, TreeIter sibling) {
        try {
            gtk_tree_store_insert_before.invokeExact(handle(), iter.handle(), parent.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_insert_with_valuesv = Interop.downcallHandle(
        "gtk_tree_store_insert_with_valuesv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * A variant of gtk_tree_store_insert_with_values() which takes
     * the columns and values as two arrays, instead of varargs.  This
     * function is mainly intended for language bindings.
     */
    public void insertWithValuesv(TreeIter iter, TreeIter parent, int position, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        try {
            gtk_tree_store_insert_with_valuesv.invokeExact(handle(), iter.handle(), parent.handle(), position, Interop.allocateNativeArray(columns).handle(), Interop.allocateNativeArray(values).handle(), nValues);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_is_ancestor = Interop.downcallHandle(
        "gtk_tree_store_is_ancestor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code iter} is an ancestor of {@code descendant}.  That is, {@code iter} is the
     * parent (or grandparent or great-grandparent) of {@code descendant}.
     */
    public boolean isAncestor(TreeIter iter, TreeIter descendant) {
        try {
            var RESULT = (int) gtk_tree_store_is_ancestor.invokeExact(handle(), iter.handle(), descendant.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_iter_depth = Interop.downcallHandle(
        "gtk_tree_store_iter_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the depth of {@code iter}.  This will be 0 for anything on the root level, 1
     * for anything down a level, etc.
     */
    public int iterDepth(TreeIter iter) {
        try {
            var RESULT = (int) gtk_tree_store_iter_depth.invokeExact(handle(), iter.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_iter_is_valid = Interop.downcallHandle(
        "gtk_tree_store_iter_is_valid",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the given iter is a valid iter for this {@code GtkTreeStore}.
     * <p>
     * This function is slow. Only use it for debugging and/or testing
     * purposes.
     */
    public boolean iterIsValid(TreeIter iter) {
        try {
            var RESULT = (int) gtk_tree_store_iter_is_valid.invokeExact(handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_move_after = Interop.downcallHandle(
        "gtk_tree_store_move_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} in {@code tree_store} to the position after {@code position}. {@code iter} and
     * {@code position} should be in the same level. Note that this function only
     * works with unsorted stores. If {@code position} is {@code null}, {@code iter} will be moved
     * to the start of the level.
     */
    public void moveAfter(TreeIter iter, TreeIter position) {
        try {
            gtk_tree_store_move_after.invokeExact(handle(), iter.handle(), position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_move_before = Interop.downcallHandle(
        "gtk_tree_store_move_before",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code iter} in {@code tree_store} to the position before {@code position}. {@code iter} and
     * {@code position} should be in the same level. Note that this function only
     * works with unsorted stores. If {@code position} is {@code null}, {@code iter} will be
     * moved to the end of the level.
     */
    public void moveBefore(TreeIter iter, TreeIter position) {
        try {
            gtk_tree_store_move_before.invokeExact(handle(), iter.handle(), position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_prepend = Interop.downcallHandle(
        "gtk_tree_store_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a new row to {@code tree_store}.  If {@code parent} is non-{@code null}, then it will prepend
     * the new row before the first child of {@code parent}, otherwise it will prepend a row
     * to the top level.  {@code iter} will be changed to point to this new row.  The row
     * will be empty after this function is called.  To fill in values, you need to
     * call gtk_tree_store_set() or gtk_tree_store_set_value().
     */
    public void prepend(TreeIter iter, TreeIter parent) {
        try {
            gtk_tree_store_prepend.invokeExact(handle(), iter.handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_remove = Interop.downcallHandle(
        "gtk_tree_store_remove",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code iter} from {@code tree_store}.  After being removed, {@code iter} is set to the
     * next valid row at that level, or invalidated if it previously pointed to the
     * last one.
     */
    public boolean remove(TreeIter iter) {
        try {
            var RESULT = (int) gtk_tree_store_remove.invokeExact(handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_reorder = Interop.downcallHandle(
        "gtk_tree_store_reorder",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders the children of {@code parent} in {@code tree_store} to follow the order
     * indicated by {@code new_order}. Note that this function only works with
     * unsorted stores.
     */
    public void reorder(TreeIter parent, int[] newOrder) {
        try {
            gtk_tree_store_reorder.invokeExact(handle(), parent.handle(), Interop.allocateNativeArray(newOrder).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_set_column_types = Interop.downcallHandle(
        "gtk_tree_store_set_column_types",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is meant primarily for {@code GObjects} that inherit from
     * {@code GtkTreeStore}, and should only be used when constructing a new
     * {@code GtkTreeStore}.  It will not function after a row has been added,
     * or a method on the {@code GtkTreeModel} interface is called.
     */
    public void setColumnTypes(int nColumns, org.gtk.gobject.Type[] types) {
        try {
            gtk_tree_store_set_column_types.invokeExact(handle(), nColumns, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(types)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_set_valist = Interop.downcallHandle(
        "gtk_tree_store_set_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * See gtk_tree_store_set(); this version takes a va_list for
     * use by language bindings.
     */
    public void setValist(TreeIter iter, VaList varArgs) {
        try {
            gtk_tree_store_set_valist.invokeExact(handle(), iter.handle(), varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_set_value = Interop.downcallHandle(
        "gtk_tree_store_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the data in the cell specified by {@code iter} and {@code column}.
     * The type of {@code value} must be convertible to the type of the
     * column.
     */
    public void setValue(TreeIter iter, int column, org.gtk.gobject.Value value) {
        try {
            gtk_tree_store_set_value.invokeExact(handle(), iter.handle(), column, value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_set_valuesv = Interop.downcallHandle(
        "gtk_tree_store_set_valuesv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * A variant of gtk_tree_store_set_valist() which takes
     * the columns and values as two arrays, instead of varargs.  This
     * function is mainly intended for language bindings or in case
     * the number of columns to change is not known until run-time.
     */
    public void setValuesv(TreeIter iter, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        try {
            gtk_tree_store_set_valuesv.invokeExact(handle(), iter.handle(), Interop.allocateNativeArray(columns).handle(), Interop.allocateNativeArray(values).handle(), nValues);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_store_swap = Interop.downcallHandle(
        "gtk_tree_store_swap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Swaps @a and @b in the same level of {@code tree_store}. Note that this function
     * only works with unsorted stores.
     */
    public void swap(TreeIter a, TreeIter b) {
        try {
            gtk_tree_store_swap.invokeExact(handle(), a.handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
