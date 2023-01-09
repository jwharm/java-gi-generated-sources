package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code Gio.ListModel} representing values of a given enum.
 * <p>
 * {@code AdwEnumListModel} contains objects of type {@link EnumListItem}.
 * @version 1.0
 */
public class EnumListModel extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwEnumListModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EnumListModel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EnumListModel(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EnumListModel> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EnumListModel(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type enumType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_enum_list_model_new.invokeExact(enumType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwEnumListModel} for {@code enum_type}.
     * @param enumType the type of the enum to construct the model from
     */
    public EnumListModel(org.gtk.glib.Type enumType) {
        super(constructNew(enumType));
        this.takeOwnership();
    }
    
    /**
     * Finds the position of a given enum value in {@code self}.
     * @param value an enum value
     */
    public int findPosition(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_enum_list_model_find_position.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the type of the enum represented by {@code self}.
     * @return the enum type
     */
    public org.gtk.glib.Type getEnumType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_enum_list_model_get_enum_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_enum_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EnumListModel.Builder} object constructs a {@link EnumListModel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EnumListModel.Builder#build()}. 
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
         * Finish building the {@link EnumListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EnumListModel}.
         * @return A new instance of {@code EnumListModel} with the properties 
         *         that were set in the Builder object.
         */
        public EnumListModel build() {
            return (EnumListModel) org.gtk.gobject.GObject.newWithProperties(
                EnumListModel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The type of the enum represented by the model.
         * @param enumType The value for the {@code enum-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnumType(org.gtk.glib.Type enumType) {
            names.add("enum-type");
            values.add(org.gtk.gobject.Value.create(enumType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_enum_list_model_new = Interop.downcallHandle(
                "adw_enum_list_model_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle adw_enum_list_model_find_position = Interop.downcallHandle(
                "adw_enum_list_model_find_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_enum_list_model_get_enum_type = Interop.downcallHandle(
                "adw_enum_list_model_get_enum_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_enum_list_model_get_type = Interop.downcallHandle(
                "adw_enum_list_model_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_enum_list_model_get_type != null;
    }
}
