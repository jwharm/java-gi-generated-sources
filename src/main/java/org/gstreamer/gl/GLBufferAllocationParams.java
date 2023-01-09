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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLAllocationParams.getMemoryLayout().withName("parent"),
            Interop.valueLayout.C_INT.withName("gl_target"),
            Interop.valueLayout.C_INT.withName("gl_usage"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLBufferAllocationParams}
     * @return A new, uninitialized @{link GLBufferAllocationParams}
     */
    public static GLBufferAllocationParams allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLBufferAllocationParams newInstance = new GLBufferAllocationParams(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gl.GLAllocationParams getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gl.GLAllocationParams parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code gl_target}
     * @return The value of the field {@code gl_target}
     */
    public int getGlTarget() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_target"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code gl_target}
     * @param glTarget The new value of the field {@code gl_target}
     */
    public void setGlTarget(int glTarget) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_target"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), glTarget);
        }
    }
    
    /**
     * Get the value of the field {@code gl_usage}
     * @return The value of the field {@code gl_usage}
     */
    public int getGlUsage() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_usage"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code gl_usage}
     * @param glUsage The new value of the field {@code gl_usage}
     */
    public void setGlUsage(int glUsage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gl_usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), glUsage);
        }
    }
    
    /**
     * Create a GLBufferAllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLBufferAllocationParams(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBufferAllocationParams> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLBufferAllocationParams(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context, long allocSize, @Nullable org.gstreamer.gst.AllocationParams allocParams, int glTarget, int glUsage) {
        MemoryAddress RESULT;
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
    
    public GLBufferAllocationParams(org.gstreamer.gl.GLContext context, long allocSize, @Nullable org.gstreamer.gst.AllocationParams allocParams, int glTarget, int glUsage) {
        super(constructNew(context, allocSize, allocParams, glTarget, glUsage));
        this.takeOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_buffer_allocation_params_new = Interop.downcallHandle(
                "gst_gl_buffer_allocation_params_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link GLBufferAllocationParams.Builder} object constructs a {@link GLBufferAllocationParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLBufferAllocationParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLBufferAllocationParams struct;
        
        private Builder() {
            struct = GLBufferAllocationParams.allocate();
        }
        
        /**
         * Finish building the {@link GLBufferAllocationParams} struct.
         * @return A new instance of {@code GLBufferAllocationParams} with the fields 
         *         that were set in the Builder object.
         */
        public GLBufferAllocationParams build() {
            return struct;
        }
        
        /**
         * parent object
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gl.GLAllocationParams parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        /**
         * the OpenGL target to bind the buffer to
         * @param glTarget The value for the {@code glTarget} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGlTarget(int glTarget) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gl_target"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), glTarget);
                return this;
            }
        }
        
        /**
         * the OpenGL usage hint to create the buffer with
         * @param glUsage The value for the {@code glUsage} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGlUsage(int glUsage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("gl_usage"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), glUsage);
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
