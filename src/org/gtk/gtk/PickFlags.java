package org.gtk.gtk;

/**
 * Flags that influence the behavior of {@link [method@Widget.pick]}.
 */
public class PickFlags {

    /**
     * The default behavior, include widgets that are receiving events
     */
    public static final int DEFAULT = 0;
    
    /**
     * Include widgets that are insensitive
     */
    public static final int INSENSITIVE = 1;
    
    /**
     * Include widgets that are marked as non-targetable. See {@link [property@Widget:can-target] (ref=property)}
     */
    public static final int NON_TARGETABLE = 2;
    
}
