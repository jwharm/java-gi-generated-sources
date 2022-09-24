package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public EventControllerMotion(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventControllerMotion */
    public static EventControllerMotion castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerMotion(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_event_controller_motion_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle motion events.
     */
    public EventControllerMotion() {
        super(constructNew());
    }
    
    /**
     * Returns if a pointer is within {@code self} or one of its children.
     */
    public boolean containsPointer() {
        var RESULT = gtk_h.gtk_event_controller_motion_contains_pointer(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns if a pointer is within {@code self}, but not one of its children.
     */
    public boolean isPointer() {
        var RESULT = gtk_h.gtk_event_controller_motion_is_pointer(handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface EnterHandler {
        void signalReceived(EventControllerMotion source, double x, double y);
    }
    
    /**
     * Signals that the pointer has entered the widget.
     */
    public SignalHandle onEnter(EnterHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("enter").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.class, "__signalEventControllerMotionEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalEventControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.EnterHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(References.get(source)), x, y);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("leave").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.class, "__signalEventControllerMotionLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalEventControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.LeaveHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(References.get(source)));
    }
    
    @FunctionalInterface
    public interface MotionHandler {
        void signalReceived(EventControllerMotion source, double x, double y);
    }
    
    /**
     * Emitted when the pointer moves inside the widget.
     */
    public SignalHandle onMotion(MotionHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("motion").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerMotion.class, "__signalEventControllerMotionMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalEventControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (EventControllerMotion.MotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new EventControllerMotion(References.get(source)), x, y);
    }
    
}
