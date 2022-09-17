package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkEventControllerMotion</code> is an event controller tracking the pointer
 * position.
 * 
 * The event controller offers {@link [signal@Gtk.EventControllerMotion::enter] (ref=signal)}
 * and {@link [signal@Gtk.EventControllerMotion::leave] (ref=signal)} signals, as well as
 * {@link [property@Gtk.EventControllerMotion:is-pointer] (ref=property)} and
 * {@link [property@Gtk.EventControllerMotion:contains-pointer] (ref=property)} properties
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
     * Returns if a pointer is within @self or one of its children.
     */
    public boolean containsPointer() {
        var RESULT = gtk_h.gtk_event_controller_motion_contains_pointer(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns if a pointer is within @self, but not one of its children.
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerMotionEnter", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("enter").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerMotionLeave", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("leave").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerMotionMotion", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("motion").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
