package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SnapshotClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSnapshotClass";
    
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
     * Allocate a new {@link SnapshotClass}
     * @return A new, uninitialized @{link SnapshotClass}
     */
    public static SnapshotClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SnapshotClass newInstance = new SnapshotClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SnapshotClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SnapshotClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SnapshotClass struct;
        
         /**
         * A {@link SnapshotClass.Build} object constructs a {@link SnapshotClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SnapshotClass.allocate();
        }
        
         /**
         * Finish building the {@link SnapshotClass} struct.
         * @return A new instance of {@code SnapshotClass} with the fields 
         *         that were set in the Build object.
         */
        public SnapshotClass construct() {
            return struct;
        }
    }
}
