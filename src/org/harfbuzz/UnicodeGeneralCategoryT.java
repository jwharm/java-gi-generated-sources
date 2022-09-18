package org.harfbuzz;

/**
 * Data type for the &<code>#34</code> General_Category&<code>#34</code>  (gc) property from
 * the Unicode Character Database.
 */
public enum UnicodeGeneralCategoryT {

    /**
     * {@link [Cc]}
     */
    CONTROL,
    
    /**
     * {@link [Cf]}
     */
    FORMAT,
    
    /**
     * {@link [Cn]}
     */
    UNASSIGNED,
    
    /**
     * {@link [Co]}
     */
    PRIVATE_USE,
    
    /**
     * {@link [Cs]}
     */
    SURROGATE,
    
    /**
     * {@link [Ll]}
     */
    LOWERCASE_LETTER,
    
    /**
     * {@link [Lm]}
     */
    MODIFIER_LETTER,
    
    /**
     * {@link [Lo]}
     */
    OTHER_LETTER,
    
    /**
     * {@link [Lt]}
     */
    TITLECASE_LETTER,
    
    /**
     * {@link [Lu]}
     */
    UPPERCASE_LETTER,
    
    /**
     * {@link [Mc]}
     */
    SPACING_MARK,
    
    /**
     * {@link [Me]}
     */
    ENCLOSING_MARK,
    
    /**
     * {@link [Mn]}
     */
    NON_SPACING_MARK,
    
    /**
     * {@link [Nd]}
     */
    DECIMAL_NUMBER,
    
    /**
     * {@link [Nl]}
     */
    LETTER_NUMBER,
    
    /**
     * {@link [No]}
     */
    OTHER_NUMBER,
    
    /**
     * {@link [Pc]}
     */
    CONNECT_PUNCTUATION,
    
    /**
     * {@link [Pd]}
     */
    DASH_PUNCTUATION,
    
    /**
     * {@link [Pe]}
     */
    CLOSE_PUNCTUATION,
    
    /**
     * {@link [Pf]}
     */
    FINAL_PUNCTUATION,
    
    /**
     * {@link [Pi]}
     */
    INITIAL_PUNCTUATION,
    
    /**
     * {@link [Po]}
     */
    OTHER_PUNCTUATION,
    
    /**
     * {@link [Ps]}
     */
    OPEN_PUNCTUATION,
    
    /**
     * {@link [Sc]}
     */
    CURRENCY_SYMBOL,
    
    /**
     * {@link [Sk]}
     */
    MODIFIER_SYMBOL,
    
    /**
     * {@link [Sm]}
     */
    MATH_SYMBOL,
    
    /**
     * {@link [So]}
     */
    OTHER_SYMBOL,
    
    /**
     * {@link [Zl]}
     */
    LINE_SEPARATOR,
    
    /**
     * {@link [Zp]}
     */
    PARAGRAPH_SEPARATOR,
    
    /**
     * {@link [Zs]}
     */
    SPACE_SEPARATOR;
    
    public static UnicodeGeneralCategoryT fromValue(int value) {
        return switch(value) {
            case 0 -> CONTROL;
            case 1 -> FORMAT;
            case 2 -> UNASSIGNED;
            case 3 -> PRIVATE_USE;
            case 4 -> SURROGATE;
            case 5 -> LOWERCASE_LETTER;
            case 6 -> MODIFIER_LETTER;
            case 7 -> OTHER_LETTER;
            case 8 -> TITLECASE_LETTER;
            case 9 -> UPPERCASE_LETTER;
            case 10 -> SPACING_MARK;
            case 11 -> ENCLOSING_MARK;
            case 12 -> NON_SPACING_MARK;
            case 13 -> DECIMAL_NUMBER;
            case 14 -> LETTER_NUMBER;
            case 15 -> OTHER_NUMBER;
            case 16 -> CONNECT_PUNCTUATION;
            case 17 -> DASH_PUNCTUATION;
            case 18 -> CLOSE_PUNCTUATION;
            case 19 -> FINAL_PUNCTUATION;
            case 20 -> INITIAL_PUNCTUATION;
            case 21 -> OTHER_PUNCTUATION;
            case 22 -> OPEN_PUNCTUATION;
            case 23 -> CURRENCY_SYMBOL;
            case 24 -> MODIFIER_SYMBOL;
            case 25 -> MATH_SYMBOL;
            case 26 -> OTHER_SYMBOL;
            case 27 -> LINE_SEPARATOR;
            case 28 -> PARAGRAPH_SEPARATOR;
            case 29 -> SPACE_SEPARATOR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CONTROL -> 0;
            case FORMAT -> 1;
            case UNASSIGNED -> 2;
            case PRIVATE_USE -> 3;
            case SURROGATE -> 4;
            case LOWERCASE_LETTER -> 5;
            case MODIFIER_LETTER -> 6;
            case OTHER_LETTER -> 7;
            case TITLECASE_LETTER -> 8;
            case UPPERCASE_LETTER -> 9;
            case SPACING_MARK -> 10;
            case ENCLOSING_MARK -> 11;
            case NON_SPACING_MARK -> 12;
            case DECIMAL_NUMBER -> 13;
            case LETTER_NUMBER -> 14;
            case OTHER_NUMBER -> 15;
            case CONNECT_PUNCTUATION -> 16;
            case DASH_PUNCTUATION -> 17;
            case CLOSE_PUNCTUATION -> 18;
            case FINAL_PUNCTUATION -> 19;
            case INITIAL_PUNCTUATION -> 20;
            case OTHER_PUNCTUATION -> 21;
            case OPEN_PUNCTUATION -> 22;
            case CURRENCY_SYMBOL -> 23;
            case MODIFIER_SYMBOL -> 24;
            case MATH_SYMBOL -> 25;
            case OTHER_SYMBOL -> 26;
            case LINE_SEPARATOR -> 27;
            case PARAGRAPH_SEPARATOR -> 28;
            case SPACE_SEPARATOR -> 29;
        };
    }

}
