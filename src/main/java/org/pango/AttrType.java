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
public class AttrType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * does not happen
     */
    public static final AttrType INVALID = new AttrType(0);
    
    /**
     * language ({@code Pango.AttrLanguage})
     */
    public static final AttrType LANGUAGE = new AttrType(1);
    
    /**
     * font family name list ({@code Pango.AttrString})
     */
    public static final AttrType FAMILY = new AttrType(2);
    
    /**
     * font slant style ({@code Pango.AttrInt})
     */
    public static final AttrType STYLE = new AttrType(3);
    
    /**
     * font weight ({@code Pango.AttrInt})
     */
    public static final AttrType WEIGHT = new AttrType(4);
    
    /**
     * font variant (normal or small caps) ({@code Pango.AttrInt})
     */
    public static final AttrType VARIANT = new AttrType(5);
    
    /**
     * font stretch ({@code Pango.AttrInt})
     */
    public static final AttrType STRETCH = new AttrType(6);
    
    /**
     * font size in points scaled by {@code PANGO_SCALE} ({@code Pango.AttrInt})
     */
    public static final AttrType SIZE = new AttrType(7);
    
    /**
     * font description ({@code Pango.AttrFontDesc})
     */
    public static final AttrType FONT_DESC = new AttrType(8);
    
    /**
     * foreground color ({@code Pango.AttrColor})
     */
    public static final AttrType FOREGROUND = new AttrType(9);
    
    /**
     * background color ({@code Pango.AttrColor})
     */
    public static final AttrType BACKGROUND = new AttrType(10);
    
    /**
     * whether the text has an underline ({@code Pango.AttrInt})
     */
    public static final AttrType UNDERLINE = new AttrType(11);
    
    /**
     * whether the text is struck-through ({@code Pango.AttrInt})
     */
    public static final AttrType STRIKETHROUGH = new AttrType(12);
    
    /**
     * baseline displacement ({@code Pango.AttrInt})
     */
    public static final AttrType RISE = new AttrType(13);
    
    /**
     * shape ({@code Pango.AttrShape})
     */
    public static final AttrType SHAPE = new AttrType(14);
    
    /**
     * font size scale factor ({@code Pango.AttrFloat})
     */
    public static final AttrType SCALE = new AttrType(15);
    
    /**
     * whether fallback is enabled ({@code Pango.AttrInt})
     */
    public static final AttrType FALLBACK = new AttrType(16);
    
    /**
     * letter spacing ({@code PangoAttrInt})
     */
    public static final AttrType LETTER_SPACING = new AttrType(17);
    
    /**
     * underline color ({@code Pango.AttrColor})
     */
    public static final AttrType UNDERLINE_COLOR = new AttrType(18);
    
    /**
     * strikethrough color ({@code Pango.AttrColor})
     */
    public static final AttrType STRIKETHROUGH_COLOR = new AttrType(19);
    
    /**
     * font size in pixels scaled by {@code PANGO_SCALE} ({@code Pango.AttrInt})
     */
    public static final AttrType ABSOLUTE_SIZE = new AttrType(20);
    
    /**
     * base text gravity ({@code Pango.AttrInt})
     */
    public static final AttrType GRAVITY = new AttrType(21);
    
    /**
     * gravity hint ({@code Pango.AttrInt})
     */
    public static final AttrType GRAVITY_HINT = new AttrType(22);
    
    /**
     * OpenType font features ({@code Pango.AttrFontFeatures}). Since 1.38
     */
    public static final AttrType FONT_FEATURES = new AttrType(23);
    
    /**
     * foreground alpha ({@code Pango.AttrInt}). Since 1.38
     */
    public static final AttrType FOREGROUND_ALPHA = new AttrType(24);
    
    /**
     * background alpha ({@code Pango.AttrInt}). Since 1.38
     */
    public static final AttrType BACKGROUND_ALPHA = new AttrType(25);
    
    /**
     * whether breaks are allowed ({@code Pango.AttrInt}). Since 1.44
     */
    public static final AttrType ALLOW_BREAKS = new AttrType(26);
    
    /**
     * how to render invisible characters ({@code Pango.AttrInt}). Since 1.44
     */
    public static final AttrType SHOW = new AttrType(27);
    
    /**
     * whether to insert hyphens at intra-word line breaks ({@code Pango.AttrInt}). Since 1.44
     */
    public static final AttrType INSERT_HYPHENS = new AttrType(28);
    
    /**
     * whether the text has an overline ({@code Pango.AttrInt}). Since 1.46
     */
    public static final AttrType OVERLINE = new AttrType(29);
    
    /**
     * overline color ({@code Pango.AttrColor}). Since 1.46
     */
    public static final AttrType OVERLINE_COLOR = new AttrType(30);
    
    /**
     * line height factor ({@code Pango.AttrFloat}). Since: 1.50
     */
    public static final AttrType LINE_HEIGHT = new AttrType(31);
    
    /**
     * line height ({@code Pango.AttrInt}). Since: 1.50
     */
    public static final AttrType ABSOLUTE_LINE_HEIGHT = new AttrType(32);
    
    public static final AttrType TEXT_TRANSFORM = new AttrType(33);
    
    /**
     * override segmentation to classify the range of the attribute as a single word ({@code Pango.AttrInt}). Since 1.50
     */
    public static final AttrType WORD = new AttrType(34);
    
    /**
     * override segmentation to classify the range of the attribute as a single sentence ({@code Pango.AttrInt}). Since 1.50
     */
    public static final AttrType SENTENCE = new AttrType(35);
    
    /**
     * baseline displacement ({@code Pango.AttrInt}). Since 1.50
     */
    public static final AttrType BASELINE_SHIFT = new AttrType(36);
    
    /**
     * font-relative size change ({@code Pango.AttrInt}). Since 1.50
     */
    public static final AttrType FONT_SCALE = new AttrType(37);
    
    public AttrType(int value) {
        super(value);
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
    public static @Nullable java.lang.String getName(@NotNull org.pango.AttrType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_attr_type_get_name.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Allocate a new attribute type ID.
     * <p>
     * The attribute type name can be accessed later
     * by using {@link AttrType#getName}.
     * @param name an identifier for the type
     * @return the new type ID.
     */
    public static @NotNull org.pango.AttrType register(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_attr_type_register.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.AttrType(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_attr_type_get_name = Interop.downcallHandle(
            "pango_attr_type_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle pango_attr_type_register = Interop.downcallHandle(
            "pango_attr_type_register",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
