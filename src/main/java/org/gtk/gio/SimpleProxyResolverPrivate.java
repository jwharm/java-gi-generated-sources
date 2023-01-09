package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SimpleProxyResolverPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleProxyResolverPrivate";
    
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
     * Allocate a new {@link SimpleProxyResolverPrivate}
     * @return A new, uninitialized @{link SimpleProxyResolverPrivate}
     */
    public static SimpleProxyResolverPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SimpleProxyResolverPrivate newInstance = new SimpleProxyResolverPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SimpleProxyResolverPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SimpleProxyResolverPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SimpleProxyResolverPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SimpleProxyResolverPrivate(input);
}
