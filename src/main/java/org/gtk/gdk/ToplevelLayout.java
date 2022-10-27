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
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ToplevelLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_toplevel_layout_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    
    /**
     * Create a new {@code GdkToplevelLayout} and copy the contents of {@code layout} into it.
     * @return a copy of {@code layout}.
     */
    public @NotNull org.gtk.gdk.ToplevelLayout copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_toplevel_layout_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ToplevelLayout(Refcounted.get(RESULT, true));
    }
    
    /**
     * Check whether {@code layout} and {@code other} has identical layout properties.
     * @param other another {@code GdkToplevelLayout}
     * @return {@code true} if {@code layout} and {@code other} have identical layout properties,
     *   otherwise {@code false}.
     */
    public boolean equal(@NotNull org.gtk.gdk.ToplevelLayout other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_layout_equal.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * If the layout specifies whether to the toplevel should go fullscreen,
     * the value pointed to by {@code fullscreen} is set to {@code true} if it should go
     * fullscreen, or {@code false}, if it should go unfullscreen.
     * @param fullscreen location to store whether the toplevel should be fullscreen
     * @return whether the {@code layout} specifies the fullscreen state for the toplevel
     */
    public boolean getFullscreen(Out<Boolean> fullscreen) {
        java.util.Objects.requireNonNull(fullscreen, "Parameter 'fullscreen' must not be null");
        MemorySegment fullscreenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_layout_get_fullscreen.invokeExact(handle(), (Addressable) fullscreenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        fullscreen.set(fullscreenPOINTER.get(ValueLayout.JAVA_INT, 0) != 0);
        return RESULT != 0;
    }
    
    /**
     * Returns the monitor that the layout is fullscreening
     * the surface on.
     * @return the monitor on which {@code layout} fullscreens
     */
    public @Nullable org.gtk.gdk.Monitor getFullscreenMonitor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_toplevel_layout_get_fullscreen_monitor.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Monitor(Refcounted.get(RESULT, false));
    }
    
    /**
     * If the layout specifies whether to the toplevel should go maximized,
     * the value pointed to by {@code maximized} is set to {@code true} if it should go
     * fullscreen, or {@code false}, if it should go unmaximized.
     * @param maximized set to {@code true} if the toplevel should be maximized
     * @return whether the {@code layout} specifies the maximized state for the toplevel
     */
    public boolean getMaximized(Out<Boolean> maximized) {
        java.util.Objects.requireNonNull(maximized, "Parameter 'maximized' must not be null");
        MemorySegment maximizedPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_layout_get_maximized.invokeExact(handle(), (Addressable) maximizedPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        maximized.set(maximizedPOINTER.get(ValueLayout.JAVA_INT, 0) != 0);
        return RESULT != 0;
    }
    
    /**
     * Returns whether the layout should allow the user
     * to resize the surface.
     * @return {@code true} if the layout is resizable
     */
    public boolean getResizable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_toplevel_layout_get_resizable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Increases the reference count of {@code layout}.
     * @return the same {@code layout}
     */
    public @NotNull org.gtk.gdk.ToplevelLayout ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_toplevel_layout_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ToplevelLayout(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets whether the layout should cause the surface
     * to be fullscreen when presented.
     * @param fullscreen {@code true} to fullscreen the surface
     * @param monitor the monitor to fullscreen on
     */
    public void setFullscreen(boolean fullscreen, @Nullable org.gtk.gdk.Monitor monitor) {
        java.util.Objects.requireNonNullElse(monitor, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_toplevel_layout_set_fullscreen.invokeExact(handle(), fullscreen ? 1 : 0, monitor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the layout should cause the surface
     * to be maximized when presented.
     * @param maximized {@code true} to maximize
     */
    public void setMaximized(boolean maximized) {
        try {
            DowncallHandles.gdk_toplevel_layout_set_maximized.invokeExact(handle(), maximized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the layout should allow the user
     * to resize the surface after it has been presented.
     * @param resizable {@code true} to allow resizing
     */
    public void setResizable(boolean resizable) {
        try {
            DowncallHandles.gdk_toplevel_layout_set_resizable.invokeExact(handle(), resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count of {@code layout}.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_toplevel_layout_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_toplevel_layout_new = Interop.downcallHandle(
            "gdk_toplevel_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_layout_copy = Interop.downcallHandle(
            "gdk_toplevel_layout_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_layout_equal = Interop.downcallHandle(
            "gdk_toplevel_layout_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_layout_get_fullscreen = Interop.downcallHandle(
            "gdk_toplevel_layout_get_fullscreen",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_toplevel_layout_get_fullscreen_monitor = Interop.downcallHandle(
            "gdk_toplevel_layout_get_fullscreen_monitor",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_layout_get_maximized = Interop.downcallHandle(
            "gdk_toplevel_layout_get_maximized",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_toplevel_layout_get_resizable = Interop.downcallHandle(
            "gdk_toplevel_layout_get_resizable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_layout_ref = Interop.downcallHandle(
            "gdk_toplevel_layout_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_layout_set_fullscreen = Interop.downcallHandle(
            "gdk_toplevel_layout_set_fullscreen",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_layout_set_maximized = Interop.downcallHandle(
            "gdk_toplevel_layout_set_maximized",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_toplevel_layout_set_resizable = Interop.downcallHandle(
            "gdk_toplevel_layout_set_resizable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_toplevel_layout_unref = Interop.downcallHandle(
            "gdk_toplevel_layout_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
