package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkEventControllerFocus` is an event controller to keep track of
 * keyboard focus.
 * 
 * The event controller offers [signal@Gtk.EventControllerFocus::enter]
 * and [signal@Gtk.EventControllerFocus::leave] signals, as well as
 * [property@Gtk.EventControllerFocus:is-focus] and
 * [property@Gtk.EventControllerFocus:contains-focus] properties
 * which are updated to reflect focus changes inside the widget hierarchy
 * that is rooted at the controllers widget.
 */
public class EventControllerFocus extends EventController {

    public EventControllerFocus(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to EventControllerFocus */
    public static EventControllerFocus castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerFocus(gobject.getProxy());
    }
    
    /**
     * Creates a new event controller that will handle focus events.
     */
    public EventControllerFocus() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_event_controller_focus_new(), true));
    }
    
    /**
     * Returns %TRUE if focus is within @self or one of its children.
     */
    public boolean containsFocus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_event_controller_focus_contains_focus(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if focus is within @self, but not one of its children.
     */
    public boolean isFocus() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_event_controller_focus_is_focus(HANDLE());
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
     * [property@Gtk.EventControllerFocus:is-focus]
     * property for changes.
     */
    public void onEnter(EnterHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerFocusEnter", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("enter").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * can monitor the [property@Gtk.EventControllerFocus:is-focus]
     * property for changes.
     */
    public void onLeave(LeaveHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerFocusLeave", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("leave").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
