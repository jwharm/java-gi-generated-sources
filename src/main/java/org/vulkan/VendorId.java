package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VendorId extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkVendorId";
    
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
     * Allocate a new {@link VendorId}
     * @return A new, uninitialized @{link VendorId}
     */
    public static VendorId allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VendorId newInstance = new VendorId(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VendorId proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VendorId(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VendorId> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VendorId(input);
}
