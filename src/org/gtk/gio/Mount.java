package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link org.gtk.gio.Mount} interface represents user-visible mounts. Note, when
 * porting from GnomeVFS, {@link org.gtk.gio.Mount} is the moral equivalent of <code>#GnomeVFSVolume</code> 
 * 
 * {@link org.gtk.gio.Mount} is a &<code>#34</code> mounted&<code>#34</code>  filesystem that you can access. Mounted is in
 * quotes because it&<code>#39</code> s not the same as a unix mount, it might be a gvfs
 * mount, but you can still access the files on it if you use GIO. Might or
 * might not be related to a volume object.
 * 
 * Unmounting a {@link org.gtk.gio.Mount} instance is an asynchronous operation. For
 * more information about asynchronous operations, see {@link org.gtk.gio.AsyncResult} and {@link org.gtk.gio.Task}  To unmount a {@link org.gtk.gio.Mount} instance, first call
 * g_mount_unmount_with_operation() with (at least) the {@link org.gtk.gio.Mount} instance and a
 * {@link org.gtk.gio.AsyncReadyCallback}   The callback will be fired when the
 * operation has resolved (either with success or failure), and a
 * {@link org.gtk.gio.AsyncResult} structure will be passed to the callback.  That
 * callback should then call g_mount_unmount_with_operation_finish() with the {@link org.gtk.gio.Mount} and the {@link org.gtk.gio.AsyncResult} data to see if the operation was completed
 * successfully.  If an @error is present when g_mount_unmount_with_operation_finish()
 * is called, then it will be filled with any error information.
 */
public interface Mount extends io.github.jwharm.javagi.NativeAddress {

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
     * Ejects a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_eject_with_operation_finish() with the @mount
     * and {@link org.gtk.gio.AsyncResult} data returned in the @callback.
     */
    public default void ejectWithOperation(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_mount_eject_with_operation(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and <code>false</code> will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_mount_eject_with_operation_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
     * This is a convenience method for getting the {@link org.gtk.gio.Volume} and then
     * using that object to get the {@link org.gtk.gio.Drive}
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
     * considered an opaque string. Returns <code>null</code> if there is no UUID
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
     * Tries to guess the type of content stored on @mount. Returns one or
     * more textual identifiers of well-known content types (typically
     * prefixed with &<code>#34</code> x-content/&<code>#34</code> ), e.g. x-content/image-dcf for camera
     * memory cards. See the
     * {@link [shared-mime-info]}(http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * specification for more on x-content types.
     * 
     * This is an asynchronous operation (see
     * g_mount_guess_content_type_sync() for the synchronous version), and
     * is finished by calling g_mount_guess_content_type_finish() with the
     * @mount and {@link org.gtk.gio.AsyncResult} data returned in the @callback.
     */
    public default void guessContentType(boolean forceRescan, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_mount_guess_content_type(handle(), forceRescan ? 1 : 0, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Determines if @mount is shadowed. Applications or libraries should
     * avoid displaying @mount in the user interface if it is shadowed.
     * <p>
     * A mount is said to be shadowed if there exists one or more user
     * visible objects (currently {@link org.gtk.gio.Mount} objects) with a root that is
     * inside the root of @mount.
     * <p>
     * One application of shadow mounts is when exposing a single file
     * system that is used to address several logical volumes. In this
     * situation, a {@link org.gtk.gio.VolumeMonitor} implementation would create two
     * {@link org.gtk.gio.Volume} objects (for example, one for the camera functionality of
     * the device and one for a SD card reader on the device) with
     * activation URIs <code>gphoto2://{@link [usb:001,002]}/store1/</code>
     * and <code>gphoto2://{@link [usb:001,002]}/store2/</code>. When the
     * underlying mount (with root<code>gphoto2://{@link [usb:001,002]}/</code>) is mounted, said
     * {@link org.gtk.gio.VolumeMonitor} implementation would create two {@link org.gtk.gio.Mount} objects
     * (each with their root matching the corresponding volume activation
     * root) that would shadow the original mount.
     * 
     * The proxy monitor in GVfs 2.26 and later, automatically creates and
     * manage shadow mounts (and shadows the underlying mount) if the
     * activation root on a {@link org.gtk.gio.Volume} is set.
     */
    public default boolean isShadowed() {
        var RESULT = gtk_h.g_mount_is_shadowed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Remounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_remount_finish() with the @mount
     * and <code>#GAsyncResults</code> data returned in the @callback.
     * 
     * Remounting is useful when some setting affecting the operation
     * of the volume has been changed, as these may need a remount to
     * take affect. While this is semantically equivalent with unmounting
     * and then remounting not all backends might need to actually be
     * unmounted.
     */
    public default void remount(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_mount_remount(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes remounting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and <code>false</code> will be returned.
     */
    public default boolean remountFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_mount_remount_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Increments the shadow count on @mount. Usually used by
     * {@link org.gtk.gio.VolumeMonitor} implementations when creating a shadow mount for
     * @mount, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the {@link org.gtk.gio.Mount} :changed signal on @mount manually.
     */
    public default void shadow() {
        gtk_h.g_mount_shadow(handle());
    }
    
    /**
     * Unmounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_unmount_with_operation_finish() with the @mount
     * and {@link org.gtk.gio.AsyncResult} data returned in the @callback.
     */
    public default void unmountWithOperation(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_mount_unmount_with_operation(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * @error will be set to contain the errors and <code>false</code> will be returned.
     */
    public default boolean unmountWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_mount_unmount_with_operation_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Decrements the shadow count on @mount. Usually used by
     * {@link org.gtk.gio.VolumeMonitor} implementations when destroying a shadow mount for
     * @mount, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the {@link org.gtk.gio.Mount} :changed signal on @mount manually.
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
    public default SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreUnmountHandler {
        void signalReceived(Mount source);
    }
    
    /**
     * This signal may be emitted when the {@link org.gtk.gio.Mount} is about to be
     * unmounted.
     * 
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     */
    public default SignalHandle onPreUnmount(PreUnmountHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountPreUnmount", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("pre-unmount").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnmountedHandler {
        void signalReceived(Mount source);
    }
    
    /**
     * This signal is emitted when the {@link org.gtk.gio.Mount} have been
     * unmounted. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     */
    public default SignalHandle onUnmounted(UnmountedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMountUnmounted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unmounted").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class MountImpl extends org.gtk.gobject.Object implements Mount {
        public MountImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
