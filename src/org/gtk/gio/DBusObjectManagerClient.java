package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDBusObjectManagerClient is used to create, monitor and delete object
 * proxies for remote objects exported by a #GDBusObjectManagerServer (or any
 * code implementing the
 * [org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
 * interface).
 * 
 * Once an instance of this type has been created, you can connect to
 * the #GDBusObjectManager::object-added and
 * #GDBusObjectManager::object-removed signals and inspect the
 * #GDBusObjectProxy objects returned by
 * g_dbus_object_manager_get_objects().
 * 
 * If the name for a #GDBusObjectManagerClient is not owned by anyone at
 * object construction time, the default behavior is to request the
 * message bus to launch an owner for the name. This behavior can be
 * disabled using the %G_DBUS_OBJECT_MANAGER_CLIENT_FLAGS_DO_NOT_AUTO_START
 * flag. It's also worth noting that this only works if the name of
 * interest is activatable in the first place. E.g. in some cases it
 * is not possible to launch an owner for the requested name. In this
 * case, #GDBusObjectManagerClient object construction still succeeds but
 * there will be no object proxies
 * (e.g. g_dbus_object_manager_get_objects() returns the empty list) and
 * the #GDBusObjectManagerClient:name-owner property is %NULL.
 * 
 * The owner of the requested name can come and go (for example
 * consider a system service being restarted) – #GDBusObjectManagerClient
 * handles this case too; simply connect to the #GObject::notify
 * signal to watch for changes on the #GDBusObjectManagerClient:name-owner
 * property. When the name owner vanishes, the behavior is that
 * #GDBusObjectManagerClient:name-owner is set to %NULL (this includes
 * emission of the #GObject::notify signal) and then
 * #GDBusObjectManager::object-removed signals are synthesized
 * for all currently existing object proxies. Since
 * #GDBusObjectManagerClient:name-owner is %NULL when this happens, you can
 * use this information to disambiguate a synthesized signal from a
 * genuine signal caused by object removal on the remote
 * #GDBusObjectManager. Similarly, when a new name owner appears,
 * #GDBusObjectManager::object-added signals are synthesized
 * while #GDBusObjectManagerClient:name-owner is still %NULL. Only when all
 * object proxies have been added, the #GDBusObjectManagerClient:name-owner
 * is set to the new name owner (this includes emission of the
 * #GObject::notify signal).  Furthermore, you are guaranteed that
 * #GDBusObjectManagerClient:name-owner will alternate between a name owner
 * (e.g. `:1.42`) and %NULL even in the case where
 * the name of interest is atomically replaced
 * 
 * Ultimately, #GDBusObjectManagerClient is used to obtain #GDBusProxy
 * instances. All signals (including the
 * org.freedesktop.DBus.Properties::PropertiesChanged signal)
 * delivered to #GDBusProxy instances are guaranteed to originate
 * from the name owner. This guarantee along with the behavior
 * described above, means that certain race conditions including the
 * "half the proxy is from the old owner and the other half is from
 * the new owner" problem cannot happen.
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
 * [thread-default main context][g-main-context-push-thread-default]
 * that the #GDBusObjectManagerClient object was constructed
 * in. Additionally, the #GDBusObjectProxy and #GDBusProxy objects
 * originating from the #GDBusObjectManagerClient object will be created in
 * the same context and, consequently, will deliver signals in the
 * same main loop.
 */
public class DBusObjectManagerClient extends org.gtk.gobject.Object implements AsyncInitable, DBusObjectManager, Initable {

    public DBusObjectManagerClient(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DBusObjectManagerClient */
    public static DBusObjectManagerClient castFrom(org.gtk.gobject.Object gobject) {
        return new DBusObjectManagerClient(gobject.getProxy());
    }
    
    /**
     * Gets the #GDBusConnection used by @manager.
     */
    public DBusConnection getConnection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_client_get_connection(HANDLE());
        return new DBusConnection(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the flags that @manager was constructed with.
     */
    public int getFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_client_get_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the name that @manager is for, or %NULL if not a message bus
     * connection.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_client_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * The unique name that owns the name that @manager is for or %NULL if
     * no-one currently owns that name. You can connect to the
     * #GObject::notify signal to track changes to the
     * #GDBusObjectManagerClient:name-owner property.
     */
    public java.lang.String getNameOwner() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_client_get_name_owner(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    @FunctionalInterface
    public interface InterfaceProxyPropertiesChangedHandler {
        void signalReceived(DBusObjectManagerClient source, DBusObjectProxy objectProxy, DBusProxy interfaceProxy, org.gtk.glib.Variant changedProperties, java.lang.String[] invalidatedProperties);
    }
    
    /**
     * Emitted when one or more D-Bus properties on proxy changes. The
     * local cache has already been updated when this signal fires. Note
     * that both @changed_properties and @invalidated_properties are
     * guaranteed to never be %NULL (either may be empty though).
     * 
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all interface proxies managed by @manager.
     * 
     * This signal is emitted in the
     * [thread-default main context][g-main-context-push-thread-default]
     * that @manager was constructed in.
     */
    public void onInterfaceProxyPropertiesChanged(InterfaceProxyPropertiesChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerClientInterfaceProxyPropertiesChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("interface-proxy-properties-changed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * [thread-default main context][g-main-context-push-thread-default]
     * that @manager was constructed in.
     */
    public void onInterfaceProxySignal(InterfaceProxySignalHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerClientInterfaceProxySignal", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("interface-proxy-signal"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}