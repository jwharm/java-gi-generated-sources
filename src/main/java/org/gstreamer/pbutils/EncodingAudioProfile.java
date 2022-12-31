package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Variant of {@link EncodingProfile} for audio streams.
 */
public class EncodingAudioProfile extends org.gstreamer.pbutils.EncodingProfile {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingAudioProfile";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EncodingAudioProfile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EncodingAudioProfile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EncodingAudioProfile> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EncodingAudioProfile(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_audio_profile_new.invokeExact(
                    format.handle(),
                    (Addressable) (preset == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(preset, null)),
                    (Addressable) (restriction == null ? MemoryAddress.NULL : restriction.handle()),
                    presence);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link EncodingAudioProfile}
     * <p>
     * All provided allocatable arguments will be internally copied, so can be
     * safely freed/unreferenced after calling this method.
     * @param format the {@link org.gstreamer.gst.Caps}
     * @param preset the preset(s) to use on the encoder, can be {@code null}
     * @param restriction the {@link org.gstreamer.gst.Caps} used to restrict the input to the encoder, can be
     * NULL. See gst_encoding_profile_get_restriction() for more details.
     * @param presence the number of time this stream must be used. 0 means any number of
     *  times (including never)
     */
    public EncodingAudioProfile(org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        super(constructNew(format, preset, restriction, presence), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_audio_profile_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EncodingAudioProfile.Builder} object constructs a {@link EncodingAudioProfile} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EncodingAudioProfile.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.pbutils.EncodingProfile.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EncodingAudioProfile} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingAudioProfile}.
         * @return A new instance of {@code EncodingAudioProfile} with the properties 
         *         that were set in the Builder object.
         */
        public EncodingAudioProfile build() {
            return (EncodingAudioProfile) org.gtk.gobject.GObject.newWithProperties(
                EncodingAudioProfile.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_encoding_audio_profile_new = Interop.downcallHandle(
            "gst_encoding_audio_profile_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_encoding_audio_profile_get_type = Interop.downcallHandle(
            "gst_encoding_audio_profile_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
