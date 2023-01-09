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
     */
    protected EncodingContainerProfile(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EncodingContainerProfile> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EncodingContainerProfile(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name, @Nullable java.lang.String description, org.gstreamer.gst.Caps format, @Nullable java.lang.String preset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_encoding_container_profile_new.invokeExact(
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)),
                        (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)),
                        format.handle(),
                        (Addressable) (preset == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(preset, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link EncodingContainerProfile}.
     * @param name The name of the container profile, can be {@code null}
     * @param description The description of the container profile,
     *     can be {@code null}
     * @param format The format to use for this profile
     * @param preset The preset to use for this profile.
     */
    public EncodingContainerProfile(@Nullable java.lang.String name, @Nullable java.lang.String description, org.gstreamer.gst.Caps format, @Nullable java.lang.String preset) {
        super(constructNew(name, description, format, preset));
        this.takeOwnership();
    }
    
    /**
     * Add a {@link EncodingProfile} to the list of profiles handled by {@code container}.
     * <p>
     * No copy of {@code profile} will be made, if you wish to use it elsewhere after this
     * method you should increment its reference count.
     * @param profile the {@link EncodingProfile} to add.
     * @return {@code true} if the {@code stream} was properly added, else {@code false}.
     */
    public boolean addProfile(org.gstreamer.pbutils.EncodingProfile profile) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_container_profile_add_profile.invokeExact(
                    handle(),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        profile.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code container} contains a {@link EncodingProfile} identical to
     * {@code profile}.
     * @param profile a {@link EncodingProfile}
     * @return {@code true} if {@code container} contains a {@link EncodingProfile} identical
     * to {@code profile}, else {@code false}.
     */
    public boolean containsProfile(org.gstreamer.pbutils.EncodingProfile profile) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_container_profile_contains_profile.invokeExact(
                    handle(),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.gtk.glib.List getProfiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_container_profile_get_profiles.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_container_profile_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link EncodingContainerProfile.Builder} object constructs a {@link EncodingContainerProfile} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EncodingContainerProfile.Builder#build()}. 
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
         * Finish building the {@link EncodingContainerProfile} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingContainerProfile}.
         * @return A new instance of {@code EncodingContainerProfile} with the properties 
         *         that were set in the Builder object.
         */
        public EncodingContainerProfile build() {
            return (EncodingContainerProfile) org.gtk.gobject.GObject.newWithProperties(
                EncodingContainerProfile.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_encoding_container_profile_get_type != null;
    }
}
