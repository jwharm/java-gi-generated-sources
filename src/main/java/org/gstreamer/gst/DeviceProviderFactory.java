package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DeviceProviderFactory} is used to create instances of device providers. A
 * GstDeviceProviderfactory can be added to a {@link Plugin} as it is also a
 * {@link PluginFeature}.
 * <p>
 * Use the gst_device_provider_factory_find() and
 * gst_device_provider_factory_get() functions to create device
 * provider instances or use gst_device_provider_factory_get_by_name() as a
 * convenient shortcut.
 * @version 1.4
 */
public class DeviceProviderFactory extends org.gstreamer.gst.PluginFeature {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceProviderFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DeviceProviderFactory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DeviceProviderFactory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DeviceProviderFactory if its GType is a (or inherits from) "GstDeviceProviderFactory".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DeviceProviderFactory} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDeviceProviderFactory", a ClassCastException will be thrown.
     */
    public static DeviceProviderFactory castFrom(org.gtk.gobject.Object gobject) {
            return new DeviceProviderFactory(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Returns the device provider of the type defined by the given device
     * providerfactory.
     * @return the {@link DeviceProvider} or {@code null}
     * if the device provider couldn't be created
     */
    public @Nullable org.gstreamer.gst.DeviceProvider get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_get.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.DeviceProvider(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the {@link org.gtk.gobject.Type} for device providers managed by this factory. The type can
     * only be retrieved if the device provider factory is loaded, which can be
     * assured with gst_plugin_feature_load().
     * @return the {@link org.gtk.gobject.Type} for device providers managed by this factory.
     */
    public @NotNull org.gtk.glib.Type getDeviceProviderType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_device_provider_factory_get_device_provider_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the metadata on {@code factory} with {@code key}.
     * @param key a key
     * @return the metadata with {@code key} on {@code factory} or {@code null}
     * when there was no metadata with the given {@code key}.
     */
    public @Nullable java.lang.String getMetadata(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_get_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the available keys for the metadata on {@code factory}.
     * @return a {@code null}-terminated array of key strings, or {@code null} when there is no
     * metadata. Free with g_strfreev() when no longer needed.
     */
    public @Nullable PointerString getMetadataKeys() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_get_metadata_keys.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Check if {@code factory} matches all of the given {@code classes}
     * @param classes a "/" separate list of classes to match, only match
     *     if all classes are matched
     * @return {@code true} if {@code factory} matches or if {@code classes} is {@code null}.
     */
    public boolean hasClasses(@Nullable java.lang.String classes) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_provider_factory_has_classes.invokeExact(
                    handle(),
                    (Addressable) (classes == null ? MemoryAddress.NULL : Interop.allocateNativeString(classes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if {@code factory} matches all of the given classes
     * @param classes a {@code null} terminated array
     *   of classes to match, only match if all classes are matched
     * @return {@code true} if {@code factory} matches.
     */
    public boolean hasClassesv(@Nullable java.lang.String[] classes) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_provider_factory_has_classesv.invokeExact(
                    handle(),
                    (Addressable) (classes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(classes, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            RESULT = (long) DowncallHandles.gst_device_provider_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Search for an device provider factory of the given name. Refs the returned
     * device provider factory; caller is responsible for unreffing.
     * @param name name of factory to find
     * @return {@link DeviceProviderFactory} if
     * found, {@code null} otherwise
     */
    public static @Nullable org.gstreamer.gst.DeviceProviderFactory find(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_find.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.DeviceProviderFactory(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the device provider of the type defined by the given device
     * provider factory.
     * @param factoryname a named factory to instantiate
     * @return a {@link DeviceProvider} or {@code null}
     * if unable to create device provider
     */
    public static @Nullable org.gstreamer.gst.DeviceProvider getByName(@NotNull java.lang.String factoryname) {
        java.util.Objects.requireNonNull(factoryname, "Parameter 'factoryname' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_get_by_name.invokeExact(
                    Interop.allocateNativeString(factoryname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.DeviceProvider(RESULT, Ownership.FULL);
    }
    
    /**
     * Get a list of factories with a rank greater or equal to {@code minrank}.
     * The list of factories is returned by decreasing rank.
     * @param minrank Minimum rank
     * @return a {@link org.gtk.glib.List} of {@link DeviceProviderFactory} device providers. Use
     * gst_plugin_feature_list_free() after usage.
     */
    public static @NotNull org.gtk.glib.List listGetDeviceProviders(@NotNull org.gstreamer.gst.Rank minrank) {
        java.util.Objects.requireNonNull(minrank, "Parameter 'minrank' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_list_get_device_providers.invokeExact(
                    minrank.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.PluginFeature.Build {
        
         /**
         * A {@link DeviceProviderFactory.Build} object constructs a {@link DeviceProviderFactory} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DeviceProviderFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DeviceProviderFactory} using {@link DeviceProviderFactory#castFrom}.
         * @return A new instance of {@code DeviceProviderFactory} with the properties 
         *         that were set in the Build object.
         */
        public DeviceProviderFactory construct() {
            return DeviceProviderFactory.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DeviceProviderFactory.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_device_provider_factory_get = Interop.downcallHandle(
            "gst_device_provider_factory_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_get_device_provider_type = Interop.downcallHandle(
            "gst_device_provider_factory_get_device_provider_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_get_metadata = Interop.downcallHandle(
            "gst_device_provider_factory_get_metadata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_get_metadata_keys = Interop.downcallHandle(
            "gst_device_provider_factory_get_metadata_keys",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_has_classes = Interop.downcallHandle(
            "gst_device_provider_factory_has_classes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_has_classesv = Interop.downcallHandle(
            "gst_device_provider_factory_has_classesv",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_get_type = Interop.downcallHandle(
            "gst_device_provider_factory_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_find = Interop.downcallHandle(
            "gst_device_provider_factory_find",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_get_by_name = Interop.downcallHandle(
            "gst_device_provider_factory_get_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_factory_list_get_device_providers = Interop.downcallHandle(
            "gst_device_provider_factory_list_get_device_providers",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
