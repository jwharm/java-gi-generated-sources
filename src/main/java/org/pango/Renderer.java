package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoRenderer} is a base class for objects that can render text
 * provided as {@code PangoGlyphString} or {@code PangoLayout}.
 * <p>
 * By subclassing {@code PangoRenderer} and overriding operations such as
 * {@code draw_glyphs} and {@code draw_rectangle}, renderers for particular font
 * backends and destinations can be created.
 * @version 1.8
 */
public class Renderer extends org.gtk.gobject.GObject {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoRenderer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_INT.withName("underline"),
            Interop.valueLayout.C_INT.withName("strikethrough"),
            Interop.valueLayout.C_INT.withName("active_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("matrix"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Renderer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Renderer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Renderer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Renderer(input);
    
    /**
     * Does initial setup before rendering operations on {@code renderer}.
     * <p>
     * {@link Renderer#deactivate} should be called when done drawing.
     * Calls such as {@link Renderer#drawLayout} automatically
     * activate the layout before drawing on it.
     * <p>
     * Calls to {@link Renderer#activate} and
     * {@link Renderer#deactivate} can be nested and the
     * renderer will only be initialized and deinitialized once.
     */
    public void activate() {
        try {
            DowncallHandles.pango_renderer_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Cleans up after rendering operations on {@code renderer}.
     * <p>
     * See docs for {@link Renderer#activate}.
     */
    public void deactivate() {
        try {
            DowncallHandles.pango_renderer_deactivate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draw a squiggly line that approximately covers the given rectangle
     * in the style of an underline used to indicate a spelling error.
     * <p>
     * The width of the underline is rounded to an integer number
     * of up/down segments and the resulting rectangle is centered
     * in the original rectangle.
     * <p>
     * This should be called while {@code renderer} is already active.
     * Use {@link Renderer#activate} to activate a renderer.
     * @param x X coordinate of underline, in Pango units in user coordinate system
     * @param y Y coordinate of underline, in Pango units in user coordinate system
     * @param width width of underline, in Pango units in user coordinate system
     * @param height height of underline, in Pango units in user coordinate system
     */
    public void drawErrorUnderline(int x, int y, int width, int height) {
        try {
            DowncallHandles.pango_renderer_draw_error_underline.invokeExact(
                    handle(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draws a single glyph with coordinates in device space.
     * @param font a {@code PangoFont}
     * @param glyph the glyph index of a single glyph
     * @param x X coordinate of left edge of baseline of glyph
     * @param y Y coordinate of left edge of baseline of glyph
     */
    public void drawGlyph(org.pango.Font font, org.pango.Glyph glyph, double x, double y) {
        try {
            DowncallHandles.pango_renderer_draw_glyph.invokeExact(
                    handle(),
                    font.handle(),
                    glyph.getValue().intValue(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draws the glyphs in {@code glyph_item} with the specified {@code PangoRenderer},
     * embedding the text associated with the glyphs in the output if the
     * output format supports it.
     * <p>
     * This is useful for rendering text in PDF.
     * <p>
     * Note that this method does not handle attributes in {@code glyph_item}.
     * If you want colors, shapes and lines handled automatically according
     * to those attributes, you need to use pango_renderer_draw_layout_line()
     * or pango_renderer_draw_layout().
     * <p>
     * Note that {@code text} is the start of the text for layout, which is then
     * indexed by {@code glyph_item->item->offset}.
     * <p>
     * If {@code text} is {@code null}, this simply calls {@link Renderer#drawGlyphs}.
     * <p>
     * The default implementation of this method simply falls back to
     * {@link Renderer#drawGlyphs}.
     * @param text the UTF-8 text that {@code glyph_item} refers to
     * @param glyphItem a {@code PangoGlyphItem}
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units
     */
    public void drawGlyphItem(@Nullable java.lang.String text, org.pango.GlyphItem glyphItem, int x, int y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.pango_renderer_draw_glyph_item.invokeExact(
                        handle(),
                        (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, SCOPE)),
                        glyphItem.handle(),
                        x,
                        y);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Draws the glyphs in {@code glyphs} with the specified {@code PangoRenderer}.
     * @param font a {@code PangoFont}
     * @param glyphs a {@code PangoGlyphString}
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units.
     */
    public void drawGlyphs(org.pango.Font font, org.pango.GlyphString glyphs, int x, int y) {
        try {
            DowncallHandles.pango_renderer_draw_glyphs.invokeExact(
                    handle(),
                    font.handle(),
                    glyphs.handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draws {@code layout} with the specified {@code PangoRenderer}.
     * <p>
     * This is equivalent to drawing the lines of the layout, at their
     * respective positions relative to {@code x}, {@code y}.
     * @param layout a {@code PangoLayout}
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units.
     */
    public void drawLayout(org.pango.Layout layout, int x, int y) {
        try {
            DowncallHandles.pango_renderer_draw_layout.invokeExact(
                    handle(),
                    layout.handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draws {@code line} with the specified {@code PangoRenderer}.
     * <p>
     * This draws the glyph items that make up the line, as well as
     * shapes, backgrounds and lines that are specified by the attributes
     * of those items.
     * @param line a {@code PangoLayoutLine}
     * @param x X position of left edge of baseline, in user space coordinates
     *   in Pango units.
     * @param y Y position of left edge of baseline, in user space coordinates
     *   in Pango units.
     */
    public void drawLayoutLine(org.pango.LayoutLine line, int x, int y) {
        try {
            DowncallHandles.pango_renderer_draw_layout_line.invokeExact(
                    handle(),
                    line.handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draws an axis-aligned rectangle in user space coordinates with the
     * specified {@code PangoRenderer}.
     * <p>
     * This should be called while {@code renderer} is already active.
     * Use {@link Renderer#activate} to activate a renderer.
     * @param part type of object this rectangle is part of
     * @param x X position at which to draw rectangle, in user space coordinates
     *   in Pango units
     * @param y Y position at which to draw rectangle, in user space coordinates
     *   in Pango units
     * @param width width of rectangle in Pango units
     * @param height height of rectangle in Pango units
     */
    public void drawRectangle(org.pango.RenderPart part, int x, int y, int width, int height) {
        try {
            DowncallHandles.pango_renderer_draw_rectangle.invokeExact(
                    handle(),
                    part.getValue(),
                    x,
                    y,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Draws a trapezoid with the parallel sides aligned with the X axis
     * using the given {@code PangoRenderer}; coordinates are in device space.
     * @param part type of object this trapezoid is part of
     * @param y1 Y coordinate of top of trapezoid
     * @param x11 X coordinate of left end of top of trapezoid
     * @param x21 X coordinate of right end of top of trapezoid
     * @param y2 Y coordinate of bottom of trapezoid
     * @param x12 X coordinate of left end of bottom of trapezoid
     * @param x22 X coordinate of right end of bottom of trapezoid
     */
    public void drawTrapezoid(org.pango.RenderPart part, double y1, double x11, double x21, double y2, double x12, double x22) {
        try {
            DowncallHandles.pango_renderer_draw_trapezoid.invokeExact(
                    handle(),
                    part.getValue(),
                    y1,
                    x11,
                    x21,
                    y2,
                    x12,
                    x22);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the current alpha for the specified part.
     * @param part the part to get the alpha for
     * @return the alpha for the specified part,
     *   or 0 if it hasn't been set and should be
     *   inherited from the environment.
     */
    public short getAlpha(org.pango.RenderPart part) {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.pango_renderer_get_alpha.invokeExact(
                    handle(),
                    part.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current rendering color for the specified part.
     * @param part the part to get the color for
     * @return the color for the
     *   specified part, or {@code null} if it hasn't been set and should be
     *   inherited from the environment.
     */
    public @Nullable org.pango.Color getColor(org.pango.RenderPart part) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_renderer_get_color.invokeExact(
                    handle(),
                    part.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Color.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the layout currently being rendered using {@code renderer}.
     * <p>
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     * <p>
     * The returned layout should not be modified while still being
     * rendered.
     * @return the layout, or {@code null} if
     *   no layout is being rendered using {@code renderer} at this time.
     */
    public @Nullable org.pango.Layout getLayout() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_renderer_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the layout line currently being rendered using {@code renderer}.
     * <p>
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     * <p>
     * The returned layout line should not be modified while still being
     * rendered.
     * @return the layout line, or {@code null}
     *   if no layout line is being rendered using {@code renderer} at this time.
     */
    public @Nullable org.pango.LayoutLine getLayoutLine() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_renderer_get_layout_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.LayoutLine.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering.
     * <p>
     * See {@link Renderer#setMatrix}.
     * @return the matrix, or {@code null} if no matrix has
     *   been set (which is the same as the identity matrix). The returned
     *   matrix is owned by Pango and must not be modified or freed.
     */
    public @Nullable org.pango.Matrix getMatrix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_renderer_get_matrix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Informs Pango that the way that the rendering is done
     * for {@code part} has changed.
     * <p>
     * This should be called if the rendering changes in a way that would
     * prevent multiple pieces being joined together into one drawing call.
     * For instance, if a subclass of {@code PangoRenderer} was to add a stipple
     * option for drawing underlines, it needs to call
     * <pre>{@code 
     * pango_renderer_part_changed (render, PANGO_RENDER_PART_UNDERLINE);
     * }</pre>
     * <p>
     * When the stipple changes or underlines with different stipples
     * might be joined together. Pango automatically calls this for
     * changes to colors. (See {@link Renderer#setColor})
     * @param part the part for which rendering has changed.
     */
    public void partChanged(org.pango.RenderPart part) {
        try {
            DowncallHandles.pango_renderer_part_changed.invokeExact(
                    handle(),
                    part.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the alpha for part of the rendering.
     * <p>
     * Note that the alpha may only be used if a color is
     * specified for {@code part} as well.
     * @param part the part to set the alpha for
     * @param alpha an alpha value between 1 and 65536, or 0 to unset the alpha
     */
    public void setAlpha(org.pango.RenderPart part, short alpha) {
        try {
            DowncallHandles.pango_renderer_set_alpha.invokeExact(
                    handle(),
                    part.getValue(),
                    alpha);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the color for part of the rendering.
     * <p>
     * Also see {@link Renderer#setAlpha}.
     * @param part the part to change the color of
     * @param color the new color or {@code null} to unset the current color
     */
    public void setColor(org.pango.RenderPart part, @Nullable org.pango.Color color) {
        try {
            DowncallHandles.pango_renderer_set_color.invokeExact(
                    handle(),
                    part.getValue(),
                    (Addressable) (color == null ? MemoryAddress.NULL : color.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the transformation matrix that will be applied when rendering.
     * @param matrix a {@code PangoMatrix}, or {@code null} to unset any existing matrix
     *  (No matrix set is the same as setting the identity matrix.)
     */
    public void setMatrix(@Nullable org.pango.Matrix matrix) {
        try {
            DowncallHandles.pango_renderer_set_matrix.invokeExact(
                    handle(),
                    (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_renderer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Renderer.Builder} object constructs a {@link Renderer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Renderer.Builder#build()}. 
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
         * Finish building the {@link Renderer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Renderer}.
         * @return A new instance of {@code Renderer} with the properties 
         *         that were set in the Builder object.
         */
        public Renderer build() {
            return (Renderer) org.gtk.gobject.GObject.newWithProperties(
                Renderer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_renderer_activate = Interop.downcallHandle(
                "pango_renderer_activate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_renderer_deactivate = Interop.downcallHandle(
                "pango_renderer_deactivate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_error_underline = Interop.downcallHandle(
                "pango_renderer_draw_error_underline",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_glyph = Interop.downcallHandle(
                "pango_renderer_draw_glyph",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_glyph_item = Interop.downcallHandle(
                "pango_renderer_draw_glyph_item",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_glyphs = Interop.downcallHandle(
                "pango_renderer_draw_glyphs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_layout = Interop.downcallHandle(
                "pango_renderer_draw_layout",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_layout_line = Interop.downcallHandle(
                "pango_renderer_draw_layout_line",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_rectangle = Interop.downcallHandle(
                "pango_renderer_draw_rectangle",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_draw_trapezoid = Interop.downcallHandle(
                "pango_renderer_draw_trapezoid",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle pango_renderer_get_alpha = Interop.downcallHandle(
                "pango_renderer_get_alpha",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_get_color = Interop.downcallHandle(
                "pango_renderer_get_color",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_get_layout = Interop.downcallHandle(
                "pango_renderer_get_layout",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_renderer_get_layout_line = Interop.downcallHandle(
                "pango_renderer_get_layout_line",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_renderer_get_matrix = Interop.downcallHandle(
                "pango_renderer_get_matrix",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_renderer_part_changed = Interop.downcallHandle(
                "pango_renderer_part_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_renderer_set_alpha = Interop.downcallHandle(
                "pango_renderer_set_alpha",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT),
                false
        );
        
        private static final MethodHandle pango_renderer_set_color = Interop.downcallHandle(
                "pango_renderer_set_color",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_renderer_set_matrix = Interop.downcallHandle(
                "pango_renderer_set_matrix",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_renderer_get_type = Interop.downcallHandle(
                "pango_renderer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.pango_renderer_get_type != null;
    }
}
