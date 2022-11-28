package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Device} are objects representing a device, they contain
 * relevant metadata about the device, such as its class and the {@link Caps}
 * representing the media types it can produce or handle.
 * <p>
 * {@link Device} are created by {@link DeviceProvider} objects which can be
 * aggregated by {@link DeviceMonitor} objects.
 * @version 1.4
 */
public class Device extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDevice";
    
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
     * Create a Device proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Device(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Device if its GType is a (or inherits from) "GstDevice".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Device} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstDevice", a ClassCastException will be thrown.
     */
    public static Device castFrom(org.gtk.gobject.Object gobject) {
            return new Device(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Creates the element with all of the required parameters set to use
     * this device.
     * @param name name of new element, or {@code null} to automatically
     * create a unique name.
     * @return a new {@link Element} configured to use
     * this device
     */
    public @Nullable org.gstreamer.gst.Element createElement(@Nullable java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_create_element.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.NONE);
    }
    
    /**
     * Getter for the {@link Caps} that this device supports.
     * @return The {@link Caps} supported by this device. Unref with
     * gst_caps_unref() when done.
     */
    public @Nullable org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the "class" of a device. This is a "/" separated list of
     * classes that represent this device. They are a subset of the
     * classes of the {@link DeviceProvider} that produced this device.
     * @return The device class. Free with g_free() after use.
     */
    public @NotNull java.lang.String getDeviceClass() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_get_device_class.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the user-friendly name of the device.
     * @return The device name. Free with g_free() after use.
     */
    public @NotNull java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_get_display_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the extra properties of a device.
     * @return The extra properties or {@code null} when there are none.
     *          Free with gst_structure_free() after use.
     */
    public @Nullable org.gstreamer.gst.Structure getProperties() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_get_properties.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.FULL);
    }
    
    /**
     * Check if {@code device} matches all of the given classes
     * @param classes a "/"-separated list of device classes to match, only match if
     *  all classes are matched
     * @return {@code true} if {@code device} matches.
     */
    public boolean hasClasses(@NotNull java.lang.String classes) {
        java.util.Objects.requireNonNull(classes, "Parameter 'classes' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_has_classes.invokeExact(
                    handle(),
                    Interop.allocateNativeString(classes));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if {@code factory} matches all of the given classes
     * @param classes a {@code null} terminated array of classes
     *   to match, only match if all classes are matched
     * @return {@code true} if {@code device} matches.
     */
    public boolean hasClassesv(@NotNull java.lang.String[] classes) {
        java.util.Objects.requireNonNull(classes, "Parameter 'classes' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_has_classesv.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(classes, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tries to reconfigure an existing element to use the device. If this
     * function fails, then one must destroy the element and create a new one
     * using gst_device_create_element().
     * <p>
     * Note: This should only be implemented for elements can change their
     * device in the PLAYING state.
     * @param element a {@link Element}
     * @return {@code true} if the element could be reconfigured to use this device,
     * {@code false} otherwise.
     */
    public boolean reconfigureElement(@NotNull org.gstreamer.gst.Element element) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_reconfigure_element.invokeExact(
                    handle(),
                    element.handle());
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
            RESULT = (long) DowncallHandles.gst_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Removed {
        void signalReceived(Device source);
    }
    
    public Signal<Device.Removed> onRemoved(Device.Removed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Device.Callbacks.class, "signalDeviceRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Device.Removed>(handle(), RESULT);
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
         * A {@link Device.Build} object constructs a {@link Device} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Device} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Device} using {@link Device#castFrom}.
         * @return A new instance of {@code Device} with the properties 
         *         that were set in the Build object.
         */
        public Device construct() {
            return Device.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Device.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        public Build setDeviceClass(java.lang.String deviceClass) {
            names.add("device-class");
            values.add(org.gtk.gobject.Value.create(deviceClass));
            return this;
        }
        
        public Build setDisplayName(java.lang.String displayName) {
            names.add("display-name");
            values.add(org.gtk.gobject.Value.create(displayName));
            return this;
        }
        
        public Build setProperties(org.gstreamer.gst.Structure properties) {
            names.add("properties");
            values.add(org.gtk.gobject.Value.create(properties));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_device_create_element = Interop.downcallHandle(
            "gst_device_create_element",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_get_caps = Interop.downcallHandle(
            "gst_device_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_get_device_class = Interop.downcallHandle(
            "gst_device_get_device_class",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_get_display_name = Interop.downcallHandle(
            "gst_device_get_display_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_get_properties = Interop.downcallHandle(
            "gst_device_get_properties",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_has_classes = Interop.downcallHandle(
            "gst_device_has_classes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_has_classesv = Interop.downcallHandle(
            "gst_device_has_classesv",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_reconfigure_element = Interop.downcallHandle(
            "gst_device_reconfigure_element",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_device_get_type = Interop.downcallHandle(
            "gst_device_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalDeviceRemoved(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Device.Removed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Device(source, Ownership.NONE));
        }
    }
}
