package org.gtk.gsk;

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

    public Transform(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gsk_transform_new = Interop.downcallHandle(
        "gsk_transform_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_transform_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public Transform() {
        super(constructNew());
    }
    
    static final MethodHandle gsk_transform_equal = Interop.downcallHandle(
        "gsk_transform_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks two transforms for equality.
     */
    public boolean equal(Transform second) {
        try {
            var RESULT = (int) gsk_transform_equal.invokeExact(handle(), second.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_get_category = Interop.downcallHandle(
        "gsk_transform_get_category",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the category this transform belongs to.
     */
    public TransformCategory getCategory() {
        try {
            var RESULT = (int) gsk_transform_get_category.invokeExact(handle());
            return new TransformCategory(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_invert = Interop.downcallHandle(
        "gsk_transform_invert",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gsk_transform_invert.invokeExact(handle());
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_matrix = Interop.downcallHandle(
        "gsk_transform_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies {@code next} with the given {@code matrix}.
     */
    public Transform matrix(org.gtk.graphene.Matrix matrix) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_matrix.invokeExact(handle(), matrix.handle());
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_perspective = Interop.downcallHandle(
        "gsk_transform_perspective",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Applies a perspective projection transform.
     * <p>
     * This transform scales points in X and Y based on their Z value,
     * scaling points with positive Z values away from the origin, and
     * those with negative Z values towards the origin. Points
     * on the z=0 plane are unchanged.
     */
    public Transform perspective(float depth) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_perspective.invokeExact(handle(), depth);
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_print = Interop.downcallHandle(
        "gsk_transform_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts {@code self} into a human-readable string representation suitable
     * for printing.
     * <p>
     * The result of this function can later be parsed with
     * {@link Gsk#Transform}.
     */
    public void print(org.gtk.glib.String string) {
        try {
            gsk_transform_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_ref = Interop.downcallHandle(
        "gsk_transform_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on the given {@code GskTransform}.
     */
    public Transform ref() {
        try {
            var RESULT = (MemoryAddress) gsk_transform_ref.invokeExact(handle());
            return new Transform(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_rotate = Interop.downcallHandle(
        "gsk_transform_rotate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Rotates {@code next} {@code angle} degrees in 2D - or in 3D-speak, around the z axis.
     */
    public Transform rotate(float angle) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_rotate.invokeExact(handle(), angle);
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_rotate_3d = Interop.downcallHandle(
        "gsk_transform_rotate_3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Rotates {@code next} {@code angle} degrees around {@code axis}.
     * <p>
     * For a rotation in 2D space, use {@link Transform#rotate}
     */
    public Transform rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_rotate_3d.invokeExact(handle(), angle, axis.handle());
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_scale = Interop.downcallHandle(
        "gsk_transform_scale",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Scales {@code next} in 2-dimensional space by the given factors.
     * <p>
     * Use {@link Transform#scale3d} to scale in all 3 dimensions.
     */
    public Transform scale(float factorX, float factorY) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_scale.invokeExact(handle(), factorX, factorY);
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_scale_3d = Interop.downcallHandle(
        "gsk_transform_scale_3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Scales {@code next} by the given factors.
     */
    public Transform scale3d(float factorX, float factorY, float factorZ) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_scale_3d.invokeExact(handle(), factorX, factorY, factorZ);
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_skew = Interop.downcallHandle(
        "gsk_transform_skew",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Applies a skew transform.
     */
    public Transform skew(float skewX, float skewY) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_skew.invokeExact(handle(), skewX, skewY);
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_to_2d = Interop.downcallHandle(
        "gsk_transform_to_2d",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gsk_transform_to_2d.invokeExact(handle(), outXx.handle(), outYx.handle(), outXy.handle(), outYy.handle(), outDx.handle(), outDy.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_to_2d_components = Interop.downcallHandle(
        "gsk_transform_to_2d_components",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gsk_transform_to_2d_components.invokeExact(handle(), outSkewX.handle(), outSkewY.handle(), outScaleX.handle(), outScaleY.handle(), outAngle.handle(), outDx.handle(), outDy.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_to_affine = Interop.downcallHandle(
        "gsk_transform_to_affine",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gsk_transform_to_affine.invokeExact(handle(), outScaleX.handle(), outScaleY.handle(), outDx.handle(), outDy.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_to_matrix = Interop.downcallHandle(
        "gsk_transform_to_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the actual value of {@code self} and stores it in {@code out_matrix}.
     * <p>
     * The previous value of {@code out_matrix} will be ignored.
     */
    public void toMatrix(org.gtk.graphene.Matrix outMatrix) {
        try {
            gsk_transform_to_matrix.invokeExact(handle(), outMatrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_to_string = Interop.downcallHandle(
        "gsk_transform_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a matrix into a string that is suitable for printing.
     * <p>
     * The resulting string can be parsed with {@link Gsk#Transform}.
     * <p>
     * This is a wrapper around {@link Transform#print}.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) gsk_transform_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_to_translate = Interop.downcallHandle(
        "gsk_transform_to_translate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            gsk_transform_to_translate.invokeExact(handle(), outDx.handle(), outDy.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_transform = Interop.downcallHandle(
        "gsk_transform_transform",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Applies all the operations from {@code other} to {@code next}.
     */
    public Transform transform(Transform other) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_transform.invokeExact(handle(), other.handle());
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_transform_bounds = Interop.downcallHandle(
        "gsk_transform_transform_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@code graphene_rect_t} using the given transform {@code self}.
     * <p>
     * The result is the bounding box containing the coplanar quad.
     */
    public void transformBounds(org.gtk.graphene.Rect rect, org.gtk.graphene.Rect outRect) {
        try {
            gsk_transform_transform_bounds.invokeExact(handle(), rect.handle(), outRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_transform_point = Interop.downcallHandle(
        "gsk_transform_transform_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@code graphene_point_t} using the given transform {@code self}.
     */
    public void transformPoint(org.gtk.graphene.Point point, org.gtk.graphene.Point outPoint) {
        try {
            gsk_transform_transform_point.invokeExact(handle(), point.handle(), outPoint.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_translate = Interop.downcallHandle(
        "gsk_transform_translate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates {@code next} in 2-dimensional space by {@code point}.
     */
    public Transform translate(org.gtk.graphene.Point point) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_translate.invokeExact(handle(), point.handle());
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_translate_3d = Interop.downcallHandle(
        "gsk_transform_translate_3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates {@code next} by {@code point}.
     */
    public Transform translate3d(org.gtk.graphene.Point3D point) {
        try {
            var RESULT = (MemoryAddress) gsk_transform_translate_3d.invokeExact(handle(), point.handle());
            return new Transform(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_unref = Interop.downcallHandle(
        "gsk_transform_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on the given {@code GskTransform}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        try {
            gsk_transform_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_transform_parse = Interop.downcallHandle(
        "gsk_transform_parse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static boolean parse(java.lang.String string, PointerProxy<Transform> outTransform) {
        try {
            var RESULT = (int) gsk_transform_parse.invokeExact(Interop.allocateNativeString(string).handle(), outTransform.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
