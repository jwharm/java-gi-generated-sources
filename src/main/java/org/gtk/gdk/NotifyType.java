package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the kind of crossing for enter and leave events.
 * <p>
 * See the X11 protocol specification of LeaveNotify for
 * full details of crossing event generation.
 */
public enum NotifyType implements io.github.jwharm.javagi.Enumeration {
    /**
     * the surface is entered from an ancestor or
     *   left towards an ancestor.
     */
    ANCESTOR(0),
    /**
     * the pointer moves between an ancestor and an
     *   inferior of the surface.
     */
    VIRTUAL(1),
    /**
     * the surface is entered from an inferior or
     *   left towards an inferior.
     */
    INFERIOR(2),
    /**
     * the surface is entered from or left towards
     *   a surface which is neither an ancestor nor an inferior.
     */
    NONLINEAR(3),
    /**
     * the pointer moves between two surfaces
     *   which are not ancestors of each other and the surface is part of
     *   the ancestor chain between one of these surfaces and their least
     *   common ancestor.
     */
    NONLINEAR_VIRTUAL(4),
    /**
     * an unknown type of enter/leave event occurred.
     */
    UNKNOWN(5);
    
    private static final java.lang.String C_TYPE_NAME = "GdkNotifyType";
    
    private final int value;
    NotifyType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static NotifyType of(int value) {
        return switch (value) {
            case 0 -> ANCESTOR;
            case 1 -> VIRTUAL;
            case 2 -> INFERIOR;
            case 3 -> NONLINEAR;
            case 4 -> NONLINEAR_VIRTUAL;
            case 5 -> UNKNOWN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
