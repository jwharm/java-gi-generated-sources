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
     * <p>
     * Because DeviceProviderFactory is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DeviceProviderFactory(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceProviderFactory> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DeviceProviderFactory(input, ownership);
    
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
        return (org.gstreamer.gst.DeviceProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.DeviceProvider.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the {@link org.gtk.glib.Type} for device providers managed by this factory. The type can
     * only be retrieved if the device provider factory is loaded, which can be
     * assured with gst_plugin_feature_load().
     * @return the {@link org.gtk.glib.Type} for device providers managed by this factory.
     */
    public org.gtk.glib.Type getDeviceProviderType() {
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
    public @Nullable java.lang.String getMetadata(java.lang.String key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_get_metadata.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
                    (Addressable) (classes == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(classes, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static @Nullable org.gstreamer.gst.DeviceProviderFactory find(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_find.invokeExact(
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.DeviceProviderFactory) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.DeviceProviderFactory.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the device provider of the type defined by the given device
     * provider factory.
     * @param factoryname a named factory to instantiate
     * @return a {@link DeviceProvider} or {@code null}
     * if unable to create device provider
     */
    public static @Nullable org.gstreamer.gst.DeviceProvider getByName(java.lang.String factoryname) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_get_by_name.invokeExact(
                    Marshal.stringToAddress.marshal(factoryname, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.DeviceProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.DeviceProvider.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get a list of factories with a rank greater or equal to {@code minrank}.
     * The list of factories is returned by decreasing rank.
     * @param minrank Minimum rank
     * @return a {@link org.gtk.glib.List} of {@link DeviceProviderFactory} device providers. Use
     * gst_plugin_feature_list_free() after usage.
     */
    public static org.gtk.glib.List listGetDeviceProviders(org.gstreamer.gst.Rank minrank) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_factory_list_get_device_providers.invokeExact(
                    minrank.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A {@link DeviceProviderFactory.Builder} object constructs a {@link DeviceProviderFactory} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DeviceProviderFactory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.PluginFeature.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DeviceProviderFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DeviceProviderFactory}.
         * @return A new instance of {@code DeviceProviderFactory} with the properties 
         *         that were set in the Builder object.
         */
        public DeviceProviderFactory build() {
            return (DeviceProviderFactory) org.gtk.gobject.GObject.newWithProperties(
                DeviceProviderFactory.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
