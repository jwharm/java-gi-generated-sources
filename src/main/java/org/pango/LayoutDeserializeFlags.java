package org.pango;

/**
 * Flags that influence the behavior of {@link Pango#Layout}.
 * <p>
 * New members may be added to this enumeration over time.
 */
public class LayoutDeserializeFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * Default behavior
     */
    public static final LayoutDeserializeFlags DEFAULT = new LayoutDeserializeFlags(0);
    
    /**
     * Apply context information
     *   from the serialization to the {@code PangoContext}
     */
    public static final LayoutDeserializeFlags CONTEXT = new LayoutDeserializeFlags(1);
    
    public LayoutDeserializeFlags(int value) {
        super(value);
    }
    
}
