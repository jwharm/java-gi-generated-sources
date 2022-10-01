package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
     */
    public org.gtk.glib.List getConnectedDrives() {
        var RESULT = gtk_h.g_volume_monitor_get_connected_drives(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Finds a {@link Mount} object by its UUID (see g_mount_get_uuid())
     */
    public Mount getMountForUuid(java.lang.String uuid) {
        var RESULT = gtk_h.g_volume_monitor_get_mount_for_uuid(handle(), Interop.allocateNativeString(uuid).handle());
        return new Mount.MountImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a list of the mounts on the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     */
    public org.gtk.glib.List getMounts() {
        var RESULT = gtk_h.g_volume_monitor_get_mounts(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Finds a {@link Volume} object by its UUID (see g_volume_get_uuid())
     */
    public Volume getVolumeForUuid(java.lang.String uuid) {
        var RESULT = gtk_h.g_volume_monitor_get_volume_for_uuid(handle(), Interop.allocateNativeString(uuid).handle());
        return new Volume.VolumeImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets a list of the volumes on the system.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     */
    public org.gtk.glib.List getVolumes() {
        var RESULT = gtk_h.g_volume_monitor_get_volumes(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the volume monitor used by gio.
     */
    public static VolumeMonitor get() {
        var RESULT = gtk_h.g_volume_monitor_get();
        return new VolumeMonitor(Refcounted.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface DriveChangedHandler {
        void signalReceived(VolumeMonitor source, Drive drive);
    }
    
    /**
     * Emitted when a drive changes.
     */
    public SignalHandle onDriveChanged(DriveChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drive-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DriveConnectedHandler {
        void signalReceived(VolumeMonitor source, Drive drive);
    }
    
    /**
     * Emitted when a drive is connected to the system.
     */
    public SignalHandle onDriveConnected(DriveConnectedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drive-connected").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveConnected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DriveDisconnectedHandler {
        void signalReceived(VolumeMonitor source, Drive drive);
    }
    
    /**
     * Emitted when a drive is disconnected from the system.
     */
    public SignalHandle onDriveDisconnected(DriveDisconnectedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drive-disconnected").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveDisconnected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DriveEjectButtonHandler {
        void signalReceived(VolumeMonitor source, Drive drive);
    }
    
    /**
     * Emitted when the eject button is pressed on {@code drive}.
     */
    public SignalHandle onDriveEjectButton(DriveEjectButtonHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drive-eject-button").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveEjectButton",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DriveStopButtonHandler {
        void signalReceived(VolumeMonitor source, Drive drive);
    }
    
    /**
     * Emitted when the stop button is pressed on {@code drive}.
     */
    public SignalHandle onDriveStopButton(DriveStopButtonHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drive-stop-button").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorDriveStopButton",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MountAddedHandler {
        void signalReceived(VolumeMonitor source, Mount mount);
    }
    
    /**
     * Emitted when a mount is added.
     */
    public SignalHandle onMountAdded(MountAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mount-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MountChangedHandler {
        void signalReceived(VolumeMonitor source, Mount mount);
    }
    
    /**
     * Emitted when a mount changes.
     */
    public SignalHandle onMountChanged(MountChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mount-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MountPreUnmountHandler {
        void signalReceived(VolumeMonitor source, Mount mount);
    }
    
    /**
     * May be emitted when a mount is about to be removed.
     * <p>
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     */
    public SignalHandle onMountPreUnmount(MountPreUnmountHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mount-pre-unmount").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountPreUnmount",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MountRemovedHandler {
        void signalReceived(VolumeMonitor source, Mount mount);
    }
    
    /**
     * Emitted when a mount is removed.
     */
    public SignalHandle onMountRemoved(MountRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mount-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorMountRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface VolumeAddedHandler {
        void signalReceived(VolumeMonitor source, Volume volume);
    }
    
    /**
     * Emitted when a mountable volume is added to the system.
     */
    public SignalHandle onVolumeAdded(VolumeAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("volume-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorVolumeAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface VolumeChangedHandler {
        void signalReceived(VolumeMonitor source, Volume volume);
    }
    
    /**
     * Emitted when mountable volume is changed.
     */
    public SignalHandle onVolumeChanged(VolumeChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("volume-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorVolumeChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface VolumeRemovedHandler {
        void signalReceived(VolumeMonitor source, Volume volume);
    }
    
    /**
     * Emitted when a mountable volume is removed from the system.
     */
    public SignalHandle onVolumeRemoved(VolumeRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("volume-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(VolumeMonitor.Callbacks.class, "signalVolumeMonitorVolumeRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalVolumeMonitorDriveChanged(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.DriveChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveConnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.DriveConnectedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveDisconnected(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.DriveDisconnectedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveEjectButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.DriveEjectButtonHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorDriveStopButton(MemoryAddress source, MemoryAddress drive, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.DriveStopButtonHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Drive.DriveImpl(Refcounted.get(drive, false)));
        }
        
        public static void signalVolumeMonitorMountAdded(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.MountAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorMountChanged(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.MountChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorMountPreUnmount(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.MountPreUnmountHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorMountRemoved(MemoryAddress source, MemoryAddress mount, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.MountRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Mount.MountImpl(Refcounted.get(mount, false)));
        }
        
        public static void signalVolumeMonitorVolumeAdded(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.VolumeAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Volume.VolumeImpl(Refcounted.get(volume, false)));
        }
        
        public static void signalVolumeMonitorVolumeChanged(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.VolumeChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Volume.VolumeImpl(Refcounted.get(volume, false)));
        }
        
        public static void signalVolumeMonitorVolumeRemoved(MemoryAddress source, MemoryAddress volume, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (VolumeMonitor.VolumeRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new VolumeMonitor(Refcounted.get(source)), new Volume.VolumeImpl(Refcounted.get(volume, false)));
        }
        
    }
}
