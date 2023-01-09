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
public class DeviceMonitor extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceMonitor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DeviceMonitor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DeviceMonitor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceMonitor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DeviceMonitor(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_device_monitor_add_filter.invokeExact(
                        handle(),
                        (Addressable) (classes == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(classes, SCOPE)),
                        (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Gets the {@link Bus} of this {@link DeviceMonitor}
     * @return a {@link Bus}
     */
    public org.gstreamer.gst.Bus getBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_monitor_get_bus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Bus) Interop.register(RESULT, org.gstreamer.gst.Bus.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
            RESULT = (MemoryAddress) DowncallHandles.gst_device_monitor_get_devices.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get a list of the currently selected device provider factories.
     * <p>
     * This
     * @return A list of device provider factory names that are currently being
     *     monitored by {@code monitor} or {@code null} when nothing is being monitored.
     */
    public PointerString getProviders() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_device_monitor_get_providers.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Get if {@code monitor} is currently showing all devices, even those from hidden
     * providers.
     * @return {@code true} when all devices will be shown.
     */
    public boolean getShowAllDevices() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_monitor_get_show_all_devices.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
                    Marshal.booleanToInteger.marshal(showAll, null).intValue());
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
            RESULT = (int) DowncallHandles.gst_device_monitor_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Stops monitoring the devices.
     */
    public void stop() {
        try {
            DowncallHandles.gst_device_monitor_stop.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gst_device_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DeviceMonitor.Builder} object constructs a {@link DeviceMonitor} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DeviceMonitor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DeviceMonitor} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DeviceMonitor}.
         * @return A new instance of {@code DeviceMonitor} with the properties 
         *         that were set in the Builder object.
         */
        public DeviceMonitor build() {
            return (DeviceMonitor) org.gtk.gobject.GObject.newWithProperties(
                DeviceMonitor.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setShowAll(boolean showAll) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_device_monitor_get_type != null;
    }
}
