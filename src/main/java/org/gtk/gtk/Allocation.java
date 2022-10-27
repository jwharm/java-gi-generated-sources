package org.gtk.gtk;

/**
 * The rectangle representing the area allocated for a widget by its parent.
 */
public class Allocation extends org.gtk.gdk.Rectangle {

    
    public Allocation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Allocation */
    public static Allocation castFrom(org.gtk.gobject.Object gobject) {
        return new Allocation(gobject.refcounted());
    }
}
