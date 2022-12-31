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
public class ATContext extends org.gtk.gobject.GObject {
    
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
    protected ATContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ATContext> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ATContext(input, ownership);
    
    private static MemoryAddress constructCreate(org.gtk.gtk.AccessibleRole accessibleRole, org.gtk.gtk.Accessible accessible, org.gtk.gdk.Display display) {
        MemoryAddress RESULT;
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
    public static ATContext create(org.gtk.gtk.AccessibleRole accessibleRole, org.gtk.gtk.Accessible accessible, org.gtk.gdk.Display display) {
        var RESULT = constructCreate(accessibleRole, accessible, display);
        return (org.gtk.gtk.ATContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.ATContext.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the {@code GtkAccessible} using this context.
     * @return a {@code GtkAccessible}
     */
    public org.gtk.gtk.Accessible getAccessible() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_at_context_get_accessible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Accessible) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Accessible.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the accessible role of this context.
     * @return a {@code GtkAccessibleRole}
     */
    public org.gtk.gtk.AccessibleRole getAccessibleRole() {
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
    public static org.gtk.glib.Type getType() {
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
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceATContext) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StateChange.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("state-change"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ATContext.Builder} object constructs a {@link ATContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ATContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ATContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ATContext}.
         * @return A new instance of {@code ATContext} with the properties 
         *         that were set in the Builder object.
         */
        public ATContext build() {
            return (ATContext) org.gtk.gobject.GObject.newWithProperties(
                ATContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GtkAccessible} that created the {@code GtkATContext} instance.
         * @param accessible The value for the {@code accessible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAccessible(org.gtk.gtk.Accessible accessible) {
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
        public Builder setAccessibleRole(org.gtk.gtk.AccessibleRole accessibleRole) {
            names.add("accessible-role");
            values.add(org.gtk.gobject.Value.create(accessibleRole));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} for the {@code GtkATContext}.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
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
}
