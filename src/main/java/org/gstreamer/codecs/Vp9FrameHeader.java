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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public byte profile$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code profile}
     * @param profile The new value of the field {@code profile}
     */
    public void profile$set(byte profile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("profile"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), profile);
    }
    
    /**
     * Get the value of the field {@code bit_depth}
     * @return The value of the field {@code bit_depth}
     */
    public byte bitDepth$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit_depth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bit_depth}
     * @param bitDepth The new value of the field {@code bit_depth}
     */
    public void bitDepth$set(byte bitDepth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit_depth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitDepth);
    }
    
    /**
     * Get the value of the field {@code subsampling_x}
     * @return The value of the field {@code subsampling_x}
     */
    public byte subsamplingX$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code subsampling_x}
     * @param subsamplingX The new value of the field {@code subsampling_x}
     */
    public void subsamplingX$set(byte subsamplingX) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingX);
    }
    
    /**
     * Get the value of the field {@code subsampling_y}
     * @return The value of the field {@code subsampling_y}
     */
    public byte subsamplingY$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code subsampling_y}
     * @param subsamplingY The new value of the field {@code subsampling_y}
     */
    public void subsamplingY$set(byte subsamplingY) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("subsampling_y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), subsamplingY);
    }
    
    /**
     * Get the value of the field {@code color_space}
     * @return The value of the field {@code color_space}
     */
    public byte colorSpace$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_space"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code color_space}
     * @param colorSpace The new value of the field {@code color_space}
     */
    public void colorSpace$set(byte colorSpace) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_space"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorSpace);
    }
    
    /**
     * Get the value of the field {@code color_range}
     * @return The value of the field {@code color_range}
     */
    public byte colorRange$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_range"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code color_range}
     * @param colorRange The new value of the field {@code color_range}
     */
    public void colorRange$set(byte colorRange) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_range"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), colorRange);
    }
    
    /**
     * Get the value of the field {@code show_existing_frame}
     * @return The value of the field {@code show_existing_frame}
     */
    public byte showExistingFrame$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_existing_frame"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code show_existing_frame}
     * @param showExistingFrame The new value of the field {@code show_existing_frame}
     */
    public void showExistingFrame$set(byte showExistingFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_existing_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), showExistingFrame);
    }
    
    /**
     * Get the value of the field {@code frame_to_show_map_idx}
     * @return The value of the field {@code frame_to_show_map_idx}
     */
    public byte frameToShowMapIdx$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_to_show_map_idx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_to_show_map_idx}
     * @param frameToShowMapIdx The new value of the field {@code frame_to_show_map_idx}
     */
    public void frameToShowMapIdx$set(byte frameToShowMapIdx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_to_show_map_idx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameToShowMapIdx);
    }
    
    /**
     * Get the value of the field {@code frame_type}
     * @return The value of the field {@code frame_type}
     */
    public byte frameType$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_type}
     * @param frameType The new value of the field {@code frame_type}
     */
    public void frameType$set(byte frameType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameType);
    }
    
    /**
     * Get the value of the field {@code show_frame}
     * @return The value of the field {@code show_frame}
     */
    public byte showFrame$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_frame"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code show_frame}
     * @param showFrame The new value of the field {@code show_frame}
     */
    public void showFrame$set(byte showFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("show_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), showFrame);
    }
    
    /**
     * Get the value of the field {@code error_resilient_mode}
     * @return The value of the field {@code error_resilient_mode}
     */
    public byte errorResilientMode$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_resilient_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code error_resilient_mode}
     * @param errorResilientMode The new value of the field {@code error_resilient_mode}
     */
    public void errorResilientMode$set(byte errorResilientMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_resilient_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), errorResilientMode);
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public int width$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void width$set(int width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public int height$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void height$set(int height) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
    }
    
    /**
     * Get the value of the field {@code render_and_frame_size_different}
     * @return The value of the field {@code render_and_frame_size_different}
     */
    public byte renderAndFrameSizeDifferent$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_and_frame_size_different"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code render_and_frame_size_different}
     * @param renderAndFrameSizeDifferent The new value of the field {@code render_and_frame_size_different}
     */
    public void renderAndFrameSizeDifferent$set(byte renderAndFrameSizeDifferent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_and_frame_size_different"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderAndFrameSizeDifferent);
    }
    
    /**
     * Get the value of the field {@code render_width}
     * @return The value of the field {@code render_width}
     */
    public int renderWidth$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code render_width}
     * @param renderWidth The new value of the field {@code render_width}
     */
    public void renderWidth$set(int renderWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderWidth);
    }
    
    /**
     * Get the value of the field {@code render_height}
     * @return The value of the field {@code render_height}
     */
    public int renderHeight$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code render_height}
     * @param renderHeight The new value of the field {@code render_height}
     */
    public void renderHeight$set(int renderHeight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), renderHeight);
    }
    
    /**
     * Get the value of the field {@code intra_only}
     * @return The value of the field {@code intra_only}
     */
    public byte intraOnly$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("intra_only"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code intra_only}
     * @param intraOnly The new value of the field {@code intra_only}
     */
    public void intraOnly$set(byte intraOnly) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("intra_only"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), intraOnly);
    }
    
    /**
     * Get the value of the field {@code reset_frame_context}
     * @return The value of the field {@code reset_frame_context}
     */
    public byte resetFrameContext$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset_frame_context"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code reset_frame_context}
     * @param resetFrameContext The new value of the field {@code reset_frame_context}
     */
    public void resetFrameContext$set(byte resetFrameContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset_frame_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), resetFrameContext);
    }
    
    /**
     * Get the value of the field {@code refresh_frame_flags}
     * @return The value of the field {@code refresh_frame_flags}
     */
    public byte refreshFrameFlags$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code refresh_frame_flags}
     * @param refreshFrameFlags The new value of the field {@code refresh_frame_flags}
     */
    public void refreshFrameFlags$set(byte refreshFrameFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refreshFrameFlags);
    }
    
    /**
     * Get the value of the field {@code allow_high_precision_mv}
     * @return The value of the field {@code allow_high_precision_mv}
     */
    public byte allowHighPrecisionMv$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allow_high_precision_mv"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code allow_high_precision_mv}
     * @param allowHighPrecisionMv The new value of the field {@code allow_high_precision_mv}
     */
    public void allowHighPrecisionMv$set(byte allowHighPrecisionMv) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allow_high_precision_mv"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), allowHighPrecisionMv);
    }
    
    /**
     * Get the value of the field {@code interpolation_filter}
     * @return The value of the field {@code interpolation_filter}
     */
    public byte interpolationFilter$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interpolation_filter"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code interpolation_filter}
     * @param interpolationFilter The new value of the field {@code interpolation_filter}
     */
    public void interpolationFilter$set(byte interpolationFilter) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interpolation_filter"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), interpolationFilter);
    }
    
    /**
     * Get the value of the field {@code refresh_frame_context}
     * @return The value of the field {@code refresh_frame_context}
     */
    public byte refreshFrameContext$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_context"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code refresh_frame_context}
     * @param refreshFrameContext The new value of the field {@code refresh_frame_context}
     */
    public void refreshFrameContext$set(byte refreshFrameContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("refresh_frame_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), refreshFrameContext);
    }
    
    /**
     * Get the value of the field {@code frame_parallel_decoding_mode}
     * @return The value of the field {@code frame_parallel_decoding_mode}
     */
    public byte frameParallelDecodingMode$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_parallel_decoding_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_parallel_decoding_mode}
     * @param frameParallelDecodingMode The new value of the field {@code frame_parallel_decoding_mode}
     */
    public void frameParallelDecodingMode$set(byte frameParallelDecodingMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_parallel_decoding_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameParallelDecodingMode);
    }
    
    /**
     * Get the value of the field {@code frame_context_idx}
     * @return The value of the field {@code frame_context_idx}
     */
    public byte frameContextIdx$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_context_idx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_context_idx}
     * @param frameContextIdx The new value of the field {@code frame_context_idx}
     */
    public void frameContextIdx$set(byte frameContextIdx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_context_idx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameContextIdx);
    }
    
    /**
     * Get the value of the field {@code loop_filter_params}
     * @return The value of the field {@code loop_filter_params}
     */
    public org.gstreamer.codecs.Vp9LoopFilterParams loopFilterParams$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("loop_filter_params"));
        return new org.gstreamer.codecs.Vp9LoopFilterParams(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code quantization_params}
     * @return The value of the field {@code quantization_params}
     */
    public org.gstreamer.codecs.Vp9QuantizationParams quantizationParams$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("quantization_params"));
        return new org.gstreamer.codecs.Vp9QuantizationParams(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code segmentation_params}
     * @return The value of the field {@code segmentation_params}
     */
    public org.gstreamer.codecs.Vp9SegmentationParams segmentationParams$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("segmentation_params"));
        return new org.gstreamer.codecs.Vp9SegmentationParams(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code tile_cols_log2}
     * @return The value of the field {@code tile_cols_log2}
     */
    public byte tileColsLog2$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_cols_log2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_cols_log2}
     * @param tileColsLog2 The new value of the field {@code tile_cols_log2}
     */
    public void tileColsLog2$set(byte tileColsLog2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_cols_log2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileColsLog2);
    }
    
    /**
     * Get the value of the field {@code tile_rows_log2}
     * @return The value of the field {@code tile_rows_log2}
     */
    public byte tileRowsLog2$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_rows_log2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_rows_log2}
     * @param tileRowsLog2 The new value of the field {@code tile_rows_log2}
     */
    public void tileRowsLog2$set(byte tileRowsLog2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_rows_log2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileRowsLog2);
    }
    
    /**
     * Get the value of the field {@code header_size_in_bytes}
     * @return The value of the field {@code header_size_in_bytes}
     */
    public short headerSizeInBytes$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header_size_in_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code header_size_in_bytes}
     * @param headerSizeInBytes The new value of the field {@code header_size_in_bytes}
     */
    public void headerSizeInBytes$set(short headerSizeInBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header_size_in_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), headerSizeInBytes);
    }
    
    /**
     * Get the value of the field {@code tx_mode}
     * @return The value of the field {@code tx_mode}
     */
    public org.gstreamer.codecs.Vp9TxMode txMode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tx_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.codecs.Vp9TxMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code tx_mode}
     * @param txMode The new value of the field {@code tx_mode}
     */
    public void txMode$set(org.gstreamer.codecs.Vp9TxMode txMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tx_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), txMode.getValue());
    }
    
    /**
     * Get the value of the field {@code reference_mode}
     * @return The value of the field {@code reference_mode}
     */
    public org.gstreamer.codecs.Vp9ReferenceMode referenceMode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reference_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.codecs.Vp9ReferenceMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code reference_mode}
     * @param referenceMode The new value of the field {@code reference_mode}
     */
    public void referenceMode$set(org.gstreamer.codecs.Vp9ReferenceMode referenceMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reference_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), referenceMode.getValue());
    }
    
    /**
     * Get the value of the field {@code delta_probabilities}
     * @return The value of the field {@code delta_probabilities}
     */
    public org.gstreamer.codecs.Vp9DeltaProbabilities deltaProbabilities$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("delta_probabilities"));
        return new org.gstreamer.codecs.Vp9DeltaProbabilities(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code lossless_flag}
     * @return The value of the field {@code lossless_flag}
     */
    public byte losslessFlag$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lossless_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code lossless_flag}
     * @param losslessFlag The new value of the field {@code lossless_flag}
     */
    public void losslessFlag$set(byte losslessFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lossless_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), losslessFlag);
    }
    
    /**
     * Get the value of the field {@code frame_header_length_in_bytes}
     * @return The value of the field {@code frame_header_length_in_bytes}
     */
    public int frameHeaderLengthInBytes$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_header_length_in_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_header_length_in_bytes}
     * @param frameHeaderLengthInBytes The new value of the field {@code frame_header_length_in_bytes}
     */
    public void frameHeaderLengthInBytes$set(int frameHeaderLengthInBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_header_length_in_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameHeaderLengthInBytes);
    }
    
    /**
     * Create a Vp9FrameHeader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9FrameHeader(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vp9FrameHeader struct;
        
         /**
         * A {@link Vp9FrameHeader.Build} object constructs a {@link Vp9FrameHeader} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vp9FrameHeader.allocate();
        }
        
         /**
         * Finish building the {@link Vp9FrameHeader} struct.
         * @return A new instance of {@code Vp9FrameHeader} with the fields 
         *         that were set in the Build object.
         */
        public Vp9FrameHeader construct() {
            return struct;
        }
        
        /**
         * encoded profile
         * @param profile The value for the {@code profile} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProfile(byte profile) {
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
        public Build setBitDepth(byte bitDepth) {
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
        public Build setSubsamplingX(byte subsamplingX) {
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
        public Build setSubsamplingY(byte subsamplingY) {
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
        public Build setColorSpace(byte colorSpace) {
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
        public Build setColorRange(byte colorRange) {
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
        public Build setShowExistingFrame(byte showExistingFrame) {
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
        public Build setFrameToShowMapIdx(byte frameToShowMapIdx) {
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
        public Build setFrameType(byte frameType) {
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
        public Build setShowFrame(byte showFrame) {
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
        public Build setErrorResilientMode(byte errorResilientMode) {
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
        public Build setWidth(int width) {
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
        public Build setHeight(int height) {
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
        public Build setRenderAndFrameSizeDifferent(byte renderAndFrameSizeDifferent) {
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
        public Build setRenderWidth(int renderWidth) {
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
        public Build setRenderHeight(int renderHeight) {
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
        public Build setIntraOnly(byte intraOnly) {
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
        public Build setResetFrameContext(byte resetFrameContext) {
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
        public Build setRefreshFrameFlags(byte refreshFrameFlags) {
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
        public Build setRefFrameIdx(byte[] refFrameIdx) {
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
        public Build setRefFrameSignBias(byte[] refFrameSignBias) {
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
        public Build setAllowHighPrecisionMv(byte allowHighPrecisionMv) {
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
        public Build setInterpolationFilter(byte interpolationFilter) {
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
        public Build setRefreshFrameContext(byte refreshFrameContext) {
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
        public Build setFrameParallelDecodingMode(byte frameParallelDecodingMode) {
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
        public Build setFrameContextIdx(byte frameContextIdx) {
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
        public Build setLoopFilterParams(org.gstreamer.codecs.Vp9LoopFilterParams loopFilterParams) {
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
        public Build setQuantizationParams(org.gstreamer.codecs.Vp9QuantizationParams quantizationParams) {
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
        public Build setSegmentationParams(org.gstreamer.codecs.Vp9SegmentationParams segmentationParams) {
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
        public Build setTileColsLog2(byte tileColsLog2) {
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
        public Build setTileRowsLog2(byte tileRowsLog2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_rows_log2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileRowsLog2);
            return this;
        }
        
        public Build setHeaderSizeInBytes(short headerSizeInBytes) {
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
        public Build setTxMode(org.gstreamer.codecs.Vp9TxMode txMode) {
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
        public Build setReferenceMode(org.gstreamer.codecs.Vp9ReferenceMode referenceMode) {
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
        public Build setDeltaProbabilities(org.gstreamer.codecs.Vp9DeltaProbabilities deltaProbabilities) {
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
        public Build setLosslessFlag(byte losslessFlag) {
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
        public Build setFrameHeaderLengthInBytes(int frameHeaderLengthInBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_header_length_in_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameHeaderLengthInBytes);
            return this;
        }
    }
}
