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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "EnumListModel" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwEnumListModel", a ClassCastException will be thrown.
     */
    public static EnumListModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwEnumListModel"))) {
            return new EnumListModel(gobject.handle(), gobject.refcounted().getOwnership());
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_enum_list_model_new = Interop.downcallHandle(
            "adw_enum_list_model_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle adw_enum_list_model_find_position = Interop.downcallHandle(
            "adw_enum_list_model_find_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_enum_list_model_get_enum_type = Interop.downcallHandle(
            "adw_enum_list_model_get_enum_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
    }
}
