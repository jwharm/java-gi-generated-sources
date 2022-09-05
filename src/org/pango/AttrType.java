package org.pango;

/**
 * The `PangoAttrType` distinguishes between different types of attributes.
 * 
 * Along with the predefined values, it is possible to allocate additional
 * values for custom attributes using [func@AttrType.register]. The predefined
 * values are given below. The type of structure used to store the attribute is
 * listed in parentheses after the description.
 */
public enum AttrType {

    /**
     * does not happen
     */
    INVALID,
    
    /**
     * language ([struct@Pango.AttrLanguage])
     */
    LANGUAGE,
    
    /**
     * font family name list ([struct@Pango.AttrString])
     */
    FAMILY,
    
    /**
     * font slant style ([struct@Pango.AttrInt])
     */
    STYLE,
    
    /**
     * font weight ([struct@Pango.AttrInt])
     */
    WEIGHT,
    
    /**
     * font variant (normal or small caps) ([struct@Pango.AttrInt])
     */
    VARIANT,
    
    /**
     * font stretch ([struct@Pango.AttrInt])
     */
    STRETCH,
    
    /**
     * font size in points scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
     */
    SIZE,
    
    /**
     * font description ([struct@Pango.AttrFontDesc])
     */
    FONT_DESC,
    
    /**
     * foreground color ([struct@Pango.AttrColor])
     */
    FOREGROUND,
    
    /**
     * background color ([struct@Pango.AttrColor])
     */
    BACKGROUND,
    
    /**
     * whether the text has an underline ([struct@Pango.AttrInt])
     */
    UNDERLINE,
    
    /**
     * whether the text is struck-through ([struct@Pango.AttrInt])
     */
    STRIKETHROUGH,
    
    /**
     * baseline displacement ([struct@Pango.AttrInt])
     */
    RISE,
    
    /**
     * shape ([struct@Pango.AttrShape])
     */
    SHAPE,
    
    /**
     * font size scale factor ([struct@Pango.AttrFloat])
     */
    SCALE,
    
    /**
     * whether fallback is enabled ([struct@Pango.AttrInt])
     */
    FALLBACK,
    
    /**
     * letter spacing ([struct@PangoAttrInt])
     */
    LETTER_SPACING,
    
    /**
     * underline color ([struct@Pango.AttrColor])
     */
    UNDERLINE_COLOR,
    
    /**
     * strikethrough color ([struct@Pango.AttrColor])
     */
    STRIKETHROUGH_COLOR,
    
    /**
     * font size in pixels scaled by %PANGO_SCALE ([struct@Pango.AttrInt])
     */
    ABSOLUTE_SIZE,
    
    /**
     * base text gravity ([struct@Pango.AttrInt])
     */
    GRAVITY,
    
    /**
     * gravity hint ([struct@Pango.AttrInt])
     */
    GRAVITY_HINT,
    
    /**
     * OpenType font features ([struct@Pango.AttrFontFeatures]). Since 1.38
     */
    FONT_FEATURES,
    
    /**
     * foreground alpha ([struct@Pango.AttrInt]). Since 1.38
     */
    FOREGROUND_ALPHA,
    
    /**
     * background alpha ([struct@Pango.AttrInt]). Since 1.38
     */
    BACKGROUND_ALPHA,
    
    /**
     * whether breaks are allowed ([struct@Pango.AttrInt]). Since 1.44
     */
    ALLOW_BREAKS,
    
    /**
     * how to render invisible characters ([struct@Pango.AttrInt]). Since 1.44
     */
    SHOW,
    
    /**
     * whether to insert hyphens at intra-word line breaks ([struct@Pango.AttrInt]). Since 1.44
     */
    INSERT_HYPHENS,
    
    /**
     * whether the text has an overline ([struct@Pango.AttrInt]). Since 1.46
     */
    OVERLINE,
    
    /**
     * overline color ([struct@Pango.AttrColor]). Since 1.46
     */
    OVERLINE_COLOR,
    
    /**
     * line height factor ([struct@Pango.AttrFloat]). Since: 1.50
     */
    LINE_HEIGHT,
    
    /**
     * line height ([struct@Pango.AttrInt]). Since: 1.50
     */
    ABSOLUTE_LINE_HEIGHT,
    
    TEXT_TRANSFORM,
    
    /**
     * override segmentation to classify the range of the attribute as a single word ([struct@Pango.AttrInt]). Since 1.50
     */
    WORD,
    
    /**
     * override segmentation to classify the range of the attribute as a single sentence ([struct@Pango.AttrInt]). Since 1.50
     */
    SENTENCE,
    
    /**
     * baseline displacement ([struct@Pango.AttrInt]). Since 1.50
     */
    BASELINE_SHIFT,
    
    /**
     * font-relative size change ([struct@Pango.AttrInt]). Since 1.50
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
