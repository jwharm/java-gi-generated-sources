package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEventControllerMotion} is an event controller tracking the pointer
 * position.
 * <p>
 * The event controller offers {@code Gtk.EventControllerMotion::enter}
 * and {@code Gtk.EventControllerMotion::leave} signals, as well as
 * {@code Gtk.EventControllerMotion:is-pointer} and
 * {@code Gtk.EventControllerMotion:contains-pointer} properties
 * which are updated to reflect changes in the pointer position as it
 * moves over the widget.
 */
public class EventControllerMotion extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerMotion";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EventControllerMotion proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EventControllerMotion(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EventControllerMotion> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EventControllerMotion(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_motion_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle motion events.
     */
    public EventControllerMotion() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Returns if a pointer is within {@code self} or one of its children.
     * @return {@code true} if a pointer is within {@code self} or one of its children
     */
    public boolean containsPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_motion_contains_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns if a pointer is within {@code self}, but not one of its children.
     * @return {@code true} if a pointer is within {@code self} but not one of its children
     */
    public boolean isPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_motion_is_pointer.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gtk_event_controller_motion_get_type.invokeExact();
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
         * Signals that the pointer has entered the widget.
         */
        void run(double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerMotion, double x, double y) {
            run(x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
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
     * Signals that the pointer has entered the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerMotion.Enter> onEnter(EventControllerMotion.Enter handler) {
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
         * Signals that the pointer has left the widget.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerMotion) {
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
     * Signals that the pointer has left the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerMotion.Leave> onLeave(EventControllerMotion.Leave handler) {
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
     * Functional interface declaration of the {@code Motion} callback.
     */
    @FunctionalInterface
    public interface Motion {
    
        /**
         * Emitted when the pointer moves inside the widget.
         */
        void run(double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerMotion, double x, double y) {
            run(x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Motion.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the pointer moves inside the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerMotion.Motion> onMotion(EventControllerMotion.Motion handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("motion", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link EventControllerMotion.Builder} object constructs a {@link EventControllerMotion} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EventControllerMotion.Builder#build()}. 
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
         * Finish building the {@link EventControllerMotion} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventControllerMotion}.
         * @return A new instance of {@code EventControllerMotion} with the properties 
         *         that were set in the Builder object.
         */
        public EventControllerMotion build() {
            return (EventControllerMotion) org.gtk.gobject.GObject.newWithProperties(
                EventControllerMotion.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the pointer is in the controllers widget or a descendant.
         * <p>
         * See also {@code Gtk.EventControllerMotion:is-pointer}.
         * <p>
         * When handling crossing events, this property is updated
         * before {@code Gtk.EventControllerMotion::enter}, but after
         * {@code Gtk.EventControllerMotion::leave} is emitted.
         * @param containsPointer The value for the {@code contains-pointer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContainsPointer(boolean containsPointer) {
            names.add("contains-pointer");
            values.add(org.gtk.gobject.Value.create(containsPointer));
            return this;
        }
        
        /**
         * Whether the pointer is in the controllers widget itself,
         * as opposed to in a descendent widget.
         * <p>
         * See also {@code Gtk.EventControllerMotion:contains-pointer}.
         * <p>
         * When handling crossing events, this property is updated
         * before {@code Gtk.EventControllerMotion::enter}, but after
         * {@code Gtk.EventControllerMotion::leave} is emitted.
         * @param isPointer The value for the {@code is-pointer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsPointer(boolean isPointer) {
            names.add("is-pointer");
            values.add(org.gtk.gobject.Value.create(isPointer));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_motion_new = Interop.downcallHandle(
                "gtk_event_controller_motion_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_motion_contains_pointer = Interop.downcallHandle(
                "gtk_event_controller_motion_contains_pointer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_motion_is_pointer = Interop.downcallHandle(
                "gtk_event_controller_motion_is_pointer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_motion_get_type = Interop.downcallHandle(
                "gtk_event_controller_motion_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_event_controller_motion_get_type != null;
    }
}
