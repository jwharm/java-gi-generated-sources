package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GDBusObject type is the base type for D-Bus objects on both
 * the service side (see #GDBusObjectSkeleton) and the client side
 * (see #GDBusObjectProxy). It is essentially just a container of
 * interfaces.
 */
public interface DBusObject extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the D-Bus interface with name @interface_name associated with
     * @object, if any.
     */
    public default DBusInterface getInterface(java.lang.String interfaceName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_get_interface(HANDLE(), Interop.getAllocator().allocateUtf8String(interfaceName));
        return new DBusInterface.DBusInterfaceImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the D-Bus interfaces associated with @object.
     */
    public default org.gtk.glib.List getInterfaces() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_get_interfaces(HANDLE());
        return new org.gtk.glib.List(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the object path for @object.
     */
    public default java.lang.String getObjectPath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_object_get_object_path(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    @FunctionalInterface
    public interface InterfaceAddedHandler {
        void signalReceived(DBusObject source, DBusInterface interface_);
    }
    
    /**
     * Emitted when @interface is added to @object.
     */
    public default void onInterfaceAdded(InterfaceAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectInterfaceAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("interface-added"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public default void onInterfaceRemoved(InterfaceRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDBusObjectInterfaceRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("interface-removed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class DBusObjectImpl extends org.gtk.gobject.Object implements DBusObject {
        public DBusObjectImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
