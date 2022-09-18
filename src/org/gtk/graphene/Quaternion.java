package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A quaternion.
 * 
 * The contents of the {@link org.gtk.graphene.Quaternion} structure are private
 * and should never be accessed directly.
 */
public class Quaternion extends io.github.jwharm.javagi.ResourceBase {

    public Quaternion(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_quaternion_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link org.gtk.graphene.Quaternion} 
     * 
     * The contents of the returned value are undefined.
     */
    public static Quaternion alloc() {
        return new Quaternion(constructAlloc());
    }
    
    /**
     * Adds two {@link org.gtk.graphene.Quaternion} @a and @b.
     */
    public void add(Quaternion b, Quaternion res) {
        gtk_h.graphene_quaternion_add(handle(), b.handle(), res.handle());
    }
    
    /**
     * Computes the dot product of two {@link org.gtk.graphene.Quaternion}
     */
    public float dot(Quaternion b) {
        var RESULT = gtk_h.graphene_quaternion_dot(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Checks whether the given quaternions are equal.
     */
    public boolean equal(Quaternion b) {
        var RESULT = gtk_h.graphene_quaternion_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
     */
    public void free() {
        gtk_h.graphene_quaternion_free(handle());
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} using the given four values.
     */
    public Quaternion init(float x, float y, float z, float w) {
        var RESULT = gtk_h.graphene_quaternion_init(handle(), x, y, z, w);
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} using an @angle on a
     * specific @axis.
     */
    public Quaternion initFromAngleVec3(float angle, Vec3 axis) {
        var RESULT = gtk_h.graphene_quaternion_init_from_angle_vec3(handle(), angle, axis.handle());
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} using the values of
     * the {@link [Euler angles]}(http://en.wikipedia.org/wiki/Euler_angles)
     * on each axis.
     * 
     * See also: graphene_quaternion_init_from_euler()
     */
    public Quaternion initFromAngles(float degX, float degY, float degZ) {
        var RESULT = gtk_h.graphene_quaternion_init_from_angles(handle(), degX, degY, degZ);
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} using the given {@link org.gtk.graphene.Euler}
     */
    public Quaternion initFromEuler(Euler e) {
        var RESULT = gtk_h.graphene_quaternion_init_from_euler(handle(), e.handle());
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} using the rotation components
     * of a transformation matrix.
     */
    public Quaternion initFromMatrix(Matrix m) {
        var RESULT = gtk_h.graphene_quaternion_init_from_matrix(handle(), m.handle());
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} with the values from @src.
     */
    public Quaternion initFromQuaternion(Quaternion src) {
        var RESULT = gtk_h.graphene_quaternion_init_from_quaternion(handle(), src.handle());
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} using the values of
     * the {@link [Euler angles]}(http://en.wikipedia.org/wiki/Euler_angles)
     * on each axis.
     * 
     * See also: graphene_quaternion_init_from_euler()
     */
    public Quaternion initFromRadians(float radX, float radY, float radZ) {
        var RESULT = gtk_h.graphene_quaternion_init_from_radians(handle(), radX, radY, radZ);
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} with the values from @src.
     */
    public Quaternion initFromVec4(Vec4 src) {
        var RESULT = gtk_h.graphene_quaternion_init_from_vec4(handle(), src.handle());
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Quaternion} using the identity
     * transformation.
     */
    public Quaternion initIdentity() {
        var RESULT = gtk_h.graphene_quaternion_init_identity(handle());
        return new Quaternion(References.get(RESULT, false));
    }
    
    /**
     * Inverts a {@link org.gtk.graphene.Quaternion}  and returns the conjugate
     * quaternion of @q.
     */
    public void invert(Quaternion res) {
        gtk_h.graphene_quaternion_invert(handle(), res.handle());
    }
    
    /**
     * Multiplies two {@link org.gtk.graphene.Quaternion} @a and @b.
     */
    public void multiply(Quaternion b, Quaternion res) {
        gtk_h.graphene_quaternion_multiply(handle(), b.handle(), res.handle());
    }
    
    /**
     * Normalizes a {@link org.gtk.graphene.Quaternion}
     */
    public void normalize(Quaternion res) {
        gtk_h.graphene_quaternion_normalize(handle(), res.handle());
    }
    
    /**
     * Scales all the elements of a {@link org.gtk.graphene.Quaternion} @q using
     * the given scalar factor.
     */
    public void scale(float factor, Quaternion res) {
        gtk_h.graphene_quaternion_scale(handle(), factor, res.handle());
    }
    
    /**
     * Interpolates between the two given quaternions using a spherical
     * linear interpolation, or {@link [SLERP]}(http://en.wikipedia.org/wiki/Slerp),
     * using the given interpolation @factor.
     */
    public void slerp(Quaternion b, float factor, Quaternion res) {
        gtk_h.graphene_quaternion_slerp(handle(), b.handle(), factor, res.handle());
    }
    
    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the {@link org.gtk.graphene.Quaternion}
     */
    public void toMatrix(Matrix m) {
        gtk_h.graphene_quaternion_to_matrix(handle(), m.handle());
    }
    
    /**
     * Copies the components of a {@link org.gtk.graphene.Quaternion} into a
     * {@link org.gtk.graphene.Vec4}
     */
    public void toVec4(Vec4 res) {
        gtk_h.graphene_quaternion_to_vec4(handle(), res.handle());
    }
    
}
