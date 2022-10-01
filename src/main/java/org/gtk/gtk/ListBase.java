package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkListBase} is the abstract base class for GTK's list widgets.
 */
public class ListBase extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public ListBase(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListBase */
    public static ListBase castFrom(org.gtk.gobject.Object gobject) {
        return new ListBase(gobject.getReference());
    }
    
}
