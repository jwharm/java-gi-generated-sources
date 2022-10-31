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
public class UnicodeType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GUnicodeType";
    
    /**
     * General category "Other, Control" (Cc)
     */
    public static final UnicodeType CONTROL = new UnicodeType(0);
    
    /**
     * General category "Other, Format" (Cf)
     */
    public static final UnicodeType FORMAT = new UnicodeType(1);
    
    /**
     * General category "Other, Not Assigned" (Cn)
     */
    public static final UnicodeType UNASSIGNED = new UnicodeType(2);
    
    /**
     * General category "Other, Private Use" (Co)
     */
    public static final UnicodeType PRIVATE_USE = new UnicodeType(3);
    
    /**
     * General category "Other, Surrogate" (Cs)
     */
    public static final UnicodeType SURROGATE = new UnicodeType(4);
    
    /**
     * General category "Letter, Lowercase" (Ll)
     */
    public static final UnicodeType LOWERCASE_LETTER = new UnicodeType(5);
    
    /**
     * General category "Letter, Modifier" (Lm)
     */
    public static final UnicodeType MODIFIER_LETTER = new UnicodeType(6);
    
    /**
     * General category "Letter, Other" (Lo)
     */
    public static final UnicodeType OTHER_LETTER = new UnicodeType(7);
    
    /**
     * General category "Letter, Titlecase" (Lt)
     */
    public static final UnicodeType TITLECASE_LETTER = new UnicodeType(8);
    
    /**
     * General category "Letter, Uppercase" (Lu)
     */
    public static final UnicodeType UPPERCASE_LETTER = new UnicodeType(9);
    
    /**
     * General category "Mark, Spacing" (Mc)
     */
    public static final UnicodeType SPACING_MARK = new UnicodeType(10);
    
    /**
     * General category "Mark, Enclosing" (Me)
     */
    public static final UnicodeType ENCLOSING_MARK = new UnicodeType(11);
    
    /**
     * General category "Mark, Nonspacing" (Mn)
     */
    public static final UnicodeType NON_SPACING_MARK = new UnicodeType(12);
    
    /**
     * General category "Number, Decimal Digit" (Nd)
     */
    public static final UnicodeType DECIMAL_NUMBER = new UnicodeType(13);
    
    /**
     * General category "Number, Letter" (Nl)
     */
    public static final UnicodeType LETTER_NUMBER = new UnicodeType(14);
    
    /**
     * General category "Number, Other" (No)
     */
    public static final UnicodeType OTHER_NUMBER = new UnicodeType(15);
    
    /**
     * General category "Punctuation, Connector" (Pc)
     */
    public static final UnicodeType CONNECT_PUNCTUATION = new UnicodeType(16);
    
    /**
     * General category "Punctuation, Dash" (Pd)
     */
    public static final UnicodeType DASH_PUNCTUATION = new UnicodeType(17);
    
    /**
     * General category "Punctuation, Close" (Pe)
     */
    public static final UnicodeType CLOSE_PUNCTUATION = new UnicodeType(18);
    
    /**
     * General category "Punctuation, Final quote" (Pf)
     */
    public static final UnicodeType FINAL_PUNCTUATION = new UnicodeType(19);
    
    /**
     * General category "Punctuation, Initial quote" (Pi)
     */
    public static final UnicodeType INITIAL_PUNCTUATION = new UnicodeType(20);
    
    /**
     * General category "Punctuation, Other" (Po)
     */
    public static final UnicodeType OTHER_PUNCTUATION = new UnicodeType(21);
    
    /**
     * General category "Punctuation, Open" (Ps)
     */
    public static final UnicodeType OPEN_PUNCTUATION = new UnicodeType(22);
    
    /**
     * General category "Symbol, Currency" (Sc)
     */
    public static final UnicodeType CURRENCY_SYMBOL = new UnicodeType(23);
    
    /**
     * General category "Symbol, Modifier" (Sk)
     */
    public static final UnicodeType MODIFIER_SYMBOL = new UnicodeType(24);
    
    /**
     * General category "Symbol, Math" (Sm)
     */
    public static final UnicodeType MATH_SYMBOL = new UnicodeType(25);
    
    /**
     * General category "Symbol, Other" (So)
     */
    public static final UnicodeType OTHER_SYMBOL = new UnicodeType(26);
    
    /**
     * General category "Separator, Line" (Zl)
     */
    public static final UnicodeType LINE_SEPARATOR = new UnicodeType(27);
    
    /**
     * General category "Separator, Paragraph" (Zp)
     */
    public static final UnicodeType PARAGRAPH_SEPARATOR = new UnicodeType(28);
    
    /**
     * General category "Separator, Space" (Zs)
     */
    public static final UnicodeType SPACE_SEPARATOR = new UnicodeType(29);
    
    public UnicodeType(int value) {
        super(value);
    }
}
