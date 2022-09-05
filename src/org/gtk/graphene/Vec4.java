package org.gtk.graphene;

import org.gtk.gobject.*;
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

    public Vec4(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new #graphene_vec4_t structure.
     * 
     * The contents of the returned structure are undefined.
     * 
     * Use graphene_vec4_init() to initialize the vector.
     */
    public Vec4() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_alloc(), true));
    }
    
    /**
     * Adds each component of the two given vectors.
     */
    public void add(Vec4 b, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_add(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     */
    public void divide(Vec4 b, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_divide(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(Vec4 b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_dot(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_vec4_t are equal.
     */
    public boolean equal(Vec4 v2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_equal(HANDLE(), v2.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by @v
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_free(HANDLE());
    }
    
    /**
     * Retrieves the value of the fourth component of the given #graphene_vec4_t.
     */
    public float getW() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_get_w(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the value of the first component of the given #graphene_vec4_t.
     */
    public float getX() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_get_x(HANDLE());
        return RESULT;
    }
    
    /**
     * Creates a #graphene_vec2_t that contains the first two components
     * of the given #graphene_vec4_t.
     */
    public void getXy(Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_get_xy(HANDLE(), res.HANDLE());
    }
    
    /**
     * Creates a #graphene_vec3_t that contains the first three components
     * of the given #graphene_vec4_t.
     */
    public void getXyz(Vec3 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_get_xyz(HANDLE(), res.HANDLE());
    }
    
    /**
     * Retrieves the value of the second component of the given #graphene_vec4_t.
     */
    public float getY() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_get_y(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the value of the third component of the given #graphene_vec4_t.
     */
    public float getZ() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_get_z(HANDLE());
        return RESULT;
    }
    
    /**
     * Initializes a #graphene_vec4_t using the given values.
     * 
     * This function can be called multiple times.
     */
    public Vec4 init(float x, float y, float z, float w) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_init(HANDLE(), x, y, z, w);
        return new Vec4(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t with the values inside the given array.
     */
    public Vec4 initFromFloat(float[] src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_init_from_float(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, src));
        return new Vec4(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t using the components of a
     * #graphene_vec2_t and the values of @z and @w.
     */
    public Vec4 initFromVec2(Vec2 src, float z, float w) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_init_from_vec2(HANDLE(), src.HANDLE(), z, w);
        return new Vec4(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t using the components of a
     * #graphene_vec3_t and the value of @w.
     */
    public Vec4 initFromVec3(Vec3 src, float w) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_init_from_vec3(HANDLE(), src.HANDLE(), w);
        return new Vec4(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_vec4_t using the components of
     * another #graphene_vec4_t.
     */
    public Vec4 initFromVec4(Vec4 src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_init_from_vec4(HANDLE(), src.HANDLE());
        return new Vec4(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     */
    public void interpolate(Vec4 v2, double factor, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_interpolate(HANDLE(), v2.HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Computes the length of the given #graphene_vec4_t.
     */
    public float length() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the maximum values.
     */
    public void max(Vec4 b, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_max(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Compares each component of the two given vectors and creates a
     * vector that contains the minimum values.
     */
    public void min(Vec4 b, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_min(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Multiplies each component of the two given vectors.
     */
    public void multiply(Vec4 b, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_multiply(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Compares the two given #graphene_vec4_t vectors and checks
     * whether their values are within the given @epsilon.
     */
    public boolean near(Vec4 v2, float epsilon) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_near(HANDLE(), v2.HANDLE(), epsilon);
        return RESULT;
    }
    
    /**
     * Negates the given #graphene_vec4_t.
     */
    public void negate(Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_negate(HANDLE(), res.HANDLE());
    }
    
    /**
     * Normalizes the given #graphene_vec4_t.
     */
    public void normalize(Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_normalize(HANDLE(), res.HANDLE());
    }
    
    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     */
    public void scale(float factor, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_scale(HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     */
    public void subtract(Vec4 b, Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_subtract(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Stores the components of the given #graphene_vec4_t into an array
     * of floating point values.
     */
    public void toFloat(float[] dest) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec4_to_float(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, dest));
    }
    
}
