package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSeparator</code> is a horizontal or vertical separator widget.
 * <p>
 * !{@link [An example GtkSeparator]}(separators.png)
 * <p>
 * A <code>GtkSeparator</code> can be used to group the widgets within a window.
 * It displays a line with a shadow to make it appear sunken into the
 * interface.
 * <p>
 * <h1>SS nodes</h1>
 * <p><code>GtkSeparator</code> has a single CSS node with name separator. The node
 * gets one of the .horizontal or .vertical style classes.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkSeparator</code> uses the {@link org.gtk.gtk.AccessibleRole#SEPARATOR} role.
 */
public class Separator extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Separator(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Separator */
    public static Separator castFrom(org.gtk.gobject.Object gobject) {
        return new Separator(gobject.getReference());
    }
    
    private static Reference constructNew(Orientation orientation) {
        Reference RESULT = References.get(gtk_h.gtk_separator_new(orientation.getValue()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkSeparator</code> with the given orientation.
     */
    public Separator(Orientation orientation) {
        super(constructNew(orientation));
    }
    
}
