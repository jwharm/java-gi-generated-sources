package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Metric tags corresponding to [MVAR Value
 * Tags](https://docs.microsoft.com/en-us/typography/opentype/spec/mvar{@code value}-tags)
 * @version 2.6.0
 */
public enum OtMetricsTagT implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * horizontal ascender.
     */
    HORIZONTAL_ASCENDER(1751216995),
    
    /**
     * horizontal descender.
     */
    HORIZONTAL_DESCENDER(1751413603),
    
    /**
     * horizontal line gap.
     */
    HORIZONTAL_LINE_GAP(1751934832),
    
    /**
     * horizontal clipping ascent.
     */
    HORIZONTAL_CLIPPING_ASCENT(1751346273),
    
    /**
     * horizontal clipping descent.
     */
    HORIZONTAL_CLIPPING_DESCENT(1751346276),
    
    /**
     * vertical ascender.
     */
    VERTICAL_ASCENDER(1986098019),
    
    /**
     * vertical descender.
     */
    VERTICAL_DESCENDER(1986294627),
    
    /**
     * vertical line gap.
     */
    VERTICAL_LINE_GAP(1986815856),
    
    /**
     * horizontal caret rise.
     */
    HORIZONTAL_CARET_RISE(1751347827),
    
    /**
     * horizontal caret run.
     */
    HORIZONTAL_CARET_RUN(1751347822),
    
    /**
     * horizontal caret offset.
     */
    HORIZONTAL_CARET_OFFSET(1751347046),
    
    /**
     * vertical caret rise.
     */
    VERTICAL_CARET_RISE(1986228851),
    
    /**
     * vertical caret run.
     */
    VERTICAL_CARET_RUN(1986228846),
    
    /**
     * vertical caret offset.
     */
    VERTICAL_CARET_OFFSET(1986228070),
    
    /**
     * x height.
     */
    X_HEIGHT(2020108148),
    
    /**
     * cap height.
     */
    CAP_HEIGHT(1668311156),
    
    /**
     * subscript em x size.
     */
    SUBSCRIPT_EM_X_SIZE(1935833203),
    
    /**
     * subscript em y size.
     */
    SUBSCRIPT_EM_Y_SIZE(1935833459),
    
    /**
     * subscript em x offset.
     */
    SUBSCRIPT_EM_X_OFFSET(1935833199),
    
    /**
     * subscript em y offset.
     */
    SUBSCRIPT_EM_Y_OFFSET(1935833455),
    
    /**
     * superscript em x size.
     */
    SUPERSCRIPT_EM_X_SIZE(1936750707),
    
    /**
     * superscript em y size.
     */
    SUPERSCRIPT_EM_Y_SIZE(1936750963),
    
    /**
     * superscript em x offset.
     */
    SUPERSCRIPT_EM_X_OFFSET(1936750703),
    
    /**
     * superscript em y offset.
     */
    SUPERSCRIPT_EM_Y_OFFSET(1936750959),
    
    /**
     * strikeout size.
     */
    STRIKEOUT_SIZE(1937011315),
    
    /**
     * strikeout offset.
     */
    STRIKEOUT_OFFSET(1937011311),
    
    /**
     * underline size.
     */
    UNDERLINE_SIZE(1970168947),
    
    /**
     * underline offset.
     */
    UNDERLINE_OFFSET(1970168943);
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_metrics_tag_t";
    
    private final int value;
    
    /**
     * Create a new OtMetricsTagT for the provided value
     * @param numeric value the enum value
     */
    OtMetricsTagT(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new OtMetricsTagT for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static OtMetricsTagT of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
