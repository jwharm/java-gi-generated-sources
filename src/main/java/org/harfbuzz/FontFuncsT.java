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
public class FontFuncsT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_font_funcs_t";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static FontFuncsT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontFuncsT newInstance = new FontFuncsT(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public FontFuncsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
