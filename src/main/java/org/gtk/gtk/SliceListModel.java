package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSliceListModel} is a list model that presents a slice of another model.
 * <p>
 * This is useful when implementing paging by setting the size to the number
 * of elements per page and updating the offset whenever a different page is
 * opened.
 */
public class SliceListModel extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSliceListModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SliceListModel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SliceListModel(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SliceListModel> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SliceListModel(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gio.ListModel model, int offset, int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_slice_list_model_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new slice model.
     * <p>
     * It presents the slice from {@code offset} to offset + {@code size}
     * of the given {@code model}.
     * @param model The model to use
     * @param offset the offset of the slice
     * @param size maximum size of the slice
     */
    public SliceListModel(@Nullable org.gtk.gio.ListModel model, int offset, int size) {
        super(constructNew(model, offset, size));
        this.takeOwnership();
    }
    
    /**
     * Gets the model that is currently being used or {@code null} if none.
     * @return The model in use
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_slice_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the offset set via gtk_slice_list_model_set_offset().
     * @return The offset
     */
    public int getOffset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_slice_list_model_get_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size set via gtk_slice_list_model_set_size().
     * @return The size
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_slice_list_model_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the model to show a slice of.
     * <p>
     * The model's item type must conform to {@code self}'s item type.
     * @param model The model to be sliced
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_slice_list_model_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the offset into the original model for this slice.
     * <p>
     * If the offset is too large for the sliced model,
     * {@code self} will end up empty.
     * @param offset the new offset to use
     */
    public void setOffset(int offset) {
        try {
            DowncallHandles.gtk_slice_list_model_set_offset.invokeExact(
                    handle(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum size. {@code self} will never have more items
     * than {@code size}.
     * <p>
     * It can however have fewer items if the offset is too large
     * or the model sliced from doesn't have enough items.
     * @param size the maximum size
     */
    public void setSize(int size) {
        try {
            DowncallHandles.gtk_slice_list_model_set_size.invokeExact(
                    handle(),
                    size);
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
            RESULT = (long) DowncallHandles.gtk_slice_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SliceListModel.Builder} object constructs a {@link SliceListModel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SliceListModel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SliceListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SliceListModel}.
         * @return A new instance of {@code SliceListModel} with the properties 
         *         that were set in the Builder object.
         */
        public SliceListModel build() {
            return (SliceListModel) org.gtk.gobject.GObject.newWithProperties(
                SliceListModel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
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
         * Child model to take slice from.
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
         * Offset of slice.
         * @param offset The value for the {@code offset} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(int offset) {
            names.add("offset");
            values.add(org.gtk.gobject.Value.create(offset));
            return this;
        }
        
        /**
         * Maximum size of slice.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_slice_list_model_new = Interop.downcallHandle(
                "gtk_slice_list_model_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_slice_list_model_get_model = Interop.downcallHandle(
                "gtk_slice_list_model_get_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_slice_list_model_get_offset = Interop.downcallHandle(
                "gtk_slice_list_model_get_offset",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_slice_list_model_get_size = Interop.downcallHandle(
                "gtk_slice_list_model_get_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_slice_list_model_set_model = Interop.downcallHandle(
                "gtk_slice_list_model_set_model",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_slice_list_model_set_offset = Interop.downcallHandle(
                "gtk_slice_list_model_set_offset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_slice_list_model_set_size = Interop.downcallHandle(
                "gtk_slice_list_model_set_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_slice_list_model_get_type = Interop.downcallHandle(
                "gtk_slice_list_model_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_slice_list_model_get_type != null;
    }
}
