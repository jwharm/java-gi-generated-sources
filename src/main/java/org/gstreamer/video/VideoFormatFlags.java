package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different video flags that a format info can have.
 */
public class VideoFormatFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFormatFlags";
    
    /**
     * The video format is YUV, components are numbered
     *   0=Y, 1=U, 2=V.
     */
    public static final VideoFormatFlags YUV = new VideoFormatFlags(1);
    
    /**
     * The video format is RGB, components are numbered
     *   0=R, 1=G, 2=B.
     */
    public static final VideoFormatFlags RGB = new VideoFormatFlags(2);
    
    /**
     * The video is gray, there is one gray component
     *   with index 0.
     */
    public static final VideoFormatFlags GRAY = new VideoFormatFlags(4);
    
    /**
     * The video format has an alpha components with
     *   the number 3.
     */
    public static final VideoFormatFlags ALPHA = new VideoFormatFlags(8);
    
    /**
     * The video format has data stored in little
     *   endianness.
     */
    public static final VideoFormatFlags LE = new VideoFormatFlags(16);
    
    /**
     * The video format has a palette. The palette
     *   is stored in the second plane and indexes are stored in the first plane.
     */
    public static final VideoFormatFlags PALETTE = new VideoFormatFlags(32);
    
    /**
     * The video format has a complex layout that
     *   can't be described with the usual information in the {@link VideoFormatInfo}.
     */
    public static final VideoFormatFlags COMPLEX = new VideoFormatFlags(64);
    
    /**
     * This format can be used in a
     *   {@link VideoFormatUnpack} and {@link VideoFormatPack} function.
     */
    public static final VideoFormatFlags UNPACK = new VideoFormatFlags(128);
    
    /**
     * The format is tiled, there is tiling information
     *   in the last plane.
     */
    public static final VideoFormatFlags TILED = new VideoFormatFlags(256);
    
    public VideoFormatFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VideoFormatFlags or(VideoFormatFlags mask) {
        return new VideoFormatFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VideoFormatFlags combined(VideoFormatFlags mask, VideoFormatFlags... masks) {
        int value = mask.getValue();        for (VideoFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VideoFormatFlags(value);
    }
}
