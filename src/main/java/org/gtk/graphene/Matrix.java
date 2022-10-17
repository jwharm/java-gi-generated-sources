package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure capable of holding a 4x4 matrix.
 * <p>
 * The contents of the {@link Matrix} structure are private and
 * should never be accessed directly.
 */
public class Matrix extends io.github.jwharm.javagi.ResourceBase {

    public Matrix(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle graphene_matrix_alloc = Interop.downcallHandle(
        "graphene_matrix_alloc",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructAlloc() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) graphene_matrix_alloc.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a new {@link Matrix}.
     */
    public static Matrix alloc() {
        return new Matrix(constructAlloc());
    }
    
    private static final MethodHandle graphene_matrix_decompose = Interop.downcallHandle(
        "graphene_matrix_decompose",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Decomposes a transformation matrix into its component transformations.
     * <p>
     * The algorithm for decomposing a matrix is taken from the
     * <a href="http://dev.w3.org/csswg/css-transforms/">CSS3 Transforms specification</a>;
     * specifically, the decomposition code is based on the equivalent code
     * published in "Graphics Gems II", edited by Jim Arvo, and
     * <a href="http://tog.acm.org/resources/GraphicsGems/gemsii/unmatrix.c">available online</a>.
     */
    public boolean decompose(@NotNull Out<Vec3> translate, @NotNull Out<Vec3> scale, @NotNull Out<Quaternion> rotate, @NotNull Out<Vec3> shear, @NotNull Out<Vec4> perspective) {
        MemorySegment translatePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment scalePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment rotatePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment shearPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment perspectivePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_decompose.invokeExact(handle(), (Addressable) translatePOINTER.address(), (Addressable) scalePOINTER.address(), (Addressable) rotatePOINTER.address(), (Addressable) shearPOINTER.address(), (Addressable) perspectivePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        translate.set(new Vec3(Refcounted.get(translatePOINTER.get(ValueLayout.ADDRESS, 0), false)));
        scale.set(new Vec3(Refcounted.get(scalePOINTER.get(ValueLayout.ADDRESS, 0), false)));
        rotate.set(new Quaternion(Refcounted.get(rotatePOINTER.get(ValueLayout.ADDRESS, 0), false)));
        shear.set(new Vec3(Refcounted.get(shearPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        perspective.set(new Vec4(Refcounted.get(perspectivePOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_determinant = Interop.downcallHandle(
        "graphene_matrix_determinant",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the determinant of the given matrix.
     */
    public float determinant() {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_determinant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_equal = Interop.downcallHandle(
        "graphene_matrix_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Matrix} matrices are equal.
     */
    public boolean equal(@NotNull Matrix b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_equal.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_equal_fast = Interop.downcallHandle(
        "graphene_matrix_equal_fast",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Matrix} matrices are
     * byte-by-byte equal.
     * <p>
     * While this function is faster than graphene_matrix_equal(), it
     * can also return false negatives, so it should be used in
     * conjuction with either graphene_matrix_equal() or
     * graphene_matrix_near(). For instance:
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   if (graphene_matrix_equal_fast (a, b))
     *     {
     *       // matrices are definitely the same
     *     }
     *   else
     *     {
     *       if (graphene_matrix_equal (a, b))
     *         // matrices contain the same values within an epsilon of FLT_EPSILON
     *       else if (graphene_matrix_near (a, b, 0.0001))
     *         // matrices contain the same values within an epsilon of 0.0001
     *       else
     *         // matrices are not equal
     *     }
     * }</pre>
     */
    public boolean equalFast(@NotNull Matrix b) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_equal_fast.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_free = Interop.downcallHandle(
        "graphene_matrix_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_matrix_alloc().
     */
    public @NotNull void free() {
        try {
            graphene_matrix_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_get_row = Interop.downcallHandle(
        "graphene_matrix_get_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the given row vector at {@code index_} inside a matrix.
     */
    public @NotNull void getRow(@NotNull int index, @NotNull Out<Vec4> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_get_row.invokeExact(handle(), index, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec4(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_get_value = Interop.downcallHandle(
        "graphene_matrix_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the value at the given {@code row} and {@code col} index.
     */
    public float getValue(@NotNull int row, @NotNull int col) {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_get_value.invokeExact(handle(), row, col);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_get_x_scale = Interop.downcallHandle(
        "graphene_matrix_get_x_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the scaling factor on the X axis in @m.
     */
    public float getXScale() {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_get_x_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_get_x_translation = Interop.downcallHandle(
        "graphene_matrix_get_x_translation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the translation component on the X axis from @m.
     */
    public float getXTranslation() {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_get_x_translation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_get_y_scale = Interop.downcallHandle(
        "graphene_matrix_get_y_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the scaling factor on the Y axis in @m.
     */
    public float getYScale() {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_get_y_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_get_y_translation = Interop.downcallHandle(
        "graphene_matrix_get_y_translation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the translation component on the Y axis from @m.
     */
    public float getYTranslation() {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_get_y_translation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_get_z_scale = Interop.downcallHandle(
        "graphene_matrix_get_z_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the scaling factor on the Z axis in @m.
     */
    public float getZScale() {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_get_z_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_get_z_translation = Interop.downcallHandle(
        "graphene_matrix_get_z_translation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the translation component on the Z axis from @m.
     */
    public float getZTranslation() {
        float RESULT;
        try {
            RESULT = (float) graphene_matrix_get_z_translation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_init_from_2d = Interop.downcallHandle(
        "graphene_matrix_init_from_2d",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Initializes a {@link Matrix} from the values of an affine
     * transformation matrix.
     * <p>
     * The arguments map to the following matrix layout:
     * <p>
     * <pre>{@code <!-- language="plain" -->
     *   ⎛ xx  yx ⎞   ⎛  a   b  0 ⎞
     *   ⎜ xy  yy ⎟ = ⎜  c   d  0 ⎟
     *   ⎝ x0  y0 ⎠   ⎝ tx  ty  1 ⎠
     * }</pre>
     * <p>
     * This function can be used to convert between an affine matrix type
     * from other libraries and a {@link Matrix}.
     */
    public @NotNull Matrix initFrom2d(@NotNull double xx, @NotNull double yx, @NotNull double xy, @NotNull double yy, @NotNull double x0, @NotNull double y0) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_from_2d.invokeExact(handle(), xx, yx, xy, yy, x0, y0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_from_float = Interop.downcallHandle(
        "graphene_matrix_init_from_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with the given array of floating
     * point values.
     */
    public @NotNull Matrix initFromFloat(@NotNull float[] v) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_from_float.invokeExact(handle(), Interop.allocateNativeArray(v));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_from_matrix = Interop.downcallHandle(
        "graphene_matrix_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} using the values of the
     * given matrix.
     */
    public @NotNull Matrix initFromMatrix(@NotNull Matrix src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_from_matrix.invokeExact(handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_from_vec4 = Interop.downcallHandle(
        "graphene_matrix_init_from_vec4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with the given four row
     * vectors.
     */
    public @NotNull Matrix initFromVec4(@NotNull Vec4 v0, @NotNull Vec4 v1, @NotNull Vec4 v2, @NotNull Vec4 v3) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_from_vec4.invokeExact(handle(), v0.handle(), v1.handle(), v2.handle(), v3.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_frustum = Interop.downcallHandle(
        "graphene_matrix_init_frustum",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} compatible with {@link Frustum}.
     * <p>
     * See also: graphene_frustum_init_from_matrix()
     */
    public @NotNull Matrix initFrustum(@NotNull float left, @NotNull float right, @NotNull float bottom, @NotNull float top, @NotNull float zNear, @NotNull float zFar) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_frustum.invokeExact(handle(), left, right, bottom, top, zNear, zFar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_identity = Interop.downcallHandle(
        "graphene_matrix_init_identity",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with the identity matrix.
     */
    public @NotNull Matrix initIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_look_at = Interop.downcallHandle(
        "graphene_matrix_init_look_at",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} so that it positions the "camera"
     * at the given {@code eye} coordinates towards an object at the {@code center}
     * coordinates. The top of the camera is aligned to the direction
     * of the {@code up} vector.
     * <p>
     * Before the transform, the camera is assumed to be placed at the
     * origin, looking towards the negative Z axis, with the top side of
     * the camera facing in the direction of the Y axis and the right
     * side in the direction of the X axis.
     * <p>
     * In theory, one could use @m to transform a model of such a camera
     * into world-space. However, it is more common to use the inverse of
     * @m to transform another object from world coordinates to the view
     * coordinates of the camera. Typically you would then apply the
     * camera projection transform to get from view to screen
     * coordinates.
     */
    public @NotNull Matrix initLookAt(@NotNull Vec3 eye, @NotNull Vec3 center, @NotNull Vec3 up) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_look_at.invokeExact(handle(), eye.handle(), center.handle(), up.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_ortho = Interop.downcallHandle(
        "graphene_matrix_init_ortho",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with an orthographic projection.
     */
    public @NotNull Matrix initOrtho(@NotNull float left, @NotNull float right, @NotNull float top, @NotNull float bottom, @NotNull float zNear, @NotNull float zFar) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_ortho.invokeExact(handle(), left, right, top, bottom, zNear, zFar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_perspective = Interop.downcallHandle(
        "graphene_matrix_init_perspective",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with a perspective projection.
     */
    public @NotNull Matrix initPerspective(@NotNull float fovy, @NotNull float aspect, @NotNull float zNear, @NotNull float zFar) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_perspective.invokeExact(handle(), fovy, aspect, zNear, zFar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_rotate = Interop.downcallHandle(
        "graphene_matrix_init_rotate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @m to represent a rotation of {@code angle} degrees on
     * the axis represented by the {@code axis} vector.
     */
    public @NotNull Matrix initRotate(@NotNull float angle, @NotNull Vec3 axis) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_rotate.invokeExact(handle(), angle, axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_scale = Interop.downcallHandle(
        "graphene_matrix_init_scale",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with the given scaling factors.
     */
    public @NotNull Matrix initScale(@NotNull float x, @NotNull float y, @NotNull float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_scale.invokeExact(handle(), x, y, z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_skew = Interop.downcallHandle(
        "graphene_matrix_init_skew",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with a skew transformation
     * with the given factors.
     */
    public @NotNull Matrix initSkew(@NotNull float xSkew, @NotNull float ySkew) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_skew.invokeExact(handle(), xSkew, ySkew);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_init_translate = Interop.downcallHandle(
        "graphene_matrix_init_translate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with a translation to the
     * given coordinates.
     */
    public @NotNull Matrix initTranslate(@NotNull Point3D p) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) graphene_matrix_init_translate.invokeExact(handle(), p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle graphene_matrix_interpolate = Interop.downcallHandle(
        "graphene_matrix_interpolate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Linearly interpolates the two given {@link Matrix} by
     * interpolating the decomposed transformations separately.
     * <p>
     * If either matrix cannot be reduced to their transformations
     * then the interpolation cannot be performed, and this function
     * will return an identity matrix.
     */
    public @NotNull void interpolate(@NotNull Matrix b, @NotNull double factor, @NotNull Out<Matrix> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_interpolate.invokeExact(handle(), b.handle(), factor, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Matrix(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_inverse = Interop.downcallHandle(
        "graphene_matrix_inverse",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inverts the given matrix.
     */
    public boolean inverse(@NotNull Out<Matrix> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_inverse.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Matrix(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_is_2d = Interop.downcallHandle(
        "graphene_matrix_is_2d",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Matrix} is compatible with an
     * a 2D affine transformation matrix.
     */
    public boolean is2d() {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_is_2d.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_is_backface_visible = Interop.downcallHandle(
        "graphene_matrix_is_backface_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a {@link Matrix} has a visible back face.
     */
    public boolean isBackfaceVisible() {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_is_backface_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_is_identity = Interop.downcallHandle(
        "graphene_matrix_is_identity",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Matrix} is the identity matrix.
     */
    public boolean isIdentity() {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_is_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_is_singular = Interop.downcallHandle(
        "graphene_matrix_is_singular",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a matrix is singular.
     */
    public boolean isSingular() {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_is_singular.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_multiply = Interop.downcallHandle(
        "graphene_matrix_multiply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies two {@link Matrix}.
     * <p>
     * Matrix multiplication is not commutative in general; the order of the factors matters.
     * The product of this multiplication is (@a × @b)
     */
    public @NotNull void multiply(@NotNull Matrix b, @NotNull Out<Matrix> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_multiply.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Matrix(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_near = Interop.downcallHandle(
        "graphene_matrix_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Compares the two given {@link Matrix} matrices and checks
     * whether their values are within the given {@code epsilon} of each
     * other.
     */
    public boolean near(@NotNull Matrix b, @NotNull float epsilon) {
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_near.invokeExact(handle(), b.handle(), epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_normalize = Interop.downcallHandle(
        "graphene_matrix_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the given {@link Matrix}.
     */
    public @NotNull void normalize(@NotNull Out<Matrix> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_normalize.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Matrix(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_perspective = Interop.downcallHandle(
        "graphene_matrix_perspective",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Applies a perspective of {@code depth} to the matrix.
     */
    public @NotNull void perspective(@NotNull float depth, @NotNull Out<Matrix> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_perspective.invokeExact(handle(), depth, (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Matrix(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_print = Interop.downcallHandle(
        "graphene_matrix_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the contents of a matrix to the standard error stream.
     * <p>
     * This function is only useful for debugging; there are no guarantees
     * made on the format of the output.
     */
    public @NotNull void print() {
        try {
            graphene_matrix_print.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_project_point = Interop.downcallHandle(
        "graphene_matrix_project_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Projects a {@link Point} using the matrix @m.
     */
    public @NotNull void projectPoint(@NotNull Point p, @NotNull Out<Point> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_project_point.invokeExact(handle(), p.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_project_rect = Interop.downcallHandle(
        "graphene_matrix_project_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Projects all corners of a {@link Rect} using the given matrix.
     * <p>
     * See also: graphene_matrix_project_point()
     */
    public @NotNull void projectRect(@NotNull Rect r, @NotNull Out<Quad> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_project_rect.invokeExact(handle(), r.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quad(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_project_rect_bounds = Interop.downcallHandle(
        "graphene_matrix_project_rect_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Projects a {@link Rect} using the given matrix.
     * <p>
     * The resulting rectangle is the axis aligned bounding rectangle capable
     * of fully containing the projected rectangle.
     */
    public @NotNull void projectRectBounds(@NotNull Rect r, @NotNull Out<Rect> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_project_rect_bounds.invokeExact(handle(), r.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Rect(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_rotate = Interop.downcallHandle(
        "graphene_matrix_rotate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a rotation transformation to @m, using the given {@code angle}
     * and {@code axis} vector.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_rotate() and
     * then multiplying the matrix @m with the rotation matrix.
     */
    public @NotNull void rotate(@NotNull float angle, @NotNull Vec3 axis) {
        try {
            graphene_matrix_rotate.invokeExact(handle(), angle, axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_rotate_euler = Interop.downcallHandle(
        "graphene_matrix_rotate_euler",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a rotation transformation to @m, using the given
     * {@link Euler}.
     */
    public @NotNull void rotateEuler(@NotNull Euler e) {
        try {
            graphene_matrix_rotate_euler.invokeExact(handle(), e.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_rotate_quaternion = Interop.downcallHandle(
        "graphene_matrix_rotate_quaternion",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a rotation transformation to @m, using the given
     * {@link Quaternion}.
     * <p>
     * This is the equivalent of calling graphene_quaternion_to_matrix() and
     * then multiplying @m with the rotation matrix.
     */
    public @NotNull void rotateQuaternion(@NotNull Quaternion q) {
        try {
            graphene_matrix_rotate_quaternion.invokeExact(handle(), q.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_rotate_x = Interop.downcallHandle(
        "graphene_matrix_rotate_x",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a rotation transformation around the X axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public @NotNull void rotateX(@NotNull float angle) {
        try {
            graphene_matrix_rotate_x.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_rotate_y = Interop.downcallHandle(
        "graphene_matrix_rotate_y",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a rotation transformation around the Y axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public @NotNull void rotateY(@NotNull float angle) {
        try {
            graphene_matrix_rotate_y.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_rotate_z = Interop.downcallHandle(
        "graphene_matrix_rotate_z",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a rotation transformation around the Z axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public @NotNull void rotateZ(@NotNull float angle) {
        try {
            graphene_matrix_rotate_z.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_scale = Interop.downcallHandle(
        "graphene_matrix_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a scaling transformation to @m, using the three
     * given factors.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_scale() and then
     * multiplying the matrix @m with the scale matrix.
     */
    public @NotNull void scale(@NotNull float factorX, @NotNull float factorY, @NotNull float factorZ) {
        try {
            graphene_matrix_scale.invokeExact(handle(), factorX, factorY, factorZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_skew_xy = Interop.downcallHandle(
        "graphene_matrix_skew_xy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a skew of {@code factor} on the X and Y axis to the given matrix.
     */
    public @NotNull void skewXy(@NotNull float factor) {
        try {
            graphene_matrix_skew_xy.invokeExact(handle(), factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_skew_xz = Interop.downcallHandle(
        "graphene_matrix_skew_xz",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a skew of {@code factor} on the X and Z axis to the given matrix.
     */
    public @NotNull void skewXz(@NotNull float factor) {
        try {
            graphene_matrix_skew_xz.invokeExact(handle(), factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_skew_yz = Interop.downcallHandle(
        "graphene_matrix_skew_yz",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a skew of {@code factor} on the Y and Z axis to the given matrix.
     */
    public @NotNull void skewYz(@NotNull float factor) {
        try {
            graphene_matrix_skew_yz.invokeExact(handle(), factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_to_2d = Interop.downcallHandle(
        "graphene_matrix_to_2d",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Matrix} to an affine transformation
     * matrix, if the given matrix is compatible.
     * <p>
     * The returned values have the following layout:
     * <p>
     * <pre>{@code <!-- language="plain" -->
     *   ⎛ xx  yx ⎞   ⎛  a   b  0 ⎞
     *   ⎜ xy  yy ⎟ = ⎜  c   d  0 ⎟
     *   ⎝ x0  y0 ⎠   ⎝ tx  ty  1 ⎠
     * }</pre>
     * <p>
     * This function can be used to convert between a {@link Matrix}
     * and an affine matrix type from other libraries.
     */
    public boolean to2d(@NotNull Out<Double> xx, @NotNull Out<Double> yx, @NotNull Out<Double> xy, @NotNull Out<Double> yy, @NotNull Out<Double> x0, @NotNull Out<Double> y0) {
        MemorySegment xxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yxPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment xyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yyPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment x0POINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment y0POINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_to_2d.invokeExact(handle(), (Addressable) xxPOINTER.address(), (Addressable) yxPOINTER.address(), (Addressable) xyPOINTER.address(), (Addressable) yyPOINTER.address(), (Addressable) x0POINTER.address(), (Addressable) y0POINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xx.set(xxPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        yx.set(yxPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        xy.set(xyPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        yy.set(yyPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        x0.set(x0POINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y0.set(y0POINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT;
    }
    
    private static final MethodHandle graphene_matrix_to_float = Interop.downcallHandle(
        "graphene_matrix_to_float",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Matrix} to an array of floating point
     * values.
     */
    public @NotNull void toFloat(@NotNull Out<float[]> v) {
        MemorySegment vPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_to_float.invokeExact(handle(), (Addressable) vPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        v.set(MemorySegment.ofAddress(vPOINTER.get(ValueLayout.ADDRESS, 0), 16 * ValueLayout.JAVA_FLOAT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_FLOAT));
    }
    
    private static final MethodHandle graphene_matrix_transform_bounds = Interop.downcallHandle(
        "graphene_matrix_transform_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms each corner of a {@link Rect} using the given matrix @m.
     * <p>
     * The result is the axis aligned bounding rectangle containing the coplanar
     * quadrilateral.
     * <p>
     * See also: graphene_matrix_transform_point()
     */
    public @NotNull void transformBounds(@NotNull Rect r, @NotNull Out<Rect> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_bounds.invokeExact(handle(), r.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Rect(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_box = Interop.downcallHandle(
        "graphene_matrix_transform_box",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the vertices of a {@link Box} using the given matrix @m.
     * <p>
     * The result is the axis aligned bounding box containing the transformed
     * vertices.
     */
    public @NotNull void transformBox(@NotNull Box b, @NotNull Out<Box> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_box.invokeExact(handle(), b.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Box(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_point = Interop.downcallHandle(
        "graphene_matrix_transform_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the given {@link Point} using the matrix @m.
     * <p>
     * Unlike graphene_matrix_transform_vec3(), this function will take into
     * account the fourth row vector of the {@link Matrix} when computing
     * the dot product of each row vector of the matrix.
     * <p>
     * See also: graphene_simd4x4f_point3_mul()
     */
    public @NotNull void transformPoint(@NotNull Point p, @NotNull Out<Point> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_point.invokeExact(handle(), p.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_point3d = Interop.downcallHandle(
        "graphene_matrix_transform_point3d",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the given {@link Point3D} using the matrix @m.
     * <p>
     * Unlike graphene_matrix_transform_vec3(), this function will take into
     * account the fourth row vector of the {@link Matrix} when computing
     * the dot product of each row vector of the matrix.
     * <p>
     * See also: graphene_simd4x4f_point3_mul()
     */
    public @NotNull void transformPoint3d(@NotNull Point3D p, @NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_point3d.invokeExact(handle(), p.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_ray = Interop.downcallHandle(
        "graphene_matrix_transform_ray",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transform a {@link Ray} using the given matrix @m.
     */
    public @NotNull void transformRay(@NotNull Ray r, @NotNull Out<Ray> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_ray.invokeExact(handle(), r.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Ray(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_rect = Interop.downcallHandle(
        "graphene_matrix_transform_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms each corner of a {@link Rect} using the given matrix @m.
     * <p>
     * The result is a coplanar quadrilateral.
     * <p>
     * See also: graphene_matrix_transform_point()
     */
    public @NotNull void transformRect(@NotNull Rect r, @NotNull Out<Quad> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_rect.invokeExact(handle(), r.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Quad(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_sphere = Interop.downcallHandle(
        "graphene_matrix_transform_sphere",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@link Sphere} using the given matrix @m. The
     * result is the bounding sphere containing the transformed sphere.
     */
    public @NotNull void transformSphere(@NotNull Sphere s, @NotNull Out<Sphere> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_sphere.invokeExact(handle(), s.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Sphere(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_vec3 = Interop.downcallHandle(
        "graphene_matrix_transform_vec3",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the given {@link Vec3} using the matrix @m.
     * <p>
     * This function will multiply the X, Y, and Z row vectors of the matrix @m
     * with the corresponding components of the vector @v. The W row vector will
     * be ignored.
     * <p>
     * See also: graphene_simd4x4f_vec3_mul()
     */
    public @NotNull void transformVec3(@NotNull Vec3 v, @NotNull Out<Vec3> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_vec3.invokeExact(handle(), v.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec3(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_transform_vec4 = Interop.downcallHandle(
        "graphene_matrix_transform_vec4",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the given {@link Vec4} using the matrix @m.
     * <p>
     * See also: graphene_simd4x4f_vec4_mul()
     */
    public @NotNull void transformVec4(@NotNull Vec4 v, @NotNull Out<Vec4> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transform_vec4.invokeExact(handle(), v.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Vec4(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_translate = Interop.downcallHandle(
        "graphene_matrix_translate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a translation transformation to @m using the coordinates
     * of the given {@link Point3D}.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_translate() and
     * then multiplying @m with the translation matrix.
     */
    public @NotNull void translate(@NotNull Point3D pos) {
        try {
            graphene_matrix_translate.invokeExact(handle(), pos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle graphene_matrix_transpose = Interop.downcallHandle(
        "graphene_matrix_transpose",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transposes the given matrix.
     */
    public @NotNull void transpose(@NotNull Out<Matrix> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_transpose.invokeExact(handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Matrix(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_unproject_point3d = Interop.downcallHandle(
        "graphene_matrix_unproject_point3d",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unprojects the given {@code point} using the {@code projection} matrix and
     * a {@code modelview} matrix.
     */
    public @NotNull void unprojectPoint3d(@NotNull Matrix modelview, @NotNull Point3D point, @NotNull Out<Point3D> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_unproject_point3d.invokeExact(handle(), modelview.handle(), point.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point3D(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_untransform_bounds = Interop.downcallHandle(
        "graphene_matrix_untransform_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the transformation on the corners of a {@link Rect} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     */
    public @NotNull void untransformBounds(@NotNull Rect r, @NotNull Rect bounds, @NotNull Out<Rect> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            graphene_matrix_untransform_bounds.invokeExact(handle(), r.handle(), bounds.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Rect(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle graphene_matrix_untransform_point = Interop.downcallHandle(
        "graphene_matrix_untransform_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the transformation of a {@link Point} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     */
    public boolean untransformPoint(@NotNull Point p, @NotNull Rect bounds, @NotNull Out<Point> res) {
        MemorySegment resPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        boolean RESULT;
        try {
            RESULT = (boolean) graphene_matrix_untransform_point.invokeExact(handle(), p.handle(), bounds.handle(), (Addressable) resPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        res.set(new Point(Refcounted.get(resPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT;
    }
    
}
