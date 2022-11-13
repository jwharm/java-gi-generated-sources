package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VolumeMonitorClass extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVolumeMonitorClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("volume_added"),
        Interop.valueLayout.ADDRESS.withName("volume_removed"),
        Interop.valueLayout.ADDRESS.withName("volume_changed"),
        Interop.valueLayout.ADDRESS.withName("mount_added"),
        Interop.valueLayout.ADDRESS.withName("mount_removed"),
        Interop.valueLayout.ADDRESS.withName("mount_pre_unmount"),
        Interop.valueLayout.ADDRESS.withName("mount_changed"),
        Interop.valueLayout.ADDRESS.withName("drive_connected"),
        Interop.valueLayout.ADDRESS.withName("drive_disconnected"),
        Interop.valueLayout.ADDRESS.withName("drive_changed"),
        Interop.valueLayout.ADDRESS.withName("is_supported"),
        Interop.valueLayout.ADDRESS.withName("get_connected_drives"),
        Interop.valueLayout.ADDRESS.withName("get_volumes"),
        Interop.valueLayout.ADDRESS.withName("get_mounts"),
        Interop.valueLayout.ADDRESS.withName("get_volume_for_uuid"),
        Interop.valueLayout.ADDRESS.withName("get_mount_for_uuid"),
        Interop.valueLayout.ADDRESS.withName("adopt_orphan_mount"),
        Interop.valueLayout.ADDRESS.withName("drive_eject_button"),
        Interop.valueLayout.ADDRESS.withName("drive_stop_button"),
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
    
    public static VolumeMonitorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VolumeMonitorClass newInstance = new VolumeMonitorClass(segment.address(), Ownership.NONE);
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
     * Create a VolumeMonitorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VolumeMonitorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
