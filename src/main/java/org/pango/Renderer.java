package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code PangoRenderer} is a base class for objects that can render text
 * provided as {@code PangoGlyphString} or {@code PangoLayout}.
 * <p>
 * By subclassing {@code PangoRenderer} and overriding operations such as
 * {@code draw_glyphs} and {@code draw_rectangle}, renderers for particular font
 * backends and destinations can be created.
 */
public class Renderer extends org.gtk.gobject.Object {

    public Renderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Renderer */
    public static Renderer castFrom(org.gtk.gobject.Object gobject) {
        return new Renderer(gobject.refcounted());
    }
    
    static final MethodHandle pango_renderer_activate = Interop.downcallHandle(
        "pango_renderer_activate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            pango_renderer_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_deactivate = Interop.downcallHandle(
        "pango_renderer_deactivate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Cleans up after rendering operations on {@code renderer}.
     * <p>
     * See docs for {@link Renderer#activate}.
     */
    public void deactivate() {
        try {
            pango_renderer_deactivate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_error_underline = Interop.downcallHandle(
        "pango_renderer_draw_error_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void drawErrorUnderline(int x, int y, int width, int height) {
        try {
            pango_renderer_draw_error_underline.invokeExact(handle(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_glyph = Interop.downcallHandle(
        "pango_renderer_draw_glyph",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Draws a single glyph with coordinates in device space.
     */
    public void drawGlyph(Font font, Glyph glyph, double x, double y) {
        try {
            pango_renderer_draw_glyph.invokeExact(handle(), font.handle(), glyph.getValue(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_glyph_item = Interop.downcallHandle(
        "pango_renderer_draw_glyph_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void drawGlyphItem(java.lang.String text, GlyphItem glyphItem, int x, int y) {
        try {
            pango_renderer_draw_glyph_item.invokeExact(handle(), Interop.allocateNativeString(text).handle(), glyphItem.handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_glyphs = Interop.downcallHandle(
        "pango_renderer_draw_glyphs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Draws the glyphs in {@code glyphs} with the specified {@code PangoRenderer}.
     */
    public void drawGlyphs(Font font, GlyphString glyphs, int x, int y) {
        try {
            pango_renderer_draw_glyphs.invokeExact(handle(), font.handle(), glyphs.handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_layout = Interop.downcallHandle(
        "pango_renderer_draw_layout",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Draws {@code layout} with the specified {@code PangoRenderer}.
     * <p>
     * This is equivalent to drawing the lines of the layout, at their
     * respective positions relative to @x, @y.
     */
    public void drawLayout(Layout layout, int x, int y) {
        try {
            pango_renderer_draw_layout.invokeExact(handle(), layout.handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_layout_line = Interop.downcallHandle(
        "pango_renderer_draw_layout_line",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Draws {@code line} with the specified {@code PangoRenderer}.
     * <p>
     * This draws the glyph items that make up the line, as well as
     * shapes, backgrounds and lines that are specified by the attributes
     * of those items.
     */
    public void drawLayoutLine(LayoutLine line, int x, int y) {
        try {
            pango_renderer_draw_layout_line.invokeExact(handle(), line.handle(), x, y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_rectangle = Interop.downcallHandle(
        "pango_renderer_draw_rectangle",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Draws an axis-aligned rectangle in user space coordinates with the
     * specified {@code PangoRenderer}.
     * <p>
     * This should be called while {@code renderer} is already active.
     * Use {@link Renderer#activate} to activate a renderer.
     */
    public void drawRectangle(RenderPart part, int x, int y, int width, int height) {
        try {
            pango_renderer_draw_rectangle.invokeExact(handle(), part.getValue(), x, y, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_draw_trapezoid = Interop.downcallHandle(
        "pango_renderer_draw_trapezoid",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Draws a trapezoid with the parallel sides aligned with the X axis
     * using the given {@code PangoRenderer}; coordinates are in device space.
     */
    public void drawTrapezoid(RenderPart part, double y1, double x11, double x21, double y2, double x12, double x22) {
        try {
            pango_renderer_draw_trapezoid.invokeExact(handle(), part.getValue(), y1, x11, x21, y2, x12, x22);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_get_alpha = Interop.downcallHandle(
        "pango_renderer_get_alpha",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the current alpha for the specified part.
     */
    public short getAlpha(RenderPart part) {
        try {
            var RESULT = (short) pango_renderer_get_alpha.invokeExact(handle(), part.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_get_color = Interop.downcallHandle(
        "pango_renderer_get_color",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the current rendering color for the specified part.
     */
    public Color getColor(RenderPart part) {
        try {
            var RESULT = (MemoryAddress) pango_renderer_get_color.invokeExact(handle(), part.getValue());
            return new Color(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_get_layout = Interop.downcallHandle(
        "pango_renderer_get_layout",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the layout currently being rendered using {@code renderer}.
     * <p>
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     * <p>
     * The returned layout should not be modified while still being
     * rendered.
     */
    public Layout getLayout() {
        try {
            var RESULT = (MemoryAddress) pango_renderer_get_layout.invokeExact(handle());
            return new Layout(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_get_layout_line = Interop.downcallHandle(
        "pango_renderer_get_layout_line",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the layout line currently being rendered using {@code renderer}.
     * <p>
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     * <p>
     * The returned layout line should not be modified while still being
     * rendered.
     */
    public LayoutLine getLayoutLine() {
        try {
            var RESULT = (MemoryAddress) pango_renderer_get_layout_line.invokeExact(handle());
            return new LayoutLine(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_get_matrix = Interop.downcallHandle(
        "pango_renderer_get_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering.
     * <p>
     * See {@link Renderer#setMatrix}.
     */
    public Matrix getMatrix() {
        try {
            var RESULT = (MemoryAddress) pango_renderer_get_matrix.invokeExact(handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_part_changed = Interop.downcallHandle(
        "pango_renderer_part_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Informs Pango that the way that the rendering is done
     * for {@code part} has changed.
     * <p>
     * This should be called if the rendering changes in a way that would
     * prevent multiple pieces being joined together into one drawing call.
     * For instance, if a subclass of {@code PangoRenderer} was to add a stipple
     * option for drawing underlines, it needs to call
     * <p>
     * <pre>{@code 
     * pango_renderer_part_changed (render, PANGO_RENDER_PART_UNDERLINE);
     * }</pre>
     * <p>
     * When the stipple changes or underlines with different stipples
     * might be joined together. Pango automatically calls this for
     * changes to colors. (See {@link Renderer#setColor})
     */
    public void partChanged(RenderPart part) {
        try {
            pango_renderer_part_changed.invokeExact(handle(), part.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_set_alpha = Interop.downcallHandle(
        "pango_renderer_set_alpha",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Sets the alpha for part of the rendering.
     * <p>
     * Note that the alpha may only be used if a color is
     * specified for {@code part} as well.
     */
    public void setAlpha(RenderPart part, short alpha) {
        try {
            pango_renderer_set_alpha.invokeExact(handle(), part.getValue(), alpha);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_set_color = Interop.downcallHandle(
        "pango_renderer_set_color",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the color for part of the rendering.
     * <p>
     * Also see {@link Renderer#setAlpha}.
     */
    public void setColor(RenderPart part, Color color) {
        try {
            pango_renderer_set_color.invokeExact(handle(), part.getValue(), color.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_renderer_set_matrix = Interop.downcallHandle(
        "pango_renderer_set_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the transformation matrix that will be applied when rendering.
     */
    public void setMatrix(Matrix matrix) {
        try {
            pango_renderer_set_matrix.invokeExact(handle(), matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
