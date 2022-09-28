package org.gnome.adw;

/**
 * Describes the possible transitions in a {@link Squeezer} widget.
 */
public class SqueezerTransitionType extends io.github.jwharm.javagi.Enumeration {

    /**
     * No transition
     */
    public static final SqueezerTransitionType NONE = new SqueezerTransitionType(0);
    
    /**
     * A cross-fade
     */
    public static final SqueezerTransitionType CROSSFADE = new SqueezerTransitionType(1);
    
    public SqueezerTransitionType(int value) {
        super(value);
    }
    
}
