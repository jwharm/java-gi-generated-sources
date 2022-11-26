package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DBusObjectManagerServerPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerServerPrivate";
    
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
     * Allocate a new {@link DBusObjectManagerServerPrivate}
     * @return A new, uninitialized @{link DBusObjectManagerServerPrivate}
     */
    public static DBusObjectManagerServerPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusObjectManagerServerPrivate newInstance = new DBusObjectManagerServerPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DBusObjectManagerServerPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusObjectManagerServerPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusObjectManagerServerPrivate struct;
        
         /**
         * A {@link DBusObjectManagerServerPrivate.Build} object constructs a {@link DBusObjectManagerServerPrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusObjectManagerServerPrivate.allocate();
        }
        
         /**
         * Finish building the {@link DBusObjectManagerServerPrivate} struct.
         * @return A new instance of {@code DBusObjectManagerServerPrivate} with the fields 
         *         that were set in the Build object.
         */
        public DBusObjectManagerServerPrivate construct() {
            return struct;
        }
    }
}
