package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the most simple base class for audio sources that only requires
 * subclasses to implement a set of simple functions:
 * <p>
 * * {@code open()} :Open the device.
 * * {@code prepare()} :Configure the device with the specified format.
 * * {@code read()} :Read samples from the device.
 * * {@code reset()} :Unblock reads and flush the device.
 * * {@code delay()} :Get the number of samples in the device but not yet read.
 * * {@code unprepare()} :Undo operations done by prepare.
 * * {@code close()} :Close the device.
 * <p>
 * All scheduling of samples and timestamps is done in this base class
 * together with {@link AudioBaseSrc} using a default implementation of a
 * {@link AudioRingBuffer} that uses threads.
 */
public class AudioSrc extends org.gstreamer.audio.AudioBaseSrc {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSrc";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.audio.AudioBaseSrc.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("thread"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioSrc proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioSrc(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioSrc> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioSrc(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioSrc.Builder} object constructs a {@link AudioSrc} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioSrc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.audio.AudioBaseSrc.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioSrc}.
         * @return A new instance of {@code AudioSrc} with the properties 
         *         that were set in the Builder object.
         */
        public AudioSrc build() {
            return (AudioSrc) org.gtk.gobject.GObject.newWithProperties(
                AudioSrc.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_src_get_type = Interop.downcallHandle(
                "gst_audio_src_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_src_get_type != null;
    }
}
