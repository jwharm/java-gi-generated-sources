package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ColorChooserInterface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorChooserInterface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_interface"),
        Interop.valueLayout.ADDRESS.withName("get_rgba"),
        Interop.valueLayout.ADDRESS.withName("set_rgba"),
        Interop.valueLayout.ADDRESS.withName("add_palette"),
        Interop.valueLayout.ADDRESS.withName("color_activated"),
        MemoryLayout.paddingLayout(448),
        MemoryLayout.sequenceLayout(12, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ColorChooserInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ColorChooserInterface newInstance = new ColorChooserInterface(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_interface}
     * @return The value of the field {@code base_interface}
     */
    public org.gtk.gobject.TypeInterface base_interface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_interface"));
        return new org.gtk.gobject.TypeInterface(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ColorChooserInterface(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
