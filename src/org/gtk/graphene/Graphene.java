package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class Graphene {
    
    /**
     * A degenerate #graphene_box_t that can only be expanded.
     * 
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxEmpty() {
        var RESULT = gtk_h.graphene_box_empty();
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * A degenerate #graphene_box_t that cannot be expanded.
     * 
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxInfinite() {
        var RESULT = gtk_h.graphene_box_infinite();
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * A #graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (0, 0, 0).
     * 
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxMinusOne() {
        var RESULT = gtk_h.graphene_box_minus_one();
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * A #graphene_box_t with the minimum vertex set at (0, 0, 0) and the
     * maximum vertex set at (1, 1, 1).
     * 
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxOne() {
        var RESULT = gtk_h.graphene_box_one();
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * A #graphene_box_t with the minimum vertex set at (-1, -1, -1) and the
     * maximum vertex set at (1, 1, 1).
     * 
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxOneMinusOne() {
        var RESULT = gtk_h.graphene_box_one_minus_one();
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * A #graphene_box_t with both the minimum and maximum vertices set at (0, 0, 0).
     * 
     * The returned value is owned by Graphene and should not be modified or freed.
     */
    public static Box boxZero() {
        var RESULT = gtk_h.graphene_box_zero();
        return new Box(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant point with all three coordinates set to 0.
     */
    public static Point3D point3dZero() {
        var RESULT = gtk_h.graphene_point3d_zero();
        return new Point3D(References.get(RESULT, false));
    }
    
    /**
     * Returns a point fixed at (0, 0).
     */
    public static Point pointZero() {
        var RESULT = gtk_h.graphene_point_zero();
        return new Point(References.get(RESULT, false));
    }
    
    /**
     * Allocates a new #graphene_rect_t.
     * 
     * The contents of the returned rectangle are undefined.
     */
    public static Rect rectAlloc() {
        var RESULT = gtk_h.graphene_rect_alloc();
        return new Rect(References.get(RESULT, true));
    }
    
    /**
     * Returns a degenerate rectangle with origin fixed at (0, 0) and
     * a size of 0, 0.
     */
    public static Rect rectZero() {
        var RESULT = gtk_h.graphene_rect_zero();
        return new Rect(References.get(RESULT, false));
    }
    
    /**
     * A constant pointer to a zero #graphene_size_t, useful for
     * equality checks and interpolations.
     */
    public static Size sizeZero() {
        var RESULT = gtk_h.graphene_size_zero();
        return new Size(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant vector with (1, 1) components.
     */
    public static Vec2 vec2One() {
        var RESULT = gtk_h.graphene_vec2_one();
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant vector with (1, 0) components.
     */
    public static Vec2 vec2XAxis() {
        var RESULT = gtk_h.graphene_vec2_x_axis();
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant vector with (0, 1) components.
     */
    public static Vec2 vec2YAxis() {
        var RESULT = gtk_h.graphene_vec2_y_axis();
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant vector with (0, 0) components.
     */
    public static Vec2 vec2Zero() {
        var RESULT = gtk_h.graphene_vec2_zero();
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 1.
     */
    public static Vec3 vec3One() {
        var RESULT = gtk_h.graphene_vec3_one();
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (1, 0, 0).
     */
    public static Vec3 vec3XAxis() {
        var RESULT = gtk_h.graphene_vec3_x_axis();
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 1, 0).
     */
    public static Vec3 vec3YAxis() {
        var RESULT = gtk_h.graphene_vec3_y_axis();
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Provides a constant pointer to a vector with three components
     * with values set to (0, 0, 1).
     */
    public static Vec3 vec3ZAxis() {
        var RESULT = gtk_h.graphene_vec3_z_axis();
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Provides a constant pointer to a vector with three components,
     * all sets to 0.
     */
    public static Vec3 vec3Zero() {
        var RESULT = gtk_h.graphene_vec3_zero();
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with all its
     * components set to 1.
     */
    public static Vec4 vec4One() {
        var RESULT = gtk_h.graphene_vec4_one();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 0, 0, 1).
     */
    public static Vec4 vec4WAxis() {
        var RESULT = gtk_h.graphene_vec4_w_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (1, 0, 0, 0).
     */
    public static Vec4 vec4XAxis() {
        var RESULT = gtk_h.graphene_vec4_x_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 1, 0, 0).
     */
    public static Vec4 vec4YAxis() {
        var RESULT = gtk_h.graphene_vec4_y_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 0, 1, 0).
     */
    public static Vec4 vec4ZAxis() {
        var RESULT = gtk_h.graphene_vec4_z_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with all its
     * components set to 0.
     */
    public static Vec4 vec4Zero() {
        var RESULT = gtk_h.graphene_vec4_zero();
        return new Vec4(References.get(RESULT, false));
    }
    
}
