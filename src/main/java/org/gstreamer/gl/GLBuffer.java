package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstGLBuffer is a {@link org.gstreamer.gst.Memory} subclass providing support for the mapping of
 * GL buffers.
 * <p>
 * Data is uploaded or downloaded from the GPU as is necessary.
 */
public class GLBuffer extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBuffer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLBaseMemory.getMemoryLayout().withName("mem"),
            Interop.valueLayout.C_INT.withName("id"),
            Interop.valueLayout.C_INT.withName("target"),
            Interop.valueLayout.C_INT.withName("usage_hints")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLBuffer}
     * @return A new, uninitialized @{link GLBuffer}
     */
    public static GLBuffer allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLBuffer newInstance = new GLBuffer(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mem}
     * @return The value of the field {@code mem}
     */
    public org.gstreamer.gl.GLBaseMemory getMem() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem"));
        return org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code mem}
     * @param mem The new value of the field {@code mem}
     */
    public void setMem(org.gstreamer.gl.GLBaseMemory mem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int getId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void setId(int id) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), id);
        }
    }
    
    /**
     * Get the value of the field {@code target}
     * @return The value of the field {@code target}
     */
    public int getTarget() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code target}
     * @param target The new value of the field {@code target}
     */
    public void setTarget(int target) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), target);
        }
    }
    
    /**
     * Get the value of the field {@code usage_hints}
     * @return The value of the field {@code usage_hints}
     */
    public int getUsageHints() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("usage_hints"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code usage_hints}
     * @param usageHints The new value of the field {@code usage_hints}
     */
    public void setUsageHints(int usageHints) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("usage_hints"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), usageHints);
        }
    }
    
    /**
     * Create a GLBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLBuffer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLBuffer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLBuffer(input);
    
    /**
     * Initializes the GL Buffer allocator. It is safe to call this function
     * multiple times.  This must be called before any other {@link GLBuffer} operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_gl_buffer_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_buffer_init_once = Interop.downcallHandle(
                "gst_gl_buffer_init_once",
                FunctionDescriptor.ofVoid(),
                false
        );
    }
    
    /**
     * A {@link GLBuffer.Builder} object constructs a {@link GLBuffer} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLBuffer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLBuffer struct;
        
        private Builder() {
            struct = GLBuffer.allocate();
        }
        
        /**
         * Finish building the {@link GLBuffer} struct.
         * @return A new instance of {@code GLBuffer} with the fields 
         *         that were set in the Builder object.
         */
        public GLBuffer build() {
            return struct;
        }
        
        /**
         * the parent object
         * @param mem The value for the {@code mem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMem(org.gstreamer.gl.GLBaseMemory mem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
                return this;
            }
        }
        
        /**
         * the buffer id for this memory
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setId(int id) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), id);
                return this;
            }
        }
        
        /**
         * the OpenGL target of this texture for binding purposes
         * @param target The value for the {@code target} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTarget(int target) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("target"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), target);
                return this;
            }
        }
        
        /**
         * the OpenGL usage hints this buffer was created with
         * @param usageHints The value for the {@code usageHints} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUsageHints(int usageHints) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("usage_hints"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), usageHints);
                return this;
            }
        }
    }
}
