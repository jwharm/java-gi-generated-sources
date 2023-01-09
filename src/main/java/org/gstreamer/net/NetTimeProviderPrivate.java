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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        NetTimeProviderPrivate newInstance = new NetTimeProviderPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a NetTimeProviderPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected NetTimeProviderPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NetTimeProviderPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NetTimeProviderPrivate(input);
}
