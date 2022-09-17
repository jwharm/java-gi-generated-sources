package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkATContext</code> is an abstract class provided by GTK to communicate to
 * platform-specific assistive technologies API.
 * <p>
 * Each platform supported by GTK implements a <code>GtkATContext</code> subclass, and
 * is responsible for updating the accessible state in response to state
 * changes in <code>GtkAccessible</code>.
 */
public class ATContext extends org.gtk.gobject.Object {

    public ATContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ATContext */
    public static ATContext castFrom(org.gtk.gobject.Object gobject) {
        return new ATContext(gobject.getReference());
    }
    
    private static Reference constructCreate(AccessibleRole accessibleRole, Accessible accessible, org.gtk.gdk.Display display) {
        Reference RESULT = References.get(gtk_h.gtk_at_context_create(accessibleRole.getValue(), accessible.handle(), display.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkATContext</code> instance for the given accessible role,
     * accessible instance, and display connection.
     * <p>
     * The <code>GtkATContext</code> implementation being instantiated will depend on the
     * platform.
     */
    public static ATContext create(AccessibleRole accessibleRole, Accessible accessible, org.gtk.gdk.Display display) {
        return new ATContext(constructCreate(accessibleRole, accessible, display));
    }
    
    /**
     * Retrieves the <code>GtkAccessible</code> using this context.
     */
    public Accessible getAccessible() {
        var RESULT = gtk_h.gtk_at_context_get_accessible(handle());
        return new Accessible.AccessibleImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the accessible role of this context.
     */
    public AccessibleRole getAccessibleRole() {
        var RESULT = gtk_h.gtk_at_context_get_accessible_role(handle());
        return AccessibleRole.fromValue(RESULT);
    }
    
    @FunctionalInterface
    public interface StateChangeHandler {
        void signalReceived(ATContext source);
    }
    
    /**
     * Emitted when the attributes of the accessible for the<code>GtkATContext</code> instance change.
     */
    public SignalHandle onStateChange(StateChangeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalATContextStateChange", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("state-change").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
