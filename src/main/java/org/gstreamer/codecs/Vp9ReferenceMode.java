package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Reference modes: Specify the type of inter prediction to be used
 * @version 1.20
 */
public enum Vp9ReferenceMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Indicates that all the inter blocks use only a single reference frame
     */
    SINGLE_REFERENCE(0),
    
    /**
     * Requires all the inter blocks to use compound mode
     */
    COMPOUND_REFERENCE(1),
    
    /**
     * Allows each individual inter block to select between single and compound prediction modes
     */
    SELECT(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9ReferenceMode";
    
    private final int value;
    
    /**
     * Create a new Vp9ReferenceMode for the provided value
     * @param numeric value the enum value
     */
    Vp9ReferenceMode(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new Vp9ReferenceMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Vp9ReferenceMode of(int value) {
        return switch (value) {
            case 0 -> SINGLE_REFERENCE;
            case 1 -> COMPOUND_REFERENCE;
            case 2 -> SELECT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
