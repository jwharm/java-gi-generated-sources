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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLBaseMemory.getMemoryLayout().withName("mem"),
        Interop.valueLayout.C_INT.withName("id"),
        Interop.valueLayout.C_INT.withName("target"),
        Interop.valueLayout.C_INT.withName("usage_hints")
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
     * Allocate a new {@link GLBuffer}
     * @return A new, uninitialized @{link GLBuffer}
     */
    public static GLBuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLBuffer newInstance = new GLBuffer(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mem}
     * @return The value of the field {@code mem}
     */
    public org.gstreamer.gl.GLBaseMemory mem$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem"));
        return new org.gstreamer.gl.GLBaseMemory(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void id$set(int id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
    }
    
    /**
     * Get the value of the field {@code target}
     * @return The value of the field {@code target}
     */
    public int target$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target}
     * @param target The new value of the field {@code target}
     */
    public void target$set(int target) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), target);
    }
    
    /**
     * Get the value of the field {@code usage_hints}
     * @return The value of the field {@code usage_hints}
     */
    public int usageHints$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("usage_hints"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code usage_hints}
     * @param usageHints The new value of the field {@code usage_hints}
     */
    public void usageHints$set(int usageHints) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("usage_hints"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), usageHints);
    }
    
    /**
     * Create a GLBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLBuffer struct;
        
         /**
         * A {@link GLBuffer.Build} object constructs a {@link GLBuffer} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLBuffer.allocate();
        }
        
         /**
         * Finish building the {@link GLBuffer} struct.
         * @return A new instance of {@code GLBuffer} with the fields 
         *         that were set in the Build object.
         */
        public GLBuffer construct() {
            return struct;
        }
        
        /**
         * the parent object
         * @param mem The value for the {@code mem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMem(org.gstreamer.gl.GLBaseMemory mem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
            return this;
        }
        
        /**
         * the buffer id for this memory
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setId(int id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
            return this;
        }
        
        /**
         * the OpenGL target of this texture for binding purposes
         * @param target The value for the {@code target} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTarget(int target) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), target);
            return this;
        }
        
        /**
         * the OpenGL usage hints this buffer was created with
         * @param usageHints The value for the {@code usageHints} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUsageHints(int usageHints) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("usage_hints"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), usageHints);
            return this;
        }
    }
}
