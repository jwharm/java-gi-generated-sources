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
public class TreeStore extends org.gtk.gobject.GObject implements org.gtk.gtk.Buildable, org.gtk.gtk.TreeDragDest, org.gtk.gtk.TreeDragSource, org.gtk.gtk.TreeModel, org.gtk.gtk.TreeSortable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeStore";
    
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
     * Create a TreeStore proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeStore(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeStore> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeStore(input, ownership);
    
    private static MemoryAddress constructNew(int nColumns, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_store_new.invokeExact(
                    nColumns,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param varargs all {@code GType} types for the columns, from first to last
     */
    public TreeStore(int nColumns, java.lang.Object... varargs) {
        super(constructNew(nColumns, varargs), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewv(int nColumns, org.gtk.glib.Type[] types) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_store_newv.invokeExact(
                    nColumns,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false));
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
        var RESULT = constructNewv(nColumns, types);
        return (org.gtk.gtk.TreeStore) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeStore.fromAddress).marshal(RESULT, Ownership.FULL);
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
    public void append(org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent) {
        try {
            DowncallHandles.gtk_tree_store_append.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all rows from {@code tree_store}
     */
    public void clear() {
        try {
            DowncallHandles.gtk_tree_store_clear.invokeExact(
                    handle());
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
    public void insert(org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent, int position) {
        try {
            DowncallHandles.gtk_tree_store_insert.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public void insertAfter(org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent, @Nullable org.gtk.gtk.TreeIter sibling) {
        try {
            DowncallHandles.gtk_tree_store_insert_after.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public void insertBefore(org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent, @Nullable org.gtk.gtk.TreeIter sibling) {
        try {
            DowncallHandles.gtk_tree_store_insert_before.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public void insertWithValues(@Nullable org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent, int position, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        try {
            DowncallHandles.gtk_tree_store_insert_with_valuesv.invokeExact(
                    handle(),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    position,
                    Interop.allocateNativeArray(columns, false),
                    Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false),
                    nValues);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if {@code iter} is an ancestor of {@code descendant}.  That is, {@code iter} is the
     * parent (or grandparent or great-grandparent) of {@code descendant}.
     * @param iter A valid {@code GtkTreeIter}
     * @param descendant A valid {@code GtkTreeIter}
     * @return {@code true}, if {@code iter} is an ancestor of {@code descendant}
     */
    public boolean isAncestor(org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreeIter descendant) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_store_is_ancestor.invokeExact(
                    handle(),
                    iter.handle(),
                    descendant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the depth of {@code iter}.  This will be 0 for anything on the root level, 1
     * for anything down a level, etc.
     * @param iter A valid {@code GtkTreeIter}
     * @return The depth of {@code iter}
     */
    public int iterDepth(org.gtk.gtk.TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_store_iter_depth.invokeExact(
                    handle(),
                    iter.handle());
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
    public boolean iterIsValid(org.gtk.gtk.TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_store_iter_is_valid.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Moves {@code iter} in {@code tree_store} to the position after {@code position}. {@code iter} and
     * {@code position} should be in the same level. Note that this function only
     * works with unsorted stores. If {@code position} is {@code null}, {@code iter} will be moved
     * to the start of the level.
     * @param iter A {@code GtkTreeIter}.
     * @param position A {@code GtkTreeIter}.
     */
    public void moveAfter(org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter position) {
        try {
            DowncallHandles.gtk_tree_store_move_after.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (position == null ? MemoryAddress.NULL : position.handle()));
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
    public void moveBefore(org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter position) {
        try {
            DowncallHandles.gtk_tree_store_move_before.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (position == null ? MemoryAddress.NULL : position.handle()));
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
    public void prepend(org.gtk.gtk.TreeIter iter, @Nullable org.gtk.gtk.TreeIter parent) {
        try {
            DowncallHandles.gtk_tree_store_prepend.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code iter} from {@code tree_store}.  After being removed, {@code iter} is set to the
     * next valid row at that level, or invalidated if it previously pointed to the
     * last one.
     * @param iter A valid {@code GtkTreeIter}
     * @return {@code true} if {@code iter} is still valid, {@code false} if not.
     */
    public boolean remove(org.gtk.gtk.TreeIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_store_remove.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        try {
            DowncallHandles.gtk_tree_store_reorder.invokeExact(
                    handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    Interop.allocateNativeArray(newOrder, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_tree_store_set_column_types.invokeExact(
                    handle(),
                    nColumns,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(types), false));
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
    public void setValist(org.gtk.gtk.TreeIter iter, VaList varArgs) {
        try {
            DowncallHandles.gtk_tree_store_set_valist.invokeExact(
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
    public void setValue(org.gtk.gtk.TreeIter iter, int column, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gtk_tree_store_set_value.invokeExact(
                    handle(),
                    iter.handle(),
                    column,
                    value.handle());
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
    public void set(org.gtk.gtk.TreeIter iter, int[] columns, org.gtk.gobject.Value[] values, int nValues) {
        try {
            DowncallHandles.gtk_tree_store_set_valuesv.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeArray(columns, false),
                    Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false),
                    nValues);
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
    public void swap(org.gtk.gtk.TreeIter a, org.gtk.gtk.TreeIter b) {
        try {
            DowncallHandles.gtk_tree_store_swap.invokeExact(
                    handle(),
                    a.handle(),
                    b.handle());
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
            RESULT = (long) DowncallHandles.gtk_tree_store_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TreeStore.Builder} object constructs a {@link TreeStore} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeStore.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TreeStore} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeStore}.
         * @return A new instance of {@code TreeStore} with the properties 
         *         that were set in the Builder object.
         */
        public TreeStore build() {
            return (TreeStore) org.gtk.gobject.GObject.newWithProperties(
                TreeStore.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_store_new = Interop.downcallHandle(
            "gtk_tree_store_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            true
        );
        
        private static final MethodHandle gtk_tree_store_newv = Interop.downcallHandle(
            "gtk_tree_store_newv",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_append = Interop.downcallHandle(
            "gtk_tree_store_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_clear = Interop.downcallHandle(
            "gtk_tree_store_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_insert = Interop.downcallHandle(
            "gtk_tree_store_insert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_store_insert_after = Interop.downcallHandle(
            "gtk_tree_store_insert_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_insert_before = Interop.downcallHandle(
            "gtk_tree_store_insert_before",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_insert_with_valuesv = Interop.downcallHandle(
            "gtk_tree_store_insert_with_valuesv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_store_is_ancestor = Interop.downcallHandle(
            "gtk_tree_store_is_ancestor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_iter_depth = Interop.downcallHandle(
            "gtk_tree_store_iter_depth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_iter_is_valid = Interop.downcallHandle(
            "gtk_tree_store_iter_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_move_after = Interop.downcallHandle(
            "gtk_tree_store_move_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_move_before = Interop.downcallHandle(
            "gtk_tree_store_move_before",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_prepend = Interop.downcallHandle(
            "gtk_tree_store_prepend",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_remove = Interop.downcallHandle(
            "gtk_tree_store_remove",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_reorder = Interop.downcallHandle(
            "gtk_tree_store_reorder",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_set_column_types = Interop.downcallHandle(
            "gtk_tree_store_set_column_types",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_set_valist = Interop.downcallHandle(
            "gtk_tree_store_set_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_set_value = Interop.downcallHandle(
            "gtk_tree_store_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_set_valuesv = Interop.downcallHandle(
            "gtk_tree_store_set_valuesv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_store_swap = Interop.downcallHandle(
            "gtk_tree_store_swap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_store_get_type = Interop.downcallHandle(
            "gtk_tree_store_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
