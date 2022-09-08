package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkToplevelLayout` struct contains information that
 * is necessary to present a sovereign window on screen.
 * 
 * The `GdkToplevelLayout` struct is necessary for using
 * [method@Gdk.Toplevel.present].
 * 
 * Toplevel surfaces are sovereign windows that can be presented
 * to the user in various states (maximized, on all workspaces,
 * etc).
 */
public class ToplevelLayout extends io.github.jwharm.javagi.interop.ResourceBase {

    public ToplevelLayout(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Create a toplevel layout description.
     * 
     * Used together with gdk_toplevel_present() to describe
     * how a toplevel surface should be placed and behave on-screen.
     * 
     * The size is in ”application pixels”, not
     * ”device pixels” (see gdk_surface_get_scale_factor()).
     */
    public ToplevelLayout() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_new(), true));
    }
    
    /**
     * Create a new `GdkToplevelLayout` and copy the contents of @layout into it.
     */
    public ToplevelLayout copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_copy(HANDLE());
        return new ToplevelLayout(References.get(RESULT, true));
    }
    
    /**
     * Check whether @layout and @other has identical layout properties.
     */
    public boolean equal(ToplevelLayout other) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_equal(HANDLE(), other.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the monitor that the layout is fullscreening
     * the surface on.
     */
    public Monitor getFullscreenMonitor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_get_fullscreen_monitor(HANDLE());
        return new Monitor(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the layout should allow the user
     * to resize the surface.
     */
    public boolean getResizable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_get_resizable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Increases the reference count of @layout.
     */
    public ToplevelLayout ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_ref(HANDLE());
        return new ToplevelLayout(References.get(RESULT, true));
    }
    
    /**
     * Sets whether the layout should cause the surface
     * to be fullscreen when presented.
     */
    public void setFullscreen(boolean fullscreen, Monitor monitor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_set_fullscreen(HANDLE(), fullscreen ? 1 : 0, monitor.HANDLE());
    }
    
    /**
     * Sets whether the layout should cause the surface
     * to be maximized when presented.
     */
    public void setMaximized(boolean maximized) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_set_maximized(HANDLE(), maximized ? 1 : 0);
    }
    
    /**
     * Sets whether the layout should allow the user
     * to resize the surface after it has been presented.
     */
    public void setResizable(boolean resizable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_set_resizable(HANDLE(), resizable ? 1 : 0);
    }
    
    /**
     * Decreases the reference count of @layout.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_toplevel_layout_unref(HANDLE());
    }
    
}
