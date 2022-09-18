package org.gtk.glib;

/**
 * The {@link org.gtk.glib.UnicodeScript} enumeration identifies different writing
 * systems. The values correspond to the names as defined in the
 * Unicode standard. The enumeration has been added in GLib 2.14,
 * and is interchangeable with {@link org.pango.Script} 
 * 
 * Note that new types may be added in the future. Applications
 * should be ready to handle unknown values.
 * See {@link [Unicode Standard Annex <code>#24</code>  Script names]}(http://www.unicode.org/reports/tr24/).
 */
public enum UnicodeScript {

    /**
     * a value never returned from g_unichar_get_script()
     */
    INVALID_CODE,
    
    /**
     * a character used by multiple different scripts
     */
    COMMON,
    
    /**
     * a mark glyph that takes its script from the
     *                               base glyph to which it is attached
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
     * New Tai Lue
     */
    NEW_TAI_LUE,
    
    /**
     * Buginese
     */
    BUGINESE,
    
    /**
     * Glagolitic
     */
    GLAGOLITIC,
    
    /**
     * Tifinagh
     */
    TIFINAGH,
    
    /**
     * Syloti Nagri
     */
    SYLOTI_NAGRI,
    
    /**
     * Old Persian
     */
    OLD_PERSIAN,
    
    /**
     * Kharoshthi
     */
    KHAROSHTHI,
    
    /**
     * an unassigned code point
     */
    UNKNOWN,
    
    /**
     * Balinese
     */
    BALINESE,
    
    /**
     * Cuneiform
     */
    CUNEIFORM,
    
    /**
     * Phoenician
     */
    PHOENICIAN,
    
    /**
     * Phags-pa
     */
    PHAGS_PA,
    
    /**
     * N&<code>#39</code> Ko
     */
    NKO,
    
    /**
     * Kayah Li. Since 2.16.3
     */
    KAYAH_LI,
    
    /**
     * Lepcha. Since 2.16.3
     */
    LEPCHA,
    
    /**
     * Rejang. Since 2.16.3
     */
    REJANG,
    
    /**
     * Sundanese. Since 2.16.3
     */
    SUNDANESE,
    
    /**
     * Saurashtra. Since 2.16.3
     */
    SAURASHTRA,
    
    /**
     * Cham. Since 2.16.3
     */
    CHAM,
    
    /**
     * Ol Chiki. Since 2.16.3
     */
    OL_CHIKI,
    
    /**
     * Vai. Since 2.16.3
     */
    VAI,
    
    /**
     * Carian. Since 2.16.3
     */
    CARIAN,
    
    /**
     * Lycian. Since 2.16.3
     */
    LYCIAN,
    
    /**
     * Lydian. Since 2.16.3
     */
    LYDIAN,
    
    /**
     * Avestan. Since 2.26
     */
    AVESTAN,
    
    /**
     * Bamum. Since 2.26
     */
    BAMUM,
    
    /**
     * Egyptian Hieroglpyhs. Since 2.26
     */
    EGYPTIAN_HIEROGLYPHS,
    
    /**
     * Imperial Aramaic. Since 2.26
     */
    IMPERIAL_ARAMAIC,
    
    /**
     * Inscriptional Pahlavi. Since 2.26
     */
    INSCRIPTIONAL_PAHLAVI,
    
    /**
     * Inscriptional Parthian. Since 2.26
     */
    INSCRIPTIONAL_PARTHIAN,
    
    /**
     * Javanese. Since 2.26
     */
    JAVANESE,
    
    /**
     * Kaithi. Since 2.26
     */
    KAITHI,
    
    /**
     * Lisu. Since 2.26
     */
    LISU,
    
    /**
     * Meetei Mayek. Since 2.26
     */
    MEETEI_MAYEK,
    
    /**
     * Old South Arabian. Since 2.26
     */
    OLD_SOUTH_ARABIAN,
    
    /**
     * Old Turkic. Since 2.28
     */
    OLD_TURKIC,
    
    /**
     * Samaritan. Since 2.26
     */
    SAMARITAN,
    
    /**
     * Tai Tham. Since 2.26
     */
    TAI_THAM,
    
    /**
     * Tai Viet. Since 2.26
     */
    TAI_VIET,
    
    /**
     * Batak. Since 2.28
     */
    BATAK,
    
    /**
     * Brahmi. Since 2.28
     */
    BRAHMI,
    
    /**
     * Mandaic. Since 2.28
     */
    MANDAIC,
    
    /**
     * Chakma. Since: 2.32
     */
    CHAKMA,
    
    /**
     * Meroitic Cursive. Since: 2.32
     */
    MEROITIC_CURSIVE,
    
    /**
     * Meroitic Hieroglyphs. Since: 2.32
     */
    MEROITIC_HIEROGLYPHS,
    
    /**
     * Miao. Since: 2.32
     */
    MIAO,
    
    /**
     * Sharada. Since: 2.32
     */
    SHARADA,
    
    /**
     * Sora Sompeng. Since: 2.32
     */
    SORA_SOMPENG,
    
    /**
     * Takri. Since: 2.32
     */
    TAKRI,
    
    /**
     * Bassa. Since: 2.42
     */
    BASSA_VAH,
    
    /**
     * Caucasian Albanian. Since: 2.42
     */
    CAUCASIAN_ALBANIAN,
    
    /**
     * Duployan. Since: 2.42
     */
    DUPLOYAN,
    
    /**
     * Elbasan. Since: 2.42
     */
    ELBASAN,
    
    /**
     * Grantha. Since: 2.42
     */
    GRANTHA,
    
    /**
     * Kjohki. Since: 2.42
     */
    KHOJKI,
    
    /**
     * Khudawadi, Sindhi. Since: 2.42
     */
    KHUDAWADI,
    
    /**
     * Linear A. Since: 2.42
     */
    LINEAR_A,
    
    /**
     * Mahajani. Since: 2.42
     */
    MAHAJANI,
    
    /**
     * Manichaean. Since: 2.42
     */
    MANICHAEAN,
    
    /**
     * Mende Kikakui. Since: 2.42
     */
    MENDE_KIKAKUI,
    
    /**
     * Modi. Since: 2.42
     */
    MODI,
    
    /**
     * Mro. Since: 2.42
     */
    MRO,
    
    /**
     * Nabataean. Since: 2.42
     */
    NABATAEAN,
    
    /**
     * Old North Arabian. Since: 2.42
     */
    OLD_NORTH_ARABIAN,
    
    /**
     * Old Permic. Since: 2.42
     */
    OLD_PERMIC,
    
    /**
     * Pahawh Hmong. Since: 2.42
     */
    PAHAWH_HMONG,
    
    /**
     * Palmyrene. Since: 2.42
     */
    PALMYRENE,
    
    /**
     * Pau Cin Hau. Since: 2.42
     */
    PAU_CIN_HAU,
    
    /**
     * Psalter Pahlavi. Since: 2.42
     */
    PSALTER_PAHLAVI,
    
    /**
     * Siddham. Since: 2.42
     */
    SIDDHAM,
    
    /**
     * Tirhuta. Since: 2.42
     */
    TIRHUTA,
    
    /**
     * Warang Citi. Since: 2.42
     */
    WARANG_CITI,
    
    /**
     * Ahom. Since: 2.48
     */
    AHOM,
    
    /**
     * Anatolian Hieroglyphs. Since: 2.48
     */
    ANATOLIAN_HIEROGLYPHS,
    
    /**
     * Hatran. Since: 2.48
     */
    HATRAN,
    
    /**
     * Multani. Since: 2.48
     */
    MULTANI,
    
    /**
     * Old Hungarian. Since: 2.48
     */
    OLD_HUNGARIAN,
    
    /**
     * Signwriting. Since: 2.48
     */
    SIGNWRITING,
    
    /**
     * Adlam. Since: 2.50
     */
    ADLAM,
    
    /**
     * Bhaiksuki. Since: 2.50
     */
    BHAIKSUKI,
    
    /**
     * Marchen. Since: 2.50
     */
    MARCHEN,
    
    /**
     * Newa. Since: 2.50
     */
    NEWA,
    
    /**
     * Osage. Since: 2.50
     */
    OSAGE,
    
    /**
     * Tangut. Since: 2.50
     */
    TANGUT,
    
    /**
     * Masaram Gondi. Since: 2.54
     */
    MASARAM_GONDI,
    
    /**
     * Nushu. Since: 2.54
     */
    NUSHU,
    
    /**
     * Soyombo. Since: 2.54
     */
    SOYOMBO,
    
    /**
     * Zanabazar Square. Since: 2.54
     */
    ZANABAZAR_SQUARE,
    
    /**
     * Dogra. Since: 2.58
     */
    DOGRA,
    
    /**
     * Gunjala Gondi. Since: 2.58
     */
    GUNJALA_GONDI,
    
    /**
     * Hanifi Rohingya. Since: 2.58
     */
    HANIFI_ROHINGYA,
    
    /**
     * Makasar. Since: 2.58
     */
    MAKASAR,
    
    /**
     * Medefaidrin. Since: 2.58
     */
    MEDEFAIDRIN,
    
    /**
     * Old Sogdian. Since: 2.58
     */
    OLD_SOGDIAN,
    
    /**
     * Sogdian. Since: 2.58
     */
    SOGDIAN,
    
    /**
     * Elym. Since: 2.62
     */
    ELYMAIC,
    
    /**
     * Nand. Since: 2.62
     */
    NANDINAGARI,
    
    /**
     * Rohg. Since: 2.62
     */
    NYIAKENG_PUACHUE_HMONG,
    
    /**
     * Wcho. Since: 2.62
     */
    WANCHO,
    
    /**
     * Chorasmian. Since: 2.66
     */
    CHORASMIAN,
    
    /**
     * Dives Akuru. Since: 2.66
     */
    DIVES_AKURU,
    
    /**
     * Khitan small script. Since: 2.66
     */
    KHITAN_SMALL_SCRIPT,
    
    /**
     * Yezidi. Since: 2.66
     */
    YEZIDI,
    
    /**
     * Cypro-Minoan. Since: 2.72
     */
    CYPRO_MINOAN,
    
    /**
     * Old Uyghur. Since: 2.72
     */
    OLD_UYGHUR,
    
    /**
     * Tangsa. Since: 2.72
     */
    TANGSA,
    
    /**
     * Toto. Since: 2.72
     */
    TOTO,
    
    /**
     * Vithkuqi. Since: 2.72
     */
    VITHKUQI,
    
    /**
     * Mathematical notation. Since: 2.72
     */
    MATH;
    
    public static UnicodeScript fromValue(int value) {
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
            case AVESTAN -> 78;
            case BAMUM -> 79;
            case EGYPTIAN_HIEROGLYPHS -> 80;
            case IMPERIAL_ARAMAIC -> 81;
            case INSCRIPTIONAL_PAHLAVI -> 82;
            case INSCRIPTIONAL_PARTHIAN -> 83;
            case JAVANESE -> 84;
            case KAITHI -> 85;
            case LISU -> 86;
            case MEETEI_MAYEK -> 87;
            case OLD_SOUTH_ARABIAN -> 88;
            case OLD_TURKIC -> 89;
            case SAMARITAN -> 90;
            case TAI_THAM -> 91;
            case TAI_VIET -> 92;
            case BATAK -> 93;
            case BRAHMI -> 94;
            case MANDAIC -> 95;
            case CHAKMA -> 96;
            case MEROITIC_CURSIVE -> 97;
            case MEROITIC_HIEROGLYPHS -> 98;
            case MIAO -> 99;
            case SHARADA -> 100;
            case SORA_SOMPENG -> 101;
            case TAKRI -> 102;
            case BASSA_VAH -> 103;
            case CAUCASIAN_ALBANIAN -> 104;
            case DUPLOYAN -> 105;
            case ELBASAN -> 106;
            case GRANTHA -> 107;
            case KHOJKI -> 108;
            case KHUDAWADI -> 109;
            case LINEAR_A -> 110;
            case MAHAJANI -> 111;
            case MANICHAEAN -> 112;
            case MENDE_KIKAKUI -> 113;
            case MODI -> 114;
            case MRO -> 115;
            case NABATAEAN -> 116;
            case OLD_NORTH_ARABIAN -> 117;
            case OLD_PERMIC -> 118;
            case PAHAWH_HMONG -> 119;
            case PALMYRENE -> 120;
            case PAU_CIN_HAU -> 121;
            case PSALTER_PAHLAVI -> 122;
            case SIDDHAM -> 123;
            case TIRHUTA -> 124;
            case WARANG_CITI -> 125;
            case AHOM -> 126;
            case ANATOLIAN_HIEROGLYPHS -> 127;
            case HATRAN -> 128;
            case MULTANI -> 129;
            case OLD_HUNGARIAN -> 130;
            case SIGNWRITING -> 131;
            case ADLAM -> 132;
            case BHAIKSUKI -> 133;
            case MARCHEN -> 134;
            case NEWA -> 135;
            case OSAGE -> 136;
            case TANGUT -> 137;
            case MASARAM_GONDI -> 138;
            case NUSHU -> 139;
            case SOYOMBO -> 140;
            case ZANABAZAR_SQUARE -> 141;
            case DOGRA -> 142;
            case GUNJALA_GONDI -> 143;
            case HANIFI_ROHINGYA -> 144;
            case MAKASAR -> 145;
            case MEDEFAIDRIN -> 146;
            case OLD_SOGDIAN -> 147;
            case SOGDIAN -> 148;
            case ELYMAIC -> 149;
            case NANDINAGARI -> 150;
            case NYIAKENG_PUACHUE_HMONG -> 151;
            case WANCHO -> 152;
            case CHORASMIAN -> 153;
            case DIVES_AKURU -> 154;
            case KHITAN_SMALL_SCRIPT -> 155;
            case YEZIDI -> 156;
            case CYPRO_MINOAN -> 157;
            case OLD_UYGHUR -> 158;
            case TANGSA -> 159;
            case TOTO -> 160;
            case VITHKUQI -> 161;
            case MATH -> 162;
        };
    }

}
