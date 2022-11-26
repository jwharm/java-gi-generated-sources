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
    @ApiStatus.Internal
    public GestureZoom(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GestureZoom if its GType is a (or inherits from) "GtkGestureZoom".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GestureZoom} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureZoom", a ClassCastException will be thrown.
     */
    public static GestureZoom castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), GestureZoom.getType())) {
            return new GestureZoom(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureZoom");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(GestureZoom source, double scale);
    }
    
    /**
     * Emitted whenever the distance between both tracked sequences changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureZoom.ScaleChanged> onScaleChanged(GestureZoom.ScaleChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("scale-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureZoom.Callbacks.class, "signalGestureZoomScaleChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureZoom.ScaleChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Gesture.Build {
        
         /**
         * A {@link GestureZoom.Build} object constructs a {@link GestureZoom} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GestureZoom} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureZoom} using {@link GestureZoom#castFrom}.
         * @return A new instance of {@code GestureZoom} with the properties 
         *         that were set in the Build object.
         */
        public GestureZoom construct() {
            return GestureZoom.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GestureZoom.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
    
    private static class Callbacks {
        
        public static void signalGestureZoomScaleChanged(MemoryAddress source, double scale, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureZoom.ScaleChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureZoom(source, Ownership.NONE), scale);
        }
    }
}
