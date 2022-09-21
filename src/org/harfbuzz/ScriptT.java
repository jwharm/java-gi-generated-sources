package org.harfbuzz;

/**
 * Data type for scripts. Each {@link script_t}'s value is an {@link tag_t} corresponding
 * to the four-letter values defined by <a href="https://unicode.org/iso15924/">ISO 15924</a>.
 * <p>
 * See also the Script (sc) property of the Unicode Character Database.
 */
public enum ScriptT {

    /**
     * {@code Zyyy}
     */
    COMMON,
    
    /**
     * {@code Zinh}
     */
    INHERITED,
    
    /**
     * {@code Zzzz}
     */
    UNKNOWN,
    
    /**
     * {@code Arab}
     */
    ARABIC,
    
    /**
     * {@code Armn}
     */
    ARMENIAN,
    
    /**
     * {@code Beng}
     */
    BENGALI,
    
    /**
     * {@code Cyrl}
     */
    CYRILLIC,
    
    /**
     * {@code Deva}
     */
    DEVANAGARI,
    
    /**
     * {@code Geor}
     */
    GEORGIAN,
    
    /**
     * {@code Grek}
     */
    GREEK,
    
    /**
     * {@code Gujr}
     */
    GUJARATI,
    
    /**
     * {@code Guru}
     */
    GURMUKHI,
    
    /**
     * {@code Hang}
     */
    HANGUL,
    
    /**
     * {@code Hani}
     */
    HAN,
    
    /**
     * {@code Hebr}
     */
    HEBREW,
    
    /**
     * {@code Hira}
     */
    HIRAGANA,
    
    /**
     * {@code Knda}
     */
    KANNADA,
    
    /**
     * {@code Kana}
     */
    KATAKANA,
    
    /**
     * {@code Laoo}
     */
    LAO,
    
    /**
     * {@code Latn}
     */
    LATIN,
    
    /**
     * {@code Mlym}
     */
    MALAYALAM,
    
    /**
     * {@code Orya}
     */
    ORIYA,
    
    /**
     * {@code Taml}
     */
    TAMIL,
    
    /**
     * {@code Telu}
     */
    TELUGU,
    
    /**
     * {@code Thai}
     */
    THAI,
    
    /**
     * {@code Tibt}
     */
    TIBETAN,
    
    /**
     * {@code Bopo}
     */
    BOPOMOFO,
    
    /**
     * {@code Brai}
     */
    BRAILLE,
    
    /**
     * {@code Cans}
     */
    CANADIAN_SYLLABICS,
    
    /**
     * {@code Cher}
     */
    CHEROKEE,
    
    /**
     * {@code Ethi}
     */
    ETHIOPIC,
    
    /**
     * {@code Khmr}
     */
    KHMER,
    
    /**
     * {@code Mong}
     */
    MONGOLIAN,
    
    /**
     * {@code Mymr}
     */
    MYANMAR,
    
    /**
     * {@code Ogam}
     */
    OGHAM,
    
    /**
     * {@code Runr}
     */
    RUNIC,
    
    /**
     * {@code Sinh}
     */
    SINHALA,
    
    /**
     * {@code Syrc}
     */
    SYRIAC,
    
    /**
     * {@code Thaa}
     */
    THAANA,
    
    /**
     * {@code Yiii}
     */
    YI,
    
    /**
     * {@code Dsrt}
     */
    DESERET,
    
    /**
     * {@code Goth}
     */
    GOTHIC,
    
    /**
     * {@code Ital}
     */
    OLD_ITALIC,
    
    /**
     * {@code Buhd}
     */
    BUHID,
    
    /**
     * {@code Hano}
     */
    HANUNOO,
    
    /**
     * {@code Tglg}
     */
    TAGALOG,
    
    /**
     * {@code Tagb}
     */
    TAGBANWA,
    
    /**
     * {@code Cprt}
     */
    CYPRIOT,
    
    /**
     * {@code Limb}
     */
    LIMBU,
    
    /**
     * {@code Linb}
     */
    LINEAR_B,
    
    /**
     * {@code Osma}
     */
    OSMANYA,
    
    /**
     * {@code Shaw}
     */
    SHAVIAN,
    
    /**
     * {@code Tale}
     */
    TAI_LE,
    
    /**
     * {@code Ugar}
     */
    UGARITIC,
    
    /**
     * {@code Bugi}
     */
    BUGINESE,
    
    /**
     * {@code Copt}
     */
    COPTIC,
    
    /**
     * {@code Glag}
     */
    GLAGOLITIC,
    
    /**
     * {@code Khar}
     */
    KHAROSHTHI,
    
    /**
     * {@code Talu}
     */
    NEW_TAI_LUE,
    
    /**
     * {@code Xpeo}
     */
    OLD_PERSIAN,
    
    /**
     * {@code Sylo}
     */
    SYLOTI_NAGRI,
    
    /**
     * {@code Tfng}
     */
    TIFINAGH,
    
    /**
     * {@code Bali}
     */
    BALINESE,
    
    /**
     * {@code Xsux}
     */
    CUNEIFORM,
    
    /**
     * {@code Nkoo}
     */
    NKO,
    
    /**
     * {@code Phag}
     */
    PHAGS_PA,
    
    /**
     * {@code Phnx}
     */
    PHOENICIAN,
    
    /**
     * {@code Cari}
     */
    CARIAN,
    
    /**
     * {@code Cham}
     */
    CHAM,
    
    /**
     * {@code Kali}
     */
    KAYAH_LI,
    
    /**
     * {@code Lepc}
     */
    LEPCHA,
    
    /**
     * {@code Lyci}
     */
    LYCIAN,
    
    /**
     * {@code Lydi}
     */
    LYDIAN,
    
    /**
     * {@code Olck}
     */
    OL_CHIKI,
    
    /**
     * {@code Rjng}
     */
    REJANG,
    
    /**
     * {@code Saur}
     */
    SAURASHTRA,
    
    /**
     * {@code Sund}
     */
    SUNDANESE,
    
    /**
     * {@code Vaii}
     */
    VAI,
    
    /**
     * {@code Avst}
     */
    AVESTAN,
    
    /**
     * {@code Bamu}
     */
    BAMUM,
    
    /**
     * {@code Egyp}
     */
    EGYPTIAN_HIEROGLYPHS,
    
    /**
     * {@code Armi}
     */
    IMPERIAL_ARAMAIC,
    
    /**
     * {@code Phli}
     */
    INSCRIPTIONAL_PAHLAVI,
    
    /**
     * {@code Prti}
     */
    INSCRIPTIONAL_PARTHIAN,
    
    /**
     * {@code Java}
     */
    JAVANESE,
    
    /**
     * {@code Kthi}
     */
    KAITHI,
    
    /**
     * {@code Lisu}
     */
    LISU,
    
    /**
     * {@code Mtei}
     */
    MEETEI_MAYEK,
    
    /**
     * {@code Sarb}
     */
    OLD_SOUTH_ARABIAN,
    
    /**
     * {@code Orkh}
     */
    OLD_TURKIC,
    
    /**
     * {@code Samr}
     */
    SAMARITAN,
    
    /**
     * {@code Lana}
     */
    TAI_THAM,
    
    /**
     * {@code Tavt}
     */
    TAI_VIET,
    
    /**
     * {@code Batk}
     */
    BATAK,
    
    /**
     * {@code Brah}
     */
    BRAHMI,
    
    /**
     * {@code Mand}
     */
    MANDAIC,
    
    /**
     * {@code Cakm}
     */
    CHAKMA,
    
    /**
     * {@code Merc}
     */
    MEROITIC_CURSIVE,
    
    /**
     * {@code Mero}
     */
    MEROITIC_HIEROGLYPHS,
    
    /**
     * {@code Plrd}
     */
    MIAO,
    
    /**
     * {@code Shrd}
     */
    SHARADA,
    
    /**
     * {@code Sora}
     */
    SORA_SOMPENG,
    
    /**
     * {@code Takr}
     */
    TAKRI,
    
    /**
     * {@code Bass}, Since: 0.9.30
     */
    BASSA_VAH,
    
    /**
     * {@code Aghb}, Since: 0.9.30
     */
    CAUCASIAN_ALBANIAN,
    
    /**
     * {@code Dupl}, Since: 0.9.30
     */
    DUPLOYAN,
    
    /**
     * {@code Elba}, Since: 0.9.30
     */
    ELBASAN,
    
    /**
     * {@code Gran}, Since: 0.9.30
     */
    GRANTHA,
    
    /**
     * {@code Khoj}, Since: 0.9.30
     */
    KHOJKI,
    
    /**
     * {@code Sind}, Since: 0.9.30
     */
    KHUDAWADI,
    
    /**
     * {@code Lina}, Since: 0.9.30
     */
    LINEAR_A,
    
    /**
     * {@code Mahj}, Since: 0.9.30
     */
    MAHAJANI,
    
    /**
     * {@code Mani}, Since: 0.9.30
     */
    MANICHAEAN,
    
    /**
     * {@code Mend}, Since: 0.9.30
     */
    MENDE_KIKAKUI,
    
    /**
     * {@code Modi}, Since: 0.9.30
     */
    MODI,
    
    /**
     * {@code Mroo}, Since: 0.9.30
     */
    MRO,
    
    /**
     * {@code Nbat}, Since: 0.9.30
     */
    NABATAEAN,
    
    /**
     * {@code Narb}, Since: 0.9.30
     */
    OLD_NORTH_ARABIAN,
    
    /**
     * {@code Perm}, Since: 0.9.30
     */
    OLD_PERMIC,
    
    /**
     * {@code Hmng}, Since: 0.9.30
     */
    PAHAWH_HMONG,
    
    /**
     * {@code Palm}, Since: 0.9.30
     */
    PALMYRENE,
    
    /**
     * {@code Pauc}, Since: 0.9.30
     */
    PAU_CIN_HAU,
    
    /**
     * {@code Phlp}, Since: 0.9.30
     */
    PSALTER_PAHLAVI,
    
    /**
     * {@code Sidd}, Since: 0.9.30
     */
    SIDDHAM,
    
    /**
     * {@code Tirh}, Since: 0.9.30
     */
    TIRHUTA,
    
    /**
     * {@code Wara}, Since: 0.9.30
     */
    WARANG_CITI,
    
    /**
     * {@code Ahom}, Since: 0.9.30
     */
    AHOM,
    
    /**
     * {@code Hluw}, Since: 0.9.30
     */
    ANATOLIAN_HIEROGLYPHS,
    
    /**
     * {@code Hatr}, Since: 0.9.30
     */
    HATRAN,
    
    /**
     * {@code Mult}, Since: 0.9.30
     */
    MULTANI,
    
    /**
     * {@code Hung}, Since: 0.9.30
     */
    OLD_HUNGARIAN,
    
    /**
     * {@code Sgnw}, Since: 0.9.30
     */
    SIGNWRITING,
    
    /**
     * {@code Adlm}, Since: 1.3.0
     */
    ADLAM,
    
    /**
     * {@code Bhks}, Since: 1.3.0
     */
    BHAIKSUKI,
    
    /**
     * {@code Marc}, Since: 1.3.0
     */
    MARCHEN,
    
    /**
     * {@code Osge}, Since: 1.3.0
     */
    OSAGE,
    
    /**
     * {@code Tang}, Since: 1.3.0
     */
    TANGUT,
    
    /**
     * {@code Newa}, Since: 1.3.0
     */
    NEWA,
    
    /**
     * {@code Gonm}, Since: 1.6.0
     */
    MASARAM_GONDI,
    
    /**
     * {@code Nshu}, Since: 1.6.0
     */
    NUSHU,
    
    /**
     * {@code Soyo}, Since: 1.6.0
     */
    SOYOMBO,
    
    /**
     * {@code Zanb}, Since: 1.6.0
     */
    ZANABAZAR_SQUARE,
    
    /**
     * {@code Dogr}, Since: 1.8.0
     */
    DOGRA,
    
    /**
     * {@code Gong}, Since: 1.8.0
     */
    GUNJALA_GONDI,
    
    /**
     * {@code Rohg}, Since: 1.8.0
     */
    HANIFI_ROHINGYA,
    
    /**
     * {@code Maka}, Since: 1.8.0
     */
    MAKASAR,
    
    /**
     * {@code Medf}, Since: 1.8.0
     */
    MEDEFAIDRIN,
    
    /**
     * {@code Sogo}, Since: 1.8.0
     */
    OLD_SOGDIAN,
    
    /**
     * {@code Sogd}, Since: 1.8.0
     */
    SOGDIAN,
    
    /**
     * {@code Elym}, Since: 2.4.0
     */
    ELYMAIC,
    
    /**
     * {@code Nand}, Since: 2.4.0
     */
    NANDINAGARI,
    
    /**
     * {@code Hmnp}, Since: 2.4.0
     */
    NYIAKENG_PUACHUE_HMONG,
    
    /**
     * {@code Wcho}, Since: 2.4.0
     */
    WANCHO,
    
    /**
     * {@code Chrs}, Since: 2.6.7
     */
    CHORASMIAN,
    
    /**
     * {@code Diak}, Since: 2.6.7
     */
    DIVES_AKURU,
    
    /**
     * {@code Kits}, Since: 2.6.7
     */
    KHITAN_SMALL_SCRIPT,
    
    /**
     * {@code Yezi}, Since: 2.6.7
     */
    YEZIDI,
    
    /**
     * {@code Cpmn}, Since: 3.0.0
     */
    CYPRO_MINOAN,
    
    /**
     * {@code Ougr}, Since: 3.0.0
     */
    OLD_UYGHUR,
    
    /**
     * {@code Tnsa}, Since: 3.0.0
     */
    TANGSA,
    
    /**
     * {@code Toto}, Since: 3.0.0
     */
    TOTO,
    
    /**
     * {@code Vith}, Since: 3.0.0
     */
    VITHKUQI,
    
    /**
     * {@code Zmth}, Since: 3.4.0
     */
    MATH,
    
    /**
     * No script set
     */
    INVALID;
    
    public static ScriptT fromValue(int value) {
        return switch(value) {
            case 1517910393 -> COMMON;
            case 1516858984 -> INHERITED;
            case 1517976186 -> UNKNOWN;
            case 1098015074 -> ARABIC;
            case 1098018158 -> ARMENIAN;
            case 1113943655 -> BENGALI;
            case 1132032620 -> CYRILLIC;
            case 1147500129 -> DEVANAGARI;
            case 1197830002 -> GEORGIAN;
            case 1198679403 -> GREEK;
            case 1198877298 -> GUJARATI;
            case 1198879349 -> GURMUKHI;
            case 1214344807 -> HANGUL;
            case 1214344809 -> HAN;
            case 1214603890 -> HEBREW;
            case 1214870113 -> HIRAGANA;
            case 1265525857 -> KANNADA;
            case 1264676449 -> KATAKANA;
            case 1281453935 -> LAO;
            case 1281455214 -> LATIN;
            case 1298954605 -> MALAYALAM;
            case 1332902241 -> ORIYA;
            case 1415671148 -> TAMIL;
            case 1415933045 -> TELUGU;
            case 1416126825 -> THAI;
            case 1416192628 -> TIBETAN;
            case 1114599535 -> BOPOMOFO;
            case 1114792297 -> BRAILLE;
            case 1130458739 -> CANADIAN_SYLLABICS;
            case 1130915186 -> CHEROKEE;
            case 1165256809 -> ETHIOPIC;
            case 1265134962 -> KHMER;
            case 1299148391 -> MONGOLIAN;
            case 1299803506 -> MYANMAR;
            case 1332175213 -> OGHAM;
            case 1383427698 -> RUNIC;
            case 1399418472 -> SINHALA;
            case 1400468067 -> SYRIAC;
            case 1416126817 -> THAANA;
            case 1500080489 -> YI;
            case 1148416628 -> DESERET;
            case 1198486632 -> GOTHIC;
            case 1232363884 -> OLD_ITALIC;
            case 1114990692 -> BUHID;
            case 1214344815 -> HANUNOO;
            case 1416064103 -> TAGALOG;
            case 1415669602 -> TAGBANWA;
            case 1131442804 -> CYPRIOT;
            case 1281977698 -> LIMBU;
            case 1281977954 -> LINEAR_B;
            case 1332964705 -> OSMANYA;
            case 1399349623 -> SHAVIAN;
            case 1415670885 -> TAI_LE;
            case 1432838514 -> UGARITIC;
            case 1114990441 -> BUGINESE;
            case 1131376756 -> COPTIC;
            case 1198285159 -> GLAGOLITIC;
            case 1265131890 -> KHAROSHTHI;
            case 1415670901 -> NEW_TAI_LUE;
            case 1483761007 -> OLD_PERSIAN;
            case 1400466543 -> SYLOTI_NAGRI;
            case 1415999079 -> TIFINAGH;
            case 1113681001 -> BALINESE;
            case 1483961720 -> CUNEIFORM;
            case 1315663727 -> NKO;
            case 1349017959 -> PHAGS_PA;
            case 1349021304 -> PHOENICIAN;
            case 1130459753 -> CARIAN;
            case 1130914157 -> CHAM;
            case 1264675945 -> KAYAH_LI;
            case 1281716323 -> LEPCHA;
            case 1283023721 -> LYCIAN;
            case 1283023977 -> LYDIAN;
            case 1332503403 -> OL_CHIKI;
            case 1382706791 -> REJANG;
            case 1398895986 -> SAURASHTRA;
            case 1400204900 -> SUNDANESE;
            case 1449224553 -> VAI;
            case 1098281844 -> AVESTAN;
            case 1113681269 -> BAMUM;
            case 1164409200 -> EGYPTIAN_HIEROGLYPHS;
            case 1098018153 -> IMPERIAL_ARAMAIC;
            case 1349020777 -> INSCRIPTIONAL_PAHLAVI;
            case 1349678185 -> INSCRIPTIONAL_PARTHIAN;
            case 1247901281 -> JAVANESE;
            case 1265920105 -> KAITHI;
            case 1281979253 -> LISU;
            case 1299473769 -> MEETEI_MAYEK;
            case 1398895202 -> OLD_SOUTH_ARABIAN;
            case 1332898664 -> OLD_TURKIC;
            case 1398893938 -> SAMARITAN;
            case 1281453665 -> TAI_THAM;
            case 1415673460 -> TAI_VIET;
            case 1113683051 -> BATAK;
            case 1114792296 -> BRAHMI;
            case 1298230884 -> MANDAIC;
            case 1130457965 -> CHAKMA;
            case 1298494051 -> MEROITIC_CURSIVE;
            case 1298494063 -> MEROITIC_HIEROGLYPHS;
            case 1349284452 -> MIAO;
            case 1399353956 -> SHARADA;
            case 1399812705 -> SORA_SOMPENG;
            case 1415670642 -> TAKRI;
            case 1113682803 -> BASSA_VAH;
            case 1097295970 -> CAUCASIAN_ALBANIAN;
            case 1148547180 -> DUPLOYAN;
            case 1164730977 -> ELBASAN;
            case 1198678382 -> GRANTHA;
            case 1265135466 -> KHOJKI;
            case 1399418468 -> KHUDAWADI;
            case 1281977953 -> LINEAR_A;
            case 1298229354 -> MAHAJANI;
            case 1298230889 -> MANICHAEAN;
            case 1298493028 -> MENDE_KIKAKUI;
            case 1299145833 -> MODI;
            case 1299345263 -> MRO;
            case 1315070324 -> NABATAEAN;
            case 1315009122 -> OLD_NORTH_ARABIAN;
            case 1348825709 -> OLD_PERMIC;
            case 1215131239 -> PAHAWH_HMONG;
            case 1348562029 -> PALMYRENE;
            case 1348564323 -> PAU_CIN_HAU;
            case 1349020784 -> PSALTER_PAHLAVI;
            case 1399415908 -> SIDDHAM;
            case 1416196712 -> TIRHUTA;
            case 1466004065 -> WARANG_CITI;
            case 1097363309 -> AHOM;
            case 1215067511 -> ANATOLIAN_HIEROGLYPHS;
            case 1214346354 -> HATRAN;
            case 1299541108 -> MULTANI;
            case 1215655527 -> OLD_HUNGARIAN;
            case 1399287415 -> SIGNWRITING;
            case 1097100397 -> ADLAM;
            case 1114139507 -> BHAIKSUKI;
            case 1298231907 -> MARCHEN;
            case 1332963173 -> OSAGE;
            case 1415671399 -> TANGUT;
            case 1315272545 -> NEWA;
            case 1198485101 -> MASARAM_GONDI;
            case 1316186229 -> NUSHU;
            case 1399814511 -> SOYOMBO;
            case 1516334690 -> ZANABAZAR_SQUARE;
            case 1148151666 -> DOGRA;
            case 1198485095 -> GUNJALA_GONDI;
            case 1383032935 -> HANIFI_ROHINGYA;
            case 1298230113 -> MAKASAR;
            case 1298490470 -> MEDEFAIDRIN;
            case 1399809903 -> OLD_SOGDIAN;
            case 1399809892 -> SOGDIAN;
            case 1164736877 -> ELYMAIC;
            case 1315008100 -> NANDINAGARI;
            case 1215131248 -> NYIAKENG_PUACHUE_HMONG;
            case 1466132591 -> WANCHO;
            case 1130918515 -> CHORASMIAN;
            case 1147756907 -> DIVES_AKURU;
            case 1265202291 -> KHITAN_SMALL_SCRIPT;
            case 1499822697 -> YEZIDI;
            case 1131441518 -> CYPRO_MINOAN;
            case 1333094258 -> OLD_UYGHUR;
            case 1416524641 -> TANGSA;
            case 1416590447 -> TOTO;
            case 1449751656 -> VITHKUQI;
            case 1517122664 -> MATH;
            case 0 -> INVALID;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case COMMON -> 1517910393;
            case INHERITED -> 1516858984;
            case UNKNOWN -> 1517976186;
            case ARABIC -> 1098015074;
            case ARMENIAN -> 1098018158;
            case BENGALI -> 1113943655;
            case CYRILLIC -> 1132032620;
            case DEVANAGARI -> 1147500129;
            case GEORGIAN -> 1197830002;
            case GREEK -> 1198679403;
            case GUJARATI -> 1198877298;
            case GURMUKHI -> 1198879349;
            case HANGUL -> 1214344807;
            case HAN -> 1214344809;
            case HEBREW -> 1214603890;
            case HIRAGANA -> 1214870113;
            case KANNADA -> 1265525857;
            case KATAKANA -> 1264676449;
            case LAO -> 1281453935;
            case LATIN -> 1281455214;
            case MALAYALAM -> 1298954605;
            case ORIYA -> 1332902241;
            case TAMIL -> 1415671148;
            case TELUGU -> 1415933045;
            case THAI -> 1416126825;
            case TIBETAN -> 1416192628;
            case BOPOMOFO -> 1114599535;
            case BRAILLE -> 1114792297;
            case CANADIAN_SYLLABICS -> 1130458739;
            case CHEROKEE -> 1130915186;
            case ETHIOPIC -> 1165256809;
            case KHMER -> 1265134962;
            case MONGOLIAN -> 1299148391;
            case MYANMAR -> 1299803506;
            case OGHAM -> 1332175213;
            case RUNIC -> 1383427698;
            case SINHALA -> 1399418472;
            case SYRIAC -> 1400468067;
            case THAANA -> 1416126817;
            case YI -> 1500080489;
            case DESERET -> 1148416628;
            case GOTHIC -> 1198486632;
            case OLD_ITALIC -> 1232363884;
            case BUHID -> 1114990692;
            case HANUNOO -> 1214344815;
            case TAGALOG -> 1416064103;
            case TAGBANWA -> 1415669602;
            case CYPRIOT -> 1131442804;
            case LIMBU -> 1281977698;
            case LINEAR_B -> 1281977954;
            case OSMANYA -> 1332964705;
            case SHAVIAN -> 1399349623;
            case TAI_LE -> 1415670885;
            case UGARITIC -> 1432838514;
            case BUGINESE -> 1114990441;
            case COPTIC -> 1131376756;
            case GLAGOLITIC -> 1198285159;
            case KHAROSHTHI -> 1265131890;
            case NEW_TAI_LUE -> 1415670901;
            case OLD_PERSIAN -> 1483761007;
            case SYLOTI_NAGRI -> 1400466543;
            case TIFINAGH -> 1415999079;
            case BALINESE -> 1113681001;
            case CUNEIFORM -> 1483961720;
            case NKO -> 1315663727;
            case PHAGS_PA -> 1349017959;
            case PHOENICIAN -> 1349021304;
            case CARIAN -> 1130459753;
            case CHAM -> 1130914157;
            case KAYAH_LI -> 1264675945;
            case LEPCHA -> 1281716323;
            case LYCIAN -> 1283023721;
            case LYDIAN -> 1283023977;
            case OL_CHIKI -> 1332503403;
            case REJANG -> 1382706791;
            case SAURASHTRA -> 1398895986;
            case SUNDANESE -> 1400204900;
            case VAI -> 1449224553;
            case AVESTAN -> 1098281844;
            case BAMUM -> 1113681269;
            case EGYPTIAN_HIEROGLYPHS -> 1164409200;
            case IMPERIAL_ARAMAIC -> 1098018153;
            case INSCRIPTIONAL_PAHLAVI -> 1349020777;
            case INSCRIPTIONAL_PARTHIAN -> 1349678185;
            case JAVANESE -> 1247901281;
            case KAITHI -> 1265920105;
            case LISU -> 1281979253;
            case MEETEI_MAYEK -> 1299473769;
            case OLD_SOUTH_ARABIAN -> 1398895202;
            case OLD_TURKIC -> 1332898664;
            case SAMARITAN -> 1398893938;
            case TAI_THAM -> 1281453665;
            case TAI_VIET -> 1415673460;
            case BATAK -> 1113683051;
            case BRAHMI -> 1114792296;
            case MANDAIC -> 1298230884;
            case CHAKMA -> 1130457965;
            case MEROITIC_CURSIVE -> 1298494051;
            case MEROITIC_HIEROGLYPHS -> 1298494063;
            case MIAO -> 1349284452;
            case SHARADA -> 1399353956;
            case SORA_SOMPENG -> 1399812705;
            case TAKRI -> 1415670642;
            case BASSA_VAH -> 1113682803;
            case CAUCASIAN_ALBANIAN -> 1097295970;
            case DUPLOYAN -> 1148547180;
            case ELBASAN -> 1164730977;
            case GRANTHA -> 1198678382;
            case KHOJKI -> 1265135466;
            case KHUDAWADI -> 1399418468;
            case LINEAR_A -> 1281977953;
            case MAHAJANI -> 1298229354;
            case MANICHAEAN -> 1298230889;
            case MENDE_KIKAKUI -> 1298493028;
            case MODI -> 1299145833;
            case MRO -> 1299345263;
            case NABATAEAN -> 1315070324;
            case OLD_NORTH_ARABIAN -> 1315009122;
            case OLD_PERMIC -> 1348825709;
            case PAHAWH_HMONG -> 1215131239;
            case PALMYRENE -> 1348562029;
            case PAU_CIN_HAU -> 1348564323;
            case PSALTER_PAHLAVI -> 1349020784;
            case SIDDHAM -> 1399415908;
            case TIRHUTA -> 1416196712;
            case WARANG_CITI -> 1466004065;
            case AHOM -> 1097363309;
            case ANATOLIAN_HIEROGLYPHS -> 1215067511;
            case HATRAN -> 1214346354;
            case MULTANI -> 1299541108;
            case OLD_HUNGARIAN -> 1215655527;
            case SIGNWRITING -> 1399287415;
            case ADLAM -> 1097100397;
            case BHAIKSUKI -> 1114139507;
            case MARCHEN -> 1298231907;
            case OSAGE -> 1332963173;
            case TANGUT -> 1415671399;
            case NEWA -> 1315272545;
            case MASARAM_GONDI -> 1198485101;
            case NUSHU -> 1316186229;
            case SOYOMBO -> 1399814511;
            case ZANABAZAR_SQUARE -> 1516334690;
            case DOGRA -> 1148151666;
            case GUNJALA_GONDI -> 1198485095;
            case HANIFI_ROHINGYA -> 1383032935;
            case MAKASAR -> 1298230113;
            case MEDEFAIDRIN -> 1298490470;
            case OLD_SOGDIAN -> 1399809903;
            case SOGDIAN -> 1399809892;
            case ELYMAIC -> 1164736877;
            case NANDINAGARI -> 1315008100;
            case NYIAKENG_PUACHUE_HMONG -> 1215131248;
            case WANCHO -> 1466132591;
            case CHORASMIAN -> 1130918515;
            case DIVES_AKURU -> 1147756907;
            case KHITAN_SMALL_SCRIPT -> 1265202291;
            case YEZIDI -> 1499822697;
            case CYPRO_MINOAN -> 1131441518;
            case OLD_UYGHUR -> 1333094258;
            case TANGSA -> 1416524641;
            case TOTO -> 1416590447;
            case VITHKUQI -> 1449751656;
            case MATH -> 1517122664;
            case INVALID -> 0;
        };
    }

}
