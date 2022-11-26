package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NativeSocketAddressPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNativeSocketAddressPrivate";
    
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
     * Allocate a new {@link NativeSocketAddressPrivate}
     * @return A new, uninitialized @{link NativeSocketAddressPrivate}
     */
    public static NativeSocketAddressPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NativeSocketAddressPrivate newInstance = new NativeSocketAddressPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a NativeSocketAddressPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NativeSocketAddressPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private NativeSocketAddressPrivate struct;
        
         /**
         * A {@link NativeSocketAddressPrivate.Build} object constructs a {@link NativeSocketAddressPrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = NativeSocketAddressPrivate.allocate();
        }
        
         /**
         * Finish building the {@link NativeSocketAddressPrivate} struct.
         * @return A new instance of {@code NativeSocketAddressPrivate} with the fields 
         *         that were set in the Build object.
         */
        public NativeSocketAddressPrivate construct() {
            return struct;
        }
    }
}
