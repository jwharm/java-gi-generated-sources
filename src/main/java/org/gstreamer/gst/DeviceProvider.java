package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link DeviceProvider} subclass is provided by a plugin that handles devices
 * if there is a way to programmatically list connected devices. It can also
 * optionally provide updates to the list of connected devices.
 * <p>
 * Each {@link DeviceProvider} subclass is a singleton, a plugin should
 * normally provide a single subclass for all devices.
 * <p>
 * Applications would normally use a {@link DeviceMonitor} to monitor devices
 * from all relevant providers.
 * @version 1.4
 */
public class DeviceProvider extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceProvider";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("devices"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a DeviceProvider proxy instance for the provided memory address.
     * <p>
     * Because DeviceProvider is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DeviceProvider(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to DeviceProvider if its GType is a (or inherits from) "GstDeviceProvider".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DeviceProvider} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDeviceProvider", a ClassCastException will be thrown.
     */
    public static DeviceProvider castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DeviceProvider.getType())) {
            return new DeviceProvider(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDeviceProvider");
        }
    }
    
    public boolean canMonitor() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_provider_can_monitor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Posts a message on the provider's {@link Bus} to inform applications that
     * a new device has been added.
     * <p>
     * This is for use by subclasses.
     * <p>
     * {@code device}'s reference count will be incremented, and any floating reference
     * will be removed (see gst_object_ref_sink()).
     * @param device a {@link Device} that has been added
     */
    public void deviceAdd(@NotNull org.gstreamer.gst.Device device) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        try {
            DowncallHandles.gst_device_provider_device_add.invokeExact(
                    handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is used when {@code changed_device} was modified into its new form
     * {@code device}. This will post a {@code DEVICE_CHANGED} message on the bus to let
     * the application know that the device was modified. {@link Device} is immutable
     * for MT. safety purposes so this is an "atomic" way of letting the application
     * know when a device was modified.
     * @param device the new version of {@code changed_device}
     * @param changedDevice the old version of the device that has been updated
     */
    public void deviceChanged(@NotNull org.gstreamer.gst.Device device, @NotNull org.gstreamer.gst.Device changedDevice) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(changedDevice, "Parameter 'changedDevice' must not be null");
        try {
            DowncallHandles.gst_device_provider_device_changed.invokeExact(
                    handle(),
                    device.handle(),
                    changedDevice.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Posts a message on the provider's {@link Bus} to inform applications that
     * a device has been removed.
     * <p>
     * This is for use by subclasses.
     * @param device a {@link Device} that has been removed
     */
    public void deviceRemove(@NotNull org.gstreamer.gst.Device device) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        try {
            DowncallHandles.gst_device_provider_device_remove.invokeExact(
                    handle(),
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@link Bus} of this {@link DeviceProvider}
     * @return a {@link Bus}
     */
    public @NotNull org.gstreamer.gst.Bus getBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_get_bus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Bus(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of devices that this provider understands. This may actually
     * probe the hardware if the provider is not currently started.
     * <p>
     * If the provider has been started, this will returned the same {@link Device}
     * objedcts that have been returned by the {@code GST_MESSAGE_DEVICE_ADDED} messages.
     * @return a {@link org.gtk.glib.List} of
     *   {@link Device}
     */
    public @NotNull org.gtk.glib.List getDevices() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_get_devices.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the factory that was used to create this device provider.
     * @return the {@link DeviceProviderFactory} used for
     *     creating this device provider. no refcounting is needed.
     */
    public @Nullable org.gstreamer.gst.DeviceProviderFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_get_factory.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.DeviceProviderFactory(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the provider factory names of the {@link DeviceProvider} instances that
     * are hidden by {@code provider}.
     * @return a list of hidden providers factory names or {@code null} when
     *   nothing is hidden by {@code provider}. Free with g_strfreev.
     */
    public @NotNull PointerString getHiddenProviders() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_get_hidden_providers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Get metadata with {@code key} in {@code provider}.
     * @param key the key to get
     * @return the metadata for {@code key}.
     */
    public @NotNull java.lang.String getMetadata(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_provider_get_metadata.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Make {@code provider} hide the devices from the factory with {@code name}.
     * <p>
     * This function is used when {@code provider} will also provide the devices reported
     * by provider factory {@code name}. A monitor should stop monitoring the
     * device provider with {@code name} to avoid duplicate devices.
     * @param name a provider factory name
     */
    public void hideProvider(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_device_provider_hide_provider.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function can be used to know if the {@code provider} was successfully started.
     */
    public boolean isStarted() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_provider_is_started.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Starts providering the devices. This will cause {@code GST_MESSAGE_DEVICE_ADDED}
     * and {@code GST_MESSAGE_DEVICE_REMOVED} messages to be posted on the provider's bus
     * when devices are added or removed from the system.
     * <p>
     * Since the {@link DeviceProvider} is a singleton,
     * gst_device_provider_start() may already have been called by another
     * user of the object, gst_device_provider_stop() needs to be called the same
     * number of times.
     * <p>
     * After this function has been called, gst_device_provider_get_devices() will
     * return the same objects that have been received from the
     * {@code GST_MESSAGE_DEVICE_ADDED} messages and will no longer probe.
     * @return {@code true} if the device providering could be started
     */
    public boolean start() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_provider_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Decreases the use-count by one. If the use count reaches zero, this
     * {@link DeviceProvider} will stop providering the devices. This needs to be
     * called the same number of times that gst_device_provider_start() was called.
     */
    public void stop() {
        try {
            DowncallHandles.gst_device_provider_stop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Make {@code provider} unhide the devices from factory {@code name}.
     * <p>
     * This function is used when {@code provider} will no longer provide the devices
     * reported by provider factory {@code name}. A monitor should start
     * monitoring the devices from provider factory {@code name} in order to see
     * all devices again.
     * @param name a provider factory name
     */
    public void unhideProvider(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_device_provider_unhide_provider.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
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
            RESULT = (long) DowncallHandles.gst_device_provider_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Create a new device providerfactory capable of instantiating objects of the
     * {@code type} and add the factory to {@code plugin}.
     * @param plugin {@link Plugin} to register the device provider with, or {@code null} for
     *     a static device provider.
     * @param name name of device providers of this type
     * @param rank rank of device provider (higher rank means more importance when autoplugging)
     * @param type GType of device provider to register
     * @return {@code true}, if the registering succeeded, {@code false} on error
     */
    public static boolean register(@Nullable org.gstreamer.gst.Plugin plugin, @NotNull java.lang.String name, int rank, @NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_provider_register.invokeExact(
                    (Addressable) (plugin == null ? MemoryAddress.NULL : plugin.handle()),
                    Interop.allocateNativeString(name),
                    rank,
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface ProviderHidden {
        void signalReceived(DeviceProvider sourceDeviceProvider, @NotNull java.lang.String object);
    }
    
    public Signal<DeviceProvider.ProviderHidden> onProviderHidden(DeviceProvider.ProviderHidden handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("provider-hidden"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DeviceProvider.Callbacks.class, "signalDeviceProviderProviderHidden",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DeviceProvider.ProviderHidden>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ProviderUnhidden {
        void signalReceived(DeviceProvider sourceDeviceProvider, @NotNull java.lang.String object);
    }
    
    public Signal<DeviceProvider.ProviderUnhidden> onProviderUnhidden(DeviceProvider.ProviderUnhidden handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("provider-unhidden"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DeviceProvider.Callbacks.class, "signalDeviceProviderProviderUnhidden",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DeviceProvider.ProviderUnhidden>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link DeviceProvider.Build} object constructs a {@link DeviceProvider} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DeviceProvider} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DeviceProvider} using {@link DeviceProvider#castFrom}.
         * @return A new instance of {@code DeviceProvider} with the properties 
         *         that were set in the Build object.
         */
        public DeviceProvider construct() {
            return DeviceProvider.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DeviceProvider.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_device_provider_can_monitor = Interop.downcallHandle(
            "gst_device_provider_can_monitor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_device_add = Interop.downcallHandle(
            "gst_device_provider_device_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_device_changed = Interop.downcallHandle(
            "gst_device_provider_device_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_device_remove = Interop.downcallHandle(
            "gst_device_provider_device_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_get_bus = Interop.downcallHandle(
            "gst_device_provider_get_bus",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_get_devices = Interop.downcallHandle(
            "gst_device_provider_get_devices",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_get_factory = Interop.downcallHandle(
            "gst_device_provider_get_factory",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_get_hidden_providers = Interop.downcallHandle(
            "gst_device_provider_get_hidden_providers",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_get_metadata = Interop.downcallHandle(
            "gst_device_provider_get_metadata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_hide_provider = Interop.downcallHandle(
            "gst_device_provider_hide_provider",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_is_started = Interop.downcallHandle(
            "gst_device_provider_is_started",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_start = Interop.downcallHandle(
            "gst_device_provider_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_stop = Interop.downcallHandle(
            "gst_device_provider_stop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_unhide_provider = Interop.downcallHandle(
            "gst_device_provider_unhide_provider",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_provider_get_type = Interop.downcallHandle(
            "gst_device_provider_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_device_provider_register = Interop.downcallHandle(
            "gst_device_provider_register",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalDeviceProviderProviderHidden(MemoryAddress sourceDeviceProvider, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DeviceProvider.ProviderHidden) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DeviceProvider(sourceDeviceProvider, Ownership.NONE), Interop.getStringFrom(object));
        }
        
        public static void signalDeviceProviderProviderUnhidden(MemoryAddress sourceDeviceProvider, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DeviceProvider.ProviderUnhidden) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DeviceProvider(sourceDeviceProvider, Ownership.NONE), Interop.getStringFrom(object));
        }
    }
}
