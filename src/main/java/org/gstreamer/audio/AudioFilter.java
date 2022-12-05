package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioFilter} is a {@link org.gstreamer.base.BaseTransform}&lt;!-- --&gt;-derived base class for simple audio
 * filters, ie. those that output the same format that they get as input.
 * <p>
 * {@link AudioFilter} will parse the input format for you (with error checking)
 * before calling your setup function. Also, elements deriving from
 * {@link AudioFilter} may use gst_audio_filter_class_add_pad_templates() from
 * their class_init function to easily configure the set of caps/formats that
 * the element is able to handle.
 * <p>
 * Derived classes should override the {@link AudioFilterClass}.setup() and
 * {@link org.gstreamer.base.BaseTransformClass}.transform_ip() and/or
 * {@link org.gstreamer.base.BaseTransformClass}.transform()
 * virtual functions in their class_init function.
 */
public class AudioFilter extends org.gstreamer.base.BaseTransform {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioFilter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseTransform.getMemoryLayout().withName("basetransform"),
        org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("info"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Create a AudioFilter proxy instance for the provided memory address.
     * <p>
     * Because AudioFilter is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioFilter(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioFilter if its GType is a (or inherits from) "GstAudioFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioFilter", a ClassCastException will be thrown.
     */
    public static AudioFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioFilter.getType())) {
            return new AudioFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioFilter");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_filter_get_type.invokeExact();
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
         * A {@link AudioFilter.Build} object constructs a {@link AudioFilter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioFilter} using {@link AudioFilter#castFrom}.
         * @return A new instance of {@code AudioFilter} with the properties 
         *         that were set in the Build object.
         */
        public AudioFilter construct() {
            return AudioFilter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioFilter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_filter_get_type = Interop.downcallHandle(
            "gst_audio_filter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
