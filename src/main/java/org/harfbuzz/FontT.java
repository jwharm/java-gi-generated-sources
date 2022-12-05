package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding fonts.
 */
public class FontT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_font_t";
    
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
     * Allocate a new {@link FontT}
     * @return A new, uninitialized @{link FontT}
     */
    public static FontT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontT newInstance = new FontT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FontT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
