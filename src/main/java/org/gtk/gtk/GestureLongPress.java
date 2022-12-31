package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureLongPress} is a {@code GtkGesture} for long presses.
 * <p>
 * This gesture is also known as “Press and Hold”.
 * <p>
 * When the timeout is exceeded, the gesture is triggering the
 * {@code Gtk.GestureLongPress::pressed} signal.
 * <p>
 * If the touchpoint is lifted before the timeout passes, or if
 * it drifts too far of the initial press point, the
 * {@code Gtk.GestureLongPress::cancelled} signal will be emitted.
 * <p>
 * How long the timeout is before the ::pressed signal gets emitted is
 * determined by the {@code Gtk.Settings:gtk-long-press-time} setting.
 * It can be modified by the {@code Gtk.GestureLongPress:delay-factor}
 * property.
 */
public class GestureLongPress extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureLongPress";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureLongPress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GestureLongPress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureLongPress> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GestureLongPress(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_long_press_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes long presses.
     */
    public GestureLongPress() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns the delay factor.
     * @return the delay factor
     */
    public double getDelayFactor() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_gesture_long_press_get_delay_factor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Applies the given delay factor.
     * <p>
     * The default long press time will be multiplied by this value.
     * Valid values are in the range [0.5..2.0].
     * @param delayFactor The delay factor to apply
     */
    public void setDelayFactor(double delayFactor) {
        try {
            DowncallHandles.gtk_gesture_long_press_set_delay_factor.invokeExact(
                    handle(),
                    delayFactor);
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
            RESULT = (long) DowncallHandles.gtk_gesture_long_press_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Cancelled {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureLongPress) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Cancelled.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever a press moved too far, or was released
     * before {@code Gtk.GestureLongPress::pressed} happened.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureLongPress.Cancelled> onCancelled(GestureLongPress.Cancelled handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cancelled"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Pressed {
        void run(double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureLongPress, double x, double y) {
            run(x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Pressed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever a press goes unmoved/unreleased longer than
     * what the GTK defaults tell.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureLongPress.Pressed> onPressed(GestureLongPress.Pressed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("pressed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GestureLongPress.Builder} object constructs a {@link GestureLongPress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GestureLongPress.Builder#build()}. 
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
         * Finish building the {@link GestureLongPress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureLongPress}.
         * @return A new instance of {@code GestureLongPress} with the properties 
         *         that were set in the Builder object.
         */
        public GestureLongPress build() {
            return (GestureLongPress) org.gtk.gobject.GObject.newWithProperties(
                GestureLongPress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Factor by which to modify the default timeout.
         * @param delayFactor The value for the {@code delay-factor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDelayFactor(double delayFactor) {
            names.add("delay-factor");
            values.add(org.gtk.gobject.Value.create(delayFactor));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_long_press_new = Interop.downcallHandle(
            "gtk_gesture_long_press_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_long_press_get_delay_factor = Interop.downcallHandle(
            "gtk_gesture_long_press_get_delay_factor",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_long_press_set_delay_factor = Interop.downcallHandle(
            "gtk_gesture_long_press_set_delay_factor",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_gesture_long_press_get_type = Interop.downcallHandle(
            "gtk_gesture_long_press_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
