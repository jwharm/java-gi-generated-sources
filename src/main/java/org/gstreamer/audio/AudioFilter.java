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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseTransform.getMemoryLayout().withName("basetransform"),
            org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("info"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioFilter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioFilter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioFilter(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioFilter.Builder} object constructs a {@link AudioFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseTransform.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioFilter}.
         * @return A new instance of {@code AudioFilter} with the properties 
         *         that were set in the Builder object.
         */
        public AudioFilter build() {
            return (AudioFilter) org.gtk.gobject.GObject.newWithProperties(
                AudioFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_filter_get_type != null;
    }
}
