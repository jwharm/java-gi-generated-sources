package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Device extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Cairo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "cairo_device_t";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Device allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Device newInstance = new Device(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Device proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Device(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
