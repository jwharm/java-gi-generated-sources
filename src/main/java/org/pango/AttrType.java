package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoAttrType} distinguishes between different types of attributes.
 * <p>
 * Along with the predefined values, it is possible to allocate additional
 * values for custom attributes using {@code AttrType.AttrType#register}. The predefined
 * values are given below. The type of structure used to store the attribute is
 * listed in parentheses after the description.
 */
public enum AttrType implements io.github.jwharm.javagi.Enumeration {
    /**
     * does not happen
     */
    INVALID(0),
    /**
     * language ({@code Pango.AttrLanguage})
     */
    LANGUAGE(1),
    /**
     * font family name list ({@code Pango.AttrString})
     */
    FAMILY(2),
    /**
     * font slant style ({@code Pango.AttrInt})
     */
    STYLE(3),
    /**
     * font weight ({@code Pango.AttrInt})
     */
    WEIGHT(4),
    /**
     * font variant (normal or small caps) ({@code Pango.AttrInt})
     */
    VARIANT(5),
    /**
     * font stretch ({@code Pango.AttrInt})
     */
    STRETCH(6),
    /**
     * font size in points scaled by {@code PANGO_SCALE} ({@code Pango.AttrInt})
     */
    SIZE(7),
    /**
     * font description ({@code Pango.AttrFontDesc})
     */
    FONT_DESC(8),
    /**
     * foreground color ({@code Pango.AttrColor})
     */
    FOREGROUND(9),
    /**
     * background color ({@code Pango.AttrColor})
     */
    BACKGROUND(10),
    /**
     * whether the text has an underline ({@code Pango.AttrInt})
     */
    UNDERLINE(11),
    /**
     * whether the text is struck-through ({@code Pango.AttrInt})
     */
    STRIKETHROUGH(12),
    /**
     * baseline displacement ({@code Pango.AttrInt})
     */
    RISE(13),
    /**
     * shape ({@code Pango.AttrShape})
     */
    SHAPE(14),
    /**
     * font size scale factor ({@code Pango.AttrFloat})
     */
    SCALE(15),
    /**
     * whether fallback is enabled ({@code Pango.AttrInt})
     */
    FALLBACK(16),
    /**
     * letter spacing ({@code PangoAttrInt})
     */
    LETTER_SPACING(17),
    /**
     * underline color ({@code Pango.AttrColor})
     */
    UNDERLINE_COLOR(18),
    /**
     * strikethrough color ({@code Pango.AttrColor})
     */
    STRIKETHROUGH_COLOR(19),
    /**
     * font size in pixels scaled by {@code PANGO_SCALE} ({@code Pango.AttrInt})
     */
    ABSOLUTE_SIZE(20),
    /**
     * base text gravity ({@code Pango.AttrInt})
     */
    GRAVITY(21),
    /**
     * gravity hint ({@code Pango.AttrInt})
     */
    GRAVITY_HINT(22),
    /**
     * OpenType font features ({@code Pango.AttrFontFeatures}). Since 1.38
     */
    FONT_FEATURES(23),
    /**
     * foreground alpha ({@code Pango.AttrInt}). Since 1.38
     */
    FOREGROUND_ALPHA(24),
    /**
     * background alpha ({@code Pango.AttrInt}). Since 1.38
     */
    BACKGROUND_ALPHA(25),
    /**
     * whether breaks are allowed ({@code Pango.AttrInt}). Since 1.44
     */
    ALLOW_BREAKS(26),
    /**
     * how to render invisible characters ({@code Pango.AttrInt}). Since 1.44
     */
    SHOW(27),
    /**
     * whether to insert hyphens at intra-word line breaks ({@code Pango.AttrInt}). Since 1.44
     */
    INSERT_HYPHENS(28),
    /**
     * whether the text has an overline ({@code Pango.AttrInt}). Since 1.46
     */
    OVERLINE(29),
    /**
     * overline color ({@code Pango.AttrColor}). Since 1.46
     */
    OVERLINE_COLOR(30),
    /**
     * line height factor ({@code Pango.AttrFloat}). Since: 1.50
     */
    LINE_HEIGHT(31),
    /**
     * line height ({@code Pango.AttrInt}). Since: 1.50
     */
    ABSOLUTE_LINE_HEIGHT(32),
    TEXT_TRANSFORM(33),
    /**
     * override segmentation to classify the range of the attribute as a single word ({@code Pango.AttrInt}). Since 1.50
     */
    WORD(34),
    /**
     * override segmentation to classify the range of the attribute as a single sentence ({@code Pango.AttrInt}). Since 1.50
     */
    SENTENCE(35),
    /**
     * baseline displacement ({@code Pango.AttrInt}). Since 1.50
     */
    BASELINE_SHIFT(36),
    /**
     * font-relative size change ({@code Pango.AttrInt}). Since 1.50
     */
    FONT_SCALE(37);
    
    private static final java.lang.String C_TYPE_NAME = "PangoAttrType";
    
    private final int value;
    AttrType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AttrType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> LANGUAGE;
            case 2 -> FAMILY;
            case 3 -> STYLE;
            case 4 -> WEIGHT;
            case 5 -> VARIANT;
            case 6 -> STRETCH;
            case 7 -> SIZE;
            case 8 -> FONT_DESC;
            case 9 -> FOREGROUND;
            case 10 -> BACKGROUND;
            case 11 -> UNDERLINE;
            case 12 -> STRIKETHROUGH;
            case 13 -> RISE;
            case 14 -> SHAPE;
            case 15 -> SCALE;
            case 16 -> FALLBACK;
            case 17 -> LETTER_SPACING;
            case 18 -> UNDERLINE_COLOR;
            case 19 -> STRIKETHROUGH_COLOR;
            case 20 -> ABSOLUTE_SIZE;
            case 21 -> GRAVITY;
            case 22 -> GRAVITY_HINT;
            case 23 -> FONT_FEATURES;
            case 24 -> FOREGROUND_ALPHA;
            case 25 -> BACKGROUND_ALPHA;
            case 26 -> ALLOW_BREAKS;
            case 27 -> SHOW;
            case 28 -> INSERT_HYPHENS;
            case 29 -> OVERLINE;
            case 30 -> OVERLINE_COLOR;
            case 31 -> LINE_HEIGHT;
            case 32 -> ABSOLUTE_LINE_HEIGHT;
            case 33 -> TEXT_TRANSFORM;
            case 34 -> WORD;
            case 35 -> SENTENCE;
            case 36 -> BASELINE_SHIFT;
            case 37 -> FONT_SCALE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
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
    public static @Nullable java.lang.String getName(org.pango.AttrType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Allocate a new attribute type ID.
     * <p>
     * The attribute type name can be accessed later
     * by using {@link AttrType#getName}.
     * @param name an identifier for the type
     * @return the new type ID.
     */
    public static org.pango.AttrType register(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_attr_type_register.invokeExact(
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.AttrType.of(RESULT);
    }
    
    private static class DowncallHandles {
        
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
    }
}
