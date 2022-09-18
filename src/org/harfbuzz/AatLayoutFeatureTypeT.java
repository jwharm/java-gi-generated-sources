package org.harfbuzz;

/**
 * The possible feature types defined for AAT shaping, from Apple {@link [Font Feature Registry]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html).
 */
public enum AatLayoutFeatureTypeT {

    /**
     * Initial, unset feature type
     */
    INVALID,
    
    /**
     * {@link [All Typographic Features]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type0</code>
     */
    ALL_TYPOGRAPHIC,
    
    /**
     * {@link [Ligatures]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type1</code>
     */
    LIGATURES,
    
    /**
     * {@link [Cursive Connection]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type2</code>
     */
    CURISVE_CONNECTION,
    
    /**
     * {@link [Letter Case]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type3</code>
     */
    LETTER_CASE,
    
    /**
     * {@link [Vertical Substitution]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type4</code>
     */
    VERTICAL_SUBSTITUTION,
    
    /**
     * {@link [Linguistic Rearrangement]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type5</code>
     */
    LINGUISTIC_REARRANGEMENT,
    
    /**
     * {@link [Number Spacing]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type6</code>
     */
    NUMBER_SPACING,
    
    /**
     * {@link [Smart Swash]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type8</code>
     */
    SMART_SWASH_TYPE,
    
    /**
     * {@link [Diacritics]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type9</code>
     */
    DIACRITICS_TYPE,
    
    /**
     * {@link [Vertical Position]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type10</code>
     */
    VERTICAL_POSITION,
    
    /**
     * {@link [Fractions]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type11</code>
     */
    FRACTIONS,
    
    /**
     * {@link [Overlapping Characters]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type13</code>
     */
    OVERLAPPING_CHARACTERS_TYPE,
    
    /**
     * {@link [Typographic Extras]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type14</code>
     */
    TYPOGRAPHIC_EXTRAS,
    
    /**
     * {@link [Mathematical Extras]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type15</code>
     */
    MATHEMATICAL_EXTRAS,
    
    /**
     * {@link [Ornament Sets]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type16</code>
     */
    ORNAMENT_SETS_TYPE,
    
    /**
     * {@link [Character Alternatives]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type17</code>
     */
    CHARACTER_ALTERNATIVES,
    
    /**
     * {@link [Design Complexity]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type18</code>
     */
    DESIGN_COMPLEXITY_TYPE,
    
    /**
     * {@link [Style Options]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type19</code>
     */
    STYLE_OPTIONS,
    
    /**
     * {@link [Character Shape]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type20</code>
     */
    CHARACTER_SHAPE,
    
    /**
     * {@link [Number Case]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type21</code>
     */
    NUMBER_CASE,
    
    /**
     * {@link [Text Spacing]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type22</code>
     */
    TEXT_SPACING,
    
    /**
     * {@link [Transliteration]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type23</code>
     */
    TRANSLITERATION,
    
    /**
     * {@link [Annotation]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type24</code>
     */
    ANNOTATION_TYPE,
    
    /**
     * {@link [Kana Spacing]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type25</code>
     */
    KANA_SPACING_TYPE,
    
    /**
     * {@link [Ideographic Spacing]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type26</code>
     */
    IDEOGRAPHIC_SPACING_TYPE,
    
    /**
     * {@link [Unicode Decomposition]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type27</code>
     */
    UNICODE_DECOMPOSITION_TYPE,
    
    /**
     * {@link [Ruby Kana]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type28</code>
     */
    RUBY_KANA,
    
    /**
     * {@link [CJK Symbol Alternatives]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type29</code>
     */
    CJK_SYMBOL_ALTERNATIVES_TYPE,
    
    /**
     * {@link [Ideographic Alternatives]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type30</code>
     */
    IDEOGRAPHIC_ALTERNATIVES_TYPE,
    
    /**
     * {@link [CJK Vertical Roman Placement]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type31</code>
     */
    CJK_VERTICAL_ROMAN_PLACEMENT_TYPE,
    
    /**
     * {@link [Italic CJK Roman]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type32</code>
     */
    ITALIC_CJK_ROMAN,
    
    /**
     * {@link [Case Sensitive Layout]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type33</code>
     */
    CASE_SENSITIVE_LAYOUT,
    
    /**
     * {@link [Alternate Kana]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type34</code>
     */
    ALTERNATE_KANA,
    
    /**
     * {@link [Stylistic Alternatives]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type35</code>
     */
    STYLISTIC_ALTERNATIVES,
    
    /**
     * {@link [Contextual Alternatives]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type36</code>
     */
    CONTEXTUAL_ALTERNATIVES,
    
    /**
     * {@link [Lower Case]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type37</code>
     */
    LOWER_CASE,
    
    /**
     * {@link [Upper Case]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type38</code>
     */
    UPPER_CASE,
    
    /**
     * {@link [Language Tag]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type39</code>
     */
    LANGUAGE_TAG_TYPE,
    
    /**
     * {@link [CJK Roman Spacing]}(https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html<code>#Type103</code>
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
