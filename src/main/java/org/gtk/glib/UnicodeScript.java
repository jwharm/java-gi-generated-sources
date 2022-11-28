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
public class UnicodeScript extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GUnicodeScript";
    
    /**
     * a value never returned from g_unichar_get_script()
     */
    public static final UnicodeScript INVALID_CODE = new UnicodeScript(0);
    
    /**
     * a character used by multiple different scripts
     */
    public static final UnicodeScript COMMON = new UnicodeScript(0);
    
    /**
     * a mark glyph that takes its script from the
     *                               base glyph to which it is attached
     */
    public static final UnicodeScript INHERITED = new UnicodeScript(1);
    
    /**
     * Arabic
     */
    public static final UnicodeScript ARABIC = new UnicodeScript(2);
    
    /**
     * Armenian
     */
    public static final UnicodeScript ARMENIAN = new UnicodeScript(3);
    
    /**
     * Bengali
     */
    public static final UnicodeScript BENGALI = new UnicodeScript(4);
    
    /**
     * Bopomofo
     */
    public static final UnicodeScript BOPOMOFO = new UnicodeScript(5);
    
    /**
     * Cherokee
     */
    public static final UnicodeScript CHEROKEE = new UnicodeScript(6);
    
    /**
     * Coptic
     */
    public static final UnicodeScript COPTIC = new UnicodeScript(7);
    
    /**
     * Cyrillic
     */
    public static final UnicodeScript CYRILLIC = new UnicodeScript(8);
    
    /**
     * Deseret
     */
    public static final UnicodeScript DESERET = new UnicodeScript(9);
    
    /**
     * Devanagari
     */
    public static final UnicodeScript DEVANAGARI = new UnicodeScript(10);
    
    /**
     * Ethiopic
     */
    public static final UnicodeScript ETHIOPIC = new UnicodeScript(11);
    
    /**
     * Georgian
     */
    public static final UnicodeScript GEORGIAN = new UnicodeScript(12);
    
    /**
     * Gothic
     */
    public static final UnicodeScript GOTHIC = new UnicodeScript(13);
    
    /**
     * Greek
     */
    public static final UnicodeScript GREEK = new UnicodeScript(14);
    
    /**
     * Gujarati
     */
    public static final UnicodeScript GUJARATI = new UnicodeScript(15);
    
    /**
     * Gurmukhi
     */
    public static final UnicodeScript GURMUKHI = new UnicodeScript(16);
    
    /**
     * Han
     */
    public static final UnicodeScript HAN = new UnicodeScript(17);
    
    /**
     * Hangul
     */
    public static final UnicodeScript HANGUL = new UnicodeScript(18);
    
    /**
     * Hebrew
     */
    public static final UnicodeScript HEBREW = new UnicodeScript(19);
    
    /**
     * Hiragana
     */
    public static final UnicodeScript HIRAGANA = new UnicodeScript(20);
    
    /**
     * Kannada
     */
    public static final UnicodeScript KANNADA = new UnicodeScript(21);
    
    /**
     * Katakana
     */
    public static final UnicodeScript KATAKANA = new UnicodeScript(22);
    
    /**
     * Khmer
     */
    public static final UnicodeScript KHMER = new UnicodeScript(23);
    
    /**
     * Lao
     */
    public static final UnicodeScript LAO = new UnicodeScript(24);
    
    /**
     * Latin
     */
    public static final UnicodeScript LATIN = new UnicodeScript(25);
    
    /**
     * Malayalam
     */
    public static final UnicodeScript MALAYALAM = new UnicodeScript(26);
    
    /**
     * Mongolian
     */
    public static final UnicodeScript MONGOLIAN = new UnicodeScript(27);
    
    /**
     * Myanmar
     */
    public static final UnicodeScript MYANMAR = new UnicodeScript(28);
    
    /**
     * Ogham
     */
    public static final UnicodeScript OGHAM = new UnicodeScript(29);
    
    /**
     * Old Italic
     */
    public static final UnicodeScript OLD_ITALIC = new UnicodeScript(30);
    
    /**
     * Oriya
     */
    public static final UnicodeScript ORIYA = new UnicodeScript(31);
    
    /**
     * Runic
     */
    public static final UnicodeScript RUNIC = new UnicodeScript(32);
    
    /**
     * Sinhala
     */
    public static final UnicodeScript SINHALA = new UnicodeScript(33);
    
    /**
     * Syriac
     */
    public static final UnicodeScript SYRIAC = new UnicodeScript(34);
    
    /**
     * Tamil
     */
    public static final UnicodeScript TAMIL = new UnicodeScript(35);
    
    /**
     * Telugu
     */
    public static final UnicodeScript TELUGU = new UnicodeScript(36);
    
    /**
     * Thaana
     */
    public static final UnicodeScript THAANA = new UnicodeScript(37);
    
    /**
     * Thai
     */
    public static final UnicodeScript THAI = new UnicodeScript(38);
    
    /**
     * Tibetan
     */
    public static final UnicodeScript TIBETAN = new UnicodeScript(39);
    
    /**
     * Canadian Aboriginal
     */
    public static final UnicodeScript CANADIAN_ABORIGINAL = new UnicodeScript(40);
    
    /**
     * Yi
     */
    public static final UnicodeScript YI = new UnicodeScript(41);
    
    /**
     * Tagalog
     */
    public static final UnicodeScript TAGALOG = new UnicodeScript(42);
    
    /**
     * Hanunoo
     */
    public static final UnicodeScript HANUNOO = new UnicodeScript(43);
    
    /**
     * Buhid
     */
    public static final UnicodeScript BUHID = new UnicodeScript(44);
    
    /**
     * Tagbanwa
     */
    public static final UnicodeScript TAGBANWA = new UnicodeScript(45);
    
    /**
     * Braille
     */
    public static final UnicodeScript BRAILLE = new UnicodeScript(46);
    
    /**
     * Cypriot
     */
    public static final UnicodeScript CYPRIOT = new UnicodeScript(47);
    
    /**
     * Limbu
     */
    public static final UnicodeScript LIMBU = new UnicodeScript(48);
    
    /**
     * Osmanya
     */
    public static final UnicodeScript OSMANYA = new UnicodeScript(49);
    
    /**
     * Shavian
     */
    public static final UnicodeScript SHAVIAN = new UnicodeScript(50);
    
    /**
     * Linear B
     */
    public static final UnicodeScript LINEAR_B = new UnicodeScript(51);
    
    /**
     * Tai Le
     */
    public static final UnicodeScript TAI_LE = new UnicodeScript(52);
    
    /**
     * Ugaritic
     */
    public static final UnicodeScript UGARITIC = new UnicodeScript(53);
    
    /**
     * New Tai Lue
     */
    public static final UnicodeScript NEW_TAI_LUE = new UnicodeScript(54);
    
    /**
     * Buginese
     */
    public static final UnicodeScript BUGINESE = new UnicodeScript(55);
    
    /**
     * Glagolitic
     */
    public static final UnicodeScript GLAGOLITIC = new UnicodeScript(56);
    
    /**
     * Tifinagh
     */
    public static final UnicodeScript TIFINAGH = new UnicodeScript(57);
    
    /**
     * Syloti Nagri
     */
    public static final UnicodeScript SYLOTI_NAGRI = new UnicodeScript(58);
    
    /**
     * Old Persian
     */
    public static final UnicodeScript OLD_PERSIAN = new UnicodeScript(59);
    
    /**
     * Kharoshthi
     */
    public static final UnicodeScript KHAROSHTHI = new UnicodeScript(60);
    
    /**
     * an unassigned code point
     */
    public static final UnicodeScript UNKNOWN = new UnicodeScript(61);
    
    /**
     * Balinese
     */
    public static final UnicodeScript BALINESE = new UnicodeScript(62);
    
    /**
     * Cuneiform
     */
    public static final UnicodeScript CUNEIFORM = new UnicodeScript(63);
    
    /**
     * Phoenician
     */
    public static final UnicodeScript PHOENICIAN = new UnicodeScript(64);
    
    /**
     * Phags-pa
     */
    public static final UnicodeScript PHAGS_PA = new UnicodeScript(65);
    
    /**
     * N'Ko
     */
    public static final UnicodeScript NKO = new UnicodeScript(66);
    
    /**
     * Kayah Li. Since 2.16.3
     */
    public static final UnicodeScript KAYAH_LI = new UnicodeScript(67);
    
    /**
     * Lepcha. Since 2.16.3
     */
    public static final UnicodeScript LEPCHA = new UnicodeScript(68);
    
    /**
     * Rejang. Since 2.16.3
     */
    public static final UnicodeScript REJANG = new UnicodeScript(69);
    
    /**
     * Sundanese. Since 2.16.3
     */
    public static final UnicodeScript SUNDANESE = new UnicodeScript(70);
    
    /**
     * Saurashtra. Since 2.16.3
     */
    public static final UnicodeScript SAURASHTRA = new UnicodeScript(71);
    
    /**
     * Cham. Since 2.16.3
     */
    public static final UnicodeScript CHAM = new UnicodeScript(72);
    
    /**
     * Ol Chiki. Since 2.16.3
     */
    public static final UnicodeScript OL_CHIKI = new UnicodeScript(73);
    
    /**
     * Vai. Since 2.16.3
     */
    public static final UnicodeScript VAI = new UnicodeScript(74);
    
    /**
     * Carian. Since 2.16.3
     */
    public static final UnicodeScript CARIAN = new UnicodeScript(75);
    
    /**
     * Lycian. Since 2.16.3
     */
    public static final UnicodeScript LYCIAN = new UnicodeScript(76);
    
    /**
     * Lydian. Since 2.16.3
     */
    public static final UnicodeScript LYDIAN = new UnicodeScript(77);
    
    /**
     * Avestan. Since 2.26
     */
    public static final UnicodeScript AVESTAN = new UnicodeScript(78);
    
    /**
     * Bamum. Since 2.26
     */
    public static final UnicodeScript BAMUM = new UnicodeScript(79);
    
    /**
     * Egyptian Hieroglpyhs. Since 2.26
     */
    public static final UnicodeScript EGYPTIAN_HIEROGLYPHS = new UnicodeScript(80);
    
    /**
     * Imperial Aramaic. Since 2.26
     */
    public static final UnicodeScript IMPERIAL_ARAMAIC = new UnicodeScript(81);
    
    /**
     * Inscriptional Pahlavi. Since 2.26
     */
    public static final UnicodeScript INSCRIPTIONAL_PAHLAVI = new UnicodeScript(82);
    
    /**
     * Inscriptional Parthian. Since 2.26
     */
    public static final UnicodeScript INSCRIPTIONAL_PARTHIAN = new UnicodeScript(83);
    
    /**
     * Javanese. Since 2.26
     */
    public static final UnicodeScript JAVANESE = new UnicodeScript(84);
    
    /**
     * Kaithi. Since 2.26
     */
    public static final UnicodeScript KAITHI = new UnicodeScript(85);
    
    /**
     * Lisu. Since 2.26
     */
    public static final UnicodeScript LISU = new UnicodeScript(86);
    
    /**
     * Meetei Mayek. Since 2.26
     */
    public static final UnicodeScript MEETEI_MAYEK = new UnicodeScript(87);
    
    /**
     * Old South Arabian. Since 2.26
     */
    public static final UnicodeScript OLD_SOUTH_ARABIAN = new UnicodeScript(88);
    
    /**
     * Old Turkic. Since 2.28
     */
    public static final UnicodeScript OLD_TURKIC = new UnicodeScript(89);
    
    /**
     * Samaritan. Since 2.26
     */
    public static final UnicodeScript SAMARITAN = new UnicodeScript(90);
    
    /**
     * Tai Tham. Since 2.26
     */
    public static final UnicodeScript TAI_THAM = new UnicodeScript(91);
    
    /**
     * Tai Viet. Since 2.26
     */
    public static final UnicodeScript TAI_VIET = new UnicodeScript(92);
    
    /**
     * Batak. Since 2.28
     */
    public static final UnicodeScript BATAK = new UnicodeScript(93);
    
    /**
     * Brahmi. Since 2.28
     */
    public static final UnicodeScript BRAHMI = new UnicodeScript(94);
    
    /**
     * Mandaic. Since 2.28
     */
    public static final UnicodeScript MANDAIC = new UnicodeScript(95);
    
    /**
     * Chakma. Since: 2.32
     */
    public static final UnicodeScript CHAKMA = new UnicodeScript(96);
    
    /**
     * Meroitic Cursive. Since: 2.32
     */
    public static final UnicodeScript MEROITIC_CURSIVE = new UnicodeScript(97);
    
    /**
     * Meroitic Hieroglyphs. Since: 2.32
     */
    public static final UnicodeScript MEROITIC_HIEROGLYPHS = new UnicodeScript(98);
    
    /**
     * Miao. Since: 2.32
     */
    public static final UnicodeScript MIAO = new UnicodeScript(99);
    
    /**
     * Sharada. Since: 2.32
     */
    public static final UnicodeScript SHARADA = new UnicodeScript(100);
    
    /**
     * Sora Sompeng. Since: 2.32
     */
    public static final UnicodeScript SORA_SOMPENG = new UnicodeScript(101);
    
    /**
     * Takri. Since: 2.32
     */
    public static final UnicodeScript TAKRI = new UnicodeScript(102);
    
    /**
     * Bassa. Since: 2.42
     */
    public static final UnicodeScript BASSA_VAH = new UnicodeScript(103);
    
    /**
     * Caucasian Albanian. Since: 2.42
     */
    public static final UnicodeScript CAUCASIAN_ALBANIAN = new UnicodeScript(104);
    
    /**
     * Duployan. Since: 2.42
     */
    public static final UnicodeScript DUPLOYAN = new UnicodeScript(105);
    
    /**
     * Elbasan. Since: 2.42
     */
    public static final UnicodeScript ELBASAN = new UnicodeScript(106);
    
    /**
     * Grantha. Since: 2.42
     */
    public static final UnicodeScript GRANTHA = new UnicodeScript(107);
    
    /**
     * Kjohki. Since: 2.42
     */
    public static final UnicodeScript KHOJKI = new UnicodeScript(108);
    
    /**
     * Khudawadi, Sindhi. Since: 2.42
     */
    public static final UnicodeScript KHUDAWADI = new UnicodeScript(109);
    
    /**
     * Linear A. Since: 2.42
     */
    public static final UnicodeScript LINEAR_A = new UnicodeScript(110);
    
    /**
     * Mahajani. Since: 2.42
     */
    public static final UnicodeScript MAHAJANI = new UnicodeScript(111);
    
    /**
     * Manichaean. Since: 2.42
     */
    public static final UnicodeScript MANICHAEAN = new UnicodeScript(112);
    
    /**
     * Mende Kikakui. Since: 2.42
     */
    public static final UnicodeScript MENDE_KIKAKUI = new UnicodeScript(113);
    
    /**
     * Modi. Since: 2.42
     */
    public static final UnicodeScript MODI = new UnicodeScript(114);
    
    /**
     * Mro. Since: 2.42
     */
    public static final UnicodeScript MRO = new UnicodeScript(115);
    
    /**
     * Nabataean. Since: 2.42
     */
    public static final UnicodeScript NABATAEAN = new UnicodeScript(116);
    
    /**
     * Old North Arabian. Since: 2.42
     */
    public static final UnicodeScript OLD_NORTH_ARABIAN = new UnicodeScript(117);
    
    /**
     * Old Permic. Since: 2.42
     */
    public static final UnicodeScript OLD_PERMIC = new UnicodeScript(118);
    
    /**
     * Pahawh Hmong. Since: 2.42
     */
    public static final UnicodeScript PAHAWH_HMONG = new UnicodeScript(119);
    
    /**
     * Palmyrene. Since: 2.42
     */
    public static final UnicodeScript PALMYRENE = new UnicodeScript(120);
    
    /**
     * Pau Cin Hau. Since: 2.42
     */
    public static final UnicodeScript PAU_CIN_HAU = new UnicodeScript(121);
    
    /**
     * Psalter Pahlavi. Since: 2.42
     */
    public static final UnicodeScript PSALTER_PAHLAVI = new UnicodeScript(122);
    
    /**
     * Siddham. Since: 2.42
     */
    public static final UnicodeScript SIDDHAM = new UnicodeScript(123);
    
    /**
     * Tirhuta. Since: 2.42
     */
    public static final UnicodeScript TIRHUTA = new UnicodeScript(124);
    
    /**
     * Warang Citi. Since: 2.42
     */
    public static final UnicodeScript WARANG_CITI = new UnicodeScript(125);
    
    /**
     * Ahom. Since: 2.48
     */
    public static final UnicodeScript AHOM = new UnicodeScript(126);
    
    /**
     * Anatolian Hieroglyphs. Since: 2.48
     */
    public static final UnicodeScript ANATOLIAN_HIEROGLYPHS = new UnicodeScript(127);
    
    /**
     * Hatran. Since: 2.48
     */
    public static final UnicodeScript HATRAN = new UnicodeScript(128);
    
    /**
     * Multani. Since: 2.48
     */
    public static final UnicodeScript MULTANI = new UnicodeScript(129);
    
    /**
     * Old Hungarian. Since: 2.48
     */
    public static final UnicodeScript OLD_HUNGARIAN = new UnicodeScript(130);
    
    /**
     * Signwriting. Since: 2.48
     */
    public static final UnicodeScript SIGNWRITING = new UnicodeScript(131);
    
    /**
     * Adlam. Since: 2.50
     */
    public static final UnicodeScript ADLAM = new UnicodeScript(132);
    
    /**
     * Bhaiksuki. Since: 2.50
     */
    public static final UnicodeScript BHAIKSUKI = new UnicodeScript(133);
    
    /**
     * Marchen. Since: 2.50
     */
    public static final UnicodeScript MARCHEN = new UnicodeScript(134);
    
    /**
     * Newa. Since: 2.50
     */
    public static final UnicodeScript NEWA = new UnicodeScript(135);
    
    /**
     * Osage. Since: 2.50
     */
    public static final UnicodeScript OSAGE = new UnicodeScript(136);
    
    /**
     * Tangut. Since: 2.50
     */
    public static final UnicodeScript TANGUT = new UnicodeScript(137);
    
    /**
     * Masaram Gondi. Since: 2.54
     */
    public static final UnicodeScript MASARAM_GONDI = new UnicodeScript(138);
    
    /**
     * Nushu. Since: 2.54
     */
    public static final UnicodeScript NUSHU = new UnicodeScript(139);
    
    /**
     * Soyombo. Since: 2.54
     */
    public static final UnicodeScript SOYOMBO = new UnicodeScript(140);
    
    /**
     * Zanabazar Square. Since: 2.54
     */
    public static final UnicodeScript ZANABAZAR_SQUARE = new UnicodeScript(141);
    
    /**
     * Dogra. Since: 2.58
     */
    public static final UnicodeScript DOGRA = new UnicodeScript(142);
    
    /**
     * Gunjala Gondi. Since: 2.58
     */
    public static final UnicodeScript GUNJALA_GONDI = new UnicodeScript(143);
    
    /**
     * Hanifi Rohingya. Since: 2.58
     */
    public static final UnicodeScript HANIFI_ROHINGYA = new UnicodeScript(144);
    
    /**
     * Makasar. Since: 2.58
     */
    public static final UnicodeScript MAKASAR = new UnicodeScript(145);
    
    /**
     * Medefaidrin. Since: 2.58
     */
    public static final UnicodeScript MEDEFAIDRIN = new UnicodeScript(146);
    
    /**
     * Old Sogdian. Since: 2.58
     */
    public static final UnicodeScript OLD_SOGDIAN = new UnicodeScript(147);
    
    /**
     * Sogdian. Since: 2.58
     */
    public static final UnicodeScript SOGDIAN = new UnicodeScript(148);
    
    /**
     * Elym. Since: 2.62
     */
    public static final UnicodeScript ELYMAIC = new UnicodeScript(149);
    
    /**
     * Nand. Since: 2.62
     */
    public static final UnicodeScript NANDINAGARI = new UnicodeScript(150);
    
    /**
     * Rohg. Since: 2.62
     */
    public static final UnicodeScript NYIAKENG_PUACHUE_HMONG = new UnicodeScript(151);
    
    /**
     * Wcho. Since: 2.62
     */
    public static final UnicodeScript WANCHO = new UnicodeScript(152);
    
    /**
     * Chorasmian. Since: 2.66
     */
    public static final UnicodeScript CHORASMIAN = new UnicodeScript(153);
    
    /**
     * Dives Akuru. Since: 2.66
     */
    public static final UnicodeScript DIVES_AKURU = new UnicodeScript(154);
    
    /**
     * Khitan small script. Since: 2.66
     */
    public static final UnicodeScript KHITAN_SMALL_SCRIPT = new UnicodeScript(155);
    
    /**
     * Yezidi. Since: 2.66
     */
    public static final UnicodeScript YEZIDI = new UnicodeScript(156);
    
    /**
     * Cypro-Minoan. Since: 2.72
     */
    public static final UnicodeScript CYPRO_MINOAN = new UnicodeScript(157);
    
    /**
     * Old Uyghur. Since: 2.72
     */
    public static final UnicodeScript OLD_UYGHUR = new UnicodeScript(158);
    
    /**
     * Tangsa. Since: 2.72
     */
    public static final UnicodeScript TANGSA = new UnicodeScript(159);
    
    /**
     * Toto. Since: 2.72
     */
    public static final UnicodeScript TOTO = new UnicodeScript(160);
    
    /**
     * Vithkuqi. Since: 2.72
     */
    public static final UnicodeScript VITHKUQI = new UnicodeScript(161);
    
    /**
     * Mathematical notation. Since: 2.72
     */
    public static final UnicodeScript MATH = new UnicodeScript(162);
    
    public UnicodeScript(int value) {
        super(value);
    }
}
