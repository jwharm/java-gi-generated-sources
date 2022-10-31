package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Reading directions for text.
 */
public class TextDirection extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextDirection";
    
    /**
     * No direction.
     */
    public static final TextDirection NONE = new TextDirection(0);
    
    /**
     * Left to right text direction.
     */
    public static final TextDirection LTR = new TextDirection(1);
    
    /**
     * Right to left text direction.
     */
    public static final TextDirection RTL = new TextDirection(2);
    
    public TextDirection(int value) {
        super(value);
    }
}
