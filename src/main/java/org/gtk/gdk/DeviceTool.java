package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A physical tool associated to a {@code GdkDevice}.
 */
public class DeviceTool extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDeviceTool";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DeviceTool proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DeviceTool(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DeviceTool if its GType is a (or inherits from) "GdkDeviceTool".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DeviceTool} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkDeviceTool", a ClassCastException will be thrown.
     */
    public static DeviceTool castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), DeviceTool.getType())) {
            return new DeviceTool(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkDeviceTool");
        }
    }
    
    /**
     * Gets the axes of the tool.
     * @return the axes of {@code tool}
     */
    public @NotNull org.gtk.gdk.AxisFlags getAxes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_tool_get_axes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.AxisFlags(RESULT);
    }
    
    /**
     * Gets the hardware ID of this tool, or 0 if it's not known.
     * <p>
     * When non-zero, the identificator is unique for the given tool model,
     * meaning that two identical tools will share the same {@code hardware_id},
     * but will have different serial numbers (see
     * {@link DeviceTool#getSerial}).
     * <p>
     * This is a more concrete (and device specific) method to identify
     * a {@code GdkDeviceTool} than {@link DeviceTool#getToolType},
     * as a tablet may support multiple devices with the same
     * {@code GdkDeviceToolType}, but different hardware identificators.
     * @return The hardware identificator of this tool.
     */
    public long getHardwareId() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_device_tool_get_hardware_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the serial number of this tool.
     * <p>
     * This value can be used to identify a physical tool
     * (eg. a tablet pen) across program executions.
     * @return The serial ID for this tool
     */
    public long getSerial() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_device_tool_get_serial.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code GdkDeviceToolType} of the tool.
     * @return The physical type for this tool. This can be used to
     *   figure out what sort of pen is being used, such as an airbrush
     *   or a pencil.
     */
    public @NotNull org.gtk.gdk.DeviceToolType getToolType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_tool_get_tool_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceToolType(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_device_tool_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link DeviceTool.Build} object constructs a {@link DeviceTool} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DeviceTool} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DeviceTool} using {@link DeviceTool#castFrom}.
         * @return A new instance of {@code DeviceTool} with the properties 
         *         that were set in the Build object.
         */
        public DeviceTool construct() {
            return DeviceTool.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DeviceTool.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The axes of the tool.
         * @param axes The value for the {@code axes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAxes(org.gtk.gdk.AxisFlags axes) {
            names.add("axes");
            values.add(org.gtk.gobject.Value.create(axes));
            return this;
        }
        
        /**
         * The hardware ID of the tool.
         * @param hardwareId The value for the {@code hardware-id} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHardwareId(long hardwareId) {
            names.add("hardware-id");
            values.add(org.gtk.gobject.Value.create(hardwareId));
            return this;
        }
        
        /**
         * The serial number of the tool.
         * @param serial The value for the {@code serial} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSerial(long serial) {
            names.add("serial");
            values.add(org.gtk.gobject.Value.create(serial));
            return this;
        }
        
        /**
         * The type of the tool.
         * @param toolType The value for the {@code tool-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setToolType(org.gtk.gdk.DeviceToolType toolType) {
            names.add("tool-type");
            values.add(org.gtk.gobject.Value.create(toolType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_device_tool_get_axes = Interop.downcallHandle(
            "gdk_device_tool_get_axes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_tool_get_hardware_id = Interop.downcallHandle(
            "gdk_device_tool_get_hardware_id",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_tool_get_serial = Interop.downcallHandle(
            "gdk_device_tool_get_serial",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_tool_get_tool_type = Interop.downcallHandle(
            "gdk_device_tool_get_tool_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_device_tool_get_type = Interop.downcallHandle(
            "gdk_device_tool_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
