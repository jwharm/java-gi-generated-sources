package org.gtk.gtk;

/**
 * Flags that influence the behavior of {@link Widget#pick}.
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
     * Include widgets that are marked as non-targetable. See {@code Widget:can-target}
     */
    public static final int NON_TARGETABLE = 2;
    
}
