package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class Pango {
    
    /**
     * Create a new allow-breaks attribute.
     * 
     * If breaks are disabled, the range will be kept in a
     * single run, as far as possible.
     */
    public static Attribute attrAllowBreaksNew(boolean allowBreaks) {
        var RESULT = gtk_h.pango_attr_allow_breaks_new(allowBreaks ? 1 : 0);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new background alpha attribute.
     */
    public static Attribute attrBackgroundAlphaNew(short alpha) {
        var RESULT = gtk_h.pango_attr_background_alpha_new(alpha);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new background color attribute.
     */
    public static Attribute attrBackgroundNew(short red, short green, short blue) {
        var RESULT = gtk_h.pango_attr_background_new(red, green, blue);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new baseline displacement attribute.
     * 
     * The effect of this attribute is to shift the baseline of a run,
     * relative to the run of preceding run.
     * 
     * <picture>
     *   <source srcset="baseline-shift-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Baseline Shift" src="baseline-shift-light.png">
     * </picture>
     */
    public static Attribute attrBaselineShiftNew(int shift) {
        var RESULT = gtk_h.pango_attr_baseline_shift_new(shift);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Apply customization from attributes to the breaks in @attrs.
     * 
     * The line breaks are assumed to have been produced
     * by [func@Pango.default_break] and [func@Pango.tailor_break].
     */
    public static void attrBreak(java.lang.String text, int length, AttrList attrList, int offset, LogAttr[] attrs, int attrsLen) {
        gtk_h.pango_attr_break(Interop.allocateNativeString(text).handle(), length, attrList.handle(), offset, Interop.allocateNativeArray(attrs).handle(), attrsLen);
    }
    
    /**
     * Create a new font fallback attribute.
     * 
     * If fallback is disabled, characters will only be
     * used from the closest matching font on the system.
     * No fallback will be done to other fonts on the system
     * that might contain the characters in the text.
     */
    public static Attribute attrFallbackNew(boolean enableFallback) {
        var RESULT = gtk_h.pango_attr_fallback_new(enableFallback ? 1 : 0);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font family attribute.
     */
    public static Attribute attrFamilyNew(java.lang.String family) {
        var RESULT = gtk_h.pango_attr_family_new(Interop.allocateNativeString(family).handle());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font description attribute.
     * 
     * This attribute allows setting family, style, weight, variant,
     * stretch, and size simultaneously.
     */
    public static Attribute attrFontDescNew(FontDescription desc) {
        var RESULT = gtk_h.pango_attr_font_desc_new(desc.handle());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font features tag attribute.
     * 
     * You can use this attribute to select OpenType font features like small-caps,
     * alternative glyphs, ligatures, etc. for fonts that support them.
     */
    public static Attribute attrFontFeaturesNew(java.lang.String features) {
        var RESULT = gtk_h.pango_attr_font_features_new(Interop.allocateNativeString(features).handle());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font scale attribute.
     * 
     * The effect of this attribute is to change the font size of a run,
     * relative to the size of preceding run.
     */
    public static Attribute attrFontScaleNew(FontScale scale) {
        var RESULT = gtk_h.pango_attr_font_scale_new(scale.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new foreground alpha attribute.
     */
    public static Attribute attrForegroundAlphaNew(short alpha) {
        var RESULT = gtk_h.pango_attr_foreground_alpha_new(alpha);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new foreground color attribute.
     */
    public static Attribute attrForegroundNew(short red, short green, short blue) {
        var RESULT = gtk_h.pango_attr_foreground_new(red, green, blue);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new gravity hint attribute.
     */
    public static Attribute attrGravityHintNew(GravityHint hint) {
        var RESULT = gtk_h.pango_attr_gravity_hint_new(hint.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new gravity attribute.
     */
    public static Attribute attrGravityNew(Gravity gravity) {
        var RESULT = gtk_h.pango_attr_gravity_new(gravity.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new insert-hyphens attribute.
     * 
     * Pango will insert hyphens when breaking lines in
     * the middle of a word. This attribute can be used
     * to suppress the hyphen.
     */
    public static Attribute attrInsertHyphensNew(boolean insertHyphens) {
        var RESULT = gtk_h.pango_attr_insert_hyphens_new(insertHyphens ? 1 : 0);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new language tag attribute.
     */
    public static Attribute attrLanguageNew(Language language) {
        var RESULT = gtk_h.pango_attr_language_new(language.handle());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new letter-spacing attribute.
     */
    public static Attribute attrLetterSpacingNew(int letterSpacing) {
        var RESULT = gtk_h.pango_attr_letter_spacing_new(letterSpacing);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Modify the height of logical line extents by a factor.
     * 
     * This affects the values returned by
     * [method@Pango.LayoutLine.get_extents],
     * [method@Pango.LayoutLine.get_pixel_extents] and
     * [method@Pango.LayoutIter.get_line_extents].
     */
    public static Attribute attrLineHeightNew(double factor) {
        var RESULT = gtk_h.pango_attr_line_height_new(factor);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Override the height of logical line extents to be @height.
     * 
     * This affects the values returned by
     * [method@Pango.LayoutLine.get_extents],
     * [method@Pango.LayoutLine.get_pixel_extents] and
     * [method@Pango.LayoutIter.get_line_extents].
     */
    public static Attribute attrLineHeightNewAbsolute(int height) {
        var RESULT = gtk_h.pango_attr_line_height_new_absolute(height);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Deserializes a `PangoAttrList` from a string.
     * 
     * This is the counterpart to [method@Pango.AttrList.to_string].
     * See that functions for details about the format.
     */
    public static AttrList attrListFromString(java.lang.String text) {
        var RESULT = gtk_h.pango_attr_list_from_string(Interop.allocateNativeString(text).handle());
        return new AttrList(References.get(RESULT, true));
    }
    
    /**
     * Create a new overline color attribute.
     * 
     * This attribute modifies the color of overlines.
     * If not set, overlines will use the foreground color.
     */
    public static Attribute attrOverlineColorNew(short red, short green, short blue) {
        var RESULT = gtk_h.pango_attr_overline_color_new(red, green, blue);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new overline-style attribute.
     */
    public static Attribute attrOverlineNew(Overline overline) {
        var RESULT = gtk_h.pango_attr_overline_new(overline.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new baseline displacement attribute.
     */
    public static Attribute attrRiseNew(int rise) {
        var RESULT = gtk_h.pango_attr_rise_new(rise);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font size scale attribute.
     * 
     * The base font for the affected text will have
     * its size multiplied by @scale_factor.
     */
    public static Attribute attrScaleNew(double scaleFactor) {
        var RESULT = gtk_h.pango_attr_scale_new(scaleFactor);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Marks the range of the attribute as a single sentence.
     * 
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     */
    public static Attribute attrSentenceNew() {
        var RESULT = gtk_h.pango_attr_sentence_new();
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new shape attribute.
     * 
     * A shape is used to impose a particular ink and logical
     * rectangle on the result of shaping a particular glyph.
     * This might be used, for instance, for embedding a picture
     * or a widget inside a `PangoLayout`.
     */
    public static Attribute attrShapeNew(Rectangle inkRect, Rectangle logicalRect) {
        var RESULT = gtk_h.pango_attr_shape_new(inkRect.handle(), logicalRect.handle());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Creates a new shape attribute.
     * 
     * Like [func@Pango.AttrShape.new], but a user data pointer
     * is also provided; this pointer can be accessed when later
     * rendering the glyph.
     */
    public static Attribute attrShapeNewWithData(Rectangle inkRect, Rectangle logicalRect, AttrDataCopyFunc copyFunc) {
        try {
            var RESULT = gtk_h.pango_attr_shape_new_with_data(inkRect.handle(), logicalRect.handle(), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(copyFunc.hashCode(), copyFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAttrDataCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol());
            return new Attribute(References.get(RESULT, true));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Create a new attribute that influences how invisible
     * characters are rendered.
     */
    public static Attribute attrShowNew(int flags) {
        var RESULT = gtk_h.pango_attr_show_new(flags);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font-size attribute in fractional points.
     */
    public static Attribute attrSizeNew(int size) {
        var RESULT = gtk_h.pango_attr_size_new(size);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font-size attribute in device units.
     */
    public static Attribute attrSizeNewAbsolute(int size) {
        var RESULT = gtk_h.pango_attr_size_new_absolute(size);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font stretch attribute.
     */
    public static Attribute attrStretchNew(Stretch stretch) {
        var RESULT = gtk_h.pango_attr_stretch_new(stretch.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new strikethrough color attribute.
     * 
     * This attribute modifies the color of strikethrough lines.
     * If not set, strikethrough lines will use the foreground color.
     */
    public static Attribute attrStrikethroughColorNew(short red, short green, short blue) {
        var RESULT = gtk_h.pango_attr_strikethrough_color_new(red, green, blue);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new strike-through attribute.
     */
    public static Attribute attrStrikethroughNew(boolean strikethrough) {
        var RESULT = gtk_h.pango_attr_strikethrough_new(strikethrough ? 1 : 0);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font slant style attribute.
     */
    public static Attribute attrStyleNew(Style style) {
        var RESULT = gtk_h.pango_attr_style_new(style.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new attribute that influences how characters
     * are transformed during shaping.
     */
    public static Attribute attrTextTransformNew(TextTransform transform) {
        var RESULT = gtk_h.pango_attr_text_transform_new(transform.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Fetches the attribute type name.
     * 
     * The attribute type name is the string passed in
     * when registering the type using
     * [func@Pango.AttrType.register].
     * 
     * The returned value is an interned string (see
     * g_intern_string() for what that means) that should
     * not be modified or freed.
     */
    public static java.lang.String attrTypeGetName(AttrType type) {
        var RESULT = gtk_h.pango_attr_type_get_name(type.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Allocate a new attribute type ID.
     * 
     * The attribute type name can be accessed later
     * by using [func@Pango.AttrType.get_name].
     */
    public static AttrType attrTypeRegister(java.lang.String name) {
        var RESULT = gtk_h.pango_attr_type_register(Interop.allocateNativeString(name).handle());
        return AttrType.fromValue(RESULT);
    }
    
    /**
     * Create a new underline color attribute.
     * 
     * This attribute modifies the color of underlines.
     * If not set, underlines will use the foreground color.
     */
    public static Attribute attrUnderlineColorNew(short red, short green, short blue) {
        var RESULT = gtk_h.pango_attr_underline_color_new(red, green, blue);
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new underline-style attribute.
     */
    public static Attribute attrUnderlineNew(Underline underline) {
        var RESULT = gtk_h.pango_attr_underline_new(underline.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font variant attribute (normal or small caps).
     */
    public static Attribute attrVariantNew(Variant variant) {
        var RESULT = gtk_h.pango_attr_variant_new(variant.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Create a new font weight attribute.
     */
    public static Attribute attrWeightNew(Weight weight) {
        var RESULT = gtk_h.pango_attr_weight_new(weight.getValue());
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Marks the range of the attribute as a single word.
     * 
     * Note that this may require adjustments to word and
     * sentence classification around the range.
     */
    public static Attribute attrWordNew() {
        var RESULT = gtk_h.pango_attr_word_new();
        return new Attribute(References.get(RESULT, true));
    }
    
    /**
     * Determines the bidirectional type of a character.
     * 
     * The bidirectional type is specified in the Unicode Character Database.
     * 
     * A simplified version of this function is available as [func@unichar_direction].
     */
    public static BidiType bidiTypeForUnichar(int ch) {
        var RESULT = gtk_h.pango_bidi_type_for_unichar(ch);
        return BidiType.fromValue(RESULT);
    }
    
    /**
     * This is the default break algorithm.
     * 
     * It applies rules from the [Unicode Line Breaking Algorithm](http://www.unicode.org/unicode/reports/tr14/)
     * without language-specific tailoring, therefore the @analyis argument is unused
     * and can be %NULL.
     * 
     * See [func@Pango.tailor_break] for language-specific breaks.
     * 
     * See [func@Pango.attr_break] for attribute-based customization.
     */
    public static void defaultBreak(java.lang.String text, int length, Analysis analysis, LogAttr attrs, int attrsLen) {
        gtk_h.pango_default_break(Interop.allocateNativeString(text).handle(), length, analysis.handle(), attrs.handle(), attrsLen);
    }
    
    /**
     * Converts extents from Pango units to device units.
     * 
     * The conversion is done by dividing by the %PANGO_SCALE factor and
     * performing rounding.
     * 
     * The @inclusive rectangle is converted by flooring the x/y coordinates
     * and extending width/height, such that the final rectangle completely
     * includes the original rectangle.
     * 
     * The @nearest rectangle is converted by rounding the coordinates
     * of the rectangle to the nearest device unit (pixel).
     * 
     * The rule to which argument to use is: if you want the resulting device-space
     * rectangle to completely contain the original rectangle, pass it in as
     * @inclusive. If you want two touching-but-not-overlapping rectangles stay
     * touching-but-not-overlapping after rounding to device units, pass them in
     * as @nearest.
     */
    public static void extentsToPixels(Rectangle inclusive, Rectangle nearest) {
        gtk_h.pango_extents_to_pixels(inclusive.handle(), nearest.handle());
    }
    
    /**
     * Searches a string the first character that has a strong
     * direction, according to the Unicode bidirectional algorithm.
     */
    public static Direction findBaseDir(java.lang.String text, int length) {
        var RESULT = gtk_h.pango_find_base_dir(Interop.allocateNativeString(text).handle(), length);
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Creates a new font description from a string representation.
     * 
     * The string must have the form
     * 
     *     "\\[FAMILY-LIST] \\[STYLE-OPTIONS] \\[SIZE] \\[VARIATIONS]",
     * 
     * where FAMILY-LIST is a comma-separated list of families optionally
     * terminated by a comma, STYLE_OPTIONS is a whitespace-separated list
     * of words where each word describes one of style, variant, weight,
     * stretch, or gravity, and SIZE is a decimal number (size in points)
     * or optionally followed by the unit modifier "px" for absolute size.
     * VARIATIONS is a comma-separated list of font variation
     * specifications of the form "\\@axis=value" (the = sign is optional).
     * 
     * The following words are understood as styles:
     * "Normal", "Roman", "Oblique", "Italic".
     * 
     * The following words are understood as variants:
     * "Small-Caps", "All-Small-Caps", "Petite-Caps", "All-Petite-Caps",
     * "Unicase", "Title-Caps".
     * 
     * The following words are understood as weights:
     * "Thin", "Ultra-Light", "Extra-Light", "Light", "Semi-Light",
     * "Demi-Light", "Book", "Regular", "Medium", "Semi-Bold", "Demi-Bold",
     * "Bold", "Ultra-Bold", "Extra-Bold", "Heavy", "Black", "Ultra-Black",
     * "Extra-Black".
     * 
     * The following words are understood as stretch values:
     * "Ultra-Condensed", "Extra-Condensed", "Condensed", "Semi-Condensed",
     * "Semi-Expanded", "Expanded", "Extra-Expanded", "Ultra-Expanded".
     * 
     * The following words are understood as gravity values:
     * "Not-Rotated", "South", "Upside-Down", "North", "Rotated-Left",
     * "East", "Rotated-Right", "West".
     * 
     * Any one of the options may be absent. If FAMILY-LIST is absent, then
     * the family_name field of the resulting font description will be
     * initialized to %NULL. If STYLE-OPTIONS is missing, then all style
     * options will be set to the default values. If SIZE is missing, the
     * size in the resulting font description will be set to 0.
     * 
     * A typical example:
     * 
     *     "Cantarell Italic Light 15 \\@wght=200"
     */
    public static FontDescription fontDescriptionFromString(java.lang.String str) {
        var RESULT = gtk_h.pango_font_description_from_string(Interop.allocateNativeString(str).handle());
        return new FontDescription(References.get(RESULT, true));
    }
    
    /**
     * Computes a `PangoLogAttr` for each character in @text.
     * 
     * The @attrs array must have one `PangoLogAttr` for
     * each position in @text; if @text contains N characters,
     * it has N+1 positions, including the last position at the
     * end of the text. @text should be an entire paragraph;
     * logical attributes can't be computed without context
     * (for example you need to see spaces on either side of
     * a word to know the word is a word).
     */
    public static void getLogAttrs(java.lang.String text, int length, int level, Language language, LogAttr[] attrs, int attrsLen) {
        gtk_h.pango_get_log_attrs(Interop.allocateNativeString(text).handle(), length, level, language.handle(), Interop.allocateNativeArray(attrs).handle(), attrsLen);
    }
    
    /**
     * Finds the gravity that best matches the rotation component
     * in a `PangoMatrix`.
     */
    public static Gravity gravityGetForMatrix(Matrix matrix) {
        var RESULT = gtk_h.pango_gravity_get_for_matrix(matrix.handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Returns the gravity to use in laying out a `PangoItem`.
     * 
     * The gravity is determined based on the script, base gravity, and hint.
     * 
     * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
     * preferred gravity of @script.  To get the preferred gravity of a script,
     * pass %PANGO_GRAVITY_AUTO and %PANGO_GRAVITY_HINT_STRONG in.
     */
    public static Gravity gravityGetForScript(Script script, Gravity baseGravity, GravityHint hint) {
        var RESULT = gtk_h.pango_gravity_get_for_script(script.getValue(), baseGravity.getValue(), hint.getValue());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Returns the gravity to use in laying out a single character
     * or `PangoItem`.
     * 
     * The gravity is determined based on the script, East Asian width,
     * base gravity, and hint,
     * 
     * This function is similar to [func@Pango.Gravity.get_for_script] except
     * that this function makes a distinction between narrow/half-width and
     * wide/full-width characters also. Wide/full-width characters always
     * stand *upright*, that is, they always take the base gravity,
     * whereas narrow/full-width characters are always rotated in vertical
     * context.
     * 
     * If @base_gravity is %PANGO_GRAVITY_AUTO, it is first replaced with the
     * preferred gravity of @script.
     */
    public static Gravity gravityGetForScriptAndWidth(Script script, boolean wide, Gravity baseGravity, GravityHint hint) {
        var RESULT = gtk_h.pango_gravity_get_for_script_and_width(script.getValue(), wide ? 1 : 0, baseGravity.getValue(), hint.getValue());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Converts a `PangoGravity` value to its natural rotation in radians.
     * 
     * Note that [method@Pango.Matrix.rotate] takes angle in degrees, not radians.
     * So, to call [method@Pango.Matrix,rotate] with the output of this function
     * you should multiply it by (180. / G_PI).
     */
    public static double gravityToRotation(Gravity gravity) {
        var RESULT = gtk_h.pango_gravity_to_rotation(gravity.getValue());
        return RESULT;
    }
    
    /**
     * Checks if a character that should not be normally rendered.
     * 
     * This includes all Unicode characters with "ZERO WIDTH" in their name,
     * as well as *bidi* formatting characters, and a few other ones.
     * 
     * This is totally different from [func@GLib.unichar_iszerowidth] and is at best misnamed.
     */
    public static boolean isZeroWidth(int ch) {
        var RESULT = gtk_h.pango_is_zero_width(ch);
        return (RESULT != 0);
    }
    
    /**
     * Breaks a piece of text into segments with consistent directional
     * level and font.
     * 
     * Each byte of @text will be contained in exactly one of the items in the
     * returned list; the generated list of items will be in logical order (the
     * start offsets of the items are ascending).
     * 
     * @cached_iter should be an iterator over @attrs currently positioned
     * at a range before or containing @start_index; @cached_iter will be
     * advanced to the range covering the position just after
     * @start_index + @length. (i.e. if itemizing in a loop, just keep passing
     * in the same @cached_iter).
     */
    public static org.gtk.glib.List itemize(Context context, java.lang.String text, int startIndex, int length, AttrList attrs, AttrIterator cachedIter) {
        var RESULT = gtk_h.pango_itemize(context.handle(), Interop.allocateNativeString(text).handle(), startIndex, length, attrs.handle(), cachedIter.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Like `pango_itemize()`, but with an explicitly specified base direction.
     * 
     * The base direction is used when computing bidirectional levels.
     * [func@itemize] gets the base direction from the `PangoContext`
     * (see [method@Pango.Context.set_base_dir]).
     */
    public static org.gtk.glib.List itemizeWithBaseDir(Context context, Direction baseDir, java.lang.String text, int startIndex, int length, AttrList attrs, AttrIterator cachedIter) {
        var RESULT = gtk_h.pango_itemize_with_base_dir(context.handle(), baseDir.getValue(), Interop.allocateNativeString(text).handle(), startIndex, length, attrs.handle(), cachedIter.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Convert a language tag to a `PangoLanguage`.
     * 
     * The language tag must be in a RFC-3066 format. `PangoLanguage` pointers
     * can be efficiently copied (copy the pointer) and compared with other
     * language tags (compare the pointer.)
     * 
     * This function first canonicalizes the string by converting it to
     * lowercase, mapping '_' to '-', and stripping all characters other
     * than letters and '-'.
     * 
     * Use [func@Pango.Language.get_default] if you want to get the
     * `PangoLanguage` for the current locale of the process.
     */
    public static Language languageFromString(java.lang.String language) {
        var RESULT = gtk_h.pango_language_from_string(Interop.allocateNativeString(language).handle());
        return new Language(References.get(RESULT, false));
    }
    
    /**
     * Returns the `PangoLanguage` for the current locale of the process.
     * 
     * On Unix systems, this is the return value is derived from
     * `setlocale (LC_CTYPE, NULL)`, and the user can
     * affect this through the environment variables LC_ALL, LC_CTYPE or
     * LANG (checked in that order). The locale string typically is in
     * the form lang_COUNTRY, where lang is an ISO-639 language code, and
     * COUNTRY is an ISO-3166 country code. For instance, sv_FI for
     * Swedish as written in Finland or pt_BR for Portuguese as written in
     * Brazil.
     * 
     * On Windows, the C library does not use any such environment
     * variables, and setting them won't affect the behavior of functions
     * like ctime(). The user sets the locale through the Regional Options
     * in the Control Panel. The C library (in the setlocale() function)
     * does not use country and language codes, but country and language
     * names spelled out in English.
     * However, this function does check the above environment
     * variables, and does return a Unix-style locale string based on
     * either said environment variables or the thread's current locale.
     * 
     * Your application should call `setlocale(LC_ALL, "")` for the user
     * settings to take effect. GTK does this in its initialization
     * functions automatically (by calling gtk_set_locale()).
     * See the setlocale() manpage for more details.
     * 
     * Note that the default language can change over the life of an application.
     * 
     * Also note that this function will not do the right thing if you
     * use per-thread locales with uselocale(). In that case, you should
     * just call pango_language_from_string() yourself.
     */
    public static Language languageGetDefault() {
        var RESULT = gtk_h.pango_language_get_default();
        return new Language(References.get(RESULT, false));
    }
    
    /**
     * Returns the list of languages that the user prefers.
     * 
     * The list is specified by the `PANGO_LANGUAGE` or `LANGUAGE`
     * environment variables, in order of preference. Note that this
     * list does not necessarily include the language returned by
     * [func@Pango.Language.get_default].
     * 
     * When choosing language-specific resources, such as the sample
     * text returned by [method@Pango.Language.get_sample_string],
     * you should first try the default language, followed by the
     * languages returned by this function.
     */
    public static Language languageGetPreferred() {
        var RESULT = gtk_h.pango_language_get_preferred();
        return new Language(References.get(RESULT, false));
    }
    
    public static org.gtk.glib.Quark layoutDeserializeErrorQuark() {
        var RESULT = gtk_h.pango_layout_deserialize_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Incrementally parses marked-up text to create a plain-text string
     * and an attribute list.
     * 
     * See the [Pango Markup](pango_markup.html) docs for details about the
     * supported markup.
     * 
     * If @accel_marker is nonzero, the given character will mark the
     * character following it as an accelerator. For example, @accel_marker
     * might be an ampersand or underscore. All characters marked
     * as an accelerator will receive a %PANGO_UNDERLINE_LOW attribute,
     * and the first character so marked will be returned in @accel_char,
     * when calling [func@markup_parser_finish]. Two @accel_marker characters
     * following each other produce a single literal @accel_marker character.
     * 
     * To feed markup to the parser, use [method@GLib.MarkupParseContext.parse]
     * on the returned [struct@GLib.MarkupParseContext]. When done with feeding markup
     * to the parser, use [func@markup_parser_finish] to get the data out
     * of it, and then use [method@GLib.MarkupParseContext.free] to free it.
     * 
     * This function is designed for applications that read Pango markup
     * from streams. To simply parse a string containing Pango markup,
     * the [func@Pango.parse_markup] API is recommended instead.
     */
    public static org.gtk.glib.MarkupParseContext markupParserNew(int accelMarker) {
        var RESULT = gtk_h.pango_markup_parser_new(accelMarker);
        return new org.gtk.glib.MarkupParseContext(References.get(RESULT, false));
    }
    
    /**
     * Reorder items from logical order to visual order.
     * 
     * The visual order is determined from the associated directional
     * levels of the items. The original list is unmodified.
     * 
     * (Please open a bug if you use this function.
     *  It is not a particularly convenient interface, and the code
     *  is duplicated elsewhere in Pango for that reason.)
     */
    public static org.gtk.glib.List reorderItems(org.gtk.glib.List items) {
        var RESULT = gtk_h.pango_reorder_items(items.handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Finds a language tag that is reasonably representative of @script.
     * 
     * The language will usually be the most widely spoken or used language
     * written in that script: for instance, the sample language for
     * %PANGO_SCRIPT_CYRILLIC is ru (Russian), the sample language for
     * %PANGO_SCRIPT_ARABIC is ar.
     * 
     * For some scripts, no sample language will be returned because
     * there is no language that is sufficiently representative. The
     * best example of this is %PANGO_SCRIPT_HAN, where various different
     * variants of written Chinese, Japanese, and Korean all use
     * significantly different sets of Han characters and forms
     * of shared characters. No sample language can be provided
     * for many historical scripts as well.
     * 
     * As of 1.18, this function checks the environment variables
     * `PANGO_LANGUAGE` and `LANGUAGE` (checked in that order) first.
     * If one of them is set, it is parsed as a list of language tags
     * separated by colons or other separators. This function
     * will return the first language in the parsed list that Pango
     * believes may use @script for writing. This last predicate
     * is tested using [method@Pango.Language.includes_script]. This can
     * be used to control Pango's font selection for non-primary
     * languages. For example, a `PANGO_LANGUAGE` enviroment variable
     * set to "en:fa" makes Pango choose fonts suitable for Persian (fa)
     * instead of Arabic (ar) when a segment of Arabic text is found
     * in an otherwise non-Arabic text. The same trick can be used to
     * choose a default language for %PANGO_SCRIPT_HAN when setting
     * context language is not feasible.
     */
    public static Language scriptGetSampleLanguage(Script script) {
        var RESULT = gtk_h.pango_script_get_sample_language(script.getValue());
        return new Language(References.get(RESULT, true));
    }
    
    /**
     * Convert the characters in @text into glyphs.
     * 
     * Given a segment of text and the corresponding `PangoAnalysis` structure
     * returned from [func@Pango.itemize], convert the characters into glyphs. You
     * may also pass in only a substring of the item from [func@Pango.itemize].
     * 
     * It is recommended that you use [func@Pango.shape_full] instead, since
     * that API allows for shaping interaction happening across text item
     * boundaries.
     * 
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you need to subtract the item offset from their indices before
     * calling [func@Pango.shape].
     */
    public static void shape(java.lang.String text, int length, Analysis analysis, GlyphString glyphs) {
        gtk_h.pango_shape(Interop.allocateNativeString(text).handle(), length, analysis.handle(), glyphs.handle());
    }
    
    /**
     * Convert the characters in @text into glyphs.
     * 
     * Given a segment of text and the corresponding `PangoAnalysis` structure
     * returned from [func@Pango.itemize], convert the characters into glyphs.
     * You may also pass in only a substring of the item from [func@Pango.itemize].
     * 
     * This is similar to [func@Pango.shape], except it also can optionally take
     * the full paragraph text as input, which will then be used to perform
     * certain cross-item shaping interactions. If you have access to the broader
     * text of which @item_text is part of, provide the broader text as
     * @paragraph_text. If @paragraph_text is %NULL, item text is used instead.
     * 
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as @paragraph_text, you need
     * to subtract the item offset from their indices before calling
     * [func@Pango.shape_full].
     */
    public static void shapeFull(java.lang.String itemText, int itemLength, java.lang.String paragraphText, int paragraphLength, Analysis analysis, GlyphString glyphs) {
        gtk_h.pango_shape_full(Interop.allocateNativeString(itemText).handle(), itemLength, Interop.allocateNativeString(paragraphText).handle(), paragraphLength, analysis.handle(), glyphs.handle());
    }
    
    /**
     * Convert the characters in @item into glyphs.
     * 
     * This is similar to [func@Pango.shape_with_flags], except it takes a
     * `PangoItem` instead of separate @item_text and @analysis arguments.
     * It also takes @log_attrs, which may be used in implementing text
     * transforms.
     * 
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as @paragraph_text, you need
     * to subtract the item offset from their indices before calling
     * [func@Pango.shape_with_flags].
     */
    public static void shapeItem(Item item, java.lang.String paragraphText, int paragraphLength, LogAttr logAttrs, GlyphString glyphs, int flags) {
        gtk_h.pango_shape_item(item.handle(), Interop.allocateNativeString(paragraphText).handle(), paragraphLength, logAttrs.handle(), glyphs.handle(), flags);
    }
    
    /**
     * Convert the characters in @text into glyphs.
     * 
     * Given a segment of text and the corresponding `PangoAnalysis` structure
     * returned from [func@Pango.itemize], convert the characters into glyphs.
     * You may also pass in only a substring of the item from [func@Pango.itemize].
     * 
     * This is similar to [func@Pango.shape_full], except it also takes flags
     * that can influence the shaping process.
     * 
     * Note that the extra attributes in the @analyis that is returned from
     * [func@Pango.itemize] have indices that are relative to the entire paragraph,
     * so you do not pass the full paragraph text as @paragraph_text, you need
     * to subtract the item offset from their indices before calling
     * [func@Pango.shape_with_flags].
     */
    public static void shapeWithFlags(java.lang.String itemText, int itemLength, java.lang.String paragraphText, int paragraphLength, Analysis analysis, GlyphString glyphs, int flags) {
        gtk_h.pango_shape_with_flags(Interop.allocateNativeString(itemText).handle(), itemLength, Interop.allocateNativeString(paragraphText).handle(), paragraphLength, analysis.handle(), glyphs.handle(), flags);
    }
    
    /**
     * Deserializes a `PangoTabArray` from a string.
     * 
     * This is the counterpart to [method@Pango.TabArray.to_string].
     * See that functions for details about the format.
     */
    public static TabArray tabArrayFromString(java.lang.String text) {
        var RESULT = gtk_h.pango_tab_array_from_string(Interop.allocateNativeString(text).handle());
        return new TabArray(References.get(RESULT, true));
    }
    
    /**
     * Apply language-specific tailoring to the breaks in @attrs.
     * 
     * The line breaks are assumed to have been produced by [func@Pango.default_break].
     * 
     * If @offset is not -1, it is used to apply attributes from @analysis that are
     * relevant to line breaking.
     * 
     * Note that it is better to pass -1 for @offset and use [func@Pango.attr_break]
     * to apply attributes to the whole paragraph.
     */
    public static void tailorBreak(java.lang.String text, int length, Analysis analysis, int offset, LogAttr[] attrs, int attrsLen) {
        gtk_h.pango_tailor_break(Interop.allocateNativeString(text).handle(), length, analysis.handle(), offset, Interop.allocateNativeArray(attrs).handle(), attrsLen);
    }
    
    /**
     * Determines the inherent direction of a character.
     * 
     * The inherent direction is either `PANGO_DIRECTION_LTR`, `PANGO_DIRECTION_RTL`,
     * or `PANGO_DIRECTION_NEUTRAL`.
     * 
     * This function is useful to categorize characters into left-to-right
     * letters, right-to-left letters, and everything else. If full Unicode
     * bidirectional type of a character is needed, [func@Pango.BidiType.for_unichar]
     * can be used instead.
     */
    public static Direction unicharDirection(int ch) {
        var RESULT = gtk_h.pango_unichar_direction(ch);
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Converts a floating-point number to Pango units.
     * 
     * The conversion is done by multiplying @d by %PANGO_SCALE and
     * rounding the result to nearest integer.
     */
    public static int unitsFromDouble(double d) {
        var RESULT = gtk_h.pango_units_from_double(d);
        return RESULT;
    }
    
    /**
     * Converts a number in Pango units to floating-point.
     * 
     * The conversion is done by dividing @i by %PANGO_SCALE.
     */
    public static double unitsToDouble(int i) {
        var RESULT = gtk_h.pango_units_to_double(i);
        return RESULT;
    }
    
    /**
     * Returns the encoded version of Pango available at run-time.
     * 
     * This is similar to the macro %PANGO_VERSION except that the macro
     * returns the encoded version available at compile-time. A version
     * number can be encoded into an integer using PANGO_VERSION_ENCODE().
     */
    public static int version() {
        var RESULT = gtk_h.pango_version();
        return RESULT;
    }
    
    /**
     * Checks that the Pango library in use is compatible with the
     * given version.
     * 
     * Generally you would pass in the constants %PANGO_VERSION_MAJOR,
     * %PANGO_VERSION_MINOR, %PANGO_VERSION_MICRO as the three arguments
     * to this function; that produces a check that the library in use at
     * run-time is compatible with the version of Pango the application or
     * module was compiled against.
     * 
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version
     * @required_major.required_minor.@required_micro. Second
     * the running library must be binary compatible with the
     * version @required_major.required_minor.@required_micro
     * (same major version.)
     * 
     * For compile-time version checking use PANGO_VERSION_CHECK().
     */
    public static java.lang.String versionCheck(int requiredMajor, int requiredMinor, int requiredMicro) {
        var RESULT = gtk_h.pango_version_check(requiredMajor, requiredMinor, requiredMicro);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the version of Pango available at run-time.
     * 
     * This is similar to the macro %PANGO_VERSION_STRING except that the
     * macro returns the version available at compile-time.
     */
    public static java.lang.String versionString() {
        var RESULT = gtk_h.pango_version_string();
        return RESULT.getUtf8String(0);
    }
    
}