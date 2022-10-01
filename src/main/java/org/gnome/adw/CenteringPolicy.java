package org.gnome.adw;

/**
 * Describes title centering behavior of a {@link HeaderBar} widget.
 */
public class CenteringPolicy extends io.github.jwharm.javagi.Enumeration {

    /**
     * Keep the title centered when possible
     */
    public static final CenteringPolicy LOOSE = new CenteringPolicy(0);
    
    /**
     * Keep the title centered at all cost
     */
    public static final CenteringPolicy STRICT = new CenteringPolicy(1);
    
    public CenteringPolicy(int value) {
        super(value);
    }
    
}
