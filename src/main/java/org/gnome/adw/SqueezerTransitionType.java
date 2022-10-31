package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible transitions in a {@link Squeezer} widget.
 * @version 1.0
 */
public class SqueezerTransitionType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwSqueezerTransitionType";
    
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
