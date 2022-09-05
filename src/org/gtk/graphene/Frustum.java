package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A 3D volume delimited by 2D clip planes.
 * 
 * The contents of the `graphene_frustum_t` are private, and should not be
 * modified directly.
 */
public class Frustum extends io.github.jwharm.javagi.interop.ResourceBase {

    public Frustum(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new #graphene_frustum_t structure.
     * 
     * The contents of the returned structure are undefined.
     */
    public Frustum() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_alloc(), true));
    }
    
    /**
     * Checks whether a point is inside the volume defined by the given
     * #graphene_frustum_t.
     */
    public boolean containsPoint(Point3D point) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_contains_point(HANDLE(), point.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_frustum_t are equal.
     */
    public boolean equal(Frustum b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_frustum_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_free(HANDLE());
    }
    
    /**
     * Retrieves the planes that define the given #graphene_frustum_t.
     */
    public void getPlanes(Plane[] planes) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_get_planes(HANDLE(), Interop.allocateNativeArray(planes));
    }
    
    /**
     * Initializes the given #graphene_frustum_t using the provided
     * clipping planes.
     */
    public Frustum init(Plane p0, Plane p1, Plane p2, Plane p3, Plane p4, Plane p5) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_init(HANDLE(), p0.HANDLE(), p1.HANDLE(), p2.HANDLE(), p3.HANDLE(), p4.HANDLE(), p5.HANDLE());
        return new Frustum(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes the given #graphene_frustum_t using the clipping
     * planes of another #graphene_frustum_t.
     */
    public Frustum initFromFrustum(Frustum src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_init_from_frustum(HANDLE(), src.HANDLE());
        return new Frustum(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_frustum_t using the given @matrix.
     */
    public Frustum initFromMatrix(Matrix matrix) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_init_from_matrix(HANDLE(), matrix.HANDLE());
        return new Frustum(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Checks whether the given @box intersects a plane of
     * a #graphene_frustum_t.
     */
    public boolean intersectsBox(Box box) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_intersects_box(HANDLE(), box.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the given @sphere intersects a plane of
     * a #graphene_frustum_t.
     */
    public boolean intersectsSphere(Sphere sphere) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_frustum_intersects_sphere(HANDLE(), sphere.HANDLE());
        return RESULT;
    }
    
}
