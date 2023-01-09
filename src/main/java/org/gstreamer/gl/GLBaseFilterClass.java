package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The base class for GStreamer GL Filter.
 */
public class GLBaseFilterClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseFilterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseTransformClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.C_INT.withName("supported_gl_api"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("gl_start"),
            Interop.valueLayout.ADDRESS.withName("gl_stop"),
            Interop.valueLayout.ADDRESS.withName("gl_set_caps"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLBaseFilterClass}
     * @return A new, uninitialized @{link GLBaseFilterClass}
     */
    public static GLBaseFilterClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLBaseFilterClass newInstance = new GLBaseFilterClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.BaseTransformClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.BaseTransformClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.BaseTransformClass parentClass) {
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
    
        boolean run(org.gstreamer.gl.GLBaseFilter filter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter) {
            var RESULT = run((org.gstreamer.gl.GLBaseFilter) Interop.register(filter, org.gstreamer.gl.GLBaseFilter.fromAddress).marshal(filter, null));
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
    
        void run(org.gstreamer.gl.GLBaseFilter filter);
        
        @ApiStatus.Internal default void upcall(MemoryAddress filter) {
            run((org.gstreamer.gl.GLBaseFilter) Interop.register(filter, org.gstreamer.gl.GLBaseFilter.fromAddress).marshal(filter, null));
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
     * Functional interface declaration of the {@code GlSetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface GlSetCapsCallback {
    
        boolean run(org.gstreamer.gl.GLBaseFilter filter, org.gstreamer.gst.Caps incaps, org.gstreamer.gst.Caps outcaps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress incaps, MemoryAddress outcaps) {
            var RESULT = run((org.gstreamer.gl.GLBaseFilter) Interop.register(filter, org.gstreamer.gl.GLBaseFilter.fromAddress).marshal(filter, null), org.gstreamer.gst.Caps.fromAddress.marshal(incaps, null), org.gstreamer.gst.Caps.fromAddress.marshal(outcaps, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GlSetCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code gl_set_caps}
     * @param glSetCaps The new value of the field {@code gl_set_caps}
     */
    public void setGlSetCaps(GlSetCapsCallback glSetCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glSetCaps == null ? MemoryAddress.NULL : glSetCaps.toCallback()));
        }
    }
    
    /**
     * Create a GLBaseFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLBaseFilterClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBaseFilterClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLBaseFilterClass(input);
    
    /**
     * A {@link GLBaseFilterClass.Builder} object constructs a {@link GLBaseFilterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLBaseFilterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLBaseFilterClass struct;
        
        private Builder() {
            struct = GLBaseFilterClass.allocate();
        }
        
        /**
         * Finish building the {@link GLBaseFilterClass} struct.
         * @return A new instance of {@code GLBaseFilterClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLBaseFilterClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.base.BaseTransformClass parentClass) {
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
        
        public Builder setGlSetCaps(GlSetCapsCallback glSetCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gl_set_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glSetCaps == null ? MemoryAddress.NULL : glSetCaps.toCallback()));
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
