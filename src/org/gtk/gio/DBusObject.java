package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GDBusObject type is the base type for D-Bus objects on both
 * the service side (see #GDBusObjectSkeleton) and the client side
 * (see #GDBusObjectProxy). It is essentially just a container of
 * interfaces.
 */
public interface DBusObject extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the D-Bus interface with name @interface_name associated with
     * @object, if any.
     */
    public default DBusInterface getInterface(java.lang.String interfaceName) {
        var RESULT = gtk_h.g_dbus_object_get_interface(handle(), Interop.allocateNativeString(interfaceName).handle());
        return new DBusInterface.DBusInterfaceImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the D-Bus interfaces associated with @object.
     */
    public default org.gtk.glib.List getInterfaces() {
        var RESULT = gtk_h.g_dbus_object_get_interfaces(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the object path for @object.
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
     * Emitted when @interface is added to @object.
     */
    public default SignalHandle onInterfaceAdded(InterfaceAddedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectInterfaceAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("interface-added").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InterfaceRemovedHandler {
        void signalReceived(DBusObject source, DBusInterface interface_);
    }
    
    /**
     * Emitted when @interface is removed from @object.
     */
    public default SignalHandle onInterfaceRemoved(InterfaceRemovedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectInterfaceRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("interface-removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class DBusObjectImpl extends org.gtk.gobject.Object implements DBusObject {
        public DBusObjectImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
