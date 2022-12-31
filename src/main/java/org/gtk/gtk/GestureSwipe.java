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
    protected GestureSwipe(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureSwipe> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GestureSwipe(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        MemorySegment velocityXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        void run(double velocityX, double velocityY);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureSwipe, double velocityX, double velocityY) {
            run(velocityX, velocityY);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Swipe.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
                handle(), Interop.allocateNativeString("swipe"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GestureSwipe.Builder} object constructs a {@link GestureSwipe} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GestureSwipe.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.GestureSingle.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GestureSwipe} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureSwipe}.
         * @return A new instance of {@code GestureSwipe} with the properties 
         *         that were set in the Builder object.
         */
        public GestureSwipe build() {
            return (GestureSwipe) org.gtk.gobject.GObject.newWithProperties(
                GestureSwipe.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
}
