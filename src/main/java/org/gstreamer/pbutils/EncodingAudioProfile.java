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
    @ApiStatus.Internal
    public EncodingAudioProfile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EncodingAudioProfile if its GType is a (or inherits from) "GstEncodingAudioProfile".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EncodingAudioProfile} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstEncodingAudioProfile", a ClassCastException will be thrown.
     */
    public static EncodingAudioProfile castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EncodingAudioProfile.getType())) {
            return new EncodingAudioProfile(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstEncodingAudioProfile");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_audio_profile_new.invokeExact(
                    format.handle(),
                    (Addressable) (preset == null ? MemoryAddress.NULL : Interop.allocateNativeString(preset)),
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
    public EncodingAudioProfile(@NotNull org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        super(constructNew(format, preset, restriction, presence), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_audio_profile_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.pbutils.EncodingProfile.Build {
        
         /**
         * A {@link EncodingAudioProfile.Build} object constructs a {@link EncodingAudioProfile} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EncodingAudioProfile} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingAudioProfile} using {@link EncodingAudioProfile#castFrom}.
         * @return A new instance of {@code EncodingAudioProfile} with the properties 
         *         that were set in the Build object.
         */
        public EncodingAudioProfile construct() {
            return EncodingAudioProfile.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EncodingAudioProfile.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
