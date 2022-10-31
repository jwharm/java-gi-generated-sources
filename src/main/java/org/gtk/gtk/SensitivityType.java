package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines how GTK handles the sensitivity of various controls,
 * such as combo box buttons.
 */
public class SensitivityType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkSensitivityType";
    
    /**
     * The control is made insensitive if no
     *   action can be triggered
     */
    public static final SensitivityType AUTO = new SensitivityType(0);
    
    /**
     * The control is always sensitive
     */
    public static final SensitivityType ON = new SensitivityType(1);
    
    /**
     * The control is always insensitive
     */
    public static final SensitivityType OFF = new SensitivityType(2);
    
    public SensitivityType(int value) {
        super(value);
    }
}
