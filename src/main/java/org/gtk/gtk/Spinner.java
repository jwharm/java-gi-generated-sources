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
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkSpinner} has a single CSS node with the name spinner.
 * When the animation is active, the :checked pseudoclass is
 * added to this node.
 */
public class Spinner extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Spinner(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Spinner */
    public static Spinner castFrom(org.gtk.gobject.Object gobject) {
        return new Spinner(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_spinner_new = Interop.downcallHandle(
        "gtk_spinner_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_spinner_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a new spinner widget. Not yet started.
     */
    public Spinner() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_spinner_get_spinning = Interop.downcallHandle(
        "gtk_spinner_get_spinning",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the spinner is spinning.
     */
    public boolean getSpinning() {
        int RESULT;
        try {
            RESULT = (int) gtk_spinner_get_spinning.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_spinner_set_spinning = Interop.downcallHandle(
        "gtk_spinner_set_spinning",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the activity of the spinner.
     */
    public @NotNull void setSpinning(@NotNull boolean spinning) {
        try {
            gtk_spinner_set_spinning.invokeExact(handle(), spinning ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_spinner_start = Interop.downcallHandle(
        "gtk_spinner_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Starts the animation of the spinner.
     */
    public @NotNull void start() {
        try {
            gtk_spinner_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_spinner_stop = Interop.downcallHandle(
        "gtk_spinner_stop",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Stops the animation of the spinner.
     */
    public @NotNull void stop() {
        try {
            gtk_spinner_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
