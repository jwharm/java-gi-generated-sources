package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Stream errors are for anything related to the stream being processed:
 * format errors, media type errors, ...
 * They're typically used by decoders, demuxers, converters, ...
 */
public enum StreamError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * a general error which doesn't fit in any other
     * category.  Make sure you add a custom message to the error call.
     */
    FAILED(1),
    
    /**
     * do not use this except as a placeholder for
     * deciding where to go while developing code.
     */
    TOO_LAZY(2),
    
    /**
     * use this when you do not want to implement
     * this functionality yet.
     */
    NOT_IMPLEMENTED(3),
    
    /**
     * used when the element doesn't know the
     * stream's type.
     */
    TYPE_NOT_FOUND(4),
    
    /**
     * used when the element doesn't handle this type
     * of stream.
     */
    WRONG_TYPE(5),
    
    /**
     * used when there's no codec to handle the
     * stream's type.
     */
    CODEC_NOT_FOUND(6),
    
    /**
     * used when decoding fails.
     */
    DECODE(7),
    
    /**
     * used when encoding fails.
     */
    ENCODE(8),
    
    /**
     * used when demuxing fails.
     */
    DEMUX(9),
    
    /**
     * used when muxing fails.
     */
    MUX(10),
    
    /**
     * used when the stream is of the wrong format
     * (for example, wrong caps).
     */
    FORMAT(11),
    
    /**
     * used when the stream is encrypted and can't be
     * decrypted because this is not supported by the element.
     */
    DECRYPT(12),
    
    /**
     * used when the stream is encrypted and
     * can't be decrypted because no suitable key is available.
     */
    DECRYPT_NOKEY(13),
    
    /**
     * the number of stream error types.
     */
    NUM_ERRORS(14);
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamError";
    
    private final int value;
    
    /**
     * Create a new StreamError for the provided value
     * @param numeric value the enum value
     */
    StreamError(int value) {
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
     * Create a new StreamError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static StreamError of(int value) {
        return switch (value) {
            case 1 -> FAILED;
            case 2 -> TOO_LAZY;
            case 3 -> NOT_IMPLEMENTED;
            case 4 -> TYPE_NOT_FOUND;
            case 5 -> WRONG_TYPE;
            case 6 -> CODEC_NOT_FOUND;
            case 7 -> DECODE;
            case 8 -> ENCODE;
            case 9 -> DEMUX;
            case 10 -> MUX;
            case 11 -> FORMAT;
            case 12 -> DECRYPT;
            case 13 -> DECRYPT_NOKEY;
            case 14 -> NUM_ERRORS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_stream_error_quark = Interop.downcallHandle(
                "gst_stream_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
