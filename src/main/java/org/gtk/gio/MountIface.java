package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for implementing operations for mounts.
 */
public class MountIface extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMountIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("unmounted"),
        Interop.valueLayout.ADDRESS.withName("get_root"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("get_uuid"),
        Interop.valueLayout.ADDRESS.withName("get_volume"),
        Interop.valueLayout.ADDRESS.withName("get_drive"),
        Interop.valueLayout.ADDRESS.withName("can_unmount"),
        Interop.valueLayout.ADDRESS.withName("can_eject"),
        Interop.valueLayout.ADDRESS.withName("unmount"),
        Interop.valueLayout.ADDRESS.withName("unmount_finish"),
        Interop.valueLayout.ADDRESS.withName("eject"),
        Interop.valueLayout.ADDRESS.withName("eject_finish"),
        Interop.valueLayout.ADDRESS.withName("remount"),
        Interop.valueLayout.ADDRESS.withName("remount_finish"),
        Interop.valueLayout.ADDRESS.withName("guess_content_type"),
        Interop.valueLayout.ADDRESS.withName("guess_content_type_finish"),
        Interop.valueLayout.ADDRESS.withName("guess_content_type_sync"),
        Interop.valueLayout.ADDRESS.withName("pre_unmount"),
        Interop.valueLayout.ADDRESS.withName("unmount_with_operation"),
        Interop.valueLayout.ADDRESS.withName("unmount_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("get_default_location"),
        Interop.valueLayout.ADDRESS.withName("get_sort_key"),
        Interop.valueLayout.ADDRESS.withName("get_symbolic_icon")
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
    
    public static MountIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MountIface newInstance = new MountIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a MountIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MountIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
