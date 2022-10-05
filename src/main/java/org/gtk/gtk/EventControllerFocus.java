package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class EventControllerFocus extends EventController {

    public EventControllerFocus(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EventControllerFocus */
    public static EventControllerFocus castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerFocus(gobject.refcounted());
    }
    
    static final MethodHandle gtk_event_controller_focus_new = Interop.downcallHandle(
        "gtk_event_controller_focus_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_event_controller_focus_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new event controller that will handle focus events.
     */
    public EventControllerFocus() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_event_controller_focus_contains_focus = Interop.downcallHandle(
        "gtk_event_controller_focus_contains_focus",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if focus is within {@code self} or one of its children.
     */
    public boolean containsFocus() {
        try {
            var RESULT = (int) gtk_event_controller_focus_contains_focus.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_focus_is_focus = Interop.downcallHandle(
        "gtk_event_controller_focus_is_focus",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if focus is within {@code self}, but not one of its children.
     */
    public boolean isFocus() {
        try {
            var RESULT = (int) gtk_event_controller_focus_is_focus.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EnterHandler {
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
     */
    public SignalHandle onEnter(EnterHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerFocus.Callbacks.class, "signalEventControllerFocusEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LeaveHandler {
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
     */
    public SignalHandle onLeave(LeaveHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerFocus.Callbacks.class, "signalEventControllerFocusLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEventControllerFocusEnter(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerFocus.EnterHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerFocus(Refcounted.get(source)));
        }
        
        public static void signalEventControllerFocusLeave(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerFocus.LeaveHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerFocus(Refcounted.get(source)));
        }
        
    }
}
