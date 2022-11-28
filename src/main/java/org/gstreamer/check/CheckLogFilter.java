package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque structure containing data about a log filter
 * function.
 */
public class CheckLogFilter extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCheckLogFilter";
    
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
     * Allocate a new {@link CheckLogFilter}
     * @return A new, uninitialized @{link CheckLogFilter}
     */
    public static CheckLogFilter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CheckLogFilter newInstance = new CheckLogFilter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CheckLogFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CheckLogFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CheckLogFilter struct;
        
         /**
         * A {@link CheckLogFilter.Build} object constructs a {@link CheckLogFilter} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CheckLogFilter.allocate();
        }
        
         /**
         * Finish building the {@link CheckLogFilter} struct.
         * @return A new instance of {@code CheckLogFilter} with the fields 
         *         that were set in the Build object.
         */
        public CheckLogFilter construct() {
            return struct;
        }
    }
}
