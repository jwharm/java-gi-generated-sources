package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GVolume interface represents user-visible objects that can be
 * mounted. Note, when porting from GnomeVFS, #GVolume is the moral
 * equivalent of #GnomeVFSDrive.
 * 
 * Mounting a #GVolume instance is an asynchronous operation. For more
 * information about asynchronous operations, see #GAsyncResult and
 * #GTask. To mount a #GVolume, first call g_volume_mount() with (at
 * least) the #GVolume instance, optionally a #GMountOperation object
 * and a #GAsyncReadyCallback.
 * 
 * Typically, one will only want to pass %NULL for the
 * #GMountOperation if automounting all volumes when a desktop session
 * starts since it's not desirable to put up a lot of dialogs asking
 * for credentials.
 * 
 * The callback will be fired when the operation has resolved (either
 * with success or failure), and a #GAsyncResult instance will be
 * passed to the callback.  That callback should then call
 * g_volume_mount_finish() with the #GVolume instance and the
 * #GAsyncResult data to see if the operation was completed
 * successfully.  If an @error is present when g_volume_mount_finish()
 * is called, then it will be filled with any error information.
 * 
 * ## Volume Identifiers # {#volume-identifier}
 * 
 * It is sometimes necessary to directly access the underlying
 * operating system object behind a volume (e.g. for passing a volume
 * to an application via the commandline). For this purpose, GIO
 * allows to obtain an 'identifier' for the volume. There can be
 * different kinds of identifiers, such as Hal UDIs, filesystem labels,
 * traditional Unix devices (e.g. `/dev/sda2`), UUIDs. GIO uses predefined
 * strings as names for the different kinds of identifiers:
 * %G_VOLUME_IDENTIFIER_KIND_UUID, %G_VOLUME_IDENTIFIER_KIND_LABEL, etc.
 * Use g_volume_get_identifier() to obtain an identifier for a volume.
 * 
 * 
 * Note that %G_VOLUME_IDENTIFIER_KIND_HAL_UDI will only be available
 * when the gvfs hal volume monitor is in use. Other volume monitors
 * will generally be able to provide the %G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE
 * identifier, which can be used to obtain a hal device by means of
 * libhal_manager_find_device_string_match().
 */
public interface Volume extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Checks if a volume can be ejected.
     */
    public default boolean canEject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_can_eject(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a volume can be mounted.
     */
    public default boolean canMount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_can_mount(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * @error will be set to contain the errors and %FALSE will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_eject_with_operation_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the activation root for a #GVolume if it is known ahead of
     * mount time. Returns %NULL otherwise. If not %NULL and if @volume
     * is mounted, then the result of g_mount_get_root() on the
     * #GMount object obtained from g_volume_get_mount() will always
     * either be equal or a prefix of what this function returns. In
     * other words, in code
     * 
     * |[<!-- language="C" -->
     *   GMount *mount;
     *   GFile *mount_root
     *   GFile *volume_activation_root;
     * 
     *   mount = g_volume_get_mount (volume); // mounted, so never NULL
     *   mount_root = g_mount_get_root (mount);
     *   volume_activation_root = g_volume_get_activation_root (volume); // assume not NULL
     * ]|
     * then the expression
     * |[<!-- language="C" -->
     *   (g_file_has_prefix (volume_activation_root, mount_root) ||
     *    g_file_equal (volume_activation_root, mount_root))
     * ]|
     * will always be %TRUE.
     * 
     * Activation roots are typically used in #GVolumeMonitor
     * implementations to find the underlying mount to shadow, see
     * g_mount_is_shadowed() for more details.
     */
    public default File getActivationRoot() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_activation_root(HANDLE());
        return new File.FileImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the drive for the @volume.
     */
    public default Drive getDrive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_drive(HANDLE());
        return new Drive.DriveImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the icon for @volume.
     */
    public default Icon getIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the identifier of the given kind for @volume.
     * See the [introduction][volume-identifier] for more
     * information about volume identifiers.
     */
    public default java.lang.String getIdentifier(java.lang.String kind) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_identifier(HANDLE(), Interop.getAllocator().allocateUtf8String(kind));
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the mount for the @volume.
     */
    public default Mount getMount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_mount(HANDLE());
        return new Mount.MountImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the name of @volume.
     */
    public default java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the sort key for @volume, if any.
     */
    public default java.lang.String getSortKey() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_sort_key(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the symbolic icon for @volume.
     */
    public default Icon getSymbolicIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_symbolic_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the UUID for the @volume. The reference is typically based on
     * the file system UUID for the volume in question and should be
     * considered an opaque string. Returns %NULL if there is no UUID
     * available.
     */
    public default java.lang.String getUuid() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_get_uuid(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Finishes mounting a volume. If any errors occurred during the operation,
     * @error will be set to contain the errors and %FALSE will be returned.
     * 
     * If the mount operation succeeded, g_volume_get_mount() on @volume
     * is guaranteed to return the mount right after calling this
     * function; there's no need to listen for the 'mount-added' signal on
     * #GVolumeMonitor.
     */
    public default boolean mountFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_mount_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the volume should be automatically mounted.
     */
    public default boolean shouldAutomount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_volume_should_automount(HANDLE());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Volume source);
    }
    
    /**
     * Emitted when the volume has been changed.
     */
    public default void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalVolumeChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RemovedHandler {
        void signalReceived(Volume source);
    }
    
    /**
     * This signal is emitted when the #GVolume have been removed. If
     * the recipient is holding references to the object they should
     * release them so the object can be finalized.
     */
    public default void onRemoved(RemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalVolumeRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("removed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class VolumeImpl extends org.gtk.gobject.Object implements Volume {
        public VolumeImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
