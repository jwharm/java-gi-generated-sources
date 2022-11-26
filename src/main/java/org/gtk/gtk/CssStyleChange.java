package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CssStyleChange extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssStyleChange";
    
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
     * Allocate a new {@link CssStyleChange}
     * @return A new, uninitialized @{link CssStyleChange}
     */
    public static CssStyleChange allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CssStyleChange newInstance = new CssStyleChange(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CssStyleChange proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CssStyleChange(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CssStyleChange struct;
        
         /**
         * A {@link CssStyleChange.Build} object constructs a {@link CssStyleChange} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CssStyleChange.allocate();
        }
        
         /**
         * Finish building the {@link CssStyleChange} struct.
         * @return A new instance of {@code CssStyleChange} with the fields 
         *         that were set in the Build object.
         */
        public CssStyleChange construct() {
            return struct;
        }
    }
}
