package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleState#PRESSED}
 * accessible state.
 * <p>
 * Note that the {@link AccessibleTristate#FALSE} and
 * {@link AccessibleTristate#TRUE} have the same values
 * as {@code false} and {@code true}.
 */
public class AccessibleTristate extends io.github.jwharm.javagi.Enumeration {

    /**
     * The state is {@code false}
     */
    public static final AccessibleTristate FALSE = new AccessibleTristate(0);
    
    /**
     * The state is {@code true}
     */
    public static final AccessibleTristate TRUE = new AccessibleTristate(1);
    
    /**
     * The state is {@code mixed}
     */
    public static final AccessibleTristate MIXED = new AccessibleTristate(2);
    
    public AccessibleTristate(int value) {
        super(value);
    }
    
}
