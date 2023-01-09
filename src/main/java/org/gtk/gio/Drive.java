package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Drive} - this represent a piece of hardware connected to the machine.
 * It's generally only created for removable hardware or hardware with
 * removable media.
 * <p>
 * {@link Drive} is a container class for {@link Volume} objects that stem from
 * the same piece of media. As such, {@link Drive} abstracts a drive with
 * (or without) removable media and provides operations for querying
 * whether media is available, determining whether media change is
 * automatically detected and ejecting the media.
 * <p>
 * If the {@link Drive} reports that media isn't automatically detected, one
 * can poll for media; typically one should not do this periodically
 * as a poll for media operation is potentially expensive and may
 * spin up the drive creating noise.
 * <p>
 * {@link Drive} supports starting and stopping drives with authentication
 * support for the former. This can be used to support a diverse set
 * of use cases including connecting/disconnecting iSCSI devices,
 * powering down external disk enclosures and starting/stopping
 * multi-disk devices such as RAID devices. Note that the actual
 * semantics and side-effects of starting/stopping a {@link Drive} may vary
 * according to implementation. To choose the correct verbs in e.g. a
 * file manager, use g_drive_get_start_stop_type().
 * <p>
 * For porting from GnomeVFS note that there is no equivalent of
 * {@link Drive} in that API.
 */
public interface Drive extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DriveImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DriveImpl(input);
    
    /**
     * Checks if a drive can be ejected.
     * @return {@code true} if the {@code drive} can be ejected, {@code false} otherwise.
     */
    default boolean canEject() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_can_eject.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a drive can be polled for media changes.
     * @return {@code true} if the {@code drive} can be polled for media changes,
     *     {@code false} otherwise.
     */
    default boolean canPollForMedia() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_can_poll_for_media.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a drive can be started.
     * @return {@code true} if the {@code drive} can be started, {@code false} otherwise.
     */
    default boolean canStart() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_can_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a drive can be started degraded.
     * @return {@code true} if the {@code drive} can be started degraded, {@code false} otherwise.
     */
    default boolean canStartDegraded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_can_start_degraded.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a drive can be stopped.
     * @return {@code true} if the {@code drive} can be stopped, {@code false} otherwise.
     */
    default boolean canStop() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_can_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Asynchronously ejects a drive.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_eject_finish() to obtain the
     * result of the operation.
     * @param flags flags affecting the unmount if required for eject
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     * @deprecated Use g_drive_eject_with_operation() instead.
     */
    @Deprecated
    default void eject(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_drive_eject.invokeExact(
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
     * Finishes ejecting a drive.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the drive has been ejected successfully,
     *     {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_drive_eject_with_operation_finish() instead.
     */
    @Deprecated
    default boolean ejectFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_drive_eject_finish.invokeExact(
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
    }
    
    /**
     * Ejects a drive. This is an asynchronous operation, and is
     * finished by calling g_drive_eject_with_operation_finish() with the {@code drive}
     * and {@link AsyncResult} data returned in the {@code callback}.
     * @param flags flags affecting the unmount if required for eject
     * @param mountOperation a {@link MountOperation} or {@code null} to avoid
     *     user interaction.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     */
    default void ejectWithOperation(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_drive_eject_with_operation.invokeExact(
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
     * Finishes ejecting a drive. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the drive was successfully ejected. {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean ejectWithOperationFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_drive_eject_with_operation_finish.invokeExact(
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
    }
    
    /**
     * Gets the kinds of identifiers that {@code drive} has.
     * Use g_drive_get_identifier() to obtain the identifiers
     * themselves.
     * @return a {@code null}-terminated
     *     array of strings containing kinds of identifiers. Use g_strfreev()
     *     to free.
     */
    default PointerString enumerateIdentifiers() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_drive_enumerate_identifiers.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Gets the icon for {@code drive}.
     * @return {@link Icon} for the {@code drive}.
     *    Free the returned object with g_object_unref().
     */
    default org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_drive_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.Icon) Interop.register(RESULT, org.gtk.gio.Icon.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the identifier of the given kind for {@code drive}. The only
     * identifier currently available is
     * {@code G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE}.
     * @param kind the kind of identifier to return
     * @return a newly allocated string containing the
     *     requested identifier, or {@code null} if the {@link Drive}
     *     doesn't have this kind of identifier.
     */
    default @Nullable java.lang.String getIdentifier(java.lang.String kind) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_drive_get_identifier.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(kind, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the name of {@code drive}.
     * @return a string containing {@code drive}'s name. The returned
     *     string should be freed when no longer needed.
     */
    default java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_drive_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the sort key for {@code drive}, if any.
     * @return Sorting key for {@code drive} or {@code null} if no such key is available.
     */
    default @Nullable java.lang.String getSortKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_drive_get_sort_key.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets a hint about how a drive can be started/stopped.
     * @return A value from the {@link DriveStartStopType} enumeration.
     */
    default org.gtk.gio.DriveStartStopType getStartStopType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_get_start_stop_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DriveStartStopType.of(RESULT);
    }
    
    /**
     * Gets the icon for {@code drive}.
     * @return symbolic {@link Icon} for the {@code drive}.
     *    Free the returned object with g_object_unref().
     */
    default org.gtk.gio.Icon getSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_drive_get_symbolic_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.Icon) Interop.register(RESULT, org.gtk.gio.Icon.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get a list of mountable volumes for {@code drive}.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     * @return {@link org.gtk.glib.List} containing any {@link Volume} objects on the given {@code drive}.
     */
    default org.gtk.glib.List getVolumes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_drive_get_volumes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks if the {@code drive} has media. Note that the OS may not be polling
     * the drive for media changes; see g_drive_is_media_check_automatic()
     * for more details.
     * @return {@code true} if {@code drive} has media, {@code false} otherwise.
     */
    default boolean hasMedia() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_has_media.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code drive} has any mountable volumes.
     * @return {@code true} if the {@code drive} contains volumes, {@code false} otherwise.
     */
    default boolean hasVolumes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_has_volumes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code drive} is capable of automatically detecting media changes.
     * @return {@code true} if the {@code drive} is capable of automatically detecting
     *     media changes, {@code false} otherwise.
     */
    default boolean isMediaCheckAutomatic() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_is_media_check_automatic.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the {@code drive} supports removable media.
     * @return {@code true} if {@code drive} supports removable media, {@code false} otherwise.
     */
    default boolean isMediaRemovable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_is_media_removable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the {@link Drive} and/or its media is considered removable by the user.
     * See g_drive_is_media_removable().
     * @return {@code true} if {@code drive} and/or its media is considered removable, {@code false} otherwise.
     */
    default boolean isRemovable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_drive_is_removable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Asynchronously polls {@code drive} to see if media has been inserted or removed.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_poll_for_media_finish() to obtain the
     * result of the operation.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     */
    default void pollForMedia(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_drive_poll_for_media.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an operation started with g_drive_poll_for_media() on a drive.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the drive has been poll_for_mediaed successfully,
     *     {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean pollForMediaFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_drive_poll_for_media_finish.invokeExact(
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
    }
    
    /**
     * Asynchronously starts a drive.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_start_finish() to obtain the
     * result of the operation.
     * @param flags flags affecting the start operation.
     * @param mountOperation a {@link MountOperation} or {@code null} to avoid
     *     user interaction.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     */
    default void start(org.gtk.gio.DriveStartFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_drive_start.invokeExact(
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
     * Finishes starting a drive.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the drive has been started successfully,
     *     {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean startFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_drive_start_finish.invokeExact(
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
    }
    
    /**
     * Asynchronously stops a drive.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_stop_finish() to obtain the
     * result of the operation.
     * @param flags flags affecting the unmount if required for stopping.
     * @param mountOperation a {@link MountOperation} or {@code null} to avoid
     *     user interaction.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback a {@link AsyncReadyCallback}, or {@code null}.
     */
    default void stop(org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_drive_stop.invokeExact(
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
     * Finishes stopping a drive.
     * @param result a {@link AsyncResult}.
     * @return {@code true} if the drive has been stopped successfully,
     *     {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean stopFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_drive_stop_finish.invokeExact(
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
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_drive_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * Emitted when the drive's state has changed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDrive) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the drive's state has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Drive.Changed> onChanged(Drive.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Disconnected} callback.
     */
    @FunctionalInterface
    public interface Disconnected {
    
        /**
         * This signal is emitted when the {@link Drive} have been
         * disconnected. If the recipient is holding references to the
         * object they should release them so the object can be
         * finalized.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDrive) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Disconnected.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted when the {@link Drive} have been
     * disconnected. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Drive.Disconnected> onDisconnected(Drive.Disconnected handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("disconnected", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectButton} callback.
     */
    @FunctionalInterface
    public interface EjectButton {
    
        /**
         * Emitted when the physical eject button (if any) of a drive has
         * been pressed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDrive) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectButton.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the physical eject button (if any) of a drive has
     * been pressed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Drive.EjectButton> onEjectButton(Drive.EjectButton handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("eject-button", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopButton} callback.
     */
    @FunctionalInterface
    public interface StopButton {
    
        /**
         * Emitted when the physical stop button (if any) of a drive has
         * been pressed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceDrive) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopButton.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the physical stop button (if any) of a drive has
     * been pressed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<Drive.StopButton> onStopButton(Drive.StopButton handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("stop-button", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_can_eject = Interop.downcallHandle(
                "g_drive_can_eject",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_can_poll_for_media = Interop.downcallHandle(
                "g_drive_can_poll_for_media",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_can_start = Interop.downcallHandle(
                "g_drive_can_start",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_can_start_degraded = Interop.downcallHandle(
                "g_drive_can_start_degraded",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_can_stop = Interop.downcallHandle(
                "g_drive_can_stop",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_eject = Interop.downcallHandle(
                "g_drive_eject",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_eject_finish = Interop.downcallHandle(
                "g_drive_eject_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_eject_with_operation = Interop.downcallHandle(
                "g_drive_eject_with_operation",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_eject_with_operation_finish = Interop.downcallHandle(
                "g_drive_eject_with_operation_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_enumerate_identifiers = Interop.downcallHandle(
                "g_drive_enumerate_identifiers",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_icon = Interop.downcallHandle(
                "g_drive_get_icon",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_identifier = Interop.downcallHandle(
                "g_drive_get_identifier",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_name = Interop.downcallHandle(
                "g_drive_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_sort_key = Interop.downcallHandle(
                "g_drive_get_sort_key",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_start_stop_type = Interop.downcallHandle(
                "g_drive_get_start_stop_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_symbolic_icon = Interop.downcallHandle(
                "g_drive_get_symbolic_icon",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_volumes = Interop.downcallHandle(
                "g_drive_get_volumes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_has_media = Interop.downcallHandle(
                "g_drive_has_media",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_has_volumes = Interop.downcallHandle(
                "g_drive_has_volumes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_is_media_check_automatic = Interop.downcallHandle(
                "g_drive_is_media_check_automatic",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_is_media_removable = Interop.downcallHandle(
                "g_drive_is_media_removable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_is_removable = Interop.downcallHandle(
                "g_drive_is_removable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_poll_for_media = Interop.downcallHandle(
                "g_drive_poll_for_media",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_poll_for_media_finish = Interop.downcallHandle(
                "g_drive_poll_for_media_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_start = Interop.downcallHandle(
                "g_drive_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_start_finish = Interop.downcallHandle(
                "g_drive_start_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_stop = Interop.downcallHandle(
                "g_drive_stop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_stop_finish = Interop.downcallHandle(
                "g_drive_stop_finish",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_drive_get_type = Interop.downcallHandle(
                "g_drive_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The DriveImpl type represents a native instance of the Drive interface.
     */
    class DriveImpl extends org.gtk.gobject.GObject implements Drive {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Drive for the provided memory address.
         * @param address the memory address of the instance
         */
        public DriveImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_drive_get_type != null;
    }
}
