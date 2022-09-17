package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkEventControllerFocus</code> is an event controller to keep track of
 * keyboard focus.
 * 
 * The event controller offers {@link [signal@Gtk.EventControllerFocus::enter] (ref=signal)}
 * and {@link [signal@Gtk.EventControllerFocus::leave] (ref=signal)} signals, as well as
 * {@link [property@Gtk.EventControllerFocus:is-focus] (ref=property)} and
 * {@link [property@Gtk.EventControllerFocus:contains-focus] (ref=property)} properties
 * which are updated to reflect focus changes inside the widget hierarchy
 * that is rooted at the controllers widget.
 */
public class EventControllerFocus extends EventController {

    public EventControllerFocus(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventControllerFocus */
    public static EventControllerFocus castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerFocus(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_event_controller_focus_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle focus events.
     */
    public EventControllerFocus() {
        super(constructNew());
    }
    
    /**
     * Returns <code>true</code> if focus is within @self or one of its children.
     */
    public boolean containsFocus() {
        var RESULT = gtk_h.gtk_event_controller_focus_contains_focus(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if focus is within @self, but not one of its children.
     */
    public boolean isFocus() {
        var RESULT = gtk_h.gtk_event_controller_focus_is_focus(handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface EnterHandler {
        void signalReceived(EventControllerFocus source);
    }
    
    /**
     * Emitted whenever the focus enters into the widget or one
     * of its descendents.
     * 
     * Note that this means you may not get an ::enter signal
     * even though the widget becomes the focus location, in
     * certain cases (such as when the focus moves from a descendent
     * of the widget to the widget itself). If you are interested
     * in these cases, you can monitor the
     * {@link [property@Gtk.EventControllerFocus:is-focus] (ref=property)}
     * property for changes.
     */
    public SignalHandle onEnter(EnterHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerFocusEnter", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("enter").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LeaveHandler {
        void signalReceived(EventControllerFocus source);
    }
    
    /**
     * Emitted whenever the focus leaves the widget hierarchy
     * that is rooted at the widget that the controller is attached to.
     * 
     * Note that this means you may not get a ::leave signal
     * even though the focus moves away from the widget, in
     * certain cases (such as when the focus moves from the widget
     * to a descendent). If you are interested in these cases, you
     * can monitor the {@link [property@Gtk.EventControllerFocus:is-focus] (ref=property)}
     * property for changes.
     */
    public SignalHandle onLeave(LeaveHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerFocusLeave", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("leave").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
