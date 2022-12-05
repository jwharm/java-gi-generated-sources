package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ExportFenceCreateInfo extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkExportFenceCreateInfo";
    
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
     * Allocate a new {@link ExportFenceCreateInfo}
     * @return A new, uninitialized @{link ExportFenceCreateInfo}
     */
    public static ExportFenceCreateInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ExportFenceCreateInfo newInstance = new ExportFenceCreateInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ExportFenceCreateInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ExportFenceCreateInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
