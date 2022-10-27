package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A pad feature.
 */
public class DevicePadFeature extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * a button
     */
    public static final DevicePadFeature BUTTON = new DevicePadFeature(0);
    
    /**
     * a ring-shaped interactive area
     */
    public static final DevicePadFeature RING = new DevicePadFeature(1);
    
    /**
     * a straight interactive area
     */
    public static final DevicePadFeature STRIP = new DevicePadFeature(2);
    
    public DevicePadFeature(int value) {
        super(value);
    }
}
