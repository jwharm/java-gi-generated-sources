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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
