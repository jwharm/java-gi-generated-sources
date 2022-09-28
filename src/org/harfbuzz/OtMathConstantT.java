package org.harfbuzz;

/**
 * The 'MATH' table constants, refer to
 * <a href="https://docs.microsoft.com/en-us/typography/opentype/spec/math#mathconstants-table">OpenType documentation</a>
 * For more explanations.
 */
public class OtMathConstantT {

    /**
     * scriptPercentScaleDown
     */
    public static final OtMathConstantT SCRIPT_PERCENT_SCALE_DOWN = new OtMathConstantT(0);
    
    /**
     * scriptScriptPercentScaleDown
     */
    public static final OtMathConstantT SCRIPT_SCRIPT_PERCENT_SCALE_DOWN = new OtMathConstantT(1);
    
    /**
     * delimitedSubFormulaMinHeight
     */
    public static final OtMathConstantT DELIMITED_SUB_FORMULA_MIN_HEIGHT = new OtMathConstantT(2);
    
    /**
     * displayOperatorMinHeight
     */
    public static final OtMathConstantT DISPLAY_OPERATOR_MIN_HEIGHT = new OtMathConstantT(3);
    
    /**
     * mathLeading
     */
    public static final OtMathConstantT MATH_LEADING = new OtMathConstantT(4);
    
    /**
     * axisHeight
     */
    public static final OtMathConstantT AXIS_HEIGHT = new OtMathConstantT(5);
    
    /**
     * accentBaseHeight
     */
    public static final OtMathConstantT ACCENT_BASE_HEIGHT = new OtMathConstantT(6);
    
    /**
     * flattenedAccentBaseHeight
     */
    public static final OtMathConstantT FLATTENED_ACCENT_BASE_HEIGHT = new OtMathConstantT(7);
    
    /**
     * subscriptShiftDown
     */
    public static final OtMathConstantT SUBSCRIPT_SHIFT_DOWN = new OtMathConstantT(8);
    
    /**
     * subscriptTopMax
     */
    public static final OtMathConstantT SUBSCRIPT_TOP_MAX = new OtMathConstantT(9);
    
    /**
     * subscriptBaselineDropMin
     */
    public static final OtMathConstantT SUBSCRIPT_BASELINE_DROP_MIN = new OtMathConstantT(10);
    
    /**
     * superscriptShiftUp
     */
    public static final OtMathConstantT SUPERSCRIPT_SHIFT_UP = new OtMathConstantT(11);
    
    /**
     * superscriptShiftUpCramped
     */
    public static final OtMathConstantT SUPERSCRIPT_SHIFT_UP_CRAMPED = new OtMathConstantT(12);
    
    /**
     * superscriptBottomMin
     */
    public static final OtMathConstantT SUPERSCRIPT_BOTTOM_MIN = new OtMathConstantT(13);
    
    /**
     * superscriptBaselineDropMax
     */
    public static final OtMathConstantT SUPERSCRIPT_BASELINE_DROP_MAX = new OtMathConstantT(14);
    
    /**
     * subSuperscriptGapMin
     */
    public static final OtMathConstantT SUB_SUPERSCRIPT_GAP_MIN = new OtMathConstantT(15);
    
    /**
     * superscriptBottomMaxWithSubscript
     */
    public static final OtMathConstantT SUPERSCRIPT_BOTTOM_MAX_WITH_SUBSCRIPT = new OtMathConstantT(16);
    
    /**
     * spaceAfterScript
     */
    public static final OtMathConstantT SPACE_AFTER_SCRIPT = new OtMathConstantT(17);
    
    /**
     * upperLimitGapMin
     */
    public static final OtMathConstantT UPPER_LIMIT_GAP_MIN = new OtMathConstantT(18);
    
    /**
     * upperLimitBaselineRiseMin
     */
    public static final OtMathConstantT UPPER_LIMIT_BASELINE_RISE_MIN = new OtMathConstantT(19);
    
    /**
     * lowerLimitGapMin
     */
    public static final OtMathConstantT LOWER_LIMIT_GAP_MIN = new OtMathConstantT(20);
    
    /**
     * lowerLimitBaselineDropMin
     */
    public static final OtMathConstantT LOWER_LIMIT_BASELINE_DROP_MIN = new OtMathConstantT(21);
    
    /**
     * stackTopShiftUp
     */
    public static final OtMathConstantT STACK_TOP_SHIFT_UP = new OtMathConstantT(22);
    
    /**
     * stackTopDisplayStyleShiftUp
     */
    public static final OtMathConstantT STACK_TOP_DISPLAY_STYLE_SHIFT_UP = new OtMathConstantT(23);
    
    /**
     * stackBottomShiftDown
     */
    public static final OtMathConstantT STACK_BOTTOM_SHIFT_DOWN = new OtMathConstantT(24);
    
    /**
     * stackBottomDisplayStyleShiftDown
     */
    public static final OtMathConstantT STACK_BOTTOM_DISPLAY_STYLE_SHIFT_DOWN = new OtMathConstantT(25);
    
    /**
     * stackGapMin
     */
    public static final OtMathConstantT STACK_GAP_MIN = new OtMathConstantT(26);
    
    /**
     * stackDisplayStyleGapMin
     */
    public static final OtMathConstantT STACK_DISPLAY_STYLE_GAP_MIN = new OtMathConstantT(27);
    
    /**
     * stretchStackTopShiftUp
     */
    public static final OtMathConstantT STRETCH_STACK_TOP_SHIFT_UP = new OtMathConstantT(28);
    
    /**
     * stretchStackBottomShiftDown
     */
    public static final OtMathConstantT STRETCH_STACK_BOTTOM_SHIFT_DOWN = new OtMathConstantT(29);
    
    /**
     * stretchStackGapAboveMin
     */
    public static final OtMathConstantT STRETCH_STACK_GAP_ABOVE_MIN = new OtMathConstantT(30);
    
    /**
     * stretchStackGapBelowMin
     */
    public static final OtMathConstantT STRETCH_STACK_GAP_BELOW_MIN = new OtMathConstantT(31);
    
    /**
     * fractionNumeratorShiftUp
     */
    public static final OtMathConstantT FRACTION_NUMERATOR_SHIFT_UP = new OtMathConstantT(32);
    
    /**
     * fractionNumeratorDisplayStyleShiftUp
     */
    public static final OtMathConstantT FRACTION_NUMERATOR_DISPLAY_STYLE_SHIFT_UP = new OtMathConstantT(33);
    
    /**
     * fractionDenominatorShiftDown
     */
    public static final OtMathConstantT FRACTION_DENOMINATOR_SHIFT_DOWN = new OtMathConstantT(34);
    
    /**
     * fractionDenominatorDisplayStyleShiftDown
     */
    public static final OtMathConstantT FRACTION_DENOMINATOR_DISPLAY_STYLE_SHIFT_DOWN = new OtMathConstantT(35);
    
    /**
     * fractionNumeratorGapMin
     */
    public static final OtMathConstantT FRACTION_NUMERATOR_GAP_MIN = new OtMathConstantT(36);
    
    /**
     * fractionNumDisplayStyleGapMin
     */
    public static final OtMathConstantT FRACTION_NUM_DISPLAY_STYLE_GAP_MIN = new OtMathConstantT(37);
    
    /**
     * fractionRuleThickness
     */
    public static final OtMathConstantT FRACTION_RULE_THICKNESS = new OtMathConstantT(38);
    
    /**
     * fractionDenominatorGapMin
     */
    public static final OtMathConstantT FRACTION_DENOMINATOR_GAP_MIN = new OtMathConstantT(39);
    
    /**
     * fractionDenomDisplayStyleGapMin
     */
    public static final OtMathConstantT FRACTION_DENOM_DISPLAY_STYLE_GAP_MIN = new OtMathConstantT(40);
    
    /**
     * skewedFractionHorizontalGap
     */
    public static final OtMathConstantT SKEWED_FRACTION_HORIZONTAL_GAP = new OtMathConstantT(41);
    
    /**
     * skewedFractionVerticalGap
     */
    public static final OtMathConstantT SKEWED_FRACTION_VERTICAL_GAP = new OtMathConstantT(42);
    
    /**
     * overbarVerticalGap
     */
    public static final OtMathConstantT OVERBAR_VERTICAL_GAP = new OtMathConstantT(43);
    
    /**
     * overbarRuleThickness
     */
    public static final OtMathConstantT OVERBAR_RULE_THICKNESS = new OtMathConstantT(44);
    
    /**
     * overbarExtraAscender
     */
    public static final OtMathConstantT OVERBAR_EXTRA_ASCENDER = new OtMathConstantT(45);
    
    /**
     * underbarVerticalGap
     */
    public static final OtMathConstantT UNDERBAR_VERTICAL_GAP = new OtMathConstantT(46);
    
    /**
     * underbarRuleThickness
     */
    public static final OtMathConstantT UNDERBAR_RULE_THICKNESS = new OtMathConstantT(47);
    
    /**
     * underbarExtraDescender
     */
    public static final OtMathConstantT UNDERBAR_EXTRA_DESCENDER = new OtMathConstantT(48);
    
    /**
     * radicalVerticalGap
     */
    public static final OtMathConstantT RADICAL_VERTICAL_GAP = new OtMathConstantT(49);
    
    /**
     * radicalDisplayStyleVerticalGap
     */
    public static final OtMathConstantT RADICAL_DISPLAY_STYLE_VERTICAL_GAP = new OtMathConstantT(50);
    
    /**
     * radicalRuleThickness
     */
    public static final OtMathConstantT RADICAL_RULE_THICKNESS = new OtMathConstantT(51);
    
    /**
     * radicalExtraAscender
     */
    public static final OtMathConstantT RADICAL_EXTRA_ASCENDER = new OtMathConstantT(52);
    
    /**
     * radicalKernBeforeDegree
     */
    public static final OtMathConstantT RADICAL_KERN_BEFORE_DEGREE = new OtMathConstantT(53);
    
    /**
     * radicalKernAfterDegree
     */
    public static final OtMathConstantT RADICAL_KERN_AFTER_DEGREE = new OtMathConstantT(54);
    
    /**
     * radicalDegreeBottomRaisePercent
     */
    public static final OtMathConstantT RADICAL_DEGREE_BOTTOM_RAISE_PERCENT = new OtMathConstantT(55);
    
    private int value;
    
    public OtMathConstantT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtMathConstantT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
