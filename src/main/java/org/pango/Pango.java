package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Pango {
    
    public static final int ANALYSIS_FLAG_CENTERED_BASELINE = 1;

    public static final int ANALYSIS_FLAG_IS_ELLIPSIS = 2;

    public static final int ANALYSIS_FLAG_NEED_HYPHEN = 4;

    public static final int ATTR_INDEX_FROM_TEXT_BEGINNING = 0;

    public static final Glyph GLYPH_EMPTY = new Glyph(268435455);

    public static final Glyph GLYPH_UNKNOWN_FLAG = new Glyph(268435456);

    public static final int SCALE = 1024;

    public static final int VERSION_MAJOR = 1;

    public static final int VERSION_MICRO = 9;

    public static final int VERSION_MINOR = 50;

    public static final java.lang.String VERSION_STRING = "1.50.9";

    static final MethodHandle pango_attr_allow_breaks_new = Interop.downcallHandle(
        "pango_attr_allow_breaks_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new allow-breaks attribute.
     * <p>
     * If breaks are disabled, the range will be kept in a
     * single run, as far as possible.
     */
    public static Attribute attrAllowBreaksNew(boolean allowBreaks) {
        try {
            var RESULT = (MemoryAddress) pango_attr_allow_breaks_new.invokeExact(allowBreaks ? 1 : 0);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_background_alpha_new = Interop.downcallHandle(
        "pango_attr_background_alpha_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Create a new background alpha attribute.
     */
    public static Attribute attrBackgroundAlphaNew(short alpha) {
        try {
            var RESULT = (MemoryAddress) pango_attr_background_alpha_new.invokeExact(alpha);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_background_new = Interop.downcallHandle(
        "pango_attr_background_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Create a new background color attribute.
     */
    public static Attribute attrBackgroundNew(short red, short green, short blue) {
        try {
            var RESULT = (MemoryAddress) pango_attr_background_new.invokeExact(red, green, blue);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_baseline_shift_new = Interop.downcallHandle(
        "pango_attr_baseline_shift_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public static Attribute attrBaselineShiftNew(int shift) {
        try {
            var RESULT = (MemoryAddress) pango_attr_baseline_shift_new.invokeExact(shift);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_break = Interop.downcallHandle(
        "pango_attr_break",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Apply customization from attributes to the breaks in {@code attrs}.
     * <p>
     * The line breaks are assumed to have been produced
     * by {@code Pango.tailor_break}.
     */
    public static void attrBreak(java.lang.String text, int length, AttrList attrList, int offset, LogAttr[] attrs, int attrsLen) {
        try {
            pango_attr_break.invokeExact(Interop.allocateNativeString(text).handle(), length, attrList.handle(), offset, Interop.allocateNativeArray(attrs).handle(), attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_fallback_new = Interop.downcallHandle(
        "pango_attr_fallback_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font fallback attribute.
     * <p>
     * If fallback is disabled, characters will only be
     * used from the closest matching font on the system.
     * No fallback will be done to other fonts on the system
     * that might contain the characters in the text.
     */
    public static Attribute attrFallbackNew(boolean enableFallback) {
        try {
            var RESULT = (MemoryAddress) pango_attr_fallback_new.invokeExact(enableFallback ? 1 : 0);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_family_new = Interop.downcallHandle(
        "pango_attr_family_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new font family attribute.
     */
    public static Attribute attrFamilyNew(java.lang.String family) {
        try {
            var RESULT = (MemoryAddress) pango_attr_family_new.invokeExact(Interop.allocateNativeString(family).handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_font_desc_new = Interop.downcallHandle(
        "pango_attr_font_desc_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new font description attribute.
     * <p>
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     */
    public static Attribute attrFontDescNew(FontDescription desc) {
        try {
            var RESULT = (MemoryAddress) pango_attr_font_desc_new.invokeExact(desc.handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_font_features_new = Interop.downcallHandle(
        "pango_attr_font_features_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new font features tag attribute.
     * <p>
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     */
    public static Attribute attrFontFeaturesNew(java.lang.String features) {
        try {
            var RESULT = (MemoryAddress) pango_attr_font_features_new.invokeExact(Interop.allocateNativeString(features).handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_font_scale_new = Interop.downcallHandle(
        "pango_attr_font_scale_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font scale attribute.
     * <p>
     * The effect of this attribute is to change the font size of a run,
     * relative to the size of preceding run.
     */
    public static Attribute attrFontScaleNew(FontScale scale) {
        try {
            var RESULT = (MemoryAddress) pango_attr_font_scale_new.invokeExact(scale.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_foreground_alpha_new = Interop.downcallHandle(
        "pango_attr_foreground_alpha_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Create a new foreground alpha attribute.
     */
    public static Attribute attrForegroundAlphaNew(short alpha) {
        try {
            var RESULT = (MemoryAddress) pango_attr_foreground_alpha_new.invokeExact(alpha);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_foreground_new = Interop.downcallHandle(
        "pango_attr_foreground_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Create a new foreground color attribute.
     */
    public static Attribute attrForegroundNew(short red, short green, short blue) {
        try {
            var RESULT = (MemoryAddress) pango_attr_foreground_new.invokeExact(red, green, blue);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_gravity_hint_new = Interop.downcallHandle(
        "pango_attr_gravity_hint_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new gravity hint attribute.
     */
    public static Attribute attrGravityHintNew(GravityHint hint) {
        try {
            var RESULT = (MemoryAddress) pango_attr_gravity_hint_new.invokeExact(hint.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_gravity_new = Interop.downcallHandle(
        "pango_attr_gravity_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new gravity attribute.
     */
    public static Attribute attrGravityNew(Gravity gravity) {
        try {
            var RESULT = (MemoryAddress) pango_attr_gravity_new.invokeExact(gravity.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_insert_hyphens_new = Interop.downcallHandle(
        "pango_attr_insert_hyphens_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new insert-hyphens attribute.
     * <p>
     * Pango will insert hyphens when breaking lines in
     * the middle of a word. This attribute can be used
     * to suppress the hyphen.
     */
    public static Attribute attrInsertHyphensNew(boolean insertHyphens) {
        try {
            var RESULT = (MemoryAddress) pango_attr_insert_hyphens_new.invokeExact(insertHyphens ? 1 : 0);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_language_new = Interop.downcallHandle(
        "pango_attr_language_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new language tag attribute.
     */
    public static Attribute attrLanguageNew(Language language) {
        try {
            var RESULT = (MemoryAddress) pango_attr_language_new.invokeExact(language.handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_letter_spacing_new = Interop.downcallHandle(
        "pango_attr_letter_spacing_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new letter-spacing attribute.
     */
    public static Attribute attrLetterSpacingNew(int letterSpacing) {
        try {
            var RESULT = (MemoryAddress) pango_attr_letter_spacing_new.invokeExact(letterSpacing);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_line_height_new = Interop.downcallHandle(
        "pango_attr_line_height_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Modify the height of logical line extents by a factor.
     * <p>
     * This affects the values returned by
     * {@link LayoutLine#getExtents},
     * {@link LayoutLine#getPixelExtents} and
     * {@link LayoutIter#getLineExtents}.
     */
    public static Attribute attrLineHeightNew(double factor) {
        try {
            var RESULT = (MemoryAddress) pango_attr_line_height_new.invokeExact(factor);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_line_height_new_absolute = Interop.downcallHandle(
        "pango_attr_line_height_new_absolute",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Override the height of logical line extents to be {@code height}.
     * <p>
     * This affects the values returned by
     * {@link LayoutLine#getExtents},
     * {@link LayoutLine#getPixelExtents} and
     * {@link LayoutIter#getLineExtents}.
     */
    public static Attribute attrLineHeightNewAbsolute(int height) {
        try {
            var RESULT = (MemoryAddress) pango_attr_line_height_new_absolute.invokeExact(height);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_list_from_string = Interop.downcallHandle(
        "pango_attr_list_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deserializes a {@code PangoAttrList} from a string.
     * <p>
     * This is the counterpart to {@link AttrList#toString}.
     * See that functions for details about the format.
     */
    public static AttrList attrListFromString(java.lang.String text) {
        try {
            var RESULT = (MemoryAddress) pango_attr_list_from_string.invokeExact(Interop.allocateNativeString(text).handle());
            return new AttrList(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_overline_color_new = Interop.downcallHandle(
        "pango_attr_overline_color_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Create a new overline color attribute.
     * <p>
     * This attribute modifies the color of overlines.
     * If not set, overlines will use the foreground color.
     */
    public static Attribute attrOverlineColorNew(short red, short green, short blue) {
        try {
            var RESULT = (MemoryAddress) pango_attr_overline_color_new.invokeExact(red, green, blue);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_overline_new = Interop.downcallHandle(
        "pango_attr_overline_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new overline-style attribute.
     */
    public static Attribute attrOverlineNew(Overline overline) {
        try {
            var RESULT = (MemoryAddress) pango_attr_overline_new.invokeExact(overline.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_rise_new = Interop.downcallHandle(
        "pango_attr_rise_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new baseline displacement attribute.
     */
    public static Attribute attrRiseNew(int rise) {
        try {
            var RESULT = (MemoryAddress) pango_attr_rise_new.invokeExact(rise);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_scale_new = Interop.downcallHandle(
        "pango_attr_scale_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Create a new font size scale attribute.
     * <p>
     * The base font for the affected text will have
     * its size multiplied by {@code scale_factor}.
     */
    public static Attribute attrScaleNew(double scaleFactor) {
        try {
            var RESULT = (MemoryAddress) pango_attr_scale_new.invokeExact(scaleFactor);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_sentence_new = Interop.downcallHandle(
        "pango_attr_sentence_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks the range of the attribute as a single sentence.
     * <p>
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     */
    public static Attribute attrSentenceNew() {
        try {
            var RESULT = (MemoryAddress) pango_attr_sentence_new.invokeExact();
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_shape_new = Interop.downcallHandle(
        "pango_attr_shape_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a new shape attribute.
     * <p>
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a {@code PangoLayout}.
     */
    public static Attribute attrShapeNew(Rectangle inkRect, Rectangle logicalRect) {
        try {
            var RESULT = (MemoryAddress) pango_attr_shape_new.invokeExact(inkRect.handle(), logicalRect.handle());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_shape_new_with_data = Interop.downcallHandle(
        "pango_attr_shape_new_with_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new shape attribute.
     * <p>
     * Like {@link Pango#AttrShape}, but a user data pointer
     * is also provided; this pointer can be accessed when later
     * rendering the glyph.
     */
    public static Attribute attrShapeNewWithData(Rectangle inkRect, Rectangle logicalRect, AttrDataCopyFunc copyFunc) {
        try {
            var RESULT = (MemoryAddress) pango_attr_shape_new_with_data.invokeExact(inkRect.handle(), logicalRect.handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(copyFunc.hashCode(), copyFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Pango.class, "__cbAttrDataCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_show_new = Interop.downcallHandle(
        "pango_attr_show_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new attribute that influences how invisible
     * characters are rendered.
     */
    public static Attribute attrShowNew(ShowFlags flags) {
        try {
            var RESULT = (MemoryAddress) pango_attr_show_new.invokeExact(flags.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_size_new = Interop.downcallHandle(
        "pango_attr_size_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font-size attribute in fractional points.
     */
    public static Attribute attrSizeNew(int size) {
        try {
            var RESULT = (MemoryAddress) pango_attr_size_new.invokeExact(size);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_size_new_absolute = Interop.downcallHandle(
        "pango_attr_size_new_absolute",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font-size attribute in device units.
     */
    public static Attribute attrSizeNewAbsolute(int size) {
        try {
            var RESULT = (MemoryAddress) pango_attr_size_new_absolute.invokeExact(size);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_stretch_new = Interop.downcallHandle(
        "pango_attr_stretch_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font stretch attribute.
     */
    public static Attribute attrStretchNew(Stretch stretch) {
        try {
            var RESULT = (MemoryAddress) pango_attr_stretch_new.invokeExact(stretch.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_strikethrough_color_new = Interop.downcallHandle(
        "pango_attr_strikethrough_color_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Create a new strikethrough color attribute.
     * <p>
     * This attribute modifies the color of strikethrough lines.
     * If not set, strikethrough lines will use the foreground color.
     */
    public static Attribute attrStrikethroughColorNew(short red, short green, short blue) {
        try {
            var RESULT = (MemoryAddress) pango_attr_strikethrough_color_new.invokeExact(red, green, blue);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_strikethrough_new = Interop.downcallHandle(
        "pango_attr_strikethrough_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new strike-through attribute.
     */
    public static Attribute attrStrikethroughNew(boolean strikethrough) {
        try {
            var RESULT = (MemoryAddress) pango_attr_strikethrough_new.invokeExact(strikethrough ? 1 : 0);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_style_new = Interop.downcallHandle(
        "pango_attr_style_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font slant style attribute.
     */
    public static Attribute attrStyleNew(Style style) {
        try {
            var RESULT = (MemoryAddress) pango_attr_style_new.invokeExact(style.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_text_transform_new = Interop.downcallHandle(
        "pango_attr_text_transform_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new attribute that influences how characters
     * are transformed during shaping.
     */
    public static Attribute attrTextTransformNew(TextTransform transform) {
        try {
            var RESULT = (MemoryAddress) pango_attr_text_transform_new.invokeExact(transform.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_type_get_name = Interop.downcallHandle(
        "pango_attr_type_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the attribute type name.
     * <p>
     * The attribute type name is the string passed in
     * when registering the type using
     * {@link Pango#AttrType}.
     * <p>
     * The returned value is an interned string (see
     * g_intern_string() for what that means) that should
     * not be modified or freed.
     */
    public static java.lang.String attrTypeGetName(AttrType type) {
        try {
            var RESULT = (MemoryAddress) pango_attr_type_get_name.invokeExact(type.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_type_register = Interop.downcallHandle(
        "pango_attr_type_register",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocate a new attribute type ID.
     * <p>
     * The attribute type name can be accessed later
     * by using {@link Pango#AttrType}.
     */
    public static AttrType attrTypeRegister(java.lang.String name) {
        try {
            var RESULT = (int) pango_attr_type_register.invokeExact(Interop.allocateNativeString(name).handle());
            return new AttrType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_underline_color_new = Interop.downcallHandle(
        "pango_attr_underline_color_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)
    );
    
    /**
     * Create a new underline color attribute.
     * <p>
     * This attribute modifies the color of underlines.
     * If not set, underlines will use the foreground color.
     */
    public static Attribute attrUnderlineColorNew(short red, short green, short blue) {
        try {
            var RESULT = (MemoryAddress) pango_attr_underline_color_new.invokeExact(red, green, blue);
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_underline_new = Interop.downcallHandle(
        "pango_attr_underline_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new underline-style attribute.
     */
    public static Attribute attrUnderlineNew(Underline underline) {
        try {
            var RESULT = (MemoryAddress) pango_attr_underline_new.invokeExact(underline.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_variant_new = Interop.downcallHandle(
        "pango_attr_variant_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font variant attribute (normal or small caps).
     */
    public static Attribute attrVariantNew(Variant variant) {
        try {
            var RESULT = (MemoryAddress) pango_attr_variant_new.invokeExact(variant.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_weight_new = Interop.downcallHandle(
        "pango_attr_weight_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new font weight attribute.
     */
    public static Attribute attrWeightNew(Weight weight) {
        try {
            var RESULT = (MemoryAddress) pango_attr_weight_new.invokeExact(weight.getValue());
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_attr_word_new = Interop.downcallHandle(
        "pango_attr_word_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks the range of the attribute as a single word.
     * <p>
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     */
    public static Attribute attrWordNew() {
        try {
            var RESULT = (MemoryAddress) pango_attr_word_new.invokeExact();
            return new Attribute(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_bidi_type_for_unichar = Interop.downcallHandle(
        "pango_bidi_type_for_unichar",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the bidirectional type of a character.
     * <p>
     * The bidirectional type is specified in the Unicode Character Database.
     * <p>
     * A simplified version of this function is available as {@link unichar_direction#null}.
     */
    public static BidiType bidiTypeForUnichar(int ch) {
        try {
            var RESULT = (int) pango_bidi_type_for_unichar.invokeExact(ch);
            return new BidiType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_default_break = Interop.downcallHandle(
        "pango_default_break",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public static void defaultBreak(java.lang.String text, int length, Analysis analysis, LogAttr attrs, int attrsLen) {
        try {
            pango_default_break.invokeExact(Interop.allocateNativeString(text).handle(), length, analysis.handle(), attrs.handle(), attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_extents_to_pixels = Interop.downcallHandle(
        "pango_extents_to_pixels",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static void extentsToPixels(Rectangle inclusive, Rectangle nearest) {
        try {
            pango_extents_to_pixels.invokeExact(inclusive.handle(), nearest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_find_base_dir = Interop.downcallHandle(
        "pango_find_base_dir",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Searches a string the first character that has a strong
     * direction, according to the Unicode bidirectional algorithm.
     */
    public static Direction findBaseDir(java.lang.String text, int length) {
        try {
            var RESULT = (int) pango_find_base_dir.invokeExact(Interop.allocateNativeString(text).handle(), length);
            return new Direction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_find_paragraph_boundary = Interop.downcallHandle(
        "pango_find_paragraph_boundary",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static void findParagraphBoundary(java.lang.String text, int length, PointerInteger paragraphDelimiterIndex, PointerInteger nextParagraphStart) {
        try {
            pango_find_paragraph_boundary.invokeExact(Interop.allocateNativeString(text).handle(), length, paragraphDelimiterIndex.handle(), nextParagraphStart.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_font_description_from_string = Interop.downcallHandle(
        "pango_font_description_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static FontDescription fontDescriptionFromString(java.lang.String str) {
        try {
            var RESULT = (MemoryAddress) pango_font_description_from_string.invokeExact(Interop.allocateNativeString(str).handle());
            return new FontDescription(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_get_log_attrs = Interop.downcallHandle(
        "pango_get_log_attrs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public static void getLogAttrs(java.lang.String text, int length, int level, Language language, LogAttr[] attrs, int attrsLen) {
        try {
            pango_get_log_attrs.invokeExact(Interop.allocateNativeString(text).handle(), length, level, language.handle(), Interop.allocateNativeArray(attrs).handle(), attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_gravity_get_for_matrix = Interop.downcallHandle(
        "pango_gravity_get_for_matrix",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the gravity that best matches the rotation component
     * in a {@code PangoMatrix}.
     */
    public static Gravity gravityGetForMatrix(Matrix matrix) {
        try {
            var RESULT = (int) pango_gravity_get_for_matrix.invokeExact(matrix.handle());
            return new Gravity(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_gravity_get_for_script = Interop.downcallHandle(
        "pango_gravity_get_for_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the gravity to use in laying out a {@code PangoItem}.
     * <p>
     * The gravity is determined based on the script, base gravity, and hint.
     * <p>
     * If {@code base_gravity} is {@link Gravity#AUTO}, it is first replaced with the
     * preferred gravity of {@code script}.  To get the preferred gravity of a script,
     * pass {@link Gravity#AUTO} and {@link GravityHint#STRONG} in.
     */
    public static Gravity gravityGetForScript(Script script, Gravity baseGravity, GravityHint hint) {
        try {
            var RESULT = (int) pango_gravity_get_for_script.invokeExact(script.getValue(), baseGravity.getValue(), hint.getValue());
            return new Gravity(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_gravity_get_for_script_and_width = Interop.downcallHandle(
        "pango_gravity_get_for_script_and_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the gravity to use in laying out a single character
     * or {@code PangoItem}.
     * <p>
     * The gravity is determined based on the script, East Asian width,
     * base gravity, and hint,
     * <p>
     * This function is similar to {@link Pango#Gravity} except
     * that this function makes a distinction between narrow/half-width and
     * wide/full-width characters also. Wide/full-width characters always
     * stand <strong>upright</strong>, that is, they always take the base gravity,
     * whereas narrow/full-width characters are always rotated in vertical
     * context.
     * <p>
     * If {@code base_gravity} is {@link Gravity#AUTO}, it is first replaced with the
     * preferred gravity of {@code script}.
     */
    public static Gravity gravityGetForScriptAndWidth(Script script, boolean wide, Gravity baseGravity, GravityHint hint) {
        try {
            var RESULT = (int) pango_gravity_get_for_script_and_width.invokeExact(script.getValue(), wide ? 1 : 0, baseGravity.getValue(), hint.getValue());
            return new Gravity(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_gravity_to_rotation = Interop.downcallHandle(
        "pango_gravity_to_rotation",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a {@code PangoGravity} value to its natural rotation in radians.
     * <p>
     * Note that {@link Matrix#rotate} takes angle in degrees, not radians.
     * So, to call {@link Pango#Matrix,rotate} with the output of this function
     * you should multiply it by (180. / G_PI).
     */
    public static double gravityToRotation(Gravity gravity) {
        try {
            var RESULT = (double) pango_gravity_to_rotation.invokeExact(gravity.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_is_zero_width = Interop.downcallHandle(
        "pango_is_zero_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if a character that should not be normally rendered.
     * <p>
     * This includes all Unicode characters with "ZERO WIDTH" in their name,
     * as well as <strong>bidi</strong> formatting characters, and a few other ones.
     * <p>
     * This is totally different from {@link GLib#unicharIszerowidth} and is at best misnamed.
     */
    public static boolean isZeroWidth(int ch) {
        try {
            var RESULT = (int) pango_is_zero_width.invokeExact(ch);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_itemize = Interop.downcallHandle(
        "pango_itemize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static org.gtk.glib.List itemize(Context context, java.lang.String text, int startIndex, int length, AttrList attrs, AttrIterator cachedIter) {
        try {
            var RESULT = (MemoryAddress) pango_itemize.invokeExact(context.handle(), Interop.allocateNativeString(text).handle(), startIndex, length, attrs.handle(), cachedIter.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_itemize_with_base_dir = Interop.downcallHandle(
        "pango_itemize_with_base_dir",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like {@code pango_itemize()}, but with an explicitly specified base direction.
     * <p>
     * The base direction is used when computing bidirectional levels.
     * {@link itemize#null} gets the base direction from the {@code PangoContext}
     * (see {@link Context#setBaseDir}).
     */
    public static org.gtk.glib.List itemizeWithBaseDir(Context context, Direction baseDir, java.lang.String text, int startIndex, int length, AttrList attrs, AttrIterator cachedIter) {
        try {
            var RESULT = (MemoryAddress) pango_itemize_with_base_dir.invokeExact(context.handle(), baseDir.getValue(), Interop.allocateNativeString(text).handle(), startIndex, length, attrs.handle(), cachedIter.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_from_string = Interop.downcallHandle(
        "pango_language_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * Use {@link Pango#Language} if you want to get the
     * {@code PangoLanguage} for the current locale of the process.
     */
    public static Language languageFromString(java.lang.String language) {
        try {
            var RESULT = (MemoryAddress) pango_language_from_string.invokeExact(Interop.allocateNativeString(language).handle());
            return new Language(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_get_default = Interop.downcallHandle(
        "pango_language_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
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
     */
    public static Language languageGetDefault() {
        try {
            var RESULT = (MemoryAddress) pango_language_get_default.invokeExact();
            return new Language(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_language_get_preferred = Interop.downcallHandle(
        "pango_language_get_preferred",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the list of languages that the user prefers.
     * <p>
     * The list is specified by the {@code PANGO_LANGUAGE} or {@code LANGUAGE}
     * environment variables, in order of preference. Note that this
     * list does not necessarily include the language returned by
     * {@link Pango#Language}.
     * <p>
     * When choosing language-specific resources, such as the sample
     * text returned by {@link Language#getSampleString},
     * you should first try the default language, followed by the
     * languages returned by this function.
     */
    public static PointerProxy<Language> languageGetPreferred() {
        try {
            var RESULT = (MemoryAddress) pango_language_get_preferred.invokeExact();
            return new PointerProxy<Language>(RESULT, Language.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_deserialize_error_quark = Interop.downcallHandle(
        "pango_layout_deserialize_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static org.gtk.glib.Quark layoutDeserializeErrorQuark() {
        try {
            var RESULT = (int) pango_layout_deserialize_error_quark.invokeExact();
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_log2vis_get_embedding_levels = Interop.downcallHandle(
        "pango_log2vis_get_embedding_levels",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Return the bidirectional embedding levels of the input paragraph.
     * <p>
     * The bidirectional embedding levels are defined by the [Unicode Bidirectional
     * Algorithm](http://www.unicode.org/reports/tr9/).
     * <p>
     * If the input base direction is a weak direction, the direction of the
     * characters in the text will determine the final resolved direction.
     */
    public static PointerByte log2visGetEmbeddingLevels(java.lang.String text, int length, Direction pbaseDir) {
        try {
            var RESULT = (MemoryAddress) pango_log2vis_get_embedding_levels.invokeExact(Interop.allocateNativeString(text).handle(), length, new PointerInteger(pbaseDir.getValue()).handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_markup_parser_finish = Interop.downcallHandle(
        "pango_markup_parser_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes parsing markup.
     * <p>
     * After feeding a Pango markup parser some data with {@link org.gtk.glib.MarkupParseContext#parse},
     * use this function to get the list of attributes and text out of the
     * markup. This function will not free {@code context}, use {@link org.gtk.glib.MarkupParseContext#free}
     * to do so.
     */
    public static boolean markupParserFinish(org.gtk.glib.MarkupParseContext context, PointerProxy<AttrList> attrList, PointerString text, PointerInteger accelChar) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) pango_markup_parser_finish.invokeExact(context.handle(), attrList.handle(), text.handle(), accelChar.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_markup_parser_new = Interop.downcallHandle(
        "pango_markup_parser_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     * when calling {@code accel_marker characters
     * following each other produce a single literal @accel_marker character.
     * 
     * To feed markup to the parser, use [method@GLib.MarkupParseContext.parse}
     * on the returned {@code GLib.MarkupParseContext}. When done with feeding markup
     * to the parser, use {@link markup_parser_finish#null} to get the data out
     * of it, and then use {@link org.gtk.glib.MarkupParseContext#free} to free it.
     * <p>
     * This function is designed for applications that read Pango markup
     * from streams. To simply parse a string containing Pango markup,
     * the {@link Pango#parseMarkup} API is recommended instead.
     */
    public static org.gtk.glib.MarkupParseContext markupParserNew(int accelMarker) {
        try {
            var RESULT = (MemoryAddress) pango_markup_parser_new.invokeExact(accelMarker);
            return new org.gtk.glib.MarkupParseContext(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_parse_markup = Interop.downcallHandle(
        "pango_parse_markup",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * To parse a stream of pango markup incrementally, use {@link markup_parser_new#null}.
     * <p>
     * If any error happens, none of the output arguments are touched except
     * for {@code error}.
     */
    public static boolean parseMarkup(java.lang.String markupText, int length, int accelMarker, PointerProxy<AttrList> attrList, PointerString text, PointerInteger accelChar) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) pango_parse_markup.invokeExact(Interop.allocateNativeString(markupText).handle(), length, accelMarker, attrList.handle(), text.handle(), accelChar.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_parse_stretch = Interop.downcallHandle(
        "pango_parse_stretch",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses a font stretch.
     * <p>
     * The allowed values are
     * "ultra_condensed", "extra_condensed", "condensed",
     * "semi_condensed", "normal", "semi_expanded", "expanded",
     * "extra_expanded" and "ultra_expanded". Case variations are
     * ignored and the '_' characters may be omitted.
     */
    public static boolean parseStretch(java.lang.String str, Stretch stretch, boolean warn) {
        try {
            var RESULT = (int) pango_parse_stretch.invokeExact(Interop.allocateNativeString(str).handle(), new PointerInteger(stretch.getValue()).handle(), warn ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_parse_style = Interop.downcallHandle(
        "pango_parse_style",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses a font style.
     * <p>
     * The allowed values are "normal", "italic" and "oblique", case
     * variations being
     * ignored.
     */
    public static boolean parseStyle(java.lang.String str, Style style, boolean warn) {
        try {
            var RESULT = (int) pango_parse_style.invokeExact(Interop.allocateNativeString(str).handle(), new PointerInteger(style.getValue()).handle(), warn ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_parse_variant = Interop.downcallHandle(
        "pango_parse_variant",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses a font variant.
     * <p>
     * The allowed values are "normal", "small-caps", "all-small-caps",
     * "petite-caps", "all-petite-caps", "unicase" and "title-caps",
     * case variations being ignored.
     */
    public static boolean parseVariant(java.lang.String str, Variant variant, boolean warn) {
        try {
            var RESULT = (int) pango_parse_variant.invokeExact(Interop.allocateNativeString(str).handle(), new PointerInteger(variant.getValue()).handle(), warn ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_parse_weight = Interop.downcallHandle(
        "pango_parse_weight",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses a font weight.
     * <p>
     * The allowed values are "heavy",
     * "ultrabold", "bold", "normal", "light", "ultraleight"
     * and integers. Case variations are ignored.
     */
    public static boolean parseWeight(java.lang.String str, Weight weight, boolean warn) {
        try {
            var RESULT = (int) pango_parse_weight.invokeExact(Interop.allocateNativeString(str).handle(), new PointerInteger(weight.getValue()).handle(), warn ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_quantize_line_geometry = Interop.downcallHandle(
        "pango_quantize_line_geometry",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Quantizes the thickness and position of a line to whole device pixels.
     * <p>
     * This is typically used for underline or strikethrough. The purpose of
     * this function is to avoid such lines looking blurry.
     * <p>
     * Care is taken to make sure {@code thickness} is at least one pixel when this
     * function returns, but returned {@code position} may become zero as a result
     * of rounding.
     */
    public static void quantizeLineGeometry(PointerInteger thickness, PointerInteger position) {
        try {
            pango_quantize_line_geometry.invokeExact(thickness.handle(), position.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_reorder_items = Interop.downcallHandle(
        "pango_reorder_items",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reorder items from logical order to visual order.
     * <p>
     * The visual order is determined from the associated directional
     * levels of the items. The original list is unmodified.
     * <p>
     * (Please open a bug if you use this function.
     *  It is not a particularly convenient interface, and the code
     *  is duplicated elsewhere in Pango for that reason.)
     */
    public static org.gtk.glib.List reorderItems(org.gtk.glib.List items) {
        try {
            var RESULT = (MemoryAddress) pango_reorder_items.invokeExact(items.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_script_get_sample_language = Interop.downcallHandle(
        "pango_script_get_sample_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public static Language scriptGetSampleLanguage(Script script) {
        try {
            var RESULT = (MemoryAddress) pango_script_get_sample_language.invokeExact(script.getValue());
            return new Language(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_shape = Interop.downcallHandle(
        "pango_shape",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you need to subtract the item offset from their indices before
     * calling {@link Pango#shape}.
     */
    public static void shape(java.lang.String text, int length, Analysis analysis, GlyphString glyphs) {
        try {
            pango_shape.invokeExact(Interop.allocateNativeString(text).handle(), length, analysis.handle(), glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_shape_full = Interop.downcallHandle(
        "pango_shape_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as {@code paragraph_text}, you need
     * to subtract the item offset from their indices before calling
     * {@link Pango#shapeFull}.
     */
    public static void shapeFull(java.lang.String itemText, int itemLength, java.lang.String paragraphText, int paragraphLength, Analysis analysis, GlyphString glyphs) {
        try {
            pango_shape_full.invokeExact(Interop.allocateNativeString(itemText).handle(), itemLength, Interop.allocateNativeString(paragraphText).handle(), paragraphLength, analysis.handle(), glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_shape_item = Interop.downcallHandle(
        "pango_shape_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Convert the characters in {@code item} into glyphs.
     * <p>
     * This is similar to {@link Pango#shapeWithFlags}, except it takes a
     * {@code PangoItem} instead of separate {@code item_text} and {@code analysis} arguments.
     * It also takes {@code log_attrs}, which may be used in implementing text
     * transforms.
     * <p>
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as {@code paragraph_text}, you need
     * to subtract the item offset from their indices before calling
     * {@link Pango#shapeWithFlags}.
     */
    public static void shapeItem(Item item, java.lang.String paragraphText, int paragraphLength, LogAttr logAttrs, GlyphString glyphs, ShapeFlags flags) {
        try {
            pango_shape_item.invokeExact(item.handle(), Interop.allocateNativeString(paragraphText).handle(), paragraphLength, logAttrs.handle(), glyphs.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_shape_with_flags = Interop.downcallHandle(
        "pango_shape_with_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     * Note that the extra attributes in the {@code analyis} that is returned from
     * {@link Pango#itemize} have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as {@code paragraph_text}, you need
     * to subtract the item offset from their indices before calling
     * {@link Pango#shapeWithFlags}.
     */
    public static void shapeWithFlags(java.lang.String itemText, int itemLength, java.lang.String paragraphText, int paragraphLength, Analysis analysis, GlyphString glyphs, ShapeFlags flags) {
        try {
            pango_shape_with_flags.invokeExact(Interop.allocateNativeString(itemText).handle(), itemLength, Interop.allocateNativeString(paragraphText).handle(), paragraphLength, analysis.handle(), glyphs.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tab_array_from_string = Interop.downcallHandle(
        "pango_tab_array_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deserializes a {@code PangoTabArray} from a string.
     * <p>
     * This is the counterpart to {@link TabArray#toString}.
     * See that functions for details about the format.
     */
    public static TabArray tabArrayFromString(java.lang.String text) {
        try {
            var RESULT = (MemoryAddress) pango_tab_array_from_string.invokeExact(Interop.allocateNativeString(text).handle());
            return new TabArray(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_tailor_break = Interop.downcallHandle(
        "pango_tailor_break",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public static void tailorBreak(java.lang.String text, int length, Analysis analysis, int offset, LogAttr[] attrs, int attrsLen) {
        try {
            pango_tailor_break.invokeExact(Interop.allocateNativeString(text).handle(), length, analysis.handle(), offset, Interop.allocateNativeArray(attrs).handle(), attrsLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_unichar_direction = Interop.downcallHandle(
        "pango_unichar_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the inherent direction of a character.
     * <p>
     * The inherent direction is either {@code PANGO_DIRECTION_LTR}, {@code PANGO_DIRECTION_RTL},
     * or {@code PANGO_DIRECTION_NEUTRAL}.
     * <p>
     * This function is useful to categorize characters into left-to-right
     * letters, right-to-left letters, and everything else. If full Unicode
     * bidirectional type of a character is needed, {@link Pango#BidiType}
     * can be used instead.
     */
    public static Direction unicharDirection(int ch) {
        try {
            var RESULT = (int) pango_unichar_direction.invokeExact(ch);
            return new Direction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_units_from_double = Interop.downcallHandle(
        "pango_units_from_double",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Converts a floating-point number to Pango units.
     * <p>
     * The conversion is done by multiplying @d by {@code PANGO_SCALE} and
     * rounding the result to nearest integer.
     */
    public static int unitsFromDouble(double d) {
        try {
            var RESULT = (int) pango_units_from_double.invokeExact(d);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_units_to_double = Interop.downcallHandle(
        "pango_units_to_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a number in Pango units to floating-point.
     * <p>
     * The conversion is done by dividing @i by {@code PANGO_SCALE}.
     */
    public static double unitsToDouble(int i) {
        try {
            var RESULT = (double) pango_units_to_double.invokeExact(i);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_version = Interop.downcallHandle(
        "pango_version",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the encoded version of Pango available at run-time.
     * <p>
     * This is similar to the macro {@code PANGO_VERSION} except that the macro
     * returns the encoded version available at compile-time. A version
     * number can be encoded into an integer using PANGO_VERSION_ENCODE().
     */
    public static int version() {
        try {
            var RESULT = (int) pango_version.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_version_check = Interop.downcallHandle(
        "pango_version_check",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public static java.lang.String versionCheck(int requiredMajor, int requiredMinor, int requiredMicro) {
        try {
            var RESULT = (MemoryAddress) pango_version_check.invokeExact(requiredMajor, requiredMinor, requiredMicro);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_version_string = Interop.downcallHandle(
        "pango_version_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the version of Pango available at run-time.
     * <p>
     * This is similar to the macro {@code PANGO_VERSION_STRING} except that the
     * macro returns the version available at compile-time.
     */
    public static java.lang.String versionString() {
        try {
            var RESULT = (MemoryAddress) pango_version_string.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean __cbFontsetForeachFunc(MemoryAddress fontset, MemoryAddress font, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (FontsetForeachFunc) Interop.signalRegistry.get(hash);
        return handler.onFontsetForeachFunc(new Fontset(Refcounted.get(fontset, false)), new Font(Refcounted.get(font, false)));
    }
    
    public static java.lang.foreign.MemoryAddress __cbAttrDataCopyFunc(MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (AttrDataCopyFunc) Interop.signalRegistry.get(hash);
        return handler.onAttrDataCopyFunc();
    }
    
    public static boolean __cbAttrFilterFunc(MemoryAddress attribute, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (AttrFilterFunc) Interop.signalRegistry.get(hash);
        return handler.onAttrFilterFunc(new Attribute(Refcounted.get(attribute, false)));
    }
    
}
