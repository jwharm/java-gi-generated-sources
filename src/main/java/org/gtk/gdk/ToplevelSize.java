package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkToplevelSize} struct contains information that is useful
 * to compute the size of a toplevel.
 */
public class ToplevelSize extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkToplevelSize";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ToplevelSize allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ToplevelSize newInstance = new ToplevelSize(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public ToplevelSize(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Retrieves the bounds the toplevel is placed within.
     * <p>
     * The bounds represent the largest size a toplevel may have while still being
     * able to fit within some type of boundary. Depending on the backend, this may
     * be equivalent to the dimensions of the work area or the monitor on which the
     * window is being presented on, or something else that limits the way a
     * toplevel can be presented.
     * @param boundsWidth return location for width
     * @param boundsHeight return location for height
     */
    public void getBounds(Out<Integer> boundsWidth, Out<Integer> boundsHeight) {
        java.util.Objects.requireNonNull(boundsWidth, "Parameter 'boundsWidth' must not be null");
        java.util.Objects.requireNonNull(boundsHeight, "Parameter 'boundsHeight' must not be null");
        MemorySegment boundsWidthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment boundsHeightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gdk_toplevel_size_get_bounds.invokeExact(
                    handle(),
                    (Addressable) boundsWidthPOINTER.address(),
                    (Addressable) boundsHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        boundsWidth.set(boundsWidthPOINTER.get(ValueLayout.JAVA_INT, 0));
        boundsHeight.set(boundsHeightPOINTER.get(ValueLayout.JAVA_INT, 0));
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
     * @param minWidth the minimum width
     * @param minHeight the minimum height
     */
    public void setMinSize(int minWidth, int minHeight) {
        try {
            DowncallHandles.gdk_toplevel_size_set_min_size.invokeExact(
                    handle(),
                    minWidth,
                    minHeight);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the shadows size of the toplevel.
     * <p>
     * The shadow width corresponds to the part of the computed surface size
     * that would consist of the shadow margin surrounding the window, would
     * there be any.
     * @param left width of the left part of the shadow
     * @param right width of the right part of the shadow
     * @param top height of the top part of the shadow
     * @param bottom height of the bottom part of the shadow
     */
    public void setShadowWidth(int left, int right, int top, int bottom) {
        try {
            DowncallHandles.gdk_toplevel_size_set_shadow_width.invokeExact(
                    handle(),
                    left,
                    right,
                    top,
                    bottom);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the size the toplevel prefers to be resized to.
     * <p>
     * The size should be within the bounds (see
     * {@link ToplevelSize#getBounds}). The set size should
     * be considered as a hint, and should not be assumed to be
     * respected by the windowing system, or backend.
     * @param width the width
     * @param height the height
     */
    public void setSize(int width, int height) {
        try {
            DowncallHandles.gdk_toplevel_size_set_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_toplevel_size_get_bounds = Interop.downcallHandle(
            "gdk_toplevel_size_get_bounds",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_toplevel_size_set_min_size = Interop.downcallHandle(
            "gdk_toplevel_size_set_min_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_toplevel_size_set_shadow_width = Interop.downcallHandle(
            "gdk_toplevel_size_set_shadow_width",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_toplevel_size_set_size = Interop.downcallHandle(
            "gdk_toplevel_size_set_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
    }
}
