package org.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TextureLODGatherFormatPropertiesAMD extends Struct {
    
    static {
        Vulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "VkTextureLODGatherFormatPropertiesAMD";
    
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
     * Allocate a new {@link TextureLODGatherFormatPropertiesAMD}
     * @return A new, uninitialized @{link TextureLODGatherFormatPropertiesAMD}
     */
    public static TextureLODGatherFormatPropertiesAMD allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TextureLODGatherFormatPropertiesAMD newInstance = new TextureLODGatherFormatPropertiesAMD(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TextureLODGatherFormatPropertiesAMD proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextureLODGatherFormatPropertiesAMD(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextureLODGatherFormatPropertiesAMD> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextureLODGatherFormatPropertiesAMD(input);
}
