package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Current drawing state.
 * @version 4.0.0
 */
public class DrawStateT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_draw_state_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("path_open"),
        Interop.valueLayout.C_FLOAT.withName("path_start_x"),
        Interop.valueLayout.C_FLOAT.withName("path_start_y"),
        Interop.valueLayout.C_FLOAT.withName("current_x"),
        Interop.valueLayout.C_FLOAT.withName("current_y"),
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
    
    /**
     * Allocate a new {@link DrawStateT}
     * @return A new, uninitialized @{link DrawStateT}
     */
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
    public org.harfbuzz.BoolT pathOpen$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Change the value of the field {@code path_open}
     * @param pathOpen The new value of the field {@code path_open}
     */
    public void pathOpen$set(org.harfbuzz.BoolT pathOpen) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pathOpen.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code path_start_x}
     * @return The value of the field {@code path_start_x}
     */
    public float pathStartX$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code path_start_x}
     * @param pathStartX The new value of the field {@code path_start_x}
     */
    public void pathStartX$set(float pathStartX) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pathStartX);
    }
    
    /**
     * Get the value of the field {@code path_start_y}
     * @return The value of the field {@code path_start_y}
     */
    public float pathStartY$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code path_start_y}
     * @param pathStartY The new value of the field {@code path_start_y}
     */
    public void pathStartY$set(float pathStartY) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pathStartY);
    }
    
    /**
     * Get the value of the field {@code current_x}
     * @return The value of the field {@code current_x}
     */
    public float currentX$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code current_x}
     * @param currentX The new value of the field {@code current_x}
     */
    public void currentX$set(float currentX) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), currentX);
    }
    
    /**
     * Get the value of the field {@code current_y}
     * @return The value of the field {@code current_y}
     */
    public float currentY$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code current_y}
     * @param currentY The new value of the field {@code current_y}
     */
    public void currentY$set(float currentY) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), currentY);
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

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DrawStateT struct;
        
         /**
         * A {@link DrawStateT.Build} object constructs a {@link DrawStateT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DrawStateT.allocate();
        }
        
         /**
         * Finish building the {@link DrawStateT} struct.
         * @return A new instance of {@code DrawStateT} with the fields 
         *         that were set in the Build object.
         */
        public DrawStateT construct() {
            return struct;
        }
        
        /**
         * Whether there is an open path
         * @param pathOpen The value for the {@code pathOpen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPathOpen(org.harfbuzz.BoolT pathOpen) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pathOpen == null ? MemoryAddress.NULL : pathOpen.getValue().intValue()));
            return this;
        }
        
        /**
         * X component of the start of current path
         * @param pathStartX The value for the {@code pathStartX} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPathStartX(float pathStartX) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pathStartX);
            return this;
        }
        
        /**
         * Y component of the start of current path
         * @param pathStartY The value for the {@code pathStartY} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPathStartY(float pathStartY) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pathStartY);
            return this;
        }
        
        /**
         * X component of current point
         * @param currentX The value for the {@code currentX} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCurrentX(float currentX) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), currentX);
            return this;
        }
        
        /**
         * Y component of current point
         * @param currentY The value for the {@code currentY} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCurrentY(float currentY) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), currentY);
            return this;
        }
        
        public Build setReserved1(org.harfbuzz.VarNumT reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved1 == null ? MemoryAddress.NULL : reserved1.handle()));
            return this;
        }
        
        public Build setReserved2(org.harfbuzz.VarNumT reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved2 == null ? MemoryAddress.NULL : reserved2.handle()));
            return this;
        }
        
        public Build setReserved3(org.harfbuzz.VarNumT reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved3 == null ? MemoryAddress.NULL : reserved3.handle()));
            return this;
        }
        
        public Build setReserved4(org.harfbuzz.VarNumT reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved4 == null ? MemoryAddress.NULL : reserved4.handle()));
            return this;
        }
        
        public Build setReserved5(org.harfbuzz.VarNumT reserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved5 == null ? MemoryAddress.NULL : reserved5.handle()));
            return this;
        }
        
        public Build setReserved6(org.harfbuzz.VarNumT reserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved6 == null ? MemoryAddress.NULL : reserved6.handle()));
            return this;
        }
        
        public Build setReserved7(org.harfbuzz.VarNumT reserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved7 == null ? MemoryAddress.NULL : reserved7.handle()));
            return this;
        }
    }
}
