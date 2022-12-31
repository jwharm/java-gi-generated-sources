package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoScript} enumeration identifies different writing
 * systems.
 * <p>
 * The values correspond to the names as defined in the Unicode standard. See
 * <a href="http://www.unicode.org/reports/tr24/">Unicode Standard Annex 24: Script names</a>
 * <p>
 * Note that this enumeration is deprecated and will not be updated to include values
 * in newer versions of the Unicode standard. Applications should use the
 * {@code GLib.UnicodeScript} enumeration instead,
 * whose values are interchangeable with {@code PangoScript}.
 */
public enum Script implements io.github.jwharm.javagi.Enumeration {
    /**
     * a value never returned from pango_script_for_unichar()
     */
    INVALID_CODE(-1),
    /**
     * a character used by multiple different scripts
     */
    COMMON(0),
    /**
     * a mark glyph that takes its script from the
     * base glyph to which it is attached
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
     * New Tai Lue. Since 1.10
     */
    NEW_TAI_LUE(54),
    /**
     * Buginese. Since 1.10
     */
    BUGINESE(55),
    /**
     * Glagolitic. Since 1.10
     */
    GLAGOLITIC(56),
    /**
     * Tifinagh. Since 1.10
     */
    TIFINAGH(57),
    /**
     * Syloti Nagri. Since 1.10
     */
    SYLOTI_NAGRI(58),
    /**
     * Old Persian. Since 1.10
     */
    OLD_PERSIAN(59),
    /**
     * Kharoshthi. Since 1.10
     */
    KHAROSHTHI(60),
    /**
     * an unassigned code point. Since 1.14
     */
    UNKNOWN(61),
    /**
     * Balinese. Since 1.14
     */
    BALINESE(62),
    /**
     * Cuneiform. Since 1.14
     */
    CUNEIFORM(63),
    /**
     * Phoenician. Since 1.14
     */
    PHOENICIAN(64),
    /**
     * Phags-pa. Since 1.14
     */
    PHAGS_PA(65),
    /**
     * N'Ko. Since 1.14
     */
    NKO(66),
    /**
     * Kayah Li. Since 1.20.1
     */
    KAYAH_LI(67),
    /**
     * Lepcha. Since 1.20.1
     */
    LEPCHA(68),
    /**
     * Rejang. Since 1.20.1
     */
    REJANG(69),
    /**
     * Sundanese. Since 1.20.1
     */
    SUNDANESE(70),
    /**
     * Saurashtra. Since 1.20.1
     */
    SAURASHTRA(71),
    /**
     * Cham. Since 1.20.1
     */
    CHAM(72),
    /**
     * Ol Chiki. Since 1.20.1
     */
    OL_CHIKI(73),
    /**
     * Vai. Since 1.20.1
     */
    VAI(74),
    /**
     * Carian. Since 1.20.1
     */
    CARIAN(75),
    /**
     * Lycian. Since 1.20.1
     */
    LYCIAN(76),
    /**
     * Lydian. Since 1.20.1
     */
    LYDIAN(77),
    /**
     * Batak. Since 1.32
     */
    BATAK(78),
    /**
     * Brahmi. Since 1.32
     */
    BRAHMI(79),
    /**
     * Mandaic. Since 1.32
     */
    MANDAIC(80),
    /**
     * Chakma. Since: 1.32
     */
    CHAKMA(81),
    /**
     * Meroitic Cursive. Since: 1.32
     */
    MEROITIC_CURSIVE(82),
    /**
     * Meroitic Hieroglyphs. Since: 1.32
     */
    MEROITIC_HIEROGLYPHS(83),
    /**
     * Miao. Since: 1.32
     */
    MIAO(84),
    /**
     * Sharada. Since: 1.32
     */
    SHARADA(85),
    /**
     * Sora Sompeng. Since: 1.32
     */
    SORA_SOMPENG(86),
    /**
     * Takri. Since: 1.32
     */
    TAKRI(87),
    /**
     * Bassa. Since: 1.40
     */
    BASSA_VAH(88),
    /**
     * Caucasian Albanian. Since: 1.40
     */
    CAUCASIAN_ALBANIAN(89),
    /**
     * Duployan. Since: 1.40
     */
    DUPLOYAN(90),
    /**
     * Elbasan. Since: 1.40
     */
    ELBASAN(91),
    /**
     * Grantha. Since: 1.40
     */
    GRANTHA(92),
    /**
     * Kjohki. Since: 1.40
     */
    KHOJKI(93),
    /**
     * Khudawadi, Sindhi. Since: 1.40
     */
    KHUDAWADI(94),
    /**
     * Linear A. Since: 1.40
     */
    LINEAR_A(95),
    /**
     * Mahajani. Since: 1.40
     */
    MAHAJANI(96),
    /**
     * Manichaean. Since: 1.40
     */
    MANICHAEAN(97),
    /**
     * Mende Kikakui. Since: 1.40
     */
    MENDE_KIKAKUI(98),
    /**
     * Modi. Since: 1.40
     */
    MODI(99),
    /**
     * Mro. Since: 1.40
     */
    MRO(100),
    /**
     * Nabataean. Since: 1.40
     */
    NABATAEAN(101),
    /**
     * Old North Arabian. Since: 1.40
     */
    OLD_NORTH_ARABIAN(102),
    /**
     * Old Permic. Since: 1.40
     */
    OLD_PERMIC(103),
    /**
     * Pahawh Hmong. Since: 1.40
     */
    PAHAWH_HMONG(104),
    /**
     * Palmyrene. Since: 1.40
     */
    PALMYRENE(105),
    /**
     * Pau Cin Hau. Since: 1.40
     */
    PAU_CIN_HAU(106),
    /**
     * Psalter Pahlavi. Since: 1.40
     */
    PSALTER_PAHLAVI(107),
    /**
     * Siddham. Since: 1.40
     */
    SIDDHAM(108),
    /**
     * Tirhuta. Since: 1.40
     */
    TIRHUTA(109),
    /**
     * Warang Citi. Since: 1.40
     */
    WARANG_CITI(110),
    /**
     * Ahom. Since: 1.40
     */
    AHOM(111),
    /**
     * Anatolian Hieroglyphs. Since: 1.40
     */
    ANATOLIAN_HIEROGLYPHS(112),
    /**
     * Hatran. Since: 1.40
     */
    HATRAN(113),
    /**
     * Multani. Since: 1.40
     */
    MULTANI(114),
    /**
     * Old Hungarian. Since: 1.40
     */
    OLD_HUNGARIAN(115),
    /**
     * Signwriting. Since: 1.40
     */
    SIGNWRITING(116);
    
    private static final java.lang.String C_TYPE_NAME = "PangoScript";
    
    private final int value;
    Script(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Script of(int value) {
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
            case 78 -> BATAK;
            case 79 -> BRAHMI;
            case 80 -> MANDAIC;
            case 81 -> CHAKMA;
            case 82 -> MEROITIC_CURSIVE;
            case 83 -> MEROITIC_HIEROGLYPHS;
            case 84 -> MIAO;
            case 85 -> SHARADA;
            case 86 -> SORA_SOMPENG;
            case 87 -> TAKRI;
            case 88 -> BASSA_VAH;
            case 89 -> CAUCASIAN_ALBANIAN;
            case 90 -> DUPLOYAN;
            case 91 -> ELBASAN;
            case 92 -> GRANTHA;
            case 93 -> KHOJKI;
            case 94 -> KHUDAWADI;
            case 95 -> LINEAR_A;
            case 96 -> MAHAJANI;
            case 97 -> MANICHAEAN;
            case 98 -> MENDE_KIKAKUI;
            case 99 -> MODI;
            case 100 -> MRO;
            case 101 -> NABATAEAN;
            case 102 -> OLD_NORTH_ARABIAN;
            case 103 -> OLD_PERMIC;
            case 104 -> PAHAWH_HMONG;
            case 105 -> PALMYRENE;
            case 106 -> PAU_CIN_HAU;
            case 107 -> PSALTER_PAHLAVI;
            case 108 -> SIDDHAM;
            case 109 -> TIRHUTA;
            case 110 -> WARANG_CITI;
            case 111 -> AHOM;
            case 112 -> ANATOLIAN_HIEROGLYPHS;
            case 113 -> HATRAN;
            case 114 -> MULTANI;
            case 115 -> OLD_HUNGARIAN;
            case 116 -> SIGNWRITING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Looks up the script for a particular character.
     * <p>
     * The script of a character is defined by
     * <a href="http://www.unicode.org/reports/tr24/">Unicode Standard Annex 24: Script names</a>.
     * <p>
     * No check is made for {@code ch} being a valid Unicode character; if you pass
     * in invalid character, the result is undefined.
     * <p>
     * Note that while the return type of this function is declared
     * as {@code PangoScript}, as of Pango 1.18, this function simply returns
     * the return value of {@link org.gtk.glib.GLib#unicharGetScript}. Callers must be
     * prepared to handle unknown values.
     * @param ch a Unicode character
     * @return the {@code PangoScript} for the character.
     * @deprecated Use g_unichar_get_script()
     */
    @Deprecated
    public static org.pango.Script forUnichar(int ch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_script_for_unichar.invokeExact(
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Script.of(RESULT);
    }
    
    /**
     * Finds a language tag that is reasonably representative of {@code script}.
     * <p>
     * The language will usually be the most widely spoken or used language
     * written in that script: for instance, the sample language for
     * {@link Script#CYRILLIC} is ru (Russian), the sample language for
     * {@link Script#ARABIC} is ar.
     * <p>
     * For some scripts, no sample language will be returned because
     * there is no language that is sufficiently representative. The
     * best example of this is {@link Script#HAN}, where various different
     * variants of written Chinese, Japanese, and Korean all use
     * significantly different sets of Han characters and forms
     * of shared characters. No sample language can be provided
     * for many historical scripts as well.
     * <p>
     * As of 1.18, this function checks the environment variables
     * {@code PANGO_LANGUAGE} and {@code LANGUAGE} (checked in that order) first.
     * If one of them is set, it is parsed as a list of language tags
     * separated by colons or other separators. This function
     * will return the first language in the parsed list that Pango
     * believes may use {@code script} for writing. This last predicate
     * is tested using {@link Language#includesScript}. This can
     * be used to control Pango's font selection for non-primary
     * languages. For example, a {@code PANGO_LANGUAGE} enviroment variable
     * set to "en:fa" makes Pango choose fonts suitable for Persian (fa)
     * instead of Arabic (ar) when a segment of Arabic text is found
     * in an otherwise non-Arabic text. The same trick can be used to
     * choose a default language for {@link Script#HAN} when setting
     * context language is not feasible.
     * @param script a {@code PangoScript}
     * @return a {@code PangoLanguage} that is representative
     *   of the script
     */
    public static @Nullable org.pango.Language getSampleLanguage(org.pango.Script script) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_script_get_sample_language.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Language.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_script_for_unichar = Interop.downcallHandle(
            "pango_script_for_unichar",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_script_get_sample_language = Interop.downcallHandle(
            "pango_script_get_sample_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
