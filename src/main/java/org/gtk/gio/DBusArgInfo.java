package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about an argument for a method or a signal.
 */
public class DBusArgInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusArgInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_dbus_arg_info_ref = Interop.downcallHandle(
        "g_dbus_arg_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public @NotNull DBusArgInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_arg_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusArgInfo(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_dbus_arg_info_unref = Interop.downcallHandle(
        "g_dbus_arg_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public @NotNull void unref() {
        try {
            g_dbus_arg_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
