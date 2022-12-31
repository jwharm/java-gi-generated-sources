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
public class TreeListRow extends org.gtk.gobject.GObject {
    
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
    protected TreeListRow(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeListRow> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeListRow(input, ownership);
    
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
        return (org.gtk.gtk.TreeListRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeListRow.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return (org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.ListModel.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the item corresponding to this row,
     * <p>
     * The value returned by this function never changes until the
     * row is destroyed.
     * @return The item
     *   of this row or {@code null} when the row was destroyed
     */
    public @Nullable org.gtk.gobject.GObject getItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_get_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.GObject.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return (org.gtk.gtk.TreeListRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeListRow.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
                    Marshal.booleanToInteger.marshal(expanded, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_tree_list_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TreeListRow.Builder} object constructs a {@link TreeListRow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeListRow.Builder#build()}. 
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
         * Finish building the {@link TreeListRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeListRow}.
         * @return A new instance of {@code TreeListRow} with the properties 
         *         that were set in the Builder object.
         */
        public TreeListRow build() {
            return (TreeListRow) org.gtk.gobject.GObject.newWithProperties(
                TreeListRow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The model holding the row's children.
         * @param children The value for the {@code children} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChildren(org.gtk.gio.ListModel children) {
            names.add("children");
            values.add(org.gtk.gobject.Value.create(children));
            return this;
        }
        
        /**
         * The depth in the tree of this row.
         * @param depth The value for the {@code depth} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDepth(int depth) {
            names.add("depth");
            values.add(org.gtk.gobject.Value.create(depth));
            return this;
        }
        
        /**
         * If this row can ever be expanded.
         * @param expandable The value for the {@code expandable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExpandable(boolean expandable) {
            names.add("expandable");
            values.add(org.gtk.gobject.Value.create(expandable));
            return this;
        }
        
        /**
         * If this row is currently expanded.
         * @param expanded The value for the {@code expanded} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExpanded(boolean expanded) {
            names.add("expanded");
            values.add(org.gtk.gobject.Value.create(expanded));
            return this;
        }
        
        /**
         * The item held in this row.
         * @param item The value for the {@code item} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItem(org.gtk.gobject.GObject item) {
            names.add("item");
            values.add(org.gtk.gobject.Value.create(item));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_list_row_get_child_row = Interop.downcallHandle(
            "gtk_tree_list_row_get_child_row",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_children = Interop.downcallHandle(
            "gtk_tree_list_row_get_children",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_depth = Interop.downcallHandle(
            "gtk_tree_list_row_get_depth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_expanded = Interop.downcallHandle(
            "gtk_tree_list_row_get_expanded",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_item = Interop.downcallHandle(
            "gtk_tree_list_row_get_item",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_parent = Interop.downcallHandle(
            "gtk_tree_list_row_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_position = Interop.downcallHandle(
            "gtk_tree_list_row_get_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_is_expandable = Interop.downcallHandle(
            "gtk_tree_list_row_is_expandable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_set_expanded = Interop.downcallHandle(
            "gtk_tree_list_row_set_expanded",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_get_type = Interop.downcallHandle(
            "gtk_tree_list_row_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
