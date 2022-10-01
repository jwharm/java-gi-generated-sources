package org.pango;

/**
 * An enumeration that affects baseline shifts between runs.
 */
public class BaselineShift extends io.github.jwharm.javagi.Enumeration {

    /**
     * Leave the baseline unchanged
     */
    public static final BaselineShift NONE = new BaselineShift(0);
    
    /**
     * Shift the baseline to the superscript position,
     *   relative to the previous run
     */
    public static final BaselineShift SUPERSCRIPT = new BaselineShift(1);
    
    /**
     * Shift the baseline to the subscript position,
     *   relative to the previous run
     */
    public static final BaselineShift SUBSCRIPT = new BaselineShift(2);
    
    public BaselineShift(int value) {
        super(value);
    }
    
}
