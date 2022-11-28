package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The opaque {@link DeviceProviderFactoryClass} data structure.
 * @version 1.4
 */
public class DeviceProviderFactoryClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceProviderFactoryClass";
    
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
     * Allocate a new {@link DeviceProviderFactoryClass}
     * @return A new, uninitialized @{link DeviceProviderFactoryClass}
     */
    public static DeviceProviderFactoryClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DeviceProviderFactoryClass newInstance = new DeviceProviderFactoryClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DeviceProviderFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DeviceProviderFactoryClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DeviceProviderFactoryClass struct;
        
         /**
         * A {@link DeviceProviderFactoryClass.Build} object constructs a {@link DeviceProviderFactoryClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DeviceProviderFactoryClass.allocate();
        }
        
         /**
         * Finish building the {@link DeviceProviderFactoryClass} struct.
         * @return A new instance of {@code DeviceProviderFactoryClass} with the fields 
         *         that were set in the Build object.
         */
        public DeviceProviderFactoryClass construct() {
            return struct;
        }
    }
}
