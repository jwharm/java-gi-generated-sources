package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A quaternion.
 * 
 * The contents of the #graphene_quaternion_t structure are private
 * and should never be accessed directly.
 */
public class Quaternion extends io.github.jwharm.javagi.interop.ResourceBase {

    public Quaternion(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Allocates a new #graphene_quaternion_t.
     * 
     * The contents of the returned value are undefined.
     */
    public Quaternion() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_alloc(), true));
    }
    
    /**
     * Adds two #graphene_quaternion_t @a and @b.
     */
    public void add(Quaternion b, Quaternion res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_add(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Computes the dot product of two #graphene_quaternion_t.
     */
    public float dot(Quaternion b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_dot(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether the given quaternions are equal.
     */
    public boolean equal(Quaternion b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_equal(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Releases the resources allocated by graphene_quaternion_alloc().
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_free(HANDLE());
    }
    
    /**
     * Initializes a #graphene_quaternion_t using the given four values.
     */
    public Quaternion init(float x, float y, float z, float w) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init(HANDLE(), x, y, z, w);
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t using an @angle on a
     * specific @axis.
     */
    public Quaternion initFromAngleVec3(float angle, Vec3 axis) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_from_angle_vec3(HANDLE(), angle, axis.HANDLE());
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t using the values of
     * the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * on each axis.
     * 
     * See also: graphene_quaternion_init_from_euler()
     */
    public Quaternion initFromAngles(float degX, float degY, float degZ) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_from_angles(HANDLE(), degX, degY, degZ);
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t using the given #graphene_euler_t.
     */
    public Quaternion initFromEuler(Euler e) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_from_euler(HANDLE(), e.HANDLE());
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t using the rotation components
     * of a transformation matrix.
     */
    public Quaternion initFromMatrix(Matrix m) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_from_matrix(HANDLE(), m.HANDLE());
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t with the values from @src.
     */
    public Quaternion initFromQuaternion(Quaternion src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_from_quaternion(HANDLE(), src.HANDLE());
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t using the values of
     * the [Euler angles](http://en.wikipedia.org/wiki/Euler_angles)
     * on each axis.
     * 
     * See also: graphene_quaternion_init_from_euler()
     */
    public Quaternion initFromRadians(float radX, float radY, float radZ) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_from_radians(HANDLE(), radX, radY, radZ);
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t with the values from @src.
     */
    public Quaternion initFromVec4(Vec4 src) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_from_vec4(HANDLE(), src.HANDLE());
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Initializes a #graphene_quaternion_t using the identity
     * transformation.
     */
    public Quaternion initIdentity() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_init_identity(HANDLE());
        return new Quaternion(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Inverts a #graphene_quaternion_t, and returns the conjugate
     * quaternion of @q.
     */
    public void invert(Quaternion res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_invert(HANDLE(), res.HANDLE());
    }
    
    /**
     * Multiplies two #graphene_quaternion_t @a and @b.
     */
    public void multiply(Quaternion b, Quaternion res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_multiply(HANDLE(), b.HANDLE(), res.HANDLE());
    }
    
    /**
     * Normalizes a #graphene_quaternion_t.
     */
    public void normalize(Quaternion res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_normalize(HANDLE(), res.HANDLE());
    }
    
    /**
     * Scales all the elements of a #graphene_quaternion_t @q using
     * the given scalar factor.
     */
    public void scale(float factor, Quaternion res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_scale(HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Interpolates between the two given quaternions using a spherical
     * linear interpolation, or [SLERP](http://en.wikipedia.org/wiki/Slerp),
     * using the given interpolation @factor.
     */
    public void slerp(Quaternion b, float factor, Quaternion res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_slerp(HANDLE(), b.HANDLE(), factor, res.HANDLE());
    }
    
    /**
     * Converts a quaternion into a transformation matrix expressing
     * the rotation defined by the #graphene_quaternion_t.
     */
    public void toMatrix(Matrix m) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_to_matrix(HANDLE(), m.HANDLE());
    }
    
    /**
     * Copies the components of a #graphene_quaternion_t into a
     * #graphene_vec4_t.
     */
    public void toVec4(Vec4 res) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.graphene_quaternion_to_vec4(HANDLE(), res.HANDLE());
    }
    
}
