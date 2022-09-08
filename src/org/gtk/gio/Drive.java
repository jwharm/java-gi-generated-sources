package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDrive - this represent a piece of hardware connected to the machine.
 * It's generally only created for removable hardware or hardware with
 * removable media.
 * 
 * #GDrive is a container class for #GVolume objects that stem from
 * the same piece of media. As such, #GDrive abstracts a drive with
 * (or without) removable media and provides operations for querying
 * whether media is available, determining whether media change is
 * automatically detected and ejecting the media.
 * 
 * If the #GDrive reports that media isn't automatically detected, one
 * can poll for media; typically one should not do this periodically
 * as a poll for media operation is potentially expensive and may
 * spin up the drive creating noise.
 * 
 * #GDrive supports starting and stopping drives with authentication
 * support for the former. This can be used to support a diverse set
 * of use cases including connecting/disconnecting iSCSI devices,
 * powering down external disk enclosures and starting/stopping
 * multi-disk devices such as RAID devices. Note that the actual
 * semantics and side-effects of starting/stopping a #GDrive may vary
 * according to implementation. To choose the correct verbs in e.g. a
 * file manager, use g_drive_get_start_stop_type().
 * 
 * For porting from GnomeVFS note that there is no equivalent of
 * #GDrive in that API.
 */
public interface Drive extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Checks if a drive can be ejected.
     */
    public default boolean canEject() {
        var RESULT = gtk_h.g_drive_can_eject(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be polled for media changes.
     */
    public default boolean canPollForMedia() {
        var RESULT = gtk_h.g_drive_can_poll_for_media(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be started.
     */
    public default boolean canStart() {
        var RESULT = gtk_h.g_drive_can_start(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be started degraded.
     */
    public default boolean canStartDegraded() {
        var RESULT = gtk_h.g_drive_can_start_degraded(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be stopped.
     */
    public default boolean canStop() {
        var RESULT = gtk_h.g_drive_can_stop(handle());
        return (RESULT != 0);
    }
    
    /**
     * Finishes ejecting a drive. If any errors occurred during the operation,
     * @error will be set to contain the errors and %FALSE will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_drive_eject_with_operation_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the icon for @drive.
     */
    public default Icon getIcon() {
        var RESULT = gtk_h.g_drive_get_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the identifier of the given kind for @drive. The only
     * identifier currently available is
     * %G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE.
     */
    public default java.lang.String getIdentifier(java.lang.String kind) {
        var RESULT = gtk_h.g_drive_get_identifier(handle(), Interop.allocateNativeString(kind).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of @drive.
     */
    public default java.lang.String getName() {
        var RESULT = gtk_h.g_drive_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the sort key for @drive, if any.
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
        return DriveStartStopType.fromValue(RESULT);
    }
    
    /**
     * Gets the icon for @drive.
     */
    public default Icon getSymbolicIcon() {
        var RESULT = gtk_h.g_drive_get_symbolic_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Get a list of mountable volumes for @drive.
     * 
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     */
    public default org.gtk.glib.List getVolumes() {
        var RESULT = gtk_h.g_drive_get_volumes(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Checks if the @drive has media. Note that the OS may not be polling
     * the drive for media changes; see g_drive_is_media_check_automatic()
     * for more details.
     */
    public default boolean hasMedia() {
        var RESULT = gtk_h.g_drive_has_media(handle());
        return (RESULT != 0);
    }
    
    /**
     * Check if @drive has any mountable volumes.
     */
    public default boolean hasVolumes() {
        var RESULT = gtk_h.g_drive_has_volumes(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @drive is capable of automatically detecting media changes.
     */
    public default boolean isMediaCheckAutomatic() {
        var RESULT = gtk_h.g_drive_is_media_check_automatic(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the @drive supports removable media.
     */
    public default boolean isMediaRemovable() {
        var RESULT = gtk_h.g_drive_is_media_removable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the #GDrive and/or its media is considered removable by the user.
     * See g_drive_is_media_removable().
     */
    public default boolean isRemovable() {
        var RESULT = gtk_h.g_drive_is_removable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Finishes an operation started with g_drive_poll_for_media() on a drive.
     */
    public default boolean pollForMediaFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_drive_poll_for_media_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes starting a drive.
     */
    public default boolean startFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_drive_start_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes stopping a drive.
     */
    public default boolean stopFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_drive_stop_finish(handle(), result.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Drive source);
    }
    
    /**
     * Emitted when the drive's state has changed.
     */
    public default void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DisconnectedHandler {
        void signalReceived(Drive source);
    }
    
    /**
     * This signal is emitted when the #GDrive have been
     * disconnected. If the recipient is holding references to the
     * object they should release them so the object can be
     * finalized.
     */
    public default void onDisconnected(DisconnectedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveDisconnected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("disconnected").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
    public default void onEjectButton(EjectButtonHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveEjectButton", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("eject-button").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
    public default void onStopButton(StopButtonHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveStopButton", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("stop-button").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class DriveImpl extends org.gtk.gobject.Object implements Drive {
        public DriveImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
