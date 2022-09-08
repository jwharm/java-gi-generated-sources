package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkSpinner` widget displays an icon-size spinning animation.
 * 
 * It is often used as an alternative to a [class@Gtk.ProgressBar]
 * for displaying indefinite activity, instead of actual progress.
 * 
 * ![An example GtkSpinner](spinner.png)
 * 
 * To start the animation, use [method@Gtk.Spinner.start], to stop it
 * use [method@Gtk.Spinner.stop].
 * 
 * # CSS nodes
 * 
 * `GtkSpinner` has a single CSS node with the name spinner.
 * When the animation is active, the :checked pseudoclass is
 * added to this node.
 */
public class Spinner extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Spinner(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Spinner */
    public static Spinner castFrom(org.gtk.gobject.Object gobject) {
        return new Spinner(gobject.getReference());
    }
    
    /**
     * Returns a new spinner widget. Not yet started.
     */
    public Spinner() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spinner_new(), false));
    }
    
    /**
     * Returns whether the spinner is spinning.
     */
    public boolean getSpinning() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spinner_get_spinning(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the activity of the spinner.
     */
    public void setSpinning(boolean spinning) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spinner_set_spinning(HANDLE(), spinning ? 1 : 0);
    }
    
    /**
     * Starts the animation of the spinner.
     */
    public void start() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spinner_start(HANDLE());
    }
    
    /**
     * Stops the animation of the spinner.
     */
    public void stop() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_spinner_stop(HANDLE());
    }
    
}
