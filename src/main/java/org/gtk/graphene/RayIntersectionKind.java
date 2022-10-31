package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of intersection.
 * @version 1.10
 */
public class RayIntersectionKind extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "graphene_ray_intersection_kind_t";
    
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
