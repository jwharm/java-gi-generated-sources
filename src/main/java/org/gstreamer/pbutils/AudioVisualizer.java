package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A baseclass for scopes (visualizers). It takes care of re-fitting the
 * audio-rate to video-rate and handles renegotiation (downstream video size
 * changes).
 * <p>
 * It also provides several background shading effects. These effects are
 * applied to a previous picture before the {@code render()} implementation can draw a
 * new frame.
 */
public class AudioVisualizer extends org.gstreamer.gst.Element {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioVisualizer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("parent"),
            Interop.valueLayout.C_INT.withName("req_spf"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("vinfo"),
            org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("ainfo"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioVisualizer proxy instance for the provided memory address.
     * <p>
     * Because AudioVisualizer is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioVisualizer(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, AudioVisualizer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioVisualizer(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_visualizer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioVisualizer.Builder} object constructs a {@link AudioVisualizer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioVisualizer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioVisualizer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioVisualizer}.
         * @return A new instance of {@code AudioVisualizer} with the properties 
         *         that were set in the Builder object.
         */
        public AudioVisualizer build() {
            return (AudioVisualizer) org.gtk.gobject.GObject.newWithProperties(
                AudioVisualizer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setShadeAmount(int shadeAmount) {
            names.add("shade-amount");
            values.add(org.gtk.gobject.Value.create(shadeAmount));
            return this;
        }
        
        public Builder setShader(org.gstreamer.pbutils.AudioVisualizerShader shader) {
            names.add("shader");
            values.add(org.gtk.gobject.Value.create(shader));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_visualizer_get_type = Interop.downcallHandle(
            "gst_audio_visualizer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
