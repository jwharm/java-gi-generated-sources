package org.gtk.glib;

/**
 * These are the possible character classifications from the
 * Unicode specification.
 * See {@link [Unicode Character Database]}(http://www.unicode.org/reports/tr44/<code>#General_Category_Values</code> .
 */
public enum UnicodeType {

    /**
     * General category &<code>#34</code> Other, Control&<code>#34</code>  (Cc)
     */
    CONTROL,
    
    /**
     * General category &<code>#34</code> Other, Format&<code>#34</code>  (Cf)
     */
    FORMAT,
    
    /**
     * General category &<code>#34</code> Other, Not Assigned&<code>#34</code>  (Cn)
     */
    UNASSIGNED,
    
    /**
     * General category &<code>#34</code> Other, Private Use&<code>#34</code>  (Co)
     */
    PRIVATE_USE,
    
    /**
     * General category &<code>#34</code> Other, Surrogate&<code>#34</code>  (Cs)
     */
    SURROGATE,
    
    /**
     * General category &<code>#34</code> Letter, Lowercase&<code>#34</code>  (Ll)
     */
    LOWERCASE_LETTER,
    
    /**
     * General category &<code>#34</code> Letter, Modifier&<code>#34</code>  (Lm)
     */
    MODIFIER_LETTER,
    
    /**
     * General category &<code>#34</code> Letter, Other&<code>#34</code>  (Lo)
     */
    OTHER_LETTER,
    
    /**
     * General category &<code>#34</code> Letter, Titlecase&<code>#34</code>  (Lt)
     */
    TITLECASE_LETTER,
    
    /**
     * General category &<code>#34</code> Letter, Uppercase&<code>#34</code>  (Lu)
     */
    UPPERCASE_LETTER,
    
    /**
     * General category &<code>#34</code> Mark, Spacing&<code>#34</code>  (Mc)
     */
    SPACING_MARK,
    
    /**
     * General category &<code>#34</code> Mark, Enclosing&<code>#34</code>  (Me)
     */
    ENCLOSING_MARK,
    
    /**
     * General category &<code>#34</code> Mark, Nonspacing&<code>#34</code>  (Mn)
     */
    NON_SPACING_MARK,
    
    /**
     * General category &<code>#34</code> Number, Decimal Digit&<code>#34</code>  (Nd)
     */
    DECIMAL_NUMBER,
    
    /**
     * General category &<code>#34</code> Number, Letter&<code>#34</code>  (Nl)
     */
    LETTER_NUMBER,
    
    /**
     * General category &<code>#34</code> Number, Other&<code>#34</code>  (No)
     */
    OTHER_NUMBER,
    
    /**
     * General category &<code>#34</code> Punctuation, Connector&<code>#34</code>  (Pc)
     */
    CONNECT_PUNCTUATION,
    
    /**
     * General category &<code>#34</code> Punctuation, Dash&<code>#34</code>  (Pd)
     */
    DASH_PUNCTUATION,
    
    /**
     * General category &<code>#34</code> Punctuation, Close&<code>#34</code>  (Pe)
     */
    CLOSE_PUNCTUATION,
    
    /**
     * General category &<code>#34</code> Punctuation, Final quote&<code>#34</code>  (Pf)
     */
    FINAL_PUNCTUATION,
    
    /**
     * General category &<code>#34</code> Punctuation, Initial quote&<code>#34</code>  (Pi)
     */
    INITIAL_PUNCTUATION,
    
    /**
     * General category &<code>#34</code> Punctuation, Other&<code>#34</code>  (Po)
     */
    OTHER_PUNCTUATION,
    
    /**
     * General category &<code>#34</code> Punctuation, Open&<code>#34</code>  (Ps)
     */
    OPEN_PUNCTUATION,
    
    /**
     * General category &<code>#34</code> Symbol, Currency&<code>#34</code>  (Sc)
     */
    CURRENCY_SYMBOL,
    
    /**
     * General category &<code>#34</code> Symbol, Modifier&<code>#34</code>  (Sk)
     */
    MODIFIER_SYMBOL,
    
    /**
     * General category &<code>#34</code> Symbol, Math&<code>#34</code>  (Sm)
     */
    MATH_SYMBOL,
    
    /**
     * General category &<code>#34</code> Symbol, Other&<code>#34</code>  (So)
     */
    OTHER_SYMBOL,
    
    /**
     * General category &<code>#34</code> Separator, Line&<code>#34</code>  (Zl)
     */
    LINE_SEPARATOR,
    
    /**
     * General category &<code>#34</code> Separator, Paragraph&<code>#34</code>  (Zp)
     */
    PARAGRAPH_SEPARATOR,
    
    /**
     * General category &<code>#34</code> Separator, Space&<code>#34</code>  (Zs)
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
