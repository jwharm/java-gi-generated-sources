package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Use {@link OtVarAxisInfoT} instead.
 * @version 1.4.2
 */
public class OtVarAxisT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_var_axis_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("tag"),
            Interop.valueLayout.C_INT.withName("name_id"),
            Interop.valueLayout.C_FLOAT.withName("min_value"),
            Interop.valueLayout.C_FLOAT.withName("default_value"),
            Interop.valueLayout.C_FLOAT.withName("max_value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OtVarAxisT}
     * @return A new, uninitialized @{link OtVarAxisT}
     */
    public static OtVarAxisT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtVarAxisT newInstance = new OtVarAxisT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code tag}
     * @return The value of the field {@code tag}
     */
    public org.harfbuzz.TagT getTag() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.TagT(RESULT);
    }
    
    /**
     * Change the value of the field {@code tag}
     * @param tag The new value of the field {@code tag}
     */
    public void setTag(org.harfbuzz.TagT tag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tag == null ? MemoryAddress.NULL : tag.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code name_id}
     * @return The value of the field {@code name_id}
     */
    public org.harfbuzz.OtNameIdT getNameId() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Change the value of the field {@code name_id}
     * @param nameId The new value of the field {@code name_id}
     */
    public void setNameId(org.harfbuzz.OtNameIdT nameId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nameId == null ? MemoryAddress.NULL : nameId.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code min_value}
     * @return The value of the field {@code min_value}
     */
    public float getMinValue() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_value}
     * @param minValue The new value of the field {@code min_value}
     */
    public void setMinValue(float minValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minValue);
    }
    
    /**
     * Get the value of the field {@code default_value}
     * @return The value of the field {@code default_value}
     */
    public float getDefaultValue() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code default_value}
     * @param defaultValue The new value of the field {@code default_value}
     */
    public void setDefaultValue(float defaultValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), defaultValue);
    }
    
    /**
     * Get the value of the field {@code max_value}
     * @return The value of the field {@code max_value}
     */
    public float getMaxValue() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_value}
     * @param maxValue The new value of the field {@code max_value}
     */
    public void setMaxValue(float maxValue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxValue);
    }
    
    /**
     * Create a OtVarAxisT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OtVarAxisT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OtVarAxisT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OtVarAxisT(input, ownership);
    
    /**
     * A {@link OtVarAxisT.Builder} object constructs a {@link OtVarAxisT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OtVarAxisT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OtVarAxisT struct;
        
        private Builder() {
            struct = OtVarAxisT.allocate();
        }
        
         /**
         * Finish building the {@link OtVarAxisT} struct.
         * @return A new instance of {@code OtVarAxisT} with the fields 
         *         that were set in the Builder object.
         */
        public OtVarAxisT build() {
            return struct;
        }
        
        /**
         * axis tag
         * @param tag The value for the {@code tag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTag(org.harfbuzz.TagT tag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tag == null ? MemoryAddress.NULL : tag.getValue().intValue()));
            return this;
        }
        
        /**
         * axis name identifier
         * @param nameId The value for the {@code nameId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNameId(org.harfbuzz.OtNameIdT nameId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nameId == null ? MemoryAddress.NULL : nameId.getValue().intValue()));
            return this;
        }
        
        /**
         * minimum value of the axis
         * @param minValue The value for the {@code minValue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinValue(float minValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minValue);
            return this;
        }
        
        /**
         * default value of the axis
         * @param defaultValue The value for the {@code defaultValue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDefaultValue(float defaultValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), defaultValue);
            return this;
        }
        
        /**
         * maximum value of the axis
         * @param maxValue The value for the {@code maxValue} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxValue(float maxValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxValue);
            return this;
        }
    }
}
