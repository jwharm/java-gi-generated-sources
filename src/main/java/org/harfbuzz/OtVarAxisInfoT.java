package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding variation-axis values.
 * <p>
 * The minimum, default, and maximum values are in un-normalized, user scales.
 * <p>
 * &lt;note&gt;Note: at present, the only flag defined for {@code flags} is
 * {@code HB_OT_VAR_AXIS_FLAG_HIDDEN}.&lt;/note&gt;
 * @version 2.2.0
 */
public class OtVarAxisInfoT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_var_axis_info_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("axis_index"),
        Interop.valueLayout.C_INT.withName("tag"),
        Interop.valueLayout.C_INT.withName("name_id"),
        Interop.valueLayout.C_INT.withName("flags"),
        Interop.valueLayout.C_FLOAT.withName("min_value"),
        Interop.valueLayout.C_FLOAT.withName("default_value"),
        Interop.valueLayout.C_FLOAT.withName("max_value"),
        Interop.valueLayout.C_INT.withName("reserved")
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
     * Allocate a new {@link OtVarAxisInfoT}
     * @return A new, uninitialized @{link OtVarAxisInfoT}
     */
    public static OtVarAxisInfoT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtVarAxisInfoT newInstance = new OtVarAxisInfoT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code axis_index}
     * @return The value of the field {@code axis_index}
     */
    public int axis_index$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("axis_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code axis_index}
     * @param axis_index The new value of the field {@code axis_index}
     */
    public void axis_index$set(int axis_index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("axis_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), axis_index);
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
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.harfbuzz.OtVarAxisFlagsT flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.OtVarAxisFlagsT(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.harfbuzz.OtVarAxisFlagsT flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
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
     * Create a OtVarAxisInfoT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OtVarAxisInfoT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OtVarAxisInfoT struct;
        
         /**
         * A {@link OtVarAxisInfoT.Build} object constructs a {@link OtVarAxisInfoT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OtVarAxisInfoT.allocate();
        }
        
         /**
         * Finish building the {@link OtVarAxisInfoT} struct.
         * @return A new instance of {@code OtVarAxisInfoT} with the fields 
         *         that were set in the Build object.
         */
        public OtVarAxisInfoT construct() {
            return struct;
        }
        
        /**
         * Index of the axis in the variation-axis array
         * @param axis_index The value for the {@code axis_index} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAxisIndex(int axis_index) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("axis_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), axis_index);
            return this;
        }
        
        /**
         * The {@link TagT} tag identifying the design variation of the axis
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
         * The {@code name} table Name ID that provides display names for the axis
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
         * The {@link OtVarAxisFlagsT} flags for the axis
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.harfbuzz.OtVarAxisFlagsT flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * The minimum value on the variation axis that the font covers
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
         * The position on the variation axis corresponding to the font's defaults
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
         * The maximum value on the variation axis that the font covers
         * @param max_value The value for the {@code max_value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxValue(float max_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), max_value);
            return this;
        }
        
        public Build setReserved(int reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), reserved);
            return this;
        }
    }
}
