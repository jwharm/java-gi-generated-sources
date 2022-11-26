package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure that represents a keyed data list.
 * <p>
 * See also: [Keyed data lists][glib-Keyed-Data-Lists].
 */
public class Data extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GData";
    
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
     * Allocate a new {@link Data}
     * @return A new, uninitialized @{link Data}
     */
    public static Data allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Data newInstance = new Data(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Data proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Data(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Data struct;
        
         /**
         * A {@link Data.Build} object constructs a {@link Data} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Data.allocate();
        }
        
         /**
         * Finish building the {@link Data} struct.
         * @return A new instance of {@code Data} with the fields 
         *         that were set in the Build object.
         */
        public Data construct() {
            return struct;
        }
    }
}
