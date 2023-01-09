package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ObjectEntryUsageFlagBitsNVX extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkObjectEntryUsageFlagBitsNVX";
    
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
     * Allocate a new {@link ObjectEntryUsageFlagBitsNVX}
     * @return A new, uninitialized @{link ObjectEntryUsageFlagBitsNVX}
     */
    public static ObjectEntryUsageFlagBitsNVX allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ObjectEntryUsageFlagBitsNVX newInstance = new ObjectEntryUsageFlagBitsNVX(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ObjectEntryUsageFlagBitsNVX proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ObjectEntryUsageFlagBitsNVX(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ObjectEntryUsageFlagBitsNVX> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ObjectEntryUsageFlagBitsNVX(input);
}
