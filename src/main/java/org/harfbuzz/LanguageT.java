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
    protected LanguageT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, LanguageT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new LanguageT(input, ownership);
    
    /**
     * Converts an {@link LanguageT} to a string.
     * @return A {@code NULL}-terminated string representing the {@code language}. Must not be freed by
     * the caller.
     */
    public java.lang.String String() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_language_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle hb_language_to_string = Interop.downcallHandle(
            "hb_language_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
