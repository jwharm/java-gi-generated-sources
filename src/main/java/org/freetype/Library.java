package org.freetype;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Library extends Struct {
    
    static {
        Freetype2.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "FT_Library";
    
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
     * Allocate a new {@link Library}
     * @return A new, uninitialized @{link Library}
     */
    public static Library allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Library newInstance = new Library(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Library proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Library(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
