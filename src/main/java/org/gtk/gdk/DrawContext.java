package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for objects implementing different rendering methods.
 * <p>
 * {@code GdkDrawContext} is the base object used by contexts implementing different
 * rendering methods, such as {@code Gdk.GLContext}.
 * It provides shared functionality between those contexts.
 * <p>
 * You will always interact with one of those subclasses.
 * <p>
 * A {@code GdkDrawContext} is always associated with a single toplevel surface.
 */
public class DrawContext extends org.gtk.gobject.Object {

    public DrawContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DrawContext */
    public static DrawContext castFrom(org.gtk.gobject.Object gobject) {
        return new DrawContext(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_draw_context_begin_frame = Interop.downcallHandle(
        "gdk_draw_context_begin_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Indicates that you are beginning the process of redrawing {@code region}
     * on the {@code context}'s surface.
     * <p>
     * Calling this function begins a drawing operation using {@code context} on the
     * surface that {@code context} was created from. The actual requirements and
     * guarantees for the drawing operation vary for different implementations
     * of drawing, so a {@code Gdk.GLContext}
     * need to be treated differently.
     * <p>
     * A call to this function is a requirement for drawing and must be
     * followed by a call to {@link DrawContext#endFrame}, which will
     * complete the drawing operation and ensure the contents become visible
     * on screen.
     * <p>
     * Note that the {@code region} passed to this function is the minimum region that
     * needs to be drawn and depending on implementation, windowing system and
     * hardware in use, it might be necessary to draw a larger region. Drawing
     * implementation must use {@link DrawContext#getFrameRegion} to
     * query the region that must be drawn.
     * <p>
     * When using GTK, the widget system automatically places calls to
     * gdk_draw_context_begin_frame() and gdk_draw_context_end_frame() via the
     * use of {@link org.gtk.gsk.Renderer}s, so application code does not need to call
     * these functions explicitly.
     */
    public @NotNull void beginFrame(@NotNull org.cairographics.Region region) {
        try {
            gdk_draw_context_begin_frame.invokeExact(handle(), region.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_draw_context_end_frame = Interop.downcallHandle(
        "gdk_draw_context_end_frame",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ends a drawing operation started with gdk_draw_context_begin_frame().
     * <p>
     * This makes the drawing available on screen.
     * See {@link DrawContext#beginFrame} for more details about drawing.
     * <p>
     * When using a {@link GLContext}, this function may call {@code glFlush()}
     * implicitly before returning; it is not recommended to call {@code glFlush()}
     * explicitly before calling this function.
     */
    public @NotNull void endFrame() {
        try {
            gdk_draw_context_end_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_draw_context_get_display = Interop.downcallHandle(
        "gdk_draw_context_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GdkDisplay} the {@code context} is created for
     */
    public @Nullable Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_draw_context_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Display(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_draw_context_get_frame_region = Interop.downcallHandle(
        "gdk_draw_context_get_frame_region",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the region that is currently being repainted.
     * <p>
     * After a call to {@link DrawContext#beginFrame} this function will
     * return a union of the region passed to that function and the area of the
     * surface that the {@code context} determined needs to be repainted.
     * <p>
     * If {@code context} is not in between calls to {@link DrawContext#beginFrame}
     * and {@link DrawContext#endFrame}, {@code null} will be returned.
     */
    public @Nullable org.cairographics.Region getFrameRegion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_draw_context_get_frame_region.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Region(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_draw_context_get_surface = Interop.downcallHandle(
        "gdk_draw_context_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the surface that {@code context} is bound to.
     */
    public @Nullable Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_draw_context_get_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Surface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_draw_context_is_in_frame = Interop.downcallHandle(
        "gdk_draw_context_is_in_frame",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code context} is in the process of drawing to its surface.
     * <p>
     * This is the case between calls to {@link DrawContext#beginFrame}
     * and {@link DrawContext#endFrame}. In this situation, drawing commands
     * may be effecting the contents of the {@code context}'s surface.
     */
    public boolean isInFrame() {
        int RESULT;
        try {
            RESULT = (int) gdk_draw_context_is_in_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
