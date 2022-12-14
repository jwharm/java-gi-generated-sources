package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class RendererPrivate extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoRendererPrivate";
    
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
     * Allocate a new {@link RendererPrivate}
     * @return A new, uninitialized @{link RendererPrivate}
     */
    public static RendererPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RendererPrivate newInstance = new RendererPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RendererPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RendererPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RendererPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RendererPrivate(input);
}
