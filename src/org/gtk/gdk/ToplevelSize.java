package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkToplevelSize} struct contains information that is useful
 * to compute the size of a toplevel.
 */
public class ToplevelSize extends io.github.jwharm.javagi.ResourceBase {

    public ToplevelSize(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Retrieves the bounds the toplevel is placed within.
     * <p>
     * The bounds represent the largest size a toplevel may have while still being
     * able to fit within some type of boundary. Depending on the backend, this may
     * be equivalent to the dimensions of the work area or the monitor on which the
     * window is being presented on, or something else that limits the way a
     * toplevel can be presented.
     */
    public void getBounds(PointerInteger boundsWidth, PointerInteger boundsHeight) {
        gtk_h.gdk_toplevel_size_get_bounds(handle(), boundsWidth.handle(), boundsHeight.handle());
    }
    
    /**
     * Sets the minimum size of the toplevel.
     * <p>
     * The minimum size corresponds to the limitations the toplevel can be shrunk
     * to, without resulting in incorrect painting. A user of a {@code GdkToplevel} should
     * calculate these given both the existing size, and the bounds retrieved from
     * the {@code GdkToplevelSize} object.
     * <p>
     * The minimum size should be within the bounds (see
     * {@link ToplevelSize#getBounds}).
     */
    public void setMinSize(int minWidth, int minHeight) {
        gtk_h.gdk_toplevel_size_set_min_size(handle(), minWidth, minHeight);
    }
    
    /**
     * Sets the shadows size of the toplevel.
     * <p>
     * The shadow width corresponds to the part of the computed surface size
     * that would consist of the shadow margin surrounding the window, would
     * there be any.
     */
    public void setShadowWidth(int left, int right, int top, int bottom) {
        gtk_h.gdk_toplevel_size_set_shadow_width(handle(), left, right, top, bottom);
    }
    
    /**
     * Sets the size the toplevel prefers to be resized to.
     * <p>
     * The size should be within the bounds (see
     * {@link ToplevelSize#getBounds}). The set size should
     * be considered as a hint, and should not be assumed to be
     * respected by the windowing system, or backend.
     */
    public void setSize(int width, int height) {
        gtk_h.gdk_toplevel_size_set_size(handle(), width, height);
    }
    
}
