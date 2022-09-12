package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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
        return (RESULT != 0);
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
