package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code Gio.ListModel} representing values of a given enum.
 * <p>
 * {@code AdwEnumListModel} contains objects of type {@link EnumListItem}.
 */
public class EnumListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public EnumListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EnumListModel */
    public static EnumListModel castFrom(org.gtk.gobject.Object gobject) {
        return new EnumListModel(gobject.refcounted());
    }
    
    static final MethodHandle adw_enum_list_model_new = Interop.downcallHandle(
        "adw_enum_list_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(org.gtk.gobject.Type enumType) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_enum_list_model_new.invokeExact(enumType.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwEnumListModel} for {@code enum_type}.
     */
    public EnumListModel(org.gtk.gobject.Type enumType) {
        super(constructNew(enumType));
    }
    
    static final MethodHandle adw_enum_list_model_find_position = Interop.downcallHandle(
        "adw_enum_list_model_find_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Finds the position of a given enum value in {@code self}.
     */
    public int findPosition(int value) {
        try {
            var RESULT = (int) adw_enum_list_model_find_position.invokeExact(handle(), value);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_enum_list_model_get_enum_type = Interop.downcallHandle(
        "adw_enum_list_model_get_enum_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of the enum represented by {@code self}.
     */
    public org.gtk.gobject.Type getEnumType() {
        try {
            var RESULT = (long) adw_enum_list_model_get_enum_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
