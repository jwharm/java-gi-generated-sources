package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureSwipe} is a {@code GtkGesture} for swipe gestures.
 * <p>
 * After a press/move/.../move/release sequence happens, the
 * {@code Gtk.GestureSwipe::swipe} signal will be emitted,
 * providing the velocity and directionality of the sequence
 * at the time it was lifted.
 * <p>
 * If the velocity is desired in intermediate points,
 * {@link GestureSwipe#getVelocity} can be called in a
 * {@code Gtk.Gesture::update} handler.
 * <p>
 * All velocities are reported in pixels/sec units.
 */
public class GestureSwipe extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureSwipe";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureSwipe proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GestureSwipe(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GestureSwipe if its GType is a (or inherits from) "GtkGestureSwipe".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GestureSwipe} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureSwipe", a ClassCastException will be thrown.
     */
    public static GestureSwipe castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GestureSwipe.getType())) {
            return new GestureSwipe(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureSwipe");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_swipe_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes swipes.
     */
    public GestureSwipe() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the current velocity.
     * <p>
     * If the gesture is recognized, this function returns {@code true} and fills
     * in {@code velocity_x} and {@code velocity_y} with the recorded velocity, as per the
     * last events processed.
     * @param velocityX return value for the velocity in the X axis, in pixels/sec
     * @param velocityY return value for the velocity in the Y axis, in pixels/sec
     * @return whether velocity could be calculated
     */
    public boolean getVelocity(Out<Double> velocityX, Out<Double> velocityY) {
        java.util.Objects.requireNonNull(velocityX, "Parameter 'velocityX' must not be null");
        MemorySegment velocityXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        java.util.Objects.requireNonNull(velocityY, "Parameter 'velocityY' must not be null");
        MemorySegment velocityYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_swipe_get_velocity.invokeExact(
                    handle(),
                    (Addressable) velocityXPOINTER.address(),
                    (Addressable) velocityYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        velocityX.set(velocityXPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        velocityY.set(velocityYPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_swipe_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Swipe {
        void signalReceived(GestureSwipe sourceGestureSwipe, double velocityX, double velocityY);
    }
    
    /**
     * Emitted when the recognized gesture is finished.
     * <p>
     * Velocity and direction are a product of previously recorded events.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureSwipe.Swipe> onSwipe(GestureSwipe.Swipe handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("swipe"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureSwipe.Callbacks.class, "signalGestureSwipeSwipe",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureSwipe.Swipe>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.GestureSingle.Build {
        
         /**
         * A {@link GestureSwipe.Build} object constructs a {@link GestureSwipe} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GestureSwipe} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureSwipe} using {@link GestureSwipe#castFrom}.
         * @return A new instance of {@code GestureSwipe} with the properties 
         *         that were set in the Build object.
         */
        public GestureSwipe construct() {
            return GestureSwipe.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GestureSwipe.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_swipe_new = Interop.downcallHandle(
            "gtk_gesture_swipe_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_swipe_get_velocity = Interop.downcallHandle(
            "gtk_gesture_swipe_get_velocity",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_swipe_get_type = Interop.downcallHandle(
            "gtk_gesture_swipe_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGestureSwipeSwipe(MemoryAddress sourceGestureSwipe, double velocityX, double velocityY, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureSwipe.Swipe) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureSwipe(sourceGestureSwipe, Ownership.NONE), velocityX, velocityY);
        }
    }
}
