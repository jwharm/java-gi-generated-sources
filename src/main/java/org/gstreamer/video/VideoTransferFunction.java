package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The video transfer function defines the formula for converting between
 * non-linear RGB (R'G'B') and linear RGB
 */
public enum VideoTransferFunction implements io.github.jwharm.javagi.Enumeration {
    /**
     * unknown transfer function
     */
    UNKNOWN(0),
    /**
     * linear RGB, gamma 1.0 curve
     */
    GAMMA10(1),
    /**
     * Gamma 1.8 curve
     */
    GAMMA18(2),
    /**
     * Gamma 2.0 curve
     */
    GAMMA20(3),
    /**
     * Gamma 2.2 curve
     */
    GAMMA22(4),
    /**
     * Gamma 2.2 curve with a linear segment in the lower
     *                           range, also ITU-R BT470M / ITU-R BT1700 625 PAL &amp;
     *                           SECAM / ITU-R BT1361
     */
    BT709(5),
    /**
     * Gamma 2.2 curve with a linear segment in the
     *                               lower range
     */
    SMPTE240M(6),
    /**
     * Gamma 2.4 curve with a linear segment in the lower
     *                          range. IEC 61966-2-1 (sRGB or sYCC)
     */
    SRGB(7),
    /**
     * Gamma 2.8 curve, also ITU-R BT470BG
     */
    GAMMA28(8),
    /**
     * Logarithmic transfer characteristic
     *                             100:1 range
     */
    LOG100(9),
    /**
     * Logarithmic transfer characteristic
     *                             316.22777:1 range (100 * sqrt(10) : 1)
     */
    LOG316(10),
    /**
     * Gamma 2.2 curve with a linear segment in the lower
     *                                range. Used for BT.2020 with 12 bits per
     *                                component. Since: 1.6
     */
    BT2020_12(11),
    /**
     * Gamma 2.19921875. Since: 1.8
     */
    ADOBERGB(12),
    /**
     * Rec. ITU-R BT.2020-2 with 10 bits per component.
     *                                (functionally the same as the values
     *                                GST_VIDEO_TRANSFER_BT709 and GST_VIDEO_TRANSFER_BT601).
     *                                Since: 1.18
     */
    BT2020_10(13),
    /**
     * SMPTE ST 2084 for 10, 12, 14, and 16-bit systems.
     *                                Known as perceptual quantization (PQ)
     *                                Since: 1.18
     */
    SMPTE2084(14),
    /**
     * Association of Radio Industries and Businesses (ARIB)
     *                                   STD-B67 and Rec. ITU-R BT.2100-1 hybrid loggamma (HLG) system
     *                                   Since: 1.18
     */
    ARIB_STD_B67(15),
    /**
     * also known as SMPTE170M / ITU-R BT1358 525 or 625 / ITU-R BT1700 NTSC
     */
    BT601(16);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTransferFunction";
    
    private final int value;
    VideoTransferFunction(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoTransferFunction of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> GAMMA10;
            case 2 -> GAMMA18;
            case 3 -> GAMMA20;
            case 4 -> GAMMA22;
            case 5 -> BT709;
            case 6 -> SMPTE240M;
            case 7 -> SRGB;
            case 8 -> GAMMA28;
            case 9 -> LOG100;
            case 10 -> LOG316;
            case 11 -> BT2020_12;
            case 12 -> ADOBERGB;
            case 13 -> BT2020_10;
            case 14 -> SMPTE2084;
            case 15 -> ARIB_STD_B67;
            case 16 -> BT601;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Convert {@code val} to its gamma decoded value. This is the inverse operation of
     * gst_video_color_transfer_encode().
     * <p>
     * For a non-linear value L' in the range [0..1], conversion to the linear
     * L is in general performed with a power function like:
     * <pre>{@code 
     *    L = L' ^ gamma
     * }</pre>
     * <p>
     * Depending on {@code func}, different formulas might be applied. Some formulas
     * encode a linear segment in the lower range.
     * @param func a {@link VideoTransferFunction}
     * @param val a value
     * @return the gamma decoded value of {@code val}
     */
    public static double decode(@NotNull org.gstreamer.video.VideoTransferFunction func, double val) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_video_transfer_function_decode.invokeExact(
                    func.getValue(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Convert {@code val} to its gamma encoded value.
     * <p>
     * For a linear value L in the range [0..1], conversion to the non-linear
     * (gamma encoded) L' is in general performed with a power function like:
     * <pre>{@code 
     *    L' = L ^ (1 / gamma)
     * }</pre>
     * <p>
     * Depending on {@code func}, different formulas might be applied. Some formulas
     * encode a linear segment in the lower range.
     * @param func a {@link VideoTransferFunction}
     * @param val a value
     * @return the gamma encoded value of {@code val}
     */
    public static double encode(@NotNull org.gstreamer.video.VideoTransferFunction func, double val) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gst_video_transfer_function_encode.invokeExact(
                    func.getValue(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts the {@code value} to the {@link VideoTransferFunction}
     * The transfer characteristics (TransferCharacteristics) value is
     * defined by "ISO/IEC 23001-8 Section 7.2 Table 3"
     * and "ITU-T H.273 Table 3".
     * "H.264 Table E-4" and "H.265 Table E.4" share the identical values.
     * @param value a ITU-T H.273 transfer characteristics value
     * @return the matched {@link VideoTransferFunction}
     */
    public static @NotNull org.gstreamer.video.VideoTransferFunction fromIso(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_transfer_function_from_iso.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoTransferFunction.of(RESULT);
    }
    
    /**
     * Returns whether {@code from_func} and {@code to_func} are equivalent. There are cases
     * (e.g. BT601, BT709, and BT2020_10) where several functions are functionally
     * identical. In these cases, when doing conversion, we should consider them
     * as equivalent. Also, BT2020_12 is the same as the aforementioned three for
     * less than 12 bits per pixel.
     * @param fromFunc {@link VideoTransferFunction} to convert from
     * @param fromBpp bits per pixel to convert from
     * @param toFunc {@link VideoTransferFunction} to convert into
     * @param toBpp bits per pixel to convert into
     * @return TRUE if {@code from_func} and {@code to_func} can be considered equivalent.
     */
    public static boolean isEquivalent(@NotNull org.gstreamer.video.VideoTransferFunction fromFunc, int fromBpp, @NotNull org.gstreamer.video.VideoTransferFunction toFunc, int toBpp) {
        java.util.Objects.requireNonNull(fromFunc, "Parameter 'fromFunc' must not be null");
        java.util.Objects.requireNonNull(toFunc, "Parameter 'toFunc' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_transfer_function_is_equivalent.invokeExact(
                    fromFunc.getValue(),
                    fromBpp,
                    toFunc.getValue(),
                    toBpp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Converts {@link VideoTransferFunction} to the "transfer characteristics"
     * (TransferCharacteristics) value defined by "ISO/IEC 23001-8 Section 7.2 Table 3"
     * and "ITU-T H.273 Table 3".
     * "H.264 Table E-4" and "H.265 Table E.4" share the identical values.
     * @param func a {@link VideoTransferFunction}
     * @return The value of ISO/IEC 23001-8 transfer characteristics.
     */
    public static int toIso(@NotNull org.gstreamer.video.VideoTransferFunction func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_transfer_function_to_iso.invokeExact(
                    func.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_transfer_function_decode = Interop.downcallHandle(
            "gst_video_transfer_function_decode",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_video_transfer_function_encode = Interop.downcallHandle(
            "gst_video_transfer_function_encode",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_video_transfer_function_from_iso = Interop.downcallHandle(
            "gst_video_transfer_function_from_iso",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_transfer_function_is_equivalent = Interop.downcallHandle(
            "gst_video_transfer_function_is_equivalent",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_transfer_function_to_iso = Interop.downcallHandle(
            "gst_video_transfer_function_to_iso",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
