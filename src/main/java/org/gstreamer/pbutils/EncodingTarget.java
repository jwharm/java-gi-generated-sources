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
public class EncodingTarget extends org.gtk.gobject.Object {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EncodingTarget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EncodingTarget if its GType is a (or inherits from) "GstEncodingTarget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EncodingTarget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstEncodingTarget", a ClassCastException will be thrown.
     */
    public static EncodingTarget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EncodingTarget.getType())) {
            return new EncodingTarget(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstEncodingTarget");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @NotNull java.lang.String category, @NotNull java.lang.String description, @NotNull org.gtk.glib.List profiles) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(category, "Parameter 'category' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        java.util.Objects.requireNonNull(profiles, "Parameter 'profiles' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_new.invokeExact(
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(category),
                    Interop.allocateNativeString(description),
                    profiles.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public EncodingTarget(@NotNull java.lang.String name, @NotNull java.lang.String category, @NotNull java.lang.String description, @NotNull org.gtk.glib.List profiles) {
        super(constructNew(name, category, description, profiles), Ownership.FULL);
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
    public boolean addProfile(@NotNull org.gstreamer.pbutils.EncodingProfile profile) {
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_target_add_profile.invokeExact(
                    handle(),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        profile.yieldOwnership();
        return RESULT != 0;
    }
    
    public @NotNull java.lang.String getCategory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_category.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public @NotNull org.gstreamer.pbutils.EncodingProfile getProfile(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_profile.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.EncodingProfile(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gtk.glib.List getProfiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_get_profiles.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Saves the {@code target} to a default user-local directory.
     * @return {@code true} if the target was correctly saved, else {@code false}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean save() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_target_save.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Saves the {@code target} to the provided file location.
     * @param filepath the location to store the {@code target} at.
     * @return {@code true} if the target was correctly saved, else {@code false}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean saveToFile(@NotNull java.lang.String filepath) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filepath, "Parameter 'filepath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_encoding_target_save_to_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filepath),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gstreamer.pbutils.EncodingTarget load(@NotNull java.lang.String name, @Nullable java.lang.String category) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_load.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (category == null ? MemoryAddress.NULL : Interop.allocateNativeString(category)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.pbutils.EncodingTarget(RESULT, Ownership.FULL);
    }
    
    /**
     * Opens the provided file and returns the contained {@link EncodingTarget}.
     * @param filepath The file location to load the {@link EncodingTarget} from
     * @return The {@link EncodingTarget} contained in the file, else
     * {@code null}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gstreamer.pbutils.EncodingTarget loadFromFile(@NotNull java.lang.String filepath) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filepath, "Parameter 'filepath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_target_load_from_file.invokeExact(
                    Interop.allocateNativeString(filepath),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.pbutils.EncodingTarget(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link EncodingTarget.Build} object constructs a {@link EncodingTarget} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EncodingTarget} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EncodingTarget} using {@link EncodingTarget#castFrom}.
         * @return A new instance of {@code EncodingTarget} with the properties 
         *         that were set in the Build object.
         */
        public EncodingTarget construct() {
            return EncodingTarget.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EncodingTarget.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
