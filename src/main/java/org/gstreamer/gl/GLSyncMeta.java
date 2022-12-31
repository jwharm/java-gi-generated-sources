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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLSyncMeta newInstance = new GLSyncMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.Meta getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.Meta parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    /**
     * Get the value of the field {@code context}
     * @return The value of the field {@code context}
     */
    public org.gstreamer.gl.GLContext getContext() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("context"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.GLContext.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code context}
     * @param context The new value of the field {@code context}
     */
    public void setContext(org.gstreamer.gl.GLContext context) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
    }
    
    @FunctionalInterface
    public interface SetSyncCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetSyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_sync}
     * @param setSync The new value of the field {@code set_sync}
     */
    public void setSetSync(SetSyncCallback setSync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_sync"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSync == null ? MemoryAddress.NULL : setSync.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetSyncGlCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetSyncGlCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_sync_gl}
     * @param setSyncGl The new value of the field {@code set_sync_gl}
     */
    public void setSetSyncGl(SetSyncGlCallback setSyncGl) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_sync_gl"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSyncGl == null ? MemoryAddress.NULL : setSyncGl.toCallback()));
    }
    
    @FunctionalInterface
    public interface WaitCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WaitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait}
     * @param wait_ The new value of the field {@code wait}
     */
    public void setWait(WaitCallback wait_) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
    }
    
    @FunctionalInterface
    public interface WaitGlCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WaitGlCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_gl}
     * @param waitGl The new value of the field {@code wait_gl}
     */
    public void setWaitGl(WaitGlCallback waitGl) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait_gl"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitGl == null ? MemoryAddress.NULL : waitGl.toCallback()));
    }
    
    @FunctionalInterface
    public interface WaitCpuCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WaitCpuCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_cpu}
     * @param waitCpu The new value of the field {@code wait_cpu}
     */
    public void setWaitCpu(WaitCpuCallback waitCpu) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitCpu == null ? MemoryAddress.NULL : waitCpu.toCallback()));
    }
    
    @FunctionalInterface
    public interface WaitCpuGlCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WaitCpuGlCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_cpu_gl}
     * @param waitCpuGl The new value of the field {@code wait_cpu_gl}
     */
    public void setWaitCpuGl(WaitCpuGlCallback waitCpuGl) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu_gl"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitCpuGl == null ? MemoryAddress.NULL : waitCpuGl.toCallback()));
    }
    
    @FunctionalInterface
    public interface CopyCallback {
        void run(org.gstreamer.gl.GLSyncMeta src, org.gstreamer.gst.Buffer sbuffer, org.gstreamer.gl.GLSyncMeta dest, org.gstreamer.gst.Buffer dbuffer);

        @ApiStatus.Internal default void upcall(MemoryAddress src, MemoryAddress sbuffer, MemoryAddress dest, MemoryAddress dbuffer) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(src, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(sbuffer, Ownership.NONE), org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(dest, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(dbuffer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CopyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy}
     * @param copy The new value of the field {@code copy}
     */
    public void setCopy(CopyCallback copy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
    }
    
    @FunctionalInterface
    public interface FreeCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FreeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(FreeCallback free) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
    }
    
    @FunctionalInterface
    public interface FreeGlCallback {
        void run(org.gstreamer.gl.GLSyncMeta sync, org.gstreamer.gl.GLContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress sync, MemoryAddress context) {
            run(org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(sync, Ownership.NONE), (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gstreamer.gl.GLContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FreeGlCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free_gl}
     * @param freeGl The new value of the field {@code free_gl}
     */
    public void setFreeGl(FreeGlCallback freeGl) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_gl"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (freeGl == null ? MemoryAddress.NULL : freeGl.toCallback()));
    }
    
    /**
     * Create a GLSyncMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLSyncMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLSyncMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLSyncMeta(input, ownership);
    
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
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the {@link GLContext} used to allocate the meta
         * @param context The value for the {@code context} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContext(org.gstreamer.gl.GLContext context) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
            return this;
        }
        
        /**
         * a custom data pointer for the implementation
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        public Builder setSetSync(SetSyncCallback setSync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSync == null ? MemoryAddress.NULL : setSync.toCallback()));
            return this;
        }
        
        public Builder setSetSyncGl(SetSyncGlCallback setSyncGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sync_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSyncGl == null ? MemoryAddress.NULL : setSyncGl.toCallback()));
            return this;
        }
        
        public Builder setWait(WaitCallback wait_) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
            return this;
        }
        
        public Builder setWaitGl(WaitGlCallback waitGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitGl == null ? MemoryAddress.NULL : waitGl.toCallback()));
            return this;
        }
        
        public Builder setWaitCpu(WaitCpuCallback waitCpu) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitCpu == null ? MemoryAddress.NULL : waitCpu.toCallback()));
            return this;
        }
        
        public Builder setWaitCpuGl(WaitCpuGlCallback waitCpuGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitCpuGl == null ? MemoryAddress.NULL : waitCpuGl.toCallback()));
            return this;
        }
        
        public Builder setCopy(CopyCallback copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy.toCallback()));
            return this;
        }
        
        public Builder setFree(FreeCallback free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
            return this;
        }
        
        public Builder setFreeGl(FreeGlCallback freeGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (freeGl == null ? MemoryAddress.NULL : freeGl.toCallback()));
            return this;
        }
    }
}
