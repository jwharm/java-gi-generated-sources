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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLAllocationParams.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("v_info"),
        Interop.valueLayout.C_INT.withName("plane"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("valign"),
        Interop.valueLayout.C_INT.withName("target"),
        Interop.valueLayout.C_INT.withName("tex_format"),
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
    public org.gstreamer.gl.GLAllocationParams parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gl.GLAllocationParams(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code v_info}
     * @return The value of the field {@code v_info}
     */
    public org.gstreamer.video.VideoInfo vInfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("v_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code v_info}
     * @param vInfo The new value of the field {@code v_info}
     */
    public void vInfo$set(org.gstreamer.video.VideoInfo vInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("v_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), vInfo.handle());
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
     * Get the value of the field {@code valign}
     * @return The value of the field {@code valign}
     */
    public org.gstreamer.video.VideoAlignment valign$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("valign"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoAlignment(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code valign}
     * @param valign The new value of the field {@code valign}
     */
    public void valign$set(org.gstreamer.video.VideoAlignment valign) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("valign"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), valign.handle());
    }
    
    /**
     * Get the value of the field {@code target}
     * @return The value of the field {@code target}
     */
    public org.gstreamer.gl.GLTextureTarget target$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code target}
     * @param target The new value of the field {@code target}
     */
    public void target$set(org.gstreamer.gl.GLTextureTarget target) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), target.getValue());
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
     * Create a GLVideoAllocationParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLVideoAllocationParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(vInfo, "Parameter 'vInfo' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(texFormat, "Parameter 'texFormat' must not be null");
        Addressable RESULT;
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
    
    public GLVideoAllocationParams(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat) {
        super(constructNew(context, allocParams, vInfo, plane, valign, target, texFormat), Ownership.FULL);
    }
    
    private static Addressable constructNewWrappedData(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress wrappedData, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(vInfo, "Parameter 'vInfo' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(texFormat, "Parameter 'texFormat' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_video_allocation_params_new_wrapped_data.invokeExact(
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    vInfo.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    target.getValue(),
                    texFormat.getValue(),
                    (Addressable) wrappedData,
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLVideoAllocationParams newWrappedData(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress wrappedData, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        return new GLVideoAllocationParams(constructNewWrappedData(context, allocParams, vInfo, plane, valign, target, texFormat, wrappedData, userData, notify), Ownership.FULL);
    }
    
    private static Addressable constructNewWrappedGlHandle(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(vInfo, "Parameter 'vInfo' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(texFormat, "Parameter 'texFormat' must not be null");
        Addressable RESULT;
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
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
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
     * @param userData user data to call {@code notify} with
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     * @return a new {@link GLVideoAllocationParams} for wrapping {@code gl_handle}
     */
    public static GLVideoAllocationParams newWrappedGlHandle(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress glHandle, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        return new GLVideoAllocationParams(constructNewWrappedGlHandle(context, allocParams, vInfo, plane, valign, target, texFormat, glHandle, userData, notify), Ownership.FULL);
    }
    
    private static Addressable constructNewWrappedTexture(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, int texId, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(vInfo, "Parameter 'vInfo' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(texFormat, "Parameter 'texFormat' must not be null");
        Addressable RESULT;
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
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static GLVideoAllocationParams newWrappedTexture(@NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, int texId, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        return new GLVideoAllocationParams(constructNewWrappedTexture(context, allocParams, vInfo, plane, valign, target, texFormat, texId, userData, notify), Ownership.FULL);
    }
    
    /**
     * Copy and set any dynamically allocated resources in {@code dest_vid}.  Intended
     * for subclass usage only to chain up at the end of a subclass copy function.
     * @param destVid destination {@link GLVideoAllocationParams} to copy into
     */
    public void copyData(@NotNull org.gstreamer.gl.GLVideoAllocationParams destVid) {
        java.util.Objects.requireNonNull(destVid, "Parameter 'destVid' must not be null");
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
     * @return initializes {@code params} with the parameters specified
     */
    public boolean initFull(long structSize, int allocFlags, @NotNull org.gstreamer.gl.GLAllocationParamsCopyFunc copy, @NotNull org.gstreamer.gl.GLAllocationParamsFreeFunc free, @NotNull org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gst.AllocationParams allocParams, @NotNull org.gstreamer.video.VideoInfo vInfo, int plane, @Nullable org.gstreamer.video.VideoAlignment valign, @NotNull org.gstreamer.gl.GLTextureTarget target, @NotNull org.gstreamer.gl.GLFormat texFormat, @Nullable java.lang.foreign.MemoryAddress glHandle) {
        java.util.Objects.requireNonNull(copy, "Parameter 'copy' must not be null");
        java.util.Objects.requireNonNull(free, "Parameter 'free' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(vInfo, "Parameter 'vInfo' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(texFormat, "Parameter 'texFormat' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_video_allocation_params_init_full.invokeExact(
                    handle(),
                    structSize,
                    allocFlags,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLAllocationParamsCopyFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLAllocationParamsFreeFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    context.handle(),
                    (Addressable) (allocParams == null ? MemoryAddress.NULL : allocParams.handle()),
                    vInfo.handle(),
                    plane,
                    (Addressable) (valign == null ? MemoryAddress.NULL : valign.handle()),
                    target.getValue(),
                    texFormat.getValue(),
                    (Addressable) (Interop.registerCallback(copy)),
                    (Addressable) (glHandle == null ? MemoryAddress.NULL : (Addressable) glHandle),
                    (Addressable) (Interop.registerCallback(copy)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLVideoAllocationParams struct;
        
         /**
         * A {@link GLVideoAllocationParams.Build} object constructs a {@link GLVideoAllocationParams} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLVideoAllocationParams.allocate();
        }
        
         /**
         * Finish building the {@link GLVideoAllocationParams} struct.
         * @return A new instance of {@code GLVideoAllocationParams} with the fields 
         *         that were set in the Build object.
         */
        public GLVideoAllocationParams construct() {
            return struct;
        }
        
        /**
         * the parent {@link GLAllocationParams} structure
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
         * the {@link org.gstreamer.video.VideoInfo} to allocate
         * @param vInfo The value for the {@code vInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVInfo(org.gstreamer.video.VideoInfo vInfo) {
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
        public Build setPlane(int plane) {
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
        public Build setValign(org.gstreamer.video.VideoAlignment valign) {
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
        public Build setTarget(org.gstreamer.gl.GLTextureTarget target) {
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
        public Build setTexFormat(org.gstreamer.gl.GLFormat texFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tex_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (texFormat == null ? MemoryAddress.NULL : texFormat.getValue()));
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
