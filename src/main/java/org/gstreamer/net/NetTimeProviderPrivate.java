package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NetTimeProviderPrivate extends Struct {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetTimeProviderPrivate";
    
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
     * Allocate a new {@link NetTimeProviderPrivate}
     * @return A new, uninitialized @{link NetTimeProviderPrivate}
     */
    public static NetTimeProviderPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NetTimeProviderPrivate newInstance = new NetTimeProviderPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a NetTimeProviderPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NetTimeProviderPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
