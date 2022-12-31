package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type containing a set of virtual methods used for
 * working on {@link FontT} font objects.
 * <p>
 * HarfBuzz provides a lightweight default function for each of
 * the methods in {@link FontFuncsT}. Client programs can implement
 * their own replacements for the individual font functions, as
 * needed, and replace the default by calling the setter for a
 * method.
 */
public class FontFuncsT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_font_funcs_t";
    
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
     * Allocate a new {@link FontFuncsT}
     * @return A new, uninitialized @{link FontFuncsT}
     */
    public static FontFuncsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontFuncsT newInstance = new FontFuncsT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FontFuncsT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FontFuncsT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontFuncsT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FontFuncsT(input, ownership);
}
