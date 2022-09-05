package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `PangoRenderer` is a base class for objects that can render text
 * provided as `PangoGlyphString` or `PangoLayout`.
 * 
 * By subclassing `PangoRenderer` and overriding operations such as
 * @draw_glyphs and @draw_rectangle, renderers for particular font
 * backends and destinations can be created.
 */
public class Renderer extends org.gtk.gobject.Object {

    public Renderer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Renderer */
    public static Renderer castFrom(org.gtk.gobject.Object gobject) {
        return new Renderer(gobject.getProxy());
    }
    
    /**
     * Does initial setup before rendering operations on @renderer.
     * 
     * [method@Pango.Renderer.deactivate] should be called when done drawing.
     * Calls such as [method@Pango.Renderer.draw_layout] automatically
     * activate the layout before drawing on it.
     * 
     * Calls to [method@Pango.Renderer.activate] and
     * [method@Pango.Renderer.deactivate] can be nested and the
     * renderer will only be initialized and deinitialized once.
     */
    public void activate() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_activate(HANDLE());
    }
    
    /**
     * Cleans up after rendering operations on @renderer.
     * 
     * See docs for [method@Pango.Renderer.activate].
     */
    public void deactivate() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_deactivate(HANDLE());
    }
    
    /**
     * Draw a squiggly line that approximately covers the given rectangle
     * in the style of an underline used to indicate a spelling error.
     * 
     * The width of the underline is rounded to an integer number
     * of up/down segments and the resulting rectangle is centered
     * in the original rectangle.
     * 
     * This should be called while @renderer is already active.
     * Use [method@Pango.Renderer.activate] to activate a renderer.
     */
    public void drawErrorUnderline(int x, int y, int width, int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_error_underline(HANDLE(), x, y, width, height);
    }
    
    /**
     * Draws a single glyph with coordinates in device space.
     */
    public void drawGlyph(Font font, Glyph glyph, double x, double y) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_glyph(HANDLE(), font.HANDLE(), glyph.getValue(), x, y);
    }
    
    /**
     * Draws the glyphs in @glyph_item with the specified `PangoRenderer`,
     * embedding the text associated with the glyphs in the output if the
     * output format supports it.
     * 
     * This is useful for rendering text in PDF.
     * 
     * Note that this method does not handle attributes in @glyph_item.
     * If you want colors, shapes and lines handled automatically according
     * to those attributes, you need to use pango_renderer_draw_layout_line()
     * or pango_renderer_draw_layout().
     * 
     * Note that @text is the start of the text for layout, which is then
     * indexed by `glyph_item->item->offset`.
     * 
     * If @text is %NULL, this simply calls [method@Pango.Renderer.draw_glyphs].
     * 
     * The default implementation of this method simply falls back to
     * [method@Pango.Renderer.draw_glyphs].
     */
    public void drawGlyphItem(java.lang.String text, GlyphItem glyphItem, int x, int y) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_glyph_item(HANDLE(), Interop.getAllocator().allocateUtf8String(text), glyphItem.HANDLE(), x, y);
    }
    
    /**
     * Draws the glyphs in @glyphs with the specified `PangoRenderer`.
     */
    public void drawGlyphs(Font font, GlyphString glyphs, int x, int y) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_glyphs(HANDLE(), font.HANDLE(), glyphs.HANDLE(), x, y);
    }
    
    /**
     * Draws @layout with the specified `PangoRenderer`.
     * 
     * This is equivalent to drawing the lines of the layout, at their
     * respective positions relative to @x, @y.
     */
    public void drawLayout(Layout layout, int x, int y) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_layout(HANDLE(), layout.HANDLE(), x, y);
    }
    
    /**
     * Draws @line with the specified `PangoRenderer`.
     * 
     * This draws the glyph items that make up the line, as well as
     * shapes, backgrounds and lines that are specified by the attributes
     * of those items.
     */
    public void drawLayoutLine(LayoutLine line, int x, int y) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_layout_line(HANDLE(), line.HANDLE(), x, y);
    }
    
    /**
     * Draws an axis-aligned rectangle in user space coordinates with the
     * specified `PangoRenderer`.
     * 
     * This should be called while @renderer is already active.
     * Use [method@Pango.Renderer.activate] to activate a renderer.
     */
    public void drawRectangle(RenderPart part, int x, int y, int width, int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_rectangle(HANDLE(), part.getValue(), x, y, width, height);
    }
    
    /**
     * Draws a trapezoid with the parallel sides aligned with the X axis
     * using the given `PangoRenderer`; coordinates are in device space.
     */
    public void drawTrapezoid(RenderPart part, double y1, double x11, double x21, double y2, double x12, double x22) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_draw_trapezoid(HANDLE(), part.getValue(), y1, x11, x21, y2, x12, x22);
    }
    
    /**
     * Gets the current alpha for the specified part.
     */
    public short getAlpha(RenderPart part) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_get_alpha(HANDLE(), part.getValue());
        return RESULT;
    }
    
    /**
     * Gets the current rendering color for the specified part.
     */
    public Color getColor(RenderPart part) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_get_color(HANDLE(), part.getValue());
        return new Color(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the layout currently being rendered using @renderer.
     * 
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     * 
     * The returned layout should not be modified while still being
     * rendered.
     */
    public Layout getLayout() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_get_layout(HANDLE());
        return new Layout(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the layout line currently being rendered using @renderer.
     * 
     * Calling this function only makes sense from inside a subclass's
     * methods, like in its draw_shape vfunc, for example.
     * 
     * The returned layout line should not be modified while still being
     * rendered.
     */
    public LayoutLine getLayoutLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_get_layout_line(HANDLE());
        return new LayoutLine(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering.
     * 
     * See [method@Pango.Renderer.set_matrix].
     */
    public Matrix getMatrix() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_get_matrix(HANDLE());
        return new Matrix(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Informs Pango that the way that the rendering is done
     * for @part has changed.
     * 
     * This should be called if the rendering changes in a way that would
     * prevent multiple pieces being joined together into one drawing call.
     * For instance, if a subclass of `PangoRenderer` was to add a stipple
     * option for drawing underlines, it needs to call
     * 
     * ```
     * pango_renderer_part_changed (render, PANGO_RENDER_PART_UNDERLINE);
     * ```
     * 
     * When the stipple changes or underlines with different stipples
     * might be joined together. Pango automatically calls this for
     * changes to colors. (See [method@Pango.Renderer.set_color])
     */
    public void partChanged(RenderPart part) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_part_changed(HANDLE(), part.getValue());
    }
    
    /**
     * Sets the alpha for part of the rendering.
     * 
     * Note that the alpha may only be used if a color is
     * specified for @part as well.
     */
    public void setAlpha(RenderPart part, short alpha) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_set_alpha(HANDLE(), part.getValue(), alpha);
    }
    
    /**
     * Sets the color for part of the rendering.
     * 
     * Also see [method@Pango.Renderer.set_alpha].
     */
    public void setColor(RenderPart part, Color color) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_set_color(HANDLE(), part.getValue(), color.HANDLE());
    }
    
    /**
     * Sets the transformation matrix that will be applied when rendering.
     */
    public void setMatrix(Matrix matrix) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_renderer_set_matrix(HANDLE(), matrix.HANDLE());
    }
    
}
