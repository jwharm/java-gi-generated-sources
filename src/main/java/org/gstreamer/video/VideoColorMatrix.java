package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The color matrix is used to convert between Y'PbPr and
 * non-linear RGB (R'G'B')
 */
public enum VideoColorMatrix implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * unknown matrix
     */
    UNKNOWN(0),
    
    /**
     * identity matrix. Order of coefficients is
     * actually GBR, also IEC 61966-2-1 (sRGB)
     */
    RGB(1),
    
    /**
     * FCC Title 47 Code of Federal Regulations 73.682 (a)(20)
     */
    FCC(2),
    
    /**
     * ITU-R BT.709 color matrix, also ITU-R BT1361
     * / IEC 61966-2-4 xvYCC709 / SMPTE RP177 Annex B
     */
    BT709(3),
    
    /**
     * ITU-R BT.601 color matrix, also SMPTE170M / ITU-R BT1358 525 / ITU-R BT1700 NTSC
     */
    BT601(4),
    
    /**
     * SMPTE 240M color matrix
     */
    SMPTE240M(5),
    
    /**
     * ITU-R BT.2020 color matrix. Since: 1.6
     */
    BT2020(6);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoColorMatrix";
    
    private final int value;
    
    /**
     * Create a new VideoColorMatrix for the provided value
     * @param numeric value the enum value
     */
    VideoColorMatrix(int value) {
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
     * Create a new VideoColorMatrix for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoColorMatrix of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> RGB;
            case 2 -> FCC;
            case 3 -> BT709;
            case 4 -> BT601;
            case 5 -> SMPTE240M;
            case 6 -> BT2020;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Converts the {@code value} to the {@link VideoColorMatrix}
     * The matrix coefficients (MatrixCoefficients) value is
     * defined by "ISO/IEC 23001-8 Section 7.3 Table 4"
     * and "ITU-T H.273 Table 4".
     * "H.264 Table E-5" and "H.265 Table E.5" share the identical values.
     * @param value a ITU-T H.273 matrix coefficients value
     * @return the matched {@link VideoColorMatrix}
     */
    public static org.gstreamer.video.VideoColorMatrix fromIso(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_color_matrix_from_iso.invokeExact(value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoColorMatrix.of(RESULT);
    }
    
    /**
     * Get the coefficients used to convert between Y'PbPr and R'G'B' using {@code matrix}.
     * <p>
     * When:
     * <pre>{@code 
     *   0.0 <= [Y',R',G',B'] <= 1.0)
     *   (-0.5 <= [Pb,Pr] <= 0.5)
     * }</pre>
     * <p>
     * the general conversion is given by:
     * <pre>{@code 
     *   Y' = Kr*R' + (1-Kr-Kb)*G' + Kb*B'
     *   Pb = (B'-Y')/(2*(1-Kb))
     *   Pr = (R'-Y')/(2*(1-Kr))
     * }</pre>
     * <p>
     * and the other way around:
     * <pre>{@code 
     *   R' = Y' + Cr*2*(1-Kr)
     *   G' = Y' - Cb*2*(1-Kb)*Kb/(1-Kr-Kb) - Cr*2*(1-Kr)*Kr/(1-Kr-Kb)
     *   B' = Y' + Cb*2*(1-Kb)
     * }</pre>
     * @param matrix a {@link VideoColorMatrix}
     * @param Kr result red channel coefficient
     * @param Kb result blue channel coefficient
     * @return TRUE if {@code matrix} was a YUV color format and {@code Kr} and {@code Kb} contain valid
     *    values.
     */
    public static boolean getKrKb(org.gstreamer.video.VideoColorMatrix matrix, Out<Double> Kr, Out<Double> Kb) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment KrPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment KbPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_color_matrix_get_Kr_Kb.invokeExact(
                        matrix.getValue(),
                        (Addressable) KrPOINTER.address(),
                        (Addressable) KbPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    Kr.set(KrPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    Kb.set(KbPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Converts {@link VideoColorMatrix} to the "matrix coefficients"
     * (MatrixCoefficients) value defined by "ISO/IEC 23001-8 Section 7.3 Table 4"
     * and "ITU-T H.273 Table 4".
     * "H.264 Table E-5" and "H.265 Table E.5" share the identical values.
     * @param matrix a {@link VideoColorMatrix}
     * @return The value of ISO/IEC 23001-8 matrix coefficients.
     */
    public static int toIso(org.gstreamer.video.VideoColorMatrix matrix) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_color_matrix_to_iso.invokeExact(matrix.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_color_matrix_from_iso = Interop.downcallHandle(
                "gst_video_color_matrix_from_iso",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_color_matrix_get_Kr_Kb = Interop.downcallHandle(
                "gst_video_color_matrix_get_Kr_Kb",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_color_matrix_to_iso = Interop.downcallHandle(
                "gst_video_color_matrix_to_iso",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
}
