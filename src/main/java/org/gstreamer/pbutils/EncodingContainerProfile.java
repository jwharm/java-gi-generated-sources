package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Encoding profiles for containers. Keeps track of a list of {@link EncodingProfile}
 */
public class EncodingContainerProfile extends org.gstreamer.pbutils.EncodingProfile {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingContainerProfile";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EncodingContainerProfile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EncodingContainerProfile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EncodingContainerProfile if its GType is a (or inherits from) "GstEncodingContainerProfile".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EncodingContainerProfile} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstEncodingContainerProfile", a ClassCastException will be thrown.
     */
    public static EncodingContainerProfile castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EncodingContainerProfile.getType())) {
            return new EncodingContainerProfile(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstEncodingContainerProfile");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String name, @Nullable java.lang.String description, @NotNull org.gstreamer.gst.Caps format, @Nullable java.lang.String preset) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_container_profile_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)),
                    format.handle(),
                    (Addressable) (preset == null ? MemoryAddress.NULL : Interop.allocateNativeString(preset)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link EncodingContainerProfile}.
     * @param name The name of the container profile, can be {@code null}
     * @param description The description of the container profile,
     *     can be {@code null}
     * @param format The format to use for this profile
     * @param preset The preset to use for this profile.
     */
    public EncodingContainerProfile(@Nullable java.lang.String name, @Nullable java.lang.String description, @NotNull org.gstreamer.gst.Caps format, @Nullable java.lang.String preset) {
        super(constructNew(name, description, format, preset), Ownership.FULL);
    }
    
    /**
     * Add a {@link EncodingProfile} to the list of profiles handled by {@code container}.
     * <p>
     * No copy of {@code profile} will be made, if you wish to use it elsewhere after this
     * method you should increment its reference count.
     * @param profile the {@link EncodingProfile} to add.
     * @return {@code true} if the {@code stream} was properly added, else {@code false}.
     */
    public boolean addProfile(@NotNull org.gstreamer.pbutils.EncodingProfile profile) {
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_container_profile_add_profile.invokeExact(
                    handle(),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        profile.yieldOwnership();
        return RESULT != 0;
    }
    
    /**
     * Checks if {@code container} contains a {@link EncodingProfile} identical to
     * {@code profile}.
     * @param profile a {@link EncodingProfile}
     * @return {@code true} if {@code container} contains a {@link EncodingProfile} identical
     * to {@code profile}, else {@code false}.
     */
    public boolean containsProfile(@NotNull org.gstreamer.pbutils.EncodingProfile profile) {
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_container_profile_contains_profile.invokeExact(
                    handle(),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @NotNull org.gtk.glib.List getProfiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_container_profile_get_profiles.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_container_profile_get_type.invokeExact();
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
         * A {@link EncodingContainerProfile.Build} object constructs a {@link EncodingContainerProfile} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EncodingContainerProfile} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingContainerProfile} using {@link EncodingContainerProfile#castFrom}.
         * @return A new instance of {@code EncodingContainerProfile} with the properties 
         *         that were set in the Build object.
         */
        public EncodingContainerProfile construct() {
            return EncodingContainerProfile.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EncodingContainerProfile.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_encoding_container_profile_new = Interop.downcallHandle(
            "gst_encoding_container_profile_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_container_profile_add_profile = Interop.downcallHandle(
            "gst_encoding_container_profile_add_profile",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_container_profile_contains_profile = Interop.downcallHandle(
            "gst_encoding_container_profile_contains_profile",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_container_profile_get_profiles = Interop.downcallHandle(
            "gst_encoding_container_profile_get_profiles",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_container_profile_get_type = Interop.downcallHandle(
            "gst_encoding_container_profile_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
