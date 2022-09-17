package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkEventControllerLegacy</code> is an event controller that provides raw
 * access to the event stream.
 * 
 * It should only be used as a last resort if none of the other event
 * controllers or gestures do the job.
 */
public class EventControllerLegacy extends EventController {

    public EventControllerLegacy(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventControllerLegacy */
    public static EventControllerLegacy castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerLegacy(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_event_controller_legacy_new(), true);
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
     * Emitted for each GDK event delivered to @controller.
     */
    public SignalHandle onEvent(EventHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerLegacyEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("event").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
