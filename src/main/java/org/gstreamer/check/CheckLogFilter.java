package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Opaque structure containing data about a log filter
 * function.
 */
public class CheckLogFilter extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCheckLogFilter";
    
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
     * Allocate a new {@link CheckLogFilter}
     * @return A new, uninitialized @{link CheckLogFilter}
     */
    public static CheckLogFilter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CheckLogFilter newInstance = new CheckLogFilter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CheckLogFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CheckLogFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CheckLogFilter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CheckLogFilter(input, ownership);
}
