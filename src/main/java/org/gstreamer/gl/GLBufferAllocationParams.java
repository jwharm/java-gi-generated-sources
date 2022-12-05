package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLBufferAllocationParams extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBufferAllocationParams";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLAllocationParams.getMemoryLayout().withName("parent"),
        Interop.valueLayout.C_INT.withName("gl_target"),
        Interop.valueLayout.C_INT.withName("gl_usage"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Allocate a new {@link GLBufferAllocationParams}
     * @return A new, uninitialized @{link GLBufferAllocationParams}
     */
    public static GLBufferAllocationParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLBufferAllocationParams newInstance = new GLBufferAllocationParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gl.GLAllocationParams parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gl.GLAllocationParams(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code gl_target}
     * @return The value of the field {@code gl_target}
     */
    public int glTarget$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_target"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code gl_target}
     * @param glTarget The new value of the field {@code gl_target}
     */
    public void glTarget$set(int glTarget) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_target"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glTarget);
    }
    
    /**
     * Get the value of the field {@code gl_usage}
     * @return The value of the field {@code gl_usage}
     */
    public int glUsage$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_usage"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code gl_usage}
     * @param glUsage The new value of the field {@code gl_usage}
     */
    public void glUsage$set(int glUsage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gl_usage"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glUsage);
    }
    
    /**
     * Create a GLBufferAllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBufferAllocationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context, long allocSize, @Nullable org.gstreamer.gst.AllocationParams allocParams, int glTarget, int glUsage) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_buffer_allocation_params_new.invokeExact(
                    context.handle(),
                    allocSize,
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    glTarget,
                    glUsage);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLBufferAllocationParams(@NotNull org.gstreamer.gl.GLContext context, long allocSize, @Nullable org.gstreamer.gst.AllocationParams allocParams, int glTarget, int glUsage) {
        super(constructNew(context, allocSize, allocParams, glTarget, glUsage), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_buffer_allocation_params_new = Interop.downcallHandle(
            "gst_gl_buffer_allocation_params_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLBufferAllocationParams struct;
        
         /**
         * A {@link GLBufferAllocationParams.Build} object constructs a {@link GLBufferAllocationParams} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLBufferAllocationParams.allocate();
        }
        
         /**
         * Finish building the {@link GLBufferAllocationParams} struct.
         * @return A new instance of {@code GLBufferAllocationParams} with the fields 
         *         that were set in the Build object.
         */
        public GLBufferAllocationParams construct() {
            return struct;
        }
        
        /**
         * parent object
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gl.GLAllocationParams parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the OpenGL target to bind the buffer to
         * @param glTarget The value for the {@code glTarget} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGlTarget(int glTarget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_target"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), glTarget);
            return this;
        }
        
        /**
         * the OpenGL usage hint to create the buffer with
         * @param glUsage The value for the {@code glUsage} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGlUsage(int glUsage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), glUsage);
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
