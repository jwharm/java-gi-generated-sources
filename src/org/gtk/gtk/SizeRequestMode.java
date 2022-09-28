package org.gtk.gtk;

/**
 * Specifies a preference for height-for-width or
 * width-for-height geometry management.
 */
public class SizeRequestMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * Prefer height-for-width geometry management
     */
    public static final SizeRequestMode HEIGHT_FOR_WIDTH = new SizeRequestMode(0);
    
    /**
     * Prefer width-for-height geometry management
     */
    public static final SizeRequestMode WIDTH_FOR_HEIGHT = new SizeRequestMode(1);
    
    /**
     * Don’t trade height-for-width or width-for-height
     */
    public static final SizeRequestMode CONSTANT_SIZE = new SizeRequestMode(2);
    
    public SizeRequestMode(int value) {
        super(value);
    }
    
}
