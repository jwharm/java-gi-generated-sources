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
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Spinner(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Spinner if its GType is a (or inherits from) "GtkSpinner".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Spinner} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSpinner", a ClassCastException will be thrown.
     */
    public static Spinner castFrom(org.gtk.gobject.Object gobject) {
            return new Spinner(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        return RESULT != 0;
    }
    
    /**
     * Sets the activity of the spinner.
     * @param spinning whether the spinner should be spinning
     */
    public void setSpinning(boolean spinning) {
        try {
            DowncallHandles.gtk_spinner_set_spinning.invokeExact(
                    handle(),
                    spinning ? 1 : 0);
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_spinner_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Spinner.Build} object constructs a {@link Spinner} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Spinner} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Spinner} using {@link Spinner#castFrom}.
         * @return A new instance of {@code Spinner} with the properties 
         *         that were set in the Build object.
         */
        public Spinner construct() {
            return Spinner.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Spinner.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the spinner is spinning
         * @param spinning The value for the {@code spinning} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSpinning(boolean spinning) {
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
