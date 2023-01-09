package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLSyncMeta} provides the ability to synchronize the OpenGL command stream
 * with the CPU or with other OpenGL contexts.
 */
public class GLSyncMeta extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLSyncMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.ADDRESS.withName("set_sync"),
            Interop.valueLayout.ADDRESS.withName("set_sync_gl"),
            Interop.valueLayout.ADDRESS.withName("wait"),
            Interop.valueLayout.ADDRESS.withName("wait_gl"),
            Interop.valueLayout.ADDRESS.withName("wait_cpu"),
            Interop.valueLayout.ADDRESS.withName("wait_cpu_gl"),
            Interop.valueLayout.ADDRESS.withName("copy"),
            Interop.valueLayout.ADDRESS.withName("free"),
            Interop.valueLayout.ADDRESS.withName("free_gl")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLSyncMeta}
     * @return A new, uninitialized @{link GLSyncMeta}
     */
    public static GLSyncMeta allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLSyncMeta newInstance = new GLSyncMeta(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.Meta getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.Meta parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code context}
     * @return The value of the field {@code context}
     */
    public org.gstreamer.gl.GLContext getContext() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gstreamer.gl.GLContext) Interop.register(RESULT, org.gstreamer.gl.GLContext.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code context}
     * @param context The new value of the field {@code context}
     */
    public void setContext(org.gstreamer.gl.GLContext context) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSyncCallback} callback.
     */
    @FunctionalInterface
    public interface SetSyncCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_sync}
     * @param setSync The new value of the field {@code set_sync}
     */
    public void setSetSync(SetSyncCallback setSync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSync == null ? MemoryAddress.NULL : setSync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetSyncGlCallback} callback.
     */
    @FunctionalInterface
    public interface SetSyncGlCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetSyncGlCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_sync_gl}
     * @param setSyncGl The new value of the field {@code set_sync_gl}
     */
    public void setSetSyncGl(SetSyncGlCallback setSyncGl) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sync_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSyncGl == null ? MemoryAddress.NULL : setSyncGl.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WaitCallback} callback.
     */
    @FunctionalInterface
    public interface WaitCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WaitCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait}
     * @param wait_ The new value of the field {@code wait}
     */
    public void setWait(WaitCallback wait_) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WaitGlCallback} callback.
     */
    @FunctionalInterface
    public interface WaitGlCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WaitGlCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_gl}
     * @param waitGl The new value of the field {@code wait_gl}
     */
    public void setWaitGl(WaitGlCallback waitGl) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitGl == null ? MemoryAddress.NULL : waitGl.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WaitCpuCallback} callback.
     */
    @FunctionalInterface
    public interface WaitCpuCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WaitCpuCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_cpu}
     * @param waitCpu The new value of the field {@code wait_cpu}
     */
    public void setWaitCpu(WaitCpuCallback waitCpu) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitCpu == null ? MemoryAddress.NULL : waitCpu.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WaitCpuGlCallback} callback.
     */
    @FunctionalInterface
    public interface WaitCpuGlCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WaitCpuGlCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_cpu_gl}
     * @param waitCpuGl The new value of the field {@code wait_cpu_gl}
     */
    public void setWaitCpuGl(WaitCpuGlCallback waitCpuGl) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitCpuGl == null ? MemoryAddress.NULL : waitCpuGl.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyCallback} callback.
     */
    @FunctionalInterface
    public interface CopyCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta src, org.gstreamer.gst.Buffer sbuffer, org.gstreamer.gl.GLSyncMeta dest, org.gstreamer.gst.Buffer dbuffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress src, MemoryAddress sbuffer, MemoryAddress dest, MemoryAddress dbuffer) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(src, null), org.gstreamer.gst.Buffer.fromAddress.marshal(sbuffer, null), org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(dest, null), org.gstreamer.gst.Buffer.fromAddress.marshal(dbuffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(CopyCallback copy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FreeCallback} callback.
     */
    @FunctionalInterface
    public interface FreeCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FreeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(FreeCallback free) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FreeGlCallback} callback.
     */
    @FunctionalInterface
    public interface FreeGlCallback {
    
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, null), (org.gstreamer.gl.GLContext) Interop.register(context, org.gstreamer.gl.GLContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FreeGlCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free_gl}
     * @param freeGl The new value of the field {@code free_gl}
     */
    public void setFreeGl(FreeGlCallback freeGl) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (freeGl == null ? MemoryAddress.NULL : freeGl.toCallback()));
        }
    }
    
    /**
     * Create a GLSyncMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLSyncMeta(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLSyncMeta> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLSyncMeta(input);
    
    /**
     * Set a sync point to possibly wait on at a later time.
     * @param context a {@link GLContext}
     */
    public void setSyncPoint(org.gstreamer.gl.GLContext context) {
        try {
            DowncallHandles.gst_gl_sync_meta_set_sync_point.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Insert a wait into {@code context}'s command stream ensuring all previous OpenGL
     * commands before {@code sync_meta} have completed.
     * @param context a {@link GLContext}
     */
    public void wait_(org.gstreamer.gl.GLContext context) {
        try {
            DowncallHandles.gst_gl_sync_meta_wait.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform a wait so that the sync point has passed from the CPU's perspective
     * What that means, is that all GL operations changing CPU-visible data before
     * the sync point are now visible.
     * @param context a {@link GLContext}
     */
    public void waitCpu(org.gstreamer.gl.GLContext context) {
        try {
            DowncallHandles.gst_gl_sync_meta_wait_cpu.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_sync_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_sync_meta_set_sync_point = Interop.downcallHandle(
                "gst_gl_sync_meta_set_sync_point",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_sync_meta_wait = Interop.downcallHandle(
                "gst_gl_sync_meta_wait",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_sync_meta_wait_cpu = Interop.downcallHandle(
                "gst_gl_sync_meta_wait_cpu",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_sync_meta_get_info = Interop.downcallHandle(
                "gst_gl_sync_meta_get_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link GLSyncMeta.Builder} object constructs a {@link GLSyncMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLSyncMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLSyncMeta struct;
        
        private Builder() {
            struct = GLSyncMeta.allocate();
        }
        
        /**
         * Finish building the {@link GLSyncMeta} struct.
         * @return A new instance of {@code GLSyncMeta} with the fields 
         *         that were set in the Builder object.
         */
        public GLSyncMeta build() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.Meta}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.Meta parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        /**
         * the {@link GLContext} used to allocate the meta
         * @param context The value for the {@code context} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContext(org.gstreamer.gl.GLContext context) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
                return this;
            }
        }
        
        /**
         * a custom data pointer for the implementation
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
                return this;
            }
        }
        
        public Builder setSetSync(SetSyncCallback setSync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_sync"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSync == null ? MemoryAddress.NULL : setSync.toCallback()));
                return this;
            }
        }
        
        public Builder setSetSyncGl(SetSyncGlCallback setSyncGl) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_sync_gl"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setSyncGl == null ? MemoryAddress.NULL : setSyncGl.toCallback()));
                return this;
            }
        }
        
        public Builder setWait(WaitCallback wait_) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
                return this;
            }
        }
        
        public Builder setWaitGl(WaitGlCallback waitGl) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait_gl"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitGl == null ? MemoryAddress.NULL : waitGl.toCallback()));
                return this;
            }
        }
        
        public Builder setWaitCpu(WaitCpuCallback waitCpu) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitCpu == null ? MemoryAddress.NULL : waitCpu.toCallback()));
                return this;
            }
        }
        
        public Builder setWaitCpuGl(WaitCpuGlCallback waitCpuGl) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu_gl"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitCpuGl == null ? MemoryAddress.NULL : waitCpuGl.toCallback()));
                return this;
            }
        }
        
        public Builder setCopy(CopyCallback copy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
                return this;
            }
        }
        
        public Builder setFree(FreeCallback free) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
                return this;
            }
        }
        
        public Builder setFreeGl(FreeGlCallback freeGl) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free_gl"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (freeGl == null ? MemoryAddress.NULL : freeGl.toCallback()));
                return this;
            }
        }
    }
}
