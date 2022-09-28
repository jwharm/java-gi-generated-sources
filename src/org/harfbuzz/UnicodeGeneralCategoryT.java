package org.harfbuzz;

/**
 * Data type for the "General_Category" (gc) property from
 * the Unicode Character Database.
 */
public class UnicodeGeneralCategoryT {

    /**
     * [Cc]
     */
    public static final UnicodeGeneralCategoryT CONTROL = new UnicodeGeneralCategoryT(0);
    
    /**
     * [Cf]
     */
    public static final UnicodeGeneralCategoryT FORMAT = new UnicodeGeneralCategoryT(1);
    
    /**
     * [Cn]
     */
    public static final UnicodeGeneralCategoryT UNASSIGNED = new UnicodeGeneralCategoryT(2);
    
    /**
     * [Co]
     */
    public static final UnicodeGeneralCategoryT PRIVATE_USE = new UnicodeGeneralCategoryT(3);
    
    /**
     * [Cs]
     */
    public static final UnicodeGeneralCategoryT SURROGATE = new UnicodeGeneralCategoryT(4);
    
    /**
     * [Ll]
     */
    public static final UnicodeGeneralCategoryT LOWERCASE_LETTER = new UnicodeGeneralCategoryT(5);
    
    /**
     * [Lm]
     */
    public static final UnicodeGeneralCategoryT MODIFIER_LETTER = new UnicodeGeneralCategoryT(6);
    
    /**
     * [Lo]
     */
    public static final UnicodeGeneralCategoryT OTHER_LETTER = new UnicodeGeneralCategoryT(7);
    
    /**
     * [Lt]
     */
    public static final UnicodeGeneralCategoryT TITLECASE_LETTER = new UnicodeGeneralCategoryT(8);
    
    /**
     * [Lu]
     */
    public static final UnicodeGeneralCategoryT UPPERCASE_LETTER = new UnicodeGeneralCategoryT(9);
    
    /**
     * [Mc]
     */
    public static final UnicodeGeneralCategoryT SPACING_MARK = new UnicodeGeneralCategoryT(10);
    
    /**
     * [Me]
     */
    public static final UnicodeGeneralCategoryT ENCLOSING_MARK = new UnicodeGeneralCategoryT(11);
    
    /**
     * [Mn]
     */
    public static final UnicodeGeneralCategoryT NON_SPACING_MARK = new UnicodeGeneralCategoryT(12);
    
    /**
     * [Nd]
     */
    public static final UnicodeGeneralCategoryT DECIMAL_NUMBER = new UnicodeGeneralCategoryT(13);
    
    /**
     * [Nl]
     */
    public static final UnicodeGeneralCategoryT LETTER_NUMBER = new UnicodeGeneralCategoryT(14);
    
    /**
     * [No]
     */
    public static final UnicodeGeneralCategoryT OTHER_NUMBER = new UnicodeGeneralCategoryT(15);
    
    /**
     * [Pc]
     */
    public static final UnicodeGeneralCategoryT CONNECT_PUNCTUATION = new UnicodeGeneralCategoryT(16);
    
    /**
     * [Pd]
     */
    public static final UnicodeGeneralCategoryT DASH_PUNCTUATION = new UnicodeGeneralCategoryT(17);
    
    /**
     * [Pe]
     */
    public static final UnicodeGeneralCategoryT CLOSE_PUNCTUATION = new UnicodeGeneralCategoryT(18);
    
    /**
     * [Pf]
     */
    public static final UnicodeGeneralCategoryT FINAL_PUNCTUATION = new UnicodeGeneralCategoryT(19);
    
    /**
     * [Pi]
     */
    public static final UnicodeGeneralCategoryT INITIAL_PUNCTUATION = new UnicodeGeneralCategoryT(20);
    
    /**
     * [Po]
     */
    public static final UnicodeGeneralCategoryT OTHER_PUNCTUATION = new UnicodeGeneralCategoryT(21);
    
    /**
     * [Ps]
     */
    public static final UnicodeGeneralCategoryT OPEN_PUNCTUATION = new UnicodeGeneralCategoryT(22);
    
    /**
     * [Sc]
     */
    public static final UnicodeGeneralCategoryT CURRENCY_SYMBOL = new UnicodeGeneralCategoryT(23);
    
    /**
     * [Sk]
     */
    public static final UnicodeGeneralCategoryT MODIFIER_SYMBOL = new UnicodeGeneralCategoryT(24);
    
    /**
     * [Sm]
     */
    public static final UnicodeGeneralCategoryT MATH_SYMBOL = new UnicodeGeneralCategoryT(25);
    
    /**
     * [So]
     */
    public static final UnicodeGeneralCategoryT OTHER_SYMBOL = new UnicodeGeneralCategoryT(26);
    
    /**
     * [Zl]
     */
    public static final UnicodeGeneralCategoryT LINE_SEPARATOR = new UnicodeGeneralCategoryT(27);
    
    /**
     * [Zp]
     */
    public static final UnicodeGeneralCategoryT PARAGRAPH_SEPARATOR = new UnicodeGeneralCategoryT(28);
    
    /**
     * [Zs]
     */
    public static final UnicodeGeneralCategoryT SPACE_SEPARATOR = new UnicodeGeneralCategoryT(29);
    
    private int value;
    
    public UnicodeGeneralCategoryT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(UnicodeGeneralCategoryT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
