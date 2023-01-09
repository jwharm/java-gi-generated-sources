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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DrawStateT}
     * @return A new, uninitialized @{link DrawStateT}
     */
    public static DrawStateT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DrawStateT newInstance = new DrawStateT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code path_open}
     * @return The value of the field {@code path_open}
     */
    public org.harfbuzz.BoolT getPathOpen() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.BoolT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code path_open}
     * @param pathOpen The new value of the field {@code path_open}
     */
    public void setPathOpen(org.harfbuzz.BoolT pathOpen) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pathOpen == null ? MemoryAddress.NULL : pathOpen.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code path_start_x}
     * @return The value of the field {@code path_start_x}
     */
    public float getPathStartX() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code path_start_x}
     * @param pathStartX The new value of the field {@code path_start_x}
     */
    public void setPathStartX(float pathStartX) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), pathStartX);
        }
    }
    
    /**
     * Get the value of the field {@code path_start_y}
     * @return The value of the field {@code path_start_y}
     */
    public float getPathStartY() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code path_start_y}
     * @param pathStartY The new value of the field {@code path_start_y}
     */
    public void setPathStartY(float pathStartY) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), pathStartY);
        }
    }
    
    /**
     * Get the value of the field {@code current_x}
     * @return The value of the field {@code current_x}
     */
    public float getCurrentX() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code current_x}
     * @param currentX The new value of the field {@code current_x}
     */
    public void setCurrentX(float currentX) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), currentX);
        }
    }
    
    /**
     * Get the value of the field {@code current_y}
     * @return The value of the field {@code current_y}
     */
    public float getCurrentY() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (float) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code current_y}
     * @param currentY The new value of the field {@code current_y}
     */
    public void setCurrentY(float currentY) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), currentY);
        }
    }
    
    /**
     * Create a DrawStateT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DrawStateT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DrawStateT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DrawStateT(input);
    
    /**
     * A {@link DrawStateT.Builder} object constructs a {@link DrawStateT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DrawStateT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DrawStateT struct;
        
        private Builder() {
            struct = DrawStateT.allocate();
        }
        
        /**
         * Finish building the {@link DrawStateT} struct.
         * @return A new instance of {@code DrawStateT} with the fields 
         *         that were set in the Builder object.
         */
        public DrawStateT build() {
            return struct;
        }
        
        /**
         * Whether there is an open path
         * @param pathOpen The value for the {@code pathOpen} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPathOpen(org.harfbuzz.BoolT pathOpen) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("path_open"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pathOpen == null ? MemoryAddress.NULL : pathOpen.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * X component of the start of current path
         * @param pathStartX The value for the {@code pathStartX} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPathStartX(float pathStartX) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("path_start_x"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), pathStartX);
                return this;
            }
        }
        
        /**
         * Y component of the start of current path
         * @param pathStartY The value for the {@code pathStartY} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPathStartY(float pathStartY) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("path_start_y"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), pathStartY);
                return this;
            }
        }
        
        /**
         * X component of current point
         * @param currentX The value for the {@code currentX} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentX(float currentX) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("current_x"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), currentX);
                return this;
            }
        }
        
        /**
         * Y component of current point
         * @param currentY The value for the {@code currentY} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentY(float currentY) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("current_y"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), currentY);
                return this;
            }
        }
        
        public Builder setReserved1(org.harfbuzz.VarNumT reserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved1 == null ? MemoryAddress.NULL : reserved1.handle()));
                return this;
            }
        }
        
        public Builder setReserved2(org.harfbuzz.VarNumT reserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved2 == null ? MemoryAddress.NULL : reserved2.handle()));
                return this;
            }
        }
        
        public Builder setReserved3(org.harfbuzz.VarNumT reserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved3 == null ? MemoryAddress.NULL : reserved3.handle()));
                return this;
            }
        }
        
        public Builder setReserved4(org.harfbuzz.VarNumT reserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved4 == null ? MemoryAddress.NULL : reserved4.handle()));
                return this;
            }
        }
        
        public Builder setReserved5(org.harfbuzz.VarNumT reserved5) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved5"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved5 == null ? MemoryAddress.NULL : reserved5.handle()));
                return this;
            }
        }
        
        public Builder setReserved6(org.harfbuzz.VarNumT reserved6) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved6"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved6 == null ? MemoryAddress.NULL : reserved6.handle()));
                return this;
            }
        }
        
        public Builder setReserved7(org.harfbuzz.VarNumT reserved7) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved7"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved7 == null ? MemoryAddress.NULL : reserved7.handle()));
                return this;
            }
        }
    }
}
