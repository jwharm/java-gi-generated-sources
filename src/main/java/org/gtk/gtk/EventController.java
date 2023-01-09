package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEventController} is the base class for event controllers.
 * <p>
 * These are ancillary objects associated to widgets, which react
 * to {@code GdkEvents}, and possibly trigger actions as a consequence.
 * <p>
 * Event controllers are added to a widget with
 * {@link Widget#addController}. It is rarely necessary to
 * explicitly remove a controller with {@link Widget#removeController}.
 * <p>
 * See the chapter on <a href="input-handling.html">input handling</a> for
 * an overview of the basic concepts, such as the capture and bubble
 * phases of even propagation.
 */
public class EventController extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventController";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EventController proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EventController(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EventController> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EventController(input);
    
    /**
     * Returns the event that is currently being handled by the controller.
     * <p>
     * At other times, {@code null} is returned.
     * @return the event that is currently
     *   handled by {@code controller}
     */
    public @Nullable org.gtk.gdk.Event getCurrentEvent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_get_current_event.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Event) Interop.register(RESULT, org.gtk.gdk.Event.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the device of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, {@code null} is returned.
     * @return device of the event is
     *   currently handled by {@code controller}
     */
    public @Nullable org.gtk.gdk.Device getCurrentEventDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_get_current_event_device.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) Interop.register(RESULT, org.gtk.gdk.Device.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the modifier state of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, 0 is returned.
     * @return modifier state of the event is currently handled by {@code controller}
     */
    public org.gtk.gdk.ModifierType getCurrentEventState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_get_current_event_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * Returns the timestamp of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, 0 is returned.
     * @return timestamp of the event is currently handled by {@code controller}
     */
    public int getCurrentEventTime() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_get_current_event_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the name of {@code controller}.
     * @return The controller name
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the propagation limit of the event controller.
     * @return the propagation limit
     */
    public org.gtk.gtk.PropagationLimit getPropagationLimit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_get_propagation_limit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PropagationLimit.of(RESULT);
    }
    
    /**
     * Gets the propagation phase at which {@code controller} handles events.
     * @return the propagation phase
     */
    public org.gtk.gtk.PropagationPhase getPropagationPhase() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_get_propagation_phase.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.PropagationPhase.of(RESULT);
    }
    
    /**
     * Returns the {@code GtkWidget} this controller relates to.
     * @return a {@code GtkWidget}
     */
    public org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_get_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Resets the {@code controller} to a clean state.
     */
    public void reset() {
        try {
            DowncallHandles.gtk_event_controller_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a name on the controller that can be used for debugging.
     * @param name a name for {@code controller}
     */
    public void setName(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_event_controller_set_name.invokeExact(
                        handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the event propagation limit on the event controller.
     * <p>
     * If the limit is set to {@link PropagationLimit#SAME_NATIVE}, the controller
     * won't handle events that are targeted at widgets on a different
     * surface, such as popovers.
     * @param limit the propagation limit
     */
    public void setPropagationLimit(org.gtk.gtk.PropagationLimit limit) {
        try {
            DowncallHandles.gtk_event_controller_set_propagation_limit.invokeExact(
                    handle(),
                    limit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the propagation phase at which a controller handles events.
     * <p>
     * If {@code phase} is {@link PropagationPhase#NONE}, no automatic event handling will be
     * performed, but other additional gesture maintenance will.
     * @param phase a propagation phase
     */
    public void setPropagationPhase(org.gtk.gtk.PropagationPhase phase) {
        try {
            DowncallHandles.gtk_event_controller_set_propagation_phase.invokeExact(
                    handle(),
                    phase.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a name on the controller that can be used for debugging.
     * @param name a name for {@code controller}, must be a static string
     */
    public void setStaticName(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_event_controller_set_static_name.invokeExact(
                        handle(),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_event_controller_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EventController.Builder} object constructs a {@link EventController} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EventController.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EventController} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventController}.
         * @return A new instance of {@code EventController} with the properties 
         *         that were set in the Builder object.
         */
        public EventController build() {
            return (EventController) org.gtk.gobject.GObject.newWithProperties(
                EventController.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The name for this controller, typically used for debugging purposes.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The limit for which events this controller will handle.
         * @param propagationLimit The value for the {@code propagation-limit} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPropagationLimit(org.gtk.gtk.PropagationLimit propagationLimit) {
            names.add("propagation-limit");
            values.add(org.gtk.gobject.Value.create(propagationLimit));
            return this;
        }
        
        /**
         * The propagation phase at which this controller will handle events.
         * @param propagationPhase The value for the {@code propagation-phase} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPropagationPhase(org.gtk.gtk.PropagationPhase propagationPhase) {
            names.add("propagation-phase");
            values.add(org.gtk.gobject.Value.create(propagationPhase));
            return this;
        }
        
        /**
         * The widget receiving the {@code GdkEvents} that the controller will handle.
         * @param widget The value for the {@code widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidget(org.gtk.gtk.Widget widget) {
            names.add("widget");
            values.add(org.gtk.gobject.Value.create(widget));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_get_current_event = Interop.downcallHandle(
                "gtk_event_controller_get_current_event",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_current_event_device = Interop.downcallHandle(
                "gtk_event_controller_get_current_event_device",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_current_event_state = Interop.downcallHandle(
                "gtk_event_controller_get_current_event_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_current_event_time = Interop.downcallHandle(
                "gtk_event_controller_get_current_event_time",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_name = Interop.downcallHandle(
                "gtk_event_controller_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_propagation_limit = Interop.downcallHandle(
                "gtk_event_controller_get_propagation_limit",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_propagation_phase = Interop.downcallHandle(
                "gtk_event_controller_get_propagation_phase",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_widget = Interop.downcallHandle(
                "gtk_event_controller_get_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_reset = Interop.downcallHandle(
                "gtk_event_controller_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_set_name = Interop.downcallHandle(
                "gtk_event_controller_set_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_set_propagation_limit = Interop.downcallHandle(
                "gtk_event_controller_set_propagation_limit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_event_controller_set_propagation_phase = Interop.downcallHandle(
                "gtk_event_controller_set_propagation_phase",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_event_controller_set_static_name = Interop.downcallHandle(
                "gtk_event_controller_set_static_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_get_type = Interop.downcallHandle(
                "gtk_event_controller_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_event_controller_get_type != null;
    }
}
