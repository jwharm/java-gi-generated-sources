package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GDBusObjectManager type is the base type for service- and
 * client-side implementations of the standardized
 * [org.freedesktop.DBus.ObjectManager](http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager)
 * interface.
 * 
 * See #GDBusObjectManagerClient for the client-side implementation
 * and #GDBusObjectManagerServer for the service-side implementation.
 */
public interface DBusObjectManager extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the interface proxy for @interface_name at @object_path, if
     * any.
     */
    public default DBusInterface getInterface(java.lang.String objectPath, java.lang.String interfaceName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_get_interface(HANDLE(), Interop.getAllocator().allocateUtf8String(objectPath), Interop.getAllocator().allocateUtf8String(interfaceName));
        return new DBusInterface.DBusInterfaceImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the #GDBusObject at @object_path, if any.
     */
    public default DBusObject getObject(java.lang.String objectPath) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_get_object(HANDLE(), Interop.getAllocator().allocateUtf8String(objectPath));
        return new DBusObject.DBusObjectImpl(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the object path that @manager is for.
     */
    public default java.lang.String getObjectPath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_get_object_path(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets all #GDBusObject objects known to @manager.
     */
    public default org.gtk.glib.List getObjects() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_manager_get_objects(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.getProxy(RESULT, true));
    }
    
    @FunctionalInterface
    public interface InterfaceAddedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object, DBusInterface interface_);
    }
    
    /**
     * Emitted when @interface is added to @object.
     * 
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by @manager.
     */
    public default void onInterfaceAdded(InterfaceAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerInterfaceAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("interface-added"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceRemovedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object, DBusInterface interface_);
    }
    
    /**
     * Emitted when @interface has been removed from @object.
     * 
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by @manager.
     */
    public default void onInterfaceRemoved(InterfaceRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerInterfaceRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("interface-removed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ObjectAddedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object);
    }
    
    /**
     * Emitted when @object is added to @manager.
     */
    public default void onObjectAdded(ObjectAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerObjectAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("object-added"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ObjectRemovedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object);
    }
    
    /**
     * Emitted when @object is removed from @manager.
     */
    public default void onObjectRemoved(ObjectRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectManagerObjectRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("object-removed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class DBusObjectManagerImpl extends org.gtk.gobject.Object implements DBusObjectManager {
        public DBusObjectManagerImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
