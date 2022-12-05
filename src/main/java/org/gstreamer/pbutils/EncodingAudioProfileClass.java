package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EncodingAudioProfileClass extends Struct {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingAudioProfileClass";
    
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
     * Allocate a new {@link EncodingAudioProfileClass}
     * @return A new, uninitialized @{link EncodingAudioProfileClass}
     */
    public static EncodingAudioProfileClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EncodingAudioProfileClass newInstance = new EncodingAudioProfileClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EncodingAudioProfileClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EncodingAudioProfileClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
