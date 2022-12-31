package org.gstreamer.allocators;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public interface PhysMemoryAllocator extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysMemoryAllocatorImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PhysMemoryAllocatorImpl(input, ownership);
    
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
    
    class PhysMemoryAllocatorImpl extends org.gtk.gobject.GObject implements PhysMemoryAllocator {
        
        static {
            GstAllocators.javagi$ensureInitialized();
        }
        
        public PhysMemoryAllocatorImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
