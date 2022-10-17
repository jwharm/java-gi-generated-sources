package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_at_context_create = Interop.downcallHandle(
        "gtk_at_context_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructCreate(@NotNull AccessibleRole accessibleRole, @NotNull Accessible accessible, @NotNull org.gtk.gdk.Display display) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_at_context_create.invokeExact(accessibleRole.getValue(), accessible.handle(), display.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkATContext} instance for the given accessible role,
     * accessible instance, and display connection.
     * <p>
     * The {@code GtkATContext} implementation being instantiated will depend on the
     * platform.
     */
    public static ATContext create(@NotNull AccessibleRole accessibleRole, @NotNull Accessible accessible, @NotNull org.gtk.gdk.Display display) {
        return new ATContext(constructCreate(accessibleRole, accessible, display));
    }
    
    private static final MethodHandle gtk_at_context_get_accessible = Interop.downcallHandle(
        "gtk_at_context_get_accessible",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkAccessible} using this context.
     */
    public @NotNull Accessible getAccessible() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_at_context_get_accessible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Accessible.AccessibleImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_at_context_get_accessible_role = Interop.downcallHandle(
        "gtk_at_context_get_accessible_role",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the accessible role of this context.
     */
    public @NotNull AccessibleRole getAccessibleRole() {
        int RESULT;
        try {
            RESULT = (int) gtk_at_context_get_accessible_role.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("state-change"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ATContext.Callbacks.class, "signalATContextStateChange",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
