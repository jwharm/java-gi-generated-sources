package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DynamicTypeFactoryClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDynamicTypeFactoryClass";
    
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
     * Allocate a new {@link DynamicTypeFactoryClass}
     * @return A new, uninitialized @{link DynamicTypeFactoryClass}
     */
    public static DynamicTypeFactoryClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DynamicTypeFactoryClass newInstance = new DynamicTypeFactoryClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DynamicTypeFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DynamicTypeFactoryClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DynamicTypeFactoryClass struct;
        
         /**
         * A {@link DynamicTypeFactoryClass.Build} object constructs a {@link DynamicTypeFactoryClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DynamicTypeFactoryClass.allocate();
        }
        
         /**
         * Finish building the {@link DynamicTypeFactoryClass} struct.
         * @return A new instance of {@code DynamicTypeFactoryClass} with the fields 
         *         that were set in the Build object.
         */
        public DynamicTypeFactoryClass construct() {
            return struct;
        }
    }
}
