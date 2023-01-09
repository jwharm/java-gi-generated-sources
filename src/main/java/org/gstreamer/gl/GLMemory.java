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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLMemory}
     * @return A new, uninitialized @{link GLMemory}
     */
    public static GLMemory allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GLMemory newInstance = new GLMemory(segment.address());
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
     * Get the value of the field {@code tex_id}
     * @return The value of the field {@code tex_id}
     */
    public int getTexId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code tex_id}
     * @param texId The new value of the field {@code tex_id}
     */
    public void setTexId(int texId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), texId);
        }
    }
    
    /**
     * Get the value of the field {@code tex_target}
     * @return The value of the field {@code tex_target}
     */
    public org.gstreamer.gl.GLTextureTarget getTexTarget() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_target"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gl.GLTextureTarget.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code tex_target}
     * @param texTarget The new value of the field {@code tex_target}
     */
    public void setTexTarget(org.gstreamer.gl.GLTextureTarget texTarget) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_target"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (texTarget == null ? MemoryAddress.NULL : texTarget.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code tex_format}
     * @return The value of the field {@code tex_format}
     */
    public org.gstreamer.gl.GLFormat getTexFormat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gl.GLFormat.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code tex_format}
     * @param texFormat The new value of the field {@code tex_format}
     */
    public void setTexFormat(org.gstreamer.gl.GLFormat texFormat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (texFormat == null ? MemoryAddress.NULL : texFormat.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.video.VideoInfo getInfo() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return org.gstreamer.video.VideoInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code info}
     * @param info The new value of the field {@code info}
     */
    public void setInfo(org.gstreamer.video.VideoInfo info) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code valign}
     * @return The value of the field {@code valign}
     */
    public org.gstreamer.video.VideoAlignment getValign() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("valign"));
        return org.gstreamer.video.VideoAlignment.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code valign}
     * @param valign The new value of the field {@code valign}
     */
    public void setValign(org.gstreamer.video.VideoAlignment valign) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("valign"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code plane}
     * @return The value of the field {@code plane}
     */
    public int getPlane() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code plane}
     * @param plane The new value of the field {@code plane}
     */
    public void setPlane(int plane) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), plane);
        }
    }
    
    /**
     * Get the value of the field {@code tex_scaling}
     * @return The value of the field {@code tex_scaling}
     */
    public float[] getTexScaling() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_scaling"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 2, SCOPE).toArray(Interop.valueLayout.C_FLOAT);
        }
    }
    
    /**
     * Change the value of the field {@code tex_scaling}
     * @param texScaling The new value of the field {@code tex_scaling}
     */
    public void setTexScaling(float[] texScaling) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_scaling"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (texScaling == null ? MemoryAddress.NULL : Interop.allocateNativeArray(texScaling, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code texture_wrapped}
     * @return The value of the field {@code texture_wrapped}
     */
    public boolean getTextureWrapped() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("texture_wrapped"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code texture_wrapped}
     * @param textureWrapped The new value of the field {@code texture_wrapped}
     */
    public void setTextureWrapped(boolean textureWrapped) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("texture_wrapped"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(textureWrapped, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code unpack_length}
     * @return The value of the field {@code unpack_length}
     */
    public int getUnpackLength() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_length"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code unpack_length}
     * @param unpackLength The new value of the field {@code unpack_length}
     */
    public void setUnpackLength(int unpackLength) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), unpackLength);
        }
    }
    
    /**
     * Get the value of the field {@code tex_width}
     * @return The value of the field {@code tex_width}
     */
    public int getTexWidth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_width"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code tex_width}
     * @param texWidth The new value of the field {@code tex_width}
     */
    public void setTexWidth(int texWidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), texWidth);
        }
    }
    
    /**
     * Create a GLMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLMemory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLMemory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLMemory(input);
    
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
    public boolean copyInto(int texId, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, int width, int height) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean copyTeximage(int texId, org.gstreamer.gl.GLTextureTarget outTarget, org.gstreamer.gl.GLFormat outTexFormat, int outWidth, int outHeight) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.gstreamer.gl.GLFormat getTextureFormat() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_format.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    public int getTextureHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getTextureId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public org.gstreamer.gl.GLTextureTarget getTextureTarget() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    public int getTextureWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_get_texture_width.invokeExact(handle());
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
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     */
    public void init(org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.Memory parent, org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, @Nullable org.gstreamer.gst.AllocationParams params, org.gstreamer.video.VideoInfo info, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @Nullable org.gtk.glib.DestroyNotify notify) {
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
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    
    public static boolean setupBuffer(org.gstreamer.gl.GLMemoryAllocator allocator, org.gstreamer.gst.Buffer buffer, org.gstreamer.gl.GLVideoAllocationParams params, @Nullable org.gstreamer.gl.GLFormat[] texFormats, java.lang.foreign.MemoryAddress[] wrappedData, long nWrappedPointers) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_memory_setup_buffer.invokeExact(
                        allocator.handle(),
                        buffer.handle(),
                        params.handle(),
                        (Addressable) (texFormats == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(texFormats), false, SCOPE)),
                        Interop.allocateNativeArray(wrappedData, false, SCOPE),
                        nWrappedPointers);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * A {@link GLMemory.Builder} object constructs a {@link GLMemory} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLMemory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLMemory struct;
        
        private Builder() {
            struct = GLMemory.allocate();
        }
        
        /**
         * Finish building the {@link GLMemory} struct.
         * @return A new instance of {@code GLMemory} with the fields 
         *         that were set in the Builder object.
         */
        public GLMemory build() {
            return struct;
        }
        
        /**
         * the parent {@link GLBaseMemory} object
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
         * the GL texture id for this memory
         * @param texId The value for the {@code texId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTexId(int texId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tex_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), texId);
                return this;
            }
        }
        
        /**
         * the GL texture target for this memory
         * @param texTarget The value for the {@code texTarget} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTexTarget(org.gstreamer.gl.GLTextureTarget texTarget) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tex_target"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (texTarget == null ? MemoryAddress.NULL : texTarget.getValue()));
                return this;
            }
        }
        
        /**
         * the texture type
         * @param texFormat The value for the {@code texFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTexFormat(org.gstreamer.gl.GLFormat texFormat) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (texFormat == null ? MemoryAddress.NULL : texFormat.getValue()));
                return this;
            }
        }
        
        /**
         * the texture's {@link org.gstreamer.video.VideoInfo}
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInfo(org.gstreamer.video.VideoInfo info) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
                return this;
            }
        }
        
        /**
         * data alignment for system memory mapping
         * @param valign The value for the {@code valign} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValign(org.gstreamer.video.VideoAlignment valign) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("valign"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()));
                return this;
            }
        }
        
        /**
         * data plane in {@code info}
         * @param plane The value for the {@code plane} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlane(int plane) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), plane);
                return this;
            }
        }
        
        /**
         * GL shader scaling parameters for {@code valign} and/or width/height
         * @param texScaling The value for the {@code texScaling} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTexScaling(float[] texScaling) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tex_scaling"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (texScaling == null ? MemoryAddress.NULL : Interop.allocateNativeArray(texScaling, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setTextureWrapped(boolean textureWrapped) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("texture_wrapped"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(textureWrapped, null).intValue());
                return this;
            }
        }
        
        public Builder setUnpackLength(int unpackLength) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unpack_length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), unpackLength);
                return this;
            }
        }
        
        public Builder setTexWidth(int texWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tex_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), texWidth);
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
