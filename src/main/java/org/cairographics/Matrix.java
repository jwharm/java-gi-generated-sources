package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Matrix extends Struct {
    
    static {
        Cairo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "cairo_matrix_t";
    
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
     * Allocate a new {@link Matrix}
     * @return A new, uninitialized @{link Matrix}
     */
    public static Matrix allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Matrix newInstance = new Matrix(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Matrix proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Matrix(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Matrix> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Matrix(input, ownership);
}
