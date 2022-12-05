package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The selectors defined for specifying AAT feature settings.
 * @version 2.2.0
 */
public enum AatLayoutFeatureSelectorT implements io.github.jwharm.javagi.Enumeration {
    /**
     * Initial, unset feature selector
     */
    INVALID(65535),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALL_TYPOGRAPHIC}
     */
    ALL_TYPE_FEATURES_ON(0),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALL_TYPOGRAPHIC}
     */
    ALL_TYPE_FEATURES_OFF(1),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    COMMON_LIGATURES_ON(2),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    COMMON_LIGATURES_OFF(3),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    RARE_LIGATURES_ON(4),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    RARE_LIGATURES_OFF(5),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    LOGOS_ON(6),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    LOGOS_OFF(7),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    REBUS_PICTURES_ON(8),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    REBUS_PICTURES_OFF(9),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    DIPHTHONG_LIGATURES_ON(10),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    DIPHTHONG_LIGATURES_OFF(11),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SQUARED_LIGATURES_ON(12),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SQUARED_LIGATURES_OFF(13),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    ABBREV_SQUARED_LIGATURES_ON(14),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    ABBREV_SQUARED_LIGATURES_OFF(15),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SYMBOL_LIGATURES_ON(16),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SYMBOL_LIGATURES_OFF(17),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    CONTEXTUAL_LIGATURES_ON(18),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    CONTEXTUAL_LIGATURES_OFF(19),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    HISTORICAL_LIGATURES_ON(20),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    HISTORICAL_LIGATURES_OFF(21),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_ELEVEN_ON(22),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_ELEVEN_OFF(23),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWELVE_ON(24),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWELVE_OFF(25),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_THIRTEEN_ON(26),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_THIRTEEN_OFF(27),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FOURTEEN_ON(28),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FOURTEEN_OFF(29),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FIFTEEN_ON(30),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FIFTEEN_OFF(31),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SIXTEEN_ON(32),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SIXTEEN_OFF(33),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SEVENTEEN_ON(34),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SEVENTEEN_OFF(35),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_EIGHTEEN_ON(36),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_EIGHTEEN_OFF(37),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_NINETEEN_ON(38),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_NINETEEN_OFF(39),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWENTY_ON(40),
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWENTY_OFF(41);
    public static final AatLayoutFeatureSelectorT REQUIRED_LIGATURES_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT REQUIRED_LIGATURES_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT UNCONNECTED = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT PARTIALLY_CONNECTED = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT CURSIVE = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT UPPER_AND_LOWER_CASE = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT ALL_CAPS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT ALL_LOWER_CASE = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT SMALL_CAPS = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT INITIAL_CAPS = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT INITIAL_CAPS_AND_SMALL_CAPS = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT SUBSTITUTE_VERTICAL_FORMS_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT SUBSTITUTE_VERTICAL_FORMS_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT LINGUISTIC_REARRANGEMENT_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT LINGUISTIC_REARRANGEMENT_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT MONOSPACED_NUMBERS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_NUMBERS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT THIRD_WIDTH_NUMBERS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT QUARTER_WIDTH_NUMBERS = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT WORD_INITIAL_SWASHES_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT WORD_INITIAL_SWASHES_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT WORD_FINAL_SWASHES_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT WORD_FINAL_SWASHES_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT LINE_INITIAL_SWASHES_ON = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT LINE_INITIAL_SWASHES_OFF = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT LINE_FINAL_SWASHES_ON = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT LINE_FINAL_SWASHES_OFF = LOGOS_OFF;
    public static final AatLayoutFeatureSelectorT NON_FINAL_SWASHES_ON = REBUS_PICTURES_ON;
    public static final AatLayoutFeatureSelectorT NON_FINAL_SWASHES_OFF = REBUS_PICTURES_OFF;
    public static final AatLayoutFeatureSelectorT SHOW_DIACRITICS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT HIDE_DIACRITICS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT DECOMPOSE_DIACRITICS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT NORMAL_POSITION = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT SUPERIORS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT INFERIORS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT ORDINALS = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT SCIENTIFIC_INFERIORS = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT NO_FRACTIONS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT VERTICAL_FRACTIONS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT DIAGONAL_FRACTIONS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT PREVENT_OVERLAP_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT PREVENT_OVERLAP_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT HYPHENS_TO_EM_DASH_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT HYPHENS_TO_EM_DASH_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_EN_DASH_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_EN_DASH_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT SLASHED_ZERO_ON = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT SLASHED_ZERO_OFF = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT FORM_INTERROBANG_ON = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT FORM_INTERROBANG_OFF = LOGOS_OFF;
    public static final AatLayoutFeatureSelectorT SMART_QUOTES_ON = REBUS_PICTURES_ON;
    public static final AatLayoutFeatureSelectorT SMART_QUOTES_OFF = REBUS_PICTURES_OFF;
    public static final AatLayoutFeatureSelectorT PERIODS_TO_ELLIPSIS_ON = DIPHTHONG_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT PERIODS_TO_ELLIPSIS_OFF = DIPHTHONG_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_MINUS_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT HYPHEN_TO_MINUS_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT ASTERISK_TO_MULTIPLY_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT ASTERISK_TO_MULTIPLY_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT SLASH_TO_DIVIDE_ON = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT SLASH_TO_DIVIDE_OFF = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT INEQUALITY_LIGATURES_ON = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT INEQUALITY_LIGATURES_OFF = LOGOS_OFF;
    public static final AatLayoutFeatureSelectorT EXPONENTS_ON = REBUS_PICTURES_ON;
    public static final AatLayoutFeatureSelectorT EXPONENTS_OFF = REBUS_PICTURES_OFF;
    public static final AatLayoutFeatureSelectorT MATHEMATICAL_GREEK_ON = DIPHTHONG_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT MATHEMATICAL_GREEK_OFF = DIPHTHONG_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT NO_ORNAMENTS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT DINGBATS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT PI_CHARACTERS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT FLEURONS = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT DECORATIVE_BORDERS = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT INTERNATIONAL_SYMBOLS = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT MATH_SYMBOLS = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT NO_ALTERNATES = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL1 = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL2 = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL3 = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL4 = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT DESIGN_LEVEL5 = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT NO_STYLE_OPTIONS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT DISPLAY_TEXT = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT ENGRAVED_TEXT = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT ILLUMINATED_CAPS = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT TITLING_CAPS = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT TALL_CAPS = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT TRADITIONAL_CHARACTERS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT SIMPLIFIED_CHARACTERS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT JIS1978_CHARACTERS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT JIS1983_CHARACTERS = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT JIS1990_CHARACTERS = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_ONE = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_TWO = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_THREE = LOGOS_OFF;
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_FOUR = REBUS_PICTURES_ON;
    public static final AatLayoutFeatureSelectorT TRADITIONAL_ALT_FIVE = REBUS_PICTURES_OFF;
    public static final AatLayoutFeatureSelectorT EXPERT_CHARACTERS = DIPHTHONG_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT JIS2004_CHARACTERS = DIPHTHONG_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT HOJO_CHARACTERS = SQUARED_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT NLCCHARACTERS = SQUARED_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT TRADITIONAL_NAMES_CHARACTERS = ABBREV_SQUARED_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT LOWER_CASE_NUMBERS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT UPPER_CASE_NUMBERS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_TEXT = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT MONOSPACED_TEXT = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT HALF_WIDTH_TEXT = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT THIRD_WIDTH_TEXT = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT QUARTER_WIDTH_TEXT = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT ALT_PROPORTIONAL_TEXT = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT ALT_HALF_WIDTH_TEXT = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT NO_TRANSLITERATION = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT HIRAGANA_TO_KATAKANA = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT KATAKANA_TO_HIRAGANA = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT KANA_TO_ROMANIZATION = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT ROMANIZATION_TO_HIRAGANA = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT ROMANIZATION_TO_KATAKANA = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL_ALT_ONE = LOGOS_OFF;
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL_ALT_TWO = REBUS_PICTURES_ON;
    public static final AatLayoutFeatureSelectorT HANJA_TO_HANGUL_ALT_THREE = REBUS_PICTURES_OFF;
    public static final AatLayoutFeatureSelectorT NO_ANNOTATION = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT BOX_ANNOTATION = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT ROUNDED_BOX_ANNOTATION = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT CIRCLE_ANNOTATION = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT INVERTED_CIRCLE_ANNOTATION = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT PARENTHESIS_ANNOTATION = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT PERIOD_ANNOTATION = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT ROMAN_NUMERAL_ANNOTATION = LOGOS_OFF;
    public static final AatLayoutFeatureSelectorT DIAMOND_ANNOTATION = REBUS_PICTURES_ON;
    public static final AatLayoutFeatureSelectorT INVERTED_BOX_ANNOTATION = REBUS_PICTURES_OFF;
    public static final AatLayoutFeatureSelectorT INVERTED_ROUNDED_BOX_ANNOTATION = DIPHTHONG_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT FULL_WIDTH_KANA = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_KANA = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT FULL_WIDTH_IDEOGRAPHS = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_IDEOGRAPHS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT HALF_WIDTH_IDEOGRAPHS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT CANONICAL_COMPOSITION_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT CANONICAL_COMPOSITION_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT COMPATIBILITY_COMPOSITION_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT COMPATIBILITY_COMPOSITION_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT TRANSCODING_COMPOSITION_ON = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT TRANSCODING_COMPOSITION_OFF = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT NO_RUBY_KANA = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT RUBY_KANA = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT RUBY_KANA_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT RUBY_KANA_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT NO_CJK_SYMBOL_ALTERNATIVES = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_ONE = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_TWO = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_THREE = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_FOUR = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT CJK_SYMBOL_ALT_FIVE = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT NO_IDEOGRAPHIC_ALTERNATIVES = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_ONE = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_TWO = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_THREE = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_FOUR = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT IDEOGRAPHIC_ALT_FIVE = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT CJK_VERTICAL_ROMAN_CENTERED = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT CJK_VERTICAL_ROMAN_HBASELINE = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT NO_CJK_ITALIC_ROMAN = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT CJK_ITALIC_ROMAN = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT CJK_ITALIC_ROMAN_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT CJK_ITALIC_ROMAN_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_LAYOUT_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_LAYOUT_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_SPACING_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT CASE_SENSITIVE_SPACING_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT ALTERNATE_HORIZ_KANA_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT ALTERNATE_HORIZ_KANA_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT ALTERNATE_VERT_KANA_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT ALTERNATE_VERT_KANA_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT NO_STYLISTIC_ALTERNATES = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_ONE_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_ONE_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWO_ON = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TWO_OFF = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_THREE_ON = LOGOS_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_THREE_OFF = LOGOS_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FOUR_ON = REBUS_PICTURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FOUR_OFF = REBUS_PICTURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FIVE_ON = DIPHTHONG_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_FIVE_OFF = DIPHTHONG_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SIX_ON = SQUARED_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SIX_OFF = SQUARED_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SEVEN_ON = ABBREV_SQUARED_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_SEVEN_OFF = ABBREV_SQUARED_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_EIGHT_ON = SYMBOL_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_EIGHT_OFF = SYMBOL_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_NINE_ON = CONTEXTUAL_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_NINE_OFF = CONTEXTUAL_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TEN_ON = HISTORICAL_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT STYLISTIC_ALT_TEN_OFF = HISTORICAL_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_ALTERNATES_ON = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_ALTERNATES_OFF = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT SWASH_ALTERNATES_ON = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT SWASH_ALTERNATES_OFF = COMMON_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_SWASH_ALTERNATES_ON = RARE_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT CONTEXTUAL_SWASH_ALTERNATES_OFF = RARE_LIGATURES_OFF;
    public static final AatLayoutFeatureSelectorT DEFAULT_LOWER_CASE = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT LOWER_CASE_SMALL_CAPS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT LOWER_CASE_PETITE_CAPS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT DEFAULT_UPPER_CASE = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT UPPER_CASE_SMALL_CAPS = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT UPPER_CASE_PETITE_CAPS = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT HALF_WIDTH_CJK_ROMAN = ALL_TYPE_FEATURES_ON;
    public static final AatLayoutFeatureSelectorT PROPORTIONAL_CJK_ROMAN = ALL_TYPE_FEATURES_OFF;
    public static final AatLayoutFeatureSelectorT DEFAULT_CJK_ROMAN = COMMON_LIGATURES_ON;
    public static final AatLayoutFeatureSelectorT FULL_WIDTH_CJK_ROMAN = COMMON_LIGATURES_OFF;
    
    private static final java.lang.String C_TYPE_NAME = "hb_aat_layout_feature_selector_t";
    
    private final int value;
    AatLayoutFeatureSelectorT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AatLayoutFeatureSelectorT of(int value) {
        return switch (value) {
            case 65535 -> INVALID;
            case 0 -> ALL_TYPE_FEATURES_ON;
            case 1 -> ALL_TYPE_FEATURES_OFF;
            case 2 -> COMMON_LIGATURES_ON;
            case 3 -> COMMON_LIGATURES_OFF;
            case 4 -> RARE_LIGATURES_ON;
            case 5 -> RARE_LIGATURES_OFF;
            case 6 -> LOGOS_ON;
            case 7 -> LOGOS_OFF;
            case 8 -> REBUS_PICTURES_ON;
            case 9 -> REBUS_PICTURES_OFF;
            case 10 -> DIPHTHONG_LIGATURES_ON;
            case 11 -> DIPHTHONG_LIGATURES_OFF;
            case 12 -> SQUARED_LIGATURES_ON;
            case 13 -> SQUARED_LIGATURES_OFF;
            case 14 -> ABBREV_SQUARED_LIGATURES_ON;
            case 15 -> ABBREV_SQUARED_LIGATURES_OFF;
            case 16 -> SYMBOL_LIGATURES_ON;
            case 17 -> SYMBOL_LIGATURES_OFF;
            case 18 -> CONTEXTUAL_LIGATURES_ON;
            case 19 -> CONTEXTUAL_LIGATURES_OFF;
            case 20 -> HISTORICAL_LIGATURES_ON;
            case 21 -> HISTORICAL_LIGATURES_OFF;
            case 22 -> STYLISTIC_ALT_ELEVEN_ON;
            case 23 -> STYLISTIC_ALT_ELEVEN_OFF;
            case 24 -> STYLISTIC_ALT_TWELVE_ON;
            case 25 -> STYLISTIC_ALT_TWELVE_OFF;
            case 26 -> STYLISTIC_ALT_THIRTEEN_ON;
            case 27 -> STYLISTIC_ALT_THIRTEEN_OFF;
            case 28 -> STYLISTIC_ALT_FOURTEEN_ON;
            case 29 -> STYLISTIC_ALT_FOURTEEN_OFF;
            case 30 -> STYLISTIC_ALT_FIFTEEN_ON;
            case 31 -> STYLISTIC_ALT_FIFTEEN_OFF;
            case 32 -> STYLISTIC_ALT_SIXTEEN_ON;
            case 33 -> STYLISTIC_ALT_SIXTEEN_OFF;
            case 34 -> STYLISTIC_ALT_SEVENTEEN_ON;
            case 35 -> STYLISTIC_ALT_SEVENTEEN_OFF;
            case 36 -> STYLISTIC_ALT_EIGHTEEN_ON;
            case 37 -> STYLISTIC_ALT_EIGHTEEN_OFF;
            case 38 -> STYLISTIC_ALT_NINETEEN_ON;
            case 39 -> STYLISTIC_ALT_NINETEEN_OFF;
            case 40 -> STYLISTIC_ALT_TWENTY_ON;
            case 41 -> STYLISTIC_ALT_TWENTY_OFF;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
