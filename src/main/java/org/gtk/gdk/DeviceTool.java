package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A physical tool associated to a {@code GdkDevice}.
 */
public class DeviceTool extends org.gtk.gobject.Object {

    public DeviceTool(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DeviceTool */
    public static DeviceTool castFrom(org.gtk.gobject.Object gobject) {
        return new DeviceTool(gobject.refcounted());
    }
    
    static final MethodHandle gdk_device_tool_get_axes = Interop.downcallHandle(
        "gdk_device_tool_get_axes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the axes of the tool.
     */
    public AxisFlags getAxes() {
        try {
            var RESULT = (int) gdk_device_tool_get_axes.invokeExact(handle());
            return new AxisFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_tool_get_hardware_id = Interop.downcallHandle(
        "gdk_device_tool_get_hardware_id",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
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
     */
    public long getHardwareId() {
        try {
            var RESULT = (long) gdk_device_tool_get_hardware_id.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_tool_get_serial = Interop.downcallHandle(
        "gdk_device_tool_get_serial",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the serial number of this tool.
     * <p>
     * This value can be used to identify a physical tool
     * (eg. a tablet pen) across program executions.
     */
    public long getSerial() {
        try {
            var RESULT = (long) gdk_device_tool_get_serial.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_device_tool_get_tool_type = Interop.downcallHandle(
        "gdk_device_tool_get_tool_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GdkDeviceToolType} of the tool.
     */
    public DeviceToolType getToolType() {
        try {
            var RESULT = (int) gdk_device_tool_get_tool_type.invokeExact(handle());
            return new DeviceToolType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
