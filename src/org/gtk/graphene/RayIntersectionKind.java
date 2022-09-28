package org.gtk.graphene;

/**
 * The type of intersection.
 */
public class RayIntersectionKind extends io.github.jwharm.javagi.Enumeration {

    /**
     * No intersection
     */
    public static final RayIntersectionKind NONE = new RayIntersectionKind(0);
    
    /**
     * The ray is entering the intersected
     *   object
     */
    public static final RayIntersectionKind ENTER = new RayIntersectionKind(1);
    
    /**
     * The ray is leaving the intersected
     *   object
     */
    public static final RayIntersectionKind LEAVE = new RayIntersectionKind(2);
    
    public RayIntersectionKind(int value) {
        super(value);
    }
    
}
