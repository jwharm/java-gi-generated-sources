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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public DeviceTool(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DeviceTool */
    public static DeviceTool castFrom(org.gtk.gobject.Object gobject) {
        return new DeviceTool(gobject.refcounted());
    }
    
    /**
     * Gets the axes of the tool.
     * @return the axes of {@code tool}
     */
    public @NotNull org.gtk.gdk.AxisFlags getAxes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_device_tool_get_axes.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gdk_device_tool_get_hardware_id.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gdk_device_tool_get_serial.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gdk_device_tool_get_tool_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceToolType(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_device_tool_get_axes = Interop.downcallHandle(
            "gdk_device_tool_get_axes",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_tool_get_hardware_id = Interop.downcallHandle(
            "gdk_device_tool_get_hardware_id",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_tool_get_serial = Interop.downcallHandle(
            "gdk_device_tool_get_serial",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_device_tool_get_tool_type = Interop.downcallHandle(
            "gdk_device_tool_get_tool_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
