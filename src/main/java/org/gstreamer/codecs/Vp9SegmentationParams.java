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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link Vp9SegmentationParams}
     * @return A new, uninitialized @{link Vp9SegmentationParams}
     */
    public static Vp9SegmentationParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9SegmentationParams newInstance = new Vp9SegmentationParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code segmentation_enabled}
     * @return The value of the field {@code segmentation_enabled}
     */
    public byte segmentationEnabled$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_enabled"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segmentation_enabled}
     * @param segmentationEnabled The new value of the field {@code segmentation_enabled}
     */
    public void segmentationEnabled$set(byte segmentationEnabled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_enabled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationEnabled);
    }
    
    /**
     * Get the value of the field {@code segmentation_update_map}
     * @return The value of the field {@code segmentation_update_map}
     */
    public byte segmentationUpdateMap$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_map"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segmentation_update_map}
     * @param segmentationUpdateMap The new value of the field {@code segmentation_update_map}
     */
    public void segmentationUpdateMap$set(byte segmentationUpdateMap) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_map"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationUpdateMap);
    }
    
    /**
     * Get the value of the field {@code segmentation_temporal_update}
     * @return The value of the field {@code segmentation_temporal_update}
     */
    public byte segmentationTemporalUpdate$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_temporal_update"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segmentation_temporal_update}
     * @param segmentationTemporalUpdate The new value of the field {@code segmentation_temporal_update}
     */
    public void segmentationTemporalUpdate$set(byte segmentationTemporalUpdate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_temporal_update"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationTemporalUpdate);
    }
    
    /**
     * Get the value of the field {@code segmentation_update_data}
     * @return The value of the field {@code segmentation_update_data}
     */
    public byte segmentationUpdateData$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segmentation_update_data}
     * @param segmentationUpdateData The new value of the field {@code segmentation_update_data}
     */
    public void segmentationUpdateData$set(byte segmentationUpdateData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationUpdateData);
    }
    
    /**
     * Get the value of the field {@code segmentation_abs_or_delta_update}
     * @return The value of the field {@code segmentation_abs_or_delta_update}
     */
    public byte segmentationAbsOrDeltaUpdate$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_abs_or_delta_update"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code segmentation_abs_or_delta_update}
     * @param segmentationAbsOrDeltaUpdate The new value of the field {@code segmentation_abs_or_delta_update}
     */
    public void segmentationAbsOrDeltaUpdate$set(byte segmentationAbsOrDeltaUpdate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segmentation_abs_or_delta_update"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationAbsOrDeltaUpdate);
    }
    
    /**
     * Create a Vp9SegmentationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9SegmentationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vp9SegmentationParams struct;
        
         /**
         * A {@link Vp9SegmentationParams.Build} object constructs a {@link Vp9SegmentationParams} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vp9SegmentationParams.allocate();
        }
        
         /**
         * Finish building the {@link Vp9SegmentationParams} struct.
         * @return A new instance of {@code Vp9SegmentationParams} with the fields 
         *         that were set in the Build object.
         */
        public Vp9SegmentationParams construct() {
            return struct;
        }
        
        /**
         * equal to 1 indicates that this frame makes use of the
         *   segmentation tool
         * @param segmentationEnabled The value for the {@code segmentationEnabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegmentationEnabled(byte segmentationEnabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationEnabled);
            return this;
        }
        
        /**
         * equal to 1 indicates that the segmentation map
         *   should be updated during the decoding of this frame
         * @param segmentationUpdateMap The value for the {@code segmentationUpdateMap} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegmentationUpdateMap(byte segmentationUpdateMap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationUpdateMap);
            return this;
        }
        
        /**
         * specify the probability values to be used when
         *   decoding segment_id
         * @param segmentationTreeProbs The value for the {@code segmentationTreeProbs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegmentationTreeProbs(byte[] segmentationTreeProbs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_tree_probs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segmentationTreeProbs == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segmentationTreeProbs, false)));
            return this;
        }
        
        /**
         * specify the probability values to be used when
         *    decoding seg_id_predicted
         * @param segmentationPredProb The value for the {@code segmentationPredProb} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegmentationPredProb(byte[] segmentationPredProb) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_pred_prob"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segmentationPredProb == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segmentationPredProb, false)));
            return this;
        }
        
        /**
         * equal to 1 indicates that the updates to
         *   the segmentation map are coded relative to the existing segmentation map
         * @param segmentationTemporalUpdate The value for the {@code segmentationTemporalUpdate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegmentationTemporalUpdate(byte segmentationTemporalUpdate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_temporal_update"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationTemporalUpdate);
            return this;
        }
        
        /**
         * equal to 1 indicates that new parameters are
         *   about to be specified for each segment
         * @param segmentationUpdateData The value for the {@code segmentationUpdateData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegmentationUpdateData(byte segmentationUpdateData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_update_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationUpdateData);
            return this;
        }
        
        /**
         * equal to 0 indicates that the segmentation
         *   parameters represent adjustments relative to the standard values.
         *   equal to 1 indicates that the segmentation parameters represent the actual
         *   values to be used
         * @param segmentationAbsOrDeltaUpdate The value for the {@code segmentationAbsOrDeltaUpdate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegmentationAbsOrDeltaUpdate(byte segmentationAbsOrDeltaUpdate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segmentation_abs_or_delta_update"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), segmentationAbsOrDeltaUpdate);
            return this;
        }
        
        /**
         * indicates whether feature is enabled or not
         * @param featureEnabled The value for the {@code featureEnabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFeatureEnabled(byte[] featureEnabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("feature_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (featureEnabled == null ? MemoryAddress.NULL : Interop.allocateNativeArray(featureEnabled, false)));
            return this;
        }
        
        /**
         * segmentation feature data
         * @param featureData The value for the {@code featureData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFeatureData(short[] featureData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("feature_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (featureData == null ? MemoryAddress.NULL : Interop.allocateNativeArray(featureData, false)));
            return this;
        }
    }
}
