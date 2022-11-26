package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for languages. Each {@link LanguageT} corresponds to a BCP 47
 * language tag.
 */
public class LanguageT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_language_t";
    
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
     * Allocate a new {@link LanguageT}
     * @return A new, uninitialized @{link LanguageT}
     */
    public static LanguageT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LanguageT newInstance = new LanguageT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a LanguageT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LanguageT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Converts an {@link LanguageT} to a string.
     * @return A {@code NULL}-terminated string representing the {@code language}. Must not be freed by
     * the caller.
     */
    public @NotNull java.lang.String String() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_language_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle hb_language_to_string = Interop.downcallHandle(
            "hb_language_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private LanguageT struct;
        
         /**
         * A {@link LanguageT.Build} object constructs a {@link LanguageT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = LanguageT.allocate();
        }
        
         /**
         * Finish building the {@link LanguageT} struct.
         * @return A new instance of {@code LanguageT} with the fields 
         *         that were set in the Build object.
         */
        public LanguageT construct() {
            return struct;
        }
    }
}
