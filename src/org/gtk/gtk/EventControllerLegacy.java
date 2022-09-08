package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkEventControllerLegacy` is an event controller that provides raw
 * access to the event stream.
 * 
 * It should only be used as a last resort if none of the other event
 * controllers or gestures do the job.
 */
public class EventControllerLegacy extends EventController {

    public EventControllerLegacy(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventControllerLegacy */
    public static EventControllerLegacy castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerLegacy(gobject.getReference());
    }
    
    /**
     * Creates a new legacy event controller.
     */
    public EventControllerLegacy() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_event_controller_legacy_new(), true));
    }
    
    @FunctionalInterface
    public interface EventHandler {
        boolean signalReceived(EventControllerLegacy source, org.gtk.gdk.Event event);
    }
    
    /**
     * Emitted for each GDK event delivered to @controller.
     */
    public void onEvent(EventHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerLegacyEvent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("event").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
