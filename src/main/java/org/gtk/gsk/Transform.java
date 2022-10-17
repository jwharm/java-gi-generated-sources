package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gsk_transform_new = Interop.downcallHandle(
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
    
    private static final MethodHandle gsk_transform_equal = Interop.downcallHandle(
        "gsk_transform_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks two transforms for equality.
     */
    public boolean equal(@Nullable Transform second) {
        int RESULT;
        try {
            RESULT = (int) gsk_transform_equal.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gsk_transform_get_category = Interop.downcallHandle(
        "gsk_transform_get_category",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the category this transform belongs to.
     */
    public @NotNull TransformCategory getCategory() {
        int RESULT;
        try {
            RESULT = (int) gsk_transform_get_category.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TransformCategory(RESULT);
    }
    
    private static final MethodHandle gsk_transform_invert = Interop.downcallHandle(
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
    public @Nullable Transform invert() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_invert.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_matrix = Interop.downcallHandle(
        "gsk_transform_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies {@code next} with the given {@code matrix}.
     */
    public @NotNull Transform matrix(@NotNull org.gtk.graphene.Matrix matrix) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_matrix.invokeExact(handle(), matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_perspective = Interop.downcallHandle(
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
    public @NotNull Transform perspective(@NotNull float depth) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_perspective.invokeExact(handle(), depth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_print = Interop.downcallHandle(
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
    public @NotNull void print(@NotNull org.gtk.glib.String string) {
        try {
            gsk_transform_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_transform_ref = Interop.downcallHandle(
        "gsk_transform_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on the given {@code GskTransform}.
     */
    public @Nullable Transform ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_transform_rotate = Interop.downcallHandle(
        "gsk_transform_rotate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Rotates {@code next} {@code angle} degrees in 2D - or in 3D-speak, around the z axis.
     */
    public @Nullable Transform rotate(@NotNull float angle) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_rotate.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_rotate_3d = Interop.downcallHandle(
        "gsk_transform_rotate_3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Rotates {@code next} {@code angle} degrees around {@code axis}.
     * <p>
     * For a rotation in 2D space, use {@link Transform#rotate}
     */
    public @Nullable Transform rotate3d(@NotNull float angle, @NotNull org.gtk.graphene.Vec3 axis) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_rotate_3d.invokeExact(handle(), angle, axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_scale = Interop.downcallHandle(
        "gsk_transform_scale",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Scales {@code next} in 2-dimensional space by the given factors.
     * <p>
     * Use {@link Transform#scale3d} to scale in all 3 dimensions.
     */
    public @Nullable Transform scale(@NotNull float factorX, @NotNull float factorY) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_scale.invokeExact(handle(), factorX, factorY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_scale_3d = Interop.downcallHandle(
        "gsk_transform_scale_3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Scales {@code next} by the given factors.
     */
    public @Nullable Transform scale3d(@NotNull float factorX, @NotNull float factorY, @NotNull float factorZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_scale_3d.invokeExact(handle(), factorX, factorY, factorZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_skew = Interop.downcallHandle(
        "gsk_transform_skew",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Applies a skew transform.
     */
    public @Nullable Transform skew(@NotNull float skewX, @NotNull float skewY) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_skew.invokeExact(handle(), skewX, skewY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_to_2d = Interop.downcallHandle(
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
     * 
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
    public @NotNull void to2d(@NotNull Out<Float> outXx, @NotNull Out<Float> outYx, @NotNull Out<Float> outXy, @NotNull Out<Float> outYy, @NotNull Out<Float> outDx, @NotNull Out<Float> outDy) {
        MemorySegment outXxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outYxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outXyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outYyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outDxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outDyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            gsk_transform_to_2d.invokeExact(handle(), (Addressable) outXxPOINTER.address(), (Addressable) outYxPOINTER.address(), (Addressable) outXyPOINTER.address(), (Addressable) outYyPOINTER.address(), (Addressable) outDxPOINTER.address(), (Addressable) outDyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outXx.set(outXxPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outYx.set(outYxPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outXy.set(outXyPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outYy.set(outYyPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outDx.set(outDxPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outDy.set(outDyPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    private static final MethodHandle gsk_transform_to_2d_components = Interop.downcallHandle(
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
    public @NotNull void to2dComponents(@NotNull Out<Float> outSkewX, @NotNull Out<Float> outSkewY, @NotNull Out<Float> outScaleX, @NotNull Out<Float> outScaleY, @NotNull Out<Float> outAngle, @NotNull Out<Float> outDx, @NotNull Out<Float> outDy) {
        MemorySegment outSkewXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outSkewYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outScaleXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outScaleYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outAnglePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outDxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outDyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            gsk_transform_to_2d_components.invokeExact(handle(), (Addressable) outSkewXPOINTER.address(), (Addressable) outSkewYPOINTER.address(), (Addressable) outScaleXPOINTER.address(), (Addressable) outScaleYPOINTER.address(), (Addressable) outAnglePOINTER.address(), (Addressable) outDxPOINTER.address(), (Addressable) outDyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outSkewX.set(outSkewXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outSkewY.set(outSkewYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outScaleX.set(outScaleXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outScaleY.set(outScaleYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outAngle.set(outAnglePOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outDx.set(outDxPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outDy.set(outDyPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    private static final MethodHandle gsk_transform_to_affine = Interop.downcallHandle(
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
    public @NotNull void toAffine(@NotNull Out<Float> outScaleX, @NotNull Out<Float> outScaleY, @NotNull Out<Float> outDx, @NotNull Out<Float> outDy) {
        MemorySegment outScaleXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outScaleYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outDxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outDyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            gsk_transform_to_affine.invokeExact(handle(), (Addressable) outScaleXPOINTER.address(), (Addressable) outScaleYPOINTER.address(), (Addressable) outDxPOINTER.address(), (Addressable) outDyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outScaleX.set(outScaleXPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outScaleY.set(outScaleYPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outDx.set(outDxPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outDy.set(outDyPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    private static final MethodHandle gsk_transform_to_matrix = Interop.downcallHandle(
        "gsk_transform_to_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the actual value of {@code self} and stores it in {@code out_matrix}.
     * <p>
     * The previous value of {@code out_matrix} will be ignored.
     */
    public @NotNull void toMatrix(@NotNull Out<org.gtk.graphene.Matrix> outMatrix) {
        MemorySegment outMatrixPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gsk_transform_to_matrix.invokeExact(handle(), (Addressable) outMatrixPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outMatrix.set(new org.gtk.graphene.Matrix(Refcounted.get(outMatrixPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gsk_transform_to_string = Interop.downcallHandle(
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
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gsk_transform_to_translate = Interop.downcallHandle(
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
    public @NotNull void toTranslate(@NotNull Out<Float> outDx, @NotNull Out<Float> outDy) {
        MemorySegment outDxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        MemorySegment outDyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_FLOAT);
        try {
            gsk_transform_to_translate.invokeExact(handle(), (Addressable) outDxPOINTER.address(), (Addressable) outDyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outDx.set(outDxPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
        outDy.set(outDyPOINTER.get(ValueLayout.JAVA_FLOAT, 0));
    }
    
    private static final MethodHandle gsk_transform_transform = Interop.downcallHandle(
        "gsk_transform_transform",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Applies all the operations from {@code other} to {@code next}.
     */
    public @Nullable Transform transform(@Nullable Transform other) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_transform.invokeExact(handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_transform_bounds = Interop.downcallHandle(
        "gsk_transform_transform_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@code graphene_rect_t} using the given transform {@code self}.
     * <p>
     * The result is the bounding box containing the coplanar quad.
     */
    public @NotNull void transformBounds(@NotNull org.gtk.graphene.Rect rect, @NotNull Out<org.gtk.graphene.Rect> outRect) {
        MemorySegment outRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gsk_transform_transform_bounds.invokeExact(handle(), rect.handle(), (Addressable) outRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outRect.set(new org.gtk.graphene.Rect(Refcounted.get(outRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gsk_transform_transform_point = Interop.downcallHandle(
        "gsk_transform_transform_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@code graphene_point_t} using the given transform {@code self}.
     */
    public @NotNull void transformPoint(@NotNull org.gtk.graphene.Point point, @NotNull Out<org.gtk.graphene.Point> outPoint) {
        MemorySegment outPointPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gsk_transform_transform_point.invokeExact(handle(), point.handle(), (Addressable) outPointPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outPoint.set(new org.gtk.graphene.Point(Refcounted.get(outPointPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gsk_transform_translate = Interop.downcallHandle(
        "gsk_transform_translate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates {@code next} in 2-dimensional space by {@code point}.
     */
    public @Nullable Transform translate(@NotNull org.gtk.graphene.Point point) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_translate.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_translate_3d = Interop.downcallHandle(
        "gsk_transform_translate_3d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Translates {@code next} by {@code point}.
     */
    public @Nullable Transform translate3d(@NotNull org.gtk.graphene.Point3D point) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_transform_translate_3d.invokeExact(handle(), point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Transform(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gsk_transform_unref = Interop.downcallHandle(
        "gsk_transform_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on the given {@code GskTransform}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public @NotNull void unref() {
        try {
            gsk_transform_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gsk_transform_parse = Interop.downcallHandle(
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
    public static boolean parse(@NotNull java.lang.String string, @NotNull Out<Transform> outTransform) {
        MemorySegment outTransformPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gsk_transform_parse.invokeExact(Interop.allocateNativeString(string), (Addressable) outTransformPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outTransform.set(new Transform(Refcounted.get(outTransformPOINTER.get(ValueLayout.ADDRESS, 0), true)));
        return RESULT != 0;
    }
    
}
