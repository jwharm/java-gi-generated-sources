package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Vp9QuantizationParams extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9QuantizationParams";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("base_q_idx"),
        Interop.valueLayout.C_BYTE.withName("delta_q_y_dc"),
        Interop.valueLayout.C_BYTE.withName("delta_q_uv_dc"),
        Interop.valueLayout.C_BYTE.withName("delta_q_uv_ac")
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
     * Allocate a new {@link Vp9QuantizationParams}
     * @return A new, uninitialized @{link Vp9QuantizationParams}
     */
    public static Vp9QuantizationParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp9QuantizationParams newInstance = new Vp9QuantizationParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_q_idx}
     * @return The value of the field {@code base_q_idx}
     */
    public byte baseQIdx$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_q_idx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code base_q_idx}
     * @param baseQIdx The new value of the field {@code base_q_idx}
     */
    public void baseQIdx$set(byte baseQIdx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_q_idx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), baseQIdx);
    }
    
    /**
     * Get the value of the field {@code delta_q_y_dc}
     * @return The value of the field {@code delta_q_y_dc}
     */
    public byte deltaQYDc$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_y_dc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code delta_q_y_dc}
     * @param deltaQYDc The new value of the field {@code delta_q_y_dc}
     */
    public void deltaQYDc$set(byte deltaQYDc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_y_dc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQYDc);
    }
    
    /**
     * Get the value of the field {@code delta_q_uv_dc}
     * @return The value of the field {@code delta_q_uv_dc}
     */
    public byte deltaQUvDc$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_dc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code delta_q_uv_dc}
     * @param deltaQUvDc The new value of the field {@code delta_q_uv_dc}
     */
    public void deltaQUvDc$set(byte deltaQUvDc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_dc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQUvDc);
    }
    
    /**
     * Get the value of the field {@code delta_q_uv_ac}
     * @return The value of the field {@code delta_q_uv_ac}
     */
    public byte deltaQUvAc$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_ac"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code delta_q_uv_ac}
     * @param deltaQUvAc The new value of the field {@code delta_q_uv_ac}
     */
    public void deltaQUvAc$set(byte deltaQUvAc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_ac"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQUvAc);
    }
    
    /**
     * Create a Vp9QuantizationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Vp9QuantizationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Vp9QuantizationParams struct;
        
         /**
         * A {@link Vp9QuantizationParams.Build} object constructs a {@link Vp9QuantizationParams} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Vp9QuantizationParams.allocate();
        }
        
         /**
         * Finish building the {@link Vp9QuantizationParams} struct.
         * @return A new instance of {@code Vp9QuantizationParams} with the fields 
         *         that were set in the Build object.
         */
        public Vp9QuantizationParams construct() {
            return struct;
        }
        
        /**
         * indicates the base frame qindex. This is used for Y AC
         *   coefficients and as the base value for the other quantizers
         * @param baseQIdx The value for the {@code baseQIdx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBaseQIdx(byte baseQIdx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_q_idx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), baseQIdx);
            return this;
        }
        
        /**
         * indicates the Y DC quantizer relative to base_q_idx
         * @param deltaQYDc The value for the {@code deltaQYDc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDeltaQYDc(byte deltaQYDc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_q_y_dc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQYDc);
            return this;
        }
        
        /**
         * indicates the UV DC quantizer relative to base_q_idx
         * @param deltaQUvDc The value for the {@code deltaQUvDc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDeltaQUvDc(byte deltaQUvDc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_dc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQUvDc);
            return this;
        }
        
        /**
         * indicates the UV AC quantizer relative to base_q_idx
         * @param deltaQUvAc The value for the {@code deltaQUvAc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDeltaQUvAc(byte deltaQUvAc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_ac"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQUvAc);
            return this;
        }
    }
}
