package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for an outset shadow.
 */
public class OutsetShadowNode extends RenderNode {

    public OutsetShadowNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to OutsetShadowNode */
    public static OutsetShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new OutsetShadowNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_outset_shadow_node_new(outline.handle(), color.handle(), dx, dy, spread, blurRadius), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render an outset shadow
     * around the box given by {@code outline}.
     */
    public OutsetShadowNode(RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        super(constructNew(outline, color, dx, dy, spread, blurRadius));
    }
    
    /**
     * Retrieves the blur radius of the shadow.
     */
    public float getBlurRadius() {
        var RESULT = gtk_h.gsk_outset_shadow_node_get_blur_radius(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the color of the outset shadow.
     */
    public org.gtk.gdk.RGBA getColor() {
        var RESULT = gtk_h.gsk_outset_shadow_node_get_color(handle());
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the horizontal offset of the outset shadow.
     */
    public float getDx() {
        var RESULT = gtk_h.gsk_outset_shadow_node_get_dx(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the vertical offset of the outset shadow.
     */
    public float getDy() {
        var RESULT = gtk_h.gsk_outset_shadow_node_get_dy(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the outline rectangle of the outset shadow.
     */
    public RoundedRect getOutline() {
        var RESULT = gtk_h.gsk_outset_shadow_node_get_outline(handle());
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves how much the shadow spreads outwards.
     */
    public float getSpread() {
        var RESULT = gtk_h.gsk_outset_shadow_node_get_spread(handle());
        return RESULT;
    }
    
}
