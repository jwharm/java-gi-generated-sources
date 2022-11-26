package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class KeyvalTriggerClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkKeyvalTriggerClass";
    
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
     * Allocate a new {@link KeyvalTriggerClass}
     * @return A new, uninitialized @{link KeyvalTriggerClass}
     */
    public static KeyvalTriggerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        KeyvalTriggerClass newInstance = new KeyvalTriggerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a KeyvalTriggerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public KeyvalTriggerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private KeyvalTriggerClass struct;
        
         /**
         * A {@link KeyvalTriggerClass.Build} object constructs a {@link KeyvalTriggerClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = KeyvalTriggerClass.allocate();
        }
        
         /**
         * Finish building the {@link KeyvalTriggerClass} struct.
         * @return A new instance of {@code KeyvalTriggerClass} with the fields 
         *         that were set in the Build object.
         */
        public KeyvalTriggerClass construct() {
            return struct;
        }
    }
}
