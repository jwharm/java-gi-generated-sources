package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The color primaries define the how to transform linear RGB values to and from
 * the CIE XYZ colorspace.
 */
public enum VideoColorPrimaries implements io.github.jwharm.javagi.Enumeration {
    /**
     * unknown color primaries
     */
    UNKNOWN(0),
    /**
     * BT709 primaries, also ITU-R BT1361 / IEC
     * 61966-2-4 / SMPTE RP177 Annex B
     */
    BT709(1),
    /**
     * BT470M primaries, also FCC Title 47 Code
     * of Federal Regulations 73.682 (a)(20)
     */
    BT470M(2),
    /**
     * BT470BG primaries, also ITU-R BT601-6
     * 625 / ITU-R BT1358 625 / ITU-R BT1700 625 PAL &amp; SECAM
     */
    BT470BG(3),
    /**
     * SMPTE170M primaries, also ITU-R
     * BT601-6 525 / ITU-R BT1358 525 / ITU-R BT1700 NTSC
     */
    SMPTE170M(4),
    /**
     * SMPTE240M primaries
     */
    SMPTE240M(5),
    /**
     * Generic film (colour filters using
     * Illuminant C)
     */
    FILM(6),
    /**
     * ITU-R BT2020 primaries. Since: 1.6
     */
    BT2020(7),
    /**
     * Adobe RGB primaries. Since: 1.8
     */
    ADOBERGB(8),
    /**
     * SMPTE ST 428 primaries (CIE 1931
     * XYZ). Since: 1.16
     */
    SMPTEST428(9),
    /**
     * SMPTE RP 431 primaries (ST 431-2
     * (2011) / DCI P3). Since: 1.16
     */
    SMPTERP431(10),
    /**
     * SMPTE EG 432 primaries (ST 432-1
     * (2010) / P3 D65). Since: 1.16
     */
    SMPTEEG432(11),
    /**
     * EBU 3213 primaries (JEDEC P22
     * phosphors). Since: 1.16
     */
    EBU3213(12);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoColorPrimaries";
    
    private final int value;
    VideoColorPrimaries(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoColorPrimaries of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> BT709;
            case 2 -> BT470M;
            case 3 -> BT470BG;
            case 4 -> SMPTE170M;
            case 5 -> SMPTE240M;
            case 6 -> FILM;
            case 7 -> BT2020;
            case 8 -> ADOBERGB;
            case 9 -> SMPTEST428;
            case 10 -> SMPTERP431;
            case 11 -> SMPTEEG432;
            case 12 -> EBU3213;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Converts the {@code value} to the {@link VideoColorPrimaries}
     * The colour primaries (ColourPrimaries) value is
     * defined by "ISO/IEC 23001-8 Section 7.1 Table 2" and "ITU-T H.273 Table 2".
     * "H.264 Table E-3" and "H.265 Table E.3" share the identical values.
     * @param value a ITU-T H.273 colour primaries value
     * @return the matched {@link VideoColorPrimaries}
     */
    public static @NotNull org.gstreamer.video.VideoColorPrimaries fromIso(int value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_color_primaries_from_iso.invokeExact(
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoColorPrimaries.of(RESULT);
    }
    
    /**
     * Get information about the chromaticity coordinates of {@code primaries}.
     * @param primaries a {@link VideoColorPrimaries}
     * @return a {@link VideoColorPrimariesInfo} for {@code primaries}.
     */
    public static @NotNull org.gstreamer.video.VideoColorPrimariesInfo getInfo(@NotNull org.gstreamer.video.VideoColorPrimaries primaries) {
        java.util.Objects.requireNonNull(primaries, "Parameter 'primaries' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_color_primaries_get_info.invokeExact(
                    primaries.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoColorPrimariesInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * Converts {@link VideoColorPrimaries} to the "colour primaries" (ColourPrimaries)
     * value defined by "ISO/IEC 23001-8 Section 7.1 Table 2"
     * and "ITU-T H.273 Table 2".
     * "H.264 Table E-3" and "H.265 Table E.3" share the identical values.
     * @param primaries a {@link VideoColorPrimaries}
     * @return The value of ISO/IEC 23001-8 colour primaries.
     */
    public static int toIso(@NotNull org.gstreamer.video.VideoColorPrimaries primaries) {
        java.util.Objects.requireNonNull(primaries, "Parameter 'primaries' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_color_primaries_to_iso.invokeExact(
                    primaries.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_color_primaries_from_iso = Interop.downcallHandle(
            "gst_video_color_primaries_from_iso",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_color_primaries_get_info = Interop.downcallHandle(
            "gst_video_color_primaries_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_color_primaries_to_iso = Interop.downcallHandle(
            "gst_video_color_primaries_to_iso",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
