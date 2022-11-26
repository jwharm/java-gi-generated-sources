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
         * @param path_open The value for the {@code path_open} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPathOpen(org.harfbuzz.BoolT path_open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (path_open == null ? MemoryAddress.NULL : path_open.getValue().intValue()));
            return this;
        }
        
        /**
         * X component of the start of current path
         * @param path_start_x The value for the {@code path_start_x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPathStartX(float path_start_x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), path_start_x);
            return this;
        }
        
        /**
         * Y component of the start of current path
         * @param path_start_y The value for the {@code path_start_y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPathStartY(float path_start_y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), path_start_y);
            return this;
        }
        
        /**
         * X component of current point
         * @param current_x The value for the {@code current_x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCurrentX(float current_x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), current_x);
            return this;
        }
        
        /**
         * Y component of current point
         * @param current_y The value for the {@code current_y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCurrentY(float current_y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), current_y);
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
