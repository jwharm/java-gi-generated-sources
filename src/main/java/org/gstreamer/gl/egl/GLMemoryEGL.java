package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLMemoryEGL} is created or wrapped through gst_gl_base_memory_alloc()
 * with {@link org.gstreamer.gl.GLVideoAllocationParams}.
 */
public class GLMemoryEGL extends Struct {
    
    static {
        GstGLEGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLMemoryEGL";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLMemory.getMemoryLayout().withName("mem"),
        Interop.valueLayout.ADDRESS.withName("image"),
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
     * Allocate a new {@link GLMemoryEGL}
     * @return A new, uninitialized @{link GLMemoryEGL}
     */
    public static GLMemoryEGL allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLMemoryEGL newInstance = new GLMemoryEGL(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GLMemoryEGL proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLMemoryEGL(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_memory_egl_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getImage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_memory_egl_get_image.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes the GL Memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLMemoryEGL operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_gl_memory_egl_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_memory_egl_get_display = Interop.downcallHandle(
            "gst_gl_memory_egl_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_egl_get_image = Interop.downcallHandle(
            "gst_gl_memory_egl_get_image",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_egl_init_once = Interop.downcallHandle(
            "gst_gl_memory_egl_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLMemoryEGL struct;
        
         /**
         * A {@link GLMemoryEGL.Build} object constructs a {@link GLMemoryEGL} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLMemoryEGL.allocate();
        }
        
         /**
         * Finish building the {@link GLMemoryEGL} struct.
         * @return A new instance of {@code GLMemoryEGL} with the fields 
         *         that were set in the Build object.
         */
        public GLMemoryEGL construct() {
            return struct;
        }
        
        public Build setMem(org.gstreamer.gl.GLMemory mem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
            return this;
        }
        
        public Build setImage(org.gstreamer.gl.egl.EGLImage image) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("image"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (image == null ? MemoryAddress.NULL : image.handle()));
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
