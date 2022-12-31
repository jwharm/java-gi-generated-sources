package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The various known types of Closed Caption (CC).
 * @version 1.16
 */
public enum VideoCaptionType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Unknown type of CC
     */
    UNKNOWN(0),
    /**
     * CEA-608 as byte pairs. Note that
     *      this format is not recommended since is does not specify to
     *      which field the caption comes from and therefore assumes
     *      it comes from the first field (and that there is no information
     *      on the second field). Use {@code GST_VIDEO_CAPTION_TYPE_CEA708_RAW}
     *      if you wish to store CEA-608 from two fields and prefix each byte pair
     *      with 0xFC for the first field and 0xFD for the second field.
     */
    CEA608_RAW(1),
    /**
     * CEA-608 as byte triplets as defined
     *      in SMPTE S334-1 Annex A. The second and third byte of the byte triplet
     *      is the raw CEA608 data, the first byte is a bitfield: The top/7th bit is
     *      0 for the second field, 1 for the first field, bit 6 and 5 are 0 and
     *      bits 4 to 0 are a 5 bit unsigned integer that represents the line
     *      offset relative to the base-line of the original image format (line 9
     *      for 525-line field 1, line 272 for 525-line field 2, line 5 for
     *      625-line field 1 and line 318 for 625-line field 2).
     */
    CEA608_S334_1A(2),
    /**
     * CEA-708 as cc_data byte triplets. They
     *      can also contain 608-in-708 and the first byte of each triplet has to
     *      be inspected for detecting the type.
     */
    CEA708_RAW(3),
    /**
     * CEA-708 (and optionally CEA-608) in
     *      a CDP (Caption Distribution Packet) defined by SMPTE S-334-2.
     *      Contains the whole CDP (starting with 0x9669).
     */
    CEA708_CDP(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoCaptionType";
    
    private final int value;
    VideoCaptionType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoCaptionType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> CEA608_RAW;
            case 2 -> CEA608_S334_1A;
            case 3 -> CEA708_RAW;
            case 4 -> CEA708_CDP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Parses fixed Closed Caption {@link org.gstreamer.gst.Caps} and returns the corresponding caption
     * type, or {@link VideoCaptionType#UNKNOWN}.
     * @param caps Fixed {@link org.gstreamer.gst.Caps} to parse
     * @return {@link VideoCaptionType}.
     */
    public static org.gstreamer.video.VideoCaptionType fromCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_caption_type_from_caps.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoCaptionType.of(RESULT);
    }
    
    /**
     * Creates new caps corresponding to {@code type}.
     * @param type {@link VideoCaptionType}
     * @return new {@link org.gstreamer.gst.Caps}
     */
    public static org.gstreamer.gst.Caps toCaps(org.gstreamer.video.VideoCaptionType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_caption_type_to_caps.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_caption_type_from_caps = Interop.downcallHandle(
            "gst_video_caption_type_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_caption_type_to_caps = Interop.downcallHandle(
            "gst_video_caption_type_to_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
