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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("base_q_idx"),
            Interop.valueLayout.C_BYTE.withName("delta_q_y_dc"),
            Interop.valueLayout.C_BYTE.withName("delta_q_uv_dc"),
            Interop.valueLayout.C_BYTE.withName("delta_q_uv_ac")
        ).withName(C_TYPE_NAME);
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
    public byte getBaseQIdx() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_q_idx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code base_q_idx}
     * @param baseQIdx The new value of the field {@code base_q_idx}
     */
    public void setBaseQIdx(byte baseQIdx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_q_idx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), baseQIdx);
    }
    
    /**
     * Get the value of the field {@code delta_q_y_dc}
     * @return The value of the field {@code delta_q_y_dc}
     */
    public byte getDeltaQYDc() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_y_dc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code delta_q_y_dc}
     * @param deltaQYDc The new value of the field {@code delta_q_y_dc}
     */
    public void setDeltaQYDc(byte deltaQYDc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_y_dc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQYDc);
    }
    
    /**
     * Get the value of the field {@code delta_q_uv_dc}
     * @return The value of the field {@code delta_q_uv_dc}
     */
    public byte getDeltaQUvDc() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_dc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code delta_q_uv_dc}
     * @param deltaQUvDc The new value of the field {@code delta_q_uv_dc}
     */
    public void setDeltaQUvDc(byte deltaQUvDc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_dc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQUvDc);
    }
    
    /**
     * Get the value of the field {@code delta_q_uv_ac}
     * @return The value of the field {@code delta_q_uv_ac}
     */
    public byte getDeltaQUvAc() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_ac"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code delta_q_uv_ac}
     * @param deltaQUvAc The new value of the field {@code delta_q_uv_ac}
     */
    public void setDeltaQUvAc(byte deltaQUvAc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_ac"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQUvAc);
    }
    
    /**
     * Create a Vp9QuantizationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Vp9QuantizationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9QuantizationParams> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Vp9QuantizationParams(input, ownership);
    
    /**
     * A {@link Vp9QuantizationParams.Builder} object constructs a {@link Vp9QuantizationParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9QuantizationParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9QuantizationParams struct;
        
        private Builder() {
            struct = Vp9QuantizationParams.allocate();
        }
        
         /**
         * Finish building the {@link Vp9QuantizationParams} struct.
         * @return A new instance of {@code Vp9QuantizationParams} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9QuantizationParams build() {
            return struct;
        }
        
        /**
         * indicates the base frame qindex. This is used for Y AC
         *   coefficients and as the base value for the other quantizers
         * @param baseQIdx The value for the {@code baseQIdx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBaseQIdx(byte baseQIdx) {
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
        public Builder setDeltaQYDc(byte deltaQYDc) {
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
        public Builder setDeltaQUvDc(byte deltaQUvDc) {
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
        public Builder setDeltaQUvAc(byte deltaQUvAc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_q_uv_ac"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaQUvAc);
            return this;
        }
    }
}
