package org.harfbuzz;

/**
 * The possible feature types defined for AAT shaping, from Apple <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html">Font Feature Registry</a>.
 */
public enum AatLayoutFeatureTypeT {

    /**
     * Initial, unset feature type
     */
    INVALID,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type0">All Typographic Features</a>
     */
    ALL_TYPOGRAPHIC,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type1">Ligatures</a>
     */
    LIGATURES,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type2">Cursive Connection</a>
     */
    CURISVE_CONNECTION,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type3">Letter Case</a>
     */
    LETTER_CASE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type4">Vertical Substitution</a>
     */
    VERTICAL_SUBSTITUTION,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type5">Linguistic Rearrangement</a>
     */
    LINGUISTIC_REARRANGEMENT,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type6">Number Spacing</a>
     */
    NUMBER_SPACING,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type8">Smart Swash</a>
     */
    SMART_SWASH_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type9">Diacritics</a>
     */
    DIACRITICS_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type10">Vertical Position</a>
     */
    VERTICAL_POSITION,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type11">Fractions</a>
     */
    FRACTIONS,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type13">Overlapping Characters</a>
     */
    OVERLAPPING_CHARACTERS_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type14">Typographic Extras</a>
     */
    TYPOGRAPHIC_EXTRAS,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type15">Mathematical Extras</a>
     */
    MATHEMATICAL_EXTRAS,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type16">Ornament Sets</a>
     */
    ORNAMENT_SETS_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type17">Character Alternatives</a>
     */
    CHARACTER_ALTERNATIVES,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type18">Design Complexity</a>
     */
    DESIGN_COMPLEXITY_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type19">Style Options</a>
     */
    STYLE_OPTIONS,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type20">Character Shape</a>
     */
    CHARACTER_SHAPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type21">Number Case</a>
     */
    NUMBER_CASE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type22">Text Spacing</a>
     */
    TEXT_SPACING,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type23">Transliteration</a>
     */
    TRANSLITERATION,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type24">Annotation</a>
     */
    ANNOTATION_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type25">Kana Spacing</a>
     */
    KANA_SPACING_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type26">Ideographic Spacing</a>
     */
    IDEOGRAPHIC_SPACING_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type27">Unicode Decomposition</a>
     */
    UNICODE_DECOMPOSITION_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type28">Ruby Kana</a>
     */
    RUBY_KANA,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type29">CJK Symbol Alternatives</a>
     */
    CJK_SYMBOL_ALTERNATIVES_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type30">Ideographic Alternatives</a>
     */
    IDEOGRAPHIC_ALTERNATIVES_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type31">CJK Vertical Roman Placement</a>
     */
    CJK_VERTICAL_ROMAN_PLACEMENT_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type32">Italic CJK Roman</a>
     */
    ITALIC_CJK_ROMAN,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type33">Case Sensitive Layout</a>
     */
    CASE_SENSITIVE_LAYOUT,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type34">Alternate Kana</a>
     */
    ALTERNATE_KANA,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type35">Stylistic Alternatives</a>
     */
    STYLISTIC_ALTERNATIVES,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type36">Contextual Alternatives</a>
     */
    CONTEXTUAL_ALTERNATIVES,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type37">Lower Case</a>
     */
    LOWER_CASE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type38">Upper Case</a>
     */
    UPPER_CASE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type39">Language Tag</a>
     */
    LANGUAGE_TAG_TYPE,
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type103">CJK Roman Spacing</a>
     */
    CJK_ROMAN_SPACING_TYPE;
    
    public static AatLayoutFeatureTypeT fromValue(int value) {
        return switch(value) {
            case 65535 -> INVALID;
            case 0 -> ALL_TYPOGRAPHIC;
            case 1 -> LIGATURES;
            case 2 -> CURISVE_CONNECTION;
            case 3 -> LETTER_CASE;
            case 4 -> VERTICAL_SUBSTITUTION;
            case 5 -> LINGUISTIC_REARRANGEMENT;
            case 6 -> NUMBER_SPACING;
            case 8 -> SMART_SWASH_TYPE;
            case 9 -> DIACRITICS_TYPE;
            case 10 -> VERTICAL_POSITION;
            case 11 -> FRACTIONS;
            case 13 -> OVERLAPPING_CHARACTERS_TYPE;
            case 14 -> TYPOGRAPHIC_EXTRAS;
            case 15 -> MATHEMATICAL_EXTRAS;
            case 16 -> ORNAMENT_SETS_TYPE;
            case 17 -> CHARACTER_ALTERNATIVES;
            case 18 -> DESIGN_COMPLEXITY_TYPE;
            case 19 -> STYLE_OPTIONS;
            case 20 -> CHARACTER_SHAPE;
            case 21 -> NUMBER_CASE;
            case 22 -> TEXT_SPACING;
            case 23 -> TRANSLITERATION;
            case 24 -> ANNOTATION_TYPE;
            case 25 -> KANA_SPACING_TYPE;
            case 26 -> IDEOGRAPHIC_SPACING_TYPE;
            case 27 -> UNICODE_DECOMPOSITION_TYPE;
            case 28 -> RUBY_KANA;
            case 29 -> CJK_SYMBOL_ALTERNATIVES_TYPE;
            case 30 -> IDEOGRAPHIC_ALTERNATIVES_TYPE;
            case 31 -> CJK_VERTICAL_ROMAN_PLACEMENT_TYPE;
            case 32 -> ITALIC_CJK_ROMAN;
            case 33 -> CASE_SENSITIVE_LAYOUT;
            case 34 -> ALTERNATE_KANA;
            case 35 -> STYLISTIC_ALTERNATIVES;
            case 36 -> CONTEXTUAL_ALTERNATIVES;
            case 37 -> LOWER_CASE;
            case 38 -> UPPER_CASE;
            case 39 -> LANGUAGE_TAG_TYPE;
            case 103 -> CJK_ROMAN_SPACING_TYPE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 65535;
            case ALL_TYPOGRAPHIC -> 0;
            case LIGATURES -> 1;
            case CURISVE_CONNECTION -> 2;
            case LETTER_CASE -> 3;
            case VERTICAL_SUBSTITUTION -> 4;
            case LINGUISTIC_REARRANGEMENT -> 5;
            case NUMBER_SPACING -> 6;
            case SMART_SWASH_TYPE -> 8;
            case DIACRITICS_TYPE -> 9;
            case VERTICAL_POSITION -> 10;
            case FRACTIONS -> 11;
            case OVERLAPPING_CHARACTERS_TYPE -> 13;
            case TYPOGRAPHIC_EXTRAS -> 14;
            case MATHEMATICAL_EXTRAS -> 15;
            case ORNAMENT_SETS_TYPE -> 16;
            case CHARACTER_ALTERNATIVES -> 17;
            case DESIGN_COMPLEXITY_TYPE -> 18;
            case STYLE_OPTIONS -> 19;
            case CHARACTER_SHAPE -> 20;
            case NUMBER_CASE -> 21;
            case TEXT_SPACING -> 22;
            case TRANSLITERATION -> 23;
            case ANNOTATION_TYPE -> 24;
            case KANA_SPACING_TYPE -> 25;
            case IDEOGRAPHIC_SPACING_TYPE -> 26;
            case UNICODE_DECOMPOSITION_TYPE -> 27;
            case RUBY_KANA -> 28;
            case CJK_SYMBOL_ALTERNATIVES_TYPE -> 29;
            case IDEOGRAPHIC_ALTERNATIVES_TYPE -> 30;
            case CJK_VERTICAL_ROMAN_PLACEMENT_TYPE -> 31;
            case ITALIC_CJK_ROMAN -> 32;
            case CASE_SENSITIVE_LAYOUT -> 33;
            case ALTERNATE_KANA -> 34;
            case STYLISTIC_ALTERNATIVES -> 35;
            case CONTEXTUAL_ALTERNATIVES -> 36;
            case LOWER_CASE -> 37;
            case UPPER_CASE -> 38;
            case LANGUAGE_TAG_TYPE -> 39;
            case CJK_ROMAN_SPACING_TYPE -> 103;
        };
    }

}
