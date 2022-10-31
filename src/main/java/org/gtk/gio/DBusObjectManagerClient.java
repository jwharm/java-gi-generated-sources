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
 * handles this case too; simply connect to the {@link org.gtk.gobject.Object}::notify
 * signal to watch for changes on the {@link DBusObjectManagerClient}:name-owner
 * property. When the name owner vanishes, the behavior is that
 * {@link DBusObjectManagerClient}:name-owner is set to {@code null} (this includes
 * emission of the {@link org.gtk.gobject.Object}::notify signal) and then
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
 * {@link org.gtk.gobject.Object}::notify signal).  Furthermore, you are guaranteed that
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
public class DBusObjectManagerClient extends org.gtk.gobject.Object implements org.gtk.gio.AsyncInitable, org.gtk.gio.DBusObjectManager, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerClient";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    @ApiStatus.Internal
    public DBusObjectManagerClient(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DBusObjectManagerClient if its GType is a (or inherits from) "GDBusObjectManagerClient".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DBusObjectManagerClient" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusObjectManagerClient", a ClassCastException will be thrown.
     */
    public static DBusObjectManagerClient castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusObjectManagerClient"))) {
            return new DBusObjectManagerClient(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusObjectManagerClient");
        }
    }
    
    private static Refcounted constructNewFinish(@NotNull org.gtk.gio.AsyncResult res) throws GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_finish.invokeExact(
                    res.handle(), (Addressable) GERROR), true);
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
    public static DBusObjectManagerClient newFinish(@NotNull org.gtk.gio.AsyncResult res) throws GErrorException {
        return new DBusObjectManagerClient(constructNewFinish(res));
    }
    
    private static Refcounted constructNewForBusFinish(@NotNull org.gtk.gio.AsyncResult res) throws GErrorException {
        java.util.Objects.requireNonNull(res, "Parameter 'res' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_for_bus_finish.invokeExact(
                    res.handle(), (Addressable) GERROR), true);
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
    public static DBusObjectManagerClient newForBusFinish(@NotNull org.gtk.gio.AsyncResult res) throws GErrorException {
        return new DBusObjectManagerClient(constructNewForBusFinish(res));
    }
    
    private static Refcounted constructNewForBusSync(@NotNull org.gtk.gio.BusType busType, @NotNull org.gtk.gio.DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        java.util.Objects.requireNonNull(busType, "Parameter 'busType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_for_bus_sync.invokeExact(
                    busType.getValue(),
                    flags.getValue(),
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(objectPath),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : Interop.registerCallback(getProxyTypeFunc)),
                    Interop.cbDestroyNotifySymbol(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR), true);
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
     * @param cancellable A {@link Cancellable} or {@code null}
     * @return A
     *   {@link DBusObjectManagerClient} object or {@code null} if {@code error} is set. Free
     *   with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusObjectManagerClient newForBusSync(@NotNull org.gtk.gio.BusType busType, @NotNull org.gtk.gio.DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new DBusObjectManagerClient(constructNewForBusSync(busType, flags, name, objectPath, getProxyTypeFunc, cancellable));
    }
    
    private static Refcounted constructNewSync(@NotNull org.gtk.gio.DBusConnection connection, @NotNull org.gtk.gio.DBusObjectManagerClientFlags flags, @Nullable java.lang.String name, @NotNull java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_dbus_object_manager_client_new_sync.invokeExact(
                    connection.handle(),
                    flags.getValue(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    Interop.allocateNativeString(objectPath),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : Interop.registerCallback(getProxyTypeFunc)),
                    Interop.cbDestroyNotifySymbol(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR), true);
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
     * @param cancellable A {@link Cancellable} or {@code null}
     * @return A
     *   {@link DBusObjectManagerClient} object or {@code null} if {@code error} is set. Free
     *   with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusObjectManagerClient newSync(@NotNull org.gtk.gio.DBusConnection connection, @NotNull org.gtk.gio.DBusObjectManagerClientFlags flags, @Nullable java.lang.String name, @NotNull java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new DBusObjectManagerClient(constructNewSync(connection, flags, name, objectPath, getProxyTypeFunc, cancellable));
    }
    
    /**
     * Gets the {@link DBusConnection} used by {@code manager}.
     * @return A {@link DBusConnection} object. Do not free,
     *   the object belongs to {@code manager}.
     */
    public @NotNull org.gtk.gio.DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_get_connection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusConnection(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the flags that {@code manager} was constructed with.
     * @return Zero of more flags from the {@link DBusObjectManagerClientFlags}
     * enumeration.
     */
    public @NotNull org.gtk.gio.DBusObjectManagerClientFlags getFlags() {
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
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_object_manager_client_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * The unique name that owns the name that {@code manager} is for or {@code null} if
     * no-one currently owns that name. You can connect to the
     * {@link org.gtk.gobject.Object}::notify signal to track changes to the
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
        return Interop.getStringFrom(RESULT);
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
     * @param cancellable A {@link Cancellable} or {@code null}
     * @param callback A {@link AsyncReadyCallback} to call when the request is satisfied.
     */
    public static void new_(@NotNull org.gtk.gio.DBusConnection connection, @NotNull org.gtk.gio.DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(connection, "Parameter 'connection' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        try {
            DowncallHandles.g_dbus_object_manager_client_new.invokeExact(
                    connection.handle(),
                    flags.getValue(),
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(objectPath),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : Interop.registerCallback(getProxyTypeFunc)),
                    Interop.cbDestroyNotifySymbol(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : Interop.registerCallback(getProxyTypeFunc)));
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
     * @param cancellable A {@link Cancellable} or {@code null}
     * @param callback A {@link AsyncReadyCallback} to call when the request is satisfied.
     */
    public static void newForBus(@NotNull org.gtk.gio.BusType busType, @NotNull org.gtk.gio.DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable org.gtk.gio.DBusProxyTypeFunc getProxyTypeFunc, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(busType, "Parameter 'busType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(objectPath, "Parameter 'objectPath' must not be null");
        try {
            DowncallHandles.g_dbus_object_manager_client_new_for_bus.invokeExact(
                    busType.getValue(),
                    flags.getValue(),
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(objectPath),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : Interop.registerCallback(getProxyTypeFunc)),
                    Interop.cbDestroyNotifySymbol(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (getProxyTypeFunc == null ? MemoryAddress.NULL : Interop.registerCallback(getProxyTypeFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceProxyPropertiesChanged {
        void signalReceived(DBusObjectManagerClient source, @NotNull org.gtk.gio.DBusObjectProxy objectProxy, @NotNull org.gtk.gio.DBusProxy interfaceProxy, @NotNull org.gtk.glib.Variant changedProperties, java.lang.String[] invalidatedProperties);
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
     */
    public Signal<DBusObjectManagerClient.InterfaceProxyPropertiesChanged> onInterfaceProxyPropertiesChanged(DBusObjectManagerClient.InterfaceProxyPropertiesChanged handler) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    @FunctionalInterface
    public interface InterfaceProxySignal {
        void signalReceived(DBusObjectManagerClient source, @NotNull org.gtk.gio.DBusObjectProxy objectProxy, @NotNull org.gtk.gio.DBusProxy interfaceProxy, @NotNull java.lang.String senderName, @NotNull java.lang.String signalName, @NotNull org.gtk.glib.Variant parameters);
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
     */
    public Signal<DBusObjectManagerClient.InterfaceProxySignal> onInterfaceProxySignal(DBusObjectManagerClient.InterfaceProxySignal handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-proxy-signal"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManagerClient.Callbacks.class, "signalDBusObjectManagerClientInterfaceProxySignal",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DBusObjectManagerClient.InterfaceProxySignal>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_object_manager_client_new_finish = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_for_bus_finish = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_for_bus_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_for_bus_sync = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_for_bus_sync",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_sync = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_sync",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_connection = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_connection",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_flags = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_name = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_get_name_owner = Interop.downcallHandle(
            "g_dbus_object_manager_client_get_name_owner",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new = Interop.downcallHandle(
            "g_dbus_object_manager_client_new",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_object_manager_client_new_for_bus = Interop.downcallHandle(
            "g_dbus_object_manager_client_new_for_bus",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalDBusObjectManagerClientInterfaceProxyPropertiesChanged(MemoryAddress source, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress changedProperties, MemoryAddress invalidatedProperties, MemoryAddress data) {
        // Operation not supported yet
    }
        
        public static void signalDBusObjectManagerClientInterfaceProxySignal(MemoryAddress source, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DBusObjectManagerClient.InterfaceProxySignal) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DBusObjectManagerClient(Refcounted.get(source)), new org.gtk.gio.DBusObjectProxy(Refcounted.get(objectProxy, false)), new org.gtk.gio.DBusProxy(Refcounted.get(interfaceProxy, false)), Interop.getStringFrom(senderName), Interop.getStringFrom(signalName), new org.gtk.glib.Variant(Refcounted.get(parameters, false)));
        }
    }
}
