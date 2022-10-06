package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle graphene_matrix_alloc = Interop.downcallHandle(
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
    
    static final MethodHandle graphene_matrix_decompose = Interop.downcallHandle(
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
    public boolean decompose(Vec3 translate, Vec3 scale, Quaternion rotate, Vec3 shear, Vec4 perspective) {
        try {
            var RESULT = (boolean) graphene_matrix_decompose.invokeExact(handle(), translate.handle(), scale.handle(), rotate.handle(), shear.handle(), perspective.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_determinant = Interop.downcallHandle(
        "graphene_matrix_determinant",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the determinant of the given matrix.
     */
    public float determinant() {
        try {
            var RESULT = (float) graphene_matrix_determinant.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_equal = Interop.downcallHandle(
        "graphene_matrix_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the two given {@link Matrix} matrices are equal.
     */
    public boolean equal(Matrix b) {
        try {
            var RESULT = (boolean) graphene_matrix_equal.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_equal_fast = Interop.downcallHandle(
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
    public boolean equalFast(Matrix b) {
        try {
            var RESULT = (boolean) graphene_matrix_equal_fast.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_free = Interop.downcallHandle(
        "graphene_matrix_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees the resources allocated by graphene_matrix_alloc().
     */
    public void free() {
        try {
            graphene_matrix_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_row = Interop.downcallHandle(
        "graphene_matrix_get_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the given row vector at {@code index_} inside a matrix.
     */
    public void getRow(int index, Vec4 res) {
        try {
            graphene_matrix_get_row.invokeExact(handle(), index, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_value = Interop.downcallHandle(
        "graphene_matrix_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the value at the given {@code row} and {@code col} index.
     */
    public float getValue(int row, int col) {
        try {
            var RESULT = (float) graphene_matrix_get_value.invokeExact(handle(), row, col);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_x_scale = Interop.downcallHandle(
        "graphene_matrix_get_x_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the scaling factor on the X axis in @m.
     */
    public float getXScale() {
        try {
            var RESULT = (float) graphene_matrix_get_x_scale.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_x_translation = Interop.downcallHandle(
        "graphene_matrix_get_x_translation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the translation component on the X axis from @m.
     */
    public float getXTranslation() {
        try {
            var RESULT = (float) graphene_matrix_get_x_translation.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_y_scale = Interop.downcallHandle(
        "graphene_matrix_get_y_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the scaling factor on the Y axis in @m.
     */
    public float getYScale() {
        try {
            var RESULT = (float) graphene_matrix_get_y_scale.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_y_translation = Interop.downcallHandle(
        "graphene_matrix_get_y_translation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the translation component on the Y axis from @m.
     */
    public float getYTranslation() {
        try {
            var RESULT = (float) graphene_matrix_get_y_translation.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_z_scale = Interop.downcallHandle(
        "graphene_matrix_get_z_scale",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the scaling factor on the Z axis in @m.
     */
    public float getZScale() {
        try {
            var RESULT = (float) graphene_matrix_get_z_scale.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_get_z_translation = Interop.downcallHandle(
        "graphene_matrix_get_z_translation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the translation component on the Z axis from @m.
     */
    public float getZTranslation() {
        try {
            var RESULT = (float) graphene_matrix_get_z_translation.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_from_2d = Interop.downcallHandle(
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
    public Matrix initFrom2d(double xx, double yx, double xy, double yy, double x0, double y0) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_from_2d.invokeExact(handle(), xx, yx, xy, yy, x0, y0);
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_from_float = Interop.downcallHandle(
        "graphene_matrix_init_from_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with the given array of floating
     * point values.
     */
    public Matrix initFromFloat(float[] v) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_from_float.invokeExact(handle(), Interop.allocateNativeArray(v).handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_from_matrix = Interop.downcallHandle(
        "graphene_matrix_init_from_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} using the values of the
     * given matrix.
     */
    public Matrix initFromMatrix(Matrix src) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_from_matrix.invokeExact(handle(), src.handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_from_vec4 = Interop.downcallHandle(
        "graphene_matrix_init_from_vec4",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with the given four row
     * vectors.
     */
    public Matrix initFromVec4(Vec4 v0, Vec4 v1, Vec4 v2, Vec4 v3) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_from_vec4.invokeExact(handle(), v0.handle(), v1.handle(), v2.handle(), v3.handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_frustum = Interop.downcallHandle(
        "graphene_matrix_init_frustum",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} compatible with {@link Frustum}.
     * <p>
     * See also: graphene_frustum_init_from_matrix()
     */
    public Matrix initFrustum(float left, float right, float bottom, float top, float zNear, float zFar) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_frustum.invokeExact(handle(), left, right, bottom, top, zNear, zFar);
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_identity = Interop.downcallHandle(
        "graphene_matrix_init_identity",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with the identity matrix.
     */
    public Matrix initIdentity() {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_identity.invokeExact(handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_look_at = Interop.downcallHandle(
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
    public Matrix initLookAt(Vec3 eye, Vec3 center, Vec3 up) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_look_at.invokeExact(handle(), eye.handle(), center.handle(), up.handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_ortho = Interop.downcallHandle(
        "graphene_matrix_init_ortho",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with an orthographic projection.
     */
    public Matrix initOrtho(float left, float right, float top, float bottom, float zNear, float zFar) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_ortho.invokeExact(handle(), left, right, top, bottom, zNear, zFar);
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_perspective = Interop.downcallHandle(
        "graphene_matrix_init_perspective",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with a perspective projection.
     */
    public Matrix initPerspective(float fovy, float aspect, float zNear, float zFar) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_perspective.invokeExact(handle(), fovy, aspect, zNear, zFar);
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_rotate = Interop.downcallHandle(
        "graphene_matrix_init_rotate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes @m to represent a rotation of {@code angle} degrees on
     * the axis represented by the {@code axis} vector.
     */
    public Matrix initRotate(float angle, Vec3 axis) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_rotate.invokeExact(handle(), angle, axis.handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_scale = Interop.downcallHandle(
        "graphene_matrix_init_scale",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with the given scaling factors.
     */
    public Matrix initScale(float x, float y, float z) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_scale.invokeExact(handle(), x, y, z);
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_skew = Interop.downcallHandle(
        "graphene_matrix_init_skew",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Initializes a {@link Matrix} with a skew transformation
     * with the given factors.
     */
    public Matrix initSkew(float xSkew, float ySkew) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_skew.invokeExact(handle(), xSkew, ySkew);
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_init_translate = Interop.downcallHandle(
        "graphene_matrix_init_translate",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link Matrix} with a translation to the
     * given coordinates.
     */
    public Matrix initTranslate(Point3D p) {
        try {
            var RESULT = (MemoryAddress) graphene_matrix_init_translate.invokeExact(handle(), p.handle());
            return new Matrix(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_interpolate = Interop.downcallHandle(
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
    public void interpolate(Matrix b, double factor, Matrix res) {
        try {
            graphene_matrix_interpolate.invokeExact(handle(), b.handle(), factor, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_inverse = Interop.downcallHandle(
        "graphene_matrix_inverse",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inverts the given matrix.
     */
    public boolean inverse(Matrix res) {
        try {
            var RESULT = (boolean) graphene_matrix_inverse.invokeExact(handle(), res.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_is_2d = Interop.downcallHandle(
        "graphene_matrix_is_2d",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Matrix} is compatible with an
     * a 2D affine transformation matrix.
     */
    public boolean is2d() {
        try {
            var RESULT = (boolean) graphene_matrix_is_2d.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_is_backface_visible = Interop.downcallHandle(
        "graphene_matrix_is_backface_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a {@link Matrix} has a visible back face.
     */
    public boolean isBackfaceVisible() {
        try {
            var RESULT = (boolean) graphene_matrix_is_backface_visible.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_is_identity = Interop.downcallHandle(
        "graphene_matrix_is_identity",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the given {@link Matrix} is the identity matrix.
     */
    public boolean isIdentity() {
        try {
            var RESULT = (boolean) graphene_matrix_is_identity.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_is_singular = Interop.downcallHandle(
        "graphene_matrix_is_singular",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether a matrix is singular.
     */
    public boolean isSingular() {
        try {
            var RESULT = (boolean) graphene_matrix_is_singular.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_multiply = Interop.downcallHandle(
        "graphene_matrix_multiply",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Multiplies two {@link Matrix}.
     * <p>
     * Matrix multiplication is not commutative in general; the order of the factors matters.
     * The product of this multiplication is (@a × @b)
     */
    public void multiply(Matrix b, Matrix res) {
        try {
            graphene_matrix_multiply.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_near = Interop.downcallHandle(
        "graphene_matrix_near",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Compares the two given {@link Matrix} matrices and checks
     * whether their values are within the given {@code epsilon} of each
     * other.
     */
    public boolean near(Matrix b, float epsilon) {
        try {
            var RESULT = (boolean) graphene_matrix_near.invokeExact(handle(), b.handle(), epsilon);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_normalize = Interop.downcallHandle(
        "graphene_matrix_normalize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Normalizes the given {@link Matrix}.
     */
    public void normalize(Matrix res) {
        try {
            graphene_matrix_normalize.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_perspective = Interop.downcallHandle(
        "graphene_matrix_perspective",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Applies a perspective of {@code depth} to the matrix.
     */
    public void perspective(float depth, Matrix res) {
        try {
            graphene_matrix_perspective.invokeExact(handle(), depth, res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_print = Interop.downcallHandle(
        "graphene_matrix_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the contents of a matrix to the standard error stream.
     * <p>
     * This function is only useful for debugging; there are no guarantees
     * made on the format of the output.
     */
    public void print() {
        try {
            graphene_matrix_print.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_project_point = Interop.downcallHandle(
        "graphene_matrix_project_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Projects a {@link Point} using the matrix @m.
     */
    public void projectPoint(Point p, Point res) {
        try {
            graphene_matrix_project_point.invokeExact(handle(), p.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_project_rect = Interop.downcallHandle(
        "graphene_matrix_project_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Projects all corners of a {@link Rect} using the given matrix.
     * <p>
     * See also: graphene_matrix_project_point()
     */
    public void projectRect(Rect r, Quad res) {
        try {
            graphene_matrix_project_rect.invokeExact(handle(), r.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_project_rect_bounds = Interop.downcallHandle(
        "graphene_matrix_project_rect_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Projects a {@link Rect} using the given matrix.
     * <p>
     * The resulting rectangle is the axis aligned bounding rectangle capable
     * of fully containing the projected rectangle.
     */
    public void projectRectBounds(Rect r, Rect res) {
        try {
            graphene_matrix_project_rect_bounds.invokeExact(handle(), r.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_rotate = Interop.downcallHandle(
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
    public void rotate(float angle, Vec3 axis) {
        try {
            graphene_matrix_rotate.invokeExact(handle(), angle, axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_rotate_euler = Interop.downcallHandle(
        "graphene_matrix_rotate_euler",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a rotation transformation to @m, using the given
     * {@link Euler}.
     */
    public void rotateEuler(Euler e) {
        try {
            graphene_matrix_rotate_euler.invokeExact(handle(), e.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_rotate_quaternion = Interop.downcallHandle(
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
    public void rotateQuaternion(Quaternion q) {
        try {
            graphene_matrix_rotate_quaternion.invokeExact(handle(), q.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_rotate_x = Interop.downcallHandle(
        "graphene_matrix_rotate_x",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a rotation transformation around the X axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public void rotateX(float angle) {
        try {
            graphene_matrix_rotate_x.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_rotate_y = Interop.downcallHandle(
        "graphene_matrix_rotate_y",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a rotation transformation around the Y axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public void rotateY(float angle) {
        try {
            graphene_matrix_rotate_y.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_rotate_z = Interop.downcallHandle(
        "graphene_matrix_rotate_z",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a rotation transformation around the Z axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public void rotateZ(float angle) {
        try {
            graphene_matrix_rotate_z.invokeExact(handle(), angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_scale = Interop.downcallHandle(
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
    public void scale(float factorX, float factorY, float factorZ) {
        try {
            graphene_matrix_scale.invokeExact(handle(), factorX, factorY, factorZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_skew_xy = Interop.downcallHandle(
        "graphene_matrix_skew_xy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a skew of {@code factor} on the X and Y axis to the given matrix.
     */
    public void skewXy(float factor) {
        try {
            graphene_matrix_skew_xy.invokeExact(handle(), factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_skew_xz = Interop.downcallHandle(
        "graphene_matrix_skew_xz",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a skew of {@code factor} on the X and Z axis to the given matrix.
     */
    public void skewXz(float factor) {
        try {
            graphene_matrix_skew_xz.invokeExact(handle(), factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_skew_yz = Interop.downcallHandle(
        "graphene_matrix_skew_yz",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Adds a skew of {@code factor} on the Y and Z axis to the given matrix.
     */
    public void skewYz(float factor) {
        try {
            graphene_matrix_skew_yz.invokeExact(handle(), factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_to_2d = Interop.downcallHandle(
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
    public boolean to2d(PointerDouble xx, PointerDouble yx, PointerDouble xy, PointerDouble yy, PointerDouble x0, PointerDouble y0) {
        try {
            var RESULT = (boolean) graphene_matrix_to_2d.invokeExact(handle(), xx.handle(), yx.handle(), xy.handle(), yy.handle(), x0.handle(), y0.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_to_float = Interop.downcallHandle(
        "graphene_matrix_to_float",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a {@link Matrix} to an array of floating point
     * values.
     */
    public void toFloat(PointerFloat v) {
        try {
            graphene_matrix_to_float.invokeExact(handle(), v.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_bounds = Interop.downcallHandle(
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
    public void transformBounds(Rect r, Rect res) {
        try {
            graphene_matrix_transform_bounds.invokeExact(handle(), r.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_box = Interop.downcallHandle(
        "graphene_matrix_transform_box",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the vertices of a {@link Box} using the given matrix @m.
     * <p>
     * The result is the axis aligned bounding box containing the transformed
     * vertices.
     */
    public void transformBox(Box b, Box res) {
        try {
            graphene_matrix_transform_box.invokeExact(handle(), b.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_point = Interop.downcallHandle(
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
    public void transformPoint(Point p, Point res) {
        try {
            graphene_matrix_transform_point.invokeExact(handle(), p.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_point3d = Interop.downcallHandle(
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
    public void transformPoint3d(Point3D p, Point3D res) {
        try {
            graphene_matrix_transform_point3d.invokeExact(handle(), p.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_ray = Interop.downcallHandle(
        "graphene_matrix_transform_ray",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transform a {@link Ray} using the given matrix @m.
     */
    public void transformRay(Ray r, Ray res) {
        try {
            graphene_matrix_transform_ray.invokeExact(handle(), r.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_rect = Interop.downcallHandle(
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
    public void transformRect(Rect r, Quad res) {
        try {
            graphene_matrix_transform_rect.invokeExact(handle(), r.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_sphere = Interop.downcallHandle(
        "graphene_matrix_transform_sphere",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms a {@link Sphere} using the given matrix @m. The
     * result is the bounding sphere containing the transformed sphere.
     */
    public void transformSphere(Sphere s, Sphere res) {
        try {
            graphene_matrix_transform_sphere.invokeExact(handle(), s.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_vec3 = Interop.downcallHandle(
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
    public void transformVec3(Vec3 v, Vec3 res) {
        try {
            graphene_matrix_transform_vec3.invokeExact(handle(), v.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transform_vec4 = Interop.downcallHandle(
        "graphene_matrix_transform_vec4",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transforms the given {@link Vec4} using the matrix @m.
     * <p>
     * See also: graphene_simd4x4f_vec4_mul()
     */
    public void transformVec4(Vec4 v, Vec4 res) {
        try {
            graphene_matrix_transform_vec4.invokeExact(handle(), v.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_translate = Interop.downcallHandle(
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
    public void translate(Point3D pos) {
        try {
            graphene_matrix_translate.invokeExact(handle(), pos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_transpose = Interop.downcallHandle(
        "graphene_matrix_transpose",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Transposes the given matrix.
     */
    public void transpose(Matrix res) {
        try {
            graphene_matrix_transpose.invokeExact(handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_unproject_point3d = Interop.downcallHandle(
        "graphene_matrix_unproject_point3d",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unprojects the given {@code point} using the {@code projection} matrix and
     * a {@code modelview} matrix.
     */
    public void unprojectPoint3d(Matrix modelview, Point3D point, Point3D res) {
        try {
            graphene_matrix_unproject_point3d.invokeExact(handle(), modelview.handle(), point.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_untransform_bounds = Interop.downcallHandle(
        "graphene_matrix_untransform_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the transformation on the corners of a {@link Rect} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     */
    public void untransformBounds(Rect r, Rect bounds, Rect res) {
        try {
            graphene_matrix_untransform_bounds.invokeExact(handle(), r.handle(), bounds.handle(), res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle graphene_matrix_untransform_point = Interop.downcallHandle(
        "graphene_matrix_untransform_point",
        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the transformation of a {@link Point} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     */
    public boolean untransformPoint(Point p, Rect bounds, Point res) {
        try {
            var RESULT = (boolean) graphene_matrix_untransform_point.invokeExact(handle(), p.handle(), bounds.handle(), res.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
