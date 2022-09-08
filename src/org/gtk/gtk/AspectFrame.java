package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkAspectFrame` preserves the aspect ratio of its child.
 * 
 * The frame can respect the aspect ratio of the child widget,
 * or use its own aspect ratio.
 * 
 * # CSS nodes
 * 
 * `GtkAspectFrame` uses a CSS node with name `frame`.
 */
public class AspectFrame extends Widget implements Accessible, Buildable, ConstraintTarget {

    public AspectFrame(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AspectFrame */
    public static AspectFrame castFrom(org.gtk.gobject.Object gobject) {
        return new AspectFrame(gobject.getReference());
    }
    
    /**
     * Create a new `GtkAspectFrame`.
     */
    public AspectFrame(float xalign, float yalign, float ratio, boolean obeyChild) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_new(xalign, yalign, ratio, obeyChild ? 1 : 0), false));
    }
    
    /**
     * Gets the child widget of @self.
     */
    public Widget getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_get_child(HANDLE());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the child's size request should override
     * the set aspect ratio of the `GtkAspectFrame`.
     */
    public boolean getObeyChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_get_obey_child(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the desired aspect ratio of the child.
     */
    public float getRatio() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_get_ratio(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the horizontal alignment of the child within the
     * allocation of the `GtkAspectFrame`.
     */
    public float getXalign() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_get_xalign(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the vertical alignment of the child within the
     * allocation of the `GtkAspectFrame`.
     */
    public float getYalign() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_get_yalign(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the child widget of @self.
     */
    public void setChild(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_set_child(HANDLE(), child.HANDLE());
    }
    
    /**
     * Sets whether the aspect ratio of the child's size
     * request should override the set aspect ratio of
     * the `GtkAspectFrame`.
     */
    public void setObeyChild(boolean obeyChild) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_set_obey_child(HANDLE(), obeyChild ? 1 : 0);
    }
    
    /**
     * Sets the desired aspect ratio of the child.
     */
    public void setRatio(float ratio) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_set_ratio(HANDLE(), ratio);
    }
    
    /**
     * Sets the horizontal alignment of the child within the allocation
     * of the `GtkAspectFrame`.
     */
    public void setXalign(float xalign) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_set_xalign(HANDLE(), xalign);
    }
    
    /**
     * Sets the vertical alignment of the child within the allocation
     * of the `GtkAspectFrame`.
     */
    public void setYalign(float yalign) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_aspect_frame_set_yalign(HANDLE(), yalign);
    }
    
}
