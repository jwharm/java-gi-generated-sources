package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of {@link Descriptor}
 * <p>
 * These values correspond to the registered descriptor type from
 * the base MPEG-TS specifications (ITU H.222.0 | ISO/IEC 13818-1).
 * <p>
 * Consult the relevant specifications for more details.
 */
public enum DescriptorType implements io.github.jwharm.javagi.Enumeration {
    
    RESERVED_00(0),
    
    RESERVED_01(1),
    
    VIDEO_STREAM(2),
    
    AUDIO_STREAM(3),
    
    HIERARCHY(4),
    
    REGISTRATION(5),
    
    DATA_STREAM_ALIGNMENT(6),
    
    TARGET_BACKGROUND_GRID(7),
    
    VIDEO_WINDOW(8),
    
    CA(9),
    
    ISO_639_LANGUAGE(10),
    
    SYSTEM_CLOCK(11),
    
    MULTIPLEX_BUFFER_UTILISATION(12),
    
    COPYRIGHT(13),
    
    MAXIMUM_BITRATE(14),
    
    PRIVATE_DATA_INDICATOR(15),
    
    SMOOTHING_BUFFER(16),
    
    STD(17),
    
    IBP(18),
    
    DSMCC_CAROUSEL_IDENTIFIER(19),
    
    DSMCC_ASSOCIATION_TAG(20),
    
    DSMCC_DEFERRED_ASSOCIATION_TAG(21),
    
    DSMCC_NPT_REFERENCE(23),
    
    DSMCC_NPT_ENDPOINT(24),
    
    DSMCC_STREAM_MODE(25),
    
    DSMCC_STREAM_EVENT(26),
    
    MPEG4_VIDEO(27),
    
    MPEG4_AUDIO(28),
    
    IOD(29),
    
    SL(30),
    
    FMC(31),
    
    EXTERNAL_ES_ID(32),
    
    MUX_CODE(33),
    
    FMX_BUFFER_SIZE(34),
    
    MULTIPLEX_BUFFER(35),
    
    CONTENT_LABELING(36),
    
    METADATA_POINTER(37),
    
    METADATA(38),
    
    METADATA_STD(39),
    
    AVC_VIDEO(40),
    
    IPMP(41),
    
    AVC_TIMING_AND_HRD(42),
    
    MPEG2_AAC_AUDIO(43),
    
    FLEX_MUX_TIMING(44),
    
    MPEG4_TEXT(45),
    
    MPEG4_AUDIO_EXTENSION(46),
    
    AUXILIARY_VIDEO_STREAM(47),
    
    SVC_EXTENSION(48),
    
    MVC_EXTENSION(49),
    
    J2K_VIDEO(50),
    
    MVC_OPERATION_POINT(51),
    
    MPEG2_STEREOSCOPIC_VIDEO_FORMAT(52),
    
    STEREOSCOPIC_PROGRAM_INFO(53),
    
    STEREOSCOPIC_VIDEO_INFO(54);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDescriptorType";
    
    private final int value;
    
    /**
     * Create a new DescriptorType for the provided value
     * @param numeric value the enum value
     */
    DescriptorType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new DescriptorType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DescriptorType of(int value) {
        return switch (value) {
            case 0 -> RESERVED_00;
            case 1 -> RESERVED_01;
            case 2 -> VIDEO_STREAM;
            case 3 -> AUDIO_STREAM;
            case 4 -> HIERARCHY;
            case 5 -> REGISTRATION;
            case 6 -> DATA_STREAM_ALIGNMENT;
            case 7 -> TARGET_BACKGROUND_GRID;
            case 8 -> VIDEO_WINDOW;
            case 9 -> CA;
            case 10 -> ISO_639_LANGUAGE;
            case 11 -> SYSTEM_CLOCK;
            case 12 -> MULTIPLEX_BUFFER_UTILISATION;
            case 13 -> COPYRIGHT;
            case 14 -> MAXIMUM_BITRATE;
            case 15 -> PRIVATE_DATA_INDICATOR;
            case 16 -> SMOOTHING_BUFFER;
            case 17 -> STD;
            case 18 -> IBP;
            case 19 -> DSMCC_CAROUSEL_IDENTIFIER;
            case 20 -> DSMCC_ASSOCIATION_TAG;
            case 21 -> DSMCC_DEFERRED_ASSOCIATION_TAG;
            case 23 -> DSMCC_NPT_REFERENCE;
            case 24 -> DSMCC_NPT_ENDPOINT;
            case 25 -> DSMCC_STREAM_MODE;
            case 26 -> DSMCC_STREAM_EVENT;
            case 27 -> MPEG4_VIDEO;
            case 28 -> MPEG4_AUDIO;
            case 29 -> IOD;
            case 30 -> SL;
            case 31 -> FMC;
            case 32 -> EXTERNAL_ES_ID;
            case 33 -> MUX_CODE;
            case 34 -> FMX_BUFFER_SIZE;
            case 35 -> MULTIPLEX_BUFFER;
            case 36 -> CONTENT_LABELING;
            case 37 -> METADATA_POINTER;
            case 38 -> METADATA;
            case 39 -> METADATA_STD;
            case 40 -> AVC_VIDEO;
            case 41 -> IPMP;
            case 42 -> AVC_TIMING_AND_HRD;
            case 43 -> MPEG2_AAC_AUDIO;
            case 44 -> FLEX_MUX_TIMING;
            case 45 -> MPEG4_TEXT;
            case 46 -> MPEG4_AUDIO_EXTENSION;
            case 47 -> AUXILIARY_VIDEO_STREAM;
            case 48 -> SVC_EXTENSION;
            case 49 -> MVC_EXTENSION;
            case 50 -> J2K_VIDEO;
            case 51 -> MVC_OPERATION_POINT;
            case 52 -> MPEG2_STEREOSCOPIC_VIDEO_FORMAT;
            case 53 -> STEREOSCOPIC_PROGRAM_INFO;
            case 54 -> STEREOSCOPIC_VIDEO_INFO;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
