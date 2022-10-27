package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code AdwEnumListItem} is the type of items in a {@link EnumListModel}.
 * @version 1.0
 */
public class EnumListItem extends org.gtk.gobject.Object {
    
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
    
    public EnumListItem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EnumListItem */
    public static EnumListItem castFrom(org.gtk.gobject.Object gobject) {
        return new EnumListItem(gobject.refcounted());
    }
    
    /**
     * Gets the enum value name.
     * @return the enum value name
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_enum_list_item_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the enum value nick.
     * @return the enum value nick
     */
    public @NotNull java.lang.String getNick() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_enum_list_item_get_nick.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the enum value.
     * @return the enum value
     */
    public int getValue() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_enum_list_item_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_enum_list_item_get_name = Interop.downcallHandle(
            "adw_enum_list_item_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_enum_list_item_get_nick = Interop.downcallHandle(
            "adw_enum_list_item_get_nick",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_enum_list_item_get_value = Interop.downcallHandle(
            "adw_enum_list_item_get_value",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
