package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GMount interface represents user-visible mounts. Note, when
 * porting from GnomeVFS, #GMount is the moral equivalent of #GnomeVFSVolume.
 * 
 * #GMount is a "mounted" filesystem that you can access. Mounted is in
 * quotes because it's not the same as a unix mount, it might be a gvfs
 * mount, but you can still access the files on it if you use GIO. Might or
 * might not be related to a volume object.
 * 
 * Unmounting a #GMount instance is an asynchronous operation. For
 * more information about asynchronous operations, see #GAsyncResult
 * and #GTask. To unmount a #GMount instance, first call
 * g_mount_unmount_with_operation() with (at least) the #GMount instance and a
 * #GAsyncReadyCallback.  The callback will be fired when the
 * operation has resolved (either with success or failure), and a
 * #GAsyncResult structure will be passed to the callback.  That
 * callback should then call g_mount_unmount_with_operation_finish() with the #GMount
 * and the #GAsyncResult data to see if the operation was completed
 * successfully.  If an @error is present when g_mount_unmount_with_operation_finish()
 * is called, then it will be filled with any error information.
 */
public interface Mount extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Checks if @mount can be ejected.
     */
    public default boolean canEject() {
        var RESULT = gtk_h.g_mount_can_eject(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @mount can be unmounted.
     */
    public default boolean canUnmount() {
        var RESULT = gtk_h.g_mount_can_unmount(handle());
        return (RESULT != 0);
    }
    
    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and %FALSE will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_mount_eject_with_operation_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the default location of @mount. The default location of the given
     * @mount is a path that reflects the main entry point for the user (e.g.
     * the home directory, or the root of the volume).
     */
    public default File getDefaultLocation() {
        var RESULT = gtk_h.g_mount_get_default_location(handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the drive for the @mount.
     * 
     * This is a convenience method for getting the #GVolume and then
     * using that object to get the #GDrive.
     */
    public default Drive getDrive() {
        var RESULT = gtk_h.g_mount_get_drive(handle());
        return new Drive.DriveImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the icon for @mount.
     */
    public default Icon getIcon() {
        var RESULT = gtk_h.g_mount_get_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the name of @mount.
     */
    public default java.lang.String getName() {
        var RESULT = gtk_h.g_mount_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the root directory on @mount.
     */
    public default File getRoot() {
        var RESULT = gtk_h.g_mount_get_root(handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the sort key for @mount, if any.
     */
    public default java.lang.String getSortKey() {
        var RESULT = gtk_h.g_mount_get_sort_key(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the symbolic icon for @mount.
     */
    public default Icon getSymbolicIcon() {
        var RESULT = gtk_h.g_mount_get_symbolic_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the UUID for the @mount. The reference is typically based on
     * the file system UUID for the mount in question and should be
     * considered an opaque string. Returns %NULL if there is no UUID
     * available.
     */
    public default java.lang.String getUuid() {
        var RESULT = gtk_h.g_mount_get_uuid(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the volume for the @mount.
     */
    public default Volume getVolume() {
        var RESULT = gtk_h.g_mount_get_volume(handle());
        return new Volume.VolumeImpl(References.get(RESULT, true));
    }
    
    /**
     * Determines if @mount is shadowed. Applications or libraries should
     * avoid displaying @mount in the user interface if it is shadowed.
     * 
     * A mount is said to be shadowed if there exists one or more user
     * visible objects (currently #GMount objects) with a root that is
     * inside the root of @mount.
     * 
     * One application of shadow mounts is when exposing a single file
     * system that is used to address several logical volumes. In this
     * situation, a #GVolumeMonitor implementation would create two
     * #GVolume objects (for example, one for the camera functionality of
     * the device and one for a SD card reader on the device) with
     * activation URIs `gphoto2://[usb:001,002]/store1/`
     * and `gphoto2://[usb:001,002]/store2/`. When the
     * underlying mount (with root
     * `gphoto2://[usb:001,002]/`) is mounted, said
     * #GVolumeMonitor implementation would create two #GMount objects
     * (each with their root matching the corresponding volume activation
     * root) that would shadow the original mount.
     * 
     * The proxy monitor in GVfs 2.26 and later, automatically creates and
     * manage shadow mounts (and shadows the underlying mount) if the
     * activation root on a #GVolume is set.
     */
    public default boolean isShadowed() {
        var RESULT = gtk_h.g_mount_is_shadowed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Finishes remounting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and %FALSE will be returned.
     */
    public default boolean remountFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_mount_remount_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Increments the shadow count on @mount. Usually used by
     * #GVolumeMonitor implementations when creating a shadow mount for
     * @mount, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the #GMount::changed signal on @mount manually.
     */
    public default void shadow() {
        gtk_h.g_mount_shadow(handle());
    }
    
    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and %FALSE will be returned.
     */
    public default boolean unmountWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_mount_unmount_with_operation_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Decrements the shadow count on @mount. Usually used by
     * #GVolumeMonitor implementations when destroying a shadow mount for
     * @mount, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the #GMount::changed signal on @mount manually.
     */
    public default void unshadow() {
        gtk_h.g_mount_unshadow(handle());
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Mount source);
    }
    
    /**
     * Emitted when the mount has been changed.
     */
    public default void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreUnmountHandler {
        void signalReceived(Mount source);
    }
    
    /**
     * This signal may be emitted when the #GMount is about to be
     * unmounted.
     * 
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     */
    public default void onPreUnmount(PreUnmountHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountPreUnmount", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("pre-unmount").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnmountedHandler {
        void signalReceived(Mount source);
    }
    
    /**
     * This signal is emitted when the #GMount have been
     * unmounted. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     */
    public default void onUnmounted(UnmountedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountUnmounted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("unmounted").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class MountImpl extends org.gtk.gobject.Object implements Mount {
        public MountImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
