package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkTreeListModel} is a list model that can create child models on demand.
 */
public class TreeListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
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
    @ApiStatus.Internal
    public TreeListModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TreeListModel if its GType is a (or inherits from) "GtkTreeListModel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TreeListModel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTreeListModel", a ClassCastException will be thrown.
     */
    public static TreeListModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), TreeListModel.getType())) {
            return new TreeListModel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTreeListModel");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, @NotNull org.gtk.gtk.TreeListModelCreateModelFunc createFunc) {
        java.util.Objects.requireNonNull(root, "Parameter 'root' must not be null");
        java.util.Objects.requireNonNull(createFunc, "Parameter 'createFunc' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_model_new.invokeExact(
                    root.handle(),
                    passthrough ? 1 : 0,
                    autoexpand ? 1 : 0,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTreeListModelCreateModelFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(createFunc)),
                    Interop.cbDestroyNotifySymbol());
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
     */
    public TreeListModel(@NotNull org.gtk.gio.ListModel root, boolean passthrough, boolean autoexpand, @NotNull org.gtk.gtk.TreeListModelCreateModelFunc createFunc) {
        super(constructNew(root, passthrough, autoexpand, createFunc), Ownership.FULL);
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
        return RESULT != 0;
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
        return new org.gtk.gtk.TreeListRow(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the root model that {@code self} was created with.
     * @return the root model
     */
    public @NotNull org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_model_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
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
        return RESULT != 0;
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
        return new org.gtk.gtk.TreeListRow(RESULT, Ownership.FULL);
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
                    autoexpand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link TreeListModel.Build} object constructs a {@link TreeListModel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TreeListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeListModel} using {@link TreeListModel#castFrom}.
         * @return A new instance of {@code TreeListModel} with the properties 
         *         that were set in the Build object.
         */
        public TreeListModel construct() {
            return TreeListModel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TreeListModel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If all rows should be expanded by default.
         * @param autoexpand The value for the {@code autoexpand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAutoexpand(boolean autoexpand) {
            names.add("autoexpand");
            values.add(org.gtk.gobject.Value.create(autoexpand));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The root model displayed.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNItems(int nItems) {
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
        public Build setPassthrough(boolean passthrough) {
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
