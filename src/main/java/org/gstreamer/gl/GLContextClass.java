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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLContextClass newInstance = new GLContextClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCurrentContextCallback} callback.
     */
    @FunctionalInterface
    public interface GetCurrentContextCallback {
    
        long run();
        
        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCurrentContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_current_context}
     * @param getCurrentContext The new value of the field {@code get_current_context}
     */
    public void setGetCurrentContext(GetCurrentContextCallback getCurrentContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_current_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCurrentContext == null ? MemoryAddress.NULL : getCurrentContext.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetGlContextCallback} callback.
     */
    @FunctionalInterface
    public interface GetGlContextCallback {
    
        long run(org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default long upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetGlContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_context}
     * @param getGlContext The new value of the field {@code get_gl_context}
     */
    public void setGetGlContext(GetGlContextCallback getGlContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlContext == null ? MemoryAddress.NULL : getGlContext.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetGlApiCallback} callback.
     */
    @FunctionalInterface
    public interface GetGlApiCallback {
    
        org.gstreamer.gl.GLAPI run(org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetGlApiCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_api}
     * @param getGlApi The new value of the field {@code get_gl_api}
     */
    public void setGetGlApi(GetGlApiCallback getGlApi) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_api"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlApi == null ? MemoryAddress.NULL : getGlApi.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetGlPlatformCallback} callback.
     */
    @FunctionalInterface
    public interface GetGlPlatformCallback {
    
        org.gstreamer.gl.GLPlatform run(org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetGlPlatformCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_platform}
     * @param getGlPlatform The new value of the field {@code get_gl_platform}
     */
    public void setGetGlPlatform(GetGlPlatformCallback getGlPlatform) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlPlatform == null ? MemoryAddress.NULL : getGlPlatform.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetProcAddressCallback} callback.
     */
    @FunctionalInterface
    public interface GetProcAddressCallback {
    
        java.lang.foreign.MemoryAddress run(org.gstreamer.gl.GLAPI glApi, java.lang.String name);
        
        @ApiStatus.Internal default Addressable upcall(int glApi, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(new org.gstreamer.gl.GLAPI(glApi), Marshal.addressToString.marshal(name, null));
                return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetProcAddressCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_proc_address}
     * @param getProcAddress The new value of the field {@code get_proc_address}
     */
    public void setGetProcAddress(GetProcAddressCallback getProcAddress) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_proc_address"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProcAddress == null ? MemoryAddress.NULL : getProcAddress.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateCallback {
    
        boolean run(org.gstreamer.gl.GLContext context, boolean activate);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, int activate) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null), Marshal.integerToBoolean.marshal(activate, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChooseFormatCallback} callback.
     */
    @FunctionalInterface
    public interface ChooseFormatCallback {
    
        boolean run(org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChooseFormatCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code choose_format}
     * @param chooseFormat The new value of the field {@code choose_format}
     */
    public void setChooseFormat(ChooseFormatCallback chooseFormat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("choose_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (chooseFormat == null ? MemoryAddress.NULL : chooseFormat.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateContextCallback} callback.
     */
    @FunctionalInterface
    public interface CreateContextCallback {
    
        boolean run(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLAPI glApi, org.gstreamer.gl.GLContext otherContext);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, int glApi, MemoryAddress otherContext) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null), new org.gstreamer.gl.GLAPI(glApi), (org.gstreamer.gl.GLContext) Interop.register(otherContext, org.gstreamer.gl.GLContext.fromAddress).marshal(otherContext, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_context}
     * @param createContext The new value of the field {@code create_context}
     */
    public void setCreateContext(CreateContextCallback createContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DestroyContextCallback} callback.
     */
    @FunctionalInterface
    public interface DestroyContextCallback {
    
        void run(org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DestroyContextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code destroy_context}
     * @param destroyContext The new value of the field {@code destroy_context}
     */
    public void setDestroyContext(DestroyContextCallback destroyContext) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyContext == null ? MemoryAddress.NULL : destroyContext.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SwapBuffersCallback} callback.
     */
    @FunctionalInterface
    public interface SwapBuffersCallback {
    
        void run(org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SwapBuffersCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code swap_buffers}
     * @param swapBuffers The new value of the field {@code swap_buffers}
     */
    public void setSwapBuffers(SwapBuffersCallback swapBuffers) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("swap_buffers"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (swapBuffers == null ? MemoryAddress.NULL : swapBuffers.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CheckFeatureCallback} callback.
     */
    @FunctionalInterface
    public interface CheckFeatureCallback {
    
        boolean run(org.gstreamer.gl.GLContext context, java.lang.String feature);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress feature) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null), Marshal.addressToString.marshal(feature, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CheckFeatureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code check_feature}
     * @param checkFeature The new value of the field {@code check_feature}
     */
    public void setCheckFeature(CheckFeatureCallback checkFeature) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("check_feature"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (checkFeature == null ? MemoryAddress.NULL : checkFeature.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetGlPlatformVersionCallback} callback.
     */
    @FunctionalInterface
    public interface GetGlPlatformVersionCallback {
    
        void run(org.gstreamer.gl.GLContext context, Out<Integer> major, Out<Integer> minor);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress major, MemoryAddress minor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> majorOUT = new Out<>(major.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> minorOUT = new Out<>(minor.get(Interop.valueLayout.C_INT, 0));
                run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null), majorOUT, minorOUT);
                major.set(Interop.valueLayout.C_INT, 0, majorOUT.get());
                minor.set(Interop.valueLayout.C_INT, 0, minorOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetGlPlatformVersionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_gl_platform_version}
     * @param getGlPlatformVersion The new value of the field {@code get_gl_platform_version}
     */
    public void setGetGlPlatformVersion(GetGlPlatformVersionCallback getGlPlatformVersion) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlPlatformVersion == null ? MemoryAddress.NULL : getGlPlatformVersion.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetConfigCallback} callback.
     */
    @FunctionalInterface
    public interface GetConfigCallback {
    
        @Nullable org.gstreamer.gst.Structure run(org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress context) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetConfigCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_config}
     * @param getConfig The new value of the field {@code get_config}
     */
    public void setGetConfig(GetConfigCallback getConfig) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getConfig == null ? MemoryAddress.NULL : getConfig.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RequestConfigCallback} callback.
     */
    @FunctionalInterface
    public interface RequestConfigCallback {
    
        boolean run(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.Structure glConfig);
        
        @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress glConfig) {
            var RESULT = run((org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null), org.gstreamer.gst.Structure.fromAddress.marshal(glConfig, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RequestConfigCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code request_config}
     * @param requestConfig The new value of the field {@code request_config}
     */
    public void setRequestConfig(RequestConfigCallback requestConfig) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestConfig == null ? MemoryAddress.NULL : requestConfig.toCallback()));
        }
    }
    
    /**
     * Create a GLContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLContextClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLContextClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLContextClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetCurrentContext(GetCurrentContextCallback getCurrentContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_current_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCurrentContext == null ? MemoryAddress.NULL : getCurrentContext.toCallback()));
                return this;
            }
        }
        
        public Builder setGetGlContext(GetGlContextCallback getGlContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_gl_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlContext == null ? MemoryAddress.NULL : getGlContext.toCallback()));
                return this;
            }
        }
        
        public Builder setGetGlApi(GetGlApiCallback getGlApi) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_gl_api"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlApi == null ? MemoryAddress.NULL : getGlApi.toCallback()));
                return this;
            }
        }
        
        public Builder setGetGlPlatform(GetGlPlatformCallback getGlPlatform) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlPlatform == null ? MemoryAddress.NULL : getGlPlatform.toCallback()));
                return this;
            }
        }
        
        public Builder setGetProcAddress(GetProcAddressCallback getProcAddress) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_proc_address"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProcAddress == null ? MemoryAddress.NULL : getProcAddress.toCallback()));
                return this;
            }
        }
        
        public Builder setActivate(ActivateCallback activate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
                return this;
            }
        }
        
        public Builder setChooseFormat(ChooseFormatCallback chooseFormat) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("choose_format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (chooseFormat == null ? MemoryAddress.NULL : chooseFormat.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateContext(CreateContextCallback createContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createContext == null ? MemoryAddress.NULL : createContext.toCallback()));
                return this;
            }
        }
        
        public Builder setDestroyContext(DestroyContextCallback destroyContext) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("destroy_context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyContext == null ? MemoryAddress.NULL : destroyContext.toCallback()));
                return this;
            }
        }
        
        public Builder setSwapBuffers(SwapBuffersCallback swapBuffers) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("swap_buffers"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (swapBuffers == null ? MemoryAddress.NULL : swapBuffers.toCallback()));
                return this;
            }
        }
        
        public Builder setCheckFeature(CheckFeatureCallback checkFeature) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("check_feature"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (checkFeature == null ? MemoryAddress.NULL : checkFeature.toCallback()));
                return this;
            }
        }
        
        public Builder setGetGlPlatformVersion(GetGlPlatformVersionCallback getGlPlatformVersion) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_gl_platform_version"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGlPlatformVersion == null ? MemoryAddress.NULL : getGlPlatformVersion.toCallback()));
                return this;
            }
        }
        
        public Builder setGetConfig(GetConfigCallback getConfig) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_config"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getConfig == null ? MemoryAddress.NULL : getConfig.toCallback()));
                return this;
            }
        }
        
        public Builder setRequestConfig(RequestConfigCallback requestConfig) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("request_config"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requestConfig == null ? MemoryAddress.NULL : requestConfig.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false, SCOPE)));
                return this;
            }
        }
    }
}
