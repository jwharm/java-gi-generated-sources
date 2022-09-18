package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkGestureSwipe</code> is a <code>GtkGesture</code> for swipe gestures.
 * 
 * After a press/move/.../move/release sequence happens, the
 * {@link [signal@Gtk.GestureSwipe::swipe] (ref=signal)} signal will be emitted,
 * providing the velocity and directionality of the sequence
 * at the time it was lifted.
 * 
 * If the velocity is desired in intermediate points,
 * {@link org.gtk.gtk.GestureSwipe<code>#getVelocity</code>  can be called in a
 * {@link [signal@Gtk.Gesture::update] (ref=signal)} handler.
 * 
 * All velocities are reported in pixels/sec units.
 */
public class GestureSwipe extends GestureSingle {

    public GestureSwipe(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GestureSwipe */
    public static GestureSwipe castFrom(org.gtk.gobject.Object gobject) {
        return new GestureSwipe(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_gesture_swipe_new(), true);
        return RESULT;
    }
    
    /**
     * Returns a newly created <code>GtkGesture</code> that recognizes swipes.
     */
    public GestureSwipe() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface SwipeHandler {
        void signalReceived(GestureSwipe source, double velocityX, double velocityY);
    }
    
    /**
     * Emitted when the recognized gesture is finished.
     * 
     * Velocity and direction are a product of previously recorded events.
     */
    public SignalHandle onSwipe(SwipeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureSwipeSwipe", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("swipe").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
