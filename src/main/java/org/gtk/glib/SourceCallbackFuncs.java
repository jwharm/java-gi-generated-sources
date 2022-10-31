package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GSourceCallbackFuncs} struct contains
 * functions for managing callback objects.
 */
public class SourceCallbackFuncs extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSourceCallbackFuncs";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("ref"),
        Interop.valueLayout.ADDRESS.withName("unref"),
        Interop.valueLayout.ADDRESS.withName("get")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static SourceCallbackFuncs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SourceCallbackFuncs newInstance = new SourceCallbackFuncs(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public SourceCallbackFuncs(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
