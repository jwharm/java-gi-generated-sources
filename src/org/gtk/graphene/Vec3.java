package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A structure capable of holding a vector with three dimensions: x, y, and z.
 * 
 * The contents of the #graphene_vec3_t structure are private and should
 * never be accessed directly.
 */
public class Vec3 extends io.github.jwharm.javagi.interop.ResourceBase {

    public Vec3(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_vec3_t structure.
     * 
     * The contents of the returned structure are undefined.
     * 
     * Use graphene_vec3_init() to initialize the vector.
     */
    public static Vec3 alloc() {
        return new Vec3(References.get(gtk_h.graphene_vec3_alloc(), true));
    }
    
    /**
     * Adds each component of the two given vectors.
     */
    public void add(Vec3 b, Vec3 res) {
        gtk_h.graphene_vec3_add(handle(), b.handle(), res.handle());
    }
    
    /**
     * Computes the cross product of the two given vectors.
     */
    public void cross(Vec3 b, Vec3 res) {
        gtk_h.graphene_vec3_cross(handle(), b.handle(), res.handle());
    }
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     */
    public void divide(Vec3 b, Vec3 res) {
        gtk_h.graphene_vec3_divide(handle(), b.handle(), res.handle());
    }
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(Vec3 b) {
        var RESULT = gtk_h.graphene_vec3_dot(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_vec3_t are equal.
     */
    public boolean equal(Vec3 v2) {
        var RESULT = gtk_h.graphene_vec3_equal(handle(), v2.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by @v
     */
    public void free() {
        gtk_h.graphene_vec3_free(handle());
    }
    
    /**
     * Retrieves the first component of the given vector @v.
     */
    public float getX() {
        var RESULT = gtk_h.graphene_vec3_get_x(handle());
        return RESULT;
    }
    
    /**
     * Creates a #graphene_vec2_t that contains the first and second
     * components of the given #graphene_vec3_t.
     */
    public void getXy(Vec2 res) {
        gtk_h.graphene_vec3_get_xy(handle(), res.handle());
    }
    
    /**
     * Creates a #graphene_vec3_t that contains the first two components of
     * the given #graphene_vec3_t, and the third component set to 0.
     */
    public void getXy0(Vec3 res) {
        gtk_h.graphene_vec3_get_xy0(handle(), res.handle());
    }
    
    /**
     * Converts a #graphene_vec3_t in a #graphene_vec4_t using 0.0
     * as the value for the fourth component of the resulting vector.
     */
    public void getXyz0(Vec4 res) {
        gtk_h.graphene_vec3_get_xyz0(handle(), res.handle());
    }
    
    /**
     * Converts a #graphene_vec3_t in a #graphene_vec4_t using 1.0
     * as the value for the fourth component of the resulting vector.
     */
    public void getXyz1(Vec4 res) {
        gtk_h.graphene_vec3_get_xyz1(handle(), res.handle());
    }
    
    /**
     * Converts a #graphene_vec3_t in a #graphene_vec4_t using @w as
     * the value of the fourth component of the resulting vector.
     */
    public void getXyzw(float w, Vec4 res) {
        gtk_h.graphene_vec3_get_xyzw(handle(), w, res.handle());
    }
    
    /**
     * Retrieves the second component of the given vector @v.
     */
    public float getY() {
        var RESULT = gtk_h.graphene_vec3_get_y(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the third component of the given vector @v.
     */
    public float getZ() {
        var RESULT = gtk_h.graphene_vec3_get_z(handle());
        return RESULT;
    }
    
    /**
     * Initializes a #graphene_vec3_t using the given values.
     * 
     * This function can be called multiple times.
     */
    public Vec3 init(float x, float y, float z) {
        var RESULT = gtk_h.graphene_vec3_init(handle(), x, y, z);
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec3_t with the values from an array.
     */
    public Vec3 initFromFloat(float[] src) {
        var RESULT = gtk_h.graphene_vec3_init_from_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, src)).handle());
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec3_t with the values of another
     * #graphene_vec3_t.
     */
    public Vec3 initFromVec3(Vec3 src) {
        var RESULT = gtk_h.graphene_vec3_init_from_vec3(handle(), src.handle());
        return new Vec3(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     */
    public void interpolate(Vec3 v2, double factor, Vec3 res) {
        gtk_h.graphene_vec3_interpolate(handle(), v2.handle(), factor, res.handle());
    }
    
    /**
     * Retrieves the length of the given vector @v.
     */
    public float length() {
        var RESULT = gtk_h.graphene_vec3_length(handle());
        return RESULT;
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     */
    public void max(Vec3 b, Vec3 res) {
        gtk_h.graphene_vec3_max(handle(), b.handle(), res.handle());
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     */
    public void min(Vec3 b, Vec3 res) {
        gtk_h.graphene_vec3_min(handle(), b.handle(), res.handle());
    }
    
    /**
     * Multiplies each component of the two given vectors.
     */
    public void multiply(Vec3 b, Vec3 res) {
        gtk_h.graphene_vec3_multiply(handle(), b.handle(), res.handle());
    }
    
    /**
     * Compares the two given #graphene_vec3_t vectors and checks
     * whether their values are within the given @epsilon.
     */
    public boolean near(Vec3 v2, float epsilon) {
        var RESULT = gtk_h.graphene_vec3_near(handle(), v2.handle(), epsilon);
        return RESULT;
    }
    
    /**
     * Negates the given #graphene_vec3_t.
     */
    public void negate(Vec3 res) {
        gtk_h.graphene_vec3_negate(handle(), res.handle());
    }
    
    /**
     * Normalizes the given #graphene_vec3_t.
     */
    public void normalize(Vec3 res) {
        gtk_h.graphene_vec3_normalize(handle(), res.handle());
    }
    
    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     */
    public void scale(float factor, Vec3 res) {
        gtk_h.graphene_vec3_scale(handle(), factor, res.handle());
    }
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     */
    public void subtract(Vec3 b, Vec3 res) {
        gtk_h.graphene_vec3_subtract(handle(), b.handle(), res.handle());
    }
    
    /**
     * Copies the components of a #graphene_vec3_t into the given array.
     */
    public void toFloat(float[] dest) {
        gtk_h.graphene_vec3_to_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, dest)).handle());
    }
    
}
