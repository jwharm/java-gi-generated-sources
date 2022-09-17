package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkAspectFrame</code> preserves the aspect ratio of its child.
 * <p>
 * The frame can respect the aspect ratio of the child widget,
 * or use its own aspect ratio.
 * <p>
 * <h1>SS nodes</h1>
 * <p><code>GtkAspectFrame</code> uses a CSS node with name <code>frame</code>.
 */
public class AspectFrame extends Widget implements Accessible, Buildable, ConstraintTarget {

    public AspectFrame(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AspectFrame */
    public static AspectFrame castFrom(org.gtk.gobject.Object gobject) {
        return new AspectFrame(gobject.getReference());
    }
    
    private static Reference constructNew(float xalign, float yalign, float ratio, boolean obeyChild) {
        Reference RESULT = References.get(gtk_h.gtk_aspect_frame_new(xalign, yalign, ratio, obeyChild ? 1 : 0), false);
        return RESULT;
    }
    
    /**
     * Create a new <code>GtkAspectFrame</code>.
     */
    public AspectFrame(float xalign, float yalign, float ratio, boolean obeyChild) {
        super(constructNew(xalign, yalign, ratio, obeyChild));
    }
    
    /**
     * Gets the child widget of @self.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_aspect_frame_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the child&#39;s size request should override
     * the set aspect ratio of the <code>GtkAspectFrame</code>.
     */
    public boolean getObeyChild() {
        var RESULT = gtk_h.gtk_aspect_frame_get_obey_child(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the desired aspect ratio of the child.
     */
    public float getRatio() {
        var RESULT = gtk_h.gtk_aspect_frame_get_ratio(handle());
        return RESULT;
    }
    
    /**
     * Returns the horizontal alignment of the child within the
     * allocation of the <code>GtkAspectFrame</code>.
     */
    public float getXalign() {
        var RESULT = gtk_h.gtk_aspect_frame_get_xalign(handle());
        return RESULT;
    }
    
    /**
     * Returns the vertical alignment of the child within the
     * allocation of the <code>GtkAspectFrame</code>.
     */
    public float getYalign() {
        var RESULT = gtk_h.gtk_aspect_frame_get_yalign(handle());
        return RESULT;
    }
    
    /**
     * Sets the child widget of @self.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_aspect_frame_set_child(handle(), child.handle());
    }
    
    /**
     * Sets whether the aspect ratio of the child&#39;s size
     * request should override the set aspect ratio of
     * the <code>GtkAspectFrame</code>.
     */
    public void setObeyChild(boolean obeyChild) {
        gtk_h.gtk_aspect_frame_set_obey_child(handle(), obeyChild ? 1 : 0);
    }
    
    /**
     * Sets the desired aspect ratio of the child.
     */
    public void setRatio(float ratio) {
        gtk_h.gtk_aspect_frame_set_ratio(handle(), ratio);
    }
    
    /**
     * Sets the horizontal alignment of the child within the allocation
     * of the <code>GtkAspectFrame</code>.
     */
    public void setXalign(float xalign) {
        gtk_h.gtk_aspect_frame_set_xalign(handle(), xalign);
    }
    
    /**
     * Sets the vertical alignment of the child within the allocation
     * of the <code>GtkAspectFrame</code>.
     */
    public void setYalign(float yalign) {
        gtk_h.gtk_aspect_frame_set_yalign(handle(), yalign);
    }
    
}
