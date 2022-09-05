package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoFont` is used to represent a font in a
 * rendering-system-independent manner.
 */
public class Font extends org.gtk.gobject.Object {

    public Font(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Font */
    public static Font castFrom(org.gtk.gobject.Object gobject) {
        return new Font(gobject.getProxy());
    }
    
    /**
     * Returns a description of the font, with font size set in points.
     * 
     * Use [method@Pango.Font.describe_with_absolute_size] if you want
     * the font size in device units.
     */
    public FontDescription describe() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_describe(HANDLE());
        return new FontDescription(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns a description of the font, with absolute font size set
     * in device units.
     * 
     * Use [method@Pango.Font.describe] if you want the font size in points.
     */
    public FontDescription describeWithAbsoluteSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_describe_with_absolute_size(HANDLE());
        return new FontDescription(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Computes the coverage map for a given font and language tag.
     */
    public Coverage getCoverage(Language language) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_get_coverage(HANDLE(), language.HANDLE());
        return new Coverage(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets the `PangoFontFace` to which @font belongs.
     */
    public FontFace getFace() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_get_face(HANDLE());
        return new FontFace(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the font map for which the font was created.
     * 
     * Note that the font maintains a *weak* reference to
     * the font map, so if all references to font map are
     * dropped, the font map will be finalized even if there
     * are fonts created with the font map that are still alive.
     * In that case this function will return %NULL.
     * 
     * It is the responsibility of the user to ensure that the
     * font map is kept alive. In most uses this is not an issue
     * as a `PangoContext` holds a reference to the font map.
     */
    public FontMap getFontMap() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_get_font_map(HANDLE());
        return new FontMap(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the logical and ink extents of a glyph within a font.
     * 
     * The coordinate system for each rectangle has its origin at the
     * base line and horizontal origin of the character with increasing
     * coordinates extending to the right and down. The macros PANGO_ASCENT(),
     * PANGO_DESCENT(), PANGO_LBEARING(), and PANGO_RBEARING() can be used to convert
     * from the extents rectangle to more traditional font metrics. The units
     * of the rectangles are in 1/PANGO_SCALE of a device unit.
     * 
     * If @font is %NULL, this function gracefully sets some sane values in the
     * output variables and returns.
     */
    public void getGlyphExtents(Glyph glyph, Rectangle inkRect, Rectangle logicalRect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_get_glyph_extents(HANDLE(), glyph.getValue(), inkRect.HANDLE(), logicalRect.HANDLE());
    }
    
    /**
     * Get a `hb_font_t` object backing this font.
     * 
     * Note that the objects returned by this function are cached
     * and immutable. If you need to make changes to the `hb_font_t`,
     * use [hb_font_create_sub_font()](https://harfbuzz.github.io/harfbuzz-hb-font.html#hb-font-create-sub-font).
     */
    public org.harfbuzz.FontT getHbFont() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_get_hb_font(HANDLE());
        return new org.harfbuzz.FontT(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets overall metric information for a font.
     * 
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * 
     * If @font is %NULL, this function gracefully sets some sane values in the
     * output variables and returns.
     */
    public FontMetrics getMetrics(Language language) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_get_metrics(HANDLE(), language.HANDLE());
        return new FontMetrics(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Returns whether the font provides a glyph for this character.
     */
    public boolean hasChar(int wc) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_has_char(HANDLE(), wc);
        return (RESULT != 0);
    }
    
    /**
     * Serializes the @font in a way that can be uniquely identified.
     * 
     * There are no guarantees about the format of the output across different
     * versions of Pango.
     * 
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     * 
     * To recreate a font from its serialized form, use [func@Pango.Font.deserialize].
     */
    public org.gtk.glib.Bytes serialize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_font_serialize(HANDLE());
        return new org.gtk.glib.Bytes(ProxyFactory.getProxy(RESULT, true));
    }
    
}
