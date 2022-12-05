package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The 'MATH' table constants, refer to
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/math#mathconstants-table">OpenType documentation</a>
 * For more explanations.
 * @version 1.3.3
 */
public enum OtMathConstantT implements io.github.jwharm.javagi.Enumeration {
    /**
     * scriptPercentScaleDown
     */
    SCRIPT_PERCENT_SCALE_DOWN(0),
    /**
     * scriptScriptPercentScaleDown
     */
    SCRIPT_SCRIPT_PERCENT_SCALE_DOWN(1),
    /**
     * delimitedSubFormulaMinHeight
     */
    DELIMITED_SUB_FORMULA_MIN_HEIGHT(2),
    /**
     * displayOperatorMinHeight
     */
    DISPLAY_OPERATOR_MIN_HEIGHT(3),
    /**
     * mathLeading
     */
    MATH_LEADING(4),
    /**
     * axisHeight
     */
    AXIS_HEIGHT(5),
    /**
     * accentBaseHeight
     */
    ACCENT_BASE_HEIGHT(6),
    /**
     * flattenedAccentBaseHeight
     */
    FLATTENED_ACCENT_BASE_HEIGHT(7),
    /**
     * subscriptShiftDown
     */
    SUBSCRIPT_SHIFT_DOWN(8),
    /**
     * subscriptTopMax
     */
    SUBSCRIPT_TOP_MAX(9),
    /**
     * subscriptBaselineDropMin
     */
    SUBSCRIPT_BASELINE_DROP_MIN(10),
    /**
     * superscriptShiftUp
     */
    SUPERSCRIPT_SHIFT_UP(11),
    /**
     * superscriptShiftUpCramped
     */
    SUPERSCRIPT_SHIFT_UP_CRAMPED(12),
    /**
     * superscriptBottomMin
     */
    SUPERSCRIPT_BOTTOM_MIN(13),
    /**
     * superscriptBaselineDropMax
     */
    SUPERSCRIPT_BASELINE_DROP_MAX(14),
    /**
     * subSuperscriptGapMin
     */
    SUB_SUPERSCRIPT_GAP_MIN(15),
    /**
     * superscriptBottomMaxWithSubscript
     */
    SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT(16),
    /**
     * spaceAfterScript
     */
    SPACE_AFTER_SCRIPT(17),
    /**
     * upperLimitGapMin
     */
    UPPER_LIMIT_GAP_MIN(18),
    /**
     * upperLimitBaselineRiseMin
     */
    UPPER_LIMIT_BASELINE_RISE_MIN(19),
    /**
     * lowerLimitGapMin
     */
    LOWER_LIMIT_GAP_MIN(20),
    /**
     * lowerLimitBaselineDropMin
     */
    LOWER_LIMIT_BASELINE_DROP_MIN(21),
    /**
     * stackTopShiftUp
     */
    STACK_TOP_SHIFT_UP(22),
    /**
     * stackTopDisplayStyleShiftUp
     */
    STACK_TOP_DISPLAY_STYLE_SHIFT_UP(23),
    /**
     * stackBottomShiftDown
     */
    STACK_BOTTOM_SHIFT_DOWN(24),
    /**
     * stackBottomDisplayStyleShiftDown
     */
    STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN(25),
    /**
     * stackGapMin
     */
    STACK_GAP_MIN(26),
    /**
     * stackDisplayStyleGapMin
     */
    STACK_DISPLAY_STYLE_GAP_MIN(27),
    /**
     * stretchStackTopShiftUp
     */
    STRETCH_STACK_TOP_SHIFT_UP(28),
    /**
     * stretchStackBottomShiftDown
     */
    STRETCH_STACK_BOTTOM_SHIFT_DOWN(29),
    /**
     * stretchStackGapAboveMin
     */
    STRETCH_STACK_GAP_ABOVE_MIN(30),
    /**
     * stretchStackGapBelowMin
     */
    STRETCH_STACK_GAP_BELOW_MIN(31),
    /**
     * fractionNumeratorShiftUp
     */
    FRACTION_NUMERATOR_SHIFT_UP(32),
    /**
     * fractionNumeratorDisplayStyleShiftUp
     */
    FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP(33),
    /**
     * fractionDenominatorShiftDown
     */
    FRACTION_DENOMINATOR_SHIFT_DOWN(34),
    /**
     * fractionDenominatorDisplayStyleShiftDown
     */
    FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN(35),
    /**
     * fractionNumeratorGapMin
     */
    FRACTION_NUMERATOR_GAP_MIN(36),
    /**
     * fractionNumDisplayStyleGapMin
     */
    FRACTION_NUM_DISPLAY_STYLE_GAP_MIN(37),
    /**
     * fractionRuleThickness
     */
    FRACTION_RULE_THICKNESS(38),
    /**
     * fractionDenominatorGapMin
     */
    FRACTION_DENOMINATOR_GAP_MIN(39),
    /**
     * fractionDenomDisplayStyleGapMin
     */
    FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN(40),
    /**
     * skewedFractionHorizontalGap
     */
    SKEWED_FRACTION_HORIZONTAL_GAP(41),
    /**
     * skewedFractionVerticalGap
     */
    SKEWED_FRACTION_VERTICAL_GAP(42),
    /**
     * overbarVerticalGap
     */
    OVERBAR_VERTICAL_GAP(43),
    /**
     * overbarRuleThickness
     */
    OVERBAR_RULE_THICKNESS(44),
    /**
     * overbarExtraAscender
     */
    OVERBAR_EXTRA_ASCENDER(45),
    /**
     * underbarVerticalGap
     */
    UNDERBAR_VERTICAL_GAP(46),
    /**
     * underbarRuleThickness
     */
    UNDERBAR_RULE_THICKNESS(47),
    /**
     * underbarExtraDescender
     */
    UNDERBAR_EXTRA_DESCENDER(48),
    /**
     * radicalVerticalGap
     */
    RADICAL_VERTICAL_GAP(49),
    /**
     * radicalDisplayStyleVerticalGap
     */
    RADICAL_DISPLAY_STYLE_VERTICAL_GAP(50),
    /**
     * radicalRuleThickness
     */
    RADICAL_RULE_THICKNESS(51),
    /**
     * radicalExtraAscender
     */
    RADICAL_EXTRA_ASCENDER(52),
    /**
     * radicalKernBeforeDegree
     */
    RADICAL_KERN_BEFORE_DEGREE(53),
    /**
     * radicalKernAfterDegree
     */
    RADICAL_KERN_AFTER_DEGREE(54),
    /**
     * radicalDegreeBottomRaisePercent
     */
    RADICAL_DEGREE_BOTTOM_RAISE_PERCENT(55);
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_math_constant_t";
    
    private final int value;
    OtMathConstantT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static OtMathConstantT of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
