package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGesturePan} is a {@code GtkGesture} for pan gestures.
 * <p>
 * These are drags that are locked to happen along one axis. The axis
 * that a {@code GtkGesturePan} handles is defined at construct time, and
 * can be changed through {@link GesturePan#setOrientation}.
 * <p>
 * When the gesture starts to be recognized, {@code GtkGesturePan} will
 * attempt to determine as early as possible whether the sequence
 * is moving in the expected direction, and denying the sequence if
 * this does not happen.
 * <p>
 * Once a panning gesture along the expected axis is recognized,
 * the {@code Gtk.GesturePan::pan} signal will be emitted as input
 * events are received, containing the offset in the given axis.
 */
public class GesturePan extends GestureDrag {

    public GesturePan(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GesturePan */
    public static GesturePan castFrom(org.gtk.gobject.Object gobject) {
        return new GesturePan(gobject.getReference());
    }
    
    private static Reference constructNew(Orientation orientation) {
        Reference RESULT = References.get(gtk_h.gtk_gesture_pan_new(orientation.getValue()), true);
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes pan gestures.
     */
    public GesturePan(Orientation orientation) {
        super(constructNew(orientation));
    }
    
    /**
     * Returns the orientation of the pan gestures that this {@code gesture} expects.
     */
    public Orientation getOrientation() {
        var RESULT = gtk_h.gtk_gesture_pan_get_orientation(handle());
        return Orientation.fromValue(RESULT);
    }
    
    /**
     * Sets the orientation to be expected on pan gestures.
     */
    public void setOrientation(Orientation orientation) {
        gtk_h.gtk_gesture_pan_set_orientation(handle(), orientation.getValue());
    }
    
    @FunctionalInterface
    public interface PanHandler {
        void signalReceived(GesturePan source, PanDirection direction, double offset);
    }
    
    /**
     * Emitted once a panning gesture along the expected axis is detected.
     */
    public SignalHandle onPan(PanHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGesturePanPan", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("pan").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
