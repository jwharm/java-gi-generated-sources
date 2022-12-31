package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines a Unix mount entry (e.g. &lt;filename&gt;/media/cdrom&lt;/filename&gt;).
 * This corresponds roughly to a mtab entry.
 */
public class UnixMountEntry extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixMountEntry";
    
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
     * Allocate a new {@link UnixMountEntry}
     * @return A new, uninitialized @{link UnixMountEntry}
     */
    public static UnixMountEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UnixMountEntry newInstance = new UnixMountEntry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a UnixMountEntry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected UnixMountEntry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixMountEntry> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new UnixMountEntry(input, ownership);
}
