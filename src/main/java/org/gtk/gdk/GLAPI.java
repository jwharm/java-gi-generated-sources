package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of the different APIs that GdkGLContext can potentially support.
 * @version 4.6
 */
public class GLAPI extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkGLAPI";
    
    /**
     * The OpenGL API
     */
    public static final GLAPI GL = new GLAPI(1);
    
    /**
     * The OpenGL ES API
     */
    public static final GLAPI GLES = new GLAPI(2);
    
    public GLAPI(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public GLAPI or(GLAPI... masks) {
        int value = this.getValue();
        for (GLAPI arg : masks) {
            value |= arg.getValue();
        }
        return new GLAPI(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GLAPI combined(GLAPI mask, GLAPI... masks) {
        int value = mask.getValue();
        for (GLAPI arg : masks) {
            value |= arg.getValue();
        }
        return new GLAPI(value);
    }
}
