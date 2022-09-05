package org.gtk.gio;

import org.gtk.gobject.*;
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_can_eject(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be polled for media changes.
     */
    public default boolean canPollForMedia() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_can_poll_for_media(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be started.
     */
    public default boolean canStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_can_start(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be started degraded.
     */
    public default boolean canStartDegraded() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_can_start_degraded(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a drive can be stopped.
     */
    public default boolean canStop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_can_stop(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Finishes ejecting a drive. If any errors occurred during the operation,
     * @error will be set to contain the errors and %FALSE will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_eject_with_operation_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the icon for @drive.
     */
    public default Icon getIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_get_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the identifier of the given kind for @drive. The only
     * identifier currently available is
     * %G_DRIVE_IDENTIFIER_KIND_UNIX_DEVICE.
     */
    public default java.lang.String getIdentifier(java.lang.String kind) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_get_identifier(HANDLE(), Interop.getAllocator().allocateUtf8String(kind));
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of @drive.
     */
    public default java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the sort key for @drive, if any.
     */
    public default java.lang.String getSortKey() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_get_sort_key(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a hint about how a drive can be started/stopped.
     */
    public default DriveStartStopType getStartStopType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_get_start_stop_type(HANDLE());
        return DriveStartStopType.fromValue(RESULT);
    }
    
    /**
     * Gets the icon for @drive.
     */
    public default Icon getSymbolicIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_get_symbolic_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Get a list of mountable volumes for @drive.
     * 
     * The returned list should be freed with g_list_free(), after
     * its elements have been unreffed with g_object_unref().
     */
    public default org.gtk.glib.List getVolumes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_get_volumes(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Checks if the @drive has media. Note that the OS may not be polling
     * the drive for media changes; see g_drive_is_media_check_automatic()
     * for more details.
     */
    public default boolean hasMedia() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_has_media(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Check if @drive has any mountable volumes.
     */
    public default boolean hasVolumes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_has_volumes(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @drive is capable of automatically detecting media changes.
     */
    public default boolean isMediaCheckAutomatic() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_is_media_check_automatic(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the @drive supports removable media.
     */
    public default boolean isMediaRemovable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_is_media_removable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the #GDrive and/or its media is considered removable by the user.
     * See g_drive_is_media_removable().
     */
    public default boolean isRemovable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_is_removable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Finishes an operation started with g_drive_poll_for_media() on a drive.
     */
    public default boolean pollForMediaFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_poll_for_media_finish(HANDLE(), result.HANDLE(), GERROR);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_start_finish(HANDLE(), result.HANDLE(), GERROR);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_drive_stop_finish(HANDLE(), result.HANDLE(), GERROR);
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
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveDisconnected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("disconnected"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveEjectButton", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("eject-button"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDriveStopButton", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("stop-button"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class DriveImpl extends org.gtk.gobject.Object implements Drive {
        public DriveImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
