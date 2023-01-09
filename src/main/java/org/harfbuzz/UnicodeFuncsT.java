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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        UnicodeFuncsT newInstance = new UnicodeFuncsT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a UnicodeFuncsT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected UnicodeFuncsT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnicodeFuncsT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new UnicodeFuncsT(input);
}
