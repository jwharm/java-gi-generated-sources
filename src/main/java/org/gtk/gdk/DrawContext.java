package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for objects implementing different rendering methods.
 * <p>
 * {@code GdkDrawContext} is the base object used by contexts implementing different
 * rendering methods, such as {@link CairoContext}.
 * It provides shared functionality between those contexts.
 * <p>
 * You will always interact with one of those subclasses.
 * <p>
 * A {@code GdkDrawContext} is always associated with a single toplevel surface.
 */
public class DrawContext extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDrawContext";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DrawContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DrawContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DrawContext if its GType is a (or inherits from) "GdkDrawContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DrawContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkDrawContext", a ClassCastException will be thrown.
     */
    public static DrawContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkDrawContext"))) {
            return new DrawContext(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkDrawContext");
        }
    }
    
    /**
     * Indicates that you are beginning the process of redrawing {@code region}
     * on the {@code context}'s surface.
     * <p>
     * Calling this function begins a drawing operation using {@code context} on the
     * surface that {@code context} was created from. The actual requirements and
     * guarantees for the drawing operation vary for different implementations
     * of drawing, so a {@link CairoContext}
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
     * @param region minimum region that should be drawn
     */
    public void beginFrame(@NotNull org.cairographics.Region region) {
        java.util.Objects.requireNonNull(region, "Parameter 'region' must not be null");
        try {
            DowncallHandles.gdk_draw_context_begin_frame.invokeExact(
                    handle(),
                    region.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
    public void endFrame() {
        try {
            DowncallHandles.gdk_draw_context_end_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the {@code GdkDisplay} the {@code context} is created for
     * @return the {@code GdkDisplay}
     */
    public @Nullable org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_draw_context_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the region that is currently being repainted.
     * <p>
     * After a call to {@link DrawContext#beginFrame} this function will
     * return a union of the region passed to that function and the area of the
     * surface that the {@code context} determined needs to be repainted.
     * <p>
     * If {@code context} is not in between calls to {@link DrawContext#beginFrame}
     * and {@link DrawContext#endFrame}, {@code null} will be returned.
     * @return a Cairo region
     */
    public @Nullable org.cairographics.Region getFrameRegion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_draw_context_get_frame_region.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.cairographics.Region(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the surface that {@code context} is bound to.
     * @return a {@code GdkSurface}
     */
    public @Nullable org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_draw_context_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns {@code true} if {@code context} is in the process of drawing to its surface.
     * <p>
     * This is the case between calls to {@link DrawContext#beginFrame}
     * and {@link DrawContext#endFrame}. In this situation, drawing commands
     * may be effecting the contents of the {@code context}'s surface.
     * @return {@code true} if the context is between {@link DrawContext#beginFrame}
     *   and {@link DrawContext#endFrame} calls.
     */
    public boolean isInFrame() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_draw_context_is_in_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_draw_context_begin_frame = Interop.downcallHandle(
            "gdk_draw_context_begin_frame",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_draw_context_end_frame = Interop.downcallHandle(
            "gdk_draw_context_end_frame",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_draw_context_get_display = Interop.downcallHandle(
            "gdk_draw_context_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_draw_context_get_frame_region = Interop.downcallHandle(
            "gdk_draw_context_get_frame_region",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_draw_context_get_surface = Interop.downcallHandle(
            "gdk_draw_context_get_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_draw_context_is_in_frame = Interop.downcallHandle(
            "gdk_draw_context_is_in_frame",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
