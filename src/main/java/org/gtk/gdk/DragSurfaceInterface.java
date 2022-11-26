package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkDragSurfaceInterface} implementation is private to GDK.
 */
public class DragSurfaceInterface extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDragSurfaceInterface";
    
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
     * Allocate a new {@link DragSurfaceInterface}
     * @return A new, uninitialized @{link DragSurfaceInterface}
     */
    public static DragSurfaceInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DragSurfaceInterface newInstance = new DragSurfaceInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DragSurfaceInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DragSurfaceInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DragSurfaceInterface struct;
        
         /**
         * A {@link DragSurfaceInterface.Build} object constructs a {@link DragSurfaceInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DragSurfaceInterface.allocate();
        }
        
         /**
         * Finish building the {@link DragSurfaceInterface} struct.
         * @return A new instance of {@code DragSurfaceInterface} with the fields 
         *         that were set in the Build object.
         */
        public DragSurfaceInterface construct() {
            return struct;
        }
    }
}
