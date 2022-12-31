package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A parser for detecting and extracting {@code GstVideoAncillary} data from
 * Vertical Blanking Interval lines of component signals.
 * @version 1.16
 */
public class VideoVBIParser extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoVBIParser";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoVBIParser}
     * @return A new, uninitialized @{link VideoVBIParser}
     */
    public static VideoVBIParser allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoVBIParser newInstance = new VideoVBIParser(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoVBIParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoVBIParser(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoVBIParser> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoVBIParser(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.video.VideoFormat format, int pixelWidth) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_vbi_parser_new.invokeExact(
                    format.getValue(),
                    pixelWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link VideoVBIParser} for the specified {@code format} and {@code pixel_width}.
     * @param format a {@link VideoFormat}
     * @param pixelWidth The width in pixel to use
     */
    public VideoVBIParser(org.gstreamer.video.VideoFormat format, int pixelWidth) {
        super(constructNew(format, pixelWidth), Ownership.FULL);
    }
    
    /**
     * Provide a new line of data to the {@code parser}. Call gst_video_vbi_parser_get_ancillary()
     * to get the Ancillary data that might be present on that line.
     * @param data The line of data to parse
     */
    public void addLine(byte[] data) {
        try {
            DowncallHandles.gst_video_vbi_parser_add_line.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public org.gstreamer.video.VideoVBIParser copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_vbi_parser_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoVBIParser.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees the {@code parser}.
     */
    public void free() {
        try {
            DowncallHandles.gst_video_vbi_parser_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parse the line provided previously by gst_video_vbi_parser_add_line().
     * @param anc a {@link VideoAncillary} to start the eventual ancillary data
     * @return {@link VideoVBIParserResult#OK} if ancillary data was found and
     * {@code anc} was filled. {@link VideoVBIParserResult#DONE} if there wasn't any
     * data.
     */
    public org.gstreamer.video.VideoVBIParserResult getAncillary(org.gstreamer.video.VideoAncillary anc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_vbi_parser_get_ancillary.invokeExact(
                    handle(),
                    anc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoVBIParserResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_vbi_parser_new = Interop.downcallHandle(
            "gst_video_vbi_parser_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_vbi_parser_add_line = Interop.downcallHandle(
            "gst_video_vbi_parser_add_line",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_vbi_parser_copy = Interop.downcallHandle(
            "gst_video_vbi_parser_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_vbi_parser_free = Interop.downcallHandle(
            "gst_video_vbi_parser_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_vbi_parser_get_ancillary = Interop.downcallHandle(
            "gst_video_vbi_parser_get_ancillary",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
