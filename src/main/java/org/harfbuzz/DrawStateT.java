package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Current drawing state.
 * @version 4.0.0
 */
public class DrawStateT extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_draw_state_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("path_open"),
        ValueLayout.JAVA_FLOAT.withName("path_start_x"),
        ValueLayout.JAVA_FLOAT.withName("path_start_y"),
        ValueLayout.JAVA_FLOAT.withName("current_x"),
        ValueLayout.JAVA_FLOAT.withName("current_y"),
        MemoryLayout.paddingLayout(32),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved1"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved2"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved3"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved4"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved5"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved6"),
        org.harfbuzz.VarNumT.getMemoryLayout().withName("reserved7")
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
    
    public static DrawStateT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DrawStateT newInstance = new DrawStateT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code path_open}
     * @return The value of the field {@code path_open}
     */
    public org.harfbuzz.BoolT path_open$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Change the value of the field {@code path_open}
     * @param path_open The new value of the field {@code path_open}
     */
    public void path_open$set(org.harfbuzz.BoolT path_open) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), path_open.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code path_start_x}
     * @return The value of the field {@code path_start_x}
     */
    public float path_start_x$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code path_start_x}
     * @param path_start_x The new value of the field {@code path_start_x}
     */
    public void path_start_x$set(float path_start_x) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), path_start_x);
    }
    
    /**
     * Get the value of the field {@code path_start_y}
     * @return The value of the field {@code path_start_y}
     */
    public float path_start_y$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code path_start_y}
     * @param path_start_y The new value of the field {@code path_start_y}
     */
    public void path_start_y$set(float path_start_y) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), path_start_y);
    }
    
    /**
     * Get the value of the field {@code current_x}
     * @return The value of the field {@code current_x}
     */
    public float current_x$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code current_x}
     * @param current_x The new value of the field {@code current_x}
     */
    public void current_x$set(float current_x) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), current_x);
    }
    
    /**
     * Get the value of the field {@code current_y}
     * @return The value of the field {@code current_y}
     */
    public float current_y$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code current_y}
     * @param current_y The new value of the field {@code current_y}
     */
    public void current_y$set(float current_y) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), current_y);
    }
    
    /**
     * Create a DrawStateT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DrawStateT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
