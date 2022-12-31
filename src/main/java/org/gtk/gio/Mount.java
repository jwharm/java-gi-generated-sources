package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Mount} interface represents user-visible mounts. Note, when
 * porting from GnomeVFS, {@link Mount} is the moral equivalent of {@code GnomeVFSVolume}.
 * <p>
 * {@link Mount} is a "mounted" filesystem that you can access. Mounted is in
 * quotes because it's not the same as a unix mount, it might be a gvfs
 * mount, but you can still access the files on it if you use GIO. Might or
 * might not be related to a volume object.
 * <p>
 * Unmounting a {@link Mount} instance is an asynchronous operation. For
 * more information about asynchronous operations, see {@link AsyncResult}
 * and {@link Task}. To unmount a {@link Mount} instance, first call
 * g_mount_unmount_with_operation() with (at least) the {@link Mount} instance and a
 * {@link AsyncReadyCallback}.  The callback will be fired when the
 * operation has resolved (either with success or failure), and a
 * {@link AsyncResult} structure will be passed to the callback.  That
 * callback should then call g_mount_unmount_with_operation_finish() with the {@link Mount}
 * and the {@link AsyncResult} data to see if the operation was completed
 * successfully.  If an {@code error} is present when g_mount_unmount_with_operation_finish()
 * is called, then it will be filled with any error information.
 */
public interface Mount extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MountImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MountImpl(input, ownership);
    
    /**
     * Checks if {@code mount} can be ejected.
     * @return {@code true} if the {@code mount} can be ejected.
     */
    default boolean canEject() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_can_eject.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code mount} can be unmounted.
     * @return {@code true} if the {@code mount} can be unmounted.
     */
    default boolean canUnmount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_can_unmount.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Ejects a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_eject_finish() with the {@code mount}
     * and {@link AsyncResult} data returned in the {@code callback}.
     * @param flags flags affecting the unmount if required for eject
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     * @deprecated Use g_mount_eject_with_operation() instead.
     */
    @Deprecated
    default void eject(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_mount_eject.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the mount was successfully ejected. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_mount_eject_with_operation_finish() instead.
     */
    @Deprecated
    default boolean ejectFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_eject_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Ejects a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_eject_with_operation_finish() with the {@code mount}
     * and {@link AsyncResult} data returned in the {@code callback}.
     * @param flags flags affecting the unmount if required for eject
     * @param mountOperation a {@link MountOperation} or {@code null} to avoid
     *     user interaction.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     */
    default void ejectWithOperation(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_mount_eject_with_operation.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the mount was successfully ejected. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean ejectWithOperationFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_eject_with_operation_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the default location of {@code mount}. The default location of the given
     * {@code mount} is a path that reflects the main entry point for the user (e.g.
     * the home directory, or the root of the volume).
     * @return a {@link File}.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    default org.gtk.gio.File getDefaultLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_default_location.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the drive for the {@code mount}.
     * <p>
     * This is a convenience method for getting the {@link Volume} and then
     * using that object to get the {@link Drive}.
     * @return a {@link Drive} or {@code null} if {@code mount} is not
     *      associated with a volume or a drive.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    default @Nullable org.gtk.gio.Drive getDrive() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_drive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Drive.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the icon for {@code mount}.
     * @return a {@link Icon}.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    default org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the name of {@code mount}.
     * @return the name for the given {@code mount}.
     *     The returned string should be freed with g_free()
     *     when no longer needed.
     */
    default java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the root directory on {@code mount}.
     * @return a {@link File}.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    default org.gtk.gio.File getRoot() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_root.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the sort key for {@code mount}, if any.
     * @return Sorting key for {@code mount} or {@code null} if no such key is available.
     */
    default @Nullable java.lang.String getSortKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_sort_key.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the symbolic icon for {@code mount}.
     * @return a {@link Icon}.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    default org.gtk.gio.Icon getSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_symbolic_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the UUID for the {@code mount}. The reference is typically based on
     * the file system UUID for the mount in question and should be
     * considered an opaque string. Returns {@code null} if there is no UUID
     * available.
     * @return the UUID for {@code mount} or {@code null} if no UUID
     *     can be computed.
     *     The returned string should be freed with g_free()
     *     when no longer needed.
     */
    default @Nullable java.lang.String getUuid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_uuid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the volume for the {@code mount}.
     * @return a {@link Volume} or {@code null} if {@code mount} is not
     *      associated with a volume.
     *      The returned object should be unreffed with
     *      g_object_unref() when no longer needed.
     */
    default @Nullable org.gtk.gio.Volume getVolume() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_get_volume.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Volume.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Tries to guess the type of content stored on {@code mount}. Returns one or
     * more textual identifiers of well-known content types (typically
     * prefixed with "x-content/"), e.g. x-content/image-dcf for camera
     * memory cards. See the
     * <a href="http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec">shared-mime-info</a>
     * specification for more on x-content types.
     * <p>
     * This is an asynchronous operation (see
     * g_mount_guess_content_type_sync() for the synchronous version), and
     * is finished by calling g_mount_guess_content_type_finish() with the
     * {@code mount} and {@link AsyncResult} data returned in the {@code callback}.
     * @param forceRescan Whether to force a rescan of the content.
     *     Otherwise a cached result will be used if available
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback}
     */
    default void guessContentType(boolean forceRescan, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_mount_guess_content_type.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(forceRescan, null).intValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes guessing content types of {@code mount}. If any errors occurred
     * during the operation, {@code error} will be set to contain the errors and
     * {@code false} will be returned. In particular, you may get an
     * {@link IOErrorEnum#NOT_SUPPORTED} if the mount does not support content
     * guessing.
     * @param result a {@link AsyncResult}
     * @return a {@code null}-terminated array of content types or {@code null} on error.
     *     Caller should free this array with g_strfreev() when done with it.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default PointerString guessContentTypeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_guess_content_type_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Tries to guess the type of content stored on {@code mount}. Returns one or
     * more textual identifiers of well-known content types (typically
     * prefixed with "x-content/"), e.g. x-content/image-dcf for camera
     * memory cards. See the
     * <a href="http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec">shared-mime-info</a>
     * specification for more on x-content types.
     * <p>
     * This is a synchronous operation and as such may block doing IO;
     * see g_mount_guess_content_type() for the asynchronous version.
     * @param forceRescan Whether to force a rescan of the content.
     *     Otherwise a cached result will be used if available
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return a {@code null}-terminated array of content types or {@code null} on error.
     *     Caller should free this array with g_strfreev() when done with it.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default PointerString guessContentTypeSync(boolean forceRescan, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_mount_guess_content_type_sync.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(forceRescan, null).intValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Determines if {@code mount} is shadowed. Applications or libraries should
     * avoid displaying {@code mount} in the user interface if it is shadowed.
     * <p>
     * A mount is said to be shadowed if there exists one or more user
     * visible objects (currently {@link Mount} objects) with a root that is
     * inside the root of {@code mount}.
     * <p>
     * One application of shadow mounts is when exposing a single file
     * system that is used to address several logical volumes. In this
     * situation, a {@link VolumeMonitor} implementation would create two
     * {@link Volume} objects (for example, one for the camera functionality of
     * the device and one for a SD card reader on the device) with
     * activation URIs {@code gphoto2://[usb:001,002]/store1/}
     * and {@code gphoto2://[usb:001,002]/store2/}. When the
     * underlying mount (with root
     * {@code gphoto2://[usb:001,002]/}) is mounted, said
     * {@link VolumeMonitor} implementation would create two {@link Mount} objects
     * (each with their root matching the corresponding volume activation
     * root) that would shadow the original mount.
     * <p>
     * The proxy monitor in GVfs 2.26 and later, automatically creates and
     * manage shadow mounts (and shadows the underlying mount) if the
     * activation root on a {@link Volume} is set.
     * @return {@code true} if {@code mount} is shadowed.
     */
    default boolean isShadowed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_is_shadowed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Remounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_remount_finish() with the {@code mount}
     * and {@code GAsyncResults} data returned in the {@code callback}.
     * <p>
     * Remounting is useful when some setting affecting the operation
     * of the volume has been changed, as these may need a remount to
     * take affect. While this is semantically equivalent with unmounting
     * and then remounting not all backends might need to actually be
     * unmounted.
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation} or {@code null} to avoid
     *     user interaction.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     */
    default void remount(org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_mount_remount.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes remounting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the mount was successfully remounted. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean remountFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_remount_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Increments the shadow count on {@code mount}. Usually used by
     * {@link VolumeMonitor} implementations when creating a shadow mount for
     * {@code mount}, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the {@link Mount}::changed signal on {@code mount} manually.
     */
    default void shadow() {
        try {
            DowncallHandles.g_mount_shadow.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unmounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_unmount_finish() with the {@code mount}
     * and {@link AsyncResult} data returned in the {@code callback}.
     * @param flags flags affecting the operation
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     * @deprecated Use g_mount_unmount_with_operation() instead.
     */
    @Deprecated
    default void unmount(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_mount_unmount.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the mount was successfully unmounted. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_mount_unmount_with_operation_finish() instead.
     */
    @Deprecated
    default boolean unmountFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_unmount_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unmounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_unmount_with_operation_finish() with the {@code mount}
     * and {@link AsyncResult} data returned in the {@code callback}.
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation} or {@code null} to avoid
     *     user interaction.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     */
    default void unmountWithOperation(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_mount_unmount_with_operation.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (mountOperation == null ? MemoryAddress.NULL : mountOperation.handle()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the mount was successfully unmounted. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean unmountWithOperationFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_mount_unmount_with_operation_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Decrements the shadow count on {@code mount}. Usually used by
     * {@link VolumeMonitor} implementations when destroying a shadow mount for
     * {@code mount}, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the {@link Mount}::changed signal on {@code mount} manually.
     */
    default void unshadow() {
        try {
            DowncallHandles.g_mount_unshadow.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_mount_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceMount) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Changed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the mount has been changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Mount.Changed> onChanged(Mount.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreUnmount {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceMount) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PreUnmount.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal may be emitted when the {@link Mount} is about to be
     * unmounted.
     * <p>
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Mount.PreUnmount> onPreUnmount(Mount.PreUnmount handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pre-unmount"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Unmounted {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceMount) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Unmounted.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal is emitted when the {@link Mount} have been
     * unmounted. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Mount.Unmounted> onUnmounted(Mount.Unmounted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unmounted"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_can_eject = Interop.downcallHandle(
            "g_mount_can_eject",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_can_unmount = Interop.downcallHandle(
            "g_mount_can_unmount",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_eject = Interop.downcallHandle(
            "g_mount_eject",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_eject_finish = Interop.downcallHandle(
            "g_mount_eject_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_eject_with_operation = Interop.downcallHandle(
            "g_mount_eject_with_operation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_eject_with_operation_finish = Interop.downcallHandle(
            "g_mount_eject_with_operation_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_default_location = Interop.downcallHandle(
            "g_mount_get_default_location",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_drive = Interop.downcallHandle(
            "g_mount_get_drive",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_icon = Interop.downcallHandle(
            "g_mount_get_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_name = Interop.downcallHandle(
            "g_mount_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_root = Interop.downcallHandle(
            "g_mount_get_root",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_sort_key = Interop.downcallHandle(
            "g_mount_get_sort_key",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_symbolic_icon = Interop.downcallHandle(
            "g_mount_get_symbolic_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_uuid = Interop.downcallHandle(
            "g_mount_get_uuid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_volume = Interop.downcallHandle(
            "g_mount_get_volume",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_guess_content_type = Interop.downcallHandle(
            "g_mount_guess_content_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_guess_content_type_finish = Interop.downcallHandle(
            "g_mount_guess_content_type_finish",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_guess_content_type_sync = Interop.downcallHandle(
            "g_mount_guess_content_type_sync",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_is_shadowed = Interop.downcallHandle(
            "g_mount_is_shadowed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_remount = Interop.downcallHandle(
            "g_mount_remount",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_remount_finish = Interop.downcallHandle(
            "g_mount_remount_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_shadow = Interop.downcallHandle(
            "g_mount_shadow",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_unmount = Interop.downcallHandle(
            "g_mount_unmount",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_unmount_finish = Interop.downcallHandle(
            "g_mount_unmount_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_unmount_with_operation = Interop.downcallHandle(
            "g_mount_unmount_with_operation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_unmount_with_operation_finish = Interop.downcallHandle(
            "g_mount_unmount_with_operation_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_unshadow = Interop.downcallHandle(
            "g_mount_unshadow",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_mount_get_type = Interop.downcallHandle(
            "g_mount_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class MountImpl extends org.gtk.gobject.GObject implements Mount {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public MountImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
