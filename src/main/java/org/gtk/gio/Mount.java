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

    @ApiStatus.Internal static final MethodHandle g_mount_can_eject = Interop.downcallHandle(
        "g_mount_can_eject",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code mount} can be ejected.
     */
    default boolean canEject() {
        int RESULT;
        try {
            RESULT = (int) g_mount_can_eject.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_can_unmount = Interop.downcallHandle(
        "g_mount_can_unmount",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code mount} can be unmounted.
     */
    default boolean canUnmount() {
        int RESULT;
        try {
            RESULT = (int) g_mount_can_unmount.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_eject_with_operation = Interop.downcallHandle(
        "g_mount_eject_with_operation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Ejects a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_eject_with_operation_finish() with the {@code mount}
     * and {@link AsyncResult} data returned in the {@code callback}.
     */
    default @NotNull void ejectWithOperation(@NotNull MountUnmountFlags flags, @Nullable MountOperation mountOperation, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_mount_eject_with_operation.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_eject_with_operation_finish = Interop.downcallHandle(
        "g_mount_eject_with_operation_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes ejecting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     */
    default boolean ejectWithOperationFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_mount_eject_with_operation_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_default_location = Interop.downcallHandle(
        "g_mount_get_default_location",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default location of {@code mount}. The default location of the given
     * {@code mount} is a path that reflects the main entry point for the user (e.g.
     * the home directory, or the root of the volume).
     */
    default @NotNull File getDefaultLocation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_default_location.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_drive = Interop.downcallHandle(
        "g_mount_get_drive",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the drive for the {@code mount}.
     * <p>
     * This is a convenience method for getting the {@link Volume} and then
     * using that object to get the {@link Drive}.
     */
    default @Nullable Drive getDrive() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_drive.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Drive.DriveImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_icon = Interop.downcallHandle(
        "g_mount_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon for {@code mount}.
     */
    default @NotNull Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_name = Interop.downcallHandle(
        "g_mount_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code mount}.
     */
    default @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_root = Interop.downcallHandle(
        "g_mount_get_root",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the root directory on {@code mount}.
     */
    default @NotNull File getRoot() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_root.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new File.FileImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_sort_key = Interop.downcallHandle(
        "g_mount_get_sort_key",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the sort key for {@code mount}, if any.
     */
    default @Nullable java.lang.String getSortKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_sort_key.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_symbolic_icon = Interop.downcallHandle(
        "g_mount_get_symbolic_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the symbolic icon for {@code mount}.
     */
    default @NotNull Icon getSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_symbolic_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_uuid = Interop.downcallHandle(
        "g_mount_get_uuid",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the UUID for the {@code mount}. The reference is typically based on
     * the file system UUID for the mount in question and should be
     * considered an opaque string. Returns {@code null} if there is no UUID
     * available.
     */
    default @Nullable java.lang.String getUuid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_uuid.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_get_volume = Interop.downcallHandle(
        "g_mount_get_volume",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the volume for the {@code mount}.
     */
    default @Nullable Volume getVolume() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_get_volume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Volume.VolumeImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_guess_content_type = Interop.downcallHandle(
        "g_mount_guess_content_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default @NotNull void guessContentType(@NotNull boolean forceRescan, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_mount_guess_content_type.invokeExact(handle(), forceRescan ? 1 : 0, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_guess_content_type_finish = Interop.downcallHandle(
        "g_mount_guess_content_type_finish",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes guessing content types of {@code mount}. If any errors occurred
     * during the operation, {@code error} will be set to contain the errors and
     * {@code false} will be returned. In particular, you may get an
     * {@link IOErrorEnum#NOT_SUPPORTED} if the mount does not support content
     * guessing.
     */
    default PointerString guessContentTypeFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_guess_content_type_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerString(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_guess_content_type_sync = Interop.downcallHandle(
        "g_mount_guess_content_type_sync",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default PointerString guessContentTypeSync(@NotNull boolean forceRescan, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_mount_guess_content_type_sync.invokeExact(handle(), forceRescan ? 1 : 0, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerString(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_is_shadowed = Interop.downcallHandle(
        "g_mount_is_shadowed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    default boolean isShadowed() {
        int RESULT;
        try {
            RESULT = (int) g_mount_is_shadowed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_remount = Interop.downcallHandle(
        "g_mount_remount",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    default @NotNull void remount(@NotNull MountMountFlags flags, @Nullable MountOperation mountOperation, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_mount_remount.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_remount_finish = Interop.downcallHandle(
        "g_mount_remount_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes remounting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     */
    default boolean remountFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_mount_remount_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_shadow = Interop.downcallHandle(
        "g_mount_shadow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the shadow count on {@code mount}. Usually used by
     * {@link VolumeMonitor} implementations when creating a shadow mount for
     * {@code mount}, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the {@link Mount}::changed signal on {@code mount} manually.
     */
    default @NotNull void shadow() {
        try {
            g_mount_shadow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_unmount_with_operation = Interop.downcallHandle(
        "g_mount_unmount_with_operation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unmounts a mount. This is an asynchronous operation, and is
     * finished by calling g_mount_unmount_with_operation_finish() with the {@code mount}
     * and {@link AsyncResult} data returned in the {@code callback}.
     */
    default @NotNull void unmountWithOperation(@NotNull MountUnmountFlags flags, @Nullable MountOperation mountOperation, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_mount_unmount_with_operation.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_unmount_with_operation_finish = Interop.downcallHandle(
        "g_mount_unmount_with_operation_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes unmounting a mount. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     */
    default boolean unmountWithOperationFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_mount_unmount_with_operation_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_mount_unshadow = Interop.downcallHandle(
        "g_mount_unshadow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the shadow count on {@code mount}. Usually used by
     * {@link VolumeMonitor} implementations when destroying a shadow mount for
     * {@code mount}, see g_mount_is_shadowed() for more information. The caller
     * will need to emit the {@link Mount}::changed signal on {@code mount} manually.
     */
    default @NotNull void unshadow() {
        try {
            g_mount_unshadow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Mount.Callbacks.class, "signalMountChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreUnmountHandler {
        void signalReceived(Mount source);
    }
    
    /**
     * This signal may be emitted when the {@link Mount} is about to be
     * unmounted.
     * <p>
     * This signal depends on the backend and is only emitted if
     * GIO was used to unmount.
     */
    public default SignalHandle onPreUnmount(PreUnmountHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pre-unmount"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Mount.Callbacks.class, "signalMountPreUnmount",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnmountedHandler {
        void signalReceived(Mount source);
    }
    
    /**
     * This signal is emitted when the {@link Mount} have been
     * unmounted. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     */
    public default SignalHandle onUnmounted(UnmountedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unmounted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Mount.Callbacks.class, "signalMountUnmounted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalMountChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Mount.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Mount.MountImpl(Refcounted.get(source)));
        }
        
        public static void signalMountPreUnmount(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Mount.PreUnmountHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Mount.MountImpl(Refcounted.get(source)));
        }
        
        public static void signalMountUnmounted(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Mount.UnmountedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Mount.MountImpl(Refcounted.get(source)));
        }
        
    }
    
    class MountImpl extends org.gtk.gobject.Object implements Mount {
        public MountImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
