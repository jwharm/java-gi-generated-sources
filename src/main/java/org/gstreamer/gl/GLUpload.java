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
public class GLUpload extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLUpload";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLUpload proxy instance for the provided memory address.
     * <p>
     * Because GLUpload is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLUpload(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLUpload> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLUpload(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_upload_new.invokeExact(
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public GLUpload(org.gstreamer.gl.GLContext context) {
        super(constructNew(context), Ownership.FULL);
    }
    
    public void getCaps(@Nullable Out<org.gstreamer.gst.Caps> inCaps, @Nullable Out<org.gstreamer.gst.Caps> outCaps) {
        MemorySegment inCapsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment outCapsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_gl_upload_get_caps.invokeExact(
                    handle(),
                    (Addressable) (inCaps == null ? MemoryAddress.NULL : (Addressable) inCapsPOINTER.address()),
                    (Addressable) (outCaps == null ? MemoryAddress.NULL : (Addressable) outCapsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (inCaps != null) inCaps.set(org.gstreamer.gst.Caps.fromAddress.marshal(inCapsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (outCaps != null) outCaps.set(org.gstreamer.gst.Caps.fromAddress.marshal(outCapsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Uploads {@code buffer} using the transformation specified by
     * gst_gl_upload_set_caps() creating a new {@link org.gstreamer.gst.Buffer} in {@code outbuf_ptr}.
     * @param buffer input {@link org.gstreamer.gst.Buffer}
     * @param outbufPtr resulting {@link org.gstreamer.gst.Buffer}
     * @return whether the upload was successful
     */
    public org.gstreamer.gl.GLUploadReturn performWithBuffer(org.gstreamer.gst.Buffer buffer, Out<org.gstreamer.gst.Buffer> outbufPtr) {
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
        outbufPtr.set(org.gstreamer.gst.Buffer.fromAddress.marshal(outbufPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.gl.GLUploadReturn.of(RESULT);
    }
    
    /**
     * Adds the required allocation parameters to support uploading.
     * @param decideQuery a {@link org.gstreamer.gst.Query} from a decide allocation
     * @param query the proposed allocation query
     */
    public void proposeAllocation(@Nullable org.gstreamer.gst.Query decideQuery, org.gstreamer.gst.Query query) {
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
    public boolean setCaps(org.gstreamer.gst.Caps inCaps, org.gstreamer.gst.Caps outCaps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_upload_set_caps.invokeExact(
                    handle(),
                    inCaps.handle(),
                    outCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public void setContext(org.gstreamer.gl.GLContext context) {
        try {
            DowncallHandles.gst_gl_upload_set_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public org.gstreamer.gst.Caps transformCaps(org.gstreamer.gl.GLContext context, org.gstreamer.gst.PadDirection direction, org.gstreamer.gst.Caps caps, org.gstreamer.gst.Caps filter) {
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
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_upload_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gstreamer.gst.Caps getInputTemplateCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_upload_get_input_template_caps.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A {@link GLUpload.Builder} object constructs a {@link GLUpload} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLUpload.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLUpload} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLUpload}.
         * @return A new instance of {@code GLUpload} with the properties 
         *         that were set in the Builder object.
         */
        public GLUpload build() {
            return (GLUpload) org.gtk.gobject.GObject.newWithProperties(
                GLUpload.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
