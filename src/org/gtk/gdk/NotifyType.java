package org.gtk.gdk;

/**
 * Specifies the kind of crossing for enter and leave events.
 * <p>
 * See the X11 protocol specification of LeaveNotify for
 * full details of crossing event generation.
 */
public enum NotifyType {

    /**
     * the surface is entered from an ancestor or
     *   left towards an ancestor.
     */
    ANCESTOR,
    
    /**
     * the pointer moves between an ancestor and an
     *   inferior of the surface.
     */
    VIRTUAL,
    
    /**
     * the surface is entered from an inferior or
     *   left towards an inferior.
     */
    INFERIOR,
    
    /**
     * the surface is entered from or left towards
     *   a surface which is neither an ancestor nor an inferior.
     */
    NONLINEAR,
    
    /**
     * the pointer moves between two surfaces
     *   which are not ancestors of each other and the surface is part of
     *   the ancestor chain between one of these surfaces and their least
     *   common ancestor.
     */
    NONLINEAR_VIRTUAL,
    
    /**
     * an unknown type of enter/leave event occurred.
     */
    UNKNOWN;
    
    public static NotifyType fromValue(int value) {
        return switch(value) {
            case 0 -> ANCESTOR;
            case 1 -> VIRTUAL;
            case 2 -> INFERIOR;
            case 3 -> NONLINEAR;
            case 4 -> NONLINEAR_VIRTUAL;
            case 5 -> UNKNOWN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ANCESTOR -> 0;
            case VIRTUAL -> 1;
            case INFERIOR -> 2;
            case NONLINEAR -> 3;
            case NONLINEAR_VIRTUAL -> 4;
            case UNKNOWN -> 5;
        };
    }

}
