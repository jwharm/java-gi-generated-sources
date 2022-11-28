package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque consistency checker handle.
 */
public class StreamConsistency extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamConsistency";
    
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
     * Allocate a new {@link StreamConsistency}
     * @return A new, uninitialized @{link StreamConsistency}
     */
    public static StreamConsistency allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        StreamConsistency newInstance = new StreamConsistency(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a StreamConsistency proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StreamConsistency(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private StreamConsistency struct;
        
         /**
         * A {@link StreamConsistency.Build} object constructs a {@link StreamConsistency} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = StreamConsistency.allocate();
        }
        
         /**
         * Finish building the {@link StreamConsistency} struct.
         * @return A new instance of {@code StreamConsistency} with the fields 
         *         that were set in the Build object.
         */
        public StreamConsistency construct() {
            return struct;
        }
    }
}
