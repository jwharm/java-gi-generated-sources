package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gdk_toplevel_layout_new = Interop.downcallHandle(
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
    
    private static final MethodHandle gdk_toplevel_layout_copy = Interop.downcallHandle(
        "gdk_toplevel_layout_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new {@code GdkToplevelLayout} and copy the contents of {@code layout} into it.
     */
    public @NotNull ToplevelLayout copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_toplevel_layout_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ToplevelLayout(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_toplevel_layout_equal = Interop.downcallHandle(
        "gdk_toplevel_layout_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Check whether {@code layout} and {@code other} has identical layout properties.
     */
    public boolean equal(@NotNull ToplevelLayout other) {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_layout_equal.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_toplevel_layout_get_fullscreen = Interop.downcallHandle(
        "gdk_toplevel_layout_get_fullscreen",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If the layout specifies whether to the toplevel should go fullscreen,
     * the value pointed to by {@code fullscreen} is set to {@code true} if it should go
     * fullscreen, or {@code false}, if it should go unfullscreen.
     */
    public boolean getFullscreen(@NotNull Out<Boolean> fullscreen) {
        MemorySegment fullscreenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_layout_get_fullscreen.invokeExact(handle(), (Addressable) fullscreenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        fullscreen.set(fullscreenPOINTER.get(ValueLayout.JAVA_INT, 0) != 0);
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_toplevel_layout_get_fullscreen_monitor = Interop.downcallHandle(
        "gdk_toplevel_layout_get_fullscreen_monitor",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the monitor that the layout is fullscreening
     * the surface on.
     */
    public @Nullable Monitor getFullscreenMonitor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_toplevel_layout_get_fullscreen_monitor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Monitor(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_toplevel_layout_get_maximized = Interop.downcallHandle(
        "gdk_toplevel_layout_get_maximized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If the layout specifies whether to the toplevel should go maximized,
     * the value pointed to by {@code maximized} is set to {@code true} if it should go
     * fullscreen, or {@code false}, if it should go unmaximized.
     */
    public boolean getMaximized(@NotNull Out<Boolean> maximized) {
        MemorySegment maximizedPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_layout_get_maximized.invokeExact(handle(), (Addressable) maximizedPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        maximized.set(maximizedPOINTER.get(ValueLayout.JAVA_INT, 0) != 0);
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_toplevel_layout_get_resizable = Interop.downcallHandle(
        "gdk_toplevel_layout_get_resizable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the layout should allow the user
     * to resize the surface.
     */
    public boolean getResizable() {
        int RESULT;
        try {
            RESULT = (int) gdk_toplevel_layout_get_resizable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_toplevel_layout_ref = Interop.downcallHandle(
        "gdk_toplevel_layout_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code layout}.
     */
    public @NotNull ToplevelLayout ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_toplevel_layout_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ToplevelLayout(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_toplevel_layout_set_fullscreen = Interop.downcallHandle(
        "gdk_toplevel_layout_set_fullscreen",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets whether the layout should cause the surface
     * to be fullscreen when presented.
     */
    public @NotNull void setFullscreen(@NotNull boolean fullscreen, @Nullable Monitor monitor) {
        try {
            gdk_toplevel_layout_set_fullscreen.invokeExact(handle(), fullscreen ? 1 : 0, monitor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_toplevel_layout_set_maximized = Interop.downcallHandle(
        "gdk_toplevel_layout_set_maximized",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the layout should cause the surface
     * to be maximized when presented.
     */
    public @NotNull void setMaximized(@NotNull boolean maximized) {
        try {
            gdk_toplevel_layout_set_maximized.invokeExact(handle(), maximized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_toplevel_layout_set_resizable = Interop.downcallHandle(
        "gdk_toplevel_layout_set_resizable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the layout should allow the user
     * to resize the surface after it has been presented.
     */
    public @NotNull void setResizable(@NotNull boolean resizable) {
        try {
            gdk_toplevel_layout_set_resizable.invokeExact(handle(), resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_toplevel_layout_unref = Interop.downcallHandle(
        "gdk_toplevel_layout_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code layout}.
     */
    public @NotNull void unref() {
        try {
            gdk_toplevel_layout_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
