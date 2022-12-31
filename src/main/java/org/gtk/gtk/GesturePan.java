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
    protected GesturePan(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GesturePan> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GesturePan(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Orientation orientation) {
        MemoryAddress RESULT;
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
    public GesturePan(org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation), Ownership.FULL);
    }
    
    /**
     * Returns the orientation of the pan gestures that this {@code gesture} expects.
     * @return the expected orientation for pan gestures
     */
    public org.gtk.gtk.Orientation getOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_pan_get_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Orientation.of(RESULT);
    }
    
    /**
     * Sets the orientation to be expected on pan gestures.
     * @param orientation expected orientation
     */
    public void setOrientation(org.gtk.gtk.Orientation orientation) {
        try {
            DowncallHandles.gtk_gesture_pan_set_orientation.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_pan_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Pan {
        void run(org.gtk.gtk.PanDirection direction, double offset);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGesturePan, int direction, double offset) {
            run(org.gtk.gtk.PanDirection.of(direction), offset);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Pan.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted once a panning gesture along the expected axis is detected.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GesturePan.Pan> onPan(GesturePan.Pan handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pan"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GesturePan.Builder} object constructs a {@link GesturePan} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GesturePan.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.GestureDrag.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GesturePan} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GesturePan}.
         * @return A new instance of {@code GesturePan} with the properties 
         *         that were set in the Builder object.
         */
        public GesturePan build() {
            return (GesturePan) org.gtk.gobject.GObject.newWithProperties(
                GesturePan.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The expected orientation of pan gestures.
         * @param orientation The value for the {@code orientation} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOrientation(org.gtk.gtk.Orientation orientation) {
            names.add("orientation");
            values.add(org.gtk.gobject.Value.create(orientation));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_pan_new = Interop.downcallHandle(
            "gtk_gesture_pan_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_gesture_pan_get_orientation = Interop.downcallHandle(
            "gtk_gesture_pan_get_orientation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_pan_set_orientation = Interop.downcallHandle(
            "gtk_gesture_pan_set_orientation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_gesture_pan_get_type = Interop.downcallHandle(
            "gtk_gesture_pan_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
