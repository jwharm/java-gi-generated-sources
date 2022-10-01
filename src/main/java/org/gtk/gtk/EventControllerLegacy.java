package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkEventControllerLegacy} is an event controller that provides raw
 * access to the event stream.
 * <p>
 * It should only be used as a last resort if none of the other event
 * controllers or gestures do the job.
 */
public class EventControllerLegacy extends EventController {

    public EventControllerLegacy(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EventControllerLegacy */
    public static EventControllerLegacy castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerLegacy(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_event_controller_legacy_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new legacy event controller.
     */
    public EventControllerLegacy() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface EventHandler {
        boolean signalReceived(EventControllerLegacy source, org.gtk.gdk.Event event);
    }
    
    /**
     * Emitted for each GDK event delivered to {@code controller}.
     */
    public SignalHandle onEvent(EventHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("event").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerLegacy.Callbacks.class, "signalEventControllerLegacyEvent",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalEventControllerLegacyEvent(MemoryAddress source, MemoryAddress event, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerLegacy.EventHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new EventControllerLegacy(Refcounted.get(source)), new org.gtk.gdk.Event(Refcounted.get(event, false)));
        }
        
    }
}
