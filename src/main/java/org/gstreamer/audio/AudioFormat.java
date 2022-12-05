package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enum value describing the most common audio formats.
 */
public enum AudioFormat implements io.github.jwharm.javagi.Enumeration {
    /**
     * unknown or unset audio format
     */
    UNKNOWN(0),
    /**
     * encoded audio format
     */
    ENCODED(1),
    /**
     * 8 bits in 8 bits, signed
     */
    S8(2),
    /**
     * 8 bits in 8 bits, unsigned
     */
    U8(3),
    /**
     * 16 bits in 16 bits, signed, little endian
     */
    S16LE(4),
    /**
     * 16 bits in 16 bits, signed, big endian
     */
    S16BE(5),
    /**
     * 16 bits in 16 bits, unsigned, little endian
     */
    U16LE(6),
    /**
     * 16 bits in 16 bits, unsigned, big endian
     */
    U16BE(7),
    /**
     * 24 bits in 32 bits, signed, little endian
     */
    S24_32LE(8),
    /**
     * 24 bits in 32 bits, signed, big endian
     */
    S24_32BE(9),
    /**
     * 24 bits in 32 bits, unsigned, little endian
     */
    U24_32LE(10),
    /**
     * 24 bits in 32 bits, unsigned, big endian
     */
    U24_32BE(11),
    /**
     * 32 bits in 32 bits, signed, little endian
     */
    S32LE(12),
    /**
     * 32 bits in 32 bits, signed, big endian
     */
    S32BE(13),
    /**
     * 32 bits in 32 bits, unsigned, little endian
     */
    U32LE(14),
    /**
     * 32 bits in 32 bits, unsigned, big endian
     */
    U32BE(15),
    /**
     * 24 bits in 24 bits, signed, little endian
     */
    S24LE(16),
    /**
     * 24 bits in 24 bits, signed, big endian
     */
    S24BE(17),
    /**
     * 24 bits in 24 bits, unsigned, little endian
     */
    U24LE(18),
    /**
     * 24 bits in 24 bits, unsigned, big endian
     */
    U24BE(19),
    /**
     * 20 bits in 24 bits, signed, little endian
     */
    S20LE(20),
    /**
     * 20 bits in 24 bits, signed, big endian
     */
    S20BE(21),
    /**
     * 20 bits in 24 bits, unsigned, little endian
     */
    U20LE(22),
    /**
     * 20 bits in 24 bits, unsigned, big endian
     */
    U20BE(23),
    /**
     * 18 bits in 24 bits, signed, little endian
     */
    S18LE(24),
    /**
     * 18 bits in 24 bits, signed, big endian
     */
    S18BE(25),
    /**
     * 18 bits in 24 bits, unsigned, little endian
     */
    U18LE(26),
    /**
     * 18 bits in 24 bits, unsigned, big endian
     */
    U18BE(27),
    /**
     * 32-bit floating point samples, little endian
     */
    F32LE(28),
    /**
     * 32-bit floating point samples, big endian
     */
    F32BE(29),
    /**
     * 64-bit floating point samples, little endian
     */
    F64LE(30),
    /**
     * 64-bit floating point samples, big endian
     */
    F64BE(31);
    public static final AudioFormat S16 = S16LE;
    public static final AudioFormat U16 = U16LE;
    public static final AudioFormat S24_32 = S24_32LE;
    public static final AudioFormat U24_32 = U24_32LE;
    public static final AudioFormat S32 = S32LE;
    public static final AudioFormat U32 = U32LE;
    public static final AudioFormat S24 = S24LE;
    public static final AudioFormat U24 = U24LE;
    public static final AudioFormat S20 = S20LE;
    public static final AudioFormat U20 = U20LE;
    public static final AudioFormat S18 = S18LE;
    public static final AudioFormat U18 = U18LE;
    public static final AudioFormat F32 = F32LE;
    public static final AudioFormat F64 = F64LE;
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioFormat";
    
    private final int value;
    AudioFormat(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AudioFormat of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> ENCODED;
            case 2 -> S8;
            case 3 -> U8;
            case 4 -> S16LE;
            case 5 -> S16BE;
            case 6 -> U16LE;
            case 7 -> U16BE;
            case 8 -> S24_32LE;
            case 9 -> S24_32BE;
            case 10 -> U24_32LE;
            case 11 -> U24_32BE;
            case 12 -> S32LE;
            case 13 -> S32BE;
            case 14 -> U32LE;
            case 15 -> U32BE;
            case 16 -> S24LE;
            case 17 -> S24BE;
            case 18 -> U24LE;
            case 19 -> U24BE;
            case 20 -> S20LE;
            case 21 -> S20BE;
            case 22 -> U20LE;
            case 23 -> U20BE;
            case 24 -> S18LE;
            case 25 -> S18BE;
            case 26 -> U18LE;
            case 27 -> U18BE;
            case 28 -> F32LE;
            case 29 -> F32BE;
            case 30 -> F64LE;
            case 31 -> F64BE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Construct a {@link AudioFormat} with given parameters.
     * @param sign signed or unsigned format
     * @param endianness G_LITTLE_ENDIAN or G_BIG_ENDIAN
     * @param width amount of bits used per sample
     * @param depth amount of used bits in {@code width}
     * @return a {@link AudioFormat} or GST_AUDIO_FORMAT_UNKNOWN when no audio format
     * exists with the given parameters.
     */
    public static @NotNull org.gstreamer.audio.AudioFormat buildInteger(boolean sign, int endianness, int width, int depth) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_format_build_integer.invokeExact(
                    sign ? 1 : 0,
                    endianness,
                    width,
                    depth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioFormat.of(RESULT);
    }
    
    /**
     * Fill {@code length} bytes in {@code dest} with silence samples for {@code info}.
     * @param info a {@link AudioFormatInfo}
     * @param dest a destination
     *   to fill
     * @param length the length to fill
     * @deprecated Use gst_audio_format_info_fill_silence() instead.
     */
    @Deprecated
    public static void fillSilence(@NotNull org.gstreamer.audio.AudioFormatInfo info, @NotNull byte[] dest, long length) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        try {
            DowncallHandles.gst_audio_format_fill_silence.invokeExact(
                    info.handle(),
                    Interop.allocateNativeArray(dest, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert the {@code format} string to its {@link AudioFormat}.
     * @param format a format string
     * @return the {@link AudioFormat} for {@code format} or GST_AUDIO_FORMAT_UNKNOWN when the
     * string is not a known format.
     */
    public static @NotNull org.gstreamer.audio.AudioFormat fromString(@NotNull java.lang.String format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_format_from_string.invokeExact(
                    Interop.allocateNativeString(format));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioFormat.of(RESULT);
    }
    
    /**
     * Get the {@link AudioFormatInfo} for {@code format}
     * @param format a {@link AudioFormat}
     * @return The {@link AudioFormatInfo} for {@code format}.
     */
    public static @NotNull org.gstreamer.audio.AudioFormatInfo getInfo(@NotNull org.gstreamer.audio.AudioFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_format_get_info.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.audio.AudioFormatInfo(RESULT, Ownership.NONE);
    }
    
    public static @NotNull java.lang.String toString(@NotNull org.gstreamer.audio.AudioFormat format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_format_to_string.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_format_build_integer = Interop.downcallHandle(
            "gst_audio_format_build_integer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_format_fill_silence = Interop.downcallHandle(
            "gst_audio_format_fill_silence",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_format_from_string = Interop.downcallHandle(
            "gst_audio_format_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_format_get_info = Interop.downcallHandle(
            "gst_audio_format_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_format_to_string = Interop.downcallHandle(
            "gst_audio_format_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
