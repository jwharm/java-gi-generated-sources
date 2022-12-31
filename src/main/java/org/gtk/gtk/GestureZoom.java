package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureZoom} is a {@code GtkGesture} for 2-finger pinch/zoom gestures.
 * <p>
 * Whenever the distance between both tracked sequences changes, the
 * {@code Gtk.GestureZoom::scale-changed} signal is emitted to report
 * the scale factor.
 */
public class GestureZoom extends org.gtk.gtk.Gesture {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureZoom";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureZoom proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GestureZoom(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureZoom> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GestureZoom(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_zoom_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes
     * pinch/zoom gestures.
     */
    public GestureZoom() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the scale delta.
     * <p>
     * If {@code gesture} is active, this function returns the zooming
     * difference since the gesture was recognized (hence the
     * starting point is considered 1:1). If {@code gesture} is not
     * active, 1 is returned.
     * @return the scale delta
     */
    public double getScaleDelta() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_gesture_zoom_get_scale_delta.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gtk_gesture_zoom_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ScaleChanged {
        void run(double scale);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureZoom, double scale) {
            run(scale);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ScaleChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever the distance between both tracked sequences changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureZoom.ScaleChanged> onScaleChanged(GestureZoom.ScaleChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("scale-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GestureZoom.Builder} object constructs a {@link GestureZoom} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GestureZoom.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Gesture.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GestureZoom} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureZoom}.
         * @return A new instance of {@code GestureZoom} with the properties 
         *         that were set in the Builder object.
         */
        public GestureZoom build() {
            return (GestureZoom) org.gtk.gobject.GObject.newWithProperties(
                GestureZoom.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_zoom_new = Interop.downcallHandle(
            "gtk_gesture_zoom_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_zoom_get_scale_delta = Interop.downcallHandle(
            "gtk_gesture_zoom_get_scale_delta",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_zoom_get_type = Interop.downcallHandle(
            "gtk_gesture_zoom_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
