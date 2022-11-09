package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkTreeListRow} is used by {@code GtkTreeListModel} to represent items.
 * <p>
 * It allows navigating the model as a tree and modify the state of rows.
 * <p>
 * {@code GtkTreeListRow} instances are created by a {@code GtkTreeListModel} only
 * when the {@code Gtk.TreeListModel:passthrough} property is not set.
 * <p>
 * There are various support objects that can make use of {@code GtkTreeListRow}
 * objects, such as the {@link TreeExpander} widget that allows displaying
 * an icon to expand or collapse a row or {@link TreeListRowSorter} that
 * makes it possible to sort trees properly.
 */
public class TreeListRow extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeListRow";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TreeListRow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeListRow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TreeListRow if its GType is a (or inherits from) "GtkTreeListRow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TreeListRow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTreeListRow", a ClassCastException will be thrown.
     */
    public static TreeListRow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkTreeListRow"))) {
            return new TreeListRow(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTreeListRow");
        }
    }
    
    /**
     * If {@code self} is not expanded or {@code position} is greater than the
     * number of children, {@code null} is returned.
     * @param position position of the child to get
     * @return the child in {@code position}
     */
    public @Nullable org.gtk.gtk.TreeListRow getChildRow(int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_get_child_row.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeListRow(RESULT, Ownership.FULL);
    }
    
    /**
     * If the row is expanded, gets the model holding the children of {@code self}.
     * <p>
     * This model is the model created by the
     * {@code Gtk.TreeListModelCreateModelFunc}
     * and contains the original items, no matter what value
     * {@code Gtk.TreeListModel:passthrough} is set to.
     * @return The model containing the children
     */
    public @Nullable org.gtk.gio.ListModel getChildren() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_get_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the depth of this row.
     * <p>
     * Rows that correspond to items in the root model have a depth
     * of zero, rows corresponding to items of models of direct children
     * of the root model have a depth of 1 and so on.
     * <p>
     * The depth of a row never changes until the row is destroyed.
     * @return The depth of this row
     */
    public int getDepth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_list_row_get_depth.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets if a row is currently expanded.
     * @return {@code true} if the row is expanded
     */
    public boolean getExpanded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_list_row_get_expanded.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the item corresponding to this row,
     * <p>
     * The value returned by this function never changes until the
     * row is destroyed.
     * @return The item
     *   of this row or {@code null} when the row was destroyed
     */
    public @Nullable org.gtk.gobject.Object getItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_get_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the row representing the parent for {@code self}.
     * <p>
     * That is the row that would need to be collapsed
     * to make this row disappear.
     * <p>
     * If {@code self} is a row corresponding to the root model,
     * {@code null} is returned.
     * <p>
     * The value returned by this function never changes
     * until the row is destroyed.
     * @return The parent of {@code self}
     */
    public @Nullable org.gtk.gtk.TreeListRow getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_get_parent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeListRow(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the position in the {@code GtkTreeListModel} that {@code self} occupies
     * at the moment.
     * @return The position in the model
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_list_row_get_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if a row can be expanded.
     * <p>
     * This does not mean that the row is actually expanded,
     * this can be checked with {@link TreeListRow#getExpanded}.
     * <p>
     * If a row is expandable never changes until the row is destroyed.
     * @return {@code true} if the row is expandable
     */
    public boolean isExpandable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_list_row_is_expandable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Expands or collapses a row.
     * <p>
     * If a row is expanded, the model of calling the
     * {@code Gtk.TreeListModelCreateModelFunc} for the row's
     * item will be inserted after this row. If a row is collapsed,
     * those items will be removed from the model.
     * <p>
     * If the row is not expandable, this function does nothing.
     * @param expanded {@code true} if the row should be expanded
     */
    public void setExpanded(boolean expanded) {
        try {
            DowncallHandles.gtk_tree_list_row_set_expanded.invokeExact(
                    handle(),
                    expanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_list_row_get_child_row = Interop.downcallHandle(
            "gtk_tree_list_row_get_child_row",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_children = Interop.downcallHandle(
            "gtk_tree_list_row_get_children",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_depth = Interop.downcallHandle(
            "gtk_tree_list_row_get_depth",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_expanded = Interop.downcallHandle(
            "gtk_tree_list_row_get_expanded",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_item = Interop.downcallHandle(
            "gtk_tree_list_row_get_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_parent = Interop.downcallHandle(
            "gtk_tree_list_row_get_parent",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_position = Interop.downcallHandle(
            "gtk_tree_list_row_get_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_is_expandable = Interop.downcallHandle(
            "gtk_tree_list_row_is_expandable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_set_expanded = Interop.downcallHandle(
            "gtk_tree_list_row_set_expanded",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
