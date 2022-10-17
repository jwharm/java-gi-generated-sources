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

    public TreeListRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeListRow */
    public static TreeListRow castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListRow(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_tree_list_row_get_child_row = Interop.downcallHandle(
        "gtk_tree_list_row_get_child_row",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code self} is not expanded or {@code position} is greater than the
     * number of children, {@code null} is returned.
     */
    public @Nullable TreeListRow getChildRow(@NotNull int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_list_row_get_child_row.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeListRow(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_tree_list_row_get_children = Interop.downcallHandle(
        "gtk_tree_list_row_get_children",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If the row is expanded, gets the model holding the children of {@code self}.
     * <p>
     * This model is the model created by the
     * {@code Gtk.TreeListModelCreateModelFunc}
     * and contains the original items, no matter what value
     * {@code Gtk.TreeListModel:passthrough} is set to.
     */
    public @Nullable org.gtk.gio.ListModel getChildren() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_list_row_get_children.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_tree_list_row_get_depth = Interop.downcallHandle(
        "gtk_tree_list_row_get_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the depth of this row.
     * <p>
     * Rows that correspond to items in the root model have a depth
     * of zero, rows corresponding to items of models of direct children
     * of the root model have a depth of 1 and so on.
     * <p>
     * The depth of a row never changes until the row is destroyed.
     */
    public int getDepth() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_list_row_get_depth.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_list_row_get_expanded = Interop.downcallHandle(
        "gtk_tree_list_row_get_expanded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets if a row is currently expanded.
     */
    public boolean getExpanded() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_list_row_get_expanded.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_list_row_get_item = Interop.downcallHandle(
        "gtk_tree_list_row_get_item",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the item corresponding to this row,
     * <p>
     * The value returned by this function never changes until the
     * row is destroyed.
     */
    public @Nullable org.gtk.gobject.Object getItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_list_row_get_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_tree_list_row_get_parent = Interop.downcallHandle(
        "gtk_tree_list_row_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @Nullable TreeListRow getParent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_list_row_get_parent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeListRow(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_tree_list_row_get_position = Interop.downcallHandle(
        "gtk_tree_list_row_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the position in the {@code GtkTreeListModel} that {@code self} occupies
     * at the moment.
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_list_row_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_list_row_is_expandable = Interop.downcallHandle(
        "gtk_tree_list_row_is_expandable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a row can be expanded.
     * <p>
     * This does not mean that the row is actually expanded,
     * this can be checked with {@link TreeListRow#getExpanded}.
     * <p>
     * If a row is expandable never changes until the row is destroyed.
     */
    public boolean isExpandable() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_list_row_is_expandable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_list_row_set_expanded = Interop.downcallHandle(
        "gtk_tree_list_row_set_expanded",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Expands or collapses a row.
     * <p>
     * If a row is expanded, the model of calling the
     * {@code Gtk.TreeListModelCreateModelFunc} for the row's
     * item will be inserted after this row. If a row is collapsed,
     * those items will be removed from the model.
     * <p>
     * If the row is not expandable, this function does nothing.
     */
    public @NotNull void setExpanded(@NotNull boolean expanded) {
        try {
            gtk_tree_list_row_set_expanded.invokeExact(handle(), expanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
