package org.pango;

/**
 * Flags that influence the behavior of {@link Layout#serialize}.
 * <p>
 * New members may be added to this enumeration over time.
 */
public class LayoutSerializeFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * Default behavior
     */
    public static final LayoutSerializeFlags DEFAULT = new LayoutSerializeFlags(0);
    
    /**
     * Include context information
     */
    public static final LayoutSerializeFlags CONTEXT = new LayoutSerializeFlags(1);
    
    /**
     * Include information about the formatted output
     */
    public static final LayoutSerializeFlags OUTPUT = new LayoutSerializeFlags(2);
    
    public LayoutSerializeFlags(int value) {
        super(value);
    }
    
}
