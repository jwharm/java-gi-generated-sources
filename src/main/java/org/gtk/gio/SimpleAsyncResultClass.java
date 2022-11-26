package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SimpleAsyncResultClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleAsyncResultClass";
    
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
     * Allocate a new {@link SimpleAsyncResultClass}
     * @return A new, uninitialized @{link SimpleAsyncResultClass}
     */
    public static SimpleAsyncResultClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SimpleAsyncResultClass newInstance = new SimpleAsyncResultClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SimpleAsyncResultClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SimpleAsyncResultClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SimpleAsyncResultClass struct;
        
         /**
         * A {@link SimpleAsyncResultClass.Build} object constructs a {@link SimpleAsyncResultClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SimpleAsyncResultClass.allocate();
        }
        
         /**
         * Finish building the {@link SimpleAsyncResultClass} struct.
         * @return A new instance of {@code SimpleAsyncResultClass} with the fields 
         *         that were set in the Build object.
         */
        public SimpleAsyncResultClass construct() {
            return struct;
        }
    }
}
