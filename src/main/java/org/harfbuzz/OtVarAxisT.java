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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("tag"),
        Interop.valueLayout.C_INT.withName("name_id"),
        Interop.valueLayout.C_FLOAT.withName("min_value"),
        Interop.valueLayout.C_FLOAT.withName("default_value"),
        Interop.valueLayout.C_FLOAT.withName("max_value")
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
    public org.harfbuzz.TagT tag$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.TagT(RESULT);
    }
    
    /**
     * Change the value of the field {@code tag}
     * @param tag The new value of the field {@code tag}
     */
    public void tag$set(org.harfbuzz.TagT tag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tag.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code name_id}
     * @return The value of the field {@code name_id}
     */
    public org.harfbuzz.OtNameIdT name_id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Change the value of the field {@code name_id}
     * @param name_id The new value of the field {@code name_id}
     */
    public void name_id$set(org.harfbuzz.OtNameIdT name_id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), name_id.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code min_value}
     * @return The value of the field {@code min_value}
     */
    public float min_value$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_value}
     * @param min_value The new value of the field {@code min_value}
     */
    public void min_value$set(float min_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), min_value);
    }
    
    /**
     * Get the value of the field {@code default_value}
     * @return The value of the field {@code default_value}
     */
    public float default_value$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code default_value}
     * @param default_value The new value of the field {@code default_value}
     */
    public void default_value$set(float default_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), default_value);
    }
    
    /**
     * Get the value of the field {@code max_value}
     * @return The value of the field {@code max_value}
     */
    public float max_value$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_value}
     * @param max_value The new value of the field {@code max_value}
     */
    public void max_value$set(float max_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), max_value);
    }
    
    /**
     * Create a OtVarAxisT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OtVarAxisT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OtVarAxisT struct;
        
         /**
         * A {@link OtVarAxisT.Build} object constructs a {@link OtVarAxisT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OtVarAxisT.allocate();
        }
        
         /**
         * Finish building the {@link OtVarAxisT} struct.
         * @return A new instance of {@code OtVarAxisT} with the fields 
         *         that were set in the Build object.
         */
        public OtVarAxisT construct() {
            return struct;
        }
        
        /**
         * axis tag
         * @param tag The value for the {@code tag} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTag(org.harfbuzz.TagT tag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tag == null ? MemoryAddress.NULL : tag.getValue().intValue()));
            return this;
        }
        
        /**
         * axis name identifier
         * @param name_id The value for the {@code name_id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNameId(org.harfbuzz.OtNameIdT name_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name_id == null ? MemoryAddress.NULL : name_id.getValue().intValue()));
            return this;
        }
        
        /**
         * minimum value of the axis
         * @param min_value The value for the {@code min_value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinValue(float min_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), min_value);
            return this;
        }
        
        /**
         * default value of the axis
         * @param default_value The value for the {@code default_value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDefaultValue(float default_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("default_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), default_value);
            return this;
        }
        
        /**
         * maximum value of the axis
         * @param max_value The value for the {@code max_value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxValue(float max_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), max_value);
            return this;
        }
    }
}
