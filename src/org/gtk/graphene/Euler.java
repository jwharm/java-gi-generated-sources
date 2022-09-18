package org.gtk.graphene;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Describe a rotation using Euler angles.
 * 
 * The contents of the {@link org.gtk.graphene.Euler} structure are private
 * and should never be accessed directly.
 */
public class Euler extends io.github.jwharm.javagi.ResourceBase {

    public Euler(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructAlloc() {
        Reference RESULT = References.get(gtk_h.graphene_euler_alloc(), true);
        return RESULT;
    }
    
    /**
     * Allocates a new {@link org.gtk.graphene.Euler} 
     * 
     * The contents of the returned structure are undefined.
     */
    public static Euler alloc() {
        return new Euler(constructAlloc());
    }
    
    /**
     * Checks if two {@link org.gtk.graphene.Euler} are equal.
     */
    public boolean equal(Euler b) {
        var RESULT = gtk_h.graphene_euler_equal(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Frees the resources allocated by graphene_euler_alloc().
     */
    public void free() {
        gtk_h.graphene_euler_free(handle());
    }
    
    /**
     * Retrieves the first component of the Euler angle vector,
     * depending on the order of rotation.
     * 
     * See also: graphene_euler_get_x()
     */
    public float getAlpha() {
        var RESULT = gtk_h.graphene_euler_get_alpha(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the second component of the Euler angle vector,
     * depending on the order of rotation.
     * 
     * See also: graphene_euler_get_y()
     */
    public float getBeta() {
        var RESULT = gtk_h.graphene_euler_get_beta(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the third component of the Euler angle vector,
     * depending on the order of rotation.
     * 
     * See also: graphene_euler_get_z()
     */
    public float getGamma() {
        var RESULT = gtk_h.graphene_euler_get_gamma(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the order used to apply the rotations described in the
     * {@link org.gtk.graphene.Euler} structure, when converting to and from other
     * structures, like {@link org.gtk.graphene.Quaternion} and {@link org.gtk.graphene.Matrix} 
     * 
     * This function does not return the {@link org.gtk.graphene.EulerOrder<code>#DEFAULT</code>  enumeration value; it will return the effective order of rotation
     * instead.
     */
    public EulerOrder getOrder() {
        var RESULT = gtk_h.graphene_euler_get_order(handle());
        return EulerOrder.fromValue(RESULT);
    }
    
    /**
     * Retrieves the rotation angle on the X axis, in degrees.
     */
    public float getX() {
        var RESULT = gtk_h.graphene_euler_get_x(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the rotation angle on the Y axis, in degrees.
     */
    public float getY() {
        var RESULT = gtk_h.graphene_euler_get_y(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the rotation angle on the Z axis, in degrees.
     */
    public float getZ() {
        var RESULT = gtk_h.graphene_euler_get_z(handle());
        return RESULT;
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Euler} using the given angles.
     * 
     * The order of the rotations is {@link org.gtk.graphene.EulerOrder<code>#DEFAULT</code>
     */
    public Euler init(float x, float y, float z) {
        var RESULT = gtk_h.graphene_euler_init(handle(), x, y, z);
        return new Euler(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Euler} using the angles and order of
     * another {@link org.gtk.graphene.Euler} 
     * 
     * If the {@link org.gtk.graphene.Euler} @src is <code>null</code>  this function is equivalent
     * to calling graphene_euler_init() with all angles set to 0.
     */
    public Euler initFromEuler(Euler src) {
        var RESULT = gtk_h.graphene_euler_init_from_euler(handle(), src.handle());
        return new Euler(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Euler} using the given rotation matrix.
     * 
     * If the {@link org.gtk.graphene.Matrix} @m is <code>null</code>  the {@link org.gtk.graphene.Euler} will
     * be initialized with all angles set to 0.
     */
    public Euler initFromMatrix(Matrix m, EulerOrder order) {
        var RESULT = gtk_h.graphene_euler_init_from_matrix(handle(), m.handle(), order.getValue());
        return new Euler(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Euler} using the given normalized quaternion.
     * 
     * If the {@link org.gtk.graphene.Quaternion} @q is <code>null</code>  the {@link org.gtk.graphene.Euler} will
     * be initialized with all angles set to 0.
     */
    public Euler initFromQuaternion(Quaternion q, EulerOrder order) {
        var RESULT = gtk_h.graphene_euler_init_from_quaternion(handle(), q.handle(), order.getValue());
        return new Euler(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Euler} using the given angles
     * and order of rotation.
     */
    public Euler initFromRadians(float x, float y, float z, EulerOrder order) {
        var RESULT = gtk_h.graphene_euler_init_from_radians(handle(), x, y, z, order.getValue());
        return new Euler(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Euler} using the angles contained in a
     * {@link org.gtk.graphene.Vec3} 
     * 
     * If the {@link org.gtk.graphene.Vec3} @v is <code>null</code>  the {@link org.gtk.graphene.Euler} will be
     * initialized with all angles set to 0.
     */
    public Euler initFromVec3(Vec3 v, EulerOrder order) {
        var RESULT = gtk_h.graphene_euler_init_from_vec3(handle(), v.handle(), order.getValue());
        return new Euler(References.get(RESULT, false));
    }
    
    /**
     * Initializes a {@link org.gtk.graphene.Euler} with the given angles and @order.
     */
    public Euler initWithOrder(float x, float y, float z, EulerOrder order) {
        var RESULT = gtk_h.graphene_euler_init_with_order(handle(), x, y, z, order.getValue());
        return new Euler(References.get(RESULT, false));
    }
    
    /**
     * Reorders a {@link org.gtk.graphene.Euler} using @order.
     * 
     * This function is equivalent to creating a {@link org.gtk.graphene.Quaternion} from the
     * given {@link org.gtk.graphene.Euler}  and then converting the quaternion into another
     * {@link org.gtk.graphene.Euler}
     */
    public void reorder(EulerOrder order, Euler res) {
        gtk_h.graphene_euler_reorder(handle(), order.getValue(), res.handle());
    }
    
    /**
     * Converts a {@link org.gtk.graphene.Euler} into a transformation matrix expressing
     * the extrinsic composition of rotations described by the Euler angles.
     * 
     * The rotations are applied over the reference frame axes in the order
     * associated with the {@link org.gtk.graphene.Euler}  for instance, if the order
     * used to initialize @e is {@link org.gtk.graphene.EulerOrder<code>#XYZ</code>  
     * 
     *  * the first rotation moves the body around the X axis with
     *    an angle &<code>#966</code> 
     *  * the second rotation moves the body around the Y axis with
     *    an angle of &<code>#977</code> 
     *  * the third rotation moves the body around the Z axis with
     *    an angle of &<code>#968</code> 
     * 
     * The rotation sign convention is right-handed, to preserve compatibility
     * between Euler-based, quaternion-based, and angle-axis-based rotations.
     */
    public void toMatrix(Matrix res) {
        gtk_h.graphene_euler_to_matrix(handle(), res.handle());
    }
    
    /**
     * Converts a {@link org.gtk.graphene.Euler} into a {@link org.gtk.graphene.Quaternion}
     */
    public void toQuaternion(Quaternion res) {
        gtk_h.graphene_euler_to_quaternion(handle(), res.handle());
    }
    
    /**
     * Retrieves the angles of a {@link org.gtk.graphene.Euler} and initializes a
     * {@link org.gtk.graphene.Vec3} with them.
     */
    public void toVec3(Vec3 res) {
        gtk_h.graphene_euler_to_vec3(handle(), res.handle());
    }
    
}
