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
public class Device extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDevice";
    
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
     * Create a Device proxy instance for the provided memory address.
     * <p>
     * Because Device is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Device(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Device> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Device(input, ownership);
    
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
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Element.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the "class" of a device. This is a "/" separated list of
     * classes that represent this device. They are a subset of the
     * classes of the {@link DeviceProvider} that produced this device.
     * @return The device class. Free with g_free() after use.
     */
    public java.lang.String getDeviceClass() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_get_device_class.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the user-friendly name of the device.
     * @return The device name. Free with g_free() after use.
     */
    public java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_device_get_display_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Check if {@code device} matches all of the given classes
     * @param classes a "/"-separated list of device classes to match, only match if
     *  all classes are matched
     * @return {@code true} if {@code device} matches.
     */
    public boolean hasClasses(java.lang.String classes) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_has_classes.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(classes, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code factory} matches all of the given classes
     * @param classes a {@code null} terminated array of classes
     *   to match, only match if all classes are matched
     * @return {@code true} if {@code device} matches.
     */
    public boolean hasClassesv(java.lang.String[] classes) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_has_classesv.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(classes, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean reconfigureElement(org.gstreamer.gst.Element element) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_device_reconfigure_element.invokeExact(
                    handle(),
                    element.handle());
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
            RESULT = (long) DowncallHandles.gst_device_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Removed {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDevice) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Removed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<Device.Removed> onRemoved(Device.Removed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Device.Builder} object constructs a {@link Device} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Device.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Device} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Device}.
         * @return A new instance of {@code Device} with the properties 
         *         that were set in the Builder object.
         */
        public Device build() {
            return (Device) org.gtk.gobject.GObject.newWithProperties(
                Device.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        public Builder setDeviceClass(java.lang.String deviceClass) {
            names.add("device-class");
            values.add(org.gtk.gobject.Value.create(deviceClass));
            return this;
        }
        
        public Builder setDisplayName(java.lang.String displayName) {
            names.add("display-name");
            values.add(org.gtk.gobject.Value.create(displayName));
            return this;
        }
        
        public Builder setProperties(org.gstreamer.gst.Structure properties) {
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
}
