package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLBaseFilter} handles the nitty gritty details of retrieving an OpenGL
 * context.  It also provided some wrappers around {@link org.gstreamer.base.BaseTransform}'s
 * {@code start()}, {@code stop()} and {@code set_caps()} virtual methods that ensure an OpenGL
 * context is available and current in the calling thread.
 */
public class GLBaseFilter extends org.gstreamer.base.BaseTransform {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseFilter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseTransform.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("display"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.ADDRESS.withName("in_caps"),
            Interop.valueLayout.ADDRESS.withName("out_caps"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLBaseFilter proxy instance for the provided memory address.
     * <p>
     * Because GLBaseFilter is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLBaseFilter(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GLBaseFilter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLBaseFilter(input, ownership);
    
    public boolean findGlContext() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_base_filter_find_gl_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public @Nullable org.gstreamer.gl.GLContext getGlContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_base_filter_get_gl_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gl.GLContext.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_base_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLBaseFilter.Builder} object constructs a {@link GLBaseFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLBaseFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseTransform.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLBaseFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLBaseFilter}.
         * @return A new instance of {@code GLBaseFilter} with the properties 
         *         that were set in the Builder object.
         */
        public GLBaseFilter build() {
            return (GLBaseFilter) org.gtk.gobject.GObject.newWithProperties(
                GLBaseFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setContext(org.gstreamer.gl.GLContext context) {
            names.add("context");
            values.add(org.gtk.gobject.Value.create(context));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_base_filter_find_gl_context = Interop.downcallHandle(
            "gst_gl_base_filter_find_gl_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_base_filter_get_gl_context = Interop.downcallHandle(
            "gst_gl_base_filter_get_gl_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_base_filter_get_type = Interop.downcallHandle(
            "gst_gl_base_filter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
