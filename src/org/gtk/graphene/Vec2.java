package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A structure capable of holding a vector with two dimensions, x and y.
 * 
 * The contents of the #graphene_vec2_t structure are private and should
 * never be accessed directly.
 */
public class Vec2 extends io.github.jwharm.javagi.interop.ResourceBase {

    public Vec2(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates a new #graphene_vec2_t structure.
     * 
     * The contents of the returned structure are undefined.
     * 
     * Use graphene_vec2_init() to initialize the vector.
     */
    public Vec2() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_alloc(), true));
    }
    
    /**
     * Adds each component of the two passed vectors and places
     * each result into the components of @res.
     */
    public void add(Vec2 b, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_add(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     */
    public void divide(Vec2 b, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_divide(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(Vec2 b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_dot(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the two given #graphene_vec2_t are equal.
     */
    public boolean equal(Vec2 v2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_equal(HANDLE(), v2.HANDLE());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by @v
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_free(HANDLE());
    }
    
    /**
     * Retrieves the X component of the #graphene_vec2_t.
     */
    public float getX() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_get_x(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the Y component of the #graphene_vec2_t.
     */
    public float getY() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_get_y(HANDLE());
        return RESULT;
    }
    
    /**
     * Initializes a #graphene_vec2_t using the given values.
     * 
     * This function can be called multiple times.
     */
    public Vec2 init(float x, float y) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_init(HANDLE(), x, y);
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Initializes @v with the contents of the given array.
     */
    public Vec2 initFromFloat(float[] src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_init_from_float(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, src));
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Copies the contents of @src into @v.
     */
    public Vec2 initFromVec2(Vec2 src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_init_from_vec2(HANDLE(), src.HANDLE());
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     */
    public void interpolate(Vec2 v2, double factor, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_interpolate(HANDLE(), v2.HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Computes the length of the given vector.
     */
    public float length() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Compares the two given vectors and places the maximum
     * values of each component into @res.
     */
    public void max(Vec2 b, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_max(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Compares the two given vectors and places the minimum
     * values of each component into @res.
     */
    public void min(Vec2 b, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_min(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Multiplies each component of the two passed vectors and places
     * each result into the components of @res.
     */
    public void multiply(Vec2 b, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_multiply(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Compares the two given #graphene_vec2_t vectors and checks
     * whether their values are within the given @epsilon.
     */
    public boolean near(Vec2 v2, float epsilon) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_near(HANDLE(), v2.HANDLE(), epsilon);
        return RESULT;
    }
    
    /**
     * Negates the given #graphene_vec2_t.
     */
    public void negate(Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_negate(HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the normalized vector for the given vector @v.
     */
    public void normalize(Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_normalize(HANDLE(), res.HANDLE());
    }
    
    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     */
    public void scale(float factor, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_scale(HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     */
    public void subtract(Vec2 b, Vec2 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_subtract(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Stores the components of @v into an array.
     */
    public void toFloat(float[] dest) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_vec2_to_float(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, dest));
    }
    
}
