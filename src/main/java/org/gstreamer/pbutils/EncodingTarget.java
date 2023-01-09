package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Collection of {@link EncodingProfile} for a specific target or use-case.
 * <p>
 * When being stored/loaded, targets come from a specific category, like
 * {@code GST_ENCODING_CATEGORY_DEVICE}.
 */
public class EncodingTarget extends org.gtk.gobject.GObject {
    
    static {
        GstPbutils.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEncodingTarget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EncodingTarget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EncodingTarget(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EncodingTarget> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EncodingTarget(input);
    
    private static MemoryAddress constructNew(java.lang.String name, java.lang.String category, java.lang.String description, org.gtk.glib.List profiles) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_new.invokeExact(
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(category, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE),
                        profiles.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@link EncodingTarget}.
     * <p>
     * The name and category can only consist of lowercase ASCII letters for the
     * first character, followed by either lowercase ASCII letters, digits or
     * hyphens ('-').
     * <p>
     * The {@code category} <em>should</em> be one of the existing
     * well-defined categories, like {@code GST_ENCODING_CATEGORY_DEVICE}, but it
     * <em>can</em> be a application or user specific category if
     * needed.
     * @param name The name of the target.
     * @param category The name of the category to which this {@code target}
     * belongs. For example: {@code GST_ENCODING_CATEGORY_DEVICE}.
     * @param description A description of {@link EncodingTarget} in the
     * current locale.
     * @param profiles A {@link org.gtk.glib.List} of
     * {@link EncodingProfile}.
     */
    public EncodingTarget(java.lang.String name, java.lang.String category, java.lang.String description, org.gtk.glib.List profiles) {
        super(constructNew(name, category, description, profiles));
        this.takeOwnership();
    }
    
    /**
     * Adds the given {@code profile} to the {@code target}. Each added profile must have
     * a unique name within the profile.
     * <p>
     * The {@code target} will steal a reference to the {@code profile}. If you wish to use
     * the profile after calling this method, you should increase its reference
     * count.
     * @param profile the {@link EncodingProfile} to add
     * @return {@code true} if the profile was added, else {@code false}.
     */
    public boolean addProfile(org.gstreamer.pbutils.EncodingProfile profile) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_target_add_profile.invokeExact(
                    handle(),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        profile.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public java.lang.String getCategory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_category.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public org.gstreamer.pbutils.EncodingProfile getProfile(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_profile.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.pbutils.EncodingProfile) Interop.register(RESULT, org.gstreamer.pbutils.EncodingProfile.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public org.gtk.glib.List getProfiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_profiles.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Saves the {@code target} to a default user-local directory.
     * @return {@code true} if the target was correctly saved, else {@code false}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean save() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_encoding_target_save.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Saves the {@code target} to the provided file location.
     * @param filepath the location to store the {@code target} at.
     * @return {@code true} if the target was correctly saved, else {@code false}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean saveToFile(java.lang.String filepath) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_encoding_target_save_to_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(filepath, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_encoding_target_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Searches for the {@link EncodingTarget} with the given name, loads it
     * and returns it.
     * <p>
     * If the category name is specified only targets from that category will be
     * searched for.
     * @param name the name of the {@link EncodingTarget} to load (automatically
     * converted to lower case internally as capital letters are not
     * valid for target names).
     * @param category the name of the target category, like
     * {@code GST_ENCODING_CATEGORY_DEVICE}. Can be {@code null}
     * @return The {@link EncodingTarget} if available, else {@code null}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gstreamer.pbutils.EncodingTarget load(java.lang.String name, @Nullable java.lang.String category) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_load.invokeExact(
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) (category == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(category, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gstreamer.pbutils.EncodingTarget) Interop.register(RESULT, org.gstreamer.pbutils.EncodingTarget.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Opens the provided file and returns the contained {@link EncodingTarget}.
     * @param filepath The file location to load the {@link EncodingTarget} from
     * @return The {@link EncodingTarget} contained in the file, else
     * {@code null}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gstreamer.pbutils.EncodingTarget loadFromFile(java.lang.String filepath) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_load_from_file.invokeExact(Marshal.stringToAddress.marshal(filepath, SCOPE),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gstreamer.pbutils.EncodingTarget) Interop.register(RESULT, org.gstreamer.pbutils.EncodingTarget.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * A {@link EncodingTarget.Builder} object constructs a {@link EncodingTarget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EncodingTarget.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EncodingTarget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingTarget}.
         * @return A new instance of {@code EncodingTarget} with the properties 
         *         that were set in the Builder object.
         */
        public EncodingTarget build() {
            return (EncodingTarget) org.gtk.gobject.GObject.newWithProperties(
                EncodingTarget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_encoding_target_new = Interop.downcallHandle(
                "gst_encoding_target_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_add_profile = Interop.downcallHandle(
                "gst_encoding_target_add_profile",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_get_category = Interop.downcallHandle(
                "gst_encoding_target_get_category",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_get_description = Interop.downcallHandle(
                "gst_encoding_target_get_description",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_get_name = Interop.downcallHandle(
                "gst_encoding_target_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_get_path = Interop.downcallHandle(
                "gst_encoding_target_get_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_get_profile = Interop.downcallHandle(
                "gst_encoding_target_get_profile",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_get_profiles = Interop.downcallHandle(
                "gst_encoding_target_get_profiles",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_save = Interop.downcallHandle(
                "gst_encoding_target_save",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_save_to_file = Interop.downcallHandle(
                "gst_encoding_target_save_to_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_get_type = Interop.downcallHandle(
                "gst_encoding_target_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_encoding_target_load = Interop.downcallHandle(
                "gst_encoding_target_load",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_encoding_target_load_from_file = Interop.downcallHandle(
                "gst_encoding_target_load_from_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_encoding_target_get_type != null;
    }
}
