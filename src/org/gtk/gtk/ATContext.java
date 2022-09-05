package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkATContext` is an abstract class provided by GTK to communicate to
 * platform-specific assistive technologies API.
 * 
 * Each platform supported by GTK implements a `GtkATContext` subclass, and
 * is responsible for updating the accessible state in response to state
 * changes in `GtkAccessible`.
 */
public class ATContext extends org.gtk.gobject.Object {

    public ATContext(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ATContext */
    public static ATContext castFrom(org.gtk.gobject.Object gobject) {
        return new ATContext(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkATContext` instance for the given accessible role,
     * accessible instance, and display connection.
     * 
     * The `GtkATContext` implementation being instantiated will depend on the
     * platform.
     */
    public ATContext(AccessibleRole accessibleRole, Accessible accessible, org.gtk.gdk.Display display) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_at_context_create(accessibleRole.getValue(), accessible.HANDLE(), display.HANDLE()), true));
    }
    
    /**
     * Retrieves the `GtkAccessible` using this context.
     */
    public Accessible getAccessible() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_at_context_get_accessible(HANDLE());
        return new Accessible.AccessibleImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the accessible role of this context.
     */
    public AccessibleRole getAccessibleRole() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_at_context_get_accessible_role(HANDLE());
        return AccessibleRole.fromValue(RESULT);
    }
    
    @FunctionalInterface
    public interface StateChangeHandler {
        void signalReceived(ATContext source);
    }
    
    /**
     * Emitted when the attributes of the accessible for the
     * `GtkATContext` instance change.
     */
    public void onStateChange(StateChangeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalATContextStateChange", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("state-change"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
