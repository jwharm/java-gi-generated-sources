package org.gnome.adw;

/**
 * Determines when {@code Leaflet} will fold.
 */
public class FoldThresholdPolicy extends io.github.jwharm.javagi.Enumeration {

    /**
     * Folding is based on the minimum size
     */
    public static final FoldThresholdPolicy MINIMUM = new FoldThresholdPolicy(0);
    
    /**
     * Folding is based on the natural size
     */
    public static final FoldThresholdPolicy NATURAL = new FoldThresholdPolicy(1);
    
    public FoldThresholdPolicy(int value) {
        super(value);
    }
    
}
