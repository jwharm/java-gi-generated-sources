package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A 3D volume delimited by 2D clip planes.
 * 
 * The contents of the `graphene_frustum_t` are private, and should not be
 * modified directly.
 */
public class Frustum extends io.github.jwharm.javagi.ResourceBase {

    public Frustum(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_frustum_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new #graphene_frustum_t structure.
     * 
     * The contents of the returned structure are undefined.
     */
    public static Frustum alloc() {
        return new Frustum(constructAlloc());
    }
    
    /**
     * Checks whether a point is inside the volume defined by the given
     * #graphene_frustum_t.
     */
    public boolean containsPoint(Point3D point) {
        var RESULT = gtk_h.graphene_frustum_contains_point(handle(), point.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_frustum_t are equal.
     */
    public boolean equal(Frustum b) {
        var RESULT = gtk_h.graphene_frustum_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_frustum_alloc().
     */
    public void free() {
        gtk_h.graphene_frustum_free(handle());
    }
    
    /**
     * Retrieves the planes that define the given #graphene_frustum_t.
     */
    public void getPlanes(Plane[] planes) {
        gtk_h.graphene_frustum_get_planes(handle(), Interop.allocateNativeArray(planes).handle());
    }
    
    /**
     * Initializes the given #graphene_frustum_t using the provided
     * clipping planes.
     */
    public Frustum init(Plane p0, Plane p1, Plane p2, Plane p3, Plane p4, Plane p5) {
        var RESULT = gtk_h.graphene_frustum_init(handle(), p0.handle(), p1.handle(), p2.handle(), p3.handle(), p4.handle(), p5.handle());
        return new Frustum(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_frustum_t using the clipping
     * planes of another #graphene_frustum_t.
     */
    public Frustum initFromFrustum(Frustum src) {
        var RESULT = gtk_h.graphene_frustum_init_from_frustum(handle(), src.handle());
        return new Frustum(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_frustum_t using the given @matrix.
     */
    public Frustum initFromMatrix(Matrix matrix) {
        var RESULT = gtk_h.graphene_frustum_init_from_matrix(handle(), matrix.handle());
        return new Frustum(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the given @box intersects a plane of
     * a #graphene_frustum_t.
     */
    public boolean intersectsBox(Box box) {
        var RESULT = gtk_h.graphene_frustum_intersects_box(handle(), box.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the given @sphere intersects a plane of
     * a #graphene_frustum_t.
     */
    public boolean intersectsSphere(Sphere sphere) {
        var RESULT = gtk_h.graphene_frustum_intersects_sphere(handle(), sphere.handle());
        return RESULT;
    }
    
}
