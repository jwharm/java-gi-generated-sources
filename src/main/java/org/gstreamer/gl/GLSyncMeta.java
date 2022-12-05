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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    public org.gstreamer.gst.Meta parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gst.Meta(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code context}
     * @return The value of the field {@code context}
     */
    public org.gstreamer.gl.GLContext context$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("context"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gl.GLContext(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code context}
     * @param context The new value of the field {@code context}
     */
    public void context$set(org.gstreamer.gl.GLContext context) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("context"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), context.handle());
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) data);
    }
    
    /**
     * Create a GLSyncMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLSyncMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Set a sync point to possibly wait on at a later time.
     * @param context a {@link GLContext}
     */
    public void setSyncPoint(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
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
    public void wait_(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
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
    public void waitCpu(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        try {
            DowncallHandles.gst_gl_sync_meta_wait_cpu.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_sync_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLSyncMeta struct;
        
         /**
         * A {@link GLSyncMeta.Build} object constructs a {@link GLSyncMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLSyncMeta.allocate();
        }
        
         /**
         * Finish building the {@link GLSyncMeta} struct.
         * @return A new instance of {@code GLSyncMeta} with the fields 
         *         that were set in the Build object.
         */
        public GLSyncMeta construct() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.Meta}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gst.Meta parent) {
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
        public Build setContext(org.gstreamer.gl.GLContext context) {
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
        public Build setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        public Build setSetSync(java.lang.foreign.MemoryAddress setSync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSync == null ? MemoryAddress.NULL : setSync));
            return this;
        }
        
        public Build setSetSyncGl(java.lang.foreign.MemoryAddress setSyncGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sync_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSyncGl == null ? MemoryAddress.NULL : setSyncGl));
            return this;
        }
        
        public Build setWait(java.lang.foreign.MemoryAddress wait_) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_));
            return this;
        }
        
        public Build setWaitGl(java.lang.foreign.MemoryAddress waitGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitGl == null ? MemoryAddress.NULL : waitGl));
            return this;
        }
        
        public Build setWaitCpu(java.lang.foreign.MemoryAddress waitCpu) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitCpu == null ? MemoryAddress.NULL : waitCpu));
            return this;
        }
        
        public Build setWaitCpuGl(java.lang.foreign.MemoryAddress waitCpuGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_cpu_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitCpuGl == null ? MemoryAddress.NULL : waitCpuGl));
            return this;
        }
        
        public Build setCopy(java.lang.foreign.MemoryAddress copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy));
            return this;
        }
        
        public Build setFree(java.lang.foreign.MemoryAddress free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free));
            return this;
        }
        
        public Build setFreeGl(java.lang.foreign.MemoryAddress freeGl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_gl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (freeGl == null ? MemoryAddress.NULL : freeGl));
            return this;
        }
    }
}
