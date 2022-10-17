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
 */
public class DBusObjectManagerClient extends org.gtk.gobject.Object implements AsyncInitable, DBusObjectManager, Initable {

    public DBusObjectManagerClient(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusObjectManagerClient */
    public static DBusObjectManagerClient castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectManagerClient(gobject.refcounted());
    }
    
    private static final MethodHandle g_dbus_object_manager_client_new_finish = Interop.downcallHandle(
        "g_dbus_object_manager_client_new_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFinish(@NotNull AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_object_manager_client_new_finish.invokeExact(res.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_object_manager_client_new().
     */
    public static DBusObjectManagerClient newFinish(@NotNull AsyncResult res) throws GErrorException {
        return new DBusObjectManagerClient(constructNewFinish(res));
    }
    
    private static final MethodHandle g_dbus_object_manager_client_new_for_bus_finish = Interop.downcallHandle(
        "g_dbus_object_manager_client_new_for_bus_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForBusFinish(@NotNull AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_object_manager_client_new_for_bus_finish.invokeExact(res.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an operation started with g_dbus_object_manager_client_new_for_bus().
     */
    public static DBusObjectManagerClient newForBusFinish(@NotNull AsyncResult res) throws GErrorException {
        return new DBusObjectManagerClient(constructNewForBusFinish(res));
    }
    
    private static final MethodHandle g_dbus_object_manager_client_new_for_bus_sync = Interop.downcallHandle(
        "g_dbus_object_manager_client_new_for_bus_sync",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForBusSync(@NotNull BusType busType, @NotNull DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable DBusProxyTypeFunc getProxyTypeFunc, @Nullable Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_object_manager_client_new_for_bus_sync.invokeExact(busType.getValue(), flags.getValue(), Interop.allocateNativeString(name), Interop.allocateNativeString(objectPath), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_dbus_object_manager_client_new_sync() but takes a {@link BusType} instead
     * of a {@link DBusConnection}.
     * <p>
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new_for_bus()
     * for the asynchronous version.
     */
    public static DBusObjectManagerClient newForBusSync(@NotNull BusType busType, @NotNull DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable DBusProxyTypeFunc getProxyTypeFunc, @Nullable Cancellable cancellable) throws GErrorException {
        return new DBusObjectManagerClient(constructNewForBusSync(busType, flags, name, objectPath, getProxyTypeFunc, cancellable));
    }
    
    private static final MethodHandle g_dbus_object_manager_client_new_sync = Interop.downcallHandle(
        "g_dbus_object_manager_client_new_sync",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewSync(@NotNull DBusConnection connection, @NotNull DBusObjectManagerClientFlags flags, @Nullable java.lang.String name, @NotNull java.lang.String objectPath, @Nullable DBusProxyTypeFunc getProxyTypeFunc, @Nullable Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_object_manager_client_new_sync.invokeExact(connection.handle(), flags.getValue(), Interop.allocateNativeString(name), Interop.allocateNativeString(objectPath), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DBusObjectManagerClient} object.
     * <p>
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new()
     * for the asynchronous version.
     */
    public static DBusObjectManagerClient newSync(@NotNull DBusConnection connection, @NotNull DBusObjectManagerClientFlags flags, @Nullable java.lang.String name, @NotNull java.lang.String objectPath, @Nullable DBusProxyTypeFunc getProxyTypeFunc, @Nullable Cancellable cancellable) throws GErrorException {
        return new DBusObjectManagerClient(constructNewSync(connection, flags, name, objectPath, getProxyTypeFunc, cancellable));
    }
    
    private static final MethodHandle g_dbus_object_manager_client_get_connection = Interop.downcallHandle(
        "g_dbus_object_manager_client_get_connection",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link DBusConnection} used by {@code manager}.
     */
    public @NotNull DBusConnection getConnection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_object_manager_client_get_connection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusConnection(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_dbus_object_manager_client_get_flags = Interop.downcallHandle(
        "g_dbus_object_manager_client_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the flags that {@code manager} was constructed with.
     */
    public @NotNull DBusObjectManagerClientFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) g_dbus_object_manager_client_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusObjectManagerClientFlags(RESULT);
    }
    
    private static final MethodHandle g_dbus_object_manager_client_get_name = Interop.downcallHandle(
        "g_dbus_object_manager_client_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name that {@code manager} is for, or {@code null} if not a message bus
     * connection.
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_object_manager_client_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_dbus_object_manager_client_get_name_owner = Interop.downcallHandle(
        "g_dbus_object_manager_client_get_name_owner",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * The unique name that owns the name that {@code manager} is for or {@code null} if
     * no-one currently owns that name. You can connect to the
     * {@link org.gtk.gobject.Object}::notify signal to track changes to the
     * {@link DBusObjectManagerClient}:name-owner property.
     */
    public @Nullable java.lang.String getNameOwner() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_object_manager_client_get_name_owner.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_dbus_object_manager_client_new = Interop.downcallHandle(
        "g_dbus_object_manager_client_new",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously creates a new {@link DBusObjectManagerClient} object.
     * <p>
     * This is an asynchronous failable constructor. When the result is
     * ready, {@code callback} will be invoked in the
     * [thread-default main context][g-main-context-push-thread-default]
     * of the thread you are calling this method from. You can
     * then call g_dbus_object_manager_client_new_finish() to get the result. See
     * g_dbus_object_manager_client_new_sync() for the synchronous version.
     */
    public static @NotNull void new_(@NotNull DBusConnection connection, @NotNull DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable DBusProxyTypeFunc getProxyTypeFunc, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_dbus_object_manager_client_new.invokeExact(connection.handle(), flags.getValue(), Interop.allocateNativeString(name), Interop.allocateNativeString(objectPath), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(getProxyTypeFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_object_manager_client_new_for_bus = Interop.downcallHandle(
        "g_dbus_object_manager_client_new_for_bus",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static @NotNull void newForBus(@NotNull BusType busType, @NotNull DBusObjectManagerClientFlags flags, @NotNull java.lang.String name, @NotNull java.lang.String objectPath, @Nullable DBusProxyTypeFunc getProxyTypeFunc, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_dbus_object_manager_client_new_for_bus.invokeExact(busType.getValue(), flags.getValue(), Interop.allocateNativeString(name), Interop.allocateNativeString(objectPath), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(getProxyTypeFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceProxySignalHandler {
        void signalReceived(DBusObjectManagerClient source, @NotNull DBusObjectProxy objectProxy, @NotNull DBusProxy interfaceProxy, @NotNull java.lang.String senderName, @NotNull java.lang.String signalName, @NotNull org.gtk.glib.Variant parameters);
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
    public SignalHandle onInterfaceProxySignal(InterfaceProxySignalHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("interface-proxy-signal"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManagerClient.Callbacks.class, "signalDBusObjectManagerClientInterfaceProxySignal",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDBusObjectManagerClientInterfaceProxySignal(MemoryAddress source, MemoryAddress objectProxy, MemoryAddress interfaceProxy, MemoryAddress senderName, MemoryAddress signalName, MemoryAddress parameters, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObjectManagerClient.InterfaceProxySignalHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusObjectManagerClient(Refcounted.get(source)), new DBusObjectProxy(Refcounted.get(objectProxy, false)), new DBusProxy(Refcounted.get(interfaceProxy, false)), senderName.getUtf8String(0), signalName.getUtf8String(0), new org.gtk.glib.Variant(Refcounted.get(parameters, false)));
        }
        
    }
}
