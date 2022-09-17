package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDBusObjectManagerClient is used to create, monitor and delete object
 * proxies for remote objects exported by a #GDBusObjectManagerServer (or any
 * code implementing the
 * {@link [org.freedesktop.DBus.ObjectManager]}(http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
 * interface).
 * <p>
 * Once an instance of this type has been created, you can connect to
 * the #GDBusObjectManager::object-added and
 * <h1>BusObjectManager::object-removed signals and inspect the</h1>
 * <h1>BusObjectProxy objects returned by</h1>
 * g_dbus_object_manager_get_objects().
 * <p>
 * If the name for a #GDBusObjectManagerClient is not owned by anyone at
 * object construction time, the default behavior is to request the
 * message bus to launch an owner for the name. This behavior can be
 * disabled using the <code>G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START
 * flag.</code> It&#39;s also worth noting that this only works if the name of
 * interest is activatable in the first place. E.g. in some cases it
 * is not possible to launch an owner for the requested name. In this
 * case, #GDBusObjectManagerClient object construction still succeeds but
 * there will be no object proxies
 * (e.g. g_dbus_object_manager_get_objects() returns the empty list) and
 * the #GDBusObjectManagerClient:name-owner property is <code>NULL.
 * <p>
 * The</code> owner of the requested name can come and go (for example
 * consider a system service being restarted) &#8211; #GDBusObjectManagerClient
 * handles this case too; simply connect to the #GObject::notify
 * signal to watch for changes on the #GDBusObjectManagerClient:name-owner
 * property. When the name owner vanishes, the behavior is that
 * <h1>BusObjectManagerClient:name-owner is set to <code>null</code> (this includes</h1>
 * emission of the #GObject::notify signal) and then
 * <h1>BusObjectManager::object-removed signals are synthesized</h1>
 * for all currently existing object proxies. Since
 * <h1>BusObjectManagerClient:name-owner is <code>null</code> when this happens, you can</h1>
 * use this information to disambiguate a synthesized signal from a
 * genuine signal caused by object removal on the remote
 * <h1>BusObjectManager. Similarly, when a new name owner appears,</h1>
 * <h1>BusObjectManager::object-added signals are synthesized</h1>
 * while #GDBusObjectManagerClient:name-owner is still <code>NULL.</code> Only when all
 * object proxies have been added, the #GDBusObjectManagerClient:name-owner
 * is set to the new name owner (this includes emission of the
 * <h1>bject::notify signal).  Furthermore, you are guaranteed that</h1>
 * <h1>BusObjectManagerClient:name-owner will alternate between a name owner</h1>
 * (e.g. <code>:1.42</code>) and <code>null</code> even in the case where
 * the name of interest is atomically replaced
 * 
 * Ultimately, #GDBusObjectManagerClient is used to obtain #GDBusProxy
 * instances. All signals (including the
 * org.freedesktop.DBus.Properties::PropertiesChanged signal)
 * delivered to #GDBusProxy instances are guaranteed to originate
 * from the name owner. This guarantee along with the behavior
 * described above, means that certain race conditions including the
 * &#34;half the proxy is from the old owner and the other half is from
 * the new owner&#34; problem cannot happen.
 * 
 * To avoid having the application connect to signals on the returned
 * #GDBusObjectProxy and #GDBusProxy objects, the
 * #GDBusObject::interface-added,
 * #GDBusObject::interface-removed,
 * #GDBusProxy::g-properties-changed and
 * #GDBusProxy::g-signal signals
 * are also emitted on the #GDBusObjectManagerClient instance managing these
 * objects. The signals emitted are
 * #GDBusObjectManager::interface-added,
 * #GDBusObjectManager::interface-removed,
 * #GDBusObjectManagerClient::interface-proxy-properties-changed and
 * #GDBusObjectManagerClient::interface-proxy-signal.
 * 
 * Note that all callbacks and signals are emitted in the
 * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
 * that the #GDBusObjectManagerClient object was constructed
 * in. Additionally, the #GDBusObjectProxy and #GDBusProxy objects
 * originating from the #GDBusObjectManagerClient object will be created in
 * the same context and, consequently, will deliver signals in the
 * same main loop.
 */
public class DBusObjectManagerClient extends org.gtk.gobject.Object implements AsyncInitable, DBusObjectManager, Initable {

    public DBusObjectManagerClient(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusObjectManagerClient */
    public static DBusObjectManagerClient castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectManagerClient(gobject.getReference());
    }
    
    private static Reference constructNewFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_object_manager_client_new_finish(res.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_object_manager_client_new().
     */
    public static DBusObjectManagerClient newFinish(AsyncResult res) throws GErrorException {
        return new DBusObjectManagerClient(constructNewFinish(res));
    }
    
    private static Reference constructNewForBusFinish(AsyncResult res) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_object_manager_client_new_for_bus_finish(res.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an operation started with g_dbus_object_manager_client_new_for_bus().
     */
    public static DBusObjectManagerClient newForBusFinish(AsyncResult res) throws GErrorException {
        return new DBusObjectManagerClient(constructNewForBusFinish(res));
    }
    
    private static Reference constructNewForBusSync(BusType busType, int flags, java.lang.String name, java.lang.String objectPath, DBusProxyTypeFunc getProxyTypeFunc, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Reference RESULT = References.get(gtk_h.g_dbus_object_manager_client_new_for_bus_sync(busType.getValue(), flags, Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(getProxyTypeFunc.hashCode(), getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_dbus_object_manager_client_new_sync() but takes a #GBusType instead
     * of a #GDBusConnection.
     * 
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new_for_bus()
     * for the asynchronous version.
     */
    public static DBusObjectManagerClient newForBusSync(BusType busType, int flags, java.lang.String name, java.lang.String objectPath, DBusProxyTypeFunc getProxyTypeFunc, Cancellable cancellable) throws GErrorException {
        return new DBusObjectManagerClient(constructNewForBusSync(busType, flags, name, objectPath, getProxyTypeFunc, cancellable));
    }
    
    private static Reference constructNewSync(DBusConnection connection, int flags, java.lang.String name, java.lang.String objectPath, DBusProxyTypeFunc getProxyTypeFunc, Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Reference RESULT = References.get(gtk_h.g_dbus_object_manager_client_new_sync(connection.handle(), flags, Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(getProxyTypeFunc.hashCode(), getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new #GDBusObjectManagerClient object.
     * 
     * This is a synchronous failable constructor - the calling thread is
     * blocked until a reply is received. See g_dbus_object_manager_client_new()
     * for the asynchronous version.
     */
    public static DBusObjectManagerClient newSync(DBusConnection connection, int flags, java.lang.String name, java.lang.String objectPath, DBusProxyTypeFunc getProxyTypeFunc, Cancellable cancellable) throws GErrorException {
        return new DBusObjectManagerClient(constructNewSync(connection, flags, name, objectPath, getProxyTypeFunc, cancellable));
    }
    
    /**
     * Gets the #GDBusConnection used by @manager.
     */
    public DBusConnection getConnection() {
        var RESULT = gtk_h.g_dbus_object_manager_client_get_connection(handle());
        return new DBusConnection(References.get(RESULT, false));
    }
    
    /**
     * Gets the flags that @manager was constructed with.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_dbus_object_manager_client_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets the name that @manager is for, or <code>null</code> if not a message bus
     * connection.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_dbus_object_manager_client_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * The unique name that owns the name that @manager is for or <code>null</code> if
     * no-one currently owns that name. You can connect to the
     * #GObject::notify signal to track changes to the
     * #GDBusObjectManagerClient:name-owner property.
     */
    public java.lang.String getNameOwner() {
        var RESULT = gtk_h.g_dbus_object_manager_client_get_name_owner(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Asynchronously creates a new #GDBusObjectManagerClient object.
     * 
     * This is an asynchronous failable constructor. When the result is
     * ready, @callback will be invoked in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from. You can
     * then call g_dbus_object_manager_client_new_finish() to get the result. See
     * g_dbus_object_manager_client_new_sync() for the synchronous version.
     */
    public static void new_(DBusConnection connection, int flags, java.lang.String name, java.lang.String objectPath, DBusProxyTypeFunc getProxyTypeFunc, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_object_manager_client_new(connection.handle(), flags, Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(getProxyTypeFunc.hashCode(), getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(getProxyTypeFunc.hashCode(), getProxyTypeFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Like g_dbus_object_manager_client_new() but takes a #GBusType instead of a
     * #GDBusConnection.
     * 
     * This is an asynchronous failable constructor. When the result is
     * ready, @callback will be invoked in the
     * {@link [thread-default main loop]}{@link [g-main-context-push-thread-default]}
     * of the thread you are calling this method from. You can
     * then call g_dbus_object_manager_client_new_for_bus_finish() to get the result. See
     * g_dbus_object_manager_client_new_for_bus_sync() for the synchronous version.
     */
    public static void newForBus(BusType busType, int flags, java.lang.String name, java.lang.String objectPath, DBusProxyTypeFunc getProxyTypeFunc, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dbus_object_manager_client_new_for_bus(busType.getValue(), flags, Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(objectPath).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDBusProxyTypeFunc",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(getProxyTypeFunc.hashCode(), getProxyTypeFunc)), 
                    Interop.cbDestroyNotifySymbol(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(long.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(getProxyTypeFunc.hashCode(), getProxyTypeFunc)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceProxyPropertiesChangedHandler {
        void signalReceived(DBusObjectManagerClient source, DBusObjectProxy objectProxy, DBusProxy interfaceProxy, org.gtk.glib.Variant changedProperties, java.lang.String[] invalidatedProperties);
    }
    
    /**
     * Emitted when one or more D-Bus properties on proxy changes. The
     * local cache has already been updated when this signal fires. Note
     * that both @changed_properties and @invalidated_properties are
     * guaranteed to never be <code>null</code> (either may be empty though).
     * 
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all interface proxies managed by @manager.
     * 
     * This signal is emitted in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * that @manager was constructed in.
     */
    public SignalHandle onInterfaceProxyPropertiesChanged(InterfaceProxyPropertiesChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerClientInterfaceProxyPropertiesChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("interface-proxy-properties-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceProxySignalHandler {
        void signalReceived(DBusObjectManagerClient source, DBusObjectProxy objectProxy, DBusProxy interfaceProxy, java.lang.String senderName, java.lang.String signalName, org.gtk.glib.Variant parameters);
    }
    
    /**
     * Emitted when a D-Bus signal is received on @interface_proxy.
     * 
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all interface proxies managed by @manager.
     * 
     * This signal is emitted in the
     * {@link [thread-default main context]}{@link [g-main-context-push-thread-default]}
     * that @manager was constructed in.
     */
    public SignalHandle onInterfaceProxySignal(InterfaceProxySignalHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerClientInterfaceProxySignal", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("interface-proxy-signal").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
