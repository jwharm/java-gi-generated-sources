package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstGLMemory is a {@link GLBaseMemory} subclass providing support for the mapping of
 * OpenGL textures.
 * <p>
 * {@link GLMemory} is created or wrapped through gst_gl_base_memory_alloc()
 * with {@link GLVideoAllocationParams}.
 * <p>
 * Data is uploaded or downloaded from the GPU as is necessary.
 * <p>
 * The {@link org.gstreamer.gst.Caps} that is used for {@link GLMemory} based buffers should contain
 * the {@code GST_CAPS_FEATURE_MEMORY_GL_MEMORY} as a {@link org.gstreamer.gst.CapsFeatures} and should
 * contain a 'texture-target' field with one of the {@link GLTextureTarget} values
 * as a string, i.e. some combination of 'texture-target=(string){2D,
 * rectangle, external-oes}'.
 */
public class GLMemory extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLMemory";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLBaseMemory.getMemoryLayout().withName("mem"),
        Interop.valueLayout.C_INT.withName("tex_id"),
        Interop.valueLayout.C_INT.withName("tex_target"),
        Interop.valueLayout.C_INT.withName("tex_format"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("info"),
        org.gstreamer.video.VideoAlignment.getMemoryLayout().withName("valign"),
        Interop.valueLayout.C_INT.withName("plane"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_FLOAT).withName("tex_scaling"),
        Interop.valueLayout.C_INT.withName("texture_wrapped"),
        Interop.valueLayout.C_INT.withName("unpack_length"),
        Interop.valueLayout.C_INT.withName("tex_width"),
        MemoryLayout.paddingLayout(224),
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
     * Allocate a new {@link GLMemory}
     * @return A new, uninitialized @{link GLMemory}
     */
    public static GLMemory allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLMemory newInstance = new GLMemory(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code tex_id}
     * @return The value of the field {@code tex_id}
     */
    public int texId$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tex_id}
     * @param texId The new value of the field {@code tex_id}
     */
    public void texId$set(int texId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), texId);
    }
    
    /**
     * Get the value of the field {@code tex_target}
     * @return The value of the field {@code tex_target}
     */
    public org.gstreamer.gl.GLTextureTarget texTarget$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_target"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code tex_target}
     * @param texTarget The new value of the field {@code tex_target}
     */
    public void texTarget$set(org.gstreamer.gl.GLTextureTarget texTarget) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_target"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), texTarget.getValue());
    }
    
    /**
     * Get the value of the field {@code tex_format}
     * @return The value of the field {@code tex_format}
     */
    public org.gstreamer.gl.GLFormat texFormat$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code tex_format}
     * @param texFormat The new value of the field {@code tex_format}
     */
    public void texFormat$set(org.gstreamer.gl.GLFormat texFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), texFormat.getValue());
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.video.VideoInfo info$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return new org.gstreamer.video.VideoInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code valign}
     * @return The value of the field {@code valign}
     */
    public org.gstreamer.video.VideoAlignment valign$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("valign"));
        return new org.gstreamer.video.VideoAlignment(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code plane}
     * @return The value of the field {@code plane}
     */
    public int plane$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code plane}
     * @param plane The new value of the field {@code plane}
     */
    public void plane$set(int plane) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), plane);
    }
    
    /**
     * Get the value of the field {@code texture_wrapped}
     * @return The value of the field {@code texture_wrapped}
     */
    public boolean textureWrapped$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("texture_wrapped"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code texture_wrapped}
     * @param textureWrapped The new value of the field {@code texture_wrapped}
     */
    public void textureWrapped$set(boolean textureWrapped) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("texture_wrapped"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), textureWrapped ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code unpack_length}
     * @return The value of the field {@code unpack_length}
     */
    public int unpackLength$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code unpack_length}
     * @param unpackLength The new value of the field {@code unpack_length}
     */
    public void unpackLength$set(int unpackLength) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), unpackLength);
    }
    
    /**
     * Get the value of the field {@code tex_width}
     * @return The value of the field {@code tex_width}
     */
    public int texWidth$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tex_width}
     * @param texWidth The new value of the field {@code tex_width}
     */
    public void texWidth$set(int texWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), texWidth);
    }
    
    /**
     * Create a GLMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLMemory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Copies {@code gl_mem} into the texture specified by {@code tex_id}.  The format of {@code tex_id}
     * is specified by {@code tex_format}, {@code width} and {@code height}.
     * @param texId OpenGL texture id
     * @param target the {@link GLTextureTarget}
     * @param texFormat the {@link GLFormat}
     * @param width width of {@code tex_id}
     * @param height height of {@code tex_id}
     * @return Whether the copy succeeded
     */
    public boolean copyInto(int texId, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, int width, int height) {
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(texFormat, "Parameter 'texFormat' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_copy_into.invokeExact(
                    handle(),
                    texId,
                    target.getValue(),
                    texFormat.getValue(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Copies the texture in {@link GLMemory} into the texture specified by {@code tex_id},
     * {@code out_target}, {@code out_tex_format}, {@code out_width} and {@code out_height}.
     * @param texId the destination texture id
     * @param outTarget the destination {@link GLTextureTarget}
     * @param outTexFormat the destination {@link GLFormat}
     * @param outWidth the destination width
     * @param outHeight the destination height
     * @return whether the copy succeeded.
     */
    public boolean copyTeximage(int texId, @NotNull org.gstreamer.gl.GLTextureTarget outTarget, @NotNull org.gstreamer.gl.GLFormat outTexFormat, int outWidth, int outHeight) {
        java.util.Objects.requireNonNull(outTarget, "Parameter 'outTarget' must not be null");
        java.util.Objects.requireNonNull(outTexFormat, "Parameter 'outTexFormat' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_copy_teximage.invokeExact(
                    handle(),
                    texId,
                    outTarget.getValue(),
                    outTexFormat.getValue(),
                    outWidth,
                    outHeight);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @NotNull org.gstreamer.gl.GLFormat getTextureFormat() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_format.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    public int getTextureHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getTextureId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gstreamer.gl.GLTextureTarget getTextureTarget() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    public int getTextureWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes {@code mem} with the required parameters.  {@code info} is assumed to have
     * already have been modified with gst_video_info_align().
     * @param allocator the {@link org.gstreamer.gst.Allocator} to initialize with
     * @param parent the parent {@link org.gstreamer.gst.Memory} to initialize with
     * @param context the {@link GLContext} to initialize with
     * @param target the {@link GLTextureTarget} for this {@link GLMemory}
     * @param texFormat the {@link GLFormat} for this {@link GLMemory}
     * @param params the {@code GstAllocationParams} to initialize with
     * @param info the {@link org.gstreamer.video.VideoInfo} for this {@link GLMemory}
     * @param plane the plane number (starting from 0) for this {@link GLMemory}
     * @param valign optional {@link org.gstreamer.video.VideoAlignment} parameters
     * @param userData user data to call {@code notify} with
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     */
    public void init(@NotNull org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.Memory parent, @NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, @Nullable org.gstreamer.gst.AllocationParams params, @NotNull org.gstreamer.video.VideoInfo info, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(texFormat, "Parameter 'texFormat' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        try {
            DowncallHandles.gst_gl_memory_init.invokeExact(
                    handle(),
                    allocator.handle(),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    context.handle(),
                    target.getValue(),
                    texFormat.getValue(),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()),
                    info.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads the texture in {@link GLMemory} into {@code write_pointer} if no buffer is bound
     * to {@code GL_PIXEL_PACK_BUFFER}.  Otherwise {@code write_pointer} is the byte offset into
     * the currently bound {@code GL_PIXEL_PACK_BUFFER} buffer to store the result of
     * glReadPixels.  See the OpenGL specification for glReadPixels for more
     * details.
     * @param writePointer the data pointer to pass to glReadPixels
     * @return whether theread operation succeeded
     */
    public boolean readPixels(@Nullable java.lang.foreign.MemoryAddress writePointer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_read_pixels.invokeExact(
                    handle(),
                    (Addressable) (writePointer == null ? MemoryAddress.NULL : (Addressable) writePointer));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reads the texture in {@code read_pointer} into {@code gl_mem}.
     * <p>
     * See gst_gl_memory_read_pixels() for what {@code read_pointer} signifies.
     * @param readPointer the data pointer to pass to glTexSubImage
     */
    public void texsubimage(@Nullable java.lang.foreign.MemoryAddress readPointer) {
        try {
            DowncallHandles.gst_gl_memory_texsubimage.invokeExact(
                    handle(),
                    (Addressable) (readPointer == null ? MemoryAddress.NULL : (Addressable) readPointer));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes the GL Base Texture allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLMemory operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_gl_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean setupBuffer(@NotNull org.gstreamer.gl.GLMemoryAllocator allocator, @NotNull org.gstreamer.gst.Buffer buffer, @NotNull org.gstreamer.gl.GLVideoAllocationParams params, @Nullable org.gstreamer.gl.GLFormat[] texFormats, @NotNull java.lang.foreign.MemoryAddress[] wrappedData, long nWrappedPointers) {
        java.util.Objects.requireNonNull(allocator, "Parameter 'allocator' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        java.util.Objects.requireNonNull(wrappedData, "Parameter 'wrappedData' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_setup_buffer.invokeExact(
                    allocator.handle(),
                    buffer.handle(),
                    params.handle(),
                    (Addressable) (texFormats == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(texFormats), false)),
                    Interop.allocateNativeArray(wrappedData, false),
                    nWrappedPointers);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_memory_copy_into = Interop.downcallHandle(
            "gst_gl_memory_copy_into",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_memory_copy_teximage = Interop.downcallHandle(
            "gst_gl_memory_copy_teximage",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_memory_get_texture_format = Interop.downcallHandle(
            "gst_gl_memory_get_texture_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_get_texture_height = Interop.downcallHandle(
            "gst_gl_memory_get_texture_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_get_texture_id = Interop.downcallHandle(
            "gst_gl_memory_get_texture_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_get_texture_target = Interop.downcallHandle(
            "gst_gl_memory_get_texture_target",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_get_texture_width = Interop.downcallHandle(
            "gst_gl_memory_get_texture_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_init = Interop.downcallHandle(
            "gst_gl_memory_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_read_pixels = Interop.downcallHandle(
            "gst_gl_memory_read_pixels",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_texsubimage = Interop.downcallHandle(
            "gst_gl_memory_texsubimage",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_memory_init_once = Interop.downcallHandle(
            "gst_gl_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_gl_memory_setup_buffer = Interop.downcallHandle(
            "gst_gl_memory_setup_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLMemory struct;
        
         /**
         * A {@link GLMemory.Build} object constructs a {@link GLMemory} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLMemory.allocate();
        }
        
         /**
         * Finish building the {@link GLMemory} struct.
         * @return A new instance of {@code GLMemory} with the fields 
         *         that were set in the Build object.
         */
        public GLMemory construct() {
            return struct;
        }
        
        /**
         * the parent {@link GLBaseMemory} object
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
         * the GL texture id for this memory
         * @param texId The value for the {@code texId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTexId(int texId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), texId);
            return this;
        }
        
        /**
         * the GL texture target for this memory
         * @param texTarget The value for the {@code texTarget} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTexTarget(org.gstreamer.gl.GLTextureTarget texTarget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_target"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (texTarget == null ? MemoryAddress.NULL : texTarget.getValue()));
            return this;
        }
        
        /**
         * the texture type
         * @param texFormat The value for the {@code texFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTexFormat(org.gstreamer.gl.GLFormat texFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (texFormat == null ? MemoryAddress.NULL : texFormat.getValue()));
            return this;
        }
        
        /**
         * the texture's {@link org.gstreamer.video.VideoInfo}
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInfo(org.gstreamer.video.VideoInfo info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
            return this;
        }
        
        /**
         * data alignment for system memory mapping
         * @param valign The value for the {@code valign} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValign(org.gstreamer.video.VideoAlignment valign) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("valign"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()));
            return this;
        }
        
        /**
         * data plane in {@code info}
         * @param plane The value for the {@code plane} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPlane(int plane) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), plane);
            return this;
        }
        
        /**
         * GL shader scaling parameters for {@code valign} and/or width/height
         * @param texScaling The value for the {@code texScaling} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTexScaling(float[] texScaling) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_scaling"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (texScaling == null ? MemoryAddress.NULL : Interop.allocateNativeArray(texScaling, false)));
            return this;
        }
        
        public Build setTextureWrapped(boolean textureWrapped) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("texture_wrapped"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), textureWrapped ? 1 : 0);
            return this;
        }
        
        public Build setUnpackLength(int unpackLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), unpackLength);
            return this;
        }
        
        public Build setTexWidth(int texWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), texWidth);
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
