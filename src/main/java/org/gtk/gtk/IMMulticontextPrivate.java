package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class IMMulticontextPrivate extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMMulticontextPrivate";
    
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
     * Allocate a new {@link IMMulticontextPrivate}
     * @return A new, uninitialized @{link IMMulticontextPrivate}
     */
    public static IMMulticontextPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IMMulticontextPrivate newInstance = new IMMulticontextPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IMMulticontextPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IMMulticontextPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private IMMulticontextPrivate struct;
        
         /**
         * A {@link IMMulticontextPrivate.Build} object constructs a {@link IMMulticontextPrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = IMMulticontextPrivate.allocate();
        }
        
         /**
         * Finish building the {@link IMMulticontextPrivate} struct.
         * @return A new instance of {@code IMMulticontextPrivate} with the fields 
         *         that were set in the Build object.
         */
        public IMMulticontextPrivate construct() {
            return struct;
        }
    }
}
