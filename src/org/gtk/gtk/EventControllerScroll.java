package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkEventControllerScroll</code> is an event controller that handles scroll
 * events.
 * <p>
 * It is capable of handling both discrete and continuous scroll
 * events from mice or touchpads, abstracting them both with the
 * {@link [signal@Gtk.EventControllerScroll::scroll] (ref=signal)} signal. Deltas in
 * the discrete case are multiples of 1.
 * <p>
 * In the case of continuous scroll events, <code>GtkEventControllerScroll</code>
 * encloses all {@link [signal@Gtk.EventControllerScroll::scroll] (ref=signal)} emissions
 * between two {@link [signal@Gtk.EventControllerScroll::scroll-begin] (ref=signal)} and
 * {@link [signal@Gtk.EventControllerScroll::scroll-end] (ref=signal)} signals.
 * 
 * The behavior of the event controller can be modified by the flags
 * given at creation time, or modified at a later point through
 * {@link org.gtk.gtk.EventControllerScroll<code>#setFlags</code>  (e.g. because the scrolling
 * conditions of the widget changed).
 * 
 * The controller can be set up to emit motion for either/both vertical
 * and horizontal scroll events through {@link org.gtk.gtk.EventControllerScrollFlags<code>#VERTICAL</code>  
 * {@link org.gtk.gtk.EventControllerScrollFlags<code>#HORIZONTAL</code>  and {@link org.gtk.gtk.EventControllerScrollFlags<code>#BOTH_AXES</code>  
 * If any axis is disabled, the respective {@link [signal@Gtk.EventControllerScroll::scroll] (ref=signal)}
 * delta will be 0. Vertical scroll events will be translated to horizontal
 * motion for the devices incapable of horizontal scrolling.
 * 
 * The event controller can also be forced to emit discrete events on all
 * devices through {@link org.gtk.gtk.EventControllerScrollFlags<code>#DISCRETE</code>   This can be used
 * to implement discrete actions triggered through scroll events (e.g.
 * switching across combobox options).
 * 
 * The {@link org.gtk.gtk.EventControllerScrollFlags<code>#KINETIC</code>  flag toggles the emission of the
 * {@link [signal@Gtk.EventControllerScroll::decelerate] (ref=signal)} signal, emitted at the end
 * of scrolling with two X/Y velocity arguments that are consistent with the
 * motion that was received.
 */
public class EventControllerScroll extends EventController {

    public EventControllerScroll(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventControllerScroll */
    public static EventControllerScroll castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerScroll(gobject.getReference());
    }
    
    private static Reference constructNew(int flags) {
        Reference RESULT = References.get(gtk_h.gtk_event_controller_scroll_new(flags), true);
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle scroll events.
     */
    public EventControllerScroll(int flags) {
        super(constructNew(flags));
    }
    
    /**
     * Gets the flags conditioning the scroll controller behavior.
     */
    public int getFlags() {
        var RESULT = gtk_h.gtk_event_controller_scroll_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Sets the flags conditioning scroll controller behavior.
     */
    public void setFlags(int flags) {
        gtk_h.gtk_event_controller_scroll_set_flags(handle(), flags);
    }
    
    @FunctionalInterface
    public interface DecelerateHandler {
        void signalReceived(EventControllerScroll source, double velX, double velY);
    }
    
    /**
     * Emitted after scroll is finished if the
     * {@link org.gtk.gtk.EventControllerScrollFlags<code>#KINETIC</code>  flag is set.
     * 
     * @vel_x and @vel_y express the initial velocity that was
     * imprinted by the scroll events. @vel_x and @vel_y are expressed in
     * pixels/ms.
     */
    public SignalHandle onDecelerate(DecelerateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerScrollDecelerate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("decelerate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ScrollHandler {
        boolean signalReceived(EventControllerScroll source, double dx, double dy);
    }
    
    /**
     * Signals that the widget should scroll by the
     * amount specified by @dx and @dy.
     */
    public SignalHandle onScroll(ScrollHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerScrollScroll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("scroll").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ScrollBeginHandler {
        void signalReceived(EventControllerScroll source);
    }
    
    /**
     * Signals that a new scrolling operation has begun.
     * 
     * It will only be emitted on devices capable of it.
     */
    public SignalHandle onScrollBegin(ScrollBeginHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerScrollScrollBegin", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("scroll-begin").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ScrollEndHandler {
        void signalReceived(EventControllerScroll source);
    }
    
    /**
     * Signals that a scrolling operation has finished.
     * 
     * It will only be emitted on devices capable of it.
     */
    public SignalHandle onScrollEnd(ScrollEndHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerScrollScrollEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("scroll-end").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
