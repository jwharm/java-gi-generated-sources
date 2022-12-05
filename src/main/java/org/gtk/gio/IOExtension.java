package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link IOExtension} is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IOExtension extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOExtension";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IOExtension}
     * @return A new, uninitialized @{link IOExtension}
     */
    public static IOExtension allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOExtension newInstance = new IOExtension(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOExtension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IOExtension(Addressable address, Ownership ownership) {
        super(address, ownership);
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
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the priority with which {@code extension} was registered.
     * @return the priority of {@code extension}
     */
    public int getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_extension_get_priority.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.g_io_extension_get_type.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_io_extension_ref_class.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeClass(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_extension_get_name = Interop.downcallHandle(
            "g_io_extension_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_extension_get_priority = Interop.downcallHandle(
            "g_io_extension_get_priority",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_extension_get_type = Interop.downcallHandle(
            "g_io_extension_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_extension_ref_class = Interop.downcallHandle(
            "g_io_extension_ref_class",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
