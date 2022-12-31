package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SimpleAsyncResultClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleAsyncResultClass";
    
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
     * Allocate a new {@link SimpleAsyncResultClass}
     * @return A new, uninitialized @{link SimpleAsyncResultClass}
     */
    public static SimpleAsyncResultClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SimpleAsyncResultClass newInstance = new SimpleAsyncResultClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SimpleAsyncResultClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SimpleAsyncResultClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SimpleAsyncResultClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SimpleAsyncResultClass(input, ownership);
}
