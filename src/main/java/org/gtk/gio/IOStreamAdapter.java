package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class IOStreamAdapter extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOStreamAdapter";
    
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
     * Allocate a new {@link IOStreamAdapter}
     * @return A new, uninitialized @{link IOStreamAdapter}
     */
    public static IOStreamAdapter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        IOStreamAdapter newInstance = new IOStreamAdapter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOStreamAdapter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IOStreamAdapter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOStreamAdapter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IOStreamAdapter(input);
}
