package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FilterCubicImageViewImageFormatPropertiesEXT extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkFilterCubicImageViewImageFormatPropertiesEXT";
    
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
     * Allocate a new {@link FilterCubicImageViewImageFormatPropertiesEXT}
     * @return A new, uninitialized @{link FilterCubicImageViewImageFormatPropertiesEXT}
     */
    public static FilterCubicImageViewImageFormatPropertiesEXT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FilterCubicImageViewImageFormatPropertiesEXT newInstance = new FilterCubicImageViewImageFormatPropertiesEXT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FilterCubicImageViewImageFormatPropertiesEXT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FilterCubicImageViewImageFormatPropertiesEXT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FilterCubicImageViewImageFormatPropertiesEXT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FilterCubicImageViewImageFormatPropertiesEXT(input);
}
