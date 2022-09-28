package org.gtk.gdk;

/**
 * The list of the different APIs that GdkGLContext can potentially support.
 */
public class GLAPI {

    /**
     * The OpenGL API
     */
    public static final GLAPI GL = new GLAPI(1);
    
    /**
     * The OpenGL ES API
     */
    public static final GLAPI GLES = new GLAPI(2);
    
    private int value;
    
    public GLAPI(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(GLAPI[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public GLAPI combined(GLAPI mask) {
        return new GLAPI(this.getValue() | mask.getValue());
    }
    
    public static GLAPI combined(GLAPI mask, GLAPI... masks) {
        int value = mask.getValue();
        for (GLAPI arg : masks) {
            value |= arg.getValue();
        }
        return new GLAPI(value);
    }
    
}
