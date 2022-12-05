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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseTransform.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("display"),
        Interop.valueLayout.ADDRESS.withName("context"),
        Interop.valueLayout.ADDRESS.withName("in_caps"),
        Interop.valueLayout.ADDRESS.withName("out_caps"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding"),
        Interop.valueLayout.ADDRESS.withName("priv")
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
     * Create a GLBaseFilter proxy instance for the provided memory address.
     * <p>
     * Because GLBaseFilter is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBaseFilter(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLBaseFilter if its GType is a (or inherits from) "GstGLBaseFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLBaseFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLBaseFilter", a ClassCastException will be thrown.
     */
    public static GLBaseFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLBaseFilter.getType())) {
            return new GLBaseFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLBaseFilter");
        }
    }
    
    public boolean findGlContext() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_base_filter_find_gl_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @Nullable org.gstreamer.gl.GLContext getGlContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_base_filter_get_gl_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLContext(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_base_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.BaseTransform.Build {
        
         /**
         * A {@link GLBaseFilter.Build} object constructs a {@link GLBaseFilter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLBaseFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLBaseFilter} using {@link GLBaseFilter#castFrom}.
         * @return A new instance of {@code GLBaseFilter} with the properties 
         *         that were set in the Build object.
         */
        public GLBaseFilter construct() {
            return GLBaseFilter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLBaseFilter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setContext(org.gstreamer.gl.GLContext context) {
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
