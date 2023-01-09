package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of intersection.
 * @version 1.10
 */
public enum RayIntersectionKind implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No intersection
     */
    NONE(0),
    
    /**
     * The ray is entering the intersected
     *   object
     */
    ENTER(1),
    
    /**
     * The ray is leaving the intersected
     *   object
     */
    LEAVE(2);
    
    private static final java.lang.String C_TYPE_NAME = "graphene_ray_intersection_kind_t";
    
    private final int value;
    
    /**
     * Create a new RayIntersectionKind for the provided value
     * @param numeric value the enum value
     */
    RayIntersectionKind(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new RayIntersectionKind for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RayIntersectionKind of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ENTER;
            case 2 -> LEAVE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
