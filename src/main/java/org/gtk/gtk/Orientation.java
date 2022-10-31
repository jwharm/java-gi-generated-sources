package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents the orientation of widgets and other objects.
 * <p>
 * Typical examples are {@link Box}.
 */
public class Orientation extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkOrientation";
    
    /**
     * The element is in horizontal orientation.
     */
    public static final Orientation HORIZONTAL = new Orientation(0);
    
    /**
     * The element is in vertical orientation.
     */
    public static final Orientation VERTICAL = new Orientation(1);
    
    public Orientation(int value) {
        super(value);
    }
}
