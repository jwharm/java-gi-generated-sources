package org.gstreamer.insertbin;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InsertBinPrivate extends Struct {
    
    static {
        GstInsertBin.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstInsertBinPrivate";
    
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
     * Allocate a new {@link InsertBinPrivate}
     * @return A new, uninitialized @{link InsertBinPrivate}
     */
    public static InsertBinPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InsertBinPrivate newInstance = new InsertBinPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a InsertBinPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InsertBinPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
