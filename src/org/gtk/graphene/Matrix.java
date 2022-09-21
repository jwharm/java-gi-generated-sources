package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A structure capable of holding a 4x4 matrix.
 * <p>
 * The contents of the {@link Matrix} structure are private and
 * should never be accessed directly.
 */
public class Matrix extends io.github.jwharm.javagi.ResourceBase {

    public Matrix(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_matrix_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link Matrix}.
     */
    public static Matrix alloc() {
        return new Matrix(constructAlloc());
    }
    
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
        var RESULT = gtk_h.graphene_matrix_decompose(handle(), translate.handle(), scale.handle(), rotate.handle(), shear.handle(), perspective.handle());
        return RESULT;
    }
    
    /**
     * Computes the determinant of the given matrix.
     */
    public float determinant() {
        var RESULT = gtk_h.graphene_matrix_determinant(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link Matrix} matrices are equal.
     */
    public boolean equal(Matrix b) {
        var RESULT = gtk_h.graphene_matrix_equal(handle(), b.handle());
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
     * <p>
     * |[&lt;!-- language="C" --&gt;
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
     * ]|
     */
    public boolean equalFast(Matrix b) {
        var RESULT = gtk_h.graphene_matrix_equal_fast(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_matrix_alloc().
     */
    public void free() {
        gtk_h.graphene_matrix_free(handle());
    }
    
    /**
     * Retrieves the given row vector at {@code index_} inside a matrix.
     */
    public void getRow(int index, Vec4 res) {
        gtk_h.graphene_matrix_get_row(handle(), index, res.handle());
    }
    
    /**
     * Retrieves the value at the given {@code row} and {@code col} index.
     */
    public float getValue(int row, int col) {
        var RESULT = gtk_h.graphene_matrix_get_value(handle(), row, col);
        return RESULT;
    }
    
    /**
     * Retrieves the scaling factor on the X axis in @m.
     */
    public float getXScale() {
        var RESULT = gtk_h.graphene_matrix_get_x_scale(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the translation component on the X axis from @m.
     */
    public float getXTranslation() {
        var RESULT = gtk_h.graphene_matrix_get_x_translation(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the scaling factor on the Y axis in @m.
     */
    public float getYScale() {
        var RESULT = gtk_h.graphene_matrix_get_y_scale(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the translation component on the Y axis from @m.
     */
    public float getYTranslation() {
        var RESULT = gtk_h.graphene_matrix_get_y_translation(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the scaling factor on the Z axis in @m.
     */
    public float getZScale() {
        var RESULT = gtk_h.graphene_matrix_get_z_scale(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the translation component on the Z axis from @m.
     */
    public float getZTranslation() {
        var RESULT = gtk_h.graphene_matrix_get_z_translation(handle());
        return RESULT;
    }
    
    /**
     * Initializes a {@link Matrix} from the values of an affine
     * transformation matrix.
     * <p>
     * The arguments map to the following matrix layout:
     * <p>
     * |[&lt;!-- language="plain" --&gt;
     *   ⎛ xx  yx ⎞   ⎛  a   b  0 ⎞
     *   ⎜ xy  yy ⎟ = ⎜  c   d  0 ⎟
     *   ⎝ x0  y0 ⎠   ⎝ tx  ty  1 ⎠
     * ]|
     * <p>
     * This function can be used to convert between an affine matrix type
     * from other libraries and a {@link Matrix}.
     */
    public Matrix initFrom2d(double xx, double yx, double xy, double yy, double x0, double y0) {
        var RESULT = gtk_h.graphene_matrix_init_from_2d(handle(), xx, yx, xy, yy, x0, y0);
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with the given array of floating
     * point values.
     */
    public Matrix initFromFloat(float[] v) {
        var RESULT = gtk_h.graphene_matrix_init_from_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, v)).handle());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} using the values of the
     * given matrix.
     */
    public Matrix initFromMatrix(Matrix src) {
        var RESULT = gtk_h.graphene_matrix_init_from_matrix(handle(), src.handle());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with the given four row
     * vectors.
     */
    public Matrix initFromVec4(Vec4 v0, Vec4 v1, Vec4 v2, Vec4 v3) {
        var RESULT = gtk_h.graphene_matrix_init_from_vec4(handle(), v0.handle(), v1.handle(), v2.handle(), v3.handle());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} compatible with {@link Frustum}.
     * <p>
     * See also: graphene_frustum_init_from_matrix()
     */
    public Matrix initFrustum(float left, float right, float bottom, float top, float zNear, float zFar) {
        var RESULT = gtk_h.graphene_matrix_init_frustum(handle(), left, right, bottom, top, zNear, zFar);
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with the identity matrix.
     */
    public Matrix initIdentity() {
        var RESULT = gtk_h.graphene_matrix_init_identity(handle());
        return new Matrix(References.get(RESULT, false));
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
     * In theory, one could use @m to transform a model of such a camera
     * into world-space. However, it is more common to use the inverse of
     * @m to transform another object from world coordinates to the view
     * coordinates of the camera. Typically you would then apply the
     * camera projection transform to get from view to screen
     * coordinates.
     */
    public Matrix initLookAt(Vec3 eye, Vec3 center, Vec3 up) {
        var RESULT = gtk_h.graphene_matrix_init_look_at(handle(), eye.handle(), center.handle(), up.handle());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with an orthographic projection.
     */
    public Matrix initOrtho(float left, float right, float top, float bottom, float zNear, float zFar) {
        var RESULT = gtk_h.graphene_matrix_init_ortho(handle(), left, right, top, bottom, zNear, zFar);
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with a perspective projection.
     */
    public Matrix initPerspective(float fovy, float aspect, float zNear, float zFar) {
        var RESULT = gtk_h.graphene_matrix_init_perspective(handle(), fovy, aspect, zNear, zFar);
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes @m to represent a rotation of {@code angle} degrees on
     * the axis represented by the {@code axis} vector.
     */
    public Matrix initRotate(float angle, Vec3 axis) {
        var RESULT = gtk_h.graphene_matrix_init_rotate(handle(), angle, axis.handle());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with the given scaling factors.
     */
    public Matrix initScale(float x, float y, float z) {
        var RESULT = gtk_h.graphene_matrix_init_scale(handle(), x, y, z);
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with a skew transformation
     * with the given factors.
     */
    public Matrix initSkew(float xSkew, float ySkew) {
        var RESULT = gtk_h.graphene_matrix_init_skew(handle(), xSkew, ySkew);
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link Matrix} with a translation to the
     * given coordinates.
     */
    public Matrix initTranslate(Point3D p) {
        var RESULT = gtk_h.graphene_matrix_init_translate(handle(), p.handle());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates the two given {@link Matrix} by
     * interpolating the decomposed transformations separately.
     * <p>
     * If either matrix cannot be reduced to their transformations
     * then the interpolation cannot be performed, and this function
     * will return an identity matrix.
     */
    public void interpolate(Matrix b, double factor, Matrix res) {
        gtk_h.graphene_matrix_interpolate(handle(), b.handle(), factor, res.handle());
    }
    
    /**
     * Inverts the given matrix.
     */
    public boolean inverse(Matrix res) {
        var RESULT = gtk_h.graphene_matrix_inverse(handle(), res.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the given {@link Matrix} is compatible with an
     * a 2D affine transformation matrix.
     */
    public boolean is2d() {
        var RESULT = gtk_h.graphene_matrix_is_2d(handle());
        return RESULT;
    }
    
    /**
     * Checks whether a {@link Matrix} has a visible back face.
     */
    public boolean isBackfaceVisible() {
        var RESULT = gtk_h.graphene_matrix_is_backface_visible(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the given {@link Matrix} is the identity matrix.
     */
    public boolean isIdentity() {
        var RESULT = gtk_h.graphene_matrix_is_identity(handle());
        return RESULT;
    }
    
    /**
     * Checks whether a matrix is singular.
     */
    public boolean isSingular() {
        var RESULT = gtk_h.graphene_matrix_is_singular(handle());
        return RESULT;
    }
    
    /**
     * Multiplies two {@link Matrix}.
     * <p>
     * Matrix multiplication is not commutative in general; the order of the factors matters.
     * The product of this multiplication is (@a × @b)
     */
    public void multiply(Matrix b, Matrix res) {
        gtk_h.graphene_matrix_multiply(handle(), b.handle(), res.handle());
    }
    
    /**
     * Compares the two given {@link Matrix} matrices and checks
     * whether their values are within the given {@code epsilon} of each
     * other.
     */
    public boolean near(Matrix b, float epsilon) {
        var RESULT = gtk_h.graphene_matrix_near(handle(), b.handle(), epsilon);
        return RESULT;
    }
    
    /**
     * Normalizes the given {@link Matrix}.
     */
    public void normalize(Matrix res) {
        gtk_h.graphene_matrix_normalize(handle(), res.handle());
    }
    
    /**
     * Applies a perspective of {@code depth} to the matrix.
     */
    public void perspective(float depth, Matrix res) {
        gtk_h.graphene_matrix_perspective(handle(), depth, res.handle());
    }
    
    /**
     * Prints the contents of a matrix to the standard error stream.
     * <p>
     * This function is only useful for debugging; there are no guarantees
     * made on the format of the output.
     */
    public void print() {
        gtk_h.graphene_matrix_print(handle());
    }
    
    /**
     * Projects a {@link Point} using the matrix @m.
     */
    public void projectPoint(Point p, Point res) {
        gtk_h.graphene_matrix_project_point(handle(), p.handle(), res.handle());
    }
    
    /**
     * Projects all corners of a {@link Rect} using the given matrix.
     * <p>
     * See also: graphene_matrix_project_point()
     */
    public void projectRect(Rect r, Quad res) {
        gtk_h.graphene_matrix_project_rect(handle(), r.handle(), res.handle());
    }
    
    /**
     * Projects a {@link Rect} using the given matrix.
     * <p>
     * The resulting rectangle is the axis aligned bounding rectangle capable
     * of fully containing the projected rectangle.
     */
    public void projectRectBounds(Rect r, Rect res) {
        gtk_h.graphene_matrix_project_rect_bounds(handle(), r.handle(), res.handle());
    }
    
    /**
     * Adds a rotation transformation to @m, using the given {@code angle}
     * and {@code axis} vector.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_rotate() and
     * then multiplying the matrix @m with the rotation matrix.
     */
    public void rotate(float angle, Vec3 axis) {
        gtk_h.graphene_matrix_rotate(handle(), angle, axis.handle());
    }
    
    /**
     * Adds a rotation transformation to @m, using the given
     * {@link Euler}.
     */
    public void rotateEuler(Euler e) {
        gtk_h.graphene_matrix_rotate_euler(handle(), e.handle());
    }
    
    /**
     * Adds a rotation transformation to @m, using the given
     * {@link Quaternion}.
     * <p>
     * This is the equivalent of calling graphene_quaternion_to_matrix() and
     * then multiplying @m with the rotation matrix.
     */
    public void rotateQuaternion(Quaternion q) {
        gtk_h.graphene_matrix_rotate_quaternion(handle(), q.handle());
    }
    
    /**
     * Adds a rotation transformation around the X axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public void rotateX(float angle) {
        gtk_h.graphene_matrix_rotate_x(handle(), angle);
    }
    
    /**
     * Adds a rotation transformation around the Y axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public void rotateY(float angle) {
        gtk_h.graphene_matrix_rotate_y(handle(), angle);
    }
    
    /**
     * Adds a rotation transformation around the Z axis to @m, using
     * the given {@code angle}.
     * <p>
     * See also: graphene_matrix_rotate()
     */
    public void rotateZ(float angle) {
        gtk_h.graphene_matrix_rotate_z(handle(), angle);
    }
    
    /**
     * Adds a scaling transformation to @m, using the three
     * given factors.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_scale() and then
     * multiplying the matrix @m with the scale matrix.
     */
    public void scale(float factorX, float factorY, float factorZ) {
        gtk_h.graphene_matrix_scale(handle(), factorX, factorY, factorZ);
    }
    
    /**
     * Adds a skew of {@code factor} on the X and Y axis to the given matrix.
     */
    public void skewXy(float factor) {
        gtk_h.graphene_matrix_skew_xy(handle(), factor);
    }
    
    /**
     * Adds a skew of {@code factor} on the X and Z axis to the given matrix.
     */
    public void skewXz(float factor) {
        gtk_h.graphene_matrix_skew_xz(handle(), factor);
    }
    
    /**
     * Adds a skew of {@code factor} on the Y and Z axis to the given matrix.
     */
    public void skewYz(float factor) {
        gtk_h.graphene_matrix_skew_yz(handle(), factor);
    }
    
    /**
     * Converts a {@link Matrix} to an array of floating point
     * values.
     */
    public void toFloat(float[] v) {
        gtk_h.graphene_matrix_to_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, v)).handle());
    }
    
    /**
     * Transforms each corner of a {@link Rect} using the given matrix @m.
     * <p>
     * The result is the axis aligned bounding rectangle containing the coplanar
     * quadrilateral.
     * <p>
     * See also: graphene_matrix_transform_point()
     */
    public void transformBounds(Rect r, Rect res) {
        gtk_h.graphene_matrix_transform_bounds(handle(), r.handle(), res.handle());
    }
    
    /**
     * Transforms the vertices of a {@link Box} using the given matrix @m.
     * <p>
     * The result is the axis aligned bounding box containing the transformed
     * vertices.
     */
    public void transformBox(Box b, Box res) {
        gtk_h.graphene_matrix_transform_box(handle(), b.handle(), res.handle());
    }
    
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
        gtk_h.graphene_matrix_transform_point(handle(), p.handle(), res.handle());
    }
    
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
        gtk_h.graphene_matrix_transform_point3d(handle(), p.handle(), res.handle());
    }
    
    /**
     * Transform a {@link Ray} using the given matrix @m.
     */
    public void transformRay(Ray r, Ray res) {
        gtk_h.graphene_matrix_transform_ray(handle(), r.handle(), res.handle());
    }
    
    /**
     * Transforms each corner of a {@link Rect} using the given matrix @m.
     * <p>
     * The result is a coplanar quadrilateral.
     * <p>
     * See also: graphene_matrix_transform_point()
     */
    public void transformRect(Rect r, Quad res) {
        gtk_h.graphene_matrix_transform_rect(handle(), r.handle(), res.handle());
    }
    
    /**
     * Transforms a {@link Sphere} using the given matrix @m. The
     * result is the bounding sphere containing the transformed sphere.
     */
    public void transformSphere(Sphere s, Sphere res) {
        gtk_h.graphene_matrix_transform_sphere(handle(), s.handle(), res.handle());
    }
    
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
        gtk_h.graphene_matrix_transform_vec3(handle(), v.handle(), res.handle());
    }
    
    /**
     * Transforms the given {@link Vec4} using the matrix @m.
     * <p>
     * See also: graphene_simd4x4f_vec4_mul()
     */
    public void transformVec4(Vec4 v, Vec4 res) {
        gtk_h.graphene_matrix_transform_vec4(handle(), v.handle(), res.handle());
    }
    
    /**
     * Adds a translation transformation to @m using the coordinates
     * of the given {@link Point3D}.
     * <p>
     * This is the equivalent of calling graphene_matrix_init_translate() and
     * then multiplying @m with the translation matrix.
     */
    public void translate(Point3D pos) {
        gtk_h.graphene_matrix_translate(handle(), pos.handle());
    }
    
    /**
     * Transposes the given matrix.
     */
    public void transpose(Matrix res) {
        gtk_h.graphene_matrix_transpose(handle(), res.handle());
    }
    
    /**
     * Unprojects the given {@code point} using the {@code projection} matrix and
     * a {@code modelview} matrix.
     */
    public void unprojectPoint3d(Matrix modelview, Point3D point, Point3D res) {
        gtk_h.graphene_matrix_unproject_point3d(handle(), modelview.handle(), point.handle(), res.handle());
    }
    
    /**
     * Undoes the transformation on the corners of a {@link Rect} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     */
    public void untransformBounds(Rect r, Rect bounds, Rect res) {
        gtk_h.graphene_matrix_untransform_bounds(handle(), r.handle(), bounds.handle(), res.handle());
    }
    
    /**
     * Undoes the transformation of a {@link Point} using the
     * given matrix, within the given axis aligned rectangular {@code bounds}.
     */
    public boolean untransformPoint(Point p, Rect bounds, Point res) {
        var RESULT = gtk_h.graphene_matrix_untransform_point(handle(), p.handle(), bounds.handle(), res.handle());
        return RESULT;
    }
    
}
