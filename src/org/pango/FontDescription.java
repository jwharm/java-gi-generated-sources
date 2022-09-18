package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoFontDescription</code> describes a font in an implementation-independent
 * manner.
 * <p><code>PangoFontDescription</code> structures are used both to list what fonts are
 * available on the system and also for specifying the characteristics of
 * a font to load.
 */
public class FontDescription extends io.github.jwharm.javagi.ResourceBase {

    public FontDescription(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.pango_font_description_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new font description structure with all fields unset.
     */
    public FontDescription() {
        super(constructNew());
    }
    
    /**
     * Determines if the style attributes of @new_match are a closer match
     * for @desc than those of @old_match are, or if @old_match is <code>null</code> 
     * determines if @new_match is a match at all.
     * 
     * Approximate matching is done for weight and style; other style attributes
     * must match exactly. Style attributes are all attributes other than family
     * and size-related attributes. Approximate matching for style considers
     * {@link org.pango.Style<code>#OBLIQUE</code>  and {@link org.pango.Style<code>#ITALIC</code>  as matches, but not as good
     * a match as when the styles are equal.
     * 
     * Note that @old_match must match @desc.
     */
    public boolean betterMatch(FontDescription oldMatch, FontDescription newMatch) {
        var RESULT = gtk_h.pango_font_description_better_match(handle(), oldMatch.handle(), newMatch.handle());
        return (RESULT != 0);
    }
    
    /**
     * Make a copy of a <code>PangoFontDescription</code>.
     */
    public FontDescription copy() {
        var RESULT = gtk_h.pango_font_description_copy(handle());
        return new FontDescription(References.get(RESULT, true));
    }
    
    /**
     * Make a copy of a <code>PangoFontDescription</code>, but don&<code>#39</code> t duplicate
     * allocated fields.
     * 
     * This is like {@link org.pango.FontDescription<code>#copy</code> , but only a shallow
     * copy is made of the family name and other allocated fields. The result
     * can only be used until @desc is modified or freed. This is meant
     * to be used when the copy is only needed temporarily.
     */
    public FontDescription copyStatic() {
        var RESULT = gtk_h.pango_font_description_copy_static(handle());
        return new FontDescription(References.get(RESULT, true));
    }
    
    /**
     * Compares two font descriptions for equality.
     * 
     * Two font descriptions are considered equal if the fonts they describe
     * are provably identical. This means that their masks do not have to match,
     * as long as other fields are all the same. (Two font descriptions may
     * result in identical fonts being loaded, but still compare <code>false</code> )
     */
    public boolean equal(FontDescription desc2) {
        var RESULT = gtk_h.pango_font_description_equal(handle(), desc2.handle());
        return (RESULT != 0);
    }
    
    /**
     * Frees a font description.
     */
    public void free() {
        gtk_h.pango_font_description_free(handle());
    }
    
    /**
     * Gets the family name field of a font description.
     * 
     * See {@link org.pango.FontDescription<code>#setFamily</code> .
     */
    public java.lang.String getFamily() {
        var RESULT = gtk_h.pango_font_description_get_family(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the gravity field of a font description.
     * 
     * See {@link org.pango.FontDescription<code>#setGravity</code> .
     */
    public Gravity getGravity() {
        var RESULT = gtk_h.pango_font_description_get_gravity(handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Determines which fields in a font description have been set.
     */
    public int getSetFields() {
        var RESULT = gtk_h.pango_font_description_get_set_fields(handle());
        return RESULT;
    }
    
    /**
     * Gets the size field of a font description.
     * 
     * See {@link org.pango.FontDescription<code>#setSize</code> .
     */
    public int getSize() {
        var RESULT = gtk_h.pango_font_description_get_size(handle());
        return RESULT;
    }
    
    /**
     * Determines whether the size of the font is in points (not absolute)
     * or device units (absolute).
     * 
     * See {@link org.pango.FontDescription<code>#setSize</code> 
     * and {@link org.pango.FontDescription<code>#setAbsoluteSize</code> .
     */
    public boolean getSizeIsAbsolute() {
        var RESULT = gtk_h.pango_font_description_get_size_is_absolute(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the stretch field of a font description.
     * 
     * See {@link org.pango.FontDescription<code>#setStretch</code> .
     */
    public Stretch getStretch() {
        var RESULT = gtk_h.pango_font_description_get_stretch(handle());
        return Stretch.fromValue(RESULT);
    }
    
    /**
     * Gets the style field of a <code>PangoFontDescription</code>.
     * 
     * See {@link org.pango.FontDescription<code>#setStyle</code> .
     */
    public Style getStyle() {
        var RESULT = gtk_h.pango_font_description_get_style(handle());
        return Style.fromValue(RESULT);
    }
    
    /**
     * Gets the variant field of a <code>PangoFontDescription</code>.
     * 
     * See {@link org.pango.FontDescription<code>#setVariant</code> .
     */
    public Variant getVariant() {
        var RESULT = gtk_h.pango_font_description_get_variant(handle());
        return Variant.fromValue(RESULT);
    }
    
    /**
     * Gets the variations field of a font description.
     * 
     * See {@link org.pango.FontDescription<code>#setVariations</code> .
     */
    public java.lang.String getVariations() {
        var RESULT = gtk_h.pango_font_description_get_variations(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the weight field of a font description.
     * 
     * See {@link org.pango.FontDescription<code>#setWeight</code> .
     */
    public Weight getWeight() {
        var RESULT = gtk_h.pango_font_description_get_weight(handle());
        return Weight.fromValue(RESULT);
    }
    
    /**
     * Computes a hash of a <code>PangoFontDescription</code> structure.
     * 
     * This is suitable to be used, for example, as an argument
     * to g_hash_table_new(). The hash value is independent of @desc-&<code>#62</code> mask.
     */
    public int hash() {
        var RESULT = gtk_h.pango_font_description_hash(handle());
        return RESULT;
    }
    
    /**
     * Merges the fields that are set in @desc_to_merge into the fields in
     * @desc.
     * 
     * If @replace_existing is <code>false</code>  only fields in @desc that
     * are not already set are affected. If <code>true</code>  then fields that are
     * already set will be replaced as well.
     * 
     * If @desc_to_merge is <code>null</code>  this function performs nothing.
     */
    public void merge(FontDescription descToMerge, boolean replaceExisting) {
        gtk_h.pango_font_description_merge(handle(), descToMerge.handle(), replaceExisting ? 1 : 0);
    }
    
    /**
     * Merges the fields that are set in @desc_to_merge into the fields in
     * @desc, without copying allocated fields.
     * 
     * This is like {@link org.pango.FontDescription<code>#merge</code> , but only a shallow copy
     * is made of the family name and other allocated fields. @desc can only
     * be used until @desc_to_merge is modified or freed. This is meant to
     * be used when the merged font description is only needed temporarily.
     */
    public void mergeStatic(FontDescription descToMerge, boolean replaceExisting) {
        gtk_h.pango_font_description_merge_static(handle(), descToMerge.handle(), replaceExisting ? 1 : 0);
    }
    
    /**
     * Sets the size field of a font description, in device units.
     * 
     * This is mutually exclusive with {@link org.pango.FontDescription<code>#setSize</code> 
     * which sets the font size in points.
     */
    public void setAbsoluteSize(double size) {
        gtk_h.pango_font_description_set_absolute_size(handle(), size);
    }
    
    /**
     * Sets the family name field of a font description.
     * <p>
     * The family
     * name represents a family of related font styles, and will
     * resolve to a particular <code>PangoFontFamily</code>. In some uses of<code>PangoFontDescription</code>, it is also possible to use a comma
     * separated list of family names for this field.
     */
    public void setFamily(java.lang.String family) {
        gtk_h.pango_font_description_set_family(handle(), Interop.allocateNativeString(family).handle());
    }
    
    /**
     * Sets the family name field of a font description, without copying the string.
     * 
     * This is like {@link org.pango.FontDescription<code>#setFamily</code> , except that no
     * copy of @family is made. The caller must make sure that the
     * string passed in stays around until @desc has been freed or the
     * name is set again. This function can be used if @family is a static
     * string such as a C string literal, or if @desc is only needed temporarily.
     */
    public void setFamilyStatic(java.lang.String family) {
        gtk_h.pango_font_description_set_family_static(handle(), Interop.allocateNativeString(family).handle());
    }
    
    /**
     * Sets the gravity field of a font description.
     * <p>
     * The gravity field
     * specifies how the glyphs should be rotated. If @gravity is
     * {@link org.pango.Gravity<code>#AUTO</code>   this actually unsets the gravity mask on
     * the font description.
     * <p>
     * This function is seldom useful to the user. Gravity should normally
     * be set on a <code>PangoContext</code>.
     */
    public void setGravity(Gravity gravity) {
        gtk_h.pango_font_description_set_gravity(handle(), gravity.getValue());
    }
    
    /**
     * Sets the size field of a font description in fractional points.
     * 
     * This is mutually exclusive with
     * {@link org.pango.FontDescription<code>#setAbsoluteSize</code> .
     */
    public void setSize(int size) {
        gtk_h.pango_font_description_set_size(handle(), size);
    }
    
    /**
     * Sets the stretch field of a font description.
     * 
     * The {@link [enum@Pango.Stretch] (ref=enum)} field specifies how narrow or
     * wide the font should be.
     */
    public void setStretch(Stretch stretch) {
        gtk_h.pango_font_description_set_stretch(handle(), stretch.getValue());
    }
    
    /**
     * Sets the style field of a <code>PangoFontDescription</code>.
     * 
     * The {@link [enum@Pango.Style] (ref=enum)} enumeration describes whether the font is
     * slanted and the manner in which it is slanted; it can be either
     * {@link org.pango.Style<code>#NORMAL</code>   {@link org.pango.Style<code>#ITALIC</code>   or {@link org.pango.Style<code>#OBLIQUE</code>  
     * 
     * Most fonts will either have a italic style or an oblique style,
     * but not both, and font matching in Pango will match italic
     * specifications with oblique fonts and vice-versa if an exact
     * match is not found.
     */
    public void setStyle(Style style) {
        gtk_h.pango_font_description_set_style(handle(), style.getValue());
    }
    
    /**
     * Sets the variant field of a font description.
     * 
     * The {@link [enum@Pango.Variant] (ref=enum)} can either be {@link org.pango.Variant<code>#NORMAL</code>  or {@link org.pango.Variant<code>#SMALL_CAPS</code>
     */
    public void setVariant(Variant variant) {
        gtk_h.pango_font_description_set_variant(handle(), variant.getValue());
    }
    
    /**
     * Sets the variations field of a font description.
     * 
     * OpenType font variations allow to select a font instance by
     * specifying values for a number of axes, such as width or weight.
     * 
     * The format of the variations string is
     * 
     *     AXIS1=VALUE,AXIS2=VALUE...
     * 
     * with each AXIS a 4 character tag that identifies a font axis,
     * and each VALUE a floating point number. Unknown axes are ignored,
     * and values are clamped to their allowed range.
     * 
     * Pango does not currently have a way to find supported axes of
     * a font. Both harfbuzz and freetype have API for this. See
     * for example {@link [hb_ot_var_get_axis_infos]}(https://harfbuzz.github.io/harfbuzz-hb-ot-var.html<code>#hb</code> ot-var-get-axis-infos).
     */
    public void setVariations(java.lang.String variations) {
        gtk_h.pango_font_description_set_variations(handle(), Interop.allocateNativeString(variations).handle());
    }
    
    /**
     * Sets the variations field of a font description.
     * 
     * This is like {@link org.pango.FontDescription<code>#setVariations</code> , except
     * that no copy of @variations is made. The caller must make sure that
     * the string passed in stays around until @desc has been freed
     * or the name is set again. This function can be used if
     * @variations is a static string such as a C string literal,
     * or if @desc is only needed temporarily.
     */
    public void setVariationsStatic(java.lang.String variations) {
        gtk_h.pango_font_description_set_variations_static(handle(), Interop.allocateNativeString(variations).handle());
    }
    
    /**
     * Sets the weight field of a font description.
     * 
     * The weight field
     * specifies how bold or light the font should be. In addition
     * to the values of the {@link [enum@Pango.Weight] (ref=enum)} enumeration, other
     * intermediate numeric values are possible.
     */
    public void setWeight(Weight weight) {
        gtk_h.pango_font_description_set_weight(handle(), weight.getValue());
    }
    
    /**
     * Creates a filename representation of a font description.
     * 
     * The filename is identical to the result from calling
     * {@link org.pango.FontDescription<code>#toString</code> , but with underscores
     * instead of characters that are untypical in filenames, and in
     * lower case only.
     */
    public java.lang.String toFilename() {
        var RESULT = gtk_h.pango_font_description_to_filename(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a string representation of a font description.
     * 
     * See {@link Pango<code>#FontDescription</code>  for a description
     * of the format of the string representation. The family list in
     * the string description will only have a terminating comma if
     * the last word of the list is a valid style option.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.pango_font_description_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unsets some of the fields in a <code>PangoFontDescription</code>.
     * 
     * The unset fields will get back to their default values.
     */
    public void unsetFields(int toUnset) {
        gtk_h.pango_font_description_unset_fields(handle(), toUnset);
    }
    
    /**
     * Creates a new font description from a string representation.
     * 
     * The string must have the form
     * 
     *     &<code>#34</code> \\{@link [FAMILY-LIST]} \\{@link [STYLE-OPTIONS]} \\{@link [SIZE]} \\{@link [VARIATIONS]}&<code>#34</code> ,
     * 
     * where FAMILY-LIST is a comma-separated list of families optionally
     * terminated by a comma, STYLE_OPTIONS is a whitespace-separated list
     * of words where each word describes one of style, variant, weight,
     * stretch, or gravity, and SIZE is a decimal number (size in points)
     * or optionally followed by the unit modifier &<code>#34</code> px&<code>#34</code>  for absolute size.
     * VARIATIONS is a comma-separated list of font variation
     * specifications of the form &<code>#34</code> \\@axis=value&<code>#34</code>  (the = sign is optional).
     * 
     * The following words are understood as styles:
     * &<code>#34</code> Normal&<code>#34</code> , &<code>#34</code> Roman&<code>#34</code> , &<code>#34</code> Oblique&<code>#34</code> , &<code>#34</code> Italic&<code>#34</code> .
     * 
     * The following words are understood as variants:
     * &<code>#34</code> Small-Caps&<code>#34</code> , &<code>#34</code> All-Small-Caps&<code>#34</code> , &<code>#34</code> Petite-Caps&<code>#34</code> , &<code>#34</code> All-Petite-Caps&<code>#34</code> ,
     * &<code>#34</code> Unicase&<code>#34</code> , &<code>#34</code> Title-Caps&<code>#34</code> .
     * 
     * The following words are understood as weights:
     * &<code>#34</code> Thin&<code>#34</code> , &<code>#34</code> Ultra-Light&<code>#34</code> , &<code>#34</code> Extra-Light&<code>#34</code> , &<code>#34</code> Light&<code>#34</code> , &<code>#34</code> Semi-Light&<code>#34</code> ,
     * &<code>#34</code> Demi-Light&<code>#34</code> , &<code>#34</code> Book&<code>#34</code> , &<code>#34</code> Regular&<code>#34</code> , &<code>#34</code> Medium&<code>#34</code> , &<code>#34</code> Semi-Bold&<code>#34</code> , &<code>#34</code> Demi-Bold&<code>#34</code> ,
     * &<code>#34</code> Bold&<code>#34</code> , &<code>#34</code> Ultra-Bold&<code>#34</code> , &<code>#34</code> Extra-Bold&<code>#34</code> , &<code>#34</code> Heavy&<code>#34</code> , &<code>#34</code> Black&<code>#34</code> , &<code>#34</code> Ultra-Black&<code>#34</code> ,
     * &<code>#34</code> Extra-Black&<code>#34</code> .
     * 
     * The following words are understood as stretch values:
     * &<code>#34</code> Ultra-Condensed&<code>#34</code> , &<code>#34</code> Extra-Condensed&<code>#34</code> , &<code>#34</code> Condensed&<code>#34</code> , &<code>#34</code> Semi-Condensed&<code>#34</code> ,
     * &<code>#34</code> Semi-Expanded&<code>#34</code> , &<code>#34</code> Expanded&<code>#34</code> , &<code>#34</code> Extra-Expanded&<code>#34</code> , &<code>#34</code> Ultra-Expanded&<code>#34</code> .
     * 
     * The following words are understood as gravity values:
     * &<code>#34</code> Not-Rotated&<code>#34</code> , &<code>#34</code> South&<code>#34</code> , &<code>#34</code> Upside-Down&<code>#34</code> , &<code>#34</code> North&<code>#34</code> , &<code>#34</code> Rotated-Left&<code>#34</code> ,
     * &<code>#34</code> East&<code>#34</code> , &<code>#34</code> Rotated-Right&<code>#34</code> , &<code>#34</code> West&<code>#34</code> .
     * 
     * Any one of the options may be absent. If FAMILY-LIST is absent, then
     * the family_name field of the resulting font description will be
     * initialized to <code>null</code>  If STYLE-OPTIONS is missing, then all style
     * options will be set to the default values. If SIZE is missing, the
     * size in the resulting font description will be set to 0.
     * 
     * A typical example:
     * 
     *     &<code>#34</code> Cantarell Italic Light 15 \\@wght=200&<code>#34</code>
     */
    public static FontDescription fromString(java.lang.String str) {
        var RESULT = gtk_h.pango_font_description_from_string(Interop.allocateNativeString(str).handle());
        return new FontDescription(References.get(RESULT, true));
    }
    
}
