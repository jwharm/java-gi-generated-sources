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
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ATContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkATContext", a ClassCastException will be thrown.
     */
    public static ATContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ATContext.getType())) {
            return new ATContext(gobject.handle(), gobject.yieldOwnership());
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
        return org.gtk.gtk.AccessibleRole.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_at_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface StateChange {
        void signalReceived(ATContext sourceATContext);
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ATContext.StateChange>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ATContext.Build} object constructs a {@link ATContext} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ATContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ATContext} using {@link ATContext#castFrom}.
         * @return A new instance of {@code ATContext} with the properties 
         *         that were set in the Build object.
         */
        public ATContext construct() {
            return ATContext.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ATContext.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The {@code GtkAccessible} that created the {@code GtkATContext} instance.
         * @param accessible The value for the {@code accessible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccessible(org.gtk.gtk.Accessible accessible) {
            names.add("accessible");
            values.add(org.gtk.gobject.Value.create(accessible));
            return this;
        }
        
        /**
         * The accessible role used by the AT context.
         * <p>
         * Depending on the given role, different states and properties can be
         * set or retrieved.
         * @param accessibleRole The value for the {@code accessible-role} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccessibleRole(org.gtk.gtk.AccessibleRole accessibleRole) {
            names.add("accessible-role");
            values.add(org.gtk.gobject.Value.create(accessibleRole));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} for the {@code GtkATContext}.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_at_context_create = Interop.downcallHandle(
            "gtk_at_context_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_at_context_get_accessible = Interop.downcallHandle(
            "gtk_at_context_get_accessible",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_at_context_get_accessible_role = Interop.downcallHandle(
            "gtk_at_context_get_accessible_role",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_at_context_get_type = Interop.downcallHandle(
            "gtk_at_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalATContextStateChange(MemoryAddress sourceATContext, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ATContext.StateChange) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ATContext(sourceATContext, Ownership.NONE));
        }
    }
}
