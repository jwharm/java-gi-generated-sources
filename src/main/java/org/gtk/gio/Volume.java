package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>Volume Identifiers # {#volume-identifier}</h2>
 * <p>
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
 * 
 * Note that {@code G_VOLUME_IDENTIFIER_KIND_HAL_UDI} will only be available
 * when the gvfs hal volume monitor is in use. Other volume monitors
 * will generally be able to provide the {@code G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE}
 * identifier, which can be used to obtain a hal device by means of
 * libhal_manager_find_device_string_match().
 */
public interface Volume extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_volume_can_eject = Interop.downcallHandle(
        "g_volume_can_eject",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a volume can be ejected.
     */
    public default boolean canEject() {
        try {
            var RESULT = (int) g_volume_can_eject.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_can_mount = Interop.downcallHandle(
        "g_volume_can_mount",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a volume can be mounted.
     */
    public default boolean canMount() {
        try {
            var RESULT = (int) g_volume_can_mount.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_eject_with_operation = Interop.downcallHandle(
        "g_volume_eject_with_operation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Ejects a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_eject_with_operation_finish() with the {@code volume}
     * and {@link AsyncResult} data returned in the {@code callback}.
     */
    public default void ejectWithOperation(MountUnmountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_volume_eject_with_operation.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_eject_with_operation_finish = Interop.downcallHandle(
        "g_volume_eject_with_operation_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_volume_eject_with_operation_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_enumerate_identifiers = Interop.downcallHandle(
        "g_volume_enumerate_identifiers",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the kinds of [identifiers][volume-identifier] that {@code volume} has.
     * Use g_volume_get_identifier() to obtain the identifiers themselves.
     */
    public default PointerIterator<java.lang.String> enumerateIdentifiers() {
        try {
            var RESULT = (MemoryAddress) g_volume_enumerate_identifiers.invokeExact(handle());
            return new PointerString(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_activation_root = Interop.downcallHandle(
        "g_volume_get_activation_root",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the activation root for a {@link Volume} if it is known ahead of
     * mount time. Returns {@code null} otherwise. If not {@code null} and if {@code volume}
     * is mounted, then the result of g_mount_get_root() on the
     * {@link Mount} object obtained from g_volume_get_mount() will always
     * either be equal or a prefix of what this function returns. In
     * other words, in code
     * <p>
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
     */
    public default File getActivationRoot() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_activation_root.invokeExact(handle());
            return new File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_drive = Interop.downcallHandle(
        "g_volume_get_drive",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the drive for the {@code volume}.
     */
    public default Drive getDrive() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_drive.invokeExact(handle());
            return new Drive.DriveImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_icon = Interop.downcallHandle(
        "g_volume_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon for {@code volume}.
     */
    public default Icon getIcon() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_icon.invokeExact(handle());
            return new Icon.IconImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_identifier = Interop.downcallHandle(
        "g_volume_get_identifier",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the identifier of the given kind for {@code volume}.
     * See the [introduction][volume-identifier] for more
     * information about volume identifiers.
     */
    public default java.lang.String getIdentifier(java.lang.String kind) {
        try {
            var RESULT = (MemoryAddress) g_volume_get_identifier.invokeExact(handle(), Interop.allocateNativeString(kind).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_mount = Interop.downcallHandle(
        "g_volume_get_mount",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mount for the {@code volume}.
     */
    public default Mount getMount() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_mount.invokeExact(handle());
            return new Mount.MountImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_name = Interop.downcallHandle(
        "g_volume_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code volume}.
     */
    public default java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_sort_key = Interop.downcallHandle(
        "g_volume_get_sort_key",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the sort key for {@code volume}, if any.
     */
    public default java.lang.String getSortKey() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_sort_key.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_symbolic_icon = Interop.downcallHandle(
        "g_volume_get_symbolic_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the symbolic icon for {@code volume}.
     */
    public default Icon getSymbolicIcon() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_symbolic_icon.invokeExact(handle());
            return new Icon.IconImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_get_uuid = Interop.downcallHandle(
        "g_volume_get_uuid",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the UUID for the {@code volume}. The reference is typically based on
     * the file system UUID for the volume in question and should be
     * considered an opaque string. Returns {@code null} if there is no UUID
     * available.
     */
    public default java.lang.String getUuid() {
        try {
            var RESULT = (MemoryAddress) g_volume_get_uuid.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_mount = Interop.downcallHandle(
        "g_volume_mount",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Mounts a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_mount_finish() with the {@code volume}
     * and {@link AsyncResult} returned in the {@code callback}.
     */
    public default void mount(MountMountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_volume_mount.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_mount_finish = Interop.downcallHandle(
        "g_volume_mount_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes mounting a volume. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * <p>
     * If the mount operation succeeded, g_volume_get_mount() on {@code volume}
     * is guaranteed to return the mount right after calling this
     * function; there's no need to listen for the 'mount-added' signal on
     * {@link VolumeMonitor}.
     */
    public default boolean mountFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_volume_mount_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_volume_should_automount = Interop.downcallHandle(
        "g_volume_should_automount",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the volume should be automatically mounted.
     */
    public default boolean shouldAutomount() {
        try {
            var RESULT = (int) g_volume_should_automount.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Volume source);
    }
    
    /**
     * Emitted when the volume has been changed.
     */
    public default SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Volume.Callbacks.class, "signalVolumeChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RemovedHandler {
        void signalReceived(Volume source);
    }
    
    /**
     * This signal is emitted when the {@link Volume} have been removed. If
     * the recipient is holding references to the object they should
     * release them so the object can be finalized.
     */
    public default SignalHandle onRemoved(RemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("removed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Volume.Callbacks.class, "signalVolumeRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalVolumeChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Volume.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Volume.VolumeImpl(Refcounted.get(source)));
        }
        
        public static void signalVolumeRemoved(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Volume.RemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Volume.VolumeImpl(Refcounted.get(source)));
        }
        
    }
    
    class VolumeImpl extends org.gtk.gobject.Object implements Volume {
        public VolumeImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
