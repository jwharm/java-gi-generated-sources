package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for the "General_Category" (gc) property from
 * the Unicode Character Database.
 */
public enum UnicodeGeneralCategoryT implements io.github.jwharm.javagi.Enumeration {
    /**
     * [Cc]
     */
    CONTROL(0),
    /**
     * [Cf]
     */
    FORMAT(1),
    /**
     * [Cn]
     */
    UNASSIGNED(2),
    /**
     * [Co]
     */
    PRIVATE_USE(3),
    /**
     * [Cs]
     */
    SURROGATE(4),
    /**
     * [Ll]
     */
    LOWERCASE_LETTER(5),
    /**
     * [Lm]
     */
    MODIFIER_LETTER(6),
    /**
     * [Lo]
     */
    OTHER_LETTER(7),
    /**
     * [Lt]
     */
    TITLECASE_LETTER(8),
    /**
     * [Lu]
     */
    UPPERCASE_LETTER(9),
    /**
     * [Mc]
     */
    SPACING_MARK(10),
    /**
     * [Me]
     */
    ENCLOSING_MARK(11),
    /**
     * [Mn]
     */
    NON_SPACING_MARK(12),
    /**
     * [Nd]
     */
    DECIMAL_NUMBER(13),
    /**
     * [Nl]
     */
    LETTER_NUMBER(14),
    /**
     * [No]
     */
    OTHER_NUMBER(15),
    /**
     * [Pc]
     */
    CONNECT_PUNCTUATION(16),
    /**
     * [Pd]
     */
    DASH_PUNCTUATION(17),
    /**
     * [Pe]
     */
    CLOSE_PUNCTUATION(18),
    /**
     * [Pf]
     */
    FINAL_PUNCTUATION(19),
    /**
     * [Pi]
     */
    INITIAL_PUNCTUATION(20),
    /**
     * [Po]
     */
    OTHER_PUNCTUATION(21),
    /**
     * [Ps]
     */
    OPEN_PUNCTUATION(22),
    /**
     * [Sc]
     */
    CURRENCY_SYMBOL(23),
    /**
     * [Sk]
     */
    MODIFIER_SYMBOL(24),
    /**
     * [Sm]
     */
    MATH_SYMBOL(25),
    /**
     * [So]
     */
    OTHER_SYMBOL(26),
    /**
     * [Zl]
     */
    LINE_SEPARATOR(27),
    /**
     * [Zp]
     */
    PARAGRAPH_SEPARATOR(28),
    /**
     * [Zs]
     */
    SPACE_SEPARATOR(29);
    
    private static final java.lang.String C_TYPE_NAME = "hb_unicode_general_category_t";
    
    private final int value;
    UnicodeGeneralCategoryT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static UnicodeGeneralCategoryT of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
