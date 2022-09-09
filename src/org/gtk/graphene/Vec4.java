package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A structure capable of holding a vector with four dimensions: x, y, z, and w.
 * 
 * The contents of the #graphene_vec4_t structure are private and should
 * never be accessed directly.
 */
public class Vec4 extends io.github.jwharm.javagi.interop.ResourceBase {

    public Vec4(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_vec4_t structure.
     * 
     * The contents of the returned structure are undefined.
     * 
     * Use graphene_vec4_init() to initialize the vector.
     */
    public static Vec4 alloc() {
        return new Vec4(References.get(gtk_h.graphene_vec4_alloc(), true));
    }
    
    /**
     * Adds each component of the two given vectors.
     */
    public void add(Vec4 b, Vec4 res) {
        gtk_h.graphene_vec4_add(handle(), b.handle(), res.handle());
    }
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     */
    public void divide(Vec4 b, Vec4 res) {
        gtk_h.graphene_vec4_divide(handle(), b.handle(), res.handle());
    }
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(Vec4 b) {
        var RESULT = gtk_h.graphene_vec4_dot(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_vec4_t are equal.
     */
    public boolean equal(Vec4 v2) {
        var RESULT = gtk_h.graphene_vec4_equal(handle(), v2.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by @v
     */
    public void free() {
        gtk_h.graphene_vec4_free(handle());
    }
    
    /**
     * Retrieves the value of the fourth component of the given #graphene_vec4_t.
     */
    public float getW() {
        var RESULT = gtk_h.graphene_vec4_get_w(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the value of the first component of the given #graphene_vec4_t.
     */
    public float getX() {
        var RESULT = gtk_h.graphene_vec4_get_x(handle());
        return RESULT;
    }
    
    /**
     * Creates a #graphene_vec2_t that contains the first two components
     * of the given #graphene_vec4_t.
     */
    public void getXy(Vec2 res) {
        gtk_h.graphene_vec4_get_xy(handle(), res.handle());
    }
    
    /**
     * Creates a #graphene_vec3_t that contains the first three components
     * of the given #graphene_vec4_t.
     */
    public void getXyz(Vec3 res) {
        gtk_h.graphene_vec4_get_xyz(handle(), res.handle());
    }
    
    /**
     * Retrieves the value of the second component of the given #graphene_vec4_t.
     */
    public float getY() {
        var RESULT = gtk_h.graphene_vec4_get_y(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the value of the third component of the given #graphene_vec4_t.
     */
    public float getZ() {
        var RESULT = gtk_h.graphene_vec4_get_z(handle());
        return RESULT;
    }
    
    /**
     * Initializes a #graphene_vec4_t using the given values.
     * 
     * This function can be called multiple times.
     */
    public Vec4 init(float x, float y, float z, float w) {
        var RESULT = gtk_h.graphene_vec4_init(handle(), x, y, z, w);
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t with the values inside the given array.
     */
    public Vec4 initFromFloat(float[] src) {
        var RESULT = gtk_h.graphene_vec4_init_from_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, src)).handle());
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t using the components of a
     * #graphene_vec2_t and the values of @z and @w.
     */
    public Vec4 initFromVec2(Vec2 src, float z, float w) {
        var RESULT = gtk_h.graphene_vec4_init_from_vec2(handle(), src.handle(), z, w);
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t using the components of a
     * #graphene_vec3_t and the value of @w.
     */
    public Vec4 initFromVec3(Vec3 src, float w) {
        var RESULT = gtk_h.graphene_vec4_init_from_vec3(handle(), src.handle(), w);
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t using the components of
     * another #graphene_vec4_t.
     */
    public Vec4 initFromVec4(Vec4 src) {
        var RESULT = gtk_h.graphene_vec4_init_from_vec4(handle(), src.handle());
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     */
    public void interpolate(Vec4 v2, double factor, Vec4 res) {
        gtk_h.graphene_vec4_interpolate(handle(), v2.handle(), factor, res.handle());
    }
    
    /**
     * Computes the length of the given #graphene_vec4_t.
     */
    public float length() {
        var RESULT = gtk_h.graphene_vec4_length(handle());
        return RESULT;
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     */
    public void max(Vec4 b, Vec4 res) {
        gtk_h.graphene_vec4_max(handle(), b.handle(), res.handle());
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     */
    public void min(Vec4 b, Vec4 res) {
        gtk_h.graphene_vec4_min(handle(), b.handle(), res.handle());
    }
    
    /**
     * Multiplies each component of the two given vectors.
     */
    public void multiply(Vec4 b, Vec4 res) {
        gtk_h.graphene_vec4_multiply(handle(), b.handle(), res.handle());
    }
    
    /**
     * Compares the two given #graphene_vec4_t vectors and checks
     * whether their values are within the given @epsilon.
     */
    public boolean near(Vec4 v2, float epsilon) {
        var RESULT = gtk_h.graphene_vec4_near(handle(), v2.handle(), epsilon);
        return RESULT;
    }
    
    /**
     * Negates the given #graphene_vec4_t.
     */
    public void negate(Vec4 res) {
        gtk_h.graphene_vec4_negate(handle(), res.handle());
    }
    
    /**
     * Normalizes the given #graphene_vec4_t.
     */
    public void normalize(Vec4 res) {
        gtk_h.graphene_vec4_normalize(handle(), res.handle());
    }
    
    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     */
    public void scale(float factor, Vec4 res) {
        gtk_h.graphene_vec4_scale(handle(), factor, res.handle());
    }
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     */
    public void subtract(Vec4 b, Vec4 res) {
        gtk_h.graphene_vec4_subtract(handle(), b.handle(), res.handle());
    }
    
    /**
     * Stores the components of the given #graphene_vec4_t into an array
     * of floating point values.
     */
    public void toFloat(float[] dest) {
        gtk_h.graphene_vec4_to_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, dest)).handle());
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with all its
     * components set to 1.
     */
    public static Vec4 one() {
        var RESULT = gtk_h.graphene_vec4_one();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 0, 0, 1).
     */
    public static Vec4 wAxis() {
        var RESULT = gtk_h.graphene_vec4_w_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (1, 0, 0, 0).
     */
    public static Vec4 xAxis() {
        var RESULT = gtk_h.graphene_vec4_x_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 1, 0, 0).
     */
    public static Vec4 yAxis() {
        var RESULT = gtk_h.graphene_vec4_y_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with its
     * components set to (0, 0, 1, 0).
     */
    public static Vec4 zAxis() {
        var RESULT = gtk_h.graphene_vec4_z_axis();
        return new Vec4(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a pointer to a #graphene_vec4_t with all its
     * components set to 0.
     */
    public static Vec4 zero() {
        var RESULT = gtk_h.graphene_vec4_zero();
        return new Vec4(References.get(RESULT, false));
    }
    
}
