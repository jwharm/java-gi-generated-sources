package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This enumeration defines the color spaces that are supported by
 * the gdk-pixbuf library.
 * <p>
 * Currently only RGB is supported.
 */
public class Colorspace extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkColorspace";
    
    /**
     * Indicates a red/green/blue additive color space.
     */
    public static final Colorspace RGB = new Colorspace(0);
    
    public Colorspace(int value) {
        super(value);
    }
}
