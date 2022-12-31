package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DBusObjectManagerClient} is used to create, monitor and delete object
 * proxies for remote objects exported by a {@link DBusObjectManagerServer} (or any
 * code implementing the
 * <a href="http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager">org.freedesktop.DBus.ObjectManager</a>
 * interface).
 * <p>
 * Once an instance of this type has been created, you can connect to
 * the {@link DBusObjectManager}::object-added and
 * {@link DBusObjectManager}::object-removed signals and inspect the
 * {@link DBusObjectProxy} objects returned by
 * g_dbus_object_manager_get_objects().
 * <p>
 * If the name for a {@link DBusObjectManagerClient} is not owned by anyone at
 * object construction time, the default behavior is to request the
 * message bus to launch an owner for the name. This behavior can be
 * disabled using the {@link DBusObjectManagerClientFlags#DO_NOT_AUTO_START}
 * flag. It's also worth noting that this only works if the name of
 * interest is activatable in the first place. E.g. in some cases it
 * is not possible to launch an owner for the requested name. In this
 * case, {@link DBusObjectManagerClient} object construction still succeeds but
 * there will be no object proxies
 * (e.g. g_dbus_object_manager_get_objects() returns the empty list) and
 * the {@link DBusObjectManagerClient}:name-owner property is {@code null}.
 * <p>
 * The owner of the requested name can come and go (for example
 * consider a system service being restarted) – {@link DBusObjectManagerClient}
 * handles this case too; simply connect to the {@link org.gtk.gobject.GObject}::notify
 * signal to watch for changes on the {@link DBusObjectManagerClient}:name-owner
 * property. When the name owner vanishes, the behavior is that
 * {@link DBusObjectManagerClient}:name-owner is set to {@code null} (this includes
 * emission of the {@link org.gtk.gobject.GObject}::notify signal) and then
 * {@link DBusObjectManager}::object-removed signals are synthesized
 * for all currently existing object proxies. Since
 * {@link DBusObjectManagerClient}:name-owner is {@code null} when this happens, you can
 * use this information to disambiguate a synthesized signal from a
 * genuine signal caused by object removal on the remote
 * {@link DBusObjectManager}. Similarly, when a new name owner appears,
 * {@link DBusObjectManager}::object-added signals are synthesized
 * while {@link DBusObjectManagerClient}:name-owner is still {@code null}. Only when all
 * object proxies have been added, the {@link DBusObjectManagerClient}:name-owner
 * is set to the new name owner (this includes emission of the
 * {@link org.gtk.gobject.GObject}::notify signal).  Furthermore, you are guaranteed that
 * {@link DBusObjectManagerClient}:name-owner will alternate between a name owner
 * (e.g. {@code :1.42}) and {@code null} even in the case where
 * the name of interest is atomically replaced
 * <p>
 * Ultimately, {@link DBusObjectManagerClient} is used to obtain {@link DBusProxy}
 * instances. All signals (including the
 * org.freedesktop.DBus.Properties::PropertiesChanged signal)
 * delivered to {@link DBusProxy} instances are guaranteed to originate
 * from the name owner. This guarantee along with the behavior
 * described above, means that certain race conditions including the
 * "half the proxy is from the old owner and the other half is from
 * the new owner" problem cannot happen.
 * <p>
 * To avoid having the application connect to signals on the returned
 * {@link DBusObjectProxy} and {@link DBusProxy} objects, the
 * {@link DBusObject}::interface-added,
 * {@link DBusObject}::interface-removed,
 * {@link DBusProxy}::g-properties-changed and
 * {@link DBusProxy}::g-signal signals
 * are also emitted on the {@link DBusObjectManagerClient} instance managing these
 * objects. The signals emitted are
 * {@link DBusObjectManager}::interface-added,
 * {@link DBusObjectManager}::interface-removed,
 * {@link DBusObjectManagerClient}::interface-proxy-properties-changed and
 * {@link DBusObjectManagerClient}::interface-proxy-signal.
 * <p>
 * Note that all callbacks and signals are emitted in the
 * [thread-default main context][g-main-context-push-thread-default]
 * that the {@link DBusObjectManagerClient} object was constructed
 * in. Additionally, the {@link DBusObjectProxy} and {@link DBusProxy} objects
 * originating from the {@link DBusObjectManagerClient} object will be created in
 * the same context and, consequently, will deliver signals in the
 * same main loop.
 * @version 2.30
 */
public class DBusObjectManagerClient extends org.gtk.gobject.GObject implements org.gtk.gio.AsyncInitable, org.gtk.gio.DBusObjectManager, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerClient";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DBusObjectManagerClient proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DBusObjectManagerClient(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusObjectManagerClient> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DBusObjectManagerClient(input, ownership);
    
    private static MemoryAddress constructNewFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_finish.invokeExact(
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_object_manager_client_new().
     * @param res A {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed to g_dbus_object_manager_client_new().
     * @return A
     *   {@link DBusObjectManagerClient} object or {@code null} if {@code error} is set. Free
     *   with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusObjectManagerClient newFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        var RESULT = constructNewFinish(res);
        return (org.gtk.gio.DBusObjectManagerClient) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForBusFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_for_bus_finish.invokeExact(
                    res.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_object_manager_client_new_for_bus().
     * @param res A {@link AsyncResult} obtained from the {@link AsyncReadyCallback} passed to g_dbus_object_manager_client_new_for_bus().
     * @return A
     *   {@link DBusObjectManagerClient} object or {@code null} if {@code error} is set. Free
     *   with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusObjectManagerClient newForBusFinish(org.gtk.gio.AsyncResult res) throws GErrorException {
        var RESULT = constructNewForBusFinish(res);
        return (org.gtk.gio.DBusObjectManagerClient) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForBusSync(org.gtk.gio.BusType busType, org.gtk.gio.DBusObjectManagerClientFlags flags, java.lang.String name, java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.glib.DestroyNotify getProxyTypeDestroyNotify, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_for_bus_sync.invokeExact(
                    busType.getValue(),
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) getProxyTypeFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (getProxyTypeDestroyNotify == null ? MemoryAddress.NULL : (Addressable) getProxyTypeDestroyNotify.toCallback()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Like g_dbus_object_manager_client_new_sync() but takes a {@link BusType} instead
     * of a {@link DBusConnection}.
     * <p>
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new_for_bus()
     * for the asynchronous version.
     * @param busType A {@link BusType}.
     * @param flags Zero or more flags from the {@link DBusObjectManagerClientFlags} enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param objectPath The object path of the control object.
     * @param getProxyTypeFunc A {@link DBusProxyTypeFunc} function or {@code null} to always construct {@link DBusProxy} proxies.
     * @param getProxyTypeDestroyNotify Free function for {@code get_proxy_type_user_data} or {@code null}.
     * @param cancellable A {@link Cancellable} or {@code null}
     * @return A
     *   {@link DBusObjectManagerClient} object or {@code null} if {@code error} is set. Free
     *   with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusObjectManagerClient newForBusSync(org.gtk.gio.BusType busType, org.gtk.gio.DBusObjectManagerClientFlags flags, java.lang.String name, java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.glib.DestroyNotify getProxyTypeDestroyNotify, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewForBusSync(busType, flags, name, objectPath, getProxyTypeFunc, getProxyTypeDestroyNotify, cancellable);
        return (org.gtk.gio.DBusObjectManagerClient) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSync(org.gtk.gio.DBusConnection connection, org.gtk.gio.DBusObjectManagerClientFlags flags, @Nullable java.lang.String name, java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.glib.DestroyNotify getProxyTypeDestroyNotify, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_sync.invokeExact(
                    connection.handle(),
                    flags.getValue(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) getProxyTypeFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (getProxyTypeDestroyNotify == null ? MemoryAddress.NULL : (Addressable) getProxyTypeDestroyNotify.toCallback()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusObjectManagerClient} object.
     * <p>
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new()
     * for the asynchronous version.
     * @param connection A {@link DBusConnection}.
     * @param flags Zero or more flags from the {@link DBusObjectManagerClientFlags} enumeration.
     * @param name The owner of the control object (unique or well-known name), or {@code null} when not using a message bus connection.
     * @param objectPath The object path of the control object.
     * @param getProxyTypeFunc A {@link DBusProxyTypeFunc} function or {@code null} to always construct {@link DBusProxy} proxies.
     * @param getProxyTypeDestroyNotify Free function for {@code get_proxy_type_user_data} or {@code null}.
     * @param cancellable A {@link Cancellable} or {@code null}
     * @return A
     *   {@link DBusObjectManagerClient} object or {@code null} if {@code error} is set. Free
     *   with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusObjectManagerClient newSync(org.gtk.gio.DBusConnection connection, org.gtk.gio.DBusObjectManagerClientFlags flags, @Nullable java.lang.String name, java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.glib.DestroyNotify getProxyTypeDestroyNotify, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewSync(connection, flags, name, objectPath, getProxyTypeFunc, getProxyTypeDestroyNotify, cancellable);
        return (org.gtk.gio.DBusObjectManagerClient) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusObjectManagerClient.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the {@link DBusConnection} used by {@code manager}.
     * @return A {@link DBusConnection} object. Do not free,
     *   the object belongs to {@code manager}.
     */
    public org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_get_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.DBusConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.DBusConnection.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the flags that {@code manager} was constructed with.
     * @return Zero of more flags from the {@link DBusObjectManagerClientFlags}
     * enumeration.
     */
    public org.gtk.gio.DBusObjectManagerClientFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_object_manager_client_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusObjectManagerClientFlags(RESULT);
    }
    
    /**
     * Gets the name that {@code manager} is for, or {@code null} if not a message bus
     * connection.
     * @return A unique or well-known name. Do not free, the string
     * belongs to {@code manager}.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * The unique name that owns the name that {@code manager} is for or {@code null} if
     * no-one currently owns that name. You can connect to the
     * {@link org.gtk.gobject.GObject}::notify signal to track changes to the
     * {@link DBusObjectManagerClient}:name-owner property.
     * @return The name owner or {@code null} if no name owner
     * exists. Free with g_free().
     */
    public @Nullable java.lang.String getNameOwner() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_get_name_owner.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_object_manager_client_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Asynchronously creates a new {@link DBusObjectManagerClient} object.
     * <p>
     * This is an asynchronous failable constructor. When the result is
     * ready, {@code callback} will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can
     * then call g_dbus_object_manager_client_new_finish() to get the result. See
     * g_dbus_object_manager_client_new_sync() for the synchronous version.
     * @param connection A {@link DBusConnection}.
     * @param flags Zero or more flags from the {@link DBusObjectManagerClientFlags} enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param objectPath The object path of the control object.
     * @param getProxyTypeFunc A {@link DBusProxyTypeFunc} function or {@code null} to always construct {@link DBusProxy} proxies.
     * @param getProxyTypeDestroyNotify Free function for {@code get_proxy_type_user_data} or {@code null}.
     * @param cancellable A {@link Cancellable} or {@code null}
     * @param callback A {@link AsyncReadyCallback} to call when the request is satisfied.
     */
    public static void new_(org.gtk.gio.DBusConnection connection, org.gtk.gio.DBusObjectManagerClientFlags flags, java.lang.String name, java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.glib.DestroyNotify getProxyTypeDestroyNotify, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_object_manager_client_new.invokeExact(
                    connection.handle(),
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) getProxyTypeFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (getProxyTypeDestroyNotify == null ? MemoryAddress.NULL : (Addressable) getProxyTypeDestroyNotify.toCallback()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_dbus_object_manager_client_new() but takes a {@link BusType} instead of a
     * {@link DBusConnection}.
     * <p>
     * This is an asynchronous failable constructor. When the result is
     * ready, {@code callback} will be invoked in the
     * [thread-default main loop][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can
     * then call g_dbus_object_manager_client_new_for_bus_finish() to get the result. See
     * g_dbus_object_manager_client_new_for_bus_sync() for the synchronous version.
     * @param busType A {@link BusType}.
     * @param flags Zero or more flags from the {@link DBusObjectManagerClientFlags} enumeration.
     * @param name The owner of the control object (unique or well-known name).
     * @param objectPath The object path of the control object.
     * @param getProxyTypeFunc A {@link DBusProxyTypeFunc} function or {@code null} to always construct {@link DBusProxy} proxies.
     * @param getProxyTypeDestroyNotify Free function for {@code get_proxy_type_user_data} or {@code null}.
     * @param cancellable A {@link Cancellable} or {@code null}
     * @param callback A {@link AsyncReadyCallback} to call when the request is satisfied.
     */
    public static void newForBus(org.gtk.gio.BusType busType, org.gtk.gio.DBusObjectManagerClientFlags flags, java.lang.String name, java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.glib.DestroyNotify getProxyTypeDestroyNotify, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_dbus_object_manager_client_new_for_bus.invokeExact(
                    busType.getValue(),
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(objectPath, null),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) getProxyTypeFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (getProxyTypeDestroyNotify == null ? MemoryAddress.NULL : (Addressable) getProxyTypeDestroyNotify.toCallback()),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceProxyPropertiesChanged {
        void run(org.gtk.gio.DBusObjectProxy objectProxy, org.gtk.gio.DBusProxy interfaceProxy, org.gtk.glib.Variant changedProperties, PointerString invalidatedProperties);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManagerClient, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties) {
            run((org.gtk.gio.DBusObjectProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(objectProxy)), org.gtk.gio.DBusObjectProxy.fromAddress).marshal(objectProxy, Ownership.NONE), (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interfaceProxy)), org.gtk.gio.DBusProxy.fromAddress).marshal(interfaceProxy, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(changedProperties, Ownership.NONE), new PointerString(invalidatedProperties));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceProxyPropertiesChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when one or more D-Bus properties on proxy changes. The
     * local cache has already been updated when this signal fires. Note
     * that both {@code changed_properties} and {@code invalidated_properties} are
     * guaranteed to never be {@code null} (either may be empty though).
     * <p>
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all interface proxies managed by {@code manager}.
     * <p>
     * This signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * that {@code manager} was constructed in.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusObjectManagerClient.InterfaceProxyPropertiesChanged> onInterfaceProxyPropertiesChanged(DBusObjectManagerClient.InterfaceProxyPropertiesChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("interface-proxy-properties-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceProxySignal {
        void run(org.gtk.gio.DBusObjectProxy objectProxy, org.gtk.gio.DBusProxy interfaceProxy, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDBusObjectManagerClient, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters) {
            run((org.gtk.gio.DBusObjectProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(objectProxy)), org.gtk.gio.DBusObjectProxy.fromAddress).marshal(objectProxy, Ownership.NONE), (org.gtk.gio.DBusProxy) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interfaceProxy)), org.gtk.gio.DBusProxy.fromAddress).marshal(interfaceProxy, Ownership.NONE), Marshal.addressToString.marshal(senderName, null), Marshal.addressToString.marshal(signalName, null), org.gtk.glib.Variant.fromAddress.marshal(parameters, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceProxySignal.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a D-Bus signal is received on {@code interface_proxy}.
     * <p>
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all interface proxies managed by {@code manager}.
     * <p>
     * This signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * that {@code manager} was constructed in.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DBusObjectManagerClient.InterfaceProxySignal> onInterfaceProxySignal(DBusObjectManagerClient.InterfaceProxySignal handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("interface-proxy-signal"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DBusObjectManagerClient.Builder} object constructs a {@link DBusObjectManagerClient} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DBusObjectManagerClient.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DBusObjectManagerClient} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DBusObjectManagerClient}.
         * @return A new instance of {@code DBusObjectManagerClient} with the properties 
         *         that were set in the Builder object.
         */
        public DBusObjectManagerClient build() {
            return (DBusObjectManagerClient) org.gtk.gobject.GObject.newWithProperties(
                DBusObjectManagerClient.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If this property is not {@link BusType#NONE}, then
         * {@link DBusObjectManagerClient}:connection must be {@code null} and will be set to the
         * {@link DBusConnection} obtained by calling g_bus_get() with the value
         * of this property.
         * @param busType The value for the {@code bus-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBusType(org.gtk.gio.BusType busType) {
            names.add("bus-type");
            values.add(org.gtk.gobject.Value.create(busType));
            return this;
        }
        
        /**
         * The {@link DBusConnection} to use.
         * @param connection The value for the {@code connection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConnection(org.gtk.gio.DBusConnection connection) {
            names.add("connection");
            values.add(org.gtk.gobject.Value.create(connection));
            return this;
        }
        
        /**
         * Flags from the {@link DBusObjectManagerClientFlags} enumeration.
         * @param flags The value for the {@code flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gio.DBusObjectManagerClientFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
        
        /**
         * A {@link org.gtk.glib.DestroyNotify} for the {@code gpointer} user_data in {@link DBusObjectManagerClient}:get-proxy-type-user-data.
         * @param getProxyTypeDestroyNotify The value for the {@code get-proxy-type-destroy-notify} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGetProxyTypeDestroyNotify(java.lang.foreign.MemoryAddress getProxyTypeDestroyNotify) {
            names.add("get-proxy-type-destroy-notify");
            values.add(org.gtk.gobject.Value.create(getProxyTypeDestroyNotify));
            return this;
        }
        
        /**
         * The {@link DBusProxyTypeFunc} to use when determining what {@link org.gtk.glib.Type} to
         * use for interface proxies or {@code null}.
         * @param getProxyTypeFunc The value for the {@code get-proxy-type-func} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGetProxyTypeFunc(java.lang.foreign.MemoryAddress getProxyTypeFunc) {
            names.add("get-proxy-type-func");
            values.add(org.gtk.gobject.Value.create(getProxyTypeFunc));
            return this;
        }
        
        /**
         * The {@code gpointer} user_data to pass to {@link DBusObjectManagerClient}:get-proxy-type-func.
         * @param getProxyTypeUserData The value for the {@code get-proxy-type-user-data} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGetProxyTypeUserData(java.lang.foreign.MemoryAddress getProxyTypeUserData) {
            names.add("get-proxy-type-user-data");
            values.add(org.gtk.gobject.Value.create(getProxyTypeUserData));
            return this;
        }
        
        /**
         * The well-known name or unique name that the manager is for.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The unique name that owns {@link DBusObjectManagerClient}:name or {@code null} if
         * no-one is currently owning the name. Connect to the
         * {@link org.gtk.gobject.GObject}::notify signal to track changes to this property.
         * @param nameOwner The value for the {@code name-owner} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNameOwner(java.lang.String nameOwner) {
            names.add("name-owner");
            values.add(org.gtk.gobject.Value.create(nameOwner));
            return this;
        }
        
        /**
         * The object path the manager is for.
         * @param objectPath The value for the {@code object-path} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setObjectPath(java.lang.String objectPath) {
            names.add("object-path");
            values.add(org.gtk.gobject.Value.create(objectPath));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_manager_client_new_finish = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_for_bus_finish = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_for_bus_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_for_bus_sync = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_for_bus_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_sync = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_sync",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_connection = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_connection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_flags = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_name = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_name_owner = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_name_owner",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_type = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new = Interop.downcallHandle(
            "g_dbus_object_manager_client_new",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_for_bus = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_for_bus",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
