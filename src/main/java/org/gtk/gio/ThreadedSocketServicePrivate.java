package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ThreadedSocketServicePrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GThreadedSocketServicePrivate";
    
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
     * Allocate a new {@link ThreadedSocketServicePrivate}
     * @return A new, uninitialized @{link ThreadedSocketServicePrivate}
     */
    public static ThreadedSocketServicePrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ThreadedSocketServicePrivate newInstance = new ThreadedSocketServicePrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ThreadedSocketServicePrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ThreadedSocketServicePrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ThreadedSocketServicePrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ThreadedSocketServicePrivate(input);
}
