package org.harfbuzz;

/**
 * Data type for scripts. Each {@link script_t}'s value is an {@link tag_t} corresponding
 * to the four-letter values defined by <a href="https://unicode.org/iso15924/">ISO 15924</a>.
 * <p>
 * See also the Script (sc) property of the Unicode Character Database.
 */
public class ScriptT extends io.github.jwharm.javagi.Enumeration {

    /**
     * {@code Zyyy}
     */
    public static final ScriptT COMMON = new ScriptT(1517910393);
    
    /**
     * {@code Zinh}
     */
    public static final ScriptT INHERITED = new ScriptT(1516858984);
    
    /**
     * {@code Zzzz}
     */
    public static final ScriptT UNKNOWN = new ScriptT(1517976186);
    
    /**
     * {@code Arab}
     */
    public static final ScriptT ARABIC = new ScriptT(1098015074);
    
    /**
     * {@code Armn}
     */
    public static final ScriptT ARMENIAN = new ScriptT(1098018158);
    
    /**
     * {@code Beng}
     */
    public static final ScriptT BENGALI = new ScriptT(1113943655);
    
    /**
     * {@code Cyrl}
     */
    public static final ScriptT CYRILLIC = new ScriptT(1132032620);
    
    /**
     * {@code Deva}
     */
    public static final ScriptT DEVANAGARI = new ScriptT(1147500129);
    
    /**
     * {@code Geor}
     */
    public static final ScriptT GEORGIAN = new ScriptT(1197830002);
    
    /**
     * {@code Grek}
     */
    public static final ScriptT GREEK = new ScriptT(1198679403);
    
    /**
     * {@code Gujr}
     */
    public static final ScriptT GUJARATI = new ScriptT(1198877298);
    
    /**
     * {@code Guru}
     */
    public static final ScriptT GURMUKHI = new ScriptT(1198879349);
    
    /**
     * {@code Hang}
     */
    public static final ScriptT HANGUL = new ScriptT(1214344807);
    
    /**
     * {@code Hani}
     */
    public static final ScriptT HAN = new ScriptT(1214344809);
    
    /**
     * {@code Hebr}
     */
    public static final ScriptT HEBREW = new ScriptT(1214603890);
    
    /**
     * {@code Hira}
     */
    public static final ScriptT HIRAGANA = new ScriptT(1214870113);
    
    /**
     * {@code Knda}
     */
    public static final ScriptT KANNADA = new ScriptT(1265525857);
    
    /**
     * {@code Kana}
     */
    public static final ScriptT KATAKANA = new ScriptT(1264676449);
    
    /**
     * {@code Laoo}
     */
    public static final ScriptT LAO = new ScriptT(1281453935);
    
    /**
     * {@code Latn}
     */
    public static final ScriptT LATIN = new ScriptT(1281455214);
    
    /**
     * {@code Mlym}
     */
    public static final ScriptT MALAYALAM = new ScriptT(1298954605);
    
    /**
     * {@code Orya}
     */
    public static final ScriptT ORIYA = new ScriptT(1332902241);
    
    /**
     * {@code Taml}
     */
    public static final ScriptT TAMIL = new ScriptT(1415671148);
    
    /**
     * {@code Telu}
     */
    public static final ScriptT TELUGU = new ScriptT(1415933045);
    
    /**
     * {@code Thai}
     */
    public static final ScriptT THAI = new ScriptT(1416126825);
    
    /**
     * {@code Tibt}
     */
    public static final ScriptT TIBETAN = new ScriptT(1416192628);
    
    /**
     * {@code Bopo}
     */
    public static final ScriptT BOPOMOFO = new ScriptT(1114599535);
    
    /**
     * {@code Brai}
     */
    public static final ScriptT BRAILLE = new ScriptT(1114792297);
    
    /**
     * {@code Cans}
     */
    public static final ScriptT CANADIAN_SYLLABICS = new ScriptT(1130458739);
    
    /**
     * {@code Cher}
     */
    public static final ScriptT CHEROKEE = new ScriptT(1130915186);
    
    /**
     * {@code Ethi}
     */
    public static final ScriptT ETHIOPIC = new ScriptT(1165256809);
    
    /**
     * {@code Khmr}
     */
    public static final ScriptT KHMER = new ScriptT(1265134962);
    
    /**
     * {@code Mong}
     */
    public static final ScriptT MONGOLIAN = new ScriptT(1299148391);
    
    /**
     * {@code Mymr}
     */
    public static final ScriptT MYANMAR = new ScriptT(1299803506);
    
    /**
     * {@code Ogam}
     */
    public static final ScriptT OGHAM = new ScriptT(1332175213);
    
    /**
     * {@code Runr}
     */
    public static final ScriptT RUNIC = new ScriptT(1383427698);
    
    /**
     * {@code Sinh}
     */
    public static final ScriptT SINHALA = new ScriptT(1399418472);
    
    /**
     * {@code Syrc}
     */
    public static final ScriptT SYRIAC = new ScriptT(1400468067);
    
    /**
     * {@code Thaa}
     */
    public static final ScriptT THAANA = new ScriptT(1416126817);
    
    /**
     * {@code Yiii}
     */
    public static final ScriptT YI = new ScriptT(1500080489);
    
    /**
     * {@code Dsrt}
     */
    public static final ScriptT DESERET = new ScriptT(1148416628);
    
    /**
     * {@code Goth}
     */
    public static final ScriptT GOTHIC = new ScriptT(1198486632);
    
    /**
     * {@code Ital}
     */
    public static final ScriptT OLD_ITALIC = new ScriptT(1232363884);
    
    /**
     * {@code Buhd}
     */
    public static final ScriptT BUHID = new ScriptT(1114990692);
    
    /**
     * {@code Hano}
     */
    public static final ScriptT HANUNOO = new ScriptT(1214344815);
    
    /**
     * {@code Tglg}
     */
    public static final ScriptT TAGALOG = new ScriptT(1416064103);
    
    /**
     * {@code Tagb}
     */
    public static final ScriptT TAGBANWA = new ScriptT(1415669602);
    
    /**
     * {@code Cprt}
     */
    public static final ScriptT CYPRIOT = new ScriptT(1131442804);
    
    /**
     * {@code Limb}
     */
    public static final ScriptT LIMBU = new ScriptT(1281977698);
    
    /**
     * {@code Linb}
     */
    public static final ScriptT LINEAR_B = new ScriptT(1281977954);
    
    /**
     * {@code Osma}
     */
    public static final ScriptT OSMANYA = new ScriptT(1332964705);
    
    /**
     * {@code Shaw}
     */
    public static final ScriptT SHAVIAN = new ScriptT(1399349623);
    
    /**
     * {@code Tale}
     */
    public static final ScriptT TAI_LE = new ScriptT(1415670885);
    
    /**
     * {@code Ugar}
     */
    public static final ScriptT UGARITIC = new ScriptT(1432838514);
    
    /**
     * {@code Bugi}
     */
    public static final ScriptT BUGINESE = new ScriptT(1114990441);
    
    /**
     * {@code Copt}
     */
    public static final ScriptT COPTIC = new ScriptT(1131376756);
    
    /**
     * {@code Glag}
     */
    public static final ScriptT GLAGOLITIC = new ScriptT(1198285159);
    
    /**
     * {@code Khar}
     */
    public static final ScriptT KHAROSHTHI = new ScriptT(1265131890);
    
    /**
     * {@code Talu}
     */
    public static final ScriptT NEW_TAI_LUE = new ScriptT(1415670901);
    
    /**
     * {@code Xpeo}
     */
    public static final ScriptT OLD_PERSIAN = new ScriptT(1483761007);
    
    /**
     * {@code Sylo}
     */
    public static final ScriptT SYLOTI_NAGRI = new ScriptT(1400466543);
    
    /**
     * {@code Tfng}
     */
    public static final ScriptT TIFINAGH = new ScriptT(1415999079);
    
    /**
     * {@code Bali}
     */
    public static final ScriptT BALINESE = new ScriptT(1113681001);
    
    /**
     * {@code Xsux}
     */
    public static final ScriptT CUNEIFORM = new ScriptT(1483961720);
    
    /**
     * {@code Nkoo}
     */
    public static final ScriptT NKO = new ScriptT(1315663727);
    
    /**
     * {@code Phag}
     */
    public static final ScriptT PHAGS_PA = new ScriptT(1349017959);
    
    /**
     * {@code Phnx}
     */
    public static final ScriptT PHOENICIAN = new ScriptT(1349021304);
    
    /**
     * {@code Cari}
     */
    public static final ScriptT CARIAN = new ScriptT(1130459753);
    
    /**
     * {@code Cham}
     */
    public static final ScriptT CHAM = new ScriptT(1130914157);
    
    /**
     * {@code Kali}
     */
    public static final ScriptT KAYAH_LI = new ScriptT(1264675945);
    
    /**
     * {@code Lepc}
     */
    public static final ScriptT LEPCHA = new ScriptT(1281716323);
    
    /**
     * {@code Lyci}
     */
    public static final ScriptT LYCIAN = new ScriptT(1283023721);
    
    /**
     * {@code Lydi}
     */
    public static final ScriptT LYDIAN = new ScriptT(1283023977);
    
    /**
     * {@code Olck}
     */
    public static final ScriptT OL_CHIKI = new ScriptT(1332503403);
    
    /**
     * {@code Rjng}
     */
    public static final ScriptT REJANG = new ScriptT(1382706791);
    
    /**
     * {@code Saur}
     */
    public static final ScriptT SAURASHTRA = new ScriptT(1398895986);
    
    /**
     * {@code Sund}
     */
    public static final ScriptT SUNDANESE = new ScriptT(1400204900);
    
    /**
     * {@code Vaii}
     */
    public static final ScriptT VAI = new ScriptT(1449224553);
    
    /**
     * {@code Avst}
     */
    public static final ScriptT AVESTAN = new ScriptT(1098281844);
    
    /**
     * {@code Bamu}
     */
    public static final ScriptT BAMUM = new ScriptT(1113681269);
    
    /**
     * {@code Egyp}
     */
    public static final ScriptT EGYPTIAN_HIEROGLYPHS = new ScriptT(1164409200);
    
    /**
     * {@code Armi}
     */
    public static final ScriptT IMPERIAL_ARAMAIC = new ScriptT(1098018153);
    
    /**
     * {@code Phli}
     */
    public static final ScriptT INSCRIPTIONAL_PAHLAVI = new ScriptT(1349020777);
    
    /**
     * {@code Prti}
     */
    public static final ScriptT INSCRIPTIONAL_PARTHIAN = new ScriptT(1349678185);
    
    /**
     * {@code Java}
     */
    public static final ScriptT JAVANESE = new ScriptT(1247901281);
    
    /**
     * {@code Kthi}
     */
    public static final ScriptT KAITHI = new ScriptT(1265920105);
    
    /**
     * {@code Lisu}
     */
    public static final ScriptT LISU = new ScriptT(1281979253);
    
    /**
     * {@code Mtei}
     */
    public static final ScriptT MEETEI_MAYEK = new ScriptT(1299473769);
    
    /**
     * {@code Sarb}
     */
    public static final ScriptT OLD_SOUTH_ARABIAN = new ScriptT(1398895202);
    
    /**
     * {@code Orkh}
     */
    public static final ScriptT OLD_TURKIC = new ScriptT(1332898664);
    
    /**
     * {@code Samr}
     */
    public static final ScriptT SAMARITAN = new ScriptT(1398893938);
    
    /**
     * {@code Lana}
     */
    public static final ScriptT TAI_THAM = new ScriptT(1281453665);
    
    /**
     * {@code Tavt}
     */
    public static final ScriptT TAI_VIET = new ScriptT(1415673460);
    
    /**
     * {@code Batk}
     */
    public static final ScriptT BATAK = new ScriptT(1113683051);
    
    /**
     * {@code Brah}
     */
    public static final ScriptT BRAHMI = new ScriptT(1114792296);
    
    /**
     * {@code Mand}
     */
    public static final ScriptT MANDAIC = new ScriptT(1298230884);
    
    /**
     * {@code Cakm}
     */
    public static final ScriptT CHAKMA = new ScriptT(1130457965);
    
    /**
     * {@code Merc}
     */
    public static final ScriptT MEROITIC_CURSIVE = new ScriptT(1298494051);
    
    /**
     * {@code Mero}
     */
    public static final ScriptT MEROITIC_HIEROGLYPHS = new ScriptT(1298494063);
    
    /**
     * {@code Plrd}
     */
    public static final ScriptT MIAO = new ScriptT(1349284452);
    
    /**
     * {@code Shrd}
     */
    public static final ScriptT SHARADA = new ScriptT(1399353956);
    
    /**
     * {@code Sora}
     */
    public static final ScriptT SORA_SOMPENG = new ScriptT(1399812705);
    
    /**
     * {@code Takr}
     */
    public static final ScriptT TAKRI = new ScriptT(1415670642);
    
    /**
     * {@code Bass}, Since: 0.9.30
     */
    public static final ScriptT BASSA_VAH = new ScriptT(1113682803);
    
    /**
     * {@code Aghb}, Since: 0.9.30
     */
    public static final ScriptT CAUCASIAN_ALBANIAN = new ScriptT(1097295970);
    
    /**
     * {@code Dupl}, Since: 0.9.30
     */
    public static final ScriptT DUPLOYAN = new ScriptT(1148547180);
    
    /**
     * {@code Elba}, Since: 0.9.30
     */
    public static final ScriptT ELBASAN = new ScriptT(1164730977);
    
    /**
     * {@code Gran}, Since: 0.9.30
     */
    public static final ScriptT GRANTHA = new ScriptT(1198678382);
    
    /**
     * {@code Khoj}, Since: 0.9.30
     */
    public static final ScriptT KHOJKI = new ScriptT(1265135466);
    
    /**
     * {@code Sind}, Since: 0.9.30
     */
    public static final ScriptT KHUDAWADI = new ScriptT(1399418468);
    
    /**
     * {@code Lina}, Since: 0.9.30
     */
    public static final ScriptT LINEAR_A = new ScriptT(1281977953);
    
    /**
     * {@code Mahj}, Since: 0.9.30
     */
    public static final ScriptT MAHAJANI = new ScriptT(1298229354);
    
    /**
     * {@code Mani}, Since: 0.9.30
     */
    public static final ScriptT MANICHAEAN = new ScriptT(1298230889);
    
    /**
     * {@code Mend}, Since: 0.9.30
     */
    public static final ScriptT MENDE_KIKAKUI = new ScriptT(1298493028);
    
    /**
     * {@code Modi}, Since: 0.9.30
     */
    public static final ScriptT MODI = new ScriptT(1299145833);
    
    /**
     * {@code Mroo}, Since: 0.9.30
     */
    public static final ScriptT MRO = new ScriptT(1299345263);
    
    /**
     * {@code Nbat}, Since: 0.9.30
     */
    public static final ScriptT NABATAEAN = new ScriptT(1315070324);
    
    /**
     * {@code Narb}, Since: 0.9.30
     */
    public static final ScriptT OLD_NORTH_ARABIAN = new ScriptT(1315009122);
    
    /**
     * {@code Perm}, Since: 0.9.30
     */
    public static final ScriptT OLD_PERMIC = new ScriptT(1348825709);
    
    /**
     * {@code Hmng}, Since: 0.9.30
     */
    public static final ScriptT PAHAWH_HMONG = new ScriptT(1215131239);
    
    /**
     * {@code Palm}, Since: 0.9.30
     */
    public static final ScriptT PALMYRENE = new ScriptT(1348562029);
    
    /**
     * {@code Pauc}, Since: 0.9.30
     */
    public static final ScriptT PAU_CIN_HAU = new ScriptT(1348564323);
    
    /**
     * {@code Phlp}, Since: 0.9.30
     */
    public static final ScriptT PSALTER_PAHLAVI = new ScriptT(1349020784);
    
    /**
     * {@code Sidd}, Since: 0.9.30
     */
    public static final ScriptT SIDDHAM = new ScriptT(1399415908);
    
    /**
     * {@code Tirh}, Since: 0.9.30
     */
    public static final ScriptT TIRHUTA = new ScriptT(1416196712);
    
    /**
     * {@code Wara}, Since: 0.9.30
     */
    public static final ScriptT WARANG_CITI = new ScriptT(1466004065);
    
    /**
     * {@code Ahom}, Since: 0.9.30
     */
    public static final ScriptT AHOM = new ScriptT(1097363309);
    
    /**
     * {@code Hluw}, Since: 0.9.30
     */
    public static final ScriptT ANATOLIAN_HIEROGLYPHS = new ScriptT(1215067511);
    
    /**
     * {@code Hatr}, Since: 0.9.30
     */
    public static final ScriptT HATRAN = new ScriptT(1214346354);
    
    /**
     * {@code Mult}, Since: 0.9.30
     */
    public static final ScriptT MULTANI = new ScriptT(1299541108);
    
    /**
     * {@code Hung}, Since: 0.9.30
     */
    public static final ScriptT OLD_HUNGARIAN = new ScriptT(1215655527);
    
    /**
     * {@code Sgnw}, Since: 0.9.30
     */
    public static final ScriptT SIGNWRITING = new ScriptT(1399287415);
    
    /**
     * {@code Adlm}, Since: 1.3.0
     */
    public static final ScriptT ADLAM = new ScriptT(1097100397);
    
    /**
     * {@code Bhks}, Since: 1.3.0
     */
    public static final ScriptT BHAIKSUKI = new ScriptT(1114139507);
    
    /**
     * {@code Marc}, Since: 1.3.0
     */
    public static final ScriptT MARCHEN = new ScriptT(1298231907);
    
    /**
     * {@code Osge}, Since: 1.3.0
     */
    public static final ScriptT OSAGE = new ScriptT(1332963173);
    
    /**
     * {@code Tang}, Since: 1.3.0
     */
    public static final ScriptT TANGUT = new ScriptT(1415671399);
    
    /**
     * {@code Newa}, Since: 1.3.0
     */
    public static final ScriptT NEWA = new ScriptT(1315272545);
    
    /**
     * {@code Gonm}, Since: 1.6.0
     */
    public static final ScriptT MASARAM_GONDI = new ScriptT(1198485101);
    
    /**
     * {@code Nshu}, Since: 1.6.0
     */
    public static final ScriptT NUSHU = new ScriptT(1316186229);
    
    /**
     * {@code Soyo}, Since: 1.6.0
     */
    public static final ScriptT SOYOMBO = new ScriptT(1399814511);
    
    /**
     * {@code Zanb}, Since: 1.6.0
     */
    public static final ScriptT ZANABAZAR_SQUARE = new ScriptT(1516334690);
    
    /**
     * {@code Dogr}, Since: 1.8.0
     */
    public static final ScriptT DOGRA = new ScriptT(1148151666);
    
    /**
     * {@code Gong}, Since: 1.8.0
     */
    public static final ScriptT GUNJALA_GONDI = new ScriptT(1198485095);
    
    /**
     * {@code Rohg}, Since: 1.8.0
     */
    public static final ScriptT HANIFI_ROHINGYA = new ScriptT(1383032935);
    
    /**
     * {@code Maka}, Since: 1.8.0
     */
    public static final ScriptT MAKASAR = new ScriptT(1298230113);
    
    /**
     * {@code Medf}, Since: 1.8.0
     */
    public static final ScriptT MEDEFAIDRIN = new ScriptT(1298490470);
    
    /**
     * {@code Sogo}, Since: 1.8.0
     */
    public static final ScriptT OLD_SOGDIAN = new ScriptT(1399809903);
    
    /**
     * {@code Sogd}, Since: 1.8.0
     */
    public static final ScriptT SOGDIAN = new ScriptT(1399809892);
    
    /**
     * {@code Elym}, Since: 2.4.0
     */
    public static final ScriptT ELYMAIC = new ScriptT(1164736877);
    
    /**
     * {@code Nand}, Since: 2.4.0
     */
    public static final ScriptT NANDINAGARI = new ScriptT(1315008100);
    
    /**
     * {@code Hmnp}, Since: 2.4.0
     */
    public static final ScriptT NYIAKENG_PUACHUE_HMONG = new ScriptT(1215131248);
    
    /**
     * {@code Wcho}, Since: 2.4.0
     */
    public static final ScriptT WANCHO = new ScriptT(1466132591);
    
    /**
     * {@code Chrs}, Since: 2.6.7
     */
    public static final ScriptT CHORASMIAN = new ScriptT(1130918515);
    
    /**
     * {@code Diak}, Since: 2.6.7
     */
    public static final ScriptT DIVES_AKURU = new ScriptT(1147756907);
    
    /**
     * {@code Kits}, Since: 2.6.7
     */
    public static final ScriptT KHITAN_SMALL_SCRIPT = new ScriptT(1265202291);
    
    /**
     * {@code Yezi}, Since: 2.6.7
     */
    public static final ScriptT YEZIDI = new ScriptT(1499822697);
    
    /**
     * {@code Cpmn}, Since: 3.0.0
     */
    public static final ScriptT CYPRO_MINOAN = new ScriptT(1131441518);
    
    /**
     * {@code Ougr}, Since: 3.0.0
     */
    public static final ScriptT OLD_UYGHUR = new ScriptT(1333094258);
    
    /**
     * {@code Tnsa}, Since: 3.0.0
     */
    public static final ScriptT TANGSA = new ScriptT(1416524641);
    
    /**
     * {@code Toto}, Since: 3.0.0
     */
    public static final ScriptT TOTO = new ScriptT(1416590447);
    
    /**
     * {@code Vith}, Since: 3.0.0
     */
    public static final ScriptT VITHKUQI = new ScriptT(1449751656);
    
    /**
     * {@code Zmth}, Since: 3.4.0
     */
    public static final ScriptT MATH = new ScriptT(1517122664);
    
    /**
     * No script set
     */
    public static final ScriptT INVALID = new ScriptT(0);
    
    public ScriptT(int value) {
        super(value);
    }
    
}
