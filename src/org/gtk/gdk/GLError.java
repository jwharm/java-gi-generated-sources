package org.gtk.gdk;

/**
 * Error enumeration for {@code GdkGLContext}.
 */
public class GLError {

    /**
     * OpenGL support is not available
     */
    public static final GLError NOT_AVAILABLE = new GLError(0);
    
    /**
     * The requested visual format is not supported
     */
    public static final GLError UNSUPPORTED_FORMAT = new GLError(1);
    
    /**
     * The requested profile is not supported
     */
    public static final GLError UNSUPPORTED_PROFILE = new GLError(2);
    
    /**
     * The shader compilation failed
     */
    public static final GLError COMPILATION_FAILED = new GLError(3);
    
    /**
     * The shader linking failed
     */
    public static final GLError LINK_FAILED = new GLError(4);
    
    private int value;
    
    public GLError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(GLError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
