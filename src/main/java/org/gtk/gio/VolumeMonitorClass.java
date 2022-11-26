package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VolumeMonitorClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVolumeMonitorClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * Allocate a new {@link VolumeMonitorClass}
     * @return A new, uninitialized @{link VolumeMonitorClass}
     */
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VolumeMonitorClass struct;
        
         /**
         * A {@link VolumeMonitorClass.Build} object constructs a {@link VolumeMonitorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VolumeMonitorClass.allocate();
        }
        
         /**
         * Finish building the {@link VolumeMonitorClass} struct.
         * @return A new instance of {@code VolumeMonitorClass} with the fields 
         *         that were set in the Build object.
         */
        public VolumeMonitorClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setVolumeAdded(java.lang.foreign.MemoryAddress volume_added) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (volume_added == null ? MemoryAddress.NULL : volume_added));
            return this;
        }
        
        public Build setVolumeRemoved(java.lang.foreign.MemoryAddress volume_removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (volume_removed == null ? MemoryAddress.NULL : volume_removed));
            return this;
        }
        
        public Build setVolumeChanged(java.lang.foreign.MemoryAddress volume_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (volume_changed == null ? MemoryAddress.NULL : volume_changed));
            return this;
        }
        
        public Build setMountAdded(java.lang.foreign.MemoryAddress mount_added) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_added == null ? MemoryAddress.NULL : mount_added));
            return this;
        }
        
        public Build setMountRemoved(java.lang.foreign.MemoryAddress mount_removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_removed == null ? MemoryAddress.NULL : mount_removed));
            return this;
        }
        
        public Build setMountPreUnmount(java.lang.foreign.MemoryAddress mount_pre_unmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_pre_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_pre_unmount == null ? MemoryAddress.NULL : mount_pre_unmount));
            return this;
        }
        
        public Build setMountChanged(java.lang.foreign.MemoryAddress mount_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_changed == null ? MemoryAddress.NULL : mount_changed));
            return this;
        }
        
        public Build setDriveConnected(java.lang.foreign.MemoryAddress drive_connected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_connected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drive_connected == null ? MemoryAddress.NULL : drive_connected));
            return this;
        }
        
        public Build setDriveDisconnected(java.lang.foreign.MemoryAddress drive_disconnected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_disconnected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drive_disconnected == null ? MemoryAddress.NULL : drive_disconnected));
            return this;
        }
        
        public Build setDriveChanged(java.lang.foreign.MemoryAddress drive_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drive_changed == null ? MemoryAddress.NULL : drive_changed));
            return this;
        }
        
        public Build setIsSupported(java.lang.foreign.MemoryAddress is_supported) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_supported == null ? MemoryAddress.NULL : is_supported));
            return this;
        }
        
        public Build setGetConnectedDrives(java.lang.foreign.MemoryAddress get_connected_drives) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_connected_drives"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_connected_drives == null ? MemoryAddress.NULL : get_connected_drives));
            return this;
        }
        
        public Build setGetVolumes(java.lang.foreign.MemoryAddress get_volumes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volumes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_volumes == null ? MemoryAddress.NULL : get_volumes));
            return this;
        }
        
        public Build setGetMounts(java.lang.foreign.MemoryAddress get_mounts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mounts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_mounts == null ? MemoryAddress.NULL : get_mounts));
            return this;
        }
        
        public Build setGetVolumeForUuid(java.lang.foreign.MemoryAddress get_volume_for_uuid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volume_for_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_volume_for_uuid == null ? MemoryAddress.NULL : get_volume_for_uuid));
            return this;
        }
        
        public Build setGetMountForUuid(java.lang.foreign.MemoryAddress get_mount_for_uuid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_mount_for_uuid == null ? MemoryAddress.NULL : get_mount_for_uuid));
            return this;
        }
        
        public Build setAdoptOrphanMount(java.lang.foreign.MemoryAddress adopt_orphan_mount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("adopt_orphan_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (adopt_orphan_mount == null ? MemoryAddress.NULL : adopt_orphan_mount));
            return this;
        }
        
        public Build setDriveEjectButton(java.lang.foreign.MemoryAddress drive_eject_button) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_eject_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drive_eject_button == null ? MemoryAddress.NULL : drive_eject_button));
            return this;
        }
        
        public Build setDriveStopButton(java.lang.foreign.MemoryAddress drive_stop_button) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_stop_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drive_stop_button == null ? MemoryAddress.NULL : drive_stop_button));
            return this;
        }
        
        public Build setGReserved1(java.lang.foreign.MemoryAddress _g_reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved1 == null ? MemoryAddress.NULL : _g_reserved1));
            return this;
        }
        
        public Build setGReserved2(java.lang.foreign.MemoryAddress _g_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved2 == null ? MemoryAddress.NULL : _g_reserved2));
            return this;
        }
        
        public Build setGReserved3(java.lang.foreign.MemoryAddress _g_reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved3 == null ? MemoryAddress.NULL : _g_reserved3));
            return this;
        }
        
        public Build setGReserved4(java.lang.foreign.MemoryAddress _g_reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved4 == null ? MemoryAddress.NULL : _g_reserved4));
            return this;
        }
        
        public Build setGReserved5(java.lang.foreign.MemoryAddress _g_reserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved5 == null ? MemoryAddress.NULL : _g_reserved5));
            return this;
        }
        
        public Build setGReserved6(java.lang.foreign.MemoryAddress _g_reserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved6 == null ? MemoryAddress.NULL : _g_reserved6));
            return this;
        }
    }
}
