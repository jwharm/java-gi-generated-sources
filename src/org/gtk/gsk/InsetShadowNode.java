package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for an inset shadow.
 */
public class InsetShadowNode extends RenderNode {

    public InsetShadowNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to InsetShadowNode */
    public static InsetShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new InsetShadowNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will render an inset shadow
     * into the box given by @outline.
     */
    public InsetShadowNode(RoundedRect outline, org.gtk.gdk.RGBA color, float dx, float dy, float spread, float blurRadius) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_inset_shadow_node_new(outline.HANDLE(), color.HANDLE(), dx, dy, spread, blurRadius), true));
    }
    
    /**
     * Retrieves the blur radius to apply to the shadow.
     */
    public float getBlurRadius() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_inset_shadow_node_get_blur_radius(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the color of the inset shadow.
     */
    public org.gtk.gdk.RGBA getColor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_inset_shadow_node_get_color(HANDLE());
        return new org.gtk.gdk.RGBA(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the horizontal offset of the inset shadow.
     */
    public float getDx() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_inset_shadow_node_get_dx(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the vertical offset of the inset shadow.
     */
    public float getDy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_inset_shadow_node_get_dy(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the outline rectangle of the inset shadow.
     */
    public RoundedRect getOutline() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_inset_shadow_node_get_outline(HANDLE());
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves how much the shadow spreads inwards.
     */
    public float getSpread() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_inset_shadow_node_get_spread(HANDLE());
        return RESULT;
    }
    
}
