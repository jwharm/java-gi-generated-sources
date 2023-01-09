package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ScaledFont extends Struct {
    
    static {
        Cairo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "cairo_scaled_font_t";
    
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
     * Allocate a new {@link ScaledFont}
     * @return A new, uninitialized @{link ScaledFont}
     */
    public static ScaledFont allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ScaledFont newInstance = new ScaledFont(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ScaledFont proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ScaledFont(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ScaledFont> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ScaledFont(input);
}
