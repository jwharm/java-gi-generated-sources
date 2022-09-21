package org.harfbuzz;

/**
 * The 'MATH' table constants, refer to
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/math#mathconstants-table">OpenType documentation</a>
 * For more explanations.
 */
public enum OtMathConstantT {

    /**
     * scriptPercentScaleDown
     */
    SCRIPT_PERCENT_SCALE_DOWN,
    
    /**
     * scriptScriptPercentScaleDown
     */
    SCRIPT_SCRIPT_PERCENT_SCALE_DOWN,
    
    /**
     * delimitedSubFormulaMinHeight
     */
    DELIMITED_SUB_FORMULA_MIN_HEIGHT,
    
    /**
     * displayOperatorMinHeight
     */
    DISPLAY_OPERATOR_MIN_HEIGHT,
    
    /**
     * mathLeading
     */
    MATH_LEADING,
    
    /**
     * axisHeight
     */
    AXIS_HEIGHT,
    
    /**
     * accentBaseHeight
     */
    ACCENT_BASE_HEIGHT,
    
    /**
     * flattenedAccentBaseHeight
     */
    FLATTENED_ACCENT_BASE_HEIGHT,
    
    /**
     * subscriptShiftDown
     */
    SUBSCRIPT_SHIFT_DOWN,
    
    /**
     * subscriptTopMax
     */
    SUBSCRIPT_TOP_MAX,
    
    /**
     * subscriptBaselineDropMin
     */
    SUBSCRIPT_BASELINE_DROP_MIN,
    
    /**
     * superscriptShiftUp
     */
    SUPERSCRIPT_SHIFT_UP,
    
    /**
     * superscriptShiftUpCramped
     */
    SUPERSCRIPT_SHIFT_UP_CRAMPED,
    
    /**
     * superscriptBottomMin
     */
    SUPERSCRIPT_BOTTOM_MIN,
    
    /**
     * superscriptBaselineDropMax
     */
    SUPERSCRIPT_BASELINE_DROP_MAX,
    
    /**
     * subSuperscriptGapMin
     */
    SUB_SUPERSCRIPT_GAP_MIN,
    
    /**
     * superscriptBottomMaxWithSubscript
     */
    SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT,
    
    /**
     * spaceAfterScript
     */
    SPACE_AFTER_SCRIPT,
    
    /**
     * upperLimitGapMin
     */
    UPPER_LIMIT_GAP_MIN,
    
    /**
     * upperLimitBaselineRiseMin
     */
    UPPER_LIMIT_BASELINE_RISE_MIN,
    
    /**
     * lowerLimitGapMin
     */
    LOWER_LIMIT_GAP_MIN,
    
    /**
     * lowerLimitBaselineDropMin
     */
    LOWER_LIMIT_BASELINE_DROP_MIN,
    
    /**
     * stackTopShiftUp
     */
    STACK_TOP_SHIFT_UP,
    
    /**
     * stackTopDisplayStyleShiftUp
     */
    STACK_TOP_DISPLAY_STYLE_SHIFT_UP,
    
    /**
     * stackBottomShiftDown
     */
    STACK_BOTTOM_SHIFT_DOWN,
    
    /**
     * stackBottomDisplayStyleShiftDown
     */
    STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN,
    
    /**
     * stackGapMin
     */
    STACK_GAP_MIN,
    
    /**
     * stackDisplayStyleGapMin
     */
    STACK_DISPLAY_STYLE_GAP_MIN,
    
    /**
     * stretchStackTopShiftUp
     */
    STRETCH_STACK_TOP_SHIFT_UP,
    
    /**
     * stretchStackBottomShiftDown
     */
    STRETCH_STACK_BOTTOM_SHIFT_DOWN,
    
    /**
     * stretchStackGapAboveMin
     */
    STRETCH_STACK_GAP_ABOVE_MIN,
    
    /**
     * stretchStackGapBelowMin
     */
    STRETCH_STACK_GAP_BELOW_MIN,
    
    /**
     * fractionNumeratorShiftUp
     */
    FRACTION_NUMERATOR_SHIFT_UP,
    
    /**
     * fractionNumeratorDisplayStyleShiftUp
     */
    FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP,
    
    /**
     * fractionDenominatorShiftDown
     */
    FRACTION_DENOMINATOR_SHIFT_DOWN,
    
    /**
     * fractionDenominatorDisplayStyleShiftDown
     */
    FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN,
    
    /**
     * fractionNumeratorGapMin
     */
    FRACTION_NUMERATOR_GAP_MIN,
    
    /**
     * fractionNumDisplayStyleGapMin
     */
    FRACTION_NUM_DISPLAY_STYLE_GAP_MIN,
    
    /**
     * fractionRuleThickness
     */
    FRACTION_RULE_THICKNESS,
    
    /**
     * fractionDenominatorGapMin
     */
    FRACTION_DENOMINATOR_GAP_MIN,
    
    /**
     * fractionDenomDisplayStyleGapMin
     */
    FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN,
    
    /**
     * skewedFractionHorizontalGap
     */
    SKEWED_FRACTION_HORIZONTAL_GAP,
    
    /**
     * skewedFractionVerticalGap
     */
    SKEWED_FRACTION_VERTICAL_GAP,
    
    /**
     * overbarVerticalGap
     */
    OVERBAR_VERTICAL_GAP,
    
    /**
     * overbarRuleThickness
     */
    OVERBAR_RULE_THICKNESS,
    
    /**
     * overbarExtraAscender
     */
    OVERBAR_EXTRA_ASCENDER,
    
    /**
     * underbarVerticalGap
     */
    UNDERBAR_VERTICAL_GAP,
    
    /**
     * underbarRuleThickness
     */
    UNDERBAR_RULE_THICKNESS,
    
    /**
     * underbarExtraDescender
     */
    UNDERBAR_EXTRA_DESCENDER,
    
    /**
     * radicalVerticalGap
     */
    RADICAL_VERTICAL_GAP,
    
    /**
     * radicalDisplayStyleVerticalGap
     */
    RADICAL_DISPLAY_STYLE_VERTICAL_GAP,
    
    /**
     * radicalRuleThickness
     */
    RADICAL_RULE_THICKNESS,
    
    /**
     * radicalExtraAscender
     */
    RADICAL_EXTRA_ASCENDER,
    
    /**
     * radicalKernBeforeDegree
     */
    RADICAL_KERN_BEFORE_DEGREE,
    
    /**
     * radicalKernAfterDegree
     */
    RADICAL_KERN_AFTER_DEGREE,
    
    /**
     * radicalDegreeBottomRaisePercent
     */
    RADICAL_DEGREE_BOTTOM_RAISE_PERCENT;
    
    public static OtMathConstantT fromValue(int value) {
        return switch(value) {
            case 0 -> SCRIPT_PERCENT_SCALE_DOWN;
            case 1 -> SCRIPT_SCRIPT_PERCENT_SCALE_DOWN;
            case 2 -> DELIMITED_SUB_FORMULA_MIN_HEIGHT;
            case 3 -> DISPLAY_OPERATOR_MIN_HEIGHT;
            case 4 -> MATH_LEADING;
            case 5 -> AXIS_HEIGHT;
            case 6 -> ACCENT_BASE_HEIGHT;
            case 7 -> FLATTENED_ACCENT_BASE_HEIGHT;
            case 8 -> SUBSCRIPT_SHIFT_DOWN;
            case 9 -> SUBSCRIPT_TOP_MAX;
            case 10 -> SUBSCRIPT_BASELINE_DROP_MIN;
            case 11 -> SUPERSCRIPT_SHIFT_UP;
            case 12 -> SUPERSCRIPT_SHIFT_UP_CRAMPED;
            case 13 -> SUPERSCRIPT_BOTTOM_MIN;
            case 14 -> SUPERSCRIPT_BASELINE_DROP_MAX;
            case 15 -> SUB_SUPERSCRIPT_GAP_MIN;
            case 16 -> SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT;
            case 17 -> SPACE_AFTER_SCRIPT;
            case 18 -> UPPER_LIMIT_GAP_MIN;
            case 19 -> UPPER_LIMIT_BASELINE_RISE_MIN;
            case 20 -> LOWER_LIMIT_GAP_MIN;
            case 21 -> LOWER_LIMIT_BASELINE_DROP_MIN;
            case 22 -> STACK_TOP_SHIFT_UP;
            case 23 -> STACK_TOP_DISPLAY_STYLE_SHIFT_UP;
            case 24 -> STACK_BOTTOM_SHIFT_DOWN;
            case 25 -> STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN;
            case 26 -> STACK_GAP_MIN;
            case 27 -> STACK_DISPLAY_STYLE_GAP_MIN;
            case 28 -> STRETCH_STACK_TOP_SHIFT_UP;
            case 29 -> STRETCH_STACK_BOTTOM_SHIFT_DOWN;
            case 30 -> STRETCH_STACK_GAP_ABOVE_MIN;
            case 31 -> STRETCH_STACK_GAP_BELOW_MIN;
            case 32 -> FRACTION_NUMERATOR_SHIFT_UP;
            case 33 -> FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP;
            case 34 -> FRACTION_DENOMINATOR_SHIFT_DOWN;
            case 35 -> FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN;
            case 36 -> FRACTION_NUMERATOR_GAP_MIN;
            case 37 -> FRACTION_NUM_DISPLAY_STYLE_GAP_MIN;
            case 38 -> FRACTION_RULE_THICKNESS;
            case 39 -> FRACTION_DENOMINATOR_GAP_MIN;
            case 40 -> FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN;
            case 41 -> SKEWED_FRACTION_HORIZONTAL_GAP;
            case 42 -> SKEWED_FRACTION_VERTICAL_GAP;
            case 43 -> OVERBAR_VERTICAL_GAP;
            case 44 -> OVERBAR_RULE_THICKNESS;
            case 45 -> OVERBAR_EXTRA_ASCENDER;
            case 46 -> UNDERBAR_VERTICAL_GAP;
            case 47 -> UNDERBAR_RULE_THICKNESS;
            case 48 -> UNDERBAR_EXTRA_DESCENDER;
            case 49 -> RADICAL_VERTICAL_GAP;
            case 50 -> RADICAL_DISPLAY_STYLE_VERTICAL_GAP;
            case 51 -> RADICAL_RULE_THICKNESS;
            case 52 -> RADICAL_EXTRA_ASCENDER;
            case 53 -> RADICAL_KERN_BEFORE_DEGREE;
            case 54 -> RADICAL_KERN_AFTER_DEGREE;
            case 55 -> RADICAL_DEGREE_BOTTOM_RAISE_PERCENT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SCRIPT_PERCENT_SCALE_DOWN -> 0;
            case SCRIPT_SCRIPT_PERCENT_SCALE_DOWN -> 1;
            case DELIMITED_SUB_FORMULA_MIN_HEIGHT -> 2;
            case DISPLAY_OPERATOR_MIN_HEIGHT -> 3;
            case MATH_LEADING -> 4;
            case AXIS_HEIGHT -> 5;
            case ACCENT_BASE_HEIGHT -> 6;
            case FLATTENED_ACCENT_BASE_HEIGHT -> 7;
            case SUBSCRIPT_SHIFT_DOWN -> 8;
            case SUBSCRIPT_TOP_MAX -> 9;
            case SUBSCRIPT_BASELINE_DROP_MIN -> 10;
            case SUPERSCRIPT_SHIFT_UP -> 11;
            case SUPERSCRIPT_SHIFT_UP_CRAMPED -> 12;
            case SUPERSCRIPT_BOTTOM_MIN -> 13;
            case SUPERSCRIPT_BASELINE_DROP_MAX -> 14;
            case SUB_SUPERSCRIPT_GAP_MIN -> 15;
            case SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT -> 16;
            case SPACE_AFTER_SCRIPT -> 17;
            case UPPER_LIMIT_GAP_MIN -> 18;
            case UPPER_LIMIT_BASELINE_RISE_MIN -> 19;
            case LOWER_LIMIT_GAP_MIN -> 20;
            case LOWER_LIMIT_BASELINE_DROP_MIN -> 21;
            case STACK_TOP_SHIFT_UP -> 22;
            case STACK_TOP_DISPLAY_STYLE_SHIFT_UP -> 23;
            case STACK_BOTTOM_SHIFT_DOWN -> 24;
            case STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN -> 25;
            case STACK_GAP_MIN -> 26;
            case STACK_DISPLAY_STYLE_GAP_MIN -> 27;
            case STRETCH_STACK_TOP_SHIFT_UP -> 28;
            case STRETCH_STACK_BOTTOM_SHIFT_DOWN -> 29;
            case STRETCH_STACK_GAP_ABOVE_MIN -> 30;
            case STRETCH_STACK_GAP_BELOW_MIN -> 31;
            case FRACTION_NUMERATOR_SHIFT_UP -> 32;
            case FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP -> 33;
            case FRACTION_DENOMINATOR_SHIFT_DOWN -> 34;
            case FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN -> 35;
            case FRACTION_NUMERATOR_GAP_MIN -> 36;
            case FRACTION_NUM_DISPLAY_STYLE_GAP_MIN -> 37;
            case FRACTION_RULE_THICKNESS -> 38;
            case FRACTION_DENOMINATOR_GAP_MIN -> 39;
            case FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN -> 40;
            case SKEWED_FRACTION_HORIZONTAL_GAP -> 41;
            case SKEWED_FRACTION_VERTICAL_GAP -> 42;
            case OVERBAR_VERTICAL_GAP -> 43;
            case OVERBAR_RULE_THICKNESS -> 44;
            case OVERBAR_EXTRA_ASCENDER -> 45;
            case UNDERBAR_VERTICAL_GAP -> 46;
            case UNDERBAR_RULE_THICKNESS -> 47;
            case UNDERBAR_EXTRA_DESCENDER -> 48;
            case RADICAL_VERTICAL_GAP -> 49;
            case RADICAL_DISPLAY_STYLE_VERTICAL_GAP -> 50;
            case RADICAL_RULE_THICKNESS -> 51;
            case RADICAL_EXTRA_ASCENDER -> 52;
            case RADICAL_KERN_BEFORE_DEGREE -> 53;
            case RADICAL_KERN_AFTER_DEGREE -> 54;
            case RADICAL_DEGREE_BOTTOM_RAISE_PERCENT -> 55;
        };
    }

}
