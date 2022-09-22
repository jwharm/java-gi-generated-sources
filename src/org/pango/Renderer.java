package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public Renderer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Renderer */
    public static Renderer castFrom(org.gtk.gobject.Object gobject) {
        return new Renderer(gobject.getReference());
    }
    
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
        gtk_h.pango_renderer_activate(handle());
    }
    
    /**
     * Cleans up after rendering operations on {@code renderer}.
     * <p>
     * See docs for {@link Renderer#activate}.
     */
    public void deactivate() {
        gtk_h.pango_renderer_deactivate(handle());
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
     */
    public void drawErrorUnderline(int x, int y, int width, int height) {
        gtk_h.pango_renderer_draw_error_underline(handle(), x, y, width, height);
    }
    
    /**
     * Draws a single glyph with coordinates in device space.
     */
    public void drawGlyph(Font font, Glyph glyph, double x, double y) {
        gtk_h.pango_renderer_draw_glyph(handle(), font.handle(), glyph.getValue(), x, y);
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
     * If {@code text} is <code>null</code>, this simply calls {@link Renderer#drawGlyphs}.
     * <p>
     * The default implementation of this method simply falls back to
     * {@link Renderer#drawGlyphs}.
     */
    public void drawGlyphItem(java.lang.String text, GlyphItem glyphItem, int x, int y) {
        gtk_h.pango_renderer_draw_glyph_item(handle(), Interop.allocateNativeString(text).handle(), glyphItem.handle(), x, y);
    }
    
    /**
     * Draws the glyphs in {@code glyphs} with the specified {@code PangoRenderer}.
     */
    public void drawGlyphs(Font font, GlyphString glyphs, int x, int y) {
        gtk_h.pango_renderer_draw_glyphs(handle(), font.handle(), glyphs.handle(), x, y);
    }
    
    /**
     * Draws {@code layout} with the specified {@code PangoRenderer}.
     * <p>
     * This is equivalent to drawing the lines of the layout, at their
     * respective positions relative to @x, @y.
     */
    public void drawLayout(Layout layout, int x, int y) {
        gtk_h.pango_renderer_draw_layout(handle(), layout.handle(), x, y);
    }
    
    /**
     * Draws {@code line} with the specified {@code PangoRenderer}.
     * <p>
     * This draws the glyph items that make up the line, as well as
     * shapes, backgrounds and lines that are specified by the attributes
     * of those items.
     */
    public void drawLayoutLine(LayoutLine line, int x, int y) {
        gtk_h.pango_renderer_draw_layout_line(handle(), line.handle(), x, y);
    }
    
    /**
     * Draws an axis-aligned rectangle in user space coordinates with the
     * specified {@code PangoRenderer}.
     * <p>
     * This should be called while {@code renderer} is already active.
     * Use {@link Renderer#activate} to activate a renderer.
     */
    public void drawRectangle(RenderPart part, int x, int y, int width, int height) {
        gtk_h.pango_renderer_draw_rectangle(handle(), part.getValue(), x, y, width, height);
    }
    
    /**
     * Draws a trapezoid with the parallel sides aligned with the X axis
     * using the given {@code PangoRenderer}; coordinates are in device space.
     */
    public void drawTrapezoid(RenderPart part, double y1, double x11, double x21, double y2, double x12, double x22) {
        gtk_h.pango_renderer_draw_trapezoid(handle(), part.getValue(), y1, x11, x21, y2, x12, x22);
    }
    
    /**
     * Gets the current alpha for the specified part.
     */
    public short getAlpha(RenderPart part) {
        var RESULT = gtk_h.pango_renderer_get_alpha(handle(), part.getValue());
        return RESULT;
    }
    
    /**
     * Gets the current rendering color for the specified part.
     */
    public Color getColor(RenderPart part) {
        var RESULT = gtk_h.pango_renderer_get_color(handle(), part.getValue());
        return new Color(References.get(RESULT, false));
    }
    
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
        var RESULT = gtk_h.pango_renderer_get_layout(handle());
        return new Layout(References.get(RESULT, false));
    }
    
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
        var RESULT = gtk_h.pango_renderer_get_layout_line(handle());
        return new LayoutLine(References.get(RESULT, false));
    }
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering.
     * <p>
     * See {@link Renderer#setMatrix}.
     */
    public Matrix getMatrix() {
        var RESULT = gtk_h.pango_renderer_get_matrix(handle());
        return new Matrix(References.get(RESULT, false));
    }
    
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
        gtk_h.pango_renderer_part_changed(handle(), part.getValue());
    }
    
    /**
     * Sets the alpha for part of the rendering.
     * <p>
     * Note that the alpha may only be used if a color is
     * specified for {@code part} as well.
     */
    public void setAlpha(RenderPart part, short alpha) {
        gtk_h.pango_renderer_set_alpha(handle(), part.getValue(), alpha);
    }
    
    /**
     * Sets the color for part of the rendering.
     * <p>
     * Also see {@link Renderer#setAlpha}.
     */
    public void setColor(RenderPart part, Color color) {
        gtk_h.pango_renderer_set_color(handle(), part.getValue(), color.handle());
    }
    
    /**
     * Sets the transformation matrix that will be applied when rendering.
     */
    public void setMatrix(Matrix matrix) {
        gtk_h.pango_renderer_set_matrix(handle(), matrix.handle());
    }
    
}
