package org.pango;

/**
 * The {@code PangoAttrType} distinguishes between different types of attributes.
 * <p>
 * Along with the predefined values, it is possible to allocate additional
 * values for custom attributes using {@link AttrType#register}. The predefined
 * values are given below. The type of structure used to store the attribute is
 * listed in parentheses after the description.
 */
public enum AttrType {

    /**
     * does not happen
     */
    INVALID,
    
    /**
     * language ({@code Pango.AttrLanguage})
     */
    LANGUAGE,
    
    /**
     * font family name list ({@code Pango.AttrString})
     */
    FAMILY,
    
    /**
     * font slant style ({@code Pango.AttrInt})
     */
    STYLE,
    
    /**
     * font weight ({@code Pango.AttrInt})
     */
    WEIGHT,
    
    /**
     * font variant (normal or small caps) ({@code Pango.AttrInt})
     */
    VARIANT,
    
    /**
     * font stretch ({@code Pango.AttrInt})
     */
    STRETCH,
    
    /**
     * font size in points scaled by {@code PANGO_SCALE} ({@code Pango.AttrInt})
     */
    SIZE,
    
    /**
     * font description ({@code Pango.AttrFontDesc})
     */
    FONT_DESC,
    
    /**
     * foreground color ({@code Pango.AttrColor})
     */
    FOREGROUND,
    
    /**
     * background color ({@code Pango.AttrColor})
     */
    BACKGROUND,
    
    /**
     * whether the text has an underline ({@code Pango.AttrInt})
     */
    UNDERLINE,
    
    /**
     * whether the text is struck-through ({@code Pango.AttrInt})
     */
    STRIKETHROUGH,
    
    /**
     * baseline displacement ({@code Pango.AttrInt})
     */
    RISE,
    
    /**
     * shape ({@code Pango.AttrShape})
     */
    SHAPE,
    
    /**
     * font size scale factor ({@code Pango.AttrFloat})
     */
    SCALE,
    
    /**
     * whether fallback is enabled ({@code Pango.AttrInt})
     */
    FALLBACK,
    
    /**
     * letter spacing ({@code PangoAttrInt})
     */
    LETTER_SPACING,
    
    /**
     * underline color ({@code Pango.AttrColor})
     */
    UNDERLINE_COLOR,
    
    /**
     * strikethrough color ({@code Pango.AttrColor})
     */
    STRIKETHROUGH_COLOR,
    
    /**
     * font size in pixels scaled by {@code PANGO_SCALE} ({@code Pango.AttrInt})
     */
    ABSOLUTE_SIZE,
    
    /**
     * base text gravity ({@code Pango.AttrInt})
     */
    GRAVITY,
    
    /**
     * gravity hint ({@code Pango.AttrInt})
     */
    GRAVITY_HINT,
    
    /**
     * OpenType font features ({@code Pango.AttrFontFeatures}). Since 1.38
     */
    FONT_FEATURES,
    
    /**
     * foreground alpha ({@code Pango.AttrInt}). Since 1.38
     */
    FOREGROUND_ALPHA,
    
    /**
     * background alpha ({@code Pango.AttrInt}). Since 1.38
     */
    BACKGROUND_ALPHA,
    
    /**
     * whether breaks are allowed ({@code Pango.AttrInt}). Since 1.44
     */
    ALLOW_BREAKS,
    
    /**
     * how to render invisible characters ({@code Pango.AttrInt}). Since 1.44
     */
    SHOW,
    
    /**
     * whether to insert hyphens at intra-word line breaks ({@code Pango.AttrInt}). Since 1.44
     */
    INSERT_HYPHENS,
    
    /**
     * whether the text has an overline ({@code Pango.AttrInt}). Since 1.46
     */
    OVERLINE,
    
    /**
     * overline color ({@code Pango.AttrColor}). Since 1.46
     */
    OVERLINE_COLOR,
    
    /**
     * line height factor ({@code Pango.AttrFloat}). Since: 1.50
     */
    LINE_HEIGHT,
    
    /**
     * line height ({@code Pango.AttrInt}). Since: 1.50
     */
    ABSOLUTE_LINE_HEIGHT,
    
    TEXT_TRANSFORM,
    
    /**
     * override segmentation to classify the range of the attribute as a single word ({@code Pango.AttrInt}). Since 1.50
     */
    WORD,
    
    /**
     * override segmentation to classify the range of the attribute as a single sentence ({@code Pango.AttrInt}). Since 1.50
     */
    SENTENCE,
    
    /**
     * baseline displacement ({@code Pango.AttrInt}). Since 1.50
     */
    BASELINE_SHIFT,
    
    /**
     * font-relative size change ({@code Pango.AttrInt}). Since 1.50
     */
    FONT_SCALE;
    
    public static AttrType fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case LANGUAGE -> 1;
            case FAMILY -> 2;
            case STYLE -> 3;
            case WEIGHT -> 4;
            case VARIANT -> 5;
            case STRETCH -> 6;
            case SIZE -> 7;
            case FONT_DESC -> 8;
            case FOREGROUND -> 9;
            case BACKGROUND -> 10;
            case UNDERLINE -> 11;
            case STRIKETHROUGH -> 12;
            case RISE -> 13;
            case SHAPE -> 14;
            case SCALE -> 15;
            case FALLBACK -> 16;
            case LETTER_SPACING -> 17;
            case UNDERLINE_COLOR -> 18;
            case STRIKETHROUGH_COLOR -> 19;
            case ABSOLUTE_SIZE -> 20;
            case GRAVITY -> 21;
            case GRAVITY_HINT -> 22;
            case FONT_FEATURES -> 23;
            case FOREGROUND_ALPHA -> 24;
            case BACKGROUND_ALPHA -> 25;
            case ALLOW_BREAKS -> 26;
            case SHOW -> 27;
            case INSERT_HYPHENS -> 28;
            case OVERLINE -> 29;
            case OVERLINE_COLOR -> 30;
            case LINE_HEIGHT -> 31;
            case ABSOLUTE_LINE_HEIGHT -> 32;
            case TEXT_TRANSFORM -> 33;
            case WORD -> 34;
            case SENTENCE -> 35;
            case BASELINE_SHIFT -> 36;
            case FONT_SCALE -> 37;
        };
    }

}
