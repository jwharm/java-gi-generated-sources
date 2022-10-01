package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkATContext} is an abstract class provided by GTK to communicate to
 * platform-specific assistive technologies API.
 * <p>
 * Each platform supported by GTK implements a {@code GtkATContext} subclass, and
 * is responsible for updating the accessible state in response to state
 * changes in {@code GtkAccessible}.
 */
public class ATContext extends org.gtk.gobject.Object {

    public ATContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ATContext */
    public static ATContext castFrom(org.gtk.gobject.Object gobject) {
        return new ATContext(gobject.refcounted());
    }
    
    private static Refcounted constructCreate(AccessibleRole accessibleRole, Accessible accessible, org.gtk.gdk.Display display) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_at_context_create(accessibleRole.getValue(), accessible.handle(), display.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkATContext} instance for the given accessible role,
     * accessible instance, and display connection.
     * <p>
     * The {@code GtkATContext} implementation being instantiated will depend on the
     * platform.
     */
    public static ATContext create(AccessibleRole accessibleRole, Accessible accessible, org.gtk.gdk.Display display) {
        return new ATContext(constructCreate(accessibleRole, accessible, display));
    }
    
    /**
     * Retrieves the {@code GtkAccessible} using this context.
     */
    public Accessible getAccessible() {
        var RESULT = gtk_h.gtk_at_context_get_accessible(handle());
        return new Accessible.AccessibleImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the accessible role of this context.
     */
    public AccessibleRole getAccessibleRole() {
        var RESULT = gtk_h.gtk_at_context_get_accessible_role(handle());
        return new AccessibleRole(RESULT);
    }
    
    @FunctionalInterface
    public interface StateChangeHandler {
        void signalReceived(ATContext source);
    }
    
    /**
     * Emitted when the attributes of the accessible for the
     * {@code GtkATContext} instance change.
     */
    public SignalHandle onStateChange(StateChangeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("state-change").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ATContext.Callbacks.class, "signalATContextStateChange",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalATContextStateChange(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ATContext.StateChangeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ATContext(Refcounted.get(source)));
        }
        
    }
}
