package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for scripts. Each {@link ScriptT}'s value is an {@link TagT} corresponding
 * to the four-letter values defined by <a href="https://unicode.org/iso15924/">ISO 15924</a>.
 * <p>
 * See also the Script (sc) property of the Unicode Character Database.
 */
public enum ScriptT implements io.github.jwharm.javagi.Enumeration {
    /**
     * {@code Zyyy}
     */
    COMMON(1517910393),
    /**
     * {@code Zinh}
     */
    INHERITED(1516858984),
    /**
     * {@code Zzzz}
     */
    UNKNOWN(1517976186),
    /**
     * {@code Arab}
     */
    ARABIC(1098015074),
    /**
     * {@code Armn}
     */
    ARMENIAN(1098018158),
    /**
     * {@code Beng}
     */
    BENGALI(1113943655),
    /**
     * {@code Cyrl}
     */
    CYRILLIC(1132032620),
    /**
     * {@code Deva}
     */
    DEVANAGARI(1147500129),
    /**
     * {@code Geor}
     */
    GEORGIAN(1197830002),
    /**
     * {@code Grek}
     */
    GREEK(1198679403),
    /**
     * {@code Gujr}
     */
    GUJARATI(1198877298),
    /**
     * {@code Guru}
     */
    GURMUKHI(1198879349),
    /**
     * {@code Hang}
     */
    HANGUL(1214344807),
    /**
     * {@code Hani}
     */
    HAN(1214344809),
    /**
     * {@code Hebr}
     */
    HEBREW(1214603890),
    /**
     * {@code Hira}
     */
    HIRAGANA(1214870113),
    /**
     * {@code Knda}
     */
    KANNADA(1265525857),
    /**
     * {@code Kana}
     */
    KATAKANA(1264676449),
    /**
     * {@code Laoo}
     */
    LAO(1281453935),
    /**
     * {@code Latn}
     */
    LATIN(1281455214),
    /**
     * {@code Mlym}
     */
    MALAYALAM(1298954605),
    /**
     * {@code Orya}
     */
    ORIYA(1332902241),
    /**
     * {@code Taml}
     */
    TAMIL(1415671148),
    /**
     * {@code Telu}
     */
    TELUGU(1415933045),
    /**
     * {@code Thai}
     */
    THAI(1416126825),
    /**
     * {@code Tibt}
     */
    TIBETAN(1416192628),
    /**
     * {@code Bopo}
     */
    BOPOMOFO(1114599535),
    /**
     * {@code Brai}
     */
    BRAILLE(1114792297),
    /**
     * {@code Cans}
     */
    CANADIAN_SYLLABICS(1130458739),
    /**
     * {@code Cher}
     */
    CHEROKEE(1130915186),
    /**
     * {@code Ethi}
     */
    ETHIOPIC(1165256809),
    /**
     * {@code Khmr}
     */
    KHMER(1265134962),
    /**
     * {@code Mong}
     */
    MONGOLIAN(1299148391),
    /**
     * {@code Mymr}
     */
    MYANMAR(1299803506),
    /**
     * {@code Ogam}
     */
    OGHAM(1332175213),
    /**
     * {@code Runr}
     */
    RUNIC(1383427698),
    /**
     * {@code Sinh}
     */
    SINHALA(1399418472),
    /**
     * {@code Syrc}
     */
    SYRIAC(1400468067),
    /**
     * {@code Thaa}
     */
    THAANA(1416126817),
    /**
     * {@code Yiii}
     */
    YI(1500080489),
    /**
     * {@code Dsrt}
     */
    DESERET(1148416628),
    /**
     * {@code Goth}
     */
    GOTHIC(1198486632),
    /**
     * {@code Ital}
     */
    OLD_ITALIC(1232363884),
    /**
     * {@code Buhd}
     */
    BUHID(1114990692),
    /**
     * {@code Hano}
     */
    HANUNOO(1214344815),
    /**
     * {@code Tglg}
     */
    TAGALOG(1416064103),
    /**
     * {@code Tagb}
     */
    TAGBANWA(1415669602),
    /**
     * {@code Cprt}
     */
    CYPRIOT(1131442804),
    /**
     * {@code Limb}
     */
    LIMBU(1281977698),
    /**
     * {@code Linb}
     */
    LINEAR_B(1281977954),
    /**
     * {@code Osma}
     */
    OSMANYA(1332964705),
    /**
     * {@code Shaw}
     */
    SHAVIAN(1399349623),
    /**
     * {@code Tale}
     */
    TAI_LE(1415670885),
    /**
     * {@code Ugar}
     */
    UGARITIC(1432838514),
    /**
     * {@code Bugi}
     */
    BUGINESE(1114990441),
    /**
     * {@code Copt}
     */
    COPTIC(1131376756),
    /**
     * {@code Glag}
     */
    GLAGOLITIC(1198285159),
    /**
     * {@code Khar}
     */
    KHAROSHTHI(1265131890),
    /**
     * {@code Talu}
     */
    NEW_TAI_LUE(1415670901),
    /**
     * {@code Xpeo}
     */
    OLD_PERSIAN(1483761007),
    /**
     * {@code Sylo}
     */
    SYLOTI_NAGRI(1400466543),
    /**
     * {@code Tfng}
     */
    TIFINAGH(1415999079),
    /**
     * {@code Bali}
     */
    BALINESE(1113681001),
    /**
     * {@code Xsux}
     */
    CUNEIFORM(1483961720),
    /**
     * {@code Nkoo}
     */
    NKO(1315663727),
    /**
     * {@code Phag}
     */
    PHAGS_PA(1349017959),
    /**
     * {@code Phnx}
     */
    PHOENICIAN(1349021304),
    /**
     * {@code Cari}
     */
    CARIAN(1130459753),
    /**
     * {@code Cham}
     */
    CHAM(1130914157),
    /**
     * {@code Kali}
     */
    KAYAH_LI(1264675945),
    /**
     * {@code Lepc}
     */
    LEPCHA(1281716323),
    /**
     * {@code Lyci}
     */
    LYCIAN(1283023721),
    /**
     * {@code Lydi}
     */
    LYDIAN(1283023977),
    /**
     * {@code Olck}
     */
    OL_CHIKI(1332503403),
    /**
     * {@code Rjng}
     */
    REJANG(1382706791),
    /**
     * {@code Saur}
     */
    SAURASHTRA(1398895986),
    /**
     * {@code Sund}
     */
    SUNDANESE(1400204900),
    /**
     * {@code Vaii}
     */
    VAI(1449224553),
    /**
     * {@code Avst}
     */
    AVESTAN(1098281844),
    /**
     * {@code Bamu}
     */
    BAMUM(1113681269),
    /**
     * {@code Egyp}
     */
    EGYPTIAN_HIEROGLYPHS(1164409200),
    /**
     * {@code Armi}
     */
    IMPERIAL_ARAMAIC(1098018153),
    /**
     * {@code Phli}
     */
    INSCRIPTIONAL_PAHLAVI(1349020777),
    /**
     * {@code Prti}
     */
    INSCRIPTIONAL_PARTHIAN(1349678185),
    /**
     * {@code Java}
     */
    JAVANESE(1247901281),
    /**
     * {@code Kthi}
     */
    KAITHI(1265920105),
    /**
     * {@code Lisu}
     */
    LISU(1281979253),
    /**
     * {@code Mtei}
     */
    MEETEI_MAYEK(1299473769),
    /**
     * {@code Sarb}
     */
    OLD_SOUTH_ARABIAN(1398895202),
    /**
     * {@code Orkh}
     */
    OLD_TURKIC(1332898664),
    /**
     * {@code Samr}
     */
    SAMARITAN(1398893938),
    /**
     * {@code Lana}
     */
    TAI_THAM(1281453665),
    /**
     * {@code Tavt}
     */
    TAI_VIET(1415673460),
    /**
     * {@code Batk}
     */
    BATAK(1113683051),
    /**
     * {@code Brah}
     */
    BRAHMI(1114792296),
    /**
     * {@code Mand}
     */
    MANDAIC(1298230884),
    /**
     * {@code Cakm}
     */
    CHAKMA(1130457965),
    /**
     * {@code Merc}
     */
    MEROITIC_CURSIVE(1298494051),
    /**
     * {@code Mero}
     */
    MEROITIC_HIEROGLYPHS(1298494063),
    /**
     * {@code Plrd}
     */
    MIAO(1349284452),
    /**
     * {@code Shrd}
     */
    SHARADA(1399353956),
    /**
     * {@code Sora}
     */
    SORA_SOMPENG(1399812705),
    /**
     * {@code Takr}
     */
    TAKRI(1415670642),
    /**
     * {@code Bass}, Since: 0.9.30
     */
    BASSA_VAH(1113682803),
    /**
     * {@code Aghb}, Since: 0.9.30
     */
    CAUCASIAN_ALBANIAN(1097295970),
    /**
     * {@code Dupl}, Since: 0.9.30
     */
    DUPLOYAN(1148547180),
    /**
     * {@code Elba}, Since: 0.9.30
     */
    ELBASAN(1164730977),
    /**
     * {@code Gran}, Since: 0.9.30
     */
    GRANTHA(1198678382),
    /**
     * {@code Khoj}, Since: 0.9.30
     */
    KHOJKI(1265135466),
    /**
     * {@code Sind}, Since: 0.9.30
     */
    KHUDAWADI(1399418468),
    /**
     * {@code Lina}, Since: 0.9.30
     */
    LINEAR_A(1281977953),
    /**
     * {@code Mahj}, Since: 0.9.30
     */
    MAHAJANI(1298229354),
    /**
     * {@code Mani}, Since: 0.9.30
     */
    MANICHAEAN(1298230889),
    /**
     * {@code Mend}, Since: 0.9.30
     */
    MENDE_KIKAKUI(1298493028),
    /**
     * {@code Modi}, Since: 0.9.30
     */
    MODI(1299145833),
    /**
     * {@code Mroo}, Since: 0.9.30
     */
    MRO(1299345263),
    /**
     * {@code Nbat}, Since: 0.9.30
     */
    NABATAEAN(1315070324),
    /**
     * {@code Narb}, Since: 0.9.30
     */
    OLD_NORTH_ARABIAN(1315009122),
    /**
     * {@code Perm}, Since: 0.9.30
     */
    OLD_PERMIC(1348825709),
    /**
     * {@code Hmng}, Since: 0.9.30
     */
    PAHAWH_HMONG(1215131239),
    /**
     * {@code Palm}, Since: 0.9.30
     */
    PALMYRENE(1348562029),
    /**
     * {@code Pauc}, Since: 0.9.30
     */
    PAU_CIN_HAU(1348564323),
    /**
     * {@code Phlp}, Since: 0.9.30
     */
    PSALTER_PAHLAVI(1349020784),
    /**
     * {@code Sidd}, Since: 0.9.30
     */
    SIDDHAM(1399415908),
    /**
     * {@code Tirh}, Since: 0.9.30
     */
    TIRHUTA(1416196712),
    /**
     * {@code Wara}, Since: 0.9.30
     */
    WARANG_CITI(1466004065),
    /**
     * {@code Ahom}, Since: 0.9.30
     */
    AHOM(1097363309),
    /**
     * {@code Hluw}, Since: 0.9.30
     */
    ANATOLIAN_HIEROGLYPHS(1215067511),
    /**
     * {@code Hatr}, Since: 0.9.30
     */
    HATRAN(1214346354),
    /**
     * {@code Mult}, Since: 0.9.30
     */
    MULTANI(1299541108),
    /**
     * {@code Hung}, Since: 0.9.30
     */
    OLD_HUNGARIAN(1215655527),
    /**
     * {@code Sgnw}, Since: 0.9.30
     */
    SIGNWRITING(1399287415),
    /**
     * {@code Adlm}, Since: 1.3.0
     */
    ADLAM(1097100397),
    /**
     * {@code Bhks}, Since: 1.3.0
     */
    BHAIKSUKI(1114139507),
    /**
     * {@code Marc}, Since: 1.3.0
     */
    MARCHEN(1298231907),
    /**
     * {@code Osge}, Since: 1.3.0
     */
    OSAGE(1332963173),
    /**
     * {@code Tang}, Since: 1.3.0
     */
    TANGUT(1415671399),
    /**
     * {@code Newa}, Since: 1.3.0
     */
    NEWA(1315272545),
    /**
     * {@code Gonm}, Since: 1.6.0
     */
    MASARAM_GONDI(1198485101),
    /**
     * {@code Nshu}, Since: 1.6.0
     */
    NUSHU(1316186229),
    /**
     * {@code Soyo}, Since: 1.6.0
     */
    SOYOMBO(1399814511),
    /**
     * {@code Zanb}, Since: 1.6.0
     */
    ZANABAZAR_SQUARE(1516334690),
    /**
     * {@code Dogr}, Since: 1.8.0
     */
    DOGRA(1148151666),
    /**
     * {@code Gong}, Since: 1.8.0
     */
    GUNJALA_GONDI(1198485095),
    /**
     * {@code Rohg}, Since: 1.8.0
     */
    HANIFI_ROHINGYA(1383032935),
    /**
     * {@code Maka}, Since: 1.8.0
     */
    MAKASAR(1298230113),
    /**
     * {@code Medf}, Since: 1.8.0
     */
    MEDEFAIDRIN(1298490470),
    /**
     * {@code Sogo}, Since: 1.8.0
     */
    OLD_SOGDIAN(1399809903),
    /**
     * {@code Sogd}, Since: 1.8.0
     */
    SOGDIAN(1399809892),
    /**
     * {@code Elym}, Since: 2.4.0
     */
    ELYMAIC(1164736877),
    /**
     * {@code Nand}, Since: 2.4.0
     */
    NANDINAGARI(1315008100),
    /**
     * {@code Hmnp}, Since: 2.4.0
     */
    NYIAKENG_PUACHUE_HMONG(1215131248),
    /**
     * {@code Wcho}, Since: 2.4.0
     */
    WANCHO(1466132591),
    /**
     * {@code Chrs}, Since: 2.6.7
     */
    CHORASMIAN(1130918515),
    /**
     * {@code Diak}, Since: 2.6.7
     */
    DIVES_AKURU(1147756907),
    /**
     * {@code Kits}, Since: 2.6.7
     */
    KHITAN_SMALL_SCRIPT(1265202291),
    /**
     * {@code Yezi}, Since: 2.6.7
     */
    YEZIDI(1499822697),
    /**
     * {@code Cpmn}, Since: 3.0.0
     */
    CYPRO_MINOAN(1131441518),
    /**
     * {@code Ougr}, Since: 3.0.0
     */
    OLD_UYGHUR(1333094258),
    /**
     * {@code Tnsa}, Since: 3.0.0
     */
    TANGSA(1416524641),
    /**
     * {@code Toto}, Since: 3.0.0
     */
    TOTO(1416590447),
    /**
     * {@code Vith}, Since: 3.0.0
     */
    VITHKUQI(1449751656),
    /**
     * {@code Zmth}, Since: 3.4.0
     */
    MATH(1517122664),
    /**
     * {@code Kawi}, Since: 5.2.0
     */
    KAWI(1264678761),
    /**
     * {@code Nagm}, Since: 5.2.0
     */
    NAG_MUNDARI(1315006317),
    /**
     * No script set
     */
    INVALID(0);
    
    private static final java.lang.String C_TYPE_NAME = "hb_script_t";
    
    private final int value;
    ScriptT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ScriptT of(int value) {
        return switch (value) {
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
            case 1264678761 -> KAWI;
            case 1315006317 -> NAG_MUNDARI;
            case 0 -> INVALID;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
