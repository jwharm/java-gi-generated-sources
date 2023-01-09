package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PhysicalDevice16BitStorageFeatures extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkPhysicalDevice16BitStorageFeatures";
    
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
     * Allocate a new {@link PhysicalDevice16BitStorageFeatures}
     * @return A new, uninitialized @{link PhysicalDevice16BitStorageFeatures}
     */
    public static PhysicalDevice16BitStorageFeatures allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PhysicalDevice16BitStorageFeatures newInstance = new PhysicalDevice16BitStorageFeatures(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PhysicalDevice16BitStorageFeatures proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PhysicalDevice16BitStorageFeatures(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PhysicalDevice16BitStorageFeatures> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PhysicalDevice16BitStorageFeatures(input);
}
