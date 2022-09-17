package org.harfbuzz;

/**
 * Data type for the Canonical_Combining_Class (ccc) property
 * from the Unicode Character Database.
 * 
 * &#60;note&#62;Note: newer versions of Unicode may add new values.
 * Client programs should be ready to handle any value in the 0..254 range
 * being returned from hb_unicode_combining_class().&#60;/note&#62;
 */
public enum UnicodeCombiningClassT {

    /**
     * Spacing and enclosing marks; also many vowel and consonant signs, even if nonspacing
     */
    NOT_REORDERED,
    
    /**
     * Marks which overlay a base letter or symbol
     */
    OVERLAY,
    
    /**
     * Diacritic nukta marks in Brahmi-derived scripts
     */
    NUKTA,
    
    /**
     * Hiragana/Katakana voicing marks
     */
    KANA_VOICING,
    
    /**
     * Viramas
     */
    VIRAMA,
    
    /**
     * {@link [Hebrew]}
     */
    CCC10,
    
    /**
     * {@link [Hebrew]}
     */
    CCC11,
    
    /**
     * {@link [Hebrew]}
     */
    CCC12,
    
    /**
     * {@link [Hebrew]}
     */
    CCC13,
    
    /**
     * {@link [Hebrew]}
     */
    CCC14,
    
    /**
     * {@link [Hebrew]}
     */
    CCC15,
    
    /**
     * {@link [Hebrew]}
     */
    CCC16,
    
    /**
     * {@link [Hebrew]}
     */
    CCC17,
    
    /**
     * {@link [Hebrew]}
     */
    CCC18,
    
    /**
     * {@link [Hebrew]}
     */
    CCC19,
    
    /**
     * {@link [Hebrew]}
     */
    CCC20,
    
    /**
     * {@link [Hebrew]}
     */
    CCC21,
    
    /**
     * {@link [Hebrew]}
     */
    CCC22,
    
    /**
     * {@link [Hebrew]}
     */
    CCC23,
    
    /**
     * {@link [Hebrew]}
     */
    CCC24,
    
    /**
     * {@link [Hebrew]}
     */
    CCC25,
    
    /**
     * {@link [Hebrew]}
     */
    CCC26,
    
    /**
     * {@link [Arabic]}
     */
    CCC27,
    
    /**
     * {@link [Arabic]}
     */
    CCC28,
    
    /**
     * {@link [Arabic]}
     */
    CCC29,
    
    /**
     * {@link [Arabic]}
     */
    CCC30,
    
    /**
     * {@link [Arabic]}
     */
    CCC31,
    
    /**
     * {@link [Arabic]}
     */
    CCC32,
    
    /**
     * {@link [Arabic]}
     */
    CCC33,
    
    /**
     * {@link [Arabic]}
     */
    CCC34,
    
    /**
     * {@link [Arabic]}
     */
    CCC35,
    
    /**
     * {@link [Syriac]}
     */
    CCC36,
    
    /**
     * {@link [Telugu]}
     */
    CCC84,
    
    /**
     * {@link [Telugu]}
     */
    CCC91,
    
    /**
     * {@link [Thai]}
     */
    CCC103,
    
    /**
     * {@link [Thai]}
     */
    CCC107,
    
    /**
     * {@link [Lao]}
     */
    CCC118,
    
    /**
     * {@link [Lao]}
     */
    CCC122,
    
    /**
     * {@link [Tibetan]}
     */
    CCC129,
    
    /**
     * {@link [Tibetan]}
     */
    CCC130,
    
    /**
     * {@link [Tibetan]}
     */
    CCC133,
    
    /**
     * Marks attached at the bottom left
     */
    ATTACHED_BELOW_LEFT,
    
    /**
     * Marks attached directly below
     */
    ATTACHED_BELOW,
    
    /**
     * Marks attached directly above
     */
    ATTACHED_ABOVE,
    
    /**
     * Marks attached at the top right
     */
    ATTACHED_ABOVE_RIGHT,
    
    /**
     * Distinct marks at the bottom left
     */
    BELOW_LEFT,
    
    /**
     * Distinct marks directly below
     */
    BELOW,
    
    /**
     * Distinct marks at the bottom right
     */
    BELOW_RIGHT,
    
    /**
     * Distinct marks to the left
     */
    LEFT,
    
    /**
     * Distinct marks to the right
     */
    RIGHT,
    
    /**
     * Distinct marks at the top left
     */
    ABOVE_LEFT,
    
    /**
     * Distinct marks directly above
     */
    ABOVE,
    
    /**
     * Distinct marks at the top right
     */
    ABOVE_RIGHT,
    
    /**
     * Distinct marks subtending two bases
     */
    DOUBLE_BELOW,
    
    /**
     * Distinct marks extending above two bases
     */
    DOUBLE_ABOVE,
    
    /**
     * Greek iota subscript only
     */
    IOTA_SUBSCRIPT,
    
    /**
     * Invalid combining class
     */
    INVALID;
    
    public static UnicodeCombiningClassT fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_REORDERED;
            case 1 -> OVERLAY;
            case 7 -> NUKTA;
            case 8 -> KANA_VOICING;
            case 9 -> VIRAMA;
            case 10 -> CCC10;
            case 11 -> CCC11;
            case 12 -> CCC12;
            case 13 -> CCC13;
            case 14 -> CCC14;
            case 15 -> CCC15;
            case 16 -> CCC16;
            case 17 -> CCC17;
            case 18 -> CCC18;
            case 19 -> CCC19;
            case 20 -> CCC20;
            case 21 -> CCC21;
            case 22 -> CCC22;
            case 23 -> CCC23;
            case 24 -> CCC24;
            case 25 -> CCC25;
            case 26 -> CCC26;
            case 27 -> CCC27;
            case 28 -> CCC28;
            case 29 -> CCC29;
            case 30 -> CCC30;
            case 31 -> CCC31;
            case 32 -> CCC32;
            case 33 -> CCC33;
            case 34 -> CCC34;
            case 35 -> CCC35;
            case 36 -> CCC36;
            case 84 -> CCC84;
            case 91 -> CCC91;
            case 103 -> CCC103;
            case 107 -> CCC107;
            case 118 -> CCC118;
            case 122 -> CCC122;
            case 129 -> CCC129;
            case 130 -> CCC130;
            case 132 -> CCC133;
            case 200 -> ATTACHED_BELOW_LEFT;
            case 202 -> ATTACHED_BELOW;
            case 214 -> ATTACHED_ABOVE;
            case 216 -> ATTACHED_ABOVE_RIGHT;
            case 218 -> BELOW_LEFT;
            case 220 -> BELOW;
            case 222 -> BELOW_RIGHT;
            case 224 -> LEFT;
            case 226 -> RIGHT;
            case 228 -> ABOVE_LEFT;
            case 230 -> ABOVE;
            case 232 -> ABOVE_RIGHT;
            case 233 -> DOUBLE_BELOW;
            case 234 -> DOUBLE_ABOVE;
            case 240 -> IOTA_SUBSCRIPT;
            case 255 -> INVALID;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_REORDERED -> 0;
            case OVERLAY -> 1;
            case NUKTA -> 7;
            case KANA_VOICING -> 8;
            case VIRAMA -> 9;
            case CCC10 -> 10;
            case CCC11 -> 11;
            case CCC12 -> 12;
            case CCC13 -> 13;
            case CCC14 -> 14;
            case CCC15 -> 15;
            case CCC16 -> 16;
            case CCC17 -> 17;
            case CCC18 -> 18;
            case CCC19 -> 19;
            case CCC20 -> 20;
            case CCC21 -> 21;
            case CCC22 -> 22;
            case CCC23 -> 23;
            case CCC24 -> 24;
            case CCC25 -> 25;
            case CCC26 -> 26;
            case CCC27 -> 27;
            case CCC28 -> 28;
            case CCC29 -> 29;
            case CCC30 -> 30;
            case CCC31 -> 31;
            case CCC32 -> 32;
            case CCC33 -> 33;
            case CCC34 -> 34;
            case CCC35 -> 35;
            case CCC36 -> 36;
            case CCC84 -> 84;
            case CCC91 -> 91;
            case CCC103 -> 103;
            case CCC107 -> 107;
            case CCC118 -> 118;
            case CCC122 -> 122;
            case CCC129 -> 129;
            case CCC130 -> 130;
            case CCC133 -> 132;
            case ATTACHED_BELOW_LEFT -> 200;
            case ATTACHED_BELOW -> 202;
            case ATTACHED_ABOVE -> 214;
            case ATTACHED_ABOVE_RIGHT -> 216;
            case BELOW_LEFT -> 218;
            case BELOW -> 220;
            case BELOW_RIGHT -> 222;
            case LEFT -> 224;
            case RIGHT -> 226;
            case ABOVE_LEFT -> 228;
            case ABOVE -> 230;
            case ABOVE_RIGHT -> 232;
            case DOUBLE_BELOW -> 233;
            case DOUBLE_ABOVE -> 234;
            case IOTA_SUBSCRIPT -> 240;
            case INVALID -> 255;
        };
    }

}
