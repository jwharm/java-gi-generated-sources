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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EncodingVideoProfile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EncodingVideoProfile if its GType is a (or inherits from) "GstEncodingVideoProfile".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EncodingVideoProfile} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstEncodingVideoProfile", a ClassCastException will be thrown.
     */
    public static EncodingVideoProfile castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EncodingVideoProfile.getType())) {
            return new EncodingVideoProfile(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstEncodingVideoProfile");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_video_profile_new.invokeExact(
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
    public EncodingVideoProfile(@NotNull org.gstreamer.gst.Caps format, @Nullable java.lang.String preset, @Nullable org.gstreamer.gst.Caps restriction, int presence) {
        super(constructNew(format, preset, restriction, presence), Ownership.FULL);
    }
    
    /**
     * Get the pass number if this is part of a multi-pass profile.
     * @return The pass number. Starts at 1 for multi-pass. 0 if this is
     * not a multi-pass profile
     */
    public int getPass() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_video_profile_get_pass.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gst_encoding_video_profile_get_variableframerate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    variableframerate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_video_profile_get_type.invokeExact();
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
         * A {@link EncodingVideoProfile.Build} object constructs a {@link EncodingVideoProfile} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EncodingVideoProfile} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingVideoProfile} using {@link EncodingVideoProfile#castFrom}.
         * @return A new instance of {@code EncodingVideoProfile} with the properties 
         *         that were set in the Build object.
         */
        public EncodingVideoProfile construct() {
            return EncodingVideoProfile.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EncodingVideoProfile.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
