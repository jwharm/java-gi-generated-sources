package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoEllipsizeMode} describes what sort of ellipsization
 * should be applied to text.
 * <p>
 * In the ellipsization process characters are removed from the
 * text in order to make it fit to a given width and replaced
 * with an ellipsis.
 */
public class EllipsizeMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoEllipsizeMode";
    
    /**
     * No ellipsization
     */
    public static final EllipsizeMode NONE = new EllipsizeMode(0);
    
    /**
     * Omit characters at the start of the text
     */
    public static final EllipsizeMode START = new EllipsizeMode(1);
    
    /**
     * Omit characters in the middle of the text
     */
    public static final EllipsizeMode MIDDLE = new EllipsizeMode(2);
    
    /**
     * Omit characters at the end of the text
     */
    public static final EllipsizeMode END = new EllipsizeMode(3);
    
    public EllipsizeMode(int value) {
        super(value);
    }
}
