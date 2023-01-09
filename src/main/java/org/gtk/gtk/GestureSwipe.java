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
     */
    protected GestureSwipe(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureSwipe> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GestureSwipe(input);
    
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
        super(constructNew());
        this.takeOwnership();
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment velocityXPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment velocityYPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
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
    
    /**
     * Functional interface declaration of the {@code Swipe} callback.
     */
    @FunctionalInterface
    public interface Swipe {
    
        /**
         * Emitted when the recognized gesture is finished.
         * <p>
         * Velocity and direction are a product of previously recorded events.
         */
        void run(double velocityX, double velocityY);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureSwipe, double velocityX, double velocityY) {
            run(velocityX, velocityY);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Swipe.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("swipe", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
        
        /**
         * Default constructor for a {@code Builder} object.
         */
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_gesture_swipe_get_type != null;
    }
}
