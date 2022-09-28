package org.gtk.gdk;

/**
 * The list of the different APIs that GdkGLContext can potentially support.
 */
public class GLAPI extends io.github.jwharm.javagi.Bitfield {

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
