package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global Pango namespace.
 */
public final class Pango {
    
    static {
        System.loadLibrary("pango-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Whether the segment should be shifted to center around the baseline.
     * <p>
     * This is mainly used in vertical writing directions.
     */
    public static final int ANALYSIS_FLAG_CENTERED_BASELINE = 1;
    
    /**
     * Whether this run holds ellipsized text.
     */
    public static final int ANALYSIS_FLAG_IS_ELLIPSIS = 2;
    
    /**
     * Whether to add a hyphen at the end of the run during shaping.
     */
    public static final int ANALYSIS_FLAG_NEED_HYPHEN = 4;
    
    /**
     * Value for {@code start_index} in {@code PangoAttribute} that indicates
     * the beginning of the text.
     */
    public static final int ATTR_INDEX_FROM_TEXT_BEGINNING = 0;
    
    /**
     * Value for {@code end_index} in {@code PangoAttribute} that indicates
     * the end of the text.
     */
    public static final int ATTR_INDEX_TO_TEXT_END = -1;
    
    /**
     * A {@code PangoGlyph} value that indicates a zero-width empty glpyh.
     * <p>
     * This is useful for example in shaper modules, to use as the glyph for
     * various zero-width Unicode characters (those passing {@link Pango#isZeroWidth}).
     */
    public static final org.pango.Glyph GLYPH_EMPTY = new org.pango.Glyph(268435455);
    
    /**
     * A {@code PangoGlyph} value for invalid input.
     * <p>
     * {@code PangoLayout} produces one such glyph per invalid input UTF-8 byte and such
     * a glyph is rendered as a crossed box.
     * <p>
     * Note that this value is defined such that it has the {@code PANGO_GLYPH_UNKNOWN_FLAG}
     * set.
     */
    public static final org.pango.Glyph GLYPH_INVALID_INPUT = new org.pango.Glyph(-1);
    
    /**
     * Flag used in {@code PangoGlyph} to turn a {@code gunichar} value of a valid Unicode
     * character into an unknown-character glyph for that {@code gunichar}.
     * <p>
     * Such unknown-character glyphs may be rendered as a 'hex box'.
     */
    public static final org.pango.Glyph GLYPH_UNKNOWN_FLAG = new org.pango.Glyph(268435456);
    
    /**
     * The scale between dimensions used for Pango distances and device units.
     * <p>
     * The definition of device units is dependent on the output device; it will
     * typically be pixels for a screen, and points for a printer. {@code PANGO_SCALE} is
     * currently 1024, but this may be changed in the future.
     * <p>
     * When setting font sizes, device units are always considered to be
     * points (as in "12 point font"), rather than pixels.
     */
    public static final int SCALE = 1024;
    
    /**
     * The major component of the version of Pango available at compile-time.
     */
    public static final int VERSION_MAJOR = 1;
    
    /**
     * The micro component of the version of Pango available at compile-time.
     */
    public static final int VERSION_MICRO = 12;
    
    /**
     * The minor component of the version of Pango available at compile-time.
     */
    public static final int VERSION_MINOR = 50;
    
    /**
     * A string literal containing the version of Pango available at compile-time.
     */
    public static final java.lang.String VERSION_STRING = "1.50.12";
    
    /**
     * Create a new allow-breaks attribute.
     * <p>
     * If breaks are disabled, the range will be kept in a
     * single run, as far as possible.
     * @param allowBreaks {@code true} if we line breaks are allowed
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrAllowBreaksNew(boolean allowBreaks) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_allow_breaks_new.invokeExact(
                    allowBreaks ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new background alpha attribute.
     * @param alpha the alpha value, between 1 and 65536
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrBackgroundAlphaNew(short alpha) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_background_alpha_new.invokeExact(
                    alpha);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new background color attribute.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrBackgroundNew(short red, short green, short blue) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_background_new.invokeExact(
                    red,
                    green,
                    blue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new baseline displacement attribute.
     * <p>
     * The effect of this attribute is to shift the baseline of a run,
     * relative to the run of preceding run.
     * <p>
     * &lt;picture&gt;
     *   &lt;source srcset="baseline-shift-dark.png" media="(prefers-color-scheme: dark)"&gt;
     *   &lt;img alt="Baseline Shift" src="baseline-shift-light.png"&gt;
     * &lt;/picture&gt;
     * @param shift either a {@code PangoBaselineShift} enumeration value or an absolute value (&gt; 1024)
     *   in Pango units, relative to the baseline of the previous run.
     *   Positive values displace the text upwards.
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrBaselineShiftNew(int shift) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_baseline_shift_new.invokeExact(
                    shift);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Apply customization from attributes to the breaks in {@code attrs}.
     * <p>
     * The line breaks are assumed to have been produced
     * by {@code default_break#] and [func@Pango.tailorBreak}.
     * @param text text to break. Must be valid UTF-8
     * @param length length of text in bytes (may be -1 if {@code text} is nul-terminated)
     * @param attrList {@code PangoAttrList} to apply
     * @param offset Byte offset of {@code text} from the beginning of the paragraph
     * @param attrs array with one {@code PangoLogAttr}
     *   per character in {@code text}, plus one extra, to be filled in
     * @param attrsLen length of {@code attrs} array
     */
    public static void attrBreak(@NotNull java.lang.String text, int length, @NotNull org.pango.AttrList attrList, int offset, @NotNull org.pango.LogAttr[] attrs, int attrsLen) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(attrList, "Parameter 'attrList' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        try {
            DowncallHandles.pango_attr_break.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    attrList.handle(),
                    offset,
                    Interop.allocateNativeArray(attrs, org.pango.LogAttr.getMemoryLayout(), false),
                    attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new font fallback attribute.
     * <p>
     * If fallback is disabled, characters will only be
     * used from the closest matching font on the system.
     * No fallback will be done to other fonts on the system
     * that might contain the characters in the text.
     * @param enableFallback {@code true} if we should fall back on other fonts
     *   for characters the active font is missing
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrFallbackNew(boolean enableFallback) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_fallback_new.invokeExact(
                    enableFallback ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font family attribute.
     * @param family the family or comma-separated list of families
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrFamilyNew(@NotNull java.lang.String family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_family_new.invokeExact(
                    Interop.allocateNativeString(family));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font description attribute.
     * <p>
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     * @param desc the font description
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrFontDescNew(@NotNull org.pango.FontDescription desc) {
        java.util.Objects.requireNonNull(desc, "Parameter 'desc' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_desc_new.invokeExact(
                    desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font features tag attribute.
     * <p>
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     * @param features a string with OpenType font features, with the syntax of the [CSS
     * font-feature-settings property](https://www.w3.org/TR/css-fonts-4/{@code font}-rend-desc)
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrFontFeaturesNew(@NotNull java.lang.String features) {
        java.util.Objects.requireNonNull(features, "Parameter 'features' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_features_new.invokeExact(
                    Interop.allocateNativeString(features));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font scale attribute.
     * <p>
     * The effect of this attribute is to change the font size of a run,
     * relative to the size of preceding run.
     * @param scale a {@code PangoFontScale} value, which indicates font size change relative
     *   to the size of the previous run.
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrFontScaleNew(@NotNull org.pango.FontScale scale) {
        java.util.Objects.requireNonNull(scale, "Parameter 'scale' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_font_scale_new.invokeExact(
                    scale.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new foreground alpha attribute.
     * @param alpha the alpha value, between 1 and 65536
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrForegroundAlphaNew(short alpha) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_foreground_alpha_new.invokeExact(
                    alpha);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new foreground color attribute.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrForegroundNew(short red, short green, short blue) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_foreground_new.invokeExact(
                    red,
                    green,
                    blue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new gravity hint attribute.
     * @param hint the gravity hint value
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrGravityHintNew(@NotNull org.pango.GravityHint hint) {
        java.util.Objects.requireNonNull(hint, "Parameter 'hint' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_gravity_hint_new.invokeExact(
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new gravity attribute.
     * @param gravity the gravity value; should not be {@link Gravity#AUTO}
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrGravityNew(@NotNull org.pango.Gravity gravity) {
        java.util.Objects.requireNonNull(gravity, "Parameter 'gravity' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_gravity_new.invokeExact(
                    gravity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new insert-hyphens attribute.
     * <p>
     * Pango will insert hyphens when breaking lines in
     * the middle of a word. This attribute can be used
     * to suppress the hyphen.
     * @param insertHyphens {@code true} if hyphens should be inserted
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrInsertHyphensNew(boolean insertHyphens) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_insert_hyphens_new.invokeExact(
                    insertHyphens ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new language tag attribute.
     * @param language language tag
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrLanguageNew(@NotNull org.pango.Language language) {
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_language_new.invokeExact(
                    language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new letter-spacing attribute.
     * @param letterSpacing amount of extra space to add between
     *   graphemes of the text, in Pango units
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrLetterSpacingNew(int letterSpacing) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_letter_spacing_new.invokeExact(
                    letterSpacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Modify the height of logical line extents by a factor.
     * <p>
     * This affects the values returned by
     * {@link LayoutLine#getExtents},
     * {@link LayoutLine#getPixelExtents} and
     * {@link LayoutIter#getLineExtents}.
     * @param factor the scaling factor to apply to the logical height
     */
    public static @NotNull org.pango.Attribute attrLineHeightNew(double factor) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_line_height_new.invokeExact(
                    factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Override the height of logical line extents to be {@code height}.
     * <p>
     * This affects the values returned by
     * {@link LayoutLine#getExtents},
     * {@link LayoutLine#getPixelExtents} and
     * {@link LayoutIter#getLineExtents}.
     * @param height the line height, in {@code PANGO_SCALE}-ths of a point
     */
    public static @NotNull org.pango.Attribute attrLineHeightNewAbsolute(int height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_line_height_new_absolute.invokeExact(
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Deserializes a {@code PangoAttrList} from a string.
     * <p>
     * This is the counterpart to {@link AttrList#toString}.
     * See that functions for details about the format.
     * @param text a string
     * @return a new {@code PangoAttrList}
     */
    public static @Nullable org.pango.AttrList attrListFromString(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_list_from_string.invokeExact(
                    Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrList(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new overline color attribute.
     * <p>
     * This attribute modifies the color of overlines.
     * If not set, overlines will use the foreground color.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrOverlineColorNew(short red, short green, short blue) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_overline_color_new.invokeExact(
                    red,
                    green,
                    blue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new overline-style attribute.
     * @param overline the overline style
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrOverlineNew(@NotNull org.pango.Overline overline) {
        java.util.Objects.requireNonNull(overline, "Parameter 'overline' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_overline_new.invokeExact(
                    overline.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new baseline displacement attribute.
     * @param rise the amount that the text should be displaced vertically,
     *   in Pango units. Positive values displace the text upwards.
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrRiseNew(int rise) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_rise_new.invokeExact(
                    rise);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font size scale attribute.
     * <p>
     * The base font for the affected text will have
     * its size multiplied by {@code scale_factor}.
     * @param scaleFactor factor to scale the font
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrScaleNew(double scaleFactor) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_scale_new.invokeExact(
                    scaleFactor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Marks the range of the attribute as a single sentence.
     * <p>
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrSentenceNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_sentence_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new shape attribute.
     * <p>
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a {@code PangoLayout}.
     * @param inkRect ink rectangle to assign to each character
     * @param logicalRect logical rectangle to assign to each character
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrShapeNew(@NotNull org.pango.Rectangle inkRect, @NotNull org.pango.Rectangle logicalRect) {
        java.util.Objects.requireNonNull(inkRect, "Parameter 'inkRect' must not be null");
        java.util.Objects.requireNonNull(logicalRect, "Parameter 'logicalRect' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_shape_new.invokeExact(
                    inkRect.handle(),
                    logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new shape attribute.
     * <p>
     * Like {@link AttrShape#new_}, but a user data pointer
     * is also provided; this pointer can be accessed when later
     * rendering the glyph.
     * @param inkRect ink rectangle to assign to each character
     * @param logicalRect logical rectangle to assign to each character
     * @param copyFunc function to copy {@code data} when the
     *   attribute is copied. If {@code null}, {@code data} is simply copied
     *   as a pointer
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrShapeNewWithData(@NotNull org.pango.Rectangle inkRect, @NotNull org.pango.Rectangle logicalRect, @Nullable org.pango.AttrDataCopyFunc copyFunc) {
        java.util.Objects.requireNonNull(inkRect, "Parameter 'inkRect' must not be null");
        java.util.Objects.requireNonNull(logicalRect, "Parameter 'logicalRect' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_shape_new_with_data.invokeExact(
                    inkRect.handle(),
                    logicalRect.handle(),
                    (Addressable) (copyFunc == null ? MemoryAddress.NULL : Interop.registerCallback(copyFunc)),
                    (Addressable) (copyFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.Callbacks.class, "cbAttrDataCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new attribute that influences how invisible
     * characters are rendered.
     * @param flags {@code PangoShowFlags} to apply
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrShowNew(@NotNull org.pango.ShowFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_show_new.invokeExact(
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font-size attribute in fractional points.
     * @param size the font size, in {@code PANGO_SCALE}-ths of a point
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrSizeNew(int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_size_new.invokeExact(
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font-size attribute in device units.
     * @param size the font size, in {@code PANGO_SCALE}-ths of a device unit
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrSizeNewAbsolute(int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_size_new_absolute.invokeExact(
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font stretch attribute.
     * @param stretch the stretch
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrStretchNew(@NotNull org.pango.Stretch stretch) {
        java.util.Objects.requireNonNull(stretch, "Parameter 'stretch' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_stretch_new.invokeExact(
                    stretch.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new strikethrough color attribute.
     * <p>
     * This attribute modifies the color of strikethrough lines.
     * If not set, strikethrough lines will use the foreground color.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrStrikethroughColorNew(short red, short green, short blue) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_strikethrough_color_new.invokeExact(
                    red,
                    green,
                    blue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new strike-through attribute.
     * @param strikethrough {@code true} if the text should be struck-through
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrStrikethroughNew(boolean strikethrough) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_strikethrough_new.invokeExact(
                    strikethrough ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font slant style attribute.
     * @param style the slant style
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrStyleNew(@NotNull org.pango.Style style) {
        java.util.Objects.requireNonNull(style, "Parameter 'style' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_style_new.invokeExact(
                    style.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new attribute that influences how characters
     * are transformed during shaping.
     * @param transform {@code PangoTextTransform} to apply
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrTextTransformNew(@NotNull org.pango.TextTransform transform) {
        java.util.Objects.requireNonNull(transform, "Parameter 'transform' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_text_transform_new.invokeExact(
                    transform.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the attribute type name.
     * <p>
     * The attribute type name is the string passed in
     * when registering the type using
     * {@link AttrType#register}.
     * <p>
     * The returned value is an interned string (see
     * g_intern_string() for what that means) that should
     * not be modified or freed.
     * @param type an attribute type ID to fetch the name for
     * @return the type ID name (which
     *   may be {@code null}), or {@code null} if {@code type} is a built-in Pango
     *   attribute type or invalid.
     */
    public static @Nullable java.lang.String attrTypeGetName(@NotNull org.pango.AttrType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Allocate a new attribute type ID.
     * <p>
     * The attribute type name can be accessed later
     * by using {@link AttrType#getName}.
     * @param name an identifier for the type
     * @return the new type ID.
     */
    public static @NotNull org.pango.AttrType attrTypeRegister(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_attr_type_register.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.AttrType.of(RESULT);
    }
    
    /**
     * Create a new underline color attribute.
     * <p>
     * This attribute modifies the color of underlines.
     * If not set, underlines will use the foreground color.
     * @param red the red value (ranging from 0 to 65535)
     * @param green the green value
     * @param blue the blue value
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrUnderlineColorNew(short red, short green, short blue) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_underline_color_new.invokeExact(
                    red,
                    green,
                    blue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new underline-style attribute.
     * @param underline the underline style
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrUnderlineNew(@NotNull org.pango.Underline underline) {
        java.util.Objects.requireNonNull(underline, "Parameter 'underline' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_underline_new.invokeExact(
                    underline.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font variant attribute (normal or small caps).
     * @param variant the variant
     * @return the newly allocated {@code PangoAttribute},
     *   which should be freed with {@link Attribute#destroy}.
     */
    public static @NotNull org.pango.Attribute attrVariantNew(@NotNull org.pango.Variant variant) {
        java.util.Objects.requireNonNull(variant, "Parameter 'variant' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_variant_new.invokeExact(
                    variant.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Create a new font weight attribute.
     * @param weight the weight
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrWeightNew(@NotNull org.pango.Weight weight) {
        java.util.Objects.requireNonNull(weight, "Parameter 'weight' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_weight_new.invokeExact(
                    weight.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Marks the range of the attribute as a single word.
     * <p>
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     * @return the newly allocated
     *   {@code PangoAttribute}, which should be freed with
     *   {@link Attribute#destroy}
     */
    public static @NotNull org.pango.Attribute attrWordNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_word_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Attribute(RESULT, Ownership.FULL);
    }
    
    /**
     * Determines the bidirectional type of a character.
     * <p>
     * The bidirectional type is specified in the Unicode Character Database.
     * <p>
     * A simplified version of this function is available as {@link Pango#unicharDirection}.
     * @param ch a Unicode character
     * @return the bidirectional character type, as used in the
     * Unicode bidirectional algorithm.
     */
    public static @NotNull org.pango.BidiType bidiTypeForUnichar(int ch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_bidi_type_for_unichar.invokeExact(
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.BidiType.of(RESULT);
    }
    
    /**
     * Determines possible line, word, and character breaks
     * for a string of Unicode text with a single analysis.
     * <p>
     * For most purposes you may want to use {@link Pango#getLogAttrs}.
     * @param text the text to process. Must be valid UTF-8
     * @param length length of {@code text} in bytes (may be -1 if {@code text} is nul-terminated)
     * @param analysis {@code PangoAnalysis} structure for {@code text}
     * @param attrs an array to store character information in
     * @param attrsLen size of the array passed as {@code attrs}
     * @deprecated Use {@link Pango#defaultBreak},
     *   {@code tailor_break#] and [func@Pango.attrBreak}.
     */
    @Deprecated
    public static void break_(@NotNull java.lang.String text, int length, @NotNull org.pango.Analysis analysis, @NotNull org.pango.LogAttr[] attrs, int attrsLen) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(analysis, "Parameter 'analysis' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        try {
            DowncallHandles.pango_break.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    analysis.handle(),
                    Interop.allocateNativeArray(attrs, org.pango.LogAttr.getMemoryLayout(), false),
                    attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is the default break algorithm.
     * <p>
     * It applies rules from the <a href="http://www.unicode.org/unicode/reports/tr14/">Unicode Line Breaking Algorithm</a>
     * without language-specific tailoring, therefore the {@code analyis} argument is unused
     * and can be {@code null}.
     * <p>
     * See {@link Pango#tailorBreak} for language-specific breaks.
     * <p>
     * See {@link Pango#attrBreak} for attribute-based customization.
     * @param text text to break. Must be valid UTF-8
     * @param length length of text in bytes (may be -1 if {@code text} is nul-terminated)
     * @param analysis a {@code PangoAnalysis} structure for the {@code text}
     * @param attrs logical attributes to fill in
     * @param attrsLen size of the array passed as {@code attrs}
     */
    public static void defaultBreak(@NotNull java.lang.String text, int length, @Nullable org.pango.Analysis analysis, @NotNull org.pango.LogAttr attrs, int attrsLen) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        try {
            DowncallHandles.pango_default_break.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    (Addressable) (analysis == null ? MemoryAddress.NULL : analysis.handle()),
                    attrs.handle(),
                    attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts extents from Pango units to device units.
     * <p>
     * The conversion is done by dividing by the {@code PANGO_SCALE} factor and
     * performing rounding.
     * <p>
     * The {@code inclusive} rectangle is converted by flooring the x/y coordinates
     * and extending width/height, such that the final rectangle completely
     * includes the original rectangle.
     * <p>
     * The {@code nearest} rectangle is converted by rounding the coordinates
     * of the rectangle to the nearest device unit (pixel).
     * <p>
     * The rule to which argument to use is: if you want the resulting device-space
     * rectangle to completely contain the original rectangle, pass it in as
     * {@code inclusive}. If you want two touching-but-not-overlapping rectangles stay
     * touching-but-not-overlapping after rounding to device units, pass them in
     * as {@code nearest}.
     * @param inclusive rectangle to round to pixels inclusively
     * @param nearest rectangle to round to nearest pixels
     */
    public static void extentsToPixels(@Nullable org.pango.Rectangle inclusive, @Nullable org.pango.Rectangle nearest) {
        try {
            DowncallHandles.pango_extents_to_pixels.invokeExact(
                    (Addressable) (inclusive == null ? MemoryAddress.NULL : inclusive.handle()),
                    (Addressable) (nearest == null ? MemoryAddress.NULL : nearest.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Searches a string the first character that has a strong
     * direction, according to the Unicode bidirectional algorithm.
     * @param text the text to process. Must be valid UTF-8
     * @param length length of {@code text} in bytes (may be -1 if {@code text} is nul-terminated)
     * @return The direction corresponding to the first strong character.
     *   If no such character is found, then {@link Direction#NEUTRAL} is returned.
     */
    public static @NotNull org.pango.Direction findBaseDir(@NotNull java.lang.String text, int length) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_find_base_dir.invokeExact(
                    Interop.allocateNativeString(text),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Direction.of(RESULT);
    }
    
    /**
     * Locates a paragraph boundary in {@code text}.
     * <p>
     * A boundary is caused by delimiter characters, such as
     * a newline, carriage return, carriage return-newline pair,
     * or Unicode paragraph separator character.
     * <p>
     * The index of the run of delimiters is returned in
     * {@code paragraph_delimiter_index}. The index of the start of the
     * next paragraph (index after all delimiters) is stored n
     * {@code next_paragraph_start}.
     * <p>
     * If no delimiters are found, both {@code paragraph_delimiter_index}
     * and {@code next_paragraph_start} are filled with the length of {@code text}
     * (an index one off the end).
     * @param text UTF-8 text
     * @param length length of {@code text} in bytes, or -1 if nul-terminated
     * @param paragraphDelimiterIndex return location for index of
     *   delimiter
     * @param nextParagraphStart return location for start of next
     *   paragraph
     */
    public static void findParagraphBoundary(@NotNull java.lang.String text, int length, Out<Integer> paragraphDelimiterIndex, Out<Integer> nextParagraphStart) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(paragraphDelimiterIndex, "Parameter 'paragraphDelimiterIndex' must not be null");
        MemorySegment paragraphDelimiterIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(nextParagraphStart, "Parameter 'nextParagraphStart' must not be null");
        MemorySegment nextParagraphStartPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_find_paragraph_boundary.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    (Addressable) paragraphDelimiterIndexPOINTER.address(),
                    (Addressable) nextParagraphStartPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        paragraphDelimiterIndex.set(paragraphDelimiterIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        nextParagraphStart.set(nextParagraphStartPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Creates a new font description from a string representation.
     * <p>
     * The string must have the form
     * <p>
     *     "\\[FAMILY-LIST] \\[STYLE-OPTIONS] \\[SIZE] \\[VARIATIONS]",
     * <p>
     * where FAMILY-LIST is a comma-separated list of families optionally
     * terminated by a comma, STYLE_OPTIONS is a whitespace-separated list
     * of words where each word describes one of style, variant, weight,
     * stretch, or gravity, and SIZE is a decimal number (size in points)
     * or optionally followed by the unit modifier "px" for absolute size.
     * VARIATIONS is a comma-separated list of font variation
     * specifications of the form "\\{@code axis}=value" (the = sign is optional).
     * <p>
     * The following words are understood as styles:
     * "Normal", "Roman", "Oblique", "Italic".
     * <p>
     * The following words are understood as variants:
     * "Small-Caps", "All-Small-Caps", "Petite-Caps", "All-Petite-Caps",
     * "Unicase", "Title-Caps".
     * <p>
     * The following words are understood as weights:
     * "Thin", "Ultra-Light", "Extra-Light", "Light", "Semi-Light",
     * "Demi-Light", "Book", "Regular", "Medium", "Semi-Bold", "Demi-Bold",
     * "Bold", "Ultra-Bold", "Extra-Bold", "Heavy", "Black", "Ultra-Black",
     * "Extra-Black".
     * <p>
     * The following words are understood as stretch values:
     * "Ultra-Condensed", "Extra-Condensed", "Condensed", "Semi-Condensed",
     * "Semi-Expanded", "Expanded", "Extra-Expanded", "Ultra-Expanded".
     * <p>
     * The following words are understood as gravity values:
     * "Not-Rotated", "South", "Upside-Down", "North", "Rotated-Left",
     * "East", "Rotated-Right", "West".
     * <p>
     * Any one of the options may be absent. If FAMILY-LIST is absent, then
     * the family_name field of the resulting font description will be
     * initialized to {@code null}. If STYLE-OPTIONS is missing, then all style
     * options will be set to the default values. If SIZE is missing, the
     * size in the resulting font description will be set to 0.
     * <p>
     * A typical example:
     * <p>
     *     "Cantarell Italic Light 15 \\{@code wght}=200"
     * @param str string representation of a font description.
     * @return a new {@code PangoFontDescription}.
     */
    public static @NotNull org.pango.FontDescription fontDescriptionFromString(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_from_string.invokeExact(
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(RESULT, Ownership.FULL);
    }
    
    /**
     * Computes a {@code PangoLogAttr} for each character in {@code text}.
     * <p>
     * The {@code attrs} array must have one {@code PangoLogAttr} for
     * each position in {@code text}; if {@code text} contains N characters,
     * it has N+1 positions, including the last position at the
     * end of the text. {@code text} should be an entire paragraph;
     * logical attributes can't be computed without context
     * (for example you need to see spaces on either side of
     * a word to know the word is a word).
     * @param text text to process. Must be valid UTF-8
     * @param length length in bytes of {@code text}
     * @param level embedding level, or -1 if unknown
     * @param language language tag
     * @param attrs array with one {@code PangoLogAttr}
     *   per character in {@code text}, plus one extra, to be filled in
     * @param attrsLen length of {@code attrs} array
     */
    public static void getLogAttrs(@NotNull java.lang.String text, int length, int level, @NotNull org.pango.Language language, @NotNull org.pango.LogAttr[] attrs, int attrsLen) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(language, "Parameter 'language' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        try {
            DowncallHandles.pango_get_log_attrs.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    level,
                    language.handle(),
                    Interop.allocateNativeArray(attrs, org.pango.LogAttr.getMemoryLayout(), false),
                    attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the mirrored character of a Unicode character.
     * <p>
     * Mirror characters are determined by the Unicode mirrored property.
     * @param ch a Unicode character
     * @param mirroredCh location to store the mirrored character
     * @return {@code true} if {@code ch} has a mirrored character and {@code mirrored_ch} is
     * filled in, {@code false} otherwise
     * @deprecated Use {@link org.gtk.glib.GLib#unicharGetMirrorChar} instead;
     *   the docs for that function provide full details.
     */
    @Deprecated
    public static boolean getMirrorChar(int ch, PointerInteger mirroredCh) {
        java.util.Objects.requireNonNull(mirroredCh, "Parameter 'mirroredCh' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_get_mirror_char.invokeExact(
                    ch,
                    mirroredCh.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Finds the gravity that best matches the rotation component
     * in a {@code PangoMatrix}.
     * @param matrix a {@code PangoMatrix}
     * @return the gravity of {@code matrix}, which will never be
     * {@link Gravity#AUTO}, or {@link Gravity#SOUTH} if {@code matrix} is {@code null}
     */
    public static @NotNull org.pango.Gravity gravityGetForMatrix(@Nullable org.pango.Matrix matrix) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_matrix.invokeExact(
                    (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Returns the gravity to use in laying out a {@code PangoItem}.
     * <p>
     * The gravity is determined based on the script, base gravity, and hint.
     * <p>
     * If {@code base_gravity} is {@link Gravity#AUTO}, it is first replaced with the
     * preferred gravity of {@code script}.  To get the preferred gravity of a script,
     * pass {@link Gravity#AUTO} and {@link GravityHint#STRONG} in.
     * @param script {@code PangoScript} to query
     * @param baseGravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text
     * with {@code script}
     */
    public static @NotNull org.pango.Gravity gravityGetForScript(@NotNull org.pango.Script script, @NotNull org.pango.Gravity baseGravity, @NotNull org.pango.GravityHint hint) {
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        java.util.Objects.requireNonNull(baseGravity, "Parameter 'baseGravity' must not be null");
        java.util.Objects.requireNonNull(hint, "Parameter 'hint' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_script.invokeExact(
                    script.getValue(),
                    baseGravity.getValue(),
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Returns the gravity to use in laying out a single character
     * or {@code PangoItem}.
     * <p>
     * The gravity is determined based on the script, East Asian width,
     * base gravity, and hint,
     * <p>
     * This function is similar to {@link Gravity#getForScript} except
     * that this function makes a distinction between narrow/half-width and
     * wide/full-width characters also. Wide/full-width characters always
     * stand <em>upright</em>, that is, they always take the base gravity,
     * whereas narrow/full-width characters are always rotated in vertical
     * context.
     * <p>
     * If {@code base_gravity} is {@link Gravity#AUTO}, it is first replaced with the
     * preferred gravity of {@code script}.
     * @param script {@code PangoScript} to query
     * @param wide {@code true} for wide characters as returned by g_unichar_iswide()
     * @param baseGravity base gravity of the paragraph
     * @param hint orientation hint
     * @return resolved gravity suitable to use for a run of text
     * with {@code script} and {@code wide}.
     */
    public static @NotNull org.pango.Gravity gravityGetForScriptAndWidth(@NotNull org.pango.Script script, boolean wide, @NotNull org.pango.Gravity baseGravity, @NotNull org.pango.GravityHint hint) {
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        java.util.Objects.requireNonNull(baseGravity, "Parameter 'baseGravity' must not be null");
        java.util.Objects.requireNonNull(hint, "Parameter 'hint' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_gravity_get_for_script_and_width.invokeExact(
                    script.getValue(),
                    wide ? 1 : 0,
                    baseGravity.getValue(),
                    hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Gravity.of(RESULT);
    }
    
    /**
     * Converts a {@code PangoGravity} value to its natural rotation in radians.
     * <p>
     * Note that {@link Matrix#rotate} takes angle in degrees, not radians.
     * So, to call {@code Pango#Matrix,rotate} with the output of this function
     * you should multiply it by (180. / G_PI).
     * @param gravity gravity to query, should not be {@link Gravity#AUTO}
     * @return the rotation value corresponding to {@code gravity}.
     */
    public static double gravityToRotation(@NotNull org.pango.Gravity gravity) {
        java.util.Objects.requireNonNull(gravity, "Parameter 'gravity' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.pango_gravity_to_rotation.invokeExact(
                    gravity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if a character that should not be normally rendered.
     * <p>
     * This includes all Unicode characters with "ZERO WIDTH" in their name,
     * as well as <em>bidi</em> formatting characters, and a few other ones.
     * <p>
     * This is totally different from {@link org.gtk.glib.GLib#unicharIszerowidth} and is at best misnamed.
     * @param ch a Unicode character
     * @return {@code true} if {@code ch} is a zero-width character, {@code false} otherwise
     */
    public static boolean isZeroWidth(int ch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_is_zero_width.invokeExact(
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Breaks a piece of text into segments with consistent directional
     * level and font.
     * <p>
     * Each byte of {@code text} will be contained in exactly one of the items in the
     * returned list; the generated list of items will be in logical order (the
     * start offsets of the items are ascending).
     * <p>
     * {@code cached_iter} should be an iterator over {@code attrs} currently positioned
     * at a range before or containing {@code start_index}; {@code cached_iter} will be
     * advanced to the range covering the position just after
     * {@code start_index} + {@code length}. (i.e. if itemizing in a loop, just keep passing
     * in the same {@code cached_iter}).
     * @param context a structure holding information that affects
     *   the itemization process.
     * @param text the text to itemize. Must be valid UTF-8
     * @param startIndex first byte in {@code text} to process
     * @param length the number of bytes (not characters) to process
     *   after {@code start_index}. This must be &gt;= 0.
     * @param attrs the set of attributes that apply to {@code text}.
     * @param cachedIter Cached attribute iterator
     * @return a {@code GList} of
     *   {@code Pango.Item} structures. The items should be freed using
     *   {@link Item#free} in combination with {@link org.gtk.glib.List#freeFull}.
     */
    public static @NotNull org.gtk.glib.List itemize(@NotNull org.pango.Context context, @NotNull java.lang.String text, int startIndex, int length, @NotNull org.pango.AttrList attrs, @Nullable org.pango.AttrIterator cachedIter) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_itemize.invokeExact(
                    context.handle(),
                    Interop.allocateNativeString(text),
                    startIndex,
                    length,
                    attrs.handle(),
                    (Addressable) (cachedIter == null ? MemoryAddress.NULL : cachedIter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Like {@code pango_itemize()}, but with an explicitly specified base direction.
     * <p>
     * The base direction is used when computing bidirectional levels.
     * {@link Pango#itemize} gets the base direction from the {@code PangoContext}
     * (see {@link Context#setBaseDir}).
     * @param context a structure holding information that affects
     *   the itemization process.
     * @param baseDir base direction to use for bidirectional processing
     * @param text the text to itemize.
     * @param startIndex first byte in {@code text} to process
     * @param length the number of bytes (not characters) to process
     *   after {@code start_index}. This must be &gt;= 0.
     * @param attrs the set of attributes that apply to {@code text}.
     * @param cachedIter Cached attribute iterator
     * @return a {@code GList} of
     *   {@code Pango.Item} structures. The items should be freed using
     *   {@link Item#free} probably in combination with {@link org.gtk.glib.List#freeFull}.
     */
    public static @NotNull org.gtk.glib.List itemizeWithBaseDir(@NotNull org.pango.Context context, @NotNull org.pango.Direction baseDir, @NotNull java.lang.String text, int startIndex, int length, @NotNull org.pango.AttrList attrs, @Nullable org.pango.AttrIterator cachedIter) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(baseDir, "Parameter 'baseDir' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_itemize_with_base_dir.invokeExact(
                    context.handle(),
                    baseDir.getValue(),
                    Interop.allocateNativeString(text),
                    startIndex,
                    length,
                    attrs.handle(),
                    (Addressable) (cachedIter == null ? MemoryAddress.NULL : cachedIter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Convert a language tag to a {@code PangoLanguage}.
     * <p>
     * The language tag must be in a RFC-3066 format. {@code PangoLanguage} pointers
     * can be efficiently copied (copy the pointer) and compared with other
     * language tags (compare the pointer.)
     * <p>
     * This function first canonicalizes the string by converting it to
     * lowercase, mapping '_' to '-', and stripping all characters other
     * than letters and '-'.
     * <p>
     * Use {@link Language#getDefault} if you want to get the
     * {@code PangoLanguage} for the current locale of the process.
     * @param language a string representing a language tag
     * @return a {@code PangoLanguage}
     */
    public static @Nullable org.pango.Language languageFromString(@Nullable java.lang.String language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_from_string.invokeExact(
                    (Addressable) (language == null ? MemoryAddress.NULL : Interop.allocateNativeString(language)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@code PangoLanguage} for the current locale of the process.
     * <p>
     * On Unix systems, this is the return value is derived from
     * {@code setlocale (LC_CTYPE, NULL)}, and the user can
     * affect this through the environment variables LC_ALL, LC_CTYPE or
     * LANG (checked in that order). The locale string typically is in
     * the form lang_COUNTRY, where lang is an ISO-639 language code, and
     * COUNTRY is an ISO-3166 country code. For instance, sv_FI for
     * Swedish as written in Finland or pt_BR for Portuguese as written in
     * Brazil.
     * <p>
     * On Windows, the C library does not use any such environment
     * variables, and setting them won't affect the behavior of functions
     * like ctime(). The user sets the locale through the Regional Options
     * in the Control Panel. The C library (in the setlocale() function)
     * does not use country and language codes, but country and language
     * names spelled out in English.
     * However, this function does check the above environment
     * variables, and does return a Unix-style locale string based on
     * either said environment variables or the thread's current locale.
     * <p>
     * Your application should call {@code setlocale(LC_ALL, "")} for the user
     * settings to take effect. GTK does this in its initialization
     * functions automatically (by calling gtk_set_locale()).
     * See the setlocale() manpage for more details.
     * <p>
     * Note that the default language can change over the life of an application.
     * <p>
     * Also note that this function will not do the right thing if you
     * use per-thread locales with uselocale(). In that case, you should
     * just call pango_language_from_string() yourself.
     * @return the default language as a {@code PangoLanguage}
     */
    public static @NotNull org.pango.Language languageGetDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the list of languages that the user prefers.
     * <p>
     * The list is specified by the {@code PANGO_LANGUAGE} or {@code LANGUAGE}
     * environment variables, in order of preference. Note that this
     * list does not necessarily include the language returned by
     * {@link Language#getDefault}.
     * <p>
     * When choosing language-specific resources, such as the sample
     * text returned by {@link Language#getSampleString},
     * you should first try the default language, followed by the
     * languages returned by this function.
     * @return a {@code null}-terminated array
     *   of {@code PangoLanguage}*
     */
    public static @Nullable PointerProxy<org.pango.Language> languageGetPreferred() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_language_get_preferred.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.pango.Language>(RESULT, org.pango.Language.class);
    }
    
    public static @NotNull org.gtk.glib.Quark layoutDeserializeErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_deserialize_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Return the bidirectional embedding levels of the input paragraph.
     * <p>
     * The bidirectional embedding levels are defined by the [Unicode Bidirectional
     * Algorithm](http://www.unicode.org/reports/tr9/).
     * <p>
     * If the input base direction is a weak direction, the direction of the
     * characters in the text will determine the final resolved direction.
     * @param text the text to itemize.
     * @param length the number of bytes (not characters) to process, or -1
     *   if {@code text} is nul-terminated and the length should be calculated.
     * @param pbaseDir input base direction, and output resolved direction.
     * @return a newly allocated array of embedding levels, one item per
     *   character (not byte), that should be freed using {@link org.gtk.glib.GLib#free}.
     */
    public static PointerByte log2visGetEmbeddingLevels(@NotNull java.lang.String text, int length, @NotNull org.pango.Direction pbaseDir) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(pbaseDir, "Parameter 'pbaseDir' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_log2vis_get_embedding_levels.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    new PointerInteger(pbaseDir.getValue()).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Finishes parsing markup.
     * <p>
     * After feeding a Pango markup parser some data with {@link org.gtk.glib.MarkupParseContext#parse},
     * use this function to get the list of attributes and text out of the
     * markup. This function will not free {@code context}, use {@link org.gtk.glib.MarkupParseContext#free}
     * to do so.
     * @param context A valid parse context that was returned from {@link Pango#markupParserNew}
     * @param attrList address of return location for a {@code PangoAttrList}
     * @param text address of return location for text with tags stripped
     * @param accelChar address of return location for accelerator char
     * @return {@code false} if {@code error} is set, otherwise {@code true}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean markupParserFinish(@NotNull org.gtk.glib.MarkupParseContext context, @NotNull Out<org.pango.AttrList> attrList, @NotNull Out<java.lang.String> text, Out<Integer> accelChar) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(attrList, "Parameter 'attrList' must not be null");
        MemorySegment attrListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemorySegment textPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(accelChar, "Parameter 'accelChar' must not be null");
        MemorySegment accelCharPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_markup_parser_finish.invokeExact(
                    context.handle(),
                    (Addressable) attrListPOINTER.address(),
                    (Addressable) textPOINTER.address(),
                    (Addressable) accelCharPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        attrList.set(new org.pango.AttrList(attrListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        text.set(Interop.getStringFrom(textPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        accelChar.set(accelCharPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Incrementally parses marked-up text to create a plain-text string
     * and an attribute list.
     * <p>
     * See the <a href="pango_markup.html">Pango Markup</a> docs for details about the
     * supported markup.
     * <p>
     * If {@code accel_marker} is nonzero, the given character will mark the
     * character following it as an accelerator. For example, {@code accel_marker}
     * might be an ampersand or underscore. All characters marked
     * as an accelerator will receive a {@link Underline#LOW} attribute,
     * and the first character so marked will be returned in {@code accel_char},
     * when calling {@link Pango#markupParserFinish}. Two {@code accel_marker} characters
     * following each other produce a single literal {@code accel_marker} character.
     * <p>
     * To feed markup to the parser, use {@link org.gtk.glib.MarkupParseContext#parse}
     * on the returned {@code GLib.MarkupParseContext}. When done with feeding markup
     * to the parser, use {@link Pango#markupParserFinish} to get the data out
     * of it, and then use {@link org.gtk.glib.MarkupParseContext#free} to free it.
     * <p>
     * This function is designed for applications that read Pango markup
     * from streams. To simply parse a string containing Pango markup,
     * the {@link Pango#parseMarkup} API is recommended instead.
     * @param accelMarker character that precedes an accelerator, or 0 for none
     * @return a {@code GMarkupParseContext} that should be
     * destroyed with {@link org.gtk.glib.MarkupParseContext#free}.
     */
    public static @NotNull org.gtk.glib.MarkupParseContext markupParserNew(int accelMarker) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_markup_parser_new.invokeExact(
                    accelMarker);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.MarkupParseContext(RESULT, Ownership.NONE);
    }
    
    /**
     * Parses an enum type and stores the result in {@code value}.
     * <p>
     * If {@code str} does not match the nick name of any of the possible values
     * for the enum and is not an integer, {@code false} is returned, a warning
     * is issued if {@code warn} is {@code true}, and a string representing the list of
     * possible values is stored in {@code possible_values}. The list is
     * slash-separated, eg. "none/start/middle/end".
     * <p>
     * If failed and {@code possible_values} is not {@code null}, returned string should
     * be freed using g_free().
     * @param type enum type to parse, eg. {@code PANGO_TYPE_ELLIPSIZE_MODE}
     * @param str string to parse
     * @param value integer to store the result in
     * @param warn if {@code true}, issue a g_warning() on bad input
     * @param possibleValues place to store list of possible
     *   values on failure
     * @return {@code true} if {@code str} was successfully parsed
     */
    @Deprecated
    public static boolean parseEnum(@NotNull org.gtk.glib.Type type, @Nullable java.lang.String str, Out<Integer> value, boolean warn, @NotNull Out<java.lang.String> possibleValues) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(possibleValues, "Parameter 'possibleValues' must not be null");
        MemorySegment possibleValuesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_parse_enum.invokeExact(
                    type.getValue().longValue(),
                    (Addressable) (str == null ? MemoryAddress.NULL : Interop.allocateNativeString(str)),
                    (Addressable) valuePOINTER.address(),
                    warn ? 1 : 0,
                    (Addressable) possibleValuesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        possibleValues.set(Interop.getStringFrom(possibleValuesPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Parses marked-up text to create a plain-text string and an attribute list.
     * <p>
     * See the <a href="pango_markup.html">Pango Markup</a> docs for details about the
     * supported markup.
     * <p>
     * If {@code accel_marker} is nonzero, the given character will mark the
     * character following it as an accelerator. For example, {@code accel_marker}
     * might be an ampersand or underscore. All characters marked
     * as an accelerator will receive a {@link Underline#LOW} attribute,
     * and the first character so marked will be returned in {@code accel_char}.
     * Two {@code accel_marker} characters following each other produce a single
     * literal {@code accel_marker} character.
     * <p>
     * To parse a stream of pango markup incrementally, use {@link Pango#markupParserNew}.
     * <p>
     * If any error happens, none of the output arguments are touched except
     * for {@code error}.
     * @param markupText markup to parse (see the <a href="pango_markup.html">Pango Markup</a> docs)
     * @param length length of {@code markup_text}, or -1 if nul-terminated
     * @param accelMarker character that precedes an accelerator, or 0 for none
     * @param attrList address of return location for a {@code PangoAttrList}
     * @param text address of return location for text with tags stripped
     * @param accelChar address of return location for accelerator char
     * @return {@code false} if {@code error} is set, otherwise {@code true}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean parseMarkup(@NotNull java.lang.String markupText, int length, int accelMarker, @NotNull Out<org.pango.AttrList> attrList, @NotNull Out<java.lang.String> text, Out<Integer> accelChar) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(markupText, "Parameter 'markupText' must not be null");
        java.util.Objects.requireNonNull(attrList, "Parameter 'attrList' must not be null");
        MemorySegment attrListPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemorySegment textPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(accelChar, "Parameter 'accelChar' must not be null");
        MemorySegment accelCharPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_parse_markup.invokeExact(
                    Interop.allocateNativeString(markupText),
                    length,
                    accelMarker,
                    (Addressable) attrListPOINTER.address(),
                    (Addressable) textPOINTER.address(),
                    (Addressable) accelCharPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        attrList.set(new org.pango.AttrList(attrListPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        text.set(Interop.getStringFrom(textPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        accelChar.set(accelCharPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Parses a font stretch.
     * <p>
     * The allowed values are
     * "ultra_condensed", "extra_condensed", "condensed",
     * "semi_condensed", "normal", "semi_expanded", "expanded",
     * "extra_expanded" and "ultra_expanded". Case variations are
     * ignored and the '_' characters may be omitted.
     * @param str a string to parse.
     * @param stretch a {@code PangoStretch} to store the result in.
     * @param warn if {@code true}, issue a g_warning() on bad input.
     * @return {@code true} if {@code str} was successfully parsed.
     */
    public static boolean parseStretch(@NotNull java.lang.String str, @NotNull Out<org.pango.Stretch> stretch, boolean warn) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(stretch, "Parameter 'stretch' must not be null");
        MemorySegment stretchPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_parse_stretch.invokeExact(
                    Interop.allocateNativeString(str),
                    (Addressable) stretchPOINTER.address(),
                    warn ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        stretch.set(org.pango.Stretch.of(stretchPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Parses a font style.
     * <p>
     * The allowed values are "normal", "italic" and "oblique", case
     * variations being
     * ignored.
     * @param str a string to parse.
     * @param style a {@code PangoStyle} to store the result in.
     * @param warn if {@code true}, issue a g_warning() on bad input.
     * @return {@code true} if {@code str} was successfully parsed.
     */
    public static boolean parseStyle(@NotNull java.lang.String str, @NotNull Out<org.pango.Style> style, boolean warn) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(style, "Parameter 'style' must not be null");
        MemorySegment stylePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_parse_style.invokeExact(
                    Interop.allocateNativeString(str),
                    (Addressable) stylePOINTER.address(),
                    warn ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        style.set(org.pango.Style.of(stylePOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Parses a font variant.
     * <p>
     * The allowed values are "normal", "small-caps", "all-small-caps",
     * "petite-caps", "all-petite-caps", "unicase" and "title-caps",
     * case variations being ignored.
     * @param str a string to parse.
     * @param variant a {@code PangoVariant} to store the result in.
     * @param warn if {@code true}, issue a g_warning() on bad input.
     * @return {@code true} if {@code str} was successfully parsed.
     */
    public static boolean parseVariant(@NotNull java.lang.String str, @NotNull Out<org.pango.Variant> variant, boolean warn) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(variant, "Parameter 'variant' must not be null");
        MemorySegment variantPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_parse_variant.invokeExact(
                    Interop.allocateNativeString(str),
                    (Addressable) variantPOINTER.address(),
                    warn ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        variant.set(org.pango.Variant.of(variantPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Parses a font weight.
     * <p>
     * The allowed values are "heavy",
     * "ultrabold", "bold", "normal", "light", "ultraleight"
     * and integers. Case variations are ignored.
     * @param str a string to parse.
     * @param weight a {@code PangoWeight} to store the result in.
     * @param warn if {@code true}, issue a g_warning() on bad input.
     * @return {@code true} if {@code str} was successfully parsed.
     */
    public static boolean parseWeight(@NotNull java.lang.String str, @NotNull Out<org.pango.Weight> weight, boolean warn) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(weight, "Parameter 'weight' must not be null");
        MemorySegment weightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_parse_weight.invokeExact(
                    Interop.allocateNativeString(str),
                    (Addressable) weightPOINTER.address(),
                    warn ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        weight.set(org.pango.Weight.of(weightPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Quantizes the thickness and position of a line to whole device pixels.
     * <p>
     * This is typically used for underline or strikethrough. The purpose of
     * this function is to avoid such lines looking blurry.
     * <p>
     * Care is taken to make sure {@code thickness} is at least one pixel when this
     * function returns, but returned {@code position} may become zero as a result
     * of rounding.
     * @param thickness pointer to the thickness of a line, in Pango units
     * @param position corresponding position
     */
    public static void quantizeLineGeometry(Out<Integer> thickness, Out<Integer> position) {
        java.util.Objects.requireNonNull(thickness, "Parameter 'thickness' must not be null");
        MemorySegment thicknessPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_quantize_line_geometry.invokeExact(
                    (Addressable) thicknessPOINTER.address(),
                    (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        thickness.set(thicknessPOINTER.get(Interop.valueLayout.C_INT, 0));
        position.set(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Reads an entire line from a file into a buffer.
     * <p>
     * Lines may be delimited with '\\n', '\\r', '\\n\\r', or '\\r\\n'. The delimiter
     * is not written into the buffer. Text after a '{@code '} character is treated as
     * a comment and skipped. '\\' can be used to escape a # character.
     * '\\' proceeding a line delimiter combines adjacent lines. A '\\' proceeding
     * any other character is ignored and written into the output buffer
     * unmodified.
     * @param stream a stdio stream
     * @param str {@code GString} buffer into which to write the result
     * @return 0 if the stream was already at an {@code EOF} character,
     *   otherwise the number of lines read (this is useful for maintaining
     *   a line number counter which doesn't combine lines with '\\')
     */
    @Deprecated
    public static int readLine(@Nullable java.lang.foreign.MemoryAddress stream, @NotNull org.gtk.glib.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_read_line.invokeExact(
                    (Addressable) (stream == null ? MemoryAddress.NULL : (Addressable) stream),
                    str.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Reorder items from logical order to visual order.
     * <p>
     * The visual order is determined from the associated directional
     * levels of the items. The original list is unmodified.
     * <p>
     * (Please open a bug if you use this function.
     *  It is not a particularly convenient interface, and the code
     *  is duplicated elsewhere in Pango for that reason.)
     * @param items a {@code GList} of {@code PangoItem}
     *   in logical order.
     * @return a {@code GList}
     *   of {@code PangoItem} structures in visual order.
     */
    public static @NotNull org.gtk.glib.List reorderItems(@NotNull org.gtk.glib.List items) {
        java.util.Objects.requireNonNull(items, "Parameter 'items' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_reorder_items.invokeExact(
                    items.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Scans an integer.
     * <p>
     * Leading white space is skipped.
     * @param pos in/out string position
     * @param out an int into which to write the result
     * @return {@code false} if a parse error occurred
     */
    @Deprecated
    public static boolean scanInt(@NotNull Out<java.lang.String> pos, Out<Integer> out) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(out, "Parameter 'out' must not be null");
        MemorySegment outPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_scan_int.invokeExact(
                    (Addressable) posPOINTER.address(),
                    (Addressable) outPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pos.set(Interop.getStringFrom(posPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        out.set(outPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Scans a string into a {@code GString} buffer.
     * <p>
     * The string may either be a sequence of non-white-space characters,
     * or a quoted string with '"'. Instead a quoted string, '\\"' represents
     * a literal quote. Leading white space outside of quotes is skipped.
     * @param pos in/out string position
     * @param out a {@code GString} into which to write the result
     * @return {@code false} if a parse error occurred
     */
    @Deprecated
    public static boolean scanString(@NotNull Out<java.lang.String> pos, @NotNull org.gtk.glib.String out) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(out, "Parameter 'out' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_scan_string.invokeExact(
                    (Addressable) posPOINTER.address(),
                    out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pos.set(Interop.getStringFrom(posPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Scans a word into a {@code GString} buffer.
     * <p>
     * A word consists of [A-Za-z_] followed by zero or more
     * [A-Za-z_0-9]. Leading white space is skipped.
     * @param pos in/out string position
     * @param out a {@code GString} into which to write the result
     * @return {@code false} if a parse error occurred
     */
    @Deprecated
    public static boolean scanWord(@NotNull Out<java.lang.String> pos, @NotNull org.gtk.glib.String out) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(out, "Parameter 'out' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_scan_word.invokeExact(
                    (Addressable) posPOINTER.address(),
                    out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pos.set(Interop.getStringFrom(posPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Looks up the script for a particular character.
     * <p>
     * The script of a character is defined by
     * <a href="http://www.unicode.org/reports/tr24/">Unicode Standard Annex 24: Script names</a>.
     * <p>
     * No check is made for {@code ch} being a valid Unicode character; if you pass
     * in invalid character, the result is undefined.
     * <p>
     * Note that while the return type of this function is declared
     * as {@code PangoScript}, as of Pango 1.18, this function simply returns
     * the return value of {@link org.gtk.glib.GLib#unicharGetScript}. Callers must be
     * prepared to handle unknown values.
     * @param ch a Unicode character
     * @return the {@code PangoScript} for the character.
     * @deprecated Use g_unichar_get_script()
     */
    @Deprecated
    public static @NotNull org.pango.Script scriptForUnichar(int ch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_script_for_unichar.invokeExact(
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Script.of(RESULT);
    }
    
    /**
     * Finds a language tag that is reasonably representative of {@code script}.
     * <p>
     * The language will usually be the most widely spoken or used language
     * written in that script: for instance, the sample language for
     * {@link Script#CYRILLIC} is ru (Russian), the sample language for
     * {@link Script#ARABIC} is ar.
     * <p>
     * For some scripts, no sample language will be returned because
     * there is no language that is sufficiently representative. The
     * best example of this is {@link Script#HAN}, where various different
     * variants of written Chinese, Japanese, and Korean all use
     * significantly different sets of Han characters and forms
     * of shared characters. No sample language can be provided
     * for many historical scripts as well.
     * <p>
     * As of 1.18, this function checks the environment variables
     * {@code PANGO_LANGUAGE} and {@code LANGUAGE} (checked in that order) first.
     * If one of them is set, it is parsed as a list of language tags
     * separated by colons or other separators. This function
     * will return the first language in the parsed list that Pango
     * believes may use {@code script} for writing. This last predicate
     * is tested using {@link Language#includesScript}. This can
     * be used to control Pango's font selection for non-primary
     * languages. For example, a {@code PANGO_LANGUAGE} enviroment variable
     * set to "en:fa" makes Pango choose fonts suitable for Persian (fa)
     * instead of Arabic (ar) when a segment of Arabic text is found
     * in an otherwise non-Arabic text. The same trick can be used to
     * choose a default language for {@link Script#HAN} when setting
     * context language is not feasible.
     * @param script a {@code PangoScript}
     * @return a {@code PangoLanguage} that is representative
     *   of the script
     */
    public static @Nullable org.pango.Language scriptGetSampleLanguage(@NotNull org.pango.Script script) {
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_script_get_sample_language.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.FULL);
    }
    
    /**
     * Convert the characters in {@code text} into glyphs.
     * <p>
     * Given a segment of text and the corresponding {@code PangoAnalysis} structure
     * returned from {@link Pango#itemize}, convert the characters into glyphs. You
     * may also pass in only a substring of the item from {@link Pango#itemize}.
     * <p>
     * It is recommended that you use {@link Pango#shapeFull} instead, since
     * that API allows for shaping interaction happening across text item
     * boundaries.
     * <p>
     * Some aspects of hyphen insertion and text transformation (in particular,
     * capitalization) require log attrs, and thus can only be handled by
     * {@link Pango#shapeItem}.
     * <p>
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you need to subtract the item offset from their indices before
     * calling {@link Pango#shape}.
     * @param text the text to process
     * @param length the length (in bytes) of {@code text}
     * @param analysis {@code PangoAnalysis} structure from {@link Pango#itemize}
     * @param glyphs glyph string in which to store results
     */
    public static void shape(@NotNull java.lang.String text, int length, @NotNull org.pango.Analysis analysis, @NotNull org.pango.GlyphString glyphs) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(analysis, "Parameter 'analysis' must not be null");
        java.util.Objects.requireNonNull(glyphs, "Parameter 'glyphs' must not be null");
        try {
            DowncallHandles.pango_shape.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    analysis.handle(),
                    glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert the characters in {@code text} into glyphs.
     * <p>
     * Given a segment of text and the corresponding {@code PangoAnalysis} structure
     * returned from {@link Pango#itemize}, convert the characters into glyphs.
     * You may also pass in only a substring of the item from {@link Pango#itemize}.
     * <p>
     * This is similar to {@link Pango#shape}, except it also can optionally take
     * the full paragraph text as input, which will then be used to perform
     * certain cross-item shaping interactions. If you have access to the broader
     * text of which {@code item_text} is part of, provide the broader text as
     * {@code paragraph_text}. If {@code paragraph_text} is {@code null}, item text is used instead.
     * <p>
     * Some aspects of hyphen insertion and text transformation (in particular,
     * capitalization) require log attrs, and thus can only be handled by
     * {@link Pango#shapeItem}.
     * <p>
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as {@code paragraph_text}, you need
     * to subtract the item offset from their indices before calling
     * {@link Pango#shapeFull}.
     * @param itemText valid UTF-8 text to shape.
     * @param itemLength the length (in bytes) of {@code item_text}. -1 means nul-terminated text.
     * @param paragraphText text of the paragraph (see details).
     * @param paragraphLength the length (in bytes) of {@code paragraph_text}. -1 means nul-terminated text.
     * @param analysis {@code PangoAnalysis} structure from {@link Pango#itemize}.
     * @param glyphs glyph string in which to store results.
     */
    public static void shapeFull(@NotNull java.lang.String itemText, int itemLength, @Nullable java.lang.String paragraphText, int paragraphLength, @NotNull org.pango.Analysis analysis, @NotNull org.pango.GlyphString glyphs) {
        java.util.Objects.requireNonNull(itemText, "Parameter 'itemText' must not be null");
        java.util.Objects.requireNonNull(analysis, "Parameter 'analysis' must not be null");
        java.util.Objects.requireNonNull(glyphs, "Parameter 'glyphs' must not be null");
        try {
            DowncallHandles.pango_shape_full.invokeExact(
                    Interop.allocateNativeString(itemText),
                    itemLength,
                    (Addressable) (paragraphText == null ? MemoryAddress.NULL : Interop.allocateNativeString(paragraphText)),
                    paragraphLength,
                    analysis.handle(),
                    glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert the characters in {@code item} into glyphs.
     * <p>
     * This is similar to {@link Pango#shapeWithFlags}, except it takes a
     * {@code PangoItem} instead of separate {@code item_text} and {@code analysis} arguments.
     * <p>
     * It also takes {@code log_attrs}, which are needed for implementing some aspects
     * of hyphen insertion and text transforms (in particular, capitalization).
     * <p>
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as {@code paragraph_text}, you need
     * to subtract the item offset from their indices before calling
     * {@link Pango#shapeWithFlags}.
     * @param item {@code PangoItem} to shape
     * @param paragraphText text of the paragraph (see details).
     * @param paragraphLength the length (in bytes) of {@code paragraph_text}.
     *     -1 means nul-terminated text.
     * @param logAttrs array of {@code PangoLogAttr} for {@code item}
     * @param glyphs glyph string in which to store results
     * @param flags flags influencing the shaping process
     */
    public static void shapeItem(@NotNull org.pango.Item item, @Nullable java.lang.String paragraphText, int paragraphLength, @Nullable org.pango.LogAttr logAttrs, @NotNull org.pango.GlyphString glyphs, @NotNull org.pango.ShapeFlags flags) {
        java.util.Objects.requireNonNull(item, "Parameter 'item' must not be null");
        java.util.Objects.requireNonNull(glyphs, "Parameter 'glyphs' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.pango_shape_item.invokeExact(
                    item.handle(),
                    (Addressable) (paragraphText == null ? MemoryAddress.NULL : Interop.allocateNativeString(paragraphText)),
                    paragraphLength,
                    (Addressable) (logAttrs == null ? MemoryAddress.NULL : logAttrs.handle()),
                    glyphs.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert the characters in {@code text} into glyphs.
     * <p>
     * Given a segment of text and the corresponding {@code PangoAnalysis} structure
     * returned from {@link Pango#itemize}, convert the characters into glyphs.
     * You may also pass in only a substring of the item from {@link Pango#itemize}.
     * <p>
     * This is similar to {@link Pango#shapeFull}, except it also takes flags
     * that can influence the shaping process.
     * <p>
     * Some aspects of hyphen insertion and text transformation (in particular,
     * capitalization) require log attrs, and thus can only be handled by
     * {@link Pango#shapeItem}.
     * <p>
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as {@code paragraph_text}, you need
     * to subtract the item offset from their indices before calling
     * {@link Pango#shapeWithFlags}.
     * @param itemText valid UTF-8 text to shape
     * @param itemLength the length (in bytes) of {@code item_text}.
     *     -1 means nul-terminated text.
     * @param paragraphText text of the paragraph (see details).
     * @param paragraphLength the length (in bytes) of {@code paragraph_text}.
     *     -1 means nul-terminated text.
     * @param analysis {@code PangoAnalysis} structure from {@link Pango#itemize}
     * @param glyphs glyph string in which to store results
     * @param flags flags influencing the shaping process
     */
    public static void shapeWithFlags(@NotNull java.lang.String itemText, int itemLength, @Nullable java.lang.String paragraphText, int paragraphLength, @NotNull org.pango.Analysis analysis, @NotNull org.pango.GlyphString glyphs, @NotNull org.pango.ShapeFlags flags) {
        java.util.Objects.requireNonNull(itemText, "Parameter 'itemText' must not be null");
        java.util.Objects.requireNonNull(analysis, "Parameter 'analysis' must not be null");
        java.util.Objects.requireNonNull(glyphs, "Parameter 'glyphs' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.pango_shape_with_flags.invokeExact(
                    Interop.allocateNativeString(itemText),
                    itemLength,
                    (Addressable) (paragraphText == null ? MemoryAddress.NULL : Interop.allocateNativeString(paragraphText)),
                    paragraphLength,
                    analysis.handle(),
                    glyphs.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Skips 0 or more characters of white space.
     * @param pos in/out string position
     * @return {@code false} if skipping the white space leaves
     *   the position at a '\\0' character.
     */
    @Deprecated
    public static boolean skipSpace(@NotNull Out<java.lang.String> pos) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_skip_space.invokeExact(
                    (Addressable) posPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pos.set(Interop.getStringFrom(posPOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Splits a {@code G_SEARCHPATH_SEPARATOR}-separated list of files, stripping
     * white space and substituting ~/ with $HOME/.
     * @param str a {@code G_SEARCHPATH_SEPARATOR} separated list of filenames
     * @return a list of
     *   strings to be freed with g_strfreev()
     */
    @Deprecated
    public static @NotNull PointerString splitFileList(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_split_file_list.invokeExact(
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Deserializes a {@code PangoTabArray} from a string.
     * <p>
     * This is the counterpart to {@link TabArray#toString}.
     * See that functions for details about the format.
     * @param text a string
     * @return a new {@code PangoTabArray}
     */
    public static @Nullable org.pango.TabArray tabArrayFromString(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_tab_array_from_string.invokeExact(
                    Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.TabArray(RESULT, Ownership.FULL);
    }
    
    /**
     * Apply language-specific tailoring to the breaks in {@code attrs}.
     * <p>
     * The line breaks are assumed to have been produced by {@link Pango#defaultBreak}.
     * <p>
     * If {@code offset} is not -1, it is used to apply attributes from {@code analysis} that are
     * relevant to line breaking.
     * <p>
     * Note that it is better to pass -1 for {@code offset} and use {@link Pango#attrBreak}
     * to apply attributes to the whole paragraph.
     * @param text text to process. Must be valid UTF-8
     * @param length length in bytes of {@code text}
     * @param analysis {@code PangoAnalysis} for {@code text}
     * @param offset Byte offset of {@code text} from the beginning of the
     *   paragraph, or -1 to ignore attributes from {@code analysis}
     * @param attrs array with one {@code PangoLogAttr}
     *   per character in {@code text}, plus one extra, to be filled in
     * @param attrsLen length of {@code attrs} array
     */
    public static void tailorBreak(@NotNull java.lang.String text, int length, @NotNull org.pango.Analysis analysis, int offset, @NotNull org.pango.LogAttr[] attrs, int attrsLen) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(analysis, "Parameter 'analysis' must not be null");
        java.util.Objects.requireNonNull(attrs, "Parameter 'attrs' must not be null");
        try {
            DowncallHandles.pango_tailor_break.invokeExact(
                    Interop.allocateNativeString(text),
                    length,
                    analysis.handle(),
                    offset,
                    Interop.allocateNativeArray(attrs, org.pango.LogAttr.getMemoryLayout(), false),
                    attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Trims leading and trailing whitespace from a string.
     * @param str a string
     * @return A newly-allocated string that must be freed with g_free()
     */
    @Deprecated
    public static @NotNull java.lang.String trimString(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_trim_string.invokeExact(
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Determines the inherent direction of a character.
     * <p>
     * The inherent direction is either {@code PANGO_DIRECTION_LTR}, {@code PANGO_DIRECTION_RTL},
     * or {@code PANGO_DIRECTION_NEUTRAL}.
     * <p>
     * This function is useful to categorize characters into left-to-right
     * letters, right-to-left letters, and everything else. If full Unicode
     * bidirectional type of a character is needed, {@link BidiType#forUnichar}
     * can be used instead.
     * @param ch a Unicode character
     * @return the direction of the character.
     */
    public static @NotNull org.pango.Direction unicharDirection(int ch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_unichar_direction.invokeExact(
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Direction.of(RESULT);
    }
    
    /**
     * Converts a floating-point number to Pango units.
     * <p>
     * The conversion is done by multiplying {@code d} by {@code PANGO_SCALE} and
     * rounding the result to nearest integer.
     * @param d double floating-point value
     * @return the value in Pango units.
     */
    public static int unitsFromDouble(double d) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_units_from_double.invokeExact(
                    d);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts a number in Pango units to floating-point.
     * <p>
     * The conversion is done by dividing {@code i} by {@code PANGO_SCALE}.
     * @param i value in Pango units
     * @return the double value.
     */
    public static double unitsToDouble(int i) {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.pango_units_to_double.invokeExact(
                    i);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the encoded version of Pango available at run-time.
     * <p>
     * This is similar to the macro {@code PANGO_VERSION} except that the macro
     * returns the encoded version available at compile-time. A version
     * number can be encoded into an integer using PANGO_VERSION_ENCODE().
     * @return The encoded version of Pango library available at run time.
     */
    public static int version() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_version.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks that the Pango library in use is compatible with the
     * given version.
     * <p>
     * Generally you would pass in the constants {@code PANGO_VERSION_MAJOR},
     * {@code PANGO_VERSION_MINOR}, {@code PANGO_VERSION_MICRO} as the three arguments
     * to this function; that produces a check that the library in use at
     * run-time is compatible with the version of Pango the application or
     * module was compiled against.
     * <p>
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version
     * {@code required_major}.required_minor.{@code required_micro}. Second
     * the running library must be binary compatible with the
     * version {@code required_major}.required_minor.{@code required_micro}
     * (same major version.)
     * <p>
     * For compile-time version checking use PANGO_VERSION_CHECK().
     * @param requiredMajor the required major version
     * @param requiredMinor the required minor version
     * @param requiredMicro the required major version
     * @return {@code null} if the Pango library is compatible
     *   with the given version, or a string describing the version
     *   mismatch.  The returned string is owned by Pango and should not
     *   be modified or freed.
     */
    public static @Nullable java.lang.String versionCheck(int requiredMajor, int requiredMinor, int requiredMicro) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_version_check.invokeExact(
                    requiredMajor,
                    requiredMinor,
                    requiredMicro);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the version of Pango available at run-time.
     * <p>
     * This is similar to the macro {@code PANGO_VERSION_STRING} except that the
     * macro returns the version available at compile-time.
     * @return A string containing the version of Pango library available
     *   at run time. The returned string is owned by Pango and should not
     *   be modified or freed.
     */
    public static @NotNull java.lang.String versionString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_version_string.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_allow_breaks_new = Interop.downcallHandle(
            "pango_attr_allow_breaks_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_background_alpha_new = Interop.downcallHandle(
            "pango_attr_background_alpha_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle pango_attr_background_new = Interop.downcallHandle(
            "pango_attr_background_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle pango_attr_baseline_shift_new = Interop.downcallHandle(
            "pango_attr_baseline_shift_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_break = Interop.downcallHandle(
            "pango_attr_break",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_fallback_new = Interop.downcallHandle(
            "pango_attr_fallback_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_family_new = Interop.downcallHandle(
            "pango_attr_family_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_font_desc_new = Interop.downcallHandle(
            "pango_attr_font_desc_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_font_features_new = Interop.downcallHandle(
            "pango_attr_font_features_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_font_scale_new = Interop.downcallHandle(
            "pango_attr_font_scale_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_foreground_alpha_new = Interop.downcallHandle(
            "pango_attr_foreground_alpha_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle pango_attr_foreground_new = Interop.downcallHandle(
            "pango_attr_foreground_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle pango_attr_gravity_hint_new = Interop.downcallHandle(
            "pango_attr_gravity_hint_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_gravity_new = Interop.downcallHandle(
            "pango_attr_gravity_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_insert_hyphens_new = Interop.downcallHandle(
            "pango_attr_insert_hyphens_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_language_new = Interop.downcallHandle(
            "pango_attr_language_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_letter_spacing_new = Interop.downcallHandle(
            "pango_attr_letter_spacing_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_line_height_new = Interop.downcallHandle(
            "pango_attr_line_height_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle pango_attr_line_height_new_absolute = Interop.downcallHandle(
            "pango_attr_line_height_new_absolute",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_list_from_string = Interop.downcallHandle(
            "pango_attr_list_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_overline_color_new = Interop.downcallHandle(
            "pango_attr_overline_color_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle pango_attr_overline_new = Interop.downcallHandle(
            "pango_attr_overline_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_rise_new = Interop.downcallHandle(
            "pango_attr_rise_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_scale_new = Interop.downcallHandle(
            "pango_attr_scale_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle pango_attr_sentence_new = Interop.downcallHandle(
            "pango_attr_sentence_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_shape_new = Interop.downcallHandle(
            "pango_attr_shape_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_shape_new_with_data = Interop.downcallHandle(
            "pango_attr_shape_new_with_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_show_new = Interop.downcallHandle(
            "pango_attr_show_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_size_new = Interop.downcallHandle(
            "pango_attr_size_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_size_new_absolute = Interop.downcallHandle(
            "pango_attr_size_new_absolute",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_stretch_new = Interop.downcallHandle(
            "pango_attr_stretch_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_strikethrough_color_new = Interop.downcallHandle(
            "pango_attr_strikethrough_color_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle pango_attr_strikethrough_new = Interop.downcallHandle(
            "pango_attr_strikethrough_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_style_new = Interop.downcallHandle(
            "pango_attr_style_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_text_transform_new = Interop.downcallHandle(
            "pango_attr_text_transform_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_type_get_name = Interop.downcallHandle(
            "pango_attr_type_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_type_register = Interop.downcallHandle(
            "pango_attr_type_register",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_attr_underline_color_new = Interop.downcallHandle(
            "pango_attr_underline_color_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle pango_attr_underline_new = Interop.downcallHandle(
            "pango_attr_underline_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_variant_new = Interop.downcallHandle(
            "pango_attr_variant_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_weight_new = Interop.downcallHandle(
            "pango_attr_weight_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_attr_word_new = Interop.downcallHandle(
            "pango_attr_word_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_bidi_type_for_unichar = Interop.downcallHandle(
            "pango_bidi_type_for_unichar",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_break = Interop.downcallHandle(
            "pango_break",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_default_break = Interop.downcallHandle(
            "pango_default_break",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_extents_to_pixels = Interop.downcallHandle(
            "pango_extents_to_pixels",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_find_base_dir = Interop.downcallHandle(
            "pango_find_base_dir",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_find_paragraph_boundary = Interop.downcallHandle(
            "pango_find_paragraph_boundary",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_font_description_from_string = Interop.downcallHandle(
            "pango_font_description_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_get_log_attrs = Interop.downcallHandle(
            "pango_get_log_attrs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_get_mirror_char = Interop.downcallHandle(
            "pango_get_mirror_char",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_gravity_get_for_matrix = Interop.downcallHandle(
            "pango_gravity_get_for_matrix",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_gravity_get_for_script = Interop.downcallHandle(
            "pango_gravity_get_for_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_gravity_get_for_script_and_width = Interop.downcallHandle(
            "pango_gravity_get_for_script_and_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_gravity_to_rotation = Interop.downcallHandle(
            "pango_gravity_to_rotation",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_is_zero_width = Interop.downcallHandle(
            "pango_is_zero_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_itemize = Interop.downcallHandle(
            "pango_itemize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_itemize_with_base_dir = Interop.downcallHandle(
            "pango_itemize_with_base_dir",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_from_string = Interop.downcallHandle(
            "pango_language_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_get_default = Interop.downcallHandle(
            "pango_language_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_language_get_preferred = Interop.downcallHandle(
            "pango_language_get_preferred",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle pango_layout_deserialize_error_quark = Interop.downcallHandle(
            "pango_layout_deserialize_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_log2vis_get_embedding_levels = Interop.downcallHandle(
            "pango_log2vis_get_embedding_levels",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_markup_parser_finish = Interop.downcallHandle(
            "pango_markup_parser_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_markup_parser_new = Interop.downcallHandle(
            "pango_markup_parser_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_parse_enum = Interop.downcallHandle(
            "pango_parse_enum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_parse_markup = Interop.downcallHandle(
            "pango_parse_markup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_parse_stretch = Interop.downcallHandle(
            "pango_parse_stretch",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_parse_style = Interop.downcallHandle(
            "pango_parse_style",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_parse_variant = Interop.downcallHandle(
            "pango_parse_variant",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_parse_weight = Interop.downcallHandle(
            "pango_parse_weight",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_quantize_line_geometry = Interop.downcallHandle(
            "pango_quantize_line_geometry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_read_line = Interop.downcallHandle(
            "pango_read_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_reorder_items = Interop.downcallHandle(
            "pango_reorder_items",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_scan_int = Interop.downcallHandle(
            "pango_scan_int",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_scan_string = Interop.downcallHandle(
            "pango_scan_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_scan_word = Interop.downcallHandle(
            "pango_scan_word",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_script_for_unichar = Interop.downcallHandle(
            "pango_script_for_unichar",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_script_get_sample_language = Interop.downcallHandle(
            "pango_script_get_sample_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_shape = Interop.downcallHandle(
            "pango_shape",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_shape_full = Interop.downcallHandle(
            "pango_shape_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_shape_item = Interop.downcallHandle(
            "pango_shape_item",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_shape_with_flags = Interop.downcallHandle(
            "pango_shape_with_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_skip_space = Interop.downcallHandle(
            "pango_skip_space",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_split_file_list = Interop.downcallHandle(
            "pango_split_file_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tab_array_from_string = Interop.downcallHandle(
            "pango_tab_array_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_tailor_break = Interop.downcallHandle(
            "pango_tailor_break",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_trim_string = Interop.downcallHandle(
            "pango_trim_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_unichar_direction = Interop.downcallHandle(
            "pango_unichar_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_units_from_double = Interop.downcallHandle(
            "pango_units_from_double",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle pango_units_to_double = Interop.downcallHandle(
            "pango_units_to_double",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_version = Interop.downcallHandle(
            "pango_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_version_check = Interop.downcallHandle(
            "pango_version_check",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_version_string = Interop.downcallHandle(
            "pango_version_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static int cbFontsetForeachFunc(MemoryAddress fontset, MemoryAddress font, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (FontsetForeachFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onFontsetForeachFunc(new org.pango.Fontset(fontset, Ownership.NONE), new org.pango.Font(font, Ownership.NONE));
            return RESULT ? 1 : 0;
        }
        
        public static Addressable cbAttrDataCopyFunc(MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AttrDataCopyFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onAttrDataCopyFunc();
            return (Addressable) RESULT;
        }
        
        public static int cbAttrFilterFunc(MemoryAddress attribute, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AttrFilterFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onAttrFilterFunc(new org.pango.Attribute(attribute, Ownership.NONE));
            return RESULT ? 1 : 0;
        }
    }
}
