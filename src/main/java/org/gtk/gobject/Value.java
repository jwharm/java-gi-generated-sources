package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used to hold different types of values.
 * <p>
 * The data within the structure has protected scope: it is accessible only
 * to functions within a {@link TypeValueTable} structure, or implementations of
 * the g_value_*() API. That is, code portions which implement new fundamental
 * types.
 * <p>
 * {@link Value} users cannot make any assumptions about how data is stored
 * within the 2 element {@code data} union, and the {@code g_type} member should
 * only be accessed through the G_VALUE_TYPE() macro.
 */
public class Value extends io.github.jwharm.javagi.ResourceBase {

    public Value(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public Value() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GValue.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Copies the value of {@code src_value} into {@code dest_value}.
     */
    public void copy(Value destValue) {
        gtk_h.g_value_copy(handle(), destValue.handle());
    }
    
    /**
     * Get the contents of a {@code G_TYPE_BOXED} derived {@link Value}.  Upon getting,
     * the boxed value is duplicated and needs to be later freed with
     * g_boxed_free(), e.g. like: g_boxed_free (G_VALUE_TYPE ({@code value}),
     * return_value);
     */
    public java.lang.foreign.MemoryAddress dupBoxed() {
        var RESULT = gtk_h.g_value_dup_boxed(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_OBJECT} derived {@link Value}, increasing
     * its reference count. If the contents of the {@link Value} are {@code null}, then
     * {@code null} will be returned.
     */
    public Object dupObject() {
        var RESULT = gtk_h.g_value_dup_object(handle());
        return new Object(Refcounted.get(RESULT, true));
    }
    
    /**
     * Get the contents of a {@code G_TYPE_PARAM} {@link Value}, increasing its
     * reference count.
     */
    public ParamSpec dupParam() {
        var RESULT = gtk_h.g_value_dup_param(handle());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Get a copy the contents of a {@code G_TYPE_STRING} {@link Value}.
     */
    public java.lang.String dupString() {
        var RESULT = gtk_h.g_value_dup_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the contents of a variant {@link Value}, increasing its refcount. The returned
     * {@link org.gtk.glib.Variant} is never floating.
     */
    public org.gtk.glib.Variant dupVariant() {
        var RESULT = gtk_h.g_value_dup_variant(handle());
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
    }
    
    /**
     * Determines if {@code value} will fit inside the size of a pointer value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public boolean fitsPointer() {
        var RESULT = gtk_h.g_value_fits_pointer(handle());
        return RESULT != 0;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_BOOLEAN} {@link Value}.
     */
    public boolean getBoolean() {
        var RESULT = gtk_h.g_value_get_boolean(handle());
        return RESULT != 0;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_BOXED} derived {@link Value}.
     */
    public java.lang.foreign.MemoryAddress getBoxed() {
        var RESULT = gtk_h.g_value_get_boxed(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_DOUBLE} {@link Value}.
     */
    public double getDouble() {
        var RESULT = gtk_h.g_value_get_double(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_ENUM} {@link Value}.
     */
    public int getEnum() {
        var RESULT = gtk_h.g_value_get_enum(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_FLAGS} {@link Value}.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_value_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_FLOAT} {@link Value}.
     */
    public float getFloat() {
        var RESULT = gtk_h.g_value_get_float(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_GTYPE} {@link Value}.
     */
    public org.gtk.gobject.Type getGtype() {
        var RESULT = gtk_h.g_value_get_gtype(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Get the contents of a {@code G_TYPE_INT} {@link Value}.
     */
    public int getInt() {
        var RESULT = gtk_h.g_value_get_int(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_INT64} {@link Value}.
     */
    public long getInt64() {
        var RESULT = gtk_h.g_value_get_int64(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_LONG} {@link Value}.
     */
    public long getLong() {
        var RESULT = gtk_h.g_value_get_long(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_OBJECT} derived {@link Value}.
     */
    public Object getObject() {
        var RESULT = gtk_h.g_value_get_object(handle());
        return new Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Get the contents of a {@code G_TYPE_PARAM} {@link Value}.
     */
    public ParamSpec getParam() {
        var RESULT = gtk_h.g_value_get_param(handle());
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Get the contents of a pointer {@link Value}.
     */
    public java.lang.foreign.MemoryAddress getPointer() {
        var RESULT = gtk_h.g_value_get_pointer(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_CHAR} {@link Value}.
     */
    public byte getSchar() {
        var RESULT = gtk_h.g_value_get_schar(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_STRING} {@link Value}.
     */
    public java.lang.String getString() {
        var RESULT = gtk_h.g_value_get_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the contents of a {@code G_TYPE_UCHAR} {@link Value}.
     */
    public byte getUchar() {
        var RESULT = gtk_h.g_value_get_uchar(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_UINT} {@link Value}.
     */
    public int getUint() {
        var RESULT = gtk_h.g_value_get_uint(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_UINT64} {@link Value}.
     */
    public long getUint64() {
        var RESULT = gtk_h.g_value_get_uint64(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_ULONG} {@link Value}.
     */
    public long getUlong() {
        var RESULT = gtk_h.g_value_get_ulong(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a variant {@link Value}.
     */
    public org.gtk.glib.Variant getVariant() {
        var RESULT = gtk_h.g_value_get_variant(handle());
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes {@code value} with the default value of {@code type}.
     */
    public Value init(org.gtk.gobject.Type gType) {
        var RESULT = gtk_h.g_value_init(handle(), gType.getValue());
        return new Value(Refcounted.get(RESULT, false));
    }
    
    /**
     * Initializes and sets {@code value} from an instantiatable type via the
     * value_table's collect_value() function.
     * <p>
     * Note: The {@code value} will be initialised with the exact type of
     * {@code instance}.  If you wish to set the {@code value}'s type to a different GType
     * (such as a parent class GType), you need to manually call
     * g_value_init() and g_value_set_instance().
     */
    public void initFromInstance(TypeInstance instance) {
        gtk_h.g_value_init_from_instance(handle(), instance.handle());
    }
    
    /**
     * Returns the value contents as pointer. This function asserts that
     * g_value_fits_pointer() returned {@code true} for the passed in value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public java.lang.foreign.MemoryAddress peekPointer() {
        var RESULT = gtk_h.g_value_peek_pointer(handle());
        return RESULT;
    }
    
    /**
     * Clears the current value in {@code value} and resets it to the default value
     * (as if the value had just been initialized).
     */
    public Value reset() {
        var RESULT = gtk_h.g_value_reset(handle());
        return new Value(Refcounted.get(RESULT, true));
    }
    
    /**
     * Set the contents of a {@code G_TYPE_BOOLEAN} {@link Value} to {@code v_boolean}.
     */
    public void setBoolean(boolean vBoolean) {
        gtk_h.g_value_set_boolean(handle(), vBoolean ? 1 : 0);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}.
     */
    public void setBoxed(java.lang.foreign.MemoryAddress vBoxed) {
        gtk_h.g_value_set_boxed(handle(), vBoxed);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_DOUBLE} {@link Value} to {@code v_double}.
     */
    public void setDouble(double vDouble) {
        gtk_h.g_value_set_double(handle(), vDouble);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_ENUM} {@link Value} to {@code v_enum}.
     */
    public void setEnum(int vEnum) {
        gtk_h.g_value_set_enum(handle(), vEnum);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_FLAGS} {@link Value} to {@code v_flags}.
     */
    public void setFlags(int vFlags) {
        gtk_h.g_value_set_flags(handle(), vFlags);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_FLOAT} {@link Value} to {@code v_float}.
     */
    public void setFloat(float vFloat) {
        gtk_h.g_value_set_float(handle(), vFloat);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_GTYPE} {@link Value} to {@code v_gtype}.
     */
    public void setGtype(org.gtk.gobject.Type vGtype) {
        gtk_h.g_value_set_gtype(handle(), vGtype.getValue());
    }
    
    /**
     * Sets {@code value} from an instantiatable type via the
     * value_table's collect_value() function.
     */
    public void setInstance(java.lang.foreign.MemoryAddress instance) {
        gtk_h.g_value_set_instance(handle(), instance);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_INT} {@link Value} to {@code v_int}.
     */
    public void setInt(int vInt) {
        gtk_h.g_value_set_int(handle(), vInt);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_INT64} {@link Value} to {@code v_int64}.
     */
    public void setInt64(long vInt64) {
        gtk_h.g_value_set_int64(handle(), vInt64);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.  The string is
     * assumed to be static and interned (canonical, for example from
     * g_intern_string()), and is thus not duplicated when setting the {@link Value}.
     */
    public void setInternedString(java.lang.String vString) {
        gtk_h.g_value_set_interned_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a {@code G_TYPE_LONG} {@link Value} to {@code v_long}.
     */
    public void setLong(long vLong) {
        gtk_h.g_value_set_long(handle(), vLong);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_OBJECT} derived {@link Value} to {@code v_object}.
     * <p>
     * g_value_set_object() increases the reference count of {@code v_object}
     * (the {@link Value} holds a reference to {@code v_object}).  If you do not wish
     * to increase the reference count of the object (i.e. you wish to
     * pass your current reference to the {@link Value} because you no longer
     * need it), use g_value_take_object() instead.
     * <p>
     * It is important that your {@link Value} holds a reference to {@code v_object} (either its
     * own, or one it has taken) to ensure that the object won't be destroyed while
     * the {@link Value} still exists).
     */
    public void setObject(Object vObject) {
        gtk_h.g_value_set_object(handle(), vObject.handle());
    }
    
    /**
     * Set the contents of a {@code G_TYPE_PARAM} {@link Value} to {@code param}.
     */
    public void setParam(ParamSpec param) {
        gtk_h.g_value_set_param(handle(), param.handle());
    }
    
    /**
     * Set the contents of a pointer {@link Value} to {@code v_pointer}.
     */
    public void setPointer(java.lang.foreign.MemoryAddress vPointer) {
        gtk_h.g_value_set_pointer(handle(), vPointer);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_CHAR} {@link Value} to {@code v_char}.
     */
    public void setSchar(byte vChar) {
        gtk_h.g_value_set_schar(handle(), vChar);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}.
     * <p>
     * The boxed value is assumed to be static, and is thus not duplicated
     * when setting the {@link Value}.
     */
    public void setStaticBoxed(java.lang.foreign.MemoryAddress vBoxed) {
        gtk_h.g_value_set_static_boxed(handle(), vBoxed);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.
     * The string is assumed to be static, and is thus not duplicated
     * when setting the {@link Value}.
     * <p>
     * If the the string is a canonical string, using g_value_set_interned_string()
     * is more appropriate.
     */
    public void setStaticString(java.lang.String vString) {
        gtk_h.g_value_set_static_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to a copy of {@code v_string}.
     */
    public void setString(java.lang.String vString) {
        gtk_h.g_value_set_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a {@code G_TYPE_UCHAR} {@link Value} to {@code v_uchar}.
     */
    public void setUchar(byte vUchar) {
        gtk_h.g_value_set_uchar(handle(), vUchar);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_UINT} {@link Value} to {@code v_uint}.
     */
    public void setUint(int vUint) {
        gtk_h.g_value_set_uint(handle(), vUint);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_UINT64} {@link Value} to {@code v_uint64}.
     */
    public void setUint64(long vUint64) {
        gtk_h.g_value_set_uint64(handle(), vUint64);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_ULONG} {@link Value} to {@code v_ulong}.
     */
    public void setUlong(long vUlong) {
        gtk_h.g_value_set_ulong(handle(), vUlong);
    }
    
    /**
     * Set the contents of a variant {@link Value} to {@code variant}.
     * If the variant is floating, it is consumed.
     */
    public void setVariant(org.gtk.glib.Variant variant) {
        gtk_h.g_value_set_variant(handle(), variant.handle());
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}
     * and takes over the ownership of the caller’s reference to {@code v_boxed};
     * the caller doesn’t have to unref it any more.
     */
    public void takeBoxed(java.lang.foreign.MemoryAddress vBoxed) {
        gtk_h.g_value_take_boxed(handle(), vBoxed);
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_OBJECT} derived {@link Value} to {@code v_object}
     * and takes over the ownership of the caller’s reference to {@code v_object};
     * the caller doesn’t have to unref it any more (i.e. the reference
     * count of the object is not increased).
     * <p>
     * If you want the {@link Value} to hold its own reference to {@code v_object}, use
     * g_value_set_object() instead.
     */
    public void takeObject(java.lang.foreign.MemoryAddress vObject) {
        gtk_h.g_value_take_object(handle(), vObject);
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_PARAM} {@link Value} to {@code param} and takes
     * over the ownership of the caller’s reference to {@code param}; the caller
     * doesn’t have to unref it any more.
     */
    public void takeParam(ParamSpec param) {
        gtk_h.g_value_take_param(handle(), param.handle());
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.
     */
    public void takeString(java.lang.String vString) {
        gtk_h.g_value_take_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a variant {@link Value} to {@code variant}, and takes over
     * the ownership of the caller's reference to {@code variant};
     * the caller doesn't have to unref it any more (i.e. the reference
     * count of the variant is not increased).
     * <p>
     * If {@code variant} was floating then its floating reference is converted to
     * a hard reference.
     * <p>
     * If you want the {@link Value} to hold its own reference to {@code variant}, use
     * g_value_set_variant() instead.
     * <p>
     * This is an internal function introduced mainly for C marshallers.
     */
    public void takeVariant(org.gtk.glib.Variant variant) {
        gtk_h.g_value_take_variant(handle(), variant.refcounted().unowned().handle());
    }
    
    /**
     * Tries to cast the contents of {@code src_value} into a type appropriate
     * to store in {@code dest_value}, e.g. to transform a {@code G_TYPE_INT} value
     * into a {@code G_TYPE_FLOAT} value. Performing transformations between
     * value types might incur precision lossage. Especially
     * transformations into strings might reveal seemingly arbitrary
     * results and shouldn't be relied upon for production code (such
     * as rcfile value or object property serialization).
     */
    public boolean transform(Value destValue) {
        var RESULT = gtk_h.g_value_transform(handle(), destValue.handle());
        return RESULT != 0;
    }
    
    /**
     * Clears the current value in {@code value} (if any) and "unsets" the type,
     * this releases all resources associated with this GValue. An unset
     * value is the same as an uninitialized (zero-filled) {@link Value}
     * structure.
     */
    public void unset() {
        gtk_h.g_value_unset(handle());
    }
    
    /**
     * Returns whether a {@link Value} of type {@code src_type} can be copied into
     * a {@link Value} of type {@code dest_type}.
     */
    public static boolean typeCompatible(org.gtk.gobject.Type srcType, org.gtk.gobject.Type destType) {
        var RESULT = gtk_h.g_value_type_compatible(srcType.getValue(), destType.getValue());
        return RESULT != 0;
    }
    
    /**
     * Check whether g_value_transform() is able to transform values
     * of type {@code src_type} into values of type {@code dest_type}. Note that for
     * the types to be transformable, they must be compatible or a
     * transformation function must be registered.
     */
    public static boolean typeTransformable(org.gtk.gobject.Type srcType, org.gtk.gobject.Type destType) {
        var RESULT = gtk_h.g_value_type_transformable(srcType.getValue(), destType.getValue());
        return RESULT != 0;
    }
    
}
