package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLFilterClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLFilterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLBaseFilterClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("set_caps"),
            Interop.valueLayout.ADDRESS.withName("filter"),
            Interop.valueLayout.ADDRESS.withName("filter_texture"),
            Interop.valueLayout.ADDRESS.withName("init_fbo"),
            Interop.valueLayout.ADDRESS.withName("transform_internal_caps"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLFilterClass}
     * @return A new, uninitialized @{link GLFilterClass}
     */
    public static GLFilterClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLFilterClass newInstance = new GLFilterClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gl.GLBaseFilterClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gl.GLBaseFilterClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gl.GLBaseFilterClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface SetCapsCallback {
    
        boolean run(org.gstreamer.gl.GLFilter filter, org.gstreamer.gst.Caps incaps, org.gstreamer.gst.Caps outcaps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress incaps, MemoryAddress outcaps) {
            var RESULT = run((org.gstreamer.gl.GLFilter) Interop.register(filter, org.gstreamer.gl.GLFilter.fromAddress).marshal(filter, null), org.gstreamer.gst.Caps.fromAddress.marshal(incaps, null), org.gstreamer.gst.Caps.fromAddress.marshal(outcaps, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps}
     * @param setCaps The new value of the field {@code set_caps}
     */
    public void setSetCaps(SetCapsCallback setCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FilterCallback} callback.
     */
    @FunctionalInterface
    public interface FilterCallback {
    
        boolean run(org.gstreamer.gl.GLFilter filter, org.gstreamer.gst.Buffer inbuf, org.gstreamer.gst.Buffer outbuf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress inbuf, MemoryAddress outbuf) {
            var RESULT = run((org.gstreamer.gl.GLFilter) Interop.register(filter, org.gstreamer.gl.GLFilter.fromAddress).marshal(filter, null), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuf, null), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FilterCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code filter}
     * @param filter The new value of the field {@code filter}
     */
    public void setFilter(FilterCallback filter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filter == null ? MemoryAddress.NULL : filter.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FilterTextureCallback} callback.
     */
    @FunctionalInterface
    public interface FilterTextureCallback {
    
        boolean run(org.gstreamer.gl.GLFilter filter, org.gstreamer.gl.GLMemory input, org.gstreamer.gl.GLMemory output);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress input, MemoryAddress output) {
            var RESULT = run((org.gstreamer.gl.GLFilter) Interop.register(filter, org.gstreamer.gl.GLFilter.fromAddress).marshal(filter, null), org.gstreamer.gl.GLMemory.fromAddress.marshal(input, null), org.gstreamer.gl.GLMemory.fromAddress.marshal(output, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FilterTextureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code filter_texture}
     * @param filterTexture The new value of the field {@code filter_texture}
     */
    public void setFilterTexture(FilterTextureCallback filterTexture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_texture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filterTexture == null ? MemoryAddress.NULL : filterTexture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InitFboCallback} callback.
     */
    @FunctionalInterface
    public interface InitFboCallback {
    
        boolean run(org.gstreamer.gl.GLFilter filter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter) {
            var RESULT = run((org.gstreamer.gl.GLFilter) Interop.register(filter, org.gstreamer.gl.GLFilter.fromAddress).marshal(filter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InitFboCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code init_fbo}
     * @param initFbo The new value of the field {@code init_fbo}
     */
    public void setInitFbo(InitFboCallback initFbo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("init_fbo"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (initFbo == null ? MemoryAddress.NULL : initFbo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TransformInternalCapsCallback} callback.
     */
    @FunctionalInterface
    public interface TransformInternalCapsCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.gl.GLFilter filter, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps filterCaps);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress filter, int direction, MemoryAddress caps, MemoryAddress filterCaps) {
            var RESULT = run((org.gstreamer.gl.GLFilter) Interop.register(filter, org.gstreamer.gl.GLFilter.fromAddress).marshal(filter, null), org.gstreamer.gst.PadDirection.of(direction), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null), org.gstreamer.gst.Caps.fromAddress.marshal(filterCaps, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TransformInternalCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_internal_caps}
     * @param transformInternalCaps The new value of the field {@code transform_internal_caps}
     */
    public void setTransformInternalCaps(TransformInternalCapsCallback transformInternalCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_internal_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformInternalCaps == null ? MemoryAddress.NULL : transformInternalCaps.toCallback()));
        }
    }
    
    /**
     * Create a GLFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLFilterClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLFilterClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLFilterClass(input);
    
    /**
     * A {@link GLFilterClass.Builder} object constructs a {@link GLFilterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLFilterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLFilterClass struct;
        
        private Builder() {
            struct = GLFilterClass.allocate();
        }
        
        /**
         * Finish building the {@link GLFilterClass} struct.
         * @return A new instance of {@code GLFilterClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLFilterClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gl.GLBaseFilterClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setFilter(FilterCallback filter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("filter"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filter == null ? MemoryAddress.NULL : filter.toCallback()));
                return this;
            }
        }
        
        public Builder setFilterTexture(FilterTextureCallback filterTexture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("filter_texture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (filterTexture == null ? MemoryAddress.NULL : filterTexture.toCallback()));
                return this;
            }
        }
        
        public Builder setInitFbo(InitFboCallback initFbo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("init_fbo"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (initFbo == null ? MemoryAddress.NULL : initFbo.toCallback()));
                return this;
            }
        }
        
        public Builder setTransformInternalCaps(TransformInternalCapsCallback transformInternalCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_internal_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformInternalCaps == null ? MemoryAddress.NULL : transformInternalCaps.toCallback()));
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
