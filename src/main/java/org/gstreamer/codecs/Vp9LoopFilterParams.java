package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Loop filter params. See "6.2.8 Loop filter params syntax" and
 * "7.2.8 Loop filter semantics".
 * <p>
 * If syntax elements for {@code update_ref_delta}
 * and/or {@code loop_filter_mode_deltas} are not present in bitstream,
 * parser will fill {@code loop_filter_ref_deltas} and {@code loop_filter_mode_deltas} values
 * by using previously parsed values.
 * @version 1.20
 */
public class Vp9LoopFilterParams extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9LoopFilterParams";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("loop_filter_level"),
            Interop.valueLayout.C_BYTE.withName("loop_filter_sharpness"),
            Interop.valueLayout.C_BYTE.withName("loop_filter_delta_enabled"),
            Interop.valueLayout.C_BYTE.withName("loop_filter_delta_update"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("update_ref_delta"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("loop_filter_ref_deltas"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("update_mode_delta"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("loop_filter_mode_deltas")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp9LoopFilterParams}
     * @return A new, uninitialized @{link Vp9LoopFilterParams}
     */
    public static Vp9LoopFilterParams allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Vp9LoopFilterParams newInstance = new Vp9LoopFilterParams(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code loop_filter_level}
     * @return The value of the field {@code loop_filter_level}
     */
    public byte getLoopFilterLevel() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_level"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code loop_filter_level}
     * @param loopFilterLevel The new value of the field {@code loop_filter_level}
     */
    public void setLoopFilterLevel(byte loopFilterLevel) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_level"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterLevel);
        }
    }
    
    /**
     * Get the value of the field {@code loop_filter_sharpness}
     * @return The value of the field {@code loop_filter_sharpness}
     */
    public byte getLoopFilterSharpness() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_sharpness"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code loop_filter_sharpness}
     * @param loopFilterSharpness The new value of the field {@code loop_filter_sharpness}
     */
    public void setLoopFilterSharpness(byte loopFilterSharpness) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_sharpness"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterSharpness);
        }
    }
    
    /**
     * Get the value of the field {@code loop_filter_delta_enabled}
     * @return The value of the field {@code loop_filter_delta_enabled}
     */
    public byte getLoopFilterDeltaEnabled() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_enabled"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code loop_filter_delta_enabled}
     * @param loopFilterDeltaEnabled The new value of the field {@code loop_filter_delta_enabled}
     */
    public void setLoopFilterDeltaEnabled(byte loopFilterDeltaEnabled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterDeltaEnabled);
        }
    }
    
    /**
     * Get the value of the field {@code loop_filter_delta_update}
     * @return The value of the field {@code loop_filter_delta_update}
     */
    public byte getLoopFilterDeltaUpdate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_update"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code loop_filter_delta_update}
     * @param loopFilterDeltaUpdate The new value of the field {@code loop_filter_delta_update}
     */
    public void setLoopFilterDeltaUpdate(byte loopFilterDeltaUpdate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_update"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterDeltaUpdate);
        }
    }
    
    /**
     * Get the value of the field {@code update_ref_delta}
     * @return The value of the field {@code update_ref_delta}
     */
    public byte[] getUpdateRefDelta() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_ref_delta"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code update_ref_delta}
     * @param updateRefDelta The new value of the field {@code update_ref_delta}
     */
    public void setUpdateRefDelta(byte[] updateRefDelta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_ref_delta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateRefDelta == null ? MemoryAddress.NULL : Interop.allocateNativeArray(updateRefDelta, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code loop_filter_ref_deltas}
     * @return The value of the field {@code loop_filter_ref_deltas}
     */
    public byte[] getLoopFilterRefDeltas() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_ref_deltas"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code loop_filter_ref_deltas}
     * @param loopFilterRefDeltas The new value of the field {@code loop_filter_ref_deltas}
     */
    public void setLoopFilterRefDeltas(byte[] loopFilterRefDeltas) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_ref_deltas"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loopFilterRefDeltas == null ? MemoryAddress.NULL : Interop.allocateNativeArray(loopFilterRefDeltas, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code update_mode_delta}
     * @return The value of the field {@code update_mode_delta}
     */
    public byte[] getUpdateModeDelta() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_mode_delta"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 2, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code update_mode_delta}
     * @param updateModeDelta The new value of the field {@code update_mode_delta}
     */
    public void setUpdateModeDelta(byte[] updateModeDelta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_mode_delta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateModeDelta == null ? MemoryAddress.NULL : Interop.allocateNativeArray(updateModeDelta, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code loop_filter_mode_deltas}
     * @return The value of the field {@code loop_filter_mode_deltas}
     */
    public byte[] getLoopFilterModeDeltas() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_mode_deltas"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 2, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code loop_filter_mode_deltas}
     * @param loopFilterModeDeltas The new value of the field {@code loop_filter_mode_deltas}
     */
    public void setLoopFilterModeDeltas(byte[] loopFilterModeDeltas) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_mode_deltas"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loopFilterModeDeltas == null ? MemoryAddress.NULL : Interop.allocateNativeArray(loopFilterModeDeltas, false, SCOPE)));
        }
    }
    
    /**
     * Create a Vp9LoopFilterParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Vp9LoopFilterParams(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9LoopFilterParams> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Vp9LoopFilterParams(input);
    
    /**
     * A {@link Vp9LoopFilterParams.Builder} object constructs a {@link Vp9LoopFilterParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9LoopFilterParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9LoopFilterParams struct;
        
        private Builder() {
            struct = Vp9LoopFilterParams.allocate();
        }
        
        /**
         * Finish building the {@link Vp9LoopFilterParams} struct.
         * @return A new instance of {@code Vp9LoopFilterParams} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9LoopFilterParams build() {
            return struct;
        }
        
        /**
         * indicates the loop filter strength
         * @param loopFilterLevel The value for the {@code loopFilterLevel} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoopFilterLevel(byte loopFilterLevel) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_level"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterLevel);
                return this;
            }
        }
        
        /**
         * indicates the sharpness level
         * @param loopFilterSharpness The value for the {@code loopFilterSharpness} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoopFilterSharpness(byte loopFilterSharpness) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_sharpness"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterSharpness);
                return this;
            }
        }
        
        /**
         * equal to 1 means that the filter level depends
         *   on the mode and reference frame used to predict a block
         * @param loopFilterDeltaEnabled The value for the {@code loopFilterDeltaEnabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoopFilterDeltaEnabled(byte loopFilterDeltaEnabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_enabled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterDeltaEnabled);
                return this;
            }
        }
        
        /**
         * equal to 1 means that the bitstream contains
         *   additional syntax elements that specify which mode and reference frame
         *   deltas are to be updated
         * @param loopFilterDeltaUpdate The value for the {@code loopFilterDeltaUpdate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoopFilterDeltaUpdate(byte loopFilterDeltaUpdate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_update"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), loopFilterDeltaUpdate);
                return this;
            }
        }
        
        /**
         * equal to 1 means that the bitstream contains the syntax
         *   element loop_filter_ref_delta
         * @param updateRefDelta The value for the {@code updateRefDelta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUpdateRefDelta(byte[] updateRefDelta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("update_ref_delta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateRefDelta == null ? MemoryAddress.NULL : Interop.allocateNativeArray(updateRefDelta, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * contains the adjustment needed for the filter level
         *   based on the chosen reference frame
         * @param loopFilterRefDeltas The value for the {@code loopFilterRefDeltas} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoopFilterRefDeltas(byte[] loopFilterRefDeltas) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_ref_deltas"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loopFilterRefDeltas == null ? MemoryAddress.NULL : Interop.allocateNativeArray(loopFilterRefDeltas, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * equal to 1 means that the bitstream contains the syntax
         *   element loop_filter_mode_deltas
         * @param updateModeDelta The value for the {@code updateModeDelta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUpdateModeDelta(byte[] updateModeDelta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("update_mode_delta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateModeDelta == null ? MemoryAddress.NULL : Interop.allocateNativeArray(updateModeDelta, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * contains the adjustment needed for the filter level
         *   based on the chosen mode
         * @param loopFilterModeDeltas The value for the {@code loopFilterModeDeltas} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLoopFilterModeDeltas(byte[] loopFilterModeDeltas) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_mode_deltas"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loopFilterModeDeltas == null ? MemoryAddress.NULL : Interop.allocateNativeArray(loopFilterModeDeltas, false, SCOPE)));
                return this;
            }
        }
    }
}
