package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enum value describing the most common video formats.
 * <p>
 * See the <a href="https://gstreamer.freedesktop.org/documentation/additional/design/mediatype-video-raw.html#formats">GStreamer raw video format design document</a>
 * for details about the layout and packing of these formats in memory.
 */
public enum VideoFormat implements io.github.jwharm.javagi.Enumeration {
    /**
     * Unknown or unset video format id
     */
    UNKNOWN(0),
    /**
     * Encoded video format. Only ever use that in caps for
     *                            special video formats in combination with non-system
     *                            memory GstCapsFeatures where it does not make sense
     *                            to specify a real video format.
     */
    ENCODED(1),
    /**
     * planar 4:2:0 YUV
     */
    I420(2),
    /**
     * planar 4:2:0 YVU (like I420 but UV planes swapped)
     */
    YV12(3),
    /**
     * packed 4:2:2 YUV (Y0-U0-Y1-V0 Y2-U2-Y3-V2 Y4 ...)
     */
    YUY2(4),
    /**
     * packed 4:2:2 YUV (U0-Y0-V0-Y1 U2-Y2-V2-Y3 U4 ...)
     */
    UYVY(5),
    /**
     * packed 4:4:4 YUV with alpha channel (A0-Y0-U0-V0 ...)
     */
    AYUV(6),
    /**
     * sparse rgb packed into 32 bit, space last
     */
    RGBX(7),
    /**
     * sparse reverse rgb packed into 32 bit, space last
     */
    BGRX(8),
    /**
     * sparse rgb packed into 32 bit, space first
     */
    XRGB(9),
    /**
     * sparse reverse rgb packed into 32 bit, space first
     */
    XBGR(10),
    /**
     * rgb with alpha channel last
     */
    RGBA(11),
    /**
     * reverse rgb with alpha channel last
     */
    BGRA(12),
    /**
     * rgb with alpha channel first
     */
    ARGB(13),
    /**
     * reverse rgb with alpha channel first
     */
    ABGR(14),
    /**
     * RGB packed into 24 bits without padding ({@code R-G-B-R-G-B})
     */
    RGB(15),
    /**
     * reverse RGB packed into 24 bits without padding ({@code B-G-R-B-G-R})
     */
    BGR(16),
    /**
     * planar 4:1:1 YUV
     */
    Y41B(17),
    /**
     * planar 4:2:2 YUV
     */
    Y42B(18),
    /**
     * packed 4:2:2 YUV (Y0-V0-Y1-U0 Y2-V2-Y3-U2 Y4 ...)
     */
    YVYU(19),
    /**
     * planar 4:4:4 YUV
     */
    Y444(20),
    /**
     * packed 4:2:2 10-bit YUV, complex format
     */
    V210(21),
    /**
     * packed 4:2:2 16-bit YUV, Y0-U0-Y1-V1 order
     */
    V216(22),
    /**
     * planar 4:2:0 YUV with interleaved UV plane
     */
    NV12(23),
    /**
     * planar 4:2:0 YUV with interleaved VU plane
     */
    NV21(24),
    /**
     * 8-bit grayscale
     */
    GRAY8(25),
    /**
     * 16-bit grayscale, most significant byte first
     */
    GRAY16_BE(26),
    /**
     * 16-bit grayscale, least significant byte first
     */
    GRAY16_LE(27),
    /**
     * packed 4:4:4 YUV (Y-U-V ...)
     */
    V308(28),
    /**
     * rgb 5-6-5 bits per component
     */
    RGB16(29),
    /**
     * reverse rgb 5-6-5 bits per component
     */
    BGR16(30),
    /**
     * rgb 5-5-5 bits per component
     */
    RGB15(31),
    /**
     * reverse rgb 5-5-5 bits per component
     */
    BGR15(32),
    /**
     * packed 10-bit 4:2:2 YUV (U0-Y0-V0-Y1 U2-Y2-V2-Y3 U4 ...)
     */
    UYVP(33),
    /**
     * planar 4:4:2:0 AYUV
     */
    A420(34),
    /**
     * 8-bit paletted RGB
     */
    RGB8P(35),
    /**
     * planar 4:1:0 YUV
     */
    YUV9(36),
    /**
     * planar 4:1:0 YUV (like YUV9 but UV planes swapped)
     */
    YVU9(37),
    /**
     * packed 4:1:1 YUV (Cb-Y0-Y1-Cr-Y2-Y3 ...)
     */
    IYU1(38),
    /**
     * rgb with alpha channel first, 16 bits (native endianness) per channel
     */
    ARGB64(39),
    /**
     * packed 4:4:4 YUV with alpha channel, 16 bits (native endianness) per channel (A0-Y0-U0-V0 ...)
     */
    AYUV64(40),
    /**
     * packed 4:4:4 RGB, 10 bits per channel
     */
    R210(41),
    /**
     * planar 4:2:0 YUV, 10 bits per channel
     */
    I420_10BE(42),
    /**
     * planar 4:2:0 YUV, 10 bits per channel
     */
    I420_10LE(43),
    /**
     * planar 4:2:2 YUV, 10 bits per channel
     */
    I422_10BE(44),
    /**
     * planar 4:2:2 YUV, 10 bits per channel
     */
    I422_10LE(45),
    /**
     * planar 4:4:4 YUV, 10 bits per channel (Since: 1.2)
     */
    Y444_10BE(46),
    /**
     * planar 4:4:4 YUV, 10 bits per channel (Since: 1.2)
     */
    Y444_10LE(47),
    /**
     * planar 4:4:4 RGB, 8 bits per channel (Since: 1.2)
     */
    GBR(48),
    /**
     * planar 4:4:4 RGB, 10 bits per channel (Since: 1.2)
     */
    GBR_10BE(49),
    /**
     * planar 4:4:4 RGB, 10 bits per channel (Since: 1.2)
     */
    GBR_10LE(50),
    /**
     * planar 4:2:2 YUV with interleaved UV plane (Since: 1.2)
     */
    NV16(51),
    /**
     * planar 4:4:4 YUV with interleaved UV plane (Since: 1.2)
     */
    NV24(52),
    /**
     * NV12 with 64x32 tiling in zigzag pattern (Since: 1.4)
     */
    NV12_64Z32(53),
    /**
     * planar 4:4:2:0 YUV, 10 bits per channel (Since: 1.6)
     */
    A420_10BE(54),
    /**
     * planar 4:4:2:0 YUV, 10 bits per channel (Since: 1.6)
     */
    A420_10LE(55),
    /**
     * planar 4:4:2:2 YUV, 10 bits per channel (Since: 1.6)
     */
    A422_10BE(56),
    /**
     * planar 4:4:2:2 YUV, 10 bits per channel (Since: 1.6)
     */
    A422_10LE(57),
    /**
     * planar 4:4:4:4 YUV, 10 bits per channel (Since: 1.6)
     */
    A444_10BE(58),
    /**
     * planar 4:4:4:4 YUV, 10 bits per channel (Since: 1.6)
     */
    A444_10LE(59),
    /**
     * planar 4:2:2 YUV with interleaved VU plane (Since: 1.6)
     */
    NV61(60),
    /**
     * planar 4:2:0 YUV with interleaved UV plane, 10 bits per channel (Since: 1.10)
     */
    P010_10BE(61),
    /**
     * planar 4:2:0 YUV with interleaved UV plane, 10 bits per channel (Since: 1.10)
     */
    P010_10LE(62),
    /**
     * packed 4:4:4 YUV (U-Y-V ...) (Since: 1.10)
     */
    IYU2(63),
    /**
     * packed 4:2:2 YUV (V0-Y0-U0-Y1 V2-Y2-U2-Y3 V4 ...)
     */
    VYUY(64),
    /**
     * planar 4:4:4:4 ARGB, 8 bits per channel (Since: 1.12)
     */
    GBRA(65),
    /**
     * planar 4:4:4:4 ARGB, 10 bits per channel (Since: 1.12)
     */
    GBRA_10BE(66),
    /**
     * planar 4:4:4:4 ARGB, 10 bits per channel (Since: 1.12)
     */
    GBRA_10LE(67),
    /**
     * planar 4:4:4 RGB, 12 bits per channel (Since: 1.12)
     */
    GBR_12BE(68),
    /**
     * planar 4:4:4 RGB, 12 bits per channel (Since: 1.12)
     */
    GBR_12LE(69),
    /**
     * planar 4:4:4:4 ARGB, 12 bits per channel (Since: 1.12)
     */
    GBRA_12BE(70),
    /**
     * planar 4:4:4:4 ARGB, 12 bits per channel (Since: 1.12)
     */
    GBRA_12LE(71),
    /**
     * planar 4:2:0 YUV, 12 bits per channel (Since: 1.12)
     */
    I420_12BE(72),
    /**
     * planar 4:2:0 YUV, 12 bits per channel (Since: 1.12)
     */
    I420_12LE(73),
    /**
     * planar 4:2:2 YUV, 12 bits per channel (Since: 1.12)
     */
    I422_12BE(74),
    /**
     * planar 4:2:2 YUV, 12 bits per channel (Since: 1.12)
     */
    I422_12LE(75),
    /**
     * planar 4:4:4 YUV, 12 bits per channel (Since: 1.12)
     */
    Y444_12BE(76),
    /**
     * planar 4:4:4 YUV, 12 bits per channel (Since: 1.12)
     */
    Y444_12LE(77),
    /**
     * 10-bit grayscale, packed into 32bit words (2 bits padding) (Since: 1.14)
     */
    GRAY10_LE32(78),
    /**
     * 10-bit variant of {@code GST_VIDEO_FORMAT_NV12}, packed into 32bit words (MSB 2 bits padding) (Since: 1.14)
     */
    NV12_10LE32(79),
    /**
     * 10-bit variant of {@code GST_VIDEO_FORMAT_NV16}, packed into 32bit words (MSB 2 bits padding) (Since: 1.14)
     */
    NV16_10LE32(80),
    /**
     * Fully packed variant of NV12_10LE32 (Since: 1.16)
     */
    NV12_10LE40(81),
    /**
     * packed 4:2:2 YUV, 10 bits per channel (Since: 1.16)
     */
    Y210(82),
    /**
     * packed 4:4:4 YUV, 10 bits per channel(A-V-Y-U...) (Since: 1.16)
     */
    Y410(83),
    /**
     * packed 4:4:4 YUV with alpha channel (V0-U0-Y0-A0...) (Since: 1.16)
     */
    VUYA(84),
    /**
     * packed 4:4:4 RGB with alpha channel(B-G-R-A), 10 bits for R/G/B channel and MSB 2 bits for alpha channel (Since: 1.16)
     */
    BGR10A2_LE(85),
    /**
     * packed 4:4:4 RGB with alpha channel(R-G-B-A), 10 bits for R/G/B channel and MSB 2 bits for alpha channel (Since: 1.18)
     */
    RGB10A2_LE(86),
    /**
     * planar 4:4:4 YUV, 16 bits per channel (Since: 1.18)
     */
    Y444_16BE(87),
    /**
     * planar 4:4:4 YUV, 16 bits per channel (Since: 1.18)
     */
    Y444_16LE(88),
    /**
     * planar 4:2:0 YUV with interleaved UV plane, 16 bits per channel (Since: 1.18)
     */
    P016_BE(89),
    /**
     * planar 4:2:0 YUV with interleaved UV plane, 16 bits per channel (Since: 1.18)
     */
    P016_LE(90),
    /**
     * planar 4:2:0 YUV with interleaved UV plane, 12 bits per channel (Since: 1.18)
     */
    P012_BE(91),
    /**
     * planar 4:2:0 YUV with interleaved UV plane, 12 bits per channel (Since: 1.18)
     */
    P012_LE(92),
    /**
     * packed 4:2:2 YUV, 12 bits per channel (Y-U-Y-V) (Since: 1.18)
     */
    Y212_BE(93),
    /**
     * packed 4:2:2 YUV, 12 bits per channel (Y-U-Y-V) (Since: 1.18)
     */
    Y212_LE(94),
    /**
     * packed 4:4:4:4 YUV, 12 bits per channel(U-Y-V-A...) (Since: 1.18)
     */
    Y412_BE(95),
    /**
     * packed 4:4:4:4 YUV, 12 bits per channel(U-Y-V-A...) (Since: 1.18)
     */
    Y412_LE(96),
    /**
     * NV12 with 4x4 tiles in linear order.
     */
    NV12_4L4(97),
    /**
     * NV12 with 32x32 tiles in linear order.
     */
    NV12_32L32(98),
    /**
     * Planar 4:4:4 RGB, R-G-B order
     */
    RGBP(99),
    /**
     * Planar 4:4:4 RGB, B-G-R order
     */
    BGRP(100),
    /**
     * Planar 4:2:0 YUV with interleaved UV plane with alpha as
     * 3rd plane.
     */
    AV12(101),
    /**
     * RGB with alpha channel first, 16 bits (little endian)
     * per channel.
     */
    ARGB64_LE(102),
    /**
     * RGB with alpha channel first, 16 bits (big endian)
     * per channel.
     */
    ARGB64_BE(103),
    /**
     * RGB with alpha channel last, 16 bits (little endian)
     * per channel.
     */
    RGBA64_LE(104),
    /**
     * RGB with alpha channel last, 16 bits (big endian)
     * per channel.
     */
    RGBA64_BE(105),
    /**
     * Reverse RGB with alpha channel last, 16 bits (little endian)
     * per channel.
     */
    BGRA64_LE(106),
    /**
     * Reverse RGB with alpha channel last, 16 bits (big endian)
     * per channel.
     */
    BGRA64_BE(107),
    /**
     * Reverse RGB with alpha channel first, 16 bits (little endian)
     * per channel.
     */
    ABGR64_LE(108),
    /**
     * Reverse RGB with alpha channel first, 16 bits (big endian)
     * per channel.
     */
    ABGR64_BE(109);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFormat";
    
    private final int value;
    VideoFormat(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoFormat of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> ENCODED;
            case 2 -> I420;
            case 3 -> YV12;
            case 4 -> YUY2;
            case 5 -> UYVY;
            case 6 -> AYUV;
            case 7 -> RGBX;
            case 8 -> BGRX;
            case 9 -> XRGB;
            case 10 -> XBGR;
            case 11 -> RGBA;
            case 12 -> BGRA;
            case 13 -> ARGB;
            case 14 -> ABGR;
            case 15 -> RGB;
            case 16 -> BGR;
            case 17 -> Y41B;
            case 18 -> Y42B;
            case 19 -> YVYU;
            case 20 -> Y444;
            case 21 -> V210;
            case 22 -> V216;
            case 23 -> NV12;
            case 24 -> NV21;
            case 25 -> GRAY8;
            case 26 -> GRAY16_BE;
            case 27 -> GRAY16_LE;
            case 28 -> V308;
            case 29 -> RGB16;
            case 30 -> BGR16;
            case 31 -> RGB15;
            case 32 -> BGR15;
            case 33 -> UYVP;
            case 34 -> A420;
            case 35 -> RGB8P;
            case 36 -> YUV9;
            case 37 -> YVU9;
            case 38 -> IYU1;
            case 39 -> ARGB64;
            case 40 -> AYUV64;
            case 41 -> R210;
            case 42 -> I420_10BE;
            case 43 -> I420_10LE;
            case 44 -> I422_10BE;
            case 45 -> I422_10LE;
            case 46 -> Y444_10BE;
            case 47 -> Y444_10LE;
            case 48 -> GBR;
            case 49 -> GBR_10BE;
            case 50 -> GBR_10LE;
            case 51 -> NV16;
            case 52 -> NV24;
            case 53 -> NV12_64Z32;
            case 54 -> A420_10BE;
            case 55 -> A420_10LE;
            case 56 -> A422_10BE;
            case 57 -> A422_10LE;
            case 58 -> A444_10BE;
            case 59 -> A444_10LE;
            case 60 -> NV61;
            case 61 -> P010_10BE;
            case 62 -> P010_10LE;
            case 63 -> IYU2;
            case 64 -> VYUY;
            case 65 -> GBRA;
            case 66 -> GBRA_10BE;
            case 67 -> GBRA_10LE;
            case 68 -> GBR_12BE;
            case 69 -> GBR_12LE;
            case 70 -> GBRA_12BE;
            case 71 -> GBRA_12LE;
            case 72 -> I420_12BE;
            case 73 -> I420_12LE;
            case 74 -> I422_12BE;
            case 75 -> I422_12LE;
            case 76 -> Y444_12BE;
            case 77 -> Y444_12LE;
            case 78 -> GRAY10_LE32;
            case 79 -> NV12_10LE32;
            case 80 -> NV16_10LE32;
            case 81 -> NV12_10LE40;
            case 82 -> Y210;
            case 83 -> Y410;
            case 84 -> VUYA;
            case 85 -> BGR10A2_LE;
            case 86 -> RGB10A2_LE;
            case 87 -> Y444_16BE;
            case 88 -> Y444_16LE;
            case 89 -> P016_BE;
            case 90 -> P016_LE;
            case 91 -> P012_BE;
            case 92 -> P012_LE;
            case 93 -> Y212_BE;
            case 94 -> Y212_LE;
            case 95 -> Y412_BE;
            case 96 -> Y412_LE;
            case 97 -> NV12_4L4;
            case 98 -> NV12_32L32;
            case 99 -> RGBP;
            case 100 -> BGRP;
            case 101 -> AV12;
            case 102 -> ARGB64_LE;
            case 103 -> ARGB64_BE;
            case 104 -> RGBA64_LE;
            case 105 -> RGBA64_BE;
            case 106 -> BGRA64_LE;
            case 107 -> BGRA64_BE;
            case 108 -> ABGR64_LE;
            case 109 -> ABGR64_BE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Converts a FOURCC value into the corresponding {@link VideoFormat}.
     * If the FOURCC cannot be represented by {@link VideoFormat},
     * {@code GST_VIDEO_FORMAT_UNKNOWN} is returned.
     * @param fourcc a FOURCC value representing raw YUV video
     * @return the {@link VideoFormat} describing the FOURCC value
     */
    public static @NotNull org.gstreamer.video.VideoFormat fromFourcc(int fourcc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_format_from_fourcc.invokeExact(
                    fourcc);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
    
    /**
     * Find the {@link VideoFormat} for the given parameters.
     * @param depth the amount of bits used for a pixel
     * @param bpp the amount of bits used to store a pixel. This value is bigger than
     *   {@code depth}
     * @param endianness the endianness of the masks, {@code G_LITTLE_ENDIAN} or {@code G_BIG_ENDIAN}
     * @param redMask the red mask
     * @param greenMask the green mask
     * @param blueMask the blue mask
     * @param alphaMask the alpha mask, or 0 if no alpha mask
     * @return a {@link VideoFormat} or GST_VIDEO_FORMAT_UNKNOWN when the parameters to
     * not specify a known format.
     */
    public static @NotNull org.gstreamer.video.VideoFormat fromMasks(int depth, int bpp, int endianness, int redMask, int greenMask, int blueMask, int alphaMask) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_format_from_masks.invokeExact(
                    depth,
                    bpp,
                    endianness,
                    redMask,
                    greenMask,
                    blueMask,
                    alphaMask);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
    
    /**
     * Convert the {@code format} string to its {@link VideoFormat}.
     * @param format a format string
     * @return the {@link VideoFormat} for {@code format} or GST_VIDEO_FORMAT_UNKNOWN when the
     * string is not a known format.
     */
    public static @NotNull org.gstreamer.video.VideoFormat fromString(@NotNull java.lang.String format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_format_from_string.invokeExact(
                    Interop.allocateNativeString(format));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
    
    /**
     * Get the {@link VideoFormatInfo} for {@code format}
     * @param format a {@link VideoFormat}
     * @return The {@link VideoFormatInfo} for {@code format}.
     */
    public static @NotNull org.gstreamer.video.VideoFormatInfo getInfo(@NotNull org.gstreamer.video.VideoFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_format_get_info.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoFormatInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the default palette of {@code format}. This the palette used in the pack
     * function for paletted formats.
     * @param format a {@link VideoFormat}
     * @param size size of the palette in bytes
     * @return the default palette of {@code format} or {@code null} when
     * {@code format} does not have a palette.
     */
    public static @Nullable java.lang.foreign.MemoryAddress getPalette(@NotNull org.gstreamer.video.VideoFormat format, Out<Long> size) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(size, "Parameter 'size' must not be null");
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_format_get_palette.invokeExact(
                    format.getValue(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
    
    /**
     * Converts a {@link VideoFormat} value into the corresponding FOURCC.  Only
     * a few YUV formats have corresponding FOURCC values.  If {@code format} has
     * no corresponding FOURCC value, 0 is returned.
     * @param format a {@link VideoFormat} video format
     * @return the FOURCC corresponding to {@code format}
     */
    public static int toFourcc(@NotNull org.gstreamer.video.VideoFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_format_to_fourcc.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a string containing a descriptive name for
     * the {@link VideoFormat} if there is one, or NULL otherwise.
     * @param format a {@link VideoFormat} video format
     * @return the name corresponding to {@code format}
     */
    public static @NotNull java.lang.String toString(@NotNull org.gstreamer.video.VideoFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_format_to_string.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_format_from_fourcc = Interop.downcallHandle(
            "gst_video_format_from_fourcc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_format_from_masks = Interop.downcallHandle(
            "gst_video_format_from_masks",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_format_from_string = Interop.downcallHandle(
            "gst_video_format_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_format_get_info = Interop.downcallHandle(
            "gst_video_format_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_format_get_palette = Interop.downcallHandle(
            "gst_video_format_get_palette",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_format_to_fourcc = Interop.downcallHandle(
            "gst_video_format_to_fourcc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_format_to_string = Interop.downcallHandle(
            "gst_video_format_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
