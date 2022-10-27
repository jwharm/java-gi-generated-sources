package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFont} is used to represent a font in a
 * rendering-system-independent manner.
 */
public class Font extends org.gtk.gobject.Object {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName("PangoFont");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Font(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Font */
    public static Font castFrom(org.gtk.gobject.Object gobject) {
        return new Font(gobject.refcounted());
    }
    
    /**
     * Returns a description of the font, with font size set in points.
     * <p>
     * Use {@link Font#describeWithAbsoluteSize} if you want
     * the font size in device units.
     * @return a newly-allocated {@code PangoFontDescription} object.
     */
    public @NotNull org.pango.FontDescription describe() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_describe.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns a description of the font, with absolute font size set
     * in device units.
     * <p>
     * Use {@link Font#describe} if you want the font size in points.
     * @return a newly-allocated {@code PangoFontDescription} object.
     */
    public @NotNull org.pango.FontDescription describeWithAbsoluteSize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_describe_with_absolute_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    /**
     * Computes the coverage map for a given font and language tag.
     * @param language the language tag
     * @return a newly-allocated {@code PangoCoverage}
     *   object.
     */
    public @NotNull org.pango.Coverage getCoverage(@NotNull org.pango.Language language) {
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_get_coverage.invokeExact(handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Coverage(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the {@code PangoFontFace} to which {@code font} belongs.
     * @return the {@code PangoFontFace}
     */
    public @NotNull org.pango.FontFace getFace() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_get_face.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontFace(Refcounted.get(RESULT, false));
    }
    
    /**
     * Obtain the OpenType features that are provided by the font.
     * <p>
     * These are passed to the rendering system, together with features
     * that have been explicitly set via attributes.
     * <p>
     * Note that this does not include OpenType features which the
     * rendering system enables by default.
     * @param features Array to features in
     * @param len the length of {@code features}
     * @param numFeatures the number of used items in {@code features}
     */
    public void getFeatures(Out<org.harfbuzz.FeatureT[]> features, Out<Integer> len, Out<Integer> numFeatures) {
        java.util.Objects.requireNonNull(features, "Parameter 'features' must not be null");
        java.util.Objects.requireNonNull(numFeatures, "Parameter 'numFeatures' must not be null");
        MemorySegment featuresPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment numFeaturesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_font_get_features.invokeExact(handle(), (Addressable) featuresPOINTER.address(), (Addressable) lenPOINTER.address(), (Addressable) numFeaturesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        len.set(lenPOINTER.get(ValueLayout.JAVA_INT, 0));
        numFeatures.set(numFeaturesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.harfbuzz.FeatureT[] featuresARRAY = new org.harfbuzz.FeatureT[len.get().intValue()];
        for (int I = 0; I < len.get().intValue(); I++) {
            var OBJ = featuresPOINTER.get(ValueLayout.ADDRESS, I);
            featuresARRAY[I] = new org.harfbuzz.FeatureT(Refcounted.get(OBJ, false));
        }
        features.set(featuresARRAY);
    }
    
    /**
     * Gets the font map for which the font was created.
     * <p>
     * Note that the font maintains a <em>weak</em> reference to
     * the font map, so if all references to font map are
     * dropped, the font map will be finalized even if there
     * are fonts created with the font map that are still alive.
     * In that case this function will return {@code null}.
     * <p>
     * It is the responsibility of the user to ensure that the
     * font map is kept alive. In most uses this is not an issue
     * as a {@code PangoContext} holds a reference to the font map.
     * @return the {@code PangoFontMap}
     *   for the font
     */
    public @Nullable org.pango.FontMap getFontMap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_get_font_map.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMap(Refcounted.get(RESULT, false));
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
     * If {@code font} is {@code null}, this function gracefully sets some sane values in the
     * output variables and returns.
     * @param glyph the glyph index
     * @param inkRect rectangle used to store the extents of the glyph as drawn
     * @param logicalRect rectangle used to store the logical extents of the glyph
     */
    public void getGlyphExtents(@NotNull org.pango.Glyph glyph, @NotNull Out<org.pango.Rectangle> inkRect, @NotNull Out<org.pango.Rectangle> logicalRect) {
        java.util.Objects.requireNonNull(glyph, "Parameter 'glyph' must not be null");
        java.util.Objects.requireNonNull(inkRect, "Parameter 'inkRect' must not be null");
        java.util.Objects.requireNonNull(logicalRect, "Parameter 'logicalRect' must not be null");
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.pango_font_get_glyph_extents.invokeExact(handle(), glyph.getValue(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new org.pango.Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new org.pango.Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Get a {@code hb_font_t} object backing this font.
     * <p>
     * Note that the objects returned by this function are cached
     * and immutable. If you need to make changes to the {@code hb_font_t},
     * use <a href="https://harfbuzz.github.io/harfbuzz-hb-font.html#hb-font-create-sub-font">hb_font_create_sub_font()</a>.
     * @return the {@code hb_font_t} object
     *   backing the font
     */
    public @Nullable org.harfbuzz.FontT getHbFont() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_get_hb_font.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.FontT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the languages that are supported by {@code font}.
     * <p>
     * If the font backend does not provide this information,
     * {@code null} is returned. For the fontconfig backend, this
     * corresponds to the FC_LANG member of the FcPattern.
     * <p>
     * The returned array is only valid as long as the font
     * and its fontmap are valid.
     * @return an array of {@code PangoLanguage}
     */
    public @Nullable PointerProxy<org.pango.Language> getLanguages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_get_languages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.pango.Language>(RESULT, org.pango.Language.class);
    }
    
    /**
     * Gets overall metric information for a font.
     * <p>
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * <p>
     * If {@code font} is {@code null}, this function gracefully sets some sane values in the
     * output variables and returns.
     * @param language language tag used to determine which script
     *   to get the metrics for, or {@code null} to indicate to get the metrics for
     *   the entire font.
     * @return a {@code PangoFontMetrics} object. The caller must call
     *   {@link FontMetrics#unref} when finished using the object.
     */
    public @NotNull org.pango.FontMetrics getMetrics(@Nullable org.pango.Language language) {
        java.util.Objects.requireNonNullElse(language, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_get_metrics.invokeExact(handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMetrics(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns whether the font provides a glyph for this character.
     * @param wc a Unicode character
     * @return {@code TRUE} if {@code font} can render {@code wc}
     */
    public boolean hasChar(int wc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_has_char.invokeExact(handle(), wc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * To recreate a font from its serialized form, use {@link Font#deserialize}.
     * @return a {@code GBytes} containing the serialized form of {@code font}
     */
    public @NotNull org.gtk.glib.Bytes serialize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_serialize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    /**
     * Frees an array of font descriptions.
     * @param descs a pointer
     *   to an array of {@code PangoFontDescription}, may be {@code null}
     * @param nDescs number of font descriptions in {@code descs}
     */
    public static void descriptionsFree(org.pango.FontDescription[] descs, int nDescs) {
        java.util.Objects.requireNonNullElse(descs, MemoryAddress.NULL);
        try {
            DowncallHandles.pango_font_descriptions_free.invokeExact(Interop.allocateNativeArray(descs, false), nDescs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Loads data previously created via {@link Font#serialize}.
     * <p>
     * For a discussion of the supported format, see that function.
     * <p>
     * Note: to verify that the returned font is identical to
     * the one that was serialized, you can compare {@code bytes} to the
     * result of serializing the font again.
     * @param context a {@code PangoContext}
     * @param bytes the bytes containing the data
     * @return a new {@code PangoFont}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @Nullable org.pango.Font deserialize(@NotNull org.pango.Context context, @NotNull org.gtk.glib.Bytes bytes) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_deserialize.invokeExact(context.handle(), bytes.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.pango.Font(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_describe = Interop.downcallHandle(
            "pango_font_describe",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_describe_with_absolute_size = Interop.downcallHandle(
            "pango_font_describe_with_absolute_size",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_coverage = Interop.downcallHandle(
            "pango_font_get_coverage",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_face = Interop.downcallHandle(
            "pango_font_get_face",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_features = Interop.downcallHandle(
            "pango_font_get_features",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_font_map = Interop.downcallHandle(
            "pango_font_get_font_map",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_glyph_extents = Interop.downcallHandle(
            "pango_font_get_glyph_extents",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_hb_font = Interop.downcallHandle(
            "pango_font_get_hb_font",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_languages = Interop.downcallHandle(
            "pango_font_get_languages",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_get_metrics = Interop.downcallHandle(
            "pango_font_get_metrics",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_has_char = Interop.downcallHandle(
            "pango_font_has_char",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_serialize = Interop.downcallHandle(
            "pango_font_serialize",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_descriptions_free = Interop.downcallHandle(
            "pango_font_descriptions_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_deserialize = Interop.downcallHandle(
            "pango_font_deserialize",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
