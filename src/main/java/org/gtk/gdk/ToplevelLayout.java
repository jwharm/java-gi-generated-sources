package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkToplevelLayout} struct contains information that
 * is necessary to present a sovereign window on screen.
 * <p>
 * The {@code GdkToplevelLayout} struct is necessary for using
 * {@link Toplevel#present}.
 * <p>
 * Toplevel surfaces are sovereign windows that can be presented
 * to the user in various states (maximized, on all workspaces,
 * etc).
 */
public class ToplevelLayout extends io.github.jwharm.javagi.ResourceBase {

    public ToplevelLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gdk_toplevel_layout_new = Interop.downcallHandle(
        "gdk_toplevel_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_toplevel_layout_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a toplevel layout description.
     * <p>
     * Used together with gdk_toplevel_present() to describe
     * how a toplevel surface should be placed and behave on-screen.
     * <p>
     * The size is in ”application pixels”, not
     * ”device pixels” (see gdk_surface_get_scale_factor()).
     */
    public ToplevelLayout() {
        super(constructNew());
    }
    
    static final MethodHandle gdk_toplevel_layout_copy = Interop.downcallHandle(
        "gdk_toplevel_layout_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new {@code GdkToplevelLayout} and copy the contents of {@code layout} into it.
     */
    public ToplevelLayout copy() {
        try {
            var RESULT = (MemoryAddress) gdk_toplevel_layout_copy.invokeExact(handle());
            return new ToplevelLayout(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_equal = Interop.downcallHandle(
        "gdk_toplevel_layout_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Check whether {@code layout} and {@code other} has identical layout properties.
     */
    public boolean equal(ToplevelLayout other) {
        try {
            var RESULT = (int) gdk_toplevel_layout_equal.invokeExact(handle(), other.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_get_fullscreen = Interop.downcallHandle(
        "gdk_toplevel_layout_get_fullscreen",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If the layout specifies whether to the toplevel should go fullscreen,
     * the value pointed to by {@code fullscreen} is set to {@code true} if it should go
     * fullscreen, or {@code false}, if it should go unfullscreen.
     */
    public boolean getFullscreen(PointerBoolean fullscreen) {
        try {
            var RESULT = (int) gdk_toplevel_layout_get_fullscreen.invokeExact(handle(), fullscreen.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_get_fullscreen_monitor = Interop.downcallHandle(
        "gdk_toplevel_layout_get_fullscreen_monitor",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the monitor that the layout is fullscreening
     * the surface on.
     */
    public Monitor getFullscreenMonitor() {
        try {
            var RESULT = (MemoryAddress) gdk_toplevel_layout_get_fullscreen_monitor.invokeExact(handle());
            return new Monitor(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_get_maximized = Interop.downcallHandle(
        "gdk_toplevel_layout_get_maximized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If the layout specifies whether to the toplevel should go maximized,
     * the value pointed to by {@code maximized} is set to {@code true} if it should go
     * fullscreen, or {@code false}, if it should go unmaximized.
     */
    public boolean getMaximized(PointerBoolean maximized) {
        try {
            var RESULT = (int) gdk_toplevel_layout_get_maximized.invokeExact(handle(), maximized.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_get_resizable = Interop.downcallHandle(
        "gdk_toplevel_layout_get_resizable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the layout should allow the user
     * to resize the surface.
     */
    public boolean getResizable() {
        try {
            var RESULT = (int) gdk_toplevel_layout_get_resizable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_ref = Interop.downcallHandle(
        "gdk_toplevel_layout_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code layout}.
     */
    public ToplevelLayout ref() {
        try {
            var RESULT = (MemoryAddress) gdk_toplevel_layout_ref.invokeExact(handle());
            return new ToplevelLayout(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_set_fullscreen = Interop.downcallHandle(
        "gdk_toplevel_layout_set_fullscreen",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets whether the layout should cause the surface
     * to be fullscreen when presented.
     */
    public void setFullscreen(boolean fullscreen, Monitor monitor) {
        try {
            gdk_toplevel_layout_set_fullscreen.invokeExact(handle(), fullscreen ? 1 : 0, monitor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_set_maximized = Interop.downcallHandle(
        "gdk_toplevel_layout_set_maximized",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the layout should cause the surface
     * to be maximized when presented.
     */
    public void setMaximized(boolean maximized) {
        try {
            gdk_toplevel_layout_set_maximized.invokeExact(handle(), maximized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_set_resizable = Interop.downcallHandle(
        "gdk_toplevel_layout_set_resizable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the layout should allow the user
     * to resize the surface after it has been presented.
     */
    public void setResizable(boolean resizable) {
        try {
            gdk_toplevel_layout_set_resizable.invokeExact(handle(), resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_layout_unref = Interop.downcallHandle(
        "gdk_toplevel_layout_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code layout}.
     */
    public void unref() {
        try {
            gdk_toplevel_layout_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
