package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link StreamType} describes a high level classification set for
 * flows of data in {@link Stream} objects.
 * <p>
 * Note that this is a flag, and therefore users should not assume it
 * will be a single value. Do not use the equality operator for checking
 * whether a stream is of a certain type.
 * @version 1.10
 */
public class StreamType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamType";
    
    /**
     * The stream is of unknown (unclassified) type.
     */
    public static final StreamType UNKNOWN = new StreamType(1);
    
    /**
     * The stream is of audio data
     */
    public static final StreamType AUDIO = new StreamType(2);
    
    /**
     * The stream carries video data
     */
    public static final StreamType VIDEO = new StreamType(4);
    
    /**
     * The stream is a muxed container type
     */
    public static final StreamType CONTAINER = new StreamType(8);
    
    /**
     * The stream contains subtitle / subpicture data.
     */
    public static final StreamType TEXT = new StreamType(16);
    
    public StreamType(int value) {
        super(value);
    }
    
    /**
     * Get a descriptive string for a given {@link StreamType}
     * @param stype a {@link StreamType}
     * @return A string describing the stream type
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.gst.StreamType stype) {
        java.util.Objects.requireNonNull(stype, "Parameter 'stype' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_type_get_name.invokeExact(
                    stype.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public StreamType combined(StreamType mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static StreamType combined(StreamType mask, StreamType... masks) {
        for (StreamType arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_stream_type_get_name = Interop.downcallHandle(
            "gst_stream_type_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
