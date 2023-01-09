package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The base class for GStreamer GL Video sources.
 * @version 1.18
 */
public class GLBaseSrcClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseSrcClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.PushSrcClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.C_INT.withName("supported_gl_api"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("gl_start"),
            Interop.valueLayout.ADDRESS.withName("gl_stop"),
            Interop.valueLayout.ADDRESS.withName("fill_gl_memory"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLBaseSrcClass}
     * @return A new, uninitialized @{link GLBaseSrcClass}
     */
    public static GLBaseSrcClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLBaseSrcClass newInstance = new GLBaseSrcClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.PushSrcClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.PushSrcClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.PushSrcClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code supported_gl_api}
     * @return The value of the field {@code supported_gl_api}
     */
    public org.gstreamer.gl.GLAPI getSupportedGlApi() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gl.GLAPI(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code supported_gl_api}
     * @param supportedGlApi The new value of the field {@code supported_gl_api}
     */
    public void setSupportedGlApi(org.gstreamer.gl.GLAPI supportedGlApi) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportedGlApi == null ? MemoryAddress.NULL : supportedGlApi.getValue()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GlStartCallback} callback.
     */
    @FunctionalInterface
    public interface GlStartCallback {
    
        boolean run(org.gstreamer.gl.GLBaseSrc src);
        
        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.gl.GLBaseSrc) Interop.register(src, org.gstreamer.gl.GLBaseSrc.fromAddress).marshal(src, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GlStartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code gl_start}
     * @param glStart The new value of the field {@code gl_start}
     */
    public void setGlStart(GlStartCallback glStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glStart == null ? MemoryAddress.NULL : glStart.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GlStopCallback} callback.
     */
    @FunctionalInterface
    public interface GlStopCallback {
    
        void run(org.gstreamer.gl.GLBaseSrc src);
        
        @ApiStatus.Internal default void upcall(MemoryAddress src) {
            run((org.gstreamer.gl.GLBaseSrc) Interop.register(src, org.gstreamer.gl.GLBaseSrc.fromAddress).marshal(src, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GlStopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code gl_stop}
     * @param glStop The new value of the field {@code gl_stop}
     */
    public void setGlStop(GlStopCallback glStop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glStop == null ? MemoryAddress.NULL : glStop.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FillGlMemoryCallback} callback.
     */
    @FunctionalInterface
    public interface FillGlMemoryCallback {
    
        boolean run(org.gstreamer.gl.GLBaseSrc src, org.gstreamer.gl.GLMemory mem);
        
        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress mem) {
            var RESULT = run((org.gstreamer.gl.GLBaseSrc) Interop.register(src, org.gstreamer.gl.GLBaseSrc.fromAddress).marshal(src, null), org.gstreamer.gl.GLMemory.fromAddress.marshal(mem, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FillGlMemoryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fill_gl_memory}
     * @param fillGlMemory The new value of the field {@code fill_gl_memory}
     */
    public void setFillGlMemory(FillGlMemoryCallback fillGlMemory) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fill_gl_memory"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fillGlMemory == null ? MemoryAddress.NULL : fillGlMemory.toCallback()));
        }
    }
    
    /**
     * Create a GLBaseSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLBaseSrcClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBaseSrcClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLBaseSrcClass(input);
    
    /**
     * A {@link GLBaseSrcClass.Builder} object constructs a {@link GLBaseSrcClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLBaseSrcClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLBaseSrcClass struct;
        
        private Builder() {
            struct = GLBaseSrcClass.allocate();
        }
        
        /**
         * Finish building the {@link GLBaseSrcClass} struct.
         * @return A new instance of {@code GLBaseSrcClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLBaseSrcClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.base.PushSrcClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        /**
         * the logical-OR of {@link GLAPI}'s supported by this element
         * @param supportedGlApi The value for the {@code supportedGlApi} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSupportedGlApi(org.gstreamer.gl.GLAPI supportedGlApi) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportedGlApi == null ? MemoryAddress.NULL : supportedGlApi.getValue()));
                return this;
            }
        }
        
        public Builder setGlStart(GlStartCallback glStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gl_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glStart == null ? MemoryAddress.NULL : glStart.toCallback()));
                return this;
            }
        }
        
        public Builder setGlStop(GlStopCallback glStop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gl_stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glStop == null ? MemoryAddress.NULL : glStop.toCallback()));
                return this;
            }
        }
        
        public Builder setFillGlMemory(FillGlMemoryCallback fillGlMemory) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fill_gl_memory"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fillGlMemory == null ? MemoryAddress.NULL : fillGlMemory.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false, SCOPE)));
                return this;
            }
        }
    }
}
