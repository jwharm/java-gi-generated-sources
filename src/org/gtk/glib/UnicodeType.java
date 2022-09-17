package org.gtk.glib;

/**
 * These are the possible character classifications from the
 * Unicode specification.
 * See {@link [Unicode Character Database]}(http://www.unicode.org/reports/tr44/#General_Category_Values).
 */
public enum UnicodeType {

    /**
     * General category &#34;Other, Control&#34; (Cc)
     */
    CONTROL,
    
    /**
     * General category &#34;Other, Format&#34; (Cf)
     */
    FORMAT,
    
    /**
     * General category &#34;Other, Not Assigned&#34; (Cn)
     */
    UNASSIGNED,
    
    /**
     * General category &#34;Other, Private Use&#34; (Co)
     */
    PRIVATE_USE,
    
    /**
     * General category &#34;Other, Surrogate&#34; (Cs)
     */
    SURROGATE,
    
    /**
     * General category &#34;Letter, Lowercase&#34; (Ll)
     */
    LOWERCASE_LETTER,
    
    /**
     * General category &#34;Letter, Modifier&#34; (Lm)
     */
    MODIFIER_LETTER,
    
    /**
     * General category &#34;Letter, Other&#34; (Lo)
     */
    OTHER_LETTER,
    
    /**
     * General category &#34;Letter, Titlecase&#34; (Lt)
     */
    TITLECASE_LETTER,
    
    /**
     * General category &#34;Letter, Uppercase&#34; (Lu)
     */
    UPPERCASE_LETTER,
    
    /**
     * General category &#34;Mark, Spacing&#34; (Mc)
     */
    SPACING_MARK,
    
    /**
     * General category &#34;Mark, Enclosing&#34; (Me)
     */
    ENCLOSING_MARK,
    
    /**
     * General category &#34;Mark, Nonspacing&#34; (Mn)
     */
    NON_SPACING_MARK,
    
    /**
     * General category &#34;Number, Decimal Digit&#34; (Nd)
     */
    DECIMAL_NUMBER,
    
    /**
     * General category &#34;Number, Letter&#34; (Nl)
     */
    LETTER_NUMBER,
    
    /**
     * General category &#34;Number, Other&#34; (No)
     */
    OTHER_NUMBER,
    
    /**
     * General category &#34;Punctuation, Connector&#34; (Pc)
     */
    CONNECT_PUNCTUATION,
    
    /**
     * General category &#34;Punctuation, Dash&#34; (Pd)
     */
    DASH_PUNCTUATION,
    
    /**
     * General category &#34;Punctuation, Close&#34; (Pe)
     */
    CLOSE_PUNCTUATION,
    
    /**
     * General category &#34;Punctuation, Final quote&#34; (Pf)
     */
    FINAL_PUNCTUATION,
    
    /**
     * General category &#34;Punctuation, Initial quote&#34; (Pi)
     */
    INITIAL_PUNCTUATION,
    
    /**
     * General category &#34;Punctuation, Other&#34; (Po)
     */
    OTHER_PUNCTUATION,
    
    /**
     * General category &#34;Punctuation, Open&#34; (Ps)
     */
    OPEN_PUNCTUATION,
    
    /**
     * General category &#34;Symbol, Currency&#34; (Sc)
     */
    CURRENCY_SYMBOL,
    
    /**
     * General category &#34;Symbol, Modifier&#34; (Sk)
     */
    MODIFIER_SYMBOL,
    
    /**
     * General category &#34;Symbol, Math&#34; (Sm)
     */
    MATH_SYMBOL,
    
    /**
     * General category &#34;Symbol, Other&#34; (So)
     */
    OTHER_SYMBOL,
    
    /**
     * General category &#34;Separator, Line&#34; (Zl)
     */
    LINE_SEPARATOR,
    
    /**
     * General category &#34;Separator, Paragraph&#34; (Zp)
     */
    PARAGRAPH_SEPARATOR,
    
    /**
     * General category &#34;Separator, Space&#34; (Zs)
     */
    SPACE_SEPARATOR;
    
    public static UnicodeType fromValue(int value) {
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
