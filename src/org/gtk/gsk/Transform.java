package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GskTransform} is an object to describe transform matrices.
 * <p>
 * Unlike {@code graphene_matrix_t}, {@code GskTransform} retains the steps in how
 * a transform was constructed, and allows inspecting them. It is modeled
 * after the way CSS describes transforms.
 * <p>
 * {@code GskTransform} objects are immutable and cannot be changed after creation.
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
     * <p>
     * If {@code self} is not invertible, {@code null} is returned.
     * Note that inverting {@code null} also returns {@code null}, which is
     * the correct inverse of {@code null}. If you need to differentiate
     * between those cases, you should check {@code self} is not {@code null}
     * before calling this function.
     */
    public Transform invert() {
        var RESULT = gtk_h.gsk_transform_invert(handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Multiplies {@code next} with the given {@code matrix}.
     */
    public Transform matrix(org.gtk.graphene.Matrix matrix) {
        var RESULT = gtk_h.gsk_transform_matrix(handle(), matrix.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Applies a perspective projection transform.
     * <p>
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
     * Converts {@code self} into a human-readable string representation suitable
     * for printing.
     * <p>
     * The result of this function can later be parsed with
     * {@link Gsk#Transform}.
     */
    public void print(org.gtk.glib.String string) {
        gtk_h.gsk_transform_print(handle(), string.handle());
    }
    
    /**
     * Acquires a reference on the given {@code GskTransform}.
     */
    public Transform ref() {
        var RESULT = gtk_h.gsk_transform_ref(handle());
        return new Transform(References.get(RESULT, false));
    }
    
    /**
     * Rotates {@code next} {@code angle} degrees in 2D - or in 3D-speak, around the z axis.
     */
    public Transform rotate(float angle) {
        var RESULT = gtk_h.gsk_transform_rotate(handle(), angle);
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Rotates {@code next} {@code angle} degrees around {@code axis}.
     * <p>
     * For a rotation in 2D space, use {@link Transform#rotate}
     */
    public Transform rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        var RESULT = gtk_h.gsk_transform_rotate_3d(handle(), angle, axis.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Scales {@code next} in 2-dimensional space by the given factors.
     * <p>
     * Use {@link Transform#scale3d} to scale in all 3 dimensions.
     */
    public Transform scale(float factorX, float factorY) {
        var RESULT = gtk_h.gsk_transform_scale(handle(), factorX, factorY);
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Scales {@code next} by the given factors.
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
     * Converts a {@code GskTransform} to a 2D transformation matrix.
     * <p>
     * {@code self} must be a 2D transformation. If you are not
     * sure, use gsk_transform_get_category() >=
     * {@link TransformCategory#_2D} to check.
     * <p>
     * The returned values have the following layout:
     * <p>
     * <pre>{@code 
     *   | xx yx |   |  a  b  0 |
     *   | xy yy | = |  c  d  0 |
     *   | dx dy |   | tx ty  1 |
     * }</pre>
     * <p>
     * This function can be used to convert between a {@code GskTransform}
     * and a matrix type from other 2D drawing libraries, in particular
     * Cairo.
     */
    public void to2d(PointerFloat outXx, PointerFloat outYx, PointerFloat outXy, PointerFloat outYy, PointerFloat outDx, PointerFloat outDy) {
        gtk_h.gsk_transform_to_2d(handle(), outXx.handle(), outYx.handle(), outXy.handle(), outYy.handle(), outDx.handle(), outDy.handle());
    }
    
    /**
     * Converts a {@code GskTransform} to 2D transformation factors.
     * <p>
     * To recreate an equivalent transform from the factors returned
     * by this function, use
     * <p>
     *     gsk_transform_skew (
     *         gsk_transform_scale (
     *             gsk_transform_rotate (
     *                 gsk_transform_translate (NULL, &GRAPHENE_POINT_T (dx, dy)),
     *                 angle),
     *             scale_x, scale_y),
     *         skew_x, skew_y)
     * <p>
     * {@code self} must be a 2D transformation. If you are not sure, use
     * <p>
     *     gsk_transform_get_category() >= {@link TransformCategory#_2D}
     * <p>
     * to check.
     */
    public void to2dComponents(PointerFloat outSkewX, PointerFloat outSkewY, PointerFloat outScaleX, PointerFloat outScaleY, PointerFloat outAngle, PointerFloat outDx, PointerFloat outDy) {
        gtk_h.gsk_transform_to_2d_components(handle(), outSkewX.handle(), outSkewY.handle(), outScaleX.handle(), outScaleY.handle(), outAngle.handle(), outDx.handle(), outDy.handle());
    }
    
    /**
     * Converts a {@code GskTransform} to 2D affine transformation factors.
     * <p>
     * To recreate an equivalent transform from the factors returned
     * by this function, use
     * <p>
     *     gsk_transform_scale (gsk_transform_translate (NULL,
     *                                                   &GRAPHENE_POINT_T (dx, dy)),
     *                          sx, sy)
     * <p>
     * {@code self} must be a 2D affine transformation. If you are not
     * sure, use
     * <p>
     *     gsk_transform_get_category() >= {@link TransformCategory#_2D_AFFINE}
     * <p>
     * to check.
     */
    public void toAffine(PointerFloat outScaleX, PointerFloat outScaleY, PointerFloat outDx, PointerFloat outDy) {
        gtk_h.gsk_transform_to_affine(handle(), outScaleX.handle(), outScaleY.handle(), outDx.handle(), outDy.handle());
    }
    
    /**
     * Computes the actual value of {@code self} and stores it in {@code out_matrix}.
     * <p>
     * The previous value of {@code out_matrix} will be ignored.
     */
    public void toMatrix(org.gtk.graphene.Matrix outMatrix) {
        gtk_h.gsk_transform_to_matrix(handle(), outMatrix.handle());
    }
    
    /**
     * Converts a matrix into a string that is suitable for printing.
     * <p>
     * The resulting string can be parsed with {@link Gsk#Transform}.
     * <p>
     * This is a wrapper around {@link Transform#print}.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gsk_transform_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Converts a {@code GskTransform} to a translation operation.
     * <p>
     * {@code self} must be a 2D transformation. If you are not
     * sure, use
     * <p>
     *     gsk_transform_get_category() >= {@link TransformCategory#_2D_TRANSLATE}
     * <p>
     * to check.
     */
    public void toTranslate(PointerFloat outDx, PointerFloat outDy) {
        gtk_h.gsk_transform_to_translate(handle(), outDx.handle(), outDy.handle());
    }
    
    /**
     * Applies all the operations from {@code other} to {@code next}.
     */
    public Transform transform(Transform other) {
        var RESULT = gtk_h.gsk_transform_transform(handle(), other.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Transforms a {@code graphene_rect_t} using the given transform {@code self}.
     * <p>
     * The result is the bounding box containing the coplanar quad.
     */
    public void transformBounds(org.gtk.graphene.Rect rect, org.gtk.graphene.Rect outRect) {
        gtk_h.gsk_transform_transform_bounds(handle(), rect.handle(), outRect.handle());
    }
    
    /**
     * Transforms a {@code graphene_point_t} using the given transform {@code self}.
     */
    public void transformPoint(org.gtk.graphene.Point point, org.gtk.graphene.Point outPoint) {
        gtk_h.gsk_transform_transform_point(handle(), point.handle(), outPoint.handle());
    }
    
    /**
     * Translates {@code next} in 2-dimensional space by {@code point}.
     */
    public Transform translate(org.gtk.graphene.Point point) {
        var RESULT = gtk_h.gsk_transform_translate(handle(), point.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Translates {@code next} by {@code point}.
     */
    public Transform translate3d(org.gtk.graphene.Point3D point) {
        var RESULT = gtk_h.gsk_transform_translate_3d(handle(), point.handle());
        return new Transform(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given {@code GskTransform}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        gtk_h.gsk_transform_unref(handle());
    }
    
    /**
     * Parses the given {@code string} into a transform and puts it in
     * {@code out_transform}.
     * <p>
     * Strings printed via {@link Transform#toString}
     * can be read in again successfully using this function.
     * <p>
     * If {@code string} does not describe a valid transform, {@code false} is
     * returned and {@code null} is put in {@code out_transform}.
     */
    public static boolean parse(java.lang.String string, Transform[] outTransform) {
        var RESULT = gtk_h.gsk_transform_parse(Interop.allocateNativeString(string).handle(), Interop.allocateNativeArray(outTransform).handle());
        return (RESULT != 0);
    }
    
}
