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
    public org.gtk.gobject.ObjectClass parentClass$get() {
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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setVolumeAdded(java.lang.foreign.MemoryAddress volumeAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (volumeAdded == null ? MemoryAddress.NULL : volumeAdded));
            return this;
        }
        
        public Build setVolumeRemoved(java.lang.foreign.MemoryAddress volumeRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (volumeRemoved == null ? MemoryAddress.NULL : volumeRemoved));
            return this;
        }
        
        public Build setVolumeChanged(java.lang.foreign.MemoryAddress volumeChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (volumeChanged == null ? MemoryAddress.NULL : volumeChanged));
            return this;
        }
        
        public Build setMountAdded(java.lang.foreign.MemoryAddress mountAdded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountAdded == null ? MemoryAddress.NULL : mountAdded));
            return this;
        }
        
        public Build setMountRemoved(java.lang.foreign.MemoryAddress mountRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountRemoved == null ? MemoryAddress.NULL : mountRemoved));
            return this;
        }
        
        public Build setMountPreUnmount(java.lang.foreign.MemoryAddress mountPreUnmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_pre_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountPreUnmount == null ? MemoryAddress.NULL : mountPreUnmount));
            return this;
        }
        
        public Build setMountChanged(java.lang.foreign.MemoryAddress mountChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountChanged == null ? MemoryAddress.NULL : mountChanged));
            return this;
        }
        
        public Build setDriveConnected(java.lang.foreign.MemoryAddress driveConnected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_connected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (driveConnected == null ? MemoryAddress.NULL : driveConnected));
            return this;
        }
        
        public Build setDriveDisconnected(java.lang.foreign.MemoryAddress driveDisconnected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_disconnected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (driveDisconnected == null ? MemoryAddress.NULL : driveDisconnected));
            return this;
        }
        
        public Build setDriveChanged(java.lang.foreign.MemoryAddress driveChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (driveChanged == null ? MemoryAddress.NULL : driveChanged));
            return this;
        }
        
        public Build setIsSupported(java.lang.foreign.MemoryAddress isSupported) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSupported == null ? MemoryAddress.NULL : isSupported));
            return this;
        }
        
        public Build setGetConnectedDrives(java.lang.foreign.MemoryAddress getConnectedDrives) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_connected_drives"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getConnectedDrives == null ? MemoryAddress.NULL : getConnectedDrives));
            return this;
        }
        
        public Build setGetVolumes(java.lang.foreign.MemoryAddress getVolumes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volumes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVolumes == null ? MemoryAddress.NULL : getVolumes));
            return this;
        }
        
        public Build setGetMounts(java.lang.foreign.MemoryAddress getMounts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mounts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMounts == null ? MemoryAddress.NULL : getMounts));
            return this;
        }
        
        public Build setGetVolumeForUuid(java.lang.foreign.MemoryAddress getVolumeForUuid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volume_for_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVolumeForUuid == null ? MemoryAddress.NULL : getVolumeForUuid));
            return this;
        }
        
        public Build setGetMountForUuid(java.lang.foreign.MemoryAddress getMountForUuid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMountForUuid == null ? MemoryAddress.NULL : getMountForUuid));
            return this;
        }
        
        public Build setAdoptOrphanMount(java.lang.foreign.MemoryAddress adoptOrphanMount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("adopt_orphan_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (adoptOrphanMount == null ? MemoryAddress.NULL : adoptOrphanMount));
            return this;
        }
        
        public Build setDriveEjectButton(java.lang.foreign.MemoryAddress driveEjectButton) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_eject_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (driveEjectButton == null ? MemoryAddress.NULL : driveEjectButton));
            return this;
        }
        
        public Build setDriveStopButton(java.lang.foreign.MemoryAddress driveStopButton) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_stop_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (driveStopButton == null ? MemoryAddress.NULL : driveStopButton));
            return this;
        }
        
        public Build setGReserved1(java.lang.foreign.MemoryAddress GReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1));
            return this;
        }
        
        public Build setGReserved2(java.lang.foreign.MemoryAddress GReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2));
            return this;
        }
        
        public Build setGReserved3(java.lang.foreign.MemoryAddress GReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3));
            return this;
        }
        
        public Build setGReserved4(java.lang.foreign.MemoryAddress GReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4));
            return this;
        }
        
        public Build setGReserved5(java.lang.foreign.MemoryAddress GReserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5));
            return this;
        }
        
        public Build setGReserved6(java.lang.foreign.MemoryAddress GReserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6));
            return this;
        }
    }
}
