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
public class Matrix extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_matrix_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.graphene.Simd4X4F.getMemoryLayout().withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Matrix}
     * @return A new, uninitialized @{link Matrix}
     */
    public static Matrix allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Matrix newInstance = new Matrix(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Matrix proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Matrix(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Matrix> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Matrix(input);
    
    private static MemoryAddress constructAlloc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_alloc.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Allocates a new {@link Matrix}.
     * @return the newly allocated matrix
     */
    public static Matrix alloc() {
        var RESULT = constructAlloc();
        var OBJECT = org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Decomposes a transformation matrix into its component transformations.
     * <p>
     * The algorithm for decomposing a matrix is taken from the
     * <a href="http://dev.w3.org/csswg/css-transforms/">CSS3 Transforms specification</a>;
     * specifically, the decomposition code is based on the equivalent code
     * published in "Graphics Gems II", edited by Jim Arvo, and
     * <a href="http://tog.acm.org/resources/GraphicsGems/gemsii/unmatrix.c">available online</a>.
     * @param translate the translation vector
     * @param scale the scale vector
     * @param rotate the rotation quaternion
     * @param shear the shear vector
     * @param perspective the perspective vector
     * @return {@code true} if the matrix could be decomposed
     */
    public boolean decompose(org.gtk.graphene.Vec3 translate, org.gtk.graphene.Vec3 scale, org.gtk.graphene.Quaternion rotate, org.gtk.graphene.Vec3 shear, org.gtk.graphene.Vec4 perspective) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_decompose.invokeExact(
                    handle(),
                    translate.handle(),
                    scale.handle(),
                    rotate.handle(),
                    shear.handle(),
                    perspective.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the determinant of the given matrix.
     * @return the value of the determinant
     */
    public float determinant() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_determinant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Matrix} matrices are equal.
     * @param b a {@link Matrix}
     * @return {@code true} if the two matrices are equal, and {@code false} otherwise
     */
    public boolean equal(org.gtk.graphene.Matrix b) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_equal.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Matrix} matrices are
     * byte-by-byte equal.
     * <p>
     * While this function is faster than graphene_matrix_equal(), it
     * can also return false negatives, so it should be used in
     * conjuction with either graphene_matrix_equal() or
     * graphene_matrix_near(). For instance:
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
     * @param b a {@link Matrix}
     * @return {@code true} if the matrices are equal. and {@code false} otherwise
     */
    public boolean equalFast(org.gtk.graphene.Matrix b) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_equal_fast.invokeExact(
                    handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_matrix_alloc().
     */
    public void free() {
        try {
            DowncallHandles.graphene_matrix_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the given row vector at {@code index_} inside a matrix.
     * @param index the index of the row vector, between 0 and 3
     * @param res return location for the {@link Vec4}
     *   that is used to store the row vector
     */
    public void getRow(int index, org.gtk.graphene.Vec4 res) {
        try {
            DowncallHandles.graphene_matrix_get_row.invokeExact(
                    handle(),
                    index,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the value at the given {@code row} and {@code col} index.
     * @param row the row index
     * @param col the column index
     * @return the value at the given indices
     */
    public float getValue(int row, int col) {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_get_value.invokeExact(
                    handle(),
                    row,
                    col);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the scaling factor on the X axis in {@code m}.
     * @return the value of the scaling factor
     */
    public float getXScale() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_get_x_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the translation component on the X axis from {@code m}.
     * @return the translation component
     */
    public float getXTranslation() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_get_x_translation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the scaling factor on the Y axis in {@code m}.
     * @return the value of the scaling factor
     */
    public float getYScale() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_get_y_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the translation component on the Y axis from {@code m}.
     * @return the translation component
     */
    public float getYTranslation() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_get_y_translation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the scaling factor on the Z axis in {@code m}.
     * @return the value of the scaling factor
     */
    public float getZScale() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_get_z_scale.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the translation component on the Z axis from {@code m}.
     * @return the translation component
     */
    public float getZTranslation() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.graphene_matrix_get_z_translation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes a {@link Matrix} from the values of an affine
     * transformation matrix.
     * <p>
     * The arguments map to the following matrix layout:
     * <pre>{@code <!-- language="plain" -->
     *   ??? xx  yx ???   ???  a   b  0 ???
     *   ??? xy  yy ??? = ???  c   d  0 ???
     *   ??? x0  y0 ???   ??? tx  ty  1 ???
     * }</pre>
     * <p>
     * This function can be used to convert between an affine matrix type
     * from other libraries and a {@link Matrix}.
     * @param xx the xx member
     * @param yx the yx member
     * @param xy the xy member
     * @param yy the yy member
     * @param x0 the x0 member
     * @param y0 the y0 member
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initFrom2d(double xx, double yx, double xy, double yy, double x0, double y0) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_from_2d.invokeExact(
                    handle(),
                    xx,
                    yx,
                    xy,
                    yy,
                    x0,
                    y0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with the given array of floating
     * point values.
     * @param v an array of at least 16 floating
     *   point values
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initFromFloat(float[] v) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_from_float.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(v, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Initializes a {@link Matrix} using the values of the
     * given matrix.
     * @param src a {@link Matrix}
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initFromMatrix(org.gtk.graphene.Matrix src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_from_matrix.invokeExact(
                    handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with the given four row
     * vectors.
     * @param v0 the first row vector
     * @param v1 the second row vector
     * @param v2 the third row vector
     * @param v3 the fourth row vector
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initFromVec4(org.gtk.graphene.Vec4 v0, org.gtk.graphene.Vec4 v1, org.gtk.graphene.Vec4 v2, org.gtk.graphene.Vec4 v3) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_from_vec4.invokeExact(
                    handle(),
                    v0.handle(),
                    v1.handle(),
                    v2.handle(),
                    v3.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} compatible with {@link Frustum}.
     * <p>
     * See also: graphene_frustum_init_from_matrix()
     * @param left distance of the left clipping plane
     * @param right distance of the right clipping plane
     * @param bottom distance of the bottom clipping plane
     * @param top distance of the top clipping plane
     * @param zNear distance of the near clipping plane
     * @param zFar distance of the far clipping plane
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initFrustum(float left, float right, float bottom, float top, float zNear, float zFar) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_frustum.invokeExact(
                    handle(),
                    left,
                    right,
                    bottom,
                    top,
                    zNear,
                    zFar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with the identity matrix.
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
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
     * In theory, one could use {@code m} to transform a model of such a camera
     * into world-space. However, it is more common to use the inverse of
     * {@code m} to transform another object from world coordinates to the view
     * coordinates of the camera. Typically you would then apply the
     * camera projection transform to get from view to screen
     * coordinates.
     * @param eye the vector describing the position to look from
     * @param center the vector describing the position to look at
     * @param up the vector describing the world's upward direction; usually,
     *   this is the graphene_vec3_y_axis() vector
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initLookAt(org.gtk.graphene.Vec3 eye, org.gtk.graphene.Vec3 center, org.gtk.graphene.Vec3 up) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_look_at.invokeExact(
                    handle(),
                    eye.handle(),
                    center.handle(),
                    up.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with an orthographic projection.
     * @param left the left edge of the clipping plane
     * @param right the right edge of the clipping plane
     * @param top the top edge of the clipping plane
     * @param bottom the bottom edge of the clipping plane
     * @param zNear the distance of the near clipping plane
     * @param zFar the distance of the far clipping plane
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initOrtho(float left, float right, float top, float bottom, float zNear, float zFar) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_ortho.invokeExact(
                    handle(),
                    left,
                    right,
                    top,
                    bottom,
                    zNear,
                    zFar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with a perspective projection.
     * @param fovy the field of view angle, in degrees
     * @param aspect the aspect value
     * @param zNear the near Z plane
     * @param zFar the far Z plane
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initPerspective(float fovy, float aspect, float zNear, float zFar) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_perspective.invokeExact(
                    handle(),
                    fovy,
                    aspect,
                    zNear,
                    zFar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes {@code m} to represent a rotation of {@code angle} degrees on
     * the axis represented by the {@code axis} vector.
     * @param angle the rotation angle, in degrees
     * @param axis the axis vector as a {@link Vec3}
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initRotate(float angle, org.gtk.graphene.Vec3 axis) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_rotate.invokeExact(
                    handle(),
                    angle,
                    axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with the given scaling factors.
     * @param x the scale factor on the X axis
     * @param y the scale factor on the Y axis
     * @param z the scale factor on the Z axis
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initScale(float x, float y, float z) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_scale.invokeExact(
                    handle(),
                    x,
                    y,
                    z);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with a skew transformation
     * with the given factors.
     * @param xSkew skew factor, in radians, on the X axis
     * @param ySkew skew factor, in radians, on the Y axis
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initSkew(float xSkew, float ySkew) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_skew.invokeExact(
                    handle(),
                    xSkew,
                    ySkew);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link Matrix} with a translation to the
     * given coordinates.
     * @param p the translation coordinates
     * @return the initialized matrix
     */
    public org.gtk.graphene.Matrix initTranslate(org.gtk.graphene.Point3D p) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.graphene_matrix_init_translate.invokeExact(
                    handle(),
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Linearly interpolates the two given {@link Matrix} by
     * interpolating the decomposed transformations separately.
     * <p>
     * If either matrix cannot be reduced to their transformations
     * then the interpolation cannot be performed, and this function
     * will return an identity matrix.
     * @param b a {@link Matrix}
     * @param factor the linear interpolation factor
     * @param res return location for the
     *   interpolated matrix
     */
    public void interpolate(org.gtk.graphene.Matrix b, double factor, org.gtk.graphene.Matrix res) {
        try {
            DowncallHandles.graphene_matrix_interpolate.invokeExact(
                    handle(),
                    b.handle(),
                    factor,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inverts the given matrix.
     * @param res return location for the
     *   inverse matrix
     * @return {@code true} if the matrix is invertible
     */
    public boolean inverse(org.gtk.graphene.Matrix res) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_inverse.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the given {@link Matrix} is compatible with an
     * a 2D affine transformation matrix.
     * @return {@code true} if the matrix is compatible with an affine
     *   transformation matrix
     */
    public boolean is2d() {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_is_2d.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether a {@link Matrix} has a visible back face.
     * @return {@code true} if the back face of the matrix is visible
     */
    public boolean isBackfaceVisible() {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_is_backface_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the given {@link Matrix} is the identity matrix.
     * @return {@code true} if the matrix is the identity matrix
     */
    public boolean isIdentity() {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_is_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether a matrix is singular.
     * @return {@code true} if the matrix is singular
     */
    public boolean isSingular() {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_is_singular.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Multiplies two {@link Matrix}.
     * <p>
     * Matrix multiplication is not commutative in general; the order of the factors matters.
     * The product of this multiplication is ({@code a} ?? {@code b})
     * @param b a {@link Matrix}
     * @param res return location for the matrix
     *   result
     */
    public void multiply(org.gtk.graphene.Matrix b, org.gtk.graphene.Matrix res) {
        try {
            DowncallHandles.graphene_matrix_multiply.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares the two given {@link Matrix} matrices and checks
     * whether their values are within the given {@code epsilon} of each
     * other.
     * @param b a {@link Matrix}
     * @param epsilon the threshold between the two matrices
     * @return {@code true} if the two matrices are near each other, and
     *   {@code false} otherwise
     */
    public boolean near(org.gtk.graphene.Matrix b, float epsilon) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_near.invokeExact(
                    handle(),
                    b.handle(),
                    epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Normalizes the given {@link Matrix}.
     * @param res return location for the normalized matrix
     */
    public void normalize(org.gtk.graphene.Matrix res) {
        try {
            DowncallHandles.graphene_matrix_normalize.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Applies a perspective of {@code depth} to the matrix.
     * @param depth the depth of the perspective
     * @param res return location for the
     *   perspective matrix
     */
    public void perspective(float depth, org.gtk.graphene.Matrix res) {
        try {
            DowncallHandles.graphene_matrix_perspective.invokeExact(
                    handle(),
                    depth,
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prints the contents of a matrix to the standard error stream.
     * <p>
     * This function is only useful for debugging; there are no guarantees
     * made on the format of the output.
     */
    public void print() {
        try {
            DowncallHandles.graphene_matrix_print.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Projects a {@link Point} using the matrix {@code m}.
     * @param p a {@link Point}
     * @param res return location for the projected
     *   point
     */
    public void projectPoint(org.gtk.graphene.Point p, org.gtk.graphene.Point res) {
        try {
            DowncallHandles.graphene_matrix_project_point.invokeExact(
                    handle(),
                    p.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Projects all corners of a {@link Rect} using the given matrix.
     * <p>
     * See also: graphene_matrix_project_point()
     * @param r a {@link Rect}
     * @param res return location for the projected
     *   rectangle
     */
    public void projectRect(org.gtk.graphene.Rect r, org.gtk.graphene.Quad res) {
        try {
            DowncallHandles.graphene_matrix_project_rect.invokeExact(
                    handle(),
                    r.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Projects a {@link Rect} using the given matrix.
     * <p>
     * The resulting rectangle is the axis aligned bounding rectangle capable
     * of fully containing the projected rectangle.
     * @param r a {@link Rect}
     * @param res return location for the projected
     *   rectangle
     */
    public void projectRectBounds(org.gtk.graphene.Rect r, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_matrix_project_rect_bounds.invokeExact(
                    handle(),
                    r.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rotation transformation to {@code m}, using the given {@code angle}
     * and {@code axis} vector.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_rotate() and
     * then multiplying the matrix {@code m} with the rotation matrix.
     * @param angle the rotation angle, in degrees
     * @param axis the rotation axis, as a {@link Vec3}
     */
    public void rotate(float angle, org.gtk.graphene.Vec3 axis) {
        try {
            DowncallHandles.graphene_matrix_rotate.invokeExact(
                    handle(),
                    angle,
                    axis.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rotation transformation to {@code m}, using the given
     * {@link Euler}.
     * @param e a rotation described by a {@link Euler}
     */
    public void rotateEuler(org.gtk.graphene.Euler e) {
        try {
            DowncallHandles.graphene_matrix_rotate_euler.invokeExact(
                    handle(),
                    e.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rotation transformation to {@code m}, using the given
     * {@link Quaternion}.
     * <p>
     * This is the equivalent of calling graphene_quaternion_to_matrix() and
     * then multiplying {@code m} with the rotation matrix.
     * @param q a rotation described by a {@link Quaternion}
     */
    public void rotateQuaternion(org.gtk.graphene.Quaternion q) {
        try {
            DowncallHandles.graphene_matrix_rotate_quaternion.invokeExact(
                    handle(),
                    q.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rotation transformation around the X axis to {@code m}, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     * @param angle the rotation angle, in degrees
     */
    public void rotateX(float angle) {
        try {
            DowncallHandles.graphene_matrix_rotate_x.invokeExact(
                    handle(),
                    angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rotation transformation around the Y axis to {@code m}, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     * @param angle the rotation angle, in degrees
     */
    public void rotateY(float angle) {
        try {
            DowncallHandles.graphene_matrix_rotate_y.invokeExact(
                    handle(),
                    angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a rotation transformation around the Z axis to {@code m}, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     * @param angle the rotation angle, in degrees
     */
    public void rotateZ(float angle) {
        try {
            DowncallHandles.graphene_matrix_rotate_z.invokeExact(
                    handle(),
                    angle);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a scaling transformation to {@code m}, using the three
     * given factors.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_scale() and then
     * multiplying the matrix {@code m} with the scale matrix.
     * @param factorX scaling factor on the X axis
     * @param factorY scaling factor on the Y axis
     * @param factorZ scaling factor on the Z axis
     */
    public void scale(float factorX, float factorY, float factorZ) {
        try {
            DowncallHandles.graphene_matrix_scale.invokeExact(
                    handle(),
                    factorX,
                    factorY,
                    factorZ);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a skew of {@code factor} on the X and Y axis to the given matrix.
     * @param factor skew factor
     */
    public void skewXy(float factor) {
        try {
            DowncallHandles.graphene_matrix_skew_xy.invokeExact(
                    handle(),
                    factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a skew of {@code factor} on the X and Z axis to the given matrix.
     * @param factor skew factor
     */
    public void skewXz(float factor) {
        try {
            DowncallHandles.graphene_matrix_skew_xz.invokeExact(
                    handle(),
                    factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a skew of {@code factor} on the Y and Z axis to the given matrix.
     * @param factor skew factor
     */
    public void skewYz(float factor) {
        try {
            DowncallHandles.graphene_matrix_skew_yz.invokeExact(
                    handle(),
                    factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts a {@link Matrix} to an affine transformation
     * matrix, if the given matrix is compatible.
     * <p>
     * The returned values have the following layout:
     * <pre>{@code <!-- language="plain" -->
     *   ??? xx  yx ???   ???  a   b  0 ???
     *   ??? xy  yy ??? = ???  c   d  0 ???
     *   ??? x0  y0 ???   ??? tx  ty  1 ???
     * }</pre>
     * <p>
     * This function can be used to convert between a {@link Matrix}
     * and an affine matrix type from other libraries.
     * @param xx return location for the xx member
     * @param yx return location for the yx member
     * @param xy return location for the xy member
     * @param yy return location for the yy member
     * @param x0 return location for the x0 member
     * @param y0 return location for the y0 member
     * @return {@code true} if the matrix is compatible with an affine
     *   transformation matrix
     */
    public boolean to2d(Out<Double> xx, Out<Double> yx, Out<Double> xy, Out<Double> yy, Out<Double> x0, Out<Double> y0) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xxPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yxPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment xyPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment yyPOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment x0POINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment y0POINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            boolean RESULT;
            try {
                RESULT = (boolean) DowncallHandles.graphene_matrix_to_2d.invokeExact(
                        handle(),
                        (Addressable) xxPOINTER.address(),
                        (Addressable) yxPOINTER.address(),
                        (Addressable) xyPOINTER.address(),
                        (Addressable) yyPOINTER.address(),
                        (Addressable) x0POINTER.address(),
                        (Addressable) y0POINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    xx.set(xxPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    yx.set(yxPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    xy.set(xyPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    yy.set(yyPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    x0.set(x0POINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    y0.set(y0POINTER.get(Interop.valueLayout.C_DOUBLE, 0));
            return RESULT;
        }
    }
    
    /**
     * Converts a {@link Matrix} to an array of floating point
     * values.
     * @param v return location
     *   for an array of floating point values. The array must be capable
     *   of holding at least 16 values.
     */
    public void toFloat(Out<float[]> v) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment vPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.graphene_matrix_to_float.invokeExact(
                        handle(),
                        (Addressable) vPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            v.set(MemorySegment.ofAddress(vPOINTER.get(Interop.valueLayout.ADDRESS, 0), 16 * Interop.valueLayout.C_FLOAT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_FLOAT));
        }
    }
    
    /**
     * Transforms each corner of a {@link Rect} using the given matrix {@code m}.
     * <p>
     * The result is the axis aligned bounding rectangle containing the coplanar
     * quadrilateral.
     * <p>
     * See also: graphene_matrix_transform_point()
     * @param r a {@link Rect}
     * @param res return location for the bounds
     *   of the transformed rectangle
     */
    public void transformBounds(org.gtk.graphene.Rect r, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_matrix_transform_bounds.invokeExact(
                    handle(),
                    r.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms the vertices of a {@link Box} using the given matrix {@code m}.
     * <p>
     * The result is the axis aligned bounding box containing the transformed
     * vertices.
     * @param b a {@link Box}
     * @param res return location for the bounds
     *   of the transformed box
     */
    public void transformBox(org.gtk.graphene.Box b, org.gtk.graphene.Box res) {
        try {
            DowncallHandles.graphene_matrix_transform_box.invokeExact(
                    handle(),
                    b.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms the given {@link Point} using the matrix {@code m}.
     * <p>
     * Unlike graphene_matrix_transform_vec3(), this function will take into
     * account the fourth row vector of the {@link Matrix} when computing
     * the dot product of each row vector of the matrix.
     * <p>
     * See also: graphene_simd4x4f_point3_mul()
     * @param p a {@link Point}
     * @param res return location for the
     *   transformed {@link Point}
     */
    public void transformPoint(org.gtk.graphene.Point p, org.gtk.graphene.Point res) {
        try {
            DowncallHandles.graphene_matrix_transform_point.invokeExact(
                    handle(),
                    p.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms the given {@link Point3D} using the matrix {@code m}.
     * <p>
     * Unlike graphene_matrix_transform_vec3(), this function will take into
     * account the fourth row vector of the {@link Matrix} when computing
     * the dot product of each row vector of the matrix.
     * <p>
     * See also: graphene_simd4x4f_point3_mul()
     * @param p a {@link Point3D}
     * @param res return location for the result
     */
    public void transformPoint3d(org.gtk.graphene.Point3D p, org.gtk.graphene.Point3D res) {
        try {
            DowncallHandles.graphene_matrix_transform_point3d.invokeExact(
                    handle(),
                    p.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transform a {@link Ray} using the given matrix {@code m}.
     * @param r a {@link Ray}
     * @param res return location for the
     *   transformed ray
     */
    public void transformRay(org.gtk.graphene.Ray r, org.gtk.graphene.Ray res) {
        try {
            DowncallHandles.graphene_matrix_transform_ray.invokeExact(
                    handle(),
                    r.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms each corner of a {@link Rect} using the given matrix {@code m}.
     * <p>
     * The result is a coplanar quadrilateral.
     * <p>
     * See also: graphene_matrix_transform_point()
     * @param r a {@link Rect}
     * @param res return location for the
     *   transformed quad
     */
    public void transformRect(org.gtk.graphene.Rect r, org.gtk.graphene.Quad res) {
        try {
            DowncallHandles.graphene_matrix_transform_rect.invokeExact(
                    handle(),
                    r.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms a {@link Sphere} using the given matrix {@code m}. The
     * result is the bounding sphere containing the transformed sphere.
     * @param s a {@link Sphere}
     * @param res return location for the bounds
     *   of the transformed sphere
     */
    public void transformSphere(org.gtk.graphene.Sphere s, org.gtk.graphene.Sphere res) {
        try {
            DowncallHandles.graphene_matrix_transform_sphere.invokeExact(
                    handle(),
                    s.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms the given {@link Vec3} using the matrix {@code m}.
     * <p>
     * This function will multiply the X, Y, and Z row vectors of the matrix {@code m}
     * with the corresponding components of the vector {@code v}. The W row vector will
     * be ignored.
     * <p>
     * See also: graphene_simd4x4f_vec3_mul()
     * @param v a {@link Vec3}
     * @param res return location for a {@link Vec3}
     */
    public void transformVec3(org.gtk.graphene.Vec3 v, org.gtk.graphene.Vec3 res) {
        try {
            DowncallHandles.graphene_matrix_transform_vec3.invokeExact(
                    handle(),
                    v.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transforms the given {@link Vec4} using the matrix {@code m}.
     * <p>
     * See also: graphene_simd4x4f_vec4_mul()
     * @param v a {@link Vec4}
     * @param res return location for a {@link Vec4}
     */
    public void transformVec4(org.gtk.graphene.Vec4 v, org.gtk.graphene.Vec4 res) {
        try {
            DowncallHandles.graphene_matrix_transform_vec4.invokeExact(
                    handle(),
                    v.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a translation transformation to {@code m} using the coordinates
     * of the given {@link Point3D}.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_translate() and
     * then multiplying {@code m} with the translation matrix.
     * @param pos a {@link Point3D}
     */
    public void translate(org.gtk.graphene.Point3D pos) {
        try {
            DowncallHandles.graphene_matrix_translate.invokeExact(
                    handle(),
                    pos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Transposes the given matrix.
     * @param res return location for the
     *   transposed matrix
     */
    public void transpose(org.gtk.graphene.Matrix res) {
        try {
            DowncallHandles.graphene_matrix_transpose.invokeExact(
                    handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unprojects the given {@code point} using the {@code projection} matrix and
     * a {@code modelview} matrix.
     * @param modelview a {@link Matrix} for the modelview matrix; this is
     *   the inverse of the modelview used when projecting the point
     * @param point a {@link Point3D} with the coordinates of the point
     * @param res return location for the unprojected
     *   point
     */
    public void unprojectPoint3d(org.gtk.graphene.Matrix modelview, org.gtk.graphene.Point3D point, org.gtk.graphene.Point3D res) {
        try {
            DowncallHandles.graphene_matrix_unproject_point3d.invokeExact(
                    handle(),
                    modelview.handle(),
                    point.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the transformation on the corners of a {@link Rect} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     * @param r a {@link Rect}
     * @param bounds the bounds of the transformation
     * @param res return location for the
     *   untransformed rectangle
     */
    public void untransformBounds(org.gtk.graphene.Rect r, org.gtk.graphene.Rect bounds, org.gtk.graphene.Rect res) {
        try {
            DowncallHandles.graphene_matrix_untransform_bounds.invokeExact(
                    handle(),
                    r.handle(),
                    bounds.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the transformation of a {@link Point} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     * @param p a {@link Point}
     * @param bounds the bounds of the transformation
     * @param res return location for the
     *   untransformed point
     * @return {@code true} if the point was successfully untransformed
     */
    public boolean untransformPoint(org.gtk.graphene.Point p, org.gtk.graphene.Rect bounds, org.gtk.graphene.Point res) {
        boolean RESULT;
        try {
            RESULT = (boolean) DowncallHandles.graphene_matrix_untransform_point.invokeExact(
                    handle(),
                    p.handle(),
                    bounds.handle(),
                    res.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle graphene_matrix_alloc = Interop.downcallHandle(
                "graphene_matrix_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_decompose = Interop.downcallHandle(
                "graphene_matrix_decompose",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_determinant = Interop.downcallHandle(
                "graphene_matrix_determinant",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_equal = Interop.downcallHandle(
                "graphene_matrix_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_equal_fast = Interop.downcallHandle(
                "graphene_matrix_equal_fast",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_free = Interop.downcallHandle(
                "graphene_matrix_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_row = Interop.downcallHandle(
                "graphene_matrix_get_row",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_value = Interop.downcallHandle(
                "graphene_matrix_get_value",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_x_scale = Interop.downcallHandle(
                "graphene_matrix_get_x_scale",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_x_translation = Interop.downcallHandle(
                "graphene_matrix_get_x_translation",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_y_scale = Interop.downcallHandle(
                "graphene_matrix_get_y_scale",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_y_translation = Interop.downcallHandle(
                "graphene_matrix_get_y_translation",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_z_scale = Interop.downcallHandle(
                "graphene_matrix_get_z_scale",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_get_z_translation = Interop.downcallHandle(
                "graphene_matrix_get_z_translation",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_from_2d = Interop.downcallHandle(
                "graphene_matrix_init_from_2d",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_from_float = Interop.downcallHandle(
                "graphene_matrix_init_from_float",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_from_matrix = Interop.downcallHandle(
                "graphene_matrix_init_from_matrix",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_from_vec4 = Interop.downcallHandle(
                "graphene_matrix_init_from_vec4",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_frustum = Interop.downcallHandle(
                "graphene_matrix_init_frustum",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_identity = Interop.downcallHandle(
                "graphene_matrix_init_identity",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_look_at = Interop.downcallHandle(
                "graphene_matrix_init_look_at",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_ortho = Interop.downcallHandle(
                "graphene_matrix_init_ortho",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_perspective = Interop.downcallHandle(
                "graphene_matrix_init_perspective",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_rotate = Interop.downcallHandle(
                "graphene_matrix_init_rotate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_scale = Interop.downcallHandle(
                "graphene_matrix_init_scale",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_skew = Interop.downcallHandle(
                "graphene_matrix_init_skew",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_init_translate = Interop.downcallHandle(
                "graphene_matrix_init_translate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_interpolate = Interop.downcallHandle(
                "graphene_matrix_interpolate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_inverse = Interop.downcallHandle(
                "graphene_matrix_inverse",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_is_2d = Interop.downcallHandle(
                "graphene_matrix_is_2d",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_is_backface_visible = Interop.downcallHandle(
                "graphene_matrix_is_backface_visible",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_is_identity = Interop.downcallHandle(
                "graphene_matrix_is_identity",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_is_singular = Interop.downcallHandle(
                "graphene_matrix_is_singular",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_multiply = Interop.downcallHandle(
                "graphene_matrix_multiply",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_near = Interop.downcallHandle(
                "graphene_matrix_near",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_normalize = Interop.downcallHandle(
                "graphene_matrix_normalize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_perspective = Interop.downcallHandle(
                "graphene_matrix_perspective",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_print = Interop.downcallHandle(
                "graphene_matrix_print",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_project_point = Interop.downcallHandle(
                "graphene_matrix_project_point",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_project_rect = Interop.downcallHandle(
                "graphene_matrix_project_rect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_project_rect_bounds = Interop.downcallHandle(
                "graphene_matrix_project_rect_bounds",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_rotate = Interop.downcallHandle(
                "graphene_matrix_rotate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_rotate_euler = Interop.downcallHandle(
                "graphene_matrix_rotate_euler",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_rotate_quaternion = Interop.downcallHandle(
                "graphene_matrix_rotate_quaternion",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_rotate_x = Interop.downcallHandle(
                "graphene_matrix_rotate_x",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_rotate_y = Interop.downcallHandle(
                "graphene_matrix_rotate_y",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_rotate_z = Interop.downcallHandle(
                "graphene_matrix_rotate_z",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_scale = Interop.downcallHandle(
                "graphene_matrix_scale",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_skew_xy = Interop.downcallHandle(
                "graphene_matrix_skew_xy",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_skew_xz = Interop.downcallHandle(
                "graphene_matrix_skew_xz",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_skew_yz = Interop.downcallHandle(
                "graphene_matrix_skew_yz",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle graphene_matrix_to_2d = Interop.downcallHandle(
                "graphene_matrix_to_2d",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_to_float = Interop.downcallHandle(
                "graphene_matrix_to_float",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_bounds = Interop.downcallHandle(
                "graphene_matrix_transform_bounds",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_box = Interop.downcallHandle(
                "graphene_matrix_transform_box",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_point = Interop.downcallHandle(
                "graphene_matrix_transform_point",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_point3d = Interop.downcallHandle(
                "graphene_matrix_transform_point3d",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_ray = Interop.downcallHandle(
                "graphene_matrix_transform_ray",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_rect = Interop.downcallHandle(
                "graphene_matrix_transform_rect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_sphere = Interop.downcallHandle(
                "graphene_matrix_transform_sphere",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_vec3 = Interop.downcallHandle(
                "graphene_matrix_transform_vec3",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transform_vec4 = Interop.downcallHandle(
                "graphene_matrix_transform_vec4",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_translate = Interop.downcallHandle(
                "graphene_matrix_translate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_transpose = Interop.downcallHandle(
                "graphene_matrix_transpose",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_unproject_point3d = Interop.downcallHandle(
                "graphene_matrix_unproject_point3d",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_untransform_bounds = Interop.downcallHandle(
                "graphene_matrix_untransform_bounds",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle graphene_matrix_untransform_point = Interop.downcallHandle(
                "graphene_matrix_untransform_point",
                FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Matrix.Builder} object constructs a {@link Matrix} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Matrix.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Matrix struct;
        
        private Builder() {
            struct = Matrix.allocate();
        }
        
        /**
         * Finish building the {@link Matrix} struct.
         * @return A new instance of {@code Matrix} with the fields 
         *         that were set in the Builder object.
         */
        public Matrix build() {
            return struct;
        }
        
        public Builder setValue(org.gtk.graphene.Simd4X4F value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
                return this;
            }
        }
    }
}
