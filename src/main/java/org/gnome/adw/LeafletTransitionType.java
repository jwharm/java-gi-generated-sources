package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible transitions in a {@link Leaflet} widget.
 * <p>
 * New values may be added to this enumeration over time.
 * @version 1.0
 */
public class LeafletTransitionType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwLeafletTransitionType";
    
    /**
     * Cover the old page or uncover the new page, sliding from or towards the end according to orientation, text direction and children order
     */
    public static final LeafletTransitionType OVER = new LeafletTransitionType(0);
    
    /**
     * Uncover the new page or cover the old page, sliding from or towards the start according to orientation, text direction and children order
     */
    public static final LeafletTransitionType UNDER = new LeafletTransitionType(1);
    
    /**
     * Slide from left, right, up or down according to the orientation, text direction and the children order
     */
    public static final LeafletTransitionType SLIDE = new LeafletTransitionType(2);
    
    public LeafletTransitionType(int value) {
        super(value);
    }
}
