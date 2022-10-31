package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A sub-parser for {@code GtkBuildable} implementations.
 */
public class BuildableParser extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuildableParser";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("start_element"),
        Interop.valueLayout.ADDRESS.withName("end_element"),
        Interop.valueLayout.ADDRESS.withName("text"),
        Interop.valueLayout.ADDRESS.withName("error"),
        MemoryLayout.sequenceLayout(4, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static BuildableParser allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BuildableParser newInstance = new BuildableParser(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public BuildableParser(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
