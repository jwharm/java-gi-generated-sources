package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoFont} is used to represent a font in a
 * rendering-system-independent manner.
 */
public class Font extends org.gtk.gobject.Object {

    public Font(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Font */
    public static Font castFrom(org.gtk.gobject.Object gobject) {
        return new Font(gobject.getReference());
    }
    
    /**
     * Returns a description of the font, with font size set in points.
     * <p>
     * Use {@link Font#describeWithAbsoluteSize} if you want
     * the font size in device units.
     */
    public FontDescription describe() {
        var RESULT = gtk_h.pango_font_describe(handle());
        return new FontDescription(References.get(RESULT, true));
    }
    
    /**
     * Returns a description of the font, with absolute font size set
     * in device units.
     * <p>
     * Use {@link Font#describe} if you want the font size in points.
     */
    public FontDescription describeWithAbsoluteSize() {
        var RESULT = gtk_h.pango_font_describe_with_absolute_size(handle());
        return new FontDescription(References.get(RESULT, true));
    }
    
    /**
     * Computes the coverage map for a given font and language tag.
     */
    public Coverage getCoverage(Language language) {
        var RESULT = gtk_h.pango_font_get_coverage(handle(), language.handle());
        return new Coverage(References.get(RESULT, true));
    }
    
    /**
     * Gets the {@code PangoFontFace} to which {@code font} belongs.
     */
    public FontFace getFace() {
        var RESULT = gtk_h.pango_font_get_face(handle());
        return new FontFace(References.get(RESULT, false));
    }
    
    /**
     * Gets the font map for which the font was created.
     * <p>
     * Note that the font maintains a <strong>weak</strong> reference to
     * the font map, so if all references to font map are
     * dropped, the font map will be finalized even if there
     * are fonts created with the font map that are still alive.
     * In that case this function will return <code>null</code>.
     * <p>
     * It is the responsibility of the user to ensure that the
     * font map is kept alive. In most uses this is not an issue
     * as a {@code PangoContext} holds a reference to the font map.
     */
    public FontMap getFontMap() {
        var RESULT = gtk_h.pango_font_get_font_map(handle());
        return new FontMap(References.get(RESULT, false));
    }
    
    /**
     * Gets the logical and ink extents of a glyph within a font.
     * <p>
     * The coordinate system for each rectangle has its origin at the
     * base line and horizontal origin of the character with increasing
     * coordinates extending to the right and down. The macros PANGO_ASCENT(),
     * PANGO_DESCENT(), PANGO_LBEARING(), and PANGO_RBEARING() can be used to convert
     * from the extents rectangle to more traditional font metrics. The units
     * of the rectangles are in 1/PANGO_SCALE of a device unit.
     * <p>
     * If {@code font} is <code>null</code>, this function gracefully sets some sane values in the
     * output variables and returns.
     */
    public void getGlyphExtents(Glyph glyph, Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_font_get_glyph_extents(handle(), glyph.getValue(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Get a {@code hb_font_t} object backing this font.
     * <p>
     * Note that the objects returned by this function are cached
     * and immutable. If you need to make changes to the {@code hb_font_t},
     * use <a href="https://harfbuzz.github.io/harfbuzz-hb-font.html#hb-font-create-sub-font">hb_font_create_sub_font()</a>.
     */
    public org.harfbuzz.FontT getHbFont() {
        var RESULT = gtk_h.pango_font_get_hb_font(handle());
        return new org.harfbuzz.FontT(References.get(RESULT, false));
    }
    
    /**
     * Gets overall metric information for a font.
     * <p>
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * <p>
     * If {@code font} is <code>null</code>, this function gracefully sets some sane values in the
     * output variables and returns.
     */
    public FontMetrics getMetrics(Language language) {
        var RESULT = gtk_h.pango_font_get_metrics(handle(), language.handle());
        return new FontMetrics(References.get(RESULT, true));
    }
    
    /**
     * Returns whether the font provides a glyph for this character.
     */
    public boolean hasChar(int wc) {
        var RESULT = gtk_h.pango_font_has_char(handle(), wc);
        return (RESULT != 0);
    }
    
    /**
     * Serializes the {@code font} in a way that can be uniquely identified.
     * <p>
     * There are no guarantees about the format of the output across different
     * versions of Pango.
     * <p>
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     * <p>
     * To recreate a font from its serialized form, use {@link Pango#Font}.
     */
    public org.gtk.glib.Bytes serialize() {
        var RESULT = gtk_h.pango_font_serialize(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Frees an array of font descriptions.
     */
    public static void descriptionsFree(FontDescription[] descs, int nDescs) {
        gtk_h.pango_font_descriptions_free(Interop.allocateNativeArray(descs).handle(), nDescs);
    }
    
    /**
     * Loads data previously created via {@link Font#serialize}.
     * <p>
     * For a discussion of the supported format, see that function.
     * <p>
     * Note: to verify that the returned font is identical to
     * the one that was serialized, you can compare {@code bytes} to the
     * result of serializing the font again.
     */
    public static Font deserialize(Context context, org.gtk.glib.Bytes bytes) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.pango_font_deserialize(context.handle(), bytes.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Font(References.get(RESULT, true));
    }
    
}
