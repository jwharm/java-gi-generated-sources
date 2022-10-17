package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about an annotation.
 */
public class DBusAnnotationInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusAnnotationInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_dbus_annotation_info_ref = Interop.downcallHandle(
        "g_dbus_annotation_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public @NotNull DBusAnnotationInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_annotation_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusAnnotationInfo(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_dbus_annotation_info_unref = Interop.downcallHandle(
        "g_dbus_annotation_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public @NotNull void unref() {
        try {
            g_dbus_annotation_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_annotation_info_lookup = Interop.downcallHandle(
        "g_dbus_annotation_info_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the value of an annotation.
     * <p>
     * The cost of this function is O(n) in number of annotations.
     */
    public static @Nullable java.lang.String lookup(@Nullable DBusAnnotationInfo[] annotations, @NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_annotation_info_lookup.invokeExact(Interop.allocateNativeArray(annotations), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
