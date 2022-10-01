package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkFixedLayout}.
 */
public class FixedLayoutChild extends LayoutChild {

    public FixedLayoutChild(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FixedLayoutChild */
    public static FixedLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new FixedLayoutChild(gobject.getReference());
    }
    
    /**
     * Retrieves the transformation of the child.
     */
    public org.gtk.gsk.Transform getTransform() {
        var RESULT = gtk_h.gtk_fixed_layout_child_get_transform(handle());
        return new org.gtk.gsk.Transform(References.get(RESULT, false));
    }
    
    /**
     * Sets the transformation of the child of a {@code GtkFixedLayout}.
     */
    public void setTransform(org.gtk.gsk.Transform transform) {
        gtk_h.gtk_fixed_layout_child_set_transform(handle(), transform.handle());
    }
    
}
