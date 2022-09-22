package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A 2D plane that extends infinitely in a 3D volume.
 * <p>
 * The contents of the {@code graphene_plane_t} are private, and should not be
 * modified directly.
 */
public class Plane extends io.github.jwharm.javagi.ResourceBase {

    public Plane(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_plane_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Plane} structure.
     * <p>
     * The contents of the returned structure are undefined.
     */
    public static Plane alloc() {
        return new Plane(constructAlloc());
    }
    
    /**
     * Computes the distance of {@code point} from a {@link Plane}.
     */
    public float distance(Point3D point) {
        var RESULT = gtk_h.graphene_plane_distance(handle(), point.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Plane} are equal.
     */
    public boolean equal(Plane b) {
        var RESULT = gtk_h.graphene_plane_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_plane_alloc().
     */
    public void free() {
        gtk_h.graphene_plane_free(handle());
    }
    
    /**
     * Retrieves the distance along the normal vector of the
     * given {@link Plane} from the origin.
     */
    public float getConstant() {
        var RESULT = gtk_h.graphene_plane_get_constant(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the normal vector pointing towards the origin of the
     * given {@link Plane}.
     */
    public void getNormal(Vec3 normal) {
        gtk_h.graphene_plane_get_normal(handle(), normal.handle());
    }
    
    /**
     * Initializes the given {@link Plane} using the given {@code normal} vector
     * and {@code constant} values.
     */
    public Plane init(Vec3 normal, float constant) {
        var RESULT = gtk_h.graphene_plane_init(handle(), normal.handle(), constant);
        return new Plane(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Plane} using the normal
     * vector and constant of another {@link Plane}.
     */
    public Plane initFromPlane(Plane src) {
        var RESULT = gtk_h.graphene_plane_init_from_plane(handle(), src.handle());
        return new Plane(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Plane} using the given normal vector
     * and an arbitrary co-planar point.
     */
    public Plane initFromPoint(Vec3 normal, Point3D point) {
        var RESULT = gtk_h.graphene_plane_init_from_point(handle(), normal.handle(), point.handle());
        return new Plane(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Plane} using the 3 provided co-planar
     * points.
     * <p>
     * The winding order is counter-clockwise, and determines which direction
     * the normal vector will point.
     */
    public Plane initFromPoints(Point3D a, Point3D b, Point3D c) {
        var RESULT = gtk_h.graphene_plane_init_from_points(handle(), a.handle(), b.handle(), c.handle());
        return new Plane(References.get(RESULT, false));
    }
    
    /**
     * Initializes the given {@link Plane} using the components of
     * the given {@link Vec4} vector.
     */
    public Plane initFromVec4(Vec4 src) {
        var RESULT = gtk_h.graphene_plane_init_from_vec4(handle(), src.handle());
        return new Plane(References.get(RESULT, false));
    }
    
    /**
     * Negates the normal vector and constant of a {@link Plane}, effectively
     * mirroring the plane across the origin.
     */
    public void negate(Plane res) {
        gtk_h.graphene_plane_negate(handle(), res.handle());
    }
    
    /**
     * Normalizes the vector of the given {@link Plane},
     * and adjusts the constant accordingly.
     */
    public void normalize(Plane res) {
        gtk_h.graphene_plane_normalize(handle(), res.handle());
    }
    
    /**
     * Transforms a {@link Plane} @p using the given {@code matrix}
     * and {@code normal_matrix}.
     * <p>
     * If {@code normal_matrix} is <code>null</code>, a transformation matrix for the plane
     * normal will be computed from {@code matrix}. If you are transforming
     * multiple planes using the same {@code matrix} it's recommended to compute
     * the normal matrix beforehand to avoid incurring in the cost of
     * recomputing it every time.
     */
    public void transform(Matrix matrix, Matrix normalMatrix, Plane res) {
        gtk_h.graphene_plane_transform(handle(), matrix.handle(), normalMatrix.handle(), res.handle());
    }
    
}
