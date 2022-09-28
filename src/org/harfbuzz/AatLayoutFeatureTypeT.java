package org.harfbuzz;

/**
 * The possible feature types defined for AAT shaping, from Apple <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html">Font Feature Registry</a>.
 */
public class AatLayoutFeatureTypeT extends io.github.jwharm.javagi.Enumeration {

    /**
     * Initial, unset feature type
     */
    public static final AatLayoutFeatureTypeT INVALID = new AatLayoutFeatureTypeT(65535);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type0">All Typographic Features</a>
     */
    public static final AatLayoutFeatureTypeT ALL_TYPOGRAPHIC = new AatLayoutFeatureTypeT(0);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type1">Ligatures</a>
     */
    public static final AatLayoutFeatureTypeT LIGATURES = new AatLayoutFeatureTypeT(1);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type2">Cursive Connection</a>
     */
    public static final AatLayoutFeatureTypeT CURISVE_CONNECTION = new AatLayoutFeatureTypeT(2);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type3">Letter Case</a>
     */
    public static final AatLayoutFeatureTypeT LETTER_CASE = new AatLayoutFeatureTypeT(3);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type4">Vertical Substitution</a>
     */
    public static final AatLayoutFeatureTypeT VERTICAL_SUBSTITUTION = new AatLayoutFeatureTypeT(4);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type5">Linguistic Rearrangement</a>
     */
    public static final AatLayoutFeatureTypeT LINGUISTIC_REARRANGEMENT = new AatLayoutFeatureTypeT(5);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type6">Number Spacing</a>
     */
    public static final AatLayoutFeatureTypeT NUMBER_SPACING = new AatLayoutFeatureTypeT(6);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type8">Smart Swash</a>
     */
    public static final AatLayoutFeatureTypeT SMART_SWASH_TYPE = new AatLayoutFeatureTypeT(8);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type9">Diacritics</a>
     */
    public static final AatLayoutFeatureTypeT DIACRITICS_TYPE = new AatLayoutFeatureTypeT(9);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type10">Vertical Position</a>
     */
    public static final AatLayoutFeatureTypeT VERTICAL_POSITION = new AatLayoutFeatureTypeT(10);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type11">Fractions</a>
     */
    public static final AatLayoutFeatureTypeT FRACTIONS = new AatLayoutFeatureTypeT(11);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type13">Overlapping Characters</a>
     */
    public static final AatLayoutFeatureTypeT OVERLAPPING_CHARACTERS_TYPE = new AatLayoutFeatureTypeT(13);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type14">Typographic Extras</a>
     */
    public static final AatLayoutFeatureTypeT TYPOGRAPHIC_EXTRAS = new AatLayoutFeatureTypeT(14);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type15">Mathematical Extras</a>
     */
    public static final AatLayoutFeatureTypeT MATHEMATICAL_EXTRAS = new AatLayoutFeatureTypeT(15);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type16">Ornament Sets</a>
     */
    public static final AatLayoutFeatureTypeT ORNAMENT_SETS_TYPE = new AatLayoutFeatureTypeT(16);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type17">Character Alternatives</a>
     */
    public static final AatLayoutFeatureTypeT CHARACTER_ALTERNATIVES = new AatLayoutFeatureTypeT(17);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type18">Design Complexity</a>
     */
    public static final AatLayoutFeatureTypeT DESIGN_COMPLEXITY_TYPE = new AatLayoutFeatureTypeT(18);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type19">Style Options</a>
     */
    public static final AatLayoutFeatureTypeT STYLE_OPTIONS = new AatLayoutFeatureTypeT(19);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type20">Character Shape</a>
     */
    public static final AatLayoutFeatureTypeT CHARACTER_SHAPE = new AatLayoutFeatureTypeT(20);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type21">Number Case</a>
     */
    public static final AatLayoutFeatureTypeT NUMBER_CASE = new AatLayoutFeatureTypeT(21);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type22">Text Spacing</a>
     */
    public static final AatLayoutFeatureTypeT TEXT_SPACING = new AatLayoutFeatureTypeT(22);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type23">Transliteration</a>
     */
    public static final AatLayoutFeatureTypeT TRANSLITERATION = new AatLayoutFeatureTypeT(23);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type24">Annotation</a>
     */
    public static final AatLayoutFeatureTypeT ANNOTATION_TYPE = new AatLayoutFeatureTypeT(24);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type25">Kana Spacing</a>
     */
    public static final AatLayoutFeatureTypeT KANA_SPACING_TYPE = new AatLayoutFeatureTypeT(25);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type26">Ideographic Spacing</a>
     */
    public static final AatLayoutFeatureTypeT IDEOGRAPHIC_SPACING_TYPE = new AatLayoutFeatureTypeT(26);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type27">Unicode Decomposition</a>
     */
    public static final AatLayoutFeatureTypeT UNICODE_DECOMPOSITION_TYPE = new AatLayoutFeatureTypeT(27);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type28">Ruby Kana</a>
     */
    public static final AatLayoutFeatureTypeT RUBY_KANA = new AatLayoutFeatureTypeT(28);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type29">CJK Symbol Alternatives</a>
     */
    public static final AatLayoutFeatureTypeT CJK_SYMBOL_ALTERNATIVES_TYPE = new AatLayoutFeatureTypeT(29);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type30">Ideographic Alternatives</a>
     */
    public static final AatLayoutFeatureTypeT IDEOGRAPHIC_ALTERNATIVES_TYPE = new AatLayoutFeatureTypeT(30);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type31">CJK Vertical Roman Placement</a>
     */
    public static final AatLayoutFeatureTypeT CJK_VERTICAL_ROMAN_PLACEMENT_TYPE = new AatLayoutFeatureTypeT(31);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type32">Italic CJK Roman</a>
     */
    public static final AatLayoutFeatureTypeT ITALIC_CJK_ROMAN = new AatLayoutFeatureTypeT(32);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type33">Case Sensitive Layout</a>
     */
    public static final AatLayoutFeatureTypeT CASE_SENSITIVE_LAYOUT = new AatLayoutFeatureTypeT(33);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type34">Alternate Kana</a>
     */
    public static final AatLayoutFeatureTypeT ALTERNATE_KANA = new AatLayoutFeatureTypeT(34);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type35">Stylistic Alternatives</a>
     */
    public static final AatLayoutFeatureTypeT STYLISTIC_ALTERNATIVES = new AatLayoutFeatureTypeT(35);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type36">Contextual Alternatives</a>
     */
    public static final AatLayoutFeatureTypeT CONTEXTUAL_ALTERNATIVES = new AatLayoutFeatureTypeT(36);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type37">Lower Case</a>
     */
    public static final AatLayoutFeatureTypeT LOWER_CASE = new AatLayoutFeatureTypeT(37);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type38">Upper Case</a>
     */
    public static final AatLayoutFeatureTypeT UPPER_CASE = new AatLayoutFeatureTypeT(38);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type39">Language Tag</a>
     */
    public static final AatLayoutFeatureTypeT LANGUAGE_TAG_TYPE = new AatLayoutFeatureTypeT(39);
    
    /**
     * <a href="https://developer.apple.com/fonts/TrueType-Reference-Manual/RM09/AppendixF.html#Type103">CJK Roman Spacing</a>
     */
    public static final AatLayoutFeatureTypeT CJK_ROMAN_SPACING_TYPE = new AatLayoutFeatureTypeT(103);
    
    public AatLayoutFeatureTypeT(int value) {
        super(value);
    }
    
}
