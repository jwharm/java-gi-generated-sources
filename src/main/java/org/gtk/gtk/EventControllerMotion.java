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
public class EventControllerMotion extends EventController {

    public EventControllerMotion(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EventControllerMotion */
    public static EventControllerMotion castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerMotion(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_event_controller_motion_new = Interop.downcallHandle(
        "gtk_event_controller_motion_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_event_controller_motion_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new event controller that will handle motion events.
     */
    public EventControllerMotion() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_event_controller_motion_contains_pointer = Interop.downcallHandle(
        "gtk_event_controller_motion_contains_pointer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns if a pointer is within {@code self} or one of its children.
     */
    public boolean containsPointer() {
        int RESULT;
        try {
            RESULT = (int) gtk_event_controller_motion_contains_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_event_controller_motion_is_pointer = Interop.downcallHandle(
        "gtk_event_controller_motion_is_pointer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns if a pointer is within {@code self}, but not one of its children.
     */
    public boolean isPointer() {
        int RESULT;
        try {
            RESULT = (int) gtk_event_controller_motion_is_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface EnterHandler {
        void signalReceived(EventControllerMotion source, @NotNull double x, @NotNull double y);
    }
    
    /**
     * Signals that the pointer has entered the widget.
     */
    public SignalHandle onEnter(EnterHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.Callbacks.class, "signalEventControllerMotionEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LeaveHandler {
        void signalReceived(EventControllerMotion source);
    }
    
    /**
     * Signals that the pointer has left the widget.
     */
    public SignalHandle onLeave(LeaveHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.Callbacks.class, "signalEventControllerMotionLeave",
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
    
    @FunctionalInterface
    public interface MotionHandler {
        void signalReceived(EventControllerMotion source, @NotNull double x, @NotNull double y);
    }
    
    /**
     * Emitted when the pointer moves inside the widget.
     */
    public SignalHandle onMotion(MotionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.Callbacks.class, "signalEventControllerMotionMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEventControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerMotion.EnterHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerMotion(Refcounted.get(source)), x, y);
        }
        
        public static void signalEventControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerMotion.LeaveHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerMotion(Refcounted.get(source)));
        }
        
        public static void signalEventControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerMotion.MotionHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerMotion(Refcounted.get(source)), x, y);
        }
        
    }
}
