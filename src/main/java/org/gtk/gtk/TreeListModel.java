package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkTreeListModel} is a list model that can create child models on demand.
 */
public class TreeListModel extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeListModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TreeListModel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeListModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeListModel> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeListModel(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, org.gtk.gtk.TreeListModelCreateModelFunc createFunc, org.gtk.glib.DestroyNotify userDestroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_model_new.invokeExact(
                    root.handle(),
                    Marshal.booleanToInteger.marshal(passthrough, null).intValue(),
                    Marshal.booleanToInteger.marshal(autoexpand, null).intValue(),
                    (Addressable) createFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDestroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        root.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkTreeListModel} displaying {@code root}
     * with all rows collapsed.
     * @param root The {@code GListModel} to use as root
     * @param passthrough {@code true} to pass through items from the models
     * @param autoexpand {@code true} to set the autoexpand property and expand the {@code root} model
     * @param createFunc Function to call to create the {@code GListModel} for the children
     *   of an item
     * @param userDestroy Function to call to free {@code user_data}
     */
    public TreeListModel(org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, org.gtk.gtk.TreeListModelCreateModelFunc createFunc, org.gtk.glib.DestroyNotify userDestroy) {
        super(constructNew(root, passthrough, autoexpand, createFunc, userDestroy), Ownership.FULL);
    }
    
    /**
     * Gets whether the model is set to automatically expand new rows
     * that get added.
     * <p>
     * This can be either rows added by changes to the underlying
     * models or via {@link TreeListRow#setExpanded}.
     * @return {@code true} if the model is set to autoexpand
     */
    public boolean getAutoexpand() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_list_model_get_autoexpand.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the row item corresponding to the child at index {@code position} for
     * {@code self}'s root model.
     * <p>
     * If {@code position} is greater than the number of children in the root model,
     * {@code null} is returned.
     * <p>
     * Do not confuse this function with {@link TreeListModel#getRow}.
     * @param position position of the child to get
     * @return the child in {@code position}
     */
    public @Nullable org.gtk.gtk.TreeListRow getChildRow(int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_model_get_child_row.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeListRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeListRow.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the root model that {@code self} was created with.
     * @return the root model
     */
    public org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_model_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.ListModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the model is passing through original row items.
     * <p>
     * If this function returns {@code false}, the {@code GListModel} functions for {@code self}
     * return custom {@code GtkTreeListRow} objects. You need to call
     * {@link TreeListRow#getItem} on these objects to get the original
     * item.
     * <p>
     * If {@code true}, the values of the child models are passed through in their
     * original state. You then need to call {@link TreeListModel#getRow}
     * to get the custom {@code GtkTreeListRow}s.
     * @return {@code true} if the model is passing through original row items
     */
    public boolean getPassthrough() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_list_model_get_passthrough.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the row object for the given row.
     * <p>
     * If {@code position} is greater than the number of items in {@code self},
     * {@code null} is returned.
     * <p>
     * The row object can be used to expand and collapse rows as
     * well as to inspect its position in the tree. See its
     * documentation for details.
     * <p>
     * This row object is persistent and will refer to the current
     * item as long as the row is present in {@code self}, independent of
     * other rows being added or removed.
     * <p>
     * If {@code self} is set to not be passthrough, this function is
     * equivalent to calling g_list_model_get_item().
     * <p>
     * Do not confuse this function with {@link TreeListModel#getChildRow}.
     * @param position the position of the row to fetch
     * @return The row item
     */
    public @Nullable org.gtk.gtk.TreeListRow getRow(int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_model_get_row.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeListRow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeListRow.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets whether the model should autoexpand.
     * <p>
     * If set to {@code true}, the model will recursively expand all rows that
     * get added to the model. This can be either rows added by changes
     * to the underlying models or via {@link TreeListRow#setExpanded}.
     * @param autoexpand {@code true} to make the model autoexpand its rows
     */
    public void setAutoexpand(boolean autoexpand) {
        try {
            DowncallHandles.gtk_tree_list_model_set_autoexpand.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(autoexpand, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_tree_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TreeListModel.Builder} object constructs a {@link TreeListModel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeListModel.Builder#build()}. 
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
         * Finish building the {@link TreeListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeListModel}.
         * @return A new instance of {@code TreeListModel} with the properties 
         *         that were set in the Builder object.
         */
        public TreeListModel build() {
            return (TreeListModel) org.gtk.gobject.GObject.newWithProperties(
                TreeListModel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If all rows should be expanded by default.
         * @param autoexpand The value for the {@code autoexpand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAutoexpand(boolean autoexpand) {
            names.add("autoexpand");
            values.add(org.gtk.gobject.Value.create(autoexpand));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The root model displayed.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
        
        /**
         * Gets whether the model is in passthrough mode.
         * <p>
         * If {@code false}, the {@code GListModel} functions for this object return custom
         * {@link TreeListRow} objects. If {@code true}, the values of the child
         * models are pass through unmodified.
         * @param passthrough The value for the {@code passthrough} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPassthrough(boolean passthrough) {
            names.add("passthrough");
            values.add(org.gtk.gobject.Value.create(passthrough));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_list_model_new = Interop.downcallHandle(
            "gtk_tree_list_model_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_model_get_autoexpand = Interop.downcallHandle(
            "gtk_tree_list_model_get_autoexpand",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_model_get_child_row = Interop.downcallHandle(
            "gtk_tree_list_model_get_child_row",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_list_model_get_model = Interop.downcallHandle(
            "gtk_tree_list_model_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_model_get_passthrough = Interop.downcallHandle(
            "gtk_tree_list_model_get_passthrough",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_model_get_row = Interop.downcallHandle(
            "gtk_tree_list_model_get_row",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_list_model_set_autoexpand = Interop.downcallHandle(
            "gtk_tree_list_model_set_autoexpand",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_list_model_get_type = Interop.downcallHandle(
            "gtk_tree_list_model_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
