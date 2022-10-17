package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_event_controller_legacy_new = Interop.downcallHandle(
        "gtk_event_controller_legacy_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_event_controller_legacy_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new legacy event controller.
     */
    public EventControllerLegacy() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface EventHandler {
        boolean signalReceived(EventControllerLegacy source, @NotNull org.gtk.gdk.Event event);
    }
    
    /**
     * Emitted for each GDK event delivered to {@code controller}.
     */
    public SignalHandle onEvent(EventHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("event"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerLegacy.Callbacks.class, "signalEventControllerLegacyEvent",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
