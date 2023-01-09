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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VolumeMonitorClass}
     * @return A new, uninitialized @{link VolumeMonitorClass}
     */
    public static VolumeMonitorClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VolumeMonitorClass newInstance = new VolumeMonitorClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code VolumeAddedCallback} callback.
     */
    @FunctionalInterface
    public interface VolumeAddedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VolumeAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code volume_added}
     * @param volumeAdded The new value of the field {@code volume_added}
     */
    public void setVolumeAdded(VolumeAddedCallback volumeAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (volumeAdded == null ? MemoryAddress.NULL : volumeAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code VolumeRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface VolumeRemovedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VolumeRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code volume_removed}
     * @param volumeRemoved The new value of the field {@code volume_removed}
     */
    public void setVolumeRemoved(VolumeRemovedCallback volumeRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (volumeRemoved == null ? MemoryAddress.NULL : volumeRemoved.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code VolumeChangedCallback} callback.
     */
    @FunctionalInterface
    public interface VolumeChangedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VolumeChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code volume_changed}
     * @param volumeChanged The new value of the field {@code volume_changed}
     */
    public void setVolumeChanged(VolumeChangedCallback volumeChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("volume_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (volumeChanged == null ? MemoryAddress.NULL : volumeChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountAddedCallback} callback.
     */
    @FunctionalInterface
    public interface MountAddedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountAddedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_added}
     * @param mountAdded The new value of the field {@code mount_added}
     */
    public void setMountAdded(MountAddedCallback mountAdded) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_added"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountAdded == null ? MemoryAddress.NULL : mountAdded.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountRemovedCallback} callback.
     */
    @FunctionalInterface
    public interface MountRemovedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountRemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_removed}
     * @param mountRemoved The new value of the field {@code mount_removed}
     */
    public void setMountRemoved(MountRemovedCallback mountRemoved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountRemoved == null ? MemoryAddress.NULL : mountRemoved.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountPreUnmountCallback} callback.
     */
    @FunctionalInterface
    public interface MountPreUnmountCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountPreUnmountCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_pre_unmount}
     * @param mountPreUnmount The new value of the field {@code mount_pre_unmount}
     */
    public void setMountPreUnmount(MountPreUnmountCallback mountPreUnmount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_pre_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountPreUnmount == null ? MemoryAddress.NULL : mountPreUnmount.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountChangedCallback} callback.
     */
    @FunctionalInterface
    public interface MountChangedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_changed}
     * @param mountChanged The new value of the field {@code mount_changed}
     */
    public void setMountChanged(MountChangedCallback mountChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountChanged == null ? MemoryAddress.NULL : mountChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveConnectedCallback} callback.
     */
    @FunctionalInterface
    public interface DriveConnectedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveConnectedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drive_connected}
     * @param driveConnected The new value of the field {@code drive_connected}
     */
    public void setDriveConnected(DriveConnectedCallback driveConnected) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_connected"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveConnected == null ? MemoryAddress.NULL : driveConnected.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveDisconnectedCallback} callback.
     */
    @FunctionalInterface
    public interface DriveDisconnectedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveDisconnectedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drive_disconnected}
     * @param driveDisconnected The new value of the field {@code drive_disconnected}
     */
    public void setDriveDisconnected(DriveDisconnectedCallback driveDisconnected) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_disconnected"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveDisconnected == null ? MemoryAddress.NULL : driveDisconnected.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveChangedCallback} callback.
     */
    @FunctionalInterface
    public interface DriveChangedCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drive_changed}
     * @param driveChanged The new value of the field {@code drive_changed}
     */
    public void setDriveChanged(DriveChangedCallback driveChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveChanged == null ? MemoryAddress.NULL : driveChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code IsSupportedCallback} callback.
     */
    @FunctionalInterface
    public interface IsSupportedCallback {
    
        boolean run();
        
        @ApiStatus.Internal default int upcall() {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IsSupportedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_supported}
     * @param isSupported The new value of the field {@code is_supported}
     */
    public void setIsSupported(IsSupportedCallback isSupported) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSupported == null ? MemoryAddress.NULL : isSupported.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetConnectedDrivesCallback} callback.
     */
    @FunctionalInterface
    public interface GetConnectedDrivesCallback {
    
        org.gtk.glib.List run(org.gtk.gio.VolumeMonitor volumeMonitor);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volumeMonitor) {
            var RESULT = run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetConnectedDrivesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_connected_drives}
     * @param getConnectedDrives The new value of the field {@code get_connected_drives}
     */
    public void setGetConnectedDrives(GetConnectedDrivesCallback getConnectedDrives) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_connected_drives"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getConnectedDrives == null ? MemoryAddress.NULL : getConnectedDrives.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetVolumesCallback} callback.
     */
    @FunctionalInterface
    public interface GetVolumesCallback {
    
        org.gtk.glib.List run(org.gtk.gio.VolumeMonitor volumeMonitor);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volumeMonitor) {
            var RESULT = run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetVolumesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_volumes}
     * @param getVolumes The new value of the field {@code get_volumes}
     */
    public void setGetVolumes(GetVolumesCallback getVolumes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volumes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVolumes == null ? MemoryAddress.NULL : getVolumes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetMountsCallback} callback.
     */
    @FunctionalInterface
    public interface GetMountsCallback {
    
        org.gtk.glib.List run(org.gtk.gio.VolumeMonitor volumeMonitor);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volumeMonitor) {
            var RESULT = run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetMountsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_mounts}
     * @param getMounts The new value of the field {@code get_mounts}
     */
    public void setGetMounts(GetMountsCallback getMounts) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mounts"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMounts == null ? MemoryAddress.NULL : getMounts.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetVolumeForUuidCallback} callback.
     */
    @FunctionalInterface
    public interface GetVolumeForUuidCallback {
    
        @Nullable org.gtk.gio.Volume run(org.gtk.gio.VolumeMonitor volumeMonitor, java.lang.String uuid);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volumeMonitor, MemoryAddress uuid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), Marshal.addressToString.marshal(uuid, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetVolumeForUuidCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_volume_for_uuid}
     * @param getVolumeForUuid The new value of the field {@code get_volume_for_uuid}
     */
    public void setGetVolumeForUuid(GetVolumeForUuidCallback getVolumeForUuid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volume_for_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVolumeForUuid == null ? MemoryAddress.NULL : getVolumeForUuid.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetMountForUuidCallback} callback.
     */
    @FunctionalInterface
    public interface GetMountForUuidCallback {
    
        @Nullable org.gtk.gio.Mount run(org.gtk.gio.VolumeMonitor volumeMonitor, java.lang.String uuid);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volumeMonitor, MemoryAddress uuid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), Marshal.addressToString.marshal(uuid, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetMountForUuidCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_mount_for_uuid}
     * @param getMountForUuid The new value of the field {@code get_mount_for_uuid}
     */
    public void setGetMountForUuid(GetMountForUuidCallback getMountForUuid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMountForUuid == null ? MemoryAddress.NULL : getMountForUuid.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AdoptOrphanMountCallback} callback.
     */
    @FunctionalInterface
    public interface AdoptOrphanMountCallback {
    
        org.gtk.gio.Volume run(org.gtk.gio.Mount mount, org.gtk.gio.VolumeMonitor volumeMonitor);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount, MemoryAddress volumeMonitor) {
            var RESULT = run((org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null), (org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AdoptOrphanMountCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code adopt_orphan_mount}
     * @param adoptOrphanMount The new value of the field {@code adopt_orphan_mount}
     */
    public void setAdoptOrphanMount(AdoptOrphanMountCallback adoptOrphanMount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("adopt_orphan_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (adoptOrphanMount == null ? MemoryAddress.NULL : adoptOrphanMount.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveEjectButtonCallback} callback.
     */
    @FunctionalInterface
    public interface DriveEjectButtonCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveEjectButtonCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drive_eject_button}
     * @param driveEjectButton The new value of the field {@code drive_eject_button}
     */
    public void setDriveEjectButton(DriveEjectButtonCallback driveEjectButton) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_eject_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveEjectButton == null ? MemoryAddress.NULL : driveEjectButton.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveStopButtonCallback} callback.
     */
    @FunctionalInterface
    public interface DriveStopButtonCallback {
    
        void run(org.gtk.gio.VolumeMonitor volumeMonitor, org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.VolumeMonitor) Interop.register(volumeMonitor, org.gtk.gio.VolumeMonitor.fromAddress).marshal(volumeMonitor, null), (org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveStopButtonCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drive_stop_button}
     * @param driveStopButton The new value of the field {@code drive_stop_button}
     */
    public void setDriveStopButton(DriveStopButtonCallback driveStopButton) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drive_stop_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveStopButton == null ? MemoryAddress.NULL : driveStopButton.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved1Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved1Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved1Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved1}
     * @param GReserved1 The new value of the field {@code _g_reserved1}
     */
    public void setGReserved1(GReserved1Callback GReserved1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved2Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved2Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved2Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved2}
     * @param GReserved2 The new value of the field {@code _g_reserved2}
     */
    public void setGReserved2(GReserved2Callback GReserved2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved3Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved3Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved3Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved3}
     * @param GReserved3 The new value of the field {@code _g_reserved3}
     */
    public void setGReserved3(GReserved3Callback GReserved3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved4Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved4Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved4Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved4}
     * @param GReserved4 The new value of the field {@code _g_reserved4}
     */
    public void setGReserved4(GReserved4Callback GReserved4) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved5Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved5Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved5Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved5}
     * @param GReserved5 The new value of the field {@code _g_reserved5}
     */
    public void setGReserved5(GReserved5Callback GReserved5) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GReserved6Callback} callback.
     */
    @FunctionalInterface
    public interface GReserved6Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GReserved6Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _g_reserved6}
     * @param GReserved6 The new value of the field {@code _g_reserved6}
     */
    public void setGReserved6(GReserved6Callback GReserved6) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
        }
    }
    
    /**
     * Create a VolumeMonitorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VolumeMonitorClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VolumeMonitorClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VolumeMonitorClass(input);
    
    /**
     * A {@link VolumeMonitorClass.Builder} object constructs a {@link VolumeMonitorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VolumeMonitorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VolumeMonitorClass struct;
        
        private Builder() {
            struct = VolumeMonitorClass.allocate();
        }
        
        /**
         * Finish building the {@link VolumeMonitorClass} struct.
         * @return A new instance of {@code VolumeMonitorClass} with the fields 
         *         that were set in the Builder object.
         */
        public VolumeMonitorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setVolumeAdded(VolumeAddedCallback volumeAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("volume_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (volumeAdded == null ? MemoryAddress.NULL : volumeAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setVolumeRemoved(VolumeRemovedCallback volumeRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("volume_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (volumeRemoved == null ? MemoryAddress.NULL : volumeRemoved.toCallback()));
                return this;
            }
        }
        
        public Builder setVolumeChanged(VolumeChangedCallback volumeChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("volume_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (volumeChanged == null ? MemoryAddress.NULL : volumeChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setMountAdded(MountAddedCallback mountAdded) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_added"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountAdded == null ? MemoryAddress.NULL : mountAdded.toCallback()));
                return this;
            }
        }
        
        public Builder setMountRemoved(MountRemovedCallback mountRemoved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountRemoved == null ? MemoryAddress.NULL : mountRemoved.toCallback()));
                return this;
            }
        }
        
        public Builder setMountPreUnmount(MountPreUnmountCallback mountPreUnmount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_pre_unmount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountPreUnmount == null ? MemoryAddress.NULL : mountPreUnmount.toCallback()));
                return this;
            }
        }
        
        public Builder setMountChanged(MountChangedCallback mountChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountChanged == null ? MemoryAddress.NULL : mountChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setDriveConnected(DriveConnectedCallback driveConnected) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("drive_connected"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveConnected == null ? MemoryAddress.NULL : driveConnected.toCallback()));
                return this;
            }
        }
        
        public Builder setDriveDisconnected(DriveDisconnectedCallback driveDisconnected) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("drive_disconnected"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveDisconnected == null ? MemoryAddress.NULL : driveDisconnected.toCallback()));
                return this;
            }
        }
        
        public Builder setDriveChanged(DriveChangedCallback driveChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("drive_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveChanged == null ? MemoryAddress.NULL : driveChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setIsSupported(IsSupportedCallback isSupported) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_supported"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (isSupported == null ? MemoryAddress.NULL : isSupported.toCallback()));
                return this;
            }
        }
        
        public Builder setGetConnectedDrives(GetConnectedDrivesCallback getConnectedDrives) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_connected_drives"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getConnectedDrives == null ? MemoryAddress.NULL : getConnectedDrives.toCallback()));
                return this;
            }
        }
        
        public Builder setGetVolumes(GetVolumesCallback getVolumes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_volumes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVolumes == null ? MemoryAddress.NULL : getVolumes.toCallback()));
                return this;
            }
        }
        
        public Builder setGetMounts(GetMountsCallback getMounts) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_mounts"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMounts == null ? MemoryAddress.NULL : getMounts.toCallback()));
                return this;
            }
        }
        
        public Builder setGetVolumeForUuid(GetVolumeForUuidCallback getVolumeForUuid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_volume_for_uuid"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getVolumeForUuid == null ? MemoryAddress.NULL : getVolumeForUuid.toCallback()));
                return this;
            }
        }
        
        public Builder setGetMountForUuid(GetMountForUuidCallback getMountForUuid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_uuid"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMountForUuid == null ? MemoryAddress.NULL : getMountForUuid.toCallback()));
                return this;
            }
        }
        
        public Builder setAdoptOrphanMount(AdoptOrphanMountCallback adoptOrphanMount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("adopt_orphan_mount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (adoptOrphanMount == null ? MemoryAddress.NULL : adoptOrphanMount.toCallback()));
                return this;
            }
        }
        
        public Builder setDriveEjectButton(DriveEjectButtonCallback driveEjectButton) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("drive_eject_button"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveEjectButton == null ? MemoryAddress.NULL : driveEjectButton.toCallback()));
                return this;
            }
        }
        
        public Builder setDriveStopButton(DriveStopButtonCallback driveStopButton) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("drive_stop_button"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (driveStopButton == null ? MemoryAddress.NULL : driveStopButton.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved1(GReserved1Callback GReserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved2(GReserved2Callback GReserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved3(GReserved3Callback GReserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved4(GReserved4Callback GReserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved5(GReserved5Callback GReserved5) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5.toCallback()));
                return this;
            }
        }
        
        public Builder setGReserved6(GReserved6Callback GReserved6) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6.toCallback()));
                return this;
            }
        }
    }
}
