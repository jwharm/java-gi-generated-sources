package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SimpleActionGroupPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSimpleActionGroupPrivate";
    
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
     * Allocate a new {@link SimpleActionGroupPrivate}
     * @return A new, uninitialized @{link SimpleActionGroupPrivate}
     */
    public static SimpleActionGroupPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SimpleActionGroupPrivate newInstance = new SimpleActionGroupPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SimpleActionGroupPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SimpleActionGroupPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SimpleActionGroupPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SimpleActionGroupPrivate(input);
}
