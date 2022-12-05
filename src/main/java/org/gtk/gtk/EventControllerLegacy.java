package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEventControllerLegacy} is an event controller that provides raw
 * access to the event stream.
 * <p>
 * It should only be used as a last resort if none of the other event
 * controllers or gestures do the job.
 */
public class EventControllerLegacy extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerLegacy";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EventControllerLegacy proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EventControllerLegacy(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EventControllerLegacy if its GType is a (or inherits from) "GtkEventControllerLegacy".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EventControllerLegacy} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEventControllerLegacy", a ClassCastException will be thrown.
     */
    public static EventControllerLegacy castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EventControllerLegacy.getType())) {
            return new EventControllerLegacy(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEventControllerLegacy");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_legacy_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new legacy event controller.
     */
    public EventControllerLegacy() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_event_controller_legacy_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Event {
        boolean signalReceived(EventControllerLegacy sourceEventControllerLegacy, @NotNull org.gtk.gdk.Event event);
    }
    
    /**
     * Emitted for each GDK event delivered to {@code controller}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerLegacy.Event> onEvent(EventControllerLegacy.Event handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerLegacy.Callbacks.class, "signalEventControllerLegacyEvent",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerLegacy.Event>(handle(), RESULT);
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
         * A {@link EventControllerLegacy.Build} object constructs a {@link EventControllerLegacy} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EventControllerLegacy} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventControllerLegacy} using {@link EventControllerLegacy#castFrom}.
         * @return A new instance of {@code EventControllerLegacy} with the properties 
         *         that were set in the Build object.
         */
        public EventControllerLegacy construct() {
            return EventControllerLegacy.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EventControllerLegacy.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_legacy_new = Interop.downcallHandle(
            "gtk_event_controller_legacy_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_legacy_get_type = Interop.downcallHandle(
            "gtk_event_controller_legacy_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalEventControllerLegacyEvent(MemoryAddress sourceEventControllerLegacy, MemoryAddress event, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EventControllerLegacy.Event) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EventControllerLegacy(sourceEventControllerLegacy, Ownership.NONE), new org.gtk.gdk.Event(event, Ownership.NONE));
        }
    }
}
