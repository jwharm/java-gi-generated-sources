package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkGLAreaClass} structure contains only private data.
 */
public class GLAreaClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGLAreaClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("render"),
        Interop.valueLayout.ADDRESS.withName("resize"),
        Interop.valueLayout.ADDRESS.withName("create_context"),
        MemoryLayout.paddingLayout(256),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("_padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static GLAreaClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLAreaClass newInstance = new GLAreaClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public GLAreaClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
