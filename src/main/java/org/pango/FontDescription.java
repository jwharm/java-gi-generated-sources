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

    public FontDescription(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_font_description_new = Interop.downcallHandle(
        "pango_font_description_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_font_description_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new font description structure with all fields unset.
     */
    public FontDescription() {
        super(constructNew());
    }
    
    private static final MethodHandle pango_font_description_better_match = Interop.downcallHandle(
        "pango_font_description_better_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean betterMatch(@Nullable FontDescription oldMatch, @NotNull FontDescription newMatch) {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_better_match.invokeExact(handle(), oldMatch.handle(), newMatch.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_font_description_copy = Interop.downcallHandle(
        "pango_font_description_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make a copy of a {@code PangoFontDescription}.
     */
    public @Nullable FontDescription copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_description_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontDescription(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_font_description_copy_static = Interop.downcallHandle(
        "pango_font_description_copy_static",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make a copy of a {@code PangoFontDescription}, but don't duplicate
     * allocated fields.
     * <p>
     * This is like {@link FontDescription#copy}, but only a shallow
     * copy is made of the family name and other allocated fields. The result
     * can only be used until {@code desc} is modified or freed. This is meant
     * to be used when the copy is only needed temporarily.
     */
    public @Nullable FontDescription copyStatic() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_description_copy_static.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontDescription(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_font_description_equal = Interop.downcallHandle(
        "pango_font_description_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares two font descriptions for equality.
     * <p>
     * Two font descriptions are considered equal if the fonts they describe
     * are provably identical. This means that their masks do not have to match,
     * as long as other fields are all the same. (Two font descriptions may
     * result in identical fonts being loaded, but still compare {@code false}.)
     */
    public boolean equal(@NotNull FontDescription desc2) {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_equal.invokeExact(handle(), desc2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_font_description_free = Interop.downcallHandle(
        "pango_font_description_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a font description.
     */
    public @NotNull void free() {
        try {
            pango_font_description_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_get_family = Interop.downcallHandle(
        "pango_font_description_get_family",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the family name field of a font description.
     * <p>
     * See {@link FontDescription#setFamily}.
     */
    public @Nullable java.lang.String getFamily() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_description_get_family.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle pango_font_description_get_gravity = Interop.downcallHandle(
        "pango_font_description_get_gravity",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the gravity field of a font description.
     * <p>
     * See {@link FontDescription#setGravity}.
     */
    public @NotNull Gravity getGravity() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_gravity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Gravity(RESULT);
    }
    
    private static final MethodHandle pango_font_description_get_set_fields = Interop.downcallHandle(
        "pango_font_description_get_set_fields",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines which fields in a font description have been set.
     */
    public @NotNull FontMask getSetFields() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_set_fields.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontMask(RESULT);
    }
    
    private static final MethodHandle pango_font_description_get_size = Interop.downcallHandle(
        "pango_font_description_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size field of a font description.
     * <p>
     * See {@link FontDescription#setSize}.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_font_description_get_size_is_absolute = Interop.downcallHandle(
        "pango_font_description_get_size_is_absolute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether the size of the font is in points (not absolute)
     * or device units (absolute).
     * <p>
     * See {@link FontDescription#setSize}
     * and {@link FontDescription#setAbsoluteSize}.
     */
    public boolean getSizeIsAbsolute() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_size_is_absolute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_font_description_get_stretch = Interop.downcallHandle(
        "pango_font_description_get_stretch",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the stretch field of a font description.
     * <p>
     * See {@link FontDescription#setStretch}.
     */
    public @NotNull Stretch getStretch() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_stretch.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Stretch(RESULT);
    }
    
    private static final MethodHandle pango_font_description_get_style = Interop.downcallHandle(
        "pango_font_description_get_style",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the style field of a {@code PangoFontDescription}.
     * <p>
     * See {@link FontDescription#setStyle}.
     */
    public @NotNull Style getStyle() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_style.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Style(RESULT);
    }
    
    private static final MethodHandle pango_font_description_get_variant = Interop.downcallHandle(
        "pango_font_description_get_variant",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the variant field of a {@code PangoFontDescription}.
     * <p>
     * See {@link FontDescription#setVariant}.
     */
    public @NotNull Variant getVariant() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_variant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Variant(RESULT);
    }
    
    private static final MethodHandle pango_font_description_get_variations = Interop.downcallHandle(
        "pango_font_description_get_variations",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the variations field of a font description.
     * <p>
     * See {@link FontDescription#setVariations}.
     */
    public @Nullable java.lang.String getVariations() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_description_get_variations.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle pango_font_description_get_weight = Interop.downcallHandle(
        "pango_font_description_get_weight",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the weight field of a font description.
     * <p>
     * See {@link FontDescription#setWeight}.
     */
    public @NotNull Weight getWeight() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_get_weight.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Weight(RESULT);
    }
    
    private static final MethodHandle pango_font_description_hash = Interop.downcallHandle(
        "pango_font_description_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes a hash of a {@code PangoFontDescription} structure.
     * <p>
     * This is suitable to be used, for example, as an argument
     * to g_hash_table_new(). The hash value is independent of {@code desc}->mask.
     */
    public int hash() {
        int RESULT;
        try {
            RESULT = (int) pango_font_description_hash.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_font_description_merge = Interop.downcallHandle(
        "pango_font_description_merge",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Merges the fields that are set in {@code desc_to_merge} into the fields in
     * {@code desc}.
     * <p>
     * If {@code replace_existing} is {@code false}, only fields in {@code desc} that
     * are not already set are affected. If {@code true}, then fields that are
     * already set will be replaced as well.
     * <p>
     * If {@code desc_to_merge} is {@code null}, this function performs nothing.
     */
    public @NotNull void merge(@Nullable FontDescription descToMerge, @NotNull boolean replaceExisting) {
        try {
            pango_font_description_merge.invokeExact(handle(), descToMerge.handle(), replaceExisting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_merge_static = Interop.downcallHandle(
        "pango_font_description_merge_static",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Merges the fields that are set in {@code desc_to_merge} into the fields in
     * {@code desc}, without copying allocated fields.
     * <p>
     * This is like {@link FontDescription#merge}, but only a shallow copy
     * is made of the family name and other allocated fields. {@code desc} can only
     * be used until {@code desc_to_merge} is modified or freed. This is meant to
     * be used when the merged font description is only needed temporarily.
     */
    public @NotNull void mergeStatic(@NotNull FontDescription descToMerge, @NotNull boolean replaceExisting) {
        try {
            pango_font_description_merge_static.invokeExact(handle(), descToMerge.handle(), replaceExisting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_absolute_size = Interop.downcallHandle(
        "pango_font_description_set_absolute_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the size field of a font description, in device units.
     * <p>
     * This is mutually exclusive with {@link FontDescription#setSize}
     * which sets the font size in points.
     */
    public @NotNull void setAbsoluteSize(@NotNull double size) {
        try {
            pango_font_description_set_absolute_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_family = Interop.downcallHandle(
        "pango_font_description_set_family",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the family name field of a font description.
     * <p>
     * The family
     * name represents a family of related font styles, and will
     * resolve to a particular {@code PangoFontFamily}. In some uses of
     * {@code PangoFontDescription}, it is also possible to use a comma
     * separated list of family names for this field.
     */
    public @NotNull void setFamily(@NotNull java.lang.String family) {
        try {
            pango_font_description_set_family.invokeExact(handle(), Interop.allocateNativeString(family));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_family_static = Interop.downcallHandle(
        "pango_font_description_set_family_static",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the family name field of a font description, without copying the string.
     * <p>
     * This is like {@link FontDescription#setFamily}, except that no
     * copy of {@code family} is made. The caller must make sure that the
     * string passed in stays around until {@code desc} has been freed or the
     * name is set again. This function can be used if {@code family} is a static
     * string such as a C string literal, or if {@code desc} is only needed temporarily.
     */
    public @NotNull void setFamilyStatic(@NotNull java.lang.String family) {
        try {
            pango_font_description_set_family_static.invokeExact(handle(), Interop.allocateNativeString(family));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_gravity = Interop.downcallHandle(
        "pango_font_description_set_gravity",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void setGravity(@NotNull Gravity gravity) {
        try {
            pango_font_description_set_gravity.invokeExact(handle(), gravity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_size = Interop.downcallHandle(
        "pango_font_description_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size field of a font description in fractional points.
     * <p>
     * This is mutually exclusive with
     * {@link FontDescription#setAbsoluteSize}.
     */
    public @NotNull void setSize(@NotNull int size) {
        try {
            pango_font_description_set_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_stretch = Interop.downcallHandle(
        "pango_font_description_set_stretch",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the stretch field of a font description.
     * <p>
     * The {@code Pango.Stretch} field specifies how narrow or
     * wide the font should be.
     */
    public @NotNull void setStretch(@NotNull Stretch stretch) {
        try {
            pango_font_description_set_stretch.invokeExact(handle(), stretch.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_style = Interop.downcallHandle(
        "pango_font_description_set_style",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void setStyle(@NotNull Style style) {
        try {
            pango_font_description_set_style.invokeExact(handle(), style.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_variant = Interop.downcallHandle(
        "pango_font_description_set_variant",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the variant field of a font description.
     * <p>
     * The {@code Pango.Variant} can either be {@link Variant#NORMAL}
     * or {@link Variant#SMALL_CAPS}.
     */
    public @NotNull void setVariant(@NotNull Variant variant) {
        try {
            pango_font_description_set_variant.invokeExact(handle(), variant.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_variations = Interop.downcallHandle(
        "pango_font_description_set_variations",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setVariations(@Nullable java.lang.String variations) {
        try {
            pango_font_description_set_variations.invokeExact(handle(), Interop.allocateNativeString(variations));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_variations_static = Interop.downcallHandle(
        "pango_font_description_set_variations_static",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the variations field of a font description.
     * <p>
     * This is like {@link FontDescription#setVariations}, except
     * that no copy of {@code variations} is made. The caller must make sure that
     * the string passed in stays around until {@code desc} has been freed
     * or the name is set again. This function can be used if
     * {@code variations} is a static string such as a C string literal,
     * or if {@code desc} is only needed temporarily.
     */
    public @NotNull void setVariationsStatic(@NotNull java.lang.String variations) {
        try {
            pango_font_description_set_variations_static.invokeExact(handle(), Interop.allocateNativeString(variations));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_set_weight = Interop.downcallHandle(
        "pango_font_description_set_weight",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the weight field of a font description.
     * <p>
     * The weight field
     * specifies how bold or light the font should be. In addition
     * to the values of the {@code Pango.Weight} enumeration, other
     * intermediate numeric values are possible.
     */
    public @NotNull void setWeight(@NotNull Weight weight) {
        try {
            pango_font_description_set_weight.invokeExact(handle(), weight.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_to_filename = Interop.downcallHandle(
        "pango_font_description_to_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a filename representation of a font description.
     * <p>
     * The filename is identical to the result from calling
     * {@link FontDescription#toString}, but with underscores
     * instead of characters that are untypical in filenames, and in
     * lower case only.
     */
    public @NotNull java.lang.String toFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_description_to_filename.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle pango_font_description_to_string = Interop.downcallHandle(
        "pango_font_description_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a string representation of a font description.
     * <p>
     * See {@link Pango#FontDescription} for a description
     * of the format of the string representation. The family list in
     * the string description will only have a terminating comma if
     * the last word of the list is a valid style option.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_description_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle pango_font_description_unset_fields = Interop.downcallHandle(
        "pango_font_description_unset_fields",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Unsets some of the fields in a {@code PangoFontDescription}.
     * <p>
     * The unset fields will get back to their default values.
     */
    public @NotNull void unsetFields(@NotNull FontMask toUnset) {
        try {
            pango_font_description_unset_fields.invokeExact(handle(), toUnset.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_font_description_from_string = Interop.downcallHandle(
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
    public static @NotNull FontDescription fromString(@NotNull java.lang.String str) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_font_description_from_string.invokeExact(Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontDescription(Refcounted.get(RESULT, true));
    }
    
}
