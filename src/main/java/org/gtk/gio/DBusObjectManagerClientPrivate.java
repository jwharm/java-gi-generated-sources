package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DBusObjectManagerClientPrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerClientPrivate";
    
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
     * Allocate a new {@link DBusObjectManagerClientPrivate}
     * @return A new, uninitialized @{link DBusObjectManagerClientPrivate}
     */
    public static DBusObjectManagerClientPrivate allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusObjectManagerClientPrivate newInstance = new DBusObjectManagerClientPrivate(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a DBusObjectManagerClientPrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusObjectManagerClientPrivate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectManagerClientPrivate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectManagerClientPrivate(input);
}
