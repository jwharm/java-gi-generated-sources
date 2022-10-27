package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying the various slant styles possible for a font.
 */
public class Style extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the font is upright.
     */
    public static final Style NORMAL = new Style(0);
    
    /**
     * the font is slanted, but in a roman style.
     */
    public static final Style OBLIQUE = new Style(1);
    
    /**
     * the font is slanted in an italic style.
     */
    public static final Style ITALIC = new Style(2);
    
    public Style(int value) {
        super(value);
    }
}
