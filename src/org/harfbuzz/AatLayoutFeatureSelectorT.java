package org.harfbuzz;

/**
 * The selectors defined for specifying AAT feature settings.
 */
public enum AatLayoutFeatureSelectorT {

    /**
     * Initial, unset feature selector
     */
    INVALID,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALL_TYPOGRAPHIC}
     */
    ALL_TYPE_FEATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALL_TYPOGRAPHIC}
     */
    ALL_TYPE_FEATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    REQUIRED_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    REQUIRED_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    COMMON_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    COMMON_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    RARE_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    RARE_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    LOGOS_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    LOGOS_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    REBUS_PICTURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    REBUS_PICTURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    DIPHTHONG_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    DIPHTHONG_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SQUARED_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SQUARED_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    ABBREV_SQUARED_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    ABBREV_SQUARED_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SYMBOL_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    SYMBOL_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    CONTEXTUAL_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    CONTEXTUAL_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    HISTORICAL_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    HISTORICAL_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    UNCONNECTED,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    PARTIALLY_CONNECTED,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LIGATURES}
     */
    CURSIVE,
    
    /**
     * Deprecated
     */
    UPPER_AND_LOWER_CASE,
    
    /**
     * Deprecated
     */
    ALL_CAPS,
    
    /**
     * Deprecated
     */
    ALL_LOWER_CASE,
    
    /**
     * Deprecated
     */
    SMALL_CAPS,
    
    /**
     * Deprecated
     */
    INITIAL_CAPS,
    
    /**
     * Deprecated
     */
    INITIAL_CAPS_AND_SMALL_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_SUBSTITUTION}
     */
    SUBSTITUTE_VERTICAL_FORMS_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_SUBSTITUTION}
     */
    SUBSTITUTE_VERTICAL_FORMS_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LINGUISTIC_REARRANGEMENT}
     */
    LINGUISTIC_REARRANGEMENT_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LINGUISTIC_REARRANGEMENT}
     */
    LINGUISTIC_REARRANGEMENT_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    MONOSPACED_NUMBERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    PROPORTIONAL_NUMBERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    THIRD_WIDTH_NUMBERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_SPACING}
     */
    QUARTER_WIDTH_NUMBERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    WORD_INITIAL_SWASHES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    WORD_INITIAL_SWASHES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    WORD_FINAL_SWASHES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    WORD_FINAL_SWASHES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    LINE_INITIAL_SWASHES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    LINE_INITIAL_SWASHES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    LINE_FINAL_SWASHES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    LINE_FINAL_SWASHES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    NON_FINAL_SWASHES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_SMART_SWASH_TYPE}
     */
    NON_FINAL_SWASHES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DIACRITICS_TYPE}
     */
    SHOW_DIACRITICS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DIACRITICS_TYPE}
     */
    HIDE_DIACRITICS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DIACRITICS_TYPE}
     */
    DECOMPOSE_DIACRITICS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    NORMAL_POSITION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    SUPERIORS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    INFERIORS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    ORDINALS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_VERTICAL_POSITION}
     */
    SCIENTIFIC_INFERIORS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_FRACTIONS}
     */
    NO_FRACTIONS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_FRACTIONS}
     */
    VERTICAL_FRACTIONS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_FRACTIONS}
     */
    DIAGONAL_FRACTIONS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_OVERLAPPING_CHARACTERS_TYPE}
     */
    PREVENT_OVERLAP_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_OVERLAPPING_CHARACTERS_TYPE}
     */
    PREVENT_OVERLAP_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    HYPHENS_TO_EM_DASH_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    HYPHENS_TO_EM_DASH_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    HYPHEN_TO_EN_DASH_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    HYPHEN_TO_EN_DASH_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    SLASHED_ZERO_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    SLASHED_ZERO_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    FORM_INTERROBANG_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    FORM_INTERROBANG_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    SMART_QUOTES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    SMART_QUOTES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    PERIODS_TO_ELLIPSIS_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TYPOGRAPHIC_EXTRAS}
     */
    PERIODS_TO_ELLIPSIS_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    HYPHEN_TO_MINUS_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    HYPHEN_TO_MINUS_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    ASTERISK_TO_MULTIPLY_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    ASTERISK_TO_MULTIPLY_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    SLASH_TO_DIVIDE_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    SLASH_TO_DIVIDE_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    INEQUALITY_LIGATURES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    INEQUALITY_LIGATURES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    EXPONENTS_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    EXPONENTS_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    MATHEMATICAL_GREEK_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_MATHEMATICAL_EXTRAS}
     */
    MATHEMATICAL_GREEK_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    NO_ORNAMENTS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    DINGBATS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    PI_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    FLEURONS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    DECORATIVE_BORDERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    INTERNATIONAL_SYMBOLS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ORNAMENT_SETS_TYPE}
     */
    MATH_SYMBOLS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_ALTERNATIVES}
     */
    NO_ALTERNATES,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    DESIGN_LEVEL1,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    DESIGN_LEVEL2,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    DESIGN_LEVEL3,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    DESIGN_LEVEL4,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_DESIGN_COMPLEXITY_TYPE}
     */
    DESIGN_LEVEL5,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    NO_STYLE_OPTIONS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    DISPLAY_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    ENGRAVED_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    ILLUMINATED_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    TITLING_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLE_OPTIONS}
     */
    TALL_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    TRADITIONAL_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    SIMPLIFIED_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    JIS1978_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    JIS1983_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    JIS1990_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    TRADITIONAL_ALT_ONE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    TRADITIONAL_ALT_TWO,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    TRADITIONAL_ALT_THREE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    TRADITIONAL_ALT_FOUR,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    TRADITIONAL_ALT_FIVE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    EXPERT_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    JIS2004_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    HOJO_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    NLCCHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CHARACTER_SHAPE}
     */
    TRADITIONAL_NAMES_CHARACTERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_CASE}
     */
    LOWER_CASE_NUMBERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_NUMBER_CASE}
     */
    UPPER_CASE_NUMBERS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    PROPORTIONAL_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    MONOSPACED_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    HALF_WIDTH_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    THIRD_WIDTH_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    QUARTER_WIDTH_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    ALT_PROPORTIONAL_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TEXT_SPACING}
     */
    ALT_HALF_WIDTH_TEXT,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    NO_TRANSLITERATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    HANJA_TO_HANGUL,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    HIRAGANA_TO_KATAKANA,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    KATAKANA_TO_HIRAGANA,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    KANA_TO_ROMANIZATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    ROMANIZATION_TO_HIRAGANA,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    ROMANIZATION_TO_KATAKANA,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    HANJA_TO_HANGUL_ALT_ONE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    HANJA_TO_HANGUL_ALT_TWO,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_TRANSLITERATION}
     */
    HANJA_TO_HANGUL_ALT_THREE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    NO_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    BOX_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    ROUNDED_BOX_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    CIRCLE_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    INVERTED_CIRCLE_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    PARENTHESIS_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    PERIOD_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    ROMAN_NUMERAL_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    DIAMOND_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    INVERTED_BOX_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ANNOTATION_TYPE}
     */
    INVERTED_ROUNDED_BOX_ANNOTATION,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_KANA_SPACING_TYPE}
     */
    FULL_WIDTH_KANA,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_KANA_SPACING_TYPE}
     */
    PROPORTIONAL_KANA,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_SPACING_TYPE}
     */
    FULL_WIDTH_IDEOGRAPHS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_SPACING_TYPE}
     */
    PROPORTIONAL_IDEOGRAPHS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_SPACING_TYPE}
     */
    HALF_WIDTH_IDEOGRAPHS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    CANONICAL_COMPOSITION_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    CANONICAL_COMPOSITION_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    COMPATIBILITY_COMPOSITION_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    COMPATIBILITY_COMPOSITION_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    TRANSCODING_COMPOSITION_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UNICODE_DECOMPOSITION_TYPE}
     */
    TRANSCODING_COMPOSITION_OFF,
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_RUBY_KANA_OFF} instead
     */
    NO_RUBY_KANA,
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_RUBY_KANA_ON} instead
     */
    RUBY_KANA,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_RUBY_KANA}
     */
    RUBY_KANA_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_RUBY_KANA}
     */
    RUBY_KANA_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    NO_CJK_SYMBOL_ALTERNATIVES,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    CJK_SYMBOL_ALT_ONE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    CJK_SYMBOL_ALT_TWO,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    CJK_SYMBOL_ALT_THREE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    CJK_SYMBOL_ALT_FOUR,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_SYMBOL_ALTERNATIVES_TYPE}
     */
    CJK_SYMBOL_ALT_FIVE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    NO_IDEOGRAPHIC_ALTERNATIVES,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    IDEOGRAPHIC_ALT_ONE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    IDEOGRAPHIC_ALT_TWO,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    IDEOGRAPHIC_ALT_THREE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    IDEOGRAPHIC_ALT_FOUR,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_IDEOGRAPHIC_ALTERNATIVES_TYPE}
     */
    IDEOGRAPHIC_ALT_FIVE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_VERTICAL_ROMAN_PLACEMENT_TYPE}
     */
    CJK_VERTICAL_ROMAN_CENTERED,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_VERTICAL_ROMAN_PLACEMENT_TYPE}
     */
    CJK_VERTICAL_ROMAN_HBASELINE,
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_CJK_ITALIC_ROMAN_OFF} instead
     */
    NO_CJK_ITALIC_ROMAN,
    
    /**
     * Deprecated; use {@code HB_AAT_LAYOUT_FEATURE_SELECTOR_CJK_ITALIC_ROMAN_ON} instead
     */
    CJK_ITALIC_ROMAN,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ITALIC_CJK_ROMAN}
     */
    CJK_ITALIC_ROMAN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ITALIC_CJK_ROMAN}
     */
    CJK_ITALIC_ROMAN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    CASE_SENSITIVE_LAYOUT_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    CASE_SENSITIVE_LAYOUT_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    CASE_SENSITIVE_SPACING_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CASE_SENSITIVE_LAYOUT}
     */
    CASE_SENSITIVE_SPACING_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    ALTERNATE_HORIZ_KANA_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    ALTERNATE_HORIZ_KANA_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    ALTERNATE_VERT_KANA_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_ALTERNATE_KANA}
     */
    ALTERNATE_VERT_KANA_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    NO_STYLISTIC_ALTERNATES,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_ONE_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_ONE_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWO_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWO_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_THREE_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_THREE_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FOUR_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FOUR_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FIVE_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FIVE_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SIX_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SIX_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SEVEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SEVEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_EIGHT_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_EIGHT_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_NINE_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_NINE_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_ELEVEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_ELEVEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWELVE_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWELVE_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_THIRTEEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_THIRTEEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FOURTEEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FOURTEEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FIFTEEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_FIFTEEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SIXTEEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SIXTEEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SEVENTEEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_SEVENTEEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_EIGHTEEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_EIGHTEEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_NINETEEN_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_NINETEEN_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWENTY_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_STYLISTIC_ALTERNATIVES}
     */
    STYLISTIC_ALT_TWENTY_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    CONTEXTUAL_ALTERNATES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    CONTEXTUAL_ALTERNATES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    SWASH_ALTERNATES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    SWASH_ALTERNATES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    CONTEXTUAL_SWASH_ALTERNATES_ON,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CONTEXTUAL_ALTERNATIVES}
     */
    CONTEXTUAL_SWASH_ALTERNATES_OFF,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LOWER_CASE}
     */
    DEFAULT_LOWER_CASE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LOWER_CASE}
     */
    LOWER_CASE_SMALL_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_LOWER_CASE}
     */
    LOWER_CASE_PETITE_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UPPER_CASE}
     */
    DEFAULT_UPPER_CASE,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UPPER_CASE}
     */
    UPPER_CASE_SMALL_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_UPPER_CASE}
     */
    UPPER_CASE_PETITE_CAPS,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    HALF_WIDTH_CJK_ROMAN,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    PROPORTIONAL_CJK_ROMAN,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    DEFAULT_CJK_ROMAN,
    
    /**
     * for {@code HB_AAT_LAYOUT_FEATURE_TYPE_CJK_ROMAN_SPACING_TYPE}
     */
    FULL_WIDTH_CJK_ROMAN;
    
    public static AatLayoutFeatureSelectorT fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 65535;
            case ALL_TYPE_FEATURES_ON -> 0;
            case ALL_TYPE_FEATURES_OFF -> 1;
            case REQUIRED_LIGATURES_ON -> 0;
            case REQUIRED_LIGATURES_OFF -> 1;
            case COMMON_LIGATURES_ON -> 2;
            case COMMON_LIGATURES_OFF -> 3;
            case RARE_LIGATURES_ON -> 4;
            case RARE_LIGATURES_OFF -> 5;
            case LOGOS_ON -> 6;
            case LOGOS_OFF -> 7;
            case REBUS_PICTURES_ON -> 8;
            case REBUS_PICTURES_OFF -> 9;
            case DIPHTHONG_LIGATURES_ON -> 10;
            case DIPHTHONG_LIGATURES_OFF -> 11;
            case SQUARED_LIGATURES_ON -> 12;
            case SQUARED_LIGATURES_OFF -> 13;
            case ABBREV_SQUARED_LIGATURES_ON -> 14;
            case ABBREV_SQUARED_LIGATURES_OFF -> 15;
            case SYMBOL_LIGATURES_ON -> 16;
            case SYMBOL_LIGATURES_OFF -> 17;
            case CONTEXTUAL_LIGATURES_ON -> 18;
            case CONTEXTUAL_LIGATURES_OFF -> 19;
            case HISTORICAL_LIGATURES_ON -> 20;
            case HISTORICAL_LIGATURES_OFF -> 21;
            case UNCONNECTED -> 0;
            case PARTIALLY_CONNECTED -> 1;
            case CURSIVE -> 2;
            case UPPER_AND_LOWER_CASE -> 0;
            case ALL_CAPS -> 1;
            case ALL_LOWER_CASE -> 2;
            case SMALL_CAPS -> 3;
            case INITIAL_CAPS -> 4;
            case INITIAL_CAPS_AND_SMALL_CAPS -> 5;
            case SUBSTITUTE_VERTICAL_FORMS_ON -> 0;
            case SUBSTITUTE_VERTICAL_FORMS_OFF -> 1;
            case LINGUISTIC_REARRANGEMENT_ON -> 0;
            case LINGUISTIC_REARRANGEMENT_OFF -> 1;
            case MONOSPACED_NUMBERS -> 0;
            case PROPORTIONAL_NUMBERS -> 1;
            case THIRD_WIDTH_NUMBERS -> 2;
            case QUARTER_WIDTH_NUMBERS -> 3;
            case WORD_INITIAL_SWASHES_ON -> 0;
            case WORD_INITIAL_SWASHES_OFF -> 1;
            case WORD_FINAL_SWASHES_ON -> 2;
            case WORD_FINAL_SWASHES_OFF -> 3;
            case LINE_INITIAL_SWASHES_ON -> 4;
            case LINE_INITIAL_SWASHES_OFF -> 5;
            case LINE_FINAL_SWASHES_ON -> 6;
            case LINE_FINAL_SWASHES_OFF -> 7;
            case NON_FINAL_SWASHES_ON -> 8;
            case NON_FINAL_SWASHES_OFF -> 9;
            case SHOW_DIACRITICS -> 0;
            case HIDE_DIACRITICS -> 1;
            case DECOMPOSE_DIACRITICS -> 2;
            case NORMAL_POSITION -> 0;
            case SUPERIORS -> 1;
            case INFERIORS -> 2;
            case ORDINALS -> 3;
            case SCIENTIFIC_INFERIORS -> 4;
            case NO_FRACTIONS -> 0;
            case VERTICAL_FRACTIONS -> 1;
            case DIAGONAL_FRACTIONS -> 2;
            case PREVENT_OVERLAP_ON -> 0;
            case PREVENT_OVERLAP_OFF -> 1;
            case HYPHENS_TO_EM_DASH_ON -> 0;
            case HYPHENS_TO_EM_DASH_OFF -> 1;
            case HYPHEN_TO_EN_DASH_ON -> 2;
            case HYPHEN_TO_EN_DASH_OFF -> 3;
            case SLASHED_ZERO_ON -> 4;
            case SLASHED_ZERO_OFF -> 5;
            case FORM_INTERROBANG_ON -> 6;
            case FORM_INTERROBANG_OFF -> 7;
            case SMART_QUOTES_ON -> 8;
            case SMART_QUOTES_OFF -> 9;
            case PERIODS_TO_ELLIPSIS_ON -> 10;
            case PERIODS_TO_ELLIPSIS_OFF -> 11;
            case HYPHEN_TO_MINUS_ON -> 0;
            case HYPHEN_TO_MINUS_OFF -> 1;
            case ASTERISK_TO_MULTIPLY_ON -> 2;
            case ASTERISK_TO_MULTIPLY_OFF -> 3;
            case SLASH_TO_DIVIDE_ON -> 4;
            case SLASH_TO_DIVIDE_OFF -> 5;
            case INEQUALITY_LIGATURES_ON -> 6;
            case INEQUALITY_LIGATURES_OFF -> 7;
            case EXPONENTS_ON -> 8;
            case EXPONENTS_OFF -> 9;
            case MATHEMATICAL_GREEK_ON -> 10;
            case MATHEMATICAL_GREEK_OFF -> 11;
            case NO_ORNAMENTS -> 0;
            case DINGBATS -> 1;
            case PI_CHARACTERS -> 2;
            case FLEURONS -> 3;
            case DECORATIVE_BORDERS -> 4;
            case INTERNATIONAL_SYMBOLS -> 5;
            case MATH_SYMBOLS -> 6;
            case NO_ALTERNATES -> 0;
            case DESIGN_LEVEL1 -> 0;
            case DESIGN_LEVEL2 -> 1;
            case DESIGN_LEVEL3 -> 2;
            case DESIGN_LEVEL4 -> 3;
            case DESIGN_LEVEL5 -> 4;
            case NO_STYLE_OPTIONS -> 0;
            case DISPLAY_TEXT -> 1;
            case ENGRAVED_TEXT -> 2;
            case ILLUMINATED_CAPS -> 3;
            case TITLING_CAPS -> 4;
            case TALL_CAPS -> 5;
            case TRADITIONAL_CHARACTERS -> 0;
            case SIMPLIFIED_CHARACTERS -> 1;
            case JIS1978_CHARACTERS -> 2;
            case JIS1983_CHARACTERS -> 3;
            case JIS1990_CHARACTERS -> 4;
            case TRADITIONAL_ALT_ONE -> 5;
            case TRADITIONAL_ALT_TWO -> 6;
            case TRADITIONAL_ALT_THREE -> 7;
            case TRADITIONAL_ALT_FOUR -> 8;
            case TRADITIONAL_ALT_FIVE -> 9;
            case EXPERT_CHARACTERS -> 10;
            case JIS2004_CHARACTERS -> 11;
            case HOJO_CHARACTERS -> 12;
            case NLCCHARACTERS -> 13;
            case TRADITIONAL_NAMES_CHARACTERS -> 14;
            case LOWER_CASE_NUMBERS -> 0;
            case UPPER_CASE_NUMBERS -> 1;
            case PROPORTIONAL_TEXT -> 0;
            case MONOSPACED_TEXT -> 1;
            case HALF_WIDTH_TEXT -> 2;
            case THIRD_WIDTH_TEXT -> 3;
            case QUARTER_WIDTH_TEXT -> 4;
            case ALT_PROPORTIONAL_TEXT -> 5;
            case ALT_HALF_WIDTH_TEXT -> 6;
            case NO_TRANSLITERATION -> 0;
            case HANJA_TO_HANGUL -> 1;
            case HIRAGANA_TO_KATAKANA -> 2;
            case KATAKANA_TO_HIRAGANA -> 3;
            case KANA_TO_ROMANIZATION -> 4;
            case ROMANIZATION_TO_HIRAGANA -> 5;
            case ROMANIZATION_TO_KATAKANA -> 6;
            case HANJA_TO_HANGUL_ALT_ONE -> 7;
            case HANJA_TO_HANGUL_ALT_TWO -> 8;
            case HANJA_TO_HANGUL_ALT_THREE -> 9;
            case NO_ANNOTATION -> 0;
            case BOX_ANNOTATION -> 1;
            case ROUNDED_BOX_ANNOTATION -> 2;
            case CIRCLE_ANNOTATION -> 3;
            case INVERTED_CIRCLE_ANNOTATION -> 4;
            case PARENTHESIS_ANNOTATION -> 5;
            case PERIOD_ANNOTATION -> 6;
            case ROMAN_NUMERAL_ANNOTATION -> 7;
            case DIAMOND_ANNOTATION -> 8;
            case INVERTED_BOX_ANNOTATION -> 9;
            case INVERTED_ROUNDED_BOX_ANNOTATION -> 10;
            case FULL_WIDTH_KANA -> 0;
            case PROPORTIONAL_KANA -> 1;
            case FULL_WIDTH_IDEOGRAPHS -> 0;
            case PROPORTIONAL_IDEOGRAPHS -> 1;
            case HALF_WIDTH_IDEOGRAPHS -> 2;
            case CANONICAL_COMPOSITION_ON -> 0;
            case CANONICAL_COMPOSITION_OFF -> 1;
            case COMPATIBILITY_COMPOSITION_ON -> 2;
            case COMPATIBILITY_COMPOSITION_OFF -> 3;
            case TRANSCODING_COMPOSITION_ON -> 4;
            case TRANSCODING_COMPOSITION_OFF -> 5;
            case NO_RUBY_KANA -> 0;
            case RUBY_KANA -> 1;
            case RUBY_KANA_ON -> 2;
            case RUBY_KANA_OFF -> 3;
            case NO_CJK_SYMBOL_ALTERNATIVES -> 0;
            case CJK_SYMBOL_ALT_ONE -> 1;
            case CJK_SYMBOL_ALT_TWO -> 2;
            case CJK_SYMBOL_ALT_THREE -> 3;
            case CJK_SYMBOL_ALT_FOUR -> 4;
            case CJK_SYMBOL_ALT_FIVE -> 5;
            case NO_IDEOGRAPHIC_ALTERNATIVES -> 0;
            case IDEOGRAPHIC_ALT_ONE -> 1;
            case IDEOGRAPHIC_ALT_TWO -> 2;
            case IDEOGRAPHIC_ALT_THREE -> 3;
            case IDEOGRAPHIC_ALT_FOUR -> 4;
            case IDEOGRAPHIC_ALT_FIVE -> 5;
            case CJK_VERTICAL_ROMAN_CENTERED -> 0;
            case CJK_VERTICAL_ROMAN_HBASELINE -> 1;
            case NO_CJK_ITALIC_ROMAN -> 0;
            case CJK_ITALIC_ROMAN -> 1;
            case CJK_ITALIC_ROMAN_ON -> 2;
            case CJK_ITALIC_ROMAN_OFF -> 3;
            case CASE_SENSITIVE_LAYOUT_ON -> 0;
            case CASE_SENSITIVE_LAYOUT_OFF -> 1;
            case CASE_SENSITIVE_SPACING_ON -> 2;
            case CASE_SENSITIVE_SPACING_OFF -> 3;
            case ALTERNATE_HORIZ_KANA_ON -> 0;
            case ALTERNATE_HORIZ_KANA_OFF -> 1;
            case ALTERNATE_VERT_KANA_ON -> 2;
            case ALTERNATE_VERT_KANA_OFF -> 3;
            case NO_STYLISTIC_ALTERNATES -> 0;
            case STYLISTIC_ALT_ONE_ON -> 2;
            case STYLISTIC_ALT_ONE_OFF -> 3;
            case STYLISTIC_ALT_TWO_ON -> 4;
            case STYLISTIC_ALT_TWO_OFF -> 5;
            case STYLISTIC_ALT_THREE_ON -> 6;
            case STYLISTIC_ALT_THREE_OFF -> 7;
            case STYLISTIC_ALT_FOUR_ON -> 8;
            case STYLISTIC_ALT_FOUR_OFF -> 9;
            case STYLISTIC_ALT_FIVE_ON -> 10;
            case STYLISTIC_ALT_FIVE_OFF -> 11;
            case STYLISTIC_ALT_SIX_ON -> 12;
            case STYLISTIC_ALT_SIX_OFF -> 13;
            case STYLISTIC_ALT_SEVEN_ON -> 14;
            case STYLISTIC_ALT_SEVEN_OFF -> 15;
            case STYLISTIC_ALT_EIGHT_ON -> 16;
            case STYLISTIC_ALT_EIGHT_OFF -> 17;
            case STYLISTIC_ALT_NINE_ON -> 18;
            case STYLISTIC_ALT_NINE_OFF -> 19;
            case STYLISTIC_ALT_TEN_ON -> 20;
            case STYLISTIC_ALT_TEN_OFF -> 21;
            case STYLISTIC_ALT_ELEVEN_ON -> 22;
            case STYLISTIC_ALT_ELEVEN_OFF -> 23;
            case STYLISTIC_ALT_TWELVE_ON -> 24;
            case STYLISTIC_ALT_TWELVE_OFF -> 25;
            case STYLISTIC_ALT_THIRTEEN_ON -> 26;
            case STYLISTIC_ALT_THIRTEEN_OFF -> 27;
            case STYLISTIC_ALT_FOURTEEN_ON -> 28;
            case STYLISTIC_ALT_FOURTEEN_OFF -> 29;
            case STYLISTIC_ALT_FIFTEEN_ON -> 30;
            case STYLISTIC_ALT_FIFTEEN_OFF -> 31;
            case STYLISTIC_ALT_SIXTEEN_ON -> 32;
            case STYLISTIC_ALT_SIXTEEN_OFF -> 33;
            case STYLISTIC_ALT_SEVENTEEN_ON -> 34;
            case STYLISTIC_ALT_SEVENTEEN_OFF -> 35;
            case STYLISTIC_ALT_EIGHTEEN_ON -> 36;
            case STYLISTIC_ALT_EIGHTEEN_OFF -> 37;
            case STYLISTIC_ALT_NINETEEN_ON -> 38;
            case STYLISTIC_ALT_NINETEEN_OFF -> 39;
            case STYLISTIC_ALT_TWENTY_ON -> 40;
            case STYLISTIC_ALT_TWENTY_OFF -> 41;
            case CONTEXTUAL_ALTERNATES_ON -> 0;
            case CONTEXTUAL_ALTERNATES_OFF -> 1;
            case SWASH_ALTERNATES_ON -> 2;
            case SWASH_ALTERNATES_OFF -> 3;
            case CONTEXTUAL_SWASH_ALTERNATES_ON -> 4;
            case CONTEXTUAL_SWASH_ALTERNATES_OFF -> 5;
            case DEFAULT_LOWER_CASE -> 0;
            case LOWER_CASE_SMALL_CAPS -> 1;
            case LOWER_CASE_PETITE_CAPS -> 2;
            case DEFAULT_UPPER_CASE -> 0;
            case UPPER_CASE_SMALL_CAPS -> 1;
            case UPPER_CASE_PETITE_CAPS -> 2;
            case HALF_WIDTH_CJK_ROMAN -> 0;
            case PROPORTIONAL_CJK_ROMAN -> 1;
            case DEFAULT_CJK_ROMAN -> 2;
            case FULL_WIDTH_CJK_ROMAN -> 3;
        };
    }

}
