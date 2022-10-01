package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link DBusObjectManager} type is the base type for service- and
 * client-side implementations of the standardized
 * <a href="http://dbus.freedesktop.org/doc/dbus-specification.html#standard-interfaces-objectmanager">org.freedesktop.DBus.ObjectManager</a>
 * interface.
 * <p>
 * See {@link DBusObjectManagerClient} for the client-side implementation
 * and {@link DBusObjectManagerServer} for the service-side implementation.
 */
public interface DBusObjectManager extends io.github.jwharm.javagi.Proxy {

    /**
     * Gets the interface proxy for {@code interface_name} at {@code object_path}, if
     * any.
     */
    public default DBusInterface getInterface(java.lang.String objectPath, java.lang.String interfaceName) {
        var RESULT = gtk_h.g_dbus_object_manager_get_interface(handle(), Interop.allocateNativeString(objectPath).handle(), Interop.allocateNativeString(interfaceName).handle());
        return new DBusInterface.DBusInterfaceImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the {@link DBusObject} at {@code object_path}, if any.
     */
    public default DBusObject getObject(java.lang.String objectPath) {
        var RESULT = gtk_h.g_dbus_object_manager_get_object(handle(), Interop.allocateNativeString(objectPath).handle());
        return new DBusObject.DBusObjectImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the object path that {@code manager} is for.
     */
    public default java.lang.String getObjectPath() {
        var RESULT = gtk_h.g_dbus_object_manager_get_object_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets all {@link DBusObject} objects known to {@code manager}.
     */
    public default org.gtk.glib.List getObjects() {
        var RESULT = gtk_h.g_dbus_object_manager_get_objects(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface InterfaceAddedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object, DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is added to {@code object}.
     * <p>
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by {@code manager}.
     */
    public default SignalHandle onInterfaceAdded(InterfaceAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("interface-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerInterfaceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceRemovedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object, DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} has been removed from {@code object}.
     * <p>
     * This signal exists purely as a convenience to avoid having to
     * connect signals to all objects managed by {@code manager}.
     */
    public default SignalHandle onInterfaceRemoved(InterfaceRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("interface-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerInterfaceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ObjectAddedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object);
    }
    
    /**
     * Emitted when {@code object} is added to {@code manager}.
     */
    public default SignalHandle onObjectAdded(ObjectAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("object-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerObjectAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ObjectRemovedHandler {
        void signalReceived(DBusObjectManager source, DBusObject object);
    }
    
    /**
     * Emitted when {@code object} is removed from {@code manager}.
     */
    public default SignalHandle onObjectRemoved(ObjectRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("object-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObjectManager.Callbacks.class, "signalDBusObjectManagerObjectRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDBusObjectManagerInterfaceAdded(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObjectManager.InterfaceAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
        }
        
        public static void signalDBusObjectManagerInterfaceRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress interface_, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObjectManager.InterfaceRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
        }
        
        public static void signalDBusObjectManagerObjectAdded(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObjectManager.ObjectAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)));
        }
        
        public static void signalDBusObjectManagerObjectRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DBusObjectManager.ObjectRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DBusObjectManager.DBusObjectManagerImpl(References.get(source)), new DBusObject.DBusObjectImpl(References.get(object, false)));
        }
        
    }
    
    class DBusObjectManagerImpl extends org.gtk.gobject.Object implements DBusObjectManager {
        public DBusObjectManagerImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
