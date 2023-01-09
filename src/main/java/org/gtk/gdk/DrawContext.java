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
public class DrawContext extends org.gtk.gobject.GObject {
    
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
     */
    protected DrawContext(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DrawContext> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DrawContext(input);
    
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
    public void beginFrame(org.cairographics.Region region) {
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
            DowncallHandles.gdk_draw_context_end_frame.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_draw_context_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_draw_context_get_frame_region.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.Region.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the surface that {@code context} is bound to.
     * @return a {@code GdkSurface}
     */
    public @Nullable org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_draw_context_get_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Surface) Interop.register(RESULT, org.gtk.gdk.Surface.fromAddress).marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gdk_draw_context_is_in_frame.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_draw_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DrawContext.Builder} object constructs a {@link DrawContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DrawContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DrawContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DrawContext}.
         * @return A new instance of {@code DrawContext} with the properties 
         *         that were set in the Builder object.
         */
        public DrawContext build() {
            return (DrawContext) org.gtk.gobject.GObject.newWithProperties(
                DrawContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GdkDisplay} used to create the {@code GdkDrawContext}.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The {@code GdkSurface} the context is bound to.
         * @param surface The value for the {@code surface} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSurface(org.gtk.gdk.Surface surface) {
            names.add("surface");
            values.add(org.gtk.gobject.Value.create(surface));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_draw_context_begin_frame = Interop.downcallHandle(
                "gdk_draw_context_begin_frame",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_draw_context_end_frame = Interop.downcallHandle(
                "gdk_draw_context_end_frame",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_draw_context_get_display = Interop.downcallHandle(
                "gdk_draw_context_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_draw_context_get_frame_region = Interop.downcallHandle(
                "gdk_draw_context_get_frame_region",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_draw_context_get_surface = Interop.downcallHandle(
                "gdk_draw_context_get_surface",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_draw_context_is_in_frame = Interop.downcallHandle(
                "gdk_draw_context_is_in_frame",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_draw_context_get_type = Interop.downcallHandle(
                "gdk_draw_context_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_draw_context_get_type != null;
    }
}
