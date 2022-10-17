package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code AdwEnumListItem} is the type of items in a {@link EnumListModel}.
 */
public class EnumListItem extends org.gtk.gobject.Object {

    public EnumListItem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EnumListItem */
    public static EnumListItem castFrom(org.gtk.gobject.Object gobject) {
        return new EnumListItem(gobject.refcounted());
    }
    
    private static final MethodHandle adw_enum_list_item_get_name = Interop.downcallHandle(
        "adw_enum_list_item_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the enum value name.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_enum_list_item_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_enum_list_item_get_nick = Interop.downcallHandle(
        "adw_enum_list_item_get_nick",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the enum value nick.
     */
    public @NotNull java.lang.String getNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_enum_list_item_get_nick.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_enum_list_item_get_value = Interop.downcallHandle(
        "adw_enum_list_item_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the enum value.
     */
    public int getValue() {
        int RESULT;
        try {
            RESULT = (int) adw_enum_list_item_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
