package org.gtk.glib;

/**
 * These are the possible line break classifications.
 * 
 * Since new unicode versions may add new types here, applications should be ready
 * to handle unknown values. They may be regarded as %G_UNICODE_BREAK_UNKNOWN.
 * 
 * See [Unicode Line Breaking Algorithm](http://www.unicode.org/unicode/reports/tr14/).
 */
public enum UnicodeBreakType {

    /**
     * Mandatory Break (BK)
     */
    MANDATORY,
    
    /**
     * Carriage Return (CR)
     */
    CARRIAGE_RETURN,
    
    /**
     * Line Feed (LF)
     */
    LINE_FEED,
    
    /**
     * Attached Characters and Combining Marks (CM)
     */
    COMBINING_MARK,
    
    /**
     * Surrogates (SG)
     */
    SURROGATE,
    
    /**
     * Zero Width Space (ZW)
     */
    ZERO_WIDTH_SPACE,
    
    /**
     * Inseparable (IN)
     */
    INSEPARABLE,
    
    /**
     * Non-breaking ("Glue") (GL)
     */
    NON_BREAKING_GLUE,
    
    /**
     * Contingent Break Opportunity (CB)
     */
    CONTINGENT,
    
    /**
     * Space (SP)
     */
    SPACE,
    
    /**
     * Break Opportunity After (BA)
     */
    AFTER,
    
    /**
     * Break Opportunity Before (BB)
     */
    BEFORE,
    
    /**
     * Break Opportunity Before and After (B2)
     */
    BEFORE_AND_AFTER,
    
    /**
     * Hyphen (HY)
     */
    HYPHEN,
    
    /**
     * Nonstarter (NS)
     */
    NON_STARTER,
    
    /**
     * Opening Punctuation (OP)
     */
    OPEN_PUNCTUATION,
    
    /**
     * Closing Punctuation (CL)
     */
    CLOSE_PUNCTUATION,
    
    /**
     * Ambiguous Quotation (QU)
     */
    QUOTATION,
    
    /**
     * Exclamation/Interrogation (EX)
     */
    EXCLAMATION,
    
    /**
     * Ideographic (ID)
     */
    IDEOGRAPHIC,
    
    /**
     * Numeric (NU)
     */
    NUMERIC,
    
    /**
     * Infix Separator (Numeric) (IS)
     */
    INFIX_SEPARATOR,
    
    /**
     * Symbols Allowing Break After (SY)
     */
    SYMBOL,
    
    /**
     * Ordinary Alphabetic and Symbol Characters (AL)
     */
    ALPHABETIC,
    
    /**
     * Prefix (Numeric) (PR)
     */
    PREFIX,
    
    /**
     * Postfix (Numeric) (PO)
     */
    POSTFIX,
    
    /**
     * Complex Content Dependent (South East Asian) (SA)
     */
    COMPLEX_CONTEXT,
    
    /**
     * Ambiguous (Alphabetic or Ideographic) (AI)
     */
    AMBIGUOUS,
    
    /**
     * Unknown (XX)
     */
    UNKNOWN,
    
    /**
     * Next Line (NL)
     */
    NEXT_LINE,
    
    /**
     * Word Joiner (WJ)
     */
    WORD_JOINER,
    
    /**
     * Hangul L Jamo (JL)
     */
    HANGUL_L_JAMO,
    
    /**
     * Hangul V Jamo (JV)
     */
    HANGUL_V_JAMO,
    
    /**
     * Hangul T Jamo (JT)
     */
    HANGUL_T_JAMO,
    
    /**
     * Hangul LV Syllable (H2)
     */
    HANGUL_LV_SYLLABLE,
    
    /**
     * Hangul LVT Syllable (H3)
     */
    HANGUL_LVT_SYLLABLE,
    
    /**
     * Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use %G_UNICODE_BREAK_CLOSE_PARENTHESIS instead.
     */
    CLOSE_PARANTHESIS,
    
    /**
     * Closing Parenthesis (CP). Since 2.70
     */
    CLOSE_PARENTHESIS,
    
    /**
     * Conditional Japanese Starter (CJ). Since: 2.32
     */
    CONDITIONAL_JAPANESE_STARTER,
    
    /**
     * Hebrew Letter (HL). Since: 2.32
     */
    HEBREW_LETTER,
    
    /**
     * Regional Indicator (RI). Since: 2.36
     */
    REGIONAL_INDICATOR,
    
    /**
     * Emoji Base (EB). Since: 2.50
     */
    EMOJI_BASE,
    
    /**
     * Emoji Modifier (EM). Since: 2.50
     */
    EMOJI_MODIFIER,
    
    /**
     * Zero Width Joiner (ZWJ). Since: 2.50
     */
    ZERO_WIDTH_JOINER;
    
    public static UnicodeBreakType fromValue(int value) {
        return switch(value) {
            case 0 -> MANDATORY;
            case 1 -> CARRIAGE_RETURN;
            case 2 -> LINE_FEED;
            case 3 -> COMBINING_MARK;
            case 4 -> SURROGATE;
            case 5 -> ZERO_WIDTH_SPACE;
            case 6 -> INSEPARABLE;
            case 7 -> NON_BREAKING_GLUE;
            case 8 -> CONTINGENT;
            case 9 -> SPACE;
            case 10 -> AFTER;
            case 11 -> BEFORE;
            case 12 -> BEFORE_AND_AFTER;
            case 13 -> HYPHEN;
            case 14 -> NON_STARTER;
            case 15 -> OPEN_PUNCTUATION;
            case 16 -> CLOSE_PUNCTUATION;
            case 17 -> QUOTATION;
            case 18 -> EXCLAMATION;
            case 19 -> IDEOGRAPHIC;
            case 20 -> NUMERIC;
            case 21 -> INFIX_SEPARATOR;
            case 22 -> SYMBOL;
            case 23 -> ALPHABETIC;
            case 24 -> PREFIX;
            case 25 -> POSTFIX;
            case 26 -> COMPLEX_CONTEXT;
            case 27 -> AMBIGUOUS;
            case 28 -> UNKNOWN;
            case 29 -> NEXT_LINE;
            case 30 -> WORD_JOINER;
            case 31 -> HANGUL_L_JAMO;
            case 32 -> HANGUL_V_JAMO;
            case 33 -> HANGUL_T_JAMO;
            case 34 -> HANGUL_LV_SYLLABLE;
            case 35 -> HANGUL_LVT_SYLLABLE;
            case 36 -> CLOSE_PARANTHESIS;
            case 37 -> CONDITIONAL_JAPANESE_STARTER;
            case 38 -> HEBREW_LETTER;
            case 39 -> REGIONAL_INDICATOR;
            case 40 -> EMOJI_BASE;
            case 41 -> EMOJI_MODIFIER;
            case 42 -> ZERO_WIDTH_JOINER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case MANDATORY -> 0;
            case CARRIAGE_RETURN -> 1;
            case LINE_FEED -> 2;
            case COMBINING_MARK -> 3;
            case SURROGATE -> 4;
            case ZERO_WIDTH_SPACE -> 5;
            case INSEPARABLE -> 6;
            case NON_BREAKING_GLUE -> 7;
            case CONTINGENT -> 8;
            case SPACE -> 9;
            case AFTER -> 10;
            case BEFORE -> 11;
            case BEFORE_AND_AFTER -> 12;
            case HYPHEN -> 13;
            case NON_STARTER -> 14;
            case OPEN_PUNCTUATION -> 15;
            case CLOSE_PUNCTUATION -> 16;
            case QUOTATION -> 17;
            case EXCLAMATION -> 18;
            case IDEOGRAPHIC -> 19;
            case NUMERIC -> 20;
            case INFIX_SEPARATOR -> 21;
            case SYMBOL -> 22;
            case ALPHABETIC -> 23;
            case PREFIX -> 24;
            case POSTFIX -> 25;
            case COMPLEX_CONTEXT -> 26;
            case AMBIGUOUS -> 27;
            case UNKNOWN -> 28;
            case NEXT_LINE -> 29;
            case WORD_JOINER -> 30;
            case HANGUL_L_JAMO -> 31;
            case HANGUL_V_JAMO -> 32;
            case HANGUL_T_JAMO -> 33;
            case HANGUL_LV_SYLLABLE -> 34;
            case HANGUL_LVT_SYLLABLE -> 35;
            case CLOSE_PARANTHESIS -> 36;
            case CLOSE_PARENTHESIS -> 36;
            case CONDITIONAL_JAPANESE_STARTER -> 37;
            case HEBREW_LETTER -> 38;
            case REGIONAL_INDICATOR -> 39;
            case EMOJI_BASE -> 40;
            case EMOJI_MODIFIER -> 41;
            case ZERO_WIDTH_JOINER -> 42;
        };
    }

}
