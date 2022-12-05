package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLUpload} is an object that uploads data from system memory into GL textures.
 * <p>
 * A {@link GLUpload} can be created with gst_gl_upload_new()
 */
public class GLUpload extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLUpload";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a GLUpload proxy instance for the provided memory address.
     * <p>
     * Because GLUpload is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLUpload(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLUpload if its GType is a (or inherits from) "GstGLUpload".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLUpload} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLUpload", a ClassCastException will be thrown.
     */
    public static GLUpload castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLUpload.getType())) {
            return new GLUpload(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLUpload");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_upload_new.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLUpload(@NotNull org.gstreamer.gl.GLContext context) {
        super(constructNew(context), Ownership.FULL);
    }
    
    public void getCaps(@NotNull Out<org.gstreamer.gst.Caps> inCaps, @NotNull Out<org.gstreamer.gst.Caps> outCaps) {
        java.util.Objects.requireNonNull(inCaps, "Parameter 'inCaps' must not be null");
        MemorySegment inCapsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(outCaps, "Parameter 'outCaps' must not be null");
        MemorySegment outCapsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_gl_upload_get_caps.invokeExact(
                    handle(),
                    (Addressable) inCapsPOINTER.address(),
                    (Addressable) outCapsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inCaps.set(new org.gstreamer.gst.Caps(inCapsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        outCaps.set(new org.gstreamer.gst.Caps(outCapsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Uploads {@code buffer} using the transformation specified by
     * gst_gl_upload_set_caps() creating a new {@link org.gstreamer.gst.Buffer} in {@code outbuf_ptr}.
     * @param buffer input {@link org.gstreamer.gst.Buffer}
     * @param outbufPtr resulting {@link org.gstreamer.gst.Buffer}
     * @return whether the upload was successful
     */
    public @NotNull org.gstreamer.gl.GLUploadReturn performWithBuffer(@NotNull org.gstreamer.gst.Buffer buffer, @NotNull Out<org.gstreamer.gst.Buffer> outbufPtr) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(outbufPtr, "Parameter 'outbufPtr' must not be null");
        MemorySegment outbufPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_upload_perform_with_buffer.invokeExact(
                    handle(),
                    buffer.handle(),
                    (Addressable) outbufPtrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outbufPtr.set(new org.gstreamer.gst.Buffer(outbufPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.gl.GLUploadReturn.of(RESULT);
    }
    
    /**
     * Adds the required allocation parameters to support uploading.
     * @param decideQuery a {@link org.gstreamer.gst.Query} from a decide allocation
     * @param query the proposed allocation query
     */
    public void proposeAllocation(@Nullable org.gstreamer.gst.Query decideQuery, @NotNull org.gstreamer.gst.Query query) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        try {
            DowncallHandles.gst_gl_upload_propose_allocation.invokeExact(
                    handle(),
                    (Addressable) (decideQuery == null ? MemoryAddress.NULL : decideQuery.handle()),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code upload} with the information required for upload.
     * @param inCaps input {@link org.gstreamer.gst.Caps}
     * @param outCaps output {@link org.gstreamer.gst.Caps}
     * @return whether {@code in_caps} and {@code out_caps} could be set on {@code upload}
     */
    public boolean setCaps(@NotNull org.gstreamer.gst.Caps inCaps, @NotNull org.gstreamer.gst.Caps outCaps) {
        java.util.Objects.requireNonNull(inCaps, "Parameter 'inCaps' must not be null");
        java.util.Objects.requireNonNull(outCaps, "Parameter 'outCaps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_upload_set_caps.invokeExact(
                    handle(),
                    inCaps.handle(),
                    outCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public void setContext(@NotNull org.gstreamer.gl.GLContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        try {
            DowncallHandles.gst_gl_upload_set_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public @NotNull org.gstreamer.gst.Caps transformCaps(@NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gst.PadDirection direction, @NotNull org.gstreamer.gst.Caps caps, @NotNull org.gstreamer.gst.Caps filter) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        java.util.Objects.requireNonNull(filter, "Parameter 'filter' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_upload_transform_caps.invokeExact(
                    handle(),
                    context.handle(),
                    direction.getValue(),
                    caps.handle(),
                    filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_upload_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static @NotNull org.gstreamer.gst.Caps getInputTemplateCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_upload_get_input_template_caps.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link GLUpload.Build} object constructs a {@link GLUpload} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLUpload} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLUpload} using {@link GLUpload#castFrom}.
         * @return A new instance of {@code GLUpload} with the properties 
         *         that were set in the Build object.
         */
        public GLUpload construct() {
            return GLUpload.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLUpload.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_upload_new = Interop.downcallHandle(
            "gst_gl_upload_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_upload_get_caps = Interop.downcallHandle(
            "gst_gl_upload_get_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_upload_perform_with_buffer = Interop.downcallHandle(
            "gst_gl_upload_perform_with_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_upload_propose_allocation = Interop.downcallHandle(
            "gst_gl_upload_propose_allocation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_upload_set_caps = Interop.downcallHandle(
            "gst_gl_upload_set_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_upload_set_context = Interop.downcallHandle(
            "gst_gl_upload_set_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_upload_transform_caps = Interop.downcallHandle(
            "gst_gl_upload_transform_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_upload_get_type = Interop.downcallHandle(
            "gst_gl_upload_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_upload_get_input_template_caps = Interop.downcallHandle(
            "gst_gl_upload_get_input_template_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
