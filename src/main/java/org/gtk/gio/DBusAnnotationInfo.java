package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Information about an annotation.
 */
public class DBusAnnotationInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusAnnotationInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_dbus_annotation_info_ref = Interop.downcallHandle(
        "g_dbus_annotation_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusAnnotationInfo ref() {
        try {
            var RESULT = (MemoryAddress) g_dbus_annotation_info_ref.invokeExact(handle());
            return new DBusAnnotationInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_annotation_info_unref = Interop.downcallHandle(
        "g_dbus_annotation_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        try {
            g_dbus_annotation_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_annotation_info_lookup = Interop.downcallHandle(
        "g_dbus_annotation_info_lookup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the value of an annotation.
     * <p>
     * The cost of this function is O(n) in number of annotations.
     */
    public static java.lang.String lookup(DBusAnnotationInfo[] annotations, java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_dbus_annotation_info_lookup.invokeExact(Interop.allocateNativeArray(annotations).handle(), Interop.allocateNativeString(name).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
