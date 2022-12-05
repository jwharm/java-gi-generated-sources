package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These are the possible line break classifications.
 * <p>
 * Since new unicode versions may add new types here, applications should be ready
 * to handle unknown values. They may be regarded as {@link UnicodeBreakType#UNKNOWN}.
 * <p>
 * See <a href="http://www.unicode.org/unicode/reports/tr14/">Unicode Line Breaking Algorithm</a>.
 */
public enum UnicodeBreakType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Mandatory Break (BK)
     */
    MANDATORY(0),
    /**
     * Carriage Return (CR)
     */
    CARRIAGE_RETURN(1),
    /**
     * Line Feed (LF)
     */
    LINE_FEED(2),
    /**
     * Attached Characters and Combining Marks (CM)
     */
    COMBINING_MARK(3),
    /**
     * Surrogates (SG)
     */
    SURROGATE(4),
    /**
     * Zero Width Space (ZW)
     */
    ZERO_WIDTH_SPACE(5),
    /**
     * Inseparable (IN)
     */
    INSEPARABLE(6),
    /**
     * Non-breaking ("Glue") (GL)
     */
    NON_BREAKING_GLUE(7),
    /**
     * Contingent Break Opportunity (CB)
     */
    CONTINGENT(8),
    /**
     * Space (SP)
     */
    SPACE(9),
    /**
     * Break Opportunity After (BA)
     */
    AFTER(10),
    /**
     * Break Opportunity Before (BB)
     */
    BEFORE(11),
    /**
     * Break Opportunity Before and After (B2)
     */
    BEFORE_AND_AFTER(12),
    /**
     * Hyphen (HY)
     */
    HYPHEN(13),
    /**
     * Nonstarter (NS)
     */
    NON_STARTER(14),
    /**
     * Opening Punctuation (OP)
     */
    OPEN_PUNCTUATION(15),
    /**
     * Closing Punctuation (CL)
     */
    CLOSE_PUNCTUATION(16),
    /**
     * Ambiguous Quotation (QU)
     */
    QUOTATION(17),
    /**
     * Exclamation/Interrogation (EX)
     */
    EXCLAMATION(18),
    /**
     * Ideographic (ID)
     */
    IDEOGRAPHIC(19),
    /**
     * Numeric (NU)
     */
    NUMERIC(20),
    /**
     * Infix Separator (Numeric) (IS)
     */
    INFIX_SEPARATOR(21),
    /**
     * Symbols Allowing Break After (SY)
     */
    SYMBOL(22),
    /**
     * Ordinary Alphabetic and Symbol Characters (AL)
     */
    ALPHABETIC(23),
    /**
     * Prefix (Numeric) (PR)
     */
    PREFIX(24),
    /**
     * Postfix (Numeric) (PO)
     */
    POSTFIX(25),
    /**
     * Complex Content Dependent (South East Asian) (SA)
     */
    COMPLEX_CONTEXT(26),
    /**
     * Ambiguous (Alphabetic or Ideographic) (AI)
     */
    AMBIGUOUS(27),
    /**
     * Unknown (XX)
     */
    UNKNOWN(28),
    /**
     * Next Line (NL)
     */
    NEXT_LINE(29),
    /**
     * Word Joiner (WJ)
     */
    WORD_JOINER(30),
    /**
     * Hangul L Jamo (JL)
     */
    HANGUL_L_JAMO(31),
    /**
     * Hangul V Jamo (JV)
     */
    HANGUL_V_JAMO(32),
    /**
     * Hangul T Jamo (JT)
     */
    HANGUL_T_JAMO(33),
    /**
     * Hangul LV Syllable (H2)
     */
    HANGUL_LV_SYLLABLE(34),
    /**
     * Hangul LVT Syllable (H3)
     */
    HANGUL_LVT_SYLLABLE(35),
    /**
     * Closing Parenthesis (CP). Since 2.70
     */
    CLOSE_PARENTHESIS(36),
    /**
     * Conditional Japanese Starter (CJ). Since: 2.32
     */
    CONDITIONAL_JAPANESE_STARTER(37),
    /**
     * Hebrew Letter (HL). Since: 2.32
     */
    HEBREW_LETTER(38),
    /**
     * Regional Indicator (RI). Since: 2.36
     */
    REGIONAL_INDICATOR(39),
    /**
     * Emoji Base (EB). Since: 2.50
     */
    EMOJI_BASE(40),
    /**
     * Emoji Modifier (EM). Since: 2.50
     */
    EMOJI_MODIFIER(41),
    /**
     * Zero Width Joiner (ZWJ). Since: 2.50
     */
    ZERO_WIDTH_JOINER(42);
    
    private static final java.lang.String C_TYPE_NAME = "GUnicodeBreakType";
    
    private final int value;
    UnicodeBreakType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static UnicodeBreakType of(int value) {
        return switch (value) {
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
            case 36 -> CLOSE_PARENTHESIS;
            case 37 -> CONDITIONAL_JAPANESE_STARTER;
            case 38 -> HEBREW_LETTER;
            case 39 -> REGIONAL_INDICATOR;
            case 40 -> EMOJI_BASE;
            case 41 -> EMOJI_MODIFIER;
            case 42 -> ZERO_WIDTH_JOINER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
