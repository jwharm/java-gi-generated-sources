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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLBaseSrcClass newInstance = new GLBaseSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.PushSrcClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.PushSrcClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.PushSrcClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    /**
     * Get the value of the field {@code supported_gl_api}
     * @return The value of the field {@code supported_gl_api}
     */
    public org.gstreamer.gl.GLAPI getSupportedGlApi() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    /**
     * Change the value of the field {@code supported_gl_api}
     * @param supportedGlApi The new value of the field {@code supported_gl_api}
     */
    public void setSupportedGlApi(org.gstreamer.gl.GLAPI supportedGlApi) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportedGlApi == null ? MemoryAddress.NULL : supportedGlApi.getValue()));
    }
    
    @FunctionalInterface
    public interface GlStartCallback {
        boolean run(org.gstreamer.gl.GLBaseSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.gl.GLBaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.gl.GLBaseSrc.fromAddress).marshal(src, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GlStartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code gl_start}
     * @param glStart The new value of the field {@code gl_start}
     */
    public void setGlStart(GlStartCallback glStart) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glStart == null ? MemoryAddress.NULL : glStart.toCallback()));
    }
    
    @FunctionalInterface
    public interface GlStopCallback {
        void run(org.gstreamer.gl.GLBaseSrc src);

        @ApiStatus.Internal default void upcall(MemoryAddress src) {
            run((org.gstreamer.gl.GLBaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.gl.GLBaseSrc.fromAddress).marshal(src, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GlStopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code gl_stop}
     * @param glStop The new value of the field {@code gl_stop}
     */
    public void setGlStop(GlStopCallback glStop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glStop == null ? MemoryAddress.NULL : glStop.toCallback()));
    }
    
    @FunctionalInterface
    public interface FillGlMemoryCallback {
        boolean run(org.gstreamer.gl.GLBaseSrc src, org.gstreamer.gl.GLMemory mem);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress mem) {
            var RESULT = run((org.gstreamer.gl.GLBaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.gl.GLBaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gl.GLMemory.fromAddress.marshal(mem, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FillGlMemoryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fill_gl_memory}
     * @param fillGlMemory The new value of the field {@code fill_gl_memory}
     */
    public void setFillGlMemory(FillGlMemoryCallback fillGlMemory) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fill_gl_memory"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fillGlMemory == null ? MemoryAddress.NULL : fillGlMemory.toCallback()));
    }
    
    /**
     * Create a GLBaseSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLBaseSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBaseSrcClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLBaseSrcClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * the logical-OR of {@link GLAPI}'s supported by this element
         * @param supportedGlApi The value for the {@code supportedGlApi} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSupportedGlApi(org.gstreamer.gl.GLAPI supportedGlApi) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supported_gl_api"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportedGlApi == null ? MemoryAddress.NULL : supportedGlApi.getValue()));
            return this;
        }
        
        public Builder setGlStart(GlStartCallback glStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glStart == null ? MemoryAddress.NULL : glStart.toCallback()));
            return this;
        }
        
        public Builder setGlStop(GlStopCallback glStop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glStop == null ? MemoryAddress.NULL : glStop.toCallback()));
            return this;
        }
        
        public Builder setFillGlMemory(FillGlMemoryCallback fillGlMemory) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fill_gl_memory"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fillGlMemory == null ? MemoryAddress.NULL : fillGlMemory.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
