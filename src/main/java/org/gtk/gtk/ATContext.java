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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkATContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ATContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ATContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ATContext if its GType is a (or inherits from) "GtkATContext".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ATContext" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkATContext", a ClassCastException will be thrown.
     */
    public static ATContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkATContext"))) {
            return new ATContext(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkATContext");
        }
    }
    
    private static Addressable constructCreate(@NotNull org.gtk.gtk.AccessibleRole accessibleRole, @NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(accessibleRole, "Parameter 'accessibleRole' must not be null");
        java.util.Objects.requireNonNull(accessible, "Parameter 'accessible' must not be null");
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_at_context_create.invokeExact(
                    accessibleRole.getValue(),
                    accessible.handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkATContext} instance for the given accessible role,
     * accessible instance, and display connection.
     * <p>
     * The {@code GtkATContext} implementation being instantiated will depend on the
     * platform.
     * @param accessibleRole the accessible role used by the {@code GtkATContext}
     * @param accessible the {@code GtkAccessible} implementation using the {@code GtkATContext}
     * @param display the {@code GdkDisplay} used by the {@code GtkATContext}
     * @return the {@code GtkATContext}
     */
    public static ATContext create(@NotNull org.gtk.gtk.AccessibleRole accessibleRole, @NotNull org.gtk.gtk.Accessible accessible, @NotNull org.gtk.gdk.Display display) {
        return new ATContext(constructCreate(accessibleRole, accessible, display), Ownership.FULL);
    }
    
    /**
     * Retrieves the {@code GtkAccessible} using this context.
     * @return a {@code GtkAccessible}
     */
    public @NotNull org.gtk.gtk.Accessible getAccessible() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_at_context_get_accessible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Accessible.AccessibleImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the accessible role of this context.
     * @return a {@code GtkAccessibleRole}
     */
    public @NotNull org.gtk.gtk.AccessibleRole getAccessibleRole() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_at_context_get_accessible_role.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.AccessibleRole(RESULT);
    }
    
    @FunctionalInterface
    public interface StateChange {
        void signalReceived(ATContext source);
    }
    
    /**
     * Emitted when the attributes of the accessible for the
     * {@code GtkATContext} instance change.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ATContext.StateChange> onStateChange(ATContext.StateChange handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("state-change"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ATContext.Callbacks.class, "signalATContextStateChange",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ATContext.StateChange>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_at_context_create = Interop.downcallHandle(
            "gtk_at_context_create",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_at_context_get_accessible = Interop.downcallHandle(
            "gtk_at_context_get_accessible",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_at_context_get_accessible_role = Interop.downcallHandle(
            "gtk_at_context_get_accessible_role",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalATContextStateChange(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ATContext.StateChange) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ATContext(source, Ownership.UNKNOWN));
        }
    }
}
