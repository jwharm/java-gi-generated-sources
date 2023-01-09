package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An encoder for writing ancillary data to the
 * Vertical Blanking Interval lines of component signals.
 * @version 1.16
 */
public class VideoVBIEncoder extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoVBIEncoder";
    
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
     * Allocate a new {@link VideoVBIEncoder}
     * @return A new, uninitialized @{link VideoVBIEncoder}
     */
    public static VideoVBIEncoder allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoVBIEncoder newInstance = new VideoVBIEncoder(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoVBIEncoder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoVBIEncoder(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoVBIEncoder> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoVBIEncoder(input);
    
    private static MemoryAddress constructNew(org.gstreamer.video.VideoFormat format, int pixelWidth) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_vbi_encoder_new.invokeExact(
                    format.getValue(),
                    pixelWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link VideoVBIEncoder} for the specified {@code format} and {@code pixel_width}.
     * @param format a {@link VideoFormat}
     * @param pixelWidth The width in pixel to use
     */
    public VideoVBIEncoder(org.gstreamer.video.VideoFormat format, int pixelWidth) {
        super(constructNew(format, pixelWidth));
        this.takeOwnership();
    }
    
    /**
     * Stores Video Ancillary data, according to SMPTE-291M specification.
     * <p>
     * Note that the contents of the data are always read as 8bit data (i.e. do not contain
     * the parity check bits).
     * @param composite {@code true} if composite ADF should be created, component otherwise
     * @param DID The Data Identifier
     * @param SDIDBlockNumber The Secondary Data Identifier (if type 2) or the Data
     *                     Block Number (if type 1)
     * @param data The user data content of the Ancillary packet.
     *    Does not contain the ADF, DID, SDID nor CS.
     * @param dataCount The amount of data (in bytes) in {@code data} (max 255 bytes)
     * @return {@code true} if enough space was left in the current line, {@code false}
     *          otherwise.
     */
    public boolean addAncillary(boolean composite, byte DID, byte SDIDBlockNumber, byte[] data, int dataCount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_vbi_encoder_add_ancillary.invokeExact(
                        handle(),
                        Marshal.booleanToInteger.marshal(composite, null).intValue(),
                        DID,
                        SDIDBlockNumber,
                        Interop.allocateNativeArray(data, false, SCOPE),
                        dataCount);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public org.gstreamer.video.VideoVBIEncoder copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_vbi_encoder_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.video.VideoVBIEncoder.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees the {@code encoder}.
     */
    public void free() {
        try {
            DowncallHandles.gst_video_vbi_encoder_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void writeLine(PointerByte data) {
        try {
            DowncallHandles.gst_video_vbi_encoder_write_line.invokeExact(
                    handle(),
                    data.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_vbi_encoder_new = Interop.downcallHandle(
                "gst_video_vbi_encoder_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_vbi_encoder_add_ancillary = Interop.downcallHandle(
                "gst_video_vbi_encoder_add_ancillary",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_vbi_encoder_copy = Interop.downcallHandle(
                "gst_video_vbi_encoder_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_vbi_encoder_free = Interop.downcallHandle(
                "gst_video_vbi_encoder_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_vbi_encoder_write_line = Interop.downcallHandle(
                "gst_video_vbi_encoder_write_line",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
