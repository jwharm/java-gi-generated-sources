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
}
