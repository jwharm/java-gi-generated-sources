package org.gtk.graphene;

/**
 * The type of intersection.
 */
public enum RayIntersectionKind {

    /**
     * No intersection
     */
    NONE,
    
    /**
     * The ray is entering the intersected
     *   object
     */
    ENTER,
    
    /**
     * The ray is leaving the intersected
     *   object
     */
    LEAVE;
    
    public static RayIntersectionKind fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> ENTER;
            case 2 -> LEAVE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case ENTER -> 1;
            case LEAVE -> 2;
        };
    }

}
