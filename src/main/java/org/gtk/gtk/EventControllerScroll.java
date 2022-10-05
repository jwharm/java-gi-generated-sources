package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkEventControllerScroll} is an event controller that handles scroll
 * events.
 * <p>
 * It is capable of handling both discrete and continuous scroll
 * events from mice or touchpads, abstracting them both with the
 * {@code Gtk.EventControllerScroll::scroll} signal. Deltas in
 * the discrete case are multiples of 1.
 * <p>
 * In the case of continuous scroll events, {@code GtkEventControllerScroll}
 * encloses all {@code Gtk.EventControllerScroll::scroll} emissions
 * between two {@code Gtk.EventControllerScroll::scroll-begin} and
 * {@code Gtk.EventControllerScroll::scroll-end} signals.
 * <p>
 * The behavior of the event controller can be modified by the flags
 * given at creation time, or modified at a later point through
 * {@link EventControllerScroll#setFlags} (e.g. because the scrolling
 * conditions of the widget changed).
 * <p>
 * The controller can be set up to emit motion for either/both vertical
 * and horizontal scroll events through {@link EventControllerScrollFlags#VERTICAL},
 * {@link EventControllerScrollFlags#HORIZONTAL} and {@link EventControllerScrollFlags#BOTH_AXES}.
 * If any axis is disabled, the respective {@code Gtk.EventControllerScroll::scroll}
 * delta will be 0. Vertical scroll events will be translated to horizontal
 * motion for the devices incapable of horizontal scrolling.
 * <p>
 * The event controller can also be forced to emit discrete events on all
 * devices through {@link EventControllerScrollFlags#DISCRETE}. This can be used
 * to implement discrete actions triggered through scroll events (e.g.
 * switching across combobox options).
 * <p>
 * The {@link EventControllerScrollFlags#KINETIC} flag toggles the emission of the
 * {@code Gtk.EventControllerScroll::decelerate} signal, emitted at the end
 * of scrolling with two X/Y velocity arguments that are consistent with the
 * motion that was received.
 */
public class EventControllerScroll extends EventController {

    public EventControllerScroll(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EventControllerScroll */
    public static EventControllerScroll castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerScroll(gobject.refcounted());
    }
    
    static final MethodHandle gtk_event_controller_scroll_new = Interop.downcallHandle(
        "gtk_event_controller_scroll_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(EventControllerScrollFlags flags) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_event_controller_scroll_new.invokeExact(flags.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new event controller that will handle scroll events.
     */
    public EventControllerScroll(EventControllerScrollFlags flags) {
        super(constructNew(flags));
    }
    
    static final MethodHandle gtk_event_controller_scroll_get_flags = Interop.downcallHandle(
        "gtk_event_controller_scroll_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the flags conditioning the scroll controller behavior.
     */
    public EventControllerScrollFlags getFlags() {
        try {
            var RESULT = (int) gtk_event_controller_scroll_get_flags.invokeExact(handle());
            return new EventControllerScrollFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_scroll_set_flags = Interop.downcallHandle(
        "gtk_event_controller_scroll_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the flags conditioning scroll controller behavior.
     */
    public void setFlags(EventControllerScrollFlags flags) {
        try {
            gtk_event_controller_scroll_set_flags.invokeExact(handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DecelerateHandler {
        void signalReceived(EventControllerScroll source, double velX, double velY);
    }
    
    /**
     * Emitted after scroll is finished if the
     * {@link EventControllerScrollFlags#KINETIC} flag is set.
     * <p>
     * {@code vel_x} and {@code vel_y} express the initial velocity that was
     * imprinted by the scroll events. {@code vel_x} and {@code vel_y} are expressed in
     * pixels/ms.
     */
    public SignalHandle onDecelerate(DecelerateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("decelerate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerScroll.Callbacks.class, "signalEventControllerScrollDecelerate",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ScrollHandler {
        boolean signalReceived(EventControllerScroll source, double dx, double dy);
    }
    
    /**
     * Signals that the widget should scroll by the
     * amount specified by {@code dx} and {@code dy}.
     */
    public SignalHandle onScroll(ScrollHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("scroll").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerScroll.Callbacks.class, "signalEventControllerScrollScroll",
                        MethodType.methodType(boolean.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ScrollBeginHandler {
        void signalReceived(EventControllerScroll source);
    }
    
    /**
     * Signals that a new scrolling operation has begun.
     * <p>
     * It will only be emitted on devices capable of it.
     */
    public SignalHandle onScrollBegin(ScrollBeginHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("scroll-begin").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerScroll.Callbacks.class, "signalEventControllerScrollScrollBegin",
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
    public interface ScrollEndHandler {
        void signalReceived(EventControllerScroll source);
    }
    
    /**
     * Signals that a scrolling operation has finished.
     * <p>
     * It will only be emitted on devices capable of it.
     */
    public SignalHandle onScrollEnd(ScrollEndHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("scroll-end").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerScroll.Callbacks.class, "signalEventControllerScrollScrollEnd",
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
    
        public static void signalEventControllerScrollDecelerate(MemoryAddress source, double velX, double velY, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerScroll.DecelerateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerScroll(Refcounted.get(source)), velX, velY);
        }
        
        public static boolean signalEventControllerScrollScroll(MemoryAddress source, double dx, double dy, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerScroll.ScrollHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new EventControllerScroll(Refcounted.get(source)), dx, dy);
        }
        
        public static void signalEventControllerScrollScrollBegin(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerScroll.ScrollBeginHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerScroll(Refcounted.get(source)));
        }
        
        public static void signalEventControllerScrollScrollEnd(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerScroll.ScrollEndHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerScroll(Refcounted.get(source)));
        }
        
    }
}
