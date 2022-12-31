package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLContextClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLContextClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_current_context"),
            Interop.valueLayout.ADDRESS.withName("get_gl_context"),
            Interop.valueLayout.ADDRESS.withName("get_gl_api"),
            Interop.valueLayout.ADDRESS.withName("get_gl_platform"),
            Interop.valueLayout.ADDRESS.withName("get_proc_address"),
            Interop.valueLayout.ADDRESS.withName("activate"),
            Interop.valueLayout.ADDRESS.withName("choose_format"),
            Interop.valueLayout.ADDRESS.withName("create_context"),
            Interop.valueLayout.ADDRESS.withName("destroy_context"),
            Interop.valueLayout.ADDRESS.withName("swap_buffers"),
            Interop.valueLayout.ADDRESS.withName("check_feature"),
            Interop.valueLayout.ADDRESS.withName("get_gl_platform_version"),
            Interop.valueLayout.ADDRESS.withName("get_config"),
            Interop.valueLayout.ADDRESS.withName("request_config"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLContextClass}
     * @return A new, uninitialized @{link GLContextClass}
     */
    public static GLContextClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLContextClass newInstance = new GLContextClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetCurrentContextCallback {
        long run();

        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCurrentContextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_current_context}
     * @param getCurrentContext The new value of the field {@code get_current_context}
     */
    public void setGetCurrentContext(GetCurrentContextCallback getCurrentContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_current_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCurrentContext == null ? MemoryAddress.NULL : getCurrentContext.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetGlContextCallback {
        long run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default long upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetGlContextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_context}
     * @param getGlContext The new value of the field {@code get_gl_context}
     */
    public void setGetGlContext(GetGlContextCallback getGlContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_gl_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlContext == null ? MemoryAddress.NULL : getGlContext.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetGlApiCallback {
        org.gstreamer.gl.GLAPI run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default int upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetGlApiCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_api}
     * @param getGlApi The new value of the field {@code get_gl_api}
     */
    public void setGetGlApi(GetGlApiCallback getGlApi) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_gl_api"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlApi == null ? MemoryAddress.NULL : getGlApi.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetGlPlatformCallback {
        org.gstreamer.gl.GLPlatform run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default int upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetGlPlatformCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_platform}
     * @param getGlPlatform The new value of the field {@code get_gl_platform}
     */
    public void setGetGlPlatform(GetGlPlatformCallback getGlPlatform) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlPlatform == null ? MemoryAddress.NULL : getGlPlatform.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetProcAddressCallback {
        java.lang.foreign.MemoryAddress run(org.gstreamer.gl.GLAPI glApi, java.lang.String name);

        @ApiStatus.Internal default Addressable upcall(int glApi, MemoryAddress name) {
            var RESULT = run(new org.gstreamer.gl.GLAPI(glApi), Marshal.addressToString.marshal(name, null));
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetProcAddressCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_proc_address}
     * @param getProcAddress The new value of the field {@code get_proc_address}
     */
    public void setGetProcAddress(GetProcAddressCallback getProcAddress) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_proc_address"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProcAddress == null ? MemoryAddress.NULL : getProcAddress.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivateCallback {
        boolean run(org.gstreamer.gl.GLContext context, boolean activate);

        @ApiStatus.Internal default int upcall(MemoryAddress context, int activate) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE), Marshal.integerToBoolean.marshal(activate, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
    }
    
    @FunctionalInterface
    public interface ChooseFormatCallback {
        boolean run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default int upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChooseFormatCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code choose_format}
     * @param chooseFormat The new value of the field {@code choose_format}
     */
    public void setChooseFormat(ChooseFormatCallback chooseFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("choose_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (chooseFormat == null ? MemoryAddress.NULL : chooseFormat.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateContextCallback {
        boolean run(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLAPI glApi, org.gstreamer.gl.GLContext otherContext);

        @ApiStatus.Internal default int upcall(MemoryAddress context, int glApi, MemoryAddress otherContext) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE), new org.gstreamer.gl.GLAPI(glApi), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(otherContext)), org.gstreamer.gl.GLContext.fromAddress).marshal(otherContext, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateContextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_context}
     * @param createContext The new value of the field {@code create_context}
     */
    public void setCreateContext(CreateContextCallback createContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
    }
    
    @FunctionalInterface
    public interface DestroyContextCallback {
        void run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DestroyContextCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code destroy_context}
     * @param destroyContext The new value of the field {@code destroy_context}
     */
    public void setDestroyContext(DestroyContextCallback destroyContext) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy_context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroyContext == null ? MemoryAddress.NULL : destroyContext.toCallback()));
    }
    
    @FunctionalInterface
    public interface SwapBuffersCallback {
        void run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SwapBuffersCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code swap_buffers}
     * @param swapBuffers The new value of the field {@code swap_buffers}
     */
    public void setSwapBuffers(SwapBuffersCallback swapBuffers) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("swap_buffers"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (swapBuffers == null ? MemoryAddress.NULL : swapBuffers.toCallback()));
    }
    
    @FunctionalInterface
    public interface CheckFeatureCallback {
        boolean run(org.gstreamer.gl.GLContext context, java.lang.String feature);

        @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress feature) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE), Marshal.addressToString.marshal(feature, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CheckFeatureCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code check_feature}
     * @param checkFeature The new value of the field {@code check_feature}
     */
    public void setCheckFeature(CheckFeatureCallback checkFeature) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("check_feature"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (checkFeature == null ? MemoryAddress.NULL : checkFeature.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetGlPlatformVersionCallback {
        void run(org.gstreamer.gl.GLContext context, Out<Integer> major, Out<Integer> minor);

        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress major, MemoryAddress minor) {
            Out<Integer> majorOUT = new Out<>(major.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> minorOUT = new Out<>(minor.get(Interop.valueLayout.C_INT, 0));
            run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE), majorOUT, minorOUT);
            major.set(Interop.valueLayout.C_INT, 0, majorOUT.get());
            minor.set(Interop.valueLayout.C_INT, 0, minorOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetGlPlatformVersionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_platform_version}
     * @param getGlPlatformVersion The new value of the field {@code get_gl_platform_version}
     */
    public void setGetGlPlatformVersion(GetGlPlatformVersionCallback getGlPlatformVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlPlatformVersion == null ? MemoryAddress.NULL : getGlPlatformVersion.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetConfigCallback {
        @Nullable org.gstreamer.gst.Structure run(org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetConfigCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_config}
     * @param getConfig The new value of the field {@code get_config}
     */
    public void setGetConfig(GetConfigCallback getConfig) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_config"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getConfig == null ? MemoryAddress.NULL : getConfig.toCallback()));
    }
    
    @FunctionalInterface
    public interface RequestConfigCallback {
        boolean run(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.Structure glConfig);

        @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress glConfig) {
            var RESULT = run((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(glConfig, Ownership.FULL));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RequestConfigCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_config}
     * @param requestConfig The new value of the field {@code request_config}
     */
    public void setRequestConfig(RequestConfigCallback requestConfig) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("request_config"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestConfig == null ? MemoryAddress.NULL : requestConfig.toCallback()));
    }
    
    /**
     * Create a GLContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLContextClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLContextClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLContextClass(input, ownership);
    
    /**
     * A {@link GLContextClass.Builder} object constructs a {@link GLContextClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLContextClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLContextClass struct;
        
        private Builder() {
            struct = GLContextClass.allocate();
        }
        
         /**
         * Finish building the {@link GLContextClass} struct.
         * @return A new instance of {@code GLContextClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLContextClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetCurrentContext(GetCurrentContextCallback getCurrentContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCurrentContext == null ? MemoryAddress.NULL : getCurrentContext.toCallback()));
            return this;
        }
        
        public Builder setGetGlContext(GetGlContextCallback getGlContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlContext == null ? MemoryAddress.NULL : getGlContext.toCallback()));
            return this;
        }
        
        public Builder setGetGlApi(GetGlApiCallback getGlApi) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_api"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlApi == null ? MemoryAddress.NULL : getGlApi.toCallback()));
            return this;
        }
        
        public Builder setGetGlPlatform(GetGlPlatformCallback getGlPlatform) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlPlatform == null ? MemoryAddress.NULL : getGlPlatform.toCallback()));
            return this;
        }
        
        public Builder setGetProcAddress(GetProcAddressCallback getProcAddress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_proc_address"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProcAddress == null ? MemoryAddress.NULL : getProcAddress.toCallback()));
            return this;
        }
        
        public Builder setActivate(ActivateCallback activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
            return this;
        }
        
        public Builder setChooseFormat(ChooseFormatCallback chooseFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("choose_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (chooseFormat == null ? MemoryAddress.NULL : chooseFormat.toCallback()));
            return this;
        }
        
        public Builder setCreateContext(CreateContextCallback createContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
            return this;
        }
        
        public Builder setDestroyContext(DestroyContextCallback destroyContext) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroyContext == null ? MemoryAddress.NULL : destroyContext.toCallback()));
            return this;
        }
        
        public Builder setSwapBuffers(SwapBuffersCallback swapBuffers) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("swap_buffers"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (swapBuffers == null ? MemoryAddress.NULL : swapBuffers.toCallback()));
            return this;
        }
        
        public Builder setCheckFeature(CheckFeatureCallback checkFeature) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("check_feature"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (checkFeature == null ? MemoryAddress.NULL : checkFeature.toCallback()));
            return this;
        }
        
        public Builder setGetGlPlatformVersion(GetGlPlatformVersionCallback getGlPlatformVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getGlPlatformVersion == null ? MemoryAddress.NULL : getGlPlatformVersion.toCallback()));
            return this;
        }
        
        public Builder setGetConfig(GetConfigCallback getConfig) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getConfig == null ? MemoryAddress.NULL : getConfig.toCallback()));
            return this;
        }
        
        public Builder setRequestConfig(RequestConfigCallback requestConfig) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requestConfig == null ? MemoryAddress.NULL : requestConfig.toCallback()));
            return this;
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
