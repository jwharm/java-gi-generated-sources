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
public class VolumeMonitor extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName("GVolumeMonitor");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public VolumeMonitor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to VolumeMonitor */
    public static VolumeMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new VolumeMonitor(gobject.refcounted());
    }
    
    /**
     * Gets a list of drives connected to the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     * @return a {@link org.gtk.glib.List} of connected {@link Drive} objects.
     */
    public @NotNull org.gtk.glib.List getConnectedDrives() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_connected_drives.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Finds a {@link Mount} object by its UUID (see g_mount_get_uuid())
     * @param uuid the UUID to look for
     * @return a {@link Mount} or {@code null} if no such mount is available.
     *     Free the returned object with g_object_unref().
     */
    public @Nullable org.gtk.gio.Mount getMountForUuid(@NotNull java.lang.String uuid) {
        java.util.Objects.requireNonNull(uuid, "Parameter 'uuid' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_mount_for_uuid.invokeExact(handle(), Interop.allocateNativeString(uuid));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Mount.MountImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a list of the mounts on the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     * @return a {@link org.gtk.glib.List} of {@link Mount} objects.
     */
    public @NotNull org.gtk.glib.List getMounts() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_mounts.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Finds a {@link Volume} object by its UUID (see g_volume_get_uuid())
     * @param uuid the UUID to look for
     * @return a {@link Volume} or {@code null} if no such volume is available.
     *     Free the returned object with g_object_unref().
     */
    public @Nullable org.gtk.gio.Volume getVolumeForUuid(@NotNull java.lang.String uuid) {
        java.util.Objects.requireNonNull(uuid, "Parameter 'uuid' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_volume_for_uuid.invokeExact(handle(), Interop.allocateNativeString(uuid));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Volume.VolumeImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a list of the volumes on the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     * @return a {@link org.gtk.glib.List} of {@link Volume} objects.
     */
    public @NotNull org.gtk.glib.List getVolumes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get_volumes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
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
    public static @NotNull org.gtk.gio.Volume adoptOrphanMount(@NotNull org.gtk.gio.Mount mount) {
        java.util.Objects.requireNonNull(mount, "Parameter 'mount' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_adopt_orphan_mount.invokeExact(mount.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Volume.VolumeImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the volume monitor used by gio.
     * @return a reference to the {@link VolumeMonitor} used by gio. Call
     *    g_object_unref() when done with it.
     */
    public static @NotNull org.gtk.gio.VolumeMonitor get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_monitor_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.VolumeMonitor(Refcounted.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface DriveChanged {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Drive drive);
    }
    
    /**
     * Emitted when a drive changes.
     */
    public Signal<VolumeMonitor.DriveChanged> onDriveChanged(VolumeMonitor.DriveChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drive-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.DriveChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveConnected {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Drive drive);
    }
    
    /**
     * Emitted when a drive is connected to the system.
     */
    public Signal<VolumeMonitor.DriveConnected> onDriveConnected(VolumeMonitor.DriveConnected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drive-connected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveConnected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.DriveConnected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveDisconnected {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Drive drive);
    }
    
    /**
     * Emitted when a drive is disconnected from the system.
     */
    public Signal<VolumeMonitor.DriveDisconnected> onDriveDisconnected(VolumeMonitor.DriveDisconnected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drive-disconnected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveDisconnected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.DriveDisconnected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveEjectButton {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Drive drive);
    }
    
    /**
     * Emitted when the eject button is pressed on {@code drive}.
     */
    public Signal<VolumeMonitor.DriveEjectButton> onDriveEjectButton(VolumeMonitor.DriveEjectButton handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drive-eject-button"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveEjectButton",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.DriveEjectButton>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DriveStopButton {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Drive drive);
    }
    
    /**
     * Emitted when the stop button is pressed on {@code drive}.
     */
    public Signal<VolumeMonitor.DriveStopButton> onDriveStopButton(VolumeMonitor.DriveStopButton handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drive-stop-button"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveStopButton",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.DriveStopButton>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountAdded {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Mount mount);
    }
    
    /**
     * Emitted when a mount is added.
     */
    public Signal<VolumeMonitor.MountAdded> onMountAdded(VolumeMonitor.MountAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mount-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.MountAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountChanged {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Mount mount);
    }
    
    /**
     * Emitted when a mount changes.
     */
    public Signal<VolumeMonitor.MountChanged> onMountChanged(VolumeMonitor.MountChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mount-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.MountChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountPreUnmount {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Mount mount);
    }
    
    /**
     * May be emitted when a mount is about to be removed.
     * <p>
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     */
    public Signal<VolumeMonitor.MountPreUnmount> onMountPreUnmount(VolumeMonitor.MountPreUnmount handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mount-pre-unmount"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountPreUnmount",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.MountPreUnmount>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MountRemoved {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Mount mount);
    }
    
    /**
     * Emitted when a mount is removed.
     */
    public Signal<VolumeMonitor.MountRemoved> onMountRemoved(VolumeMonitor.MountRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mount-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.MountRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeAdded {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Volume volume);
    }
    
    /**
     * Emitted when a mountable volume is added to the system.
     */
    public Signal<VolumeMonitor.VolumeAdded> onVolumeAdded(VolumeMonitor.VolumeAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("volume-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorVolumeAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.VolumeAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeChanged {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Volume volume);
    }
    
    /**
     * Emitted when mountable volume is changed.
     */
    public Signal<VolumeMonitor.VolumeChanged> onVolumeChanged(VolumeMonitor.VolumeChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("volume-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorVolumeChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.VolumeChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeRemoved {
        void signalReceived(VolumeMonitor source, @NotNull org.gtk.gio.Volume volume);
    }
    
    /**
     * Emitted when a mountable volume is removed from the system.
     */
    public Signal<VolumeMonitor.VolumeRemoved> onVolumeRemoved(VolumeMonitor.VolumeRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("volume-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorVolumeRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<VolumeMonitor.VolumeRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_volume_monitor_get_connected_drives = Interop.downcallHandle(
            "g_volume_monitor_get_connected_drives",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_volume_monitor_get_mount_for_uuid = Interop.downcallHandle(
            "g_volume_monitor_get_mount_for_uuid",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_volume_monitor_get_mounts = Interop.downcallHandle(
            "g_volume_monitor_get_mounts",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_volume_monitor_get_volume_for_uuid = Interop.downcallHandle(
            "g_volume_monitor_get_volume_for_uuid",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_volume_monitor_get_volumes = Interop.downcallHandle(
            "g_volume_monitor_get_volumes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_volume_monitor_adopt_orphan_mount = Interop.downcallHandle(
            "g_volume_monitor_adopt_orphan_mount",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_volume_monitor_get = Interop.downcallHandle(
            "g_volume_monitor_get",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalVolumeMonitorDriveChanged(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.DriveChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveConnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.DriveConnected) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveDisconnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.DriveDisconnected) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveEjectButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.DriveEjectButton) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveStopButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.DriveStopButton) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorMountAdded(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.MountAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorMountChanged(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.MountChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorMountPreUnmount(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.MountPreUnmount) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorMountRemoved(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.MountRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorVolumeAdded(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.VolumeAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Volume.VolumeImpl(Refcounted.get(volume, false)));
        }
        
        public static void signalVolumeMonitorVolumeChanged(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.VolumeChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Volume.VolumeImpl(Refcounted.get(volume, false)));
        }
        
        public static void signalVolumeMonitorVolumeRemoved(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (VolumeMonitor.VolumeRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new VolumeMonitor(Refcounted.get(source)), new org.gtk.gio.Volume.VolumeImpl(Refcounted.get(volume, false)));
        }
    }
}
