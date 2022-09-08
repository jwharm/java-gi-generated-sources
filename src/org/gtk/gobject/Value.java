package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure used to hold different types of values.
 * 
 * The data within the structure has protected scope: it is accessible only
 * to functions within a #GTypeValueTable structure, or implementations of
 * the g_value_*() API. That is, code portions which implement new fundamental
 * types.
 * 
 * #GValue users cannot make any assumptions about how data is stored
 * within the 2 element @data union, and the @g_type member should
 * only be accessed through the G_VALUE_TYPE() macro.
 */
public class Value extends io.github.jwharm.javagi.interop.ResourceBase {

    public Value(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Copies the value of @src_value into @dest_value.
     */
    public void copy(Value destValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_copy(HANDLE(), destValue.HANDLE());
    }
    
    /**
     * Get the contents of a %G_TYPE_BOXED derived #GValue.  Upon getting,
     * the boxed value is duplicated and needs to be later freed with
     * g_boxed_free(), e.g. like: g_boxed_free (G_VALUE_TYPE (@value),
     * return_value);
     */
    public jdk.incubator.foreign.MemoryAddress dupBoxed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_dup_boxed(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_OBJECT derived #GValue, increasing
     * its reference count. If the contents of the #GValue are %NULL, then
     * %NULL will be returned.
     */
    public Object dupObject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_dup_object(HANDLE());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Get the contents of a %G_TYPE_PARAM #GValue, increasing its
     * reference count.
     */
    public ParamSpec dupParam() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_dup_param(HANDLE());
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Get a copy the contents of a %G_TYPE_STRING #GValue.
     */
    public java.lang.String dupString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_dup_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the contents of a variant #GValue, increasing its refcount. The returned
     * #GVariant is never floating.
     */
    public org.gtk.glib.Variant dupVariant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_dup_variant(HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Determines if @value will fit inside the size of a pointer value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public boolean fitsPointer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_fits_pointer(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Get the contents of a %G_TYPE_BOOLEAN #GValue.
     */
    public boolean getBoolean() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_boolean(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Get the contents of a %G_TYPE_BOXED derived #GValue.
     */
    public jdk.incubator.foreign.MemoryAddress getBoxed() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_boxed(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_DOUBLE #GValue.
     */
    public double getDouble() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_double(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_ENUM #GValue.
     */
    public int getEnum() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_enum(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_FLAGS #GValue.
     */
    public int getFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_FLOAT #GValue.
     */
    public float getFloat() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_float(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_GTYPE #GValue.
     */
    public org.gtk.gobject.Type getGtype() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_gtype(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Get the contents of a %G_TYPE_INT #GValue.
     */
    public int getInt() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_int(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_INT64 #GValue.
     */
    public long getInt64() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_int64(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_LONG #GValue.
     */
    public long getLong() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_long(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_OBJECT derived #GValue.
     */
    public Object getObject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_object(HANDLE());
        return new Object(References.get(RESULT, false));
    }
    
    /**
     * Get the contents of a %G_TYPE_PARAM #GValue.
     */
    public ParamSpec getParam() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_param(HANDLE());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Get the contents of a pointer #GValue.
     */
    public jdk.incubator.foreign.MemoryAddress getPointer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_pointer(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_CHAR #GValue.
     */
    public byte getSchar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_schar(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_STRING #GValue.
     */
    public java.lang.String getString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Get the contents of a %G_TYPE_UCHAR #GValue.
     */
    public byte getUchar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_uchar(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_UINT #GValue.
     */
    public int getUint() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_uint(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_UINT64 #GValue.
     */
    public long getUint64() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_uint64(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a %G_TYPE_ULONG #GValue.
     */
    public long getUlong() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_ulong(HANDLE());
        return RESULT;
    }
    
    /**
     * Get the contents of a variant #GValue.
     */
    public org.gtk.glib.Variant getVariant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_get_variant(HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Initializes @value with the default value of @type.
     */
    public Value init(Type gType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_init(HANDLE(), gType.getValue());
        return new Value(References.get(RESULT, false));
    }
    
    /**
     * Initializes and sets @value from an instantiatable type via the
     * value_table's collect_value() function.
     * 
     * Note: The @value will be initialised with the exact type of
     * @instance.  If you wish to set the @value's type to a different GType
     * (such as a parent class GType), you need to manually call
     * g_value_init() and g_value_set_instance().
     */
    public void initFromInstance(TypeInstance instance) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_init_from_instance(HANDLE(), instance.HANDLE());
    }
    
    /**
     * Returns the value contents as pointer. This function asserts that
     * g_value_fits_pointer() returned %TRUE for the passed in value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public jdk.incubator.foreign.MemoryAddress peekPointer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_peek_pointer(HANDLE());
        return RESULT;
    }
    
    /**
     * Clears the current value in @value and resets it to the default value
     * (as if the value had just been initialized).
     */
    public Value reset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_reset(HANDLE());
        return new Value(References.get(RESULT, true));
    }
    
    /**
     * Set the contents of a %G_TYPE_BOOLEAN #GValue to @v_boolean.
     */
    public void setBoolean(boolean vBoolean) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_boolean(HANDLE(), vBoolean ? 1 : 0);
    }
    
    /**
     * Set the contents of a %G_TYPE_BOXED derived #GValue to @v_boxed.
     */
    public void setBoxed(jdk.incubator.foreign.MemoryAddress vBoxed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_boxed(HANDLE(), vBoxed);
    }
    
    /**
     * Set the contents of a %G_TYPE_DOUBLE #GValue to @v_double.
     */
    public void setDouble(double vDouble) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_double(HANDLE(), vDouble);
    }
    
    /**
     * Set the contents of a %G_TYPE_ENUM #GValue to @v_enum.
     */
    public void setEnum(int vEnum) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_enum(HANDLE(), vEnum);
    }
    
    /**
     * Set the contents of a %G_TYPE_FLAGS #GValue to @v_flags.
     */
    public void setFlags(int vFlags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_flags(HANDLE(), vFlags);
    }
    
    /**
     * Set the contents of a %G_TYPE_FLOAT #GValue to @v_float.
     */
    public void setFloat(float vFloat) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_float(HANDLE(), vFloat);
    }
    
    /**
     * Set the contents of a %G_TYPE_GTYPE #GValue to @v_gtype.
     */
    public void setGtype(Type vGtype) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_gtype(HANDLE(), vGtype.getValue());
    }
    
    /**
     * Sets @value from an instantiatable type via the
     * value_table's collect_value() function.
     */
    public void setInstance(jdk.incubator.foreign.MemoryAddress instance) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_instance(HANDLE(), instance);
    }
    
    /**
     * Set the contents of a %G_TYPE_INT #GValue to @v_int.
     */
    public void setInt(int vInt) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_int(HANDLE(), vInt);
    }
    
    /**
     * Set the contents of a %G_TYPE_INT64 #GValue to @v_int64.
     */
    public void setInt64(long vInt64) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_int64(HANDLE(), vInt64);
    }
    
    /**
     * Set the contents of a %G_TYPE_STRING #GValue to @v_string.  The string is
     * assumed to be static and interned (canonical, for example from
     * g_intern_string()), and is thus not duplicated when setting the #GValue.
     */
    public void setInternedString(java.lang.String vString) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_interned_string(HANDLE(), Interop.allocateNativeString(vString).HANDLE());
    }
    
    /**
     * Set the contents of a %G_TYPE_LONG #GValue to @v_long.
     */
    public void setLong(long vLong) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_long(HANDLE(), vLong);
    }
    
    /**
     * Set the contents of a %G_TYPE_OBJECT derived #GValue to @v_object.
     * 
     * g_value_set_object() increases the reference count of @v_object
     * (the #GValue holds a reference to @v_object).  If you do not wish
     * to increase the reference count of the object (i.e. you wish to
     * pass your current reference to the #GValue because you no longer
     * need it), use g_value_take_object() instead.
     * 
     * It is important that your #GValue holds a reference to @v_object (either its
     * own, or one it has taken) to ensure that the object won't be destroyed while
     * the #GValue still exists).
     */
    public void setObject(Object vObject) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_object(HANDLE(), vObject.HANDLE());
    }
    
    /**
     * Set the contents of a %G_TYPE_PARAM #GValue to @param.
     */
    public void setParam(ParamSpec param) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_param(HANDLE(), param.HANDLE());
    }
    
    /**
     * Set the contents of a pointer #GValue to @v_pointer.
     */
    public void setPointer(jdk.incubator.foreign.MemoryAddress vPointer) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_pointer(HANDLE(), vPointer);
    }
    
    /**
     * Set the contents of a %G_TYPE_CHAR #GValue to @v_char.
     */
    public void setSchar(byte vChar) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_schar(HANDLE(), vChar);
    }
    
    /**
     * Set the contents of a %G_TYPE_BOXED derived #GValue to @v_boxed.
     * 
     * The boxed value is assumed to be static, and is thus not duplicated
     * when setting the #GValue.
     */
    public void setStaticBoxed(jdk.incubator.foreign.MemoryAddress vBoxed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_static_boxed(HANDLE(), vBoxed);
    }
    
    /**
     * Set the contents of a %G_TYPE_STRING #GValue to @v_string.
     * The string is assumed to be static, and is thus not duplicated
     * when setting the #GValue.
     * 
     * If the the string is a canonical string, using g_value_set_interned_string()
     * is more appropriate.
     */
    public void setStaticString(java.lang.String vString) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_static_string(HANDLE(), Interop.allocateNativeString(vString).HANDLE());
    }
    
    /**
     * Set the contents of a %G_TYPE_STRING #GValue to a copy of @v_string.
     */
    public void setString(java.lang.String vString) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_string(HANDLE(), Interop.allocateNativeString(vString).HANDLE());
    }
    
    /**
     * Set the contents of a %G_TYPE_UCHAR #GValue to @v_uchar.
     */
    public void setUchar(byte vUchar) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_uchar(HANDLE(), vUchar);
    }
    
    /**
     * Set the contents of a %G_TYPE_UINT #GValue to @v_uint.
     */
    public void setUint(int vUint) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_uint(HANDLE(), vUint);
    }
    
    /**
     * Set the contents of a %G_TYPE_UINT64 #GValue to @v_uint64.
     */
    public void setUint64(long vUint64) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_uint64(HANDLE(), vUint64);
    }
    
    /**
     * Set the contents of a %G_TYPE_ULONG #GValue to @v_ulong.
     */
    public void setUlong(long vUlong) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_ulong(HANDLE(), vUlong);
    }
    
    /**
     * Set the contents of a variant #GValue to @variant.
     * If the variant is floating, it is consumed.
     */
    public void setVariant(org.gtk.glib.Variant variant) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_set_variant(HANDLE(), variant.HANDLE());
    }
    
    /**
     * Sets the contents of a %G_TYPE_BOXED derived #GValue to @v_boxed
     * and takes over the ownership of the caller’s reference to @v_boxed;
     * the caller doesn’t have to unref it any more.
     */
    public void takeBoxed(jdk.incubator.foreign.MemoryAddress vBoxed) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_take_boxed(HANDLE(), vBoxed);
    }
    
    /**
     * Sets the contents of a %G_TYPE_OBJECT derived #GValue to @v_object
     * and takes over the ownership of the caller’s reference to @v_object;
     * the caller doesn’t have to unref it any more (i.e. the reference
     * count of the object is not increased).
     * 
     * If you want the #GValue to hold its own reference to @v_object, use
     * g_value_set_object() instead.
     */
    public void takeObject(jdk.incubator.foreign.MemoryAddress vObject) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_take_object(HANDLE(), vObject);
    }
    
    /**
     * Sets the contents of a %G_TYPE_PARAM #GValue to @param and takes
     * over the ownership of the caller’s reference to @param; the caller
     * doesn’t have to unref it any more.
     */
    public void takeParam(ParamSpec param) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_take_param(HANDLE(), param.HANDLE());
    }
    
    /**
     * Sets the contents of a %G_TYPE_STRING #GValue to @v_string.
     */
    public void takeString(java.lang.String vString) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_take_string(HANDLE(), Interop.allocateNativeString(vString).HANDLE());
    }
    
    /**
     * Set the contents of a variant #GValue to @variant, and takes over
     * the ownership of the caller's reference to @variant;
     * the caller doesn't have to unref it any more (i.e. the reference
     * count of the variant is not increased).
     * 
     * If @variant was floating then its floating reference is converted to
     * a hard reference.
     * 
     * If you want the #GValue to hold its own reference to @variant, use
     * g_value_set_variant() instead.
     * 
     * This is an internal function introduced mainly for C marshallers.
     */
    public void takeVariant(org.gtk.glib.Variant variant) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_take_variant(HANDLE(), variant.HANDLE());
    }
    
    /**
     * Tries to cast the contents of @src_value into a type appropriate
     * to store in @dest_value, e.g. to transform a %G_TYPE_INT value
     * into a %G_TYPE_FLOAT value. Performing transformations between
     * value types might incur precision lossage. Especially
     * transformations into strings might reveal seemingly arbitrary
     * results and shouldn't be relied upon for production code (such
     * as rcfile value or object property serialization).
     */
    public boolean transform(Value destValue) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_transform(HANDLE(), destValue.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Clears the current value in @value (if any) and "unsets" the type,
     * this releases all resources associated with this GValue. An unset
     * value is the same as an uninitialized (zero-filled) #GValue
     * structure.
     */
    public void unset() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_value_unset(HANDLE());
    }
    
}
