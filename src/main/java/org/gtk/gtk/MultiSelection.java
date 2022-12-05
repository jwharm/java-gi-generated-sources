package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMultiSelection} is a {@code GtkSelectionModel} that allows selecting multiple
 * elements.
 */
public class MultiSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, org.gtk.gtk.SelectionModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMultiSelection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MultiSelection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MultiSelection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MultiSelection if its GType is a (or inherits from) "GtkMultiSelection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MultiSelection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMultiSelection", a ClassCastException will be thrown.
     */
    public static MultiSelection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), MultiSelection.getType())) {
            return new MultiSelection(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMultiSelection");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gio.ListModel model) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_multi_selection_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     * @param model the {@code GListModel} to manage
     */
    public MultiSelection(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model), Ownership.FULL);
    }
    
    /**
     * Returns the underlying model of {@code self}.
     * @return the underlying model
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_multi_selection_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, {@code self} will be empty.
     * @param model A {@code GListModel} to wrap
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_multi_selection_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
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
            RESULT = (long) DowncallHandles.gtk_multi_selection_get_type.invokeExact();
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
         * A {@link MultiSelection.Build} object constructs a {@link MultiSelection} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MultiSelection} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MultiSelection} using {@link MultiSelection#castFrom}.
         * @return A new instance of {@code MultiSelection} with the properties 
         *         that were set in the Build object.
         */
        public MultiSelection construct() {
            return MultiSelection.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MultiSelection.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
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
         * The list managed by this selection.
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
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_multi_selection_new = Interop.downcallHandle(
            "gtk_multi_selection_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_multi_selection_get_model = Interop.downcallHandle(
            "gtk_multi_selection_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_multi_selection_set_model = Interop.downcallHandle(
            "gtk_multi_selection_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_multi_selection_get_type = Interop.downcallHandle(
            "gtk_multi_selection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
