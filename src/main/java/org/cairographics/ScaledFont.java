package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ScaledFont extends Struct {
    
    static {
        Cairo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "cairo_scaled_font_t";
    
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
     * Allocate a new {@link ScaledFont}
     * @return A new, uninitialized @{link ScaledFont}
     */
    public static ScaledFont allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ScaledFont newInstance = new ScaledFont(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ScaledFont proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ScaledFont(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ScaledFont struct;
        
         /**
         * A {@link ScaledFont.Build} object constructs a {@link ScaledFont} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ScaledFont.allocate();
        }
        
         /**
         * Finish building the {@link ScaledFont} struct.
         * @return A new instance of {@code ScaledFont} with the fields 
         *         that were set in the Build object.
         */
        public ScaledFont construct() {
            return struct;
        }
    }
}
