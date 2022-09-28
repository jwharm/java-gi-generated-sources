package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkConstraintLayout}.
 */
public class ConstraintLayoutChild extends LayoutChild {

    public ConstraintLayoutChild(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstraintLayoutChild */
    public static ConstraintLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintLayoutChild(gobject.getReference());
    }
    
}
