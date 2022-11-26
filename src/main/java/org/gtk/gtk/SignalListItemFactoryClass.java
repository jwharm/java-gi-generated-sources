package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SignalListItemFactoryClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSignalListItemFactoryClass";
    
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
     * Allocate a new {@link SignalListItemFactoryClass}
     * @return A new, uninitialized @{link SignalListItemFactoryClass}
     */
    public static SignalListItemFactoryClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SignalListItemFactoryClass newInstance = new SignalListItemFactoryClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SignalListItemFactoryClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SignalListItemFactoryClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SignalListItemFactoryClass struct;
        
         /**
         * A {@link SignalListItemFactoryClass.Build} object constructs a {@link SignalListItemFactoryClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SignalListItemFactoryClass.allocate();
        }
        
         /**
         * Finish building the {@link SignalListItemFactoryClass} struct.
         * @return A new instance of {@code SignalListItemFactoryClass} with the fields 
         *         that were set in the Build object.
         */
        public SignalListItemFactoryClass construct() {
            return struct;
        }
    }
}
