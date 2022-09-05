package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkToplevelSize` struct contains information that is useful
 * to compute the size of a toplevel.
 */
public class ToplevelSize extends io.github.jwharm.javagi.interop.ResourceBase {

    public ToplevelSize(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Sets the minimum size of the toplevel.
     * 
     * The minimum size corresponds to the limitations the toplevel can be shrunk
     * to, without resulting in incorrect painting. A user of a `GdkToplevel` should
     * calculate these given both the existing size, and the bounds retrieved from
     * the `GdkToplevelSize` object.
     * 
     * The minimum size should be within the bounds (see
     * [method@Gdk.ToplevelSize.get_bounds]).
     */
    public void setMinSize(int minWidth, int minHeight) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_size_set_min_size(HANDLE(), minWidth, minHeight);
    }
    
    /**
     * Sets the shadows size of the toplevel.
     * 
     * The shadow width corresponds to the part of the computed surface size
     * that would consist of the shadow margin surrounding the window, would
     * there be any.
     */
    public void setShadowWidth(int left, int right, int top, int bottom) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_size_set_shadow_width(HANDLE(), left, right, top, bottom);
    }
    
    /**
     * Sets the size the toplevel prefers to be resized to.
     * 
     * The size should be within the bounds (see
     * [method@Gdk.ToplevelSize.get_bounds]). The set size should
     * be considered as a hint, and should not be assumed to be
     * respected by the windowing system, or backend.
     */
    public void setSize(int width, int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_size_set_size(HANDLE(), width, height);
    }
    
}
