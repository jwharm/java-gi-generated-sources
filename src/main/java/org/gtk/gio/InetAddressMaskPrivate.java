package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InetAddressMaskPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInetAddressMaskPrivate";
    
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
     * Allocate a new {@link InetAddressMaskPrivate}
     * @return A new, uninitialized @{link InetAddressMaskPrivate}
     */
    public static InetAddressMaskPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InetAddressMaskPrivate newInstance = new InetAddressMaskPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a InetAddressMaskPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InetAddressMaskPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private InetAddressMaskPrivate struct;
        
         /**
         * A {@link InetAddressMaskPrivate.Build} object constructs a {@link InetAddressMaskPrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = InetAddressMaskPrivate.allocate();
        }
        
         /**
         * Finish building the {@link InetAddressMaskPrivate} struct.
         * @return A new instance of {@code InetAddressMaskPrivate} with the fields 
         *         that were set in the Build object.
         */
        public InetAddressMaskPrivate construct() {
            return struct;
        }
    }
}
