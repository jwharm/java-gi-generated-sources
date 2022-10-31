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
public class UnicodeFuncsT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_unicode_funcs_t";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static UnicodeFuncsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UnicodeFuncsT newInstance = new UnicodeFuncsT(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public UnicodeFuncsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
