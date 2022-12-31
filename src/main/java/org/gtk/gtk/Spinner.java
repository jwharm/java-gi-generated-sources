package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkSpinner} widget displays an icon-size spinning animation.
 * <p>
 * It is often used as an alternative to a {@link ProgressBar}
 * for displaying indefinite activity, instead of actual progress.
 * <p>
 * <img src="./doc-files/spinner.png" alt="An example GtkSpinner">
 * <p>
 * To start the animation, use {@link Spinner#start}, to stop it
 * use {@link Spinner#stop}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkSpinner} has a single CSS node with the name spinner.
 * When the animation is active, the :checked pseudoclass is
 * added to this node.
 */
public class Spinner extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSpinner";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Spinner proxy instance for the provided memory address.
     * <p>
     * Because Spinner is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Spinner(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Spinner> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Spinner(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_spinner_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a new spinner widget. Not yet started.
     */
    public Spinner() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Returns whether the spinner is spinning.
     * @return {@code true} if the spinner is active
     */
    public boolean getSpinning() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_spinner_get_spinning.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the activity of the spinner.
     * @param spinning whether the spinner should be spinning
     */
    public void setSpinning(boolean spinning) {
        try {
            DowncallHandles.gtk_spinner_set_spinning.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(spinning, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Starts the animation of the spinner.
     */
    public void start() {
        try {
            DowncallHandles.gtk_spinner_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops the animation of the spinner.
     */
    public void stop() {
        try {
            DowncallHandles.gtk_spinner_stop.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gtk_spinner_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Spinner.Builder} object constructs a {@link Spinner} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Spinner.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Spinner} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Spinner}.
         * @return A new instance of {@code Spinner} with the properties 
         *         that were set in the Builder object.
         */
        public Spinner build() {
            return (Spinner) org.gtk.gobject.GObject.newWithProperties(
                Spinner.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the spinner is spinning
         * @param spinning The value for the {@code spinning} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSpinning(boolean spinning) {
            names.add("spinning");
            values.add(org.gtk.gobject.Value.create(spinning));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_spinner_new = Interop.downcallHandle(
            "gtk_spinner_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_spinner_get_spinning = Interop.downcallHandle(
            "gtk_spinner_get_spinning",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_spinner_set_spinning = Interop.downcallHandle(
            "gtk_spinner_set_spinning",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_spinner_start = Interop.downcallHandle(
            "gtk_spinner_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_spinner_stop = Interop.downcallHandle(
            "gtk_spinner_stop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_spinner_get_type = Interop.downcallHandle(
            "gtk_spinner_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
