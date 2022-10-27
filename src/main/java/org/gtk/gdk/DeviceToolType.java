package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates the specific type of tool being used being a tablet. Such as an
 * airbrush, pencil, etc.
 */
public class DeviceToolType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Tool is of an unknown type.
     */
    public static final DeviceToolType UNKNOWN = new DeviceToolType(0);
    
    /**
     * Tool is a standard tablet stylus.
     */
    public static final DeviceToolType PEN = new DeviceToolType(1);
    
    /**
     * Tool is standard tablet eraser.
     */
    public static final DeviceToolType ERASER = new DeviceToolType(2);
    
    /**
     * Tool is a brush stylus.
     */
    public static final DeviceToolType BRUSH = new DeviceToolType(3);
    
    /**
     * Tool is a pencil stylus.
     */
    public static final DeviceToolType PENCIL = new DeviceToolType(4);
    
    /**
     * Tool is an airbrush stylus.
     */
    public static final DeviceToolType AIRBRUSH = new DeviceToolType(5);
    
    /**
     * Tool is a mouse.
     */
    public static final DeviceToolType MOUSE = new DeviceToolType(6);
    
    /**
     * Tool is a lens cursor.
     */
    public static final DeviceToolType LENS = new DeviceToolType(7);
    
    public DeviceToolType(int value) {
        super(value);
    }
}
