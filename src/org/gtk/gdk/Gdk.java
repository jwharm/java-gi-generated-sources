package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class Gdk {
    
    public static final int ACTION_ALL = 7;

    public static final int BUTTON_MIDDLE = 2;

    public static final int BUTTON_PRIMARY = 1;

    public static final int BUTTON_SECONDARY = 3;

    public static final int CURRENT_TIME = 0;

    public static final boolean EVENT_PROPAGATE = false;

    public static final boolean EVENT_STOP = true;

    public static final int KEY_0 = 48;

    public static final int KEY_1 = 49;

    public static final int KEY_2 = 50;

    public static final int KEY_3 = 51;

    public static final int KEY_3270_AltCursor = 64784;

    public static final int KEY_3270_Attn = 64782;

    public static final int KEY_3270_BackTab = 64773;

    public static final int KEY_3270_ChangeScreen = 64793;

    public static final int KEY_3270_Copy = 64789;

    public static final int KEY_3270_CursorBlink = 64783;

    public static final int KEY_3270_CursorSelect = 64796;

    public static final int KEY_3270_DeleteWord = 64794;

    public static final int KEY_3270_Duplicate = 64769;

    public static final int KEY_3270_Enter = 64798;

    public static final int KEY_3270_EraseEOF = 64774;

    public static final int KEY_3270_EraseInput = 64775;

    public static final int KEY_3270_ExSelect = 64795;

    public static final int KEY_3270_FieldMark = 64770;

    public static final int KEY_3270_Ident = 64787;

    public static final int KEY_3270_Jump = 64786;

    public static final int KEY_3270_KeyClick = 64785;

    public static final int KEY_3270_Left2 = 64772;

    public static final int KEY_3270_PA1 = 64778;

    public static final int KEY_3270_PA2 = 64779;

    public static final int KEY_3270_PA3 = 64780;

    public static final int KEY_3270_Play = 64790;

    public static final int KEY_3270_PrintScreen = 64797;

    public static final int KEY_3270_Quit = 64777;

    public static final int KEY_3270_Record = 64792;

    public static final int KEY_3270_Reset = 64776;

    public static final int KEY_3270_Right2 = 64771;

    public static final int KEY_3270_Rule = 64788;

    public static final int KEY_3270_Setup = 64791;

    public static final int KEY_3270_Test = 64781;

    public static final int KEY_4 = 52;

    public static final int KEY_5 = 53;

    public static final int KEY_6 = 54;

    public static final int KEY_7 = 55;

    public static final int KEY_8 = 56;

    public static final int KEY_9 = 57;

    public static final int KEY_A = 65;

    public static final int KEY_AE = 198;

    public static final int KEY_Aacute = 193;

    public static final int KEY_Abelowdot = 16785056;

    public static final int KEY_Abreve = 451;

    public static final int KEY_Abreveacute = 16785070;

    public static final int KEY_Abrevebelowdot = 16785078;

    public static final int KEY_Abrevegrave = 16785072;

    public static final int KEY_Abrevehook = 16785074;

    public static final int KEY_Abrevetilde = 16785076;

    public static final int KEY_AccessX_Enable = 65136;

    public static final int KEY_AccessX_Feedback_Enable = 65137;

    public static final int KEY_Acircumflex = 194;

    public static final int KEY_Acircumflexacute = 16785060;

    public static final int KEY_Acircumflexbelowdot = 16785068;

    public static final int KEY_Acircumflexgrave = 16785062;

    public static final int KEY_Acircumflexhook = 16785064;

    public static final int KEY_Acircumflextilde = 16785066;

    public static final int KEY_AddFavorite = 269025081;

    public static final int KEY_Adiaeresis = 196;

    public static final int KEY_Agrave = 192;

    public static final int KEY_Ahook = 16785058;

    public static final int KEY_Alt_L = 65513;

    public static final int KEY_Alt_R = 65514;

    public static final int KEY_Amacron = 960;

    public static final int KEY_Aogonek = 417;

    public static final int KEY_ApplicationLeft = 269025104;

    public static final int KEY_ApplicationRight = 269025105;

    public static final int KEY_Arabic_0 = 16778848;

    public static final int KEY_Arabic_1 = 16778849;

    public static final int KEY_Arabic_2 = 16778850;

    public static final int KEY_Arabic_3 = 16778851;

    public static final int KEY_Arabic_4 = 16778852;

    public static final int KEY_Arabic_5 = 16778853;

    public static final int KEY_Arabic_6 = 16778854;

    public static final int KEY_Arabic_7 = 16778855;

    public static final int KEY_Arabic_8 = 16778856;

    public static final int KEY_Arabic_9 = 16778857;

    public static final int KEY_Arabic_ain = 1497;

    public static final int KEY_Arabic_alef = 1479;

    public static final int KEY_Arabic_alefmaksura = 1513;

    public static final int KEY_Arabic_beh = 1480;

    public static final int KEY_Arabic_comma = 1452;

    public static final int KEY_Arabic_dad = 1494;

    public static final int KEY_Arabic_dal = 1487;

    public static final int KEY_Arabic_damma = 1519;

    public static final int KEY_Arabic_dammatan = 1516;

    public static final int KEY_Arabic_ddal = 16778888;

    public static final int KEY_Arabic_farsi_yeh = 16778956;

    public static final int KEY_Arabic_fatha = 1518;

    public static final int KEY_Arabic_fathatan = 1515;

    public static final int KEY_Arabic_feh = 1505;

    public static final int KEY_Arabic_fullstop = 16778964;

    public static final int KEY_Arabic_gaf = 16778927;

    public static final int KEY_Arabic_ghain = 1498;

    public static final int KEY_Arabic_ha = 1511;

    public static final int KEY_Arabic_hah = 1485;

    public static final int KEY_Arabic_hamza = 1473;

    public static final int KEY_Arabic_hamza_above = 16778836;

    public static final int KEY_Arabic_hamza_below = 16778837;

    public static final int KEY_Arabic_hamzaonalef = 1475;

    public static final int KEY_Arabic_hamzaonwaw = 1476;

    public static final int KEY_Arabic_hamzaonyeh = 1478;

    public static final int KEY_Arabic_hamzaunderalef = 1477;

    public static final int KEY_Arabic_heh = 1511;

    public static final int KEY_Arabic_heh_doachashmee = 16778942;

    public static final int KEY_Arabic_heh_goal = 16778945;

    public static final int KEY_Arabic_jeem = 1484;

    public static final int KEY_Arabic_jeh = 16778904;

    public static final int KEY_Arabic_kaf = 1507;

    public static final int KEY_Arabic_kasra = 1520;

    public static final int KEY_Arabic_kasratan = 1517;

    public static final int KEY_Arabic_keheh = 16778921;

    public static final int KEY_Arabic_khah = 1486;

    public static final int KEY_Arabic_lam = 1508;

    public static final int KEY_Arabic_madda_above = 16778835;

    public static final int KEY_Arabic_maddaonalef = 1474;

    public static final int KEY_Arabic_meem = 1509;

    public static final int KEY_Arabic_noon = 1510;

    public static final int KEY_Arabic_noon_ghunna = 16778938;

    public static final int KEY_Arabic_peh = 16778878;

    public static final int KEY_Arabic_percent = 16778858;

    public static final int KEY_Arabic_qaf = 1506;

    public static final int KEY_Arabic_question_mark = 1471;

    public static final int KEY_Arabic_ra = 1489;

    public static final int KEY_Arabic_rreh = 16778897;

    public static final int KEY_Arabic_sad = 1493;

    public static final int KEY_Arabic_seen = 1491;

    public static final int KEY_Arabic_semicolon = 1467;

    public static final int KEY_Arabic_shadda = 1521;

    public static final int KEY_Arabic_sheen = 1492;

    public static final int KEY_Arabic_sukun = 1522;

    public static final int KEY_Arabic_superscript_alef = 16778864;

    public static final int KEY_Arabic_switch = 65406;

    public static final int KEY_Arabic_tah = 1495;

    public static final int KEY_Arabic_tatweel = 1504;

    public static final int KEY_Arabic_tcheh = 16778886;

    public static final int KEY_Arabic_teh = 1482;

    public static final int KEY_Arabic_tehmarbuta = 1481;

    public static final int KEY_Arabic_thal = 1488;

    public static final int KEY_Arabic_theh = 1483;

    public static final int KEY_Arabic_tteh = 16778873;

    public static final int KEY_Arabic_veh = 16778916;

    public static final int KEY_Arabic_waw = 1512;

    public static final int KEY_Arabic_yeh = 1514;

    public static final int KEY_Arabic_yeh_baree = 16778962;

    public static final int KEY_Arabic_zah = 1496;

    public static final int KEY_Arabic_zain = 1490;

    public static final int KEY_Aring = 197;

    public static final int KEY_Armenian_AT = 16778552;

    public static final int KEY_Armenian_AYB = 16778545;

    public static final int KEY_Armenian_BEN = 16778546;

    public static final int KEY_Armenian_CHA = 16778569;

    public static final int KEY_Armenian_DA = 16778548;

    public static final int KEY_Armenian_DZA = 16778561;

    public static final int KEY_Armenian_E = 16778551;

    public static final int KEY_Armenian_FE = 16778582;

    public static final int KEY_Armenian_GHAT = 16778562;

    public static final int KEY_Armenian_GIM = 16778547;

    public static final int KEY_Armenian_HI = 16778565;

    public static final int KEY_Armenian_HO = 16778560;

    public static final int KEY_Armenian_INI = 16778555;

    public static final int KEY_Armenian_JE = 16778571;

    public static final int KEY_Armenian_KE = 16778580;

    public static final int KEY_Armenian_KEN = 16778559;

    public static final int KEY_Armenian_KHE = 16778557;

    public static final int KEY_Armenian_LYUN = 16778556;

    public static final int KEY_Armenian_MEN = 16778564;

    public static final int KEY_Armenian_NU = 16778566;

    public static final int KEY_Armenian_O = 16778581;

    public static final int KEY_Armenian_PE = 16778570;

    public static final int KEY_Armenian_PYUR = 16778579;

    public static final int KEY_Armenian_RA = 16778572;

    public static final int KEY_Armenian_RE = 16778576;

    public static final int KEY_Armenian_SE = 16778573;

    public static final int KEY_Armenian_SHA = 16778567;

    public static final int KEY_Armenian_TCHE = 16778563;

    public static final int KEY_Armenian_TO = 16778553;

    public static final int KEY_Armenian_TSA = 16778558;

    public static final int KEY_Armenian_TSO = 16778577;

    public static final int KEY_Armenian_TYUN = 16778575;

    public static final int KEY_Armenian_VEV = 16778574;

    public static final int KEY_Armenian_VO = 16778568;

    public static final int KEY_Armenian_VYUN = 16778578;

    public static final int KEY_Armenian_YECH = 16778549;

    public static final int KEY_Armenian_ZA = 16778550;

    public static final int KEY_Armenian_ZHE = 16778554;

    public static final int KEY_Armenian_accent = 16778587;

    public static final int KEY_Armenian_amanak = 16778588;

    public static final int KEY_Armenian_apostrophe = 16778586;

    public static final int KEY_Armenian_at = 16778600;

    public static final int KEY_Armenian_ayb = 16778593;

    public static final int KEY_Armenian_ben = 16778594;

    public static final int KEY_Armenian_but = 16778589;

    public static final int KEY_Armenian_cha = 16778617;

    public static final int KEY_Armenian_da = 16778596;

    public static final int KEY_Armenian_dza = 16778609;

    public static final int KEY_Armenian_e = 16778599;

    public static final int KEY_Armenian_exclam = 16778588;

    public static final int KEY_Armenian_fe = 16778630;

    public static final int KEY_Armenian_full_stop = 16778633;

    public static final int KEY_Armenian_ghat = 16778610;

    public static final int KEY_Armenian_gim = 16778595;

    public static final int KEY_Armenian_hi = 16778613;

    public static final int KEY_Armenian_ho = 16778608;

    public static final int KEY_Armenian_hyphen = 16778634;

    public static final int KEY_Armenian_ini = 16778603;

    public static final int KEY_Armenian_je = 16778619;

    public static final int KEY_Armenian_ke = 16778628;

    public static final int KEY_Armenian_ken = 16778607;

    public static final int KEY_Armenian_khe = 16778605;

    public static final int KEY_Armenian_ligature_ew = 16778631;

    public static final int KEY_Armenian_lyun = 16778604;

    public static final int KEY_Armenian_men = 16778612;

    public static final int KEY_Armenian_nu = 16778614;

    public static final int KEY_Armenian_o = 16778629;

    public static final int KEY_Armenian_paruyk = 16778590;

    public static final int KEY_Armenian_pe = 16778618;

    public static final int KEY_Armenian_pyur = 16778627;

    public static final int KEY_Armenian_question = 16778590;

    public static final int KEY_Armenian_ra = 16778620;

    public static final int KEY_Armenian_re = 16778624;

    public static final int KEY_Armenian_se = 16778621;

    public static final int KEY_Armenian_separation_mark = 16778589;

    public static final int KEY_Armenian_sha = 16778615;

    public static final int KEY_Armenian_shesht = 16778587;

    public static final int KEY_Armenian_tche = 16778611;

    public static final int KEY_Armenian_to = 16778601;

    public static final int KEY_Armenian_tsa = 16778606;

    public static final int KEY_Armenian_tso = 16778625;

    public static final int KEY_Armenian_tyun = 16778623;

    public static final int KEY_Armenian_verjaket = 16778633;

    public static final int KEY_Armenian_vev = 16778622;

    public static final int KEY_Armenian_vo = 16778616;

    public static final int KEY_Armenian_vyun = 16778626;

    public static final int KEY_Armenian_yech = 16778597;

    public static final int KEY_Armenian_yentamna = 16778634;

    public static final int KEY_Armenian_za = 16778598;

    public static final int KEY_Armenian_zhe = 16778602;

    public static final int KEY_Atilde = 195;

    public static final int KEY_AudibleBell_Enable = 65146;

    public static final int KEY_AudioCycleTrack = 269025179;

    public static final int KEY_AudioForward = 269025175;

    public static final int KEY_AudioLowerVolume = 269025041;

    public static final int KEY_AudioMedia = 269025074;

    public static final int KEY_AudioMicMute = 269025202;

    public static final int KEY_AudioMute = 269025042;

    public static final int KEY_AudioNext = 269025047;

    public static final int KEY_AudioPause = 269025073;

    public static final int KEY_AudioPlay = 269025044;

    public static final int KEY_AudioPreset = 269025206;

    public static final int KEY_AudioPrev = 269025046;

    public static final int KEY_AudioRaiseVolume = 269025043;

    public static final int KEY_AudioRandomPlay = 269025177;

    public static final int KEY_AudioRecord = 269025052;

    public static final int KEY_AudioRepeat = 269025176;

    public static final int KEY_AudioRewind = 269025086;

    public static final int KEY_AudioStop = 269025045;

    public static final int KEY_Away = 269025165;

    public static final int KEY_B = 66;

    public static final int KEY_Babovedot = 16784898;

    public static final int KEY_Back = 269025062;

    public static final int KEY_BackForward = 269025087;

    public static final int KEY_BackSpace = 65288;

    public static final int KEY_Battery = 269025171;

    public static final int KEY_Begin = 65368;

    public static final int KEY_Blue = 269025190;

    public static final int KEY_Bluetooth = 269025172;

    public static final int KEY_Book = 269025106;

    public static final int KEY_BounceKeys_Enable = 65140;

    public static final int KEY_Break = 65387;

    public static final int KEY_BrightnessAdjust = 269025083;

    public static final int KEY_Byelorussian_SHORTU = 1726;

    public static final int KEY_Byelorussian_shortu = 1710;

    public static final int KEY_C = 67;

    public static final int KEY_CD = 269025107;

    public static final int KEY_CH = 65186;

    public static final int KEY_C_H = 65189;

    public static final int KEY_C_h = 65188;

    public static final int KEY_Cabovedot = 709;

    public static final int KEY_Cacute = 454;

    public static final int KEY_Calculator = 269025053;

    public static final int KEY_Calendar = 269025056;

    public static final int KEY_Cancel = 65385;

    public static final int KEY_Caps_Lock = 65509;

    public static final int KEY_Ccaron = 456;

    public static final int KEY_Ccedilla = 199;

    public static final int KEY_Ccircumflex = 710;

    public static final int KEY_Ch = 65185;

    public static final int KEY_Clear = 65291;

    public static final int KEY_ClearGrab = 269024801;

    public static final int KEY_Close = 269025110;

    public static final int KEY_Codeinput = 65335;

    public static final int KEY_ColonSign = 16785569;

    public static final int KEY_Community = 269025085;

    public static final int KEY_ContrastAdjust = 269025058;

    public static final int KEY_Control_L = 65507;

    public static final int KEY_Control_R = 65508;

    public static final int KEY_Copy = 269025111;

    public static final int KEY_CruzeiroSign = 16785570;

    public static final int KEY_Cut = 269025112;

    public static final int KEY_CycleAngle = 269025180;

    public static final int KEY_Cyrillic_A = 1761;

    public static final int KEY_Cyrillic_BE = 1762;

    public static final int KEY_Cyrillic_CHE = 1790;

    public static final int KEY_Cyrillic_CHE_descender = 16778422;

    public static final int KEY_Cyrillic_CHE_vertstroke = 16778424;

    public static final int KEY_Cyrillic_DE = 1764;

    public static final int KEY_Cyrillic_DZHE = 1727;

    public static final int KEY_Cyrillic_E = 1788;

    public static final int KEY_Cyrillic_EF = 1766;

    public static final int KEY_Cyrillic_EL = 1772;

    public static final int KEY_Cyrillic_EM = 1773;

    public static final int KEY_Cyrillic_EN = 1774;

    public static final int KEY_Cyrillic_EN_descender = 16778402;

    public static final int KEY_Cyrillic_ER = 1778;

    public static final int KEY_Cyrillic_ES = 1779;

    public static final int KEY_Cyrillic_GHE = 1767;

    public static final int KEY_Cyrillic_GHE_bar = 16778386;

    public static final int KEY_Cyrillic_HA = 1768;

    public static final int KEY_Cyrillic_HARDSIGN = 1791;

    public static final int KEY_Cyrillic_HA_descender = 16778418;

    public static final int KEY_Cyrillic_I = 1769;

    public static final int KEY_Cyrillic_IE = 1765;

    public static final int KEY_Cyrillic_IO = 1715;

    public static final int KEY_Cyrillic_I_macron = 16778466;

    public static final int KEY_Cyrillic_JE = 1720;

    public static final int KEY_Cyrillic_KA = 1771;

    public static final int KEY_Cyrillic_KA_descender = 16778394;

    public static final int KEY_Cyrillic_KA_vertstroke = 16778396;

    public static final int KEY_Cyrillic_LJE = 1721;

    public static final int KEY_Cyrillic_NJE = 1722;

    public static final int KEY_Cyrillic_O = 1775;

    public static final int KEY_Cyrillic_O_bar = 16778472;

    public static final int KEY_Cyrillic_PE = 1776;

    public static final int KEY_Cyrillic_SCHWA = 16778456;

    public static final int KEY_Cyrillic_SHA = 1787;

    public static final int KEY_Cyrillic_SHCHA = 1789;

    public static final int KEY_Cyrillic_SHHA = 16778426;

    public static final int KEY_Cyrillic_SHORTI = 1770;

    public static final int KEY_Cyrillic_SOFTSIGN = 1784;

    public static final int KEY_Cyrillic_TE = 1780;

    public static final int KEY_Cyrillic_TSE = 1763;

    public static final int KEY_Cyrillic_U = 1781;

    public static final int KEY_Cyrillic_U_macron = 16778478;

    public static final int KEY_Cyrillic_U_straight = 16778414;

    public static final int KEY_Cyrillic_U_straight_bar = 16778416;

    public static final int KEY_Cyrillic_VE = 1783;

    public static final int KEY_Cyrillic_YA = 1777;

    public static final int KEY_Cyrillic_YERU = 1785;

    public static final int KEY_Cyrillic_YU = 1760;

    public static final int KEY_Cyrillic_ZE = 1786;

    public static final int KEY_Cyrillic_ZHE = 1782;

    public static final int KEY_Cyrillic_ZHE_descender = 16778390;

    public static final int KEY_Cyrillic_a = 1729;

    public static final int KEY_Cyrillic_be = 1730;

    public static final int KEY_Cyrillic_che = 1758;

    public static final int KEY_Cyrillic_che_descender = 16778423;

    public static final int KEY_Cyrillic_che_vertstroke = 16778425;

    public static final int KEY_Cyrillic_de = 1732;

    public static final int KEY_Cyrillic_dzhe = 1711;

    public static final int KEY_Cyrillic_e = 1756;

    public static final int KEY_Cyrillic_ef = 1734;

    public static final int KEY_Cyrillic_el = 1740;

    public static final int KEY_Cyrillic_em = 1741;

    public static final int KEY_Cyrillic_en = 1742;

    public static final int KEY_Cyrillic_en_descender = 16778403;

    public static final int KEY_Cyrillic_er = 1746;

    public static final int KEY_Cyrillic_es = 1747;

    public static final int KEY_Cyrillic_ghe = 1735;

    public static final int KEY_Cyrillic_ghe_bar = 16778387;

    public static final int KEY_Cyrillic_ha = 1736;

    public static final int KEY_Cyrillic_ha_descender = 16778419;

    public static final int KEY_Cyrillic_hardsign = 1759;

    public static final int KEY_Cyrillic_i = 1737;

    public static final int KEY_Cyrillic_i_macron = 16778467;

    public static final int KEY_Cyrillic_ie = 1733;

    public static final int KEY_Cyrillic_io = 1699;

    public static final int KEY_Cyrillic_je = 1704;

    public static final int KEY_Cyrillic_ka = 1739;

    public static final int KEY_Cyrillic_ka_descender = 16778395;

    public static final int KEY_Cyrillic_ka_vertstroke = 16778397;

    public static final int KEY_Cyrillic_lje = 1705;

    public static final int KEY_Cyrillic_nje = 1706;

    public static final int KEY_Cyrillic_o = 1743;

    public static final int KEY_Cyrillic_o_bar = 16778473;

    public static final int KEY_Cyrillic_pe = 1744;

    public static final int KEY_Cyrillic_schwa = 16778457;

    public static final int KEY_Cyrillic_sha = 1755;

    public static final int KEY_Cyrillic_shcha = 1757;

    public static final int KEY_Cyrillic_shha = 16778427;

    public static final int KEY_Cyrillic_shorti = 1738;

    public static final int KEY_Cyrillic_softsign = 1752;

    public static final int KEY_Cyrillic_te = 1748;

    public static final int KEY_Cyrillic_tse = 1731;

    public static final int KEY_Cyrillic_u = 1749;

    public static final int KEY_Cyrillic_u_macron = 16778479;

    public static final int KEY_Cyrillic_u_straight = 16778415;

    public static final int KEY_Cyrillic_u_straight_bar = 16778417;

    public static final int KEY_Cyrillic_ve = 1751;

    public static final int KEY_Cyrillic_ya = 1745;

    public static final int KEY_Cyrillic_yeru = 1753;

    public static final int KEY_Cyrillic_yu = 1728;

    public static final int KEY_Cyrillic_ze = 1754;

    public static final int KEY_Cyrillic_zhe = 1750;

    public static final int KEY_Cyrillic_zhe_descender = 16778391;

    public static final int KEY_D = 68;

    public static final int KEY_DOS = 269025114;

    public static final int KEY_Dabovedot = 16784906;

    public static final int KEY_Dcaron = 463;

    public static final int KEY_Delete = 65535;

    public static final int KEY_Display = 269025113;

    public static final int KEY_Documents = 269025115;

    public static final int KEY_DongSign = 16785579;

    public static final int KEY_Down = 65364;

    public static final int KEY_Dstroke = 464;

    public static final int KEY_E = 69;

    public static final int KEY_ENG = 957;

    public static final int KEY_ETH = 208;

    public static final int KEY_EZH = 16777655;

    public static final int KEY_Eabovedot = 972;

    public static final int KEY_Eacute = 201;

    public static final int KEY_Ebelowdot = 16785080;

    public static final int KEY_Ecaron = 460;

    public static final int KEY_Ecircumflex = 202;

    public static final int KEY_Ecircumflexacute = 16785086;

    public static final int KEY_Ecircumflexbelowdot = 16785094;

    public static final int KEY_Ecircumflexgrave = 16785088;

    public static final int KEY_Ecircumflexhook = 16785090;

    public static final int KEY_Ecircumflextilde = 16785092;

    public static final int KEY_EcuSign = 16785568;

    public static final int KEY_Ediaeresis = 203;

    public static final int KEY_Egrave = 200;

    public static final int KEY_Ehook = 16785082;

    public static final int KEY_Eisu_Shift = 65327;

    public static final int KEY_Eisu_toggle = 65328;

    public static final int KEY_Eject = 269025068;

    public static final int KEY_Emacron = 938;

    public static final int KEY_End = 65367;

    public static final int KEY_Eogonek = 458;

    public static final int KEY_Escape = 65307;

    public static final int KEY_Eth = 208;

    public static final int KEY_Etilde = 16785084;

    public static final int KEY_EuroSign = 8364;

    public static final int KEY_Excel = 269025116;

    public static final int KEY_Execute = 65378;

    public static final int KEY_Explorer = 269025117;

    public static final int KEY_F = 70;

    public static final int KEY_F1 = 65470;

    public static final int KEY_F10 = 65479;

    public static final int KEY_F11 = 65480;

    public static final int KEY_F12 = 65481;

    public static final int KEY_F13 = 65482;

    public static final int KEY_F14 = 65483;

    public static final int KEY_F15 = 65484;

    public static final int KEY_F16 = 65485;

    public static final int KEY_F17 = 65486;

    public static final int KEY_F18 = 65487;

    public static final int KEY_F19 = 65488;

    public static final int KEY_F2 = 65471;

    public static final int KEY_F20 = 65489;

    public static final int KEY_F21 = 65490;

    public static final int KEY_F22 = 65491;

    public static final int KEY_F23 = 65492;

    public static final int KEY_F24 = 65493;

    public static final int KEY_F25 = 65494;

    public static final int KEY_F26 = 65495;

    public static final int KEY_F27 = 65496;

    public static final int KEY_F28 = 65497;

    public static final int KEY_F29 = 65498;

    public static final int KEY_F3 = 65472;

    public static final int KEY_F30 = 65499;

    public static final int KEY_F31 = 65500;

    public static final int KEY_F32 = 65501;

    public static final int KEY_F33 = 65502;

    public static final int KEY_F34 = 65503;

    public static final int KEY_F35 = 65504;

    public static final int KEY_F4 = 65473;

    public static final int KEY_F5 = 65474;

    public static final int KEY_F6 = 65475;

    public static final int KEY_F7 = 65476;

    public static final int KEY_F8 = 65477;

    public static final int KEY_F9 = 65478;

    public static final int KEY_FFrancSign = 16785571;

    public static final int KEY_Fabovedot = 16784926;

    public static final int KEY_Farsi_0 = 16778992;

    public static final int KEY_Farsi_1 = 16778993;

    public static final int KEY_Farsi_2 = 16778994;

    public static final int KEY_Farsi_3 = 16778995;

    public static final int KEY_Farsi_4 = 16778996;

    public static final int KEY_Farsi_5 = 16778997;

    public static final int KEY_Farsi_6 = 16778998;

    public static final int KEY_Farsi_7 = 16778999;

    public static final int KEY_Farsi_8 = 16779000;

    public static final int KEY_Farsi_9 = 16779001;

    public static final int KEY_Farsi_yeh = 16778956;

    public static final int KEY_Favorites = 269025072;

    public static final int KEY_Finance = 269025084;

    public static final int KEY_Find = 65384;

    public static final int KEY_First_Virtual_Screen = 65232;

    public static final int KEY_Forward = 269025063;

    public static final int KEY_FrameBack = 269025181;

    public static final int KEY_FrameForward = 269025182;

    public static final int KEY_G = 71;

    public static final int KEY_Gabovedot = 725;

    public static final int KEY_Game = 269025118;

    public static final int KEY_Gbreve = 683;

    public static final int KEY_Gcaron = 16777702;

    public static final int KEY_Gcedilla = 939;

    public static final int KEY_Gcircumflex = 728;

    public static final int KEY_Georgian_an = 16781520;

    public static final int KEY_Georgian_ban = 16781521;

    public static final int KEY_Georgian_can = 16781546;

    public static final int KEY_Georgian_char = 16781549;

    public static final int KEY_Georgian_chin = 16781545;

    public static final int KEY_Georgian_cil = 16781548;

    public static final int KEY_Georgian_don = 16781523;

    public static final int KEY_Georgian_en = 16781524;

    public static final int KEY_Georgian_fi = 16781558;

    public static final int KEY_Georgian_gan = 16781522;

    public static final int KEY_Georgian_ghan = 16781542;

    public static final int KEY_Georgian_hae = 16781552;

    public static final int KEY_Georgian_har = 16781556;

    public static final int KEY_Georgian_he = 16781553;

    public static final int KEY_Georgian_hie = 16781554;

    public static final int KEY_Georgian_hoe = 16781557;

    public static final int KEY_Georgian_in = 16781528;

    public static final int KEY_Georgian_jhan = 16781551;

    public static final int KEY_Georgian_jil = 16781547;

    public static final int KEY_Georgian_kan = 16781529;

    public static final int KEY_Georgian_khar = 16781541;

    public static final int KEY_Georgian_las = 16781530;

    public static final int KEY_Georgian_man = 16781531;

    public static final int KEY_Georgian_nar = 16781532;

    public static final int KEY_Georgian_on = 16781533;

    public static final int KEY_Georgian_par = 16781534;

    public static final int KEY_Georgian_phar = 16781540;

    public static final int KEY_Georgian_qar = 16781543;

    public static final int KEY_Georgian_rae = 16781536;

    public static final int KEY_Georgian_san = 16781537;

    public static final int KEY_Georgian_shin = 16781544;

    public static final int KEY_Georgian_tan = 16781527;

    public static final int KEY_Georgian_tar = 16781538;

    public static final int KEY_Georgian_un = 16781539;

    public static final int KEY_Georgian_vin = 16781525;

    public static final int KEY_Georgian_we = 16781555;

    public static final int KEY_Georgian_xan = 16781550;

    public static final int KEY_Georgian_zen = 16781526;

    public static final int KEY_Georgian_zhar = 16781535;

    public static final int KEY_Go = 269025119;

    public static final int KEY_Greek_ALPHA = 1985;

    public static final int KEY_Greek_ALPHAaccent = 1953;

    public static final int KEY_Greek_BETA = 1986;

    public static final int KEY_Greek_CHI = 2007;

    public static final int KEY_Greek_DELTA = 1988;

    public static final int KEY_Greek_EPSILON = 1989;

    public static final int KEY_Greek_EPSILONaccent = 1954;

    public static final int KEY_Greek_ETA = 1991;

    public static final int KEY_Greek_ETAaccent = 1955;

    public static final int KEY_Greek_GAMMA = 1987;

    public static final int KEY_Greek_IOTA = 1993;

    public static final int KEY_Greek_IOTAaccent = 1956;

    public static final int KEY_Greek_IOTAdiaeresis = 1957;

    public static final int KEY_Greek_IOTAdieresis = 1957;

    public static final int KEY_Greek_KAPPA = 1994;

    public static final int KEY_Greek_LAMBDA = 1995;

    public static final int KEY_Greek_LAMDA = 1995;

    public static final int KEY_Greek_MU = 1996;

    public static final int KEY_Greek_NU = 1997;

    public static final int KEY_Greek_OMEGA = 2009;

    public static final int KEY_Greek_OMEGAaccent = 1963;

    public static final int KEY_Greek_OMICRON = 1999;

    public static final int KEY_Greek_OMICRONaccent = 1959;

    public static final int KEY_Greek_PHI = 2006;

    public static final int KEY_Greek_PI = 2000;

    public static final int KEY_Greek_PSI = 2008;

    public static final int KEY_Greek_RHO = 2001;

    public static final int KEY_Greek_SIGMA = 2002;

    public static final int KEY_Greek_TAU = 2004;

    public static final int KEY_Greek_THETA = 1992;

    public static final int KEY_Greek_UPSILON = 2005;

    public static final int KEY_Greek_UPSILONaccent = 1960;

    public static final int KEY_Greek_UPSILONdieresis = 1961;

    public static final int KEY_Greek_XI = 1998;

    public static final int KEY_Greek_ZETA = 1990;

    public static final int KEY_Greek_accentdieresis = 1966;

    public static final int KEY_Greek_alpha = 2017;

    public static final int KEY_Greek_alphaaccent = 1969;

    public static final int KEY_Greek_beta = 2018;

    public static final int KEY_Greek_chi = 2039;

    public static final int KEY_Greek_delta = 2020;

    public static final int KEY_Greek_epsilon = 2021;

    public static final int KEY_Greek_epsilonaccent = 1970;

    public static final int KEY_Greek_eta = 2023;

    public static final int KEY_Greek_etaaccent = 1971;

    public static final int KEY_Greek_finalsmallsigma = 2035;

    public static final int KEY_Greek_gamma = 2019;

    public static final int KEY_Greek_horizbar = 1967;

    public static final int KEY_Greek_iota = 2025;

    public static final int KEY_Greek_iotaaccent = 1972;

    public static final int KEY_Greek_iotaaccentdieresis = 1974;

    public static final int KEY_Greek_iotadieresis = 1973;

    public static final int KEY_Greek_kappa = 2026;

    public static final int KEY_Greek_lambda = 2027;

    public static final int KEY_Greek_lamda = 2027;

    public static final int KEY_Greek_mu = 2028;

    public static final int KEY_Greek_nu = 2029;

    public static final int KEY_Greek_omega = 2041;

    public static final int KEY_Greek_omegaaccent = 1979;

    public static final int KEY_Greek_omicron = 2031;

    public static final int KEY_Greek_omicronaccent = 1975;

    public static final int KEY_Greek_phi = 2038;

    public static final int KEY_Greek_pi = 2032;

    public static final int KEY_Greek_psi = 2040;

    public static final int KEY_Greek_rho = 2033;

    public static final int KEY_Greek_sigma = 2034;

    public static final int KEY_Greek_switch = 65406;

    public static final int KEY_Greek_tau = 2036;

    public static final int KEY_Greek_theta = 2024;

    public static final int KEY_Greek_upsilon = 2037;

    public static final int KEY_Greek_upsilonaccent = 1976;

    public static final int KEY_Greek_upsilonaccentdieresis = 1978;

    public static final int KEY_Greek_upsilondieresis = 1977;

    public static final int KEY_Greek_xi = 2030;

    public static final int KEY_Greek_zeta = 2022;

    public static final int KEY_Green = 269025188;

    public static final int KEY_H = 72;

    public static final int KEY_Hangul = 65329;

    public static final int KEY_Hangul_A = 3775;

    public static final int KEY_Hangul_AE = 3776;

    public static final int KEY_Hangul_AraeA = 3830;

    public static final int KEY_Hangul_AraeAE = 3831;

    public static final int KEY_Hangul_Banja = 65337;

    public static final int KEY_Hangul_Cieuc = 3770;

    public static final int KEY_Hangul_Codeinput = 65335;

    public static final int KEY_Hangul_Dikeud = 3751;

    public static final int KEY_Hangul_E = 3780;

    public static final int KEY_Hangul_EO = 3779;

    public static final int KEY_Hangul_EU = 3793;

    public static final int KEY_Hangul_End = 65331;

    public static final int KEY_Hangul_Hanja = 65332;

    public static final int KEY_Hangul_Hieuh = 3774;

    public static final int KEY_Hangul_I = 3795;

    public static final int KEY_Hangul_Ieung = 3767;

    public static final int KEY_Hangul_J_Cieuc = 3818;

    public static final int KEY_Hangul_J_Dikeud = 3802;

    public static final int KEY_Hangul_J_Hieuh = 3822;

    public static final int KEY_Hangul_J_Ieung = 3816;

    public static final int KEY_Hangul_J_Jieuj = 3817;

    public static final int KEY_Hangul_J_Khieuq = 3819;

    public static final int KEY_Hangul_J_Kiyeog = 3796;

    public static final int KEY_Hangul_J_KiyeogSios = 3798;

    public static final int KEY_Hangul_J_KkogjiDalrinIeung = 3833;

    public static final int KEY_Hangul_J_Mieum = 3811;

    public static final int KEY_Hangul_J_Nieun = 3799;

    public static final int KEY_Hangul_J_NieunHieuh = 3801;

    public static final int KEY_Hangul_J_NieunJieuj = 3800;

    public static final int KEY_Hangul_J_PanSios = 3832;

    public static final int KEY_Hangul_J_Phieuf = 3821;

    public static final int KEY_Hangul_J_Pieub = 3812;

    public static final int KEY_Hangul_J_PieubSios = 3813;

    public static final int KEY_Hangul_J_Rieul = 3803;

    public static final int KEY_Hangul_J_RieulHieuh = 3810;

    public static final int KEY_Hangul_J_RieulKiyeog = 3804;

    public static final int KEY_Hangul_J_RieulMieum = 3805;

    public static final int KEY_Hangul_J_RieulPhieuf = 3809;

    public static final int KEY_Hangul_J_RieulPieub = 3806;

    public static final int KEY_Hangul_J_RieulSios = 3807;

    public static final int KEY_Hangul_J_RieulTieut = 3808;

    public static final int KEY_Hangul_J_Sios = 3814;

    public static final int KEY_Hangul_J_SsangKiyeog = 3797;

    public static final int KEY_Hangul_J_SsangSios = 3815;

    public static final int KEY_Hangul_J_Tieut = 3820;

    public static final int KEY_Hangul_J_YeorinHieuh = 3834;

    public static final int KEY_Hangul_Jamo = 65333;

    public static final int KEY_Hangul_Jeonja = 65336;

    public static final int KEY_Hangul_Jieuj = 3768;

    public static final int KEY_Hangul_Khieuq = 3771;

    public static final int KEY_Hangul_Kiyeog = 3745;

    public static final int KEY_Hangul_KiyeogSios = 3747;

    public static final int KEY_Hangul_KkogjiDalrinIeung = 3827;

    public static final int KEY_Hangul_Mieum = 3761;

    public static final int KEY_Hangul_MultipleCandidate = 65341;

    public static final int KEY_Hangul_Nieun = 3748;

    public static final int KEY_Hangul_NieunHieuh = 3750;

    public static final int KEY_Hangul_NieunJieuj = 3749;

    public static final int KEY_Hangul_O = 3783;

    public static final int KEY_Hangul_OE = 3786;

    public static final int KEY_Hangul_PanSios = 3826;

    public static final int KEY_Hangul_Phieuf = 3773;

    public static final int KEY_Hangul_Pieub = 3762;

    public static final int KEY_Hangul_PieubSios = 3764;

    public static final int KEY_Hangul_PostHanja = 65339;

    public static final int KEY_Hangul_PreHanja = 65338;

    public static final int KEY_Hangul_PreviousCandidate = 65342;

    public static final int KEY_Hangul_Rieul = 3753;

    public static final int KEY_Hangul_RieulHieuh = 3760;

    public static final int KEY_Hangul_RieulKiyeog = 3754;

    public static final int KEY_Hangul_RieulMieum = 3755;

    public static final int KEY_Hangul_RieulPhieuf = 3759;

    public static final int KEY_Hangul_RieulPieub = 3756;

    public static final int KEY_Hangul_RieulSios = 3757;

    public static final int KEY_Hangul_RieulTieut = 3758;

    public static final int KEY_Hangul_RieulYeorinHieuh = 3823;

    public static final int KEY_Hangul_Romaja = 65334;

    public static final int KEY_Hangul_SingleCandidate = 65340;

    public static final int KEY_Hangul_Sios = 3765;

    public static final int KEY_Hangul_Special = 65343;

    public static final int KEY_Hangul_SsangDikeud = 3752;

    public static final int KEY_Hangul_SsangJieuj = 3769;

    public static final int KEY_Hangul_SsangKiyeog = 3746;

    public static final int KEY_Hangul_SsangPieub = 3763;

    public static final int KEY_Hangul_SsangSios = 3766;

    public static final int KEY_Hangul_Start = 65330;

    public static final int KEY_Hangul_SunkyeongeumMieum = 3824;

    public static final int KEY_Hangul_SunkyeongeumPhieuf = 3828;

    public static final int KEY_Hangul_SunkyeongeumPieub = 3825;

    public static final int KEY_Hangul_Tieut = 3772;

    public static final int KEY_Hangul_U = 3788;

    public static final int KEY_Hangul_WA = 3784;

    public static final int KEY_Hangul_WAE = 3785;

    public static final int KEY_Hangul_WE = 3790;

    public static final int KEY_Hangul_WEO = 3789;

    public static final int KEY_Hangul_WI = 3791;

    public static final int KEY_Hangul_YA = 3777;

    public static final int KEY_Hangul_YAE = 3778;

    public static final int KEY_Hangul_YE = 3782;

    public static final int KEY_Hangul_YEO = 3781;

    public static final int KEY_Hangul_YI = 3794;

    public static final int KEY_Hangul_YO = 3787;

    public static final int KEY_Hangul_YU = 3792;

    public static final int KEY_Hangul_YeorinHieuh = 3829;

    public static final int KEY_Hangul_switch = 65406;

    public static final int KEY_Hankaku = 65321;

    public static final int KEY_Hcircumflex = 678;

    public static final int KEY_Hebrew_switch = 65406;

    public static final int KEY_Help = 65386;

    public static final int KEY_Henkan = 65315;

    public static final int KEY_Henkan_Mode = 65315;

    public static final int KEY_Hibernate = 269025192;

    public static final int KEY_Hiragana = 65317;

    public static final int KEY_Hiragana_Katakana = 65319;

    public static final int KEY_History = 269025079;

    public static final int KEY_Home = 65360;

    public static final int KEY_HomePage = 269025048;

    public static final int KEY_HotLinks = 269025082;

    public static final int KEY_Hstroke = 673;

    public static final int KEY_Hyper_L = 65517;

    public static final int KEY_Hyper_R = 65518;

    public static final int KEY_I = 73;

    public static final int KEY_ISO_Center_Object = 65075;

    public static final int KEY_ISO_Continuous_Underline = 65072;

    public static final int KEY_ISO_Discontinuous_Underline = 65073;

    public static final int KEY_ISO_Emphasize = 65074;

    public static final int KEY_ISO_Enter = 65076;

    public static final int KEY_ISO_Fast_Cursor_Down = 65071;

    public static final int KEY_ISO_Fast_Cursor_Left = 65068;

    public static final int KEY_ISO_Fast_Cursor_Right = 65069;

    public static final int KEY_ISO_Fast_Cursor_Up = 65070;

    public static final int KEY_ISO_First_Group = 65036;

    public static final int KEY_ISO_First_Group_Lock = 65037;

    public static final int KEY_ISO_Group_Latch = 65030;

    public static final int KEY_ISO_Group_Lock = 65031;

    public static final int KEY_ISO_Group_Shift = 65406;

    public static final int KEY_ISO_Last_Group = 65038;

    public static final int KEY_ISO_Last_Group_Lock = 65039;

    public static final int KEY_ISO_Left_Tab = 65056;

    public static final int KEY_ISO_Level2_Latch = 65026;

    public static final int KEY_ISO_Level3_Latch = 65028;

    public static final int KEY_ISO_Level3_Lock = 65029;

    public static final int KEY_ISO_Level3_Shift = 65027;

    public static final int KEY_ISO_Level5_Latch = 65042;

    public static final int KEY_ISO_Level5_Lock = 65043;

    public static final int KEY_ISO_Level5_Shift = 65041;

    public static final int KEY_ISO_Lock = 65025;

    public static final int KEY_ISO_Move_Line_Down = 65058;

    public static final int KEY_ISO_Move_Line_Up = 65057;

    public static final int KEY_ISO_Next_Group = 65032;

    public static final int KEY_ISO_Next_Group_Lock = 65033;

    public static final int KEY_ISO_Partial_Line_Down = 65060;

    public static final int KEY_ISO_Partial_Line_Up = 65059;

    public static final int KEY_ISO_Partial_Space_Left = 65061;

    public static final int KEY_ISO_Partial_Space_Right = 65062;

    public static final int KEY_ISO_Prev_Group = 65034;

    public static final int KEY_ISO_Prev_Group_Lock = 65035;

    public static final int KEY_ISO_Release_Both_Margins = 65067;

    public static final int KEY_ISO_Release_Margin_Left = 65065;

    public static final int KEY_ISO_Release_Margin_Right = 65066;

    public static final int KEY_ISO_Set_Margin_Left = 65063;

    public static final int KEY_ISO_Set_Margin_Right = 65064;

    public static final int KEY_Iabovedot = 681;

    public static final int KEY_Iacute = 205;

    public static final int KEY_Ibelowdot = 16785098;

    public static final int KEY_Ibreve = 16777516;

    public static final int KEY_Icircumflex = 206;

    public static final int KEY_Idiaeresis = 207;

    public static final int KEY_Igrave = 204;

    public static final int KEY_Ihook = 16785096;

    public static final int KEY_Imacron = 975;

    public static final int KEY_Insert = 65379;

    public static final int KEY_Iogonek = 967;

    public static final int KEY_Itilde = 933;

    public static final int KEY_J = 74;

    public static final int KEY_Jcircumflex = 684;

    public static final int KEY_K = 75;

    public static final int KEY_KP_0 = 65456;

    public static final int KEY_KP_1 = 65457;

    public static final int KEY_KP_2 = 65458;

    public static final int KEY_KP_3 = 65459;

    public static final int KEY_KP_4 = 65460;

    public static final int KEY_KP_5 = 65461;

    public static final int KEY_KP_6 = 65462;

    public static final int KEY_KP_7 = 65463;

    public static final int KEY_KP_8 = 65464;

    public static final int KEY_KP_9 = 65465;

    public static final int KEY_KP_Add = 65451;

    public static final int KEY_KP_Begin = 65437;

    public static final int KEY_KP_Decimal = 65454;

    public static final int KEY_KP_Delete = 65439;

    public static final int KEY_KP_Divide = 65455;

    public static final int KEY_KP_Down = 65433;

    public static final int KEY_KP_End = 65436;

    public static final int KEY_KP_Enter = 65421;

    public static final int KEY_KP_Equal = 65469;

    public static final int KEY_KP_F1 = 65425;

    public static final int KEY_KP_F2 = 65426;

    public static final int KEY_KP_F3 = 65427;

    public static final int KEY_KP_F4 = 65428;

    public static final int KEY_KP_Home = 65429;

    public static final int KEY_KP_Insert = 65438;

    public static final int KEY_KP_Left = 65430;

    public static final int KEY_KP_Multiply = 65450;

    public static final int KEY_KP_Next = 65435;

    public static final int KEY_KP_Page_Down = 65435;

    public static final int KEY_KP_Page_Up = 65434;

    public static final int KEY_KP_Prior = 65434;

    public static final int KEY_KP_Right = 65432;

    public static final int KEY_KP_Separator = 65452;

    public static final int KEY_KP_Space = 65408;

    public static final int KEY_KP_Subtract = 65453;

    public static final int KEY_KP_Tab = 65417;

    public static final int KEY_KP_Up = 65431;

    public static final int KEY_Kana_Lock = 65325;

    public static final int KEY_Kana_Shift = 65326;

    public static final int KEY_Kanji = 65313;

    public static final int KEY_Kanji_Bangou = 65335;

    public static final int KEY_Katakana = 65318;

    public static final int KEY_KbdBrightnessDown = 269025030;

    public static final int KEY_KbdBrightnessUp = 269025029;

    public static final int KEY_KbdLightOnOff = 269025028;

    public static final int KEY_Kcedilla = 979;

    public static final int KEY_Keyboard = 269025203;

    public static final int KEY_Korean_Won = 3839;

    public static final int KEY_L = 76;

    public static final int KEY_L1 = 65480;

    public static final int KEY_L10 = 65489;

    public static final int KEY_L2 = 65481;

    public static final int KEY_L3 = 65482;

    public static final int KEY_L4 = 65483;

    public static final int KEY_L5 = 65484;

    public static final int KEY_L6 = 65485;

    public static final int KEY_L7 = 65486;

    public static final int KEY_L8 = 65487;

    public static final int KEY_L9 = 65488;

    public static final int KEY_Lacute = 453;

    public static final int KEY_Last_Virtual_Screen = 65236;

    public static final int KEY_Launch0 = 269025088;

    public static final int KEY_Launch1 = 269025089;

    public static final int KEY_Launch2 = 269025090;

    public static final int KEY_Launch3 = 269025091;

    public static final int KEY_Launch4 = 269025092;

    public static final int KEY_Launch5 = 269025093;

    public static final int KEY_Launch6 = 269025094;

    public static final int KEY_Launch7 = 269025095;

    public static final int KEY_Launch8 = 269025096;

    public static final int KEY_Launch9 = 269025097;

    public static final int KEY_LaunchA = 269025098;

    public static final int KEY_LaunchB = 269025099;

    public static final int KEY_LaunchC = 269025100;

    public static final int KEY_LaunchD = 269025101;

    public static final int KEY_LaunchE = 269025102;

    public static final int KEY_LaunchF = 269025103;

    public static final int KEY_Lbelowdot = 16784950;

    public static final int KEY_Lcaron = 421;

    public static final int KEY_Lcedilla = 934;

    public static final int KEY_Left = 65361;

    public static final int KEY_LightBulb = 269025077;

    public static final int KEY_Linefeed = 65290;

    public static final int KEY_LiraSign = 16785572;

    public static final int KEY_LogGrabInfo = 269024805;

    public static final int KEY_LogOff = 269025121;

    public static final int KEY_LogWindowTree = 269024804;

    public static final int KEY_Lstroke = 419;

    public static final int KEY_M = 77;

    public static final int KEY_Mabovedot = 16784960;

    public static final int KEY_Macedonia_DSE = 1717;

    public static final int KEY_Macedonia_GJE = 1714;

    public static final int KEY_Macedonia_KJE = 1724;

    public static final int KEY_Macedonia_dse = 1701;

    public static final int KEY_Macedonia_gje = 1698;

    public static final int KEY_Macedonia_kje = 1708;

    public static final int KEY_Mae_Koho = 65342;

    public static final int KEY_Mail = 269025049;

    public static final int KEY_MailForward = 269025168;

    public static final int KEY_Market = 269025122;

    public static final int KEY_Massyo = 65324;

    public static final int KEY_Meeting = 269025123;

    public static final int KEY_Memo = 269025054;

    public static final int KEY_Menu = 65383;

    public static final int KEY_MenuKB = 269025125;

    public static final int KEY_MenuPB = 269025126;

    public static final int KEY_Messenger = 269025166;

    public static final int KEY_Meta_L = 65511;

    public static final int KEY_Meta_R = 65512;

    public static final int KEY_MillSign = 16785573;

    public static final int KEY_ModeLock = 269025025;

    public static final int KEY_Mode_switch = 65406;

    public static final int KEY_MonBrightnessDown = 269025027;

    public static final int KEY_MonBrightnessUp = 269025026;

    public static final int KEY_MouseKeys_Accel_Enable = 65143;

    public static final int KEY_MouseKeys_Enable = 65142;

    public static final int KEY_Muhenkan = 65314;

    public static final int KEY_Multi_key = 65312;

    public static final int KEY_MultipleCandidate = 65341;

    public static final int KEY_Music = 269025170;

    public static final int KEY_MyComputer = 269025075;

    public static final int KEY_MySites = 269025127;

    public static final int KEY_N = 78;

    public static final int KEY_Nacute = 465;

    public static final int KEY_NairaSign = 16785574;

    public static final int KEY_Ncaron = 466;

    public static final int KEY_Ncedilla = 977;

    public static final int KEY_New = 269025128;

    public static final int KEY_NewSheqelSign = 16785578;

    public static final int KEY_News = 269025129;

    public static final int KEY_Next = 65366;

    public static final int KEY_Next_VMode = 269024802;

    public static final int KEY_Next_Virtual_Screen = 65234;

    public static final int KEY_Ntilde = 209;

    public static final int KEY_Num_Lock = 65407;

    public static final int KEY_O = 79;

    public static final int KEY_OE = 5052;

    public static final int KEY_Oacute = 211;

    public static final int KEY_Obarred = 16777631;

    public static final int KEY_Obelowdot = 16785100;

    public static final int KEY_Ocaron = 16777681;

    public static final int KEY_Ocircumflex = 212;

    public static final int KEY_Ocircumflexacute = 16785104;

    public static final int KEY_Ocircumflexbelowdot = 16785112;

    public static final int KEY_Ocircumflexgrave = 16785106;

    public static final int KEY_Ocircumflexhook = 16785108;

    public static final int KEY_Ocircumflextilde = 16785110;

    public static final int KEY_Odiaeresis = 214;

    public static final int KEY_Odoubleacute = 469;

    public static final int KEY_OfficeHome = 269025130;

    public static final int KEY_Ograve = 210;

    public static final int KEY_Ohook = 16785102;

    public static final int KEY_Ohorn = 16777632;

    public static final int KEY_Ohornacute = 16785114;

    public static final int KEY_Ohornbelowdot = 16785122;

    public static final int KEY_Ohorngrave = 16785116;

    public static final int KEY_Ohornhook = 16785118;

    public static final int KEY_Ohorntilde = 16785120;

    public static final int KEY_Omacron = 978;

    public static final int KEY_Ooblique = 216;

    public static final int KEY_Open = 269025131;

    public static final int KEY_OpenURL = 269025080;

    public static final int KEY_Option = 269025132;

    public static final int KEY_Oslash = 216;

    public static final int KEY_Otilde = 213;

    public static final int KEY_Overlay1_Enable = 65144;

    public static final int KEY_Overlay2_Enable = 65145;

    public static final int KEY_P = 80;

    public static final int KEY_Pabovedot = 16784982;

    public static final int KEY_Page_Down = 65366;

    public static final int KEY_Page_Up = 65365;

    public static final int KEY_Paste = 269025133;

    public static final int KEY_Pause = 65299;

    public static final int KEY_PesetaSign = 16785575;

    public static final int KEY_Phone = 269025134;

    public static final int KEY_Pictures = 269025169;

    public static final int KEY_Pointer_Accelerate = 65274;

    public static final int KEY_Pointer_Button1 = 65257;

    public static final int KEY_Pointer_Button2 = 65258;

    public static final int KEY_Pointer_Button3 = 65259;

    public static final int KEY_Pointer_Button4 = 65260;

    public static final int KEY_Pointer_Button5 = 65261;

    public static final int KEY_Pointer_Button_Dflt = 65256;

    public static final int KEY_Pointer_DblClick1 = 65263;

    public static final int KEY_Pointer_DblClick2 = 65264;

    public static final int KEY_Pointer_DblClick3 = 65265;

    public static final int KEY_Pointer_DblClick4 = 65266;

    public static final int KEY_Pointer_DblClick5 = 65267;

    public static final int KEY_Pointer_DblClick_Dflt = 65262;

    public static final int KEY_Pointer_DfltBtnNext = 65275;

    public static final int KEY_Pointer_DfltBtnPrev = 65276;

    public static final int KEY_Pointer_Down = 65251;

    public static final int KEY_Pointer_DownLeft = 65254;

    public static final int KEY_Pointer_DownRight = 65255;

    public static final int KEY_Pointer_Drag1 = 65269;

    public static final int KEY_Pointer_Drag2 = 65270;

    public static final int KEY_Pointer_Drag3 = 65271;

    public static final int KEY_Pointer_Drag4 = 65272;

    public static final int KEY_Pointer_Drag5 = 65277;

    public static final int KEY_Pointer_Drag_Dflt = 65268;

    public static final int KEY_Pointer_EnableKeys = 65273;

    public static final int KEY_Pointer_Left = 65248;

    public static final int KEY_Pointer_Right = 65249;

    public static final int KEY_Pointer_Up = 65250;

    public static final int KEY_Pointer_UpLeft = 65252;

    public static final int KEY_Pointer_UpRight = 65253;

    public static final int KEY_PowerDown = 269025057;

    public static final int KEY_PowerOff = 269025066;

    public static final int KEY_Prev_VMode = 269024803;

    public static final int KEY_Prev_Virtual_Screen = 65233;

    public static final int KEY_PreviousCandidate = 65342;

    public static final int KEY_Print = 65377;

    public static final int KEY_Prior = 65365;

    public static final int KEY_Q = 81;

    public static final int KEY_R = 82;

    public static final int KEY_R1 = 65490;

    public static final int KEY_R10 = 65499;

    public static final int KEY_R11 = 65500;

    public static final int KEY_R12 = 65501;

    public static final int KEY_R13 = 65502;

    public static final int KEY_R14 = 65503;

    public static final int KEY_R15 = 65504;

    public static final int KEY_R2 = 65491;

    public static final int KEY_R3 = 65492;

    public static final int KEY_R4 = 65493;

    public static final int KEY_R5 = 65494;

    public static final int KEY_R6 = 65495;

    public static final int KEY_R7 = 65496;

    public static final int KEY_R8 = 65497;

    public static final int KEY_R9 = 65498;

    public static final int KEY_RFKill = 269025205;

    public static final int KEY_Racute = 448;

    public static final int KEY_Rcaron = 472;

    public static final int KEY_Rcedilla = 931;

    public static final int KEY_Red = 269025187;

    public static final int KEY_Redo = 65382;

    public static final int KEY_Refresh = 269025065;

    public static final int KEY_Reload = 269025139;

    public static final int KEY_RepeatKeys_Enable = 65138;

    public static final int KEY_Reply = 269025138;

    public static final int KEY_Return = 65293;

    public static final int KEY_Right = 65363;

    public static final int KEY_RockerDown = 269025060;

    public static final int KEY_RockerEnter = 269025061;

    public static final int KEY_RockerUp = 269025059;

    public static final int KEY_Romaji = 65316;

    public static final int KEY_RotateWindows = 269025140;

    public static final int KEY_RotationKB = 269025142;

    public static final int KEY_RotationPB = 269025141;

    public static final int KEY_RupeeSign = 16785576;

    public static final int KEY_S = 83;

    public static final int KEY_SCHWA = 16777615;

    public static final int KEY_Sabovedot = 16784992;

    public static final int KEY_Sacute = 422;

    public static final int KEY_Save = 269025143;

    public static final int KEY_Scaron = 425;

    public static final int KEY_Scedilla = 426;

    public static final int KEY_Scircumflex = 734;

    public static final int KEY_ScreenSaver = 269025069;

    public static final int KEY_ScrollClick = 269025146;

    public static final int KEY_ScrollDown = 269025145;

    public static final int KEY_ScrollUp = 269025144;

    public static final int KEY_Scroll_Lock = 65300;

    public static final int KEY_Search = 269025051;

    public static final int KEY_Select = 65376;

    public static final int KEY_SelectButton = 269025184;

    public static final int KEY_Send = 269025147;

    public static final int KEY_Serbian_DJE = 1713;

    public static final int KEY_Serbian_DZE = 1727;

    public static final int KEY_Serbian_JE = 1720;

    public static final int KEY_Serbian_LJE = 1721;

    public static final int KEY_Serbian_NJE = 1722;

    public static final int KEY_Serbian_TSHE = 1723;

    public static final int KEY_Serbian_dje = 1697;

    public static final int KEY_Serbian_dze = 1711;

    public static final int KEY_Serbian_je = 1704;

    public static final int KEY_Serbian_lje = 1705;

    public static final int KEY_Serbian_nje = 1706;

    public static final int KEY_Serbian_tshe = 1707;

    public static final int KEY_Shift_L = 65505;

    public static final int KEY_Shift_Lock = 65510;

    public static final int KEY_Shift_R = 65506;

    public static final int KEY_Shop = 269025078;

    public static final int KEY_SingleCandidate = 65340;

    public static final int KEY_Sinh_a = 16780677;

    public static final int KEY_Sinh_aa = 16780678;

    public static final int KEY_Sinh_aa2 = 16780751;

    public static final int KEY_Sinh_ae = 16780679;

    public static final int KEY_Sinh_ae2 = 16780752;

    public static final int KEY_Sinh_aee = 16780680;

    public static final int KEY_Sinh_aee2 = 16780753;

    public static final int KEY_Sinh_ai = 16780691;

    public static final int KEY_Sinh_ai2 = 16780763;

    public static final int KEY_Sinh_al = 16780746;

    public static final int KEY_Sinh_au = 16780694;

    public static final int KEY_Sinh_au2 = 16780766;

    public static final int KEY_Sinh_ba = 16780726;

    public static final int KEY_Sinh_bha = 16780727;

    public static final int KEY_Sinh_ca = 16780704;

    public static final int KEY_Sinh_cha = 16780705;

    public static final int KEY_Sinh_dda = 16780713;

    public static final int KEY_Sinh_ddha = 16780714;

    public static final int KEY_Sinh_dha = 16780719;

    public static final int KEY_Sinh_dhha = 16780720;

    public static final int KEY_Sinh_e = 16780689;

    public static final int KEY_Sinh_e2 = 16780761;

    public static final int KEY_Sinh_ee = 16780690;

    public static final int KEY_Sinh_ee2 = 16780762;

    public static final int KEY_Sinh_fa = 16780742;

    public static final int KEY_Sinh_ga = 16780700;

    public static final int KEY_Sinh_gha = 16780701;

    public static final int KEY_Sinh_h2 = 16780675;

    public static final int KEY_Sinh_ha = 16780740;

    public static final int KEY_Sinh_i = 16780681;

    public static final int KEY_Sinh_i2 = 16780754;

    public static final int KEY_Sinh_ii = 16780682;

    public static final int KEY_Sinh_ii2 = 16780755;

    public static final int KEY_Sinh_ja = 16780706;

    public static final int KEY_Sinh_jha = 16780707;

    public static final int KEY_Sinh_jnya = 16780709;

    public static final int KEY_Sinh_ka = 16780698;

    public static final int KEY_Sinh_kha = 16780699;

    public static final int KEY_Sinh_kunddaliya = 16780788;

    public static final int KEY_Sinh_la = 16780733;

    public static final int KEY_Sinh_lla = 16780741;

    public static final int KEY_Sinh_lu = 16780687;

    public static final int KEY_Sinh_lu2 = 16780767;

    public static final int KEY_Sinh_luu = 16780688;

    public static final int KEY_Sinh_luu2 = 16780787;

    public static final int KEY_Sinh_ma = 16780728;

    public static final int KEY_Sinh_mba = 16780729;

    public static final int KEY_Sinh_na = 16780721;

    public static final int KEY_Sinh_ndda = 16780716;

    public static final int KEY_Sinh_ndha = 16780723;

    public static final int KEY_Sinh_ng = 16780674;

    public static final int KEY_Sinh_ng2 = 16780702;

    public static final int KEY_Sinh_nga = 16780703;

    public static final int KEY_Sinh_nja = 16780710;

    public static final int KEY_Sinh_nna = 16780715;

    public static final int KEY_Sinh_nya = 16780708;

    public static final int KEY_Sinh_o = 16780692;

    public static final int KEY_Sinh_o2 = 16780764;

    public static final int KEY_Sinh_oo = 16780693;

    public static final int KEY_Sinh_oo2 = 16780765;

    public static final int KEY_Sinh_pa = 16780724;

    public static final int KEY_Sinh_pha = 16780725;

    public static final int KEY_Sinh_ra = 16780731;

    public static final int KEY_Sinh_ri = 16780685;

    public static final int KEY_Sinh_rii = 16780686;

    public static final int KEY_Sinh_ru2 = 16780760;

    public static final int KEY_Sinh_ruu2 = 16780786;

    public static final int KEY_Sinh_sa = 16780739;

    public static final int KEY_Sinh_sha = 16780737;

    public static final int KEY_Sinh_ssha = 16780738;

    public static final int KEY_Sinh_tha = 16780717;

    public static final int KEY_Sinh_thha = 16780718;

    public static final int KEY_Sinh_tta = 16780711;

    public static final int KEY_Sinh_ttha = 16780712;

    public static final int KEY_Sinh_u = 16780683;

    public static final int KEY_Sinh_u2 = 16780756;

    public static final int KEY_Sinh_uu = 16780684;

    public static final int KEY_Sinh_uu2 = 16780758;

    public static final int KEY_Sinh_va = 16780736;

    public static final int KEY_Sinh_ya = 16780730;

    public static final int KEY_Sleep = 269025071;

    public static final int KEY_SlowKeys_Enable = 65139;

    public static final int KEY_Spell = 269025148;

    public static final int KEY_SplitScreen = 269025149;

    public static final int KEY_Standby = 269025040;

    public static final int KEY_Start = 269025050;

    public static final int KEY_StickyKeys_Enable = 65141;

    public static final int KEY_Stop = 269025064;

    public static final int KEY_Subtitle = 269025178;

    public static final int KEY_Super_L = 65515;

    public static final int KEY_Super_R = 65516;

    public static final int KEY_Support = 269025150;

    public static final int KEY_Suspend = 269025191;

    public static final int KEY_Switch_VT_1 = 269024769;

    public static final int KEY_Switch_VT_10 = 269024778;

    public static final int KEY_Switch_VT_11 = 269024779;

    public static final int KEY_Switch_VT_12 = 269024780;

    public static final int KEY_Switch_VT_2 = 269024770;

    public static final int KEY_Switch_VT_3 = 269024771;

    public static final int KEY_Switch_VT_4 = 269024772;

    public static final int KEY_Switch_VT_5 = 269024773;

    public static final int KEY_Switch_VT_6 = 269024774;

    public static final int KEY_Switch_VT_7 = 269024775;

    public static final int KEY_Switch_VT_8 = 269024776;

    public static final int KEY_Switch_VT_9 = 269024777;

    public static final int KEY_Sys_Req = 65301;

    public static final int KEY_T = 84;

    public static final int KEY_THORN = 222;

    public static final int KEY_Tab = 65289;

    public static final int KEY_Tabovedot = 16785002;

    public static final int KEY_TaskPane = 269025151;

    public static final int KEY_Tcaron = 427;

    public static final int KEY_Tcedilla = 478;

    public static final int KEY_Terminal = 269025152;

    public static final int KEY_Terminate_Server = 65237;

    public static final int KEY_Thai_baht = 3551;

    public static final int KEY_Thai_bobaimai = 3514;

    public static final int KEY_Thai_chochan = 3496;

    public static final int KEY_Thai_chochang = 3498;

    public static final int KEY_Thai_choching = 3497;

    public static final int KEY_Thai_chochoe = 3500;

    public static final int KEY_Thai_dochada = 3502;

    public static final int KEY_Thai_dodek = 3508;

    public static final int KEY_Thai_fofa = 3517;

    public static final int KEY_Thai_fofan = 3519;

    public static final int KEY_Thai_hohip = 3531;

    public static final int KEY_Thai_honokhuk = 3534;

    public static final int KEY_Thai_khokhai = 3490;

    public static final int KEY_Thai_khokhon = 3493;

    public static final int KEY_Thai_khokhuat = 3491;

    public static final int KEY_Thai_khokhwai = 3492;

    public static final int KEY_Thai_khorakhang = 3494;

    public static final int KEY_Thai_kokai = 3489;

    public static final int KEY_Thai_lakkhangyao = 3557;

    public static final int KEY_Thai_lekchet = 3575;

    public static final int KEY_Thai_lekha = 3573;

    public static final int KEY_Thai_lekhok = 3574;

    public static final int KEY_Thai_lekkao = 3577;

    public static final int KEY_Thai_leknung = 3569;

    public static final int KEY_Thai_lekpaet = 3576;

    public static final int KEY_Thai_leksam = 3571;

    public static final int KEY_Thai_leksi = 3572;

    public static final int KEY_Thai_leksong = 3570;

    public static final int KEY_Thai_leksun = 3568;

    public static final int KEY_Thai_lochula = 3532;

    public static final int KEY_Thai_loling = 3525;

    public static final int KEY_Thai_lu = 3526;

    public static final int KEY_Thai_maichattawa = 3563;

    public static final int KEY_Thai_maiek = 3560;

    public static final int KEY_Thai_maihanakat = 3537;

    public static final int KEY_Thai_maihanakat_maitho = 3550;

    public static final int KEY_Thai_maitaikhu = 3559;

    public static final int KEY_Thai_maitho = 3561;

    public static final int KEY_Thai_maitri = 3562;

    public static final int KEY_Thai_maiyamok = 3558;

    public static final int KEY_Thai_moma = 3521;

    public static final int KEY_Thai_ngongu = 3495;

    public static final int KEY_Thai_nikhahit = 3565;

    public static final int KEY_Thai_nonen = 3507;

    public static final int KEY_Thai_nonu = 3513;

    public static final int KEY_Thai_oang = 3533;

    public static final int KEY_Thai_paiyannoi = 3535;

    public static final int KEY_Thai_phinthu = 3546;

    public static final int KEY_Thai_phophan = 3518;

    public static final int KEY_Thai_phophung = 3516;

    public static final int KEY_Thai_phosamphao = 3520;

    public static final int KEY_Thai_popla = 3515;

    public static final int KEY_Thai_rorua = 3523;

    public static final int KEY_Thai_ru = 3524;

    public static final int KEY_Thai_saraa = 3536;

    public static final int KEY_Thai_saraaa = 3538;

    public static final int KEY_Thai_saraae = 3553;

    public static final int KEY_Thai_saraaimaimalai = 3556;

    public static final int KEY_Thai_saraaimaimuan = 3555;

    public static final int KEY_Thai_saraam = 3539;

    public static final int KEY_Thai_sarae = 3552;

    public static final int KEY_Thai_sarai = 3540;

    public static final int KEY_Thai_saraii = 3541;

    public static final int KEY_Thai_sarao = 3554;

    public static final int KEY_Thai_sarau = 3544;

    public static final int KEY_Thai_saraue = 3542;

    public static final int KEY_Thai_sarauee = 3543;

    public static final int KEY_Thai_sarauu = 3545;

    public static final int KEY_Thai_sorusi = 3529;

    public static final int KEY_Thai_sosala = 3528;

    public static final int KEY_Thai_soso = 3499;

    public static final int KEY_Thai_sosua = 3530;

    public static final int KEY_Thai_thanthakhat = 3564;

    public static final int KEY_Thai_thonangmontho = 3505;

    public static final int KEY_Thai_thophuthao = 3506;

    public static final int KEY_Thai_thothahan = 3511;

    public static final int KEY_Thai_thothan = 3504;

    public static final int KEY_Thai_thothong = 3512;

    public static final int KEY_Thai_thothung = 3510;

    public static final int KEY_Thai_topatak = 3503;

    public static final int KEY_Thai_totao = 3509;

    public static final int KEY_Thai_wowaen = 3527;

    public static final int KEY_Thai_yoyak = 3522;

    public static final int KEY_Thai_yoying = 3501;

    public static final int KEY_Thorn = 222;

    public static final int KEY_Time = 269025183;

    public static final int KEY_ToDoList = 269025055;

    public static final int KEY_Tools = 269025153;

    public static final int KEY_TopMenu = 269025186;

    public static final int KEY_TouchpadOff = 269025201;

    public static final int KEY_TouchpadOn = 269025200;

    public static final int KEY_TouchpadToggle = 269025193;

    public static final int KEY_Touroku = 65323;

    public static final int KEY_Travel = 269025154;

    public static final int KEY_Tslash = 940;

    public static final int KEY_U = 85;

    public static final int KEY_UWB = 269025174;

    public static final int KEY_Uacute = 218;

    public static final int KEY_Ubelowdot = 16785124;

    public static final int KEY_Ubreve = 733;

    public static final int KEY_Ucircumflex = 219;

    public static final int KEY_Udiaeresis = 220;

    public static final int KEY_Udoubleacute = 475;

    public static final int KEY_Ugrave = 217;

    public static final int KEY_Uhook = 16785126;

    public static final int KEY_Uhorn = 16777647;

    public static final int KEY_Uhornacute = 16785128;

    public static final int KEY_Uhornbelowdot = 16785136;

    public static final int KEY_Uhorngrave = 16785130;

    public static final int KEY_Uhornhook = 16785132;

    public static final int KEY_Uhorntilde = 16785134;

    public static final int KEY_Ukrainian_GHE_WITH_UPTURN = 1725;

    public static final int KEY_Ukrainian_I = 1718;

    public static final int KEY_Ukrainian_IE = 1716;

    public static final int KEY_Ukrainian_YI = 1719;

    public static final int KEY_Ukrainian_ghe_with_upturn = 1709;

    public static final int KEY_Ukrainian_i = 1702;

    public static final int KEY_Ukrainian_ie = 1700;

    public static final int KEY_Ukrainian_yi = 1703;

    public static final int KEY_Ukranian_I = 1718;

    public static final int KEY_Ukranian_JE = 1716;

    public static final int KEY_Ukranian_YI = 1719;

    public static final int KEY_Ukranian_i = 1702;

    public static final int KEY_Ukranian_je = 1700;

    public static final int KEY_Ukranian_yi = 1703;

    public static final int KEY_Umacron = 990;

    public static final int KEY_Undo = 65381;

    public static final int KEY_Ungrab = 269024800;

    public static final int KEY_Uogonek = 985;

    public static final int KEY_Up = 65362;

    public static final int KEY_Uring = 473;

    public static final int KEY_User1KB = 269025157;

    public static final int KEY_User2KB = 269025158;

    public static final int KEY_UserPB = 269025156;

    public static final int KEY_Utilde = 989;

    public static final int KEY_V = 86;

    public static final int KEY_VendorHome = 269025076;

    public static final int KEY_Video = 269025159;

    public static final int KEY_View = 269025185;

    public static final int KEY_VoidSymbol = 16777215;

    public static final int KEY_W = 87;

    public static final int KEY_WLAN = 269025173;

    public static final int KEY_WWAN = 269025204;

    public static final int KEY_WWW = 269025070;

    public static final int KEY_Wacute = 16785026;

    public static final int KEY_WakeUp = 269025067;

    public static final int KEY_Wcircumflex = 16777588;

    public static final int KEY_Wdiaeresis = 16785028;

    public static final int KEY_WebCam = 269025167;

    public static final int KEY_Wgrave = 16785024;

    public static final int KEY_WheelButton = 269025160;

    public static final int KEY_WindowClear = 269025109;

    public static final int KEY_WonSign = 16785577;

    public static final int KEY_Word = 269025161;

    public static final int KEY_X = 88;

    public static final int KEY_Xabovedot = 16785034;

    public static final int KEY_Xfer = 269025162;

    public static final int KEY_Y = 89;

    public static final int KEY_Yacute = 221;

    public static final int KEY_Ybelowdot = 16785140;

    public static final int KEY_Ycircumflex = 16777590;

    public static final int KEY_Ydiaeresis = 5054;

    public static final int KEY_Yellow = 269025189;

    public static final int KEY_Ygrave = 16785138;

    public static final int KEY_Yhook = 16785142;

    public static final int KEY_Ytilde = 16785144;

    public static final int KEY_Z = 90;

    public static final int KEY_Zabovedot = 431;

    public static final int KEY_Zacute = 428;

    public static final int KEY_Zcaron = 430;

    public static final int KEY_Zen_Koho = 65341;

    public static final int KEY_Zenkaku = 65320;

    public static final int KEY_Zenkaku_Hankaku = 65322;

    public static final int KEY_ZoomIn = 269025163;

    public static final int KEY_ZoomOut = 269025164;

    public static final int KEY_Zstroke = 16777653;

    public static final int KEY_a = 97;

    public static final int KEY_aacute = 225;

    public static final int KEY_abelowdot = 16785057;

    public static final int KEY_abovedot = 511;

    public static final int KEY_abreve = 483;

    public static final int KEY_abreveacute = 16785071;

    public static final int KEY_abrevebelowdot = 16785079;

    public static final int KEY_abrevegrave = 16785073;

    public static final int KEY_abrevehook = 16785075;

    public static final int KEY_abrevetilde = 16785077;

    public static final int KEY_acircumflex = 226;

    public static final int KEY_acircumflexacute = 16785061;

    public static final int KEY_acircumflexbelowdot = 16785069;

    public static final int KEY_acircumflexgrave = 16785063;

    public static final int KEY_acircumflexhook = 16785065;

    public static final int KEY_acircumflextilde = 16785067;

    public static final int KEY_acute = 180;

    public static final int KEY_adiaeresis = 228;

    public static final int KEY_ae = 230;

    public static final int KEY_agrave = 224;

    public static final int KEY_ahook = 16785059;

    public static final int KEY_amacron = 992;

    public static final int KEY_ampersand = 38;

    public static final int KEY_aogonek = 433;

    public static final int KEY_apostrophe = 39;

    public static final int KEY_approxeq = 16785992;

    public static final int KEY_approximate = 2248;

    public static final int KEY_aring = 229;

    public static final int KEY_asciicircum = 94;

    public static final int KEY_asciitilde = 126;

    public static final int KEY_asterisk = 42;

    public static final int KEY_at = 64;

    public static final int KEY_atilde = 227;

    public static final int KEY_b = 98;

    public static final int KEY_babovedot = 16784899;

    public static final int KEY_backslash = 92;

    public static final int KEY_ballotcross = 2804;

    public static final int KEY_bar = 124;

    public static final int KEY_because = 16785973;

    public static final int KEY_blank = 2527;

    public static final int KEY_botintegral = 2213;

    public static final int KEY_botleftparens = 2220;

    public static final int KEY_botleftsqbracket = 2216;

    public static final int KEY_botleftsummation = 2226;

    public static final int KEY_botrightparens = 2222;

    public static final int KEY_botrightsqbracket = 2218;

    public static final int KEY_botrightsummation = 2230;

    public static final int KEY_bott = 2550;

    public static final int KEY_botvertsummationconnector = 2228;

    public static final int KEY_braceleft = 123;

    public static final int KEY_braceright = 125;

    public static final int KEY_bracketleft = 91;

    public static final int KEY_bracketright = 93;

    public static final int KEY_braille_blank = 16787456;

    public static final int KEY_braille_dot_1 = 65521;

    public static final int KEY_braille_dot_10 = 65530;

    public static final int KEY_braille_dot_2 = 65522;

    public static final int KEY_braille_dot_3 = 65523;

    public static final int KEY_braille_dot_4 = 65524;

    public static final int KEY_braille_dot_5 = 65525;

    public static final int KEY_braille_dot_6 = 65526;

    public static final int KEY_braille_dot_7 = 65527;

    public static final int KEY_braille_dot_8 = 65528;

    public static final int KEY_braille_dot_9 = 65529;

    public static final int KEY_braille_dots_1 = 16787457;

    public static final int KEY_braille_dots_12 = 16787459;

    public static final int KEY_braille_dots_123 = 16787463;

    public static final int KEY_braille_dots_1234 = 16787471;

    public static final int KEY_braille_dots_12345 = 16787487;

    public static final int KEY_braille_dots_123456 = 16787519;

    public static final int KEY_braille_dots_1234567 = 16787583;

    public static final int KEY_braille_dots_12345678 = 16787711;

    public static final int KEY_braille_dots_1234568 = 16787647;

    public static final int KEY_braille_dots_123457 = 16787551;

    public static final int KEY_braille_dots_1234578 = 16787679;

    public static final int KEY_braille_dots_123458 = 16787615;

    public static final int KEY_braille_dots_12346 = 16787503;

    public static final int KEY_braille_dots_123467 = 16787567;

    public static final int KEY_braille_dots_1234678 = 16787695;

    public static final int KEY_braille_dots_123468 = 16787631;

    public static final int KEY_braille_dots_12347 = 16787535;

    public static final int KEY_braille_dots_123478 = 16787663;

    public static final int KEY_braille_dots_12348 = 16787599;

    public static final int KEY_braille_dots_1235 = 16787479;

    public static final int KEY_braille_dots_12356 = 16787511;

    public static final int KEY_braille_dots_123567 = 16787575;

    public static final int KEY_braille_dots_1235678 = 16787703;

    public static final int KEY_braille_dots_123568 = 16787639;

    public static final int KEY_braille_dots_12357 = 16787543;

    public static final int KEY_braille_dots_123578 = 16787671;

    public static final int KEY_braille_dots_12358 = 16787607;

    public static final int KEY_braille_dots_1236 = 16787495;

    public static final int KEY_braille_dots_12367 = 16787559;

    public static final int KEY_braille_dots_123678 = 16787687;

    public static final int KEY_braille_dots_12368 = 16787623;

    public static final int KEY_braille_dots_1237 = 16787527;

    public static final int KEY_braille_dots_12378 = 16787655;

    public static final int KEY_braille_dots_1238 = 16787591;

    public static final int KEY_braille_dots_124 = 16787467;

    public static final int KEY_braille_dots_1245 = 16787483;

    public static final int KEY_braille_dots_12456 = 16787515;

    public static final int KEY_braille_dots_124567 = 16787579;

    public static final int KEY_braille_dots_1245678 = 16787707;

    public static final int KEY_braille_dots_124568 = 16787643;

    public static final int KEY_braille_dots_12457 = 16787547;

    public static final int KEY_braille_dots_124578 = 16787675;

    public static final int KEY_braille_dots_12458 = 16787611;

    public static final int KEY_braille_dots_1246 = 16787499;

    public static final int KEY_braille_dots_12467 = 16787563;

    public static final int KEY_braille_dots_124678 = 16787691;

    public static final int KEY_braille_dots_12468 = 16787627;

    public static final int KEY_braille_dots_1247 = 16787531;

    public static final int KEY_braille_dots_12478 = 16787659;

    public static final int KEY_braille_dots_1248 = 16787595;

    public static final int KEY_braille_dots_125 = 16787475;

    public static final int KEY_braille_dots_1256 = 16787507;

    public static final int KEY_braille_dots_12567 = 16787571;

    public static final int KEY_braille_dots_125678 = 16787699;

    public static final int KEY_braille_dots_12568 = 16787635;

    public static final int KEY_braille_dots_1257 = 16787539;

    public static final int KEY_braille_dots_12578 = 16787667;

    public static final int KEY_braille_dots_1258 = 16787603;

    public static final int KEY_braille_dots_126 = 16787491;

    public static final int KEY_braille_dots_1267 = 16787555;

    public static final int KEY_braille_dots_12678 = 16787683;

    public static final int KEY_braille_dots_1268 = 16787619;

    public static final int KEY_braille_dots_127 = 16787523;

    public static final int KEY_braille_dots_1278 = 16787651;

    public static final int KEY_braille_dots_128 = 16787587;

    public static final int KEY_braille_dots_13 = 16787461;

    public static final int KEY_braille_dots_134 = 16787469;

    public static final int KEY_braille_dots_1345 = 16787485;

    public static final int KEY_braille_dots_13456 = 16787517;

    public static final int KEY_braille_dots_134567 = 16787581;

    public static final int KEY_braille_dots_1345678 = 16787709;

    public static final int KEY_braille_dots_134568 = 16787645;

    public static final int KEY_braille_dots_13457 = 16787549;

    public static final int KEY_braille_dots_134578 = 16787677;

    public static final int KEY_braille_dots_13458 = 16787613;

    public static final int KEY_braille_dots_1346 = 16787501;

    public static final int KEY_braille_dots_13467 = 16787565;

    public static final int KEY_braille_dots_134678 = 16787693;

    public static final int KEY_braille_dots_13468 = 16787629;

    public static final int KEY_braille_dots_1347 = 16787533;

    public static final int KEY_braille_dots_13478 = 16787661;

    public static final int KEY_braille_dots_1348 = 16787597;

    public static final int KEY_braille_dots_135 = 16787477;

    public static final int KEY_braille_dots_1356 = 16787509;

    public static final int KEY_braille_dots_13567 = 16787573;

    public static final int KEY_braille_dots_135678 = 16787701;

    public static final int KEY_braille_dots_13568 = 16787637;

    public static final int KEY_braille_dots_1357 = 16787541;

    public static final int KEY_braille_dots_13578 = 16787669;

    public static final int KEY_braille_dots_1358 = 16787605;

    public static final int KEY_braille_dots_136 = 16787493;

    public static final int KEY_braille_dots_1367 = 16787557;

    public static final int KEY_braille_dots_13678 = 16787685;

    public static final int KEY_braille_dots_1368 = 16787621;

    public static final int KEY_braille_dots_137 = 16787525;

    public static final int KEY_braille_dots_1378 = 16787653;

    public static final int KEY_braille_dots_138 = 16787589;

    public static final int KEY_braille_dots_14 = 16787465;

    public static final int KEY_braille_dots_145 = 16787481;

    public static final int KEY_braille_dots_1456 = 16787513;

    public static final int KEY_braille_dots_14567 = 16787577;

    public static final int KEY_braille_dots_145678 = 16787705;

    public static final int KEY_braille_dots_14568 = 16787641;

    public static final int KEY_braille_dots_1457 = 16787545;

    public static final int KEY_braille_dots_14578 = 16787673;

    public static final int KEY_braille_dots_1458 = 16787609;

    public static final int KEY_braille_dots_146 = 16787497;

    public static final int KEY_braille_dots_1467 = 16787561;

    public static final int KEY_braille_dots_14678 = 16787689;

    public static final int KEY_braille_dots_1468 = 16787625;

    public static final int KEY_braille_dots_147 = 16787529;

    public static final int KEY_braille_dots_1478 = 16787657;

    public static final int KEY_braille_dots_148 = 16787593;

    public static final int KEY_braille_dots_15 = 16787473;

    public static final int KEY_braille_dots_156 = 16787505;

    public static final int KEY_braille_dots_1567 = 16787569;

    public static final int KEY_braille_dots_15678 = 16787697;

    public static final int KEY_braille_dots_1568 = 16787633;

    public static final int KEY_braille_dots_157 = 16787537;

    public static final int KEY_braille_dots_1578 = 16787665;

    public static final int KEY_braille_dots_158 = 16787601;

    public static final int KEY_braille_dots_16 = 16787489;

    public static final int KEY_braille_dots_167 = 16787553;

    public static final int KEY_braille_dots_1678 = 16787681;

    public static final int KEY_braille_dots_168 = 16787617;

    public static final int KEY_braille_dots_17 = 16787521;

    public static final int KEY_braille_dots_178 = 16787649;

    public static final int KEY_braille_dots_18 = 16787585;

    public static final int KEY_braille_dots_2 = 16787458;

    public static final int KEY_braille_dots_23 = 16787462;

    public static final int KEY_braille_dots_234 = 16787470;

    public static final int KEY_braille_dots_2345 = 16787486;

    public static final int KEY_braille_dots_23456 = 16787518;

    public static final int KEY_braille_dots_234567 = 16787582;

    public static final int KEY_braille_dots_2345678 = 16787710;

    public static final int KEY_braille_dots_234568 = 16787646;

    public static final int KEY_braille_dots_23457 = 16787550;

    public static final int KEY_braille_dots_234578 = 16787678;

    public static final int KEY_braille_dots_23458 = 16787614;

    public static final int KEY_braille_dots_2346 = 16787502;

    public static final int KEY_braille_dots_23467 = 16787566;

    public static final int KEY_braille_dots_234678 = 16787694;

    public static final int KEY_braille_dots_23468 = 16787630;

    public static final int KEY_braille_dots_2347 = 16787534;

    public static final int KEY_braille_dots_23478 = 16787662;

    public static final int KEY_braille_dots_2348 = 16787598;

    public static final int KEY_braille_dots_235 = 16787478;

    public static final int KEY_braille_dots_2356 = 16787510;

    public static final int KEY_braille_dots_23567 = 16787574;

    public static final int KEY_braille_dots_235678 = 16787702;

    public static final int KEY_braille_dots_23568 = 16787638;

    public static final int KEY_braille_dots_2357 = 16787542;

    public static final int KEY_braille_dots_23578 = 16787670;

    public static final int KEY_braille_dots_2358 = 16787606;

    public static final int KEY_braille_dots_236 = 16787494;

    public static final int KEY_braille_dots_2367 = 16787558;

    public static final int KEY_braille_dots_23678 = 16787686;

    public static final int KEY_braille_dots_2368 = 16787622;

    public static final int KEY_braille_dots_237 = 16787526;

    public static final int KEY_braille_dots_2378 = 16787654;

    public static final int KEY_braille_dots_238 = 16787590;

    public static final int KEY_braille_dots_24 = 16787466;

    public static final int KEY_braille_dots_245 = 16787482;

    public static final int KEY_braille_dots_2456 = 16787514;

    public static final int KEY_braille_dots_24567 = 16787578;

    public static final int KEY_braille_dots_245678 = 16787706;

    public static final int KEY_braille_dots_24568 = 16787642;

    public static final int KEY_braille_dots_2457 = 16787546;

    public static final int KEY_braille_dots_24578 = 16787674;

    public static final int KEY_braille_dots_2458 = 16787610;

    public static final int KEY_braille_dots_246 = 16787498;

    public static final int KEY_braille_dots_2467 = 16787562;

    public static final int KEY_braille_dots_24678 = 16787690;

    public static final int KEY_braille_dots_2468 = 16787626;

    public static final int KEY_braille_dots_247 = 16787530;

    public static final int KEY_braille_dots_2478 = 16787658;

    public static final int KEY_braille_dots_248 = 16787594;

    public static final int KEY_braille_dots_25 = 16787474;

    public static final int KEY_braille_dots_256 = 16787506;

    public static final int KEY_braille_dots_2567 = 16787570;

    public static final int KEY_braille_dots_25678 = 16787698;

    public static final int KEY_braille_dots_2568 = 16787634;

    public static final int KEY_braille_dots_257 = 16787538;

    public static final int KEY_braille_dots_2578 = 16787666;

    public static final int KEY_braille_dots_258 = 16787602;

    public static final int KEY_braille_dots_26 = 16787490;

    public static final int KEY_braille_dots_267 = 16787554;

    public static final int KEY_braille_dots_2678 = 16787682;

    public static final int KEY_braille_dots_268 = 16787618;

    public static final int KEY_braille_dots_27 = 16787522;

    public static final int KEY_braille_dots_278 = 16787650;

    public static final int KEY_braille_dots_28 = 16787586;

    public static final int KEY_braille_dots_3 = 16787460;

    public static final int KEY_braille_dots_34 = 16787468;

    public static final int KEY_braille_dots_345 = 16787484;

    public static final int KEY_braille_dots_3456 = 16787516;

    public static final int KEY_braille_dots_34567 = 16787580;

    public static final int KEY_braille_dots_345678 = 16787708;

    public static final int KEY_braille_dots_34568 = 16787644;

    public static final int KEY_braille_dots_3457 = 16787548;

    public static final int KEY_braille_dots_34578 = 16787676;

    public static final int KEY_braille_dots_3458 = 16787612;

    public static final int KEY_braille_dots_346 = 16787500;

    public static final int KEY_braille_dots_3467 = 16787564;

    public static final int KEY_braille_dots_34678 = 16787692;

    public static final int KEY_braille_dots_3468 = 16787628;

    public static final int KEY_braille_dots_347 = 16787532;

    public static final int KEY_braille_dots_3478 = 16787660;

    public static final int KEY_braille_dots_348 = 16787596;

    public static final int KEY_braille_dots_35 = 16787476;

    public static final int KEY_braille_dots_356 = 16787508;

    public static final int KEY_braille_dots_3567 = 16787572;

    public static final int KEY_braille_dots_35678 = 16787700;

    public static final int KEY_braille_dots_3568 = 16787636;

    public static final int KEY_braille_dots_357 = 16787540;

    public static final int KEY_braille_dots_3578 = 16787668;

    public static final int KEY_braille_dots_358 = 16787604;

    public static final int KEY_braille_dots_36 = 16787492;

    public static final int KEY_braille_dots_367 = 16787556;

    public static final int KEY_braille_dots_3678 = 16787684;

    public static final int KEY_braille_dots_368 = 16787620;

    public static final int KEY_braille_dots_37 = 16787524;

    public static final int KEY_braille_dots_378 = 16787652;

    public static final int KEY_braille_dots_38 = 16787588;

    public static final int KEY_braille_dots_4 = 16787464;

    public static final int KEY_braille_dots_45 = 16787480;

    public static final int KEY_braille_dots_456 = 16787512;

    public static final int KEY_braille_dots_4567 = 16787576;

    public static final int KEY_braille_dots_45678 = 16787704;

    public static final int KEY_braille_dots_4568 = 16787640;

    public static final int KEY_braille_dots_457 = 16787544;

    public static final int KEY_braille_dots_4578 = 16787672;

    public static final int KEY_braille_dots_458 = 16787608;

    public static final int KEY_braille_dots_46 = 16787496;

    public static final int KEY_braille_dots_467 = 16787560;

    public static final int KEY_braille_dots_4678 = 16787688;

    public static final int KEY_braille_dots_468 = 16787624;

    public static final int KEY_braille_dots_47 = 16787528;

    public static final int KEY_braille_dots_478 = 16787656;

    public static final int KEY_braille_dots_48 = 16787592;

    public static final int KEY_braille_dots_5 = 16787472;

    public static final int KEY_braille_dots_56 = 16787504;

    public static final int KEY_braille_dots_567 = 16787568;

    public static final int KEY_braille_dots_5678 = 16787696;

    public static final int KEY_braille_dots_568 = 16787632;

    public static final int KEY_braille_dots_57 = 16787536;

    public static final int KEY_braille_dots_578 = 16787664;

    public static final int KEY_braille_dots_58 = 16787600;

    public static final int KEY_braille_dots_6 = 16787488;

    public static final int KEY_braille_dots_67 = 16787552;

    public static final int KEY_braille_dots_678 = 16787680;

    public static final int KEY_braille_dots_68 = 16787616;

    public static final int KEY_braille_dots_7 = 16787520;

    public static final int KEY_braille_dots_78 = 16787648;

    public static final int KEY_braille_dots_8 = 16787584;

    public static final int KEY_breve = 418;

    public static final int KEY_brokenbar = 166;

    public static final int KEY_c = 99;

    public static final int KEY_c_h = 65187;

    public static final int KEY_cabovedot = 741;

    public static final int KEY_cacute = 486;

    public static final int KEY_careof = 2744;

    public static final int KEY_caret = 2812;

    public static final int KEY_caron = 439;

    public static final int KEY_ccaron = 488;

    public static final int KEY_ccedilla = 231;

    public static final int KEY_ccircumflex = 742;

    public static final int KEY_cedilla = 184;

    public static final int KEY_cent = 162;

    public static final int KEY_ch = 65184;

    public static final int KEY_checkerboard = 2529;

    public static final int KEY_checkmark = 2803;

    public static final int KEY_circle = 3023;

    public static final int KEY_club = 2796;

    public static final int KEY_colon = 58;

    public static final int KEY_comma = 44;

    public static final int KEY_containsas = 16785931;

    public static final int KEY_copyright = 169;

    public static final int KEY_cr = 2532;

    public static final int KEY_crossinglines = 2542;

    public static final int KEY_cuberoot = 16785947;

    public static final int KEY_currency = 164;

    public static final int KEY_cursor = 2815;

    public static final int KEY_d = 100;

    public static final int KEY_dabovedot = 16784907;

    public static final int KEY_dagger = 2801;

    public static final int KEY_dcaron = 495;

    public static final int KEY_dead_A = 65153;

    public static final int KEY_dead_E = 65155;

    public static final int KEY_dead_I = 65157;

    public static final int KEY_dead_O = 65159;

    public static final int KEY_dead_U = 65161;

    public static final int KEY_dead_a = 65152;

    public static final int KEY_dead_abovecomma = 65124;

    public static final int KEY_dead_abovedot = 65110;

    public static final int KEY_dead_abovereversedcomma = 65125;

    public static final int KEY_dead_abovering = 65112;

    public static final int KEY_dead_aboveverticalline = 65169;

    public static final int KEY_dead_acute = 65105;

    public static final int KEY_dead_belowbreve = 65131;

    public static final int KEY_dead_belowcircumflex = 65129;

    public static final int KEY_dead_belowcomma = 65134;

    public static final int KEY_dead_belowdiaeresis = 65132;

    public static final int KEY_dead_belowdot = 65120;

    public static final int KEY_dead_belowmacron = 65128;

    public static final int KEY_dead_belowring = 65127;

    public static final int KEY_dead_belowtilde = 65130;

    public static final int KEY_dead_belowverticalline = 65170;

    public static final int KEY_dead_breve = 65109;

    public static final int KEY_dead_capital_schwa = 65163;

    public static final int KEY_dead_caron = 65114;

    public static final int KEY_dead_cedilla = 65115;

    public static final int KEY_dead_circumflex = 65106;

    public static final int KEY_dead_currency = 65135;

    public static final int KEY_dead_dasia = 65125;

    public static final int KEY_dead_diaeresis = 65111;

    public static final int KEY_dead_doubleacute = 65113;

    public static final int KEY_dead_doublegrave = 65126;

    public static final int KEY_dead_e = 65154;

    public static final int KEY_dead_grave = 65104;

    public static final int KEY_dead_greek = 65164;

    public static final int KEY_dead_hook = 65121;

    public static final int KEY_dead_horn = 65122;

    public static final int KEY_dead_i = 65156;

    public static final int KEY_dead_invertedbreve = 65133;

    public static final int KEY_dead_iota = 65117;

    public static final int KEY_dead_longsolidusoverlay = 65171;

    public static final int KEY_dead_lowline = 65168;

    public static final int KEY_dead_macron = 65108;

    public static final int KEY_dead_o = 65158;

    public static final int KEY_dead_ogonek = 65116;

    public static final int KEY_dead_perispomeni = 65107;

    public static final int KEY_dead_psili = 65124;

    public static final int KEY_dead_semivoiced_sound = 65119;

    public static final int KEY_dead_small_schwa = 65162;

    public static final int KEY_dead_stroke = 65123;

    public static final int KEY_dead_tilde = 65107;

    public static final int KEY_dead_u = 65160;

    public static final int KEY_dead_voiced_sound = 65118;

    public static final int KEY_decimalpoint = 2749;

    public static final int KEY_degree = 176;

    public static final int KEY_diaeresis = 168;

    public static final int KEY_diamond = 2797;

    public static final int KEY_digitspace = 2725;

    public static final int KEY_dintegral = 16785964;

    public static final int KEY_division = 247;

    public static final int KEY_dollar = 36;

    public static final int KEY_doubbaselinedot = 2735;

    public static final int KEY_doubleacute = 445;

    public static final int KEY_doubledagger = 2802;

    public static final int KEY_doublelowquotemark = 2814;

    public static final int KEY_downarrow = 2302;

    public static final int KEY_downcaret = 2984;

    public static final int KEY_downshoe = 3030;

    public static final int KEY_downstile = 3012;

    public static final int KEY_downtack = 3010;

    public static final int KEY_dstroke = 496;

    public static final int KEY_e = 101;

    public static final int KEY_eabovedot = 1004;

    public static final int KEY_eacute = 233;

    public static final int KEY_ebelowdot = 16785081;

    public static final int KEY_ecaron = 492;

    public static final int KEY_ecircumflex = 234;

    public static final int KEY_ecircumflexacute = 16785087;

    public static final int KEY_ecircumflexbelowdot = 16785095;

    public static final int KEY_ecircumflexgrave = 16785089;

    public static final int KEY_ecircumflexhook = 16785091;

    public static final int KEY_ecircumflextilde = 16785093;

    public static final int KEY_ediaeresis = 235;

    public static final int KEY_egrave = 232;

    public static final int KEY_ehook = 16785083;

    public static final int KEY_eightsubscript = 16785544;

    public static final int KEY_eightsuperior = 16785528;

    public static final int KEY_elementof = 16785928;

    public static final int KEY_ellipsis = 2734;

    public static final int KEY_em3space = 2723;

    public static final int KEY_em4space = 2724;

    public static final int KEY_emacron = 954;

    public static final int KEY_emdash = 2729;

    public static final int KEY_emfilledcircle = 2782;

    public static final int KEY_emfilledrect = 2783;

    public static final int KEY_emopencircle = 2766;

    public static final int KEY_emopenrectangle = 2767;

    public static final int KEY_emptyset = 16785925;

    public static final int KEY_emspace = 2721;

    public static final int KEY_endash = 2730;

    public static final int KEY_enfilledcircbullet = 2790;

    public static final int KEY_enfilledsqbullet = 2791;

    public static final int KEY_eng = 959;

    public static final int KEY_enopencircbullet = 2784;

    public static final int KEY_enopensquarebullet = 2785;

    public static final int KEY_enspace = 2722;

    public static final int KEY_eogonek = 490;

    public static final int KEY_equal = 61;

    public static final int KEY_eth = 240;

    public static final int KEY_etilde = 16785085;

    public static final int KEY_exclam = 33;

    public static final int KEY_exclamdown = 161;

    public static final int KEY_ezh = 16777874;

    public static final int KEY_f = 102;

    public static final int KEY_fabovedot = 16784927;

    public static final int KEY_femalesymbol = 2808;

    public static final int KEY_ff = 2531;

    public static final int KEY_figdash = 2747;

    public static final int KEY_filledlefttribullet = 2780;

    public static final int KEY_filledrectbullet = 2779;

    public static final int KEY_filledrighttribullet = 2781;

    public static final int KEY_filledtribulletdown = 2793;

    public static final int KEY_filledtribulletup = 2792;

    public static final int KEY_fiveeighths = 2757;

    public static final int KEY_fivesixths = 2743;

    public static final int KEY_fivesubscript = 16785541;

    public static final int KEY_fivesuperior = 16785525;

    public static final int KEY_fourfifths = 2741;

    public static final int KEY_foursubscript = 16785540;

    public static final int KEY_foursuperior = 16785524;

    public static final int KEY_fourthroot = 16785948;

    public static final int KEY_function = 2294;

    public static final int KEY_g = 103;

    public static final int KEY_gabovedot = 757;

    public static final int KEY_gbreve = 699;

    public static final int KEY_gcaron = 16777703;

    public static final int KEY_gcedilla = 955;

    public static final int KEY_gcircumflex = 760;

    public static final int KEY_grave = 96;

    public static final int KEY_greater = 62;

    public static final int KEY_greaterthanequal = 2238;

    public static final int KEY_guillemotleft = 171;

    public static final int KEY_guillemotright = 187;

    public static final int KEY_h = 104;

    public static final int KEY_hairspace = 2728;

    public static final int KEY_hcircumflex = 694;

    public static final int KEY_heart = 2798;

    public static final int KEY_hebrew_aleph = 3296;

    public static final int KEY_hebrew_ayin = 3314;

    public static final int KEY_hebrew_bet = 3297;

    public static final int KEY_hebrew_beth = 3297;

    public static final int KEY_hebrew_chet = 3303;

    public static final int KEY_hebrew_dalet = 3299;

    public static final int KEY_hebrew_daleth = 3299;

    public static final int KEY_hebrew_doublelowline = 3295;

    public static final int KEY_hebrew_finalkaph = 3306;

    public static final int KEY_hebrew_finalmem = 3309;

    public static final int KEY_hebrew_finalnun = 3311;

    public static final int KEY_hebrew_finalpe = 3315;

    public static final int KEY_hebrew_finalzade = 3317;

    public static final int KEY_hebrew_finalzadi = 3317;

    public static final int KEY_hebrew_gimel = 3298;

    public static final int KEY_hebrew_gimmel = 3298;

    public static final int KEY_hebrew_he = 3300;

    public static final int KEY_hebrew_het = 3303;

    public static final int KEY_hebrew_kaph = 3307;

    public static final int KEY_hebrew_kuf = 3319;

    public static final int KEY_hebrew_lamed = 3308;

    public static final int KEY_hebrew_mem = 3310;

    public static final int KEY_hebrew_nun = 3312;

    public static final int KEY_hebrew_pe = 3316;

    public static final int KEY_hebrew_qoph = 3319;

    public static final int KEY_hebrew_resh = 3320;

    public static final int KEY_hebrew_samech = 3313;

    public static final int KEY_hebrew_samekh = 3313;

    public static final int KEY_hebrew_shin = 3321;

    public static final int KEY_hebrew_taf = 3322;

    public static final int KEY_hebrew_taw = 3322;

    public static final int KEY_hebrew_tet = 3304;

    public static final int KEY_hebrew_teth = 3304;

    public static final int KEY_hebrew_waw = 3301;

    public static final int KEY_hebrew_yod = 3305;

    public static final int KEY_hebrew_zade = 3318;

    public static final int KEY_hebrew_zadi = 3318;

    public static final int KEY_hebrew_zain = 3302;

    public static final int KEY_hebrew_zayin = 3302;

    public static final int KEY_hexagram = 2778;

    public static final int KEY_horizconnector = 2211;

    public static final int KEY_horizlinescan1 = 2543;

    public static final int KEY_horizlinescan3 = 2544;

    public static final int KEY_horizlinescan5 = 2545;

    public static final int KEY_horizlinescan7 = 2546;

    public static final int KEY_horizlinescan9 = 2547;

    public static final int KEY_hstroke = 689;

    public static final int KEY_ht = 2530;

    public static final int KEY_hyphen = 173;

    public static final int KEY_i = 105;

    public static final int KEY_iTouch = 269025120;

    public static final int KEY_iacute = 237;

    public static final int KEY_ibelowdot = 16785099;

    public static final int KEY_ibreve = 16777517;

    public static final int KEY_icircumflex = 238;

    public static final int KEY_identical = 2255;

    public static final int KEY_idiaeresis = 239;

    public static final int KEY_idotless = 697;

    public static final int KEY_ifonlyif = 2253;

    public static final int KEY_igrave = 236;

    public static final int KEY_ihook = 16785097;

    public static final int KEY_imacron = 1007;

    public static final int KEY_implies = 2254;

    public static final int KEY_includedin = 2266;

    public static final int KEY_includes = 2267;

    public static final int KEY_infinity = 2242;

    public static final int KEY_integral = 2239;

    public static final int KEY_intersection = 2268;

    public static final int KEY_iogonek = 999;

    public static final int KEY_itilde = 949;

    public static final int KEY_j = 106;

    public static final int KEY_jcircumflex = 700;

    public static final int KEY_jot = 3018;

    public static final int KEY_k = 107;

    public static final int KEY_kana_A = 1201;

    public static final int KEY_kana_CHI = 1217;

    public static final int KEY_kana_E = 1204;

    public static final int KEY_kana_FU = 1228;

    public static final int KEY_kana_HA = 1226;

    public static final int KEY_kana_HE = 1229;

    public static final int KEY_kana_HI = 1227;

    public static final int KEY_kana_HO = 1230;

    public static final int KEY_kana_HU = 1228;

    public static final int KEY_kana_I = 1202;

    public static final int KEY_kana_KA = 1206;

    public static final int KEY_kana_KE = 1209;

    public static final int KEY_kana_KI = 1207;

    public static final int KEY_kana_KO = 1210;

    public static final int KEY_kana_KU = 1208;

    public static final int KEY_kana_MA = 1231;

    public static final int KEY_kana_ME = 1234;

    public static final int KEY_kana_MI = 1232;

    public static final int KEY_kana_MO = 1235;

    public static final int KEY_kana_MU = 1233;

    public static final int KEY_kana_N = 1245;

    public static final int KEY_kana_NA = 1221;

    public static final int KEY_kana_NE = 1224;

    public static final int KEY_kana_NI = 1222;

    public static final int KEY_kana_NO = 1225;

    public static final int KEY_kana_NU = 1223;

    public static final int KEY_kana_O = 1205;

    public static final int KEY_kana_RA = 1239;

    public static final int KEY_kana_RE = 1242;

    public static final int KEY_kana_RI = 1240;

    public static final int KEY_kana_RO = 1243;

    public static final int KEY_kana_RU = 1241;

    public static final int KEY_kana_SA = 1211;

    public static final int KEY_kana_SE = 1214;

    public static final int KEY_kana_SHI = 1212;

    public static final int KEY_kana_SO = 1215;

    public static final int KEY_kana_SU = 1213;

    public static final int KEY_kana_TA = 1216;

    public static final int KEY_kana_TE = 1219;

    public static final int KEY_kana_TI = 1217;

    public static final int KEY_kana_TO = 1220;

    public static final int KEY_kana_TSU = 1218;

    public static final int KEY_kana_TU = 1218;

    public static final int KEY_kana_U = 1203;

    public static final int KEY_kana_WA = 1244;

    public static final int KEY_kana_WO = 1190;

    public static final int KEY_kana_YA = 1236;

    public static final int KEY_kana_YO = 1238;

    public static final int KEY_kana_YU = 1237;

    public static final int KEY_kana_a = 1191;

    public static final int KEY_kana_closingbracket = 1187;

    public static final int KEY_kana_comma = 1188;

    public static final int KEY_kana_conjunctive = 1189;

    public static final int KEY_kana_e = 1194;

    public static final int KEY_kana_fullstop = 1185;

    public static final int KEY_kana_i = 1192;

    public static final int KEY_kana_middledot = 1189;

    public static final int KEY_kana_o = 1195;

    public static final int KEY_kana_openingbracket = 1186;

    public static final int KEY_kana_switch = 65406;

    public static final int KEY_kana_tsu = 1199;

    public static final int KEY_kana_tu = 1199;

    public static final int KEY_kana_u = 1193;

    public static final int KEY_kana_ya = 1196;

    public static final int KEY_kana_yo = 1198;

    public static final int KEY_kana_yu = 1197;

    public static final int KEY_kappa = 930;

    public static final int KEY_kcedilla = 1011;

    public static final int KEY_kra = 930;

    public static final int KEY_l = 108;

    public static final int KEY_lacute = 485;

    public static final int KEY_latincross = 2777;

    public static final int KEY_lbelowdot = 16784951;

    public static final int KEY_lcaron = 437;

    public static final int KEY_lcedilla = 950;

    public static final int KEY_leftanglebracket = 2748;

    public static final int KEY_leftarrow = 2299;

    public static final int KEY_leftcaret = 2979;

    public static final int KEY_leftdoublequotemark = 2770;

    public static final int KEY_leftmiddlecurlybrace = 2223;

    public static final int KEY_leftopentriangle = 2764;

    public static final int KEY_leftpointer = 2794;

    public static final int KEY_leftradical = 2209;

    public static final int KEY_leftshoe = 3034;

    public static final int KEY_leftsinglequotemark = 2768;

    public static final int KEY_leftt = 2548;

    public static final int KEY_lefttack = 3036;

    public static final int KEY_less = 60;

    public static final int KEY_lessthanequal = 2236;

    public static final int KEY_lf = 2533;

    public static final int KEY_logicaland = 2270;

    public static final int KEY_logicalor = 2271;

    public static final int KEY_lowleftcorner = 2541;

    public static final int KEY_lowrightcorner = 2538;

    public static final int KEY_lstroke = 435;

    public static final int KEY_m = 109;

    public static final int KEY_mabovedot = 16784961;

    public static final int KEY_macron = 175;

    public static final int KEY_malesymbol = 2807;

    public static final int KEY_maltesecross = 2800;

    public static final int KEY_marker = 2751;

    public static final int KEY_masculine = 186;

    public static final int KEY_minus = 45;

    public static final int KEY_minutes = 2774;

    public static final int KEY_mu = 181;

    public static final int KEY_multiply = 215;

    public static final int KEY_musicalflat = 2806;

    public static final int KEY_musicalsharp = 2805;

    public static final int KEY_n = 110;

    public static final int KEY_nabla = 2245;

    public static final int KEY_nacute = 497;

    public static final int KEY_ncaron = 498;

    public static final int KEY_ncedilla = 1009;

    public static final int KEY_ninesubscript = 16785545;

    public static final int KEY_ninesuperior = 16785529;

    public static final int KEY_nl = 2536;

    public static final int KEY_nobreakspace = 160;

    public static final int KEY_notapproxeq = 16785991;

    public static final int KEY_notelementof = 16785929;

    public static final int KEY_notequal = 2237;

    public static final int KEY_notidentical = 16786018;

    public static final int KEY_notsign = 172;

    public static final int KEY_ntilde = 241;

    public static final int KEY_numbersign = 35;

    public static final int KEY_numerosign = 1712;

    public static final int KEY_o = 111;

    public static final int KEY_oacute = 243;

    public static final int KEY_obarred = 16777845;

    public static final int KEY_obelowdot = 16785101;

    public static final int KEY_ocaron = 16777682;

    public static final int KEY_ocircumflex = 244;

    public static final int KEY_ocircumflexacute = 16785105;

    public static final int KEY_ocircumflexbelowdot = 16785113;

    public static final int KEY_ocircumflexgrave = 16785107;

    public static final int KEY_ocircumflexhook = 16785109;

    public static final int KEY_ocircumflextilde = 16785111;

    public static final int KEY_odiaeresis = 246;

    public static final int KEY_odoubleacute = 501;

    public static final int KEY_oe = 5053;

    public static final int KEY_ogonek = 434;

    public static final int KEY_ograve = 242;

    public static final int KEY_ohook = 16785103;

    public static final int KEY_ohorn = 16777633;

    public static final int KEY_ohornacute = 16785115;

    public static final int KEY_ohornbelowdot = 16785123;

    public static final int KEY_ohorngrave = 16785117;

    public static final int KEY_ohornhook = 16785119;

    public static final int KEY_ohorntilde = 16785121;

    public static final int KEY_omacron = 1010;

    public static final int KEY_oneeighth = 2755;

    public static final int KEY_onefifth = 2738;

    public static final int KEY_onehalf = 189;

    public static final int KEY_onequarter = 188;

    public static final int KEY_onesixth = 2742;

    public static final int KEY_onesubscript = 16785537;

    public static final int KEY_onesuperior = 185;

    public static final int KEY_onethird = 2736;

    public static final int KEY_ooblique = 248;

    public static final int KEY_openrectbullet = 2786;

    public static final int KEY_openstar = 2789;

    public static final int KEY_opentribulletdown = 2788;

    public static final int KEY_opentribulletup = 2787;

    public static final int KEY_ordfeminine = 170;

    public static final int KEY_oslash = 248;

    public static final int KEY_otilde = 245;

    public static final int KEY_overbar = 3008;

    public static final int KEY_overline = 1150;

    public static final int KEY_p = 112;

    public static final int KEY_pabovedot = 16784983;

    public static final int KEY_paragraph = 182;

    public static final int KEY_parenleft = 40;

    public static final int KEY_parenright = 41;

    public static final int KEY_partdifferential = 16785922;

    public static final int KEY_partialderivative = 2287;

    public static final int KEY_percent = 37;

    public static final int KEY_period = 46;

    public static final int KEY_periodcentered = 183;

    public static final int KEY_permille = 2773;

    public static final int KEY_phonographcopyright = 2811;

    public static final int KEY_plus = 43;

    public static final int KEY_plusminus = 177;

    public static final int KEY_prescription = 2772;

    public static final int KEY_prolongedsound = 1200;

    public static final int KEY_punctspace = 2726;

    public static final int KEY_q = 113;

    public static final int KEY_quad = 3020;

    public static final int KEY_question = 63;

    public static final int KEY_questiondown = 191;

    public static final int KEY_quotedbl = 34;

    public static final int KEY_quoteleft = 96;

    public static final int KEY_quoteright = 39;

    public static final int KEY_r = 114;

    public static final int KEY_racute = 480;

    public static final int KEY_radical = 2262;

    public static final int KEY_rcaron = 504;

    public static final int KEY_rcedilla = 947;

    public static final int KEY_registered = 174;

    public static final int KEY_rightanglebracket = 2750;

    public static final int KEY_rightarrow = 2301;

    public static final int KEY_rightcaret = 2982;

    public static final int KEY_rightdoublequotemark = 2771;

    public static final int KEY_rightmiddlecurlybrace = 2224;

    public static final int KEY_rightmiddlesummation = 2231;

    public static final int KEY_rightopentriangle = 2765;

    public static final int KEY_rightpointer = 2795;

    public static final int KEY_rightshoe = 3032;

    public static final int KEY_rightsinglequotemark = 2769;

    public static final int KEY_rightt = 2549;

    public static final int KEY_righttack = 3068;

    public static final int KEY_s = 115;

    public static final int KEY_sabovedot = 16784993;

    public static final int KEY_sacute = 438;

    public static final int KEY_scaron = 441;

    public static final int KEY_scedilla = 442;

    public static final int KEY_schwa = 16777817;

    public static final int KEY_scircumflex = 766;

    public static final int KEY_script_switch = 65406;

    public static final int KEY_seconds = 2775;

    public static final int KEY_section = 167;

    public static final int KEY_semicolon = 59;

    public static final int KEY_semivoicedsound = 1247;

    public static final int KEY_seveneighths = 2758;

    public static final int KEY_sevensubscript = 16785543;

    public static final int KEY_sevensuperior = 16785527;

    public static final int KEY_signaturemark = 2762;

    public static final int KEY_signifblank = 2732;

    public static final int KEY_similarequal = 2249;

    public static final int KEY_singlelowquotemark = 2813;

    public static final int KEY_sixsubscript = 16785542;

    public static final int KEY_sixsuperior = 16785526;

    public static final int KEY_slash = 47;

    public static final int KEY_soliddiamond = 2528;

    public static final int KEY_space = 32;

    public static final int KEY_squareroot = 16785946;

    public static final int KEY_ssharp = 223;

    public static final int KEY_sterling = 163;

    public static final int KEY_stricteq = 16786019;

    public static final int KEY_t = 116;

    public static final int KEY_tabovedot = 16785003;

    public static final int KEY_tcaron = 443;

    public static final int KEY_tcedilla = 510;

    public static final int KEY_telephone = 2809;

    public static final int KEY_telephonerecorder = 2810;

    public static final int KEY_therefore = 2240;

    public static final int KEY_thinspace = 2727;

    public static final int KEY_thorn = 254;

    public static final int KEY_threeeighths = 2756;

    public static final int KEY_threefifths = 2740;

    public static final int KEY_threequarters = 190;

    public static final int KEY_threesubscript = 16785539;

    public static final int KEY_threesuperior = 179;

    public static final int KEY_tintegral = 16785965;

    public static final int KEY_topintegral = 2212;

    public static final int KEY_topleftparens = 2219;

    public static final int KEY_topleftradical = 2210;

    public static final int KEY_topleftsqbracket = 2215;

    public static final int KEY_topleftsummation = 2225;

    public static final int KEY_toprightparens = 2221;

    public static final int KEY_toprightsqbracket = 2217;

    public static final int KEY_toprightsummation = 2229;

    public static final int KEY_topt = 2551;

    public static final int KEY_topvertsummationconnector = 2227;

    public static final int KEY_trademark = 2761;

    public static final int KEY_trademarkincircle = 2763;

    public static final int KEY_tslash = 956;

    public static final int KEY_twofifths = 2739;

    public static final int KEY_twosubscript = 16785538;

    public static final int KEY_twosuperior = 178;

    public static final int KEY_twothirds = 2737;

    public static final int KEY_u = 117;

    public static final int KEY_uacute = 250;

    public static final int KEY_ubelowdot = 16785125;

    public static final int KEY_ubreve = 765;

    public static final int KEY_ucircumflex = 251;

    public static final int KEY_udiaeresis = 252;

    public static final int KEY_udoubleacute = 507;

    public static final int KEY_ugrave = 249;

    public static final int KEY_uhook = 16785127;

    public static final int KEY_uhorn = 16777648;

    public static final int KEY_uhornacute = 16785129;

    public static final int KEY_uhornbelowdot = 16785137;

    public static final int KEY_uhorngrave = 16785131;

    public static final int KEY_uhornhook = 16785133;

    public static final int KEY_uhorntilde = 16785135;

    public static final int KEY_umacron = 1022;

    public static final int KEY_underbar = 3014;

    public static final int KEY_underscore = 95;

    public static final int KEY_union = 2269;

    public static final int KEY_uogonek = 1017;

    public static final int KEY_uparrow = 2300;

    public static final int KEY_upcaret = 2985;

    public static final int KEY_upleftcorner = 2540;

    public static final int KEY_uprightcorner = 2539;

    public static final int KEY_upshoe = 3011;

    public static final int KEY_upstile = 3027;

    public static final int KEY_uptack = 3022;

    public static final int KEY_uring = 505;

    public static final int KEY_utilde = 1021;

    public static final int KEY_v = 118;

    public static final int KEY_variation = 2241;

    public static final int KEY_vertbar = 2552;

    public static final int KEY_vertconnector = 2214;

    public static final int KEY_voicedsound = 1246;

    public static final int KEY_vt = 2537;

    public static final int KEY_w = 119;

    public static final int KEY_wacute = 16785027;

    public static final int KEY_wcircumflex = 16777589;

    public static final int KEY_wdiaeresis = 16785029;

    public static final int KEY_wgrave = 16785025;

    public static final int KEY_x = 120;

    public static final int KEY_xabovedot = 16785035;

    public static final int KEY_y = 121;

    public static final int KEY_yacute = 253;

    public static final int KEY_ybelowdot = 16785141;

    public static final int KEY_ycircumflex = 16777591;

    public static final int KEY_ydiaeresis = 255;

    public static final int KEY_yen = 165;

    public static final int KEY_ygrave = 16785139;

    public static final int KEY_yhook = 16785143;

    public static final int KEY_ytilde = 16785145;

    public static final int KEY_z = 122;

    public static final int KEY_zabovedot = 447;

    public static final int KEY_zacute = 444;

    public static final int KEY_zcaron = 446;

    public static final int KEY_zerosubscript = 16785536;

    public static final int KEY_zerosuperior = 16785520;

    public static final int KEY_zstroke = 16777654;

    public static final int MODIFIER_MASK = 469769999;

    public static final int PRIORITY_REDRAW = 120;

    /**
     * Adds the given rectangle to the current path of {@code cr}.
     */
    public static void cairoRectangle(org.cairographics.Context cr, Rectangle rectangle) {
        gtk_h.gdk_cairo_rectangle(cr.handle(), rectangle.handle());
    }
    
    /**
     * Adds the given region to the current path of {@code cr}.
     */
    public static void cairoRegion(org.cairographics.Context cr, org.cairographics.Region region) {
        gtk_h.gdk_cairo_region(cr.handle(), region.handle());
    }
    
    /**
     * Creates region that covers the area where the given
     * {@code surface} is more than 50% opaque.
     * <p>
     * This function takes into account device offsets that might be
     * set with cairo_surface_set_device_offset().
     */
    public static org.cairographics.Region cairoRegionCreateFromSurface(org.cairographics.Surface surface) {
        var RESULT = gtk_h.gdk_cairo_region_create_from_surface(surface.handle());
        return new org.cairographics.Region(References.get(RESULT, true));
    }
    
    /**
     * Sets the given pixbuf as the source pattern for {@code cr}.
     * <p>
     * The pattern has an extend mode of {@link org.cairographics.Extend#NONE} and is aligned
     * so that the origin of {@code pixbuf} is {@code pixbuf_x}, {@code pixbuf_y}.
     */
    public static void cairoSetSourcePixbuf(org.cairographics.Context cr, org.gtk.gdkpixbuf.Pixbuf pixbuf, double pixbufX, double pixbufY) {
        gtk_h.gdk_cairo_set_source_pixbuf(cr.handle(), pixbuf.handle(), pixbufX, pixbufY);
    }
    
    /**
     * Sets the specified {@code GdkRGBA} as the source color of {@code cr}.
     */
    public static void cairoSetSourceRgba(org.cairographics.Context cr, RGBA rgba) {
        gtk_h.gdk_cairo_set_source_rgba(cr.handle(), rgba.handle());
    }
    
    /**
     * Read content from the given input stream and deserialize it, asynchronously.
     * <p>
     * The default I/O priority is {@code G_PRIORITY_DEFAULT} (i.e. 0), and lower numbers
     * indicate a higher priority.
     * <p>
     * When the operation is finished, {@code callback} will be called. You must then
     * call {@link Gdk#contentDeserializeFinish} to get the result of the operation.
     */
    public static void contentDeserializeAsync(org.gtk.gio.InputStream stream, java.lang.String mimeType, Type type, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_content_deserialize_async(stream.handle(), Interop.allocateNativeString(mimeType).handle(), type.getValue(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a content deserialization operation.
     */
    public static boolean contentDeserializeFinish(org.gtk.gio.AsyncResult result, org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_deserialize_finish(result.handle(), value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses the given {@code string} into {@code GdkContentFormats} and
     * returns the formats.
     * <p>
     * Strings printed via {@link ContentFormats#toString}
     * can be read in again successfully using this function.
     * <p>
     * If {@code string} does not describe valid content formats, {@code null}
     * is returned.
     */
    public static ContentFormats contentFormatsParse(java.lang.String string) {
        var RESULT = gtk_h.gdk_content_formats_parse(Interop.allocateNativeString(string).handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Registers a function to deserialize object of a given type.
     */
    public static void contentRegisterDeserializer(java.lang.String mimeType, Type type, ContentDeserializeFunc deserialize) {
        try {
            gtk_h.gdk_content_register_deserializer(Interop.allocateNativeString(mimeType).handle(), type.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbContentDeserializeFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(deserialize.hashCode(), deserialize)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Registers a function to serialize objects of a given type.
     */
    public static void contentRegisterSerializer(Type type, java.lang.String mimeType, ContentSerializeFunc serialize) {
        try {
            gtk_h.gdk_content_register_serializer(type.getValue(), Interop.allocateNativeString(mimeType).handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbContentSerializeFunc",
                            MethodType.methodType(void.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(serialize.hashCode(), serialize)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Serialize content and write it to the given output stream, asynchronously.
     * <p>
     * The default I/O priority is {@code G_PRIORITY_DEFAULT} (i.e. 0), and lower numbers
     * indicate a higher priority.
     * <p>
     * When the operation is finished, {@code callback} will be called. You must then
     * call {@link Gdk#contentSerializeFinish} to get the result of the operation.
     */
    public static void contentSerializeAsync(org.gtk.gio.OutputStream stream, java.lang.String mimeType, org.gtk.gobject.Value value, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_content_serialize_async(stream.handle(), Interop.allocateNativeString(mimeType).handle(), value.handle(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes a content serialization operation.
     */
    public static boolean contentSerializeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_serialize_finish(result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks if {@code action} represents a single action or includes
     * multiple actions.
     * <p>
     * When {@code action} is 0 - ie no action was given, {@code true}
     * is returned.
     */
    public static boolean dragActionIsUnique(int action) {
        var RESULT = gtk_h.gdk_drag_action_is_unique(action);
        return (RESULT != 0);
    }
    
    /**
     * Returns the relative angle from {@code event1} to {@code event2}.
     * <p>
     * The relative angle is the angle between the X axis and the line
     * through both events' positions. The rotation direction for positive
     * angles is from the positive X axis towards the positive Y axis.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     */
    public static boolean eventsGetAngle(Event event1, Event event2, PointerDouble angle) {
        var RESULT = gtk_h.gdk_events_get_angle(event1.handle(), event2.handle(), angle.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the point halfway between the events' positions.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     */
    public static boolean eventsGetCenter(Event event1, Event event2, PointerDouble x, PointerDouble y) {
        var RESULT = gtk_h.gdk_events_get_center(event1.handle(), event2.handle(), x.handle(), y.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the distance between the event locations.
     * <p>
     * This assumes that both events have X/Y information.
     * If not, this function returns {@code false}.
     */
    public static boolean eventsGetDistance(Event event1, Event event2, PointerDouble distance) {
        var RESULT = gtk_h.gdk_events_get_distance(event1.handle(), event2.handle(), distance.handle());
        return (RESULT != 0);
    }
    
    public static org.gtk.glib.Quark glErrorQuark() {
        var RESULT = gtk_h.gdk_gl_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Canonicalizes the given mime type and interns the result.
     * <p>
     * If {@code string} is not a valid mime type, {@code null} is returned instead.
     * See RFC 2048 for the syntax if mime types.
     */
    public static java.lang.String internMimeType(java.lang.String string) {
        var RESULT = gtk_h.gdk_intern_mime_type(Interop.allocateNativeString(string).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Obtains the upper- and lower-case versions of the keyval {@code symbol}.
     * <p>
     * Examples of keyvals are {@code GDK_KEY_a}, {@code GDK_KEY_Enter}, {@code GDK_KEY_F1}, etc.
     */
    public static void keyvalConvertCase(int symbol, PointerInteger lower, PointerInteger upper) {
        gtk_h.gdk_keyval_convert_case(symbol, lower.handle(), upper.handle());
    }
    
    /**
     * Converts a key name to a key value.
     * <p>
     * The names are the same as those in the
     * {@code gdk/gdkkeysyms.h} header file
     * but without the leading “GDK_KEY_”.
     */
    public static int keyvalFromName(java.lang.String keyvalName) {
        var RESULT = gtk_h.gdk_keyval_from_name(Interop.allocateNativeString(keyvalName).handle());
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the given key value is in lower case.
     */
    public static boolean keyvalIsLower(int keyval) {
        var RESULT = gtk_h.gdk_keyval_is_lower(keyval);
        return (RESULT != 0);
    }
    
    /**
     * Returns {@code true} if the given key value is in upper case.
     */
    public static boolean keyvalIsUpper(int keyval) {
        var RESULT = gtk_h.gdk_keyval_is_upper(keyval);
        return (RESULT != 0);
    }
    
    /**
     * Converts a key value into a symbolic name.
     * <p>
     * The names are the same as those in the
     * {@code gdk/gdkkeysyms.h} header file
     * but without the leading “GDK_KEY_”.
     */
    public static java.lang.String keyvalName(int keyval) {
        var RESULT = gtk_h.gdk_keyval_name(keyval);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a key value to lower case, if applicable.
     */
    public static int keyvalToLower(int keyval) {
        var RESULT = gtk_h.gdk_keyval_to_lower(keyval);
        return RESULT;
    }
    
    /**
     * Convert from a GDK key symbol to the corresponding Unicode
     * character.
     * <p>
     * Note that the conversion does not take the current locale
     * into consideration, which might be expected for particular
     * keyvals, such as {@code GDK_KEY_KP_Decimal}.
     */
    public static int keyvalToUnicode(int keyval) {
        var RESULT = gtk_h.gdk_keyval_to_unicode(keyval);
        return RESULT;
    }
    
    /**
     * Converts a key value to upper case, if applicable.
     */
    public static int keyvalToUpper(int keyval) {
        var RESULT = gtk_h.gdk_keyval_to_upper(keyval);
        return RESULT;
    }
    
    /**
     * Returns a paintable that has the given intrinsic size and draws nothing.
     * <p>
     * This is often useful for implementing the
     * {@link Paintable#getCurrentImage} virtual function
     * when the paintable is in an incomplete state (like a
     * {@link org.gtk.gtk.MediaStream} before receiving the first frame).
     */
    public static Paintable paintableNewEmpty(int intrinsicWidth, int intrinsicHeight) {
        var RESULT = gtk_h.gdk_paintable_new_empty(intrinsicWidth, intrinsicHeight);
        return new Paintable.PaintableImpl(References.get(RESULT, true));
    }
    
    /**
     * Obtains a clip region which contains the areas where the given ranges
     * of text would be drawn.
     * <p>
     * {@code x_origin} and {@code y_origin} are the top left point to center the layout.
     * {@code index_ranges} should contain ranges of bytes in the layout’s text.
     * <p>
     * Note that the regions returned correspond to logical extents of the text
     * ranges, not ink extents. So the drawn layout may in fact touch areas out of
     * the clip region.  The clip region is mainly useful for highlightling parts
     * of text, such as when text is selected.
     */
    public static org.cairographics.Region pangoLayoutGetClipRegion(org.pango.Layout layout, int xOrigin, int yOrigin, PointerInteger indexRanges, int nRanges) {
        var RESULT = gtk_h.gdk_pango_layout_get_clip_region(layout.handle(), xOrigin, yOrigin, indexRanges.handle(), nRanges);
        return new org.cairographics.Region(References.get(RESULT, true));
    }
    
    /**
     * Obtains a clip region which contains the areas where the given
     * ranges of text would be drawn.
     * <p>
     * {@code x_origin} and {@code y_origin} are the top left position of the layout.
     * {@code index_ranges} should contain ranges of bytes in the layout’s text.
     * The clip region will include space to the left or right of the line
     * (to the layout bounding box) if you have indexes above or below the
     * indexes contained inside the line. This is to draw the selection all
     * the way to the side of the layout. However, the clip region is in line
     * coordinates, not layout coordinates.
     * <p>
     * Note that the regions returned correspond to logical extents of the text
     * ranges, not ink extents. So the drawn line may in fact touch areas out of
     * the clip region.  The clip region is mainly useful for highlightling parts
     * of text, such as when text is selected.
     */
    public static org.cairographics.Region pangoLayoutLineGetClipRegion(org.pango.LayoutLine line, int xOrigin, int yOrigin, int[] indexRanges, int nRanges) {
        var RESULT = gtk_h.gdk_pango_layout_line_get_clip_region(line.handle(), xOrigin, yOrigin, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, indexRanges)).handle(), nRanges);
        return new org.cairographics.Region(References.get(RESULT, true));
    }
    
    /**
     * Transfers image data from a {@code cairo_surface_t} and converts it
     * to a {@code GdkPixbuf}.
     * <p>
     * This allows you to efficiently read individual pixels from cairo surfaces.
     * <p>
     * This function will create an RGB pixbuf with 8 bits per channel.
     * The pixbuf will contain an alpha channel if the {@code surface} contains one.
     */
    public static org.gtk.gdkpixbuf.Pixbuf pixbufGetFromSurface(org.cairographics.Surface surface, int srcX, int srcY, int width, int height) {
        var RESULT = gtk_h.gdk_pixbuf_get_from_surface(surface.handle(), srcX, srcY, width, height);
        return new org.gtk.gdkpixbuf.Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Creates a new pixbuf from {@code texture}.
     * <p>
     * This should generally not be used in newly written code as later
     * stages will almost certainly convert the pixbuf back into a texture
     * to draw it on screen.
     */
    public static org.gtk.gdkpixbuf.Pixbuf pixbufGetFromTexture(Texture texture) {
        var RESULT = gtk_h.gdk_pixbuf_get_from_texture(texture.handle());
        return new org.gtk.gdkpixbuf.Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Sets a list of backends that GDK should try to use.
     * <p>
     * This can be useful if your application does not
     * work with certain GDK backends.
     * <p>
     * By default, GDK tries all included backends.
     * <p>
     * For example:
     * <p>
     * <pre>{@code c
     * gdk_set_allowed_backends ("wayland,macos,*");
     * }</pre>
     * <p>
     * instructs GDK to try the Wayland backend first, followed by the
     * MacOs backend, and then all others.
     * <p>
     * If the {@code GDK_BACKEND} environment variable is set, it determines
     * what backends are tried in what order, while still respecting the
     * set of allowed backends that are specified by this function.
     * <p>
     * The possible backend names are:
     * <p>
     * <ul>
     * <li>{@code broadway}
     * <li>{@code macos}
     * <li>{@code wayland}.
     * <li>{@code win32}
     * <li>{@code x11}
     * </ul>
     * <p>
     * You can also include a {@code *} in the list to try all remaining backends.
     * <p>
     * This call must happen prior to functions that open a display, such
     * as {@link Gdk#Display}, {@code gtk_init()}, or {@code gtk_init_check()}
     * in order to take effect.
     */
    public static void setAllowedBackends(java.lang.String backends) {
        gtk_h.gdk_set_allowed_backends(Interop.allocateNativeString(backends).handle());
    }
    
    public static org.gtk.glib.Quark textureErrorQuark() {
        var RESULT = gtk_h.gdk_texture_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static org.gtk.gobject.Type toplevelSizeGetType() {
        var RESULT = gtk_h.gdk_toplevel_size_get_type();
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Convert from a Unicode character to a key symbol.
     */
    public static int unicodeToKeyval(int wc) {
        var RESULT = gtk_h.gdk_unicode_to_keyval(wc);
        return RESULT;
    }
    
    public static org.gtk.glib.Quark vulkanErrorQuark() {
        var RESULT = gtk_h.gdk_vulkan_error_quark();
        return new org.gtk.glib.Quark(RESULT);
    }
    
}
