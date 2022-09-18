package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GdkToplevelLayout</code> struct contains information that
 * is necessary to present a sovereign window on screen.
 * <p>
 * The <code>GdkToplevelLayout</code> struct is necessary for using
 * {@link org.gtk.gdk.Toplevel<code>#present</code> .
 * 
 * Toplevel surfaces are sovereign windows that can be presented
 * to the user in various states (maximized, on all workspaces,
 * etc).
 */
public class ToplevelLayout extends io.github.jwharm.javagi.ResourceBase {

    public ToplevelLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gdk_toplevel_layout_new(), true);
        return RESULT;
    }
    
    /**
     * Create a toplevel layout description.
     * 
     * Used together with gdk_toplevel_present() to describe
     * how a toplevel surface should be placed and behave on-screen.
     * 
     * The size is in &<code>#8221</code> application pixels&<code>#8221</code> , not
     * &<code>#8221</code> device pixels&<code>#8221</code>  (see gdk_surface_get_scale_factor()).
     */
    public ToplevelLayout() {
        super(constructNew());
    }
    
    /**
     * Create a new <code>GdkToplevelLayout</code> and copy the contents of @layout into it.
     */
    public ToplevelLayout copy() {
        var RESULT = gtk_h.gdk_toplevel_layout_copy(handle());
        return new ToplevelLayout(References.get(RESULT, true));
    }
    
    /**
     * Check whether @layout and @other has identical layout properties.
     */
    public boolean equal(ToplevelLayout other) {
        var RESULT = gtk_h.gdk_toplevel_layout_equal(handle(), other.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the monitor that the layout is fullscreening
     * the surface on.
     */
    public Monitor getFullscreenMonitor() {
        var RESULT = gtk_h.gdk_toplevel_layout_get_fullscreen_monitor(handle());
        return new Monitor(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the layout should allow the user
     * to resize the surface.
     */
    public boolean getResizable() {
        var RESULT = gtk_h.gdk_toplevel_layout_get_resizable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Increases the reference count of @layout.
     */
    public ToplevelLayout ref() {
        var RESULT = gtk_h.gdk_toplevel_layout_ref(handle());
        return new ToplevelLayout(References.get(RESULT, true));
    }
    
    /**
     * Sets whether the layout should cause the surface
     * to be fullscreen when presented.
     */
    public void setFullscreen(boolean fullscreen, Monitor monitor) {
        gtk_h.gdk_toplevel_layout_set_fullscreen(handle(), fullscreen ? 1 : 0, monitor.handle());
    }
    
    /**
     * Sets whether the layout should cause the surface
     * to be maximized when presented.
     */
    public void setMaximized(boolean maximized) {
        gtk_h.gdk_toplevel_layout_set_maximized(handle(), maximized ? 1 : 0);
    }
    
    /**
     * Sets whether the layout should allow the user
     * to resize the surface after it has been presented.
     */
    public void setResizable(boolean resizable) {
        gtk_h.gdk_toplevel_layout_set_resizable(handle(), resizable ? 1 : 0);
    }
    
    /**
     * Decreases the reference count of @layout.
     */
    public void unref() {
        gtk_h.gdk_toplevel_layout_unref(handle());
    }
    
}
