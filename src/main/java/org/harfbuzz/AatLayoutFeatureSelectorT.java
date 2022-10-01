package org.harfbuzz;

/**
 * The selectors defined for specifying AAT feature settings.
 */
public class AatLayoutFeatureSelectorT extends io.github.jwharm.javagi.Enumeration {

    /**
     * Initial, unset feature selector
     */
    public static final AatLayoutFeatureSelectorT INVALID = new AatLayoutFeatureSelectorT(65535);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALL_TYPOGRAPHIC}
     */
    public static final AatLayoutFeatureSelectorT ALL_TYPE_FEATURES_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALL_TYPOGRAPHIC}
     */
    public static final AatLayoutFeatureSelectorT ALL_TYPE_FEATURES_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT REQUIRED_LIGATURES_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT REQUIRED_LIGATURES_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT COMMON_LIGATURES_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT COMMON_LIGATURES_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT RARE_LIGATURES_ON = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT RARE_LIGATURES_OFF = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT LOGOS_ON = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT LOGOS_OFF = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT REBUS_PICTURES_ON = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT REBUS_PICTURES_OFF = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT DIPHTHONG_LIGATURES_ON = new AatLayoutFeatureSelectorT(10);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT DIPHTHONG_LIGATURES_OFF = new AatLayoutFeatureSelectorT(11);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT SQUARED_LIGATURES_ON = new AatLayoutFeatureSelectorT(12);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT SQUARED_LIGATURES_OFF = new AatLayoutFeatureSelectorT(13);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT ABBREV_SQUARED_LIGATURES_ON = new AatLayoutFeatureSelectorT(14);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT ABBREV_SQUARED_LIGATURES_OFF = new AatLayoutFeatureSelectorT(15);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT SYMBOL_LIGATURES_ON = new AatLayoutFeatureSelectorT(16);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT SYMBOL_LIGATURES_OFF = new AatLayoutFeatureSelectorT(17);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_LIGATURES_ON = new AatLayoutFeatureSelectorT(18);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_LIGATURES_OFF = new AatLayoutFeatureSelectorT(19);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT HISTORICAL_LIGATURES_ON = new AatLayoutFeatureSelectorT(20);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT HISTORICAL_LIGATURES_OFF = new AatLayoutFeatureSelectorT(21);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT UNCONNECTED = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT PARTIALLY_CONNECTED = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    public static final AatLayoutFeatureSelectorT CURSIVE = new AatLayoutFeatureSelectorT(2);
    
    /**
     * Deprecated
     */
    public static final AatLayoutFeatureSelectorT UPPER_AND_LOWER_CASE = new AatLayoutFeatureSelectorT(0);
    
    /**
     * Deprecated
     */
    public static final AatLayoutFeatureSelectorT ALL_CAPS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * Deprecated
     */
    public static final AatLayoutFeatureSelectorT ALL_LOWER_CASE = new AatLayoutFeatureSelectorT(2);
    
    /**
     * Deprecated
     */
    public static final AatLayoutFeatureSelectorT SMALL_CAPS = new AatLayoutFeatureSelectorT(3);
    
    /**
     * Deprecated
     */
    public static final AatLayoutFeatureSelectorT INITIAL_CAPS = new AatLayoutFeatureSelectorT(4);
    
    /**
     * Deprecated
     */
    public static final AatLayoutFeatureSelectorT INITIAL_CAPS_AND_SMALL_CAPS = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_SUBSTITUTION}
     */
    public static final AatLayoutFeatureSelectorT SUBSTITUTE_VERTICAL_FORMS_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_SUBSTITUTION}
     */
    public static final AatLayoutFeatureSelectorT SUBSTITUTE_VERTICAL_FORMS_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LINGUISTIC_REARRANGEMENT}
     */
    public static final AatLayoutFeatureSelectorT LINGUISTIC_REARRANGEMENT_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LINGUISTIC_REARRANGEMENT}
     */
    public static final AatLayoutFeatureSelectorT LINGUISTIC_REARRANGEMENT_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    public static final AatLayoutFeatureSelectorT MONOSPACED_NUMBERS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_NUMBERS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    public static final AatLayoutFeatureSelectorT THIRD_WIDTH_NUMBERS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    public static final AatLayoutFeatureSelectorT QUARTER_WIDTH_NUMBERS = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT WORD_INITIAL_SWASHES_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT WORD_INITIAL_SWASHES_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT WORD_FINAL_SWASHES_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT WORD_FINAL_SWASHES_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT LINE_INITIAL_SWASHES_ON = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT LINE_INITIAL_SWASHES_OFF = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT LINE_FINAL_SWASHES_ON = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT LINE_FINAL_SWASHES_OFF = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT NON_FINAL_SWASHES_ON = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    public static final AatLayoutFeatureSelectorT NON_FINAL_SWASHES_OFF = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DIACRITICS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT SHOW_DIACRITICS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DIACRITICS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT HIDE_DIACRITICS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DIACRITICS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DECOMPOSE_DIACRITICS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    public static final AatLayoutFeatureSelectorT NORMAL_POSITION = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    public static final AatLayoutFeatureSelectorT SUPERIORS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    public static final AatLayoutFeatureSelectorT INFERIORS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    public static final AatLayoutFeatureSelectorT ORDINALS = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    public static final AatLayoutFeatureSelectorT SCIENTIFIC_INFERIORS = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_FRACTIONS}
     */
    public static final AatLayoutFeatureSelectorT NO_FRACTIONS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_FRACTIONS}
     */
    public static final AatLayoutFeatureSelectorT VERTICAL_FRACTIONS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_FRACTIONS}
     */
    public static final AatLayoutFeatureSelectorT DIAGONAL_FRACTIONS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_OVERLAPPING_CHARACTERS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PREVENT_OVERLAP_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_OVERLAPPING_CHARACTERS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PREVENT_OVERLAP_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT HYPHENS_TO_EM_DASH_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT HYPHENS_TO_EM_DASH_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_EN_DASH_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_EN_DASH_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT SLASHED_ZERO_ON = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT SLASHED_ZERO_OFF = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT FORM_INTERROBANG_ON = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT FORM_INTERROBANG_OFF = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT SMART_QUOTES_ON = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT SMART_QUOTES_OFF = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT PERIODS_TO_ELLIPSIS_ON = new AatLayoutFeatureSelectorT(10);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT PERIODS_TO_ELLIPSIS_OFF = new AatLayoutFeatureSelectorT(11);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_MINUS_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_MINUS_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT ASTERISK_TO_MULTIPLY_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT ASTERISK_TO_MULTIPLY_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT SLASH_TO_DIVIDE_ON = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT SLASH_TO_DIVIDE_OFF = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT INEQUALITY_LIGATURES_ON = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT INEQUALITY_LIGATURES_OFF = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT EXPONENTS_ON = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT EXPONENTS_OFF = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT MATHEMATICAL_GREEK_ON = new AatLayoutFeatureSelectorT(10);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    public static final AatLayoutFeatureSelectorT MATHEMATICAL_GREEK_OFF = new AatLayoutFeatureSelectorT(11);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT NO_ORNAMENTS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DINGBATS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PI_CHARACTERS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT FLEURONS = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DECORATIVE_BORDERS = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT INTERNATIONAL_SYMBOLS = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    public static final AatLayoutFeatureSelectorT MATH_SYMBOLS = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT NO_ALTERNATES = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL1 = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL2 = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL3 = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL4 = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL5 = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    public static final AatLayoutFeatureSelectorT NO_STYLE_OPTIONS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    public static final AatLayoutFeatureSelectorT DISPLAY_TEXT = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    public static final AatLayoutFeatureSelectorT ENGRAVED_TEXT = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    public static final AatLayoutFeatureSelectorT ILLUMINATED_CAPS = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    public static final AatLayoutFeatureSelectorT TITLING_CAPS = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    public static final AatLayoutFeatureSelectorT TALL_CAPS = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT TRADITIONAL_CHARACTERS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT SIMPLIFIED_CHARACTERS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT JIS1978_CHARACTERS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT JIS1983_CHARACTERS = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT JIS1990_CHARACTERS = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_ONE = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_TWO = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_THREE = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_FOUR = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_FIVE = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT EXPERT_CHARACTERS = new AatLayoutFeatureSelectorT(10);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT JIS2004_CHARACTERS = new AatLayoutFeatureSelectorT(11);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT HOJO_CHARACTERS = new AatLayoutFeatureSelectorT(12);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT NLCCHARACTERS = new AatLayoutFeatureSelectorT(13);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    public static final AatLayoutFeatureSelectorT TRADITIONAL_NAMES_CHARACTERS = new AatLayoutFeatureSelectorT(14);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_CASE}
     */
    public static final AatLayoutFeatureSelectorT LOWER_CASE_NUMBERS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_CASE}
     */
    public static final AatLayoutFeatureSelectorT UPPER_CASE_NUMBERS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_TEXT = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    public static final AatLayoutFeatureSelectorT MONOSPACED_TEXT = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    public static final AatLayoutFeatureSelectorT HALF_WIDTH_TEXT = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    public static final AatLayoutFeatureSelectorT THIRD_WIDTH_TEXT = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    public static final AatLayoutFeatureSelectorT QUARTER_WIDTH_TEXT = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    public static final AatLayoutFeatureSelectorT ALT_PROPORTIONAL_TEXT = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    public static final AatLayoutFeatureSelectorT ALT_HALF_WIDTH_TEXT = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT NO_TRANSLITERATION = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT HIRAGANA_TO_KATAKANA = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT KATAKANA_TO_HIRAGANA = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT KANA_TO_ROMANIZATION = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT ROMANIZATION_TO_HIRAGANA = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT ROMANIZATION_TO_KATAKANA = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL_ALT_ONE = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL_ALT_TWO = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL_ALT_THREE = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT NO_ANNOTATION = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT BOX_ANNOTATION = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT ROUNDED_BOX_ANNOTATION = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CIRCLE_ANNOTATION = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT INVERTED_CIRCLE_ANNOTATION = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PARENTHESIS_ANNOTATION = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PERIOD_ANNOTATION = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT ROMAN_NUMERAL_ANNOTATION = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DIAMOND_ANNOTATION = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT INVERTED_BOX_ANNOTATION = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT INVERTED_ROUNDED_BOX_ANNOTATION = new AatLayoutFeatureSelectorT(10);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_KANA_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT FULL_WIDTH_KANA = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_KANA_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_KANA = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT FULL_WIDTH_IDEOGRAPHS = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_IDEOGRAPHS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT HALF_WIDTH_IDEOGRAPHS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CANONICAL_COMPOSITION_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CANONICAL_COMPOSITION_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT COMPATIBILITY_COMPOSITION_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT COMPATIBILITY_COMPOSITION_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT TRANSCODING_COMPOSITION_ON = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    public static final AatLayoutFeatureSelectorT TRANSCODING_COMPOSITION_OFF = new AatLayoutFeatureSelectorT(5);
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_RUBY_KANA_OFF} instead
     */
    public static final AatLayoutFeatureSelectorT NO_RUBY_KANA = new AatLayoutFeatureSelectorT(0);
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_RUBY_KANA_ON} instead
     */
    public static final AatLayoutFeatureSelectorT RUBY_KANA = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_RUBY_KANA}
     */
    public static final AatLayoutFeatureSelectorT RUBY_KANA_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_RUBY_KANA}
     */
    public static final AatLayoutFeatureSelectorT RUBY_KANA_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT NO_CJK_SYMBOL_ALTERNATIVES = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_ONE = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_TWO = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_THREE = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_FOUR = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_FIVE = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT NO_IDEOGRAPHIC_ALTERNATIVES = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_ONE = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_TWO = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_THREE = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_FOUR = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_FIVE = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_VERTICAL_ROMAN_PLACEMENT_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CJK_VERTICAL_ROMAN_CENTERED = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_VERTICAL_ROMAN_PLACEMENT_TYPE}
     */
    public static final AatLayoutFeatureSelectorT CJK_VERTICAL_ROMAN_HBASELINE = new AatLayoutFeatureSelectorT(1);
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_CJK_ITALIC_ROMAN_OFF} instead
     */
    public static final AatLayoutFeatureSelectorT NO_CJK_ITALIC_ROMAN = new AatLayoutFeatureSelectorT(0);
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_CJK_ITALIC_ROMAN_ON} instead
     */
    public static final AatLayoutFeatureSelectorT CJK_ITALIC_ROMAN = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ITALIC_CJK_ROMAN}
     */
    public static final AatLayoutFeatureSelectorT CJK_ITALIC_ROMAN_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ITALIC_CJK_ROMAN}
     */
    public static final AatLayoutFeatureSelectorT CJK_ITALIC_ROMAN_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_LAYOUT_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_LAYOUT_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_SPACING_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_SPACING_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    public static final AatLayoutFeatureSelectorT ALTERNATE_HORIZ_KANA_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    public static final AatLayoutFeatureSelectorT ALTERNATE_HORIZ_KANA_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    public static final AatLayoutFeatureSelectorT ALTERNATE_VERT_KANA_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    public static final AatLayoutFeatureSelectorT ALTERNATE_VERT_KANA_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT NO_STYLISTIC_ALTERNATES = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_ONE_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_ONE_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWO_ON = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWO_OFF = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_THREE_ON = new AatLayoutFeatureSelectorT(6);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_THREE_OFF = new AatLayoutFeatureSelectorT(7);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FOUR_ON = new AatLayoutFeatureSelectorT(8);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FOUR_OFF = new AatLayoutFeatureSelectorT(9);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FIVE_ON = new AatLayoutFeatureSelectorT(10);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FIVE_OFF = new AatLayoutFeatureSelectorT(11);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SIX_ON = new AatLayoutFeatureSelectorT(12);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SIX_OFF = new AatLayoutFeatureSelectorT(13);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SEVEN_ON = new AatLayoutFeatureSelectorT(14);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SEVEN_OFF = new AatLayoutFeatureSelectorT(15);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_EIGHT_ON = new AatLayoutFeatureSelectorT(16);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_EIGHT_OFF = new AatLayoutFeatureSelectorT(17);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_NINE_ON = new AatLayoutFeatureSelectorT(18);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_NINE_OFF = new AatLayoutFeatureSelectorT(19);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TEN_ON = new AatLayoutFeatureSelectorT(20);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TEN_OFF = new AatLayoutFeatureSelectorT(21);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_ELEVEN_ON = new AatLayoutFeatureSelectorT(22);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_ELEVEN_OFF = new AatLayoutFeatureSelectorT(23);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWELVE_ON = new AatLayoutFeatureSelectorT(24);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWELVE_OFF = new AatLayoutFeatureSelectorT(25);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_THIRTEEN_ON = new AatLayoutFeatureSelectorT(26);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_THIRTEEN_OFF = new AatLayoutFeatureSelectorT(27);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FOURTEEN_ON = new AatLayoutFeatureSelectorT(28);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FOURTEEN_OFF = new AatLayoutFeatureSelectorT(29);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FIFTEEN_ON = new AatLayoutFeatureSelectorT(30);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FIFTEEN_OFF = new AatLayoutFeatureSelectorT(31);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SIXTEEN_ON = new AatLayoutFeatureSelectorT(32);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SIXTEEN_OFF = new AatLayoutFeatureSelectorT(33);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SEVENTEEN_ON = new AatLayoutFeatureSelectorT(34);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SEVENTEEN_OFF = new AatLayoutFeatureSelectorT(35);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_EIGHTEEN_ON = new AatLayoutFeatureSelectorT(36);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_EIGHTEEN_OFF = new AatLayoutFeatureSelectorT(37);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_NINETEEN_ON = new AatLayoutFeatureSelectorT(38);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_NINETEEN_OFF = new AatLayoutFeatureSelectorT(39);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWENTY_ON = new AatLayoutFeatureSelectorT(40);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWENTY_OFF = new AatLayoutFeatureSelectorT(41);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_ALTERNATES_ON = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_ALTERNATES_OFF = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT SWASH_ALTERNATES_ON = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT SWASH_ALTERNATES_OFF = new AatLayoutFeatureSelectorT(3);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_SWASH_ALTERNATES_ON = new AatLayoutFeatureSelectorT(4);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_SWASH_ALTERNATES_OFF = new AatLayoutFeatureSelectorT(5);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LOWER_CASE}
     */
    public static final AatLayoutFeatureSelectorT DEFAULT_LOWER_CASE = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LOWER_CASE}
     */
    public static final AatLayoutFeatureSelectorT LOWER_CASE_SMALL_CAPS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LOWER_CASE}
     */
    public static final AatLayoutFeatureSelectorT LOWER_CASE_PETITE_CAPS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UPPER_CASE}
     */
    public static final AatLayoutFeatureSelectorT DEFAULT_UPPER_CASE = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UPPER_CASE}
     */
    public static final AatLayoutFeatureSelectorT UPPER_CASE_SMALL_CAPS = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UPPER_CASE}
     */
    public static final AatLayoutFeatureSelectorT UPPER_CASE_PETITE_CAPS = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT HALF_WIDTH_CJK_ROMAN = new AatLayoutFeatureSelectorT(0);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_CJK_ROMAN = new AatLayoutFeatureSelectorT(1);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT DEFAULT_CJK_ROMAN = new AatLayoutFeatureSelectorT(2);
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    public static final AatLayoutFeatureSelectorT FULL_WIDTH_CJK_ROMAN = new AatLayoutFeatureSelectorT(3);
    
    public AatLayoutFeatureSelectorT(int value) {
        super(value);
    }
    
}
