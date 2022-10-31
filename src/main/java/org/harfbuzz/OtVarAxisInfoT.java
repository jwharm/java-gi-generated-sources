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
public class OtVarAxisInfoT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_var_axis_info_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("axis_index"),
        ValueLayout.JAVA_INT.withName("tag"),
        ValueLayout.JAVA_INT.withName("name_id"),
        Interop.valueLayout.C_INT.withName("flags"),
        ValueLayout.JAVA_FLOAT.withName("min_value"),
        ValueLayout.JAVA_FLOAT.withName("default_value"),
        ValueLayout.JAVA_FLOAT.withName("max_value"),
        ValueLayout.JAVA_INT.withName("reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static OtVarAxisInfoT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtVarAxisInfoT newInstance = new OtVarAxisInfoT(Refcounted.get(segment.address()));
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
    
    @ApiStatus.Internal
    public OtVarAxisInfoT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
