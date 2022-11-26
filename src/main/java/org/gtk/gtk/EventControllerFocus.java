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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EventControllerFocus(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EventControllerFocus if its GType is a (or inherits from) "GtkEventControllerFocus".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EventControllerFocus} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEventControllerFocus", a ClassCastException will be thrown.
     */
    public static EventControllerFocus castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), EventControllerFocus.getType())) {
            return new EventControllerFocus(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEventControllerFocus");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns {@code true} if focus is within {@code self} or one of its children.
     * @return {@code true} if focus is within {@code self} or one of its children
     */
    public boolean containsFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_focus_contains_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if focus is within {@code self}, but not one of its children.
     * @return {@code true} if focus is within {@code self}, but not one of its children
     */
    public boolean isFocus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_focus_is_focus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_event_controller_focus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Enter {
        void signalReceived(EventControllerFocus source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerFocus.Callbacks.class, "signalEventControllerFocusEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerFocus.Enter>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Leave {
        void signalReceived(EventControllerFocus source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerFocus.Callbacks.class, "signalEventControllerFocusLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerFocus.Leave>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.EventController.Build {
        
         /**
         * A {@link EventControllerFocus.Build} object constructs a {@link EventControllerFocus} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EventControllerFocus} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventControllerFocus} using {@link EventControllerFocus#castFrom}.
         * @return A new instance of {@code EventControllerFocus} with the properties 
         *         that were set in the Build object.
         */
        public EventControllerFocus construct() {
            return EventControllerFocus.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EventControllerFocus.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setContainsFocus(boolean containsFocus) {
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
        public Build setIsFocus(boolean isFocus) {
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
    
    private static class Callbacks {
        
        public static void signalEventControllerFocusEnter(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EventControllerFocus.Enter) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerFocus(source, Ownership.NONE));
        }
        
        public static void signalEventControllerFocusLeave(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EventControllerFocus.Leave) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerFocus(source, Ownership.NONE));
        }
    }
}
