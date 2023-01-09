package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureRotate} is a {@code GtkGesture} for 2-finger rotations.
 * <p>
 * Whenever the angle between both handled sequences changes, the
 * {@code Gtk.GestureRotate::angle-changed} signal is emitted.
 */
public class GestureRotate extends org.gtk.gtk.Gesture {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureRotate";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureRotate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GestureRotate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureRotate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GestureRotate(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_rotate_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes 2-touch
     * rotation gestures.
     */
    public GestureRotate() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Gets the angle delta in radians.
     * <p>
     * If {@code gesture} is active, this function returns the angle difference
     * in radians since the gesture was first recognized. If {@code gesture} is
     * not active, 0 is returned.
     * @return the angle delta in radians
     */
    public double getAngleDelta() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_gesture_rotate_get_angle_delta.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_rotate_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AngleChanged} callback.
     */
    @FunctionalInterface
    public interface AngleChanged {
    
        /**
         * Emitted when the angle between both tracked points changes.
         */
        void run(double angle, double angleDelta);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureRotate, double angle, double angleDelta) {
            run(angle, angleDelta);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AngleChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the angle between both tracked points changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureRotate.AngleChanged> onAngleChanged(GestureRotate.AngleChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("angle-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GestureRotate.Builder} object constructs a {@link GestureRotate} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GestureRotate.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Gesture.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GestureRotate} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureRotate}.
         * @return A new instance of {@code GestureRotate} with the properties 
         *         that were set in the Builder object.
         */
        public GestureRotate build() {
            return (GestureRotate) org.gtk.gobject.GObject.newWithProperties(
                GestureRotate.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_rotate_new = Interop.downcallHandle(
                "gtk_gesture_rotate_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_rotate_get_angle_delta = Interop.downcallHandle(
                "gtk_gesture_rotate_get_angle_delta",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_gesture_rotate_get_type = Interop.downcallHandle(
                "gtk_gesture_rotate_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_gesture_rotate_get_type != null;
    }
}
