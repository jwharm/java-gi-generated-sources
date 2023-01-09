package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SamplerYcbcrModelConversionKHR extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkSamplerYcbcrModelConversionKHR";
    
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
     * Allocate a new {@link SamplerYcbcrModelConversionKHR}
     * @return A new, uninitialized @{link SamplerYcbcrModelConversionKHR}
     */
    public static SamplerYcbcrModelConversionKHR allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SamplerYcbcrModelConversionKHR newInstance = new SamplerYcbcrModelConversionKHR(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SamplerYcbcrModelConversionKHR proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SamplerYcbcrModelConversionKHR(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SamplerYcbcrModelConversionKHR> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SamplerYcbcrModelConversionKHR(input);
}
