package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Volume} interface represents user-visible objects that can be
 * mounted. Note, when porting from GnomeVFS, {@link Volume} is the moral
 * equivalent of {@code GnomeVFSDrive}.
 * <p>
 * Mounting a {@link Volume} instance is an asynchronous operation. For more
 * information about asynchronous operations, see {@link AsyncResult} and
 * {@link Task}. To mount a {@link Volume}, first call g_volume_mount() with (at
 * least) the {@link Volume} instance, optionally a {@link MountOperation} object
 * and a {@link AsyncReadyCallback}.
 * <p>
 * Typically, one will only want to pass {@code null} for the
 * {@link MountOperation} if automounting all volumes when a desktop session
 * starts since it's not desirable to put up a lot of dialogs asking
 * for credentials.
 * <p>
 * The callback will be fired when the operation has resolved (either
 * with success or failure), and a {@link AsyncResult} instance will be
 * passed to the callback.  That callback should then call
 * g_volume_mount_finish() with the {@link Volume} instance and the
 * {@link AsyncResult} data to see if the operation was completed
 * successfully.  If an {@code error} is present when g_volume_mount_finish()
 * is called, then it will be filled with any error information.
 * <p>
 * <strong>Volume Identifiers # {#volume-identifier}</strong><br/>
 * It is sometimes necessary to directly access the underlying
 * operating system object behind a volume (e.g. for passing a volume
 * to an application via the commandline). For this purpose, GIO
 * allows to obtain an 'identifier' for the volume. There can be
 * different kinds of identifiers, such as Hal UDIs, filesystem labels,
 * traditional Unix devices (e.g. {@code /dev/sda2}), UUIDs. GIO uses predefined
 * strings as names for the different kinds of identifiers:
 * {@code G_VOLUME_IDENTIFIER_KIND_UUID}, {@code G_VOLUME_IDENTIFIER_KIND_LABEL}, etc.
 * Use g_volume_get_identifier() to obtain an identifier for a volume.
 * <p>
 * Note that {@code G_VOLUME_IDENTIFIER_KIND_HAL_UDI} will only be available
 * when the gvfs hal volume monitor is in use. Other volume monitors
 * will generally be able to provide the {@code G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE}
 * identifier, which can be used to obtain a hal device by means of
 * libhal_manager_find_device_string_match().
 */
public interface Volume extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VolumeImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VolumeImpl(input, ownership);
    
    /**
     * Checks if a volume can be ejected.
     * @return {@code true} if the {@code volume} can be ejected. {@code false} otherwise
     */
    default boolean canEject() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_volume_can_eject.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a volume can be mounted.
     * @return {@code true} if the {@code volume} can be mounted. {@code false} otherwise
     */
    default boolean canMount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_volume_can_mount.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Ejects a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_eject_finish() with the {@code volume}
     * and {@link AsyncResult} returned in the {@code callback}.
     * @param flags flags affecting the unmount if required for eject
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback}, or {@code null}
     * @deprecated Use g_volume_eject_with_operation() instead.
     */
    @Deprecated
    default void eject(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_volume_eject.invokeExact(
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
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}
     * @return {@code true}, {@code false} if operation failed
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_volume_eject_with_operation_finish() instead.
     */
    @Deprecated
    default boolean ejectFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_volume_eject_finish.invokeExact(
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
     * Ejects a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_eject_with_operation_finish() with the {@code volume}
     * and {@link AsyncResult} data returned in the {@code callback}.
     * @param flags flags affecting the unmount if required for eject
     * @param mountOperation a {@link MountOperation} or {@code null} to
     *     avoid user interaction
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback}, or {@code null}
     */
    default void ejectWithOperation(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_volume_eject_with_operation.invokeExact(
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
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}
     * @return {@code true} if the volume was successfully ejected. {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean ejectWithOperationFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_volume_eject_with_operation_finish.invokeExact(
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
     * Gets the kinds of [identifiers][volume-identifier] that {@code volume} has.
     * Use g_volume_get_identifier() to obtain the identifiers themselves.
     * @return a {@code null}-terminated array
     *   of strings containing kinds of identifiers. Use g_strfreev() to free.
     */
    default PointerString enumerateIdentifiers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_enumerate_identifiers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the activation root for a {@link Volume} if it is known ahead of
     * mount time. Returns {@code null} otherwise. If not {@code null} and if {@code volume}
     * is mounted, then the result of g_mount_get_root() on the
     * {@link Mount} object obtained from g_volume_get_mount() will always
     * either be equal or a prefix of what this function returns. In
     * other words, in code
     * <pre>{@code <!-- language="C" -->
     *   GMount *mount;
     *   GFile *mount_root
     *   GFile *volume_activation_root;
     * 
     *   mount = g_volume_get_mount (volume); // mounted, so never NULL
     *   mount_root = g_mount_get_root (mount);
     *   volume_activation_root = g_volume_get_activation_root (volume); // assume not NULL
     * }</pre>
     * then the expression
     * <pre>{@code <!-- language="C" -->
     *   (g_file_has_prefix (volume_activation_root, mount_root) ||
     *    g_file_equal (volume_activation_root, mount_root))
     * }</pre>
     * will always be {@code true}.
     * <p>
     * Activation roots are typically used in {@link VolumeMonitor}
     * implementations to find the underlying mount to shadow, see
     * g_mount_is_shadowed() for more details.
     * @return the activation root of {@code volume}
     *     or {@code null}. Use g_object_unref() to free.
     */
    default @Nullable org.gtk.gio.File getActivationRoot() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_activation_root.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.File) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.File.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the drive for the {@code volume}.
     * @return a {@link Drive} or {@code null} if {@code volume} is not
     *     associated with a drive. The returned object should be unreffed
     *     with g_object_unref() when no longer needed.
     */
    default @Nullable org.gtk.gio.Drive getDrive() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_drive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Drive.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the icon for {@code volume}.
     * @return a {@link Icon}.
     *     The returned object should be unreffed with g_object_unref()
     *     when no longer needed.
     */
    default org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the identifier of the given kind for {@code volume}.
     * See the [introduction][volume-identifier] for more
     * information about volume identifiers.
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the
     *     requested identifier, or {@code null} if the {@link Volume}
     *     doesn't have this kind of identifier
     */
    default @Nullable java.lang.String getIdentifier(java.lang.String kind) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_identifier.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(kind, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the mount for the {@code volume}.
     * @return a {@link Mount} or {@code null} if {@code volume} isn't mounted.
     *     The returned object should be unreffed with g_object_unref()
     *     when no longer needed.
     */
    default @Nullable org.gtk.gio.Mount getMount() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_mount.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Mount.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the name of {@code volume}.
     * @return the name for the given {@code volume}. The returned string should
     *     be freed with g_free() when no longer needed.
     */
    default java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the sort key for {@code volume}, if any.
     * @return Sorting key for {@code volume} or {@code null} if no such key is available
     */
    default @Nullable java.lang.String getSortKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_sort_key.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the symbolic icon for {@code volume}.
     * @return a {@link Icon}.
     *     The returned object should be unreffed with g_object_unref()
     *     when no longer needed.
     */
    default org.gtk.gio.Icon getSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_symbolic_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the UUID for the {@code volume}. The reference is typically based on
     * the file system UUID for the volume in question and should be
     * considered an opaque string. Returns {@code null} if there is no UUID
     * available.
     * @return the UUID for {@code volume} or {@code null} if no UUID
     *     can be computed.
     *     The returned string should be freed with g_free()
     *     when no longer needed.
     */
    default @Nullable java.lang.String getUuid() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_volume_get_uuid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Mounts a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_mount_finish() with the {@code volume}
     * and {@link AsyncResult} returned in the {@code callback}.
     * @param flags flags affecting the operation
     * @param mountOperation a {@link MountOperation} or {@code null} to avoid user interaction
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback a {@link AsyncReadyCallback}, or {@code null}
     */
    default void mount(org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_volume_mount.invokeExact(
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
     * Finishes mounting a volume. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * <p>
     * If the mount operation succeeded, g_volume_get_mount() on {@code volume}
     * is guaranteed to return the mount right after calling this
     * function; there's no need to listen for the 'mount-added' signal on
     * {@link VolumeMonitor}.
     * @param result a {@link AsyncResult}
     * @return {@code true}, {@code false} if operation failed
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean mountFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_volume_mount_finish.invokeExact(
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
     * Returns whether the volume should be automatically mounted.
     * @return {@code true} if the volume should be automatically mounted
     */
    default boolean shouldAutomount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_volume_should_automount.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_volume_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolume) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Changed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the volume has been changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Volume.Changed> onChanged(Volume.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Removed {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceVolume) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Removed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal is emitted when the {@link Volume} have been removed. If
     * the recipient is holding references to the object they should
     * release them so the object can be finalized.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Volume.Removed> onRemoved(Volume.Removed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_can_eject = Interop.downcallHandle(
            "g_volume_can_eject",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_can_mount = Interop.downcallHandle(
            "g_volume_can_mount",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_eject = Interop.downcallHandle(
            "g_volume_eject",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_eject_finish = Interop.downcallHandle(
            "g_volume_eject_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_eject_with_operation = Interop.downcallHandle(
            "g_volume_eject_with_operation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_eject_with_operation_finish = Interop.downcallHandle(
            "g_volume_eject_with_operation_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_enumerate_identifiers = Interop.downcallHandle(
            "g_volume_enumerate_identifiers",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_activation_root = Interop.downcallHandle(
            "g_volume_get_activation_root",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_drive = Interop.downcallHandle(
            "g_volume_get_drive",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_icon = Interop.downcallHandle(
            "g_volume_get_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_identifier = Interop.downcallHandle(
            "g_volume_get_identifier",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_mount = Interop.downcallHandle(
            "g_volume_get_mount",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_name = Interop.downcallHandle(
            "g_volume_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_sort_key = Interop.downcallHandle(
            "g_volume_get_sort_key",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_symbolic_icon = Interop.downcallHandle(
            "g_volume_get_symbolic_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_uuid = Interop.downcallHandle(
            "g_volume_get_uuid",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_mount = Interop.downcallHandle(
            "g_volume_mount",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_mount_finish = Interop.downcallHandle(
            "g_volume_mount_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_should_automount = Interop.downcallHandle(
            "g_volume_should_automount",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_volume_get_type = Interop.downcallHandle(
            "g_volume_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class VolumeImpl extends org.gtk.gobject.GObject implements Volume {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public VolumeImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
