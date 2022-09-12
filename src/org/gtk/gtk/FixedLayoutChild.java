package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
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
     * Sets the transformation of the child of a `GtkFixedLayout`.
     */
    public void setTransform(org.gtk.gsk.Transform transform) {
        gtk_h.gtk_fixed_layout_child_set_transform(handle(), transform.handle());
    }
    
}
