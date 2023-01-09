package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Additional video buffer flags. These flags can potentially be used on any
 * buffers carrying closed caption data, or video data - even encoded data.
 * <p>
 * Note that these are only valid for {@link org.gstreamer.gst.Caps} of type: video/... and caption/...
 * They can conflict with other extended buffer flags.
 */
public class VideoBufferFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoBufferFlags";
    
    /**
     * If the {@link org.gstreamer.gst.Buffer} is interlaced. In mixed
     *                                     interlace-mode, this flags specifies if the frame is
     *                                     interlaced or progressive.
     */
    public static final VideoBufferFlags INTERLACED = new VideoBufferFlags(1048576);
    
    /**
     * If the {@link org.gstreamer.gst.Buffer} is interlaced, then the first field
     *                                     in the video frame is the top field.  If unset, the
     *                                     bottom field is first.
     */
    public static final VideoBufferFlags TFF = new VideoBufferFlags(2097152);
    
    /**
     * If the {@link org.gstreamer.gst.Buffer} is interlaced, then the first field
     *                                     (as defined by the {@link VideoBufferFlags#TFF} flag setting)
     *                                     is repeated.
     */
    public static final VideoBufferFlags RFF = new VideoBufferFlags(4194304);
    
    /**
     * If the {@link org.gstreamer.gst.Buffer} is interlaced, then only the
     *                                     first field (as defined by the {@link VideoBufferFlags#TFF}
     *                                     flag setting) is to be displayed (Since: 1.16).
     */
    public static final VideoBufferFlags ONEFIELD = new VideoBufferFlags(8388608);
    
    /**
     * The {@link org.gstreamer.gst.Buffer} contains one or more specific views,
     *                                     such as left or right eye view. This flags is set on
     *                                     any buffer that contains non-mono content - even for
     *                                     streams that contain only a single viewpoint. In mixed
     *                                     mono / non-mono streams, the absence of the flag marks
     *                                     mono buffers.
     */
    public static final VideoBufferFlags MULTIPLE_VIEW = new VideoBufferFlags(16777216);
    
    /**
     * When conveying stereo/multiview content with
     *                                     frame-by-frame methods, this flag marks the first buffer
     *                                      in a bundle of frames that belong together.
     */
    public static final VideoBufferFlags FIRST_IN_BUNDLE = new VideoBufferFlags(33554432);
    
    /**
     * The video frame has the top field only. This is the
     *                                     same as GST_VIDEO_BUFFER_FLAG_TFF |
     *                                     GST_VIDEO_BUFFER_FLAG_ONEFIELD (Since: 1.16).
     *                                     Use GST_VIDEO_BUFFER_IS_TOP_FIELD() to check for this flag.
     */
    public static final VideoBufferFlags TOP_FIELD = new VideoBufferFlags(10485760);
    
    /**
     * The video frame has the bottom field only. This is
     *                                     the same as GST_VIDEO_BUFFER_FLAG_ONEFIELD
     *                                     (GST_VIDEO_BUFFER_FLAG_TFF flag unset) (Since: 1.16).
     *                                     Use GST_VIDEO_BUFFER_IS_BOTTOM_FIELD() to check for this flag.
     */
    public static final VideoBufferFlags BOTTOM_FIELD = new VideoBufferFlags(8388608);
    
    /**
     * The {@link org.gstreamer.gst.Buffer} contains the end of a video field or frame
     *                                     boundary such as the last subframe or packet (Since: 1.18).
     */
    public static final VideoBufferFlags MARKER = new VideoBufferFlags(512);
    
    /**
     * Offset to define more flags
     */
    public static final VideoBufferFlags LAST = new VideoBufferFlags(268435456);
    
    /**
     * Create a new VideoBufferFlags with the provided value
     */
    public VideoBufferFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoBufferFlags or(VideoBufferFlags... masks) {
        int value = this.getValue();
        for (VideoBufferFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoBufferFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoBufferFlags combined(VideoBufferFlags mask, VideoBufferFlags... masks) {
        int value = mask.getValue();
        for (VideoBufferFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoBufferFlags(value);
    }
}
