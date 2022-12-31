package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Vp9FrameHeader extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9FrameHeader";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("profile"),
            Interop.valueLayout.C_BYTE.withName("bit_depth"),
            Interop.valueLayout.C_BYTE.withName("subsampling_x"),
            Interop.valueLayout.C_BYTE.withName("subsampling_y"),
            Interop.valueLayout.C_BYTE.withName("color_space"),
            Interop.valueLayout.C_BYTE.withName("color_range"),
            Interop.valueLayout.C_BYTE.withName("show_existing_frame"),
            Interop.valueLayout.C_BYTE.withName("frame_to_show_map_idx"),
            Interop.valueLayout.C_BYTE.withName("frame_type"),
            Interop.valueLayout.C_BYTE.withName("show_frame"),
            Interop.valueLayout.C_BYTE.withName("error_resilient_mode"),
            MemoryLayout.paddingLayout(8),
            Interop.valueLayout.C_INT.withName("width"),
            Interop.valueLayout.C_INT.withName("height"),
            Interop.valueLayout.C_BYTE.withName("render_and_frame_size_different"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("render_width"),
            Interop.valueLayout.C_INT.withName("render_height"),
            Interop.valueLayout.C_BYTE.withName("intra_only"),
            Interop.valueLayout.C_BYTE.withName("reset_frame_context"),
            Interop.valueLayout.C_BYTE.withName("refresh_frame_flags"),
            MemoryLayout.paddingLayout(8),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.C_BYTE).withName("ref_frame_idx"),
            MemoryLayout.paddingLayout(8),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("ref_frame_sign_bias"),
            Interop.valueLayout.C_BYTE.withName("allow_high_precision_mv"),
            Interop.valueLayout.C_BYTE.withName("interpolation_filter"),
            Interop.valueLayout.C_BYTE.withName("refresh_frame_context"),
            Interop.valueLayout.C_BYTE.withName("frame_parallel_decoding_mode"),
            Interop.valueLayout.C_BYTE.withName("frame_context_idx"),
            MemoryLayout.paddingLayout(56),
            org.gstreamer.codecs.Vp9LoopFilterParams.getMemoryLayout().withName("loop_filter_params"),
            org.gstreamer.codecs.Vp9QuantizationParams.getMemoryLayout().withName("quantization_params"),
            org.gstreamer.codecs.Vp9SegmentationParams.getMemoryLayout().withName("segmentation_params"),
            Interop.valueLayout.C_BYTE.withName("tile_cols_log2"),
            Interop.valueLayout.C_BYTE.withName("tile_rows_log2"),
            Interop.valueLayout.C_SHORT.withName("header_size_in_bytes"),
            Interop.valueLayout.C_INT.withName("tx_mode"),
            Interop.valueLayout.C_INT.withName("reference_mode"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.codecs.Vp9DeltaProbabilities.getMemoryLayout().withName("delta_probabilities"),
            Interop.valueLayout.C_BYTE.withName("lossless_flag"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("frame_header_length_in_bytes")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9FrameHeader}
     * @return A new, uninitialized @{link Vp9FrameHeader}
     */
    public static Vp9FrameHeader allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9FrameHeader newInstance = new Vp9FrameHeader(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code profile}
     * @return The value of the field {@code profile}
     */
    public byte getProfile() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code profile}
     * @param profile The new value of the field {@code profile}
     */
    public void setProfile(byte profile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), profile);
    }
    
    /**
     * Get the value of the field {@code bit_depth}
     * @return The value of the field {@code bit_depth}
     */
    public byte getBitDepth() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit_depth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bit_depth}
     * @param bitDepth The new value of the field {@code bit_depth}
     */
    public void setBitDepth(byte bitDepth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit_depth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitDepth);
    }
    
    /**
     * Get the value of the field {@code subsampling_x}
     * @return The value of the field {@code subsampling_x}
     */
    public byte getSubsamplingX() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code subsampling_x}
     * @param subsamplingX The new value of the field {@code subsampling_x}
     */
    public void setSubsamplingX(byte subsamplingX) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingX);
    }
    
    /**
     * Get the value of the field {@code subsampling_y}
     * @return The value of the field {@code subsampling_y}
     */
    public byte getSubsamplingY() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code subsampling_y}
     * @param subsamplingY The new value of the field {@code subsampling_y}
     */
    public void setSubsamplingY(byte subsamplingY) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingY);
    }
    
    /**
     * Get the value of the field {@code color_space}
     * @return The value of the field {@code color_space}
     */
    public byte getColorSpace() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_space"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code color_space}
     * @param colorSpace The new value of the field {@code color_space}
     */
    public void setColorSpace(byte colorSpace) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_space"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorSpace);
    }
    
    /**
     * Get the value of the field {@code color_range}
     * @return The value of the field {@code color_range}
     */
    public byte getColorRange() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_range"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code color_range}
     * @param colorRange The new value of the field {@code color_range}
     */
    public void setColorRange(byte colorRange) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_range"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorRange);
    }
    
    /**
     * Get the value of the field {@code show_existing_frame}
     * @return The value of the field {@code show_existing_frame}
     */
    public byte getShowExistingFrame() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_existing_frame"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code show_existing_frame}
     * @param showExistingFrame The new value of the field {@code show_existing_frame}
     */
    public void setShowExistingFrame(byte showExistingFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_existing_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), showExistingFrame);
    }
    
    /**
     * Get the value of the field {@code frame_to_show_map_idx}
     * @return The value of the field {@code frame_to_show_map_idx}
     */
    public byte getFrameToShowMapIdx() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_to_show_map_idx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_to_show_map_idx}
     * @param frameToShowMapIdx The new value of the field {@code frame_to_show_map_idx}
     */
    public void setFrameToShowMapIdx(byte frameToShowMapIdx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_to_show_map_idx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameToShowMapIdx);
    }
    
    /**
     * Get the value of the field {@code frame_type}
     * @return The value of the field {@code frame_type}
     */
    public byte getFrameType() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_type}
     * @param frameType The new value of the field {@code frame_type}
     */
    public void setFrameType(byte frameType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameType);
    }
    
    /**
     * Get the value of the field {@code show_frame}
     * @return The value of the field {@code show_frame}
     */
    public byte getShowFrame() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_frame"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code show_frame}
     * @param showFrame The new value of the field {@code show_frame}
     */
    public void setShowFrame(byte showFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), showFrame);
    }
    
    /**
     * Get the value of the field {@code error_resilient_mode}
     * @return The value of the field {@code error_resilient_mode}
     */
    public byte getErrorResilientMode() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_resilient_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code error_resilient_mode}
     * @param errorResilientMode The new value of the field {@code error_resilient_mode}
     */
    public void setErrorResilientMode(byte errorResilientMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_resilient_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), errorResilientMode);
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public int getWidth() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void setWidth(int width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public int getHeight() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void setHeight(int height) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
    }
    
    /**
     * Get the value of the field {@code render_and_frame_size_different}
     * @return The value of the field {@code render_and_frame_size_different}
     */
    public byte getRenderAndFrameSizeDifferent() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_and_frame_size_different"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code render_and_frame_size_different}
     * @param renderAndFrameSizeDifferent The new value of the field {@code render_and_frame_size_different}
     */
    public void setRenderAndFrameSizeDifferent(byte renderAndFrameSizeDifferent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_and_frame_size_different"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderAndFrameSizeDifferent);
    }
    
    /**
     * Get the value of the field {@code render_width}
     * @return The value of the field {@code render_width}
     */
    public int getRenderWidth() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code render_width}
     * @param renderWidth The new value of the field {@code render_width}
     */
    public void setRenderWidth(int renderWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderWidth);
    }
    
    /**
     * Get the value of the field {@code render_height}
     * @return The value of the field {@code render_height}
     */
    public int getRenderHeight() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code render_height}
     * @param renderHeight The new value of the field {@code render_height}
     */
    public void setRenderHeight(int renderHeight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderHeight);
    }
    
    /**
     * Get the value of the field {@code intra_only}
     * @return The value of the field {@code intra_only}
     */
    public byte getIntraOnly() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("intra_only"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code intra_only}
     * @param intraOnly The new value of the field {@code intra_only}
     */
    public void setIntraOnly(byte intraOnly) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("intra_only"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), intraOnly);
    }
    
    /**
     * Get the value of the field {@code reset_frame_context}
     * @return The value of the field {@code reset_frame_context}
     */
    public byte getResetFrameContext() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset_frame_context"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code reset_frame_context}
     * @param resetFrameContext The new value of the field {@code reset_frame_context}
     */
    public void setResetFrameContext(byte resetFrameContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset_frame_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), resetFrameContext);
    }
    
    /**
     * Get the value of the field {@code refresh_frame_flags}
     * @return The value of the field {@code refresh_frame_flags}
     */
    public byte getRefreshFrameFlags() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code refresh_frame_flags}
     * @param refreshFrameFlags The new value of the field {@code refresh_frame_flags}
     */
    public void setRefreshFrameFlags(byte refreshFrameFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refreshFrameFlags);
    }
    
    /**
     * Get the value of the field {@code ref_frame_idx}
     * @return The value of the field {@code ref_frame_idx}
     */
    public byte[] getRefFrameIdx() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_frame_idx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 3, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code ref_frame_idx}
     * @param refFrameIdx The new value of the field {@code ref_frame_idx}
     */
    public void setRefFrameIdx(byte[] refFrameIdx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_frame_idx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refFrameIdx == null ? MemoryAddress.NULL : Interop.allocateNativeArray(refFrameIdx, false)));
    }
    
    /**
     * Get the value of the field {@code ref_frame_sign_bias}
     * @return The value of the field {@code ref_frame_sign_bias}
     */
    public byte[] getRefFrameSignBias() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_frame_sign_bias"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code ref_frame_sign_bias}
     * @param refFrameSignBias The new value of the field {@code ref_frame_sign_bias}
     */
    public void setRefFrameSignBias(byte[] refFrameSignBias) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_frame_sign_bias"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refFrameSignBias == null ? MemoryAddress.NULL : Interop.allocateNativeArray(refFrameSignBias, false)));
    }
    
    /**
     * Get the value of the field {@code allow_high_precision_mv}
     * @return The value of the field {@code allow_high_precision_mv}
     */
    public byte getAllowHighPrecisionMv() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allow_high_precision_mv"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code allow_high_precision_mv}
     * @param allowHighPrecisionMv The new value of the field {@code allow_high_precision_mv}
     */
    public void setAllowHighPrecisionMv(byte allowHighPrecisionMv) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allow_high_precision_mv"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), allowHighPrecisionMv);
    }
    
    /**
     * Get the value of the field {@code interpolation_filter}
     * @return The value of the field {@code interpolation_filter}
     */
    public byte getInterpolationFilter() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interpolation_filter"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code interpolation_filter}
     * @param interpolationFilter The new value of the field {@code interpolation_filter}
     */
    public void setInterpolationFilter(byte interpolationFilter) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interpolation_filter"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), interpolationFilter);
    }
    
    /**
     * Get the value of the field {@code refresh_frame_context}
     * @return The value of the field {@code refresh_frame_context}
     */
    public byte getRefreshFrameContext() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_context"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code refresh_frame_context}
     * @param refreshFrameContext The new value of the field {@code refresh_frame_context}
     */
    public void setRefreshFrameContext(byte refreshFrameContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refreshFrameContext);
    }
    
    /**
     * Get the value of the field {@code frame_parallel_decoding_mode}
     * @return The value of the field {@code frame_parallel_decoding_mode}
     */
    public byte getFrameParallelDecodingMode() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_parallel_decoding_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_parallel_decoding_mode}
     * @param frameParallelDecodingMode The new value of the field {@code frame_parallel_decoding_mode}
     */
    public void setFrameParallelDecodingMode(byte frameParallelDecodingMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_parallel_decoding_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameParallelDecodingMode);
    }
    
    /**
     * Get the value of the field {@code frame_context_idx}
     * @return The value of the field {@code frame_context_idx}
     */
    public byte getFrameContextIdx() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_context_idx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_context_idx}
     * @param frameContextIdx The new value of the field {@code frame_context_idx}
     */
    public void setFrameContextIdx(byte frameContextIdx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_context_idx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameContextIdx);
    }
    
    /**
     * Get the value of the field {@code loop_filter_params}
     * @return The value of the field {@code loop_filter_params}
     */
    public org.gstreamer.codecs.Vp9LoopFilterParams getLoopFilterParams() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("loop_filter_params"));
        return org.gstreamer.codecs.Vp9LoopFilterParams.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code loop_filter_params}
     * @param loopFilterParams The new value of the field {@code loop_filter_params}
     */
    public void setLoopFilterParams(org.gstreamer.codecs.Vp9LoopFilterParams loopFilterParams) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loopFilterParams == null ? MemoryAddress.NULL : loopFilterParams.handle()));
    }
    
    /**
     * Get the value of the field {@code quantization_params}
     * @return The value of the field {@code quantization_params}
     */
    public org.gstreamer.codecs.Vp9QuantizationParams getQuantizationParams() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("quantization_params"));
        return org.gstreamer.codecs.Vp9QuantizationParams.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code quantization_params}
     * @param quantizationParams The new value of the field {@code quantization_params}
     */
    public void setQuantizationParams(org.gstreamer.codecs.Vp9QuantizationParams quantizationParams) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("quantization_params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quantizationParams == null ? MemoryAddress.NULL : quantizationParams.handle()));
    }
    
    /**
     * Get the value of the field {@code segmentation_params}
     * @return The value of the field {@code segmentation_params}
     */
    public org.gstreamer.codecs.Vp9SegmentationParams getSegmentationParams() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("segmentation_params"));
        return org.gstreamer.codecs.Vp9SegmentationParams.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code segmentation_params}
     * @param segmentationParams The new value of the field {@code segmentation_params}
     */
    public void setSegmentationParams(org.gstreamer.codecs.Vp9SegmentationParams segmentationParams) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segmentationParams == null ? MemoryAddress.NULL : segmentationParams.handle()));
    }
    
    /**
     * Get the value of the field {@code tile_cols_log2}
     * @return The value of the field {@code tile_cols_log2}
     */
    public byte getTileColsLog2() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_cols_log2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_cols_log2}
     * @param tileColsLog2 The new value of the field {@code tile_cols_log2}
     */
    public void setTileColsLog2(byte tileColsLog2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_cols_log2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileColsLog2);
    }
    
    /**
     * Get the value of the field {@code tile_rows_log2}
     * @return The value of the field {@code tile_rows_log2}
     */
    public byte getTileRowsLog2() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_rows_log2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_rows_log2}
     * @param tileRowsLog2 The new value of the field {@code tile_rows_log2}
     */
    public void setTileRowsLog2(byte tileRowsLog2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_rows_log2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileRowsLog2);
    }
    
    /**
     * Get the value of the field {@code header_size_in_bytes}
     * @return The value of the field {@code header_size_in_bytes}
     */
    public short getHeaderSizeInBytes() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header_size_in_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code header_size_in_bytes}
     * @param headerSizeInBytes The new value of the field {@code header_size_in_bytes}
     */
    public void setHeaderSizeInBytes(short headerSizeInBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header_size_in_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), headerSizeInBytes);
    }
    
    /**
     * Get the value of the field {@code tx_mode}
     * @return The value of the field {@code tx_mode}
     */
    public org.gstreamer.codecs.Vp9TxMode getTxMode() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tx_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.codecs.Vp9TxMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code tx_mode}
     * @param txMode The new value of the field {@code tx_mode}
     */
    public void setTxMode(org.gstreamer.codecs.Vp9TxMode txMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tx_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (txMode == null ? MemoryAddress.NULL : txMode.getValue()));
    }
    
    /**
     * Get the value of the field {@code reference_mode}
     * @return The value of the field {@code reference_mode}
     */
    public org.gstreamer.codecs.Vp9ReferenceMode getReferenceMode() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reference_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.codecs.Vp9ReferenceMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code reference_mode}
     * @param referenceMode The new value of the field {@code reference_mode}
     */
    public void setReferenceMode(org.gstreamer.codecs.Vp9ReferenceMode referenceMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reference_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (referenceMode == null ? MemoryAddress.NULL : referenceMode.getValue()));
    }
    
    /**
     * Get the value of the field {@code delta_probabilities}
     * @return The value of the field {@code delta_probabilities}
     */
    public org.gstreamer.codecs.Vp9DeltaProbabilities getDeltaProbabilities() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("delta_probabilities"));
        return org.gstreamer.codecs.Vp9DeltaProbabilities.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code delta_probabilities}
     * @param deltaProbabilities The new value of the field {@code delta_probabilities}
     */
    public void setDeltaProbabilities(org.gstreamer.codecs.Vp9DeltaProbabilities deltaProbabilities) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_probabilities"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deltaProbabilities == null ? MemoryAddress.NULL : deltaProbabilities.handle()));
    }
    
    /**
     * Get the value of the field {@code lossless_flag}
     * @return The value of the field {@code lossless_flag}
     */
    public byte getLosslessFlag() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lossless_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code lossless_flag}
     * @param losslessFlag The new value of the field {@code lossless_flag}
     */
    public void setLosslessFlag(byte losslessFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lossless_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), losslessFlag);
    }
    
    /**
     * Get the value of the field {@code frame_header_length_in_bytes}
     * @return The value of the field {@code frame_header_length_in_bytes}
     */
    public int getFrameHeaderLengthInBytes() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_header_length_in_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_header_length_in_bytes}
     * @param frameHeaderLengthInBytes The new value of the field {@code frame_header_length_in_bytes}
     */
    public void setFrameHeaderLengthInBytes(int frameHeaderLengthInBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_header_length_in_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameHeaderLengthInBytes);
    }
    
    /**
     * Create a Vp9FrameHeader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Vp9FrameHeader(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9FrameHeader> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Vp9FrameHeader(input, ownership);
    
    /**
     * A {@link Vp9FrameHeader.Builder} object constructs a {@link Vp9FrameHeader} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9FrameHeader.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9FrameHeader struct;
        
        private Builder() {
            struct = Vp9FrameHeader.allocate();
        }
        
         /**
         * Finish building the {@link Vp9FrameHeader} struct.
         * @return A new instance of {@code Vp9FrameHeader} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9FrameHeader build() {
            return struct;
        }
        
        /**
         * encoded profile
         * @param profile The value for the {@code profile} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProfile(byte profile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("profile"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), profile);
            return this;
        }
        
        /**
         * encoded bit depth
         * @param bitDepth The value for the {@code bitDepth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBitDepth(byte bitDepth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bit_depth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitDepth);
            return this;
        }
        
        /**
         * specify the chroma subsampling format for x coordinate
         * @param subsamplingX The value for the {@code subsamplingX} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubsamplingX(byte subsamplingX) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subsampling_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingX);
            return this;
        }
        
        /**
         * specify the chroma subsampling format for y coordinate
         * @param subsamplingY The value for the {@code subsamplingY} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubsamplingY(byte subsamplingY) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subsampling_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingY);
            return this;
        }
        
        /**
         * specifies the color space of the stream
         * @param colorSpace The value for the {@code colorSpace} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColorSpace(byte colorSpace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_space"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorSpace);
            return this;
        }
        
        /**
         * specifies the black level and range of the luma and chroma
         *   signals
         * @param colorRange The value for the {@code colorRange} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColorRange(byte colorRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorRange);
            return this;
        }
        
        /**
         * equal to 1, indicates the frame indexed by
         *   frame_to_show_map_idx is to be displayed
         * @param showExistingFrame The value for the {@code showExistingFrame} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowExistingFrame(byte showExistingFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_existing_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), showExistingFrame);
            return this;
        }
        
        /**
         * specifies the frame to be displayed.
         *   It is only available if show_existing_frame is 1
         * @param frameToShowMapIdx The value for the {@code frameToShowMapIdx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrameToShowMapIdx(byte frameToShowMapIdx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_to_show_map_idx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameToShowMapIdx);
            return this;
        }
        
        /**
         * equal to 0 indicates that the current frame is a key frame
         * @param frameType The value for the {@code frameType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrameType(byte frameType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameType);
            return this;
        }
        
        /**
         * indicate whether it is a displayable frame or not
         * @param showFrame The value for the {@code showFrame} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowFrame(byte showFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), showFrame);
            return this;
        }
        
        /**
         * equal to 1 indicates that error resilient mode is
         *   enabled
         * @param errorResilientMode The value for the {@code errorResilientMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setErrorResilientMode(byte errorResilientMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error_resilient_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), errorResilientMode);
            return this;
        }
        
        /**
         * coded frame width
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(int width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
            return this;
        }
        
        /**
         * coded frame height
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
            return this;
        }
        
        /**
         * equal to 0 means that the render width and
         *   height are inferred from the frame width and height
         * @param renderAndFrameSizeDifferent The value for the {@code renderAndFrameSizeDifferent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRenderAndFrameSizeDifferent(byte renderAndFrameSizeDifferent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_and_frame_size_different"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderAndFrameSizeDifferent);
            return this;
        }
        
        /**
         * render width of the frame
         * @param renderWidth The value for the {@code renderWidth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRenderWidth(int renderWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderWidth);
            return this;
        }
        
        /**
         * render width of the frame
         * @param renderHeight The value for the {@code renderHeight} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRenderHeight(int renderHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderHeight);
            return this;
        }
        
        /**
         * equal to 1 indicates that the frame is an intra-only frame
         * @param intraOnly The value for the {@code intraOnly} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIntraOnly(byte intraOnly) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("intra_only"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), intraOnly);
            return this;
        }
        
        /**
         * specifies whether the frame context should be reset to
         *   default values
         * @param resetFrameContext The value for the {@code resetFrameContext} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setResetFrameContext(byte resetFrameContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset_frame_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), resetFrameContext);
            return this;
        }
        
        /**
         * contains a bitmask that specifies which reference frame
         *   slots will be updated with the current frame after it is decoded
         * @param refreshFrameFlags The value for the {@code refreshFrameFlags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefreshFrameFlags(byte refreshFrameFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refreshFrameFlags);
            return this;
        }
        
        /**
         * specifies which reference frames are used by inter frames
         * @param refFrameIdx The value for the {@code refFrameIdx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefFrameIdx(byte[] refFrameIdx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_frame_idx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refFrameIdx == null ? MemoryAddress.NULL : Interop.allocateNativeArray(refFrameIdx, false)));
            return this;
        }
        
        /**
         * specifies the intended direction of the motion vector
         *   in time for each reference frame. A sign bias equal to 0 indicates that
         *   the reference frame is a backwards reference
         * @param refFrameSignBias The value for the {@code refFrameSignBias} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefFrameSignBias(byte[] refFrameSignBias) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_frame_sign_bias"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (refFrameSignBias == null ? MemoryAddress.NULL : Interop.allocateNativeArray(refFrameSignBias, false)));
            return this;
        }
        
        /**
         * equal to 0 specifies that motion vectors are
         *   specified to quarter pel precision
         * @param allowHighPrecisionMv The value for the {@code allowHighPrecisionMv} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowHighPrecisionMv(byte allowHighPrecisionMv) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allow_high_precision_mv"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), allowHighPrecisionMv);
            return this;
        }
        
        /**
         * specifies the filter selection used for performing
         *   inter prediction
         * @param interpolationFilter The value for the {@code interpolationFilter} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterpolationFilter(byte interpolationFilter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interpolation_filter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), interpolationFilter);
            return this;
        }
        
        /**
         * equal to 1 indicates that the probabilities computed
         *   for this frame
         * @param refreshFrameContext The value for the {@code refreshFrameContext} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefreshFrameContext(byte refreshFrameContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refreshFrameContext);
            return this;
        }
        
        /**
         * equal to 1 indicates that parallel decoding
         *   mode is enabled
         * @param frameParallelDecodingMode The value for the {@code frameParallelDecodingMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrameParallelDecodingMode(byte frameParallelDecodingMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_parallel_decoding_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameParallelDecodingMode);
            return this;
        }
        
        /**
         * indicates the frame context to use
         * @param frameContextIdx The value for the {@code frameContextIdx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrameContextIdx(byte frameContextIdx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_context_idx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameContextIdx);
            return this;
        }
        
        /**
         * a {@link Vp9LoopFilterParams}
         * @param loopFilterParams The value for the {@code loopFilterParams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoopFilterParams(org.gstreamer.codecs.Vp9LoopFilterParams loopFilterParams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loopFilterParams == null ? MemoryAddress.NULL : loopFilterParams.handle()));
            return this;
        }
        
        /**
         * a {@link Vp9QuantizationParams}
         * @param quantizationParams The value for the {@code quantizationParams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setQuantizationParams(org.gstreamer.codecs.Vp9QuantizationParams quantizationParams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quantization_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quantizationParams == null ? MemoryAddress.NULL : quantizationParams.handle()));
            return this;
        }
        
        /**
         * a {@link Vp9SegmentationParams}
         * @param segmentationParams The value for the {@code segmentationParams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationParams(org.gstreamer.codecs.Vp9SegmentationParams segmentationParams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segmentationParams == null ? MemoryAddress.NULL : segmentationParams.handle()));
            return this;
        }
        
        /**
         * specifies the base 2 logarithm of the width of each tile
         * @param tileColsLog2 The value for the {@code tileColsLog2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileColsLog2(byte tileColsLog2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_cols_log2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileColsLog2);
            return this;
        }
        
        /**
         * specifies the base 2 logarithm of the height of each tile
         * @param tileRowsLog2 The value for the {@code tileRowsLog2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileRowsLog2(byte tileRowsLog2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_rows_log2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileRowsLog2);
            return this;
        }
        
        public Builder setHeaderSizeInBytes(short headerSizeInBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("header_size_in_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), headerSizeInBytes);
            return this;
        }
        
        /**
         * Specifies how the transform size is determined.
         * @param txMode The value for the {@code txMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTxMode(org.gstreamer.codecs.Vp9TxMode txMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tx_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (txMode == null ? MemoryAddress.NULL : txMode.getValue()));
            return this;
        }
        
        /**
         * Is a derived syntax element that specifies the type of
         * inter prediction to be used.
         * @param referenceMode The value for the {@code referenceMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReferenceMode(org.gstreamer.codecs.Vp9ReferenceMode referenceMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reference_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (referenceMode == null ? MemoryAddress.NULL : referenceMode.getValue()));
            return this;
        }
        
        /**
         * Modification to the probabilities encoded in the bitstream.
         * @param deltaProbabilities The value for the {@code deltaProbabilities} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDeltaProbabilities(org.gstreamer.codecs.Vp9DeltaProbabilities deltaProbabilities) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_probabilities"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deltaProbabilities == null ? MemoryAddress.NULL : deltaProbabilities.handle()));
            return this;
        }
        
        /**
         * lossless mode decode
         * @param losslessFlag The value for the {@code losslessFlag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLosslessFlag(byte losslessFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lossless_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), losslessFlag);
            return this;
        }
        
        /**
         * length of uncompressed header
         * @param frameHeaderLengthInBytes The value for the {@code frameHeaderLengthInBytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrameHeaderLengthInBytes(int frameHeaderLengthInBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_header_length_in_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameHeaderLengthInBytes);
            return this;
        }
    }
}
