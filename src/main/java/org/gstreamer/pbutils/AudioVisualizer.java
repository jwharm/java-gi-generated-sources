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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("parent"),
        Interop.valueLayout.C_INT.withName("req_spf"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("vinfo"),
        org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("ainfo"),
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
     * Create a AudioVisualizer proxy instance for the provided memory address.
     * <p>
     * Because AudioVisualizer is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioVisualizer(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioVisualizer if its GType is a (or inherits from) "GstAudioVisualizer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioVisualizer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioVisualizer", a ClassCastException will be thrown.
     */
    public static AudioVisualizer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioVisualizer.getType())) {
            return new AudioVisualizer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioVisualizer");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_visualizer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Element.Build {
        
         /**
         * A {@link AudioVisualizer.Build} object constructs a {@link AudioVisualizer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioVisualizer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioVisualizer} using {@link AudioVisualizer#castFrom}.
         * @return A new instance of {@code AudioVisualizer} with the properties 
         *         that were set in the Build object.
         */
        public AudioVisualizer construct() {
            return AudioVisualizer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioVisualizer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setShadeAmount(int shadeAmount) {
            names.add("shade-amount");
            values.add(org.gtk.gobject.Value.create(shadeAmount));
            return this;
        }
        
        public Build setShader(org.gstreamer.pbutils.AudioVisualizerShader shader) {
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
