package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to reference the parts of {@code GtkTextView}.
 */
public class TextWindowType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextWindowType";
    
    /**
     * Window that floats over scrolling areas.
     */
    public static final TextWindowType WIDGET = new TextWindowType(1);
    
    /**
     * Scrollable text window.
     */
    public static final TextWindowType TEXT = new TextWindowType(2);
    
    /**
     * Left side border window.
     */
    public static final TextWindowType LEFT = new TextWindowType(3);
    
    /**
     * Right side border window.
     */
    public static final TextWindowType RIGHT = new TextWindowType(4);
    
    /**
     * Top border window.
     */
    public static final TextWindowType TOP = new TextWindowType(5);
    
    /**
     * Bottom border window.
     */
    public static final TextWindowType BOTTOM = new TextWindowType(6);
    
    public TextWindowType(int value) {
        super(value);
    }
}
