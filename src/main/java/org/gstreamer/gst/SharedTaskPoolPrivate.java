package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SharedTaskPoolPrivate extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSharedTaskPoolPrivate";
    
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
     * Allocate a new {@link SharedTaskPoolPrivate}
     * @return A new, uninitialized @{link SharedTaskPoolPrivate}
     */
    public static SharedTaskPoolPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SharedTaskPoolPrivate newInstance = new SharedTaskPoolPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SharedTaskPoolPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SharedTaskPoolPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SharedTaskPoolPrivate struct;
        
         /**
         * A {@link SharedTaskPoolPrivate.Build} object constructs a {@link SharedTaskPoolPrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SharedTaskPoolPrivate.allocate();
        }
        
         /**
         * Finish building the {@link SharedTaskPoolPrivate} struct.
         * @return A new instance of {@code SharedTaskPoolPrivate} with the fields 
         *         that were set in the Build object.
         */
        public SharedTaskPoolPrivate construct() {
            return struct;
        }
    }
}
