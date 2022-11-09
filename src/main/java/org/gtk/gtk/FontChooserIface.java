package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FontChooserIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFontChooserIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
        Interop.valueLayout.ADDRESS.withName("get_font_family"),
        Interop.valueLayout.ADDRESS.withName("get_font_face"),
        Interop.valueLayout.ADDRESS.withName("get_font_size"),
        Interop.valueLayout.ADDRESS.withName("set_filter_func"),
        Interop.valueLayout.ADDRESS.withName("font_activated"),
        Interop.valueLayout.ADDRESS.withName("set_font_map"),
        Interop.valueLayout.ADDRESS.withName("get_font_map"),
        MemoryLayout.paddingLayout(128),
        MemoryLayout.sequenceLayout(10, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static FontChooserIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FontChooserIface newInstance = new FontChooserIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface base_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a FontChooserIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FontChooserIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
