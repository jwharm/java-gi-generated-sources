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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("loop_filter_level"),
        Interop.valueLayout.C_BYTE.withName("loop_filter_sharpness"),
        Interop.valueLayout.C_BYTE.withName("loop_filter_delta_enabled"),
        Interop.valueLayout.C_BYTE.withName("loop_filter_delta_update"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("update_ref_delta"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("loop_filter_ref_deltas"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("update_mode_delta"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_BYTE).withName("loop_filter_mode_deltas")
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
     * Allocate a new {@link Vp9LoopFilterParams}
     * @return A new, uninitialized @{link Vp9LoopFilterParams}
     */
    public static Vp9LoopFilterParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9LoopFilterParams newInstance = new Vp9LoopFilterParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code loop_filter_level}
     * @return The value of the field {@code loop_filter_level}
     */
    public byte loopFilterLevel$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code loop_filter_level}
     * @param loopFilterLevel The new value of the field {@code loop_filter_level}
     */
    public void loopFilterLevel$set(byte loopFilterLevel) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterLevel);
    }
    
    /**
     * Get the value of the field {@code loop_filter_sharpness}
     * @return The value of the field {@code loop_filter_sharpness}
     */
    public byte loopFilterSharpness$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_sharpness"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code loop_filter_sharpness}
     * @param loopFilterSharpness The new value of the field {@code loop_filter_sharpness}
     */
    public void loopFilterSharpness$set(byte loopFilterSharpness) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_sharpness"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterSharpness);
    }
    
    /**
     * Get the value of the field {@code loop_filter_delta_enabled}
     * @return The value of the field {@code loop_filter_delta_enabled}
     */
    public byte loopFilterDeltaEnabled$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_enabled"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code loop_filter_delta_enabled}
     * @param loopFilterDeltaEnabled The new value of the field {@code loop_filter_delta_enabled}
     */
    public void loopFilterDeltaEnabled$set(byte loopFilterDeltaEnabled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_enabled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterDeltaEnabled);
    }
    
    /**
     * Get the value of the field {@code loop_filter_delta_update}
     * @return The value of the field {@code loop_filter_delta_update}
     */
    public byte loopFilterDeltaUpdate$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_update"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code loop_filter_delta_update}
     * @param loopFilterDeltaUpdate The new value of the field {@code loop_filter_delta_update}
     */
    public void loopFilterDeltaUpdate$set(byte loopFilterDeltaUpdate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_update"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterDeltaUpdate);
    }
    
    /**
     * Create a Vp9LoopFilterParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9LoopFilterParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vp9LoopFilterParams struct;
        
         /**
         * A {@link Vp9LoopFilterParams.Build} object constructs a {@link Vp9LoopFilterParams} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vp9LoopFilterParams.allocate();
        }
        
         /**
         * Finish building the {@link Vp9LoopFilterParams} struct.
         * @return A new instance of {@code Vp9LoopFilterParams} with the fields 
         *         that were set in the Build object.
         */
        public Vp9LoopFilterParams construct() {
            return struct;
        }
        
        /**
         * indicates the loop filter strength
         * @param loopFilterLevel The value for the {@code loopFilterLevel} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoopFilterLevel(byte loopFilterLevel) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterLevel);
            return this;
        }
        
        /**
         * indicates the sharpness level
         * @param loopFilterSharpness The value for the {@code loopFilterSharpness} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoopFilterSharpness(byte loopFilterSharpness) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_sharpness"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterSharpness);
            return this;
        }
        
        /**
         * equal to 1 means that the filter level depends
         *   on the mode and reference frame used to predict a block
         * @param loopFilterDeltaEnabled The value for the {@code loopFilterDeltaEnabled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoopFilterDeltaEnabled(byte loopFilterDeltaEnabled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_enabled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterDeltaEnabled);
            return this;
        }
        
        /**
         * equal to 1 means that the bitstream contains
         *   additional syntax elements that specify which mode and reference frame
         *   deltas are to be updated
         * @param loopFilterDeltaUpdate The value for the {@code loopFilterDeltaUpdate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoopFilterDeltaUpdate(byte loopFilterDeltaUpdate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_delta_update"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), loopFilterDeltaUpdate);
            return this;
        }
        
        /**
         * equal to 1 means that the bitstream contains the syntax
         *   element loop_filter_ref_delta
         * @param updateRefDelta The value for the {@code updateRefDelta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUpdateRefDelta(byte[] updateRefDelta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_ref_delta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateRefDelta == null ? MemoryAddress.NULL : Interop.allocateNativeArray(updateRefDelta, false)));
            return this;
        }
        
        /**
         * contains the adjustment needed for the filter level
         *   based on the chosen reference frame
         * @param loopFilterRefDeltas The value for the {@code loopFilterRefDeltas} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoopFilterRefDeltas(byte[] loopFilterRefDeltas) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_ref_deltas"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loopFilterRefDeltas == null ? MemoryAddress.NULL : Interop.allocateNativeArray(loopFilterRefDeltas, false)));
            return this;
        }
        
        /**
         * equal to 1 means that the bitstream contains the syntax
         *   element loop_filter_mode_deltas
         * @param updateModeDelta The value for the {@code updateModeDelta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUpdateModeDelta(byte[] updateModeDelta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_mode_delta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateModeDelta == null ? MemoryAddress.NULL : Interop.allocateNativeArray(updateModeDelta, false)));
            return this;
        }
        
        /**
         * contains the adjustment needed for the filter level
         *   based on the chosen mode
         * @param loopFilterModeDeltas The value for the {@code loopFilterModeDeltas} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoopFilterModeDeltas(byte[] loopFilterModeDeltas) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("loop_filter_mode_deltas"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loopFilterModeDeltas == null ? MemoryAddress.NULL : Interop.allocateNativeArray(loopFilterModeDeltas, false)));
            return this;
        }
    }
}
