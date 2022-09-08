package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLayoutChild` subclass for children in a `GtkConstraintLayout`.
 */
public class ConstraintLayoutChild extends LayoutChild {

    public ConstraintLayoutChild(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstraintLayoutChild */
    public static ConstraintLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintLayoutChild(gobject.getReference());
    }
    
}
