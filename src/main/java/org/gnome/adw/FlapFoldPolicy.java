package org.gnome.adw;

/**
 * Describes the possible folding behavior of a {@link Flap} widget.
 */
public class FlapFoldPolicy extends io.github.jwharm.javagi.Enumeration {

    /**
     * Disable folding, the flap cannot reach narrow
     *   sizes.
     */
    public static final FlapFoldPolicy NEVER = new FlapFoldPolicy(0);
    
    /**
     * Keep the flap always folded.
     */
    public static final FlapFoldPolicy ALWAYS = new FlapFoldPolicy(1);
    
    /**
     * Fold and unfold the flap based on available
     *   space.
     */
    public static final FlapFoldPolicy AUTO = new FlapFoldPolicy(2);
    
    public FlapFoldPolicy(int value) {
        super(value);
    }
    
}
