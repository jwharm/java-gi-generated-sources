package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public interface PhysMemoryAllocator extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysMemoryAllocatorImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PhysMemoryAllocatorImpl(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_phys_memory_allocator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_phys_memory_allocator_get_type = Interop.downcallHandle(
                "gst_phys_memory_allocator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The PhysMemoryAllocatorImpl type represents a native instance of the PhysMemoryAllocator interface.
     */
    class PhysMemoryAllocatorImpl extends org.gtk.gobject.GObject implements PhysMemoryAllocator {
        
        static {
            GstAllocators.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of PhysMemoryAllocator for the provided memory address.
         * @param address the memory address of the instance
         */
        public PhysMemoryAllocatorImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_phys_memory_allocator_get_type != null;
    }
}
