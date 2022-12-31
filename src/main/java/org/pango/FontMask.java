package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The bits in a {@code PangoFontMask} correspond to the set fields in a
 * {@code PangoFontDescription}.
 */
public class FontMask extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontMask";
    
    /**
     * the font family is specified.
     */
    public static final FontMask FAMILY = new FontMask(1);
    
    /**
     * the font style is specified.
     */
    public static final FontMask STYLE = new FontMask(2);
    
    /**
     * the font variant is specified.
     */
    public static final FontMask VARIANT = new FontMask(4);
    
    /**
     * the font weight is specified.
     */
    public static final FontMask WEIGHT = new FontMask(8);
    
    /**
     * the font stretch is specified.
     */
    public static final FontMask STRETCH = new FontMask(16);
    
    /**
     * the font size is specified.
     */
    public static final FontMask SIZE = new FontMask(32);
    
    /**
     * the font gravity is specified (Since: 1.16.)
     */
    public static final FontMask GRAVITY = new FontMask(64);
    
    /**
     * OpenType font variations are specified (Since: 1.42)
     */
    public static final FontMask VARIATIONS = new FontMask(128);
    
    public FontMask(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FontMask or(FontMask... masks) {
        int value = this.getValue();
        for (FontMask arg : masks) {
            value |= arg.getValue();
        }
        return new FontMask(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FontMask combined(FontMask mask, FontMask... masks) {
        int value = mask.getValue();
        for (FontMask arg : masks) {
            value |= arg.getValue();
        }
        return new FontMask(value);
    }
}
