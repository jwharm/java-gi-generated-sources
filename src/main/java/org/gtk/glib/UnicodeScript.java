package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link UnicodeScript} enumeration identifies different writing
 * systems. The values correspond to the names as defined in the
 * Unicode standard. The enumeration has been added in GLib 2.14,
 * and is interchangeable with {@code PangoScript}.
 * <p>
 * Note that new types may be added in the future. Applications
 * should be ready to handle unknown values.
 * See <a href="http://www.unicode.org/reports/tr24/">Unicode Standard Annex #24: Script names</a>.
 */
public enum UnicodeScript implements io.github.jwharm.javagi.Enumeration {
    /**
     * a value never returned from g_unichar_get_script()
     */
    INVALID_CODE(-1),
    /**
     * a character used by multiple different scripts
     */
    COMMON(0),
    /**
     * a mark glyph that takes its script from the
     *                               base glyph to which it is attached
     */
    INHERITED(1),
    /**
     * Arabic
     */
    ARABIC(2),
    /**
     * Armenian
     */
    ARMENIAN(3),
    /**
     * Bengali
     */
    BENGALI(4),
    /**
     * Bopomofo
     */
    BOPOMOFO(5),
    /**
     * Cherokee
     */
    CHEROKEE(6),
    /**
     * Coptic
     */
    COPTIC(7),
    /**
     * Cyrillic
     */
    CYRILLIC(8),
    /**
     * Deseret
     */
    DESERET(9),
    /**
     * Devanagari
     */
    DEVANAGARI(10),
    /**
     * Ethiopic
     */
    ETHIOPIC(11),
    /**
     * Georgian
     */
    GEORGIAN(12),
    /**
     * Gothic
     */
    GOTHIC(13),
    /**
     * Greek
     */
    GREEK(14),
    /**
     * Gujarati
     */
    GUJARATI(15),
    /**
     * Gurmukhi
     */
    GURMUKHI(16),
    /**
     * Han
     */
    HAN(17),
    /**
     * Hangul
     */
    HANGUL(18),
    /**
     * Hebrew
     */
    HEBREW(19),
    /**
     * Hiragana
     */
    HIRAGANA(20),
    /**
     * Kannada
     */
    KANNADA(21),
    /**
     * Katakana
     */
    KATAKANA(22),
    /**
     * Khmer
     */
    KHMER(23),
    /**
     * Lao
     */
    LAO(24),
    /**
     * Latin
     */
    LATIN(25),
    /**
     * Malayalam
     */
    MALAYALAM(26),
    /**
     * Mongolian
     */
    MONGOLIAN(27),
    /**
     * Myanmar
     */
    MYANMAR(28),
    /**
     * Ogham
     */
    OGHAM(29),
    /**
     * Old Italic
     */
    OLD_ITALIC(30),
    /**
     * Oriya
     */
    ORIYA(31),
    /**
     * Runic
     */
    RUNIC(32),
    /**
     * Sinhala
     */
    SINHALA(33),
    /**
     * Syriac
     */
    SYRIAC(34),
    /**
     * Tamil
     */
    TAMIL(35),
    /**
     * Telugu
     */
    TELUGU(36),
    /**
     * Thaana
     */
    THAANA(37),
    /**
     * Thai
     */
    THAI(38),
    /**
     * Tibetan
     */
    TIBETAN(39),
    /**
     * Canadian Aboriginal
     */
    CANADIAN_ABORIGINAL(40),
    /**
     * Yi
     */
    YI(41),
    /**
     * Tagalog
     */
    TAGALOG(42),
    /**
     * Hanunoo
     */
    HANUNOO(43),
    /**
     * Buhid
     */
    BUHID(44),
    /**
     * Tagbanwa
     */
    TAGBANWA(45),
    /**
     * Braille
     */
    BRAILLE(46),
    /**
     * Cypriot
     */
    CYPRIOT(47),
    /**
     * Limbu
     */
    LIMBU(48),
    /**
     * Osmanya
     */
    OSMANYA(49),
    /**
     * Shavian
     */
    SHAVIAN(50),
    /**
     * Linear B
     */
    LINEAR_B(51),
    /**
     * Tai Le
     */
    TAI_LE(52),
    /**
     * Ugaritic
     */
    UGARITIC(53),
    /**
     * New Tai Lue
     */
    NEW_TAI_LUE(54),
    /**
     * Buginese
     */
    BUGINESE(55),
    /**
     * Glagolitic
     */
    GLAGOLITIC(56),
    /**
     * Tifinagh
     */
    TIFINAGH(57),
    /**
     * Syloti Nagri
     */
    SYLOTI_NAGRI(58),
    /**
     * Old Persian
     */
    OLD_PERSIAN(59),
    /**
     * Kharoshthi
     */
    KHAROSHTHI(60),
    /**
     * an unassigned code point
     */
    UNKNOWN(61),
    /**
     * Balinese
     */
    BALINESE(62),
    /**
     * Cuneiform
     */
    CUNEIFORM(63),
    /**
     * Phoenician
     */
    PHOENICIAN(64),
    /**
     * Phags-pa
     */
    PHAGS_PA(65),
    /**
     * N'Ko
     */
    NKO(66),
    /**
     * Kayah Li. Since 2.16.3
     */
    KAYAH_LI(67),
    /**
     * Lepcha. Since 2.16.3
     */
    LEPCHA(68),
    /**
     * Rejang. Since 2.16.3
     */
    REJANG(69),
    /**
     * Sundanese. Since 2.16.3
     */
    SUNDANESE(70),
    /**
     * Saurashtra. Since 2.16.3
     */
    SAURASHTRA(71),
    /**
     * Cham. Since 2.16.3
     */
    CHAM(72),
    /**
     * Ol Chiki. Since 2.16.3
     */
    OL_CHIKI(73),
    /**
     * Vai. Since 2.16.3
     */
    VAI(74),
    /**
     * Carian. Since 2.16.3
     */
    CARIAN(75),
    /**
     * Lycian. Since 2.16.3
     */
    LYCIAN(76),
    /**
     * Lydian. Since 2.16.3
     */
    LYDIAN(77),
    /**
     * Avestan. Since 2.26
     */
    AVESTAN(78),
    /**
     * Bamum. Since 2.26
     */
    BAMUM(79),
    /**
     * Egyptian Hieroglpyhs. Since 2.26
     */
    EGYPTIAN_HIEROGLYPHS(80),
    /**
     * Imperial Aramaic. Since 2.26
     */
    IMPERIAL_ARAMAIC(81),
    /**
     * Inscriptional Pahlavi. Since 2.26
     */
    INSCRIPTIONAL_PAHLAVI(82),
    /**
     * Inscriptional Parthian. Since 2.26
     */
    INSCRIPTIONAL_PARTHIAN(83),
    /**
     * Javanese. Since 2.26
     */
    JAVANESE(84),
    /**
     * Kaithi. Since 2.26
     */
    KAITHI(85),
    /**
     * Lisu. Since 2.26
     */
    LISU(86),
    /**
     * Meetei Mayek. Since 2.26
     */
    MEETEI_MAYEK(87),
    /**
     * Old South Arabian. Since 2.26
     */
    OLD_SOUTH_ARABIAN(88),
    /**
     * Old Turkic. Since 2.28
     */
    OLD_TURKIC(89),
    /**
     * Samaritan. Since 2.26
     */
    SAMARITAN(90),
    /**
     * Tai Tham. Since 2.26
     */
    TAI_THAM(91),
    /**
     * Tai Viet. Since 2.26
     */
    TAI_VIET(92),
    /**
     * Batak. Since 2.28
     */
    BATAK(93),
    /**
     * Brahmi. Since 2.28
     */
    BRAHMI(94),
    /**
     * Mandaic. Since 2.28
     */
    MANDAIC(95),
    /**
     * Chakma. Since: 2.32
     */
    CHAKMA(96),
    /**
     * Meroitic Cursive. Since: 2.32
     */
    MEROITIC_CURSIVE(97),
    /**
     * Meroitic Hieroglyphs. Since: 2.32
     */
    MEROITIC_HIEROGLYPHS(98),
    /**
     * Miao. Since: 2.32
     */
    MIAO(99),
    /**
     * Sharada. Since: 2.32
     */
    SHARADA(100),
    /**
     * Sora Sompeng. Since: 2.32
     */
    SORA_SOMPENG(101),
    /**
     * Takri. Since: 2.32
     */
    TAKRI(102),
    /**
     * Bassa. Since: 2.42
     */
    BASSA_VAH(103),
    /**
     * Caucasian Albanian. Since: 2.42
     */
    CAUCASIAN_ALBANIAN(104),
    /**
     * Duployan. Since: 2.42
     */
    DUPLOYAN(105),
    /**
     * Elbasan. Since: 2.42
     */
    ELBASAN(106),
    /**
     * Grantha. Since: 2.42
     */
    GRANTHA(107),
    /**
     * Kjohki. Since: 2.42
     */
    KHOJKI(108),
    /**
     * Khudawadi, Sindhi. Since: 2.42
     */
    KHUDAWADI(109),
    /**
     * Linear A. Since: 2.42
     */
    LINEAR_A(110),
    /**
     * Mahajani. Since: 2.42
     */
    MAHAJANI(111),
    /**
     * Manichaean. Since: 2.42
     */
    MANICHAEAN(112),
    /**
     * Mende Kikakui. Since: 2.42
     */
    MENDE_KIKAKUI(113),
    /**
     * Modi. Since: 2.42
     */
    MODI(114),
    /**
     * Mro. Since: 2.42
     */
    MRO(115),
    /**
     * Nabataean. Since: 2.42
     */
    NABATAEAN(116),
    /**
     * Old North Arabian. Since: 2.42
     */
    OLD_NORTH_ARABIAN(117),
    /**
     * Old Permic. Since: 2.42
     */
    OLD_PERMIC(118),
    /**
     * Pahawh Hmong. Since: 2.42
     */
    PAHAWH_HMONG(119),
    /**
     * Palmyrene. Since: 2.42
     */
    PALMYRENE(120),
    /**
     * Pau Cin Hau. Since: 2.42
     */
    PAU_CIN_HAU(121),
    /**
     * Psalter Pahlavi. Since: 2.42
     */
    PSALTER_PAHLAVI(122),
    /**
     * Siddham. Since: 2.42
     */
    SIDDHAM(123),
    /**
     * Tirhuta. Since: 2.42
     */
    TIRHUTA(124),
    /**
     * Warang Citi. Since: 2.42
     */
    WARANG_CITI(125),
    /**
     * Ahom. Since: 2.48
     */
    AHOM(126),
    /**
     * Anatolian Hieroglyphs. Since: 2.48
     */
    ANATOLIAN_HIEROGLYPHS(127),
    /**
     * Hatran. Since: 2.48
     */
    HATRAN(128),
    /**
     * Multani. Since: 2.48
     */
    MULTANI(129),
    /**
     * Old Hungarian. Since: 2.48
     */
    OLD_HUNGARIAN(130),
    /**
     * Signwriting. Since: 2.48
     */
    SIGNWRITING(131),
    /**
     * Adlam. Since: 2.50
     */
    ADLAM(132),
    /**
     * Bhaiksuki. Since: 2.50
     */
    BHAIKSUKI(133),
    /**
     * Marchen. Since: 2.50
     */
    MARCHEN(134),
    /**
     * Newa. Since: 2.50
     */
    NEWA(135),
    /**
     * Osage. Since: 2.50
     */
    OSAGE(136),
    /**
     * Tangut. Since: 2.50
     */
    TANGUT(137),
    /**
     * Masaram Gondi. Since: 2.54
     */
    MASARAM_GONDI(138),
    /**
     * Nushu. Since: 2.54
     */
    NUSHU(139),
    /**
     * Soyombo. Since: 2.54
     */
    SOYOMBO(140),
    /**
     * Zanabazar Square. Since: 2.54
     */
    ZANABAZAR_SQUARE(141),
    /**
     * Dogra. Since: 2.58
     */
    DOGRA(142),
    /**
     * Gunjala Gondi. Since: 2.58
     */
    GUNJALA_GONDI(143),
    /**
     * Hanifi Rohingya. Since: 2.58
     */
    HANIFI_ROHINGYA(144),
    /**
     * Makasar. Since: 2.58
     */
    MAKASAR(145),
    /**
     * Medefaidrin. Since: 2.58
     */
    MEDEFAIDRIN(146),
    /**
     * Old Sogdian. Since: 2.58
     */
    OLD_SOGDIAN(147),
    /**
     * Sogdian. Since: 2.58
     */
    SOGDIAN(148),
    /**
     * Elym. Since: 2.62
     */
    ELYMAIC(149),
    /**
     * Nand. Since: 2.62
     */
    NANDINAGARI(150),
    /**
     * Rohg. Since: 2.62
     */
    NYIAKENG_PUACHUE_HMONG(151),
    /**
     * Wcho. Since: 2.62
     */
    WANCHO(152),
    /**
     * Chorasmian. Since: 2.66
     */
    CHORASMIAN(153),
    /**
     * Dives Akuru. Since: 2.66
     */
    DIVES_AKURU(154),
    /**
     * Khitan small script. Since: 2.66
     */
    KHITAN_SMALL_SCRIPT(155),
    /**
     * Yezidi. Since: 2.66
     */
    YEZIDI(156),
    /**
     * Cypro-Minoan. Since: 2.72
     */
    CYPRO_MINOAN(157),
    /**
     * Old Uyghur. Since: 2.72
     */
    OLD_UYGHUR(158),
    /**
     * Tangsa. Since: 2.72
     */
    TANGSA(159),
    /**
     * Toto. Since: 2.72
     */
    TOTO(160),
    /**
     * Vithkuqi. Since: 2.72
     */
    VITHKUQI(161),
    /**
     * Mathematical notation. Since: 2.72
     */
    MATH(162);
    
    private static final java.lang.String C_TYPE_NAME = "GUnicodeScript";
    
    private final int value;
    UnicodeScript(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static UnicodeScript of(int value) {
        return switch (value) {
            case -1 -> INVALID_CODE;
            case 0 -> COMMON;
            case 1 -> INHERITED;
            case 2 -> ARABIC;
            case 3 -> ARMENIAN;
            case 4 -> BENGALI;
            case 5 -> BOPOMOFO;
            case 6 -> CHEROKEE;
            case 7 -> COPTIC;
            case 8 -> CYRILLIC;
            case 9 -> DESERET;
            case 10 -> DEVANAGARI;
            case 11 -> ETHIOPIC;
            case 12 -> GEORGIAN;
            case 13 -> GOTHIC;
            case 14 -> GREEK;
            case 15 -> GUJARATI;
            case 16 -> GURMUKHI;
            case 17 -> HAN;
            case 18 -> HANGUL;
            case 19 -> HEBREW;
            case 20 -> HIRAGANA;
            case 21 -> KANNADA;
            case 22 -> KATAKANA;
            case 23 -> KHMER;
            case 24 -> LAO;
            case 25 -> LATIN;
            case 26 -> MALAYALAM;
            case 27 -> MONGOLIAN;
            case 28 -> MYANMAR;
            case 29 -> OGHAM;
            case 30 -> OLD_ITALIC;
            case 31 -> ORIYA;
            case 32 -> RUNIC;
            case 33 -> SINHALA;
            case 34 -> SYRIAC;
            case 35 -> TAMIL;
            case 36 -> TELUGU;
            case 37 -> THAANA;
            case 38 -> THAI;
            case 39 -> TIBETAN;
            case 40 -> CANADIAN_ABORIGINAL;
            case 41 -> YI;
            case 42 -> TAGALOG;
            case 43 -> HANUNOO;
            case 44 -> BUHID;
            case 45 -> TAGBANWA;
            case 46 -> BRAILLE;
            case 47 -> CYPRIOT;
            case 48 -> LIMBU;
            case 49 -> OSMANYA;
            case 50 -> SHAVIAN;
            case 51 -> LINEAR_B;
            case 52 -> TAI_LE;
            case 53 -> UGARITIC;
            case 54 -> NEW_TAI_LUE;
            case 55 -> BUGINESE;
            case 56 -> GLAGOLITIC;
            case 57 -> TIFINAGH;
            case 58 -> SYLOTI_NAGRI;
            case 59 -> OLD_PERSIAN;
            case 60 -> KHAROSHTHI;
            case 61 -> UNKNOWN;
            case 62 -> BALINESE;
            case 63 -> CUNEIFORM;
            case 64 -> PHOENICIAN;
            case 65 -> PHAGS_PA;
            case 66 -> NKO;
            case 67 -> KAYAH_LI;
            case 68 -> LEPCHA;
            case 69 -> REJANG;
            case 70 -> SUNDANESE;
            case 71 -> SAURASHTRA;
            case 72 -> CHAM;
            case 73 -> OL_CHIKI;
            case 74 -> VAI;
            case 75 -> CARIAN;
            case 76 -> LYCIAN;
            case 77 -> LYDIAN;
            case 78 -> AVESTAN;
            case 79 -> BAMUM;
            case 80 -> EGYPTIAN_HIEROGLYPHS;
            case 81 -> IMPERIAL_ARAMAIC;
            case 82 -> INSCRIPTIONAL_PAHLAVI;
            case 83 -> INSCRIPTIONAL_PARTHIAN;
            case 84 -> JAVANESE;
            case 85 -> KAITHI;
            case 86 -> LISU;
            case 87 -> MEETEI_MAYEK;
            case 88 -> OLD_SOUTH_ARABIAN;
            case 89 -> OLD_TURKIC;
            case 90 -> SAMARITAN;
            case 91 -> TAI_THAM;
            case 92 -> TAI_VIET;
            case 93 -> BATAK;
            case 94 -> BRAHMI;
            case 95 -> MANDAIC;
            case 96 -> CHAKMA;
            case 97 -> MEROITIC_CURSIVE;
            case 98 -> MEROITIC_HIEROGLYPHS;
            case 99 -> MIAO;
            case 100 -> SHARADA;
            case 101 -> SORA_SOMPENG;
            case 102 -> TAKRI;
            case 103 -> BASSA_VAH;
            case 104 -> CAUCASIAN_ALBANIAN;
            case 105 -> DUPLOYAN;
            case 106 -> ELBASAN;
            case 107 -> GRANTHA;
            case 108 -> KHOJKI;
            case 109 -> KHUDAWADI;
            case 110 -> LINEAR_A;
            case 111 -> MAHAJANI;
            case 112 -> MANICHAEAN;
            case 113 -> MENDE_KIKAKUI;
            case 114 -> MODI;
            case 115 -> MRO;
            case 116 -> NABATAEAN;
            case 117 -> OLD_NORTH_ARABIAN;
            case 118 -> OLD_PERMIC;
            case 119 -> PAHAWH_HMONG;
            case 120 -> PALMYRENE;
            case 121 -> PAU_CIN_HAU;
            case 122 -> PSALTER_PAHLAVI;
            case 123 -> SIDDHAM;
            case 124 -> TIRHUTA;
            case 125 -> WARANG_CITI;
            case 126 -> AHOM;
            case 127 -> ANATOLIAN_HIEROGLYPHS;
            case 128 -> HATRAN;
            case 129 -> MULTANI;
            case 130 -> OLD_HUNGARIAN;
            case 131 -> SIGNWRITING;
            case 132 -> ADLAM;
            case 133 -> BHAIKSUKI;
            case 134 -> MARCHEN;
            case 135 -> NEWA;
            case 136 -> OSAGE;
            case 137 -> TANGUT;
            case 138 -> MASARAM_GONDI;
            case 139 -> NUSHU;
            case 140 -> SOYOMBO;
            case 141 -> ZANABAZAR_SQUARE;
            case 142 -> DOGRA;
            case 143 -> GUNJALA_GONDI;
            case 144 -> HANIFI_ROHINGYA;
            case 145 -> MAKASAR;
            case 146 -> MEDEFAIDRIN;
            case 147 -> OLD_SOGDIAN;
            case 148 -> SOGDIAN;
            case 149 -> ELYMAIC;
            case 150 -> NANDINAGARI;
            case 151 -> NYIAKENG_PUACHUE_HMONG;
            case 152 -> WANCHO;
            case 153 -> CHORASMIAN;
            case 154 -> DIVES_AKURU;
            case 155 -> KHITAN_SMALL_SCRIPT;
            case 156 -> YEZIDI;
            case 157 -> CYPRO_MINOAN;
            case 158 -> OLD_UYGHUR;
            case 159 -> TANGSA;
            case 160 -> TOTO;
            case 161 -> VITHKUQI;
            case 162 -> MATH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
