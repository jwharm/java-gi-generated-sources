package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@link Credentials}.
 * @version 2.26
 */
public class CredentialsClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCredentialsClass";
    
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
     * Allocate a new {@link CredentialsClass}
     * @return A new, uninitialized @{link CredentialsClass}
     */
    public static CredentialsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CredentialsClass newInstance = new CredentialsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CredentialsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CredentialsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CredentialsClass struct;
        
         /**
         * A {@link CredentialsClass.Build} object constructs a {@link CredentialsClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CredentialsClass.allocate();
        }
        
         /**
         * Finish building the {@link CredentialsClass} struct.
         * @return A new instance of {@code CredentialsClass} with the fields 
         *         that were set in the Build object.
         */
        public CredentialsClass construct() {
            return struct;
        }
    }
}
