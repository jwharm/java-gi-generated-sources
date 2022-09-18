package org.harfbuzz;

/**
 * Metric tags corresponding to {@link [MVAR Value
 * Tags]}(https://docs.microsoft.com/en-us/typography/opentype/spec/mvar<code>#value</code> tags)
 */
public enum OtMetricsTagT {

    /**
     * horizontal ascender.
     */
    HORIZONTAL_ASCENDER,
    
    /**
     * horizontal descender.
     */
    HORIZONTAL_DESCENDER,
    
    /**
     * horizontal line gap.
     */
    HORIZONTAL_LINE_GAP,
    
    /**
     * horizontal clipping ascent.
     */
    HORIZONTAL_CLIPPING_ASCENT,
    
    /**
     * horizontal clipping descent.
     */
    HORIZONTAL_CLIPPING_DESCENT,
    
    /**
     * vertical ascender.
     */
    VERTICAL_ASCENDER,
    
    /**
     * vertical descender.
     */
    VERTICAL_DESCENDER,
    
    /**
     * vertical line gap.
     */
    VERTICAL_LINE_GAP,
    
    /**
     * horizontal caret rise.
     */
    HORIZONTAL_CARET_RISE,
    
    /**
     * horizontal caret run.
     */
    HORIZONTAL_CARET_RUN,
    
    /**
     * horizontal caret offset.
     */
    HORIZONTAL_CARET_OFFSET,
    
    /**
     * vertical caret rise.
     */
    VERTICAL_CARET_RISE,
    
    /**
     * vertical caret run.
     */
    VERTICAL_CARET_RUN,
    
    /**
     * vertical caret offset.
     */
    VERTICAL_CARET_OFFSET,
    
    /**
     * x height.
     */
    X_HEIGHT,
    
    /**
     * cap height.
     */
    CAP_HEIGHT,
    
    /**
     * subscript em x size.
     */
    SUBSCRIPT_EM_X_SIZE,
    
    /**
     * subscript em y size.
     */
    SUBSCRIPT_EM_Y_SIZE,
    
    /**
     * subscript em x offset.
     */
    SUBSCRIPT_EM_X_OFFSET,
    
    /**
     * subscript em y offset.
     */
    SUBSCRIPT_EM_Y_OFFSET,
    
    /**
     * superscript em x size.
     */
    SUPERSCRIPT_EM_X_SIZE,
    
    /**
     * superscript em y size.
     */
    SUPERSCRIPT_EM_Y_SIZE,
    
    /**
     * superscript em x offset.
     */
    SUPERSCRIPT_EM_X_OFFSET,
    
    /**
     * superscript em y offset.
     */
    SUPERSCRIPT_EM_Y_OFFSET,
    
    /**
     * strikeout size.
     */
    STRIKEOUT_SIZE,
    
    /**
     * strikeout offset.
     */
    STRIKEOUT_OFFSET,
    
    /**
     * underline size.
     */
    UNDERLINE_SIZE,
    
    /**
     * underline offset.
     */
    UNDERLINE_OFFSET;
    
    public static OtMetricsTagT fromValue(int value) {
        return switch(value) {
            case 1751216995 -> HORIZONTAL_ASCENDER;
            case 1751413603 -> HORIZONTAL_DESCENDER;
            case 1751934832 -> HORIZONTAL_LINE_GAP;
            case 1751346273 -> HORIZONTAL_CLIPPING_ASCENT;
            case 1751346276 -> HORIZONTAL_CLIPPING_DESCENT;
            case 1986098019 -> VERTICAL_ASCENDER;
            case 1986294627 -> VERTICAL_DESCENDER;
            case 1986815856 -> VERTICAL_LINE_GAP;
            case 1751347827 -> HORIZONTAL_CARET_RISE;
            case 1751347822 -> HORIZONTAL_CARET_RUN;
            case 1751347046 -> HORIZONTAL_CARET_OFFSET;
            case 1986228851 -> VERTICAL_CARET_RISE;
            case 1986228846 -> VERTICAL_CARET_RUN;
            case 1986228070 -> VERTICAL_CARET_OFFSET;
            case 2020108148 -> X_HEIGHT;
            case 1668311156 -> CAP_HEIGHT;
            case 1935833203 -> SUBSCRIPT_EM_X_SIZE;
            case 1935833459 -> SUBSCRIPT_EM_Y_SIZE;
            case 1935833199 -> SUBSCRIPT_EM_X_OFFSET;
            case 1935833455 -> SUBSCRIPT_EM_Y_OFFSET;
            case 1936750707 -> SUPERSCRIPT_EM_X_SIZE;
            case 1936750963 -> SUPERSCRIPT_EM_Y_SIZE;
            case 1936750703 -> SUPERSCRIPT_EM_X_OFFSET;
            case 1936750959 -> SUPERSCRIPT_EM_Y_OFFSET;
            case 1937011315 -> STRIKEOUT_SIZE;
            case 1937011311 -> STRIKEOUT_OFFSET;
            case 1970168947 -> UNDERLINE_SIZE;
            case 1970168943 -> UNDERLINE_OFFSET;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case HORIZONTAL_ASCENDER -> 1751216995;
            case HORIZONTAL_DESCENDER -> 1751413603;
            case HORIZONTAL_LINE_GAP -> 1751934832;
            case HORIZONTAL_CLIPPING_ASCENT -> 1751346273;
            case HORIZONTAL_CLIPPING_DESCENT -> 1751346276;
            case VERTICAL_ASCENDER -> 1986098019;
            case VERTICAL_DESCENDER -> 1986294627;
            case VERTICAL_LINE_GAP -> 1986815856;
            case HORIZONTAL_CARET_RISE -> 1751347827;
            case HORIZONTAL_CARET_RUN -> 1751347822;
            case HORIZONTAL_CARET_OFFSET -> 1751347046;
            case VERTICAL_CARET_RISE -> 1986228851;
            case VERTICAL_CARET_RUN -> 1986228846;
            case VERTICAL_CARET_OFFSET -> 1986228070;
            case X_HEIGHT -> 2020108148;
            case CAP_HEIGHT -> 1668311156;
            case SUBSCRIPT_EM_X_SIZE -> 1935833203;
            case SUBSCRIPT_EM_Y_SIZE -> 1935833459;
            case SUBSCRIPT_EM_X_OFFSET -> 1935833199;
            case SUBSCRIPT_EM_Y_OFFSET -> 1935833455;
            case SUPERSCRIPT_EM_X_SIZE -> 1936750707;
            case SUPERSCRIPT_EM_Y_SIZE -> 1936750963;
            case SUPERSCRIPT_EM_X_OFFSET -> 1936750703;
            case SUPERSCRIPT_EM_Y_OFFSET -> 1936750959;
            case STRIKEOUT_SIZE -> 1937011315;
            case STRIKEOUT_OFFSET -> 1937011311;
            case UNDERLINE_SIZE -> 1970168947;
            case UNDERLINE_OFFSET -> 1970168943;
        };
    }

}
