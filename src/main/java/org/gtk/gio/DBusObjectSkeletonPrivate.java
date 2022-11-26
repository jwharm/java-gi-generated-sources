package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DBusObjectSkeletonPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectSkeletonPrivate";
    
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
     * Allocate a new {@link DBusObjectSkeletonPrivate}
     * @return A new, uninitialized @{link DBusObjectSkeletonPrivate}
     */
    public static DBusObjectSkeletonPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusObjectSkeletonPrivate newInstance = new DBusObjectSkeletonPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DBusObjectSkeletonPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusObjectSkeletonPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusObjectSkeletonPrivate struct;
        
         /**
         * A {@link DBusObjectSkeletonPrivate.Build} object constructs a {@link DBusObjectSkeletonPrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusObjectSkeletonPrivate.allocate();
        }
        
         /**
         * Finish building the {@link DBusObjectSkeletonPrivate} struct.
         * @return A new instance of {@code DBusObjectSkeletonPrivate} with the fields 
         *         that were set in the Build object.
         */
        public DBusObjectSkeletonPrivate construct() {
            return struct;
        }
    }
}
