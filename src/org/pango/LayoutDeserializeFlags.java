package org.pango;

/**
 * Flags that influence the behavior of [func@Pango.Layout.deserialize].
 * 
 * New members may be added to this enumeration over time.
 */
public class LayoutDeserializeFlags {

    /**
     * Default behavior
     */
    public static final int DEFAULT = 0;
    
    /**
     * Apply context information
     *   from the serialization to the `PangoContext`
     */
    public static final int CONTEXT = 1;
    
}
