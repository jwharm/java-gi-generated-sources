package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLayoutChild` subclass for children in a `GtkFixedLayout`.
 */
public class FixedLayoutChild extends LayoutChild {

    public FixedLayoutChild(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FixedLayoutChild */
    public static FixedLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new FixedLayoutChild(gobject.getProxy());
    }
    
    /**
     * Retrieves the transformation of the child.
     */
    public org.gtk.gsk.Transform getTransform() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_fixed_layout_child_get_transform(HANDLE());
        return new org.gtk.gsk.Transform(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Sets the transformation of the child of a `GtkFixedLayout`.
     */
    public void setTransform(org.gtk.gsk.Transform transform) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_fixed_layout_child_set_transform(HANDLE(), transform.HANDLE());
    }
    
}
