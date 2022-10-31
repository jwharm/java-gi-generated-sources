package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoAlignment} describes how to align the lines of a {@code PangoLayout}
 * within the available space.
 * <p>
 * If the {@code PangoLayout} is set to justify using {@link Layout#setJustify},
 * this only affects partial lines.
 * <p>
 * See {@link Layout#setAutoDir} for how text direction affects
 * the interpretation of {@code PangoAlignment} values.
 */
public class Alignment extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoAlignment";
    
    /**
     * Put all available space on the right
     */
    public static final Alignment LEFT = new Alignment(0);
    
    /**
     * Center the line within the available space
     */
    public static final Alignment CENTER = new Alignment(1);
    
    /**
     * Put all available space on the left
     */
    public static final Alignment RIGHT = new Alignment(2);
    
    public Alignment(int value) {
        super(value);
    }
}
