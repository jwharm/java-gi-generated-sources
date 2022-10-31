package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure that represents a keyed data list.
 * <p>
 * See also: [Keyed data lists][glib-Keyed-Data-Lists].
 */
public class Data extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GData";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Data allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Data newInstance = new Data(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Data(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
