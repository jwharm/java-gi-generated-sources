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

    @ApiStatus.Internal static final MethodHandle g_drive_can_eject = Interop.downcallHandle(
        "g_drive_can_eject",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a drive can be ejected.
     */
    default boolean canEject() {
        int RESULT;
        try {
            RESULT = (int) g_drive_can_eject.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_can_poll_for_media = Interop.downcallHandle(
        "g_drive_can_poll_for_media",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a drive can be polled for media changes.
     */
    default boolean canPollForMedia() {
        int RESULT;
        try {
            RESULT = (int) g_drive_can_poll_for_media.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_can_start = Interop.downcallHandle(
        "g_drive_can_start",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a drive can be started.
     */
    default boolean canStart() {
        int RESULT;
        try {
            RESULT = (int) g_drive_can_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_can_start_degraded = Interop.downcallHandle(
        "g_drive_can_start_degraded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a drive can be started degraded.
     */
    default boolean canStartDegraded() {
        int RESULT;
        try {
            RESULT = (int) g_drive_can_start_degraded.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_can_stop = Interop.downcallHandle(
        "g_drive_can_stop",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a drive can be stopped.
     */
    default boolean canStop() {
        int RESULT;
        try {
            RESULT = (int) g_drive_can_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_eject_with_operation = Interop.downcallHandle(
        "g_drive_eject_with_operation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Ejects a drive. This is an asynchronous operation, and is
     * finished by calling g_drive_eject_with_operation_finish() with the {@code drive}
     * and {@link AsyncResult} data returned in the {@code callback}.
     */
    default @NotNull void ejectWithOperation(@NotNull MountUnmountFlags flags, @Nullable MountOperation mountOperation, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_drive_eject_with_operation.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    @ApiStatus.Internal static final MethodHandle g_drive_eject_with_operation_finish = Interop.downcallHandle(
        "g_drive_eject_with_operation_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes ejecting a drive. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     */
    default boolean ejectWithOperationFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_drive_eject_with_operation_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_enumerate_identifiers = Interop.downcallHandle(
        "g_drive_enumerate_identifiers",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the kinds of identifiers that {@code drive} has.
     * Use g_drive_get_identifier() to obtain the identifiers
     * themselves.
     */
    default PointerString enumerateIdentifiers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_drive_enumerate_identifiers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_get_icon = Interop.downcallHandle(
        "g_drive_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon for {@code drive}.
     */
    default @NotNull Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_drive_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_get_identifier = Interop.downcallHandle(
        "g_drive_get_identifier",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the identifier of the given kind for {@code drive}. The only
     * identifier currently available is
     * {@code G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE}.
     */
    default @Nullable java.lang.String getIdentifier(@NotNull java.lang.String kind) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_drive_get_identifier.invokeExact(handle(), Interop.allocateNativeString(kind));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_get_name = Interop.downcallHandle(
        "g_drive_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code drive}.
     */
    default @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_drive_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_get_sort_key = Interop.downcallHandle(
        "g_drive_get_sort_key",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the sort key for {@code drive}, if any.
     */
    default @Nullable java.lang.String getSortKey() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_drive_get_sort_key.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_get_start_stop_type = Interop.downcallHandle(
        "g_drive_get_start_stop_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a hint about how a drive can be started/stopped.
     */
    default @NotNull DriveStartStopType getStartStopType() {
        int RESULT;
        try {
            RESULT = (int) g_drive_get_start_stop_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DriveStartStopType(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_get_symbolic_icon = Interop.downcallHandle(
        "g_drive_get_symbolic_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon for {@code drive}.
     */
    default @NotNull Icon getSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_drive_get_symbolic_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_get_volumes = Interop.downcallHandle(
        "g_drive_get_volumes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get a list of mountable volumes for {@code drive}.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     */
    default @NotNull org.gtk.glib.List getVolumes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_drive_get_volumes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_has_media = Interop.downcallHandle(
        "g_drive_has_media",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the {@code drive} has media. Note that the OS may not be polling
     * the drive for media changes; see g_drive_is_media_check_automatic()
     * for more details.
     */
    default boolean hasMedia() {
        int RESULT;
        try {
            RESULT = (int) g_drive_has_media.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_has_volumes = Interop.downcallHandle(
        "g_drive_has_volumes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check if {@code drive} has any mountable volumes.
     */
    default boolean hasVolumes() {
        int RESULT;
        try {
            RESULT = (int) g_drive_has_volumes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_is_media_check_automatic = Interop.downcallHandle(
        "g_drive_is_media_check_automatic",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code drive} is capable of automatically detecting media changes.
     */
    default boolean isMediaCheckAutomatic() {
        int RESULT;
        try {
            RESULT = (int) g_drive_is_media_check_automatic.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_is_media_removable = Interop.downcallHandle(
        "g_drive_is_media_removable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the {@code drive} supports removable media.
     */
    default boolean isMediaRemovable() {
        int RESULT;
        try {
            RESULT = (int) g_drive_is_media_removable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_is_removable = Interop.downcallHandle(
        "g_drive_is_removable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the {@link Drive} and/or its media is considered removable by the user.
     * See g_drive_is_media_removable().
     */
    default boolean isRemovable() {
        int RESULT;
        try {
            RESULT = (int) g_drive_is_removable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_poll_for_media = Interop.downcallHandle(
        "g_drive_poll_for_media",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously polls {@code drive} to see if media has been inserted or removed.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_poll_for_media_finish() to obtain the
     * result of the operation.
     */
    default @NotNull void pollForMedia(@Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_drive_poll_for_media.invokeExact(handle(), cancellable.handle(), 
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
    
    @ApiStatus.Internal static final MethodHandle g_drive_poll_for_media_finish = Interop.downcallHandle(
        "g_drive_poll_for_media_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an operation started with g_drive_poll_for_media() on a drive.
     */
    default boolean pollForMediaFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_drive_poll_for_media_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_start = Interop.downcallHandle(
        "g_drive_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously starts a drive.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_start_finish() to obtain the
     * result of the operation.
     */
    default @NotNull void start(@NotNull DriveStartFlags flags, @Nullable MountOperation mountOperation, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_drive_start.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    @ApiStatus.Internal static final MethodHandle g_drive_start_finish = Interop.downcallHandle(
        "g_drive_start_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes starting a drive.
     */
    default boolean startFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_drive_start_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_drive_stop = Interop.downcallHandle(
        "g_drive_stop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously stops a drive.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_stop_finish() to obtain the
     * result of the operation.
     */
    default @NotNull void stop(@NotNull MountUnmountFlags flags, @Nullable MountOperation mountOperation, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_drive_stop.invokeExact(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
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
    
    @ApiStatus.Internal static final MethodHandle g_drive_stop_finish = Interop.downcallHandle(
        "g_drive_stop_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes stopping a drive.
     */
    default boolean stopFinish(@NotNull AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_drive_stop_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Drive source);
    }
    
    /**
     * Emitted when the drive's state has changed.
     */
    public default SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.Callbacks.class, "signalDriveChanged",
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
    public interface DisconnectedHandler {
        void signalReceived(Drive source);
    }
    
    /**
     * This signal is emitted when the {@link Drive} have been
     * disconnected. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     */
    public default SignalHandle onDisconnected(DisconnectedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("disconnected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.Callbacks.class, "signalDriveDisconnected",
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
    public interface EjectButtonHandler {
        void signalReceived(Drive source);
    }
    
    /**
     * Emitted when the physical eject button (if any) of a drive has
     * been pressed.
     */
    public default SignalHandle onEjectButton(EjectButtonHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("eject-button"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.Callbacks.class, "signalDriveEjectButton",
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
    public interface StopButtonHandler {
        void signalReceived(Drive source);
    }
    
    /**
     * Emitted when the physical stop button (if any) of a drive has
     * been pressed.
     */
    public default SignalHandle onStopButton(StopButtonHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("stop-button"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.Callbacks.class, "signalDriveStopButton",
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
    
        public static void signalDriveChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Drive.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Drive.DriveImpl(Refcounted.get(source)));
        }
        
        public static void signalDriveDisconnected(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Drive.DisconnectedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Drive.DriveImpl(Refcounted.get(source)));
        }
        
        public static void signalDriveEjectButton(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Drive.EjectButtonHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Drive.DriveImpl(Refcounted.get(source)));
        }
        
        public static void signalDriveStopButton(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Drive.StopButtonHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Drive.DriveImpl(Refcounted.get(source)));
        }
        
    }
    
    class DriveImpl extends org.gtk.gobject.Object implements Drive {
        public DriveImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
