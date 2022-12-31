package org.freetype;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Bitmap extends Struct {
    
    static {
        Freetype2.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "FT_Bitmap";
    
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
     * Allocate a new {@link Bitmap}
     * @return A new, uninitialized @{link Bitmap}
     */
    public static Bitmap allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Bitmap newInstance = new Bitmap(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Bitmap proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Bitmap(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Bitmap> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Bitmap(input, ownership);
}
