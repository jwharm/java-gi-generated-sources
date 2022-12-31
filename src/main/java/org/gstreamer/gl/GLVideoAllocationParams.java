package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLVideoAllocationParams extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLVideoAllocationParams";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLAllocationParams.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("v_info"),
            Interop.valueLayout.C_INT.withName("plane"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("valign"),
            Interop.valueLayout.C_INT.withName("target"),
            Interop.valueLayout.C_INT.withName("tex_format"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLVideoAllocationParams}
     * @return A new, uninitialized @{link GLVideoAllocationParams}
     */
    public static GLVideoAllocationParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLVideoAllocationParams newInstance = new GLVideoAllocationParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gl.GLAllocationParams getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gl.GLAllocationParams parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    /**
     * Get the value of the field {@code v_info}
     * @return The value of the field {@code v_info}
     */
    public org.gstreamer.video.VideoInfo getVInfo() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("v_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoInfo.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code v_info}
     * @param vInfo The new value of the field {@code v_info}
     */
    public void setVInfo(org.gstreamer.video.VideoInfo vInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("v_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vInfo == null ? MemoryAddress.NULL : vInfo.handle()));
    }
    
    /**
     * Get the value of the field {@code plane}
     * @return The value of the field {@code plane}
     */
    public int getPlane() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code plane}
     * @param plane The new value of the field {@code plane}
     */
    public void setPlane(int plane) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), plane);
    }
    
    /**
     * Get the value of the field {@code valign}
     * @return The value of the field {@code valign}
     */
    public org.gstreamer.video.VideoAlignment getValign() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("valign"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoAlignment.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code valign}
     * @param valign The new value of the field {@code valign}
     */
    public void setValign(org.gstreamer.video.VideoAlignment valign) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("valign"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()));
    }
    
    /**
     * Get the value of the field {@code target}
     * @return The value of the field {@code target}
     */
    public org.gstreamer.gl.GLTextureTarget getTarget() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code target}
     * @param target The new value of the field {@code target}
     */
    public void setTarget(org.gstreamer.gl.GLTextureTarget target) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (target == null ? MemoryAddress.NULL : target.getValue()));
    }
    
    /**
     * Get the value of the field {@code tex_format}
     * @return The value of the field {@code tex_format}
     */
    public org.gstreamer.gl.GLFormat getTexFormat() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code tex_format}
     * @param texFormat The new value of the field {@code tex_format}
     */
    public void setTexFormat(org.gstreamer.gl.GLFormat texFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (texFormat == null ? MemoryAddress.NULL : texFormat.getValue()));
    }
    
    /**
     * Create a GLVideoAllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLVideoAllocationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLVideoAllocationParams> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLVideoAllocationParams(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_video_allocation_params_new.invokeExact(
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    vInfo.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    target.getValue(),
                    texFormat.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLVideoAllocationParams(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat) {
        super(constructNew(context, allocParams, vInfo, plane, valign, target, texFormat), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWrappedData(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, @Nullable org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_video_allocation_params_new_wrapped_data.invokeExact(
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    vInfo.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    target.getValue(),
                    texFormat.getValue(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLVideoAllocationParams newWrappedData(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, @Nullable org.gtk.glib.DestroyNotify notify) {
        var RESULT = constructNewWrappedData(context, allocParams, vInfo, plane, valign, target, texFormat, notify);
        return org.gstreamer.gl.GLVideoAllocationParams.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWrappedGlHandle(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_video_allocation_params_new_wrapped_gl_handle.invokeExact(
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    vInfo.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    target.getValue(),
                    texFormat.getValue(),
                    (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * {@code gl_handle} is defined by the specific OpenGL handle being wrapped
     * For {@link GLMemory} and {@link GLMemoryPBO} it is an OpenGL texture id.
     * Other memory types may define it to require a different type of parameter.
     * @param context a {@link GLContext}
     * @param allocParams the {@link org.gstreamer.gst.AllocationParams} for {@code tex_id}
     * @param vInfo the {@link org.gstreamer.video.VideoInfo} for {@code tex_id}
     * @param plane the video plane {@code tex_id} represents
     * @param valign any {@link org.gstreamer.video.VideoAlignment} applied to symem mappings of {@code tex_id}
     * @param target the {@link GLTextureTarget} for {@code tex_id}
     * @param texFormat the {@link GLFormat} for {@code tex_id}
     * @param glHandle the GL handle to wrap
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     * @return a new {@link GLVideoAllocationParams} for wrapping {@code gl_handle}
     */
    public static GLVideoAllocationParams newWrappedGlHandle(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable org.gtk.glib.DestroyNotify notify) {
        var RESULT = constructNewWrappedGlHandle(context, allocParams, vInfo, plane, valign, target, texFormat, glHandle, notify);
        return org.gstreamer.gl.GLVideoAllocationParams.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWrappedTexture(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, int texId, @Nullable org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_video_allocation_params_new_wrapped_texture.invokeExact(
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    vInfo.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    target.getValue(),
                    texFormat.getValue(),
                    texId,
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLVideoAllocationParams newWrappedTexture(org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, int texId, @Nullable org.gtk.glib.DestroyNotify notify) {
        var RESULT = constructNewWrappedTexture(context, allocParams, vInfo, plane, valign, target, texFormat, texId, notify);
        return org.gstreamer.gl.GLVideoAllocationParams.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Copy and set any dynamically allocated resources in {@code dest_vid}.  Intended
     * for subclass usage only to chain up at the end of a subclass copy function.
     * @param destVid destination {@link GLVideoAllocationParams} to copy into
     */
    public void copyData(org.gstreamer.gl.GLVideoAllocationParams destVid) {
        try {
            DowncallHandles.gst_gl_video_allocation_params_copy_data.invokeExact(
                    handle(),
                    destVid.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unset and free any dynamically allocated resources.  Intended for subclass
     * usage only to chain up at the end of a subclass free function.
     */
    public void freeData() {
        try {
            DowncallHandles.gst_gl_video_allocation_params_free_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Intended for subclass usage
     * @param structSize the size of the struct in {@code params}
     * @param allocFlags some allocation flags
     * @param copy a copy function
     * @param free a free function
     * @param context a {@link GLContext}
     * @param allocParams the {@link org.gstreamer.gst.AllocationParams} for {@code wrapped_data}
     * @param vInfo the {@link org.gstreamer.video.VideoInfo} for {@code wrapped_data}
     * @param plane the video plane {@code wrapped_data} represents
     * @param valign any {@link org.gstreamer.video.VideoAlignment} applied to symem mappings of {@code wrapped_data}
     * @param target the {@link GLTextureTarget}
     * @param texFormat the {@link GLFormat}
     * @param glHandle the optional OpenGL handle to wrap or 0
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     * @return initializes {@code params} with the parameters specified
     */
    public boolean initFull(long structSize, int allocFlags, org.gstreamer.gl.GLAllocationParamsCopyFunc copy, org.gstreamer.gl.GLAllocationParamsFreeFunc free, org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, org.gstreamer.gl.GLTextureTarget target, org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable org.gtk.glib.DestroyNotify notify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_video_allocation_params_init_full.invokeExact(
                    handle(),
                    structSize,
                    allocFlags,
                    (Addressable) copy.toCallback(),
                    (Addressable) free.toCallback(),
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    vInfo.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    target.getValue(),
                    texFormat.getValue(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_video_allocation_params_new = Interop.downcallHandle(
            "gst_gl_video_allocation_params_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_video_allocation_params_new_wrapped_data = Interop.downcallHandle(
            "gst_gl_video_allocation_params_new_wrapped_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_video_allocation_params_new_wrapped_gl_handle = Interop.downcallHandle(
            "gst_gl_video_allocation_params_new_wrapped_gl_handle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_video_allocation_params_new_wrapped_texture = Interop.downcallHandle(
            "gst_gl_video_allocation_params_new_wrapped_texture",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_video_allocation_params_copy_data = Interop.downcallHandle(
            "gst_gl_video_allocation_params_copy_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_video_allocation_params_free_data = Interop.downcallHandle(
            "gst_gl_video_allocation_params_free_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_video_allocation_params_init_full = Interop.downcallHandle(
            "gst_gl_video_allocation_params_init_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link GLVideoAllocationParams.Builder} object constructs a {@link GLVideoAllocationParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLVideoAllocationParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLVideoAllocationParams struct;
        
        private Builder() {
            struct = GLVideoAllocationParams.allocate();
        }
        
         /**
         * Finish building the {@link GLVideoAllocationParams} struct.
         * @return A new instance of {@code GLVideoAllocationParams} with the fields 
         *         that were set in the Builder object.
         */
        public GLVideoAllocationParams build() {
            return struct;
        }
        
        /**
         * the parent {@link GLAllocationParams} structure
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gl.GLAllocationParams parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the {@link org.gstreamer.video.VideoInfo} to allocate
         * @param vInfo The value for the {@code vInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVInfo(org.gstreamer.video.VideoInfo vInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("v_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vInfo == null ? MemoryAddress.NULL : vInfo.handle()));
            return this;
        }
        
        /**
         * the video plane index to allocate
         * @param plane The value for the {@code plane} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlane(int plane) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), plane);
            return this;
        }
        
        /**
         * the {@link org.gstreamer.video.VideoAlignment} to align the system representation to (may be {@code null} for the default)
         * @param valign The value for the {@code valign} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValign(org.gstreamer.video.VideoAlignment valign) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("valign"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()));
            return this;
        }
        
        /**
         * the {@link GLTextureTarget} to allocate
         * @param target The value for the {@code target} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTarget(org.gstreamer.gl.GLTextureTarget target) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (target == null ? MemoryAddress.NULL : target.getValue()));
            return this;
        }
        
        /**
         * the {@link GLFormat} to allocate
         * @param texFormat The value for the {@code texFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTexFormat(org.gstreamer.gl.GLFormat texFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (texFormat == null ? MemoryAddress.NULL : texFormat.getValue()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
