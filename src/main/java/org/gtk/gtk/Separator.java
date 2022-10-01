package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSeparator} is a horizontal or vertical separator widget.
 * <p>
 * <img src="./doc-files/separators.png" alt="An example GtkSeparator">
 * <p>
 * A {@code GtkSeparator} can be used to group the widgets within a window.
 * It displays a line with a shadow to make it appear sunken into the
 * interface.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkSeparator} has a single CSS node with name separator. The node
 * gets one of the .horizontal or .vertical style classes.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkSeparator} uses the {@link AccessibleRole#SEPARATOR} role.
 */
public class Separator extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Separator(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Separator */
    public static Separator castFrom(org.gtk.gobject.Object gobject) {
        return new Separator(gobject.refcounted());
    }
    
    private static Refcounted constructNew(Orientation orientation) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_separator_new(orientation.getValue()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSeparator} with the given orientation.
     */
    public Separator(Orientation orientation) {
        super(constructNew(orientation));
    }
    
}
