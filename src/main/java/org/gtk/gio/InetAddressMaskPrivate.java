package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InetAddressMaskPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInetAddressMaskPrivate";
    
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
     * Allocate a new {@link InetAddressMaskPrivate}
     * @return A new, uninitialized @{link InetAddressMaskPrivate}
     */
    public static InetAddressMaskPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        InetAddressMaskPrivate newInstance = new InetAddressMaskPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a InetAddressMaskPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InetAddressMaskPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InetAddressMaskPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InetAddressMaskPrivate(input);
}
