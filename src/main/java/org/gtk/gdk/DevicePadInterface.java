package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DevicePadInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDevicePadInterface";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DevicePadInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DevicePadInterface newInstance = new DevicePadInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DevicePadInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DevicePadInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}