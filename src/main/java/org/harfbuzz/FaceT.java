package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding font faces.
 */
public class FaceT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_face_t";
    
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
     * Allocate a new {@link FaceT}
     * @return A new, uninitialized @{link FaceT}
     */
    public static FaceT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        FaceT newInstance = new FaceT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FaceT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FaceT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FaceT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FaceT(input);
}
