package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GskTransform` is an object to describe transform matrices.
 * 
 * Unlike `graphene_matrix_t`, `GskTransform` retains the steps in how
 * a transform was constructed, and allows inspecting them. It is modeled
 * after the way CSS describes transforms.
 * 
 * `GskTransform` objects are immutable and cannot be changed after creation.
 * This means code can safely expose them as properties of objects without
 * having to worry about others changing them.
 */
public class Transform extends io.github.jwharm.javagi.ResourceBase {

    public Transform(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gsk_transform_new(), true);
        return RESULT;
    }
    
    public Transform() {
        super(constructNew());
    }
    
    /**
     * Checks two transforms for equality.
     */
    public boolean equal(Transform second) {
        var RESULT = gtk_h.gsk_transform_equal(handle(), second.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the category this transform belongs to.
     */
    public TransformCategory getCategory() {
        var RESULT = gtk_h.gsk_transform_get_category(handle());
        return TransformCategory.fromValue(RESULT);
    }
    
    /**
     * Inverts the given transform.
     * 
     * If @self is not invertible, %NULL is returned.
     * Note that inverting %NULL also returns %NULL, which is
     * the correct inverse of %NULL. If you need to differentiate
     * between those cases, you should check @self is not %NULL
     * before calling this function.
     */
    public Transform invert() {
        var RESULT = gtk_h.gsk_transform_invert(handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Multiplies @next with the given @matrix.
     */
    public Transform matrix(org.gtk.graphene.Matrix matrix) {
        var RESULT = gtk_h.gsk_transform_matrix(handle(), matrix.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Applies a perspective projection transform.
     * 
     * This transform scales points in X and Y based on their Z value,
     * scaling points with positive Z values away from the origin, and
     * those with negative Z values towards the origin. Points
     * on the z=0 plane are unchanged.
     */
    public Transform perspective(float depth) {
        var RESULT = gtk_h.gsk_transform_perspective(handle(), depth);
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Converts @self into a human-readable string representation suitable
     * for printing.
     * 
     * The result of this function can later be parsed with
     * [func@Gsk.Transform.parse].
     */
    public void print(org.gtk.glib.String string) {
        gtk_h.gsk_transform_print(handle(), string.handle());
    }
    
    /**
     * Acquires a reference on the given `GskTransform`.
     */
    public Transform ref() {
        var RESULT = gtk_h.gsk_transform_ref(handle());
        return new Transform(References.get(RESULT, false));
    }
    
    /**
     * Rotates @next @angle degrees in 2D - or in 3D-speak, around the z axis.
     */
    public Transform rotate(float angle) {
        var RESULT = gtk_h.gsk_transform_rotate(handle(), angle);
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Rotates @next @angle degrees around @axis.
     * 
     * For a rotation in 2D space, use [method@Gsk.Transform.rotate]
     */
    public Transform rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        var RESULT = gtk_h.gsk_transform_rotate_3d(handle(), angle, axis.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Scales @next in 2-dimensional space by the given factors.
     * 
     * Use [method@Gsk.Transform.scale_3d] to scale in all 3 dimensions.
     */
    public Transform scale(float factorX, float factorY) {
        var RESULT = gtk_h.gsk_transform_scale(handle(), factorX, factorY);
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Scales @next by the given factors.
     */
    public Transform scale3d(float factorX, float factorY, float factorZ) {
        var RESULT = gtk_h.gsk_transform_scale_3d(handle(), factorX, factorY, factorZ);
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Applies a skew transform.
     */
    public Transform skew(float skewX, float skewY) {
        var RESULT = gtk_h.gsk_transform_skew(handle(), skewX, skewY);
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Computes the actual value of @self and stores it in @out_matrix.
     * 
     * The previous value of @out_matrix will be ignored.
     */
    public void toMatrix(org.gtk.graphene.Matrix outMatrix) {
        gtk_h.gsk_transform_to_matrix(handle(), outMatrix.handle());
    }
    
    /**
     * Converts a matrix into a string that is suitable for printing.
     * 
     * The resulting string can be parsed with [func@Gsk.Transform.parse].
     * 
     * This is a wrapper around [method@Gsk.Transform.print].
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gsk_transform_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Applies all the operations from @other to @next.
     */
    public Transform transform(Transform other) {
        var RESULT = gtk_h.gsk_transform_transform(handle(), other.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Transforms a `graphene_rect_t` using the given transform @self.
     * 
     * The result is the bounding box containing the coplanar quad.
     */
    public void transformBounds(org.gtk.graphene.Rect rect, org.gtk.graphene.Rect outRect) {
        gtk_h.gsk_transform_transform_bounds(handle(), rect.handle(), outRect.handle());
    }
    
    /**
     * Transforms a `graphene_point_t` using the given transform @self.
     */
    public void transformPoint(org.gtk.graphene.Point point, org.gtk.graphene.Point outPoint) {
        gtk_h.gsk_transform_transform_point(handle(), point.handle(), outPoint.handle());
    }
    
    /**
     * Translates @next in 2-dimensional space by @point.
     */
    public Transform translate(org.gtk.graphene.Point point) {
        var RESULT = gtk_h.gsk_transform_translate(handle(), point.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Translates @next by @point.
     */
    public Transform translate3d(org.gtk.graphene.Point3D point) {
        var RESULT = gtk_h.gsk_transform_translate_3d(handle(), point.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given `GskTransform`.
     * 
     * If the reference was the last, the resources associated to the @self are
     * freed.
     */
    public void unref() {
        gtk_h.gsk_transform_unref(handle());
    }
    
    /**
     * Parses the given @string into a transform and puts it in
     * @out_transform.
     * 
     * Strings printed via [method@Gsk.Transform.to_string]
     * can be read in again successfully using this function.
     * 
     * If @string does not describe a valid transform, %FALSE is
     * returned and %NULL is put in @out_transform.
     */
    public static boolean parse(java.lang.String string, Transform[] outTransform) {
        var RESULT = gtk_h.gsk_transform_parse(Interop.allocateNativeString(string).handle(), Interop.allocateNativeArray(outTransform).handle());
        return (RESULT != 0);
    }
    
}
