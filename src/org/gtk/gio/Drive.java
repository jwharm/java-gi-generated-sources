package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
     * Checks if a drive can be ejected.
     */
    public default boolean canEject() {
        var RESULT = gtk_h.g_drive_can_eject(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if a drive can be polled for media changes.
     */
    public default boolean canPollForMedia() {
        var RESULT = gtk_h.g_drive_can_poll_for_media(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if a drive can be started.
     */
    public default boolean canStart() {
        var RESULT = gtk_h.g_drive_can_start(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if a drive can be started degraded.
     */
    public default boolean canStartDegraded() {
        var RESULT = gtk_h.g_drive_can_start_degraded(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if a drive can be stopped.
     */
    public default boolean canStop() {
        var RESULT = gtk_h.g_drive_can_stop(handle());
        return RESULT != 0;
    }
    
    /**
     * Ejects a drive. This is an asynchronous operation, and is
     * finished by calling g_drive_eject_with_operation_finish() with the {@code drive}
     * and {@link AsyncResult} data returned in the {@code callback}.
     */
    public default void ejectWithOperation(MountUnmountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_drive_eject_with_operation(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes ejecting a drive. If any errors occurred during the operation,
     * {@code error} will be set to contain the errors and {@code false} will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_drive_eject_with_operation_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the kinds of identifiers that {@code drive} has.
     * Use g_drive_get_identifier() to obtain the identifiers
     * themselves.
     */
    public default PointerIterator<java.lang.String> enumerateIdentifiers() {
        var RESULT = gtk_h.g_drive_enumerate_identifiers(handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Gets the icon for {@code drive}.
     */
    public default Icon getIcon() {
        var RESULT = gtk_h.g_drive_get_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the identifier of the given kind for {@code drive}. The only
     * identifier currently available is
     * {@code G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE}.
     */
    public default java.lang.String getIdentifier(java.lang.String kind) {
        var RESULT = gtk_h.g_drive_get_identifier(handle(), Interop.allocateNativeString(kind).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of {@code drive}.
     */
    public default java.lang.String getName() {
        var RESULT = gtk_h.g_drive_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the sort key for {@code drive}, if any.
     */
    public default java.lang.String getSortKey() {
        var RESULT = gtk_h.g_drive_get_sort_key(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a hint about how a drive can be started/stopped.
     */
    public default DriveStartStopType getStartStopType() {
        var RESULT = gtk_h.g_drive_get_start_stop_type(handle());
        return new DriveStartStopType(RESULT);
    }
    
    /**
     * Gets the icon for {@code drive}.
     */
    public default Icon getSymbolicIcon() {
        var RESULT = gtk_h.g_drive_get_symbolic_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Get a list of mountable volumes for {@code drive}.
     * <p>
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     */
    public default org.gtk.glib.List getVolumes() {
        var RESULT = gtk_h.g_drive_get_volumes(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Checks if the {@code drive} has media. Note that the OS may not be polling
     * the drive for media changes; see g_drive_is_media_check_automatic()
     * for more details.
     */
    public default boolean hasMedia() {
        var RESULT = gtk_h.g_drive_has_media(handle());
        return RESULT != 0;
    }
    
    /**
     * Check if {@code drive} has any mountable volumes.
     */
    public default boolean hasVolumes() {
        var RESULT = gtk_h.g_drive_has_volumes(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code drive} is capable of automatically detecting media changes.
     */
    public default boolean isMediaCheckAutomatic() {
        var RESULT = gtk_h.g_drive_is_media_check_automatic(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if the {@code drive} supports removable media.
     */
    public default boolean isMediaRemovable() {
        var RESULT = gtk_h.g_drive_is_media_removable(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if the {@link Drive} and/or its media is considered removable by the user.
     * See g_drive_is_media_removable().
     */
    public default boolean isRemovable() {
        var RESULT = gtk_h.g_drive_is_removable(handle());
        return RESULT != 0;
    }
    
    /**
     * Asynchronously polls {@code drive} to see if media has been inserted or removed.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_poll_for_media_finish() to obtain the
     * result of the operation.
     */
    public default void pollForMedia(Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_drive_poll_for_media(handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an operation started with g_drive_poll_for_media() on a drive.
     */
    public default boolean pollForMediaFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_drive_poll_for_media_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously starts a drive.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_start_finish() to obtain the
     * result of the operation.
     */
    public default void start(DriveStartFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_drive_start(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes starting a drive.
     */
    public default boolean startFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_drive_start_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously stops a drive.
     * <p>
     * When the operation is finished, {@code callback} will be called.
     * You can then call g_drive_stop_finish() to obtain the
     * result of the operation.
     */
    public default void stop(MountUnmountFlags flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_drive_stop(handle(), flags.getValue(), mountOperation.handle(), cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes stopping a drive.
     */
    public default boolean stopFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_drive_stop_finish(handle(), result.handle(), GERROR);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.class, "__signalDriveChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDriveChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (Drive.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("disconnected").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.class, "__signalDriveDisconnected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDriveDisconnected(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (Drive.DisconnectedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("eject-button").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.class, "__signalDriveEjectButton",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDriveEjectButton(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (Drive.EjectButtonHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("stop-button").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drive.class, "__signalDriveStopButton",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDriveStopButton(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (Drive.StopButtonHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Drive.DriveImpl(References.get(source)));
    }
    
    class DriveImpl extends org.gtk.gobject.Object implements Drive {
        public DriveImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
