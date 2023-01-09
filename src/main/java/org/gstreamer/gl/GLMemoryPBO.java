package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLMemoryPBO} is created or wrapped through gst_gl_base_memory_alloc()
 * with {@link GLVideoAllocationParams}.
 * <p>
 * Data is uploaded or downloaded from the GPU as is necessary.
 */
public class GLMemoryPBO extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLMemoryPBO";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLMemory.getMemoryLayout().withName("mem"),
            Interop.valueLayout.ADDRESS.withName("pbo"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLMemoryPBO}
     * @return A new, uninitialized @{link GLMemoryPBO}
     */
    public static GLMemoryPBO allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLMemoryPBO newInstance = new GLMemoryPBO(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GLMemoryPBO proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLMemoryPBO(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLMemoryPBO> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLMemoryPBO(input);
    
    /**
     * Copies {@code gl_mem} into the texture specified by {@code tex_id}.  The format of {@code tex_id}
     * is specified by {@code tex_format}, {@code width} and {@code height}.
     * <p>
     * If {@code respecify} is {@code true}, then the copy is performed in terms of the texture
     * data.  This is useful for splitting RGBA textures into RG or R textures or
     * vice versa. The requirement for this to succeed is that the backing texture
     * data must be the same size, i.e. say a RGBA8 texture is converted into a RG8
     * texture, then the RG texture must have twice as many pixels available for
     * output as the RGBA texture.
     * <p>
     * Otherwise, if {@code respecify} is {@code false}, then the copy is performed per texel
     * using glCopyTexImage.  See the OpenGL specification for details on the
     * mappings between texture formats.
     * @param texId the destination texture id
     * @param target the destination {@link GLTextureTarget}
     * @param texFormat the destination {@link GLFormat}
     * @param width width of {@code tex_id}
     * @param height height of {@code tex_id}
     * @param stride stride of the backing texture data
     * @param respecify whether to copy the data or copy per texel
     * @return Whether the copy succeeded
     */
    public boolean copyIntoTexture(int texId, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, int width, int height, int stride, boolean respecify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_pbo_copy_into_texture.invokeExact(
                    handle(),
                    texId,
                    target.getValue(),
                    texFormat.getValue(),
                    width,
                    height,
                    stride,
                    Marshal.booleanToInteger.marshal(respecify, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Transfer the texture data from the texture into the PBO if necessary.
     */
    public void downloadTransfer() {
        try {
            DowncallHandles.gst_gl_memory_pbo_download_transfer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transfer the texture data from the PBO into the texture if necessary.
     */
    public void uploadTransfer() {
        try {
            DowncallHandles.gst_gl_memory_pbo_upload_transfer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void initOnce() {
        try {
            DowncallHandles.gst_gl_memory_pbo_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_memory_pbo_copy_into_texture = Interop.downcallHandle(
                "gst_gl_memory_pbo_copy_into_texture",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_memory_pbo_download_transfer = Interop.downcallHandle(
                "gst_gl_memory_pbo_download_transfer",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_memory_pbo_upload_transfer = Interop.downcallHandle(
                "gst_gl_memory_pbo_upload_transfer",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_memory_pbo_init_once = Interop.downcallHandle(
                "gst_gl_memory_pbo_init_once",
                FunctionDescriptor.ofVoid(),
                false
        );
    }
    
    /**
     * A {@link GLMemoryPBO.Builder} object constructs a {@link GLMemoryPBO} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLMemoryPBO.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLMemoryPBO struct;
        
        private Builder() {
            struct = GLMemoryPBO.allocate();
        }
        
        /**
         * Finish building the {@link GLMemoryPBO} struct.
         * @return A new instance of {@code GLMemoryPBO} with the fields 
         *         that were set in the Builder object.
         */
        public GLMemoryPBO build() {
            return struct;
        }
        
        public Builder setMem(org.gstreamer.gl.GLMemory mem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
                return this;
            }
        }
        
        public Builder setPbo(org.gstreamer.gl.GLBuffer pbo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pbo"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pbo == null ? MemoryAddress.NULL : pbo.handle()));
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
