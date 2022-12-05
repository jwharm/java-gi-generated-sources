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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.audio.AudioBaseSrc.getMemoryLayout().withName("element"),
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
     * Create a AudioSrc proxy instance for the provided memory address.
     * <p>
     * Because AudioSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioSrc(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioSrc if its GType is a (or inherits from) "GstAudioSrc".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioSrc} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioSrc", a ClassCastException will be thrown.
     */
    public static AudioSrc castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioSrc.getType())) {
            return new AudioSrc(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioSrc");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.audio.AudioBaseSrc.Build {
        
         /**
         * A {@link AudioSrc.Build} object constructs a {@link AudioSrc} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioSrc} using {@link AudioSrc#castFrom}.
         * @return A new instance of {@code AudioSrc} with the properties 
         *         that were set in the Build object.
         */
        public AudioSrc construct() {
            return AudioSrc.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioSrc.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
