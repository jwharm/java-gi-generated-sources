package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEventControllerFocus} is an event controller to keep track of
 * keyboard focus.
 * <p>
 * The event controller offers {@code Gtk.EventControllerFocus::enter}
 * and {@code Gtk.EventControllerFocus::leave} signals, as well as
 * {@code Gtk.EventControllerFocus:is-focus} and
 * {@code Gtk.EventControllerFocus:contains-focus} properties
 * which are updated to reflect focus changes inside the widget hierarchy
 * that is rooted at the controllers widget.
 */
public class EventControllerFocus extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerFocus";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EventControllerFocus proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EventControllerFocus(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EventControllerFocus> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EventControllerFocus(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_focus_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle focus events.
     */
    public EventControllerFocus() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Returns {@code true} if focus is within {@code self} or one of its children.
     * @return {@code true} if focus is within {@code self} or one of its children
     */
    public boolean containsFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_focus_contains_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if focus is within {@code self}, but not one of its children.
     * @return {@code true} if focus is within {@code self}, but not one of its children
     */
    public boolean isFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_focus_is_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_event_controller_focus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Enter} callback.
     */
    @FunctionalInterface
    public interface Enter {
    
        /**
         * Emitted whenever the focus enters into the widget or one
         * of its descendents.
         * <p>
         * Note that this means you may not get an ::enter signal
         * even though the widget becomes the focus location, in
         * certain cases (such as when the focus moves from a descendent
         * of the widget to the widget itself). If you are interested
         * in these cases, you can monitor the
         * {@code Gtk.EventControllerFocus:is-focus}
         * property for changes.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerFocus) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Enter.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever the focus enters into the widget or one
     * of its descendents.
     * <p>
     * Note that this means you may not get an ::enter signal
     * even though the widget becomes the focus location, in
     * certain cases (such as when the focus moves from a descendent
     * of the widget to the widget itself). If you are interested
     * in these cases, you can monitor the
     * {@code Gtk.EventControllerFocus:is-focus}
     * property for changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerFocus.Enter> onEnter(EventControllerFocus.Enter handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("enter", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Leave} callback.
     */
    @FunctionalInterface
    public interface Leave {
    
        /**
         * Emitted whenever the focus leaves the widget hierarchy
         * that is rooted at the widget that the controller is attached to.
         * <p>
         * Note that this means you may not get a ::leave signal
         * even though the focus moves away from the widget, in
         * certain cases (such as when the focus moves from the widget
         * to a descendent). If you are interested in these cases, you
         * can monitor the {@code Gtk.EventControllerFocus:is-focus}
         * property for changes.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerFocus) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Leave.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted whenever the focus leaves the widget hierarchy
     * that is rooted at the widget that the controller is attached to.
     * <p>
     * Note that this means you may not get a ::leave signal
     * even though the focus moves away from the widget, in
     * certain cases (such as when the focus moves from the widget
     * to a descendent). If you are interested in these cases, you
     * can monitor the {@code Gtk.EventControllerFocus:is-focus}
     * property for changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerFocus.Leave> onLeave(EventControllerFocus.Leave handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("leave", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link EventControllerFocus.Builder} object constructs a {@link EventControllerFocus} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EventControllerFocus.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EventControllerFocus} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventControllerFocus}.
         * @return A new instance of {@code EventControllerFocus} with the properties 
         *         that were set in the Builder object.
         */
        public EventControllerFocus build() {
            return (EventControllerFocus) org.gtk.gobject.GObject.newWithProperties(
                EventControllerFocus.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * {@code true} if focus is contained in the controllers widget.
         * <p>
         * See {@code Gtk.EventControllerFocus:is-focus} for whether
         * the focus is in the widget itself or inside a descendent.
         * <p>
         * When handling focus events, this property is updated
         * before {@code Gtk.EventControllerFocus::enter} or
         * {@code Gtk.EventControllerFocus::leave} are emitted.
         * @param containsFocus The value for the {@code contains-focus} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContainsFocus(boolean containsFocus) {
            names.add("contains-focus");
            values.add(org.gtk.gobject.Value.create(containsFocus));
            return this;
        }
        
        /**
         * {@code true} if focus is in the controllers widget itself,
         * as opposed to in a descendent widget.
         * <p>
         * See also {@code Gtk.EventControllerFocus:contains-focus}.
         * <p>
         * When handling focus events, this property is updated
         * before {@code Gtk.EventControllerFocus::enter} or
         * {@code Gtk.EventControllerFocus::leave} are emitted.
         * @param isFocus The value for the {@code is-focus} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsFocus(boolean isFocus) {
            names.add("is-focus");
            values.add(org.gtk.gobject.Value.create(isFocus));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_focus_new = Interop.downcallHandle(
                "gtk_event_controller_focus_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_focus_contains_focus = Interop.downcallHandle(
                "gtk_event_controller_focus_contains_focus",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_focus_is_focus = Interop.downcallHandle(
                "gtk_event_controller_focus_is_focus",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_focus_get_type = Interop.downcallHandle(
                "gtk_event_controller_focus_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_event_controller_focus_get_type != null;
    }
}
