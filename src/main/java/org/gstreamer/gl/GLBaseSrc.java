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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.PushSrc.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("display"),
            Interop.valueLayout.ADDRESS.withName("context"),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
            Interop.valueLayout.ADDRESS.withName("out_caps"),
            Interop.valueLayout.C_LONG.withName("running_time"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLBaseSrc proxy instance for the provided memory address.
     * <p>
     * Because GLBaseSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLBaseSrc(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, GLBaseSrc> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLBaseSrc(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_base_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GLBaseSrc.Builder} object constructs a {@link GLBaseSrc} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLBaseSrc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.PushSrc.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLBaseSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLBaseSrc}.
         * @return A new instance of {@code GLBaseSrc} with the properties 
         *         that were set in the Builder object.
         */
        public GLBaseSrc build() {
            return (GLBaseSrc) org.gtk.gobject.GObject.newWithProperties(
                GLBaseSrc.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setTimestampOffset(long timestampOffset) {
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
