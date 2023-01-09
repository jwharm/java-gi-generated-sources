package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See "6.2.11 Segmentation params syntax" and
 * "7.2.10 Segmentation params syntax". When {@code segmentation_update_data} is equal
 * to zero, parser will fill {@code feature_enabled} and by {@code feature_data}
 * using previously parsed values.
 * @version 1.20
 */
public class Vp9SegmentationParams extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9SegmentationParams";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("segmentation_enabled"),
            Interop.valueLayout.C_BYTE.withName("segmentation_update_map"),
            MemoryLayout.paddingLayout(40),
            MemoryLayout.sequenceLayout(7, Interop.valueLayout.C_BYTE).withName("segmentation_tree_probs"),
            MemoryLayout.paddingLayout(8),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.C_BYTE).withName("segmentation_pred_prob"),
            Interop.valueLayout.C_BYTE.withName("segmentation_temporal_update"),
            Interop.valueLayout.C_BYTE.withName("segmentation_update_data"),
            Interop.valueLayout.C_BYTE.withName("segmentation_abs_or_delta_update"),
            MemoryLayout.paddingLayout(88),
            MemoryLayout.sequenceLayout(32, Interop.valueLayout.C_BYTE).withName("feature_enabled"),
            MemoryLayout.sequenceLayout(32, Interop.valueLayout.C_SHORT).withName("feature_data")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9SegmentationParams}
     * @return A new, uninitialized @{link Vp9SegmentationParams}
     */
    public static Vp9SegmentationParams allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Vp9SegmentationParams newInstance = new Vp9SegmentationParams(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code segmentation_enabled}
     * @return The value of the field {@code segmentation_enabled}
     */
    public byte getSegmentationEnabled() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_enabled"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code segmentation_enabled}
     * @param segmentationEnabled The new value of the field {@code segmentation_enabled}
     */
    public void setSegmentationEnabled(byte segmentationEnabled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), segmentationEnabled);
        }
    }
    
    /**
     * Get the value of the field {@code segmentation_update_map}
     * @return The value of the field {@code segmentation_update_map}
     */
    public byte getSegmentationUpdateMap() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_map"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code segmentation_update_map}
     * @param segmentationUpdateMap The new value of the field {@code segmentation_update_map}
     */
    public void setSegmentationUpdateMap(byte segmentationUpdateMap) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), segmentationUpdateMap);
        }
    }
    
    /**
     * Get the value of the field {@code segmentation_tree_probs}
     * @return The value of the field {@code segmentation_tree_probs}
     */
    public byte[] getSegmentationTreeProbs() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_tree_probs"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 7, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code segmentation_tree_probs}
     * @param segmentationTreeProbs The new value of the field {@code segmentation_tree_probs}
     */
    public void setSegmentationTreeProbs(byte[] segmentationTreeProbs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_tree_probs"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (segmentationTreeProbs == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segmentationTreeProbs, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code segmentation_pred_prob}
     * @return The value of the field {@code segmentation_pred_prob}
     */
    public byte[] getSegmentationPredProb() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_pred_prob"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 3, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code segmentation_pred_prob}
     * @param segmentationPredProb The new value of the field {@code segmentation_pred_prob}
     */
    public void setSegmentationPredProb(byte[] segmentationPredProb) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_pred_prob"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (segmentationPredProb == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segmentationPredProb, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code segmentation_temporal_update}
     * @return The value of the field {@code segmentation_temporal_update}
     */
    public byte getSegmentationTemporalUpdate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_temporal_update"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code segmentation_temporal_update}
     * @param segmentationTemporalUpdate The new value of the field {@code segmentation_temporal_update}
     */
    public void setSegmentationTemporalUpdate(byte segmentationTemporalUpdate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_temporal_update"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), segmentationTemporalUpdate);
        }
    }
    
    /**
     * Get the value of the field {@code segmentation_update_data}
     * @return The value of the field {@code segmentation_update_data}
     */
    public byte getSegmentationUpdateData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code segmentation_update_data}
     * @param segmentationUpdateData The new value of the field {@code segmentation_update_data}
     */
    public void setSegmentationUpdateData(byte segmentationUpdateData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), segmentationUpdateData);
        }
    }
    
    /**
     * Get the value of the field {@code segmentation_abs_or_delta_update}
     * @return The value of the field {@code segmentation_abs_or_delta_update}
     */
    public byte getSegmentationAbsOrDeltaUpdate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_abs_or_delta_update"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code segmentation_abs_or_delta_update}
     * @param segmentationAbsOrDeltaUpdate The new value of the field {@code segmentation_abs_or_delta_update}
     */
    public void setSegmentationAbsOrDeltaUpdate(byte segmentationAbsOrDeltaUpdate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_abs_or_delta_update"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), segmentationAbsOrDeltaUpdate);
        }
    }
    
    /**
     * Get the value of the field {@code feature_enabled}
     * @return The value of the field {@code feature_enabled}
     */
    public byte[] getFeatureEnabled() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("feature_enabled"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 32, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code feature_enabled}
     * @param featureEnabled The new value of the field {@code feature_enabled}
     */
    public void setFeatureEnabled(byte[] featureEnabled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("feature_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (featureEnabled == null ? MemoryAddress.NULL : Interop.allocateNativeArray(featureEnabled, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code feature_data}
     * @return The value of the field {@code feature_data}
     */
    public short[] getFeatureData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("feature_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 32, SCOPE).toArray(Interop.valueLayout.C_SHORT);
        }
    }
    
    /**
     * Change the value of the field {@code feature_data}
     * @param featureData The new value of the field {@code feature_data}
     */
    public void setFeatureData(short[] featureData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("feature_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (featureData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(featureData, false, SCOPE)));
        }
    }
    
    /**
     * Create a Vp9SegmentationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Vp9SegmentationParams(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9SegmentationParams> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Vp9SegmentationParams(input);
    
    /**
     * A {@link Vp9SegmentationParams.Builder} object constructs a {@link Vp9SegmentationParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9SegmentationParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9SegmentationParams struct;
        
        private Builder() {
            struct = Vp9SegmentationParams.allocate();
        }
        
        /**
         * Finish building the {@link Vp9SegmentationParams} struct.
         * @return A new instance of {@code Vp9SegmentationParams} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9SegmentationParams build() {
            return struct;
        }
        
        /**
         * equal to 1 indicates that this frame makes use of the
         *   segmentation tool
         * @param segmentationEnabled The value for the {@code segmentationEnabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationEnabled(byte segmentationEnabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_enabled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), segmentationEnabled);
                return this;
            }
        }
        
        /**
         * equal to 1 indicates that the segmentation map
         *   should be updated during the decoding of this frame
         * @param segmentationUpdateMap The value for the {@code segmentationUpdateMap} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationUpdateMap(byte segmentationUpdateMap) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_map"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), segmentationUpdateMap);
                return this;
            }
        }
        
        /**
         * specify the probability values to be used when
         *   decoding segment_id
         * @param segmentationTreeProbs The value for the {@code segmentationTreeProbs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationTreeProbs(byte[] segmentationTreeProbs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_tree_probs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (segmentationTreeProbs == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segmentationTreeProbs, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * specify the probability values to be used when
         *    decoding seg_id_predicted
         * @param segmentationPredProb The value for the {@code segmentationPredProb} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationPredProb(byte[] segmentationPredProb) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_pred_prob"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (segmentationPredProb == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segmentationPredProb, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * equal to 1 indicates that the updates to
         *   the segmentation map are coded relative to the existing segmentation map
         * @param segmentationTemporalUpdate The value for the {@code segmentationTemporalUpdate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationTemporalUpdate(byte segmentationTemporalUpdate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_temporal_update"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), segmentationTemporalUpdate);
                return this;
            }
        }
        
        /**
         * equal to 1 indicates that new parameters are
         *   about to be specified for each segment
         * @param segmentationUpdateData The value for the {@code segmentationUpdateData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationUpdateData(byte segmentationUpdateData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), segmentationUpdateData);
                return this;
            }
        }
        
        /**
         * equal to 0 indicates that the segmentation
         *   parameters represent adjustments relative to the standard values.
         *   equal to 1 indicates that the segmentation parameters represent the actual
         *   values to be used
         * @param segmentationAbsOrDeltaUpdate The value for the {@code segmentationAbsOrDeltaUpdate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSegmentationAbsOrDeltaUpdate(byte segmentationAbsOrDeltaUpdate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segmentation_abs_or_delta_update"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), segmentationAbsOrDeltaUpdate);
                return this;
            }
        }
        
        /**
         * indicates whether feature is enabled or not
         * @param featureEnabled The value for the {@code featureEnabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFeatureEnabled(byte[] featureEnabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("feature_enabled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (featureEnabled == null ? MemoryAddress.NULL : Interop.allocateNativeArray(featureEnabled, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * segmentation feature data
         * @param featureData The value for the {@code featureData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFeatureData(short[] featureData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("feature_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (featureData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(featureData, false, SCOPE)));
                return this;
            }
        }
    }
}
