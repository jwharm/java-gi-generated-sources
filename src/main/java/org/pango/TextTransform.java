package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration that affects how Pango treats characters during shaping.
 * @version 1.50
 */
public class TextTransform extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoTextTransform";
    
    /**
     * Leave text unchanged
     */
    public static final TextTransform NONE = new TextTransform(0);
    
    /**
     * Display letters and numbers as lowercase
     */
    public static final TextTransform LOWERCASE = new TextTransform(1);
    
    /**
     * Display letters and numbers as uppercase
     */
    public static final TextTransform UPPERCASE = new TextTransform(2);
    
    /**
     * Display the first character of a word
     *   in titlecase
     */
    public static final TextTransform CAPITALIZE = new TextTransform(3);
    
    public TextTransform(int value) {
        super(value);
    }
}
