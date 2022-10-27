package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link IOExtension} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtension extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public IOExtension(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Gets the name under which {@code extension} was registered.
     * <p>
     * Note that the same type may be registered as extension
     * for multiple extension points, under different names.
     * @return the name of {@code extension}.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the priority with which {@code extension} was registered.
     * @return the priority of {@code extension}
     */
    public int getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_extension_get_priority.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the type associated with {@code extension}.
     * @return the type of {@code extension}
     */
    public @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_io_extension_get_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets a reference to the class for the type that is
     * associated with {@code extension}.
     * @return the {@link org.gtk.gobject.TypeClass} for the type of {@code extension}
     */
    public @NotNull org.gtk.gobject.TypeClass refClass() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_ref_class.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeClass(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_extension_get_name = Interop.downcallHandle(
            "g_io_extension_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_io_extension_get_priority = Interop.downcallHandle(
            "g_io_extension_get_priority",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_io_extension_get_type = Interop.downcallHandle(
            "g_io_extension_get_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_io_extension_ref_class = Interop.downcallHandle(
            "g_io_extension_ref_class",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
