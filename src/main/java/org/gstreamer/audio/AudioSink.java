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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.audio.AudioBaseSink.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("thread"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioSink proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioSink(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioSink> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioSink(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioSink.Builder} object constructs a {@link AudioSink} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioSink.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.audio.AudioBaseSink.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioSink}.
         * @return A new instance of {@code AudioSink} with the properties 
         *         that were set in the Builder object.
         */
        public AudioSink build() {
            return (AudioSink) org.gtk.gobject.GObject.newWithProperties(
                AudioSink.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_sink_get_type != null;
    }
}
