package org.pango;

/**
 * Errors that can be returned by {@link Pango#Layout}.
 */
public class LayoutDeserializeError extends io.github.jwharm.javagi.Enumeration {

    /**
     * Unspecified error
     */
    public static final LayoutDeserializeError INVALID = new LayoutDeserializeError(0);
    
    /**
     * A JSon value could not be
     *   interpreted
     */
    public static final LayoutDeserializeError INVALID_VALUE = new LayoutDeserializeError(1);
    
    /**
     * A required JSon member was
     *   not found
     */
    public static final LayoutDeserializeError MISSING_VALUE = new LayoutDeserializeError(2);
    
    public LayoutDeserializeError(int value) {
        super(value);
    }
    
}
