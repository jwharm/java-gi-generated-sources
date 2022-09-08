package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSeparator` is a horizontal or vertical separator widget.
 * 
 * ![An example GtkSeparator](separators.png)
 * 
 * A `GtkSeparator` can be used to group the widgets within a window.
 * It displays a line with a shadow to make it appear sunken into the
 * interface.
 * 
 * # CSS nodes
 * 
 * `GtkSeparator` has a single CSS node with name separator. The node
 * gets one of the .horizontal or .vertical style classes.
 * 
 * # Accessibility
 * 
 * `GtkSeparator` uses the %GTK_ACCESSIBLE_ROLE_SEPARATOR role.
 */
public class Separator extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Separator(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Separator */
    public static Separator castFrom(org.gtk.gobject.Object gobject) {
        return new Separator(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkSeparator` with the given orientation.
     */
    public Separator(Orientation orientation) {
        super(References.get(gtk_h.gtk_separator_new(orientation.getValue()), false));
    }
    
}
