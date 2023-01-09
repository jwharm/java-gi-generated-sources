package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DBusObjectSkeletonPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectSkeletonPrivate";
    
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
     * Allocate a new {@link DBusObjectSkeletonPrivate}
     * @return A new, uninitialized @{link DBusObjectSkeletonPrivate}
     */
    public static DBusObjectSkeletonPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusObjectSkeletonPrivate newInstance = new DBusObjectSkeletonPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DBusObjectSkeletonPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusObjectSkeletonPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectSkeletonPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectSkeletonPrivate(input);
}
