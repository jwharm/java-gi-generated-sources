package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used to hold different types of values.
 * 
 * The data within the structure has protected scope: it is accessible only
 * to functions within a {@link org.gtk.gobject.TypeValueTable} structure, or implementations of
 * the g_value_*() API. That is, code portions which implement new fundamental
 * types.
 * 
 * {@link org.gtk.gobject.Value} users cannot make any assumptions about how data is stored
 * within the 2 element @data union, and the @g_type member should
 * only be accessed through the G_VALUE_TYPE() macro.
 */
public class Value extends io.github.jwharm.javagi.ResourceBase {

    public Value(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Copies the value of @src_value into @dest_value.
     */
    public void copy(Value destValue) {
        gtk_h.g_value_copy(handle(), destValue.handle());
    }
    
    /**
     * Get the contents of a <code>G_TYPE_BOXED</code> derived {@link org.gtk.gobject.Value}   Upon getting,
     * the boxed value is duplicated and needs to be later freed with
     * g_boxed_free(), e.g. like: g_boxed_free (G_VALUE_TYPE (@value),
     * return_value);
     */
    public jdk.incubator.foreign.MemoryAddress dupBoxed() {
        var RESULT = gtk_h.g_value_dup_boxed(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_OBJECT</code> derived {@link org.gtk.gobject.Value}  increasing
     * its reference count. If the contents of the {@link org.gtk.gobject.Value} are <code>null</code>  then
     * <code>null</code> will be returned.
     */
    public Object dupObject() {
        var RESULT = gtk_h.g_value_dup_object(handle());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Get the contents of a <code>G_TYPE_PARAM</code> {@link org.gtk.gobject.Value}  increasing its
     * reference count.
     */
    public ParamSpec dupParam() {
        var RESULT = gtk_h.g_value_dup_param(handle());
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Get a copy the contents of a <code>G_TYPE_STRING</code> {@link org.gtk.gobject.Value}
     */
    public java.lang.String dupString() {
        var RESULT = gtk_h.g_value_dup_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the contents of a variant {@link org.gtk.gobject.Value}  increasing its refcount. The returned
     * {@link org.gtk.glib.Variant} is never floating.
     */
    public org.gtk.glib.Variant dupVariant() {
        var RESULT = gtk_h.g_value_dup_variant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Determines if @value will fit inside the size of a pointer value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public boolean fitsPointer() {
        var RESULT = gtk_h.g_value_fits_pointer(handle());
        return (RESULT != 0);
    }
    
    /**
     * Get the contents of a <code>G_TYPE_BOOLEAN</code> {@link org.gtk.gobject.Value}
     */
    public boolean getBoolean() {
        var RESULT = gtk_h.g_value_get_boolean(handle());
        return (RESULT != 0);
    }
    
    /**
     * Get the contents of a <code>G_TYPE_BOXED</code> derived {@link org.gtk.gobject.Value}
     */
    public jdk.incubator.foreign.MemoryAddress getBoxed() {
        var RESULT = gtk_h.g_value_get_boxed(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_DOUBLE</code> {@link org.gtk.gobject.Value}
     */
    public double getDouble() {
        var RESULT = gtk_h.g_value_get_double(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_ENUM</code> {@link org.gtk.gobject.Value}
     */
    public int getEnum() {
        var RESULT = gtk_h.g_value_get_enum(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_FLAGS</code> {@link org.gtk.gobject.Value}
     */
    public int getFlags() {
        var RESULT = gtk_h.g_value_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_FLOAT</code> {@link org.gtk.gobject.Value}
     */
    public float getFloat() {
        var RESULT = gtk_h.g_value_get_float(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_GTYPE</code> {@link org.gtk.gobject.Value}
     */
    public org.gtk.gobject.Type getGtype() {
        var RESULT = gtk_h.g_value_get_gtype(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Get the contents of a <code>G_TYPE_INT</code> {@link org.gtk.gobject.Value}
     */
    public int getInt() {
        var RESULT = gtk_h.g_value_get_int(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_INT64</code> {@link org.gtk.gobject.Value}
     */
    public long getInt64() {
        var RESULT = gtk_h.g_value_get_int64(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_LONG</code> {@link org.gtk.gobject.Value}
     */
    public long getLong() {
        var RESULT = gtk_h.g_value_get_long(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_OBJECT</code> derived {@link org.gtk.gobject.Value}
     */
    public Object getObject() {
        var RESULT = gtk_h.g_value_get_object(handle());
        return new Object(References.get(RESULT, false));
    }
    
    /**
     * Get the contents of a <code>G_TYPE_PARAM</code> {@link org.gtk.gobject.Value}
     */
    public ParamSpec getParam() {
        var RESULT = gtk_h.g_value_get_param(handle());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Get the contents of a pointer {@link org.gtk.gobject.Value}
     */
    public jdk.incubator.foreign.MemoryAddress getPointer() {
        var RESULT = gtk_h.g_value_get_pointer(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_CHAR</code> {@link org.gtk.gobject.Value}
     */
    public byte getSchar() {
        var RESULT = gtk_h.g_value_get_schar(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_STRING</code> {@link org.gtk.gobject.Value}
     */
    public java.lang.String getString() {
        var RESULT = gtk_h.g_value_get_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the contents of a <code>G_TYPE_UCHAR</code> {@link org.gtk.gobject.Value}
     */
    public byte getUchar() {
        var RESULT = gtk_h.g_value_get_uchar(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_UINT</code> {@link org.gtk.gobject.Value}
     */
    public int getUint() {
        var RESULT = gtk_h.g_value_get_uint(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_UINT64</code> {@link org.gtk.gobject.Value}
     */
    public long getUint64() {
        var RESULT = gtk_h.g_value_get_uint64(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a <code>G_TYPE_ULONG</code> {@link org.gtk.gobject.Value}
     */
    public long getUlong() {
        var RESULT = gtk_h.g_value_get_ulong(handle());
        return RESULT;
    }
    
    /**
     * Get the contents of a variant {@link org.gtk.gobject.Value}
     */
    public org.gtk.glib.Variant getVariant() {
        var RESULT = gtk_h.g_value_get_variant(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Initializes @value with the default value of @type.
     */
    public Value init(Type gType) {
        var RESULT = gtk_h.g_value_init(handle(), gType.getValue());
        return new Value(References.get(RESULT, false));
    }
    
    /**
     * Initializes and sets @value from an instantiatable type via the
     * value_table&<code>#39</code> s collect_value() function.
     * 
     * Note: The @value will be initialised with the exact type of
     * @instance.  If you wish to set the @value&<code>#39</code> s type to a different GType
     * (such as a parent class GType), you need to manually call
     * g_value_init() and g_value_set_instance().
     */
    public void initFromInstance(TypeInstance instance) {
        gtk_h.g_value_init_from_instance(handle(), instance.handle());
    }
    
    /**
     * Returns the value contents as pointer. This function asserts that
     * g_value_fits_pointer() returned <code>true</code> for the passed in value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public jdk.incubator.foreign.MemoryAddress peekPointer() {
        var RESULT = gtk_h.g_value_peek_pointer(handle());
        return RESULT;
    }
    
    /**
     * Clears the current value in @value and resets it to the default value
     * (as if the value had just been initialized).
     */
    public Value reset() {
        var RESULT = gtk_h.g_value_reset(handle());
        return new Value(References.get(RESULT, true));
    }
    
    /**
     * Set the contents of a <code>G_TYPE_BOOLEAN</code> {@link org.gtk.gobject.Value} to @v_boolean.
     */
    public void setBoolean(boolean vBoolean) {
        gtk_h.g_value_set_boolean(handle(), vBoolean ? 1 : 0);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_BOXED</code> derived {@link org.gtk.gobject.Value} to @v_boxed.
     */
    public void setBoxed(jdk.incubator.foreign.MemoryAddress vBoxed) {
        gtk_h.g_value_set_boxed(handle(), vBoxed);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_DOUBLE</code> {@link org.gtk.gobject.Value} to @v_double.
     */
    public void setDouble(double vDouble) {
        gtk_h.g_value_set_double(handle(), vDouble);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_ENUM</code> {@link org.gtk.gobject.Value} to @v_enum.
     */
    public void setEnum(int vEnum) {
        gtk_h.g_value_set_enum(handle(), vEnum);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_FLAGS</code> {@link org.gtk.gobject.Value} to @v_flags.
     */
    public void setFlags(int vFlags) {
        gtk_h.g_value_set_flags(handle(), vFlags);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_FLOAT</code> {@link org.gtk.gobject.Value} to @v_float.
     */
    public void setFloat(float vFloat) {
        gtk_h.g_value_set_float(handle(), vFloat);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_GTYPE</code> {@link org.gtk.gobject.Value} to @v_gtype.
     */
    public void setGtype(Type vGtype) {
        gtk_h.g_value_set_gtype(handle(), vGtype.getValue());
    }
    
    /**
     * Sets @value from an instantiatable type via the
     * value_table&<code>#39</code> s collect_value() function.
     */
    public void setInstance(jdk.incubator.foreign.MemoryAddress instance) {
        gtk_h.g_value_set_instance(handle(), instance);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_INT</code> {@link org.gtk.gobject.Value} to @v_int.
     */
    public void setInt(int vInt) {
        gtk_h.g_value_set_int(handle(), vInt);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_INT64</code> {@link org.gtk.gobject.Value} to @v_int64.
     */
    public void setInt64(long vInt64) {
        gtk_h.g_value_set_int64(handle(), vInt64);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_STRING</code> {@link org.gtk.gobject.Value} to @v_string.  The string is
     * assumed to be static and interned (canonical, for example from
     * g_intern_string()), and is thus not duplicated when setting the {@link org.gtk.gobject.Value}
     */
    public void setInternedString(java.lang.String vString) {
        gtk_h.g_value_set_interned_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a <code>G_TYPE_LONG</code> {@link org.gtk.gobject.Value} to @v_long.
     */
    public void setLong(long vLong) {
        gtk_h.g_value_set_long(handle(), vLong);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_OBJECT</code> derived {@link org.gtk.gobject.Value} to @v_object.
     * 
     * g_value_set_object() increases the reference count of @v_object
     * (the {@link org.gtk.gobject.Value} holds a reference to @v_object).  If you do not wish
     * to increase the reference count of the object (i.e. you wish to
     * pass your current reference to the {@link org.gtk.gobject.Value} because you no longer
     * need it), use g_value_take_object() instead.
     * 
     * It is important that your {@link org.gtk.gobject.Value} holds a reference to @v_object (either its
     * own, or one it has taken) to ensure that the object won&<code>#39</code> t be destroyed while
     * the {@link org.gtk.gobject.Value} still exists).
     */
    public void setObject(Object vObject) {
        gtk_h.g_value_set_object(handle(), vObject.handle());
    }
    
    /**
     * Set the contents of a <code>G_TYPE_PARAM</code> {@link org.gtk.gobject.Value} to @param.
     */
    public void setParam(ParamSpec param) {
        gtk_h.g_value_set_param(handle(), param.handle());
    }
    
    /**
     * Set the contents of a pointer {@link org.gtk.gobject.Value} to @v_pointer.
     */
    public void setPointer(jdk.incubator.foreign.MemoryAddress vPointer) {
        gtk_h.g_value_set_pointer(handle(), vPointer);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_CHAR</code> {@link org.gtk.gobject.Value} to @v_char.
     */
    public void setSchar(byte vChar) {
        gtk_h.g_value_set_schar(handle(), vChar);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_BOXED</code> derived {@link org.gtk.gobject.Value} to @v_boxed.
     * 
     * The boxed value is assumed to be static, and is thus not duplicated
     * when setting the {@link org.gtk.gobject.Value}
     */
    public void setStaticBoxed(jdk.incubator.foreign.MemoryAddress vBoxed) {
        gtk_h.g_value_set_static_boxed(handle(), vBoxed);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_STRING</code> {@link org.gtk.gobject.Value} to @v_string.
     * The string is assumed to be static, and is thus not duplicated
     * when setting the {@link org.gtk.gobject.Value} 
     * 
     * If the the string is a canonical string, using g_value_set_interned_string()
     * is more appropriate.
     */
    public void setStaticString(java.lang.String vString) {
        gtk_h.g_value_set_static_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a <code>G_TYPE_STRING</code> {@link org.gtk.gobject.Value} to a copy of @v_string.
     */
    public void setString(java.lang.String vString) {
        gtk_h.g_value_set_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a <code>G_TYPE_UCHAR</code> {@link org.gtk.gobject.Value} to @v_uchar.
     */
    public void setUchar(byte vUchar) {
        gtk_h.g_value_set_uchar(handle(), vUchar);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_UINT</code> {@link org.gtk.gobject.Value} to @v_uint.
     */
    public void setUint(int vUint) {
        gtk_h.g_value_set_uint(handle(), vUint);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_UINT64</code> {@link org.gtk.gobject.Value} to @v_uint64.
     */
    public void setUint64(long vUint64) {
        gtk_h.g_value_set_uint64(handle(), vUint64);
    }
    
    /**
     * Set the contents of a <code>G_TYPE_ULONG</code> {@link org.gtk.gobject.Value} to @v_ulong.
     */
    public void setUlong(long vUlong) {
        gtk_h.g_value_set_ulong(handle(), vUlong);
    }
    
    /**
     * Set the contents of a variant {@link org.gtk.gobject.Value} to @variant.
     * If the variant is floating, it is consumed.
     */
    public void setVariant(org.gtk.glib.Variant variant) {
        gtk_h.g_value_set_variant(handle(), variant.handle());
    }
    
    /**
     * Sets the contents of a <code>G_TYPE_BOXED</code> derived {@link org.gtk.gobject.Value} to @v_boxed
     * and takes over the ownership of the caller&<code>#8217</code> s reference to @v_boxed;
     * the caller doesn&<code>#8217</code> t have to unref it any more.
     */
    public void takeBoxed(jdk.incubator.foreign.MemoryAddress vBoxed) {
        gtk_h.g_value_take_boxed(handle(), vBoxed);
    }
    
    /**
     * Sets the contents of a <code>G_TYPE_OBJECT</code> derived {@link org.gtk.gobject.Value} to @v_object
     * and takes over the ownership of the caller&<code>#8217</code> s reference to @v_object;
     * the caller doesn&<code>#8217</code> t have to unref it any more (i.e. the reference
     * count of the object is not increased).
     * 
     * If you want the {@link org.gtk.gobject.Value} to hold its own reference to @v_object, use
     * g_value_set_object() instead.
     */
    public void takeObject(jdk.incubator.foreign.MemoryAddress vObject) {
        gtk_h.g_value_take_object(handle(), vObject);
    }
    
    /**
     * Sets the contents of a <code>G_TYPE_PARAM</code> {@link org.gtk.gobject.Value} to @param and takes
     * over the ownership of the caller&<code>#8217</code> s reference to @param; the caller
     * doesn&<code>#8217</code> t have to unref it any more.
     */
    public void takeParam(ParamSpec param) {
        gtk_h.g_value_take_param(handle(), param.handle());
    }
    
    /**
     * Sets the contents of a <code>G_TYPE_STRING</code> {@link org.gtk.gobject.Value} to @v_string.
     */
    public void takeString(java.lang.String vString) {
        gtk_h.g_value_take_string(handle(), Interop.allocateNativeString(vString).handle());
    }
    
    /**
     * Set the contents of a variant {@link org.gtk.gobject.Value} to @variant, and takes over
     * the ownership of the caller&<code>#39</code> s reference to @variant;
     * the caller doesn&<code>#39</code> t have to unref it any more (i.e. the reference
     * count of the variant is not increased).
     * 
     * If @variant was floating then its floating reference is converted to
     * a hard reference.
     * 
     * If you want the {@link org.gtk.gobject.Value} to hold its own reference to @variant, use
     * g_value_set_variant() instead.
     * 
     * This is an internal function introduced mainly for C marshallers.
     */
    public void takeVariant(org.gtk.glib.Variant variant) {
        gtk_h.g_value_take_variant(handle(), variant.handle());
    }
    
    /**
     * Tries to cast the contents of @src_value into a type appropriate
     * to store in @dest_value, e.g. to transform a <code>G_TYPE_INT</code> value
     * into a <code>G_TYPE_FLOAT</code> value. Performing transformations between
     * value types might incur precision lossage. Especially
     * transformations into strings might reveal seemingly arbitrary
     * results and shouldn&<code>#39</code> t be relied upon for production code (such
     * as rcfile value or object property serialization).
     */
    public boolean transform(Value destValue) {
        var RESULT = gtk_h.g_value_transform(handle(), destValue.handle());
        return (RESULT != 0);
    }
    
    /**
     * Clears the current value in @value (if any) and &<code>#34</code> unsets&<code>#34</code>  the type,
     * this releases all resources associated with this GValue. An unset
     * value is the same as an uninitialized (zero-filled) {@link org.gtk.gobject.Value} structure.
     */
    public void unset() {
        gtk_h.g_value_unset(handle());
    }
    
    /**
     * Returns whether a {@link org.gtk.gobject.Value} of type @src_type can be copied into
     * a {@link org.gtk.gobject.Value} of type @dest_type.
     */
    public static boolean typeCompatible(Type srcType, Type destType) {
        var RESULT = gtk_h.g_value_type_compatible(srcType.getValue(), destType.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Check whether g_value_transform() is able to transform values
     * of type @src_type into values of type @dest_type. Note that for
     * the types to be transformable, they must be compatible or a
     * transformation function must be registered.
     */
    public static boolean typeTransformable(Type srcType, Type destType) {
        var RESULT = gtk_h.g_value_type_transformable(srcType.getValue(), destType.getValue());
        return (RESULT != 0);
    }
    
}
