package org.pango;

/**
 * The <code>PangoScript</code> enumeration identifies different writing
 * systems.
 * <p>
 * The values correspond to the names as defined in the Unicode standard. See
 * {@link [Unicode Standard Annex 24: Script names]}(http://www.unicode.org/reports/tr24/)
 * <p>
 * Note that this enumeration is deprecated and will not be updated to include values
 * in newer versions of the Unicode standard. Applications should use the
 * {@link [enum@GLib.UnicodeScript] (ref=enum)} enumeration instead,
 * whose values are interchangeable with <code>PangoScript</code>.
 */
public enum Script {

    /**
     * a value never returned from pango_script_for_unichar()
     */
    INVALID_CODE,
    
    /**
     * a character used by multiple different scripts
     */
    COMMON,
    
    /**
     * a mark glyph that takes its script from the
     * base glyph to which it is attached
     */
    INHERITED,
    
    /**
     * Arabic
     */
    ARABIC,
    
    /**
     * Armenian
     */
    ARMENIAN,
    
    /**
     * Bengali
     */
    BENGALI,
    
    /**
     * Bopomofo
     */
    BOPOMOFO,
    
    /**
     * Cherokee
     */
    CHEROKEE,
    
    /**
     * Coptic
     */
    COPTIC,
    
    /**
     * Cyrillic
     */
    CYRILLIC,
    
    /**
     * Deseret
     */
    DESERET,
    
    /**
     * Devanagari
     */
    DEVANAGARI,
    
    /**
     * Ethiopic
     */
    ETHIOPIC,
    
    /**
     * Georgian
     */
    GEORGIAN,
    
    /**
     * Gothic
     */
    GOTHIC,
    
    /**
     * Greek
     */
    GREEK,
    
    /**
     * Gujarati
     */
    GUJARATI,
    
    /**
     * Gurmukhi
     */
    GURMUKHI,
    
    /**
     * Han
     */
    HAN,
    
    /**
     * Hangul
     */
    HANGUL,
    
    /**
     * Hebrew
     */
    HEBREW,
    
    /**
     * Hiragana
     */
    HIRAGANA,
    
    /**
     * Kannada
     */
    KANNADA,
    
    /**
     * Katakana
     */
    KATAKANA,
    
    /**
     * Khmer
     */
    KHMER,
    
    /**
     * Lao
     */
    LAO,
    
    /**
     * Latin
     */
    LATIN,
    
    /**
     * Malayalam
     */
    MALAYALAM,
    
    /**
     * Mongolian
     */
    MONGOLIAN,
    
    /**
     * Myanmar
     */
    MYANMAR,
    
    /**
     * Ogham
     */
    OGHAM,
    
    /**
     * Old Italic
     */
    OLD_ITALIC,
    
    /**
     * Oriya
     */
    ORIYA,
    
    /**
     * Runic
     */
    RUNIC,
    
    /**
     * Sinhala
     */
    SINHALA,
    
    /**
     * Syriac
     */
    SYRIAC,
    
    /**
     * Tamil
     */
    TAMIL,
    
    /**
     * Telugu
     */
    TELUGU,
    
    /**
     * Thaana
     */
    THAANA,
    
    /**
     * Thai
     */
    THAI,
    
    /**
     * Tibetan
     */
    TIBETAN,
    
    /**
     * Canadian Aboriginal
     */
    CANADIAN_ABORIGINAL,
    
    /**
     * Yi
     */
    YI,
    
    /**
     * Tagalog
     */
    TAGALOG,
    
    /**
     * Hanunoo
     */
    HANUNOO,
    
    /**
     * Buhid
     */
    BUHID,
    
    /**
     * Tagbanwa
     */
    TAGBANWA,
    
    /**
     * Braille
     */
    BRAILLE,
    
    /**
     * Cypriot
     */
    CYPRIOT,
    
    /**
     * Limbu
     */
    LIMBU,
    
    /**
     * Osmanya
     */
    OSMANYA,
    
    /**
     * Shavian
     */
    SHAVIAN,
    
    /**
     * Linear B
     */
    LINEAR_B,
    
    /**
     * Tai Le
     */
    TAI_LE,
    
    /**
     * Ugaritic
     */
    UGARITIC,
    
    /**
     * New Tai Lue. Since 1.10
     */
    NEW_TAI_LUE,
    
    /**
     * Buginese. Since 1.10
     */
    BUGINESE,
    
    /**
     * Glagolitic. Since 1.10
     */
    GLAGOLITIC,
    
    /**
     * Tifinagh. Since 1.10
     */
    TIFINAGH,
    
    /**
     * Syloti Nagri. Since 1.10
     */
    SYLOTI_NAGRI,
    
    /**
     * Old Persian. Since 1.10
     */
    OLD_PERSIAN,
    
    /**
     * Kharoshthi. Since 1.10
     */
    KHAROSHTHI,
    
    /**
     * an unassigned code point. Since 1.14
     */
    UNKNOWN,
    
    /**
     * Balinese. Since 1.14
     */
    BALINESE,
    
    /**
     * Cuneiform. Since 1.14
     */
    CUNEIFORM,
    
    /**
     * Phoenician. Since 1.14
     */
    PHOENICIAN,
    
    /**
     * Phags-pa. Since 1.14
     */
    PHAGS_PA,
    
    /**
     * N&#39;Ko. Since 1.14
     */
    NKO,
    
    /**
     * Kayah Li. Since 1.20.1
     */
    KAYAH_LI,
    
    /**
     * Lepcha. Since 1.20.1
     */
    LEPCHA,
    
    /**
     * Rejang. Since 1.20.1
     */
    REJANG,
    
    /**
     * Sundanese. Since 1.20.1
     */
    SUNDANESE,
    
    /**
     * Saurashtra. Since 1.20.1
     */
    SAURASHTRA,
    
    /**
     * Cham. Since 1.20.1
     */
    CHAM,
    
    /**
     * Ol Chiki. Since 1.20.1
     */
    OL_CHIKI,
    
    /**
     * Vai. Since 1.20.1
     */
    VAI,
    
    /**
     * Carian. Since 1.20.1
     */
    CARIAN,
    
    /**
     * Lycian. Since 1.20.1
     */
    LYCIAN,
    
    /**
     * Lydian. Since 1.20.1
     */
    LYDIAN,
    
    /**
     * Batak. Since 1.32
     */
    BATAK,
    
    /**
     * Brahmi. Since 1.32
     */
    BRAHMI,
    
    /**
     * Mandaic. Since 1.32
     */
    MANDAIC,
    
    /**
     * Chakma. Since: 1.32
     */
    CHAKMA,
    
    /**
     * Meroitic Cursive. Since: 1.32
     */
    MEROITIC_CURSIVE,
    
    /**
     * Meroitic Hieroglyphs. Since: 1.32
     */
    MEROITIC_HIEROGLYPHS,
    
    /**
     * Miao. Since: 1.32
     */
    MIAO,
    
    /**
     * Sharada. Since: 1.32
     */
    SHARADA,
    
    /**
     * Sora Sompeng. Since: 1.32
     */
    SORA_SOMPENG,
    
    /**
     * Takri. Since: 1.32
     */
    TAKRI,
    
    /**
     * Bassa. Since: 1.40
     */
    BASSA_VAH,
    
    /**
     * Caucasian Albanian. Since: 1.40
     */
    CAUCASIAN_ALBANIAN,
    
    /**
     * Duployan. Since: 1.40
     */
    DUPLOYAN,
    
    /**
     * Elbasan. Since: 1.40
     */
    ELBASAN,
    
    /**
     * Grantha. Since: 1.40
     */
    GRANTHA,
    
    /**
     * Kjohki. Since: 1.40
     */
    KHOJKI,
    
    /**
     * Khudawadi, Sindhi. Since: 1.40
     */
    KHUDAWADI,
    
    /**
     * Linear A. Since: 1.40
     */
    LINEAR_A,
    
    /**
     * Mahajani. Since: 1.40
     */
    MAHAJANI,
    
    /**
     * Manichaean. Since: 1.40
     */
    MANICHAEAN,
    
    /**
     * Mende Kikakui. Since: 1.40
     */
    MENDE_KIKAKUI,
    
    /**
     * Modi. Since: 1.40
     */
    MODI,
    
    /**
     * Mro. Since: 1.40
     */
    MRO,
    
    /**
     * Nabataean. Since: 1.40
     */
    NABATAEAN,
    
    /**
     * Old North Arabian. Since: 1.40
     */
    OLD_NORTH_ARABIAN,
    
    /**
     * Old Permic. Since: 1.40
     */
    OLD_PERMIC,
    
    /**
     * Pahawh Hmong. Since: 1.40
     */
    PAHAWH_HMONG,
    
    /**
     * Palmyrene. Since: 1.40
     */
    PALMYRENE,
    
    /**
     * Pau Cin Hau. Since: 1.40
     */
    PAU_CIN_HAU,
    
    /**
     * Psalter Pahlavi. Since: 1.40
     */
    PSALTER_PAHLAVI,
    
    /**
     * Siddham. Since: 1.40
     */
    SIDDHAM,
    
    /**
     * Tirhuta. Since: 1.40
     */
    TIRHUTA,
    
    /**
     * Warang Citi. Since: 1.40
     */
    WARANG_CITI,
    
    /**
     * Ahom. Since: 1.40
     */
    AHOM,
    
    /**
     * Anatolian Hieroglyphs. Since: 1.40
     */
    ANATOLIAN_HIEROGLYPHS,
    
    /**
     * Hatran. Since: 1.40
     */
    HATRAN,
    
    /**
     * Multani. Since: 1.40
     */
    MULTANI,
    
    /**
     * Old Hungarian. Since: 1.40
     */
    OLD_HUNGARIAN,
    
    /**
     * Signwriting. Since: 1.40
     */
    SIGNWRITING;
    
    public static Script fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID_CODE -> -1;
            case COMMON -> 0;
            case INHERITED -> 1;
            case ARABIC -> 2;
            case ARMENIAN -> 3;
            case BENGALI -> 4;
            case BOPOMOFO -> 5;
            case CHEROKEE -> 6;
            case COPTIC -> 7;
            case CYRILLIC -> 8;
            case DESERET -> 9;
            case DEVANAGARI -> 10;
            case ETHIOPIC -> 11;
            case GEORGIAN -> 12;
            case GOTHIC -> 13;
            case GREEK -> 14;
            case GUJARATI -> 15;
            case GURMUKHI -> 16;
            case HAN -> 17;
            case HANGUL -> 18;
            case HEBREW -> 19;
            case HIRAGANA -> 20;
            case KANNADA -> 21;
            case KATAKANA -> 22;
            case KHMER -> 23;
            case LAO -> 24;
            case LATIN -> 25;
            case MALAYALAM -> 26;
            case MONGOLIAN -> 27;
            case MYANMAR -> 28;
            case OGHAM -> 29;
            case OLD_ITALIC -> 30;
            case ORIYA -> 31;
            case RUNIC -> 32;
            case SINHALA -> 33;
            case SYRIAC -> 34;
            case TAMIL -> 35;
            case TELUGU -> 36;
            case THAANA -> 37;
            case THAI -> 38;
            case TIBETAN -> 39;
            case CANADIAN_ABORIGINAL -> 40;
            case YI -> 41;
            case TAGALOG -> 42;
            case HANUNOO -> 43;
            case BUHID -> 44;
            case TAGBANWA -> 45;
            case BRAILLE -> 46;
            case CYPRIOT -> 47;
            case LIMBU -> 48;
            case OSMANYA -> 49;
            case SHAVIAN -> 50;
            case LINEAR_B -> 51;
            case TAI_LE -> 52;
            case UGARITIC -> 53;
            case NEW_TAI_LUE -> 54;
            case BUGINESE -> 55;
            case GLAGOLITIC -> 56;
            case TIFINAGH -> 57;
            case SYLOTI_NAGRI -> 58;
            case OLD_PERSIAN -> 59;
            case KHAROSHTHI -> 60;
            case UNKNOWN -> 61;
            case BALINESE -> 62;
            case CUNEIFORM -> 63;
            case PHOENICIAN -> 64;
            case PHAGS_PA -> 65;
            case NKO -> 66;
            case KAYAH_LI -> 67;
            case LEPCHA -> 68;
            case REJANG -> 69;
            case SUNDANESE -> 70;
            case SAURASHTRA -> 71;
            case CHAM -> 72;
            case OL_CHIKI -> 73;
            case VAI -> 74;
            case CARIAN -> 75;
            case LYCIAN -> 76;
            case LYDIAN -> 77;
            case BATAK -> 78;
            case BRAHMI -> 79;
            case MANDAIC -> 80;
            case CHAKMA -> 81;
            case MEROITIC_CURSIVE -> 82;
            case MEROITIC_HIEROGLYPHS -> 83;
            case MIAO -> 84;
            case SHARADA -> 85;
            case SORA_SOMPENG -> 86;
            case TAKRI -> 87;
            case BASSA_VAH -> 88;
            case CAUCASIAN_ALBANIAN -> 89;
            case DUPLOYAN -> 90;
            case ELBASAN -> 91;
            case GRANTHA -> 92;
            case KHOJKI -> 93;
            case KHUDAWADI -> 94;
            case LINEAR_A -> 95;
            case MAHAJANI -> 96;
            case MANICHAEAN -> 97;
            case MENDE_KIKAKUI -> 98;
            case MODI -> 99;
            case MRO -> 100;
            case NABATAEAN -> 101;
            case OLD_NORTH_ARABIAN -> 102;
            case OLD_PERMIC -> 103;
            case PAHAWH_HMONG -> 104;
            case PALMYRENE -> 105;
            case PAU_CIN_HAU -> 106;
            case PSALTER_PAHLAVI -> 107;
            case SIDDHAM -> 108;
            case TIRHUTA -> 109;
            case WARANG_CITI -> 110;
            case AHOM -> 111;
            case ANATOLIAN_HIEROGLYPHS -> 112;
            case HATRAN -> 113;
            case MULTANI -> 114;
            case OLD_HUNGARIAN -> 115;
            case SIGNWRITING -> 116;
        };
    }

}
