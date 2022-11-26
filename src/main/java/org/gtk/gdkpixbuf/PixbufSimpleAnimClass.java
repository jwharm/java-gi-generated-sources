package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PixbufSimpleAnimClass extends Struct {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufSimpleAnimClass";
    
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
     * Allocate a new {@link PixbufSimpleAnimClass}
     * @return A new, uninitialized @{link PixbufSimpleAnimClass}
     */
    public static PixbufSimpleAnimClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PixbufSimpleAnimClass newInstance = new PixbufSimpleAnimClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PixbufSimpleAnimClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufSimpleAnimClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PixbufSimpleAnimClass struct;
        
         /**
         * A {@link PixbufSimpleAnimClass.Build} object constructs a {@link PixbufSimpleAnimClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PixbufSimpleAnimClass.allocate();
        }
        
         /**
         * Finish building the {@link PixbufSimpleAnimClass} struct.
         * @return A new instance of {@code PixbufSimpleAnimClass} with the fields 
         *         that were set in the Build object.
         */
        public PixbufSimpleAnimClass construct() {
            return struct;
        }
    }
}
