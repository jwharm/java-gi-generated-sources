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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public EnumListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EnumListModel */
    public static EnumListModel castFrom(org.gtk.gobject.Object gobject) {
        return new EnumListModel(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Type enumType) {
        java.util.Objects.requireNonNull(enumType, "Parameter 'enumType' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_enum_list_model_new.invokeExact(enumType.getValue()), true);
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
        super(constructNew(enumType));
    }
    
    /**
     * Finds the position of a given enum value in {@code self}.
     * @param value an enum value
     */
    public int findPosition(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_enum_list_model_find_position.invokeExact(handle(), value);
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
            RESULT = (long) DowncallHandles.adw_enum_list_model_get_enum_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_enum_list_model_new = Interop.downcallHandle(
            "adw_enum_list_model_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle adw_enum_list_model_find_position = Interop.downcallHandle(
            "adw_enum_list_model_find_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_enum_list_model_get_enum_type = Interop.downcallHandle(
            "adw_enum_list_model_get_enum_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
    }
}
