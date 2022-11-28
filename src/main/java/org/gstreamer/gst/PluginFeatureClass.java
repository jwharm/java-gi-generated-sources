package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PluginFeatureClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginFeatureClass";
    
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
     * Allocate a new {@link PluginFeatureClass}
     * @return A new, uninitialized @{link PluginFeatureClass}
     */
    public static PluginFeatureClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PluginFeatureClass newInstance = new PluginFeatureClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PluginFeatureClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PluginFeatureClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PluginFeatureClass struct;
        
         /**
         * A {@link PluginFeatureClass.Build} object constructs a {@link PluginFeatureClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PluginFeatureClass.allocate();
        }
        
         /**
         * Finish building the {@link PluginFeatureClass} struct.
         * @return A new instance of {@code PluginFeatureClass} with the fields 
         *         that were set in the Build object.
         */
        public PluginFeatureClass construct() {
            return struct;
        }
    }
}
