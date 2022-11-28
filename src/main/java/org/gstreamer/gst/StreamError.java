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
public class StreamError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamError";
    
    /**
     * a general error which doesn't fit in any other
     * category.  Make sure you add a custom message to the error call.
     */
    public static final StreamError FAILED = new StreamError(1);
    
    /**
     * do not use this except as a placeholder for
     * deciding where to go while developing code.
     */
    public static final StreamError TOO_LAZY = new StreamError(2);
    
    /**
     * use this when you do not want to implement
     * this functionality yet.
     */
    public static final StreamError NOT_IMPLEMENTED = new StreamError(3);
    
    /**
     * used when the element doesn't know the
     * stream's type.
     */
    public static final StreamError TYPE_NOT_FOUND = new StreamError(4);
    
    /**
     * used when the element doesn't handle this type
     * of stream.
     */
    public static final StreamError WRONG_TYPE = new StreamError(5);
    
    /**
     * used when there's no codec to handle the
     * stream's type.
     */
    public static final StreamError CODEC_NOT_FOUND = new StreamError(6);
    
    /**
     * used when decoding fails.
     */
    public static final StreamError DECODE = new StreamError(7);
    
    /**
     * used when encoding fails.
     */
    public static final StreamError ENCODE = new StreamError(8);
    
    /**
     * used when demuxing fails.
     */
    public static final StreamError DEMUX = new StreamError(9);
    
    /**
     * used when muxing fails.
     */
    public static final StreamError MUX = new StreamError(10);
    
    /**
     * used when the stream is of the wrong format
     * (for example, wrong caps).
     */
    public static final StreamError FORMAT = new StreamError(11);
    
    /**
     * used when the stream is encrypted and can't be
     * decrypted because this is not supported by the element.
     */
    public static final StreamError DECRYPT = new StreamError(12);
    
    /**
     * used when the stream is encrypted and
     * can't be decrypted because no suitable key is available.
     */
    public static final StreamError DECRYPT_NOKEY = new StreamError(13);
    
    /**
     * the number of stream error types.
     */
    public static final StreamError NUM_ERRORS = new StreamError(14);
    
    public StreamError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
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
