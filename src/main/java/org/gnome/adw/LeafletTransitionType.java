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
public enum LeafletTransitionType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Cover the old page or uncover the new page, sliding from or towards the end according to orientation, text direction and children order
     */
    OVER(0),
    /**
     * Uncover the new page or cover the old page, sliding from or towards the start according to orientation, text direction and children order
     */
    UNDER(1),
    /**
     * Slide from left, right, up or down according to the orientation, text direction and the children order
     */
    SLIDE(2);
    
    private static final java.lang.String C_TYPE_NAME = "AdwLeafletTransitionType";
    
    private final int value;
    LeafletTransitionType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static LeafletTransitionType of(int value) {
        return switch (value) {
            case 0 -> OVER;
            case 1 -> UNDER;
            case 2 -> SLIDE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
