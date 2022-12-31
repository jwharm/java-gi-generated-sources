package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TracerFactoryClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTracerFactoryClass";
    
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
     * Allocate a new {@link TracerFactoryClass}
     * @return A new, uninitialized @{link TracerFactoryClass}
     */
    public static TracerFactoryClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TracerFactoryClass newInstance = new TracerFactoryClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TracerFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TracerFactoryClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TracerFactoryClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TracerFactoryClass(input, ownership);
}
