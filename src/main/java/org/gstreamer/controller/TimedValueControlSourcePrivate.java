package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TimedValueControlSourcePrivate extends Struct {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTimedValueControlSourcePrivate";
    
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
     * Allocate a new {@link TimedValueControlSourcePrivate}
     * @return A new, uninitialized @{link TimedValueControlSourcePrivate}
     */
    public static TimedValueControlSourcePrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TimedValueControlSourcePrivate newInstance = new TimedValueControlSourcePrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TimedValueControlSourcePrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TimedValueControlSourcePrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TimedValueControlSourcePrivate struct;
        
         /**
         * A {@link TimedValueControlSourcePrivate.Build} object constructs a {@link TimedValueControlSourcePrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TimedValueControlSourcePrivate.allocate();
        }
        
         /**
         * Finish building the {@link TimedValueControlSourcePrivate} struct.
         * @return A new instance of {@code TimedValueControlSourcePrivate} with the fields 
         *         that were set in the Build object.
         */
        public TimedValueControlSourcePrivate construct() {
            return struct;
        }
    }
}
