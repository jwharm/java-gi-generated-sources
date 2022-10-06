package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoFont} is used to represent a font in a
 * rendering-system-independent manner.
 */
public class Font extends org.gtk.gobject.Object {

    public Font(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Font */
    public static Font castFrom(org.gtk.gobject.Object gobject) {
        return new Font(gobject.refcounted());
    }
    
    static final MethodHandle pango_font_describe = Interop.downcallHandle(
        "pango_font_describe",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a description of the font, with font size set in points.
     * <p>
     * Use {@link Font#describeWithAbsoluteSize} if you want
     * the font size in device units.
     */
    public FontDescription describe() {
        try {
            var RESULT = (MemoryAddress) pango_font_describe.invokeExact(handle());
            return new FontDescription(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_describe_with_absolute_size = Interop.downcallHandle(
        "pango_font_describe_with_absolute_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a description of the font, with absolute font size set
     * in device units.
     * <p>
     * Use {@link Font#describe} if you want the font size in points.
     */
    public FontDescription describeWithAbsoluteSize() {
        try {
            var RESULT = (MemoryAddress) pango_font_describe_with_absolute_size.invokeExact(handle());
            return new FontDescription(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_coverage = Interop.downcallHandle(
        "pango_font_get_coverage",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the coverage map for a given font and language tag.
     */
    public Coverage getCoverage(Language language) {
        try {
            var RESULT = (MemoryAddress) pango_font_get_coverage.invokeExact(handle(), language.handle());
            return new Coverage(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_face = Interop.downcallHandle(
        "pango_font_get_face",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoFontFace} to which {@code font} belongs.
     */
    public FontFace getFace() {
        try {
            var RESULT = (MemoryAddress) pango_font_get_face.invokeExact(handle());
            return new FontFace(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_features = Interop.downcallHandle(
        "pango_font_get_features",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtain the OpenType features that are provided by the font.
     * <p>
     * These are passed to the rendering system, together with features
     * that have been explicitly set via attributes.
     * <p>
     * Note that this does not include OpenType features which the
     * rendering system enables by default.
     */
    public void getFeatures(PointerProxy<org.harfbuzz.FeatureT> features, int len, PointerInteger numFeatures) {
        try {
            pango_font_get_features.invokeExact(handle(), features.handle(), len, numFeatures.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_font_map = Interop.downcallHandle(
        "pango_font_get_font_map",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the font map for which the font was created.
     * <p>
     * Note that the font maintains a <strong>weak</strong> reference to
     * the font map, so if all references to font map are
     * dropped, the font map will be finalized even if there
     * are fonts created with the font map that are still alive.
     * In that case this function will return {@code null}.
     * <p>
     * It is the responsibility of the user to ensure that the
     * font map is kept alive. In most uses this is not an issue
     * as a {@code PangoContext} holds a reference to the font map.
     */
    public FontMap getFontMap() {
        try {
            var RESULT = (MemoryAddress) pango_font_get_font_map.invokeExact(handle());
            return new FontMap(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_glyph_extents = Interop.downcallHandle(
        "pango_font_get_glyph_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * If {@code font} is {@code null}, this function gracefully sets some sane values in the
     * output variables and returns.
     */
    public void getGlyphExtents(Glyph glyph, Rectangle inkRect, Rectangle logicalRect) {
        try {
            pango_font_get_glyph_extents.invokeExact(handle(), glyph.getValue(), inkRect.handle(), logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_hb_font = Interop.downcallHandle(
        "pango_font_get_hb_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get a {@code hb_font_t} object backing this font.
     * <p>
     * Note that the objects returned by this function are cached
     * and immutable. If you need to make changes to the {@code hb_font_t},
     * use <a href="https://harfbuzz.github.io/harfbuzz-hb-font.html#hb-font-create-sub-font">hb_font_create_sub_font()</a>.
     */
    public org.harfbuzz.FontT getHbFont() {
        try {
            var RESULT = (MemoryAddress) pango_font_get_hb_font.invokeExact(handle());
            return new org.harfbuzz.FontT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_languages = Interop.downcallHandle(
        "pango_font_get_languages",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the languages that are supported by {@code font}.
     * <p>
     * If the font backend does not provide this information,
     * {@code null} is returned. For the fontconfig backend, this
     * corresponds to the FC_LANG member of the FcPattern.
     * <p>
     * The returned array is only valid as long as the font
     * and its fontmap are valid.
     */
    public PointerProxy<Language> getLanguages() {
        try {
            var RESULT = (MemoryAddress) pango_font_get_languages.invokeExact(handle());
            return new PointerProxy<Language>(RESULT, Language.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_get_metrics = Interop.downcallHandle(
        "pango_font_get_metrics",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets overall metric information for a font.
     * <p>
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * <p>
     * If {@code font} is {@code null}, this function gracefully sets some sane values in the
     * output variables and returns.
     */
    public FontMetrics getMetrics(Language language) {
        try {
            var RESULT = (MemoryAddress) pango_font_get_metrics.invokeExact(handle(), language.handle());
            return new FontMetrics(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_has_char = Interop.downcallHandle(
        "pango_font_has_char",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns whether the font provides a glyph for this character.
     */
    public boolean hasChar(int wc) {
        try {
            var RESULT = (int) pango_font_has_char.invokeExact(handle(), wc);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_serialize = Interop.downcallHandle(
        "pango_font_serialize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) pango_font_serialize.invokeExact(handle());
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_descriptions_free = Interop.downcallHandle(
        "pango_font_descriptions_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Frees an array of font descriptions.
     */
    public static void descriptionsFree(FontDescription[] descs, int nDescs) {
        try {
            pango_font_descriptions_free.invokeExact(Interop.allocateNativeArray(descs).handle(), nDescs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_deserialize = Interop.downcallHandle(
        "pango_font_deserialize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) pango_font_deserialize.invokeExact(context.handle(), bytes.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Font(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
