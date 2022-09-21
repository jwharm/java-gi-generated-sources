package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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
