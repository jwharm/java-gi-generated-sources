package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the most simple base class for audio sinks that only requires
 * subclasses to implement a set of simple functions:
 * <p>
 * * {@code open()} :Open the device.
 * <p>
 * * {@code prepare()} :Configure the device with the specified format.
 * <p>
 * * {@code write()} :Write samples to the device.
 * <p>
 * * {@code reset()} :Unblock writes and flush the device.
 * <p>
 * * {@code delay()} :Get the number of samples written but not yet played
 * by the device.
 * <p>
 * * {@code unprepare()} :Undo operations done by prepare.
 * <p>
 * * {@code close()} :Close the device.
 * <p>
 * All scheduling of samples and timestamps is done in this base class
 * together with {@link AudioBaseSink} using a default implementation of a
 * {@link AudioRingBuffer} that uses threads.
 */
public class AudioSink extends org.gstreamer.audio.AudioBaseSink {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSink";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.audio.AudioBaseSink.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("thread"),
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
     * Create a AudioSink proxy instance for the provided memory address.
     * <p>
     * Because AudioSink is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioSink(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioSink if its GType is a (or inherits from) "GstAudioSink".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioSink} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioSink", a ClassCastException will be thrown.
     */
    public static AudioSink castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioSink.getType())) {
            return new AudioSink(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioSink");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.audio.AudioBaseSink.Build {
        
         /**
         * A {@link AudioSink.Build} object constructs a {@link AudioSink} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioSink} using {@link AudioSink#castFrom}.
         * @return A new instance of {@code AudioSink} with the properties 
         *         that were set in the Build object.
         */
        public AudioSink construct() {
            return AudioSink.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioSink.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_sink_get_type = Interop.downcallHandle(
            "gst_audio_sink_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
