package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The opaque {@link DeviceProviderFactoryClass} data structure.
 * @version 1.4
 */
public class DeviceProviderFactoryClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceProviderFactoryClass";
    
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
     * Allocate a new {@link DeviceProviderFactoryClass}
     * @return A new, uninitialized @{link DeviceProviderFactoryClass}
     */
    public static DeviceProviderFactoryClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DeviceProviderFactoryClass newInstance = new DeviceProviderFactoryClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DeviceProviderFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DeviceProviderFactoryClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceProviderFactoryClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DeviceProviderFactoryClass(input);
}
