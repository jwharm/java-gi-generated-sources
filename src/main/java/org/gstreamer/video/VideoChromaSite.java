package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Various Chroma sitings.
 */
public class VideoChromaSite extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoChromaSite";
    
    /**
     * unknown cositing
     */
    public static final VideoChromaSite UNKNOWN = new VideoChromaSite(0);
    
    /**
     * no cositing
     */
    public static final VideoChromaSite NONE = new VideoChromaSite(1);
    
    /**
     * chroma is horizontally cosited
     */
    public static final VideoChromaSite H_COSITED = new VideoChromaSite(2);
    
    /**
     * chroma is vertically cosited
     */
    public static final VideoChromaSite V_COSITED = new VideoChromaSite(4);
    
    /**
     * choma samples are sited on alternate lines
     */
    public static final VideoChromaSite ALT_LINE = new VideoChromaSite(8);
    
    /**
     * chroma samples cosited with luma samples
     */
    public static final VideoChromaSite COSITED = new VideoChromaSite(6);
    
    /**
     * jpeg style cositing, also for mpeg1 and mjpeg
     */
    public static final VideoChromaSite JPEG = new VideoChromaSite(1);
    
    /**
     * mpeg2 style cositing
     */
    public static final VideoChromaSite MPEG2 = new VideoChromaSite(2);
    
    /**
     * DV style cositing
     */
    public static final VideoChromaSite DV = new VideoChromaSite(14);
    
    public VideoChromaSite(int value) {
        super(value);
    }
    
    /**
     * Convert {@code s} to a {@link VideoChromaSite}
     * @param s a chromasite string
     * @return a {@link VideoChromaSite} or {@link VideoChromaSite#UNKNOWN} when {@code s} does
     * not contain a valid chroma-site description.
     */
    public static @NotNull org.gstreamer.video.VideoChromaSite fromString(@NotNull java.lang.String s) {
        java.util.Objects.requireNonNull(s, "Parameter 's' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_chroma_site_from_string.invokeExact(
                    Interop.allocateNativeString(s));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoChromaSite(RESULT);
    }
    
    /**
     * Converts {@code site} to its string representation.
     * @param site a {@link VideoChromaSite}
     * @return a string representation of {@code site}
     *          or {@code null} if {@code site} contains undefined value or
     *          is equal to {@link VideoChromaSite#UNKNOWN}
     */
    public static @Nullable java.lang.String toString(@NotNull org.gstreamer.video.VideoChromaSite site) {
        java.util.Objects.requireNonNull(site, "Parameter 'site' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_chroma_site_to_string.invokeExact(
                    site.getValue());
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
    public VideoChromaSite or(VideoChromaSite mask) {
        return new VideoChromaSite(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoChromaSite combined(VideoChromaSite mask, VideoChromaSite... masks) {
        int value = mask.getValue();        for (VideoChromaSite arg : masks) {
            value |= arg.getValue();
        }
        return new VideoChromaSite(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_chroma_site_from_string = Interop.downcallHandle(
            "gst_video_chroma_site_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_chroma_site_to_string = Interop.downcallHandle(
            "gst_video_chroma_site_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
