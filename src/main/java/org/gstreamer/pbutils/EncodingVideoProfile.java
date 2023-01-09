package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Variant of {@link EncodingProfile} for video streams, allows specifying the {@code pass}.
 */
public class EncodingVideoProfile extends org.gstreamer.pbutils.EncodingProfile {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingVideoProfile";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EncodingVideoProfile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EncodingVideoProfile(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EncodingVideoProfile> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EncodingVideoProfile(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_encoding_video_profile_new.invokeExact(
                        format.handle(),
                        (Addressable) (preset == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(preset, SCOPE)),
                        (Addressable) (restriction == null ? MemoryAddress.NULL : restriction.handle()),
                        presence);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link EncodingVideoProfile}
     * <p>
     * All provided allocatable arguments will be internally copied, so can be
     * safely freed/unreferenced after calling this method.
     * <p>
     * If you wish to control the pass number (in case of multi-pass scenarios),
     * please refer to the gst_encoding_video_profile_set_pass() documentation.
     * <p>
     * If you wish to use/force a constant framerate please refer to the
     * gst_encoding_video_profile_set_variableframerate() documentation.
     * @param format the {@link org.gstreamer.gst.Caps}
     * @param preset the preset(s) to use on the encoder, can be {@code null}
     * @param restriction the {@link org.gstreamer.gst.Caps} used to restrict the input to the encoder, can be
     * NULL. See gst_encoding_profile_get_restriction() for more details.
     * @param presence the number of time this stream must be used. 0 means any number of
     *  times (including never)
     */
    public EncodingVideoProfile(org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        super(constructNew(format, preset, restriction, presence));
        this.takeOwnership();
    }
    
    /**
     * Get the pass number if this is part of a multi-pass profile.
     * @return The pass number. Starts at 1 for multi-pass. 0 if this is
     * not a multi-pass profile
     */
    public int getPass() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_video_profile_get_pass.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * &gt; <em>NOTE</em>: Fixed framerate won't be enforced when {@code encodebin}:avoid-reencoding
     * <blockquote>
     *  is set.
     * </blockquote>
     * @return Whether non-constant video framerate is allowed for encoding.
     */
    public boolean getVariableframerate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_video_profile_get_variableframerate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the pass number of this video profile. The first pass profile should have
     * this value set to 1. If this video profile isn't part of a multi-pass profile,
     * you may set it to 0 (the default value).
     * @param pass the pass number for this profile
     */
    public void setPass(int pass) {
        try {
            DowncallHandles.gst_encoding_video_profile_set_pass.invokeExact(
                    handle(),
                    pass);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If set to {@code true}, then the incoming stream will be allowed to have non-constant
     * framerate. If set to {@code false} (default value), then the incoming stream will
     * be normalized by dropping/duplicating frames in order to produce a
     * constance framerate.
     * @param variableframerate a boolean
     */
    public void setVariableframerate(boolean variableframerate) {
        try {
            DowncallHandles.gst_encoding_video_profile_set_variableframerate.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(variableframerate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_video_profile_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EncodingVideoProfile.Builder} object constructs a {@link EncodingVideoProfile} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EncodingVideoProfile.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.pbutils.EncodingProfile.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EncodingVideoProfile} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingVideoProfile}.
         * @return A new instance of {@code EncodingVideoProfile} with the properties 
         *         that were set in the Builder object.
         */
        public EncodingVideoProfile build() {
            return (EncodingVideoProfile) org.gtk.gobject.GObject.newWithProperties(
                EncodingVideoProfile.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_encoding_video_profile_new = Interop.downcallHandle(
                "gst_encoding_video_profile_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_encoding_video_profile_get_pass = Interop.downcallHandle(
                "gst_encoding_video_profile_get_pass",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_video_profile_get_variableframerate = Interop.downcallHandle(
                "gst_encoding_video_profile_get_variableframerate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_video_profile_set_pass = Interop.downcallHandle(
                "gst_encoding_video_profile_set_pass",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_encoding_video_profile_set_variableframerate = Interop.downcallHandle(
                "gst_encoding_video_profile_set_variableframerate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_encoding_video_profile_get_type = Interop.downcallHandle(
                "gst_encoding_video_profile_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_encoding_video_profile_get_type != null;
    }
}
