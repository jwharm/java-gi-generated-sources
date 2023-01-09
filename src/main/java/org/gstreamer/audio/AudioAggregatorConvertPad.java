package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An implementation of GstPad that can be used with {@link AudioAggregator}.
 * <p>
 * See {@link AudioAggregator} for more details.
 * @version 1.14
 */
public class AudioAggregatorConvertPad extends org.gstreamer.audio.AudioAggregatorPad {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioAggregatorConvertPad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.audio.AudioAggregatorPad.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioAggregatorConvertPad proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioAggregatorConvertPad(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioAggregatorConvertPad> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioAggregatorConvertPad(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_aggregator_convert_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioAggregatorConvertPad.Builder} object constructs a {@link AudioAggregatorConvertPad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioAggregatorConvertPad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.audio.AudioAggregatorPad.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioAggregatorConvertPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioAggregatorConvertPad}.
         * @return A new instance of {@code AudioAggregatorConvertPad} with the properties 
         *         that were set in the Builder object.
         */
        public AudioAggregatorConvertPad build() {
            return (AudioAggregatorConvertPad) org.gtk.gobject.GObject.newWithProperties(
                AudioAggregatorConvertPad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setConverterConfig(org.gstreamer.gst.Structure converterConfig) {
            names.add("converter-config");
            values.add(org.gtk.gobject.Value.create(converterConfig));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_aggregator_convert_pad_get_type = Interop.downcallHandle(
                "gst_audio_aggregator_convert_pad_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_aggregator_convert_pad_get_type != null;
    }
}
