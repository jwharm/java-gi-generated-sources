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
public class UnicodeBreakType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Mandatory Break (BK)
     */
    public static final UnicodeBreakType MANDATORY = new UnicodeBreakType(0);
    
    /**
     * Carriage Return (CR)
     */
    public static final UnicodeBreakType CARRIAGE_RETURN = new UnicodeBreakType(1);
    
    /**
     * Line Feed (LF)
     */
    public static final UnicodeBreakType LINE_FEED = new UnicodeBreakType(2);
    
    /**
     * Attached Characters and Combining Marks (CM)
     */
    public static final UnicodeBreakType COMBINING_MARK = new UnicodeBreakType(3);
    
    /**
     * Surrogates (SG)
     */
    public static final UnicodeBreakType SURROGATE = new UnicodeBreakType(4);
    
    /**
     * Zero Width Space (ZW)
     */
    public static final UnicodeBreakType ZERO_WIDTH_SPACE = new UnicodeBreakType(5);
    
    /**
     * Inseparable (IN)
     */
    public static final UnicodeBreakType INSEPARABLE = new UnicodeBreakType(6);
    
    /**
     * Non-breaking ("Glue") (GL)
     */
    public static final UnicodeBreakType NON_BREAKING_GLUE = new UnicodeBreakType(7);
    
    /**
     * Contingent Break Opportunity (CB)
     */
    public static final UnicodeBreakType CONTINGENT = new UnicodeBreakType(8);
    
    /**
     * Space (SP)
     */
    public static final UnicodeBreakType SPACE = new UnicodeBreakType(9);
    
    /**
     * Break Opportunity After (BA)
     */
    public static final UnicodeBreakType AFTER = new UnicodeBreakType(10);
    
    /**
     * Break Opportunity Before (BB)
     */
    public static final UnicodeBreakType BEFORE = new UnicodeBreakType(11);
    
    /**
     * Break Opportunity Before and After (B2)
     */
    public static final UnicodeBreakType BEFORE_AND_AFTER = new UnicodeBreakType(12);
    
    /**
     * Hyphen (HY)
     */
    public static final UnicodeBreakType HYPHEN = new UnicodeBreakType(13);
    
    /**
     * Nonstarter (NS)
     */
    public static final UnicodeBreakType NON_STARTER = new UnicodeBreakType(14);
    
    /**
     * Opening Punctuation (OP)
     */
    public static final UnicodeBreakType OPEN_PUNCTUATION = new UnicodeBreakType(15);
    
    /**
     * Closing Punctuation (CL)
     */
    public static final UnicodeBreakType CLOSE_PUNCTUATION = new UnicodeBreakType(16);
    
    /**
     * Ambiguous Quotation (QU)
     */
    public static final UnicodeBreakType QUOTATION = new UnicodeBreakType(17);
    
    /**
     * Exclamation/Interrogation (EX)
     */
    public static final UnicodeBreakType EXCLAMATION = new UnicodeBreakType(18);
    
    /**
     * Ideographic (ID)
     */
    public static final UnicodeBreakType IDEOGRAPHIC = new UnicodeBreakType(19);
    
    /**
     * Numeric (NU)
     */
    public static final UnicodeBreakType NUMERIC = new UnicodeBreakType(20);
    
    /**
     * Infix Separator (Numeric) (IS)
     */
    public static final UnicodeBreakType INFIX_SEPARATOR = new UnicodeBreakType(21);
    
    /**
     * Symbols Allowing Break After (SY)
     */
    public static final UnicodeBreakType SYMBOL = new UnicodeBreakType(22);
    
    /**
     * Ordinary Alphabetic and Symbol Characters (AL)
     */
    public static final UnicodeBreakType ALPHABETIC = new UnicodeBreakType(23);
    
    /**
     * Prefix (Numeric) (PR)
     */
    public static final UnicodeBreakType PREFIX = new UnicodeBreakType(24);
    
    /**
     * Postfix (Numeric) (PO)
     */
    public static final UnicodeBreakType POSTFIX = new UnicodeBreakType(25);
    
    /**
     * Complex Content Dependent (South East Asian) (SA)
     */
    public static final UnicodeBreakType COMPLEX_CONTEXT = new UnicodeBreakType(26);
    
    /**
     * Ambiguous (Alphabetic or Ideographic) (AI)
     */
    public static final UnicodeBreakType AMBIGUOUS = new UnicodeBreakType(27);
    
    /**
     * Unknown (XX)
     */
    public static final UnicodeBreakType UNKNOWN = new UnicodeBreakType(28);
    
    /**
     * Next Line (NL)
     */
    public static final UnicodeBreakType NEXT_LINE = new UnicodeBreakType(29);
    
    /**
     * Word Joiner (WJ)
     */
    public static final UnicodeBreakType WORD_JOINER = new UnicodeBreakType(30);
    
    /**
     * Hangul L Jamo (JL)
     */
    public static final UnicodeBreakType HANGUL_L_JAMO = new UnicodeBreakType(31);
    
    /**
     * Hangul V Jamo (JV)
     */
    public static final UnicodeBreakType HANGUL_V_JAMO = new UnicodeBreakType(32);
    
    /**
     * Hangul T Jamo (JT)
     */
    public static final UnicodeBreakType HANGUL_T_JAMO = new UnicodeBreakType(33);
    
    /**
     * Hangul LV Syllable (H2)
     */
    public static final UnicodeBreakType HANGUL_LV_SYLLABLE = new UnicodeBreakType(34);
    
    /**
     * Hangul LVT Syllable (H3)
     */
    public static final UnicodeBreakType HANGUL_LVT_SYLLABLE = new UnicodeBreakType(35);
    
    /**
     * Closing Parenthesis (CP). Since 2.28. Deprecated: 2.70: Use {@link UnicodeBreakType#CLOSE_PARENTHESIS} instead.
     */
    public static final UnicodeBreakType CLOSE_PARANTHESIS = new UnicodeBreakType(36);
    
    /**
     * Closing Parenthesis (CP). Since 2.70
     */
    public static final UnicodeBreakType CLOSE_PARENTHESIS = new UnicodeBreakType(36);
    
    /**
     * Conditional Japanese Starter (CJ). Since: 2.32
     */
    public static final UnicodeBreakType CONDITIONAL_JAPANESE_STARTER = new UnicodeBreakType(37);
    
    /**
     * Hebrew Letter (HL). Since: 2.32
     */
    public static final UnicodeBreakType HEBREW_LETTER = new UnicodeBreakType(38);
    
    /**
     * Regional Indicator (RI). Since: 2.36
     */
    public static final UnicodeBreakType REGIONAL_INDICATOR = new UnicodeBreakType(39);
    
    /**
     * Emoji Base (EB). Since: 2.50
     */
    public static final UnicodeBreakType EMOJI_BASE = new UnicodeBreakType(40);
    
    /**
     * Emoji Modifier (EM). Since: 2.50
     */
    public static final UnicodeBreakType EMOJI_MODIFIER = new UnicodeBreakType(41);
    
    /**
     * Zero Width Joiner (ZWJ). Since: 2.50
     */
    public static final UnicodeBreakType ZERO_WIDTH_JOINER = new UnicodeBreakType(42);
    
    public UnicodeBreakType(int value) {
        super(value);
    }
}
