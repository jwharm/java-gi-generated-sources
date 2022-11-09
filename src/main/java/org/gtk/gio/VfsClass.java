package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VfsClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVfsClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("is_active"),
        Interop.valueLayout.ADDRESS.withName("get_file_for_path"),
        Interop.valueLayout.ADDRESS.withName("get_file_for_uri"),
        Interop.valueLayout.ADDRESS.withName("get_supported_uri_schemes"),
        Interop.valueLayout.ADDRESS.withName("parse_name"),
        Interop.valueLayout.ADDRESS.withName("local_file_add_info"),
        Interop.valueLayout.ADDRESS.withName("add_writable_namespaces"),
        Interop.valueLayout.ADDRESS.withName("local_file_set_attributes"),
        Interop.valueLayout.ADDRESS.withName("local_file_removed"),
        Interop.valueLayout.ADDRESS.withName("local_file_moved"),
        Interop.valueLayout.ADDRESS.withName("deserialize_icon"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6")
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
    
    public static VfsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VfsClass newInstance = new VfsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VfsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VfsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
