package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GdkEventSequence} is an opaque type representing a sequence
 * of related touch events.
 */
public class EventSequence extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkEventSequence";
    
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
     * Allocate a new {@link EventSequence}
     * @return A new, uninitialized @{link EventSequence}
     */
    public static EventSequence allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EventSequence newInstance = new EventSequence(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EventSequence proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EventSequence(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private EventSequence struct;
        
         /**
         * A {@link EventSequence.Build} object constructs a {@link EventSequence} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = EventSequence.allocate();
        }
        
         /**
         * Finish building the {@link EventSequence} struct.
         * @return A new instance of {@code EventSequence} with the fields 
         *         that were set in the Build object.
         */
        public EventSequence construct() {
            return struct;
        }
    }
}
