package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type containing a set of virtual methods used for
 * accessing various Unicode character properties.
 * <p>
 * HarfBuzz provides a default function for each of the
 * methods in {@link UnicodeFuncsT}. Client programs can implement
 * their own replacements for the individual Unicode functions, as
 * needed, and replace the default by calling the setter for a
 * method.
 */
public class UnicodeFuncsT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_unicode_funcs_t";
    
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
     * Allocate a new {@link UnicodeFuncsT}
     * @return A new, uninitialized @{link UnicodeFuncsT}
     */
    public static UnicodeFuncsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UnicodeFuncsT newInstance = new UnicodeFuncsT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a UnicodeFuncsT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public UnicodeFuncsT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private UnicodeFuncsT struct;
        
         /**
         * A {@link UnicodeFuncsT.Build} object constructs a {@link UnicodeFuncsT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = UnicodeFuncsT.allocate();
        }
        
         /**
         * Finish building the {@link UnicodeFuncsT} struct.
         * @return A new instance of {@code UnicodeFuncsT} with the fields 
         *         that were set in the Build object.
         */
        public UnicodeFuncsT construct() {
            return struct;
        }
    }
}
