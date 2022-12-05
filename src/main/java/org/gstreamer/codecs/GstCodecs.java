package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstCodecs namespace.
 */
public final class GstCodecs {
    
    static {
        System.loadLibrary("gstcodecs-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    public static final int H264_DPB_MAX_SIZE = 16;
    
    public static final int H265_DPB_MAX_SIZE = 16;
    
    /**
     * Number of contexts when decoding intra_mode
     */
    public static final int VP9_BLOCK_SIZE_GROUPS = 4;
    
    /**
     * Number of values for mv_classO_bit
     */
    public static final int VP9_CLASS0_SIZE = 2;
    
    /**
     * Number of contexts for comp_mode
     */
    public static final int VP9_COMP_MODE_CONTEXTS = 5;
    
    /**
     * Number of contexts for interp_filter
     */
    public static final int VP9_INTERP_FILTER_CONTEXTS = 4;
    
    /**
     * Number of values for inter_mode
     */
    public static final int VP9_INTER_MODES = 4;
    
    /**
     * Number of contexts for inter_mode
     */
    public static final int VP9_INTER_MODE_CONTEXTS = 7;
    
    /**
     * Number of values for intra_mode
     */
    public static final int VP9_INTRA_MODES = 10;
    
    /**
     * Number of contexts for interp_filter
     */
    public static final int VP9_IS_INTER_CONTEXTS = 4;
    
    /**
     * Number of values for mv_class
     */
    public static final int VP9_MV_CLASSES = 11;
    
    /**
     * Number of values that can be decoded for mv_fr
     */
    public static final int VP9_MV_FR_SIZE = 4;
    
    /**
     * Number of values for partition
     */
    public static final int VP9_MV_JOINTS = 4;
    
    /**
     * Maximum number of bits for decoding motion vectors
     */
    public static final int VP9_MV_OFFSET_BITS = 10;
    
    /**
     * Number of contexts when decoding partition
     */
    public static final int VP9_PARTITION_CONTEXTS = 16;
    
    /**
     * Number of values for partition
     */
    public static final int VP9_PARTITION_TYPES = 4;
    
    /**
     * Number of contexts for single_ref and comp_ref
     */
    public static final int VP9_REF_CONTEXTS = 5;
    
    /**
     * Index for loop filter segment feature
     */
    public static final int VP9_SEG_LVL_ALT_L = 1;
    
    /**
     * Index for quantizer segment feature
     */
    public static final int VP9_SEG_LVL_ALT_Q = 0;
    
    /**
     * Number of segment features
     */
    public static final int VP9_SEG_LVL_MAX = 4;
    
    /**
     * Index for reference frame segment feature
     */
    public static final int VP9_SEG_LVL_REF_FRAME = 2;
    
    /**
     * Index for skip segment feature
     */
    public static final int VP9_SEG_SEG_LVL_SKIP = 3;
    
    /**
     * Number of contexts for decoding skip
     */
    public static final int VP9_SKIP_CONTEXTS = 3;
    
    /**
     * Number of contexts for interp_filter
     */
    public static final int VP9_SWITCHABLE_FILTERS = 3;
    
    /**
     * Number of values for tx_mode
     */
    public static final int VP9_TX_MODES = 5;
    
    /**
     * Number of values for tx_size
     */
    public static final int VP9_TX_SIZES = 4;
    
    /**
     * Number of contexts for transform size
     */
    public static final int VP9_TX_SIZE_CONTEXTS = 2;
    
    /**
     * Create new {@link AV1Dpb}
     * @return a new {@link AV1Dpb}
     */
    public static @NotNull org.gstreamer.codecs.AV1Dpb av1DpbNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_av1_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.codecs.AV1Dpb(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Create new {@link H264Dpb}
     * @return a new {@link H264Dpb}
     */
    public static @NotNull org.gstreamer.codecs.H264Dpb h264DpbNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.codecs.H264Dpb(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Create new {@link H265Dpb}
     * @return a new {@link H265Dpb}
     */
    public static @NotNull org.gstreamer.codecs.H265Dpb h265DpbNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.codecs.H265Dpb(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Create new {@link Mpeg2Dpb}
     * @return a new {@link Mpeg2Dpb}
     */
    public static @NotNull org.gstreamer.codecs.Mpeg2Dpb mpeg2DpbNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpeg2_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.codecs.Mpeg2Dpb(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Create new {@link Vp9Dpb}
     * @return a new {@link Vp9Dpb}
     */
    public static @NotNull org.gstreamer.codecs.Vp9Dpb vp9DpbNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp9_dpb_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.codecs.Vp9Dpb(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * An implementation of "ac_q" function specified in
     * "8.6.1 Dequantization functions"
     * @param qindex the quantizer index
     * @param deltaQAc a delta_q_ac value
     * @param bitDepth coded bit depth
     * @return the quantizer value for the ac coefficient
     */
    public static short vp9GetAcQuant(byte qindex, byte deltaQAc, byte bitDepth) {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_vp9_get_ac_quant.invokeExact(
                    qindex,
                    deltaQAc,
                    bitDepth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * An implementation of "dc_q" function specified in
     * "8.6.1 Dequantization functions"
     * @param qindex the quantizer index
     * @param deltaQDc a delta_q_dc value
     * @param bitDepth coded bit depth
     * @return the quantizer value for the dc coefficient
     */
    public static short vp9GetDcQuant(byte qindex, byte deltaQDc, byte bitDepth) {
        short RESULT;
        try {
            RESULT = (short) DowncallHandles.gst_vp9_get_dc_quant.invokeExact(
                    qindex,
                    deltaQDc,
                    bitDepth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * An implementation of "get_qindex" function specfied in
     * "8.6.1 Dequantization functions"
     * @param segmentationParams a {@link Vp9SegmentationParams}
     * @param quantizationParams a {@link Vp9QuantizationParams}
     * @param segmentId a segment id
     * @return the quantizer index
     */
    public static byte vp9GetQindex(@NotNull org.gstreamer.codecs.Vp9SegmentationParams segmentationParams, @NotNull org.gstreamer.codecs.Vp9QuantizationParams quantizationParams, byte segmentId) {
        java.util.Objects.requireNonNull(segmentationParams, "Parameter 'segmentationParams' must not be null");
        java.util.Objects.requireNonNull(quantizationParams, "Parameter 'quantizationParams' must not be null");
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_vp9_get_qindex.invokeExact(
                    segmentationParams.handle(),
                    quantizationParams.handle(),
                    segmentId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * An implementation of "seg_feature_active" function specified in
     * "6.4.9 Segmentation feature active syntax"
     * @param params a {@link Vp9SegmentationParams}
     * @param segmentId a segment id
     * @param feature a segmentation feature
     * @return {@code true} if feature is active
     */
    public static boolean vp9SegFeatureActive(@NotNull org.gstreamer.codecs.Vp9SegmentationParams params, byte segmentId, byte feature) {
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vp9_seg_feature_active.invokeExact(
                    params.handle(),
                    segmentId,
                    feature);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_av1_dpb_new = Interop.downcallHandle(
            "gst_av1_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_h264_dpb_new = Interop.downcallHandle(
            "gst_h264_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_h265_dpb_new = Interop.downcallHandle(
            "gst_h265_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_dpb_new = Interop.downcallHandle(
            "gst_mpeg2_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vp9_dpb_new = Interop.downcallHandle(
            "gst_vp9_dpb_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vp9_get_ac_quant = Interop.downcallHandle(
            "gst_vp9_get_ac_quant",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_vp9_get_dc_quant = Interop.downcallHandle(
            "gst_vp9_get_dc_quant",
            FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_vp9_get_qindex = Interop.downcallHandle(
            "gst_vp9_get_qindex",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_vp9_seg_feature_active = Interop.downcallHandle(
            "gst_vp9_seg_feature_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
    }
}
