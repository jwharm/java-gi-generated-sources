package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkSpinner} has a single CSS node with the name spinner.
 * When the animation is active, the :checked pseudoclass is
 * added to this node.
 */
public class Spinner extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Spinner(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Spinner */
    public static Spinner castFrom(org.gtk.gobject.Object gobject) {
        return new Spinner(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_spinner_new(), false);
        return RESULT;
    }
    
    /**
     * Returns a new spinner widget. Not yet started.
     */
    public Spinner() {
        super(constructNew());
    }
    
    /**
     * Returns whether the spinner is spinning.
     */
    public boolean getSpinning() {
        var RESULT = gtk_h.gtk_spinner_get_spinning(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the activity of the spinner.
     */
    public void setSpinning(boolean spinning) {
        gtk_h.gtk_spinner_set_spinning(handle(), spinning ? 1 : 0);
    }
    
    /**
     * Starts the animation of the spinner.
     */
    public void start() {
        gtk_h.gtk_spinner_start(handle());
    }
    
    /**
     * Stops the animation of the spinner.
     */
    public void stop() {
        gtk_h.gtk_spinner_stop(handle());
    }
    
}
