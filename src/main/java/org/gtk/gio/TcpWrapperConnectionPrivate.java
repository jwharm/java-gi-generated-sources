package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TcpWrapperConnectionPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTcpWrapperConnectionPrivate";
    
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
     * Allocate a new {@link TcpWrapperConnectionPrivate}
     * @return A new, uninitialized @{link TcpWrapperConnectionPrivate}
     */
    public static TcpWrapperConnectionPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TcpWrapperConnectionPrivate newInstance = new TcpWrapperConnectionPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TcpWrapperConnectionPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TcpWrapperConnectionPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TcpWrapperConnectionPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TcpWrapperConnectionPrivate(input);
}
