package org.pango;

/**
 * Flags that influence the behavior of {@link Layout#serialize}.
 * <p>
 * New members may be added to this enumeration over time.
 */
public class LayoutSerializeFlags {

    /**
     * Default behavior
     */
    public static final int DEFAULT = 0;
    
    /**
     * Include context information
     */
    public static final int CONTEXT = 1;
    
    /**
     * Include information about the formatted output
     */
    public static final int OUTPUT = 2;
    
}
