package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VolumeMonitor} is for listing the user interesting devices and volumes
 * on the computer. In other words, what a file selector or file manager
 * would show in a sidebar.
 * <p>
 * {@link VolumeMonitor} is not
 * [thread-default-context aware][g-main-context-push-thread-default],
 * and so should not be used other than from the main thread, with no
 * thread-default-context active.
 * <p>
 * In order to receive updates about volumes and mounts monitored through GVFS,
 * a main loop must be running.
 */
public class VolumeMonitor extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVolumeMonitor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VolumeMonitor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VolumeMonitor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VolumeMonitor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VolumeMonitor(input, ownership);
    
    /**
     * Gets a list of drives connected to the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     * @return a {@link org.gtk.glib.List} of connected {@link Drive} objects.
     */
    public org.gtk.glib.List getConnectedDrives() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_connected_drives.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds a {@link Mount} object by its UUID (see g_mount_get_uuid())
     * @param uuid the UUID to look for
     * @return a {@link Mount} or {@code null} if no such mount is available.
     *     Free the returned object with g_object_unref().
     */
    public @Nullable org.gtk.gio.Mount getMountForUuid(java.lang.String uuid) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_mount_for_uuid.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uuid, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Mount.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of the mounts on the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     * @return a {@link org.gtk.glib.List} of {@link Mount} objects.
     */
    public org.gtk.glib.List getMounts() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_mounts.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds a {@link Volume} object by its UUID (see g_volume_get_uuid())
     * @param uuid the UUID to look for
     * @return a {@link Volume} or {@code null} if no such volume is available.
     *     Free the returned object with g_object_unref().
     */
    public @Nullable org.gtk.gio.Volume getVolumeForUuid(java.lang.String uuid) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_volume_for_uuid.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uuid, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Volume.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of the volumes on the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     * @return a {@link org.gtk.glib.List} of {@link Volume} objects.
     */
    public org.gtk.glib.List getVolumes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_volumes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_volume_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * This function should be called by any {@link VolumeMonitor}
     * implementation when a new {@link Mount} object is created that is not
     * associated with a {@link Volume} object. It must be called just before
     * emitting the {@code mount_added} signal.
     * <p>
     * If the return value is not {@code null}, the caller must associate the
     * returned {@link Volume} object with the {@link Mount}. This involves returning
     * it in its g_mount_get_volume() implementation. The caller must
     * also listen for the "removed" signal on the returned object
     * and give up its reference when handling that signal
     * <p>
     * Similarly, if implementing g_volume_monitor_adopt_orphan_mount(),
     * the implementor must take a reference to {@code mount} and return it in
     * its g_volume_get_mount() implemented. Also, the implementor must
     * listen for the "unmounted" signal on {@code mount} and give up its
     * reference upon handling that signal.
     * <p>
     * There are two main use cases for this function.
     * <p>
     * One is when implementing a user space file system driver that reads
     * blocks of a block device that is already represented by the native
     * volume monitor (for example a CD Audio file system driver). Such
     * a driver will generate its own {@link Mount} object that needs to be
     * associated with the {@link Volume} object that represents the volume.
     * <p>
     * The other is for implementing a {@link VolumeMonitor} whose sole purpose
     * is to return {@link Volume} objects representing entries in the users
     * "favorite servers" list or similar.
     * @param mount a {@link Mount} object to find a parent for
     * @return the {@link Volume} object that is the parent for {@code mount} or {@code null}
     * if no wants to adopt the {@link Mount}.
     * @deprecated Instead of using this function, {@link VolumeMonitor}
     * implementations should instead create shadow mounts with the URI of
     * the mount they intend to adopt. See the proxy volume monitor in
     * gvfs for an example of this. Also see g_mount_is_shadowed(),
     * g_mount_shadow() and g_mount_unshadow() functions.
     */
    @Deprecated
    public static org.gtk.gio.Volume adoptOrphanMount(org.gtk.gio.Mount mount) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_adopt_orphan_mount.invokeExact(
                    mount.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Volume.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the volume monitor used by gio.
     * @return a reference to the {@link VolumeMonitor} used by gio. Call
     *    g_object_unref() when done with it.
     */
    public static org.gtk.gio.VolumeMonitor get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.VolumeMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.VolumeMonitor.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface DriveChanged {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DriveChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a drive changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveChanged> onDriveChanged(VolumeMonitor.DriveChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveConnected {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DriveConnected.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a drive is connected to the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveConnected> onDriveConnected(VolumeMonitor.DriveConnected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-connected"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveDisconnected {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DriveDisconnected.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a drive is disconnected from the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveDisconnected> onDriveDisconnected(VolumeMonitor.DriveDisconnected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-disconnected"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveEjectButton {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DriveEjectButton.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the eject button is pressed on {@code drive}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveEjectButton> onDriveEjectButton(VolumeMonitor.DriveEjectButton handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-eject-button"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveStopButton {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DriveStopButton.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the stop button is pressed on {@code drive}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveStopButton> onDriveStopButton(VolumeMonitor.DriveStopButton handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-stop-button"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountAdded {
        void run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a mount is added.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.MountAdded> onMountAdded(VolumeMonitor.MountAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountChanged {
        void run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a mount changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.MountChanged> onMountChanged(VolumeMonitor.MountChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountPreUnmount {
        void run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountPreUnmount.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * May be emitted when a mount is about to be removed.
     * <p>
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.MountPreUnmount> onMountPreUnmount(VolumeMonitor.MountPreUnmount handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-pre-unmount"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountRemoved {
        void run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a mount is removed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.MountRemoved> onMountRemoved(VolumeMonitor.MountRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeAdded {
        void run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VolumeAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a mountable volume is added to the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.VolumeAdded> onVolumeAdded(VolumeMonitor.VolumeAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("volume-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeChanged {
        void run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VolumeChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when mountable volume is changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.VolumeChanged> onVolumeChanged(VolumeMonitor.VolumeChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("volume-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeRemoved {
        void run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VolumeRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a mountable volume is removed from the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.VolumeRemoved> onVolumeRemoved(VolumeMonitor.VolumeRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("volume-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link VolumeMonitor.Builder} object constructs a {@link VolumeMonitor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VolumeMonitor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VolumeMonitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VolumeMonitor}.
         * @return A new instance of {@code VolumeMonitor} with the properties 
         *         that were set in the Builder object.
         */
        public VolumeMonitor build() {
            return (VolumeMonitor) org.gtk.gobject.GObject.newWithProperties(
                VolumeMonitor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_volume_monitor_get_connected_drives = Interop.downcallHandle(
            "g_volume_monitor_get_connected_drives",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_volume_monitor_get_mount_for_uuid = Interop.downcallHandle(
            "g_volume_monitor_get_mount_for_uuid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_volume_monitor_get_mounts = Interop.downcallHandle(
            "g_volume_monitor_get_mounts",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_volume_monitor_get_volume_for_uuid = Interop.downcallHandle(
            "g_volume_monitor_get_volume_for_uuid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_volume_monitor_get_volumes = Interop.downcallHandle(
            "g_volume_monitor_get_volumes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_volume_monitor_get_type = Interop.downcallHandle(
            "g_volume_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_volume_monitor_adopt_orphan_mount = Interop.downcallHandle(
            "g_volume_monitor_adopt_orphan_mount",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_volume_monitor_get = Interop.downcallHandle(
            "g_volume_monitor_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
