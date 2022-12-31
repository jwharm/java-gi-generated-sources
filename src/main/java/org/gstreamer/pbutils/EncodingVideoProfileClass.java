package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EncodingVideoProfileClass extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingVideoProfileClass";
    
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
     * Allocate a new {@link EncodingVideoProfileClass}
     * @return A new, uninitialized @{link EncodingVideoProfileClass}
     */
    public static EncodingVideoProfileClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EncodingVideoProfileClass newInstance = new EncodingVideoProfileClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EncodingVideoProfileClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EncodingVideoProfileClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EncodingVideoProfileClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EncodingVideoProfileClass(input, ownership);
}
