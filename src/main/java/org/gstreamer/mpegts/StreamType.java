package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of MPEG-TS stream type.
 * <p>
 * These values correspond to the base standard registered types. Depending
 * on the variant of mpeg-ts being used (Bluray, ATSC, DVB, ...), other
 * types might also be used, but will not conflict with these.
 * <p>
 * Corresponds to table 2-34 of ITU H.222.0 | ISO/IEC 13818-1
 */
public enum StreamType implements io.github.jwharm.javagi.Enumeration {
    /**
     * ITU-T | ISO/IEC Reserved
     */
    RESERVED_00(0),
    /**
     * ISO/IEC 11172-2 Video (i.e. MPEG-1 Video)
     */
    VIDEO_MPEG1(1),
    /**
     * Rec. ITU-T H.262 | ISO/IEC 13818-2
     *       Video or ISO/IEC 11172-2 constrained parameter video stream (i.e.
     *       MPEG-2 Video)
     */
    VIDEO_MPEG2(2),
    /**
     * ISO/IEC 11172-3 Audio
     */
    AUDIO_MPEG1(3),
    /**
     * ISO/IEC 13818-3 Audio
     */
    AUDIO_MPEG2(4),
    /**
     * private sections
     */
    PRIVATE_SECTIONS(5),
    /**
     * PES packets containing private data
     */
    PRIVATE_PES_PACKETS(6),
    /**
     * ISO/IEC 13522 MHEG
     */
    MHEG(7),
    /**
     * Annex A DSM-CC
     */
    DSM_CC(8),
    /**
     * Rec. ITU-T H.222.1
     */
    H_222_1(9),
    /**
     * ISO/IEC 13818-6 type A
     */
    DSMCC_A(10),
    /**
     * ISO/IEC 13818-6 type B
     */
    DSMCC_B(11),
    /**
     * ISO/IEC 13818-6 type C
     */
    DSMCC_C(12),
    /**
     * ISO/IEC 13818-6 type D
     */
    DSMCC_D(13),
    /**
     * auxiliary streams
     */
    AUXILIARY(14),
    /**
     * ISO/IEC 13818-7 Audio (AAC) with ADTS
     *       transport syntax
     */
    AUDIO_AAC_ADTS(15),
    /**
     * ISO/IEC 14496-2 Visual (MPEG-4 Video)
     */
    VIDEO_MPEG4(16),
    /**
     * ISO/IEC 14496-3 Audio (AAC) with the LATM
     *       transport syntax as defined in ISO/IEC 14496-3
     */
    AUDIO_AAC_LATM(17),
    /**
     * ISO/IEC 14496-1
     *       SL-packetized stream or FlexMux stream carried in PES packets
     */
    SL_FLEXMUX_PES_PACKETS(18),
    /**
     * ISO/IEC 14496-1 SL-packetized
     *       stream or FlexMux stream carried in ISO/IEC 14496_sections
     */
    SL_FLEXMUX_SECTIONS(19),
    /**
     * ISO/IEC 13818-6 Synchronized
     *       Download Protocol
     */
    SYNCHRONIZED_DOWNLOAD(20),
    /**
     * Metadata carried in PES packets
     */
    METADATA_PES_PACKETS(21),
    /**
     * Metadata carried in metadata_sections
     */
    METADATA_SECTIONS(22),
    /**
     * Metadata carried in ISO/IEC
     *       13818-6 Data Carousel
     */
    METADATA_DATA_CAROUSEL(23),
    /**
     * Metadata carried in
     *       ISO/IEC 13818-6 Object Carousel
     */
    METADATA_OBJECT_CAROUSEL(24),
    /**
     * Metadata carried in
     *       ISO/IEC 13818-6 Synchronized Download Protocol
     */
    METADATA_SYNCHRONIZED_DOWNLOAD(25),
    /**
     * IPMP stream (defined in ISO/IEC 13818-11,
     *       MPEG-2 IPMP)
     */
    MPEG2_IPMP(26),
    /**
     * AVC video stream conforming to one or
     * more profiles defined in Annex A of Rec. ITU-T H.264 | ISO/IEC 14496-10 or
     * AVC video sub-bitstream of SVC as defined in 2.1.78 or MVC base view
     * sub-bitstream, as defined in 2.1.85, or AVC video sub-bitstream of MVC, as
     * defined in 2.1.88
     */
    VIDEO_H264(27),
    /**
     * ISO/IEC 14496-3 (AAC) Audio, without
     *       using any additional transport syntax, such as DST, ALS and SLS
     */
    AUDIO_AAC_CLEAN(28),
    /**
     * ISO/IEC 14496-17 Text
     */
    MPEG4_TIMED_TEXT(29),
    /**
     * Auxiliary video stream as defined in
     * ISO/IEC 23002-3
     */
    VIDEO_RVC(30),
    /**
     * SVC video sub-bitstream
     * of an AVC video stream conforming to one or more profiles defined in Annex G
     * of Rec. ITU-T H.264 | ISO/IEC 14496-10
     */
    VIDEO_H264_SVC_SUB_BITSTREAM(31),
    /**
     * MVC video sub-bitstream
     * of an AVC video stream conforming to one or more profiles defined in Annex H
     * of Rec. ITU-T H.264 | ISO/IEC 14496-10
     */
    VIDEO_H264_MVC_SUB_BITSTREAM(32),
    /**
     * Video stream conforming to one or more
     *       profiles as defined in Rec. ITU-T T.800 | ISO/IEC 15444-1 (i.e. JPEG 2000)
     */
    VIDEO_JP2K(33),
    /**
     * Additional view
     * Rec. ITU-T H.262 | ISO/IEC 13818-2 video stream for service-compatible
     * stereoscopic 3D services
     */
    VIDEO_MPEG2_STEREO_ADDITIONAL_VIEW(34),
    /**
     * Additional view
     * Rec. ITU-T H.264 | ISO/IEC 14496-10 video stream conforming to one or more
     * profiles defined in Annex A for service-compatible stereoscopic 3D services
     */
    VIDEO_H264_STEREO_ADDITIONAL_VIEW(35),
    /**
     * Rec. ITU-T H.265 | ISO/IEC 23008-2 video
     *      stream or an HEVC temporal video sub-bitstream
     */
    VIDEO_HEVC(36),
    /**
     * IPMP stream
     */
    IPMP_STREAM(127),
    /**
     * User Private stream id (used for VC-1) as defined by SMPTE RP227.
     */
    USER_PRIVATE_EA(234);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsStreamType";
    
    private final int value;
    StreamType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static StreamType of(int value) {
        return switch (value) {
            case 0 -> RESERVED_00;
            case 1 -> VIDEO_MPEG1;
            case 2 -> VIDEO_MPEG2;
            case 3 -> AUDIO_MPEG1;
            case 4 -> AUDIO_MPEG2;
            case 5 -> PRIVATE_SECTIONS;
            case 6 -> PRIVATE_PES_PACKETS;
            case 7 -> MHEG;
            case 8 -> DSM_CC;
            case 9 -> H_222_1;
            case 10 -> DSMCC_A;
            case 11 -> DSMCC_B;
            case 12 -> DSMCC_C;
            case 13 -> DSMCC_D;
            case 14 -> AUXILIARY;
            case 15 -> AUDIO_AAC_ADTS;
            case 16 -> VIDEO_MPEG4;
            case 17 -> AUDIO_AAC_LATM;
            case 18 -> SL_FLEXMUX_PES_PACKETS;
            case 19 -> SL_FLEXMUX_SECTIONS;
            case 20 -> SYNCHRONIZED_DOWNLOAD;
            case 21 -> METADATA_PES_PACKETS;
            case 22 -> METADATA_SECTIONS;
            case 23 -> METADATA_DATA_CAROUSEL;
            case 24 -> METADATA_OBJECT_CAROUSEL;
            case 25 -> METADATA_SYNCHRONIZED_DOWNLOAD;
            case 26 -> MPEG2_IPMP;
            case 27 -> VIDEO_H264;
            case 28 -> AUDIO_AAC_CLEAN;
            case 29 -> MPEG4_TIMED_TEXT;
            case 30 -> VIDEO_RVC;
            case 31 -> VIDEO_H264_SVC_SUB_BITSTREAM;
            case 32 -> VIDEO_H264_MVC_SUB_BITSTREAM;
            case 33 -> VIDEO_JP2K;
            case 34 -> VIDEO_MPEG2_STEREO_ADDITIONAL_VIEW;
            case 35 -> VIDEO_H264_STEREO_ADDITIONAL_VIEW;
            case 36 -> VIDEO_HEVC;
            case 127 -> IPMP_STREAM;
            case 234 -> USER_PRIVATE_EA;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
