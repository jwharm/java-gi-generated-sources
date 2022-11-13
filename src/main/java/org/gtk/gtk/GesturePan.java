package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class GesturePan extends org.gtk.gtk.GestureDrag {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGesturePan";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GesturePan proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GesturePan(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GesturePan if its GType is a (or inherits from) "GtkGesturePan".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GesturePan} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGesturePan", a ClassCastException will be thrown.
     */
    public static GesturePan castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkGesturePan"))) {
            return new GesturePan(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGesturePan");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_pan_new.invokeExact(
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes pan gestures.
     * @param orientation expected orientation
     */
    public GesturePan(@NotNull org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation), Ownership.FULL);
    }
    
    /**
     * Returns the orientation of the pan gestures that this {@code gesture} expects.
     * @return the expected orientation for pan gestures
     */
    public @NotNull org.gtk.gtk.Orientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_pan_get_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Orientation(RESULT);
    }
    
    /**
     * Sets the orientation to be expected on pan gestures.
     * @param orientation expected orientation
     */
    public void setOrientation(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        try {
            DowncallHandles.gtk_gesture_pan_set_orientation.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Pan {
        void signalReceived(GesturePan source, @NotNull org.gtk.gtk.PanDirection direction, double offset);
    }
    
    /**
     * Emitted once a panning gesture along the expected axis is detected.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GesturePan.Pan> onPan(GesturePan.Pan handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pan"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GesturePan.Callbacks.class, "signalGesturePanPan",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GesturePan.Pan>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_pan_new = Interop.downcallHandle(
            "gtk_gesture_pan_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_gesture_pan_get_orientation = Interop.downcallHandle(
            "gtk_gesture_pan_get_orientation",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_pan_set_orientation = Interop.downcallHandle(
            "gtk_gesture_pan_set_orientation",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGesturePanPan(MemoryAddress source, int direction, double offset, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GesturePan.Pan) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GesturePan(source, Ownership.UNKNOWN), new org.gtk.gtk.PanDirection(direction), offset);
        }
    }
}
