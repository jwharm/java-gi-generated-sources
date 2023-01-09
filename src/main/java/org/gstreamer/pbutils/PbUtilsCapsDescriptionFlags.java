package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that are returned by gst_pb_utils_get_caps_description_flags() and
 * describe the format of the caps.
 * @version 1.20
 */
public class PbUtilsCapsDescriptionFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPbUtilsCapsDescriptionFlags";
    
    /**
     * Caps describe a container format.
     */
    public static final PbUtilsCapsDescriptionFlags CONTAINER = new PbUtilsCapsDescriptionFlags(1);
    
    /**
     * Caps describe an audio format, or a
     *     container format that can store audio.
     */
    public static final PbUtilsCapsDescriptionFlags AUDIO = new PbUtilsCapsDescriptionFlags(2);
    
    /**
     * Caps describe an video format, or a
     *     container format that can store video.
     */
    public static final PbUtilsCapsDescriptionFlags VIDEO = new PbUtilsCapsDescriptionFlags(4);
    
    /**
     * Caps describe an image format, or a
     *     container format that can store image.
     */
    public static final PbUtilsCapsDescriptionFlags IMAGE = new PbUtilsCapsDescriptionFlags(8);
    
    /**
     * Caps describe an subtitle format, or a
     *     container format that can store subtitles.
     */
    public static final PbUtilsCapsDescriptionFlags SUBTITLE = new PbUtilsCapsDescriptionFlags(16);
    
    /**
     * Container format is a tags container.
     */
    public static final PbUtilsCapsDescriptionFlags TAG = new PbUtilsCapsDescriptionFlags(32);
    
    /**
     * Container format can store any kind of
     *     stream type.
     */
    public static final PbUtilsCapsDescriptionFlags GENERIC = new PbUtilsCapsDescriptionFlags(64);
    
    /**
     * Create a new PbUtilsCapsDescriptionFlags with the provided value
     */
    public PbUtilsCapsDescriptionFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PbUtilsCapsDescriptionFlags or(PbUtilsCapsDescriptionFlags... masks) {
        int value = this.getValue();
        for (PbUtilsCapsDescriptionFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PbUtilsCapsDescriptionFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PbUtilsCapsDescriptionFlags combined(PbUtilsCapsDescriptionFlags mask, PbUtilsCapsDescriptionFlags... masks) {
        int value = mask.getValue();
        for (PbUtilsCapsDescriptionFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PbUtilsCapsDescriptionFlags(value);
    }
}
