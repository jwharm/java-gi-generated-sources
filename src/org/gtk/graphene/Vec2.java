package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A structure capable of holding a vector with two dimensions, x and y.
 * 
 * The contents of the {@link org.gtk.graphene.Vec2} structure are private and should
 * never be accessed directly.
 */
public class Vec2 extends io.github.jwharm.javagi.ResourceBase {

    public Vec2(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_vec2_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link org.gtk.graphene.Vec2} structure.
     * 
     * The contents of the returned structure are undefined.
     * 
     * Use graphene_vec2_init() to initialize the vector.
     */
    public static Vec2 alloc() {
        return new Vec2(constructAlloc());
    }
    
    /**
     * Adds each component of the two passed vectors and places
     * each result into the components of @res.
     */
    public void add(Vec2 b, Vec2 res) {
        gtk_h.graphene_vec2_add(handle(), b.handle(), res.handle());
    }
    
    /**
     * Divides each component of the first operand @a by the corresponding
     * component of the second operand @b, and places the results into the
     * vector @res.
     */
    public void divide(Vec2 b, Vec2 res) {
        gtk_h.graphene_vec2_divide(handle(), b.handle(), res.handle());
    }
    
    /**
     * Computes the dot product of the two given vectors.
     */
    public float dot(Vec2 b) {
        var RESULT = gtk_h.graphene_vec2_dot(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the two given {@link org.gtk.graphene.Vec2} are equal.
     */
    public boolean equal(Vec2 v2) {
        var RESULT = gtk_h.graphene_vec2_equal(handle(), v2.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by @v
     */
    public void free() {
        gtk_h.graphene_vec2_free(handle());
    }
    
    /**
     * Retrieves the X component of the {@link org.gtk.graphene.Vec2}
     */
    public float getX() {
        var RESULT = gtk_h.graphene_vec2_get_x(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the Y component of the {@link org.gtk.graphene.Vec2}
     */
    public float getY() {
        var RESULT = gtk_h.graphene_vec2_get_y(handle());
        return RESULT;
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Vec2} using the given values.
     * 
     * This function can be called multiple times.
     */
    public Vec2 init(float x, float y) {
        var RESULT = gtk_h.graphene_vec2_init(handle(), x, y);
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Initializes @v with the contents of the given array.
     */
    public Vec2 initFromFloat(float[] src) {
        var RESULT = gtk_h.graphene_vec2_init_from_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, src)).handle());
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Copies the contents of @src into @v.
     */
    public Vec2 initFromVec2(Vec2 src) {
        var RESULT = gtk_h.graphene_vec2_init_from_vec2(handle(), src.handle());
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Linearly interpolates @v1 and @v2 using the given @factor.
     */
    public void interpolate(Vec2 v2, double factor, Vec2 res) {
        gtk_h.graphene_vec2_interpolate(handle(), v2.handle(), factor, res.handle());
    }
    
    /**
     * Computes the length of the given vector.
     */
    public float length() {
        var RESULT = gtk_h.graphene_vec2_length(handle());
        return RESULT;
    }
    
    /**
     * Compares the two given vectors and places the maximum
     * values of each component into @res.
     */
    public void max(Vec2 b, Vec2 res) {
        gtk_h.graphene_vec2_max(handle(), b.handle(), res.handle());
    }
    
    /**
     * Compares the two given vectors and places the minimum
     * values of each component into @res.
     */
    public void min(Vec2 b, Vec2 res) {
        gtk_h.graphene_vec2_min(handle(), b.handle(), res.handle());
    }
    
    /**
     * Multiplies each component of the two passed vectors and places
     * each result into the components of @res.
     */
    public void multiply(Vec2 b, Vec2 res) {
        gtk_h.graphene_vec2_multiply(handle(), b.handle(), res.handle());
    }
    
    /**
     * Compares the two given {@link org.gtk.graphene.Vec2} vectors and checks
     * whether their values are within the given @epsilon.
     */
    public boolean near(Vec2 v2, float epsilon) {
        var RESULT = gtk_h.graphene_vec2_near(handle(), v2.handle(), epsilon);
        return RESULT;
    }
    
    /**
     * Negates the given {@link org.gtk.graphene.Vec2}
     */
    public void negate(Vec2 res) {
        gtk_h.graphene_vec2_negate(handle(), res.handle());
    }
    
    /**
     * Computes the normalized vector for the given vector @v.
     */
    public void normalize(Vec2 res) {
        gtk_h.graphene_vec2_normalize(handle(), res.handle());
    }
    
    /**
     * Multiplies all components of the given vector with the given scalar @factor.
     */
    public void scale(float factor, Vec2 res) {
        gtk_h.graphene_vec2_scale(handle(), factor, res.handle());
    }
    
    /**
     * Subtracts from each component of the first operand @a the
     * corresponding component of the second operand @b and places
     * each result into the components of @res.
     */
    public void subtract(Vec2 b, Vec2 res) {
        gtk_h.graphene_vec2_subtract(handle(), b.handle(), res.handle());
    }
    
    /**
     * Stores the components of @v into an array.
     */
    public void toFloat(float[] dest) {
        gtk_h.graphene_vec2_to_float(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, dest)).handle());
    }
    
    /**
     * Retrieves a constant vector with (1, 1) components.
     */
    public static Vec2 one() {
        var RESULT = gtk_h.graphene_vec2_one();
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant vector with (1, 0) components.
     */
    public static Vec2 xAxis() {
        var RESULT = gtk_h.graphene_vec2_x_axis();
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant vector with (0, 1) components.
     */
    public static Vec2 yAxis() {
        var RESULT = gtk_h.graphene_vec2_y_axis();
        return new Vec2(References.get(RESULT, false));
    }
    
    /**
     * Retrieves a constant vector with (0, 0) components.
     */
    public static Vec2 zero() {
        var RESULT = gtk_h.graphene_vec2_zero();
        return new Vec2(References.get(RESULT, false));
    }
    
}
