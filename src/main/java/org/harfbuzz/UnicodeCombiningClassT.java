package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for the Canonical_Combining_Class (ccc) property
 * from the Unicode Character Database.
 * <p>
 * &lt;note&gt;Note: newer versions of Unicode may add new values.
 * Client programs should be ready to handle any value in the 0..254 range
 * being returned from hb_unicode_combining_class().&lt;/note&gt;
 */
public enum UnicodeCombiningClassT implements io.github.jwharm.javagi.Enumeration {
    /**
     * Spacing and enclosing marks; also many vowel and consonant signs, even if nonspacing
     */
    NOT_REORDERED(0),
    /**
     * Marks which overlay a base letter or symbol
     */
    OVERLAY(1),
    /**
     * Diacritic nukta marks in Brahmi-derived scripts
     */
    NUKTA(7),
    /**
     * Hiragana/Katakana voicing marks
     */
    KANA_VOICING(8),
    /**
     * Viramas
     */
    VIRAMA(9),
    /**
     * [Hebrew]
     */
    CCC10(10),
    /**
     * [Hebrew]
     */
    CCC11(11),
    /**
     * [Hebrew]
     */
    CCC12(12),
    /**
     * [Hebrew]
     */
    CCC13(13),
    /**
     * [Hebrew]
     */
    CCC14(14),
    /**
     * [Hebrew]
     */
    CCC15(15),
    /**
     * [Hebrew]
     */
    CCC16(16),
    /**
     * [Hebrew]
     */
    CCC17(17),
    /**
     * [Hebrew]
     */
    CCC18(18),
    /**
     * [Hebrew]
     */
    CCC19(19),
    /**
     * [Hebrew]
     */
    CCC20(20),
    /**
     * [Hebrew]
     */
    CCC21(21),
    /**
     * [Hebrew]
     */
    CCC22(22),
    /**
     * [Hebrew]
     */
    CCC23(23),
    /**
     * [Hebrew]
     */
    CCC24(24),
    /**
     * [Hebrew]
     */
    CCC25(25),
    /**
     * [Hebrew]
     */
    CCC26(26),
    /**
     * [Arabic]
     */
    CCC27(27),
    /**
     * [Arabic]
     */
    CCC28(28),
    /**
     * [Arabic]
     */
    CCC29(29),
    /**
     * [Arabic]
     */
    CCC30(30),
    /**
     * [Arabic]
     */
    CCC31(31),
    /**
     * [Arabic]
     */
    CCC32(32),
    /**
     * [Arabic]
     */
    CCC33(33),
    /**
     * [Arabic]
     */
    CCC34(34),
    /**
     * [Arabic]
     */
    CCC35(35),
    /**
     * [Syriac]
     */
    CCC36(36),
    /**
     * [Telugu]
     */
    CCC84(84),
    /**
     * [Telugu]
     */
    CCC91(91),
    /**
     * [Thai]
     */
    CCC103(103),
    /**
     * [Thai]
     */
    CCC107(107),
    /**
     * [Lao]
     */
    CCC118(118),
    /**
     * [Lao]
     */
    CCC122(122),
    /**
     * [Tibetan]
     */
    CCC129(129),
    /**
     * [Tibetan]
     */
    CCC130(130),
    /**
     * [Tibetan]
     */
    CCC133(132),
    /**
     * Marks attached at the bottom left
     */
    ATTACHED_BELOW_LEFT(200),
    /**
     * Marks attached directly below
     */
    ATTACHED_BELOW(202),
    /**
     * Marks attached directly above
     */
    ATTACHED_ABOVE(214),
    /**
     * Marks attached at the top right
     */
    ATTACHED_ABOVE_RIGHT(216),
    /**
     * Distinct marks at the bottom left
     */
    BELOW_LEFT(218),
    /**
     * Distinct marks directly below
     */
    BELOW(220),
    /**
     * Distinct marks at the bottom right
     */
    BELOW_RIGHT(222),
    /**
     * Distinct marks to the left
     */
    LEFT(224),
    /**
     * Distinct marks to the right
     */
    RIGHT(226),
    /**
     * Distinct marks at the top left
     */
    ABOVE_LEFT(228),
    /**
     * Distinct marks directly above
     */
    ABOVE(230),
    /**
     * Distinct marks at the top right
     */
    ABOVE_RIGHT(232),
    /**
     * Distinct marks subtending two bases
     */
    DOUBLE_BELOW(233),
    /**
     * Distinct marks extending above two bases
     */
    DOUBLE_ABOVE(234),
    /**
     * Greek iota subscript only
     */
    IOTA_SUBSCRIPT(240),
    /**
     * Invalid combining class
     */
    INVALID(255);
    
    private static final java.lang.String C_TYPE_NAME = "hb_unicode_combining_class_t";
    
    private final int value;
    UnicodeCombiningClassT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static UnicodeCombiningClassT of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
