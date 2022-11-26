package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FrameClockClass extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkFrameClockClass";
    
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
     * Allocate a new {@link FrameClockClass}
     * @return A new, uninitialized @{link FrameClockClass}
     */
    public static FrameClockClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FrameClockClass newInstance = new FrameClockClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FrameClockClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FrameClockClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FrameClockClass struct;
        
         /**
         * A {@link FrameClockClass.Build} object constructs a {@link FrameClockClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FrameClockClass.allocate();
        }
        
         /**
         * Finish building the {@link FrameClockClass} struct.
         * @return A new instance of {@code FrameClockClass} with the fields 
         *         that were set in the Build object.
         */
        public FrameClockClass construct() {
            return struct;
        }
    }
}
