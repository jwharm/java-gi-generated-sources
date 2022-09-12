package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A physical tool associated to a `GdkDevice`.
 */
public class DeviceTool extends org.gtk.gobject.Object {

    public DeviceTool(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DeviceTool */
    public static DeviceTool castFrom(org.gtk.gobject.Object gobject) {
        return new DeviceTool(gobject.getReference());
    }
    
    /**
     * Gets the axes of the tool.
     */
    public int getAxes() {
        var RESULT = gtk_h.gdk_device_tool_get_axes(handle());
        return RESULT;
    }
    
    /**
     * Gets the hardware ID of this tool, or 0 if it's not known.
     * 
     * When non-zero, the identificator is unique for the given tool model,
     * meaning that two identical tools will share the same @hardware_id,
     * but will have different serial numbers (see
     * [method@Gdk.DeviceTool.get_serial]).
     * 
     * This is a more concrete (and device specific) method to identify
     * a `GdkDeviceTool` than [method@Gdk.DeviceTool.get_tool_type],
     * as a tablet may support multiple devices with the same
     * `GdkDeviceToolType`, but different hardware identificators.
     */
    public long getHardwareId() {
        var RESULT = gtk_h.gdk_device_tool_get_hardware_id(handle());
        return RESULT;
    }
    
    /**
     * Gets the serial number of this tool.
     * 
     * This value can be used to identify a physical tool
     * (eg. a tablet pen) across program executions.
     */
    public long getSerial() {
        var RESULT = gtk_h.gdk_device_tool_get_serial(handle());
        return RESULT;
    }
    
    /**
     * Gets the `GdkDeviceToolType` of the tool.
     */
    public DeviceToolType getToolType() {
        var RESULT = gtk_h.gdk_device_tool_get_tool_type(handle());
        return DeviceToolType.fromValue(RESULT);
    }
    
}
