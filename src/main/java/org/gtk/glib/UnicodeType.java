package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These are the possible character classifications from the
 * Unicode specification.
 * See <a href="http://www.unicode.org/reports/tr44/#General_Category_Values">Unicode Character Database</a>.
 */
public enum UnicodeType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * General category "Other, Control" (Cc)
     */
    CONTROL(0),
    
    /**
     * General category "Other, Format" (Cf)
     */
    FORMAT(1),
    
    /**
     * General category "Other, Not Assigned" (Cn)
     */
    UNASSIGNED(2),
    
    /**
     * General category "Other, Private Use" (Co)
     */
    PRIVATE_USE(3),
    
    /**
     * General category "Other, Surrogate" (Cs)
     */
    SURROGATE(4),
    
    /**
     * General category "Letter, Lowercase" (Ll)
     */
    LOWERCASE_LETTER(5),
    
    /**
     * General category "Letter, Modifier" (Lm)
     */
    MODIFIER_LETTER(6),
    
    /**
     * General category "Letter, Other" (Lo)
     */
    OTHER_LETTER(7),
    
    /**
     * General category "Letter, Titlecase" (Lt)
     */
    TITLECASE_LETTER(8),
    
    /**
     * General category "Letter, Uppercase" (Lu)
     */
    UPPERCASE_LETTER(9),
    
    /**
     * General category "Mark, Spacing" (Mc)
     */
    SPACING_MARK(10),
    
    /**
     * General category "Mark, Enclosing" (Me)
     */
    ENCLOSING_MARK(11),
    
    /**
     * General category "Mark, Nonspacing" (Mn)
     */
    NON_SPACING_MARK(12),
    
    /**
     * General category "Number, Decimal Digit" (Nd)
     */
    DECIMAL_NUMBER(13),
    
    /**
     * General category "Number, Letter" (Nl)
     */
    LETTER_NUMBER(14),
    
    /**
     * General category "Number, Other" (No)
     */
    OTHER_NUMBER(15),
    
    /**
     * General category "Punctuation, Connector" (Pc)
     */
    CONNECT_PUNCTUATION(16),
    
    /**
     * General category "Punctuation, Dash" (Pd)
     */
    DASH_PUNCTUATION(17),
    
    /**
     * General category "Punctuation, Close" (Pe)
     */
    CLOSE_PUNCTUATION(18),
    
    /**
     * General category "Punctuation, Final quote" (Pf)
     */
    FINAL_PUNCTUATION(19),
    
    /**
     * General category "Punctuation, Initial quote" (Pi)
     */
    INITIAL_PUNCTUATION(20),
    
    /**
     * General category "Punctuation, Other" (Po)
     */
    OTHER_PUNCTUATION(21),
    
    /**
     * General category "Punctuation, Open" (Ps)
     */
    OPEN_PUNCTUATION(22),
    
    /**
     * General category "Symbol, Currency" (Sc)
     */
    CURRENCY_SYMBOL(23),
    
    /**
     * General category "Symbol, Modifier" (Sk)
     */
    MODIFIER_SYMBOL(24),
    
    /**
     * General category "Symbol, Math" (Sm)
     */
    MATH_SYMBOL(25),
    
    /**
     * General category "Symbol, Other" (So)
     */
    OTHER_SYMBOL(26),
    
    /**
     * General category "Separator, Line" (Zl)
     */
    LINE_SEPARATOR(27),
    
    /**
     * General category "Separator, Paragraph" (Zp)
     */
    PARAGRAPH_SEPARATOR(28),
    
    /**
     * General category "Separator, Space" (Zs)
     */
    SPACE_SEPARATOR(29);
    
    private static final java.lang.String C_TYPE_NAME = "GUnicodeType";
    
    private final int value;
    
    /**
     * Create a new UnicodeType for the provided value
     * @param numeric value the enum value
     */
    UnicodeType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new UnicodeType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static UnicodeType of(int value) {
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
