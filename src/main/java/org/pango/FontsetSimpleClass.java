package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontsetSimpleClass extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontsetSimpleClass";
    
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
     * Allocate a new {@link FontsetSimpleClass}
     * @return A new, uninitialized @{link FontsetSimpleClass}
     */
    public static FontsetSimpleClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontsetSimpleClass newInstance = new FontsetSimpleClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FontsetSimpleClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontsetSimpleClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
