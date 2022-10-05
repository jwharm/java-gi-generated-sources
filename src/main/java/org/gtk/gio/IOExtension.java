package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link IOExtension} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtension extends io.github.jwharm.javagi.ResourceBase {

    public IOExtension(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_io_extension_get_name = Interop.downcallHandle(
        "g_io_extension_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name under which {@code extension} was registered.
     * <p>
     * Note that the same type may be registered as extension
     * for multiple extension points, under different names.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) g_io_extension_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_get_priority = Interop.downcallHandle(
        "g_io_extension_get_priority",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the priority with which {@code extension} was registered.
     */
    public int getPriority() {
        try {
            var RESULT = (int) g_io_extension_get_priority.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_get_type = Interop.downcallHandle(
        "g_io_extension_get_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type associated with {@code extension}.
     */
    public org.gtk.gobject.Type getType() {
        try {
            var RESULT = (long) g_io_extension_get_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_io_extension_ref_class = Interop.downcallHandle(
        "g_io_extension_ref_class",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a reference to the class for the type that is
     * associated with {@code extension}.
     */
    public org.gtk.gobject.TypeClass refClass() {
        try {
            var RESULT = (MemoryAddress) g_io_extension_ref_class.invokeExact(handle());
            return new org.gtk.gobject.TypeClass(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
