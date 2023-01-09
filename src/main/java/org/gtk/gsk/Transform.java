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
public class Transform extends Struct {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskTransform";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Transform}
     * @return A new, uninitialized @{link Transform}
     */
    public static Transform allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Transform newInstance = new Transform(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Transform proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Transform(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Transform> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Transform(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public Transform() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Checks two transforms for equality.
     * @param second the second transform
     * @return {@code true} if the two transforms perform the same operation
     */
    public boolean equal(@Nullable org.gtk.gsk.Transform second) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_transform_equal.invokeExact(
                    handle(),
                    (Addressable) (second == null ? MemoryAddress.NULL : second.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the category this transform belongs to.
     * @return The category of the transform
     */
    public org.gtk.gsk.TransformCategory getCategory() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_transform_get_category.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.TransformCategory.of(RESULT);
    }
    
    /**
     * Inverts the given transform.
     * <p>
     * If {@code self} is not invertible, {@code null} is returned.
     * Note that inverting {@code null} also returns {@code null}, which is
     * the correct inverse of {@code null}. If you need to differentiate
     * between those cases, you should check {@code self} is not {@code null}
     * before calling this function.
     * @return The inverted transform
     */
    public @Nullable org.gtk.gsk.Transform invert() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_invert.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Multiplies {@code next} with the given {@code matrix}.
     * @param matrix the matrix to multiply {@code next} with
     * @return The new transform
     */
    public org.gtk.gsk.Transform matrix(org.gtk.graphene.Matrix matrix) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_matrix.invokeExact(
                    handle(),
                    matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Applies a perspective projection transform.
     * <p>
     * This transform scales points in X and Y based on their Z value,
     * scaling points with positive Z values away from the origin, and
     * those with negative Z values towards the origin. Points
     * on the z=0 plane are unchanged.
     * @param depth distance of the z=0 plane. Lower values give a more
     *   flattened pyramid and therefore a more pronounced
     *   perspective effect.
     * @return The new transform
     */
    public org.gtk.gsk.Transform perspective(float depth) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_perspective.invokeExact(
                    handle(),
                    depth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Converts {@code self} into a human-readable string representation suitable
     * for printing.
     * <p>
     * The result of this function can later be parsed with
     * {@link Transform#parse}.
     * @param string The string to print into
     */
    public void print(org.gtk.glib.GString string) {
        try {
            DowncallHandles.gsk_transform_print.invokeExact(
                    handle(),
                    string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Acquires a reference on the given {@code GskTransform}.
     * @return the {@code GskTransform} with an additional reference
     */
    public @Nullable org.gtk.gsk.Transform ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Rotates {@code next} {@code angle} degrees in 2D - or in 3D-speak, around the z axis.
     * @param angle the rotation angle, in degrees (clockwise)
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform rotate(float angle) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_rotate.invokeExact(
                    handle(),
                    angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Rotates {@code next} {@code angle} degrees around {@code axis}.
     * <p>
     * For a rotation in 2D space, use {@link Transform#rotate}
     * @param angle the rotation angle, in degrees (clockwise)
     * @param axis The rotation axis
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform rotate3d(float angle, org.gtk.graphene.Vec3 axis) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_rotate_3d.invokeExact(
                    handle(),
                    angle,
                    axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Scales {@code next} in 2-dimensional space by the given factors.
     * <p>
     * Use {@link Transform#scale3d} to scale in all 3 dimensions.
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform scale(float factorX, float factorY) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_scale.invokeExact(
                    handle(),
                    factorX,
                    factorY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Scales {@code next} by the given factors.
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @param factorZ scaling factor on the Z axis
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform scale3d(float factorX, float factorY, float factorZ) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_scale_3d.invokeExact(
                    handle(),
                    factorX,
                    factorY,
                    factorZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Applies a skew transform.
     * @param skewX skew factor, in degrees, on the X axis
     * @param skewY skew factor, in degrees, on the Y axis
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform skew(float skewX, float skewY) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_skew.invokeExact(
                    handle(),
                    skewX,
                    skewY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Converts a {@code GskTransform} to a 2D transformation matrix.
     * <p>
     * {@code self} must be a 2D transformation. If you are not
     * sure, use gsk_transform_get_category() &gt;=
     * {@link TransformCategory#_2D} to check.
     * <p>
     * The returned values have the following layout:
     * <pre>{@code 
     *   | xx yx |   |  a  b  0 |
     *   | xy yy | = |  c  d  0 |
     *   | dx dy |   | tx ty  1 |
     * }</pre>
     * <p>
     * This function can be used to convert between a {@code GskTransform}
     * and a matrix type from other 2D drawing libraries, in particular
     * Cairo.
     * @param outXx return location for the xx member
     * @param outYx return location for the yx member
     * @param outXy return location for the xy member
     * @param outYy return location for the yy member
     * @param outDx return location for the x0 member
     * @param outDy return location for the y0 member
     */
    public void to2d(Out<Float> outXx, Out<Float> outYx, Out<Float> outXy, Out<Float> outYy, Out<Float> outDx, Out<Float> outDy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outXxPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outYxPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outXyPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outYyPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outDxPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outDyPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            try {
                DowncallHandles.gsk_transform_to_2d.invokeExact(
                        handle(),
                        (Addressable) outXxPOINTER.address(),
                        (Addressable) outYxPOINTER.address(),
                        (Addressable) outXyPOINTER.address(),
                        (Addressable) outYyPOINTER.address(),
                        (Addressable) outDxPOINTER.address(),
                        (Addressable) outDyPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    outXx.set(outXxPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outYx.set(outYxPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outXy.set(outXyPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outYy.set(outYyPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outDx.set(outDxPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outDy.set(outDyPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        }
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
     *                 gsk_transform_translate (NULL, &amp;GRAPHENE_POINT_T (dx, dy)),
     *                 angle),
     *             scale_x, scale_y),
     *         skew_x, skew_y)
     * <p>
     * {@code self} must be a 2D transformation. If you are not sure, use
     * <p>
     *     gsk_transform_get_category() &gt;= {@link TransformCategory#_2D}
     * <p>
     * to check.
     * @param outSkewX return location for the skew factor
     *   in the  x direction
     * @param outSkewY return location for the skew factor
     *   in the  y direction
     * @param outScaleX return location for the scale
     *   factor in the x direction
     * @param outScaleY return location for the scale
     *   factor in the y direction
     * @param outAngle return location for the rotation angle
     * @param outDx return location for the translation
     *   in the x direction
     * @param outDy return location for the translation
     *   in the y direction
     */
    public void to2dComponents(Out<Float> outSkewX, Out<Float> outSkewY, Out<Float> outScaleX, Out<Float> outScaleY, Out<Float> outAngle, Out<Float> outDx, Out<Float> outDy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outSkewXPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outSkewYPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outScaleXPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outScaleYPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outAnglePOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outDxPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outDyPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            try {
                DowncallHandles.gsk_transform_to_2d_components.invokeExact(
                        handle(),
                        (Addressable) outSkewXPOINTER.address(),
                        (Addressable) outSkewYPOINTER.address(),
                        (Addressable) outScaleXPOINTER.address(),
                        (Addressable) outScaleYPOINTER.address(),
                        (Addressable) outAnglePOINTER.address(),
                        (Addressable) outDxPOINTER.address(),
                        (Addressable) outDyPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    outSkewX.set(outSkewXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outSkewY.set(outSkewYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outScaleX.set(outScaleXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outScaleY.set(outScaleYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outAngle.set(outAnglePOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outDx.set(outDxPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outDy.set(outDyPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        }
    }
    
    /**
     * Converts a {@code GskTransform} to 2D affine transformation factors.
     * <p>
     * To recreate an equivalent transform from the factors returned
     * by this function, use
     * <p>
     *     gsk_transform_scale (gsk_transform_translate (NULL,
     *                                                   &amp;GRAPHENE_POINT_T (dx, dy)),
     *                          sx, sy)
     * <p>
     * {@code self} must be a 2D affine transformation. If you are not
     * sure, use
     * <p>
     *     gsk_transform_get_category() &gt;= {@link TransformCategory#_2D_AFFINE}
     * <p>
     * to check.
     * @param outScaleX return location for the scale
     *   factor in the x direction
     * @param outScaleY return location for the scale
     *   factor in the y direction
     * @param outDx return location for the translation
     *   in the x direction
     * @param outDy return location for the translation
     *   in the y direction
     */
    public void toAffine(Out<Float> outScaleX, Out<Float> outScaleY, Out<Float> outDx, Out<Float> outDy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outScaleXPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outScaleYPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outDxPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outDyPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            try {
                DowncallHandles.gsk_transform_to_affine.invokeExact(
                        handle(),
                        (Addressable) outScaleXPOINTER.address(),
                        (Addressable) outScaleYPOINTER.address(),
                        (Addressable) outDxPOINTER.address(),
                        (Addressable) outDyPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    outScaleX.set(outScaleXPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outScaleY.set(outScaleYPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outDx.set(outDxPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outDy.set(outDyPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        }
    }
    
    /**
     * Computes the actual value of {@code self} and stores it in {@code out_matrix}.
     * <p>
     * The previous value of {@code out_matrix} will be ignored.
     * @param outMatrix The matrix to set
     */
    public void toMatrix(org.gtk.graphene.Matrix outMatrix) {
        try {
            DowncallHandles.gsk_transform_to_matrix.invokeExact(
                    handle(),
                    outMatrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a matrix into a string that is suitable for printing.
     * <p>
     * The resulting string can be parsed with {@link Transform#parse}.
     * <p>
     * This is a wrapper around {@link Transform#print}.
     * @return A new string for {@code self}
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Converts a {@code GskTransform} to a translation operation.
     * <p>
     * {@code self} must be a 2D transformation. If you are not
     * sure, use
     * <p>
     *     gsk_transform_get_category() &gt;= {@link TransformCategory#_2D_TRANSLATE}
     * <p>
     * to check.
     * @param outDx return location for the translation
     *   in the x direction
     * @param outDy return location for the translation
     *   in the y direction
     */
    public void toTranslate(Out<Float> outDx, Out<Float> outDy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outDxPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            MemorySegment outDyPOINTER = SCOPE.allocate(Interop.valueLayout.C_FLOAT);
            try {
                DowncallHandles.gsk_transform_to_translate.invokeExact(
                        handle(),
                        (Addressable) outDxPOINTER.address(),
                        (Addressable) outDyPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    outDx.set(outDxPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
                    outDy.set(outDyPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        }
    }
    
    /**
     * Applies all the operations from {@code other} to {@code next}.
     * @param other Transform to apply
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform transform(@Nullable org.gtk.gsk.Transform other) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_transform.invokeExact(
                    handle(),
                    (Addressable) (other == null ? MemoryAddress.NULL : other.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Transforms a {@code graphene_rect_t} using the given transform {@code self}.
     * <p>
     * The result is the bounding box containing the coplanar quad.
     * @param rect a {@code graphene_rect_t}
     * @param outRect return location for the bounds
     *   of the transformed rectangle
     */
    public void transformBounds(org.gtk.graphene.Rect rect, org.gtk.graphene.Rect outRect) {
        try {
            DowncallHandles.gsk_transform_transform_bounds.invokeExact(
                    handle(),
                    rect.handle(),
                    outRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms a {@code graphene_point_t} using the given transform {@code self}.
     * @param point a {@code graphene_point_t}
     * @param outPoint return location for
     *   the transformed point
     */
    public void transformPoint(org.gtk.graphene.Point point, org.gtk.graphene.Point outPoint) {
        try {
            DowncallHandles.gsk_transform_transform_point.invokeExact(
                    handle(),
                    point.handle(),
                    outPoint.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Translates {@code next} in 2-dimensional space by {@code point}.
     * @param point the point to translate the transform by
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform translate(org.gtk.graphene.Point point) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_translate.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Translates {@code next} by {@code point}.
     * @param point the point to translate the transform by
     * @return The new transform
     */
    public @Nullable org.gtk.gsk.Transform translate3d(org.gtk.graphene.Point3D point) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_translate_3d.invokeExact(
                    handle(),
                    point.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gtk.gsk.Transform.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Releases a reference on the given {@code GskTransform}.
     * <p>
     * If the reference was the last, the resources associated to the {@code self} are
     * freed.
     */
    public void unref() {
        try {
            DowncallHandles.gsk_transform_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param string the string to parse
     * @param outTransform The location to put the transform in
     * @return {@code true} if {@code string} described a valid transform.
     */
    public static boolean parse(java.lang.String string, Out<org.gtk.gsk.Transform> outTransform) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outTransformPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gsk_transform_parse.invokeExact(
                        Marshal.stringToAddress.marshal(string, SCOPE),
                        (Addressable) outTransformPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    outTransform.set(org.gtk.gsk.Transform.fromAddress.marshal(outTransformPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_transform_new = Interop.downcallHandle(
                "gsk_transform_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_equal = Interop.downcallHandle(
                "gsk_transform_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_get_category = Interop.downcallHandle(
                "gsk_transform_get_category",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_invert = Interop.downcallHandle(
                "gsk_transform_invert",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_matrix = Interop.downcallHandle(
                "gsk_transform_matrix",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_perspective = Interop.downcallHandle(
                "gsk_transform_perspective",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_transform_print = Interop.downcallHandle(
                "gsk_transform_print",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_ref = Interop.downcallHandle(
                "gsk_transform_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_rotate = Interop.downcallHandle(
                "gsk_transform_rotate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_transform_rotate_3d = Interop.downcallHandle(
                "gsk_transform_rotate_3d",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_scale = Interop.downcallHandle(
                "gsk_transform_scale",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_transform_scale_3d = Interop.downcallHandle(
                "gsk_transform_scale_3d",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_transform_skew = Interop.downcallHandle(
                "gsk_transform_skew",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_transform_to_2d = Interop.downcallHandle(
                "gsk_transform_to_2d",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_to_2d_components = Interop.downcallHandle(
                "gsk_transform_to_2d_components",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_to_affine = Interop.downcallHandle(
                "gsk_transform_to_affine",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_to_matrix = Interop.downcallHandle(
                "gsk_transform_to_matrix",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_to_string = Interop.downcallHandle(
                "gsk_transform_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_to_translate = Interop.downcallHandle(
                "gsk_transform_to_translate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_transform = Interop.downcallHandle(
                "gsk_transform_transform",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_transform_bounds = Interop.downcallHandle(
                "gsk_transform_transform_bounds",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_transform_point = Interop.downcallHandle(
                "gsk_transform_transform_point",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_translate = Interop.downcallHandle(
                "gsk_transform_translate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_translate_3d = Interop.downcallHandle(
                "gsk_transform_translate_3d",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_unref = Interop.downcallHandle(
                "gsk_transform_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_transform_parse = Interop.downcallHandle(
                "gsk_transform_parse",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
