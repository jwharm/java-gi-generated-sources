package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Applications should create a {@link DeviceMonitor} when they want
 * to probe, list and monitor devices of a specific type. The
 * {@link DeviceMonitor} will create the appropriate
 * {@link DeviceProvider} objects and manage them. It will then post
 * messages on its {@link Bus} for devices that have been added and
 * removed.
 * <p>
 * The device monitor will monitor all devices matching the filters that
 * the application has set.
 * <p>
 * The basic use pattern of a device monitor is as follows:
 * <pre>{@code 
 *   static gboolean
 *   my_bus_func (GstBus * bus, GstMessage * message, gpointer user_data)
 *   {
 *      GstDevice *device;
 *      gchar *name;
 * 
 *      switch (GST_MESSAGE_TYPE (message)) {
 *        case GST_MESSAGE_DEVICE_ADDED:
 *          gst_message_parse_device_added (message, &device);
 *          name = gst_device_get_display_name (device);
 *          g_print("Device added: %s\\n", name);
 *          g_free (name);
 *          gst_object_unref (device);
 *          break;
 *        case GST_MESSAGE_DEVICE_REMOVED:
 *          gst_message_parse_device_removed (message, &device);
 *          name = gst_device_get_display_name (device);
 *          g_print("Device removed: %s\\n", name);
 *          g_free (name);
 *          gst_object_unref (device);
 *          break;
 *        default:
 *          break;
 *      }
 * 
 *      return G_SOURCE_CONTINUE;
 *   }
 * 
 *   GstDeviceMonitor *
 *   setup_raw_video_source_device_monitor (void) {
 *      GstDeviceMonitor *monitor;
 *      GstBus *bus;
 *      GstCaps *caps;
 * 
 *      monitor = gst_device_monitor_new ();
 * 
 *      bus = gst_device_monitor_get_bus (monitor);
 *      gst_bus_add_watch (bus, my_bus_func, NULL);
 *      gst_object_unref (bus);
 * 
 *      caps = gst_caps_new_empty_simple ("video/x-raw");
 *      gst_device_monitor_add_filter (monitor, "Video/Source", caps);
 *      gst_caps_unref (caps);
 * 
 *      gst_device_monitor_start (monitor);
 * 
 *      return monitor;
 *   }
 * }</pre>
 * @version 1.4
 */
public class DeviceMonitor extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceMonitor";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
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
     * Create a DeviceMonitor proxy instance for the provided memory address.
     * <p>
     * Because DeviceMonitor is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DeviceMonitor(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to DeviceMonitor if its GType is a (or inherits from) "GstDeviceMonitor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DeviceMonitor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDeviceMonitor", a ClassCastException will be thrown.
     */
    public static DeviceMonitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), DeviceMonitor.getType())) {
            return new DeviceMonitor(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstDeviceMonitor");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_monitor_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link DeviceMonitor}
     */
    public DeviceMonitor() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Adds a filter for which {@link Device} will be monitored, any device that matches
     * all these classes and the {@link Caps} will be returned.
     * <p>
     * If this function is called multiple times to add more filters, each will be
     * matched independently. That is, adding more filters will not further restrict
     * what devices are matched.
     * <p>
     * The {@link Caps} supported by the device as returned by gst_device_get_caps() are
     * not intersected with caps filters added using this function.
     * <p>
     * Filters must be added before the {@link DeviceMonitor} is started.
     * @param classes device classes to use as filter or {@code null} for any class
     * @param caps the {@link Caps} to filter or {@code null} for ANY
     * @return The id of the new filter or 0 if no provider matched the filter's
     *  classes.
     */
    public int addFilter(@Nullable java.lang.String classes, @Nullable org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_monitor_add_filter.invokeExact(
                    handle(),
                    (Addressable) (classes == null ? MemoryAddress.NULL : Interop.allocateNativeString(classes)),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@link Bus} of this {@link DeviceMonitor}
     * @return a {@link Bus}
     */
    public @NotNull org.gstreamer.gst.Bus getBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_monitor_get_bus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Bus(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a list of devices from all of the relevant monitors. This may actually
     * probe the hardware if the monitor is not currently started.
     * @return a {@link org.gtk.glib.List} of
     *   {@link Device}
     */
    public @Nullable org.gtk.glib.List getDevices() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_monitor_get_devices.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Get a list of the currently selected device provider factories.
     * <p>
     * This
     * @return A list of device provider factory names that are currently being
     *     monitored by {@code monitor} or {@code null} when nothing is being monitored.
     */
    public @NotNull PointerString getProviders() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_monitor_get_providers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Get if {@code monitor} is currently showing all devices, even those from hidden
     * providers.
     * @return {@code true} when all devices will be shown.
     */
    public boolean getShowAllDevices() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_monitor_get_show_all_devices.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes a filter from the {@link DeviceMonitor} using the id that was returned
     * by gst_device_monitor_add_filter().
     * @param filterId the id of the filter
     * @return {@code true} of the filter id was valid, {@code false} otherwise
     */
    public boolean removeFilter(int filterId) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_monitor_remove_filter.invokeExact(
                    handle(),
                    filterId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set if all devices should be visible, even those devices from hidden
     * providers. Setting {@code show_all} to true might show some devices multiple times.
     * @param showAll show all devices
     */
    public void setShowAllDevices(boolean showAll) {
        try {
            DowncallHandles.gst_device_monitor_set_show_all_devices.invokeExact(
                    handle(),
                    showAll ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Starts monitoring the devices, one this has succeeded, the
     * {@link MessageType#DEVICE_ADDED} and {@link MessageType#DEVICE_REMOVED} messages
     * will be emitted on the bus when the list of devices changes.
     * @return {@code true} if the device monitoring could be started, i.e. at least a
     *     single device provider was started successfully.
     */
    public boolean start() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_monitor_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Stops monitoring the devices.
     */
    public void stop() {
        try {
            DowncallHandles.gst_device_monitor_stop.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gst_device_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link DeviceMonitor.Build} object constructs a {@link DeviceMonitor} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DeviceMonitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DeviceMonitor} using {@link DeviceMonitor#castFrom}.
         * @return A new instance of {@code DeviceMonitor} with the properties 
         *         that were set in the Build object.
         */
        public DeviceMonitor construct() {
            return DeviceMonitor.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DeviceMonitor.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setShowAll(boolean showAll) {
            names.add("show-all");
            values.add(org.gtk.gobject.Value.create(showAll));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_device_monitor_new = Interop.downcallHandle(
            "gst_device_monitor_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_add_filter = Interop.downcallHandle(
            "gst_device_monitor_add_filter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_get_bus = Interop.downcallHandle(
            "gst_device_monitor_get_bus",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_get_devices = Interop.downcallHandle(
            "gst_device_monitor_get_devices",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_get_providers = Interop.downcallHandle(
            "gst_device_monitor_get_providers",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_get_show_all_devices = Interop.downcallHandle(
            "gst_device_monitor_get_show_all_devices",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_remove_filter = Interop.downcallHandle(
            "gst_device_monitor_remove_filter",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_device_monitor_set_show_all_devices = Interop.downcallHandle(
            "gst_device_monitor_set_show_all_devices",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_device_monitor_start = Interop.downcallHandle(
            "gst_device_monitor_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_stop = Interop.downcallHandle(
            "gst_device_monitor_stop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_monitor_get_type = Interop.downcallHandle(
            "gst_device_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
