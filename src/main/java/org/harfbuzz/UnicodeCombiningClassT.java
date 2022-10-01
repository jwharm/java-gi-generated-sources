package org.harfbuzz;

/**
 * Data type for the Canonical_Combining_Class (ccc) property
 * from the Unicode Character Database.
 * <p>
 * &lt;note&gt;Note: newer versions of Unicode may add new values.
 * Client programs should be ready to handle any value in the 0..254 range
 * being returned from hb_unicode_combining_class().&lt;/note&gt;
 */
public class UnicodeCombiningClassT extends io.github.jwharm.javagi.Enumeration {

    /**
     * Spacing and enclosing marks; also many vowel and consonant signs, even if nonspacing
     */
    public static final UnicodeCombiningClassT NOT_REORDERED = new UnicodeCombiningClassT(0);
    
    /**
     * Marks which overlay a base letter or symbol
     */
    public static final UnicodeCombiningClassT OVERLAY = new UnicodeCombiningClassT(1);
    
    /**
     * Diacritic nukta marks in Brahmi-derived scripts
     */
    public static final UnicodeCombiningClassT NUKTA = new UnicodeCombiningClassT(7);
    
    /**
     * Hiragana/Katakana voicing marks
     */
    public static final UnicodeCombiningClassT KANA_VOICING = new UnicodeCombiningClassT(8);
    
    /**
     * Viramas
     */
    public static final UnicodeCombiningClassT VIRAMA = new UnicodeCombiningClassT(9);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC10 = new UnicodeCombiningClassT(10);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC11 = new UnicodeCombiningClassT(11);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC12 = new UnicodeCombiningClassT(12);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC13 = new UnicodeCombiningClassT(13);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC14 = new UnicodeCombiningClassT(14);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC15 = new UnicodeCombiningClassT(15);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC16 = new UnicodeCombiningClassT(16);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC17 = new UnicodeCombiningClassT(17);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC18 = new UnicodeCombiningClassT(18);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC19 = new UnicodeCombiningClassT(19);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC20 = new UnicodeCombiningClassT(20);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC21 = new UnicodeCombiningClassT(21);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC22 = new UnicodeCombiningClassT(22);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC23 = new UnicodeCombiningClassT(23);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC24 = new UnicodeCombiningClassT(24);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC25 = new UnicodeCombiningClassT(25);
    
    /**
     * [Hebrew]
     */
    public static final UnicodeCombiningClassT CCC26 = new UnicodeCombiningClassT(26);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC27 = new UnicodeCombiningClassT(27);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC28 = new UnicodeCombiningClassT(28);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC29 = new UnicodeCombiningClassT(29);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC30 = new UnicodeCombiningClassT(30);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC31 = new UnicodeCombiningClassT(31);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC32 = new UnicodeCombiningClassT(32);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC33 = new UnicodeCombiningClassT(33);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC34 = new UnicodeCombiningClassT(34);
    
    /**
     * [Arabic]
     */
    public static final UnicodeCombiningClassT CCC35 = new UnicodeCombiningClassT(35);
    
    /**
     * [Syriac]
     */
    public static final UnicodeCombiningClassT CCC36 = new UnicodeCombiningClassT(36);
    
    /**
     * [Telugu]
     */
    public static final UnicodeCombiningClassT CCC84 = new UnicodeCombiningClassT(84);
    
    /**
     * [Telugu]
     */
    public static final UnicodeCombiningClassT CCC91 = new UnicodeCombiningClassT(91);
    
    /**
     * [Thai]
     */
    public static final UnicodeCombiningClassT CCC103 = new UnicodeCombiningClassT(103);
    
    /**
     * [Thai]
     */
    public static final UnicodeCombiningClassT CCC107 = new UnicodeCombiningClassT(107);
    
    /**
     * [Lao]
     */
    public static final UnicodeCombiningClassT CCC118 = new UnicodeCombiningClassT(118);
    
    /**
     * [Lao]
     */
    public static final UnicodeCombiningClassT CCC122 = new UnicodeCombiningClassT(122);
    
    /**
     * [Tibetan]
     */
    public static final UnicodeCombiningClassT CCC129 = new UnicodeCombiningClassT(129);
    
    /**
     * [Tibetan]
     */
    public static final UnicodeCombiningClassT CCC130 = new UnicodeCombiningClassT(130);
    
    /**
     * [Tibetan]
     */
    public static final UnicodeCombiningClassT CCC133 = new UnicodeCombiningClassT(132);
    
    /**
     * Marks attached at the bottom left
     */
    public static final UnicodeCombiningClassT ATTACHED_BELOW_LEFT = new UnicodeCombiningClassT(200);
    
    /**
     * Marks attached directly below
     */
    public static final UnicodeCombiningClassT ATTACHED_BELOW = new UnicodeCombiningClassT(202);
    
    /**
     * Marks attached directly above
     */
    public static final UnicodeCombiningClassT ATTACHED_ABOVE = new UnicodeCombiningClassT(214);
    
    /**
     * Marks attached at the top right
     */
    public static final UnicodeCombiningClassT ATTACHED_ABOVE_RIGHT = new UnicodeCombiningClassT(216);
    
    /**
     * Distinct marks at the bottom left
     */
    public static final UnicodeCombiningClassT BELOW_LEFT = new UnicodeCombiningClassT(218);
    
    /**
     * Distinct marks directly below
     */
    public static final UnicodeCombiningClassT BELOW = new UnicodeCombiningClassT(220);
    
    /**
     * Distinct marks at the bottom right
     */
    public static final UnicodeCombiningClassT BELOW_RIGHT = new UnicodeCombiningClassT(222);
    
    /**
     * Distinct marks to the left
     */
    public static final UnicodeCombiningClassT LEFT = new UnicodeCombiningClassT(224);
    
    /**
     * Distinct marks to the right
     */
    public static final UnicodeCombiningClassT RIGHT = new UnicodeCombiningClassT(226);
    
    /**
     * Distinct marks at the top left
     */
    public static final UnicodeCombiningClassT ABOVE_LEFT = new UnicodeCombiningClassT(228);
    
    /**
     * Distinct marks directly above
     */
    public static final UnicodeCombiningClassT ABOVE = new UnicodeCombiningClassT(230);
    
    /**
     * Distinct marks at the top right
     */
    public static final UnicodeCombiningClassT ABOVE_RIGHT = new UnicodeCombiningClassT(232);
    
    /**
     * Distinct marks subtending two bases
     */
    public static final UnicodeCombiningClassT DOUBLE_BELOW = new UnicodeCombiningClassT(233);
    
    /**
     * Distinct marks extending above two bases
     */
    public static final UnicodeCombiningClassT DOUBLE_ABOVE = new UnicodeCombiningClassT(234);
    
    /**
     * Greek iota subscript only
     */
    public static final UnicodeCombiningClassT IOTA_SUBSCRIPT = new UnicodeCombiningClassT(240);
    
    /**
     * Invalid combining class
     */
    public static final UnicodeCombiningClassT INVALID = new UnicodeCombiningClassT(255);
    
    public UnicodeCombiningClassT(int value) {
        super(value);
    }
    
}
