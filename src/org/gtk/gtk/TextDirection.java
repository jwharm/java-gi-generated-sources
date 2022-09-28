package org.gtk.gtk;

/**
 * Reading directions for text.
 */
public class TextDirection extends io.github.jwharm.javagi.Enumeration {

    /**
     * No direction.
     */
    public static final TextDirection NONE = new TextDirection(0);
    
    /**
     * Left to right text direction.
     */
    public static final TextDirection LTR = new TextDirection(1);
    
    /**
     * Right to left text direction.
     */
    public static final TextDirection RTL = new TextDirection(2);
    
    public TextDirection(int value) {
        super(value);
    }
    
}
