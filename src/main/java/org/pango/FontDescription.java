package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoFontDescription} describes a font in an implementation-independent
 * manner.
 * <p>
 * {@code PangoFontDescription} structures are used both to list what fonts are
 * available on the system and also for specifying the characteristics of
 * a font to load.
 */
public class FontDescription extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public FontDescription(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.pango_font_description_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new font description structure with all fields unset.
     */
    public FontDescription() {
        super(constructNew());
    }
    
    /**
     * Determines if the style attributes of {@code new_match} are a closer match
     * for {@code desc} than those of {@code old_match} are, or if {@code old_match} is {@code null},
     * determines if {@code new_match} is a match at all.
     * <p>
     * Approximate matching is done for weight and style; other style attributes
     * must match exactly. Style attributes are all attributes other than family
     * and size-related attributes. Approximate matching for style considers
     * {@link Style#OBLIQUE} and {@link Style#ITALIC} as matches, but not as good
     * a match as when the styles are equal.
     * <p>
     * Note that {@code old_match} must match {@code desc}.
     * @param oldMatch a {@code PangoFontDescription}, or {@code null}
     * @param newMatch a {@code PangoFontDescription}
     * @return {@code true} if {@code new_match} is a better match
     */
    public boolean betterMatch(@Nullable org.pango.FontDescription oldMatch, @NotNull org.pango.FontDescription newMatch) {
        java.util.Objects.requireNonNullElse(oldMatch, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(newMatch, "Parameter 'newMatch' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_better_match.invokeExact(handle(), oldMatch.handle(), newMatch.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Make a copy of a {@code PangoFontDescription}.
     * @return the newly allocated {@code PangoFontDescription},
     *   which should be freed with {@link FontDescription#free},
     *   or {@code null} if {@code desc} was {@code null}.
     */
    public @Nullable org.pango.FontDescription copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    /**
     * Make a copy of a {@code PangoFontDescription}, but don't duplicate
     * allocated fields.
     * <p>
     * This is like {@link FontDescription#copy}, but only a shallow
     * copy is made of the family name and other allocated fields. The result
     * can only be used until {@code desc} is modified or freed. This is meant
     * to be used when the copy is only needed temporarily.
     * @return the newly allocated {@code PangoFontDescription},
     *   which should be freed with {@link FontDescription#free},
     *   or {@code null} if {@code desc} was {@code null}.
     */
    public @Nullable org.pango.FontDescription copyStatic() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_copy_static.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    /**
     * Compares two font descriptions for equality.
     * <p>
     * Two font descriptions are considered equal if the fonts they describe
     * are provably identical. This means that their masks do not have to match,
     * as long as other fields are all the same. (Two font descriptions may
     * result in identical fonts being loaded, but still compare {@code false}.)
     * @param desc2 another {@code PangoFontDescription}
     * @return {@code true} if the two font descriptions are identical,
     *   {@code false} otherwise.
     */
    public boolean equal(@NotNull org.pango.FontDescription desc2) {
        java.util.Objects.requireNonNull(desc2, "Parameter 'desc2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_equal.invokeExact(handle(), desc2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Frees a font description.
     */
    public void free() {
        try {
            DowncallHandles.pango_font_description_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the family name field of a font description.
     * <p>
     * See {@link FontDescription#setFamily}.
     * @return the family name field for the font
     *   description, or {@code null} if not previously set. This has the same
     *   life-time as the font description itself and should not be freed.
     */
    public @Nullable java.lang.String getFamily() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_get_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the gravity field of a font description.
     * <p>
     * See {@link FontDescription#setGravity}.
     * @return the gravity field for the font description.
     *   Use {@link FontDescription#getSetFields} to find out
     *   if the field was explicitly set or not.
     */
    public @NotNull org.pango.Gravity getGravity() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_gravity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Gravity(RESULT);
    }
    
    /**
     * Determines which fields in a font description have been set.
     * @return a bitmask with bits set corresponding to the
     *   fields in {@code desc} that have been set.
     */
    public @NotNull org.pango.FontMask getSetFields() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_set_fields.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMask(RESULT);
    }
    
    /**
     * Gets the size field of a font description.
     * <p>
     * See {@link FontDescription#setSize}.
     * @return the size field for the font description in points
     *   or device units. You must call
     *   {@link FontDescription#getSizeIsAbsolute} to find out
     *   which is the case. Returns 0 if the size field has not previously
     *   been set or it has been set to 0 explicitly.
     *   Use {@link FontDescription#getSetFields} to find out
     *   if the field was explicitly set or not.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determines whether the size of the font is in points (not absolute)
     * or device units (absolute).
     * <p>
     * See {@link FontDescription#setSize}
     * and {@link FontDescription#setAbsoluteSize}.
     * @return whether the size for the font description is in
     *   points or device units. Use {@link FontDescription#getSetFields}
     *   to find out if the size field of the font description was explicitly
     *   set or not.
     */
    public boolean getSizeIsAbsolute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_size_is_absolute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the stretch field of a font description.
     * <p>
     * See {@link FontDescription#setStretch}.
     * @return the stretch field for the font description.
     *   Use {@link FontDescription#getSetFields} to find
     *   out if the field was explicitly set or not.
     */
    public @NotNull org.pango.Stretch getStretch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_stretch.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Stretch(RESULT);
    }
    
    /**
     * Gets the style field of a {@code PangoFontDescription}.
     * <p>
     * See {@link FontDescription#setStyle}.
     * @return the style field for the font description.
     *   Use {@link FontDescription#getSetFields} to
     *   find out if the field was explicitly set or not.
     */
    public @NotNull org.pango.Style getStyle() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_style.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Style(RESULT);
    }
    
    /**
     * Gets the variant field of a {@code PangoFontDescription}.
     * <p>
     * See {@link FontDescription#setVariant}.
     * @return the variant field for the font description.
     *   Use {@link FontDescription#getSetFields} to find
     *   out if the field was explicitly set or not.
     */
    public @NotNull org.pango.Variant getVariant() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_variant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Variant(RESULT);
    }
    
    /**
     * Gets the variations field of a font description.
     * <p>
     * See {@link FontDescription#setVariations}.
     * @return the variations field for the font
     *   description, or {@code null} if not previously set. This has the same
     *   life-time as the font description itself and should not be freed.
     */
    public @Nullable java.lang.String getVariations() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_get_variations.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the weight field of a font description.
     * <p>
     * See {@link FontDescription#setWeight}.
     * @return the weight field for the font description.
     *   Use {@link FontDescription#getSetFields} to find
     *   out if the field was explicitly set or not.
     */
    public @NotNull org.pango.Weight getWeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_get_weight.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Weight(RESULT);
    }
    
    /**
     * Computes a hash of a {@code PangoFontDescription} structure.
     * <p>
     * This is suitable to be used, for example, as an argument
     * to g_hash_table_new(). The hash value is independent of {@code desc}-&gt;mask.
     * @return the hash value.
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_font_description_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Merges the fields that are set in {@code desc_to_merge} into the fields in
     * {@code desc}.
     * <p>
     * If {@code replace_existing} is {@code false}, only fields in {@code desc} that
     * are not already set are affected. If {@code true}, then fields that are
     * already set will be replaced as well.
     * <p>
     * If {@code desc_to_merge} is {@code null}, this function performs nothing.
     * @param descToMerge the {@code PangoFontDescription} to merge from,
     *   or {@code null}
     * @param replaceExisting if {@code true}, replace fields in {@code desc} with the
     *   corresponding values from {@code desc_to_merge}, even if they
     *   are already exist.
     */
    public void merge(@Nullable org.pango.FontDescription descToMerge, boolean replaceExisting) {
        java.util.Objects.requireNonNullElse(descToMerge, MemoryAddress.NULL);
        try {
            DowncallHandles.pango_font_description_merge.invokeExact(handle(), descToMerge.handle(), replaceExisting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Merges the fields that are set in {@code desc_to_merge} into the fields in
     * {@code desc}, without copying allocated fields.
     * <p>
     * This is like {@link FontDescription#merge}, but only a shallow copy
     * is made of the family name and other allocated fields. {@code desc} can only
     * be used until {@code desc_to_merge} is modified or freed. This is meant to
     * be used when the merged font description is only needed temporarily.
     * @param descToMerge the {@code PangoFontDescription} to merge from
     * @param replaceExisting if {@code true}, replace fields in {@code desc} with the
     *   corresponding values from {@code desc_to_merge}, even if they
     *   are already exist.
     */
    public void mergeStatic(@NotNull org.pango.FontDescription descToMerge, boolean replaceExisting) {
        java.util.Objects.requireNonNull(descToMerge, "Parameter 'descToMerge' must not be null");
        try {
            DowncallHandles.pango_font_description_merge_static.invokeExact(handle(), descToMerge.handle(), replaceExisting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the size field of a font description, in device units.
     * <p>
     * This is mutually exclusive with {@link FontDescription#setSize}
     * which sets the font size in points.
     * @param size the new size, in Pango units. There are {@code PANGO_SCALE} Pango units
     *   in one device unit. For an output backend where a device unit is a pixel,
     *   a {@code size} value of 10 * PANGO_SCALE gives a 10 pixel font.
     */
    public void setAbsoluteSize(double size) {
        try {
            DowncallHandles.pango_font_description_set_absolute_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the family name field of a font description.
     * <p>
     * The family
     * name represents a family of related font styles, and will
     * resolve to a particular {@code PangoFontFamily}. In some uses of
     * {@code PangoFontDescription}, it is also possible to use a comma
     * separated list of family names for this field.
     * @param family a string representing the family name.
     */
    public void setFamily(@NotNull java.lang.String family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        try {
            DowncallHandles.pango_font_description_set_family.invokeExact(handle(), Interop.allocateNativeString(family));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the family name field of a font description, without copying the string.
     * <p>
     * This is like {@link FontDescription#setFamily}, except that no
     * copy of {@code family} is made. The caller must make sure that the
     * string passed in stays around until {@code desc} has been freed or the
     * name is set again. This function can be used if {@code family} is a static
     * string such as a C string literal, or if {@code desc} is only needed temporarily.
     * @param family a string representing the family name
     */
    public void setFamilyStatic(@NotNull java.lang.String family) {
        java.util.Objects.requireNonNull(family, "Parameter 'family' must not be null");
        try {
            DowncallHandles.pango_font_description_set_family_static.invokeExact(handle(), Interop.allocateNativeString(family));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the gravity field of a font description.
     * <p>
     * The gravity field
     * specifies how the glyphs should be rotated. If {@code gravity} is
     * {@link Gravity#AUTO}, this actually unsets the gravity mask on
     * the font description.
     * <p>
     * This function is seldom useful to the user. Gravity should normally
     * be set on a {@code PangoContext}.
     * @param gravity the gravity for the font description.
     */
    public void setGravity(@NotNull org.pango.Gravity gravity) {
        java.util.Objects.requireNonNull(gravity, "Parameter 'gravity' must not be null");
        try {
            DowncallHandles.pango_font_description_set_gravity.invokeExact(handle(), gravity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the size field of a font description in fractional points.
     * <p>
     * This is mutually exclusive with
     * {@link FontDescription#setAbsoluteSize}.
     * @param size the size of the font in points, scaled by {@code PANGO_SCALE}.
     *   (That is, a {@code size} value of 10 * PANGO_SCALE is a 10 point font.
     *   The conversion factor between points and device units depends on
     *   system configuration and the output device. For screen display, a
     *   logical DPI of 96 is common, in which case a 10 point font corresponds
     *   to a 10 * (96 / 72) = 13.3 pixel font.
     *   Use {@link FontDescription#setAbsoluteSize} if you need
     *   a particular size in device units.
     */
    public void setSize(int size) {
        try {
            DowncallHandles.pango_font_description_set_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the stretch field of a font description.
     * <p>
     * The {@code Pango.Stretch} field specifies how narrow or
     * wide the font should be.
     * @param stretch the stretch for the font description
     */
    public void setStretch(@NotNull org.pango.Stretch stretch) {
        java.util.Objects.requireNonNull(stretch, "Parameter 'stretch' must not be null");
        try {
            DowncallHandles.pango_font_description_set_stretch.invokeExact(handle(), stretch.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the style field of a {@code PangoFontDescription}.
     * <p>
     * The {@code Pango.Style} enumeration describes whether the font is
     * slanted and the manner in which it is slanted; it can be either
     * {@link Style#NORMAL}, {@link Style#ITALIC}, or {@link Style#OBLIQUE}.
     * <p>
     * Most fonts will either have a italic style or an oblique style,
     * but not both, and font matching in Pango will match italic
     * specifications with oblique fonts and vice-versa if an exact
     * match is not found.
     * @param style the style for the font description
     */
    public void setStyle(@NotNull org.pango.Style style) {
        java.util.Objects.requireNonNull(style, "Parameter 'style' must not be null");
        try {
            DowncallHandles.pango_font_description_set_style.invokeExact(handle(), style.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the variant field of a font description.
     * <p>
     * The {@code Pango.Variant} can either be {@link Variant#NORMAL}
     * or {@link Variant#SMALL_CAPS}.
     * @param variant the variant type for the font description.
     */
    public void setVariant(@NotNull org.pango.Variant variant) {
        java.util.Objects.requireNonNull(variant, "Parameter 'variant' must not be null");
        try {
            DowncallHandles.pango_font_description_set_variant.invokeExact(handle(), variant.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the variations field of a font description.
     * <p>
     * OpenType font variations allow to select a font instance by
     * specifying values for a number of axes, such as width or weight.
     * <p>
     * The format of the variations string is
     * <p>
     *     AXIS1=VALUE,AXIS2=VALUE...
     * <p>
     * with each AXIS a 4 character tag that identifies a font axis,
     * and each VALUE a floating point number. Unknown axes are ignored,
     * and values are clamped to their allowed range.
     * <p>
     * Pango does not currently have a way to find supported axes of
     * a font. Both harfbuzz and freetype have API for this. See
     * for example <a href="https://harfbuzz.github.io/harfbuzz-hb-ot-var.html#hb-ot-var-get-axis-infos">hb_ot_var_get_axis_infos</a>.
     * @param variations a string representing the variations
     */
    public void setVariations(@Nullable java.lang.String variations) {
        java.util.Objects.requireNonNullElse(variations, MemoryAddress.NULL);
        try {
            DowncallHandles.pango_font_description_set_variations.invokeExact(handle(), Interop.allocateNativeString(variations));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the variations field of a font description.
     * <p>
     * This is like {@link FontDescription#setVariations}, except
     * that no copy of {@code variations} is made. The caller must make sure that
     * the string passed in stays around until {@code desc} has been freed
     * or the name is set again. This function can be used if
     * {@code variations} is a static string such as a C string literal,
     * or if {@code desc} is only needed temporarily.
     * @param variations a string representing the variations
     */
    public void setVariationsStatic(@NotNull java.lang.String variations) {
        java.util.Objects.requireNonNull(variations, "Parameter 'variations' must not be null");
        try {
            DowncallHandles.pango_font_description_set_variations_static.invokeExact(handle(), Interop.allocateNativeString(variations));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the weight field of a font description.
     * <p>
     * The weight field
     * specifies how bold or light the font should be. In addition
     * to the values of the {@code Pango.Weight} enumeration, other
     * intermediate numeric values are possible.
     * @param weight the weight for the font description.
     */
    public void setWeight(@NotNull org.pango.Weight weight) {
        java.util.Objects.requireNonNull(weight, "Parameter 'weight' must not be null");
        try {
            DowncallHandles.pango_font_description_set_weight.invokeExact(handle(), weight.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a filename representation of a font description.
     * <p>
     * The filename is identical to the result from calling
     * {@link FontDescription#toString}, but with underscores
     * instead of characters that are untypical in filenames, and in
     * lower case only.
     * @return a new string that must be freed with g_free().
     */
    public @NotNull java.lang.String toFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_to_filename.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Creates a string representation of a font description.
     * <p>
     * See {@link FontDescription#fromString} for a description
     * of the format of the string representation. The family list in
     * the string description will only have a terminating comma if
     * the last word of the list is a valid style option.
     * @return a new string that must be freed with g_free().
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unsets some of the fields in a {@code PangoFontDescription}.
     * <p>
     * The unset fields will get back to their default values.
     * @param toUnset bitmask of fields in the {@code desc} to unset.
     */
    public void unsetFields(@NotNull org.pango.FontMask toUnset) {
        java.util.Objects.requireNonNull(toUnset, "Parameter 'toUnset' must not be null");
        try {
            DowncallHandles.pango_font_description_unset_fields.invokeExact(handle(), toUnset.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static @NotNull org.pango.FontDescription fromString(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_font_description_from_string.invokeExact(Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontDescription(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_font_description_new = Interop.downcallHandle(
            "pango_font_description_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_better_match = Interop.downcallHandle(
            "pango_font_description_better_match",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_copy = Interop.downcallHandle(
            "pango_font_description_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_copy_static = Interop.downcallHandle(
            "pango_font_description_copy_static",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_equal = Interop.downcallHandle(
            "pango_font_description_equal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_free = Interop.downcallHandle(
            "pango_font_description_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_family = Interop.downcallHandle(
            "pango_font_description_get_family",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_gravity = Interop.downcallHandle(
            "pango_font_description_get_gravity",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_set_fields = Interop.downcallHandle(
            "pango_font_description_get_set_fields",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_size = Interop.downcallHandle(
            "pango_font_description_get_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_size_is_absolute = Interop.downcallHandle(
            "pango_font_description_get_size_is_absolute",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_stretch = Interop.downcallHandle(
            "pango_font_description_get_stretch",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_style = Interop.downcallHandle(
            "pango_font_description_get_style",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_variant = Interop.downcallHandle(
            "pango_font_description_get_variant",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_variations = Interop.downcallHandle(
            "pango_font_description_get_variations",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_get_weight = Interop.downcallHandle(
            "pango_font_description_get_weight",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_hash = Interop.downcallHandle(
            "pango_font_description_hash",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_merge = Interop.downcallHandle(
            "pango_font_description_merge",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_merge_static = Interop.downcallHandle(
            "pango_font_description_merge_static",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_set_absolute_size = Interop.downcallHandle(
            "pango_font_description_set_absolute_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
        );
        
        private static final MethodHandle pango_font_description_set_family = Interop.downcallHandle(
            "pango_font_description_set_family",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_set_family_static = Interop.downcallHandle(
            "pango_font_description_set_family_static",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_set_gravity = Interop.downcallHandle(
            "pango_font_description_set_gravity",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_set_size = Interop.downcallHandle(
            "pango_font_description_set_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_set_stretch = Interop.downcallHandle(
            "pango_font_description_set_stretch",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_set_style = Interop.downcallHandle(
            "pango_font_description_set_style",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_set_variant = Interop.downcallHandle(
            "pango_font_description_set_variant",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_set_variations = Interop.downcallHandle(
            "pango_font_description_set_variations",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_set_variations_static = Interop.downcallHandle(
            "pango_font_description_set_variations_static",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_set_weight = Interop.downcallHandle(
            "pango_font_description_set_weight",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_to_filename = Interop.downcallHandle(
            "pango_font_description_to_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_to_string = Interop.downcallHandle(
            "pango_font_description_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_font_description_unset_fields = Interop.downcallHandle(
            "pango_font_description_unset_fields",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_font_description_from_string = Interop.downcallHandle(
            "pango_font_description_from_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
