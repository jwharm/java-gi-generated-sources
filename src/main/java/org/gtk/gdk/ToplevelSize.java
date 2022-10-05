package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkToplevelSize} struct contains information that is useful
 * to compute the size of a toplevel.
 */
public class ToplevelSize extends io.github.jwharm.javagi.ResourceBase {

    public ToplevelSize(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gdk_toplevel_size_get_bounds = Interop.downcallHandle(
        "gdk_toplevel_size_get_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gdk_toplevel_size_get_bounds.invokeExact(handle(), boundsWidth.handle(), boundsHeight.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_size_set_min_size = Interop.downcallHandle(
        "gdk_toplevel_size_set_min_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gdk_toplevel_size_set_min_size.invokeExact(handle(), minWidth, minHeight);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_size_set_shadow_width = Interop.downcallHandle(
        "gdk_toplevel_size_set_shadow_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the shadows size of the toplevel.
     * <p>
     * The shadow width corresponds to the part of the computed surface size
     * that would consist of the shadow margin surrounding the window, would
     * there be any.
     */
    public void setShadowWidth(int left, int right, int top, int bottom) {
        try {
            gdk_toplevel_size_set_shadow_width.invokeExact(handle(), left, right, top, bottom);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_toplevel_size_set_size = Interop.downcallHandle(
        "gdk_toplevel_size_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size the toplevel prefers to be resized to.
     * <p>
     * The size should be within the bounds (see
     * {@link ToplevelSize#getBounds}). The set size should
     * be considered as a hint, and should not be assumed to be
     * respected by the windowing system, or backend.
     */
    public void setSize(int width, int height) {
        try {
            gdk_toplevel_size_set_size.invokeExact(handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
