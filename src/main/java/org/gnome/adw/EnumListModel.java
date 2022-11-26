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
public class EnumListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EnumListModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EnumListModel if its GType is a (or inherits from) "AdwEnumListModel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EnumListModel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwEnumListModel", a ClassCastException will be thrown.
     */
    public static EnumListModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), EnumListModel.getType())) {
            return new EnumListModel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwEnumListModel");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type enumType) {
        java.util.Objects.requireNonNull(enumType, "Parameter 'enumType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_enum_list_model_new.invokeExact(
                    enumType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwEnumListModel} for {@code enum_type}.
     * @param enumType the type of the enum to construct the model from
     */
    public EnumListModel(@NotNull org.gtk.glib.Type enumType) {
        super(constructNew(enumType), Ownership.FULL);
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
    public @NotNull org.gtk.glib.Type getEnumType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_enum_list_model_get_enum_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_enum_list_model_get_type.invokeExact();
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
         * A {@link EnumListModel.Build} object constructs a {@link EnumListModel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EnumListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EnumListModel} using {@link EnumListModel#castFrom}.
         * @return A new instance of {@code EnumListModel} with the properties 
         *         that were set in the Build object.
         */
        public EnumListModel construct() {
            return EnumListModel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EnumListModel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The type of the enum represented by the model.
         * @param enumType The value for the {@code enum-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnumType(org.gtk.glib.Type enumType) {
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
}
