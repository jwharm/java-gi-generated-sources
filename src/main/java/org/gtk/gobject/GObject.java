package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
     * Provide a copy of a boxed structure {@code src_boxed} which is of type {@code boxed_type}.
     */
    public static java.lang.foreign.MemoryAddress boxedCopy(org.gtk.gobject.Type boxedType, java.lang.foreign.MemoryAddress srcBoxed) {
        var RESULT = gtk_h.g_boxed_copy(boxedType.getValue(), srcBoxed);
        return RESULT;
    }
    
    /**
     * Free the boxed structure {@code boxed} which is of type {@code boxed_type}.
     */
    public static void boxedFree(org.gtk.gobject.Type boxedType, java.lang.foreign.MemoryAddress boxed) {
        gtk_h.g_boxed_free(boxedType.getValue(), boxed);
    }
    
    /**
     * A {@link ClosureMarshal} function for use with signals with handlers that
     * take two boxed pointers as arguments and return a boolean.  If you
     * have such a signal, you will probably also need to use an
     * accumulator, such as g_signal_accumulator_true_handled().
     */
    public static void cclosureMarshalBOOLEANBOXEDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_BOOLEAN__BOXED_BOXED(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter
     * denotes a flags type.
     */
    public static void cclosureMarshalBOOLEANFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_BOOLEAN__FLAGS(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)}.
     */
    public static void cclosureMarshalSTRINGOBJECTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_STRING__OBJECT_POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDBOOLEAN(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__BOOLEAN(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__BOXED(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gchar arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__CHAR(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDDOUBLE(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__DOUBLE(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes an enumeration type..
     */
    public static void cclosureMarshalVOIDENUM(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__ENUM(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes a flags type.
     */
    public static void cclosureMarshalVOIDFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__FLAGS(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDFLOAT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__FLOAT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__INT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, glong arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDLONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__LONG(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDOBJECT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__OBJECT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDPARAM(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__PARAM(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDSTRING(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__STRING(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guchar arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDUCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UCHAR(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDUINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UINT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDUINTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__UINT_POINTER(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gulong arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDULONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__ULONG(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDVARIANT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__VARIANT(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer user_data)}.
     */
    public static void cclosureMarshalVOIDVOID(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_VOID__VOID(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * A generic marshaller function implemented via
     * <a href="http://sourceware.org/libffi/">libffi</a>.
     * <p>
     * Normally this function is not passed explicitly to g_signal_new(),
     * but used automatically by GLib when specifying a {@code null} marshaller.
     */
    public static void cclosureMarshalGeneric(Closure closure, Value returnGvalue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        gtk_h.g_cclosure_marshal_generic(closure.handle(), returnGvalue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
    }
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the last parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     */
    public static Closure cclosureNew(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = gtk_h.g_cclosure_new(
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(Refcounted.get(RESULT, false));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the first parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     */
    public static Closure cclosureNewSwap(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = gtk_h.g_cclosure_new_swap(
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(Refcounted.get(RESULT, false));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Clears a reference to a {@link Object}.
     * <p>
     * {@code object_ptr} must not be {@code null}.
     * <p>
     * If the reference is {@code null} then this function does nothing.
     * Otherwise, the reference count of the object is decreased and the
     * pointer is set to {@code null}.
     * <p>
     * A macro is also included that allows this function to be used without
     * pointer casts.
     */
    public static void clearObject(Object[] objectPtr) {
        gtk_h.g_clear_object(Interop.allocateNativeArray(objectPtr).handle());
    }
    
    /**
     * Disconnects a handler from {@code instance} so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The {@code handler_id_ptr} is then set to zero, which is never a valid handler ID value (see g_signal_connect()).
     * <p>
     * If the handler ID is 0 then this function does nothing.
     * <p>
     * There is also a macro version of this function so that the code
     * will be inlined.
     */
    public static void clearSignalHandler(PointerLong handlerIdPtr, Object instance) {
        gtk_h.g_clear_signal_handler(handlerIdPtr.handle(), instance.handle());
    }
    
    /**
     * This function is meant to be called from the {@code complete_type_info}
     * function of a {@link TypePlugin} implementation, as in the following
     * example:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * static void
     * my_enum_complete_type_info (GTypePlugin     *plugin,
     *                             GType            g_type,
     *                             GTypeInfo       *info,
     *                             GTypeValueTable *value_table)
     * {
     *   static const GEnumValue values[] = {
     *     { MY_ENUM_FOO, "MY_ENUM_FOO", "foo" },
     *     { MY_ENUM_BAR, "MY_ENUM_BAR", "bar" },
     *     { 0, NULL, NULL }
     *   };
     * 
     *   g_enum_complete_type_info (type, info, values);
     * }
     * }</pre>
     */
    public static void enumCompleteTypeInfo(org.gtk.gobject.Type gEnumType, TypeInfo info, EnumValue constValues) {
        gtk_h.g_enum_complete_type_info(gEnumType.getValue(), info.refcounted().unowned().handle(), constValues.handle());
    }
    
    /**
     * Returns the {@link EnumValue} for a value.
     */
    public static EnumValue enumGetValue(EnumClass enumClass, int value) {
        var RESULT = gtk_h.g_enum_get_value(enumClass.handle(), value);
        return new EnumValue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Looks up a {@link EnumValue} by name.
     */
    public static EnumValue enumGetValueByName(EnumClass enumClass, java.lang.String name) {
        var RESULT = gtk_h.g_enum_get_value_by_name(enumClass.handle(), Interop.allocateNativeString(name).handle());
        return new EnumValue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Looks up a {@link EnumValue} by nickname.
     */
    public static EnumValue enumGetValueByNick(EnumClass enumClass, java.lang.String nick) {
        var RESULT = gtk_h.g_enum_get_value_by_nick(enumClass.handle(), Interop.allocateNativeString(nick).handle());
        return new EnumValue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Registers a new static enumeration type with the name {@code name}.
     * <p>
     * It is normally more convenient to let [glib-mkenums][glib-mkenums],
     * generate a my_enum_get_type() function from a usual C enumeration
     * definition  than to write one yourself using g_enum_register_static().
     */
    public static org.gtk.gobject.Type enumRegisterStatic(java.lang.String name, EnumValue constStaticValues) {
        var RESULT = gtk_h.g_enum_register_static(Interop.allocateNativeString(name).handle(), constStaticValues.handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Pretty-prints {@code value} in the form of the enum’s name.
     * <p>
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     */
    public static java.lang.String enumToString(org.gtk.gobject.Type gEnumType, int value) {
        var RESULT = gtk_h.g_enum_to_string(gEnumType.getValue(), value);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function is meant to be called from the complete_type_info()
     * function of a {@link TypePlugin} implementation, see the example for
     * g_enum_complete_type_info() above.
     */
    public static void flagsCompleteTypeInfo(org.gtk.gobject.Type gFlagsType, TypeInfo info, FlagsValue constValues) {
        gtk_h.g_flags_complete_type_info(gFlagsType.getValue(), info.refcounted().unowned().handle(), constValues.handle());
    }
    
    /**
     * Returns the first {@link FlagsValue} which is set in {@code value}.
     */
    public static FlagsValue flagsGetFirstValue(FlagsClass flagsClass, int value) {
        var RESULT = gtk_h.g_flags_get_first_value(flagsClass.handle(), value);
        return new FlagsValue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Looks up a {@link FlagsValue} by name.
     */
    public static FlagsValue flagsGetValueByName(FlagsClass flagsClass, java.lang.String name) {
        var RESULT = gtk_h.g_flags_get_value_by_name(flagsClass.handle(), Interop.allocateNativeString(name).handle());
        return new FlagsValue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Looks up a {@link FlagsValue} by nickname.
     */
    public static FlagsValue flagsGetValueByNick(FlagsClass flagsClass, java.lang.String nick) {
        var RESULT = gtk_h.g_flags_get_value_by_nick(flagsClass.handle(), Interop.allocateNativeString(nick).handle());
        return new FlagsValue(Refcounted.get(RESULT, false));
    }
    
    /**
     * Registers a new static flags type with the name {@code name}.
     * <p>
     * It is normally more convenient to let [glib-mkenums][glib-mkenums]
     * generate a my_flags_get_type() function from a usual C enumeration
     * definition than to write one yourself using g_flags_register_static().
     */
    public static org.gtk.gobject.Type flagsRegisterStatic(java.lang.String name, FlagsValue constStaticValues) {
        var RESULT = gtk_h.g_flags_register_static(Interop.allocateNativeString(name).handle(), constStaticValues.handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Pretty-prints {@code value} in the form of the flag names separated by {@code  | } and
     * sorted. Any extra bits will be shown at the end as a hexadecimal number.
     * <p>
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     */
    public static java.lang.String flagsToString(org.gtk.gobject.Type flagsType, int value) {
        var RESULT = gtk_h.g_flags_to_string(flagsType.getValue(), value);
        return RESULT.getUtf8String(0);
    }
    
    public static org.gtk.gobject.Type gtypeGetType() {
        var RESULT = gtk_h.g_gtype_get_type();
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Creates a new {@link ParamSpecBoolean} instance specifying a {@code G_TYPE_BOOLEAN}
     * property. In many cases, it may be more appropriate to use an enum with
     * g_param_spec_enum(), both to improve code clarity by using explicitly named
     * values, and to allow for more values to be added in future without breaking
     * API.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecBoolean(java.lang.String name, java.lang.String nick, java.lang.String blurb, boolean defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_boolean(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), defaultValue ? 1 : 0, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_BOXED}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecBoxed(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type boxedType, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_boxed(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), boxedType.getValue(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecChar} instance specifying a {@code G_TYPE_CHAR} property.
     */
    public static ParamSpec paramSpecChar(java.lang.String name, java.lang.String nick, java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_char(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecDouble} instance specifying a {@code G_TYPE_DOUBLE}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecDouble(java.lang.String name, java.lang.String nick, java.lang.String blurb, double minimum, double maximum, double defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_double(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecEnum} instance specifying a {@code G_TYPE_ENUM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecEnum(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type enumType, int defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_enum(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), enumType.getValue(), defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecFlags} instance specifying a {@code G_TYPE_FLAGS}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecFlags(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type flagsType, int defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_flags(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flagsType.getValue(), defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecFloat} instance specifying a {@code G_TYPE_FLOAT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecFloat(java.lang.String name, java.lang.String nick, java.lang.String blurb, float minimum, float maximum, float defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_float(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecGType} instance specifying a
     * {@code G_TYPE_GTYPE} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecGtype(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type isAType, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_gtype(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), isAType.getValue(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecInt} instance specifying a {@code G_TYPE_INT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecInt(java.lang.String name, java.lang.String nick, java.lang.String blurb, int minimum, int maximum, int defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_int(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecInt64} instance specifying a {@code G_TYPE_INT64} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecInt64(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_int64(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecLong} instance specifying a {@code G_TYPE_LONG} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecLong(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_long(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_OBJECT}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecObject(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type objectType, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_object(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), objectType.getValue(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new property of type {@link ParamSpecOverride}. This is used
     * to direct operations to another paramspec, and will not be directly
     * useful unless you are implementing a new base type similar to GObject.
     */
    public static ParamSpec paramSpecOverride(java.lang.String name, ParamSpec overridden) {
        var RESULT = gtk_h.g_param_spec_override(Interop.allocateNativeString(name).handle(), overridden.handle());
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Creates a new {@link ParamSpecParam} instance specifying a {@code G_TYPE_PARAM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecParam(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type paramType, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_param(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), paramType.getValue(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecPointer} instance specifying a pointer property.
     * Where possible, it is better to use g_param_spec_object() or
     * g_param_spec_boxed() to expose memory management information.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecPointer(java.lang.String name, java.lang.String nick, java.lang.String blurb, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_pointer(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecString} instance.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecString(java.lang.String name, java.lang.String nick, java.lang.String blurb, java.lang.String defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_string(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), Interop.allocateNativeString(defaultValue).handle(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecUChar} instance specifying a {@code G_TYPE_UCHAR} property.
     */
    public static ParamSpec paramSpecUchar(java.lang.String name, java.lang.String nick, java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_uchar(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecUInt} instance specifying a {@code G_TYPE_UINT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUint(java.lang.String name, java.lang.String nick, java.lang.String blurb, int minimum, int maximum, int defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_uint(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecUInt64} instance specifying a {@code G_TYPE_UINT64}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUint64(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_uint64(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecULong} instance specifying a {@code G_TYPE_ULONG}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUlong(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_ulong(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecUnichar} instance specifying a {@code G_TYPE_UINT}
     * property. {@link Value} structures for this property can be accessed with
     * g_value_set_uint() and g_value_get_uint().
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUnichar(java.lang.String name, java.lang.String nick, java.lang.String blurb, int defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_unichar(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), defaultValue, flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link ParamSpecValueArray} instance specifying a
     * {@code G_TYPE_VALUE_ARRAY} property. {@code G_TYPE_VALUE_ARRAY} is a
     * {@code G_TYPE_BOXED} type, as such, {@link Value} structures for this property
     * can be accessed with g_value_set_boxed() and g_value_get_boxed().
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecValueArray(java.lang.String name, java.lang.String nick, java.lang.String blurb, ParamSpec elementSpec, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_value_array(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), elementSpec.handle(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Creates a new {@link ParamSpecVariant} instance specifying a {@link org.gtk.glib.Variant}
     * property.
     * <p>
     * If {@code default_value} is floating, it is consumed.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecVariant(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.glib.VariantType type, org.gtk.glib.Variant defaultValue, ParamFlags flags) {
        var RESULT = gtk_h.g_param_spec_variant(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), type.handle(), defaultValue.refcounted().unowned().handle(), flags.getValue());
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    /**
     * Registers {@code name} as the name of a new static type derived
     * from {@code G_TYPE_PARAM}.
     * <p>
     * The type system uses the information contained in the {@link ParamSpecTypeInfo}
     * structure pointed to by {@code info} to manage the {@link ParamSpec} type and its
     * instances.
     */
    public static org.gtk.gobject.Type paramTypeRegisterStatic(java.lang.String name, ParamSpecTypeInfo pspecInfo) {
        var RESULT = gtk_h.g_param_type_register_static(Interop.allocateNativeString(name).handle(), pspecInfo.handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Transforms {@code src_value} into {@code dest_value} if possible, and then
     * validates {@code dest_value}, in order for it to conform to {@code pspec}.  If
     * {@code strict_validation} is {@code true} this function will only succeed if the
     * transformed {@code dest_value} complied to {@code pspec} without modifications.
     * <p>
     * See also g_value_type_transformable(), g_value_transform() and
     * g_param_value_validate().
     */
    public static boolean paramValueConvert(ParamSpec pspec, Value srcValue, Value destValue, boolean strictValidation) {
        var RESULT = gtk_h.g_param_value_convert(pspec.handle(), srcValue.handle(), destValue.handle(), strictValidation ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Checks whether {@code value} contains the default value as specified in {@code pspec}.
     */
    public static boolean paramValueDefaults(ParamSpec pspec, Value value) {
        var RESULT = gtk_h.g_param_value_defaults(pspec.handle(), value.handle());
        return RESULT != 0;
    }
    
    /**
     * Sets {@code value} to its default value as specified in {@code pspec}.
     */
    public static void paramValueSetDefault(ParamSpec pspec, Value value) {
        gtk_h.g_param_value_set_default(pspec.handle(), value.handle());
    }
    
    /**
     * Ensures that the contents of {@code value} comply with the specifications
     * set out by {@code pspec}. For example, a {@link ParamSpecInt} might require
     * that integers stored in {@code value} may not be smaller than -42 and not be
     * greater than +42. If {@code value} contains an integer outside of this range,
     * it is modified accordingly, so the resulting value will fit into the
     * range -42 .. +42.
     */
    public static boolean paramValueValidate(ParamSpec pspec, Value value) {
        var RESULT = gtk_h.g_param_value_validate(pspec.handle(), value.handle());
        return RESULT != 0;
    }
    
    /**
     * Compares {@code value1} with {@code value2} according to {@code pspec}, and return -1, 0 or +1,
     * if {@code value1} is found to be less than, equal to or greater than {@code value2},
     * respectively.
     */
    public static int paramValuesCmp(ParamSpec pspec, Value value1, Value value2) {
        var RESULT = gtk_h.g_param_values_cmp(pspec.handle(), value1.handle(), value2.handle());
        return RESULT;
    }
    
    /**
     * Creates a new {@code G_TYPE_POINTER} derived type id for a new
     * pointer type with name {@code name}.
     */
    public static org.gtk.gobject.Type pointerTypeRegisterStatic(java.lang.String name) {
        var RESULT = gtk_h.g_pointer_type_register_static(Interop.allocateNativeString(name).handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * A predefined {@link SignalAccumulator} for signals intended to be used as a
     * hook for application code to provide a particular value.  Usually
     * only one such value is desired and multiple handlers for the same
     * signal don't make much sense (except for the case of the default
     * handler defined in the class structure, in which case you will
     * usually want the signal connection to override the class handler).
     * <p>
     * This accumulator will use the return value from the first signal
     * handler that is run as the return value for the signal and not run
     * any further handlers (ie: the first handler "wins").
     */
    public static boolean signalAccumulatorFirstWins(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn, java.lang.foreign.MemoryAddress dummy) {
        var RESULT = gtk_h.g_signal_accumulator_first_wins(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
        return RESULT != 0;
    }
    
    /**
     * A predefined {@link SignalAccumulator} for signals that return a
     * boolean values. The behavior that this accumulator gives is
     * that a return of {@code true} stops the signal emission: no further
     * callbacks will be invoked, while a return of {@code false} allows
     * the emission to continue. The idea here is that a {@code true} return
     * indicates that the callback handled the signal, and no further
     * handling is needed.
     */
    public static boolean signalAccumulatorTrueHandled(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn, java.lang.foreign.MemoryAddress dummy) {
        var RESULT = gtk_h.g_signal_accumulator_true_handled(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
        return RESULT != 0;
    }
    
    /**
     * Adds an emission hook for a signal, which will get called for any emission
     * of that signal, independent of the instance. This is possible only
     * for signals which don't have {@link SignalFlags#NO_HOOKS} flag set.
     */
    public static long signalAddEmissionHook(int signalId, org.gtk.glib.Quark detail, SignalEmissionHook hookFunc) {
        try {
            var RESULT = gtk_h.g_signal_add_emission_hook(signalId, detail.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbSignalEmissionHook",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(hookFunc.hashCode(), hookFunc)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * Connects a {@link Callback} function to a signal for a particular object. Similar
     * to g_signal_connect(), but allows to provide a {@link ClosureNotify} for the data
     * which will be called when the signal handler is disconnected and no longer
     * used. Specify {@code connect_flags} if you need {@code ..._after()} or
     * {@code ..._swapped()} variants of this function.
     */
    public static long signalConnectData(Object instance, java.lang.String detailedSignal, Callback cHandler, ClosureNotify destroyData, ConnectFlags connectFlags) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(instance.handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), connectFlags.getValue());
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emit_valist() resets the return value to the default
     * if no handlers are connected, in contrast to g_signal_emitv().
     */
    public static void signalEmitValist(TypeInstance instance, int signalId, org.gtk.glib.Quark detail, VaList varArgs) {
        gtk_h.g_signal_emit_valist(instance.handle(), signalId, detail.getValue(), varArgs);
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emitv() doesn't change {@code return_value} if no handlers are
     * connected, in contrast to g_signal_emit() and g_signal_emit_valist().
     */
    public static void signalEmitv(Value[] instanceAndParams, int signalId, org.gtk.glib.Quark detail, Value returnValue) {
        gtk_h.g_signal_emitv(Interop.allocateNativeArray(instanceAndParams).handle(), signalId, detail.getValue(), returnValue.refcounted().unowned().handle());
    }
    
    /**
     * Returns the invocation hint of the innermost signal emission of instance.
     */
    public static SignalInvocationHint signalGetInvocationHint(Object instance) {
        var RESULT = gtk_h.g_signal_get_invocation_hint(instance.handle());
        return new SignalInvocationHint(Refcounted.get(RESULT, false));
    }
    
    /**
     * Blocks a handler of an instance so it will not be called during any
     * signal emissions unless it is unblocked again. Thus "blocking" a
     * signal handler means to temporarily deactivate it, a signal handler
     * has to be unblocked exactly the same amount of times it has been
     * blocked before to become active again.
     * <p>
     * The {@code handler_id} has to be a valid signal handler id, connected to a
     * signal of {@code instance}.
     */
    public static void signalHandlerBlock(Object instance, long handlerId) {
        gtk_h.g_signal_handler_block(instance.handle(), handlerId);
    }
    
    /**
     * Disconnects a handler from an instance so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The {@code handler_id} becomes invalid and may be reused.
     * <p>
     * The {@code handler_id} has to be a valid signal handler id, connected to a
     * signal of {@code instance}.
     */
    public static void signalHandlerDisconnect(Object instance, long handlerId) {
        gtk_h.g_signal_handler_disconnect(instance.handle(), handlerId);
    }
    
    /**
     * Finds the first signal handler that matches certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of {@link SignalMatchType}
     * flags, and the criteria values are passed as arguments.
     * The match {@code mask} has to be non-0 for successful matches.
     * If no handler was found, 0 is returned.
     */
    public static long signalHandlerFind(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handler_find(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Returns whether {@code handler_id} is the ID of a handler connected to {@code instance}.
     */
    public static boolean signalHandlerIsConnected(Object instance, long handlerId) {
        var RESULT = gtk_h.g_signal_handler_is_connected(instance.handle(), handlerId);
        return RESULT != 0;
    }
    
    /**
     * Undoes the effect of a previous g_signal_handler_block() call.  A
     * blocked handler is skipped during signal emissions and will not be
     * invoked, unblocking it (for exactly the amount of times it has been
     * blocked before) reverts its "blocked" state, so the handler will be
     * recognized by the signal system and is called upon future or
     * currently ongoing signal emissions (since the order in which
     * handlers are called during signal emissions is deterministic,
     * whether the unblocked handler in question is called as part of a
     * currently ongoing emission depends on how far that emission has
     * proceeded yet).
     * <p>
     * The {@code handler_id} has to be a valid id of a signal handler that is
     * connected to a signal of {@code instance} and is currently blocked.
     */
    public static void signalHandlerUnblock(Object instance, long handlerId) {
        gtk_h.g_signal_handler_unblock(instance.handle(), handlerId);
    }
    
    /**
     * Blocks all handlers on an instance that match a certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of {@link SignalMatchType}
     * flags, and the criteria values are passed as arguments.
     * Passing at least one of the {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC}
     * or {@link SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of blocked handlers
     * otherwise.
     */
    public static int signalHandlersBlockMatched(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handlers_block_matched(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Destroy all signal handlers of a type instance. This function is
     * an implementation detail of the {@link Object} dispose implementation,
     * and should not be used outside of the type system.
     */
    public static void signalHandlersDestroy(Object instance) {
        gtk_h.g_signal_handlers_destroy(instance.handle());
    }
    
    /**
     * Disconnects all handlers on an instance that match a certain
     * selection criteria. The criteria mask is passed as an OR-ed
     * combination of {@link SignalMatchType} flags, and the criteria values are
     * passed as arguments.  Passing at least one of the
     * {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC} or
     * {@link SignalMatchType#DATA} match flags is required for successful
     * matches.  If no handlers were found, 0 is returned, the number of
     * disconnected handlers otherwise.
     */
    public static int signalHandlersDisconnectMatched(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handlers_disconnect_matched(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Unblocks all handlers on an instance that match a certain selection
     * criteria. The criteria mask is passed as an OR-ed combination of
     * {@link SignalMatchType} flags, and the criteria values are passed as arguments.
     * Passing at least one of the {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC}
     * or {@link SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of unblocked handlers
     * otherwise. The match criteria should not apply to any handlers that are
     * not currently blocked.
     */
    public static int signalHandlersUnblockMatched(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_signal_handlers_unblock_matched(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        return RESULT;
    }
    
    /**
     * Returns whether there are any handlers connected to {@code instance} for the
     * given signal id and detail.
     * <p>
     * If {@code detail} is 0 then it will only match handlers that were connected
     * without detail.  If {@code detail} is non-zero then it will match handlers
     * connected both without detail and with the given detail.  This is
     * consistent with how a signal emitted with {@code detail} would be delivered
     * to those handlers.
     * <p>
     * Since 2.46 this also checks for a non-default class closure being
     * installed, as this is basically always what you want.
     * <p>
     * One example of when you might use this is when the arguments to the
     * signal are difficult to compute. A class implementor may opt to not
     * emit the signal if no one is attached anyway, thus saving the cost
     * of building the arguments.
     */
    public static boolean signalHasHandlerPending(Object instance, int signalId, org.gtk.glib.Quark detail, boolean mayBeBlocked) {
        var RESULT = gtk_h.g_signal_has_handler_pending(instance.handle(), signalId, detail.getValue(), mayBeBlocked ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Validate a signal name. This can be useful for dynamically-generated signals
     * which need to be validated at run-time before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names. The rules for signal names are the same as those
     * for property names.
     */
    public static boolean signalIsValidName(java.lang.String name) {
        var RESULT = gtk_h.g_signal_is_valid_name(Interop.allocateNativeString(name).handle());
        return RESULT != 0;
    }
    
    /**
     * Lists the signals by id that a certain instance or interface type
     * created. Further information about the signals can be acquired through
     * g_signal_query().
     */
    public static PointerIterator<Integer> signalListIds(org.gtk.gobject.Type itype, PointerInteger nIds) {
        var RESULT = gtk_h.g_signal_list_ids(itype.getValue(), nIds.handle());
        return new PointerInteger(RESULT).iterator();
    }
    
    /**
     * Given the name of the signal and the type of object it connects to, gets
     * the signal's identifying integer. Emitting the signal by number is
     * somewhat faster than using the name each time.
     * <p>
     * Also tries the ancestors of the given type.
     * <p>
     * The type class passed as {@code itype} must already have been instantiated (for
     * example, using g_type_class_ref()) for this function to work, as signals are
     * always installed during class initialization.
     * <p>
     * See g_signal_new() for details on allowed signal names.
     */
    public static int signalLookup(java.lang.String name, org.gtk.gobject.Type itype) {
        var RESULT = gtk_h.g_signal_lookup(Interop.allocateNativeString(name).handle(), itype.getValue());
        return RESULT;
    }
    
    /**
     * Given the signal's identifier, finds its name.
     * <p>
     * Two different signals may have the same name, if they have differing types.
     */
    public static java.lang.String signalName(int signalId) {
        var RESULT = gtk_h.g_signal_name(signalId);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Overrides the class closure (i.e. the default handler) for the given signal
     * for emissions on instances of {@code instance_type}. {@code instance_type} must be derived
     * from the type to which the signal belongs.
     * <p>
     * See g_signal_chain_from_overridden() and
     * g_signal_chain_from_overridden_handler() for how to chain up to the
     * parent class closure from inside the overridden one.
     */
    public static void signalOverrideClassClosure(int signalId, org.gtk.gobject.Type instanceType, Closure classClosure) {
        gtk_h.g_signal_override_class_closure(signalId, instanceType.getValue(), classClosure.handle());
    }
    
    /**
     * Internal function to parse a signal name into its {@code signal_id}
     * and {@code detail} quark.
     */
    public static boolean signalParseName(java.lang.String detailedSignal, org.gtk.gobject.Type itype, PointerInteger signalIdP, org.gtk.glib.Quark detailP, boolean forceDetailQuark) {
        PointerInteger detailPPOINTER = new PointerInteger(detailP.getValue());
        var RESULT = gtk_h.g_signal_parse_name(Interop.allocateNativeString(detailedSignal).handle(), itype.getValue(), signalIdP.handle(), new PointerInteger(detailP.getValue()).handle(), forceDetailQuark ? 1 : 0);
        detailP.setValue(detailPPOINTER.get());
        return RESULT != 0;
    }
    
    /**
     * Queries the signal system for in-depth information about a
     * specific signal. This function will fill in a user-provided
     * structure to hold signal-specific information. If an invalid
     * signal id is passed in, the {@code signal_id} member of the {@link SignalQuery}
     * is 0. All members filled into the {@link SignalQuery} structure should
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
     * Stops a signal's current emission.
     * <p>
     * This will prevent the default method from running, if the signal was
     * {@link SignalFlags#RUN_LAST} and you connected normally (i.e. without the "after"
     * flag).
     * <p>
     * Prints a warning if used on a signal which isn't being emitted.
     */
    public static void signalStopEmission(Object instance, int signalId, org.gtk.glib.Quark detail) {
        gtk_h.g_signal_stop_emission(instance.handle(), signalId, detail.getValue());
    }
    
    /**
     * Stops a signal's current emission.
     * <p>
     * This is just like g_signal_stop_emission() except it will look up the
     * signal id for you.
     */
    public static void signalStopEmissionByName(Object instance, java.lang.String detailedSignal) {
        gtk_h.g_signal_stop_emission_by_name(instance.handle(), Interop.allocateNativeString(detailedSignal).handle());
    }
    
    /**
     * Creates a new closure which invokes the function found at the offset
     * {@code struct_offset} in the class structure of the interface or classed type
     * identified by {@code itype}.
     */
    public static Closure signalTypeCclosureNew(org.gtk.gobject.Type itype, int structOffset) {
        var RESULT = gtk_h.g_signal_type_cclosure_new(itype.getValue(), structOffset);
        return new Closure(Refcounted.get(RESULT, false));
    }
    
    /**
     * Set the callback for a source as a {@link Closure}.
     * <p>
     * If the source is not one of the standard GLib types, the {@code closure_callback}
     * and {@code closure_marshal} fields of the {@link org.gtk.glib.SourceFuncs} structure must have been
     * filled in with pointers to appropriate functions.
     */
    public static void sourceSetClosure(org.gtk.glib.Source source, Closure closure) {
        gtk_h.g_source_set_closure(source.handle(), closure.handle());
    }
    
    /**
     * Sets a dummy callback for {@code source}. The callback will do nothing, and
     * if the source expects a {@code gboolean} return value, it will return {@code true}.
     * (If the source expects any other type of return value, it will return
     * a 0/{@code null} value; whatever g_value_init() initializes a {@link Value} to for
     * that type.)
     * <p>
     * If the source is not one of the standard GLib types, the
     * {@code closure_callback} and {@code closure_marshal} fields of the {@link org.gtk.glib.SourceFuncs}
     * structure must have been filled in with pointers to appropriate
     * functions.
     */
    public static void sourceSetDummyCallback(org.gtk.glib.Source source) {
        gtk_h.g_source_set_dummy_callback(source.handle());
    }
    
    /**
     * Return a newly allocated string, which describes the contents of a
     * {@link Value}.  The main purpose of this function is to describe {@link Value}
     * contents for debugging output, the way in which the contents are
     * described may change between different GLib versions.
     */
    public static java.lang.String strdupValueContents(Value value) {
        var RESULT = gtk_h.g_strdup_value_contents(value.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Adds a {@link TypeClassCacheFunc} to be called before the reference count of a
     * class goes from one to zero. This can be used to prevent premature class
     * destruction. All installed {@link TypeClassCacheFunc} functions will be chained
     * until one of them returns {@code true}. The functions have to check the class id
     * passed in to figure whether they actually want to cache the class of this
     * type, since all classes are routed through the same {@link TypeClassCacheFunc}
     * chain.
     */
    public static void typeAddClassCacheFunc(TypeClassCacheFunc cacheFunc) {
        try {
            gtk_h.g_type_add_class_cache_func(
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cacheFunc.hashCode(), cacheFunc)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Registers a private class structure for a classed type;
     * when the class is allocated, the private structures for
     * the class and all of its parent types are allocated
     * sequentially in the same memory block as the public
     * structures, and are zero-filled.
     * <p>
     * This function should be called in the
     * type's get_type() function after the type is registered.
     * The private structure can be retrieved using the
     * G_TYPE_CLASS_GET_PRIVATE() macro.
     */
    public static void typeAddClassPrivate(org.gtk.gobject.Type classType, long privateSize) {
        gtk_h.g_type_add_class_private(classType.getValue(), privateSize);
    }
    
    public static int typeAddInstancePrivate(org.gtk.gobject.Type classType, long privateSize) {
        var RESULT = gtk_h.g_type_add_instance_private(classType.getValue(), privateSize);
        return RESULT;
    }
    
    /**
     * Adds a function to be called after an interface vtable is
     * initialized for any class (i.e. after the {@code interface_init}
     * member of {@link InterfaceInfo} has been called).
     * <p>
     * This function is useful when you want to check an invariant
     * that depends on the interfaces of a class. For instance, the
     * implementation of {@link Object} uses this facility to check that an
     * object implements all of the properties that are defined on its
     * interfaces.
     */
    public static void typeAddInterfaceCheck(TypeInterfaceCheckFunc checkFunc) {
        try {
            gtk_h.g_type_add_interface_check(
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(checkFunc.hashCode(), checkFunc)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds {@code interface_type} to the dynamic {@code instance_type}. The information
     * contained in the {@link TypePlugin} structure pointed to by {@code plugin}
     * is used to manage the relationship.
     */
    public static void typeAddInterfaceDynamic(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType, TypePlugin plugin) {
        gtk_h.g_type_add_interface_dynamic(instanceType.getValue(), interfaceType.getValue(), plugin.handle());
    }
    
    /**
     * Adds {@code interface_type} to the static {@code instance_type}.
     * The information contained in the {@link InterfaceInfo} structure
     * pointed to by {@code info} is used to manage the relationship.
     */
    public static void typeAddInterfaceStatic(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType, InterfaceInfo info) {
        gtk_h.g_type_add_interface_static(instanceType.getValue(), interfaceType.getValue(), info.handle());
    }
    
    public static TypeClass typeCheckClassCast(TypeClass gClass, org.gtk.gobject.Type isAType) {
        var RESULT = gtk_h.g_type_check_class_cast(gClass.handle(), isAType.getValue());
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    public static boolean typeCheckClassIsA(TypeClass gClass, org.gtk.gobject.Type isAType) {
        var RESULT = gtk_h.g_type_check_class_is_a(gClass.handle(), isAType.getValue());
        return RESULT != 0;
    }
    
    /**
     * Private helper function to aid implementation of the
     * G_TYPE_CHECK_INSTANCE() macro.
     */
    public static boolean typeCheckInstance(TypeInstance instance) {
        var RESULT = gtk_h.g_type_check_instance(instance.handle());
        return RESULT != 0;
    }
    
    public static TypeInstance typeCheckInstanceCast(TypeInstance instance, org.gtk.gobject.Type ifaceType) {
        var RESULT = gtk_h.g_type_check_instance_cast(instance.handle(), ifaceType.getValue());
        return new TypeInstance(Refcounted.get(RESULT, false));
    }
    
    public static boolean typeCheckInstanceIsA(TypeInstance instance, org.gtk.gobject.Type ifaceType) {
        var RESULT = gtk_h.g_type_check_instance_is_a(instance.handle(), ifaceType.getValue());
        return RESULT != 0;
    }
    
    public static boolean typeCheckInstanceIsFundamentallyA(TypeInstance instance, org.gtk.gobject.Type fundamentalType) {
        var RESULT = gtk_h.g_type_check_instance_is_fundamentally_a(instance.handle(), fundamentalType.getValue());
        return RESULT != 0;
    }
    
    public static boolean typeCheckIsValueType(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_check_is_value_type(type.getValue());
        return RESULT != 0;
    }
    
    public static boolean typeCheckValue(Value value) {
        var RESULT = gtk_h.g_type_check_value(value.handle());
        return RESULT != 0;
    }
    
    public static boolean typeCheckValueHolds(Value value, org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_check_value_holds(value.handle(), type.getValue());
        return RESULT != 0;
    }
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the child types of {@code type}.
     */
    public static PointerIterator<Long> typeChildren(org.gtk.gobject.Type type, PointerInteger nChildren) {
        var RESULT = gtk_h.g_type_children(type.getValue(), nChildren.handle());
        return new PointerLong(RESULT).iterator();
    }
    
    public static void typeClassAdjustPrivateOffset(java.lang.foreign.MemoryAddress gClass, PointerInteger privateSizeOrOffset) {
        gtk_h.g_type_class_adjust_private_offset(gClass, privateSizeOrOffset.handle());
    }
    
    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn't incremented.
     * As a consequence, this function may return {@code null} if the class
     * of the type passed in does not currently exist (hasn't been
     * referenced before).
     */
    public static TypeClass typeClassPeek(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_class_peek(type.getValue());
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     */
    public static TypeClass typeClassPeekStatic(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_class_peek_static(type.getValue());
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    /**
     * Increments the reference count of the class structure belonging to
     * {@code type}. This function will demand-create the class if it doesn't
     * exist already.
     */
    public static TypeClass typeClassRef(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_class_ref(type.getValue());
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    /**
     * Creates and initializes an instance of {@code type} if {@code type} is valid and
     * can be instantiated. The type system only performs basic allocation
     * and structure setups for instances: actual instance creation should
     * happen through functions supplied by the type's fundamental type
     * implementation.  So use of g_type_create_instance() is reserved for
     * implementers of fundamental types only. E.g. instances of the
     * {@link Object} hierarchy should be created via g_object_new() and never
     * directly through g_type_create_instance() which doesn't handle things
     * like singleton objects or object construction.
     * <p>
     * The extended members of the returned instance are guaranteed to be filled
     * with zeros.
     * <p>
     * Note: Do not use this function, unless you're implementing a
     * fundamental type. Also language bindings should not use this
     * function, but g_object_new() instead.
     */
    public static TypeInstance typeCreateInstance(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_create_instance(type.getValue());
        return new TypeInstance(Refcounted.get(RESULT, false));
    }
    
    /**
     * If the interface type {@code g_type} is currently in use, returns its
     * default interface vtable.
     */
    public static TypeInterface typeDefaultInterfacePeek(org.gtk.gobject.Type gType) {
        var RESULT = gtk_h.g_type_default_interface_peek(gType.getValue());
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Increments the reference count for the interface type {@code g_type},
     * and returns the default interface vtable for the type.
     * <p>
     * If the type is not currently in use, then the default vtable
     * for the type will be created and initialized by calling
     * the base interface init and default vtable init functions for
     * the type (the {@code base_init} and {@code class_init} members of {@link TypeInfo}).
     * Calling g_type_default_interface_ref() is useful when you
     * want to make sure that signals and properties for an interface
     * have been installed.
     */
    public static TypeInterface typeDefaultInterfaceRef(org.gtk.gobject.Type gType) {
        var RESULT = gtk_h.g_type_default_interface_ref(gType.getValue());
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Decrements the reference count for the type corresponding to the
     * interface default vtable {@code g_iface}. If the type is dynamic, then
     * when no one is using the interface and all references have
     * been released, the finalize function for the interface's default
     * vtable (the {@code class_finalize} member of {@link TypeInfo}) will be called.
     */
    public static void typeDefaultInterfaceUnref(TypeInterface gIface) {
        gtk_h.g_type_default_interface_unref(gIface.handle());
    }
    
    /**
     * Returns the length of the ancestry of the passed in type. This
     * includes the type itself, so that e.g. a fundamental type has depth 1.
     */
    public static int typeDepth(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_depth(type.getValue());
        return RESULT;
    }
    
    /**
     * Ensures that the indicated {@code type} has been registered with the
     * type system, and its _class_init() method has been run.
     * <p>
     * In theory, simply calling the type's _get_type() method (or using
     * the corresponding macro) is supposed take care of this. However,
     * _get_type() methods are often marked {@code G_GNUC_CONST} for performance
     * reasons, even though this is technically incorrect (since
     * {@code G_GNUC_CONST} requires that the function not have side effects,
     * which _get_type() methods do on the first call). As a result, if
     * you write a bare call to a _get_type() macro, it may get optimized
     * out by the compiler. Using g_type_ensure() guarantees that the
     * type's _get_type() method is called.
     */
    public static void typeEnsure(org.gtk.gobject.Type type) {
        gtk_h.g_type_ensure(type.getValue());
    }
    
    /**
     * Frees an instance of a type, returning it to the instance pool for
     * the type, if there is one.
     * <p>
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
    public static org.gtk.gobject.Type typeFundamental(org.gtk.gobject.Type typeId) {
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
    public static int typeGetInstanceCount(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_get_instance_count(type.getValue());
        return RESULT;
    }
    
    /**
     * Returns the {@link TypePlugin} structure for {@code type}.
     */
    public static TypePlugin typeGetPlugin(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_get_plugin(type.getValue());
        return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Obtains data which has previously been attached to {@code type}
     * with g_type_set_qdata().
     * <p>
     * Note that this does not take subtyping into account; data
     * attached to one type with g_type_set_qdata() cannot
     * be retrieved from a subtype using g_type_get_qdata().
     */
    public static java.lang.foreign.MemoryAddress typeGetQdata(org.gtk.gobject.Type type, org.gtk.glib.Quark quark) {
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
     * Adds {@code prerequisite_type} to the list of prerequisites of {@code interface_type}.
     * This means that any type implementing {@code interface_type} must also implement
     * {@code prerequisite_type}. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn't support). An interface can have
     * at most one instantiatable prerequisite type.
     */
    public static void typeInterfaceAddPrerequisite(org.gtk.gobject.Type interfaceType, org.gtk.gobject.Type prerequisiteType) {
        gtk_h.g_type_interface_add_prerequisite(interfaceType.getValue(), prerequisiteType.getValue());
    }
    
    /**
     * Returns the {@link TypePlugin} structure for the dynamic interface
     * {@code interface_type} which has been added to {@code instance_type}, or {@code null}
     * if {@code interface_type} has not been added to {@code instance_type} or does
     * not have a {@link TypePlugin} structure. See g_type_add_interface_dynamic().
     */
    public static TypePlugin typeInterfaceGetPlugin(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_get_plugin(instanceType.getValue(), interfaceType.getValue());
        return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, {@code G_TYPE_INVALID} is returned.
     * <p>
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     */
    public static org.gtk.gobject.Type typeInterfaceInstantiatablePrerequisite(org.gtk.gobject.Type interfaceType) {
        var RESULT = gtk_h.g_type_interface_instantiatable_prerequisite(interfaceType.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Returns the {@link TypeInterface} structure of an interface to which the
     * passed in class conforms.
     */
    public static TypeInterface typeInterfacePeek(TypeClass instanceClass, org.gtk.gobject.Type ifaceType) {
        var RESULT = gtk_h.g_type_interface_peek(instanceClass.handle(), ifaceType.getValue());
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the prerequisites of an interfaces type.
     */
    public static PointerIterator<Long> typeInterfacePrerequisites(org.gtk.gobject.Type interfaceType, PointerInteger nPrerequisites) {
        var RESULT = gtk_h.g_type_interface_prerequisites(interfaceType.getValue(), nPrerequisites.handle());
        return new PointerLong(RESULT).iterator();
    }
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the interface types that {@code type} conforms to.
     */
    public static PointerIterator<Long> typeInterfaces(org.gtk.gobject.Type type, PointerInteger nInterfaces) {
        var RESULT = gtk_h.g_type_interfaces(type.getValue(), nInterfaces.handle());
        return new PointerLong(RESULT).iterator();
    }
    
    /**
     * If {@code is_a_type} is a derivable type, check whether {@code type} is a
     * descendant of {@code is_a_type}. If {@code is_a_type} is an interface, check
     * whether {@code type} conforms to it.
     */
    public static boolean typeIsA(org.gtk.gobject.Type type, org.gtk.gobject.Type isAType) {
        var RESULT = gtk_h.g_type_is_a(type.getValue(), isAType.getValue());
        return RESULT != 0;
    }
    
    /**
     * Get the unique name that is assigned to a type ID.  Note that this
     * function (like all other GType API) cannot cope with invalid type
     * IDs. {@code G_TYPE_INVALID} may be passed to this function, as may be any
     * other validly registered type ID, but randomized type IDs should
     * not be passed in and will most likely lead to a crash.
     */
    public static java.lang.String typeName(org.gtk.gobject.Type type) {
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
     * Given a {@code leaf_type} and a {@code root_type} which is contained in its
     * ancestry, return the type that {@code root_type} is the immediate parent
     * of. In other words, this function determines the type that is
     * derived directly from {@code root_type} which is also a base class of
     * {@code leaf_type}.  Given a root type and a leaf type, this function can
     * be used to determine the types and order in which the leaf type is
     * descended from the root type.
     */
    public static org.gtk.gobject.Type typeNextBase(org.gtk.gobject.Type leafType, org.gtk.gobject.Type rootType) {
        var RESULT = gtk_h.g_type_next_base(leafType.getValue(), rootType.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Return the direct parent type of the passed in type. If the passed
     * in type has no parent, i.e. is a fundamental type, 0 is returned.
     */
    public static org.gtk.gobject.Type typeParent(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_parent(type.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Get the corresponding quark of the type IDs name.
     */
    public static org.gtk.glib.Quark typeQname(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_qname(type.getValue());
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Queries the type system for information about a specific type.
     * This function will fill in a user-provided structure to hold
     * type-specific information. If an invalid {@link org.gtk.glib.Type} is passed in, the
     * {@code type} member of the {@link TypeQuery} is 0. All members filled into the
     * {@link TypeQuery} structure should be considered constant and have to be
     * left untouched.
     */
    public static void typeQuery(org.gtk.gobject.Type type, TypeQuery query) {
        gtk_h.g_type_query(type.getValue(), query.handle());
    }
    
    /**
     * Registers {@code type_name} as the name of a new dynamic type derived from
     * {@code parent_type}.  The type system uses the information contained in the
     * {@link TypePlugin} structure pointed to by {@code plugin} to manage the type and its
     * instances (if not abstract).  The value of {@code flags} determines the nature
     * (e.g. abstract or not) of the type.
     */
    public static org.gtk.gobject.Type typeRegisterDynamic(org.gtk.gobject.Type parentType, java.lang.String typeName, TypePlugin plugin, TypeFlags flags) {
        var RESULT = gtk_h.g_type_register_dynamic(parentType.getValue(), Interop.allocateNativeString(typeName).handle(), plugin.handle(), flags.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Registers {@code type_id} as the predefined identifier and {@code type_name} as the
     * name of a fundamental type. If {@code type_id} is already registered, or a
     * type named {@code type_name} is already registered, the behaviour is undefined.
     * The type system uses the information contained in the {@link TypeInfo} structure
     * pointed to by {@code info} and the {@link TypeFundamentalInfo} structure pointed to by
     * {@code finfo} to manage the type and its instances. The value of {@code flags} determines
     * additional characteristics of the fundamental type.
     */
    public static org.gtk.gobject.Type typeRegisterFundamental(org.gtk.gobject.Type typeId, java.lang.String typeName, TypeInfo info, TypeFundamentalInfo finfo, TypeFlags flags) {
        var RESULT = gtk_h.g_type_register_fundamental(typeId.getValue(), Interop.allocateNativeString(typeName).handle(), info.handle(), finfo.handle(), flags.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Registers {@code type_name} as the name of a new static type derived from
     * {@code parent_type}. The type system uses the information contained in the
     * {@link TypeInfo} structure pointed to by {@code info} to manage the type and its
     * instances (if not abstract). The value of {@code flags} determines the nature
     * (e.g. abstract or not) of the type.
     */
    public static org.gtk.gobject.Type typeRegisterStatic(org.gtk.gobject.Type parentType, java.lang.String typeName, TypeInfo info, TypeFlags flags) {
        var RESULT = gtk_h.g_type_register_static(parentType.getValue(), Interop.allocateNativeString(typeName).handle(), info.handle(), flags.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Removes a previously installed {@link TypeClassCacheFunc}. The cache
     * maintained by {@code cache_func} has to be empty when calling
     * g_type_remove_class_cache_func() to avoid leaks.
     */
    public static void typeRemoveClassCacheFunc(TypeClassCacheFunc cacheFunc) {
        try {
            gtk_h.g_type_remove_class_cache_func(
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cacheFunc.hashCode(), cacheFunc)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(checkFunc.hashCode(), checkFunc)), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Attaches arbitrary data to a type.
     */
    public static void typeSetQdata(org.gtk.gobject.Type type, org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data) {
        gtk_h.g_type_set_qdata(type.getValue(), quark.getValue(), data);
    }
    
    public static boolean typeTestFlags(org.gtk.gobject.Type type, int flags) {
        var RESULT = gtk_h.g_type_test_flags(type.getValue(), flags);
        return RESULT != 0;
    }
    
    /**
     * Returns the location of the {@link TypeValueTable} associated with {@code type}.
     * <p>
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * {@code type}.
     */
    public static TypeValueTable typeValueTablePeek(org.gtk.gobject.Type type) {
        var RESULT = gtk_h.g_type_value_table_peek(type.getValue());
        return new TypeValueTable(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether a {@link Value} of type {@code src_type} can be copied into
     * a {@link Value} of type {@code dest_type}.
     */
    public static boolean valueTypeCompatible(org.gtk.gobject.Type srcType, org.gtk.gobject.Type destType) {
        var RESULT = gtk_h.g_value_type_compatible(srcType.getValue(), destType.getValue());
        return RESULT != 0;
    }
    
    /**
     * Check whether g_value_transform() is able to transform values
     * of type {@code src_type} into values of type {@code dest_type}. Note that for
     * the types to be transformable, they must be compatible or a
     * transformation function must be registered.
     */
    public static boolean valueTypeTransformable(org.gtk.gobject.Type srcType, org.gtk.gobject.Type destType) {
        var RESULT = gtk_h.g_value_type_transformable(srcType.getValue(), destType.getValue());
        return RESULT != 0;
    }
    
    public static void __cbToggleNotify(MemoryAddress data, MemoryAddress object, int isLastRef) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (ToggleNotify) Interop.signalRegistry.get(hash);
        handler.onToggleNotify(new Object(Refcounted.get(object, false)), isLastRef != 0);
    }
    
    public static void __cbClassInitFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClassInitFunc) Interop.signalRegistry.get(hash);
        handler.onClassInitFunc(new TypeClass(Refcounted.get(gClass, false)));
    }
    
    public static void __cbInterfaceInitFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(ValueLayout.JAVA_INT, 0);
        var handler = (InterfaceInitFunc) Interop.signalRegistry.get(hash);
        handler.onInterfaceInitFunc(new TypeInterface(Refcounted.get(gIface, false)));
    }
    
    public static boolean __cbSignalAccumulator(MemoryAddress ihint, MemoryAddress returnAccu, MemoryAddress handlerReturn, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalAccumulator) Interop.signalRegistry.get(hash);
        return handler.onSignalAccumulator(new SignalInvocationHint(Refcounted.get(ihint, false)), new Value(Refcounted.get(returnAccu, false)), new Value(Refcounted.get(handlerReturn, false)));
    }
    
    public static void __cbClosureMarshal(MemoryAddress closure, MemoryAddress returnValue, int nParamValues, MemoryAddress paramValues, MemoryAddress invocationHint, MemoryAddress marshalData) {
        int hash = marshalData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClosureMarshal) Interop.signalRegistry.get(hash);
        handler.onClosureMarshal(new Closure(Refcounted.get(closure, false)), new Value(Refcounted.get(returnValue, false)), nParamValues, new PointerProxy<Value>(paramValues, Value.class).iterator(), invocationHint);
    }
    
    public static void __cbClosureNotify(MemoryAddress data, MemoryAddress closure) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClosureNotify) Interop.signalRegistry.get(hash);
        handler.onClosureNotify(new Closure(Refcounted.get(closure, false)));
    }
    
    public static boolean __cbTypeClassCacheFunc(MemoryAddress cacheData, MemoryAddress gClass) {
        int hash = cacheData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TypeClassCacheFunc) Interop.signalRegistry.get(hash);
        return handler.onTypeClassCacheFunc(new TypeClass(Refcounted.get(gClass, false)));
    }
    
    public static boolean __cbBindingTransformFunc(MemoryAddress binding, MemoryAddress fromValue, MemoryAddress toValue, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (BindingTransformFunc) Interop.signalRegistry.get(hash);
        return handler.onBindingTransformFunc(new Binding(Refcounted.get(binding, false)), new Value(Refcounted.get(fromValue, false)), new Value(Refcounted.get(toValue, false)));
    }
    
    public static void __cbClassFinalizeFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClassFinalizeFunc) Interop.signalRegistry.get(hash);
        handler.onClassFinalizeFunc(new TypeClass(Refcounted.get(gClass, false)));
    }
    
    public static boolean __cbSignalEmissionHook(MemoryAddress ihint, int nParamValues, MemoryAddress paramValues, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalEmissionHook) Interop.signalRegistry.get(hash);
        return handler.onSignalEmissionHook(new SignalInvocationHint(Refcounted.get(ihint, false)), nParamValues, new PointerProxy<Value>(paramValues, Value.class).iterator());
    }
    
    public static void __cbInterfaceFinalizeFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(ValueLayout.JAVA_INT, 0);
        var handler = (InterfaceFinalizeFunc) Interop.signalRegistry.get(hash);
        handler.onInterfaceFinalizeFunc(new TypeInterface(Refcounted.get(gIface, false)));
    }
    
    public static void __cbWeakNotify(MemoryAddress data, MemoryAddress whereTheObjectWas) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (WeakNotify) Interop.signalRegistry.get(hash);
        handler.onWeakNotify(new Object(Refcounted.get(whereTheObjectWas, false)));
    }
    
    public static void __cbTypeInterfaceCheckFunc(MemoryAddress checkData, MemoryAddress gIface) {
        int hash = checkData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TypeInterfaceCheckFunc) Interop.signalRegistry.get(hash);
        handler.onTypeInterfaceCheckFunc(new TypeInterface(Refcounted.get(gIface, false)));
    }
    
}
