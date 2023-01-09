package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SharedTaskPoolPrivate extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSharedTaskPoolPrivate";
    
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
     * Allocate a new {@link SharedTaskPoolPrivate}
     * @return A new, uninitialized @{link SharedTaskPoolPrivate}
     */
    public static SharedTaskPoolPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SharedTaskPoolPrivate newInstance = new SharedTaskPoolPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SharedTaskPoolPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SharedTaskPoolPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SharedTaskPoolPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SharedTaskPoolPrivate(input);
}
