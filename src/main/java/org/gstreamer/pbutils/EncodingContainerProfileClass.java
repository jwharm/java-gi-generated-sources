package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EncodingContainerProfileClass extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingContainerProfileClass";
    
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
     * Allocate a new {@link EncodingContainerProfileClass}
     * @return A new, uninitialized @{link EncodingContainerProfileClass}
     */
    public static EncodingContainerProfileClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EncodingContainerProfileClass newInstance = new EncodingContainerProfileClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EncodingContainerProfileClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EncodingContainerProfileClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
