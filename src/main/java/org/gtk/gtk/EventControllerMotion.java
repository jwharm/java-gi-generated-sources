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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EventControllerMotion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EventControllerMotion if its GType is a (or inherits from) "GtkEventControllerMotion".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EventControllerMotion} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEventControllerMotion", a ClassCastException will be thrown.
     */
    public static EventControllerMotion castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkEventControllerMotion"))) {
            return new EventControllerMotion(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEventControllerMotion");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns if a pointer is within {@code self} or one of its children.
     * @return {@code true} if a pointer is within {@code self} or one of its children
     */
    public boolean containsPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_motion_contains_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns if a pointer is within {@code self}, but not one of its children.
     * @return {@code true} if a pointer is within {@code self} but not one of its children
     */
    public boolean isPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_motion_is_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface Enter {
        void signalReceived(EventControllerMotion source, double x, double y);
    }
    
    /**
     * Signals that the pointer has entered the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerMotion.Enter> onEnter(EventControllerMotion.Enter handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.Callbacks.class, "signalEventControllerMotionEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerMotion.Enter>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Leave {
        void signalReceived(EventControllerMotion source);
    }
    
    /**
     * Signals that the pointer has left the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerMotion.Leave> onLeave(EventControllerMotion.Leave handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.Callbacks.class, "signalEventControllerMotionLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerMotion.Leave>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        void signalReceived(EventControllerMotion source, double x, double y);
    }
    
    /**
     * Emitted when the pointer moves inside the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerMotion.Motion> onMotion(EventControllerMotion.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.Callbacks.class, "signalEventControllerMotionMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerMotion.Motion>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_motion_new = Interop.downcallHandle(
            "gtk_event_controller_motion_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_motion_contains_pointer = Interop.downcallHandle(
            "gtk_event_controller_motion_contains_pointer",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_motion_is_pointer = Interop.downcallHandle(
            "gtk_event_controller_motion_is_pointer",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalEventControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EventControllerMotion.Enter) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerMotion(source, Ownership.UNKNOWN), x, y);
        }
        
        public static void signalEventControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EventControllerMotion.Leave) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerMotion(source, Ownership.UNKNOWN));
        }
        
        public static void signalEventControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EventControllerMotion.Motion) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerMotion(source, Ownership.UNKNOWN), x, y);
        }
    }
}
