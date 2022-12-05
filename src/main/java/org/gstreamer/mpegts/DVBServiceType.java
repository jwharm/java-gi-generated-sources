package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of service of a channel.
 * <p>
 * As specified in Table 87 of ETSI EN 300 468 v1.13.1
 */
public enum DVBServiceType implements io.github.jwharm.javagi.Enumeration {
    RESERVED_00(0),
    DIGITAL_TELEVISION(1),
    DIGITAL_RADIO_SOUND(2),
    TELETEXT(3),
    NVOD_REFERENCE(4),
    NVOD_TIME_SHIFTED(5),
    MOSAIC(6),
    FM_RADIO(7),
    DVB_SRM(8),
    RESERVED_09(9),
    ADVANCED_CODEC_DIGITAL_RADIO_SOUND(10),
    ADVANCED_CODEC_MOSAIC(11),
    DATA_BROADCAST(12),
    RESERVED_0D_COMMON_INTERFACE(13),
    RCS_MAP(14),
    RCS_FLS(15),
    DVB_MHP(16),
    MPEG2_HD_DIGITAL_TELEVISION(17),
    ADVANCED_CODEC_SD_DIGITAL_TELEVISION(22),
    ADVANCED_CODEC_SD_NVOD_TIME_SHIFTED(23),
    ADVANCED_CODEC_SD_NVOD_REFERENCE(24),
    ADVANCED_CODEC_HD_DIGITAL_TELEVISION(25),
    ADVANCED_CODEC_HD_NVOD_TIME_SHIFTED(26),
    ADVANCED_CODEC_HD_NVOD_REFERENCE(27),
    ADVANCED_CODEC_STEREO_HD_DIGITAL_TELEVISION(28),
    ADVANCED_CODEC_STEREO_HD_NVOD_TIME_SHIFTED(29),
    ADVANCED_CODEC_STEREO_HD_NVOD_REFERENCE(30),
    RESERVED_FF(31);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBServiceType";
    
    private final int value;
    DVBServiceType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DVBServiceType of(int value) {
        return switch (value) {
            case 0 -> RESERVED_00;
            case 1 -> DIGITAL_TELEVISION;
            case 2 -> DIGITAL_RADIO_SOUND;
            case 3 -> TELETEXT;
            case 4 -> NVOD_REFERENCE;
            case 5 -> NVOD_TIME_SHIFTED;
            case 6 -> MOSAIC;
            case 7 -> FM_RADIO;
            case 8 -> DVB_SRM;
            case 9 -> RESERVED_09;
            case 10 -> ADVANCED_CODEC_DIGITAL_RADIO_SOUND;
            case 11 -> ADVANCED_CODEC_MOSAIC;
            case 12 -> DATA_BROADCAST;
            case 13 -> RESERVED_0D_COMMON_INTERFACE;
            case 14 -> RCS_MAP;
            case 15 -> RCS_FLS;
            case 16 -> DVB_MHP;
            case 17 -> MPEG2_HD_DIGITAL_TELEVISION;
            case 22 -> ADVANCED_CODEC_SD_DIGITAL_TELEVISION;
            case 23 -> ADVANCED_CODEC_SD_NVOD_TIME_SHIFTED;
            case 24 -> ADVANCED_CODEC_SD_NVOD_REFERENCE;
            case 25 -> ADVANCED_CODEC_HD_DIGITAL_TELEVISION;
            case 26 -> ADVANCED_CODEC_HD_NVOD_TIME_SHIFTED;
            case 27 -> ADVANCED_CODEC_HD_NVOD_REFERENCE;
            case 28 -> ADVANCED_CODEC_STEREO_HD_DIGITAL_TELEVISION;
            case 29 -> ADVANCED_CODEC_STEREO_HD_NVOD_TIME_SHIFTED;
            case 30 -> ADVANCED_CODEC_STEREO_HD_NVOD_REFERENCE;
            case 31 -> RESERVED_FF;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
