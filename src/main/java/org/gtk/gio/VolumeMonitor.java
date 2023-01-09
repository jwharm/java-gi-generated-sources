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
     */
    protected VolumeMonitor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VolumeMonitor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VolumeMonitor(input);
    
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
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_connected_drives.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds a {@link Mount} object by its UUID (see g_mount_get_uuid())
     * @param uuid the UUID to look for
     * @return a {@link Mount} or {@code null} if no such mount is available.
     *     Free the returned object with g_object_unref().
     */
    public @Nullable org.gtk.gio.Mount getMountForUuid(java.lang.String uuid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_mount_for_uuid.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uuid, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.Mount) Interop.register(RESULT, org.gtk.gio.Mount.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_mounts.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds a {@link Volume} object by its UUID (see g_volume_get_uuid())
     * @param uuid the UUID to look for
     * @return a {@link Volume} or {@code null} if no such volume is available.
     *     Free the returned object with g_object_unref().
     */
    public @Nullable org.gtk.gio.Volume getVolumeForUuid(java.lang.String uuid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_volume_for_uuid.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uuid, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gio.Volume) Interop.register(RESULT, org.gtk.gio.Volume.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_volumes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_adopt_orphan_mount.invokeExact(mount.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.Volume) Interop.register(RESULT, org.gtk.gio.Volume.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
        var OBJECT = (org.gtk.gio.VolumeMonitor) Interop.register(RESULT, org.gtk.gio.VolumeMonitor.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Functional interface declaration of the {@code DriveChanged} callback.
     */
    @FunctionalInterface
    public interface DriveChanged {
    
        /**
         * Emitted when a drive changes.
         */
        void run(org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a drive changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveChanged> onDriveChanged(VolumeMonitor.DriveChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveConnected} callback.
     */
    @FunctionalInterface
    public interface DriveConnected {
    
        /**
         * Emitted when a drive is connected to the system.
         */
        void run(org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveConnected.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a drive is connected to the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveConnected> onDriveConnected(VolumeMonitor.DriveConnected handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-connected", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveDisconnected} callback.
     */
    @FunctionalInterface
    public interface DriveDisconnected {
    
        /**
         * Emitted when a drive is disconnected from the system.
         */
        void run(org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveDisconnected.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a drive is disconnected from the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveDisconnected> onDriveDisconnected(VolumeMonitor.DriveDisconnected handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-disconnected", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveEjectButton} callback.
     */
    @FunctionalInterface
    public interface DriveEjectButton {
    
        /**
         * Emitted when the eject button is pressed on {@code drive}.
         */
        void run(org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveEjectButton.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the eject button is pressed on {@code drive}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveEjectButton> onDriveEjectButton(VolumeMonitor.DriveEjectButton handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-eject-button", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DriveStopButton} callback.
     */
    @FunctionalInterface
    public interface DriveStopButton {
    
        /**
         * Emitted when the stop button is pressed on {@code drive}.
         */
        void run(org.gtk.gio.Drive drive);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress drive) {
            run((org.gtk.gio.Drive) Interop.register(drive, org.gtk.gio.Drive.fromAddress).marshal(drive, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DriveStopButton.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the stop button is pressed on {@code drive}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.DriveStopButton> onDriveStopButton(VolumeMonitor.DriveStopButton handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drive-stop-button", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountAdded} callback.
     */
    @FunctionalInterface
    public interface MountAdded {
    
        /**
         * Emitted when a mount is added.
         */
        void run(org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a mount is added.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.MountAdded> onMountAdded(VolumeMonitor.MountAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountChanged} callback.
     */
    @FunctionalInterface
    public interface MountChanged {
    
        /**
         * Emitted when a mount changes.
         */
        void run(org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a mount changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.MountChanged> onMountChanged(VolumeMonitor.MountChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountPreUnmount} callback.
     */
    @FunctionalInterface
    public interface MountPreUnmount {
    
        /**
         * May be emitted when a mount is about to be removed.
         * <p>
         * This signal depends on the backend and is only emitted if
         * GIO was used to unmount.
         */
        void run(org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountPreUnmount.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-pre-unmount", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountRemoved} callback.
     */
    @FunctionalInterface
    public interface MountRemoved {
    
        /**
         * Emitted when a mount is removed.
         */
        void run(org.gtk.gio.Mount mount);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress mount) {
            run((org.gtk.gio.Mount) Interop.register(mount, org.gtk.gio.Mount.fromAddress).marshal(mount, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a mount is removed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.MountRemoved> onMountRemoved(VolumeMonitor.MountRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mount-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code VolumeAdded} callback.
     */
    @FunctionalInterface
    public interface VolumeAdded {
    
        /**
         * Emitted when a mountable volume is added to the system.
         */
        void run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VolumeAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a mountable volume is added to the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.VolumeAdded> onVolumeAdded(VolumeMonitor.VolumeAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("volume-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code VolumeChanged} callback.
     */
    @FunctionalInterface
    public interface VolumeChanged {
    
        /**
         * Emitted when mountable volume is changed.
         */
        void run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VolumeChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when mountable volume is changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.VolumeChanged> onVolumeChanged(VolumeMonitor.VolumeChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("volume-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code VolumeRemoved} callback.
     */
    @FunctionalInterface
    public interface VolumeRemoved {
    
        /**
         * Emitted when a mountable volume is removed from the system.
         */
        void run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolumeMonitor, MemoryAddress volume) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VolumeRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a mountable volume is removed from the system.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<VolumeMonitor.VolumeRemoved> onVolumeRemoved(VolumeMonitor.VolumeRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("volume-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
        
        /**
         * Default constructor for a {@code Builder} object.
         */
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_volume_monitor_get_type != null;
    }
}
