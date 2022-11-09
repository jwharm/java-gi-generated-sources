package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PermissionPrivate extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPermissionPrivate";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static PermissionPrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PermissionPrivate newInstance = new PermissionPrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PermissionPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PermissionPrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
