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
public class Script extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoScript";
    
    /**
     * a value never returned from pango_script_for_unichar()
     */
    public static final Script INVALID_CODE = new Script(-1);
    
    /**
     * a character used by multiple different scripts
     */
    public static final Script COMMON = new Script(0);
    
    /**
     * a mark glyph that takes its script from the
     * base glyph to which it is attached
     */
    public static final Script INHERITED = new Script(1);
    
    /**
     * Arabic
     */
    public static final Script ARABIC = new Script(2);
    
    /**
     * Armenian
     */
    public static final Script ARMENIAN = new Script(3);
    
    /**
     * Bengali
     */
    public static final Script BENGALI = new Script(4);
    
    /**
     * Bopomofo
     */
    public static final Script BOPOMOFO = new Script(5);
    
    /**
     * Cherokee
     */
    public static final Script CHEROKEE = new Script(6);
    
    /**
     * Coptic
     */
    public static final Script COPTIC = new Script(7);
    
    /**
     * Cyrillic
     */
    public static final Script CYRILLIC = new Script(8);
    
    /**
     * Deseret
     */
    public static final Script DESERET = new Script(9);
    
    /**
     * Devanagari
     */
    public static final Script DEVANAGARI = new Script(10);
    
    /**
     * Ethiopic
     */
    public static final Script ETHIOPIC = new Script(11);
    
    /**
     * Georgian
     */
    public static final Script GEORGIAN = new Script(12);
    
    /**
     * Gothic
     */
    public static final Script GOTHIC = new Script(13);
    
    /**
     * Greek
     */
    public static final Script GREEK = new Script(14);
    
    /**
     * Gujarati
     */
    public static final Script GUJARATI = new Script(15);
    
    /**
     * Gurmukhi
     */
    public static final Script GURMUKHI = new Script(16);
    
    /**
     * Han
     */
    public static final Script HAN = new Script(17);
    
    /**
     * Hangul
     */
    public static final Script HANGUL = new Script(18);
    
    /**
     * Hebrew
     */
    public static final Script HEBREW = new Script(19);
    
    /**
     * Hiragana
     */
    public static final Script HIRAGANA = new Script(20);
    
    /**
     * Kannada
     */
    public static final Script KANNADA = new Script(21);
    
    /**
     * Katakana
     */
    public static final Script KATAKANA = new Script(22);
    
    /**
     * Khmer
     */
    public static final Script KHMER = new Script(23);
    
    /**
     * Lao
     */
    public static final Script LAO = new Script(24);
    
    /**
     * Latin
     */
    public static final Script LATIN = new Script(25);
    
    /**
     * Malayalam
     */
    public static final Script MALAYALAM = new Script(26);
    
    /**
     * Mongolian
     */
    public static final Script MONGOLIAN = new Script(27);
    
    /**
     * Myanmar
     */
    public static final Script MYANMAR = new Script(28);
    
    /**
     * Ogham
     */
    public static final Script OGHAM = new Script(29);
    
    /**
     * Old Italic
     */
    public static final Script OLD_ITALIC = new Script(30);
    
    /**
     * Oriya
     */
    public static final Script ORIYA = new Script(31);
    
    /**
     * Runic
     */
    public static final Script RUNIC = new Script(32);
    
    /**
     * Sinhala
     */
    public static final Script SINHALA = new Script(33);
    
    /**
     * Syriac
     */
    public static final Script SYRIAC = new Script(34);
    
    /**
     * Tamil
     */
    public static final Script TAMIL = new Script(35);
    
    /**
     * Telugu
     */
    public static final Script TELUGU = new Script(36);
    
    /**
     * Thaana
     */
    public static final Script THAANA = new Script(37);
    
    /**
     * Thai
     */
    public static final Script THAI = new Script(38);
    
    /**
     * Tibetan
     */
    public static final Script TIBETAN = new Script(39);
    
    /**
     * Canadian Aboriginal
     */
    public static final Script CANADIAN_ABORIGINAL = new Script(40);
    
    /**
     * Yi
     */
    public static final Script YI = new Script(41);
    
    /**
     * Tagalog
     */
    public static final Script TAGALOG = new Script(42);
    
    /**
     * Hanunoo
     */
    public static final Script HANUNOO = new Script(43);
    
    /**
     * Buhid
     */
    public static final Script BUHID = new Script(44);
    
    /**
     * Tagbanwa
     */
    public static final Script TAGBANWA = new Script(45);
    
    /**
     * Braille
     */
    public static final Script BRAILLE = new Script(46);
    
    /**
     * Cypriot
     */
    public static final Script CYPRIOT = new Script(47);
    
    /**
     * Limbu
     */
    public static final Script LIMBU = new Script(48);
    
    /**
     * Osmanya
     */
    public static final Script OSMANYA = new Script(49);
    
    /**
     * Shavian
     */
    public static final Script SHAVIAN = new Script(50);
    
    /**
     * Linear B
     */
    public static final Script LINEAR_B = new Script(51);
    
    /**
     * Tai Le
     */
    public static final Script TAI_LE = new Script(52);
    
    /**
     * Ugaritic
     */
    public static final Script UGARITIC = new Script(53);
    
    /**
     * New Tai Lue. Since 1.10
     */
    public static final Script NEW_TAI_LUE = new Script(54);
    
    /**
     * Buginese. Since 1.10
     */
    public static final Script BUGINESE = new Script(55);
    
    /**
     * Glagolitic. Since 1.10
     */
    public static final Script GLAGOLITIC = new Script(56);
    
    /**
     * Tifinagh. Since 1.10
     */
    public static final Script TIFINAGH = new Script(57);
    
    /**
     * Syloti Nagri. Since 1.10
     */
    public static final Script SYLOTI_NAGRI = new Script(58);
    
    /**
     * Old Persian. Since 1.10
     */
    public static final Script OLD_PERSIAN = new Script(59);
    
    /**
     * Kharoshthi. Since 1.10
     */
    public static final Script KHAROSHTHI = new Script(60);
    
    /**
     * an unassigned code point. Since 1.14
     */
    public static final Script UNKNOWN = new Script(61);
    
    /**
     * Balinese. Since 1.14
     */
    public static final Script BALINESE = new Script(62);
    
    /**
     * Cuneiform. Since 1.14
     */
    public static final Script CUNEIFORM = new Script(63);
    
    /**
     * Phoenician. Since 1.14
     */
    public static final Script PHOENICIAN = new Script(64);
    
    /**
     * Phags-pa. Since 1.14
     */
    public static final Script PHAGS_PA = new Script(65);
    
    /**
     * N'Ko. Since 1.14
     */
    public static final Script NKO = new Script(66);
    
    /**
     * Kayah Li. Since 1.20.1
     */
    public static final Script KAYAH_LI = new Script(67);
    
    /**
     * Lepcha. Since 1.20.1
     */
    public static final Script LEPCHA = new Script(68);
    
    /**
     * Rejang. Since 1.20.1
     */
    public static final Script REJANG = new Script(69);
    
    /**
     * Sundanese. Since 1.20.1
     */
    public static final Script SUNDANESE = new Script(70);
    
    /**
     * Saurashtra. Since 1.20.1
     */
    public static final Script SAURASHTRA = new Script(71);
    
    /**
     * Cham. Since 1.20.1
     */
    public static final Script CHAM = new Script(72);
    
    /**
     * Ol Chiki. Since 1.20.1
     */
    public static final Script OL_CHIKI = new Script(73);
    
    /**
     * Vai. Since 1.20.1
     */
    public static final Script VAI = new Script(74);
    
    /**
     * Carian. Since 1.20.1
     */
    public static final Script CARIAN = new Script(75);
    
    /**
     * Lycian. Since 1.20.1
     */
    public static final Script LYCIAN = new Script(76);
    
    /**
     * Lydian. Since 1.20.1
     */
    public static final Script LYDIAN = new Script(77);
    
    /**
     * Batak. Since 1.32
     */
    public static final Script BATAK = new Script(78);
    
    /**
     * Brahmi. Since 1.32
     */
    public static final Script BRAHMI = new Script(79);
    
    /**
     * Mandaic. Since 1.32
     */
    public static final Script MANDAIC = new Script(80);
    
    /**
     * Chakma. Since: 1.32
     */
    public static final Script CHAKMA = new Script(81);
    
    /**
     * Meroitic Cursive. Since: 1.32
     */
    public static final Script MEROITIC_CURSIVE = new Script(82);
    
    /**
     * Meroitic Hieroglyphs. Since: 1.32
     */
    public static final Script MEROITIC_HIEROGLYPHS = new Script(83);
    
    /**
     * Miao. Since: 1.32
     */
    public static final Script MIAO = new Script(84);
    
    /**
     * Sharada. Since: 1.32
     */
    public static final Script SHARADA = new Script(85);
    
    /**
     * Sora Sompeng. Since: 1.32
     */
    public static final Script SORA_SOMPENG = new Script(86);
    
    /**
     * Takri. Since: 1.32
     */
    public static final Script TAKRI = new Script(87);
    
    /**
     * Bassa. Since: 1.40
     */
    public static final Script BASSA_VAH = new Script(88);
    
    /**
     * Caucasian Albanian. Since: 1.40
     */
    public static final Script CAUCASIAN_ALBANIAN = new Script(89);
    
    /**
     * Duployan. Since: 1.40
     */
    public static final Script DUPLOYAN = new Script(90);
    
    /**
     * Elbasan. Since: 1.40
     */
    public static final Script ELBASAN = new Script(91);
    
    /**
     * Grantha. Since: 1.40
     */
    public static final Script GRANTHA = new Script(92);
    
    /**
     * Kjohki. Since: 1.40
     */
    public static final Script KHOJKI = new Script(93);
    
    /**
     * Khudawadi, Sindhi. Since: 1.40
     */
    public static final Script KHUDAWADI = new Script(94);
    
    /**
     * Linear A. Since: 1.40
     */
    public static final Script LINEAR_A = new Script(95);
    
    /**
     * Mahajani. Since: 1.40
     */
    public static final Script MAHAJANI = new Script(96);
    
    /**
     * Manichaean. Since: 1.40
     */
    public static final Script MANICHAEAN = new Script(97);
    
    /**
     * Mende Kikakui. Since: 1.40
     */
    public static final Script MENDE_KIKAKUI = new Script(98);
    
    /**
     * Modi. Since: 1.40
     */
    public static final Script MODI = new Script(99);
    
    /**
     * Mro. Since: 1.40
     */
    public static final Script MRO = new Script(100);
    
    /**
     * Nabataean. Since: 1.40
     */
    public static final Script NABATAEAN = new Script(101);
    
    /**
     * Old North Arabian. Since: 1.40
     */
    public static final Script OLD_NORTH_ARABIAN = new Script(102);
    
    /**
     * Old Permic. Since: 1.40
     */
    public static final Script OLD_PERMIC = new Script(103);
    
    /**
     * Pahawh Hmong. Since: 1.40
     */
    public static final Script PAHAWH_HMONG = new Script(104);
    
    /**
     * Palmyrene. Since: 1.40
     */
    public static final Script PALMYRENE = new Script(105);
    
    /**
     * Pau Cin Hau. Since: 1.40
     */
    public static final Script PAU_CIN_HAU = new Script(106);
    
    /**
     * Psalter Pahlavi. Since: 1.40
     */
    public static final Script PSALTER_PAHLAVI = new Script(107);
    
    /**
     * Siddham. Since: 1.40
     */
    public static final Script SIDDHAM = new Script(108);
    
    /**
     * Tirhuta. Since: 1.40
     */
    public static final Script TIRHUTA = new Script(109);
    
    /**
     * Warang Citi. Since: 1.40
     */
    public static final Script WARANG_CITI = new Script(110);
    
    /**
     * Ahom. Since: 1.40
     */
    public static final Script AHOM = new Script(111);
    
    /**
     * Anatolian Hieroglyphs. Since: 1.40
     */
    public static final Script ANATOLIAN_HIEROGLYPHS = new Script(112);
    
    /**
     * Hatran. Since: 1.40
     */
    public static final Script HATRAN = new Script(113);
    
    /**
     * Multani. Since: 1.40
     */
    public static final Script MULTANI = new Script(114);
    
    /**
     * Old Hungarian. Since: 1.40
     */
    public static final Script OLD_HUNGARIAN = new Script(115);
    
    /**
     * Signwriting. Since: 1.40
     */
    public static final Script SIGNWRITING = new Script(116);
    
    public Script(int value) {
        super(value);
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
    public static @NotNull org.pango.Script forUnichar(int ch) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_script_for_unichar.invokeExact(
                    ch);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Script(RESULT);
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
    public static @Nullable org.pango.Language getSampleLanguage(@NotNull org.pango.Script script) {
        java.util.Objects.requireNonNull(script, "Parameter 'script' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_script_get_sample_language.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.FULL);
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
