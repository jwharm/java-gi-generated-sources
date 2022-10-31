package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines a Unix mount entry (e.g. &lt;filename&gt;/media/cdrom&lt;/filename&gt;).
 * This corresponds roughly to a mtab entry.
 */
public class UnixMountEntry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixMountEntry";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static UnixMountEntry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        UnixMountEntry newInstance = new UnixMountEntry(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public UnixMountEntry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
