package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link DBusObject} type is the base type for D-Bus objects on both
 * the service side (see {@link DBusObjectSkeleton}) and the client side
 * (see {@link DBusObjectProxy}). It is essentially just a container of
 * interfaces.
 */
public interface DBusObject extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the D-Bus interface with name {@code interface_name} associated with
     * {@code object}, if any.
     */
    public default DBusInterface getInterface(java.lang.String interfaceName) {
        var RESULT = gtk_h.g_dbus_object_get_interface(handle(), Interop.allocateNativeString(interfaceName).handle());
        return new DBusInterface.DBusInterfaceImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the D-Bus interfaces associated with {@code object}.
     */
    public default org.gtk.glib.List getInterfaces() {
        var RESULT = gtk_h.g_dbus_object_get_interfaces(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the object path for {@code object}.
     */
    public default java.lang.String getObjectPath() {
        var RESULT = gtk_h.g_dbus_object_get_object_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    @FunctionalInterface
    public interface InterfaceAddedHandler {
        void signalReceived(DBusObject source, DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is added to {@code object}.
     */
    public default SignalHandle onInterfaceAdded(InterfaceAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("interface-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.class, "__signalDBusObjectInterfaceAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDBusObjectInterfaceAdded(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObject.InterfaceAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObject.DBusObjectImpl(References.get(source)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    @FunctionalInterface
    public interface InterfaceRemovedHandler {
        void signalReceived(DBusObject source, DBusInterface interface_);
    }
    
    /**
     * Emitted when {@code interface} is removed from {@code object}.
     */
    public default SignalHandle onInterfaceRemoved(InterfaceRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("interface-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DBusObject.class, "__signalDBusObjectInterfaceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalDBusObjectInterfaceRemoved(MemoryAddress source, MemoryAddress interface_, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (DBusObject.InterfaceRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new DBusObject.DBusObjectImpl(References.get(source)), new DBusInterface.DBusInterfaceImpl(References.get(interface_, false)));
    }
    
    class DBusObjectImpl extends org.gtk.gobject.Object implements DBusObject {
        public DBusObjectImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
