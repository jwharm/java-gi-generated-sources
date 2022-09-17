package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GVolume interface represents user-visible objects that can be
 * mounted. Note, when porting from GnomeVFS, #GVolume is the moral
 * equivalent of #GnomeVFSDrive.
 * <p>
 * Mounting a #GVolume instance is an asynchronous operation. For more
 * information about asynchronous operations, see #GAsyncResult and
 * <h1>ask. To mount a #GVolume, first call g_volume_mount() with (at</h1>
 * least) the #GVolume instance, optionally a #GMountOperation object
 * and a #GAsyncReadyCallback.
 * <p>
 * Typically, one will only want to pass <code>null</code> for the
 * <h1>ountOperation if automounting all volumes when a desktop session</h1>
 * starts since it&#39;s not desirable to put up a lot of dialogs asking
 * for credentials.
 * <p>
 * The callback will be fired when the operation has resolved (either
 * with success or failure), and a #GAsyncResult instance will be
 * passed to the callback.  That callback should then call
 * g_volume_mount_finish() with the #GVolume instance and the
 * <h1>syncResult data to see if the operation was completed</h1>
 * successfully.  If an @error is present when g_volume_mount_finish()
 * is called, then it will be filled with any error information.
 * <p>
 * <h2>Volume Identifiers # {#volume-identifier}</h2>
 * <p>
 * It is sometimes necessary to directly access the underlying
 * operating system object behind a volume (e.g. for passing a volume
 * to an application via the commandline). For this purpose, GIO
 * allows to obtain an &#39;identifier&#39; for the volume. There can be
 * different kinds of identifiers, such as Hal UDIs, filesystem labels,
 * traditional Unix devices (e.g. <code>/dev/sda2</code>), UUIDs. GIO uses predefined
 * strings as names for the different kinds of identifiers:
 * <code>G_VOLUME_IDENTIFIER_KIND_UUID,</code> <code>G_VOLUME_IDENTIFIER_KIND_LABEL,</code> etc.
 * Use g_volume_get_identifier() to obtain an identifier for a volume.
 * 
 * 
 * Note that <code>G_VOLUME_IDENTIFIER_KIND_HAL_UDI</code> will only be available
 * when the gvfs hal volume monitor is in use. Other volume monitors
 * will generally be able to provide the <code>G_VOLUME_IDENTIFIER_KIND_UNIX_DEVICE
 * identifier,</code> which can be used to obtain a hal device by means of
 * libhal_manager_find_device_string_match().
 */
public interface Volume extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Checks if a volume can be ejected.
     */
    public default boolean canEject() {
        var RESULT = gtk_h.g_volume_can_eject(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a volume can be mounted.
     */
    public default boolean canMount() {
        var RESULT = gtk_h.g_volume_can_mount(handle());
        return (RESULT != 0);
    }
    
    /**
     * Ejects a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_eject_with_operation_finish() with the @volume
     * and #GAsyncResult data returned in the @callback.
     */
    public default void ejectWithOperation(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_volume_eject_with_operation(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes ejecting a volume. If any errors occurred during the operation,
     * @error will be set to contain the errors and <code>false</code> will be returned.
     */
    public default boolean ejectWithOperationFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_volume_eject_with_operation_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the activation root for a #GVolume if it is known ahead of
     * mount time. Returns <code>null</code> otherwise. If not <code>null</code> and if @volume
     * is mounted, then the result of g_mount_get_root() on the
     * #GMount object obtained from g_volume_get_mount() will always
     * either be equal or a prefix of what this function returns. In
     * other words, in code
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     *   GMount *mount;
     *   GFile *mount_root
     *   GFile *volume_activation_root;
     * 
     *   mount = g_volume_get_mount (volume); // mounted, so never NULL
     *   mount_root = g_mount_get_root (mount);
     *   volume_activation_root = g_volume_get_activation_root (volume); // assume not NULL
     * ]}|
     * then the expression
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     *   (g_file_has_prefix (volume_activation_root, mount_root) ||
     *    g_file_equal (volume_activation_root, mount_root))
     * ]}|
     * will always be <code>TRUE.
     * 
     * Activation</code> roots are typically used in #GVolumeMonitor
     * implementations to find the underlying mount to shadow, see
     * g_mount_is_shadowed() for more details.
     */
    public default File getActivationRoot() {
        var RESULT = gtk_h.g_volume_get_activation_root(handle());
        return new File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the drive for the @volume.
     */
    public default Drive getDrive() {
        var RESULT = gtk_h.g_volume_get_drive(handle());
        return new Drive.DriveImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the icon for @volume.
     */
    public default Icon getIcon() {
        var RESULT = gtk_h.g_volume_get_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the identifier of the given kind for @volume.
     * See the {@link [introduction]}{@link [volume-identifier]} for more
     * information about volume identifiers.
     */
    public default java.lang.String getIdentifier(java.lang.String kind) {
        var RESULT = gtk_h.g_volume_get_identifier(handle(), Interop.allocateNativeString(kind).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the mount for the @volume.
     */
    public default Mount getMount() {
        var RESULT = gtk_h.g_volume_get_mount(handle());
        return new Mount.MountImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the name of @volume.
     */
    public default java.lang.String getName() {
        var RESULT = gtk_h.g_volume_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the sort key for @volume, if any.
     */
    public default java.lang.String getSortKey() {
        var RESULT = gtk_h.g_volume_get_sort_key(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the symbolic icon for @volume.
     */
    public default Icon getSymbolicIcon() {
        var RESULT = gtk_h.g_volume_get_symbolic_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the UUID for the @volume. The reference is typically based on
     * the file system UUID for the volume in question and should be
     * considered an opaque string. Returns <code>null</code> if there is no UUID
     * available.
     */
    public default java.lang.String getUuid() {
        var RESULT = gtk_h.g_volume_get_uuid(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Mounts a volume. This is an asynchronous operation, and is
     * finished by calling g_volume_mount_finish() with the @volume
     * and #GAsyncResult returned in the @callback.
     */
    public default void mount(int flags, MountOperation mountOperation, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_volume_mount(handle(), flags, mountOperation.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes mounting a volume. If any errors occurred during the operation,
     * @error will be set to contain the errors and <code>false</code> will be returned.
     * 
     * If the mount operation succeeded, g_volume_get_mount() on @volume
     * is guaranteed to return the mount right after calling this
     * function; there&#39;s no need to listen for the &#39;mount-added&#39; signal on
     * #GVolumeMonitor.
     */
    public default boolean mountFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_volume_mount_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the volume should be automatically mounted.
     */
    public default boolean shouldAutomount() {
        var RESULT = gtk_h.g_volume_should_automount(handle());
        return (RESULT != 0);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalVolumeChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public default SignalHandle onRemoved(RemovedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalVolumeRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class VolumeImpl extends org.gtk.gobject.Object implements Volume {
        public VolumeImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
