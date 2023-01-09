package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ShadingRatePaletteNV extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkShadingRatePaletteNV";
    
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
     * Allocate a new {@link ShadingRatePaletteNV}
     * @return A new, uninitialized @{link ShadingRatePaletteNV}
     */
    public static ShadingRatePaletteNV allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ShadingRatePaletteNV newInstance = new ShadingRatePaletteNV(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ShadingRatePaletteNV proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ShadingRatePaletteNV(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShadingRatePaletteNV> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShadingRatePaletteNV(input);
}
