package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class GObject {
    
    public static final int PARAM_MASK = 255;

    public static final int PARAM_STATIC_STRINGS = 224;

    public static final int PARAM_USER_SHIFT = 8;

    public static final int SIGNAL_FLAGS_MASK = 511;

    public static final int SIGNAL_MATCH_MASK = 63;

    public static final org.gtk.glib.Type TYPE_FLAG_RESERVED_ID_BIT = new org.gtk.glib.Type(1L);

    public static final int TYPE_FUNDAMENTAL_MAX = 255;

    public static final int TYPE_FUNDAMENTAL_SHIFT = 2;

    public static final int TYPE_RESERVED_BSE_FIRST = 32;

    public static final int TYPE_RESERVED_BSE_LAST = 48;

    public static final int TYPE_RESERVED_GLIB_FIRST = 22;

    public static final int TYPE_RESERVED_GLIB_LAST = 31;

    public static final int TYPE_RESERVED_USER_FIRST = 49;

    public static final int VALUE_INTERNED_STRING = 268435456;

    public static final int VALUE_NOCOPY_CONTENTS = 134217728;

    /**
     * Provide a copy of a boxed structure @src_boxed which is of type @boxed_type.
     */
    public static jdk.incubator.foreign.MemoryAddress boxedCopy(Type boxedType, jdk.incubator.foreign.MemoryAddress srcBoxed) {
        var RESULT = gtk_h.g_boxed_copy(boxedType.getValue(), srcBoxed);
        return RESULT;
    }
    
    /**
     * Free the boxed structure @boxed which is of type @boxed_type.
     */
    public static void boxedFree(Type boxedType, jdk.incubator.foreign.MemoryAddress boxed) {
        gtk_h.g_boxed_free(boxedType.getValue(), boxed);
    }
    
    /**
     * A #GClosureMarshal function for use with signals with handlers that
     * take two boxed pointers as arguments and return a boolean.  If you
     * have such a signal, you will probably also need to use an
     * accumulator, such as g_signal_accumulator_true_handled().
     */
    public static void cclosureMarshalBOOLEANBOXEDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_BOOLEAN__BOXED_BOXED(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)</code> where the #gint parameter
     * denotes a flags type.
     */
    public static void cclosureMarshalBOOLEANFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_BOOLEAN__FLAGS(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)</code>.
     */
    public static void cclosureMarshalSTRINGOBJECTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_STRING__OBJECT_POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDBOOLEAN(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__BOOLEAN(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__BOXED(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gchar arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__CHAR(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDDOUBLE(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__DOUBLE(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gint arg1, gpointer user_data)</code> where the #gint parameter denotes an enumeration type..
     */
    public static void cclosureMarshalVOIDENUM(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__ENUM(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gint arg1, gpointer user_data)</code> where the #gint parameter denotes a flags type.
     */
    public static void cclosureMarshalVOIDFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__FLAGS(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDFLOAT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__FLOAT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gint arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__INT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, glong arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDLONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__LONG(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDOBJECT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__OBJECT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDPARAM(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__PARAM(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDSTRING(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__STRING(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, guchar arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDUCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UCHAR(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, guint arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDUINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UINT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDUINTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UINT_POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gulong arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDULONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__ULONG(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDVARIANT(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__VARIANT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a #GCClosure with a callback of type<code>void (*callback) (gpointer instance, gpointer user_data)</code>.
     */
    public static void cclosureMarshalVOIDVOID(Closure closure, Value returnValue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__VOID(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A generic marshaller function implemented via
     * {@link [libffi]}(http://sourceware.org/libffi/).
     * 
     * Normally this function is not passed explicitly to g_signal_new(),
     * but used automatically by GLib when specifying a <code>null</code> marshaller.
     */
    public static void cclosureMarshalGeneric(Closure closure, Value returnGvalue, int nParamValues, Value paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_generic(closure.handle(), returnGvalue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * Creates a new closure which invokes @callback_func with @user_data as
     * the last parameter.
     * 
     * @destroy_data will be called as a finalize notifier on the #GClosure.
     */
    public static Closure cclosureNew(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = gtk_h.g_cclosure_new(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new closure which invokes @callback_func with @user_data as
     * the first parameter.
     * 
     * @destroy_data will be called as a finalize notifier on the #GClosure.
     */
    public static Closure cclosureNewSwap(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = gtk_h.g_cclosure_new_swap(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(References.get(RESULT, false));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Clears a reference to a #GObject.
     * 
     * @object_ptr must not be <code>NULL.
     * 
     * If</code> the reference is <code>null</code> then this function does nothing.
     * Otherwise, the reference count of the object is decreased and the
     * pointer is set to <code>NULL.
     * 
     * A</code> macro is also included that allows this function to be used without
     * pointer casts.
     */
    public static void clearObject(Object[] objectPtr) {
        gtk_h.g_clear_object(Interop.allocateNativeArray(objectPtr).handle());
    }
    
    /**
     * This function is meant to be called from the <code>complete_type_info</code>
     * function of a #GTypePlugin implementation, as in the following
     * example:
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * static void
     * my_enum_complete_type_info (GTypePlugin     *plugin,
     *                             GType            g_type,
     *                             GTypeInfo       *info,
     *                             GTypeValueTable *value_table)
     * {
     *   static const GEnumValue values[]} = {
     *     { MY_ENUM_FOO, &#34;MY_ENUM_FOO&#34;, &#34;foo&#34; },
     *     { MY_ENUM_BAR, &#34;MY_ENUM_BAR&#34;, &#34;bar&#34; },
     *     { 0, NULL, NULL }
     *   };
     * 
     *   g_enum_complete_type_info (type, info, values);
     * }
     * ]|
     */
    public static void enumCompleteTypeInfo(Type gEnumType, TypeInfo info, EnumValue constValues) {
        gtk_h.g_enum_complete_type_info(gEnumType.getValue(), info.handle(), constValues.handle());
    }
    
    /**
     * Returns the #GEnumValue for a value.
     */
    public static EnumValue enumGetValue(EnumClass enumClass, int value) {
        var RESULT = gtk_h.g_enum_get_value(enumClass.handle(), value);
        return new EnumValue(References.get(RESULT, false));
    }
    
    /**
     * Looks up a #GEnumValue by name.
     */
    public static EnumValue enumGetValueByName(EnumClass enumClass, java.lang.String name) {
        var RESULT = gtk_h.g_enum_get_value_by_name(enumClass.handle(), Interop.allocateNativeString(name).handle());
        return new EnumValue(References.get(RESULT, false));
    }
    
    /**
     * Looks up a #GEnumValue by nickname.
     */
    public static EnumValue enumGetValueByNick(EnumClass enumClass, java.lang.String nick) {
        var RESULT = gtk_h.g_enum_get_value_by_nick(enumClass.handle(), Interop.allocateNativeString(nick).handle());
        return new EnumValue(References.get(RESULT, false));
    }
    
    /**
     * Registers a new static enumeration type with the name @name.
     * 
     * It is normally more convenient to let {@link [glib-mkenums]}{@link [glib-mkenums]},
     * generate a my_enum_get_type() function from a usual C enumeration
     * definition  than to write one yourself using g_enum_register_static().
     */
    public static org.gtk.gobject.Type enumRegisterStatic(java.lang.String name, EnumValue constStaticValues) {
        var RESULT = gtk_h.g_enum_register_static(Interop.allocateNativeString(name).handle(), constStaticValues.handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Pretty-prints @value in the form of the enum&#8217;s name.
     * 
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     */
    public static java.lang.String enumToString(Type gEnumType, int value) {
        var RESULT = gtk_h.g_enum_to_string(gEnumType.getValue(), value);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function is meant to be called from the complete_type_info()
     * function of a #GTypePlugin implementation, see the example for
     * g_enum_complete_type_info() above.
     */
    public static void flagsCompleteTypeInfo(Type gFlagsType, TypeInfo info, FlagsValue constValues) {
        gtk_h.g_flags_complete_type_info(gFlagsType.getValue(), info.handle(), constValues.handle());
    }
    
    /**
     * Returns the first #GFlagsValue which is set in @value.
     */
    public static FlagsValue flagsGetFirstValue(FlagsClass flagsClass, int value) {
        var RESULT = gtk_h.g_flags_get_first_value(flagsClass.handle(), value);
        return new FlagsValue(References.get(RESULT, false));
    }
    
    /**
     * Looks up a #GFlagsValue by name.
     */
    public static FlagsValue flagsGetValueByName(FlagsClass flagsClass, java.lang.String name) {
        var RESULT = gtk_h.g_flags_get_value_by_name(flagsClass.handle(), Interop.allocateNativeString(name).handle());
        return new FlagsValue(References.get(RESULT, false));
    }
    
    /**
     * Looks up a #GFlagsValue by nickname.
     */
    public static FlagsValue flagsGetValueByNick(FlagsClass flagsClass, java.lang.String nick) {
        var RESULT = gtk_h.g_flags_get_value_by_nick(flagsClass.handle(), Interop.allocateNativeString(nick).handle());
        return new FlagsValue(References.get(RESULT, false));
    }
    
    /**
     * Registers a new static flags type with the name @name.
     * 
     * It is normally more convenient to let {@link [glib-mkenums]}{@link [glib-mkenums]}
     * generate a my_flags_get_type() function from a usual C enumeration
     * definition than to write one yourself using g_flags_register_static().
     */
    public static org.gtk.gobject.Type flagsRegisterStatic(java.lang.String name, FlagsValue constStaticValues) {
        var RESULT = gtk_h.g_flags_register_static(Interop.allocateNativeString(name).handle(), constStaticValues.handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Pretty-prints @value in the form of the flag names separated by <code> | </code> and
     * sorted. Any extra bits will be shown at the end as a hexadecimal number.
     * 
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     */
    public static java.lang.String flagsToString(Type flagsType, int value) {
        var RESULT = gtk_h.g_flags_to_string(flagsType.getValue(), value);
        return RESULT.getUtf8String(0);
    }
    
    public static org.gtk.gobject.Type gtypeGetType() {
        var RESULT = gtk_h.g_gtype_get_type();
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Creates a new #GParamSpecBoolean instance specifying a <code>G_TYPE_BOOLEAN
     * property.</code> In many cases, it may be more appropriate to use an enum with
     * g_param_spec_enum(), both to improve code clarity by using explicitly named
     * values, and to allow for more values to be added in future without breaking
     * API.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecBoolean(java.lang.String name, java.lang.String nick, java.lang.String blurb, boolean defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_boolean(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), defaultValue ? 1 : 0, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecBoxed instance specifying a <code>G_TYPE_BOXED
     * derived</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecBoxed(java.lang.String name, java.lang.String nick, java.lang.String blurb, Type boxedType, int flags) {
        var RESULT = gtk_h.g_param_spec_boxed(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), boxedType.getValue(), flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecChar instance specifying a <code>G_TYPE_CHAR</code> property.
     */
    public static ParamSpec paramSpecChar(java.lang.String name, java.lang.String nick, java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_char(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecDouble instance specifying a <code>G_TYPE_DOUBLE
     * property.
     * 
     * See</code> g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecDouble(java.lang.String name, java.lang.String nick, java.lang.String blurb, double minimum, double maximum, double defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_double(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecEnum instance specifying a <code>G_TYPE_ENUM
     * property.
     * 
     * See</code> g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecEnum(java.lang.String name, java.lang.String nick, java.lang.String blurb, Type enumType, int defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_enum(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), enumType.getValue(), defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecFlags instance specifying a <code>G_TYPE_FLAGS
     * property.
     * 
     * See</code> g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecFlags(java.lang.String name, java.lang.String nick, java.lang.String blurb, Type flagsType, int defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_flags(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flagsType.getValue(), defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecFloat instance specifying a <code>G_TYPE_FLOAT</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecFloat(java.lang.String name, java.lang.String nick, java.lang.String blurb, float minimum, float maximum, float defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_float(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecGType instance specifying a
     * <code>G_TYPE_GTYPE</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecGtype(java.lang.String name, java.lang.String nick, java.lang.String blurb, Type isAType, int flags) {
        var RESULT = gtk_h.g_param_spec_gtype(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), isAType.getValue(), flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecInt instance specifying a <code>G_TYPE_INT</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecInt(java.lang.String name, java.lang.String nick, java.lang.String blurb, int minimum, int maximum, int defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_int(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecInt64 instance specifying a <code>G_TYPE_INT64</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecInt64(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_int64(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecLong instance specifying a <code>G_TYPE_LONG</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecLong(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_long(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecBoxed instance specifying a <code>G_TYPE_OBJECT
     * derived</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecObject(java.lang.String name, java.lang.String nick, java.lang.String blurb, Type objectType, int flags) {
        var RESULT = gtk_h.g_param_spec_object(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), objectType.getValue(), flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new property of type #GParamSpecOverride. This is used
     * to direct operations to another paramspec, and will not be directly
     * useful unless you are implementing a new base type similar to GObject.
     */
    public static ParamSpec paramSpecOverride(java.lang.String name, ParamSpec overridden) {
        var RESULT = gtk_h.g_param_spec_override(Interop.allocateNativeString(name).handle(), overridden.handle());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Creates a new #GParamSpecParam instance specifying a <code>G_TYPE_PARAM
     * property.
     * 
     * See</code> g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecParam(java.lang.String name, java.lang.String nick, java.lang.String blurb, Type paramType, int flags) {
        var RESULT = gtk_h.g_param_spec_param(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), paramType.getValue(), flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecPointer instance specifying a pointer property.
     * Where possible, it is better to use g_param_spec_object() or
     * g_param_spec_boxed() to expose memory management information.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecPointer(java.lang.String name, java.lang.String nick, java.lang.String blurb, int flags) {
        var RESULT = gtk_h.g_param_spec_pointer(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecString instance.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecString(java.lang.String name, java.lang.String nick, java.lang.String blurb, java.lang.String defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_string(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), Interop.allocateNativeString(defaultValue).handle(), flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecUChar instance specifying a <code>G_TYPE_UCHAR</code> property.
     */
    public static ParamSpec paramSpecUchar(java.lang.String name, java.lang.String nick, java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_uchar(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecUInt instance specifying a <code>G_TYPE_UINT</code> property.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUint(java.lang.String name, java.lang.String nick, java.lang.String blurb, int minimum, int maximum, int defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_uint(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecUInt64 instance specifying a <code>G_TYPE_UINT64
     * property.
     * 
     * See</code> g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUint64(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_uint64(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecULong instance specifying a <code>G_TYPE_ULONG
     * property.
     * 
     * See</code> g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUlong(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_ulong(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecUnichar instance specifying a <code>G_TYPE_UINT
     * property.</code> #GValue structures for this property can be accessed with
     * g_value_set_uint() and g_value_get_uint().
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUnichar(java.lang.String name, java.lang.String nick, java.lang.String blurb, int defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_unichar(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), defaultValue, flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GParamSpecValueArray instance specifying a
     * <code>G_TYPE_VALUE_ARRAY</code> property. <code>G_TYPE_VALUE_ARRAY</code> is a
     * <code>G_TYPE_BOXED</code> type, as such, #GValue structures for this property
     * can be accessed with g_value_set_boxed() and g_value_get_boxed().
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecValueArray(java.lang.String name, java.lang.String nick, java.lang.String blurb, ParamSpec elementSpec, int flags) {
        var RESULT = gtk_h.g_param_spec_value_array(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), elementSpec.handle(), flags);
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Creates a new #GParamSpecVariant instance specifying a #GVariant
     * property.
     * 
     * If @default_value is floating, it is consumed.
     * 
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecVariant(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.glib.VariantType type, org.gtk.glib.Variant defaultValue, int flags) {
        var RESULT = gtk_h.g_param_spec_variant(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), type.handle(), defaultValue.handle(), flags);
        return new ParamSpec(References.get(RESULT, true));
    }
    
    /**
     * Registers @name as the name of a new static type derived
     * from <code>G_TYPE_PARAM.
     * 
     * The</code> type system uses the information contained in the #GParamSpecTypeInfo
     * structure pointed to by @info to manage the #GParamSpec type and its
     * instances.
     */
    public static org.gtk.gobject.Type paramTypeRegisterStatic(java.lang.String name, ParamSpecTypeInfo pspecInfo) {
        var RESULT = gtk_h.g_param_type_register_static(Interop.allocateNativeString(name).handle(), pspecInfo.handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Transforms @src_value into @dest_value if possible, and then
     * validates @dest_value, in order for it to conform to @pspec.  If
     * @strict_validation is <code>true</code> this function will only succeed if the
     * transformed @dest_value complied to @pspec without modifications.
     * 
     * See also g_value_type_transformable(), g_value_transform() and
     * g_param_value_validate().
     */
    public static boolean paramValueConvert(ParamSpec pspec, Value srcValue, Value destValue, boolean strictValidation) {
        var RESULT = gtk_h.g_param_value_convert(pspec.handle(), srcValue.handle(), destValue.handle(), strictValidation ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Checks whether @value contains the default value as specified in @pspec.
     */
    public static boolean paramValueDefaults(ParamSpec pspec, Value value) {
        var RESULT = gtk_h.g_param_value_defaults(pspec.handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets @value to its default value as specified in @pspec.
     */
    public static void paramValueSetDefault(ParamSpec pspec, Value value) {
        gtk_h.g_param_value_set_default(pspec.handle(), value.handle());
    }
    
    /**
     * Ensures that the contents of @value comply with the specifications
     * set out by @pspec. For example, a #GParamSpecInt might require
     * that integers stored in @value may not be smaller than -42 and not be
     * greater than +42. If @value contains an integer outside of this range,
     * it is modified accordingly, so the resulting value will fit into the
     * range -42 .. +42.
     */
    public static boolean paramValueValidate(ParamSpec pspec, Value value) {
        var RESULT = gtk_h.g_param_value_validate(pspec.handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Compares @value1 with @value2 according to @pspec, and return -1, 0 or +1,
     * if @value1 is found to be less than, equal to or greater than @value2,
     * respectively.
     */
    public static int paramValuesCmp(ParamSpec pspec, Value value1, Value value2) {
        var RESULT = gtk_h.g_param_values_cmp(pspec.handle(), value1.handle(), value2.handle());
        return RESULT;
    }
    
    /**
     * Creates a new <code>G_TYPE_POINTER</code> derived type id for a new
     * pointer type with name @name.
     */
    public static org.gtk.gobject.Type pointerTypeRegisterStatic(java.lang.String name) {
        var RESULT = gtk_h.g_pointer_type_register_static(Interop.allocateNativeString(name).handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * A predefined #GSignalAccumulator for signals intended to be used as a
     * hook for application code to provide a particular value.  Usually
     * only one such value is desired and multiple handlers for the same
     * signal don&#39;t make much sense (except for the case of the default
     * handler defined in the class structure, in which case you will
     * usually want the signal connection to override the class handler).
     * 
     * This accumulator will use the return value from the first signal
     * handler that is run as the return value for the signal and not run
     * any further handlers (ie: the first handler &#34;wins&#34;).
     */
    public static boolean signalAccumulatorFirstWins(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn, jdk.incubator.foreign.MemoryAddress dummy) {
        var RESULT = gtk_h.g_signal_accumulator_first_wins(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
        return (RESULT != 0);
    }
    
    /**
     * A predefined #GSignalAccumulator for signals that return a
     * boolean values. The behavior that this accumulator gives is
     * that a return of <code>true</code> stops the signal emission: no further
     * callbacks will be invoked, while a return of <code>false</code> allows
     * the emission to continue. The idea here is that a <code>true</code> return
     * indicates that the callback handled the signal, and no further
     * handling is needed.
     */
    public static boolean signalAccumulatorTrueHandled(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn, jdk.incubator.foreign.MemoryAddress dummy) {
        var RESULT = gtk_h.g_signal_accumulator_true_handled(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
        return (RESULT != 0);
    }
    
    /**
     * Adds an emission hook for a signal, which will get called for any emission
     * of that signal, independent of the instance. This is possible only
     * for signals which don&#39;t have {@link org.gtk.gobject.SignalFlags#NO_HOOKS} flag set.
     */
    public static long signalAddEmissionHook(int signalId, org.gtk.glib.Quark detail, SignalEmissionHook hookFunc) {
        try {
            var RESULT = gtk_h.g_signal_add_emission_hook(signalId, detail.getValue(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbSignalEmissionHook",
                            MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(hookFunc.hashCode(), hookFunc)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls the original class closure of a signal. This function should only
     * be called from an overridden class closure; see
     * g_signal_override_class_closure() and
     * g_signal_override_class_handler().
     */
    public static void signalChainFromOverridden(Value[] instanceAndParams, Value returnValue) {
        gtk_h.g_signal_chain_from_overridden(Interop.allocateNativeArray(instanceAndParams).handle(), returnValue.handle());
    }
    
    /**
     * Connects a closure to a signal for a particular object.
     */
    public static long signalConnectClosure(Object instance, java.lang.String detailedSignal, Closure closure, boolean after) {
        var RESULT = gtk_h.g_signal_connect_closure(instance.handle(), Interop.allocateNativeString(detailedSignal).handle(), closure.handle(), after ? 1 : 0);
        return RESULT;
    }
    
    /**
     * Connects a closure to a signal for a particular object.
     */
    public static long signalConnectClosureById(Object instance, int signalId, org.gtk.glib.Quark detail, Closure closure, boolean after) {
        var RESULT = gtk_h.g_signal_connect_closure_by_id(instance.handle(), signalId, detail.getValue(), closure.handle(), after ? 1 : 0);
        return RESULT;
    }
    
    /**
     * Connects a #GCallback function to a signal for a particular object. Similar
     * to g_signal_connect(), but allows to provide a #GClosureNotify for the data
     * which will be called when the signal handler is disconnected and no longer
     * used. Specify @connect_flags if you need <code>..._after()</code> or<code>..._swapped()</code> variants of this function.
     */
    public static long signalConnectData(Object instance, java.lang.String detailedSignal, Callback cHandler, ClosureNotify destroyData, int connectFlags) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(instance.handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), connectFlags);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * 
     * Note that g_signal_emit_valist() resets the return value to the default
     * if no handlers are connected, in contrast to g_signal_emitv().
     */
    public static void signalEmitValist(TypeInstance instance, int signalId, org.gtk.glib.Quark detail, VaList varArgs) {
        gtk_h.g_signal_emit_valist(instance.handle(), signalId, detail.getValue(), varArgs);
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * 
     * Note that g_signal_emitv() doesn&#39;t change @return_value if no handlers are
     * connected, in contrast to g_signal_emit() and g_signal_emit_valist().
     */
    public static void signalEmitv(Value[] instanceAndParams, int signalId, org.gtk.glib.Quark detail, Value returnValue) {
        gtk_h.g_signal_emitv(Interop.allocateNativeArray(instanceAndParams).handle(), signalId, detail.getValue(), returnValue.handle());
    }
    
    /**
     * Returns the invocation hint of the innermost signal emission of instance.
     */
    public static SignalInvocationHint signalGetInvocationHint(Object instance) {
        var RESULT = gtk_h.g_signal_get_invocation_hint(instance.handle());
        return new SignalInvocationHint(References.get(RESULT, false));
    }
    
    /**
     * Blocks a handler of an instance so it will not be called during any
     * signal emissions unless it is unblocked again. Thus &#34;blocking&#34; a
     * signal handler means to temporarily deactivate it, a signal handler
     * has to be unblocked exactly the same amount of times it has been
     * blocked before to become active again.
     * 
     * The @handler_id has to be a valid signal handler id, connected to a
     * signal of @instance.
     */
    public static void signalHandlerBlock(Object instance, long handlerId) {
        gtk_h.g_signal_handler_block(instance.handle(), handlerId);
    }
    
    /**
     * Disconnects a handler from an instance so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The @handler_id becomes invalid and may be reused.
     * 
     * The @handler_id has to be a valid signal handler id, connected to a
     * signal of @instance.
     */
    public static void signalHandlerDisconnect(Object instance, long handlerId) {
        gtk_h.g_signal_handler_disconnect(instance.handle(), handlerId);
    }
    
    /**
     * Finds the first signal handler that matches certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of #GSignalMatchType
     * flags, and the criteria values are passed as arguments.
     * The match @mask has to be non-0 for successful matches.
     * If no handler was found, 0 is returned.
     */
    public static long signalHandlerFind(Object instance, int mask, int signalId, org.gtk.glib.Quark detail, Closure closure, jdk.incubator.foreign.MemoryAddress func, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handler_find(instance.handle(), mask, signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Returns whether @handler_id is the ID of a handler connected to @instance.
     */
    public static boolean signalHandlerIsConnected(Object instance, long handlerId) {
        var RESULT = gtk_h.g_signal_handler_is_connected(instance.handle(), handlerId);
        return (RESULT != 0);
    }
    
    /**
     * Undoes the effect of a previous g_signal_handler_block() call.  A
     * blocked handler is skipped during signal emissions and will not be
     * invoked, unblocking it (for exactly the amount of times it has been
     * blocked before) reverts its &#34;blocked&#34; state, so the handler will be
     * recognized by the signal system and is called upon future or
     * currently ongoing signal emissions (since the order in which
     * handlers are called during signal emissions is deterministic,
     * whether the unblocked handler in question is called as part of a
     * currently ongoing emission depends on how far that emission has
     * proceeded yet).
     * 
     * The @handler_id has to be a valid id of a signal handler that is
     * connected to a signal of @instance and is currently blocked.
     */
    public static void signalHandlerUnblock(Object instance, long handlerId) {
        gtk_h.g_signal_handler_unblock(instance.handle(), handlerId);
    }
    
    /**
     * Blocks all handlers on an instance that match a certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of #GSignalMatchType
     * flags, and the criteria values are passed as arguments.
     * Passing at least one of the <code>G_SIGNAL_MATCH_CLOSURE,</code> <code>G_SIGNAL_MATCH_FUNC
     * or</code> {@link org.gtk.gobject.SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of blocked handlers
     * otherwise.
     */
    public static int signalHandlersBlockMatched(Object instance, int mask, int signalId, org.gtk.glib.Quark detail, Closure closure, jdk.incubator.foreign.MemoryAddress func, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handlers_block_matched(instance.handle(), mask, signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Destroy all signal handlers of a type instance. This function is
     * an implementation detail of the #GObject dispose implementation,
     * and should not be used outside of the type system.
     */
    public static void signalHandlersDestroy(Object instance) {
        gtk_h.g_signal_handlers_destroy(instance.handle());
    }
    
    /**
     * Disconnects all handlers on an instance that match a certain
     * selection criteria. The criteria mask is passed as an OR-ed
     * combination of #GSignalMatchType flags, and the criteria values are
     * passed as arguments.  Passing at least one of the
     * <code>G_SIGNAL_MATCH_CLOSURE,</code> {@link org.gtk.gobject.SignalMatchType#FUNC} or
     * {@link org.gtk.gobject.SignalMatchType#DATA} match flags is required for successful
     * matches.  If no handlers were found, 0 is returned, the number of
     * disconnected handlers otherwise.
     */
    public static int signalHandlersDisconnectMatched(Object instance, int mask, int signalId, org.gtk.glib.Quark detail, Closure closure, jdk.incubator.foreign.MemoryAddress func, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handlers_disconnect_matched(instance.handle(), mask, signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Unblocks all handlers on an instance that match a certain selection
     * criteria. The criteria mask is passed as an OR-ed combination of
     * #GSignalMatchType flags, and the criteria values are passed as arguments.
     * Passing at least one of the <code>G_SIGNAL_MATCH_CLOSURE,</code> <code>G_SIGNAL_MATCH_FUNC
     * or</code> {@link org.gtk.gobject.SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of unblocked handlers
     * otherwise. The match criteria should not apply to any handlers that are
     * not currently blocked.
     */
    public static int signalHandlersUnblockMatched(Object instance, int mask, int signalId, org.gtk.glib.Quark detail, Closure closure, jdk.incubator.foreign.MemoryAddress func, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handlers_unblock_matched(instance.handle(), mask, signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Returns whether there are any handlers connected to @instance for the
     * given signal id and detail.
     * 
     * If @detail is 0 then it will only match handlers that were connected
     * without detail.  If @detail is non-zero then it will match handlers
     * connected both without detail and with the given detail.  This is
     * consistent with how a signal emitted with @detail would be delivered
     * to those handlers.
     * 
     * Since 2.46 this also checks for a non-default class closure being
     * installed, as this is basically always what you want.
     * 
     * One example of when you might use this is when the arguments to the
     * signal are difficult to compute. A class implementor may opt to not
     * emit the signal if no one is attached anyway, thus saving the cost
     * of building the arguments.
     */
    public static boolean signalHasHandlerPending(Object instance, int signalId, org.gtk.glib.Quark detail, boolean mayBeBlocked) {
        var RESULT = gtk_h.g_signal_has_handler_pending(instance.handle(), signalId, detail.getValue(), mayBeBlocked ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Validate a signal name. This can be useful for dynamically-generated signals
     * which need to be validated at run-time before actually trying to create them.
     * 
     * See {@link [canonical parameter names]}{@link [canonical-parameter-names]} for details of
     * the rules for valid names. The rules for signal names are the same as those
     * for property names.
     */
    public static boolean signalIsValidName(java.lang.String name) {
        var RESULT = gtk_h.g_signal_is_valid_name(Interop.allocateNativeString(name).handle());
        return (RESULT != 0);
    }
    
    /**
     * Given the name of the signal and the type of object it connects to, gets
     * the signal&#39;s identifying integer. Emitting the signal by number is
     * somewhat faster than using the name each time.
     * 
     * Also tries the ancestors of the given type.
     * 
     * The type class passed as @itype must already have been instantiated (for
     * example, using g_type_class_ref()) for this function to work, as signals are
     * always installed during class initialization.
     * 
     * See g_signal_new() for details on allowed signal names.
     */
    public static int signalLookup(java.lang.String name, Type itype) {
        var RESULT = gtk_h.g_signal_lookup(Interop.allocateNativeString(name).handle(), itype.getValue());
        return RESULT;
    }
    
    /**
     * Given the signal&#39;s identifier, finds its name.
     * 
     * Two different signals may have the same name, if they have differing types.
     */
    public static java.lang.String signalName(int signalId) {
        var RESULT = gtk_h.g_signal_name(signalId);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Overrides the class closure (i.e. the default handler) for the given signal
     * for emissions on instances of @instance_type. @instance_type must be derived
     * from the type to which the signal belongs.
     * 
     * See g_signal_chain_from_overridden() and
     * g_signal_chain_from_overridden_handler() for how to chain up to the
     * parent class closure from inside the overridden one.
     */
    public static void signalOverrideClassClosure(int signalId, Type instanceType, Closure classClosure) {
        gtk_h.g_signal_override_class_closure(signalId, instanceType.getValue(), classClosure.handle());
    }
    
    /**
     * Queries the signal system for in-depth information about a
     * specific signal. This function will fill in a user-provided
     * structure to hold signal-specific information. If an invalid
     * signal id is passed in, the @signal_id member of the #GSignalQuery
     * is 0. All members filled into the #GSignalQuery structure should
     * be considered constant and have to be left untouched.
     */
    public static void signalQuery(int signalId, SignalQuery query) {
        gtk_h.g_signal_query(signalId, query.handle());
    }
    
    /**
     * Deletes an emission hook.
     */
    public static void signalRemoveEmissionHook(int signalId, long hookId) {
        gtk_h.g_signal_remove_emission_hook(signalId, hookId);
    }
    
    /**
     * Stops a signal&#39;s current emission.
     * 
     * This will prevent the default method from running, if the signal was
     * {@link org.gtk.gobject.SignalFlags#RUN_LAST} and you connected normally (i.e. without the &#34;after&#34;
     * flag).
     * 
     * Prints a warning if used on a signal which isn&#39;t being emitted.
     */
    public static void signalStopEmission(Object instance, int signalId, org.gtk.glib.Quark detail) {
        gtk_h.g_signal_stop_emission(instance.handle(), signalId, detail.getValue());
    }
    
    /**
     * Stops a signal&#39;s current emission.
     * 
     * This is just like g_signal_stop_emission() except it will look up the
     * signal id for you.
     */
    public static void signalStopEmissionByName(Object instance, java.lang.String detailedSignal) {
        gtk_h.g_signal_stop_emission_by_name(instance.handle(), Interop.allocateNativeString(detailedSignal).handle());
    }
    
    /**
     * Creates a new closure which invokes the function found at the offset
     * @struct_offset in the class structure of the interface or classed type
     * identified by @itype.
     */
    public static Closure signalTypeCclosureNew(Type itype, int structOffset) {
        var RESULT = gtk_h.g_signal_type_cclosure_new(itype.getValue(), structOffset);
        return new Closure(References.get(RESULT, false));
    }
    
    /**
     * Set the callback for a source as a #GClosure.
     * 
     * If the source is not one of the standard GLib types, the @closure_callback
     * and @closure_marshal fields of the #GSourceFuncs structure must have been
     * filled in with pointers to appropriate functions.
     */
    public static void sourceSetClosure(org.gtk.glib.Source source, Closure closure) {
        gtk_h.g_source_set_closure(source.handle(), closure.handle());
    }
    
    /**
     * Sets a dummy callback for @source. The callback will do nothing, and
     * if the source expects a #gboolean return value, it will return <code>TRUE.
     * (If</code> the source expects any other type of return value, it will return
     * a 0/<code>null</code> value; whatever g_value_init() initializes a #GValue to for
     * that type.)
     * 
     * If the source is not one of the standard GLib types, the
     * @closure_callback and @closure_marshal fields of the #GSourceFuncs
     * structure must have been filled in with pointers to appropriate
     * functions.
     */
    public static void sourceSetDummyCallback(org.gtk.glib.Source source) {
        gtk_h.g_source_set_dummy_callback(source.handle());
    }
    
    /**
     * Return a newly allocated string, which describes the contents of a
     * #GValue.  The main purpose of this function is to describe #GValue
     * contents for debugging output, the way in which the contents are
     * described may change between different GLib versions.
     */
    public static java.lang.String strdupValueContents(Value value) {
        var RESULT = gtk_h.g_strdup_value_contents(value.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Adds a #GTypeClassCacheFunc to be called before the reference count of a
     * class goes from one to zero. This can be used to prevent premature class
     * destruction. All installed #GTypeClassCacheFunc functions will be chained
     * until one of them returns <code>TRUE.</code> The functions have to check the class id
     * passed in to figure whether they actually want to cache the class of this
     * type, since all classes are routed through the same #GTypeClassCacheFunc
     * chain.
     */
    public static void typeAddClassCacheFunc(TypeClassCacheFunc cacheFunc) {
        try {
            gtk_h.g_type_add_class_cache_func(
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cacheFunc.hashCode(), cacheFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTypeClassCacheFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Registers a private class structure for a classed type;
     * when the class is allocated, the private structures for
     * the class and all of its parent types are allocated
     * sequentially in the same memory block as the public
     * structures, and are zero-filled.
     * 
     * This function should be called in the
     * type&#39;s get_type() function after the type is registered.
     * The private structure can be retrieved using the
     * G_TYPE_CLASS_GET_PRIVATE() macro.
     */
    public static void typeAddClassPrivate(Type classType, long privateSize) {
        gtk_h.g_type_add_class_private(classType.getValue(), privateSize);
    }
    
    public static int typeAddInstancePrivate(Type classType, long privateSize) {
        var RESULT = gtk_h.g_type_add_instance_private(classType.getValue(), privateSize);
        return RESULT;
    }
    
    /**
     * Adds a function to be called after an interface vtable is
     * initialized for any class (i.e. after the @interface_init
     * member of #GInterfaceInfo has been called).
     * 
     * This function is useful when you want to check an invariant
     * that depends on the interfaces of a class. For instance, the
     * implementation of #GObject uses this facility to check that an
     * object implements all of the properties that are defined on its
     * interfaces.
     */
    public static void typeAddInterfaceCheck(TypeInterfaceCheckFunc checkFunc) {
        try {
            gtk_h.g_type_add_interface_check(
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(checkFunc.hashCode(), checkFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds @interface_type to the dynamic @instance_type. The information
     * contained in the #GTypePlugin structure pointed to by @plugin
     * is used to manage the relationship.
     */
    public static void typeAddInterfaceDynamic(Type instanceType, Type interfaceType, TypePlugin plugin) {
        gtk_h.g_type_add_interface_dynamic(instanceType.getValue(), interfaceType.getValue(), plugin.handle());
    }
    
    /**
     * Adds @interface_type to the static @instance_type.
     * The information contained in the #GInterfaceInfo structure
     * pointed to by @info is used to manage the relationship.
     */
    public static void typeAddInterfaceStatic(Type instanceType, Type interfaceType, InterfaceInfo info) {
        gtk_h.g_type_add_interface_static(instanceType.getValue(), interfaceType.getValue(), info.handle());
    }
    
    public static TypeClass typeCheckClassCast(TypeClass gClass, Type isAType) {
        var RESULT = gtk_h.g_type_check_class_cast(gClass.handle(), isAType.getValue());
        return new TypeClass(References.get(RESULT, false));
    }
    
    public static boolean typeCheckClassIsA(TypeClass gClass, Type isAType) {
        var RESULT = gtk_h.g_type_check_class_is_a(gClass.handle(), isAType.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Private helper function to aid implementation of the
     * G_TYPE_CHECK_INSTANCE() macro.
     */
    public static boolean typeCheckInstance(TypeInstance instance) {
        var RESULT = gtk_h.g_type_check_instance(instance.handle());
        return (RESULT != 0);
    }
    
    public static TypeInstance typeCheckInstanceCast(TypeInstance instance, Type ifaceType) {
        var RESULT = gtk_h.g_type_check_instance_cast(instance.handle(), ifaceType.getValue());
        return new TypeInstance(References.get(RESULT, false));
    }
    
    public static boolean typeCheckInstanceIsA(TypeInstance instance, Type ifaceType) {
        var RESULT = gtk_h.g_type_check_instance_is_a(instance.handle(), ifaceType.getValue());
        return (RESULT != 0);
    }
    
    public static boolean typeCheckInstanceIsFundamentallyA(TypeInstance instance, Type fundamentalType) {
        var RESULT = gtk_h.g_type_check_instance_is_fundamentally_a(instance.handle(), fundamentalType.getValue());
        return (RESULT != 0);
    }
    
    public static boolean typeCheckIsValueType(Type type) {
        var RESULT = gtk_h.g_type_check_is_value_type(type.getValue());
        return (RESULT != 0);
    }
    
    public static boolean typeCheckValue(Value value) {
        var RESULT = gtk_h.g_type_check_value(value.handle());
        return (RESULT != 0);
    }
    
    public static boolean typeCheckValueHolds(Value value, Type type) {
        var RESULT = gtk_h.g_type_check_value_holds(value.handle(), type.getValue());
        return (RESULT != 0);
    }
    
    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn&#39;t incremented.
     * As a consequence, this function may return <code>null</code> if the class
     * of the type passed in does not currently exist (hasn&#39;t been
     * referenced before).
     */
    public static TypeClass typeClassPeek(Type type) {
        var RESULT = gtk_h.g_type_class_peek(type.getValue());
        return new TypeClass(References.get(RESULT, false));
    }
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     */
    public static TypeClass typeClassPeekStatic(Type type) {
        var RESULT = gtk_h.g_type_class_peek_static(type.getValue());
        return new TypeClass(References.get(RESULT, false));
    }
    
    /**
     * Increments the reference count of the class structure belonging to
     * @type. This function will demand-create the class if it doesn&#39;t
     * exist already.
     */
    public static TypeClass typeClassRef(Type type) {
        var RESULT = gtk_h.g_type_class_ref(type.getValue());
        return new TypeClass(References.get(RESULT, false));
    }
    
    /**
     * Creates and initializes an instance of @type if @type is valid and
     * can be instantiated. The type system only performs basic allocation
     * and structure setups for instances: actual instance creation should
     * happen through functions supplied by the type&#39;s fundamental type
     * implementation.  So use of g_type_create_instance() is reserved for
     * implementers of fundamental types only. E.g. instances of the
     * #GObject hierarchy should be created via g_object_new() and never
     * directly through g_type_create_instance() which doesn&#39;t handle things
     * like singleton objects or object construction.
     * 
     * The extended members of the returned instance are guaranteed to be filled
     * with zeros.
     * 
     * Note: Do not use this function, unless you&#39;re implementing a
     * fundamental type. Also language bindings should not use this
     * function, but g_object_new() instead.
     */
    public static TypeInstance typeCreateInstance(Type type) {
        var RESULT = gtk_h.g_type_create_instance(type.getValue());
        return new TypeInstance(References.get(RESULT, false));
    }
    
    /**
     * If the interface type @g_type is currently in use, returns its
     * default interface vtable.
     */
    public static TypeInterface typeDefaultInterfacePeek(Type gType) {
        var RESULT = gtk_h.g_type_default_interface_peek(gType.getValue());
        return new TypeInterface(References.get(RESULT, false));
    }
    
    /**
     * Increments the reference count for the interface type @g_type,
     * and returns the default interface vtable for the type.
     * 
     * If the type is not currently in use, then the default vtable
     * for the type will be created and initialized by calling
     * the base interface init and default vtable init functions for
     * the type (the @base_init and @class_init members of #GTypeInfo).
     * Calling g_type_default_interface_ref() is useful when you
     * want to make sure that signals and properties for an interface
     * have been installed.
     */
    public static TypeInterface typeDefaultInterfaceRef(Type gType) {
        var RESULT = gtk_h.g_type_default_interface_ref(gType.getValue());
        return new TypeInterface(References.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count for the type corresponding to the
     * interface default vtable @g_iface. If the type is dynamic, then
     * when no one is using the interface and all references have
     * been released, the finalize function for the interface&#39;s default
     * vtable (the @class_finalize member of #GTypeInfo) will be called.
     */
    public static void typeDefaultInterfaceUnref(TypeInterface gIface) {
        gtk_h.g_type_default_interface_unref(gIface.handle());
    }
    
    /**
     * Returns the length of the ancestry of the passed in type. This
     * includes the type itself, so that e.g. a fundamental type has depth 1.
     */
    public static int typeDepth(Type type) {
        var RESULT = gtk_h.g_type_depth(type.getValue());
        return RESULT;
    }
    
    /**
     * Ensures that the indicated @type has been registered with the
     * type system, and its _class_init() method has been run.
     * 
     * In theory, simply calling the type&#39;s _get_type() method (or using
     * the corresponding macro) is supposed take care of this. However,
     * _get_type() methods are often marked <code>G_GNUC_CONST</code> for performance
     * reasons, even though this is technically incorrect (since
     * <code>G_GNUC_CONST</code> requires that the function not have side effects,
     * which _get_type() methods do on the first call). As a result, if
     * you write a bare call to a _get_type() macro, it may get optimized
     * out by the compiler. Using g_type_ensure() guarantees that the
     * type&#39;s _get_type() method is called.
     */
    public static void typeEnsure(Type type) {
        gtk_h.g_type_ensure(type.getValue());
    }
    
    /**
     * Frees an instance of a type, returning it to the instance pool for
     * the type, if there is one.
     * 
     * Like g_type_create_instance(), this function is reserved for
     * implementors of fundamental types.
     */
    public static void typeFreeInstance(TypeInstance instance) {
        gtk_h.g_type_free_instance(instance.handle());
    }
    
    /**
     * Look up the type ID from a given type name, returning 0 if no type
     * has been registered under this name (this is the preferred method
     * to find out by name whether a specific type has been registered
     * yet).
     */
    public static org.gtk.gobject.Type typeFromName(java.lang.String name) {
        var RESULT = gtk_h.g_type_from_name(Interop.allocateNativeString(name).handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Internal function, used to extract the fundamental type ID portion.
     * Use G_TYPE_FUNDAMENTAL() instead.
     */
    public static org.gtk.gobject.Type typeFundamental(Type typeId) {
        var RESULT = gtk_h.g_type_fundamental(typeId.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns the next free fundamental type id which can be used to
     * register a new fundamental type with g_type_register_fundamental().
     * The returned type ID represents the highest currently registered
     * fundamental type identifier.
     */
    public static org.gtk.gobject.Type typeFundamentalNext() {
        var RESULT = gtk_h.g_type_fundamental_next();
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns the number of instances allocated of the particular type;
     * this is only available if GLib is built with debugging support and
     * the instance_count debug flag is set (by setting the GOBJECT_DEBUG
     * variable to include instance-count).
     */
    public static int typeGetInstanceCount(Type type) {
        var RESULT = gtk_h.g_type_get_instance_count(type.getValue());
        return RESULT;
    }
    
    /**
     * Returns the #GTypePlugin structure for @type.
     */
    public static TypePlugin typeGetPlugin(Type type) {
        var RESULT = gtk_h.g_type_get_plugin(type.getValue());
        return new TypePlugin.TypePluginImpl(References.get(RESULT, false));
    }
    
    /**
     * Obtains data which has previously been attached to @type
     * with g_type_set_qdata().
     * 
     * Note that this does not take subtyping into account; data
     * attached to one type with g_type_set_qdata() cannot
     * be retrieved from a subtype using g_type_get_qdata().
     */
    public static jdk.incubator.foreign.MemoryAddress typeGetQdata(Type type, org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_type_get_qdata(type.getValue(), quark.getValue());
        return RESULT;
    }
    
    /**
     * Returns an opaque serial number that represents the state of the set
     * of registered types. Any time a type is registered this serial changes,
     * which means you can cache information based on type lookups (such as
     * g_type_from_name()) and know if the cache is still valid at a later
     * time by comparing the current serial with the one at the type lookup.
     */
    public static int typeGetTypeRegistrationSerial() {
        var RESULT = gtk_h.g_type_get_type_registration_serial();
        return RESULT;
    }
    
    /**
     * Adds @prerequisite_type to the list of prerequisites of @interface_type.
     * This means that any type implementing @interface_type must also implement
     * @prerequisite_type. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn&#39;t support). An interface can have
     * at most one instantiatable prerequisite type.
     */
    public static void typeInterfaceAddPrerequisite(Type interfaceType, Type prerequisiteType) {
        gtk_h.g_type_interface_add_prerequisite(interfaceType.getValue(), prerequisiteType.getValue());
    }
    
    /**
     * Returns the #GTypePlugin structure for the dynamic interface
     * @interface_type which has been added to @instance_type, or <code>NULL
     * if</code> @interface_type has not been added to @instance_type or does
     * not have a #GTypePlugin structure. See g_type_add_interface_dynamic().
     */
    public static TypePlugin typeInterfaceGetPlugin(Type instanceType, Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_get_plugin(instanceType.getValue(), interfaceType.getValue());
        return new TypePlugin.TypePluginImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, <code>G_TYPE_INVALID</code> is returned.
     * 
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     */
    public static org.gtk.gobject.Type typeInterfaceInstantiatablePrerequisite(Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_instantiatable_prerequisite(interfaceType.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns the #GTypeInterface structure of an interface to which the
     * passed in class conforms.
     */
    public static TypeInterface typeInterfacePeek(TypeClass instanceClass, Type ifaceType) {
        var RESULT = gtk_h.g_type_interface_peek(instanceClass.handle(), ifaceType.getValue());
        return new TypeInterface(References.get(RESULT, false));
    }
    
    /**
     * If @is_a_type is a derivable type, check whether @type is a
     * descendant of @is_a_type. If @is_a_type is an interface, check
     * whether @type conforms to it.
     */
    public static boolean typeIsA(Type type, Type isAType) {
        var RESULT = gtk_h.g_type_is_a(type.getValue(), isAType.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Get the unique name that is assigned to a type ID.  Note that this
     * function (like all other GType API) cannot cope with invalid type
     * IDs. <code>G_TYPE_INVALID</code> may be passed to this function, as may be any
     * other validly registered type ID, but randomized type IDs should
     * not be passed in and will most likely lead to a crash.
     */
    public static java.lang.String typeName(Type type) {
        var RESULT = gtk_h.g_type_name(type.getValue());
        return RESULT.getUtf8String(0);
    }
    
    public static java.lang.String typeNameFromClass(TypeClass gClass) {
        var RESULT = gtk_h.g_type_name_from_class(gClass.handle());
        return RESULT.getUtf8String(0);
    }
    
    public static java.lang.String typeNameFromInstance(TypeInstance instance) {
        var RESULT = gtk_h.g_type_name_from_instance(instance.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Given a @leaf_type and a @root_type which is contained in its
     * ancestry, return the type that @root_type is the immediate parent
     * of. In other words, this function determines the type that is
     * derived directly from @root_type which is also a base class of
     * @leaf_type.  Given a root type and a leaf type, this function can
     * be used to determine the types and order in which the leaf type is
     * descended from the root type.
     */
    public static org.gtk.gobject.Type typeNextBase(Type leafType, Type rootType) {
        var RESULT = gtk_h.g_type_next_base(leafType.getValue(), rootType.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Return the direct parent type of the passed in type. If the passed
     * in type has no parent, i.e. is a fundamental type, 0 is returned.
     */
    public static org.gtk.gobject.Type typeParent(Type type) {
        var RESULT = gtk_h.g_type_parent(type.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Get the corresponding quark of the type IDs name.
     */
    public static org.gtk.glib.Quark typeQname(Type type) {
        var RESULT = gtk_h.g_type_qname(type.getValue());
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Queries the type system for information about a specific type.
     * This function will fill in a user-provided structure to hold
     * type-specific information. If an invalid #GType is passed in, the
     * @type member of the #GTypeQuery is 0. All members filled into the
     * #GTypeQuery structure should be considered constant and have to be
     * left untouched.
     */
    public static void typeQuery(Type type, TypeQuery query) {
        gtk_h.g_type_query(type.getValue(), query.handle());
    }
    
    /**
     * Registers @type_name as the name of a new dynamic type derived from
     * @parent_type.  The type system uses the information contained in the
     * #GTypePlugin structure pointed to by @plugin to manage the type and its
     * instances (if not abstract).  The value of @flags determines the nature
     * (e.g. abstract or not) of the type.
     */
    public static org.gtk.gobject.Type typeRegisterDynamic(Type parentType, java.lang.String typeName, TypePlugin plugin, int flags) {
        var RESULT = gtk_h.g_type_register_dynamic(parentType.getValue(), Interop.allocateNativeString(typeName).handle(), plugin.handle(), flags);
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Registers @type_id as the predefined identifier and @type_name as the
     * name of a fundamental type. If @type_id is already registered, or a
     * type named @type_name is already registered, the behaviour is undefined.
     * The type system uses the information contained in the #GTypeInfo structure
     * pointed to by @info and the #GTypeFundamentalInfo structure pointed to by
     * @finfo to manage the type and its instances. The value of @flags determines
     * additional characteristics of the fundamental type.
     */
    public static org.gtk.gobject.Type typeRegisterFundamental(Type typeId, java.lang.String typeName, TypeInfo info, TypeFundamentalInfo finfo, int flags) {
        var RESULT = gtk_h.g_type_register_fundamental(typeId.getValue(), Interop.allocateNativeString(typeName).handle(), info.handle(), finfo.handle(), flags);
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Registers @type_name as the name of a new static type derived from
     * @parent_type. The type system uses the information contained in the
     * #GTypeInfo structure pointed to by @info to manage the type and its
     * instances (if not abstract). The value of @flags determines the nature
     * (e.g. abstract or not) of the type.
     */
    public static org.gtk.gobject.Type typeRegisterStatic(Type parentType, java.lang.String typeName, TypeInfo info, int flags) {
        var RESULT = gtk_h.g_type_register_static(parentType.getValue(), Interop.allocateNativeString(typeName).handle(), info.handle(), flags);
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Removes a previously installed #GTypeClassCacheFunc. The cache
     * maintained by @cache_func has to be empty when calling
     * g_type_remove_class_cache_func() to avoid leaks.
     */
    public static void typeRemoveClassCacheFunc(TypeClassCacheFunc cacheFunc) {
        try {
            gtk_h.g_type_remove_class_cache_func(
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(cacheFunc.hashCode(), cacheFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTypeClassCacheFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes an interface check function added with
     * g_type_add_interface_check().
     */
    public static void typeRemoveInterfaceCheck(TypeInterfaceCheckFunc checkFunc) {
        try {
            gtk_h.g_type_remove_interface_check(
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(checkFunc.hashCode(), checkFunc)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Attaches arbitrary data to a type.
     */
    public static void typeSetQdata(Type type, org.gtk.glib.Quark quark, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_type_set_qdata(type.getValue(), quark.getValue(), data);
    }
    
    public static boolean typeTestFlags(Type type, int flags) {
        var RESULT = gtk_h.g_type_test_flags(type.getValue(), flags);
        return (RESULT != 0);
    }
    
    /**
     * Returns the location of the #GTypeValueTable associated with @type.
     * 
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * @type.
     */
    public static TypeValueTable typeValueTablePeek(Type type) {
        var RESULT = gtk_h.g_type_value_table_peek(type.getValue());
        return new TypeValueTable(References.get(RESULT, false));
    }
    
    /**
     * Returns whether a #GValue of type @src_type can be copied into
     * a #GValue of type @dest_type.
     */
    public static boolean valueTypeCompatible(Type srcType, Type destType) {
        var RESULT = gtk_h.g_value_type_compatible(srcType.getValue(), destType.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Check whether g_value_transform() is able to transform values
     * of type @src_type into values of type @dest_type. Note that for
     * the types to be transformable, they must be compatible or a
     * transformation function must be registered.
     */
    public static boolean valueTypeTransformable(Type srcType, Type destType) {
        var RESULT = gtk_h.g_value_type_transformable(srcType.getValue(), destType.getValue());
        return (RESULT != 0);
    }
    
}
