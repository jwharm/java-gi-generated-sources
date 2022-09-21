package org.pango;

/**
 * Flags that influence the behavior of {@link Pango#Layout}.
 * <p>
 * New members may be added to this enumeration over time.
 */
public class LayoutDeserializeFlags {

    /**
     * Default behavior
     */
    public static final int DEFAULT = 0;
    
    /**
     * Apply context information
     *   from the serialization to the {@code PangoContext}
     */
    public static final int CONTEXT = 1;
    
}
