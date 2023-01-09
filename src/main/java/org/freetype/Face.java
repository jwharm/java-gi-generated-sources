package org.freetype;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Face extends Struct {
    
    static {
        Freetype2.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "FT_Face";
    
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
     * Allocate a new {@link Face}
     * @return A new, uninitialized @{link Face}
     */
    public static Face allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Face newInstance = new Face(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Face proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Face(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Face> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Face(input);
}
