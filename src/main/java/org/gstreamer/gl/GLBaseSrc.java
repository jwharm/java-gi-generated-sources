package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLBaseSrc} handles the nitty gritty details of retrieving an OpenGL
 * context. It also provided some wrappers around {@link org.gstreamer.base.BaseSrc}'s {@code start()} and
 * {@code stop()} virtual methods that ensure an OpenGL context is available and
 * current in the calling thread.
 * @version 1.18
 */
public class GLBaseSrc extends org.gstreamer.base.PushSrc {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseSrc";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.PushSrc.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("display"),
        Interop.valueLayout.ADDRESS.withName("context"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
        Interop.valueLayout.ADDRESS.withName("out_caps"),
        Interop.valueLayout.C_LONG.withName("running_time"),
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
     * Create a GLBaseSrc proxy instance for the provided memory address.
     * <p>
     * Because GLBaseSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBaseSrc(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLBaseSrc if its GType is a (or inherits from) "GstGLBaseSrc".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLBaseSrc} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLBaseSrc", a ClassCastException will be thrown.
     */
    public static GLBaseSrc castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLBaseSrc.getType())) {
            return new GLBaseSrc(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLBaseSrc");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_base_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.PushSrc.Build {
        
         /**
         * A {@link GLBaseSrc.Build} object constructs a {@link GLBaseSrc} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLBaseSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLBaseSrc} using {@link GLBaseSrc#castFrom}.
         * @return A new instance of {@code GLBaseSrc} with the properties 
         *         that were set in the Build object.
         */
        public GLBaseSrc construct() {
            return GLBaseSrc.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLBaseSrc.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setTimestampOffset(long timestampOffset) {
            names.add("timestamp-offset");
            values.add(org.gtk.gobject.Value.create(timestampOffset));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_base_src_get_type = Interop.downcallHandle(
            "gst_gl_base_src_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
